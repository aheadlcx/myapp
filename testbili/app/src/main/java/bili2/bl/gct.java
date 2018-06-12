package bili2.bl;

import com.bilibili.music.app.domain.privilege.ValidationResult;
import com.bilibili.opd.app.bizcommon.mediaplayer.AudioQuality;
import rx.functions.Action1;

final /* synthetic */ class gct implements Action1 {
    private final gcp a;
    private final AudioQuality b;

    gct(gcp bl_gcp, AudioQuality audioQuality) {
        this.a = bl_gcp;
        this.b = audioQuality;
    }

    public void call(Object obj) {
        this.a.a(this.b, (ValidationResult) obj);
    }
}
