package bili2.bl;

import com.bilibili.opd.app.bizcommon.mediaplayer.MediaSource;
import rx.functions.Action0;

final /* synthetic */ class gqq implements Action0 {
    private final a a;
    private final boolean b;
    private final MediaSource c;

    gqq(a aVar, boolean z, MediaSource mediaSource) {
        this.a = aVar;
        this.b = z;
        this.c = mediaSource;
    }

    public void call() {
        this.a.a(this.b, this.c);
    }
}
