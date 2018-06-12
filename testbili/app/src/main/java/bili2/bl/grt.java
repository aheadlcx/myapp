package bili2.bl;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class grt extends grw {
    private a[] g;

    /* compiled from: BL */
    public static class a {
        private String a;
        private grw b;

        public a(grw bl_grw, String str) {
            this.b = bl_grw;
            this.a = str;
        }

        public grp a() {
            if (this.b == null) {
                return null;
            }
            grp a = this.b.a(this.a);
            if (a != null) {
                return a;
            }
            throw new IllegalStateException(hae.a(new byte[]{(byte) 86, (byte) 112, (byte) 103, (byte) 81, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 40, (byte) 37, (byte) 98, (byte) 96, (byte) 113, (byte) 68, (byte) 118, (byte) 118, (byte) 106, (byte) 102, (byte) 108, (byte) 100, (byte) 113, (byte) 96, (byte) 97, (byte) 70, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 45, (byte) 44, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 41, (byte) 118, (byte) 112, (byte) 103, (byte) 113, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 34, (byte) 118, (byte) 37, (byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 96, (byte) 125, (byte) 108, (byte) 118, (byte) 113, (byte) 118}));
        }

        public grw b() {
            return this.b;
        }
    }

    grt(String str, List<grp> list, gru bl_gru) {
        super(str, list, bl_gru);
    }

    public void a(a[] aVarArr) {
        this.g = aVarArr;
    }

    protected boolean a(SQLiteDatabase sQLiteDatabase) {
        if (gsi.a(this.a, sQLiteDatabase)) {
            this.f = true;
            return true;
        }
        super.a(sQLiteDatabase);
        List<String> arrayList = new ArrayList();
        if (this.g != null && this.g.length > 0) {
            for (a aVar : this.g) {
                if (!aVar.b().b(sQLiteDatabase)) {
                    return false;
                }
                arrayList.add(gsm.a(this, aVar));
            }
            for (String execSQL : arrayList) {
                sQLiteDatabase.execSQL(execSQL);
            }
        }
        return true;
    }
}
