package bili2.bl;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: BL */
class kqq {
    private static final kqq a = c();

    /* compiled from: BL */
    static class a extends kqq {

        /* compiled from: BL */
        static class a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            a() {
            }

            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
        }

        public Executor b() {
            return new a();
        }

        bl.kqj.a a(@Nullable Executor executor) {
            if (executor != null) {
                return new kqn(executor);
            }
            throw new AssertionError();
        }
    }

    @IgnoreJRERequirement
    /* compiled from: BL */
    static class b extends kqq {
        b() {
        }

        boolean a(Method method) {
            return method.isDefault();
        }

        Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    kqq() {
    }

    static kqq a() {
        return a;
    }

    private static kqq c() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException e) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException e2) {
            return new kqq();
        }
    }

    @Nullable
    Executor b() {
        return null;
    }

    bl.kqj.a a(@Nullable Executor executor) {
        if (executor != null) {
            return new kqn(executor);
        }
        return kqm.a;
    }

    boolean a(Method method) {
        return false;
    }

    @Nullable
    Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }
}
