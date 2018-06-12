package bili2.bl;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import javax.annotation.Nullable;

/* compiled from: BL */
public abstract class iax extends iao {
    @Nullable
    private String[] c;
    protected final Context e;

    /* compiled from: BL */
    public static abstract class e implements Closeable {
        protected abstract b a() throws IOException;

        protected abstract d b() throws IOException;

        protected e() {
        }

        public void close() throws IOException {
        }
    }

    /* compiled from: BL */
    public static abstract class d implements Closeable {
        public abstract boolean a();

        public abstract c b() throws IOException;

        protected d() {
        }

        public void close() throws IOException {
        }
    }

    /* compiled from: BL */
    public static class a {
        public final String c;
        public final String d;

        public a(String str, String str2) {
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: BL */
    public static final class b {
        public final a[] a;

        public b(a[] aVarArr) {
            this.a = aVarArr;
        }

        static final b a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() != (byte) 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int readInt = dataInput.readInt();
            if (readInt < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            a[] aVarArr = new a[readInt];
            for (int i = 0; i < readInt; i++) {
                aVarArr[i] = new a(dataInput.readUTF(), dataInput.readUTF());
            }
            return new b(aVarArr);
        }

        public final void a(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.a.length);
            for (int i = 0; i < this.a.length; i++) {
                dataOutput.writeUTF(this.a[i].c);
                dataOutput.writeUTF(this.a[i].d);
            }
        }
    }

    /* compiled from: BL */
    public static final class c implements Closeable {
        public final a a;
        public final InputStream b;

        public c(a aVar, InputStream inputStream) {
            this.a = aVar;
            this.b = inputStream;
        }

        public void close() throws IOException {
            this.b.close();
        }
    }

    protected abstract e a() throws IOException;

    protected iax(Context context, String str) {
        super(a(context, str), 1);
        this.e = context;
    }

    public static File a(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    public void a(String[] strArr) {
        this.c = strArr;
    }

    private static void b(File file, byte b) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Throwable th2 = null;
        try {
            randomAccessFile.seek(0);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            if (randomAccessFile == null) {
                return;
            }
            if (null != null) {
                try {
                    randomAccessFile.close();
                    return;
                } catch (Throwable th3) {
                    ibn.a(null, th3);
                    return;
                }
            }
            randomAccessFile.close();
            return;
        } catch (Throwable th22) {
            Throwable th4 = th22;
            th22 = th3;
            th3 = th4;
        }
        if (randomAccessFile != null) {
            if (th22 != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th5) {
                    ibn.a(th22, th5);
                }
            } else {
                randomAccessFile.close();
            }
        }
        throw th3;
        throw th3;
    }

