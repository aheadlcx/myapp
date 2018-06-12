package bili4.tv.danmaku.bili.ui.game.gift;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.RecyclerView.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl.fnd;
import bl.gnc;
import bl.hae;
import bl.kvy;
import bl.kwp;
import bl.kyg;
import bl.kyl;
import bl.lew;
import bl.lex;
import bl.lfe;
import bl.med;
import bl.mee;
import bl.pv;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bilibili.lib.image.ScalableImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import tv.danmaku.bili.ui.game.api.BiliGameCenterInfo.BiliGame;
import tv.danmaku.bili.ui.game.api.BiliGameGift;
import tv.danmaku.bili.ui.game.api.BiliGameGiftCenterInfo;
import tv.danmaku.bili.ui.game.api.BiliGameGiftCenterInfo.GameGiftList;
import u.aly.dd;
import u.aly.q;

/* compiled from: BL */
public class GameGiftCenterInfoFragment extends kyl {
    public static final String b = GameGiftCenterInfoFragment.class.getName();
    public static final String c = hae.a(new byte[]{(byte) 98, (byte) 108, (byte) 99, (byte) 113, (byte) 90, (byte) 99, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113});
    private a d;
    private b e;
    private boolean f;

    /* compiled from: BL */
    static class TitleVH extends bl.mee.a {
        @BindView
        RelativeLayout mGiftItem1;
        @BindView
        RelativeLayout mGiftItem2;
        @BindView
        RelativeLayout mGiftItem3;
        @BindView
        ScalableImageView mIvIcon;
        @BindView
        View mLine;
        @BindView
        TextView mTvMore;
        @BindView
        TextView mTvName;
        private GameGiftCenterActivity n;
        private a o;
        private RelativeLayout[] p = new RelativeLayout[3];

        public TitleVH(View view) {
            super(view);
            ButterKnife.a(this, view);
            Activity a = fnd.a(view.getContext());
            if (a instanceof GameGiftCenterActivity) {
                this.n = (GameGiftCenterActivity) a;
            }
            this.mGiftItem1.setVisibility(8);
            this.mGiftItem2.setVisibility(8);
            this.mGiftItem3.setVisibility(8);
            this.p[0] = this.mGiftItem1;
            this.p[1] = this.mGiftItem2;
            this.p[2] = this.mGiftItem3;
        }

