package bili2.bl;

import bl.kgx.a;
import kotlinx.serialization.KInput;
import kotlinx.serialization.KOutput;
import kotlinx.serialization.KSerialClassDesc;

@jds(a = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, b = {"Lkotlinx/serialization/internal/ByteSerializer;", "Lkotlinx/serialization/KSerializer;", "", "()V", "serialClassDesc", "Lkotlinx/serialization/KSerialClassDesc;", "getSerialClassDesc", "()Lkotlinx/serialization/KSerialClassDesc;", "load", "input", "Lkotlinx/serialization/KInput;", "(Lkotlinx/serialization/KInput;)Ljava/lang/Byte;", "save", "", "output", "Lkotlinx/serialization/KOutput;", "obj", "kotlinx-serialization-runtime"})
/* compiled from: BL */
public final class khl implements kgx<Byte> {
    public static final khl a = new khl();
    private static final KSerialClassDesc b = ((KSerialClassDesc) new kil("kotlin.Byte"));

    private khl() {
    }

    public Byte a(KInput kInput, byte b) {
        jgp.b(kInput, "input");
        return (Byte) a.a(this, kInput, Byte.valueOf(b));
    }

    public /* synthetic */ Object load(KInput kInput) {
        return a(kInput);
    }

    public /* synthetic */ void save(KOutput kOutput, Object obj) {
        a(kOutput, ((Number) obj).byteValue());
    }

    public /* synthetic */ Object update(KInput kInput, Object obj) {
        return a(kInput, ((Number) obj).byteValue());
    }

    public KSerialClassDesc getSerialClassDesc() {
        return b;
    }

    public void a(KOutput kOutput, byte b) {
        jgp.b(kOutput, "output");
        kOutput.a(b);
    }

    public Byte a(KInput kInput) {
        jgp.b(kInput, "input");
        return Byte.valueOf(kInput.f());
    }
}
