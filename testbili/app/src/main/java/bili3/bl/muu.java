package bili3.bl;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: BL */
public interface muu extends IMediaPlayer {
    <T> T a(String str, T t);

    Object a(String str, Object... objArr);

    IMediaPlayer a();

    void a(Context context, mxh bl_mxh, Uri uri) throws IOException;

    void b();
}
