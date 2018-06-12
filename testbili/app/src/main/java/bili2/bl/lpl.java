package bili2.bl;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bilibili.lib.image.ScalableImageView;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.search.api.Column;

/* compiled from: BL */
class lpl extends meo implements OnClickListener {
    private static final String a = hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109, (byte) 87, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 70, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 68, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119});
    private List<Object> b;

    /* compiled from: BL */
    static class a extends meq {
        public TextView n;
        public ScalableImageView o;
        public TextView p;
        public TextView q;
        public TextView r;
        public TextView s;

        public static a a(ViewGroup viewGroup, mel bl_mel) {
            return new a(ept.h(2, viewGroup), bl_mel);
        }

        a(View view, mel bl_mel) {
            super(view, bl_mel);
            this.n = (TextView) view.findViewById(2131300682);
            this.o = (ScalableImageView) view.findViewById(2131297178);
            this.p = (TextView) view.findViewById(2131298009);
            this.q = (TextView) view.findViewById(2131301258);
            this.r = (TextView) view.findViewById(2131298532);
            this.s = (TextView) view.findViewById(2131297077);
            if (this.o != null) {
                int[] a = ent.a(view.getContext().getResources().getDisplayMetrics().widthPixels, 2);
                this.o.setThumbWidth((float) a[0]);
                this.o.setThumbHeight((float) a[1]);
            }
        }

        public void b(Object obj) {
            if (obj instanceof Column) {
                Column column = (Column) obj;
                if (this.n != null) {
                    this.n.setText(low.a(this.a.getContext(), column.title));
                }
                if (this.o != null) {
                    fci.g().a(a(column.imageUrls, 0), this.o);
                }
                if (this.p != null) {
                    this.p.setText(column.name);
                }
                if (this.q != null) {
                    this.q.setText(mbw.a(column.view, "0"));
                }
                if (this.r != null) {
                    this.r.setText(mbw.a(column.like, "0"));
                }
                if (this.s != null) {
                    this.s.setText(mbw.a(column.reply, "0"));
                }
            }
        }

        private String a(List<String> list, int i) {
            if (list == null || list.isEmpty()) {
                return gmy.d;
            }
            int size = list.size();
            if (i < 0 || i >= size) {
                return gmy.d;
            }
            return (String) list.get(i);
        }
    }

    /* compiled from: BL */
    static class b extends meq {
        public TextView n;
        public ScalableImageView o;
        public ScalableImageView p;
        public ScalableImageView q;
        public TextView r;
        public TextView s;
        public TextView t;
        public TextView u;

        public static b a(ViewGroup viewGroup, mel bl_mel) {
            return new b(ept.i(2, viewGroup), bl_mel);
        }

        b(View view, mel bl_mel) {
            super(view, bl_mel);
            this.n = (TextView) view.findViewById(2131300682);
            this.o = (ScalableImageView) view.findViewById(2131297179);
            this.p = (ScalableImageView) view.findViewById(2131297180);
            this.q = (ScalableImageView) view.findViewById(2131297181);
            this.r = (TextView) view.findViewById(2131298009);
            this.s = (TextView) view.findViewById(2131301258);
            this.t = (TextView) view.findViewById(2131298532);
            this.u = (TextView) view.findViewById(2131297077);
            if (this.o != null) {
                int[] a = ent.a(view.getContext().getResources().getDisplayMetrics().widthPixels / 3, 1);
                this.o.setThumbWidth((float) a[0]);
                this.o.setThumbHeight((float) a[1]);
            }
            if (this.p != null) {
                a = ent.a(view.getContext().getResources().getDisplayMetrics().widthPixels / 3, 1);
                this.p.setThumbWidth((float) a[0]);
                this.p.setThumbHeight((float) a[1]);
            }
            if (this.q != null) {
                a = ent.a(view.getContext().getResources().getDisplayMetrics().widthPixels / 3, 1);
                this.q.setThumbWidth((float) a[0]);
                this.q.setThumbHeight((float) a[1]);
            }
        }

        public void b(Object obj) {
            if (obj instanceof Column) {
                Column column = (Column) obj;
                if (this.n != null) {
                    this.n.setText(low.a(this.a.getContext(), column.title));
                }
                if (this.o != null) {
                    fci.g().a(a(column.imageUrls, 0), this.o);
                }
                if (this.p != null) {
                    fci.g().a(a(column.imageUrls, 1), this.p);
                }
                if (this.q != null) {
                    fci.g().a(a(column.imageUrls, 2), this.q);
                }
                if (this.r != null) {
                    this.r.setText(column.name);
                }
                if (this.s != null) {
                    this.s.setText(mbw.a(column.view, "0"));
                }
                if (this.t != null) {
                    this.t.setText(mbw.a(column.like, "0"));
                }
                if (this.u != null) {
                    this.u.setText(mbw.a(column.reply, "0"));
                }
            }
        }

        private String a(List<String> list, int i) {
            if (list == null || list.isEmpty()) {
                return gmy.d;
            }
            int size = list.size();
            if (i < 0 || i >= size) {
                return gmy.d;
            }
            return (String) list.get(i);
        }
    }

    public void a(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    protected void a(bl.mem.b bVar) {
        int size;
        if (this.b != null) {
            size = this.b.size();
        } else {
            size = 0;
        }
        for (int i = 0; i < size; i++) {
            Object obj = this.b.get(i);
            if (obj instanceof Column) {
                switch (((Column) obj).templateId) {
                    case 3:
                        bVar.a(1, 3);
                        break;
                    case 4:
                        bVar.a(1, 4);
                        break;
                    default:
                        bVar.a(0, -2233);
                        break;
                }
            }
        }
    }

    protected meq a_(ViewGroup viewGroup, int i) {
        switch (i) {
            case 3:
                return b.a(viewGroup, (mel) this);
            case 4:
                return a.a(viewGroup, (mel) this);
            default:
                return null;
        }
    }

    protected void a_(meq bl_meq, int i, View view) {
        int size = this.b == null ? 0 : this.b.size();
        if (i >= 0 && i < size) {
            if (bl_meq instanceof a) {
                ((a) bl_meq).b(this.b.get(i));
                view.setTag(this.b.get(i));
                view.setOnClickListener(this);
            }
            if (bl_meq instanceof b) {
                ((b) bl_meq).b(this.b.get(i));
                view.setTag(this.b.get(i));
                view.setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof Column) {
            kyq.a(view.getContext(), Uri.parse(((Column) tag).uri + hae.a(new byte[]{(byte) 58, (byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 56, (byte) 52, (byte) 48})));
        }
    }
}
