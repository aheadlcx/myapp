package bili2.bl;

import java.io.IOException;

/* compiled from: BL */
public final class fhd extends fhc implements kne {
    private final kop b = new kop(8192);

    public fhd(long j) {
        a(koo.a(this.b.b()), j);
    }

    public void a(koh bl_koh) throws IOException {
        kog bl_kog = new kog();
        while (this.b.a().a(bl_kog, 8192) != -1) {
            bl_koh.a_(bl_kog, bl_kog.b());
        }
    }
}
