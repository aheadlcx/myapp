package bili2.bl;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bilibili.videodownloader.model.VideoDownloadAVPageEntry;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;

/* compiled from: BL */
public class hkq {
    private static final String a = hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 64, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 67, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124});

    public static ArrayList<VideoDownloadEntry> a(Context context, hjy bl_hjy) {
        String[] e = bl_hjy.e();
        if (e == null) {
            hlg.b(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 64, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 67, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124}), hae.a(new byte[]{(byte) 96, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 37, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124, (byte) 37, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 97, (byte) 108, (byte) 119, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124, (byte) 37, (byte) 32, (byte) 118, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124}), bl_hjy);
            return null;
        }
        ArrayList<VideoDownloadEntry> arrayList = new ArrayList();
        for (String str : e) {
            String str2;
            if (TextUtils.isEmpty(str2)) {
                hlg.c(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 64, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 67, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124}), hae.a(new byte[]{(byte) 96, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 37, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124, (byte) 37, (byte) 118, (byte) 112, (byte) 103, (byte) 65, (byte) 108, (byte) 119, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 37, (byte) 63, (byte) 37, (byte) 32, (byte) 118}), bl_hjy.n());
            } else {
                int a = hjs.a(str2);
                Collection a2;
                if (a != -1) {
                    a2 = a(context, bl_hjy, a);
                    if (a2 != null) {
                        arrayList.addAll(a2);
                    }
                } else {
                    str2 = hjt.a(str2);
                    if (!gmy.d.equals(str2)) {
                        a2 = a(context, bl_hjy, str2);
                        if (a2 != null) {
                            arrayList.addAll(a2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<VideoDownloadEntry> a(Context context) {
        long a = a();
        hjy[] b = hls.b(context);
        Map grVar = new gr();
        for (hjy bl_hjy : b) {
            if (bl_hjy != null) {
                Collection a2 = a(context, bl_hjy);
                if (a2 != null) {
                    a(grVar, a2);
                }
            }
        }
        ArrayList arrayList = new ArrayList(grVar.values());
        hli.a(context, arrayList, a() - a);
        return arrayList;
    }

    public static ArrayList<VideoDownloadEntry> a(Context context, String str) {
        Map grVar = new gr();
        for (hjy bl_hjy : hls.b(context)) {
            if (bl_hjy != null) {
                Collection a = a(context, bl_hjy, str);
                if (a != null) {
                    a(grVar, a);
                }
            }
        }
        return new ArrayList(grVar.values());
    }

    public static ArrayList<VideoDownloadEntry> a(Context context, int i) {
        Map grVar = new gr();
        for (hjy bl_hjy : hls.b(context)) {
            if (bl_hjy != null) {
                Collection a = a(context, bl_hjy, i);
                if (a != null) {
                    a(grVar, a);
                }
            }
        }
        return new ArrayList(grVar.values());
    }

    public static VideoDownloadAVPageEntry a(Context context, String str, int i, int i2) {
        Throwable e;
        hjy a = hjs.a(context, str, i, i2);
        if (a == null || !a.h()) {
            return null;
        }
        try {
            return (VideoDownloadAVPageEntry) hju.a(a, VideoDownloadAVPageEntry.class);
        } catch (IOException e2) {
            e = e2;
            hlg.a(e);
            return null;
        } catch (JSONException e3) {
            e = e3;
            hlg.a(e);
            return null;
        }
    }

    public static VideoDownloadSeasonEpEntry a(Context context, String str, String str2, long j) {
        Throwable e;
        hjy a = hjt.a(context, str, str2, j);
        if (a == null || !a.h()) {
            return null;
        }
        try {
            return (VideoDownloadSeasonEpEntry) hju.a(a, VideoDownloadSeasonEpEntry.class);
        } catch (IOException e2) {
            e = e2;
            hlg.a(e);
            return null;
        } catch (JSONException e3) {
            e = e3;
            hlg.a(e);
            return null;
        }
    }

    private static void a(Map<String, VideoDownloadEntry> map, Collection<? extends VideoDownloadEntry> collection) {
        for (VideoDownloadEntry videoDownloadEntry : collection) {
            String m = videoDownloadEntry.m();
            VideoDownloadEntry videoDownloadEntry2 = (VideoDownloadEntry) map.get(m);
            if (videoDownloadEntry2 == null) {
                map.put(m, videoDownloadEntry);
            } else if (!videoDownloadEntry2.z() && videoDownloadEntry.z()) {
                map.put(m, videoDownloadEntry);
            }
        }
    }

    private static ArrayList<VideoDownloadAVPageEntry> a(Context context, hjy bl_hjy, int i) {
        Throwable e;
        hjy[] a = hjs.a(context, bl_hjy.n(), i);
        if (a == null) {
            return null;
        }
        ArrayList<VideoDownloadAVPageEntry> arrayList = new ArrayList();
        for (hjy bl_hjy2 : a) {
            if (bl_hjy2.i() && TextUtils.isDigitsOnly(bl_hjy2.m())) {
                hjy a2 = hju.a(bl_hjy2);
                if (a2 != null && a2.h()) {
                    VideoDownloadEntry videoDownloadEntry;
                    hjy[] f;
                    try {
                        videoDownloadEntry = (VideoDownloadAVPageEntry) hju.a(a2, VideoDownloadAVPageEntry.class);
                    } catch (IOException e2) {
                        e = e2;
                        hlg.a(e);
                        videoDownloadEntry = null;
                        if (videoDownloadEntry == null) {
                        }
                        f = bl_hjy2.f();
                        if (f != null) {
                            for (hjy bl_hjy3 : f) {
                                if (!bl_hjy3.i()) {
                                    bl_hjy3.d();
                                }
                            }
                        }
                        bl_hjy2.d();
                    } catch (JSONException e3) {
                        e = e3;
                        hlg.a(e);
                        videoDownloadEntry = null;
                        if (videoDownloadEntry == null) {
                        }
                        f = bl_hjy2.f();
                        if (f != null) {
                            for (hjy bl_hjy32 : f) {
                                if (!bl_hjy32.i()) {
                                    bl_hjy32.d();
                                }
                            }
                        }
                        bl_hjy2.d();
                    }
                    if (videoDownloadEntry == null && videoDownloadEntry.f()) {
                        boolean z;
                        arrayList.add(videoDownloadEntry);
                        if (videoDownloadEntry.z() && hle.b(context, videoDownloadEntry)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        videoDownloadEntry.o = z;
                    } else {
                        f = bl_hjy2.f();
                        if (f != null) {
                            for (hjy bl_hjy322 : f) {
                                if (!bl_hjy322.i()) {
                                    bl_hjy322.d();
                                }
                            }
                        }
                        bl_hjy2.d();
                    }
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<VideoDownloadSeasonEpEntry> a(Context context, hjy bl_hjy, String str) {
        VideoDownloadEntry videoDownloadEntry;
        Throwable e;
        hjy[] f;
        hjy[] a = hjt.a(context, bl_hjy.n(), str);
        if (a == null) {
            return null;
        }
        ArrayList<VideoDownloadSeasonEpEntry> arrayList = new ArrayList();
        for (hjy bl_hjy2 : a) {
            if (bl_hjy2.i() && TextUtils.isDigitsOnly(bl_hjy2.m())) {
                hjy a2 = hju.a(bl_hjy2);
                if (a2 != null && a2.h()) {
                    try {
                        videoDownloadEntry = (VideoDownloadSeasonEpEntry) hju.a(a2, VideoDownloadSeasonEpEntry.class);
                    } catch (IOException e2) {
                        e = e2;
                        hlg.a(e);
                        videoDownloadEntry = null;
                        if (videoDownloadEntry == null) {
                        }
                        f = bl_hjy2.f();
                        if (f != null) {
                            for (hjy bl_hjy3 : f) {
                                if (!bl_hjy3.i()) {
                                    bl_hjy3.d();
                                }
                            }
                        }
                        bl_hjy2.d();
                    } catch (JSONException e3) {
                        e = e3;
                        hlg.a(e);
                        videoDownloadEntry = null;
                        if (videoDownloadEntry == null) {
                        }
                        f = bl_hjy2.f();
                        if (f != null) {
                            for (hjy bl_hjy32 : f) {
                                if (!bl_hjy32.i()) {
                                    bl_hjy32.d();
                                }
                            }
                        }
                        bl_hjy2.d();
                    }
                    if (videoDownloadEntry == null && videoDownloadEntry.f()) {
                        boolean z;
                        arrayList.add(videoDownloadEntry);
                        if (videoDownloadEntry.z() && hle.b(context, videoDownloadEntry)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        videoDownloadEntry.o = z;
                    } else {
                        f = bl_hjy2.f();
                        if (f != null) {
                            for (hjy bl_hjy322 : f) {
                                if (!bl_hjy322.i()) {
                                    bl_hjy322.d();
                                }
                            }
                        }
                        bl_hjy2.d();
                    }
                }
            }
        }
        return arrayList;
    }

    public static long a() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return System.nanoTime();
    }
}
