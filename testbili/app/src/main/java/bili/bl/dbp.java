package bili.bl;

import android.text.TextUtils;
import android.widget.ImageView;
import bl.dbo.a;
import bl.dbo.b;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.bililive.painting.api.entity.PaintingItem;
import com.bilibili.bililive.painting.api.entity.PaintingLikeResponse;
import retrofit2.HttpException;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public abstract class dbp<T extends b> implements a {
    protected T d;

    public dbp(T t) {
        this.d = t;
    }

    public void a(final ImageView imageView, final PaintingItem paintingItem, final int i) {
        if (paintingItem != null) {
            dbb.c(paintingItem.docId, b(paintingItem), new gnb<JSONObject>(this) {
                final /* synthetic */ dbp d;

                public void a(JSONObject jSONObject) {
                    PaintingLikeResponse a = this.d.a(jSONObject);
                    if (a != null) {
                        PaintingItem paintingItem;
                        if (a.likeState == 1) {
                            paintingItem = paintingItem;
                            paintingItem.likeSumTotal++;
                            paintingItem.like = dbe.y;
                        } else if (a.likeState == 2) {
                            paintingItem = paintingItem;
                            paintingItem.likeSumTotal--;
                            paintingItem.like = dbe.z;
                        }
                        this.d.d.a(imageView, paintingItem);
                        dgc.a(paintingItem.docId, paintingItem.like, paintingItem.likeSumTotal, i);
                    }
                }

                public void a(Throwable th) {
                    if (th instanceof HttpException) {
                        HttpException httpException = (HttpException) th;
                        if (!httpException.b().e()) {
                            this.d.a(paintingItem);
                            return;
                        } else if (httpException != null && httpException.getMessage() != null) {
                            this.d.d.a(httpException.getMessage());
                            return;
                        } else {
                            return;
                        }
                    }
                    this.d.a(paintingItem);
                }
            });
        }
    }

    private void a(PaintingItem paintingItem) {
        if (b(paintingItem) == 1) {
            this.d.a(2131693941);
        } else if (b(paintingItem) == 2) {
            this.d.a(2131693947);
        } else {
            this.d.a(2131693941);
        }
    }

    private PaintingLikeResponse a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.h("code") == 0) {
                    return (PaintingLikeResponse) zy.a(jSONObject.l("data"), PaintingLikeResponse.class);
                }
                a(jSONObject.l(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96})));
            } catch (Exception e) {
                BLog.e("json", jSONObject.toString());
                BLog.e(hae.a(new byte[]{(byte) 111, (byte) 118, (byte) 106, (byte) 107, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), hae.a(new byte[]{(byte) 111, (byte) 118, (byte) 106, (byte) 107, (byte) 37, (byte) -25, (byte) -88, (byte) -84, (byte) -23, (byte) -111, (byte) -97, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86, (byte) 63}) + e.toString());
            }
        }
        return null;
    }

    private void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d.a(str);
        }
    }

    private int b(PaintingItem paintingItem) {
        if (paintingItem.like == dbe.y) {
            return 2;
        }
        if (paintingItem.like == dbe.z) {
            return 1;
        }
        return 0;
    }
}
