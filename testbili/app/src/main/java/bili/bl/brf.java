package bili.bl;

import android.content.Context;
import android.os.AsyncTask;
import com.bilibili.bilibililive.followingcard.api.entity.FollowingInfo;

/* compiled from: BL */
public class brf {
    public static final String a = hae.a(new byte[]{(byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 70, (byte) 100, (byte) 119, (byte) 97, (byte) 76, (byte) 97});
    private static evn b = evn.a();
    private static long c;
    private static boolean d;
    private static long e;
    private static evn f = null;

    /* compiled from: BL */
    static class a extends AsyncTask<Void, Void, evn> {
        a() {
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((evn) obj);
        }

        protected evn a(Void... voidArr) {
            Context a = blg.a();
            if (!eva.a(a).a() || brf.d) {
                return brf.b;
            }
            if (brf.e != eva.a(a).i()) {
                brf.e = eva.a(a).i();
                brf.f = null;
                brf.c = 0;
            }
            if (System.currentTimeMillis() - brf.c < 300000) {
                return brf.f == null ? brf.b : brf.f;
            } else {
                FollowingInfo a2;
                int i;
                brf.d = true;
                try {
                    a2 = bmj.a(eva.a(a).i(), blh.a(a).a(hae.a(new byte[]{(byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 70, (byte) 100, (byte) 119, (byte) 97, (byte) 76, (byte) 97}) + String.valueOf(268435455), 0));
                } catch (Throwable e) {
                    ibn.a(e);
                    a2 = null;
                }
                if (a2 != null) {
                    i = a2.updateNum;
                } else {
                    i = 0;
                }
                brf.d = false;
                if (i < 0) {
                    i = 0;
                }
                brf.f = evn.a(i);
                brf.c = System.currentTimeMillis();
                return brf.f;
            }
        }

        protected void a(evn bl_evn) {
            evo.a().a(brf.i(), bl_evn);
        }
    }

    private static String i() {
        return hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 108, (byte) 107, (byte) 98, (byte) 42, (byte) 109, (byte) 106, (byte) 104, (byte) 96});
    }

    public static void a() {
        new a().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static void b() {
        f = null;
        evo.a().a(i(), b);
    }
}
