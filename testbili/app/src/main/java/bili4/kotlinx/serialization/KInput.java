package bili4.kotlinx.serialization;

import bl.jds;
import bl.jgp;
import bl.kgu;
import bl.kgv;
import bl.kgx;
import bl.khb;
import com.tencent.open.SocialConstants;
import kotlin.NoWhenBranchMatchedException;
import u.aly.dd;
import u.aly.q;

@jds(a = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b&\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u00a2\u0006\u0002\u0010\u0012J1\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u001a\u0010\u0016\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00180\u0017\"\u0006\u0012\u0002\b\u00030\u0018H\u0016\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001bH&J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010!\u001a\u00020 H&J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010$\u001a\u00020#H&J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010'\u001a\u00020&H&J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010)\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\"\u0010)\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J0\u0010.\u001a\u0002H\u000e\"\u0010\b\u0000\u0010\u000e\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000e0/2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0086\b\u00a2\u0006\u0002\u00100J;\u0010.\u001a\u0002H\u000e\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0/2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\f\u00101\u001a\b\u0012\u0004\u0012\u0002H\u000e0+H&\u00a2\u0006\u0002\u00102J \u00103\u001a\u0002H\u000e\"\u0010\b\u0000\u0010\u000e\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000e0/H\u0086\b\u00a2\u0006\u0002\u00104J+\u00103\u001a\u0002H\u000e\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002H\u000e0+H&\u00a2\u0006\u0002\u00105J\u0018\u00106\u001a\u0002072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u00108\u001a\u000207H&J\u0018\u00109\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010:\u001a\u00020\u001dH&J\u0018\u0010;\u001a\u00020<2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010=\u001a\u00020<H&J\b\u0010>\u001a\u00020\u001bH&J\n\u0010?\u001a\u0004\u0018\u00010@H&J%\u0010A\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010B\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J9\u0010C\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\u0011H&\u00a2\u0006\u0002\u0010DJ'\u0010E\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\u0011\u00a2\u0006\u0002\u0010\u0012J\n\u0010F\u001a\u0004\u0018\u00010\u0001H&J1\u0010G\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H&\u00a2\u0006\u0002\u0010DJ!\u0010H\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010I\u001a\u00020J2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010K\u001a\u00020JH&J\u0018\u0010L\u001a\u00020M2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010N\u001a\u00020MH&J\u0018\u0010O\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010P\u001a\u00020-H&J\b\u0010Q\u001a\u00020\u0001H&J#\u0010Q\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u000e0+\u00a2\u0006\u0002\u0010RJC\u0010S\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\u00112\b\u0010T\u001a\u0004\u0018\u0001H\u000eH\u0016\u00a2\u0006\u0002\u0010UJ;\u0010V\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010T\u001a\u0004\u0018\u0001H\u000eH\u0016\u00a2\u0006\u0002\u0010WJ9\u0010X\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010T\u001a\u0002H\u000eH\u0016\u00a2\u0006\u0002\u0010UJ1\u0010Y\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010T\u001a\u0002H\u000eH\u0016\u00a2\u0006\u0002\u0010WR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006["}, b = {"Lkotlinx/serialization/KInput;", "", "()V", "context", "Lkotlinx/serialization/SerialContext;", "getContext", "()Lkotlinx/serialization/SerialContext;", "setContext", "(Lkotlinx/serialization/SerialContext;)V", "updateMode", "Lkotlinx/serialization/UpdateMode;", "getUpdateMode", "()Lkotlinx/serialization/UpdateMode;", "read", "T", "()Ljava/lang/Object;", "loader", "Lkotlinx/serialization/KSerialLoader;", "(Lkotlinx/serialization/KSerialLoader;)Ljava/lang/Object;", "readBegin", "desc", "Lkotlinx/serialization/KSerialClassDesc;", "typeParams", "", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerialClassDesc;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KInput;", "readBooleanElementValue", "", "index", "", "readBooleanValue", "readByteElementValue", "", "readByteValue", "readCharElementValue", "", "readCharValue", "readDoubleElementValue", "", "readDoubleValue", "readElement", "readElementValue", "klass", "Lkotlin/reflect/KClass;", "readEnd", "", "readEnumElementValue", "", "(Lkotlinx/serialization/KSerialClassDesc;I)Ljava/lang/Enum;", "enumClass", "(Lkotlinx/serialization/KSerialClassDesc;ILkotlin/reflect/KClass;)Ljava/lang/Enum;", "readEnumValue", "()Ljava/lang/Enum;", "(Lkotlin/reflect/KClass;)Ljava/lang/Enum;", "readFloatElementValue", "", "readFloatValue", "readIntElementValue", "readIntValue", "readLongElementValue", "", "readLongValue", "readNotNullMark", "readNullValue", "", "readNullable", "readNullableElementValue", "readNullableSerializableElementValue", "(Lkotlinx/serialization/KSerialClassDesc;ILkotlinx/serialization/KSerialLoader;)Ljava/lang/Object;", "readNullableSerializableValue", "readNullableValue", "readSerializableElementValue", "readSerializableValue", "readShortElementValue", "", "readShortValue", "readStringElementValue", "", "readStringValue", "readUnitElementValue", "readUnitValue", "readValue", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "updateNullableSerializableElementValue", "old", "(Lkotlinx/serialization/KSerialClassDesc;ILkotlinx/serialization/KSerialLoader;Ljava/lang/Object;)Ljava/lang/Object;", "updateNullableSerializableValue", "(Lkotlinx/serialization/KSerialLoader;Lkotlinx/serialization/KSerialClassDesc;Ljava/lang/Object;)Ljava/lang/Object;", "updateSerializableElementValue", "updateSerializableValue", "Companion", "kotlinx-serialization-runtime"})
/* compiled from: BL */
public abstract class KInput {
    public static final a a = new a();
    private khb b;
    private final UpdateMode c = UpdateMode.UPDATE;

    @jds(a = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, b = {"Lkotlinx/serialization/KInput$Companion;", "", "()V", "READ_ALL", "", "READ_DONE", "UNKNOWN_NAME", "kotlinx-serialization-runtime"})
    /* compiled from: BL */
    public static final class a {
        private a() {
        }
    }

    public abstract int a(KSerialClassDesc kSerialClassDesc);

    public abstract <T> T a(KSerialClassDesc kSerialClassDesc, int i, kgv<T> bl_kgv_T);

    public abstract boolean a();

    public abstract boolean a(KSerialClassDesc kSerialClassDesc, int i);

    public abstract int b(KSerialClassDesc kSerialClassDesc, int i);

    public abstract <T> T b(KSerialClassDesc kSerialClassDesc, int i, kgv<T> bl_kgv_T);

    public abstract Void b();

    public abstract String c(KSerialClassDesc kSerialClassDesc, int i);

    public abstract void d();

    public abstract boolean e();

    public abstract byte f();

    public abstract short g();

    public abstract int h();

    public abstract long i();

    public abstract float j();

    public abstract double k();

    public abstract char l();

    public abstract String m();

    public final void a(khb bl_khb) {
        this.b = bl_khb;
    }

    public final khb n() {
        return this.b;
    }

    public final <T> T a(kgv<T> bl_kgv_T) {
        jgp.b(bl_kgv_T, "loader");
        return bl_kgv_T.load(this);
    }

    public <T> T b(kgv<T> bl_kgv_T) {
        jgp.b(bl_kgv_T, "loader");
        return bl_kgv_T.load(this);
    }

    public final <T> T c(kgv<T> bl_kgv_T) {
        jgp.b(bl_kgv_T, "loader");
        return a() ? b((kgv) bl_kgv_T) : b();
    }

    public KInput a(KSerialClassDesc kSerialClassDesc, kgx<?>... bl_kgx_Arr) {
        jgp.b(kSerialClassDesc, SocialConstants.PARAM_APP_DESC);
        jgp.b(bl_kgx_Arr, "typeParams");
        return this;
    }

    public void b(KSerialClassDesc kSerialClassDesc) {
        jgp.b(kSerialClassDesc, SocialConstants.PARAM_APP_DESC);
    }

    public <T> T a(KSerialClassDesc kSerialClassDesc, int i, kgv<T> bl_kgv_T, T t) {
        jgp.b(kSerialClassDesc, SocialConstants.PARAM_APP_DESC);
        jgp.b(bl_kgv_T, "loader");
        return a((kgv) bl_kgv_T, kSerialClassDesc, (Object) t);
    }

    public <T> T b(KSerialClassDesc kSerialClassDesc, int i, kgv<T> bl_kgv_T, T t) {
        jgp.b(kSerialClassDesc, SocialConstants.PARAM_APP_DESC);
        jgp.b(bl_kgv_T, "loader");
        return b((kgv) bl_kgv_T, kSerialClassDesc, (Object) t);
    }

    public <T> T a(kgv<T> bl_kgv_T, KSerialClassDesc kSerialClassDesc, T t) {
        jgp.b(bl_kgv_T, "loader");
        jgp.b(kSerialClassDesc, SocialConstants.PARAM_APP_DESC);
        switch (kgu.a[o().ordinal()]) {
            case q.a /*1*/:
                throw new UpdateNotSupportedException(kSerialClassDesc.a());
            case dd.c /*2*/:
                return b((kgv) bl_kgv_T);
            case dd.d /*3*/:
                return bl_kgv_T.update(this, t);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public <T> T b(kgv<T> bl_kgv_T, KSerialClassDesc kSerialClassDesc, T t) {
        jgp.b(bl_kgv_T, "loader");
        jgp.b(kSerialClassDesc, SocialConstants.PARAM_APP_DESC);
        if (jgp.a(o(), UpdateMode.BANNED)) {
            throw new UpdateNotSupportedException(kSerialClassDesc.a());
        } else if (jgp.a(o(), UpdateMode.OVERWRITE) || t == null) {
            return c(bl_kgv_T);
        } else {
            if (a()) {
                return bl_kgv_T.update(this, t);
            }
            b();
            return t;
        }
    }

    public UpdateMode o() {
        return this.c;
    }
}
