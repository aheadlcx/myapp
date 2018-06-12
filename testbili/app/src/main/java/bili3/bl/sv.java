package bili3.bl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.format.DateFormat;
import bl.qz.a;
import c.t.m.g.cw;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: BL */
public final class sv implements Listener, LocationListener {
    private long a = 0;
    private final sh b;
    private int c = 1024;
    private boolean d = false;
    private boolean e = false;
    private int f = 0;
    private int g = 0;
    private volatile boolean h;
    private HandlerThread i;
    private Runnable j;
    private Handler k;
    private sv l;
    private boolean m;
    private sq n;
    private GpsStatus o;
    private long p = -1;
    private final double[] q = new double[2];

    public sv(sh shVar) {
        this.b = shVar;
        this.n = sq.a();
        this.j = new Runnable(this) {
            private /* synthetic */ sv a;

            {
                this.a = r1;
            }

            public final void run() {
                try {
                    Bundle bundle = new Bundle();
                    this.a.b.d().sendExtraCommand(TencentLocation.GPS_PROVIDER, "force_xtra_injection", bundle);
                    this.a.b.d().sendExtraCommand(TencentLocation.GPS_PROVIDER, "force_time_injection", bundle);
                } catch (Throwable th) {
                    th.toString();
                }
                try {
                    this.a.b.d().addGpsStatusListener(this.a.l);
                    this.a.b.d().requestLocationUpdates(TencentLocation.GPS_PROVIDER, 1000, 0.0f, this.a.l, this.a.i.getLooper());
                } catch (Throwable th2) {
                    th2.toString();
                }
            }
        };
        this.l = this;
    }

    public final void a(boolean z) {
        if (!this.h) {
            this.i = new HandlerThread("gps_provider");
            this.i.start();
            this.k = new Handler(this.i.getLooper());
            this.h = true;
            LocationManager d = this.b.d();
            if (z) {
                d.requestLocationUpdates("passive", 1000, 0.0f, this);
            } else {
                try {
                    this.k.post(this.j);
                } catch (Exception e) {
                    ts.a = true;
                }
            }
            if (d()) {
                this.c = 4;
                e();
            }
        }
    }

    public final Location a() {
        Location location = null;
        try {
            location = this.b.d().getLastKnownLocation(TencentLocation.NETWORK_PROVIDER);
        } catch (Throwable th) {
        }
        if (location == null) {
            return st.a;
        }
        int i = (this.m && tt.a(location.getLatitude(), location.getLongitude())) ? 1 : 0;
        if (i != 0) {
            a.a(location, this.q);
            a(location, this.q[0], this.q[1], 0);
            return location;
        }
        a(location, location.getLatitude(), location.getLongitude(), 0);
        return location;
    }

    public final void b() {
        if (this.h) {
            if (this.i != null) {
                this.i.quit();
                this.i = null;
            }
            this.h = false;
            this.a = 0;
            this.c = 1024;
            this.d = false;
            this.e = false;
            this.f = 0;
            this.g = 0;
            this.m = false;
            this.p = -1;
            Arrays.fill(this.q, 0.0d);
            this.b.b((Object) this);
            LocationManager d = this.b.d();
            try {
                d.removeGpsStatusListener(this);
            } catch (Exception e) {
            }
            try {
                d.removeUpdates(this);
            } catch (Exception e2) {
            }
        }
    }

