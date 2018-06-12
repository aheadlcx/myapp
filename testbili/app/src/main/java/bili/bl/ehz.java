package bili.bl;

import android.content.Context;
import android.util.SparseArray;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.PlayerCodecConfig;
import com.bilibili.lib.media.resource.PlayerCodecConfig.Player;
import com.bilibili.upper.videoup.model.TaskStep;
import tv.danmaku.frontia.SyncPluginManager.Mode;
import tv.danmaku.videoplayer.basic.context.VideoViewParams;

/* compiled from: BL */
public class ehz implements mss {
    private static final SparseArray<PlayerCodecConfig> a = new SparseArray();
    private int b = 0;

    static {
        a.put(1, a(Player.IJK_PLAYER, true));
        a.put(2, a(Player.IJK_PLAYER, false));
        a.put(4, a(Player.ANDROID_PLAYER, false));
    }

    private static PlayerCodecConfig a(Player player, boolean z) {
        PlayerCodecConfig playerCodecConfig = new PlayerCodecConfig();
        playerCodecConfig.a = player;
        playerCodecConfig.c = z;
        return playerCodecConfig;
    }

    public ehz() {
        a();
    }

    public PlayerCodecConfig a(Context context, VideoViewParams videoViewParams) {
        a();
        if (videoViewParams == null) {
            return new PlayerCodecConfig();
        }
        return b(context, videoViewParams);
    }

    private PlayerCodecConfig b(Context context, VideoViewParams videoViewParams) {
        MediaResource f = videoViewParams.f();
        if (f == null) {
            return new PlayerCodecConfig();
        }
        PlayIndex d = f.d();
        PlayerCodecConfig playerCodecConfig = new PlayerCodecConfig();
        switch (videoViewParams.b) {
            case Mode.UPDATE /*1*/:
            case TaskStep.TASK_STEP_TWO /*2*/:
                playerCodecConfig.a = Player.IJK_PLAYER;
                a(2, 2);
                break;
            case TaskStep.TASK_STEP_THREE /*3*/:
                playerCodecConfig.a = Player.ANDROID_PLAYER;
                a(4, 4);
                break;
            default:
                playerCodecConfig.a = Player.IJK_PLAYER;
                playerCodecConfig.c = true;
                videoViewParams.c = true;
                a(1, 1);
                break;
        }
        if (d.h()) {
            playerCodecConfig.b = false;
            return playerCodecConfig;
        } else if (d.A != null && !d.A.isEmpty()) {
            playerCodecConfig.b = true;
            return playerCodecConfig;
        } else if (playerCodecConfig.a != Player.ANDROID_PLAYER) {
            return playerCodecConfig;
        } else {
            playerCodecConfig.a = Player.IJK_PLAYER;
            return playerCodecConfig;
        }
    }

    public PlayerCodecConfig a(VideoViewParams videoViewParams, PlayerCodecConfig playerCodecConfig) {
        if (videoViewParams == null || videoViewParams.f() == null) {
            return new PlayerCodecConfig();
        }
        if (playerCodecConfig == null) {
            return new PlayerCodecConfig();
        }
        PlayerCodecConfig playerCodecConfig2;
        PlayerCodecConfig playerCodecConfig3 = new PlayerCodecConfig();
        for (int i = 0; i < a.size(); i++) {
            int keyAt = a.keyAt(i);
            if (!a(keyAt)) {
                playerCodecConfig2 = (PlayerCodecConfig) a.valueAt(i);
                a(keyAt, keyAt);
                break;
            }
        }
        playerCodecConfig2 = playerCodecConfig3;
        if (playerCodecConfig2.a != Player.ANDROID_PLAYER) {
            return playerCodecConfig2;
        }
        PlayIndex d = videoViewParams.f().d();
        if (d.h()) {
            playerCodecConfig2.b = false;
            return playerCodecConfig2;
        } else if (d.A == null || d.A.isEmpty()) {
            return playerCodecConfig2;
        } else {
            playerCodecConfig2.b = true;
            return playerCodecConfig2;
        }
    }

    private void a(int i, int i2) {
        this.b = (this.b & (i2 ^ -1)) | (i & i2);
    }

    private boolean a(int i) {
        return (this.b & i) == i;
    }

    private void a() {
        this.b = 0;
    }
}
