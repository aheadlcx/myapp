package bili3.com.bilibili.opd.app.bizcommon.mediaplayer;

import android.content.Context;
import android.os.FileObserver;
import android.os.StatFs;
import android.support.annotation.WorkerThread;
import bl.ers;
import bl.erx;
import bl.fgw;
import bl.gpr;
import bl.gy;
import bl.hae;
import bl.ibn;
import bl.klw;
import bl.kly.a;
import com.bilibili.ad.adview.feed.model.AdTag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: BL */
public class TempCacheHelper implements gpr {
    private static final String a = hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119});
    private static final String b = (File.separator + hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 113, (byte) 104, (byte) 117, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96}) + File.separator);
    private static final String c = hae.a(new byte[]{(byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 111, (byte) 106, (byte) 112, (byte) 119, (byte) 107, (byte) 100, (byte) 105});
    private final klw d = fgw.b().c();
    private final File e;
    private FileObserver f;
    private gy<Long, TempCacheObj> g;

    /* compiled from: BL */
    public static class TempCacheObj implements Serializable {
        int contentLength;
        public long id;
        public String path;
        boolean valid = true;

        TempCacheObj(long j, String str, int i) {
            this.id = j;
            this.path = str;
            this.contentLength = i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TempCacheObj tempCacheObj = (TempCacheObj) obj;
            if (this.id != tempCacheObj.id || this.contentLength != tempCacheObj.contentLength) {
                return false;
            }
            if (this.path != null) {
                z = this.path.equals(tempCacheObj.path);
            } else if (tempCacheObj.path != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((this.path != null ? this.path.hashCode() : 0) + (((int) (this.id ^ (this.id >>> 32))) * 31)) * 31) + this.contentLength;
        }
    }

    public TempCacheHelper(Context context) {
        this.e = c(context);
        if (this.e.exists() || this.e.mkdir()) {
            Map map;
            File[] listFiles;
            ArrayList arrayList;
            File file;
            this.f = new FileObserver(this, this.e.getAbsolutePath(), 256) {
                final /* synthetic */ TempCacheHelper a;

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onEvent(int r10, String r11) {
                    /*
                    r9 = this;
                    r1 = com.bilibili.opd.app.bizcommon.mediaplayer.TempCacheHelper.class;
                    monitor-enter(r1);	 Catch:{ Exception -> 0x00e8 }
                    r0 = 18;
                    r0 = new byte[r0];	 Catch:{ all -> 0x00e5 }
                    r0 = {113, 96, 104, 117, 90, 102, 100, 102, 109, 96, 90, 111, 106, 112, 119, 107, 100, 105};	 Catch:{ all -> 0x00e5 }
                    r0 = bl.hae.a(r0);	 Catch:{ all -> 0x00e5 }
                    r0 = r0.equals(r11);	 Catch:{ all -> 0x00e5 }
                    if (r0 == 0) goto L_0x0016;
                L_0x0014:
                    monitor-exit(r1);	 Catch:{ all -> 0x00e5 }
                L_0x0015:
                    return;
                L_0x0016:
                    r0 = "_";
                    r0 = r11.lastIndexOf(r0);	 Catch:{ all -> 0x00e5 }
                    r2 = 0;
                    r2 = r11.substring(r2, r0);	 Catch:{ all -> 0x00e5 }
                    r2 = java.lang.Long.parseLong(r2);	 Catch:{ all -> 0x00e5 }
                    r0 = r0 + 1;
                    r0 = r11.substring(r0);	 Catch:{ all -> 0x00e5 }
                    r4 = java.lang.Integer.parseInt(r0);	 Catch:{ all -> 0x00e5 }
                    r6 = 0;
                    r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
                    if (r0 == 0) goto L_0x00e2;
                L_0x0036:
                    if (r4 <= 0) goto L_0x00e2;
                L_0x0038:
                    r0 = r9.a;	 Catch:{ all -> 0x00e5 }
                    r0 = r0.g;	 Catch:{ all -> 0x00e5 }
                    r5 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x00e5 }
                    r0 = r0.a(r5);	 Catch:{ all -> 0x00e5 }
                    r0 = (com.bilibili.opd.app.bizcommon.mediaplayer.TempCacheHelper.TempCacheObj) r0;	 Catch:{ all -> 0x00e5 }
                    r5 = new com.bilibili.opd.app.bizcommon.mediaplayer.TempCacheHelper$TempCacheObj;	 Catch:{ all -> 0x00e5 }
                    r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e5 }
                    r6.<init>();	 Catch:{ all -> 0x00e5 }
                    r7 = r9.a;	 Catch:{ all -> 0x00e5 }
                    r7 = r7.e;	 Catch:{ all -> 0x00e5 }
                    r7 = r7.getAbsolutePath();	 Catch:{ all -> 0x00e5 }
                    r6 = r6.append(r7);	 Catch:{ all -> 0x00e5 }
                    r7 = java.io.File.separator;	 Catch:{ all -> 0x00e5 }
                    r6 = r6.append(r7);	 Catch:{ all -> 0x00e5 }
                    r6 = r6.append(r11);	 Catch:{ all -> 0x00e5 }
                    r6 = r6.toString();	 Catch:{ all -> 0x00e5 }
                    r5.<init>(r2, r6, r4);	 Catch:{ all -> 0x00e5 }
                    if (r0 == 0) goto L_0x0076;
                L_0x0070:
                    r0 = r0.equals(r5);	 Catch:{ all -> 0x00e5 }
                    if (r0 != 0) goto L_0x00e2;
                L_0x0076:
                    r0 = r9.a;	 Catch:{ all -> 0x00e5 }
                    r0 = r0.g;	 Catch:{ all -> 0x00e5 }
                    r5 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x00e5 }
                    r6 = new com.bilibili.opd.app.bizcommon.mediaplayer.TempCacheHelper$TempCacheObj;	 Catch:{ all -> 0x00e5 }
                    r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e5 }
                    r7.<init>();	 Catch:{ all -> 0x00e5 }
                    r8 = r9.a;	 Catch:{ all -> 0x00e5 }
                    r8 = r8.e;	 Catch:{ all -> 0x00e5 }
                    r8 = r8.getAbsolutePath();	 Catch:{ all -> 0x00e5 }
                    r7 = r7.append(r8);	 Catch:{ all -> 0x00e5 }
                    r8 = java.io.File.separator;	 Catch:{ all -> 0x00e5 }
                    r7 = r7.append(r8);	 Catch:{ all -> 0x00e5 }
                    r7 = r7.append(r11);	 Catch:{ all -> 0x00e5 }
                    r7 = r7.toString();	 Catch:{ all -> 0x00e5 }
                    r6.<init>(r2, r7, r4);	 Catch:{ all -> 0x00e5 }
                    r0.a(r5, r6);	 Catch:{ all -> 0x00e5 }
                    r0 = 15;
                    r0 = new byte[r0];	 Catch:{ all -> 0x00e5 }
                    r0 = {81, 96, 104, 117, 70, 100, 102, 109, 96, 77, 96, 105, 117, 96, 119};	 Catch:{ all -> 0x00e5 }
                    r0 = bl.hae.a(r0);	 Catch:{ all -> 0x00e5 }
                    r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e5 }
                    r2.<init>();	 Catch:{ all -> 0x00e5 }
                    r3 = r9.a;	 Catch:{ all -> 0x00e5 }
                    r3 = r3.hashCode();	 Catch:{ all -> 0x00e5 }
                    r2 = r2.append(r3);	 Catch:{ all -> 0x00e5 }
                    r3 = 26;
                    r3 = new byte[r3];	 Catch:{ all -> 0x00e5 }
                    r3 = {63, 37, 102, 119, 96, 100, 113, 96, 37, 113, 96, 104, 117, 37, 102, 100, 102, 109, 96, 37, 99, 108, 105, 96, 37, 63};	 Catch:{ all -> 0x00e5 }
                    r3 = bl.hae.a(r3);	 Catch:{ all -> 0x00e5 }
                    r2 = r2.append(r3);	 Catch:{ all -> 0x00e5 }
                    r2 = r2.append(r11);	 Catch:{ all -> 0x00e5 }
                    r2 = r2.toString();	 Catch:{ all -> 0x00e5 }
                    tv.danmaku.android.log.BLog.d(r0, r2);	 Catch:{ all -> 0x00e5 }
                    r0 = r9.a;	 Catch:{ all -> 0x00e5 }
                    r0.b();	 Catch:{ all -> 0x00e5 }
                L_0x00e2:
                    monitor-exit(r1);	 Catch:{ all -> 0x00e5 }
                    goto L_0x0015;
                L_0x00e5:
                    r0 = move-exception;
                    monitor-exit(r1);	 Catch:{ all -> 0x00e5 }
                    throw r0;	 Catch:{ Exception -> 0x00e8 }
                L_0x00e8:
                    r0 = move-exception;
                    bl.ibn.a(r0);
                    goto L_0x0015;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mediaplayer.TempCacheHelper.1.onEvent(int, java.lang.String):void");
                }
            };
            this.g = new gy<Long, TempCacheObj>(this, 204800) {
                final /* synthetic */ TempCacheHelper a;

                protected /* synthetic */ int b(Object obj, Object obj2) {
                    return a((Long) obj, (TempCacheObj) obj2);
                }

                protected int a(Long l, TempCacheObj tempCacheObj) {
                    return tempCacheObj.contentLength;
                }

                protected void a(boolean z, Long l, TempCacheObj tempCacheObj, TempCacheObj tempCacheObj2) {
                    synchronized (TempCacheHelper.class) {
                        File file = new File(tempCacheObj.path);
                        if (file.exists()) {
                            boolean d = erx.d(file);
                            BLog.d(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), this.a.hashCode() + hae.a(new byte[]{(byte) 63, (byte) 37, (byte) 97, (byte) 96, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 63}) + file.getAbsolutePath());
                            if (!d) {
                                BLog.e(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), this.a.hashCode() + hae.a(new byte[]{(byte) 63, (byte) 37, (byte) 97, (byte) 96, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}));
                            }
                        }
                    }
                }
            };
            File c = c();
            if (c != null) {
                try {
                    map = (Map) ers.a(new FileInputStream(c));
                } catch (Throwable e) {
                    ibn.a(e);
                    BLog.e(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 108, Byte.MAX_VALUE, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 80, (byte) 113, (byte) 108, (byte) 105, (byte) 118, (byte) 37, (byte) 97, (byte) 96, (byte) 118, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}));
                    erx.d(c);
                    BLog.e(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 108, Byte.MAX_VALUE, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 80, (byte) 113, (byte) 108, (byte) 105, (byte) 118, (byte) 37, (byte) 97, (byte) 96, (byte) 118, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 63, (byte) 37, (byte) 97, (byte) 96, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96}));
                }
                listFiles = this.e.listFiles();
                arrayList = new ArrayList();
                if (map == null && this.e.exists()) {
                    BLog.d(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 79, (byte) 106, (byte) 112, (byte) 119, (byte) 107, (byte) 100, (byte) 105, (byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 102, (byte) 100, (byte) 107, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 37, (byte) 106, (byte) 119, (byte) 37, (byte) 97, (byte) 106, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 96, (byte) 125, (byte) 108, (byte) 118, (byte) 113, (byte) 41, (byte) 37, (byte) 118, (byte) 106, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 97, (byte) 108, (byte) 119}));
                    erx.e(this.e);
                }
                if (map != null) {
                    for (Entry entry : map.entrySet()) {
                        file = new File(((TempCacheObj) entry.getValue()).path);
                        if (file.exists() && file.length() > 0 && file.length() / 1024 == ((long) ((TempCacheObj) entry.getValue()).contentLength)) {
                            ((TempCacheObj) entry.getValue()).valid = true;
                            this.g.a(entry.getKey(), entry.getValue());
                            arrayList.add(file);
                        }
                    }
                }
                if (listFiles != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        if (!(arrayList.contains(file2) || file2.getName().contains(hae.a(new byte[]{(byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 111, (byte) 106, (byte) 112, (byte) 119, (byte) 107, (byte) 100, (byte) 105})) || file2.delete())) {
                            BLog.d(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 108, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}) + file2);
                        }
                    }
                }
                this.f.startWatching();
                return;
            }
            map = null;
            listFiles = this.e.listFiles();
            arrayList = new ArrayList();
            try {
                BLog.d(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 79, (byte) 106, (byte) 112, (byte) 119, (byte) 107, (byte) 100, (byte) 105, (byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 102, (byte) 100, (byte) 107, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 37, (byte) 106, (byte) 119, (byte) 37, (byte) 97, (byte) 106, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 96, (byte) 125, (byte) 108, (byte) 118, (byte) 113, (byte) 41, (byte) 37, (byte) 118, (byte) 106, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 97, (byte) 108, (byte) 119}));
                erx.e(this.e);
            } catch (Throwable e2) {
                ibn.a(e2);
            }
            if (map != null) {
                for (Entry entry2 : map.entrySet()) {
                    file = new File(((TempCacheObj) entry2.getValue()).path);
                    ((TempCacheObj) entry2.getValue()).valid = true;
                    this.g.a(entry2.getKey(), entry2.getValue());
                    arrayList.add(file);
                }
            }
            for (File file22 : listFiles) {
                BLog.d(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 108, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}) + file22);
            }
            this.f.startWatching();
            return;
        }
        BLog.e(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 97, (byte) 108, (byte) 119, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}));
    }

    private String b(long j, int i) {
        if (this.g == null) {
            return null;
        }
        TempCacheObj tempCacheObj = (TempCacheObj) this.g.a(Long.valueOf(j));
        if (tempCacheObj != null) {
            File file = new File(tempCacheObj.path);
            if (file.exists()) {
                if (file.length() > 0 && ((long) tempCacheObj.contentLength) == file.length() / 1024 && tempCacheObj.valid && tempCacheObj.contentLength == i) {
                    return tempCacheObj.path;
                }
                this.g.b(Long.valueOf(j));
                return null;
            }
        }
        return null;
    }

    String a(long j, int i) {
        if (this.g == null || i > 51200) {
            return null;
        }
        if (a(this.e)) {
            return new File(this.e, j + "_" + i).getAbsolutePath();
        }
        int b = this.g.b();
        if (b <= i) {
            return null;
        }
        this.g.a(b - i);
        if (a(this.e)) {
            return new File(this.e, j + "_" + i).getAbsolutePath();
        }
        return null;
    }

    @WorkerThread
    int a(String str) throws IOException {
        long parseLong;
        try {
            parseLong = Long.parseLong(this.d.a(new a().a(str).b().c()).b().a(hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 40, (byte) 73, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109})));
        } catch (Throwable e) {
            ibn.a(e);
            parseLong = 0;
        }
        if (parseLong > 0) {
            return (int) (parseLong / 1024);
        }
        throw new IOException(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 37, (byte) 109, (byte) 96, (byte) 100, (byte) 97, (byte) 37, (byte) 102, (byte) 100, (byte) 107, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 118, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 36}));
    }

    private synchronized void b() {
        if (this.g != null) {
            Map c = this.g.c();
            if (c instanceof LinkedHashMap) {
                File d = d();
                if (d != null) {
                    try {
                        ers.a((LinkedHashMap) c, new FileOutputStream(d));
                    } catch (Throwable e) {
                        ibn.a(e);
                        BLog.e(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 108, Byte.MAX_VALUE, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 80, (byte) 113, (byte) 108, (byte) 105, (byte) 118, (byte) 37, (byte) 86, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 119, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}));
                    }
                }
            }
        }
    }

    private synchronized File c() {
        File file = null;
        synchronized (this) {
            File file2 = new File(this.e, hae.a(new byte[]{(byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 111, (byte) 106, (byte) 112, (byte) 119, (byte) 107, (byte) 100, (byte) 105}));
            if (file2.exists()) {
                if (file2.length() <= 0) {
                    erx.d(file2);
                } else {
                    file = file2;
                }
            }
        }
        return file;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized File d() {
        /*
        r4 = this;
        r0 = 0;
        monitor-enter(r4);
        r1 = new java.io.File;	 Catch:{ all -> 0x0040 }
        r2 = r4.e;	 Catch:{ all -> 0x0040 }
        r3 = 18;
        r3 = new byte[r3];	 Catch:{ all -> 0x0040 }
        r3 = {113, 96, 104, 117, 90, 102, 100, 102, 109, 96, 90, 111, 106, 112, 119, 107, 100, 105};	 Catch:{ all -> 0x0040 }
        r3 = bl.hae.a(r3);	 Catch:{ all -> 0x0040 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0040 }
        r2 = r1.exists();	 Catch:{ all -> 0x0040 }
        if (r2 != 0) goto L_0x0043;
    L_0x001a:
        r2 = r1.createNewFile();	 Catch:{ IOException -> 0x0022 }
        if (r2 != 0) goto L_0x004c;
    L_0x0020:
        monitor-exit(r4);
        return r0;
    L_0x0022:
        r1 = move-exception;
        bl.ibn.a(r1);	 Catch:{ all -> 0x0040 }
        r1 = 15;
        r1 = new byte[r1];	 Catch:{ all -> 0x0040 }
        r1 = {81, 96, 104, 117, 70, 100, 102, 109, 96, 77, 96, 105, 117, 96, 119};	 Catch:{ all -> 0x0040 }
        r1 = bl.hae.a(r1);	 Catch:{ all -> 0x0040 }
        r2 = 15;
        r2 = new byte[r2];	 Catch:{ all -> 0x0040 }
        r2 = {98, 96, 113, 37, 102, 100, 102, 109, 96, 37, 96, 119, 119, 106, 119};	 Catch:{ all -> 0x0040 }
        r2 = bl.hae.a(r2);	 Catch:{ all -> 0x0040 }
        tv.danmaku.android.log.BLog.e(r1, r2);	 Catch:{ all -> 0x0040 }
        goto L_0x0020;
    L_0x0040:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0043:
        bl.erx.d(r1);	 Catch:{ all -> 0x0040 }
        r2 = r1.createNewFile();	 Catch:{ IOException -> 0x004e }
        if (r2 == 0) goto L_0x0020;
    L_0x004c:
        r0 = r1;
        goto L_0x0020;
    L_0x004e:
        r1 = move-exception;
        bl.ibn.a(r1);	 Catch:{ all -> 0x0040 }
        r1 = 15;
        r1 = new byte[r1];	 Catch:{ all -> 0x0040 }
        r1 = {81, 96, 104, 117, 70, 100, 102, 109, 96, 77, 96, 105, 117, 96, 119};	 Catch:{ all -> 0x0040 }
        r1 = bl.hae.a(r1);	 Catch:{ all -> 0x0040 }
        r2 = 15;
        r2 = new byte[r2];	 Catch:{ all -> 0x0040 }
        r2 = {98, 96, 113, 37, 102, 100, 102, 109, 96, 37, 96, 119, 119, 106, 119};	 Catch:{ all -> 0x0040 }
        r2 = bl.hae.a(r2);	 Catch:{ all -> 0x0040 }
        tv.danmaku.android.log.BLog.e(r1, r2);	 Catch:{ all -> 0x0040 }
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mediaplayer.TempCacheHelper.d():java.io.File");
    }

    private boolean a(File file) {
        if (!file.exists()) {
            return false;
        }
        StatFs statFs = new StatFs(file.getPath());
        if (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()) > 209715200) {
            return true;
        }
        return false;
    }

    public <T extends MediaSource> void a(IMediaPlayer iMediaPlayer, T t, long j, int i, long j2) {
        if (this.g != null && iMediaPlayer.getDataSource().startsWith(hae.a(new byte[]{(byte) 100, (byte) 118, (byte) 124, (byte) 107, (byte) 102, (byte) 63, (byte) 108, (byte) 111, (byte) 110, (byte) 108, (byte) 106, (byte) 63, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 63, (byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 109, (byte) 106, (byte) 106, (byte) 110, (byte) 63, (byte) 99, (byte) 99, (byte) 108, (byte) 106, (byte) 63})) && ((long) i) * j < j2) {
            TempCacheObj tempCacheObj = (TempCacheObj) this.g.a(Long.valueOf(t.getId()));
            if (tempCacheObj != null) {
                tempCacheObj.valid = false;
            }
        }
    }

    public <T extends MediaSource> void a(T t) {
        if (this.g != null && t != null) {
            TempCacheObj tempCacheObj = (TempCacheObj) this.g.a(Long.valueOf(t.getId()));
            if (tempCacheObj != null) {
                tempCacheObj.valid = false;
            }
        }
    }

    private static File c(Context context) {
        return new File(context.getCacheDir(), b);
    }

    public long a(Context context) {
        File c = c(context);
        return !c.exists() ? 0 : erx.k(c);
    }

    public void b(Context context) {
        File c = c(context);
        if (c.exists() && c.isDirectory()) {
            try {
                this.g.a();
                erx.e(c);
            } catch (Throwable e) {
                ibn.a(e);
                BLog.w(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 65, (byte) 108, (byte) 119, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105}));
            }
        }
    }

    public UrlResponseV2 a(UrlResponseV2 urlResponseV2, boolean z) {
        if (urlResponseV2.isValid() && z && !UrlResponseV2.getCurrentUrl(urlResponseV2).startsWith("file")) {
            try {
                int a = a((String) urlResponseV2.cdns.get(urlResponseV2.indexOfUrlToUse));
                String b = b(urlResponseV2.sid, a);
                if (b != null) {
                    urlResponseV2.cdns = Collections.singletonList(new File(b).toURI().toString());
                    urlResponseV2.timeout = AdTag.INVALID_ID;
                    urlResponseV2.indexOfUrlToUse = 0;
                } else {
                    urlResponseV2.tempCachePath = a(urlResponseV2.sid, a);
                }
            } catch (Throwable e) {
                ibn.a(e);
                BLog.d(hae.a(new byte[]{(byte) 81, (byte) 96, (byte) 104, (byte) 117, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 116, (byte) 112, (byte) 96, (byte) 119, (byte) 124, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 37, (byte) 100, (byte) 117, (byte) 108, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 63, (byte) 37}) + urlResponseV2.sid);
            }
        }
        return urlResponseV2;
    }

    public int a() {
        return Integer.MIN_VALUE;
    }
}
