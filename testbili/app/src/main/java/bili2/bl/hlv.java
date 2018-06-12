package bili2.bl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@jds(a = {"com/bilibili/xpref/Internal__BundleHelperKt", "com/bilibili/xpref/Internal__XprefProviderKt"})
public final class hlv {
    @RestrictTo({Scope.LIBRARY})
    public static final String a = hae.a(new byte[]{(byte) 33, (byte) 125, (byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 43, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119});
    @RestrictTo({Scope.LIBRARY})
    public static final String b = hae.a(new byte[]{(byte) 33, (byte) 125, (byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 43, (byte) 107, (byte) 100, (byte) 104, (byte) 96});
    public static final String c = hae.a(new byte[]{(byte) 33, (byte) 125, (byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 43, (byte) 75, (byte) 80, (byte) 73, (byte) 73});
    @RestrictTo({Scope.LIBRARY})
    public static final String d = hae.a(new byte[]{(byte) 33, (byte) 125, (byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 43, (byte) 119, (byte) 96, (byte) 113});

    @RestrictTo({Scope.LIBRARY})
    public static final Uri a(Context context) {
        return hlx.a(context);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Bundle a(Boolean bool) {
        return hlw.a(bool);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Bundle a(Float f) {
        return hlw.a(f);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Bundle a(Integer num) {
        return hlw.a(num);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Bundle a(Long l) {
        return hlw.a(l);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Bundle a(String str) {
        return hlw.a(str);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Bundle a(Map<String, ?> map) {
        return hlw.a((Map) map);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Bundle a(Set<?> set) {
        return hlw.b(set);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final HashSet<String> a(ArrayList<?> arrayList) {
        return hlw.a((ArrayList) arrayList);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Map<String, Object> a(Bundle bundle) {
        return hlw.a(bundle);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final Set<String> a(Bundle bundle, Set<String> set) {
        return hlw.a(bundle, (Set) set);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final void a(Bundle bundle, Map<String, ? extends Object> map) {
        hlw.a(bundle, (Map) map);
    }

    @RestrictTo({Scope.LIBRARY})
    public static final ArrayList<String> b(Set<?> set) {
        return hlw.a((Set) set);
    }
}