        public void b(Object obj) {
            if (obj instanceof GameGiftList) {
                GameGiftList gameGiftList = (GameGiftList) obj;
                final List list = gameGiftList.gameGifts;
                int size = list.size();
                if (size > 0) {
                    int i;
                    final Object obj2;
                    int i2;
                    BiliGame biliGame;
                    BiliGameGift biliGameGift;
                    BiliGame biliGame2;
                    if (size >= 3) {
                        this.mLine.setVisibility(0);
                    } else {
                        this.mLine.setVisibility(8);
                    }
                    if (size > 0) {
                        String str = ((BiliGameGift) list.get(0)).icon;
                        if (str != null) {
                            this.mIvIcon.setImageURI(Uri.parse(str));
                            i = 1;
                            obj2 = gameGiftList.gameName;
                            if (obj2 == null) {
                                this.mTvName.setText(obj2);
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            if (!(this.o == null || this.o.a == null)) {
                                biliGame = (BiliGame) this.o.a.get(obj2);
                                if (biliGame != null) {
                                    if (biliGame.mName != null && r4 == 0) {
                                        this.mTvName.setText(biliGame.mName);
                                    }
                                    if (biliGame.mIconUrl != null && r1 == 0) {
                                        this.mIvIcon.setImageURI(Uri.parse(biliGame.mIconUrl));
                                    }
                                }
                            }
                            for (i2 = 0; i2 < size; i2++) {
                                biliGameGift = (BiliGameGift) list.get(i2);
                                biliGame2 = (BiliGame) this.o.a.get(obj2);
                                if (biliGame2 != null) {
                                    biliGameGift.pkgName = biliGame2.mPkgName;
                                    biliGameGift.url = biliGame2.mDownloadLink;
                                    biliGameGift.size = biliGame2.mApkSize;
                                    biliGameGift.sign = biliGame2.mApkSign;
                                    biliGameGift.gameId = biliGame2.mId;
                                    kvy.a().a(this.a.getContext(), biliGameGift.pkgName, 2);
                                }
                            }
                            i = 0;
                            while (i < size) {
                                switch (i) {
                                    case dd.a /*0*/:
                                    case q.a /*1*/:
                                    case dd.c /*2*/:
                                        this.p[i].setVisibility(0);
                                        GameGiftCenterInfoFragment.a(this.n, this.p[i], (BiliGameGift) list.get(i));
                                        i++;
                                    default:
                                        break;
                                }
                                if (size <= 3) {
                                    this.mTvMore.setVisibility(0);
                                    this.mTvMore.setText(String.format(Locale.getDefault(), hae.a(new byte[]{(byte) -23, (byte) -112, (byte) -86, (byte) -24, (byte) -109, (byte) -124, (byte) -22, (byte) -118, (byte) -89, (byte) -26, (byte) -116, (byte) -89, (byte) -24, (byte) -85, (byte) -77, (byte) -22, (byte) -125, (byte) -118, (byte) 45, (byte) 32, (byte) 97, (byte) 44}), new Object[]{Integer.valueOf(size)}));
                                    this.mTvMore.setOnClickListener(new OnClickListener(this) {
                                        final /* synthetic */ TitleVH c;

                                        public void onClick(View view) {
                                            if (this.c.n != null) {
                                                this.c.n.a(obj2, list);
                                            }
                                        }
                                    });
                                }
                                this.mTvMore.setVisibility(8);
                                return;
                            }
                            if (size <= 3) {
                                this.mTvMore.setVisibility(8);
                                return;
                            }
                            this.mTvMore.setVisibility(0);
                            this.mTvMore.setText(String.format(Locale.getDefault(), hae.a(new byte[]{(byte) -23, (byte) -112, (byte) -86, (byte) -24, (byte) -109, (byte) -124, (byte) -22, (byte) -118, (byte) -89, (byte) -26, (byte) -116, (byte) -89, (byte) -24, (byte) -85, (byte) -77, (byte) -22, (byte) -125, (byte) -118, (byte) 45, (byte) 32, (byte) 97, (byte) 44}), new Object[]{Integer.valueOf(size)}));
                            this.mTvMore.setOnClickListener(/* anonymous class already generated */);
                        }
                    }
                    i = 0;
                    obj2 = gameGiftList.gameName;
                    if (obj2 == null) {
                        i2 = 0;
                    } else {
                        this.mTvName.setText(obj2);
                        i2 = 1;
                    }
                    biliGame = (BiliGame) this.o.a.get(obj2);
                    if (biliGame != null) {
                        this.mTvName.setText(biliGame.mName);
                        this.mIvIcon.setImageURI(Uri.parse(biliGame.mIconUrl));
                    }
                    for (i2 = 0; i2 < size; i2++) {
                        biliGameGift = (BiliGameGift) list.get(i2);
                        biliGame2 = (BiliGame) this.o.a.get(obj2);
                        if (biliGame2 != null) {
                            biliGameGift.pkgName = biliGame2.mPkgName;
                            biliGameGift.url = biliGame2.mDownloadLink;
                            biliGameGift.size = biliGame2.mApkSize;
                            biliGameGift.sign = biliGame2.mApkSign;
                            biliGameGift.gameId = biliGame2.mId;
                            kvy.a().a(this.a.getContext(), biliGameGift.pkgName, 2);
                        }
                    }
                    i = 0;
                    while (i < size) {
                        switch (i) {
                            case dd.a /*0*/:
                            case q.a /*1*/:
                            case dd.c /*2*/:
                                this.p[i].setVisibility(0);
                                GameGiftCenterInfoFragment.a(this.n, this.p[i], (BiliGameGift) list.get(i));
                                i++;
                            default:
                                break;
                        }
                        if (size <= 3) {
                            this.mTvMore.setVisibility(0);
                            this.mTvMore.setText(String.format(Locale.getDefault(), hae.a(new byte[]{(byte) -23, (byte) -112, (byte) -86, (byte) -24, (byte) -109, (byte) -124, (byte) -22, (byte) -118, (byte) -89, (byte) -26, (byte) -116, (byte) -89, (byte) -24, (byte) -85, (byte) -77, (byte) -22, (byte) -125, (byte) -118, (byte) 45, (byte) 32, (byte) 97, (byte) 44}), new Object[]{Integer.valueOf(size)}));
                            this.mTvMore.setOnClickListener(/* anonymous class already generated */);
                        }
                        this.mTvMore.setVisibility(8);
                        return;
                    }
                    if (size <= 3) {
                        this.mTvMore.setVisibility(8);
                        return;
                    }
                    this.mTvMore.setVisibility(0);
                    this.mTvMore.setText(String.format(Locale.getDefault(), hae.a(new byte[]{(byte) -23, (byte) -112, (byte) -86, (byte) -24, (byte) -109, (byte) -124, (byte) -22, (byte) -118, (byte) -89, (byte) -26, (byte) -116, (byte) -89, (byte) -24, (byte) -85, (byte) -77, (byte) -22, (byte) -125, (byte) -118, (byte) 45, (byte) 32, (byte) 97, (byte) 44}), new Object[]{Integer.valueOf(size)}));
                    this.mTvMore.setOnClickListener(/* anonymous class already generated */);
                }
            }
        }

        private static TitleVH b(ViewGroup viewGroup, a aVar) {
            TitleVH titleVH = new TitleVH(LayoutInflater.from(viewGroup.getContext()).inflate(2131428041, viewGroup, false));
            titleVH.o = aVar;
            return titleVH;
        }
    }

