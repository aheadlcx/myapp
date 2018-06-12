package bili4.com.tencent.stat;

class ao implements Runnable {
    final /* synthetic */ an a;

    ao(an anVar) {
        this.a = anVar;
    }

    public void run() {
        try {
            if (StatServiceImpl.v && StatServiceImpl.w) {
                StatServiceImpl.v = false;
                StatServiceImpl.q.i("went background");
                for (StatActionListener onBecameBackground : StatServiceImpl.y) {
                    onBecameBackground.onBecameBackground();
                }
                return;
            }
            StatServiceImpl.q.i("still foreground");
        } catch (Throwable th) {
            StatServiceImpl.q.e(th);
        }
    }
}
