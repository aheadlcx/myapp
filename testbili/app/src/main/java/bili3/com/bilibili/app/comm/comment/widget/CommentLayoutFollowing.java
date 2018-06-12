package bili3.com.bilibili.app.comm.comment.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import bl.aor;
import bl.aox;
import bl.apd;
import bl.esu;
import bl.eva;
import bl.fks;
import bl.fnd;
import com.bilibili.app.comm.comment.api.BiliComment;

/* compiled from: BL */
public class CommentLayoutFollowing extends CommentLayoutV2 {
    TextView y;
    a z;

    /* compiled from: BL */
    public interface a {
        void a(BiliComment biliComment);

        void a(Throwable th);
    }

    /* compiled from: BL */
    public class b implements a {
        final /* synthetic */ CommentLayoutFollowing a;
        private Context b;
        private BiliComment c;

        public b(CommentLayoutFollowing commentLayoutFollowing, Context context, BiliComment biliComment) {
            this.a = commentLayoutFollowing;
            this.b = context;
            this.c = biliComment;
        }

        public void a(BiliComment biliComment) {
            Activity a = fnd.a(this.b);
            if (a != null && !a.isFinishing() && this.c != null) {
                this.c.setFollowStatus(!this.c.isFollowed());
                if (this.a.z != null) {
                    this.a.z.a(this.c);
                }
                esu.b(this.b, this.c.isFollowed() ? 2131690972 : 2131690971);
            }
        }

        public void a(Throwable th) {
            Activity a = fnd.a(this.b);
            if (a != null && !a.isFinishing() && this.c != null) {
                aor.a(this.b, th, this.c.isFollowed());
                if (this.a.z != null) {
                    this.a.z.a(th);
                }
            }
        }
    }

    public CommentLayoutFollowing(Context context) {
        this(context, null);
    }

    public CommentLayoutFollowing(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentLayoutFollowing(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected View a(Context context) {
        return LayoutInflater.from(context).inflate(2131428027, this, true);
    }

    protected void a(final Context context, ViewGroup viewGroup) {
        super.a(context, viewGroup);
        this.y = (TextView) apd.a(viewGroup, 2131297753);
        this.y.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ CommentLayoutFollowing b;

            public void onClick(View view) {
                if (!(view.getTag() instanceof BiliComment)) {
                    return;
                }
                if (eva.a(context).a()) {
                    final BiliComment biliComment = (BiliComment) view.getTag();
                    if (biliComment.isFollowed()) {
                        new bl.jp.a(context).a(true).b(2131690954).a(2131690953, new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                aox.a(context, biliComment.mMid, 2, biliComment.mType, new b(this.b.b, context, biliComment));
                            }
                        }).b(2131690952, new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).b().show();
                        return;
                    } else {
                        aox.a(context, biliComment.mMid, 1, biliComment.mType, new b(this.b, context, biliComment));
                        return;
                    }
                }
                aor.b(context);
            }
        });
    }

    public void a(BiliComment biliComment, fks bl_fks) {
        super.a(biliComment, bl_fks);
        if (biliComment != null && !biliComment.checkCommentBlock()) {
            this.y.setText(biliComment.isFollowed() ? 2131690973 : 2131690970);
            this.y.setSelected(biliComment.isFollowed());
            this.y.setTag(biliComment);
        }
    }

    public void a(Activity activity, BiliComment biliComment) {
        super.a(activity, biliComment);
        if (activity != null && !activity.isFinishing() && this.y != null) {
            this.y.setVisibility(8);
        }
    }

    protected void b() {
        if (this.g.getWidth() == 0) {
            Paint paint = new Paint();
            paint.setTextSize(this.g.getTextSize());
            this.g.setWidth((int) paint.measureText(this.g.getText().toString()));
        }
        if (this.D.getVisibility() != 8 && this.D.getWidth() == 0) {
            this.D.b();
        }
        int left = this.y.getLeft();
        int width = ((left - this.D.getWidth()) - this.g.getWidth()) - (((MarginLayoutParams) this.n.getLayoutParams()).leftMargin + (this.n.getWidth() + w));
        if (width < 0) {
            this.g.setMaxWidth(width + this.g.getWidth());
            this.n.layout(this.g.getRight() + ((MarginLayoutParams) this.n.getLayoutParams()).leftMargin, this.n.getTop(), ((MarginLayoutParams) this.n.getLayoutParams()).leftMargin + (this.n.getWidth() + this.g.getRight()), this.n.getBottom());
        }
    }

    public void setCommentFollowCallback(a aVar) {
        this.z = aVar;
    }
}
