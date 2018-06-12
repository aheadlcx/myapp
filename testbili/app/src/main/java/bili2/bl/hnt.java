package bili2.bl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public final class hnt {
    public static List<String> a(hns bl_hns) {
        try {
            if (bl_hns instanceof hnu) {
                List b = ((hnu) bl_hns).b();
                List<String> arrayList = new ArrayList(b.size());
                for (int i = 0; i < b.size(); i++) {
                    arrayList.add(c((hns) b.get(i)));
                }
                return arrayList;
            }
            List<String> arrayList2 = new ArrayList(1);
            arrayList2.add(c(bl_hns));
            return arrayList2;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static String b(hns bl_hns) {
        try {
            if (bl_hns instanceof hnu) {
                return c((hns) ((hnu) bl_hns).b().get(0));
            }
            return c(bl_hns);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static String c(hns bl_hns) throws UnsupportedEncodingException {
        return hqf.a(bl_hns.a().getBytes("UTF-8"));
    }
}
