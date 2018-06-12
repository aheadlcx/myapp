package bili2.bl;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import bl.hjr.a;
import com.bilibili.videodownloader.exceptions.DownloadAbortException;
import com.bilibili.videodownloader.exceptions.DownloadException;
import com.bilibili.videodownloader.exceptions.DownloadUsualException;
import com.bilibili.videodownloader.model.SegmentCheckSum;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* compiled from: BL */
public class hkb implements a, hkc {
    private static final String a = hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119});
    private hju b;
    private VideoDownloadEntry c;
    private Handler d;
    private Context e;
    private String f;
    private String g;
    private hjy h;
    private hjy i;
    private hjy j;
    private int k = 3;
    private int l;
    private long m;
    private hkw n;
    private a o;

    public /* synthetic */ Object call() throws Exception {
        return b();
    }

    hkb(Context context, Handler handler, hju bl_hju, VideoDownloadEntry videoDownloadEntry, @NonNull hkw bl_hkw, int i, a aVar) {
        this.e = context;
        this.b = bl_hju;
        this.d = handler;
        this.c = videoDownloadEntry;
        this.l = i;
        this.n = bl_hkw;
        this.o = aVar;
    }

    public Void b() throws Exception {
        c();
        if (!f()) {
            int i = 0;
            while (i < this.k) {
                try {
                    d();
                    e();
                    if (f()) {
                        break;
                    }
                    i++;
                } catch (DownloadUsualException e) {
                    hlg.b(hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 119, (byte) 96, (byte) 113, (byte) 119, (byte) 124, (byte) 37, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 94, (byte) 32, (byte) 97, (byte) 88, (byte) 41, (byte) 37, (byte) 119, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 63, (byte) 37, (byte) 32, (byte) 118}), Integer.valueOf(i), e.toString());
                    a(e, i);
                }
            }
        }
        return null;
    }

    private void a(DownloadUsualException downloadUsualException, int i) throws DownloadException {
        try {
            Thread.sleep(2500);
        } catch (Throwable e) {
            hlg.a(e);
        }
        hle.b(this.e);
        if (i == this.k - 1) {
            throw downloadUsualException;
        }
    }

    public void c() throws DownloadAbortException {
        this.h = a(this.l);
        this.i = this.b.b(this.e, this.h);
        this.j = this.b.a(this.e, this.h);
        if (this.h.i() || this.i.i() || this.j.i()) {
            throw new DownloadAbortException(6, hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 37, (byte) 99, (byte) 106, (byte) 119, (byte) 37, (byte) 107, (byte) 96, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 119, (byte) 124, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96}));
        }
    }

    public void d() throws InterruptedException, DownloadException {
        this.o.a();
        this.f = this.n.a(this.e, this.l).a;
        this.g = this.n.a();
    }

    public void e() throws DownloadException, InterruptedException {
        Throwable th;
        this.o.a();
        OutputStream outputStream = null;
        hkh bl_hkh = new hkh();
        Closeable a;
        try {
            a(this.f);
            outputStream = i();
            SegmentCheckSum j = j();
            long j2 = j.mSegmentLength;
            long a2 = a((FileOutputStream) outputStream, j2);
            this.o.a();
            hle.b(this.e);
            hle.a(this.e, this.c.k);
            a = hkg.a(this.e, this.f, this.g, a2, this.o);
            try {
                a.b(2);
                if (a.g()) {
                    throw ((DownloadException) a.f());
                }
                hjr bl_hkf;
                a.b(3);
                long l = a.l();
                long j3 = a.j();
                a(outputStream, j, l, j3, a2, j2);
                this.o.a();
                hle.b(this.e);
                hle.a(this.e, this.c.k);
                hle.a(this.b, this.c);
                hle.a(this.d, this.c, 10010);
                a.b(4);
                if (a.k()) {
                    bl_hkf = new hkf(this);
                } else {
                    bl_hkf = new hke(this);
                }
                a(a, bl_hkf, outputStream, j3, l);
                a.b(5);
                a(bl_hkf);
                hle.a(this.e, this.b, this.c);
                hli.a(this.e, a, this.c, this.f, this.l);
                erz.a(outputStream);
                erz.a(a);
            } catch (Throwable th2) {
                th = th2;
                hle.b(this.e, this.b, this.c);
                hli.a(this.e, a, this.c, this.f, this.l);
                erz.a(outputStream);
                erz.a(a);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            Object obj = bl_hkh;
            hle.b(this.e, this.b, this.c);
            hli.a(this.e, a, this.c, this.f, this.l);
            erz.a(outputStream);
            erz.a(a);
            throw th;
        }
    }

    public boolean f() throws Exception {
        if (this.h.h()) {
            long p = this.h.p();
            if (p > 4096) {
                this.m = p;
                hlg.a(hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 115, (byte) 96, (byte) 119, (byte) 108, (byte) 99, (byte) 124, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 102, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 97, (byte) 63, (byte) 37, (byte) 32, (byte) 118}), this.c.s());
                return true;
            }
            hlg.c(hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 97, (byte) 96, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 108, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 37, (byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 63, (byte) 37, (byte) 32, (byte) 118}), this.c.s());
            hkz.a(this.h);
        }
        return false;
    }

    public long g() {
        return this.m;
    }

    public int h() {
        return this.l;
    }

    public void a(long j) {
        VideoDownloadEntry videoDownloadEntry = this.c;
        videoDownloadEntry.mDownloadedBytes += j;
    }

    public void b(long j) {
        hlg.a(hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 118, (byte) 117, (byte) 96, (byte) 96, (byte) 97, (byte) 37, (byte) 32, (byte) 118}), j + gmy.d);
        this.c.h = j;
        hle.a(this.d, this.c, 10016);
    }

    public void a() throws InterruptedException {
        this.o.a();
    }

    private hjy a(int i) throws DownloadAbortException {
        try {
            return this.b.a(this.e, i, true);
        } catch (Throwable e) {
            throw new DownloadAbortException(7, e);
        }
    }

    private void a(String str) throws DownloadAbortException {
        try {
            URL url = new URL(str);
            CharSequence protocol = url.getProtocol();
            CharSequence host = url.getHost();
            if (TextUtils.isEmpty(protocol) || TextUtils.isEmpty(host)) {
                throw new DownloadAbortException(2003, str);
            }
        } catch (MalformedURLException e) {
            throw new DownloadAbortException(2003, str);
        }
    }

    @NonNull
    private FileOutputStream i() throws DownloadUsualException {
        try {
            hle.a(this.i, true);
            return this.i.a(true);
        } catch (Throwable e) {
            this.i.d();
            throw new DownloadUsualException(9, hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 37, (byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96}), e);
        } catch (Throwable e2) {
            throw new DownloadUsualException(9, hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 37, (byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96}), e2);
        }
    }

    private SegmentCheckSum j() throws DownloadUsualException {
        SegmentCheckSum segmentCheckSum = null;
        if (this.j.h()) {
            try {
                segmentCheckSum = (SegmentCheckSum) hju.b(this.j, SegmentCheckSum.class);
            } catch (Throwable e) {
                this.j.d();
                throw new DownloadUsualException(21, e);
            } catch (Throwable e2) {
                this.j.d();
                throw new DownloadUsualException(21, e2);
            }
        }
        return segmentCheckSum == null ? new SegmentCheckSum() : segmentCheckSum;
    }

    private long a(FileOutputStream fileOutputStream, long j) throws DownloadAbortException {
        if (j <= 0) {
            return 0;
        }
        try {
            long size = fileOutputStream.getChannel().size();
            hlg.a(hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 119, (byte) 96, (byte) 102, (byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 37, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 103, (byte) 124, (byte) 113, (byte) 96, (byte) 118, (byte) 63, (byte) 37, (byte) 32, (byte) 118}), size + gmy.d);
            return size;
        } catch (Throwable e) {
            throw new DownloadAbortException(3, e);
        }
    }

    private void a(FileOutputStream fileOutputStream, SegmentCheckSum segmentCheckSum, long j, long j2, long j3, long j4) throws DownloadAbortException {
        segmentCheckSum.mSegmentLength = j2;
        hle.a(segmentCheckSum, this.j);
        if (j4 == 0 || j4 == j2) {
            if (j3 != j) {
                hlg.b(hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 37, (byte) 117, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 37, (byte) 32, (byte) 118, (byte) 41, (byte) 37, (byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 37, (byte) 117, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 37, (byte) 32, (byte) 118}), j + gmy.d, j3 + gmy.d);
                try {
                    FileChannel channel = fileOutputStream.getChannel();
                    channel.position(j);
                    channel.truncate(j);
                } catch (Throwable e) {
                    throw new DownloadAbortException(5, hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 103, (byte) 119, (byte) 96, (byte) 100, (byte) 110, (byte) 117, (byte) 106, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 108, (byte) 107, (byte) 37, (byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96}), e);
                }
            }
            this.m = j2;
            this.c.mDownloadedBytes = this.o.a(this.l) + j;
            this.o.a(this.l, j2);
            return;
        }
        hle.a(this.e, this.b);
        throw new DownloadAbortException(2005, String.format(Locale.US, hae.a(new byte[]{(byte) 108, (byte) 97, (byte) 37, (byte) 32, (byte) 118, (byte) 41, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 97, (byte) 81, (byte) 106, (byte) 113, (byte) 100, (byte) 105, (byte) 37, (byte) 32, (byte) 118, (byte) 41, (byte) 37, (byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 81, (byte) 106, (byte) 113, (byte) 100, (byte) 105, (byte) 37, (byte) 32, (byte) 118, (byte) 41, (byte) 37, (byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 81, (byte) 100, (byte) 98, (byte) 37, (byte) 32, (byte) 118, (byte) 41, (byte) 37, (byte) 116, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124, (byte) 37, (byte) 32, (byte) 97, (byte) 41, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 32, (byte) 118}), new Object[]{Integer.valueOf(this.l), String.valueOf(j4), String.valueOf(j2), this.c.mTypeTag, Integer.valueOf(this.c.mPreferredVideoQuality), this.f}));
    }

    private void a(hkh bl_hkh, hjr bl_hjr, FileOutputStream fileOutputStream, long j, long j2) throws DownloadException, InterruptedException {
        InterruptedException e;
        try {
            InputStream b = bl_hkh.b();
            long a = hld.a();
            bl_hjr.a(b, fileOutputStream, j, j2);
            bl_hkh.e(hld.a() - a);
        } catch (DownloadUsualException e2) {
            e = e2;
            throw e;
        } catch (DownloadAbortException e3) {
            e = e3;
            throw e;
        } catch (InterruptedException e4) {
            e = e4;
            throw e;
        } catch (Throwable e5) {
            throw new DownloadUsualException(2011, hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 76, (byte) 107, (byte) 117, (byte) 112, (byte) 113, (byte) 86, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104}), e5);
        } catch (Throwable e52) {
            this.o.a();
            throw new DownloadUsualException(2010, hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 76, (byte) 107, (byte) 117, (byte) 112, (byte) 113, (byte) 86, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104}), e52);
        } catch (Throwable e522) {
            throw new DownloadUsualException(-1, e522);
        }
    }

    private void a(hjr bl_hjr) throws DownloadUsualException, DownloadAbortException {
        if (bl_hjr.a()) {
            try {
                hkz.a(this.i, this.h);
                return;
            } catch (Throwable e) {
                throw new DownloadAbortException(4, hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 119, (byte) 96, (byte) 107, (byte) 100, (byte) 104, (byte) 96, (byte) 37, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96}), e);
            }
        }
        throw new DownloadUsualException(8, hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 118, (byte) 109, (byte) 96, (byte) 97}));
    }
}
