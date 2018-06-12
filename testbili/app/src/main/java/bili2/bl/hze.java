package bili2.bl;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BL */
public class hze implements hzl<hws> {
    private final huq a;
    private final huq b;
    private final hur c;
    private final hvb d;
    private final hzl<hws> e;

    /* compiled from: BL */
    class a extends hyo<hws, hws> {
        final /* synthetic */ hze a;
        private final hzm b;
        private final String c;

        public a(hze bl_hze, hyl<hws> bl_hyl_bl_hws, hzm bl_hzm, String str) {
            this.a = bl_hze;
            super(bl_hyl_bl_hws);
            this.b = bl_hzm;
            this.c = str;
        }

        protected void a(hws bl_hws, int i) {
            if (!(!hyc.a(i) || bl_hws == null || hyc.c(i, 8))) {
                a(bl_hws);
            }
            d().b(bl_hws, i);
        }

        private void a(hws bl_hws) {
            ImageRequest a = this.b.a();
            if (a.o() && this.c != null) {
                CacheChoice cacheChoice;
                if (a.a() == null) {
                    cacheChoice = CacheChoice.DEFAULT;
                } else {
                    cacheChoice = a.a();
                }
                this.a.d.a(this.c, cacheChoice, this.a.c.c(a, this.b.d()), bl_hws);
            }
        }
    }

    /* compiled from: BL */
    static class b implements Comparator<bl.iad.b> {
        private final hvo a;

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((bl.iad.b) obj, (bl.iad.b) obj2);
        }

        b(hvo bl_hvo) {
            this.a = bl_hvo;
        }

