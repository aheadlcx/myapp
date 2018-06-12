package bili3.com.bilibili.bangumi.api;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiHome {
    @JSONField(name = "ad")
    public Ad ad;
    @JSONField(name = "editor_recommend")
    public List<BangumiRecommend> editorRecommendList;
    @JSONField(name = "end_recommend")
    public List<BangumiBrief> finishedBangumis;
    @JSONField(name = "serializing")
    public List<BangumiBrief> latestBangumis;
    @JSONField(name = "sections")
    public List<HomeSection> mSections;
    public BangumiPrevious previous;

    @Keep
    /* compiled from: BL */
    public static class Ad {
        @JSONField(name = "body")
        public List<BangumiBanner> body;
        @JSONField(name = "head")
        public List<BangumiBanner> head;
    }

    @Keep
    /* compiled from: BL */
    public static class HomeSection {
        @JSONField(name = "falls")
        public List<BangumiRecommend> mFalls;
        @JSONField(name = "icon")
        public String mIconUrl;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "wid")
        public String mWid;
    }
}
