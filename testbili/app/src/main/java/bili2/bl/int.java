package bili2.bl;

import android.content.ContentResolver;
import android.text.TextUtils;
import android.view.View;
import com.bilibili.boxing.model.entity.AlbumEntity;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import com.mall.ui.widget.media.album.choose.MediaItemLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
public class int extends elf implements bl.ink.a {
    private bl.ink.b a;
    private int b;
    private int c;
    private boolean d;
    private int e;
    private String f;
    private b g = new b(this, this);
    private a h = new a(this, this);
    private List<BaseMedia> i = new ArrayList();

/* compiled from: BL */
class a implements eky {
    final /* synthetic */ int a;
    private WeakReference<int> b;

    a(int bl_int, int bl_int2) {
        this.a = bl_int;
        this.b = new WeakReference(bl_int2);
    }

    private int a() {
        return (int) this.b.get();
    }

    public void a(List<AlbumEntity> list) {
        int a = a();
        if (a != null && a.a != null) {
            a.a.d(list);
        }
    }
}

    /* compiled from: BL */
    public class b implements ekz<ImageMedia> {
        final /* synthetic */ int a;
        private WeakReference<int> b;

        b(int bl_int, int bl_int2) {
            this.a = bl_int;
            this.b = new WeakReference(bl_int2);
        }

        private int a() {
            return (int) this.b.get();
        }

        public void a(List<ImageMedia> list, int i) {
            int a = a();
            if (a != null) {
                if (this.a.i != null) {
                    this.a.i.clear();
                }
                this.a.i.addAll(list);
                this.a.e = i;
                a.b = this.a.e / 1000;
                a.d = false;
                this.a.b(this.a.i);
            }
        }

        public boolean a(String str) {
            return TextUtils.isEmpty(str) || !new File(str).exists();
        }
    }

    public int(bl.ink.b bVar) {
        super(bVar);
        this.a = bVar;
    }

    public void a(int i, String str) {
        this.f = str;
        if (i == 0) {
            this.a.f();
        }
        ContentResolver i2 = this.a.i();
        if (i2 != null) {
            inp.a().a(i2, i, str, this.g);
        }
    }

    public void d() {
        ContentResolver i = this.a.i();
        if (i != null) {
            inp.a().a(this.a.getContext(), i, this.h);
        }
    }

    public void b() {
        this.a = null;
    }

    public void c() {
        this.c++;
        this.d = true;
        a(this.c, this.f);
    }

    private void b(List<BaseMedia> list) {
        Collections.sort(list, inu.a);
        if (this.a != null) {
            this.a.a(list, list.size());
        }
    }

    static final /* synthetic */ int a(BaseMedia baseMedia, BaseMedia baseMedia2) {
        long lastModified = new File(baseMedia.d()).lastModified() - new File(baseMedia2.d()).lastModified();
        if (lastModified == 0) {
            return 0;
        }
        return lastModified > 0 ? -1 : 1;
    }

    public List<BaseMedia> a(List<BaseMedia> list) {
        List<BaseMedia> arrayList = new ArrayList();
        for (BaseMedia baseMedia : list) {
            if (baseMedia instanceof ImageMedia) {
                arrayList.add(baseMedia);
            }
        }
        return arrayList;
    }

    public boolean e() {
        return this.c < this.b;
    }

    public boolean f() {
        return !this.d;
    }

    public void a(View view, BaseMedia baseMedia, ino bl_ino) {
        if (baseMedia instanceof ImageMedia) {
            ImageMedia imageMedia = (ImageMedia) baseMedia;
            boolean z = !imageMedia.a();
            List b = bl_ino.b();
            if (z) {
                if (b.size() >= inm.b()) {
                    esu.a(this.a.getContext(), String.format(iop.b(2131692881), new Object[]{String.valueOf(9)}), 0);
                    return;
                } else if (!b.contains(imageMedia)) {
                    if (!new File(imageMedia.d()).exists()) {
                        esu.a(this.a.getContext(), 2131692970, 0);
                        return;
                    } else if (inm.a(imageMedia.m(), imageMedia.l(), imageMedia.h(), 200)) {
                        b.add(imageMedia);
                    } else {
                        esu.a(this.a.getContext(), 2131692976, 0);
                        return;
                    }
                }
            } else if (b.size() >= 1 && b.contains(imageMedia)) {
                b.remove(imageMedia);
            }
            imageMedia.a(z);
            ((MediaItemLayout) view).a(z, b.size());
            if (this.a != null) {
                this.a.a(b);
            }
        }
    }
}
