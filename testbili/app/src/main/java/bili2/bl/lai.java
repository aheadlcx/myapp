package bili2.bl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.l;
import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.bilibili.api.BiliApiException;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.attention.api.Attention;
import tv.danmaku.bili.ui.attention.api.AttentionList;
import tv.danmaku.bili.ui.login.LoginActivity;
import tv.danmaku.bili.widget.VerifyAvatarFrameLayout;
import tv.danmaku.bili.widget.VerifyAvatarFrameLayout.VSize;

/* compiled from: BL */
public class lai extends fkv {
    private static int b = 5;
    gnc<AttentionList> a = new gnc<AttentionList>(this) {
        final /* synthetic */ lai a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(Object obj) {
            a((AttentionList) obj);
        }

        public boolean a() {
            return this.a.getActivity() == null || this.a.m() == null;
        }

        public void a(Throwable th) {
            if (this.a.f == 1) {
                this.a.p();
            } else {
                this.a.g = false;
                if ((th instanceof BiliApiException) && ((BiliApiException) th).mCode == 22007) {
                    this.a.c();
                } else {
                    this.a.b();
                }
            }
            this.a.h = false;
        }

        public void a(AttentionList attentionList) {
            if (attentionList != null && attentionList.list != null) {
                if (attentionList.list.isEmpty()) {
                    if (this.a.f == 1) {
                        this.a.o();
                        this.a.r();
                    } else {
                        this.a.b();
                    }
                    this.a.g = false;
                } else {
                    if (this.a.f == 1) {
                        this.a.o();
                        this.a.i.a.clear();
                        this.a.i.a.addAll(attentionList.list);
                        this.a.i.f();
                    } else {
                        int a = this.a.i.a();
                        this.a.i.a.addAll(attentionList.list);
                        this.a.i.c(a, attentionList.list.size());
                    }
                    if (this.a.f == lai.b && !this.a.e) {
                        this.a.g = false;
                        this.a.c();
                    }
                    if (attentionList.list.size() < 20) {
                        this.a.g = false;
                        this.a.b();
                    }
                }
                this.a.h = false;
            }
        }
    };
    private long c;
    private int d;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;
    private a i;
    private View k;

    /* compiled from: BL */
    static class a extends android.support.v7.widget.RecyclerView.a<b> {
        public List<Attention> a = new ArrayList();
        private lai b;
        private int c;
        private boolean d;
        private OnClickListener e = new OnClickListener(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void onClick(final View view) {
                Object tag = view.getTag();
                final Context a = fnd.a(view.getContext());
                if (view.getId() == 2131297745) {
                    if (!eva.a(a).a()) {
                        this.a.b.startActivityForResult(LoginActivity.a(view.getContext()), 333);
                    } else if (tag instanceof Attention) {
                        final Attention attention = (Attention) tag;
                        final int i = this.a.c == 1 ? 35 : 34;
                        if (attention.attribute == 0) {
                            kzq.b(eva.a(view.getContext()).j(), attention.mid, i, new gnc<Void>(this) {
                                final /* synthetic */ AnonymousClass1 d;

                                public /* synthetic */ void b(Object obj) {
                                    a((Void) obj);
                                }

                                public boolean a() {
                                    return a == null || a.isFinishing();
                                }

                                public void a(Throwable th) {
                                    if (lhk.a(th)) {
                                        lhk.a(a, 5);
                                        return;
                                    }
                                    String str = null;
                                    if (th instanceof BiliApiException) {
                                        str = th.getMessage();
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        str = a.getString(2131689934);
                                    }
                                    esu.b(a, str);
                                }

                                public void a(Void voidR) {
                                    attention.attribute = 2;
                                    int g = ((h) ((ViewGroup) view.getParent()).getLayoutParams()).g();
                                    if (g >= 0) {
                                        this.d.a.d(g);
                                    }
                                    esu.b(a, 2131689935);
                                    fji.a().a(a).a("mid", attention.mid).b(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 119, (byte) 96, (byte) 105, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 42, (byte) 98, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 40, (byte) 97, (byte) 108, (byte) 100, (byte) 105, (byte) 106, (byte) 98}));
                                }
                            });
                        } else if (attention.attribute < 128) {
                            final View view2 = view;
                            lca.a(a, new DialogInterface.OnClickListener(this) {
                                final /* synthetic */ AnonymousClass1 e;

                                public void onClick(DialogInterface dialogInterface, int i) {
                                    kzq.a(eva.a(view2.getContext()).j(), attention.mid, i, new gnc<Void>(this) {
                                        final /* synthetic */ AnonymousClass2 a;

                                        {
                                            this.a = r1;
                                        }

                                        public /* synthetic */ void b(Object obj) {
                                            a((Void) obj);
                                        }

                                        public boolean a() {
                                            return a == null || a.isFinishing();
                                        }

                                        public void a(Throwable th) {
                                            Toast.makeText(a, a.getString(2131689967), 0).show();
                                        }

                                        public void a(Void voidR) {
                                            attention.attribute = 0;
                                            int g = ((h) ((ViewGroup) view2.getParent()).getLayoutParams()).g();
                                            if (g >= 0) {
                                                this.a.e.a.d(g);
                                            }
                                        }
                                    });
                                    dialogInterface.dismiss();
                                }
                            });
                        }
                        if (this.a.c == 0) {
                            hal.a(view.getContext(), hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 90, Byte.MAX_VALUE, (byte) 106, (byte) 107, (byte) 96, (byte) 90, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 90, (byte) 103, (byte) 113, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                        }
                    }
                } else if (tag instanceof Attention) {
                    if (this.a.c == 0) {
                        hal.a(view.getContext(), hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 90, Byte.MAX_VALUE, (byte) 106, (byte) 107, (byte) 96, (byte) 90, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                    }
                    kyq.a(view.getContext(), ((Attention) tag).mid, ((Attention) tag).uname);
                }
            }
        };

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public a(lai bl_lai, boolean z, int i) {
            this.b = bl_lai;
            this.d = z;
            this.c = i;
        }

