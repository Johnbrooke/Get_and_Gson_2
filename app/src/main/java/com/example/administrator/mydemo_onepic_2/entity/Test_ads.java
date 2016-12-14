package com.example.administrator.mydemo_onepic_2.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/12/10 0010.
 */
public class Test_ads {


    /**
     * errorCode : 1
     * liveRoomVideoList : [{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161209_c74975d0-2879-4674-8010-32896d3d0849.mp4","title":"今日股市分析","pkId":377,"level":0,"visitCount":549,"thumbnailUrl":"upload/2016/12/09/cc939130-bdf1-11e6-a6eb-00163e1206ba.jpg","favoriteCount":1,"createTime":1481275690},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161208_62cd3815-0ccd-4ba2-aa53-115f8a685daf.mp4","title":"今日股市分析","pkId":375,"level":0,"visitCount":742,"thumbnailUrl":"upload/2016/12/08/11fa0eca-bd25-11e6-9db9-00163e1206ba.jpg","favoriteCount":1,"createTime":1481187759},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161207_17322828-f959-4999-8f24-d273abf0262c.mp4","title":"今日股市分析","pkId":373,"level":0,"visitCount":831,"thumbnailUrl":"upload/2016/12/07/3806c5fc-bc5f-11e6-9f1e-00163e1206ba.jpg","favoriteCount":1,"createTime":1481102783},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161206_ea1703af-8b6b-45d0-ad74-26cfb4de5a99.mp4","title":"今日股市分析","pkId":371,"level":0,"visitCount":783,"thumbnailUrl":"upload/2016/12/06/a2d19888-bb94-11e6-9308-00163e1206ba.jpg","favoriteCount":0,"createTime":1481015774},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161205_f8d361a0-3f63-4d16-a3b3-1107f31f301e.mp4","title":"今日股市分析","pkId":369,"level":0,"visitCount":890,"thumbnailUrl":"upload/2016/12/05/bc9bc150-baca-11e6-b191-00163e1206ba.jpg","favoriteCount":0,"createTime":1480929059},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161202_937ea4f3-0920-4f8a-b712-52d20f018c11.mp4","title":"今日股市分析","pkId":364,"level":0,"visitCount":1954,"thumbnailUrl":"upload/2016/12/02/e62efda6-b873-11e6-89fa-00163e1206ba.jpg","favoriteCount":1,"createTime":1480671860},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161130_55ce8a79-2890-4973-8506-ce8cffb80c3e.mp4","title":"今日股市分析","pkId":363,"level":0,"visitCount":2224,"thumbnailUrl":"upload/2016/11/30/15458ec6-b6de-11e6-8570-00163e1206ba.jpg","favoriteCount":2,"createTime":1480497564},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161129_3449aeef-761a-4d94-89da-3ed850d301cd.mp4","title":"今日股市分析","pkId":361,"level":0,"visitCount":1192,"thumbnailUrl":"upload/2016/11/29/3b23d0ac-b617-11e6-a93c-00163e1206ba.jpg","favoriteCount":1,"createTime":1480412157},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161128_7a461a8f-8230-416c-9571-82a907dd78bc.mp4","title":"今日股市分析","pkId":359,"level":0,"visitCount":1191,"thumbnailUrl":"upload/2016/11/28/ebd46e22-b54d-11e6-ab5d-00163e1206ba.jpg","favoriteCount":1,"createTime":1480325696},{"videoUrl":"https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161125_0d575920-3678-4e38-a445-d22d96a14419.mp4","title":"今日股市分析","pkId":357,"level":0,"visitCount":3099,"thumbnailUrl":"upload/2016/11/25/95df17e2-b2f0-11e6-ab5d-00163e1206ba.jpg","favoriteCount":1,"createTime":1480065706}]
     * pagingInfo : {"totalCount":87,"pageIndex":1,"pageSize":10}
     */

    private int errorCode;
    private PagingInfoBean pagingInfo;
    private List<LiveRoomVideoListBean> liveRoomVideoList;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public PagingInfoBean getPagingInfo() {
        return pagingInfo;
    }

    public void setPagingInfo(PagingInfoBean pagingInfo) {
        this.pagingInfo = pagingInfo;
    }

    public List<LiveRoomVideoListBean> getLiveRoomVideoList() {
        return liveRoomVideoList;
    }

    public void setLiveRoomVideoList(List<LiveRoomVideoListBean> liveRoomVideoList) {
        this.liveRoomVideoList = liveRoomVideoList;
    }

    public static class PagingInfoBean {
        /**
         * totalCount : 87
         * pageIndex : 1
         * pageSize : 10
         */

        private int totalCount;
        private int pageIndex;
        private int pageSize;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageIndex() {
            return pageIndex;
        }

        public void setPageIndex(int pageIndex) {
            this.pageIndex = pageIndex;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }

    public static class LiveRoomVideoListBean {
        /**
         * videoUrl : https://stream-output.oss-cn-hangzhou.aliyuncs.com/20161209_c74975d0-2879-4674-8010-32896d3d0849.mp4
         * title : 今日股市分析
         * pkId : 377
         * level : 0
         * visitCount : 549
         * thumbnailUrl : upload/2016/12/09/cc939130-bdf1-11e6-a6eb-00163e1206ba.jpg
         * favoriteCount : 1
         * createTime : 1481275690
         */

        private String videoUrl;
        private String title;
        private int pkId;
        private int level;
        private int visitCount;
        private String thumbnailUrl;
        private int favoriteCount;
        private int createTime;

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPkId() {
            return pkId;
        }

        public void setPkId(int pkId) {
            this.pkId = pkId;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getVisitCount() {
            return visitCount;
        }

        public void setVisitCount(int visitCount) {
            this.visitCount = visitCount;
        }

        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        public void setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
        }

        public int getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public int getCreateTime() {
            return createTime;
        }

        public void setCreateTime(int createTime) {
            this.createTime = createTime;
        }
    }
}
