package bili2.bl;

import android.support.v7.widget.RecyclerView.u;
import android.view.ViewGroup;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.model.BasicIndexItem.GOTO;

/* compiled from: BL */
public class gwl implements gwp {

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[GOTO.values().length];

        static {
            try {
                a[GOTO.AV.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[GOTO.PLAYER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[GOTO.LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[GOTO.BANGUMI.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[GOTO.BANGUMI_FOLLOW.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[GOTO.TOPIC.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[GOTO.ACTIVITY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                a[GOTO.RANK.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[GOTO.TAG.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                a[GOTO.AD_AV.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                a[GOTO.AD_WEB.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                a[GOTO.AD_WEB_S.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                a[GOTO.AD_LARGE.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                a[GOTO.LOGIN.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                a[GOTO.BANNER.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                a[GOTO.GAME_DOWNLOAD.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                a[GOTO.CONVERGE.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                a[GOTO.SPECIAL.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                a[GOTO.SPECIAL_S.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                a[GOTO.GAME_DOWNLOAD_S.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                a[GOTO.VIP_PURCHASE.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            try {
                a[GOTO.COLUMN_L.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
            }
            try {
                a[GOTO.COLUMN_S.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
            }
            try {
                a[GOTO.ENTRANCE.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
            }
            try {
                a[GOTO.RECOMMEND_TAG_HEADER.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
            }
            try {
                a[GOTO.RECOMMEND_CONTENT_HEADER.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
            }
            try {
                a[GOTO.HEADER_BACKGROUND.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
            }
            try {
                a[GOTO.MUSIC.ordinal()] = 28;
            } catch (NoSuchFieldError e28) {
            }
            try {
                a[GOTO.TEXT.ordinal()] = 29;
            } catch (NoSuchFieldError e29) {
            }
            try {
                a[GOTO.SUBSCRIBE.ordinal()] = 30;
            } catch (NoSuchFieldError e30) {
            }
            try {
                a[GOTO.UP_RCMD_AV.ordinal()] = 31;
            } catch (NoSuchFieldError e31) {
            }
        }
    }

    public gvi a(String str, int i) {
        GOTO gOTOEnum = BasicIndexItem.getGOTOEnum(str);
        if (gOTOEnum == null) {
            return null;
        }
        switch (AnonymousClass1.a[gOTOEnum.ordinal()]) {
            case 1:
                return new gwd(i);
            case 2:
                return new gvj(i);
            case 3:
                return new guz(i);
            case 4:
                return new gud(i);
            case 5:
                return new gug();
            case 6:
                return new gwa(i);
            case 7:
                return new gub(i);
            case 8:
                return new gvl();
            case 9:
                return new gvr();
            case 10:
            case 11:
            case 12:
            case 13:
                return new gua();
            case 14:
                return new gvd();
            case 15:
                return new guh(i);
            case 16:
                return new gut(i);
            case 17:
                return new gun(i);
            case 18:
                return new gvt(i);
            case 19:
                return new gvv(i);
            case 20:
                return new guv(i);
            case 21:
                return new gwg(i);
            case 22:
                return new gui(i);
            case 23:
                return new guk(i);
            case 24:
                return new guo();
            case 25:
                return new gvp();
            case 26:
                return new gvn();
            case 27:
                return new guy();
            case 28:
                return new gve(i);
            case 29:
                return new gvz(i);
            case 30:
                return new gvy(i);
            case 31:
                return new gwc(i);
            default:
                return null;
        }
    }

    public u a(ViewGroup viewGroup, int i, int i2) {
        switch (i) {
            case 0:
                return gwd.a(viewGroup, i2);
            case 1:
                return gvj.a.a(viewGroup, i2);
            case 2:
                return gud.a(viewGroup, i2);
            case 3:
                return guz.a(viewGroup, i2);
            case 4:
                return gwa.a(viewGroup, i2);
            case 5:
            case 10:
            case 14:
            case 26:
                return gua.a(viewGroup, i);
            case 6:
                return gub.a(viewGroup, i2);
            case 7:
                return gvl.a(viewGroup, i2);
            case 8:
                return gun.a(viewGroup, i2);
            case 9:
                return gvr.a(viewGroup, i2);
            case 11:
                return gug.a(viewGroup);
            case 12:
                return guh.a(viewGroup, i2);
            case 13:
                return gut.a(viewGroup, i2);
            case 15:
                return gvt.a(viewGroup, i2);
            case 16:
                return gvv.a(viewGroup, i2);
            case 17:
                return guv.a(viewGroup, i2);
            case 18:
                return gwg.a(viewGroup, i2);
            case 19:
                return gui.a(viewGroup, i2);
            case 20:
                return guk.a(viewGroup, i2);
            case 21:
                return guo.a(viewGroup);
            case 22:
                return gvp.a(viewGroup);
            case 23:
                return gvn.a(viewGroup);
            case 24:
                return guy.a(viewGroup);
            case 25:
                return gve.a(viewGroup, i2);
            case 27:
                return gvz.a.a(viewGroup, i2);
            case 28:
                return gvy.a.a(viewGroup, i2);
            case 29:
                return gwc.a.a(viewGroup, i2);
            case 100:
                return gvk.a(viewGroup);
            case 101:
                return gvd.a(viewGroup);
            case 102:
                return gur.a(viewGroup);
            default:
                return null;
        }
    }

    public static boolean a(int i) {
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 15:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            case 100:
            case 102:
                return true;
            default:
                return false;
        }
    }
}
