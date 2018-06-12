package bili4.tv.danmaku.bili.ui.filechooser;

import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import bl.esu;
import bl.hae;
import bl.hjy;
import bl.ibn;
import bl.ldx;
import bl.ldx.a;
import bl.mdb;
import bl.mdc;
import java.io.File;
import tv.danmaku.android.log.BLog;
import u.aly.bj;

/* compiled from: BL */
public class FileChooserActivity extends FragmentActivity implements OnBackStackChangedListener, OnClickListener, a {
    public static final String a = hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 103, (byte) 100, (byte) 118, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109});
    public static final String b = hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 97, (byte) 108, (byte) 119, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96});
    public static final String c = Environment.getExternalStorageDirectory().getAbsolutePath();
    private static final String d = hae.a(new byte[]{(byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 70, (byte) 109, (byte) 106, (byte) 106, (byte) 118, (byte) 96, (byte) 119, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124});
    private FragmentManager e;
    private BroadcastReceiver f = new BroadcastReceiver(this) {
        final /* synthetic */ FileChooserActivity a;

        {
            this.a = r1;
        }

        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, 2131695049, 1).show();
            this.a.c(null);
        }
    };
    private String g;
    private String h;
    private TextView i;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427583);
        this.i = (TextView) findViewById(2131300682);
        findViewById(2131296799).setOnClickListener(this);
        findViewById(2131299031).setOnClickListener(this);
        findViewById(2131298944).setOnClickListener(this);
        this.e = getSupportFragmentManager();
        this.e.addOnBackStackChangedListener(this);
        String stringExtra = getIntent().getStringExtra(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 103, (byte) 100, (byte) 118, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109}));
        if (bundle == null) {
            if (stringExtra == null) {
                stringExtra = c;
            }
            this.g = stringExtra;
            a();
        } else {
            this.g = bundle.getString("path");
            this.h = bundle.getString(hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 97, (byte) 108, (byte) 119, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}));
        }
        setTitle(this.g);
    }

    protected void onPause() {
        super.onPause();
        c();
    }

    protected void onResume() {
        super.onResume();
        b();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("path", this.g);
        if (!TextUtils.isEmpty(this.h)) {
            bundle.putString(hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 97, (byte) 108, (byte) 119, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), this.h);
        }
    }

    public void onBackStackChanged() {
        int backStackEntryCount = this.e.getBackStackEntryCount();
        if (backStackEntryCount > 0) {
            this.g = this.e.getBackStackEntryAt(backStackEntryCount - 1).getName();
        } else {
            this.g = c;
        }
        setTitle(this.g);
    }

    public void setTitle(CharSequence charSequence) {
        this.i.setText(getString(2131691064, new Object[]{charSequence}));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                this.e.popBackStack();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    private void a() {
        this.e.beginTransaction().add(2131297097, ldx.a(this.g)).commit();
    }

    private void b(File file) {
        this.g = file.getAbsolutePath();
        if (this.g.endsWith("..")) {
            this.g = file.getParentFile().getParent();
        }
        this.e.beginTransaction().replace(2131297097, ldx.a(this.g)).setTransition(4097).addToBackStack(this.g).commitAllowingStateLoss();
    }

    private void c(File file) {
        if (file != null) {
            setResult(-1, new Intent().setData(Uri.fromFile(file)));
            finish();
            return;
        }
        setResult(0);
        finish();
    }

    public void a(File file) {
        if (file != null) {
            b(file);
        } else {
            Toast.makeText(this, 2131694179, 0).show();
        }
    }

    private void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 72, (byte) 64, (byte) 65, (byte) 76, (byte) 68, (byte) 90, (byte) 87, (byte) 64, (byte) 72, (byte) 74, (byte) 83, (byte) 64, (byte) 65}));
        registerReceiver(this.f, intentFilter);
    }

    private void c() {
        unregisterReceiver(this.f);
    }

    public void onClick(View view) {
        if (view.getId() == 2131296799) {
            setResult(0);
            finish();
        } else if (view.getId() == 2131299031) {
            mdc.a(this, this.g, 8874, new mdc.a(this) {
                final /* synthetic */ FileChooserActivity a;

                {
                    this.a = r1;
                }

                public void a() {
                    BLog.d(hae.a(new byte[]{(byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 70, (byte) 109, (byte) 106, (byte) 106, (byte) 118, (byte) 96, (byte) 119, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}), hae.a(new byte[]{(byte) 103, (byte) 96, (byte) 96, (byte) 107, (byte) 37, (byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 97, (byte) 37, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 119, (byte) 104, (byte) 37, (byte) 97, (byte) 108, (byte) 119, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124}));
                    this.a.d();
                }

                public void b() {
                    this.a.e();
                }

                public void c() {
                }
            });
        } else if (view.getId() == 2131298944) {
            f();
        }
    }

    private boolean d() {
        if (b(this.g)) {
            setResult(-1, new Intent().setData(Uri.fromFile(new File(this.g))));
            finish();
            return true;
        }
        e();
        return false;
    }

    private void e() {
        new Builder(this).setTitle(2131694179).setMessage(2131694695).setPositiveButton(2131693806, null).show();
    }

    private void f() {
        this.h = bj.b;
        final View editText = new EditText(this);
        new Builder(this).setTitle(2131691265).setView(editText).setPositiveButton(2131693806, new DialogInterface.OnClickListener(this) {
            final /* synthetic */ FileChooserActivity b;

            public void onClick(DialogInterface dialogInterface, int i) {
                this.b.h = editText.getText().toString();
                mdc.a(this.b, this.b.g, 8891, new mdc.a(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void a() {
                        BLog.d(hae.a(new byte[]{(byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 70, (byte) 109, (byte) 106, (byte) 106, (byte) 118, (byte) 96, (byte) 119, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}), hae.a(new byte[]{(byte) 103, (byte) 96, (byte) 96, (byte) 107, (byte) 37, (byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 97, (byte) 37, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 37, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 97, (byte) 108, (byte) 119, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 124}));
                        this.a.b.a(this.a.b.h);
                    }

                    public void b() {
                        this.a.b.e();
                    }

                    public void c() {
                    }
                });
            }
        }).setNegativeButton(2131690540, null).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            esu.b(this, 2131695039);
        } else if (!mdc.a(this, intent)) {
            esu.b(this, 2131695043);
        } else if (i == 8891) {
            a(this.h);
        } else if (i == 8874 && d()) {
            esu.b(this, 2131695044);
        }
    }

    private void a(String str) {
        int i = 1;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(this.g, str);
            if (file.exists()) {
                Toast.makeText(getApplicationContext(), 2131691478, 0).show();
                return;
            }
            if (!mdb.a(this, this.g)) {
                hjy a = mdc.a(this, file);
                if (!(a != null && a.b() && a.i())) {
                    i = 0;
                }
            } else if (!(file.mkdir() && file.isDirectory())) {
                i = 0;
            }
            Toast.makeText(getApplicationContext(), i != 0 ? 2131695073 : 2131691549, 0).show();
            if (i != 0) {
                a(new File(this.g));
            }
        }
    }

    private boolean b(String str) {
        if (mdb.a(this, str)) {
            File file = new File(str);
            if (file.canRead() && file.canWrite()) {
                return true;
            }
            return false;
        }
        Object d = mdb.d(this);
        String str2 = null;
        try {
            str2 = new File(str).getCanonicalPath();
        } catch (Throwable e) {
            ibn.a(e);
        }
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(str2) || !str2.startsWith(d)) {
            return false;
        }
        hjy a = mdc.a(this, new File(str2));
        if (a != null && a.k() && a.j()) {
            return true;
        }
        return false;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context.getApplicationContext(), FileChooserActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 103, (byte) 100, (byte) 118, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109}), str);
        }
        return intent;
    }
}