        public b a(ViewGroup viewGroup, int i) {
            b bVar = new b(LayoutInflater.from(viewGroup.getContext()).inflate(2131428358, viewGroup, false));
            bVar.a.setOnClickListener(this.e);
            bVar.p.setOnClickListener(this.e);
            if (this.d) {
                bVar.p.setVisibility(8);
            }
            return bVar;
        }

        public void a(b bVar, int i) {
            Resources resources = bVar.a.getResources();
            Attention attention = (Attention) this.a.get(i);
            bVar.n.a(attention.face);
            bVar.n.a(attention.official_verify, VSize.MED);
            bVar.o.setText(attention.uname);
            if (!this.d) {
                bVar.p.setTag(attention);
                Context context = bVar.p.getContext();
                if (attention.attribute == 0) {
                    bVar.p.setTextColor(fnd.a(context, 2131100837));
                    bVar.p.setBackgroundResource(2131235035);
                    bVar.p.setText(context.getResources().getString(2131689961));
                } else {
                    bVar.p.setBackgroundResource(2131235007);
                    bVar.p.setTextColor(context.getResources().getColor(2131100013));
                    bVar.p.setText(2131689937);
                }
            }
            if (lzu.a(attention.vip)) {
                bVar.o.setTypeface(lzu.a());
                bVar.o.setTextColor(lzu.a(bVar.a.getContext()));
            } else {
                bVar.o.setTypeface(Typeface.DEFAULT);
                bVar.o.setTextColor(resources.getColor(2131100856));
            }
            bVar.a.setTag(attention);
        }

        public long f_(int i) {
            return ((Attention) this.a.get(i)).mid;
        }

        public int a() {
            return this.a.size();
        }
    }

    /* compiled from: BL */
    static class b extends u {
        VerifyAvatarFrameLayout n;
        TextView o;
        TextView p;

        public b(View view) {
            super(view);
            this.n = (VerifyAvatarFrameLayout) ButterKnife.a(view, 2131296521);
            this.o = (TextView) ButterKnife.a(view, 2131298903);
            this.p = (TextView) ButterKnife.a(view, 2131297745);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = getArguments().getLong("mid", 0);
        this.d = getArguments().getInt("type", 0);
        this.e = getArguments().getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 72, (byte) 108, (byte) 107, (byte) 96}));
        this.i = new a(this, this.e, this.d);
    }

    public void a(RecyclerView recyclerView, @Nullable Bundle bundle) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.d(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new mec(this) {
            final /* synthetic */ lai a;

            {
                this.a = r1;
            }

            protected boolean a(u uVar) {
                return uVar.a != this.a.k;
            }
        });
        recyclerView.addOnScrollListener(new l(this) {
            final /* synthetic */ lai a;

            {
                this.a = r1;
            }

            public void a(RecyclerView recyclerView, int i, int i2) {
                int childCount = recyclerView.getChildCount();
                if (childCount > 0 && this.a.g) {
                    if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) >= recyclerView.getAdapter().a() - 10 && !this.a.h) {
                        this.a.a();
                        this.a.g();
                    }
                }
            }
        });
        this.k = LayoutInflater.from(getContext()).inflate(2131428097, recyclerView, false);
        this.k.setVisibility(4);
        men bl_men = new men(this.i);
        bl_men.b(this.k);
        recyclerView.setAdapter(bl_men);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        n();
        e();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 333) {
            e();
        }
    }

    private void e() {
        this.h = false;
        this.g = true;
        this.f = 1;
        f();
    }

    private void f() {
        if (!this.h && this.g) {
            this.h = true;
            if (this.d == 1) {
                kzq.d(eva.a(getApplicationContext()).j(), this.c, this.f, this.a);
            } else {
                kzq.c(eva.a(getApplicationContext()).j(), this.c, this.f, this.a);
            }
        }
    }

    private void g() {
        this.f++;
        f();
    }

    void a() {
        if (this.k != null) {
            this.k.setVisibility(0);
            this.k.findViewById(2131298656).setVisibility(0);
            ((TextView) this.k.findViewById(2131300554)).setText(2131692764);
        }
    }

    void b() {
        if (this.k != null) {
            this.k.setVisibility(0);
            this.k.findViewById(2131298656).setVisibility(8);
            ((TextView) this.k.findViewById(2131300554)).setText(2131693749);
        }
    }

    void c() {
        if (this.k != null) {
            this.k.setVisibility(0);
            this.k.findViewById(2131298656).setVisibility(8);
            ((TextView) this.k.findViewById(2131300554)).setText(2131693755);
        }
    }
}
