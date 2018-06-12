package bili.bl;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.view.ViewPager;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageView;
import com.bilibili.api.BiliApiException;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo.HotWord;
import com.bilibili.bililive.videoliveplayer.playernew.chatroom.LiveChatPlayerView;
import com.bilibili.bililive.videoliveplayer.ui.widget.ListenSoftKeyLinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tv.danmaku.bili.widget.BannerIndicator;
import tv.danmaku.bili.widget.TagsView;
import tv.danmaku.bili.widget.TagsView.c;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;
import tv.danmaku.videoplayer.core.danmaku.IDanmakuPlayer;

/* compiled from: BL */
public class dsc extends fkt {
    private static final String m = hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 113, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    private static final String n = hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 63, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 63, (byte) 102, (byte) 109, (byte) 100, (byte) 113, (byte) 63, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 97});
    ListenSoftKeyLinearLayout a;
    ViewGroup b;
    View c;
    ViewGroup d;
    LiveChatPlayerView e;
    EditText f;
    ImageView g;
    dng h;
    dnh i;
    BiliLiveRoomInfo j;
    IDanmakuPlayer k;
    ebs l;
    private int o;
    private int p;
    private AtomicInteger q = new AtomicInteger(0);
    private boolean r = false;
    private boolean s = false;
    private int t;
    private int u = 0;
    private Set<String> v = Collections.synchronizedSet(new HashSet());
    private dnf w = new dnf(this) {
        final /* synthetic */ dsc a;

        {
            this.a = r1;
        }

        public void a(String str, mvs bl_mvs) {
            if (!this.a.activityDie() && this.a.k != null && bl_mvs != null && !bl_mvs.B) {
                this.a.a(bl_mvs);
            }
        }

        public void b(int i) {
            this.a.j();
        }

        public void c(int i) {
            this.a.i();
        }

        public void d(int i) {
            this.a.j();
        }
    };

    /* compiled from: BL */
    class a implements mve {
        final /* synthetic */ dsc a;

        a(dsc bl_dsc) {
            this.a = bl_dsc;
        }

        public void a() {
        }

        public long b() {
            return -1;
        }

        public boolean c() {
            return false;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.o = arguments.getInt(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 63, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 63, (byte) 102, (byte) 109, (byte) 100, (byte) 113, (byte) 63, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 97}), 0);
            if (this.o <= 0) {
                esu.b(getContext(), 2131692657);
                getActivity().finish();
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131427771, viewGroup, false);
    }

    public void onViewCreated(final View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.l = new ebs(3000);
        a(view);
        c();
        final int a = (int) coq.a(getContext(), 246.0f);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            final /* synthetic */ dsc c;

            public void onGlobalLayout() {
                this.c.u = view.getHeight() - coa.a(this.c.getContext(), 394.0f);
                this.c.t = a > this.c.u ? a : this.c.u;
                LayoutParams layoutParams = this.c.b.getLayoutParams();
                layoutParams.height = this.c.u;
                this.c.b.setLayoutParams(layoutParams);
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    private void a(View view) {
        this.d = (ViewGroup) view.findViewById(2131298501);
        this.e = (LiveChatPlayerView) view.findViewById(2131301213);
        this.f = (EditText) view.findViewById(2131297481);
        this.g = (ImageView) view.findViewById(2131297563);
        view.findViewById(2131296688).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ dsc a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.getActivity().finish();
            }
        });
        view.findViewById(2131296715).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ dsc a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.a(this.a.h(), false);
            }
        });
        ImageView imageView = (ImageView) view.findViewById(2131300712);
        if (cnn.g()) {
            imageView.setAlpha(0.99f);
        }
        this.d.getLayoutParams().height = a(coa.a(getContext(), 12.0f));
        this.d.requestLayout();
        this.k = new mvk();
        this.k.a(this.d, true, this.d.getWidth());
        this.a = (ListenSoftKeyLinearLayout) view.findViewById(2131298566);
        this.a.setSoftKeyListener(new com.bilibili.bililive.videoliveplayer.ui.widget.ListenSoftKeyLinearLayout.a(this) {
            final /* synthetic */ dsc a;

            {
                this.a = r1;
            }

            public void a(int i) {
                this.a.b.setVisibility(8);
            }

            public void b(int i) {
                this.a.d();
            }
        });
        this.b = (ViewGroup) view.findViewById(2131298069);
        this.c = view.findViewById(2131298066);
        this.c.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ dsc a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.j != null) {
                    this.a.f();
                }
            }
        });
    }

    private void c() {
        if (this.o > 0 && !activityDie()) {
            doc.a().a(this.o, doc.a(getApplicationContext()), this.p, new gnc<BiliLiveRoomInfo>(this) {
                final /* synthetic */ dsc a;

                {
                    this.a = r1;
                }

                public /* synthetic */ void b(@Nullable Object obj) {
                    a((BiliLiveRoomInfo) obj);
                }

                public void a(Throwable th) {
                    if (th instanceof BiliApiException) {
                        esu.a(this.a.getContext(), th.getMessage());
                    } else {
                        esu.a(this.a.getContext(), 2131692403);
                    }
                    this.a.e.setVisibility(8);
                    this.a.g.setVisibility(0);
                }

                public void a(@Nullable BiliLiveRoomInfo biliLiveRoomInfo) {
                    this.a.b(biliLiveRoomInfo);
                }

                public boolean a() {
                    return this.a.activityDie() || this.a.isDetached();
                }
            });
        }
    }

    private void b(BiliLiveRoomInfo biliLiveRoomInfo) {
        if (biliLiveRoomInfo != null) {
            this.j = biliLiveRoomInfo;
            this.o = biliLiveRoomInfo.mRoomId;
            a(biliLiveRoomInfo);
            d(biliLiveRoomInfo);
            c(biliLiveRoomInfo);
            if ("LIVE".equals(biliLiveRoomInfo.mSchedule.mStatus)) {
                g();
            } else {
                this.g.setVisibility(0);
            }
        }
    }

    private void c(BiliLiveRoomInfo biliLiveRoomInfo) {
        if (this.b != null && !this.s && getContext() != null) {
            this.s = true;
            ViewGroup viewGroup = (ViewPager) this.b.findViewById(2131301245);
            BannerIndicator bannerIndicator = (BannerIndicator) this.b.findViewById(2131298251);
            List list = biliLiveRoomInfo.mHotWords;
            List arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                int a = a(viewGroup, list.subList(i, list.size()));
                arrayList.add(list.subList(i, i + a));
                i2++;
                i += a;
            }
            viewGroup.setAdapter(new dse(arrayList, new c(this) {
                final /* synthetic */ dsc a;

                {
                    this.a = r1;
                }

                public void a(TagsView tagsView, int i) {
                    if (tagsView != null && i >= 0) {
                        this.a.a((String) tagsView.a(i), true);
                    }
                }
            }));
            bannerIndicator.a(viewGroup, 0);
            bannerIndicator.setRealSize(i2);
            bannerIndicator.setFillColor(blg.a().getResources().getColor(2131100048));
        }
    }

    private int a(ViewGroup viewGroup, List<HotWord> list) {
        float width = (float) viewGroup.getWidth();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) blg.a().getResources().getDimensionPixelSize(2131165986));
        int i = 4;
        int i2 = 0;
        int i3;
        for (int i4 = 0; i4 < list.size(); i4 = i3) {
            float measureText = textPaint.measureText(((HotWord) list.get(i4)).mWord) + (2.0f * coq.a(blg.a(), 12.0f));
            i3 = i4;
            while (width > measureText) {
                i2++;
                i4 = i3 + 1;
                if (i4 >= list.size()) {
                    i3 = i4;
                    break;
                }
                measureText = (textPaint.measureText(((HotWord) list.get(i4)).mWord) + coq.a(blg.a(), 26.0f)) + measureText;
                i3 = i4;
            }
            i4 = i - 1;
            if (i4 <= 0) {
                break;
            }
            i = i4;
        }
        return i2;
    }

    private void d(BiliLiveRoomInfo biliLiveRoomInfo) {
        if (this.h == null) {
            this.h = new dng(this.v);
            this.h.a(this.w);
        }
        PlayerParams e = e(biliLiveRoomInfo);
        this.h.a(biliLiveRoomInfo.mCmtHost, biliLiveRoomInfo.mCmtPortGoim, biliLiveRoomInfo.mRoomId, eva.a(blg.a()).i());
        this.k.a(e.d, e.d.b(), new a(this), e.i());
    }

    public boolean a() {
        if (this.b.getVisibility() != 0) {
            return true;
        }
        this.b.getLayoutParams().height = this.u;
        this.b.requestLayout();
        this.b.setVisibility(4);
        return false;
    }

    private void d() {
        this.b.getLayoutParams().height = this.u;
        this.b.requestLayout();
        this.b.setVisibility(4);
    }

    private void e() {
        this.b.getLayoutParams().height = this.t;
        this.b.requestLayout();
        this.b.setVisibility(0);
    }

    public void a(BiliLiveRoomInfo biliLiveRoomInfo) {
        if (biliLiveRoomInfo != null) {
            efz.a(blg.a(), biliLiveRoomInfo);
            if (biliLiveRoomInfo.mMsgLength > 0) {
                this.f.setFilters(new InputFilter[]{new LengthFilter(r0)});
                return;
            }
            this.f.setFilters(new InputFilter[]{new LengthFilter(20)});
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
        this.e.a();
        if (this.h != null) {
            this.h.c();
        }
    }

    public void onPause() {
        super.onPause();
        this.e.b();
        if (this.h != null) {
            this.h.b();
        }
    }

    public void onStop() {
        super.onStop();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onDestroyView() {
        if (this.h != null) {
            this.h.a();
        }
        if (this.e != null) {
            this.e.c();
        }
        super.onDestroyView();
    }

    private void f() {
        if (this.b.getVisibility() == 0) {
            d();
        } else if (this.b.getVisibility() == 4) {
            e();
        } else {
            cog.a(this.f);
            etb.a(0).postDelayed(new Runnable(this) {
                final /* synthetic */ dsc a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.e();
                }
            }, 200);
        }
    }

    private void g() {
        if (this.j != null && this.g != null) {
            this.r = true;
            if (this.g != null) {
                this.g.setVisibility(8);
            }
            if (this.e != null) {
                this.e.setVisibility(0);
                this.e.a(getActivity(), e(this.j), null);
            }
        }
    }

    public void b() {
        this.g.setVisibility(0);
        this.e.setVisibility(8);
        this.e.c();
    }

    private PlayerParams e(BiliLiveRoomInfo biliLiveRoomInfo) {
        if (biliLiveRoomInfo == null) {
            return null;
        }
        return a(biliLiveRoomInfo.mRoomId, biliLiveRoomInfo.mCmtHost, biliLiveRoomInfo.mCmtPortGoim);
    }

    private PlayerParams a(int i, String str, int i2) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        PlayerParams a = czm.a();
        a.d.l(true);
        mst a2 = mst.a(a);
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 102, (byte) 104, (byte) 113, (byte) 90, (byte) 109, (byte) 106, (byte) 118, (byte) 113}), str);
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 102, (byte) 104, (byte) 113, (byte) 90, (byte) 117, (byte) 106, (byte) 119, (byte) 113}), Integer.valueOf(i2));
        ResolveResourceParams g = a.c.g();
        g.mCid = i;
        g.mFrom = "live";
        g.mHasAlias = false;
        return a;
    }

    private String h() {
        if (this.f == null || this.f.getText() == null) {
            return null;
        }
        return this.f.getText().toString();
    }

    private void a(String str, final boolean z) {
        if (this.j != null) {
            if (this.i == null) {
                this.i = new dnh(getActivity(), this.j.mRoomId, this.j.mMid, this.v);
            }
            this.i.a(str);
            this.i.a(new dne(this) {
                final /* synthetic */ dsc b;

                public void a(String str, mvs bl_mvs) {
                    if (!z) {
                        this.b.f.setText(BuildConfig.VERSION_NAME);
                    }
                    this.b.a(bl_mvs);
                }

                public void a(int i, String str) {
                    esu.b(this.b.getContext(), str);
                }
            });
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    private int a(int i) {
        double d = 0.0d;
        Point d2 = flh.d(getApplicationContext());
        if (d2.x > 0 && d2.y > 0) {
            float min = ((float) Math.min(d2.x, d2.y)) / ((float) Math.max(d2.x, d2.y));
            d = min <= 0.6251f ? (double) min : 0.625d;
        }
        return (int) (d * ((double) (d2.x - (i * 2))));
    }

    private void a(final mvs bl_mvs) {
        if (!this.r) {
            etb.a(2).post(new Runnable(this) {
                final /* synthetic */ dsc b;

                public void run() {
                    this.b.k.a(bl_mvs);
                }
            });
        }
        if (this.e != null) {
            etb.a(2).post(new Runnable(this) {
                final /* synthetic */ dsc b;

                public void run() {
                    this.b.e.a(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 68, (byte) 117, (byte) 117, (byte) 96, (byte) 107, (byte) 97, (byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112}), new Object[]{bl_mvs});
                }
            });
        }
    }

    private void i() {
        etb.a(0).post(new Runnable(this) {
            final /* synthetic */ dsc a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.q.get() == 2) {
                    this.a.q.getAndSet(0);
                } else {
                    this.a.g();
                }
            }
        });
    }

    private void j() {
        this.r = false;
        this.q.getAndSet(0);
        etb.a(0).post(new Runnable(this) {
            final /* synthetic */ dsc a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.b();
            }
        });
    }
}