    /* compiled from: BL */
    static class a extends mee<bl.mee.a> {
        private HashMap<String, BiliGame> a;
        private c b;

        private a() {
            this.a = new HashMap();
        }

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public bl.mee.a a(ViewGroup viewGroup, int i) {
            return TitleVH.b(viewGroup, this);
        }

        public void a(bl.mee.a aVar, int i) {
            super.a(aVar, i);
        }

        public void a(BiliGameGiftCenterInfo biliGameGiftCenterInfo) {
            if (biliGameGiftCenterInfo != null && biliGameGiftCenterInfo.gameGifts != null && biliGameGiftCenterInfo.gameGifts.size() != 0) {
                if (this.b == null) {
                    this.b = new c(biliGameGiftCenterInfo.gameGifts);
                    b(this.b);
                }
                d(true);
            }
        }

        public void b() {
            if (this.b != null) {
                c(this.b);
                this.b = null;
            }
        }

        public void a(HashMap<String, BiliGame> hashMap) {
            this.a = hashMap;
        }
    }

    /* compiled from: BL */
    class b extends gnc<BiliGameGiftCenterInfo> {
        final /* synthetic */ GameGiftCenterInfoFragment a;

        private b(GameGiftCenterInfoFragment gameGiftCenterInfoFragment) {
            this.a = gameGiftCenterInfoFragment;
        }

        public /* synthetic */ void b(Object obj) {
            a((BiliGameGiftCenterInfo) obj);
        }

        public boolean a() {
            return !this.a.isAdded();
        }

        public void a(BiliGameGiftCenterInfo biliGameGiftCenterInfo) {
            this.a.d();
            if (biliGameGiftCenterInfo == null || biliGameGiftCenterInfo.gameGifts == null || biliGameGiftCenterInfo.gameGifts.size() == 0) {
                this.a.f();
                this.a.b().setVisibility(8);
            } else if (this.a.d != null) {
                if (this.a.f) {
                    this.a.d.b();
                }
                this.a.d.a(biliGameGiftCenterInfo);
            }
        }

        public void a(Throwable th) {
            this.a.d();
            this.a.e();
            this.a.b().setVisibility(8);
        }
    }

    /* compiled from: BL */
    static class c extends med {
        public List<GameGiftList> a;

        public c(List<GameGiftList> list) {
            this.a = list;
        }

        public Object a(int i) {
            return this.a.get(i);
        }

        public int a() {
            return this.a == null ? 0 : this.a.size();
        }

        public int b(int i) {
            return 0;
        }

        public long c_(int i) {
            return (((long) b(i)) << 32) + ((long) i);
        }
    }

    /* compiled from: BL */
    public static class d extends g {
        public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
            int f = ((h) view.getLayoutParams()).f();
            int a = lew.a(15);
            if (f == 0) {
                rect.set(0, a, 0, a);
            } else {
                rect.set(0, 0, 0, a);
            }
        }
    }

    public static GameGiftCenterInfoFragment a(ArrayList<BiliGame> arrayList) {
        GameGiftCenterInfoFragment gameGiftCenterInfoFragment = new GameGiftCenterInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(hae.a(new byte[]{(byte) 98, (byte) 108, (byte) 99, (byte) 113, (byte) 90, (byte) 99, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113}), arrayList);
        gameGiftCenterInfoFragment.setArguments(bundle);
        return gameGiftCenterInfoFragment;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.d = new a();
        this.d.b(true);
        this.e = new b();
    }

