package bili.butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* compiled from: BL */
public @interface OnTextChanged {

    /* compiled from: BL */
    public enum Callback {
        TEXT_CHANGED,
        BEFORE_TEXT_CHANGED,
        AFTER_TEXT_CHANGED
    }
}
