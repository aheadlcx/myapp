package bili2.bl;

import com.bilibili.videodownloader.model.VideoDownloadAVPageEntry;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry;

/* compiled from: BL */
public class hjv {
    public static hju a(hjy bl_hjy, VideoDownloadEntry videoDownloadEntry) {
        if (videoDownloadEntry instanceof VideoDownloadAVPageEntry) {
            return new hjs(bl_hjy, (VideoDownloadAVPageEntry) videoDownloadEntry);
        }
        if (videoDownloadEntry instanceof VideoDownloadSeasonEpEntry) {
            return new hjt(bl_hjy, (VideoDownloadSeasonEpEntry) videoDownloadEntry);
        }
        throw new AssertionError(hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 118, (byte) 112, (byte) 117, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 37, (byte) 113, (byte) 109, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 37, (byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 63, (byte) 37}) + (videoDownloadEntry != null ? videoDownloadEntry.getClass() : "none"));
    }
}