    private void a(a[] aVarArr) throws IOException {
        String[] list = this.a.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.a);
        }
        for (String str : list) {
            if (!(str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps") || str.equals("dso_manifest"))) {
                int i = 0;
                Object obj = null;
                while (obj == null && i < aVarArr.length) {
                    if (aVarArr[i].c.equals(str)) {
                        obj = 1;
                    }
                    i++;
                }
                if (obj == null) {
                    File file = new File(this.a, str);
                    Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                    iav.a(file);
                }
            }
        }
    }

    private void a(c cVar, byte[] bArr) throws IOException {
        Log.i("fb-UnpackingSoSource", "extracting DSO " + cVar.a.c);
        if (this.a.setWritable(true, true)) {
            RandomAccessFile randomAccessFile;
            File file = new File(this.a, cVar.a.c);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Throwable e) {
                Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e);
                iav.a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            try {
                int available = cVar.b.available();
                if (available > 1) {
                    iav.a(randomAccessFile.getFD(), (long) available);
                }
                iav.a(randomAccessFile, cVar.b, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (!file.setExecutable(true, false)) {
                    throw new IOException("cannot make file executable: " + file);
                }
            } finally {
                randomAccessFile.close();
            }
        } else {
            throw new IOException("cannot make directory writable for us: " + this.a);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte r12, bl.iax.b r13, bl.iax.d r14) throws IOException {
        /*
        r11 = this;
        r0 = "fb-UnpackingSoSource";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "regenerating DSO store ";
        r1 = r1.append(r2);
        r2 = r11.getClass();
        r2 = r2.getName();
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        r0 = new java.io.File;
        r1 = r11.a;
        r2 = "dso_manifest";
        r0.<init>(r1, r2);
        r5 = new java.io.RandomAccessFile;
        r1 = "rw";
        r5.<init>(r0, r1);
        r2 = 0;
        r0 = 0;
        r1 = 1;
        if (r12 != r1) goto L_0x003d;
    L_0x0039:
        r0 = bl.iax.b.a(r5);	 Catch:{ Exception -> 0x008d }
    L_0x003d:
        if (r0 != 0) goto L_0x0114;
    L_0x003f:
        r0 = new bl.iax$b;	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        r1 = 0;
        r1 = new bl.iax.a[r1];	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        r4 = r0;
    L_0x0048:
        r0 = r13.a;	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        r11.a(r0);	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        r0 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r6 = new byte[r0];	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
    L_0x0052:
        r0 = r14.a();	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        if (r0 == 0) goto L_0x00d6;
    L_0x0058:
        r7 = r14.b();	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        r1 = 0;
        r3 = 1;
        r0 = 0;
        r10 = r0;
        r0 = r3;
        r3 = r10;
    L_0x0062:
        if (r0 == 0) goto L_0x00a6;
    L_0x0064:
        r8 = r4.a;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r8 = r8.length;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        if (r3 >= r8) goto L_0x00a6;
    L_0x0069:
        r8 = r4.a;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r8 = r8[r3];	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r8 = r8.c;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r9 = r7.a;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r9 = r9.c;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r8 = r8.equals(r9);	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        if (r8 == 0) goto L_0x008a;
    L_0x0079:
        r8 = r4.a;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r8 = r8[r3];	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r8 = r8.d;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r9 = r7.a;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r9 = r9.d;	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        r8 = r8.equals(r9);	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
        if (r8 == 0) goto L_0x008a;
    L_0x0089:
        r0 = 0;
    L_0x008a:
        r3 = r3 + 1;
        goto L_0x0062;
    L_0x008d:
        r1 = move-exception;
        r3 = "fb-UnpackingSoSource";
        r4 = "error reading existing DSO manifest";
        android.util.Log.i(r3, r4, r1);	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        goto L_0x003d;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009a }
    L_0x009a:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x009e:
        if (r5 == 0) goto L_0x00a5;
    L_0x00a0:
        if (r1 == 0) goto L_0x010e;
    L_0x00a2:
        r5.close();	 Catch:{ Throwable -> 0x0109 }
    L_0x00a5:
        throw r0;
    L_0x00a6:
        if (r0 == 0) goto L_0x00ab;
    L_0x00a8:
        r11.a(r7, r6);	 Catch:{ Throwable -> 0x00bf, all -> 0x0112 }
    L_0x00ab:
        if (r7 == 0) goto L_0x0052;
    L_0x00ad:
        if (r1 == 0) goto L_0x00bb;
    L_0x00af:
        r7.close();	 Catch:{ Throwable -> 0x00b3, all -> 0x00b8 }
        goto L_0x0052;
    L_0x00b3:
        r0 = move-exception;
        bl.ibn.a(r1, r0);	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        goto L_0x0052;
    L_0x00b8:
        r0 = move-exception;
        r1 = r2;
        goto L_0x009e;
    L_0x00bb:
        r7.close();	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        goto L_0x0052;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c1 }
    L_0x00c1:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x00c5:
        if (r7 == 0) goto L_0x00cc;
    L_0x00c7:
        if (r1 == 0) goto L_0x00d2;
    L_0x00c9:
        r7.close();	 Catch:{ Throwable -> 0x00cd, all -> 0x00b8 }
    L_0x00cc:
        throw r0;	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
    L_0x00cd:
        r3 = move-exception;
        bl.ibn.a(r1, r3);	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        goto L_0x00cc;
    L_0x00d2:
        r7.close();	 Catch:{ Throwable -> 0x0098, all -> 0x00b8 }
        goto L_0x00cc;
    L_0x00d6:
        if (r5 == 0) goto L_0x00dd;
    L_0x00d8:
        if (r2 == 0) goto L_0x0105;
    L_0x00da:
        r5.close();	 Catch:{ Throwable -> 0x0100 }
    L_0x00dd:
        r0 = "fb-UnpackingSoSource";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Finished regenerating DSO store ";
        r1 = r1.append(r2);
        r2 = r11.getClass();
        r2 = r2.getName();
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        return;
    L_0x0100:
        r0 = move-exception;
        bl.ibn.a(r2, r0);
        goto L_0x00dd;
    L_0x0105:
        r5.close();
        goto L_0x00dd;
    L_0x0109:
        r2 = move-exception;
        bl.ibn.a(r1, r2);
        goto L_0x00a5;
    L_0x010e:
        r5.close();
        goto L_0x00a5;
    L_0x0112:
        r0 = move-exception;
        goto L_0x00c5;
    L_0x0114:
        r4 = r0;
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.iax.a(byte, bl.iax$b, bl.iax$d):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(bl.iar r12, int r13, byte[] r14) throws IOException {
        /*
        r11 = this;
        r5 = new java.io.File;
        r0 = r11.a;
        r1 = "dso_state";
        r5.<init>(r0, r1);
        r2 = new java.io.RandomAccessFile;
        r0 = "rw";
        r2.<init>(r5, r0);
        r1 = 0;
        r0 = r2.readByte();	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r3 = 1;
        if (r0 == r3) goto L_0x003e;
    L_0x001a:
        r0 = "fb-UnpackingSoSource";
        r3 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r3.<init>();	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r4 = "dso store ";
        r3 = r3.append(r4);	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r4 = r11.a;	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r3 = r3.append(r4);	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r4 = " regeneration interrupted: wiping clean";
        r3 = r3.append(r4);	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r3 = r3.toString();	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        android.util.Log.v(r0, r3);	 Catch:{ EOFException -> 0x00ba, Throwable -> 0x00c6, all -> 0x0175 }
        r0 = 0;
    L_0x003e:
        if (r2 == 0) goto L_0x0045;
    L_0x0040:
        if (r1 == 0) goto L_0x00c2;
    L_0x0042:
        r2.close();	 Catch:{ Throwable -> 0x00bd }
    L_0x0045:
        r2 = new java.io.File;
        r1 = r11.a;
        r3 = "dso_deps";
        r2.<init>(r1, r3);
        r4 = 0;
        r7 = new java.io.RandomAccessFile;
        r1 = "rw";
        r7.<init>(r2, r1);
        r6 = 0;
        r8 = r7.length();	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r1 = (int) r8;	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r1 = new byte[r1];	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r3 = r7.read(r1);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r8 = r1.length;	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        if (r3 == r8) goto L_0x0071;
    L_0x0067:
        r0 = "fb-UnpackingSoSource";
        r3 = "short read of so store deps file: marking unclean";
        android.util.Log.v(r0, r3);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r0 = 0;
    L_0x0071:
        r1 = java.util.Arrays.equals(r1, r14);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        if (r1 != 0) goto L_0x0081;
    L_0x0077:
        r0 = "fb-UnpackingSoSource";
        r1 = "deps mismatch on deps store: regenerating";
        android.util.Log.v(r0, r1);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r0 = 0;
    L_0x0081:
        if (r0 != 0) goto L_0x00af;
    L_0x0083:
        r1 = "fb-UnpackingSoSource";
        r3 = "so store dirty: regenerating";
        android.util.Log.v(r1, r3);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r1 = 0;
        b(r5, r1);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r8 = r11.a();	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        r3 = 0;
        r4 = r8.a();	 Catch:{ Throwable -> 0x00e2, all -> 0x0102 }
        r9 = r8.b();	 Catch:{ Throwable -> 0x00e2, all -> 0x0102 }
        r1 = 0;
        r11.a(r0, r4, r9);	 Catch:{ Throwable -> 0x0105 }
        if (r9 == 0) goto L_0x00a8;
    L_0x00a3:
        if (r1 == 0) goto L_0x00fe;
    L_0x00a5:
        r9.close();	 Catch:{ Throwable -> 0x00dd, all -> 0x0102 }
    L_0x00a8:
        if (r8 == 0) goto L_0x00af;
    L_0x00aa:
        if (r3 == 0) goto L_0x0121;
    L_0x00ac:
        r8.close();	 Catch:{ Throwable -> 0x0119, all -> 0x011e }
    L_0x00af:
        if (r7 == 0) goto L_0x00b6;
    L_0x00b1:
        if (r6 == 0) goto L_0x0133;
    L_0x00b3:
        r7.close();	 Catch:{ Throwable -> 0x012e }
    L_0x00b6:
        if (r4 != 0) goto L_0x0140;
    L_0x00b8:
        r0 = 0;
    L_0x00b9:
        return r0;
    L_0x00ba:
        r0 = move-exception;
        r0 = 0;
        goto L_0x003e;
    L_0x00bd:
        r2 = move-exception;
        bl.ibn.a(r1, r2);
        goto L_0x0045;
    L_0x00c2:
        r2.close();
        goto L_0x0045;
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c8 }
    L_0x00c8:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x00cc:
        if (r2 == 0) goto L_0x00d3;
    L_0x00ce:
        if (r1 == 0) goto L_0x00d9;
    L_0x00d0:
        r2.close();	 Catch:{ Throwable -> 0x00d4 }
    L_0x00d3:
        throw r0;
    L_0x00d4:
        r2 = move-exception;
        bl.ibn.a(r1, r2);
        goto L_0x00d3;
    L_0x00d9:
        r2.close();
        goto L_0x00d3;
    L_0x00dd:
        r0 = move-exception;
        bl.ibn.a(r1, r0);	 Catch:{ Throwable -> 0x00e2, all -> 0x0102 }
        goto L_0x00a8;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x00e8:
        if (r8 == 0) goto L_0x00ef;
    L_0x00ea:
        if (r1 == 0) goto L_0x012a;
    L_0x00ec:
        r8.close();	 Catch:{ Throwable -> 0x0125, all -> 0x011e }
    L_0x00ef:
        throw r0;	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00f2 }
    L_0x00f2:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x00f6:
        if (r7 == 0) goto L_0x00fd;
    L_0x00f8:
        if (r1 == 0) goto L_0x013c;
    L_0x00fa:
        r7.close();	 Catch:{ Throwable -> 0x0137 }
    L_0x00fd:
        throw r0;
    L_0x00fe:
        r9.close();	 Catch:{ Throwable -> 0x00e2, all -> 0x0102 }
        goto L_0x00a8;
    L_0x0102:
        r0 = move-exception;
        r1 = r3;
        goto L_0x00e8;
    L_0x0105:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        if (r9 == 0) goto L_0x010f;
    L_0x010a:
        if (r1 == 0) goto L_0x0115;
    L_0x010c:
        r9.close();	 Catch:{ Throwable -> 0x0110, all -> 0x0102 }
    L_0x010f:
        throw r0;	 Catch:{ Throwable -> 0x00e2, all -> 0x0102 }
    L_0x0110:
        r2 = move-exception;
        bl.ibn.a(r1, r2);	 Catch:{ Throwable -> 0x00e2, all -> 0x0102 }
        goto L_0x010f;
    L_0x0115:
        r9.close();	 Catch:{ Throwable -> 0x00e2, all -> 0x0102 }
        goto L_0x010f;
    L_0x0119:
        r0 = move-exception;
        bl.ibn.a(r3, r0);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        goto L_0x00af;
    L_0x011e:
        r0 = move-exception;
        r1 = r6;
        goto L_0x00f6;
    L_0x0121:
        r8.close();	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        goto L_0x00af;
    L_0x0125:
        r2 = move-exception;
        bl.ibn.a(r1, r2);	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        goto L_0x00ef;
    L_0x012a:
        r8.close();	 Catch:{ Throwable -> 0x00f0, all -> 0x011e }
        goto L_0x00ef;
    L_0x012e:
        r0 = move-exception;
        bl.ibn.a(r6, r0);
        goto L_0x00b6;
    L_0x0133:
        r7.close();
        goto L_0x00b6;
    L_0x0137:
        r2 = move-exception;
        bl.ibn.a(r1, r2);
        goto L_0x00fd;
    L_0x013c:
        r7.close();
        goto L_0x00fd;
    L_0x0140:
        r0 = new bl.iax$1;
        r1 = r11;
        r3 = r14;
        r6 = r12;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r1 = r13 & 1;
        if (r1 == 0) goto L_0x0171;
    L_0x014c:
        r1 = new java.lang.Thread;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "SoSync:";
        r2 = r2.append(r3);
        r3 = r11.a;
        r3 = r3.getName();
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r0, r2);
        r1.start();
    L_0x016e:
        r0 = 1;
        goto L_0x00b9;
    L_0x0171:
        r0.run();
        goto L_0x016e;
    L_0x0175:
        r0 = move-exception;
        goto L_0x00cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.iax.a(bl.iar, int, byte[]):boolean");
    }

    protected byte[] b() throws IOException {
        Throwable th;
        Parcel obtain = Parcel.obtain();
        e a = a();
        Throwable th2 = null;
        try {
            a[] aVarArr = a.a().a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].c);
                obtain.writeString(aVarArr[i].d);
            }
            if (a != null) {
                if (null != null) {
                    try {
                        a.close();
                    } catch (Throwable th3) {
                        ibn.a(null, th3);
                    }
                } else {
                    a.close();
                }
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th22) {
            Throwable th4 = th22;
            th22 = th3;
            th3 = th4;
        }
        throw th3;
        if (a != null) {
            if (th22 != null) {
                try {
                    a.close();
                } catch (Throwable th5) {
                    ibn.a(th22, th5);
                }
            } else {
                a.close();
            }
        }
        throw th3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(int r6) throws IOException {
        /*
        r5 = this;
        r0 = r5.a;
        bl.iav.b(r0);
        r0 = new java.io.File;
        r1 = r5.a;
        r2 = "dso_lock";
        r0.<init>(r1, r2);
        r1 = bl.iar.a(r0);
        r0 = "fb-UnpackingSoSource";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009e }
        r2.<init>();	 Catch:{ all -> 0x009e }
        r3 = "locked dso store ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x009e }
        r3 = r5.a;	 Catch:{ all -> 0x009e }
        r2 = r2.append(r3);	 Catch:{ all -> 0x009e }
        r2 = r2.toString();	 Catch:{ all -> 0x009e }
        android.util.Log.v(r0, r2);	 Catch:{ all -> 0x009e }
        r0 = r5.b();	 Catch:{ all -> 0x009e }
        r0 = r5.a(r1, r6, r0);	 Catch:{ all -> 0x009e }
        if (r0 == 0) goto L_0x005c;
    L_0x0039:
        r0 = 0;
    L_0x003a:
        if (r0 == 0) goto L_0x007a;
    L_0x003c:
        r1 = "fb-UnpackingSoSource";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "releasing dso store lock for ";
        r2 = r2.append(r3);
        r3 = r5.a;
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.v(r1, r2);
        r0.close();
    L_0x005b:
        return;
    L_0x005c:
        r0 = "fb-UnpackingSoSource";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009e }
        r2.<init>();	 Catch:{ all -> 0x009e }
        r3 = "dso store is up-to-date: ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x009e }
        r3 = r5.a;	 Catch:{ all -> 0x009e }
        r2 = r2.append(r3);	 Catch:{ all -> 0x009e }
        r2 = r2.toString();	 Catch:{ all -> 0x009e }
        android.util.Log.i(r0, r2);	 Catch:{ all -> 0x009e }
        r0 = r1;
        goto L_0x003a;
    L_0x007a:
        r0 = "fb-UnpackingSoSource";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "not releasing dso store lock for ";
        r1 = r1.append(r2);
        r2 = r5.a;
        r1 = r1.append(r2);
        r2 = " (syncer thread started)";
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        goto L_0x005b;
    L_0x009e:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00c1;
    L_0x00a1:
        r2 = "fb-UnpackingSoSource";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "releasing dso store lock for ";
        r3 = r3.append(r4);
        r4 = r5.a;
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.v(r2, r3);
        r1.close();
    L_0x00c0:
        throw r0;
    L_0x00c1:
        r1 = "fb-UnpackingSoSource";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "not releasing dso store lock for ";
        r2 = r2.append(r3);
        r3 = r5.a;
        r2 = r2.append(r3);
        r3 = " (syncer thread started)";
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.v(r1, r2);
        goto L_0x00c0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.iax.a(int):void");
    }
}
