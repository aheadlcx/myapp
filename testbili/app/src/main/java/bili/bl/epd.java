package bili.bl;

import android.content.Context;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v7.widget.RecyclerView.u;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bilibili.column.api.Article;
import com.bilibili.column.api.Author;
import com.bilibili.column.api.ColumnArticleList;
import com.bilibili.column.widget.ExpandableTextView;
import com.bilibili.column.widget.PendantAvatarLayout;
import com.bilibili.column.widget.PendantAvatarLayout.VerifySize;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
public class epd extends android.support.v7.widget.RecyclerView.a {
    private static int c = 0;
    private static int d = 1;
    public ColumnArticleList a;
    public int b = 0;
    private List<Article> e;
    private Author f;
    private a g;
    private long h = 0;
    private Context i;
    private b j;
    private OnClickListener k = new OnClickListener(this) {
        final /* synthetic */ epd a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            a aVar = (a) view.getTag();
            if (this.a.h != aVar.p.id) {
                this.a.a(this.a.g);
                this.a.b(aVar);
            }
            if (this.a.j != null) {
                this.a.j.a(this.a.h);
            }
        }
    };
    private OnClickListener l = new OnClickListener(this) {
        final /* synthetic */ epd a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            c cVar = (c) view.getTag();
            if (view.getId() == cVar.o.getId()) {
                if (this.a.j != null) {
                    this.a.j.e();
                }
            } else if (view.getId() == cVar.n.getId()) {
                if (this.a.f != null) {
                    eog.b(view.getContext(), this.a.f.mid, this.a.f.name);
                }
            } else if (view.getId() == cVar.v.getId()) {
                this.a.c();
            }
        }
    };

    /* compiled from: BL */
    static class a extends u {
        ImageView n;
        TextView o;
        Article p;

        a(View view) {
            super(view);
            this.n = (ImageView) view.findViewById(2131298111);
            this.o = (TextView) view.findViewById(2131300682);
        }

        public static a a(ViewGroup viewGroup) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131428562, viewGroup, false));
        }
    }

    /* compiled from: BL */
    public interface b {
        void a(long j);

        void a(boolean z);

        void e();
    }

    /* compiled from: BL */
    static class c extends u {
        TextView A;
        View B;
        PendantAvatarLayout n;
        TextView o;
        TextView p;
        TextView q;
        ImageView r;
        SimpleDraweeView s;
        ExpandableTextView t;
        TextView u;
        TextView v;
        TextView w;
        TextView x;
        TextView y;
        ImageView z;

        c(View view) {
            super(view);
            this.n = (PendantAvatarLayout) view.findViewById(2131301089);
            this.o = (TextView) view.findViewById(2131296696);
            this.p = (TextView) view.findViewById(2131296376);
            this.q = (TextView) view.findViewById(2131301098);
            this.r = (ImageView) view.findViewById(2131298914);
            this.s = (SimpleDraweeView) view.findViewById(2131297178);
            this.t = (ExpandableTextView) view.findViewById(2131297328);
            this.u = (TextView) view.findViewById(2131297151);
            this.v = (TextView) view.findViewById(2131299137);
            this.w = (TextView) view.findViewById(2131299571);
            this.x = (TextView) view.findViewById(2131301339);
            this.y = (TextView) view.findViewById(2131301075);
            this.z = (ImageView) view.findViewById(2131297535);
            this.A = (TextView) view.findViewById(2131297536);
            this.B = view.findViewById(2131297144);
        }

        public static c a(ViewGroup viewGroup) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(2131428603, viewGroup, false));
        }
    }

    public epd(Context context) {
        this.i = context;
    }

    public epd(Context context, long j) {
        this.h = j;
        this.i = context;
    }

    public void a(b bVar) {
        this.j = bVar;
    }

    public void a(long j) {
        this.h = j;
        h();
    }

    private void h() {
        if (this.e != null && this.e.size() > 0) {
            for (int i = 0; i < this.e.size(); i++) {
                if (((Article) this.e.get(i)).id == this.h) {
                    this.b = i + 1;
                    return;
                }
            }
        }
    }

    public long b() {
        return this.h;
    }

    public void a(ColumnArticleList columnArticleList) {
        if (columnArticleList != null) {
            this.a = columnArticleList;
            this.e = columnArticleList.getArticles();
            this.f = columnArticleList.getAuthor();
            this.f.setAttention(columnArticleList.isAttention());
            h();
        }
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.n.setImageResource(2131233794);
            aVar.o.setTextColor(this.i.getResources().getColor(2131099903));
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.n.setImageResource(2131233956);
            aVar.o.setTextColor(this.i.getResources().getColor(2131100457));
            this.g = aVar;
            this.h = aVar.p.id;
            h();
        }
    }

    public u b(ViewGroup viewGroup, int i) {
        if (i == c) {
            return c.a(viewGroup);
        }
        if (i == d) {
            return a.a(viewGroup);
        }
        return null;
    }

    public void a(u uVar, int i) {
        if (uVar instanceof c) {
            a(i, (c) uVar);
        } else if (uVar instanceof a) {
            a(i, (a) uVar);
        }
    }

    private void a(int i, a aVar) {
        aVar.a.setTag(aVar);
        if (i > 0 && i < a()) {
            Article article = (Article) this.e.get(i - 1);
            a(aVar.o, article.title, ens.b(article.publishTime * 1000));
            aVar.p = article;
            if (article.id == this.h) {
                b(aVar);
            } else {
                a(aVar);
            }
        }
        aVar.a.setOnClickListener(this.k);
    }

    private void a(TextView textView, String str, String str2) {
        Object obj;
        CharSequence charSequence;
        LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
        int a = (ens.a(textView.getContext()) - layoutParams.leftMargin) - layoutParams.rightMargin;
        int i = a * 2;
        CharSequence spannableString = new SpannableString("   " + str2);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(-7829368), 0, spannableString.length(), 33);
        float desiredWidth = Layout.getDesiredWidth(spannableString, textView.getPaint());
        String str3 = BuildConfig.VERSION_NAME;
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length()) {
            CharSequence substring = str.substring(0, i3 + 1);
            float desiredWidth2 = Layout.getDesiredWidth(substring, textView.getPaint());
            if (i2 == 0 && desiredWidth2 < ((float) a)) {
                if (a(str.charAt(i3))) {
                    int i4 = 1;
                    for (int i5 = i3; i5 < str.length(); i5++) {
                        if (!a(str.charAt(i5))) {
                            break;
                        }
                        if (i5 + i4 < str.length()) {
                            if (!a(str.charAt(i5 + i4))) {
                                break;
                            }
                            i4++;
                            if (i3 + i4 < str.length()) {
                                if (((float) a) - desiredWidth2 < Layout.getDesiredWidth(str.substring(i3, i3 + i4), textView.getPaint()) + 20.0f) {
                                    i2 = i5;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if (((float) i) - desiredWidth2 < 50.0f + desiredWidth) {
                obj = 1;
                break;
            } else {
                i3++;
                CharSequence charSequence2 = substring;
            }
        }
        obj = null;
        if (i2 == 0 || i2 + 2 >= str3.length()) {
            Object obj2 = str3;
        } else {
            charSequence = str3.substring(0, i2 + 2) + "\n" + str3.substring(i2 + 2);
        }
        if (obj != null) {
            charSequence = charSequence.substring(0, charSequence.length() - 1).concat("...");
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append(spannableString);
        textView.setText(spannableStringBuilder);
    }

    private boolean a(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private void a(int i, c cVar) {
        if (this.f != null) {
            cVar.o.setTag(cVar);
            cVar.n.setTag(cVar);
            cVar.v.setTag(cVar);
            Author author = this.f;
            if (!(this.a == null || this.a.list == null)) {
                if (ert.a(this.a.list.summary)) {
                    cVar.t.setOriginText(new com.bilibili.column.widget.ExpandableTextView.b(this.i.getString(2131690725)));
                } else {
                    cVar.t.setOriginText(new com.bilibili.column.widget.ExpandableTextView.b(this.a.list.summary));
                }
                cVar.s.setImageURI(this.a.list.imageUrl);
                cVar.u.setText(this.i.getString(2131690720, new Object[]{Long.valueOf(this.a.list.articlesCount)}));
                if (this.a.list.publishTime == 0) {
                    cVar.y.setText(this.i.getString(2131690807));
                } else {
                    cVar.y.setText(this.i.getString(2131690726, new Object[]{ens.b(this.a.list.publishTime * 1000)}));
                }
                cVar.x.setText(this.i.getString(2131690728, new Object[]{enl.a(this.a.list.words, "0")}));
                cVar.w.setText(this.i.getString(2131690724, new Object[]{enl.a(this.a.list.read, "0")}));
            }
            CharSequence name = author.getName();
            if (author.getName().length() > 12) {
                name = author.getName().substring(0, 12) + "...";
            }
            cVar.q.setText(name);
            cVar.p.setText(g());
            if (!(author.getOfficialVerify() == null || this.f.pendant == null)) {
                cVar.n.a(this.f.face, this.f.pendant.image);
                cVar.n.a(this.f.officialVerify, VerifySize.SMALL);
            }
            if (!(cVar.r == null || this.f.pendant == null)) {
                fci.g().a(this.f.namePlate.image, cVar.r);
            }
            if (author.isAttention()) {
                cVar.o.setSelected(true);
                cVar.o.setTextColor(this.i.getResources().getColor(2131099855));
                cVar.o.setText("\u5df2\u5173\u6ce8");
            } else {
                cVar.o.setSelected(false);
                cVar.o.setTextColor(this.i.getResources().getColor(2131099856));
                cVar.o.setText("\u5173\u6ce8");
            }
            String str = BuildConfig.VERSION_NAME;
            if (this.a.order) {
                name = this.i.getString(2131690723);
            } else {
                name = this.i.getString(2131690722);
            }
            cVar.v.setText(name);
            if (this.a.list.articlesCount == 0) {
                cVar.B.setVisibility(8);
                cVar.A.setVisibility(0);
                cVar.z.setVisibility(0);
                cVar.a.getLayoutParams().height = -1;
            } else {
                cVar.B.setVisibility(0);
                cVar.A.setVisibility(8);
                cVar.z.setVisibility(8);
                cVar.a.getLayoutParams().height = -2;
            }
            cVar.v.setOnClickListener(this.l);
            cVar.n.setOnClickListener(this.l);
            cVar.o.setOnClickListener(this.l);
        }
    }

    public int a() {
        int i = 0;
        if (!(this.a == null || this.a.author == null)) {
            i = 1;
        }
        if (this.a == null || this.a.articles == null) {
            return i;
        }
        return i + this.a.articles.size();
    }

    public void c() {
        if (this.e != null && this.e.size() > 0) {
            Collections.reverse(this.e);
            if (this.j != null) {
                this.a.order = !this.a.order;
                this.j.a(this.a.order);
            }
            f();
        }
    }

    public int b(int i) {
        if (i == 0) {
            return c;
        }
        return d;
    }

    public String g() {
        if (this.a == null || this.a.list == null) {
            return null;
        }
        return this.a.list.name;
    }

    public void a(boolean z) {
        if (this.f != null) {
            this.f.setAttention(z);
        }
        d(0);
    }
}
