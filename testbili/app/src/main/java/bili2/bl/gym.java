package bili2.bl;

import android.support.v7.widget.RecyclerView;

final /* synthetic */ class gym implements Runnable {
    private final RecyclerView a;

    private gym(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    static Runnable a(RecyclerView recyclerView) {
        return new gym(recyclerView);
    }

    public void run() {
        this.a.invalidateItemDecorations();
    }
}
