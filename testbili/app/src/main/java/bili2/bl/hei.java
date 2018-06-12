package bili2.bl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.bilibili.upper.draft.DraftBean;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class hei {
    private static volatile SQLiteDatabase a;
    private static final String b = hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113});
    private static final String c = hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113});
    private static volatile hei d;
    private Context e;

    /* compiled from: BL */
    static class a extends SQLiteOpenHelper {
        private static final String a = hae.a(new byte[]{(byte) 70, (byte) 87, (byte) 64, (byte) 68, (byte) 81, (byte) 64, (byte) 37, (byte) 81, (byte) 68, (byte) 71, (byte) 73, (byte) 64, (byte) 37, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 37, (byte) 45, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 37, (byte) 85, (byte) 87, (byte) 76, (byte) 72, (byte) 68, (byte) 87, (byte) 92, (byte) 37, (byte) 78, (byte) 64, (byte) 92, (byte) 37, (byte) 68, (byte) 80, (byte) 81, (byte) 74, (byte) 76, (byte) 75, (byte) 70, (byte) 87, (byte) 64, (byte) 72, (byte) 64, (byte) 75, (byte) 81, (byte) 41, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 97, (byte) 90, (byte) 100, (byte) 113, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 96, (byte) 107, (byte) 97, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 104, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 111, (byte) 118, (byte) 106, (byte) 107, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 115, (byte) 100, (byte) 105, (byte) 112, (byte) 96, (byte) 52, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 115, (byte) 100, (byte) 105, (byte) 112, (byte) 96, (byte) 55, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 52, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 55, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 80, (byte) 75, (byte) 76, (byte) 84, (byte) 80, (byte) 64, (byte) 45, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97, (byte) 44, (byte) 44, (byte) 62});

        a(Context context, String str, CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(hae.a(new byte[]{(byte) 70, (byte) 87, (byte) 64, (byte) 68, (byte) 81, (byte) 64, (byte) 37, (byte) 81, (byte) 68, (byte) 71, (byte) 73, (byte) 64, (byte) 37, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 37, (byte) 45, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 37, (byte) 85, (byte) 87, (byte) 76, (byte) 72, (byte) 68, (byte) 87, (byte) 92, (byte) 37, (byte) 78, (byte) 64, (byte) 92, (byte) 37, (byte) 68, (byte) 80, (byte) 81, (byte) 74, (byte) 76, (byte) 75, (byte) 70, (byte) 87, (byte) 64, (byte) 72, (byte) 64, (byte) 75, (byte) 81, (byte) 41, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 97, (byte) 90, (byte) 100, (byte) 113, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 96, (byte) 107, (byte) 97, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 104, (byte) 108, (byte) 97, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 111, (byte) 118, (byte) 106, (byte) 107, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 115, (byte) 100, (byte) 105, (byte) 112, (byte) 96, (byte) 52, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 115, (byte) 100, (byte) 105, (byte) 112, (byte) 96, (byte) 55, (byte) 37, (byte) 76, (byte) 75, (byte) 81, (byte) 64, (byte) 66, (byte) 64, (byte) 87, (byte) 41, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 52, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 55, (byte) 37, (byte) 81, (byte) 64, (byte) 93, (byte) 81, (byte) 41, (byte) 80, (byte) 75, (byte) 76, (byte) 84, (byte) 80, (byte) 64, (byte) 45, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97, (byte) 44, (byte) 44, (byte) 62}));
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private hei(Context context) {
        this.e = context;
        a aVar = new a(context, hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113}), null, 1);
        if (a == null) {
            a = aVar.getReadableDatabase();
        }
    }

    public static synchronized hei a(Context context) {
        hei bl_hei;
        synchronized (hei.class) {
            if (d == null) {
                d = new hei(context);
            }
            bl_hei = d;
        }
        return bl_hei;
    }

    public long a(DraftBean draftBean) {
        if (a == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97}), Integer.valueOf(draftBean.draftId));
        contentValues.put(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 97}), Integer.valueOf(draftBean.uploadId));
        contentValues.put("mid", Long.valueOf(draftBean.mid));
        contentValues.put(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109}), draftBean.filePath);
        contentValues.put("json", draftBean.json);
        contentValues.put(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 96}), draftBean.resultFile);
        contentValues.put("time", Long.valueOf(draftBean.time));
        return a.replace(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113}), null, contentValues);
    }

    public DraftBean a(int i) {
        if (a == null) {
            return null;
        }
        String a = hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113});
        Cursor query = a.query(a, null, hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97, (byte) 37, (byte) 56, (byte) 37, (byte) 58}), new String[]{String.valueOf(i)}, null, null, null, "1");
        if (query == null || !query.moveToFirst()) {
            query.close();
            return null;
        }
        DraftBean draftBean = new DraftBean();
        query.move(0);
        draftBean.draftId = query.getInt(query.getColumnIndex(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97})));
        draftBean.uploadId = query.getInt(query.getColumnIndex(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 97})));
        draftBean.mid = (long) query.getInt(query.getColumnIndex("mid"));
        draftBean.filePath = query.getString(query.getColumnIndex(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109})));
        draftBean.time = query.getLong(query.getColumnIndex("time"));
        draftBean.json = query.getString(query.getColumnIndex("json"));
        draftBean.resultFile = query.getString(query.getColumnIndex(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 96})));
        query.close();
        return draftBean;
    }

    public DraftBean b(int i) {
        if (a == null) {
            return null;
        }
        String a = hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113});
        Cursor query = a.query(a, null, hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 97, (byte) 37, (byte) 56, (byte) 37, (byte) 58}), new String[]{String.valueOf(i)}, null, null, null, "1");
        if (query == null || !query.moveToFirst()) {
            query.close();
            return null;
        }
        DraftBean draftBean = new DraftBean();
        query.move(0);
        draftBean.draftId = query.getInt(query.getColumnIndex(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97})));
        draftBean.uploadId = query.getInt(query.getColumnIndex(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 97})));
        draftBean.mid = (long) query.getInt(query.getColumnIndex("mid"));
        draftBean.filePath = query.getString(query.getColumnIndex(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109})));
        draftBean.time = query.getLong(query.getColumnIndex("time"));
        draftBean.json = query.getString(query.getColumnIndex("json"));
        draftBean.resultFile = query.getString(query.getColumnIndex(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 96})));
        query.close();
        return draftBean;
    }

    public List<DraftBean> a() {
        List<DraftBean> list = null;
        if (a != null) {
            long i = eva.a(this.e).i();
            Cursor query = a.query(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113}), null, hae.a(new byte[]{(byte) 104, (byte) 108, (byte) 97, (byte) 37, (byte) 56, (byte) 37, (byte) 58}), new String[]{String.valueOf(i)}, null, null, hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 37, (byte) 65, (byte) 64, (byte) 86, (byte) 70}));
            if (query == null || !query.moveToFirst()) {
                query.close();
            } else {
                list = new ArrayList();
                do {
                    DraftBean draftBean = new DraftBean();
                    draftBean.draftId = query.getInt(query.getColumnIndex(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97})));
                    draftBean.uploadId = query.getInt(query.getColumnIndex(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 97})));
                    draftBean.mid = (long) query.getInt(query.getColumnIndex("mid"));
                    draftBean.filePath = query.getString(query.getColumnIndex(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109})));
                    draftBean.time = query.getLong(query.getColumnIndex("time"));
                    draftBean.json = query.getString(query.getColumnIndex("json"));
                    draftBean.resultFile = query.getString(query.getColumnIndex(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 96})));
                    list.add(draftBean);
                } while (query.moveToNext());
                query.close();
            }
        }
        return list;
    }

    public void c(int i) {
        if (a != null) {
            DraftBean a = a(i);
            if (a != null) {
                hgl.a(this.e).b(a.uploadId);
                a.delete(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113}), hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97, (byte) 56, (byte) 58}), new String[]{i + gmy.d});
            }
        }
    }

    public void d(int i) {
        if (a != null) {
            a.delete(hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113}), hae.a(new byte[]{(byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113, (byte) 90, (byte) 108, (byte) 97, (byte) 56, (byte) 58}), new String[]{i + gmy.d});
        }
    }

    public boolean b() {
        if (!eva.a(this.e).a()) {
            return false;
        }
        List a = a();
        if (a == null || a.size() <= 0) {
            return false;
        }
        return true;
    }
}
