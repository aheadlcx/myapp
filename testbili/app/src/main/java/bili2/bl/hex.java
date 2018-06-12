package bili2.bl;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.r;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import com.bilibili.upper.api.bean.VideoEpisode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: BL */
public class hex extends fkv {
    public static String a = hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 64, (byte) 117, (byte) 108, (byte) 118, (byte) 106, (byte) 97, (byte) 96, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    private has b;

    public static hex a(long j, List<VideoEpisode> list) {
        Bundle bundle = new Bundle();
        bundle.putLong(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 118, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 43, (byte) 108, (byte) 97}), j);
        bundle.putParcelableArrayList(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 118}), (ArrayList) list);
        hex bl_hex = new hex();
        bl_hex.setArguments(bundle);
        bl_hex.setRetainInstance(true);
        return bl_hex;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.b = new has(new OnClickListener(this) {
            final /* synthetic */ hex a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Object tag = view.getTag();
                if (tag instanceof VideoEpisode) {
                    VideoEpisode videoEpisode = (VideoEpisode) tag;
                    if (videoEpisode.cid > 0) {
                        Intent intent = this.a.getActivity().getIntent();
                        intent.putExtra(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 118, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 43, (byte) 108, (byte) 97}), videoEpisode.cid);
                        this.a.getActivity().setResult(-1, intent);
                        this.a.getActivity().finish();
                    }
                }
            }
        });
    }

    public void a(RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.a(recyclerView, bundle);
        int dimension = (int) getResources().getDimension(2131165508);
        recyclerView.setBackgroundColor(getResources().getColor(2131100933));
        recyclerView.setPadding(dimension, dimension, dimension, dimension);
        recyclerView.setClipToPadding(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.d(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.b);
        recyclerView.addItemDecoration(new g(this) {
            final /* synthetic */ hex a;

            {
                this.a = r1;
            }

            public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
                super.a(rect, view, recyclerView, rVar);
                int g = ((h) view.getLayoutParams()).g();
                int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, recyclerView.getResources().getDisplayMetrics());
                rect.top = applyDimension / 2;
                rect.bottom = applyDimension / 2;
                if (g % 2 == 0) {
                    rect.right = applyDimension / 2;
                } else if (g % 2 < 1) {
                    rect.left = applyDimension / 2;
                    rect.right = applyDimension / 2;
                } else if (g % 2 == 1) {
                    rect.left = applyDimension / 2;
                }
            }
        });
        long j = getArguments().getLong(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 118, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 43, (byte) 108, (byte) 97}), 0);
        Collection parcelableArrayList = getArguments().getParcelableArrayList(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 118}));
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        this.b.a(j);
        this.b.a.clear();
        this.b.a.addAll(parcelableArrayList);
        this.b.f();
        recyclerView.scrollToPosition(this.b.b());
    }
}
