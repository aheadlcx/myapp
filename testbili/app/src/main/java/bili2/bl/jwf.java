package bili2.bl;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: BL */
public abstract class jwf extends jwg {
    protected abstract void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void b(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        jgp.b(callableMemberDescriptor, "fromSuper");
        jgp.b(callableMemberDescriptor2, "fromCurrent");
        a(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        jgp.b(callableMemberDescriptor, "first");
        jgp.b(callableMemberDescriptor2, "second");
        a(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
