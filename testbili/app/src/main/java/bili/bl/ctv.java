package bili.bl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.bilibili.bilibililive.im.entity.User;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class ctv extends BaseAdapter {
    private static final String a = hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 102, (byte) 96, (byte) 77, (byte) 106, (byte) 105, (byte) 97, (byte) 96, (byte) 119});
    private Context b;
    private List<User> c;
    private boolean d = true;

    /* compiled from: BL */
    static class a {
        ImageView a;

        a() {
        }
    }

    public ctv(Context context, ArrayList<User> arrayList, boolean z) {
        this.b = context;
        this.d = z;
        if (arrayList == null || arrayList.size() <= 0) {
            this.c = new ArrayList();
            return;
        }
        this.c = arrayList;
        a();
    }

    private void a() {
        if (this.d) {
            User user = new User();
            user.setId(-1);
            user.setFace(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 102, (byte) 96, (byte) 77, (byte) 106, (byte) 105, (byte) 97, (byte) 96, (byte) 119}));
            if (this.c.size() > 9) {
                this.c.set(9, user);
            } else {
                this.c.add(user);
            }
        }
    }

    public int getCount() {
        return this.c.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public Object getItem(int i) {
        return this.c.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            aVar = new a();
            view = LayoutInflater.from(this.b).inflate(2131428932, viewGroup, false);
            aVar.a = (ImageView) view.findViewById(2131296504);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        User user = (User) this.c.get(i);
        if (user != null) {
            String face = user.getFace();
            if (face != null) {
                if (face.equals(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 102, (byte) 96, (byte) 77, (byte) 106, (byte) 105, (byte) 97, (byte) 96, (byte) 119}))) {
                    aVar.a.setImageResource(2131233178);
                } else {
                    cmq.a(this.b, aVar.a, face, 2131233502);
                }
            }
        }
        return view;
    }

    public void a(List<User> list) {
        for (int i = 0; i < this.c.size(); i++) {
            User user = (User) this.c.get(i);
            for (User user2 : list) {
                if (user.getId() == user2.getId()) {
                    this.c.set(i, user2);
                    break;
                }
            }
        }
        notifyDataSetChanged();
    }

    public void b(List<User> list) {
        if (list != null && list.size() > 0) {
            this.c = list;
            a();
            notifyDataSetChanged();
        }
    }
}