    public void a(RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.a(recyclerView, bundle);
        ((LayoutParams) this.a.getLayoutParams()).topMargin = getResources().getDisplayMetrics().heightPixels / 3;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.d(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new d());
        recyclerView.setAdapter(this.d);
        if (!(getArguments() == null || getArguments().getParcelableArrayList(hae.a(new byte[]{(byte) 98, (byte) 108, (byte) 99, (byte) 113, (byte) 90, (byte) 99, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113})) == null)) {
            List<BiliGame> parcelableArrayList = getArguments().getParcelableArrayList(hae.a(new byte[]{(byte) 98, (byte) 108, (byte) 99, (byte) 113, (byte) 90, (byte) 99, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113}));
            if (parcelableArrayList != null) {
                HashMap hashMap = new HashMap();
                for (BiliGame biliGame : parcelableArrayList) {
                    hashMap.put(biliGame.mName, biliGame);
                }
                this.d.a(hashMap);
            }
        }
        c();
    }

    public void onResume() {
        super.onResume();
        g();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.d = null;
        this.e = null;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    private void g() {
        lex.c(this.e);
    }

    public void a() {
        this.f = true;
        g();
    }

    public static void a(final kyg bl_kyg, RelativeLayout relativeLayout, final BiliGameGift biliGameGift) {
        TextView textView = (TextView) ButterKnife.a(relativeLayout, 2131300682);
        TextView textView2 = (TextView) ButterKnife.a(relativeLayout, 2131297097);
        FrameLayout frameLayout = (FrameLayout) ButterKnife.a(relativeLayout, 2131296269);
        TextView textView3 = (TextView) ButterKnife.a(relativeLayout, 2131300315);
        if (biliGameGift.name != null) {
            textView.setText(biliGameGift.name);
        }
        if (biliGameGift.content != null) {
            textView2.setText(biliGameGift.content);
        }
        frameLayout.setVisibility(0);
        lew.a(frameLayout, fnd.a(bl_kyg, 2131100837), true);
        switch (biliGameGift.status) {
            case dd.a /*0*/:
            case dd.d /*3*/:
                frameLayout.setVisibility(4);
                return;
            case q.a /*1*/:
                relativeLayout.setOnClickListener(new pv() {
                    public void a(View view) {
                        int i;
                        if (biliGameGift.receiveStatus != 0) {
                            i = 4;
                        } else if (kwp.c(bl_kyg, biliGameGift.pkgName)) {
                            i = 3;
                        } else {
                            i = 1;
                        }
                        if (bl_kyg.getSupportFragmentManager().findFragmentByTag(lfe.a) == null) {
                            lfe.a(biliGameGift, i).show(bl_kyg.getSupportFragmentManager(), lfe.a);
                            bl_kyg.getFragmentManager().executePendingTransactions();
                        }
                    }
                });
                if (biliGameGift.receiveStatus == 0) {
                    textView3.setText(bl_kyg.getString(2131691754));
                    textView3.setTextColor(fnd.a(bl_kyg, 2131100837));
                    return;
                } else if (biliGameGift.receiveStatus == 1) {
                    lew.a(frameLayout, 0, false);
                    textView3.setText(bl_kyg.getString(2131691743));
                    textView3.setTextColor(fnd.a(bl_kyg, 2131099889));
                    return;
                } else {
                    return;
                }
            case dd.c /*2*/:
                relativeLayout.setOnClickListener(new pv() {
                    public void a(View view) {
                        int i;
                        if (biliGameGift.receiveStatus != 0) {
                            i = 4;
                        } else if (kwp.c(bl_kyg, biliGameGift.pkgName)) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        if (bl_kyg.getSupportFragmentManager().findFragmentByTag(lfe.a) == null) {
                            lfe.a(biliGameGift, i).show(bl_kyg.getSupportFragmentManager(), lfe.a);
                            bl_kyg.getFragmentManager().executePendingTransactions();
                        }
                    }
                });
                if (biliGameGift.receiveStatus == 0) {
                    textView3.setText(bl_kyg.getString(2131691762));
                    textView3.setTextColor(fnd.a(bl_kyg, 2131100837));
                    return;
                } else if (biliGameGift.receiveStatus == 1) {
                    lew.a(frameLayout, 0, false);
                    textView3.setText(bl_kyg.getString(2131691743));
                    textView3.setTextColor(fnd.a(bl_kyg, 2131099889));
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
