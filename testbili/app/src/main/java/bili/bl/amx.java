package bili.bl;

import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BaseResponse;
import retrofit2.HttpException;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public abstract class amx<T> extends gnb<T> {
    public abstract void a(T t);

    public abstract void a(Throwable th);

    public void a(@Nullable kqi<T> bl_kqi_T, kqs<T> bl_kqs_T) {
        if (!a()) {
            if (bl_kqs_T.e()) {
                Object f = bl_kqs_T.f();
                int i = 0;
                String str = BuildConfig.VERSION_NAME;
                if (f instanceof BaseResponse) {
                    BaseResponse baseResponse = (BaseResponse) f;
                    i = baseResponse.code;
                    str = baseResponse.message;
                } else if (f instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) f;
                    i = jSONObject.h("code");
                    str = jSONObject.l(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}));
                }
                if (i != 0) {
                    a((kqi) bl_kqi_T, new BiliApiException(i, str));
                    return;
                } else {
                    a(f);
                    return;
                }
            }
            a((kqi) bl_kqi_T, new HttpException(bl_kqs_T));
        }
    }

    public void a(@Nullable kqi<T> bl_kqi_T, Throwable th) {
        if (!a()) {
            if (amy.a()) {
                if (bl_kqi_T != null) {
                    BLog.w(hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 112, (byte) 119, (byte) 96}), bl_kqi_T.c().a() + " " + th.getMessage());
                } else {
                    BLog.w(hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 112, (byte) 119, (byte) 96}), BuildConfig.VERSION_NAME, th);
                }
            }
            a(th);
        }
    }

    public boolean a() {
        return false;
    }
}
