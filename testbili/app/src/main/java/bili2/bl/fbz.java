package bili2.bl;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bilibili.lib.httpdns.LookupException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BL */
public class fbz implements fbs {
    private fbv a;
    private b b = new b();

    /* compiled from: BL */
    static class a {
        String a;
        int b;
        int c;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: BL */
    static class b {
        static final String[] a = new String[]{"203.107.1.65", "203.107.1.34", "203.107.1.66", "203.107.1.33"};
        private static final Comparator<a> d = new Comparator<a>() {
            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((a) obj, (a) obj2);
            }

            public int a(a aVar, a aVar2) {
                if (aVar.b > aVar2.b) {
                    return -1;
                }
                if (aVar.c > aVar2.c) {
                    return 1;
                }
                if (aVar.c == aVar2.c) {
                    return 0;
                }
                return -1;
            }
        };
        private boolean b = true;
        private LinkedList<a> c = new LinkedList();

        b() {
            for (String aVar : a) {
                this.c.add(new a(aVar));
            }
        }

        synchronized List<String> a() {
            List<String> arrayList;
            int length = this.b ? a.length : a.length - 1;
            Collections.sort(this.c, d);
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(((a) this.c.get(i)).a);
            }
            if (this.b) {
                this.b = false;
            }
            return arrayList;
        }

