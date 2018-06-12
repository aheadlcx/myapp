package bili3.bl;

import android.widget.TextView;

final /* synthetic */ class mmu implements Runnable {
    private final TextView a;

    mmu(TextView textView) {
        this.a = textView;
    }

    public void run() {
        this.a.setVisibility(4);
    }
}
