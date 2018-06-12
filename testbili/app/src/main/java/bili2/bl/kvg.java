package bili2.bl;

/* compiled from: BL */
public class kvg {
    public static String a(String str, Throwable th) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (th.getCause() != null) {
            stringBuilder.append(th.getCause().getMessage());
        } else {
            stringBuilder.append(th.getMessage());
        }
        stringBuilder.append("; ");
        return stringBuilder.toString();
    }
}