        public int a(bl.iad.b bVar, bl.iad.b bVar2) {
            boolean a = hze.b(bVar, this.a);
            boolean a2 = hze.b(bVar2, this.a);
            if (a && a2) {
                return bVar.b() - bVar2.b();
            }
            if (a) {
                return -1;
            }
            if (a2) {
                return 1;
            }
            return bVar2.b() - bVar.b();
        }
    }

    public hze(huq bl_huq, huq bl_huq2, hur bl_hur, hvb bl_hvb, hzl<hws> bl_hzl_bl_hws) {
        this.a = bl_huq;
        this.b = bl_huq2;
        this.c = bl_hur;
        this.d = bl_hvb;
        this.e = bl_hzl_bl_hws;
    }

    public void a(hyl<hws> bl_hyl_bl_hws, hzm bl_hzm) {
        ImageRequest a = bl_hzm.a();
        hvo g = a.g();
        iad d = a.d();
        if (!a.o() || g == null || g.b <= 0 || g.a <= 0 || a.i() != null) {
            b((hyl) bl_hyl_bl_hws, bl_hzm);
        } else if (d == null) {
            b((hyl) bl_hyl_bl_hws, bl_hzm);
        } else {
            bl_hzm.c().a(bl_hzm.b(), "MediaVariationsFallbackProducer");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (d.b() > 0) {
                a((hyl) bl_hyl_bl_hws, bl_hzm, a, d, g, atomicBoolean);
            } else {
                final hyl<hws> bl_hyl_bl_hws2 = bl_hyl_bl_hws;
                final hzm bl_hzm2 = bl_hzm;
                final iad bl_iad = d;
                final ImageRequest imageRequest = a;
                final hvo bl_hvo = g;
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                this.d.a(d.a(), iad.a(d.a()).a(d.c()).a("index_db")).a(new pr<iad, Object>(this) {
                    final /* synthetic */ hze g;

                    public Object a(ps<iad> psVar) throws Exception {
                        if (psVar.d() || psVar.e()) {
                            return psVar;
                        }
                        try {
                            if (psVar.f() != null) {
                                return this.g.a(bl_hyl_bl_hws2, bl_hzm2, imageRequest, (iad) psVar.f(), bl_hvo, atomicBoolean2);
                            }
                            this.g.a(bl_hyl_bl_hws2, bl_hzm2, bl_iad.a());
                            return null;
                        } catch (Exception e) {
                            return null;
                        }
                    }
                });
            }
            a(atomicBoolean, bl_hzm);
        }
    }

    private ps a(hyl<hws> bl_hyl_bl_hws, hzm bl_hzm, ImageRequest imageRequest, iad bl_iad, hvo bl_hvo, AtomicBoolean atomicBoolean) {
        if (bl_iad.b() == 0) {
            return ps.a((hws) null).a(b(bl_hyl_bl_hws, bl_hzm, imageRequest, bl_iad, Collections.emptyList(), 0, atomicBoolean));
        }
        return a((hyl) bl_hyl_bl_hws, bl_hzm, imageRequest, bl_iad, bl_iad.a(new b(bl_hvo)), 0, atomicBoolean);
    }

    private ps a(hyl<hws> bl_hyl_bl_hws, hzm bl_hzm, ImageRequest imageRequest, iad bl_iad, List<bl.iad.b> list, int i, AtomicBoolean atomicBoolean) {
        CacheChoice a;
        bl.iad.b bVar = (bl.iad.b) list.get(i);
        hns a2 = this.c.a(imageRequest, bVar.a(), bl_hzm.d());
        if (bVar.d() == null) {
            a = imageRequest.a();
        } else {
            a = bVar.d();
        }
        return (a == CacheChoice.SMALL ? this.b : this.a).a(a2, atomicBoolean).a(b(bl_hyl_bl_hws, bl_hzm, imageRequest, bl_iad, list, i, atomicBoolean));
    }

    private static boolean b(bl.iad.b bVar, hvo bl_hvo) {
        return bVar.b() >= bl_hvo.a && bVar.c() >= bl_hvo.b;
    }

    private pr<hws, Void> b(hyl<hws> bl_hyl_bl_hws, hzm bl_hzm, ImageRequest imageRequest, iad bl_iad, List<bl.iad.b> list, int i, AtomicBoolean atomicBoolean) {
        final String b = bl_hzm.b();
        final hzo c = bl_hzm.c();
        final hyl<hws> bl_hyl_bl_hws2 = bl_hyl_bl_hws;
        final hzm bl_hzm2 = bl_hzm;
        final iad bl_iad2 = bl_iad;
        final List<bl.iad.b> list2 = list;
        final int i2 = i;
        final ImageRequest imageRequest2 = imageRequest;
        final AtomicBoolean atomicBoolean2 = atomicBoolean;
        return new pr<hws, Void>(this) {
            final /* synthetic */ hze j;

            public /* synthetic */ Object a(ps psVar) throws Exception {
                return b(psVar);
            }

            public Void b(ps<hws> psVar) throws Exception {
                boolean z;
                boolean z2 = true;
                if (hze.b((ps) psVar)) {
                    c.b(b, "MediaVariationsFallbackProducer", null);
                    bl_hyl_bl_hws2.b();
                    z2 = false;
                    z = false;
                } else if (psVar.e()) {
                    c.a(b, "MediaVariationsFallbackProducer", psVar.g(), null);
                    this.j.a(bl_hyl_bl_hws2, bl_hzm2, bl_iad2.a());
                    z = true;
                } else {
                    hws bl_hws = (hws) psVar.f();
                    if (bl_hws != null) {
                        boolean z3 = !bl_iad2.c() && hze.b((bl.iad.b) list2.get(i2), imageRequest2.g());
                        c.a(b, "MediaVariationsFallbackProducer", hze.a(c, b, true, list2.size(), bl_iad2.d(), z3));
                        if (z3) {
                            c.a(b, "MediaVariationsFallbackProducer", true);
                            bl_hyl_bl_hws2.b(1.0f);
                        }
                        int a = hyc.a(hyc.a(z3), 2);
                        if (!z3) {
                            a = hyc.a(a, 4);
                        }
                        bl_hyl_bl_hws2.b(bl_hws, a);
                        bl_hws.close();
                        if (z3) {
                            z2 = false;
                        }
                        z = z2;
                        z2 = false;
                    } else if (i2 < list2.size() - 1) {
                        this.j.a(bl_hyl_bl_hws2, bl_hzm2, imageRequest2, bl_iad2, list2, i2 + 1, atomicBoolean2);
                        z2 = false;
                        z = false;
                    } else {
                        c.a(b, "MediaVariationsFallbackProducer", hze.a(c, b, false, list2.size(), bl_iad2.d(), false));
                        z = true;
                    }
                }
                if (z) {
                    hzm bl_hzm;
                    if (!bl_hzm2.h() || r2) {
                        bl_hzm = bl_hzm2;
                    } else {
                        bl_hzm = new hzs(bl_hzm2);
                        bl_hzm.c(false);
                    }
                    this.j.a(bl_hyl_bl_hws2, bl_hzm, bl_iad2.a());
                }
                return null;
            }
        };
    }

    private void b(hyl<hws> bl_hyl_bl_hws, hzm bl_hzm) {
        this.e.a(bl_hyl_bl_hws, bl_hzm);
    }

    private void a(hyl<hws> bl_hyl_bl_hws, hzm bl_hzm, String str) {
        this.e.a(new a(this, bl_hyl_bl_hws, bl_hzm, str), bl_hzm);
    }

    private static boolean b(ps<?> psVar) {
        return psVar.d() || (psVar.e() && (psVar.g() instanceof CancellationException));
    }

    static Map<String, String> a(hzo bl_hzo, String str, boolean z, int i, String str2, boolean z2) {
        if (!bl_hzo.b(str)) {
            return null;
        }
        if (z) {
            return ImmutableMap.a("cached_value_found", String.valueOf(true), "cached_value_used_as_last", String.valueOf(z2), "variants_count", String.valueOf(i), "variants_source", str2);
        }
        return ImmutableMap.a("cached_value_found", String.valueOf(false), "variants_count", String.valueOf(i), "variants_source", str2);
    }

    private void a(final AtomicBoolean atomicBoolean, hzm bl_hzm) {
        bl_hzm.a(new hyf(this) {
            final /* synthetic */ hze b;

            public void a() {
                atomicBoolean.set(true);
            }
        });
    }
}
