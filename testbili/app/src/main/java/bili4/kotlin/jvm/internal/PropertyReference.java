package bili4.kotlin.jvm.internal;

import bl.jgp;
import bl.jhl;
import bl.jhu;

/* compiled from: BL */
public abstract class PropertyReference extends CallableReference implements jhu {
    protected /* synthetic */ jhl e() {
        return i();
    }

    protected jhu i() {
        return (jhu) super.e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PropertyReference)) {
            return obj instanceof jhu ? obj.equals(d()) : false;
        } else {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (f().equals(propertyReference.f()) && g().equals(propertyReference.g()) && h().equals(propertyReference.h()) && jgp.a(c(), propertyReference.c())) {
                return true;
            }
            return false;
        }
    }

    public int hashCode() {
        return (((f().hashCode() * 31) + g().hashCode()) * 31) + h().hashCode();
    }

    public String toString() {
        jhl d = d();
        if (d != this) {
            return d.toString();
        }
        return "property " + g() + " (Kotlin reflection is not available)";
    }
}
