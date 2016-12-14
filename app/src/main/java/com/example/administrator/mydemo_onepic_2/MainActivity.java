package com.example.administrator.mydemo_onepic_2;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.mydemo_onepic_2.entity.Test_ads;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends Activity implements View.OnClickListener {


    OkHttpClient mokHttpClient;
    private Button bt_send;
    private Button bt_postsend;
    private Button bt_sendfile;
    private Button bt_downfile;
    private TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initOkHttpClient();
        bt_send = (Button) this.findViewById(R.id.bt_send);
        textView = (TextView) findViewById(R.id.tv_item);
        textView1 = (TextView) findViewById(R.id.tv_item2);
        bt_send.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_send:
                getAsynHttp();
                break;
        }
    }

    private void initOkHttpClient() {
        File sdcache = getExternalCacheDir();
        int cacheSize = 10 * 1024 * 1024;
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .cache(new Cache(sdcache.getAbsoluteFile(), cacheSize));
        mokHttpClient = builder.build();
    }

    /**
     * get异步请求
     */
    private void getAsynHttp() {
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个Request
        final Request request = new Request.Builder()
                .url("http://api.xfc639.com/promotion_video/video_list.jsonp?type_id=22")
                .build();
        //new call
        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {


            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful() && response.body() != null) {
                    String respJson = response.body().string();
                    //由于这个json格式有问题，所以删掉了问题位置。
                    respJson = respJson.substring(1,respJson.length()-1);
                    Gson gson = new Gson();
                    Test_ads test_ads = gson.fromJson(respJson,Test_ads.class);
                    Log.i("TAG", "--------------" + respJson);
//                    updateuis(productListBean);
                    updateuis(test_ads);


                }
            }
        });
    }
    public void updateuis(final Test_ads resp){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView.append(resp.getLiveRoomVideoList().get(1).getPkId()+"");
//                textView.append(resp.getProductList().get(0).getId()+"");
//                textView.append(resp.getProductList().get(0).getName());
//                textView1.append(resp.getProductList().get(1).getId()+"");
//                textView1.append(resp.getProductList().get(1).getName());

            }
        });

    }


}
