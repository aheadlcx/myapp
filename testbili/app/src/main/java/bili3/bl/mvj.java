package bili3.bl;

import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.videoplayer.core.danmaku.IDanmakuPlayer;

/* compiled from: BL */
public class mvj {
    private static final String a = hae.a(new byte[]{(byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 70, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 106, (byte) 119});

    public static boolean a(MediaInfo mediaInfo) {
        return (mediaInfo == null || mediaInfo.mVideoDecoder == null || !mediaInfo.mVideoDecoder.equalsIgnoreCase(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 102}))) ? false : true;
    }

    public static boolean b(MediaInfo mediaInfo) {
        return mediaInfo != null && hae.a(new byte[]{(byte) 81, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119}).equals(mediaInfo.mMediaPlayerName);
    }

    public static IDanmakuPlayer a(int i, mwx bl_mwx, MediaInfo mediaInfo) {
        return new mvk();
    }
}
