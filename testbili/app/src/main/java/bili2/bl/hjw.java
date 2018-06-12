package bili2.bl;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@RequiresApi(api = 21)
/* compiled from: BL */
public class hjw extends hjy {
    private static final String b = hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 67, (byte) 108, (byte) 105, (byte) 96});
    private Context c;
    private Uri d;
    private String e = gmy.d;
    private gg f;

    public hjw(hjw bl_hjw, String str) {
        this.c = bl_hjw.c;
        this.d = bl_hjw.d;
        this.e = a(bl_hjw.e, str);
    }

    public hjw(Context context, Uri uri, String str) {
        this.c = context;
        this.d = uri;
        this.e = str;
    }

    public FileInputStream a() throws FileNotFoundException {
        final ParcelFileDescriptor openFileDescriptor = this.c.getContentResolver().openFileDescriptor(s().a(), "r");
        if (openFileDescriptor != null) {
            return new FileInputStream(this, openFileDescriptor.getFileDescriptor()) {
                final /* synthetic */ hjw b;

                public void close() throws IOException {
                    super.close();
                    openFileDescriptor.close();
                }
            };
        }
        throw new FileNotFoundException(hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 106, (byte) 103, (byte) 113, (byte) 100, (byte) 108, (byte) 107, (byte) 37, (byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 65, (byte) 96, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 106, (byte) 119, (byte) 37, (byte) 99, (byte) 106, (byte) 119, (byte) 37, (byte) 119, (byte) 96, (byte) 100, (byte) 97}));
    }

    public FileOutputStream a(boolean z) throws FileNotFoundException {
        final ParcelFileDescriptor openFileDescriptor = this.c.getContentResolver().openFileDescriptor(s().a(), z ? "wa" : "w");
        if (openFileDescriptor != null) {
            return new FileOutputStream(this, openFileDescriptor.getFileDescriptor()) {
                final /* synthetic */ hjw b;

                public void close() throws IOException {
                    super.close();
                    openFileDescriptor.close();
                }
            };
        }
        throw new FileNotFoundException(hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 106, (byte) 103, (byte) 113, (byte) 100, (byte) 108, (byte) 107, (byte) 37, (byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 65, (byte) 96, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 106, (byte) 119, (byte) 37, (byte) 99, (byte) 106, (byte) 119, (byte) 37, (byte) 114, (byte) 119, (byte) 108, (byte) 113, (byte) 96}));
    }

    public boolean b() {
        String[] split = this.e.split(File.separator);
        String treeDocumentId = DocumentsContract.getTreeDocumentId(this.d);
        String str = treeDocumentId;
        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(this.d, treeDocumentId);
        int i = 0;
        while (i < split.length) {
            str = str + (i == 0 ? split[i] : File.separator + split[i]);
            gg a = gg.a(this.c, DocumentsContract.buildDocumentUriUsingTree(this.d, str));
            if (!a.b() && (a(r2, hae.a(new byte[]{(byte) 115, (byte) 107, (byte) 97, (byte) 43, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 97, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 42, (byte) 97, (byte) 108, (byte) 119, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124}), split[i]) == null || !a.b())) {
                return false;
            }
            buildDocumentUriUsingTree = a.a();
            i++;
        }
        return true;
    }

    public boolean c() {
        return s().i();
    }

    public boolean d() {
        gg s = s();
        return !s.i() || s.h();
    }

    public String[] e() {
        if (!s().i()) {
            return null;
        }
        ArrayList u = u();
        if (u == null || u.size() == 0) {
            return null;
        }
        String[] strArr = new String[u.size()];
        for (int i = 0; i < u.size(); i++) {
            strArr[i] = hjy.a(this.c, ((Uri) u.get(i)).toString()).m();
        }
        return strArr;
    }

    public hjy[] f() {
        if (!s().i()) {
            return null;
        }
        ArrayList u = u();
        hjy[] bl_hjyArr = new hjy[u.size()];
        for (int i = 0; i < u.size(); i++) {
            bl_hjyArr[i] = hjy.a(this.c, ((Uri) u.get(i)).toString());
        }
        return bl_hjyArr;
    }

    public boolean g() {
        return a(DocumentsContract.buildDocumentUriUsingTree(this.d, DocumentsContract.getDocumentId(l().o())), null, m()) != null;
    }

    public boolean h() {
        return s().c();
    }

    public boolean i() {
        return s().b();
    }

    public boolean j() {
        return s().g();
    }

    public boolean k() {
        return s().f();
    }

    public boolean a(hjy bl_hjy) {
        if (bl_hjy instanceof hjw) {
            Object m = bl_hjy.m();
            if (!TextUtils.isEmpty(m)) {
                return b(m);
            }
        }
        return false;
    }

    public hjy l() {
        String[] split = this.e.split(File.separator);
        String str = gmy.d;
        if (split.length > 1) {
            str = this.e.substring(0, this.e.lastIndexOf(split[split.length - 1]) - 1);
        }
        return new hjw(this.c, this.d, str);
    }

    @Nullable
    public String m() {
        if (TextUtils.isEmpty(this.e)) {
            return gmy.d;
        }
        String[] split = this.e.split("/");
        return split[split.length - 1];
    }

    public String n() {
        return s().a().toString();
    }

    public Uri o() {
        return s().a();
    }

    public long p() {
        return s().e();
    }

    public long q() {
        return s().d();
    }

    public long r() {
        return hls.a(this.c, (hjy) this);
    }

    private gg s() {
        if (this.f == null) {
            this.f = gg.a(this.c, DocumentsContract.buildDocumentUriUsingTree(this.d, DocumentsContract.getTreeDocumentId(this.d) + this.e));
        }
        return this.f;
    }

    private Uri a(Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(this.c.getContentResolver(), uri, str, str2);
        } catch (Exception e) {
            Log.e(hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 67, (byte) 108, (byte) 105, (byte) 96}), hae.a(new byte[]{(byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 63}) + e);
            return null;
        }
    }

    private ArrayList<Uri> u() {
        Object e;
        Throwable th;
        ArrayList<Uri> arrayList = new ArrayList();
        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(this.d, DocumentsContract.getTreeDocumentId(this.d) + this.e);
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(buildDocumentUriUsingTree, DocumentsContract.getDocumentId(buildDocumentUriUsingTree));
        AutoCloseable query;
        try {
            query = this.c.getContentResolver().query(buildChildDocumentsUriUsingTree, new String[]{hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 108, (byte) 97})}, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(buildDocumentUriUsingTree, query.getString(0)));
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            }
            a(query);
        } catch (Exception e3) {
            e = e3;
            query = null;
            try {
                Log.w(hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 67, (byte) 108, (byte) 105, (byte) 96}), hae.a(new byte[]{(byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 116, (byte) 112, (byte) 96, (byte) 119, (byte) 124, (byte) 63, (byte) 37}) + e);
                a(query);
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a(query);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            a(query);
            throw th;
        }
        return arrayList;
    }

    private boolean b(String str) {
        try {
            if (DocumentsContract.renameDocument(this.c.getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(this.d, DocumentsContract.getTreeDocumentId(this.d) + this.e), str) != null) {
                String[] split = this.e.split("/");
                split[split.length - 1] = str;
                return true;
            }
        } catch (Exception e) {
            Log.e(hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 67, (byte) 108, (byte) 105, (byte) 96}), hae.a(new byte[]{(byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 119, (byte) 96, (byte) 107, (byte) 100, (byte) 104, (byte) 96, (byte) 37, (byte) 63}) + e);
        }
        return false;
    }

    private static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    private String a(String str, String str2) {
        if (str2.equals(gmy.d) || str2.equals("/")) {
            return str;
        }
        if (str2.charAt(0) == '/') {
            if (TextUtils.isEmpty(str) || str.endsWith("/")) {
                return a(str, str2.substring(1));
            }
            return str + str2;
        } else if (TextUtils.isEmpty(str)) {
            return str2;
        } else {
            if (str.endsWith("/")) {
                return str + str2;
            }
            return str + '/' + str2;
        }
    }
}
