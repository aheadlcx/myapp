package bili2.bl;

import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.URLUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.bili.services.apkdownload.DownloadService;
import tv.danmaku.bili.services.apkdownload.bean.DownloadInfo;
import tv.danmaku.bili.ui.game.api.BiliGameDetail;

/* compiled from: BL */
public class kvy implements ServiceConnection {
    public static final String a = hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 70, (byte) 105, (byte) 108, (byte) 96, (byte) 107, (byte) 113});
    private String b;
    private boolean c;
    private Messenger d;
    private Messenger e = new Messenger(this.i);
    private SparseArray<DownloadInfo> f = new SparseArray();
    private ArrayList<b> g = new ArrayList(50);
    private b h;
    private a i = new a(Looper.getMainLooper());

    /* compiled from: BL */
    static class a extends Handler {
        private WeakReference<kwd> a;

        public a(Looper looper) {
            super(looper);
        }

        public void a(kwd bl_kwd) {
            this.a = new WeakReference(bl_kwd);
        }

        public void a() {
            this.a = null;
        }

        public void handleMessage(Message message) {
            if (this.a != null && this.a.get() != null) {
                int i = message.what;
                Bundle peekData = message.peekData();
                if (peekData != null) {
                    peekData.setClassLoader(DownloadInfo.class.getClassLoader());
                    DownloadInfo downloadInfo = (DownloadInfo) peekData.getParcelable(hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 118, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74}));
                    switch (i) {
                        case -6:
                            if (this.a.get() != null && (this.a.get() instanceof kwc)) {
                                ((kwc) this.a.get()).a(peekData.getParcelableArrayList(hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 118, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 70, (byte) 68, (byte) 70, (byte) 77, (byte) 64, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74})));
                                return;
                            }
                            return;
                        case -4:
                            if (this.a.get() != null) {
                                ((kwd) this.a.get()).d(downloadInfo);
                                return;
                            }
                            return;
                        case -3:
                            if (this.a.get() != null) {
                                ((kwd) this.a.get()).c(downloadInfo);
                                return;
                            }
                            return;
                        case -2:
                            if (this.a.get() != null) {
                                ((kwd) this.a.get()).b(downloadInfo);
                                return;
                            }
                            return;
                        case -1:
                            if (this.a.get() != null) {
                                ((kwd) this.a.get()).a(downloadInfo);
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

    /* compiled from: BL */
    static class b {
        private String a;
        private int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    @Deprecated
    /* compiled from: BL */
    static class c {
        private static final kvy a = new kvy();
    }

    @Deprecated
    public static kvy a() {
        return c.a;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.d = new Messenger(iBinder);
        this.c = true;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            a(1, bVar.b, bVar.a);
        }
        this.g.clear();
        if (this.h != null) {
            a(6, this.h.b, this.h.a);
        }
        this.h = null;
        if (this.f.size() != 0) {
            int keyAt = this.f.keyAt(0);
            for (int i = 0; i < this.f.size(); i++) {
                a(keyAt, (DownloadInfo) this.f.get(keyAt));
            }
        }
        this.f.clear();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.d = null;
        this.g.clear();
        this.h = null;
        this.f.clear();
        this.c = false;
    }

    private void a(int i, int i2, String str) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.replyTo = this.e;
        if (this.c) {
            Bundle bundle = new Bundle();
            bundle.putString(hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 118, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 85, (byte) 78, (byte) 66}), str);
            obtain.setData(bundle);
            try {
                this.d.send(obtain);
            } catch (Throwable e) {
                ibn.a(e);
            }
        }
    }

    private void a(int i, DownloadInfo downloadInfo) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.replyTo = this.e;
        if (this.c) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 118, (byte) 43, (byte) 100, (byte) 117, (byte) 110, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 65, (byte) 74, (byte) 82, (byte) 75, (byte) 73, (byte) 74, (byte) 68, (byte) 65, (byte) 90, (byte) 76, (byte) 75, (byte) 67, (byte) 74}), downloadInfo);
            obtain.setData(bundle);
            try {
                this.d.send(obtain);
            } catch (Throwable e) {
                ibn.a(e);
            }
        }
    }

    public void a(kwd bl_kwd) {
        if (bl_kwd != null) {
            this.i.a(bl_kwd);
        }
    }

    @Deprecated
    public void a(Context context) {
        if (context != null) {
            c(context);
            a(context, (ServiceConnection) this);
        }
    }

    public void b(Context context) {
        if (context != null) {
            this.i.a();
            if (this.c) {
                b(context, (ServiceConnection) this);
                this.g.clear();
                this.h = null;
                this.f.clear();
                this.c = false;
            }
        }
    }

    public void a(Context context, String str, int i) {
        if (context != null && str != null) {
            c(context);
            if (this.c) {
                a(1, i, str);
                return;
            }
            this.g.add(new b(str, i));
            a(context, (ServiceConnection) this);
        }
    }

    public void a(Context context, int i) {
        if (context != null) {
            c(context);
            if (this.c) {
                a(6, i, hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96}));
                return;
            }
            this.h = new b(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96}), i);
            a(context, (ServiceConnection) this);
        }
    }

    private void b(int i, DownloadInfo downloadInfo) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                downloadInfo.downloadFrom = 258;
                return;
            case 5:
                downloadInfo.downloadFrom = 257;
                return;
            default:
                return;
        }
    }

    private void a(Context context, int i, DownloadInfo downloadInfo, int i2) {
        if (context != null && downloadInfo != null && downloadInfo.pkgName != null) {
            b(i2, downloadInfo);
            if (i == 2) {
                kwn.a(downloadInfo);
            }
            if (i != 5) {
                switch (i2) {
                    case 1:
                        a(downloadInfo, downloadInfo.gameId);
                        break;
                    case 2:
                        a(downloadInfo, downloadInfo.gameId, downloadInfo.index);
                        break;
                }
            }
            c(context);
            if (this.c) {
                a(i, downloadInfo);
            } else {
                this.f.put(i, downloadInfo);
                a(context, (ServiceConnection) this);
            }
            if (i2 == 5) {
                kwn.d(downloadInfo);
            }
        }
    }

    public void a(final Context context, final DownloadInfo downloadInfo, final int i) {
        if (context != null && downloadInfo != null && downloadInfo.pkgName != null) {
            List arrayList = new ArrayList();
            for (String str : downloadInfo.urls) {
                if (URLUtil.isNetworkUrl(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() <= 0) {
                esu.b(context, hae.a(new byte[]{(byte) -21, (byte) -73, (byte) -124, (byte) -25, (byte) -78, (byte) -78, (byte) -26, (byte) -100, (byte) -79, (byte) -23, (byte) -127, (byte) -86, (byte) -26, (byte) -110, (byte) -111, (byte) -23, (byte) -68, (byte) -102, (byte) 36, (byte) 37}));
            } else {
                downloadInfo.urls = arrayList;
            }
            if (!TextUtils.equals(downloadInfo.pkgName, this.b) || !kwp.a()) {
                int i2;
                this.b = downloadInfo.pkgName;
                if (downloadInfo.status == 4 || downloadInfo.status == 2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (downloadInfo.forceDownload && r0 == 0) {
                    downloadInfo.status = 1;
                }
                int i3 = downloadInfo.status;
                if (downloadInfo.type == 10) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                switch (i3) {
                    case 1:
                    case 6:
                    case 10:
                        if (kwb.b(downloadInfo.errorCode)) {
                            i3 = kwp.a(context);
                            if (i3 == -1) {
                                if (i2 == 0) {
                                    esu.b(context, context.getString(2131691735));
                                    return;
                                }
                                return;
                            } else if (i3 == 0) {
                                if (i2 != 0) {
                                    downloadInfo.netStat = 0;
                                    a(context, 2, downloadInfo, i);
                                    return;
                                }
                                CharSequence string = context.getString(2131691727);
                                if (lea.e(context)) {
                                    esu.a(context, context.getString(2131695581), 0);
                                    downloadInfo.netStat = 0;
                                    a(context, 2, downloadInfo, i);
                                    return;
                                }
                                new Builder(context).setTitle(context.getString(2131691728)).setMessage(string).setNegativeButton(context.getString(2131691730), null).setPositiveButton(context.getString(2131691739), new OnClickListener(this) {
                                    final /* synthetic */ kvy d;

                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        downloadInfo.netStat = 0;
                                        this.d.a(context, 2, downloadInfo, i);
                                        esu.a(context, context.getString(2131691737), 0);
                                    }
                                }).create().show();
                                return;
                            } else if (i3 == 1) {
                                downloadInfo.netStat = 1;
                                a(context, 2, downloadInfo, i);
                                if (i2 == 0) {
                                    esu.b(context, context.getString(2131691737));
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                    case 4:
                        a(context, 3, downloadInfo, i);
                        if (i2 == 0) {
                            esu.b(context, context.getString(2131691734) + downloadInfo.name);
                            return;
                        }
                        return;
                    case 7:
                        if (i2 == 0) {
                            kwp.a(context, downloadInfo.pkgName, downloadInfo.name);
                        }
                        a(context, 4, downloadInfo, i);
                        return;
                    case 9:
                        if (i2 == 0) {
                            if (i == 5) {
                                kwp.a(context, downloadInfo);
                            } else {
                                kwp.a(context, downloadInfo.pkgName, downloadInfo.name);
                            }
                        }
                        switch (i) {
                            case 1:
                                a(downloadInfo, downloadInfo.gameId);
                                return;
                            case 2:
                                a(downloadInfo, downloadInfo.gameId, downloadInfo.index);
                                return;
                            default:
                                return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    public void a(Context context, BiliGameDetail biliGameDetail, DownloadInfo downloadInfo, int i) {
        if (downloadInfo != null) {
            switch (downloadInfo.status) {
                case 1:
                    a(context, 5, downloadInfo, i);
                    esu.b(context, hae.a(new byte[]{(byte) -23, (byte) -73, (byte) -118, (byte) -26, (byte) -106, (byte) -85, (byte) -23, (byte) -73, (byte) -73, (byte) -23, (byte) -121, Byte.MIN_VALUE, (byte) -26, (byte) -118, (byte) -126, (byte) -24, (byte) -78, (byte) -95, (byte) -23, (byte) -121, (byte) -97, (byte) -22, (byte) -123, (byte) -112, (byte) 36}));
                    return;
                case 2:
                case 3:
                case 9:
                    esu.b(context, 2131691765);
                    return;
                case 4:
                    esu.b(context, 2131691764);
                    return;
                case 5:
                    esu.b(context, 2131691767);
                    return;
                case 6:
                case 7:
                case 10:
                    int i2;
                    a(context, 5, downloadInfo, i);
                    if (biliGameDetail != null) {
                        i2 = biliGameDetail.mId;
                    } else {
                        i2 = 0;
                    }
                    kuv.a(1, String.valueOf(i2), 4, gmy.d, 0, gmy.d, gmy.d);
                    String string = context.getString(2131691768);
                    Object[] objArr = new Object[1];
                    objArr[0] = downloadInfo.name == null ? gmy.d : downloadInfo.name;
                    esu.b(context, String.format(string, objArr));
                    return;
                case 8:
                    esu.b(context, 2131691766);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(DownloadInfo downloadInfo, int i) {
        switch (downloadInfo.status) {
            case 1:
            case 6:
            case 10:
                if (downloadInfo.currentLength == 0) {
                    kuv.a(1, String.valueOf(i), 5, gmy.d, 0, gmy.d, gmy.d);
                    return;
                }
                return;
            case 4:
                kuv.a(1, String.valueOf(i), 6, gmy.d, 0, gmy.d, gmy.d);
                return;
            case 9:
                kuv.a(1, String.valueOf(i), 7, gmy.d, 0, gmy.d, gmy.d);
                return;
            default:
                return;
        }
    }

    private void a(DownloadInfo downloadInfo, int i, int i2) {
        int i3 = 8;
        if (downloadInfo != null) {
            switch (downloadInfo.status) {
                case 1:
                case 10:
                    if (downloadInfo.currentLength != 0) {
                        i3 = 10;
                        break;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    i3 = 9;
                    break;
                case 6:
                    if (downloadInfo.currentLength != 0) {
                        i3 = 10;
                        break;
                    }
                    break;
                case 9:
                    i3 = 11;
                    break;
                default:
                    i3 = -1;
                    break;
            }
            if (i3 != -1) {
                kuv.a(1, i3, gmy.d, i2, i, gmy.d, gmy.d);
            }
        }
    }

    private static void c(Context context) {
        if (!kwp.g(context, DownloadService.class.getName())) {
            d(context);
        }
    }

    private static void d(Context context) {
        context.startService(new Intent(context, DownloadService.class));
    }

    private static void a(Context context, ServiceConnection serviceConnection) {
        context.bindService(new Intent(context, DownloadService.class), serviceConnection, 1);
    }

    private static void b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException e) {
        }
    }
}
