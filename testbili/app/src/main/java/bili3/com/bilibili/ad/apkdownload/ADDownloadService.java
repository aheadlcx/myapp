package bili3.com.bilibili.ad.apkdownload;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.URLUtil;
import bl.alb;
import bl.alc;
import bl.ale;
import bl.alf;
import bl.alg;
import bl.alk;
import bl.all;
import bl.alm;
import bl.aln;
import bl.alo;
import bl.alr;
import bl.als;
import bl.alu;
import bl.alw;
import bl.esu;
import bl.hae;
import bl.ibn;
import com.bilibili.ad.apkdownload.bean.ADDownloadInfo;
import com.bilibili.bililive.privateletter.comment.api.BiliCommentList;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveHomePage;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzoneShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: BL */
public class ADDownloadService extends Service implements alf {
    public static final String a = hae.a(new byte[]{(byte) 68, (byte) 65, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 86, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96});
    public static final String b = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74});
    public static final String c = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 85, (byte) 78, (byte) 66});
    public static final String d = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 80, (byte) 87, (byte) 73});
    public static final String e = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 70, (byte) 68, (byte) 70, (byte) 77, (byte) 64, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74});
    private int f;
    private alr g;
    private alb h;
    private alc i;
    private alk j;
    private all k;
    private alm l;
    private alo m;
    private aln n;
    private alw o;
    private Messenger p;
    private List<Messenger> q;
    private Handler r;

    /* compiled from: BL */
    static class a extends Handler {
        private WeakReference<ADDownloadService> a;

        a(ADDownloadService aDDownloadService) {
            this.a = new WeakReference(aDDownloadService);
        }

        public void handleMessage(Message message) {
            int i = 1;
            final ADDownloadService aDDownloadService = (ADDownloadService) this.a.get();
            if (aDDownloadService != null) {
                String string;
                Object string2;
                ADDownloadInfo aDDownloadInfo;
                if (message.replyTo != null) {
                    aDDownloadService.q.add(message.replyTo);
                }
                int i2 = message.what;
                int i3 = message.arg1;
                Bundle data = message.getData();
                if (i2 == 1) {
                    string = data.getString(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 85, (byte) 78, (byte) 66}));
                    string2 = data.getString(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 80, (byte) 87, (byte) 73}));
                    aDDownloadInfo = null;
                } else {
                    data.setClassLoader(ADDownloadInfo.class.getClassLoader());
                    aDDownloadInfo = (ADDownloadInfo) data.getParcelable(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74}));
                    string2 = null;
                    string = null;
                }
                final alb c = aDDownloadService.h;
                if (c != null) {
                    switch (i2) {
                        case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                            alc d = aDDownloadService.i;
                            if (!TextUtils.isEmpty(string2) && d != null) {
                                d.a(c, string, string2, i3, 0, new alg(this) {
                                    final /* synthetic */ a b;

                                    public void a(ADDownloadInfo aDDownloadInfo) {
                                        aDDownloadService.a(-1, aDDownloadInfo);
                                    }
                                });
                                return;
                            }
                            return;
                        case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                            if (aDDownloadInfo == null) {
                                return;
                            }
                            if (!alu.a(aDDownloadInfo.totalLength, c.a(0))) {
                                esu.b(aDDownloadService, aDDownloadService.getString(2131689852));
                                return;
                            } else if (alu.a(aDDownloadInfo)) {
                                esu.b(aDDownloadService, aDDownloadService.getString(2131689853));
                                return;
                            } else if (URLUtil.isNetworkUrl(aDDownloadInfo.url)) {
                                int i4;
                                if (aDDownloadInfo.status == 1) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if (aDDownloadInfo.status != 10) {
                                    i = 0;
                                }
                                if ((i4 | i) != 0) {
                                    als.d(aDDownloadInfo);
                                }
                                c.a(aDDownloadInfo);
                                return;
                            } else {
                                aDDownloadInfo.errorCode = 302;
                                return;
                            }
                        case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                            if (aDDownloadInfo != null) {
                                c.c(aDDownloadInfo);
                                return;
                            }
                            return;
                        case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                            alr e = aDDownloadService.g;
                            if (e != null && aDDownloadInfo != null) {
                                e.a(aDDownloadService, aDDownloadInfo);
                                return;
                            }
                            return;
                        case QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE /*5*/:
                            if (aDDownloadInfo != null) {
                                c.b(aDDownloadInfo);
                                return;
                            }
                            return;
                        case QzoneShare.SHARE_TO_QZONE_TYPE_APP /*6*/:
                            if (aDDownloadService.i != null) {
                                aDDownloadService.i.a(new ale(this) {
                                    final /* synthetic */ a c;

                                    public void a(ArrayList<ADDownloadInfo> arrayList) {
                                        Iterator it = c.c().iterator();
                                        while (it.hasNext()) {
                                            ADDownloadInfo aDDownloadInfo = (ADDownloadInfo) it.next();
                                            if (!arrayList.contains(aDDownloadInfo)) {
                                                arrayList.add(aDDownloadInfo);
                                            }
                                        }
                                        aDDownloadService.a(-6, (ArrayList) arrayList);
                                    }
                                });
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.i = new alc(this);
        this.h = new alb(this, this.i);
        this.g = new alr();
        this.q = new ArrayList();
        this.r = new a(this);
        this.p = new Messenger(this.r);
        this.j = new alk(this.g, this.h, this);
        this.k = new all(this.g);
        this.m = new alo(this.h);
        this.l = new alm(this.h);
        this.n = new aln(this.g);
        this.o = alw.a();
        registerReceiver(this.j, alk.a());
        registerReceiver(this.k, all.a());
        registerReceiver(this.l, alm.a());
        registerReceiver(this.m, alo.a());
        registerReceiver(this.n, aln.a());
        alw.a().b(this);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return this.p.getBinder();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f = i2;
        if (intent != null) {
            final ADDownloadInfo aDDownloadInfo = (ADDownloadInfo) intent.getParcelableExtra(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74}));
            if (aDDownloadInfo != null) {
                this.i.a(this.h, aDDownloadInfo.pkgName, aDDownloadInfo.url, aDDownloadInfo.type, aDDownloadInfo.totalLength, new alg(this) {
                    final /* synthetic */ ADDownloadService b;

                    public void a(ADDownloadInfo aDDownloadInfo) {
                        alu.a(aDDownloadInfo, aDDownloadInfo);
                        int i = 2;
                        if (aDDownloadInfo.status == 7) {
                            i = 4;
                        }
                        Message obtainMessage = this.b.r.obtainMessage(i);
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74}), aDDownloadInfo);
                        obtainMessage.setData(bundle);
                        obtainMessage.sendToTarget();
                    }
                });
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.j);
        unregisterReceiver(this.k);
        unregisterReceiver(this.l);
        unregisterReceiver(this.m);
        unregisterReceiver(this.n);
        this.h.f();
        this.h = null;
        this.g = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.m = null;
        this.n = null;
        alw.a().b(this);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    private void a() {
        if (this.h.e() && !this.g.a()) {
        }
    }

    public void a(ADDownloadInfo aDDownloadInfo) {
        a(-1, aDDownloadInfo);
    }

    public void b(ADDownloadInfo aDDownloadInfo) {
        e(aDDownloadInfo);
        a(-2, aDDownloadInfo);
    }

    public void c(ADDownloadInfo aDDownloadInfo) {
        e(aDDownloadInfo);
        a(-3, aDDownloadInfo);
    }

    public void d(ADDownloadInfo aDDownloadInfo) {
        e(aDDownloadInfo);
        a(-4, aDDownloadInfo);
    }

    private void a(int i, ADDownloadInfo aDDownloadInfo) {
        Message obtain = Message.obtain(null, i);
        Bundle bundle = new Bundle(ADDownloadInfo.class.getClassLoader());
        bundle.putParcelable(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74}), aDDownloadInfo);
        obtain.setData(bundle);
        Collection arrayList = new ArrayList();
        for (Messenger messenger : this.q) {
            try {
                messenger.send(obtain);
            } catch (Throwable e) {
                ibn.a(e);
                arrayList.add(messenger);
            }
        }
        try {
            this.q.removeAll(arrayList);
        } catch (Throwable e2) {
            ibn.a(e2);
        }
    }

    private void a(int i, ArrayList<ADDownloadInfo> arrayList) {
        Message obtain = Message.obtain(null, i);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 97, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 70, (byte) 68, (byte) 70, (byte) 77, (byte) 64, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74}), arrayList);
        obtain.setData(bundle);
        Collection arrayList2 = new ArrayList();
        for (Messenger messenger : this.q) {
            try {
                messenger.send(obtain);
            } catch (Throwable e) {
                ibn.a(e);
                arrayList2.add(messenger);
            }
        }
        try {
            this.q.removeAll(arrayList2);
        } catch (Throwable e2) {
            ibn.a(e2);
        }
    }

    public void e(ADDownloadInfo aDDownloadInfo) {
        if (aDDownloadInfo != null && aDDownloadInfo.status != 0) {
            this.o.c(this, aDDownloadInfo);
            switch (aDDownloadInfo.status) {
                case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                    this.o.c(this, aDDownloadInfo);
                    return;
                case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                    this.o.a(this, aDDownloadInfo, getString(2131689860), this.o.a(aDDownloadInfo, this));
                    return;
                case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                    this.o.b(this, aDDownloadInfo, getString(2131689863));
                    return;
                case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                    this.o.a(this, aDDownloadInfo, this.o.a(aDDownloadInfo, this));
                    return;
                case QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE /*5*/:
                    this.o.b(this, aDDownloadInfo, getString(2131689865));
                    return;
                case QzoneShare.SHARE_TO_QZONE_TYPE_APP /*6*/:
                    this.o.a(this, aDDownloadInfo, getString(2131689864), this.o.a(aDDownloadInfo, this));
                    return;
                case com.tencent.bugly.BuglyStrategy.a.CRASHTYPE_BLOCK /*7*/:
                    Intent intent = new Intent(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105}));
                    intent.putExtra(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 102, (byte) 96, (byte) 105, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106}), aDDownloadInfo);
                    sendBroadcast(intent);
                    this.o.a(this, aDDownloadInfo, getString(2131689859), this.o.b(this, aDDownloadInfo));
                    return;
                case BiliLiveHomePage.MODULE_TYPE_AREA_STD /*9*/:
                    this.o.a(this, aDDownloadInfo, getString(2131689862), null);
                    return;
                case BiliLiveHomePage.MODULE_TYPE_AREA_SQUARE /*10*/:
                    this.o.a(this, aDDownloadInfo, getString(2131689861), this.o.a(this, getPackageManager().getLaunchIntentForPackage(aDDownloadInfo.pkgName), aDDownloadInfo));
                    a();
                    return;
                case BiliCommentList.OID_TYPE_PAINTING /*11*/:
                    this.o.a(this, aDDownloadInfo);
                    return;
                default:
                    return;
            }
        }
    }
}