        synchronized void a(String str, boolean z) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.a.equals(str)) {
                    if (z) {
                        aVar.b++;
                    } else {
                        aVar.c++;
                    }
                }
            }
        }
    }

    public fbz(fbv bl_fbv) {
        this.a = bl_fbv;
    }

    @NonNull
    public String a() {
        return "ali";
    }

    @NonNull
    public fbt a(String str) throws LookupException {
        List b = b(str);
        if (b != null && !b.isEmpty()) {
            return (fbt) b.get(0);
        }
        throw new LookupException("empty dns records for " + str);
    }

    @NonNull
    public List<fbt> a(String[] strArr) throws LookupException {
        List<fbt> b = b(strArr);
        if (b != null && !b.isEmpty()) {
            return b;
        }
        throw new LookupException("empty dns records");
    }

    private List<bl.fbt> b(String... r13) throws com.bilibili.lib.httpdns.LookupException {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:bl.fbz.b(java.lang.String[]):java.util.List<bl.fbt>. bs: [B:38:0x00d2, B:48:0x00ff]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
*/
        /*
        r12 = this;
        r1 = 0;
        r5 = 0;
        r6 = new bl.fbv$a;
        r6.<init>();
        r8 = android.os.SystemClock.elapsedRealtime();
        r0 = r12.b;
        r0 = r0.a();
        r2 = r0.size();
        r2 = bl.err.a(r5, r2);
        r0 = r0.get(r2);
        r0 = (java.lang.String) r0;
        r2 = r12.a(r0, r13);
        r2 = r2.toString();	 Catch:{ all -> 0x00bc }
        r3 = "AliDNSProvider";	 Catch:{ all -> 0x00bc }
        r4 = java.util.Locale.US;	 Catch:{ all -> 0x00bc }
        r7 = "send request for %s";	 Catch:{ all -> 0x00bc }
        r10 = 1;	 Catch:{ all -> 0x00bc }
        r10 = new java.lang.Object[r10];	 Catch:{ all -> 0x00bc }
        r11 = 0;	 Catch:{ all -> 0x00bc }
        r10[r11] = r2;	 Catch:{ all -> 0x00bc }
        r4 = java.lang.String.format(r4, r7, r10);	 Catch:{ all -> 0x00bc }
        tv.danmaku.android.log.BLog.d(r3, r4);	 Catch:{ all -> 0x00bc }
        r6.d = r0;	 Catch:{ all -> 0x00bc }
        r3 = bl.fbw.a(r2);	 Catch:{ IOException -> 0x00aa }
        r2 = r3.getResponseCode();	 Catch:{ IOException -> 0x006d }
        r6.b = r2;	 Catch:{ IOException -> 0x006d }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x006d }
        if (r2 == r4) goto L_0x00c1;	 Catch:{ IOException -> 0x006d }
    L_0x004c:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x006d }
        r4.<init>();	 Catch:{ IOException -> 0x006d }
        r7 = "http status code ";	 Catch:{ IOException -> 0x006d }
        r4 = r4.append(r7);	 Catch:{ IOException -> 0x006d }
        r2 = r4.append(r2);	 Catch:{ IOException -> 0x006d }
        r2 = r2.toString();	 Catch:{ IOException -> 0x006d }
        r4 = new java.lang.Exception;	 Catch:{ IOException -> 0x006d }
        r4.<init>(r2);	 Catch:{ IOException -> 0x006d }
        r6.a = r4;	 Catch:{ IOException -> 0x006d }
        r4 = new com.bilibili.lib.httpdns.LookupException;	 Catch:{ IOException -> 0x006d }
        r4.<init>(r2);	 Catch:{ IOException -> 0x006d }
        throw r4;	 Catch:{ IOException -> 0x006d }
    L_0x006d:
        r2 = move-exception;
        r4 = -1;
        r6.b = r4;	 Catch:{ all -> 0x007f }
        r6.a = r2;	 Catch:{ all -> 0x007f }
        r4 = r12.b;	 Catch:{ all -> 0x007f }
        r7 = 0;	 Catch:{ all -> 0x007f }
        r4.a(r0, r7);	 Catch:{ all -> 0x007f }
        r0 = new com.bilibili.lib.httpdns.LookupException;	 Catch:{ all -> 0x007f }
        r0.<init>(r2);	 Catch:{ all -> 0x007f }
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        r2 = r0;
        r4 = r3;
        r3 = r1;
    L_0x0083:
        r10 = android.os.SystemClock.elapsedRealtime();
        r8 = r10 - r8;
        r6.c = r8;
        if (r1 != 0) goto L_0x0130;
    L_0x008d:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r7 = r13.length;
        r1 = r5;
    L_0x0094:
        if (r1 >= r7) goto L_0x0131;
    L_0x0096:
        r5 = r13[r1];
        r8 = new bl.fbt;
        r8.<init>();
        r9 = "ali";
        r8.a = r9;
        r8.b = r5;
        r0.add(r8);
        r1 = r1 + 1;
        goto L_0x0094;
    L_0x00aa:
        r2 = move-exception;
        r3 = -1;
        r6.b = r3;	 Catch:{ all -> 0x00bc }
        r6.a = r2;	 Catch:{ all -> 0x00bc }
        r3 = r12.b;	 Catch:{ all -> 0x00bc }
        r4 = 0;	 Catch:{ all -> 0x00bc }
        r3.a(r0, r4);	 Catch:{ all -> 0x00bc }
        r0 = new com.bilibili.lib.httpdns.LookupException;	 Catch:{ all -> 0x00bc }
        r0.<init>(r2);	 Catch:{ all -> 0x00bc }
        throw r0;	 Catch:{ all -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        r2 = r0;
        r3 = r1;
        r4 = r1;
        goto L_0x0083;
    L_0x00c1:
        r2 = r12.b;	 Catch:{ all -> 0x007f }
        r4 = 1;	 Catch:{ all -> 0x007f }
        r2.a(r0, r4);	 Catch:{ all -> 0x007f }
        r2 = r3.getInputStream();	 Catch:{ IOException -> 0x00fc }
        r0 = "UTF-8";	 Catch:{ IOException -> 0x0145 }
        r0 = bl.erz.a(r2, r0);	 Catch:{ IOException -> 0x0145 }
        r1 = r12.b(r0);	 Catch:{ JSONException -> 0x0124 }
        r10 = android.os.SystemClock.elapsedRealtime();
        r8 = r10 - r8;
        r6.c = r8;
        if (r1 != 0) goto L_0x010f;
    L_0x00e0:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r4 = r13.length;
    L_0x00e6:
        if (r5 >= r4) goto L_0x0110;
    L_0x00e8:
        r7 = r13[r5];
        r8 = new bl.fbt;
        r8.<init>();
        r9 = "ali";
        r8.a = r9;
        r8.b = r7;
        r0.add(r8);
        r5 = r5 + 1;
        goto L_0x00e6;
    L_0x00fc:
        r0 = move-exception;
        r2 = r1;
    L_0x00fe:
        r4 = -2;
        r6.b = r4;	 Catch:{ all -> 0x0109 }
        r6.a = r0;	 Catch:{ all -> 0x0109 }
        r4 = new com.bilibili.lib.httpdns.LookupException;	 Catch:{ all -> 0x0109 }
        r4.<init>(r0);	 Catch:{ all -> 0x0109 }
        throw r4;	 Catch:{ all -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        r4 = r3;
        r3 = r2;
        r2 = r0;
        goto L_0x0083;
    L_0x010f:
        r0 = r1;
    L_0x0110:
        r6.e = r0;
        r0 = r12.a;
        if (r0 == 0) goto L_0x011b;
    L_0x0116:
        r0 = r12.a;
        r0.onEvent(r6);
    L_0x011b:
        bl.erz.a(r2);
        if (r3 == 0) goto L_0x0123;
    L_0x0120:
        r3.disconnect();
    L_0x0123:
        return r1;
    L_0x0124:
        r0 = move-exception;
        r4 = -3;
        r6.b = r4;	 Catch:{ all -> 0x0109 }
        r6.a = r0;	 Catch:{ all -> 0x0109 }
        r4 = new com.bilibili.lib.httpdns.LookupException;	 Catch:{ all -> 0x0109 }
        r4.<init>(r0);	 Catch:{ all -> 0x0109 }
        throw r4;	 Catch:{ all -> 0x0109 }
    L_0x0130:
        r0 = r1;
    L_0x0131:
        r6.e = r0;
        r0 = r12.a;
        if (r0 == 0) goto L_0x013c;
    L_0x0137:
        r0 = r12.a;
        r0.onEvent(r6);
    L_0x013c:
        bl.erz.a(r3);
        if (r4 == 0) goto L_0x0144;
    L_0x0141:
        r4.disconnect();
    L_0x0144:
        throw r2;
    L_0x0145:
        r0 = move-exception;
        goto L_0x00fe;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.fbz.b(java.lang.String[]):java.util.List<bl.fbt>");
    }

    private Uri a(String str, String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            stringBuilder.append(strArr[i]);
            if (i != strArr.length - 1) {
                stringBuilder.append(",");
            }
        }
        return new Builder().scheme("http").authority(str).appendPath("191607").appendPath("resolve").appendQueryParameter("host", stringBuilder.toString()).build();
    }

    private List<fbt> b(String str) throws JSONException {
        JSONArray optJSONArray = new JSONObject(str).optJSONArray("dns");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        List<fbt> arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                Object optString = optJSONObject.optString("host");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("ips");
                if (!(TextUtils.isEmpty(optString) || optJSONArray2 == null || optJSONArray2.length() <= 0)) {
                    int length2 = optJSONArray2.length();
                    fbt bl_fbt = new fbt();
                    bl_fbt.a = "ali";
                    bl_fbt.b = optString;
                    bl_fbt.d = optJSONObject.optInt("ttl");
                    bl_fbt.e = optJSONObject.optInt("origin_ttl");
                    bl_fbt.c = new ArrayList(length2);
                    for (int i2 = 0; i2 < length2; i2++) {
                        bl_fbt.c.add(optJSONArray2.optString(i2));
                    }
                    arrayList.add(bl_fbt);
                }
            }
        }
        return arrayList;
    }
}