    public final boolean c() {
        if ((this.c & 2) != 2 || System.currentTimeMillis() - this.a >= cw.a().b()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        boolean z = false;
        try {
            z = this.b.d().isProviderEnabled(TencentLocation.GPS_PROVIDER);
        } catch (Throwable th) {
        }
        return z;
    }

    public final void b(boolean z) {
        this.m = z;
    }

    private static boolean a(double d) {
        if (Math.abs(((double) Double.valueOf(d).longValue()) - d) < Double.MIN_VALUE) {
            return true;
        }
        return false;
    }

    private void e() {
        int i;
        if (this.c == 4) {
            i = 1;
        } else if (this.c == 0) {
            i = 0;
        } else {
            i = -1;
        }
        Object message = new Message();
        message.what = 12999;
        message.arg1 = 12002;
        message.arg2 = i;
        this.b.c(message);
    }

    private void c(boolean z) {
        int i = z ? 3 : 4;
        Object message = new Message();
        message.what = 12999;
        message.arg1 = 12004;
        message.arg2 = i;
        this.b.c(message);
    }

    @SuppressLint({"NewApi"})
    private boolean a(Location location) {
        if (!tj.a) {
            return false;
        }
        try {
            if (!this.b.d().isProviderEnabled(TencentLocation.GPS_PROVIDER)) {
                return true;
            }
            if (VERSION.SDK_INT < 18 || !location.isFromMockProvider()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    public final void onLocationChanged(Location location) {
        if (location != null) {
            try {
                if (TencentLocation.GPS_PROVIDER.equals(location.getProvider())) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    "onLocationChanged: " + DateFormat.format("yyyy-MM-dd kk:mm:ss", this.a) + latitude + "," + longitude;
                    Object obj = location.getAccuracy() > 10000.0f ? null : (a(latitude) && a(longitude)) ? null : (Math.abs(latitude) < 1.0E-8d || Math.abs(longitude) < 1.0E-8d) ? null : (Math.abs(latitude - 1.0d) < 1.0E-8d || Math.abs(longitude - 1.0d) < 1.0E-8d) ? null : (latitude < -90.0d || latitude > 90.0d || longitude < -180.0d || longitude > 180.0d) ? null : 1;
                    if (obj != null) {
                        f();
                        this.c |= 2;
                        Context context = this.b.a;
                        if (!a(location)) {
                            this.a = System.currentTimeMillis();
                            int i = 0;
                            if (this.g == 3) {
                                i = 1;
                            } else if (this.g >= 4 && this.g <= 6) {
                                i = 2;
                            } else if (this.g >= 7) {
                                i = 3;
                            }
                            obj = (this.m && tt.a(location.getLatitude(), location.getLongitude())) ? 1 : null;
                            if (obj != null) {
                                a.a(location, this.q);
                                a(location, this.q[0], this.q[1], i);
                            } else {
                                a(location, location.getLatitude(), location.getLongitude(), i);
                            }
                            this.b.c(new tf(location, this.a, this.f, this.g, this.c));
                            if (this.p == -1 || this.p == 0) {
                                c(true);
                                this.p = System.currentTimeMillis();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public final void onProviderEnabled(String str) {
        if (TencentLocation.GPS_PROVIDER.equals(str)) {
            this.c = 4;
            e();
        }
    }

    public final void onProviderDisabled(String str) {
        if (TencentLocation.GPS_PROVIDER.equals(str)) {
            this.g = 0;
            this.f = 0;
            this.c = 0;
            this.d = false;
            this.a = 0;
            e();
        }
    }

    public final void onGpsStatusChanged(int i) {
        boolean a;
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                this.c |= 1;
                break;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                this.c = 0;
                break;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                this.c |= 2;
                break;
            case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                LocationManager d = this.b.d();
                try {
                    if (this.o == null) {
                        this.o = d.getGpsStatus(null);
                    } else {
                        d.getGpsStatus(this.o);
                    }
                } catch (Exception e) {
                }
                if (this.o != null) {
                    a = this.n.a(this.o);
                } else {
                    a = true;
                }
                if (!a) {
                    if (this.p == -1 || (System.currentTimeMillis() - this.p > 40000 && this.p != 0)) {
                        c(a);
                        this.p = 0;
                        break;
                    }
                }
                if (this.p == -1 || this.p == 0) {
                    c(a);
                }
                this.p = System.currentTimeMillis();
                break;
        }
        f();
        int g = g();
        int h = h();
        if (g > 0) {
            this.e = true;
        }
        if (h > 0) {
            this.d = true;
        }
        if (!this.e || g > 2) {
            a = this.d;
        }
    }

    private void f() {
        GpsStatus gpsStatus = null;
        try {
            this.g = 0;
            this.f = 0;
            try {
                gpsStatus = this.b.d().getGpsStatus(null);
            } catch (Exception e) {
            }
            if (gpsStatus != null) {
                int maxSatellites = gpsStatus.getMaxSatellites();
                Iterator it = gpsStatus.getSatellites().iterator();
                if (it != null) {
                    while (it.hasNext() && this.f <= maxSatellites) {
                        this.f++;
                        if (((GpsSatellite) it.next()).usedInFix()) {
                            this.g++;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.toString();
        }
    }

    private int g() {
        GpsStatus gpsStatus = null;
        int i = -1;
        try {
            gpsStatus = this.b.d().getGpsStatus(null);
        } catch (Exception e) {
        }
        if (gpsStatus != null) {
            int maxSatellites = gpsStatus.getMaxSatellites();
            Iterator it = gpsStatus.getSatellites().iterator();
            if (it != null) {
                i = 0;
                while (it.hasNext() && i <= maxSatellites) {
                    it.next();
                    i++;
                }
            }
        }
        return i;
    }

    private int h() {
        GpsStatus gpsStatus = null;
        int i = -1;
        try {
            gpsStatus = this.b.d().getGpsStatus(null);
        } catch (Exception e) {
        }
        if (gpsStatus != null) {
            int maxSatellites = gpsStatus.getMaxSatellites();
            Iterator it = gpsStatus.getSatellites().iterator();
            if (it != null) {
                i = 0;
                while (it.hasNext() && i <= maxSatellites) {
                    if (((GpsSatellite) it.next()).usedInFix()) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    private static void a(Location location, double d, double d2, int i) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putDouble("lat", d);
        extras.putDouble("lng", d2);
        extras.putInt("rssi", i);
        location.setExtras(extras);
    }
}
