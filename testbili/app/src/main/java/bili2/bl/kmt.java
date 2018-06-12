package bili2.bl;

import bl.klt.a;
import java.io.IOException;
import java.util.List;

/* compiled from: BL */
public final class kmt implements klt {
    private final klm a;

    public kmt(klm bl_klm) {
        this.a = bl_klm;
    }

    public kma a(a aVar) throws IOException {
        boolean z = false;
        kly a = aVar.a();
        kly.a e = a.e();
        klz d = a.d();
        if (d != null) {
            klu e2 = d.e();
            if (e2 != null) {
                e.a("Content-Type", e2.toString());
            }
            long a2 = d.a();
            if (a2 != -1) {
                e.a("Content-Length", Long.toString(a2));
                e.b("Transfer-Encoding");
            } else {
                e.a("Transfer-Encoding", "chunked");
                e.b("Content-Length");
            }
        }
        if (a.a("Host") == null) {
            e.a("Host", kmf.a(a.a(), false));
        }
        if (a.a("Connection") == null) {
            e.a("Connection", "Keep-Alive");
        }
        if (a.a("Accept-Encoding") == null && a.a("Range") == null) {
            z = true;
            e.a("Accept-Encoding", "gzip");
        }
        List a3 = this.a.a(a.a());
        if (!a3.isEmpty()) {
            e.a("Cookie", a(a3));
        }
        if (a.a("User-Agent") == null) {
            e.a("User-Agent", kmg.a());
        }
        kma a4 = aVar.a(e.c());
        kmx.a(this.a, a.a(), a4.g());
        kma.a a5 = a4.i().a(a);
        if (z && "gzip".equalsIgnoreCase(a4.a("Content-Encoding")) && kmx.b(a4)) {
            kov bl_kom = new kom(a4.h().c());
            a5.a(a4.g().b().c("Content-Encoding").c("Content-Length").a());
            a5.a(new kna(a4.a("Content-Type"), -1, koo.a(bl_kom)));
        }
        return a5.a();
    }

    private String a(List<kll> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append("; ");
            }
            kll bl_kll = (kll) list.get(i);
            stringBuilder.append(bl_kll.a()).append('=').append(bl_kll.b());
        }
        return stringBuilder.toString();
    }
}
