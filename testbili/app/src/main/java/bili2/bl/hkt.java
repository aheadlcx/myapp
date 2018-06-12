package bili2.bl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.Segment;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BL */
class hkt {
    private static final String a = hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97, (byte) 87, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 119});
    private hku b;

    hkt(hku bl_hku) {
        this.b = bl_hku;
    }

    public MediaResource a(@NonNull Context context, @NonNull hjy bl_hjy, @NonNull hks bl_hks) {
        try {
            if (!hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}).equals(bl_hks.b)) {
                return null;
            }
            VideoDownloadEntry b = b(context, bl_hjy, bl_hks);
            if (b == null) {
                return null;
            }
            hju a = hjv.a(bl_hjy, b);
            List<String> a2 = a(context, a, bl_hks);
            if (a2 == null) {
                return null;
            }
            for (String str : a2) {
                b.mTypeTag = str;
                MediaResource a3 = a(context, a, b, bl_hks);
                if (a3 != null) {
                    return a3;
                }
            }
            return null;
        } catch (Exception e) {
        }
    }

    private VideoDownloadEntry b(Context context, hjy bl_hjy, hks bl_hks) {
        VideoDownloadEntry a;
        if (bl_hks.c != null && bl_hks.d != 0) {
            a = hkq.a(context, bl_hjy.n(), bl_hks.c, bl_hks.d);
        } else if (bl_hks.e <= 0 || bl_hks.f == 0) {
            a = null;
        } else {
            a = hkq.a(context, bl_hjy.n(), bl_hks.e, bl_hks.f);
        }
        if (a == null) {
            a(context, bl_hks, null, 2);
            return null;
        } else if (a.f()) {
            return a;
        } else {
            a(context, bl_hks, null, 3);
            return null;
        }
    }

    private List<String> a(Context context, hju bl_hju, hks bl_hks) throws IOException {
        hjy f = bl_hju.f(context, false);
        if (!f.i()) {
            return null;
        }
        List<String> arrayList = new ArrayList();
        hjy[] f2 = f.f();
        if (f2 != null) {
            for (hjy bl_hjy : f2) {
                String m = bl_hjy.m();
                if (bl_hjy.h()) {
                    CharSequence c = hju.c(m);
                    if (!TextUtils.isEmpty(c)) {
                        arrayList.add(c);
                        hlg.b(hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97, (byte) 87, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 107, (byte) 97, (byte) 37, (byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 113, (byte) 100, (byte) 98, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 119, (byte) 96, (byte) 104, (byte) 112, (byte) 125, (byte) 96, (byte) 97, (byte) 37, (byte) 104, (byte) 117, (byte) 49, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 63}) + m);
                    }
                } else {
                    hjy c2 = bl_hju.c(context, false);
                    if (bl_hjy.i() && c2 != null && c2.h()) {
                        arrayList.add(m);
                        hlg.b(hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97, (byte) 87, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 107, (byte) 97, (byte) 37, (byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 113, (byte) 100, (byte) 98, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 37, (byte) 111, (byte) 118, (byte) 106, (byte) 107, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 63}) + m);
                    }
                }
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        a(context, bl_hks, bl_hju, 4);
        return arrayList;
    }

    private MediaResource a(Context context, hju bl_hju, VideoDownloadEntry videoDownloadEntry, hks bl_hks) throws IOException {
        boolean z = true;
        hjy c = bl_hju.c(context, false);
        hjy a = bl_hju.a(context);
        boolean z2 = a != null && a.h() && a.p() > 0;
        if (c == null || !c.h()) {
            z = false;
        }
        if (z || z2) {
            PlayIndex playIndex = new PlayIndex(hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}), videoDownloadEntry.mTypeTag);
            if (z2 && !z) {
                return a(playIndex, a);
            }
            MediaResource a2 = a(context, videoDownloadEntry.mTypeTag, bl_hju, c, bl_hks);
            if (a2 == null && z2) {
                return a(playIndex, a);
            }
            return a2;
        }
        a(context, bl_hks, bl_hju, 5);
        return null;
    }

    private MediaResource a(Context context, @NonNull String str, @NonNull hju bl_hju, hjy bl_hjy, hks bl_hks) throws IOException {
        PlayIndex playIndex = new PlayIndex(hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}), str);
        try {
            playIndex.a(new JSONObject(hkz.c(bl_hjy)));
            if (playIndex.f()) {
                a(context, bl_hks, bl_hju, 7);
                return null;
            }
            int size = playIndex.A.size();
            int i = 0;
            while (i < size) {
                hjy a = bl_hju.a(context, i, false);
                if (a.h()) {
                    ((Segment) playIndex.A.get(i)).a = a.n();
                    i++;
                } else {
                    a(context, bl_hks, bl_hju, 8);
                    return null;
                }
            }
            playIndex.D = size == 1 ? playIndex.c() : null;
            playIndex.B = -1;
            playIndex.C = -1;
            playIndex.E = 0;
            playIndex.G = true;
            return new MediaResource(playIndex);
        } catch (IOException e) {
            a(context, bl_hks, bl_hju, 6);
            return null;
        } catch (JSONException e2) {
            a(context, bl_hks, bl_hju, 6);
            return null;
        }
    }

    @NonNull
    private static MediaResource a(PlayIndex playIndex, hjy bl_hjy) {
        playIndex.D = bl_hjy.n();
        playIndex.A.add(new Segment(playIndex.D));
        playIndex.G = true;
        playIndex.x = "MP4";
        return new MediaResource(playIndex);
    }

    private void a(Context context, hks bl_hks, hju bl_hju, int i) {
        if (this.b != null) {
            this.b.a(context, bl_hks, i);
        }
    }
}
