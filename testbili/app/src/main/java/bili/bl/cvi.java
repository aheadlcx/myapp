package bili.bl;

import android.content.Context;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v7.widget.RecyclerView.u;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bilibili.bililive.privateletter.msg.ChatRoomActivity;
import com.bilibili.bililive.privateletter.msg.api.BiliChatRoom;
import com.bilibili.bililive.privateletter.notification.NotificationManager;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
public class cvi extends android.support.v7.widget.RecyclerView.a<a> {
    public BiliChatRoom[] a = new BiliChatRoom[0];
    public Map<String, String> b = Collections.emptyMap();
    private b c;

    /* compiled from: BL */
    public class a extends u {
        TextView n;
        TextView o;
        TextView p;
        ImageView q;
        RelativeLayout r;
        crt s;
        final /* synthetic */ cvi t;

        public a(final cvi bl_cvi, View view) {
            this.t = bl_cvi;
            super(view);
            this.q = (ImageView) view.findViewById(2131296504);
            this.p = (TextView) view.findViewById(2131298903);
            this.o = (TextView) view.findViewById(2131298809);
            this.n = (TextView) view.findViewById(2131300623);
            this.r = (RelativeLayout) view.findViewById(2131298492);
            this.s = new crt(this, a()) {
                final /* synthetic */ a P;

                public int getLightColor() {
                    return fnd.a(getContext(), 2131100837);
                }

                public int getDarkColor() {
                    return -3618616;
                }
            };
            this.s.setLight(true);
            this.s.a(this.r);
            this.s.c(8388693);
            this.s.a(10.0f, 12.0f, true);
            this.s.a(12.0f, true);
            this.s.b(5.0f, true);
            this.s.b(false);
        }

        public Context a() {
            return this.a.getContext();
        }
    }

    /* compiled from: BL */
    public interface b {
        void a(View view, BiliChatRoom biliChatRoom, int i);

        void a(BiliChatRoom biliChatRoom);
    }

    public /* synthetic */ u b(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }

    public a a(ViewGroup viewGroup, int i) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131428987, viewGroup, false));
    }

    public void a(a aVar, int i) {
        a(aVar, this.a[i], i);
    }

    public int a() {
        return this.a == null ? 0 : this.a.length;
    }

    public void a(final a aVar, final BiliChatRoom biliChatRoom, final int i) {
        aVar.r.setBackgroundResource(2131100865);
        if (TextUtils.isEmpty(biliChatRoom.mAvatar)) {
            aVar.q.setImageResource(2131233211);
        } else {
            cmq.a(aVar.a(), aVar.q, biliChatRoom.mAvatar, 2131233211);
        }
        aVar.p.setText(biliChatRoom.mName);
        if (this.b == null || TextUtils.isEmpty((CharSequence) this.b.get(biliChatRoom.mId))) {
            aVar.o.setText(biliChatRoom.mLastMsg);
        } else {
            aVar.o.setText(aVar.a().getString(2131691977, new Object[]{this.b.get(biliChatRoom.mId)}));
            CharSequence spannableStringBuilder = new SpannableStringBuilder(aVar.o.getText().toString());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(aVar.a().getResources().getColor(2131100414)), 0, 4, 33);
            aVar.o.setText(spannableStringBuilder);
        }
        aVar.n.setText(dhz.a(biliChatRoom.mLastTime));
        if (biliChatRoom.mMsgCount > 0) {
            aVar.s.a(biliChatRoom.mMsgCount + BuildConfig.VERSION_NAME);
            aVar.s.setVisibility(0);
        } else {
            aVar.s.setVisibility(8);
        }
        aVar.a.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ cvi c;

            public void onClick(View view) {
                if (this.c.c != null) {
                    this.c.c.a(biliChatRoom);
                }
                NotificationManager.a(aVar.a()).a(biliChatRoom.mMsgCount);
                aVar.a().startActivity(ChatRoomActivity.a(aVar.a(), biliChatRoom));
                biliChatRoom.mMsgCount = 0;
                if (aVar.s != null) {
                    aVar.s.setVisibility(8);
                }
            }
        });
        aVar.a.setOnLongClickListener(new OnLongClickListener(this) {
            final /* synthetic */ cvi d;

            public boolean onLongClick(View view) {
                aVar.r.setBackgroundResource(2131099872);
                if (this.d.c != null) {
                    this.d.c.a(aVar.r, biliChatRoom, i);
                }
                return false;
            }
        });
    }

    public void a(b bVar) {
        this.c = bVar;
    }
}
