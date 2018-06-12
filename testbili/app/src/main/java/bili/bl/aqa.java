package bili.bl;

import android.databinding.ObservableInt;

/* compiled from: BL */
public final class aqa implements apu<Integer, Integer> {
    private ObservableInt a;

    public aqa(ObservableInt observableInt) {
        this.a = observableInt;
    }

    public Integer a(Integer num) {
        return this.a == null ? num : Integer.valueOf(this.a.b() + num.intValue());
    }
}
