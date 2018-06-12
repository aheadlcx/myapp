package bili2.bl;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
class hmy {
    private final List<hmx> a = new ArrayList();
    private final Object b = new Object();

    public void a(hmx bl_hmx) {
        synchronized (this.b) {
            this.a.add(bl_hmx);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.evernote.android.job.Job a(String r5) {
        /*
        r4 = this;
        r1 = 0;
        r3 = r4.b;
        monitor-enter(r3);
        r0 = r4.a;	 Catch:{ all -> 0x0037 }
        r0 = r0.size();	 Catch:{ all -> 0x0037 }
        if (r0 != 0) goto L_0x0018;
    L_0x000c:
        r0 = "JobManager";
        r2 = "no JobCreator added";
        bl.hna.b(r0, r2);	 Catch:{ all -> 0x0037 }
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        r0 = r1;
    L_0x0017:
        return r0;
    L_0x0018:
        r2 = 1;
        if (r0 != r2) goto L_0x002d;
    L_0x001b:
        r0 = r4.a;	 Catch:{ all -> 0x0037 }
        r2 = 0;
        r0 = r0.get(r2);	 Catch:{ all -> 0x0037 }
        r0 = (bl.hmx) r0;	 Catch:{ all -> 0x0037 }
        r2 = r1;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x003a;
    L_0x0028:
        r0 = r0.a(r5);
        goto L_0x0017;
    L_0x002d:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0037 }
        r2 = r4.a;	 Catch:{ all -> 0x0037 }
        r0.<init>(r2);	 Catch:{ all -> 0x0037 }
        r2 = r0;
        r0 = r1;
        goto L_0x0025;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        throw r0;
    L_0x003a:
        if (r2 == 0) goto L_0x0053;
    L_0x003c:
        r2 = r2.iterator();
    L_0x0040:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0053;
    L_0x0046:
        r0 = r2.next();
        r0 = (bl.hmx) r0;
        r0 = r0.a(r5);
        if (r0 == 0) goto L_0x0040;
    L_0x0052:
        goto L_0x0017;
    L_0x0053:
        r0 = r1;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.hmy.a(java.lang.String):com.evernote.android.job.Job");
    }

    public boolean a() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = this.a.isEmpty();
        }
        return isEmpty;
    }
}
