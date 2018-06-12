package bili.bl;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import bl.eaw.a;
import bl.edh.d;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveNum;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveProp;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveSendGift;
import tv.danmaku.videoplayer.basic.adapter.PlayerScreenMode;

/* compiled from: BL */
public class eau {
    private FragmentActivity a;
    private FragmentManager b;
    private eaw c;
    private eav d;
    private d e;
    private PlayerScreenMode f;
    private String g;
    private String h;
    private int i;
    private int j = -1;
    private long k;
    private int l;
    private a m = new a(this) {
        final /* synthetic */ eau a;
        private boolean b = false;

        {
            this.a = r2;
        }

        public void a(String str) {
            if (this.a.e != null) {
                this.a.e.d(str);
            }
        }

        public void a(BiliLiveSendGift biliLiveSendGift) {
            if (this.a.e != null) {
                this.a.e.a(biliLiveSendGift);
            }
        }

        public void a(BiliLiveNum biliLiveNum) {
        }

        public void a(DialogInterface dialogInterface) {
            if (this.a.e != null) {
                this.a.e.H();
            }
        }

        public void b(DialogInterface dialogInterface) {
            if (this.a.e == null) {
                return;
            }
            if (this.b) {
                this.a.e.A();
            } else {
                this.a.e.I();
            }
        }

        public void a(BiliLiveProp biliLiveProp, long j, long j2, int i, String str, int i2) {
            if (this.a.e != null) {
                this.a.e.a(biliLiveProp, j, str, i2);
            }
        }

        public void a() {
            if (this.a.e != null) {
                String str = BuildConfig.VERSION_NAME;
                if (this.a.f == PlayerScreenMode.LANDSCAPE) {
                    str = "3";
                    this.a.e.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 85, (byte) 106, (byte) 119, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98}), new Object[0]);
                    this.a.e.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 106, (byte) 102, (byte) 110, (byte) 74, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new Object[0]);
                    b();
                } else {
                    this.a.e.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 106, (byte) 102, (byte) 110, (byte) 74, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new Object[0]);
                    b();
                    if (this.a.f == PlayerScreenMode.VERTICAL_THUMB) {
                        str = "1";
                    } else {
                        str = "2";
                    }
                }
                dqo.a(new dqs.a().a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 98, (byte) 112, (byte) 100, (byte) 119, (byte) 97, (byte) 103, (byte) 112, (byte) 124})).b("{" + str + "}").a());
            }
        }

        private void b() {
            if (this.a.a != null) {
                if (eva.a(this.a.a).a()) {
                    this.b = true;
                    int i = egd.i(this.a.a);
                    String a = hae.a(new byte[]{(byte) 71, (byte) 112, (byte) 124, (byte) 66, (byte) 112, (byte) 100, (byte) 119, (byte) 97, (byte) 81, (byte) 100, (byte) 98});
                    Fragment a2 = dzo.a(this.a.k, i);
                    a2.a(new dzo.a(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void a() {
                            this.a.b = false;
                            if (this.a.a.e != null) {
                                this.a.a.e.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 80, (byte) 107, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 74, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new Object[0]);
                            }
                        }

                        public void a(int i) {
                            if (this.a.a.e != null) {
                                this.a.a.e.c(i);
                            }
                        }
                    });
                    this.a.a.getSupportFragmentManager().beginTransaction().add(a2, a).commitAllowingStateLoss();
                    return;
                }
                drb.d(this.a.a, -1);
            }
        }
    };

    public eau(FragmentActivity fragmentActivity, int i, int i2, long j, int i3, String str, String str2, d dVar) {
        this.a = fragmentActivity;
        this.j = i;
        this.k = j;
        this.i = i2;
        this.g = str;
        this.h = str2;
        this.l = i3;
        this.e = dVar;
        this.b = fragmentActivity.getSupportFragmentManager();
    }

    public void a(PlayerScreenMode playerScreenMode) {
        this.f = playerScreenMode;
        if (playerScreenMode == PlayerScreenMode.LANDSCAPE) {
            if (this.d == null) {
                this.d = eav.a(this.a);
                this.d.a(this.a, this.j, this.i, this.k, this.l, this.g, this.h);
                this.d.a(this.m);
            } else {
                this.d.c();
            }
            this.d.a();
            return;
        }
        if (this.c == null) {
            this.c = eaw.a(this.a);
            this.c.a(this.f);
            this.c.a(this.a, this.j, this.i, this.k, this.l, this.g, this.h);
            this.c.a(this.m);
        }
        this.c.b();
    }

    public void a(int i, int i2, Intent intent) {
        if (this.d != null) {
            this.d.a(i, i2, intent);
        }
        if (this.c != null) {
            this.c.a(i, i2, intent);
        }
    }

    public void a() {
        if (this.d != null) {
            this.d.b(this.a);
        }
        if (this.c != null) {
            this.c.b(this.a);
        }
        this.e = null;
    }

    public void b(PlayerScreenMode playerScreenMode) {
        if (this.d != null) {
            this.d.b();
        }
        if (this.c != null) {
            this.c.a(playerScreenMode);
        }
    }
}
