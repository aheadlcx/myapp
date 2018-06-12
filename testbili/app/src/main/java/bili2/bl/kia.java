package bili2.bl;

import kotlinx.serialization.KSerialClassDesc;

@jds(a = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, b = {"Lkotlinx/serialization/internal/ListLikeDesc;", "Lkotlinx/serialization/KSerialClassDesc;", "()V", "getElementIndex", "", "name", "", "getElementName", "index", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashMapClassDesc;", "Lkotlinx/serialization/internal/HashMapClassDesc;", "kotlinx-serialization-runtime"})
/* compiled from: BL */
public abstract class kia implements KSerialClassDesc {
    private kia() {
    }

    public int a(String str) {
        jgp.b(str, "name");
        return jgp.a(str, "size") ? 0 : Integer.parseInt(str);
    }
}
