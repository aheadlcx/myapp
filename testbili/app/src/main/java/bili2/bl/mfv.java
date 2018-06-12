package bili2.bl;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.core.danmaku.DanmakuLoadException;
import tv.danmaku.videoplayer.core.danmaku.DanmakuParser.Filter;
import tv.danmaku.videoplayer.core.danmaku.DanmakuParser.d;
import tv.danmaku.videoplayer.core.danmaku.DanmakuParser.e;
import tv.danmaku.videoplayer.core.danmaku.IDanmakuParams;
import tv.danmaku.videoplayer.core.danmaku.comment.CommentParseException;

/* compiled from: BL */
public class mfv implements mvm, mvo {
    public static final String a = mfv.class.getName();
    public static final String b = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 105, (byte) 107, (byte) 100, (byte) 104, (byte) 96});
    private static final String h = hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 125, (byte) 104, (byte) 105});
    public SortedMap<Long, Collection<mvs>> c = Collections.synchronizedSortedMap(new TreeMap());
    public Map<String, Object> d;
    public Filter e;
    public InputStream f;
    public d g;
    private List<mvs> i = new LinkedList();
    private List<mvs> j = Collections.synchronizedList(new LinkedList());
    private List<mvs> k = Collections.synchronizedList(new LinkedList());
    private final List<InputStream> l = Collections.synchronizedList(new ArrayList());
    private int m = Integer.MAX_VALUE;
    private String n = gmy.d;
    private String o = gmy.d;
    private String[] p;
    private int q;

    public static mvs a(int i, String str, int i2, int i3, int i4) {
        mvs a = mvt.a(i);
        if (a == null) {
            return a;
        }
        try {
            a.a((long) i2);
            a.b(str);
            a.a(i3);
            a.b(i4);
            return a;
        } catch (CommentParseException e) {
            BLog.d(a, hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 63}) + e.getMessage());
            return null;
        }
    }

    public final boolean a() {
        return this.c.isEmpty() && this.k.isEmpty();
    }

    public boolean b() {
        return !this.i.isEmpty();
    }

    @Nullable
    public List<InputStream> a(Context context, IDanmakuParams iDanmakuParams, long j) {
        Exception e;
        try {
            if (TextUtils.isEmpty(this.n) || TextUtils.isEmpty(this.o)) {
                return this.l;
            }
            mfv a = mfw.a(context, iDanmakuParams, Integer.parseInt(this.n), Integer.parseInt(this.o), j);
            return a != null ? a.l : this.l;
        } catch (DanmakuLoadException e2) {
            e = e2;
            BLog.e(a, hae.a(new byte[]{(byte) 37, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 107, (byte) 96, (byte) 114, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 37, (byte) 63}) + e.getMessage());
            if (this.l != null) {
                this.l.clear();
            }
            return null;
        } catch (NumberFormatException e3) {
            e = e3;
            BLog.e(a, hae.a(new byte[]{(byte) 37, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 107, (byte) 96, (byte) 114, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 37, (byte) 63}) + e.getMessage());
            if (this.l != null) {
                this.l.clear();
            }
            return null;
        }
    }

    public void a(InputStream inputStream) {
        if (!this.l.contains(inputStream)) {
            this.l.add(inputStream);
        }
    }

    public void b(InputStream inputStream) {
        if (this.l.size() > 0) {
            this.l.remove(inputStream);
        }
    }

    public Collection<Collection<mvs>> a(long j, long j2) {
        return this.c.subMap(Long.valueOf(j), Long.valueOf(j2)).values();
    }

    public void a(mvs bl_mvs) {
        Collection collection = (Collection) this.c.get(Long.valueOf(bl_mvs.y));
        if (collection == null) {
            collection = new CopyOnWriteArrayList();
            this.c.put(Long.valueOf(bl_mvs.y), collection);
        }
        collection.add(bl_mvs);
    }

    public void b(mvs bl_mvs) throws JSONException {
        if (bl_mvs != null) {
            if (bl_mvs.t <= 0) {
                if (this.m <= 0) {
                    this.m = Integer.MAX_VALUE;
                }
                int i = this.m;
                this.m = i - 1;
                bl_mvs.t = i;
            }
            synchronized (this.j) {
                this.j.add(bl_mvs);
                while (this.j.size() > 10) {
                    this.j.remove(0);
                }
                this.k.add(bl_mvs);
                if (this.k.size() > 50) {
                    this.k.remove(0);
                }
            }
        }
    }

    public void a(ArrayList<mvs> arrayList) {
        synchronized (this.k) {
            arrayList.addAll(this.k);
        }
    }

    public List<mvs> c() {
        return this.i;
    }

    public SortedMap<Long, Collection<mvs>> d() {
        return this.c;
    }

    public InputStream e() {
        return this.f;
    }

    public Filter f() {
        return this.e;
    }

    public d g() {
        if (this.g == null) {
            this.g = new e(this) {
                long a = 0;
                final /* synthetic */ mfv b;

                {
                    this.b = r3;
                }

                public void onEvent(String str, Object... objArr) {
                    int i = 0;
                    int i2 = -1;
                    switch (str.hashCode()) {
                        case -2131798576:
                            if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 100, (byte) 97, (byte) 97, (byte) 96, (byte) 97}))) {
                                i2 = 4;
                                break;
                            }
                            break;
                        case -1046774547:
                            if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 90, (byte) 103, (byte) 96, (byte) 98, (byte) 108, (byte) 107}))) {
                                i2 = 0;
                                break;
                            }
                            break;
                        case -185396589:
                            if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 90, (byte) 96, (byte) 125, (byte) 102, (byte) 96, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107}))) {
                                i2 = 3;
                                break;
                            }
                            break;
                        case 101942168:
                            if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 100, (byte) 105, (byte) 90, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 118, (byte) 109}))) {
                                i2 = 2;
                                break;
                            }
                            break;
                        case 1167614652:
                            if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 96, (byte) 97}))) {
                                i2 = 5;
                                break;
                            }
                            break;
                        case 2028146895:
                            if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 90, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 118, (byte) 109}))) {
                                i2 = 1;
                                break;
                            }
                            break;
                    }
                    switch (i2) {
                        case 0:
                            this.a = SystemClock.elapsedRealtime();
                            BLog.i(mfv.a, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 37, (byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 36}));
                            return;
                        case 1:
                            if (objArr != null && objArr.length >= 1 && (objArr[0] instanceof Integer)) {
                                i = ((Integer) objArr[0]).intValue();
                            }
                            mmi.a().b(SystemClock.elapsedRealtime() - this.a);
                            mmi.a().c(i);
                            mmi.a().a(this.b.k());
                            BLog.i(mfv.a, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 37, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 118, (byte) 109, (byte) 37, (byte) 114, (byte) 108, (byte) 113, (byte) 109, (byte) 37, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 37, (byte) 63}) + i);
                            this.b.m();
                            return;
                        case 2:
                            if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof Integer) && (objArr[1] instanceof Integer) && (objArr[2] instanceof Integer)) {
                                i2 = ((Integer) objArr[0]).intValue();
                                i = ((Integer) objArr[1]).intValue();
                                mmi.a().d(i2);
                                mmi.a().e(i);
                                mmi.a().a(this.b.k());
                                try {
                                    mmi.a().g(Integer.valueOf(this.b.n).intValue());
                                } catch (NumberFormatException e) {
                                }
                                BLog.i(mfv.a, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 37, (byte) 119, (byte) 96, (byte) 100, (byte) 105, (byte) 37, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 118, (byte) 109, (byte) 37, (byte) 114, (byte) 108, (byte) 113, (byte) 109, (byte) 37, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 37, (byte) 63}) + objArr[2]);
                                return;
                            }
                            return;
                        case 3:
                            String str2 = gmy.d;
                            if (!(objArr == null || objArr.length < 2 || objArr[0] == null || objArr[1] == null)) {
                                str2 = objArr[0].toString() + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 97, (byte) 37, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 37, (byte) 63, (byte) 37}) + objArr[1].toString();
                            }
                            BLog.e(mfv.a, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 37, (byte) 63, (byte) 37}) + str2);
                            mmi.a().c();
                            mmi.a().a(8, 0, str2);
                            this.b.m();
                            return;
                        default:
                            return;
                    }
                }

                public void a() {
                }

                public void a(int i) {
                }
            };
        }
        return this.g;
    }

    private void m() {
        if (TextUtils.isEmpty(this.n)) {
            mmi.a().d();
            return;
        }
        try {
            mmi.a().f(Integer.valueOf(this.n).intValue());
        } catch (NumberFormatException e) {
            mmi.a().d();
        }
    }

    public void a(String str, Object obj) {
        if (this.d == null) {
            this.d = Collections.synchronizedMap(new HashMap());
        }
        if (hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 105, (byte) 107, (byte) 100, (byte) 104, (byte) 96}).equals(str)) {
            this.d.put(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 105, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), obj);
        } else if (hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 102, (byte) 90, (byte) 99, (byte) 105, (byte) 100, (byte) 98}).equals(str) || hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 102, (byte) 90, (byte) 113, (byte) 96, (byte) 125, (byte) 113}).equals(str) || hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 106, (byte) 118, (byte) 96, (byte) 97, (byte) 90, (byte) 103, (byte) 124, (byte) 90, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 96, (byte) 119}).equals(str)) {
            this.d.put(str, obj);
        } else if (hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112}).equals(str)) {
            this.d.put(hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112}), obj);
        }
    }

    public Object a(String str) {
        if (this.d == null) {
            return null;
        }
        return this.d.get(str);
    }

    public void a(String str, String str2) {
        this.n = str;
        this.o = str2;
    }

    public int h() {
        try {
            return Integer.parseInt(this.o);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public void a(String... strArr) {
        this.p = strArr;
        a(j());
    }

    public String i() {
        if (this.p == null || this.p.length <= 1) {
            return null;
        }
        return this.p[1];
    }

    public int j() {
        int i = 1;
        if (this.p != null && this.p.length > 0) {
            try {
                i = Integer.parseInt(this.p[0]);
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public boolean k() {
        return this.p != null && this.p.length > 2 && "1".equals(this.p[2]);
    }

    public void a(int i) {
        this.q = i;
    }

    public int l() {
        return this.q;
    }
}
