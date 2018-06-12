package bili2.bl;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import bl.gmg.a;
import com.bilibili.music.app.base.db.dao.LocalAudio;
import com.bilibili.music.app.domain.search.SearchResult.MusicItem;
import com.bilibili.music.app.domain.song.Song;
import com.bilibili.music.app.domain.updetail.SongDetail;
import com.bilibili.music.app.domain.upspace.AudioResponse.Audio;
import com.bilibili.opd.app.bizcommon.mediaplayer.MediaSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
public final class fsr {
    public static final String a = hae.a(new byte[]{(byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 86, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96, (byte) 80, (byte) 113, (byte) 108, (byte) 105, (byte) 118});
    public static final String b = hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 76, (byte) 97});
    public static final String c = hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 96, (byte) 119, (byte) 75, (byte) 100, (byte) 104, (byte) 96});
    public static final String d = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 90, (byte) 112, (byte) 119, (byte) 105});
    public static final String e = hae.a(new byte[]{(byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119});
    public static final String f = hae.a(new byte[]{(byte) 117, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107});
    public static final String g = hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119, (byte) 76, (byte) 97});
    public static final String h = hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 105, (byte) 124, (byte) 86, (byte) 108, (byte) 97});

    public static MediaSource a(SongDetail songDetail) {
        boolean z;
        boolean z2 = true;
        MediaSource mediaSource = new MediaSource();
        mediaSource.setId(songDetail.id);
        mediaSource.setName(songDetail.title);
        mediaSource.setCover(songDetail.coverUrl);
        mediaSource.setAuthor(songDetail.pgcInfo == null ? songDetail.author : songDetail.pgcInfo.singers);
        mediaSource.setUpper(songDetail.uploaderName);
        mediaSource.setUpId(songDetail.upId);
        if (songDetail.isOff || fvc.i(songDetail.limitation)) {
            z = true;
        } else {
            z = false;
        }
        mediaSource.setOff(z);
        if (!fvc.g(songDetail.limitation) || fvc.i(songDetail.limitation)) {
            z2 = false;
        }
        mediaSource.setLimited(z2);
        mediaSource.setQualityType(fss.b().k().type);
        return mediaSource;
    }

    public static MediaSource a(Audio audio) {
        boolean z;
        boolean z2 = true;
        MediaSource mediaSource = new MediaSource();
        mediaSource.setId(audio.id);
        mediaSource.setName(audio.title);
        mediaSource.setCover(audio.cover);
        mediaSource.setAuthor(audio.author);
        mediaSource.setUpper(audio.author);
        mediaSource.setUpId(audio.uid);
        if (audio.isOff || fvc.i(audio.limitation)) {
            z = true;
        } else {
            z = false;
        }
        mediaSource.setOff(z);
        if (!fvc.g(audio.limitation) || fvc.i(audio.limitation)) {
            z2 = false;
        }
        mediaSource.setLimited(z2);
        mediaSource.setQualityType(fss.b().k().type);
        return mediaSource;
    }

    public static MediaSource a(Song song) {
        boolean z;
        boolean z2 = true;
        MediaSource mediaSource = new MediaSource();
        mediaSource.setId(song.mSId);
        mediaSource.setAuthor(song.pgcInfo == null ? song.author : song.pgcInfo.singers);
        mediaSource.setCover(song.mCoverUrl);
        mediaSource.setName(song.mTitle);
        mediaSource.setUpper(song.mUpName);
        mediaSource.setUpId(song.mMId);
        if (song.isOff || fvc.i(song.limitation)) {
            z = true;
        } else {
            z = false;
        }
        mediaSource.setOff(z);
        if (!fvc.g(song.limitation) || fvc.i(song.limitation)) {
            z2 = false;
        }
        mediaSource.setLimited(z2);
        mediaSource.setQualityType(fss.b().k().type);
        return mediaSource;
    }

    public static MediaSource a(LocalAudio localAudio) {
        MediaSource mediaSource = new MediaSource();
        mediaSource.setId(localAudio.getSid());
        mediaSource.setName(localAudio.getName());
        mediaSource.setCover(localAudio.getCover());
        mediaSource.setLocalCoverUri(ftb.a(localAudio.getCoverPath()).toString());
        mediaSource.setUpper(localAudio.getUpper());
        mediaSource.setAuthor(localAudio.getAuthor());
        mediaSource.setUrl(localAudio.getUrl());
        mediaSource.setUpId(localAudio.getMid());
        mediaSource.setQualityType(localAudio.getQualityType());
        return mediaSource;
    }

    public static MediaSource a(MusicItem musicItem) {
        MediaSource mediaSource = new MediaSource();
        mediaSource.setId(musicItem.id);
        mediaSource.setName(musicItem.title);
        mediaSource.setAuthor(musicItem.author);
        mediaSource.setCover(musicItem.cover);
        mediaSource.setUpper(musicItem.upName);
        mediaSource.setUpId(musicItem.mid);
        mediaSource.setOff(fvc.i(musicItem.limitation));
        boolean z = fvc.g(musicItem.limitation) && !fvc.i(musicItem.limitation);
        mediaSource.setLimited(z);
        mediaSource.setQualityType(fss.b().k().type);
        return mediaSource;
    }

    public static MediaSource a(@NonNull Uri uri) {
        try {
            long parseLong = Long.parseLong(uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 76, (byte) 97})));
            String queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 96, (byte) 119, (byte) 75, (byte) 100, (byte) 104, (byte) 96}));
            String queryParameter2 = uri.getQueryParameter("url");
            String queryParameter3 = uri.getQueryParameter(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 90, (byte) 112, (byte) 119, (byte) 105}));
            String queryParameter4 = uri.getQueryParameter(hae.a(new byte[]{(byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119}));
            String queryParameter5 = uri.getQueryParameter("name");
            long j = 0;
            try {
                j = Long.parseLong(uri.getQueryParameter(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119, (byte) 76, (byte) 97})));
            } catch (NumberFormatException e) {
                Log.d(hae.a(new byte[]{(byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 86, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96, (byte) 80, (byte) 113, (byte) 108, (byte) 105, (byte) 118}), hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 76, (byte) 97, (byte) 37, (byte) 108, (byte) 107, (byte) 102, (byte) 106, (byte) 119, (byte) 119, (byte) 96, (byte) 102, (byte) 113, (byte) 36}));
            }
            MediaSource mediaSource = new MediaSource();
            mediaSource.setUrl(queryParameter2);
            mediaSource.setId(parseLong);
            mediaSource.setAuthor(queryParameter4);
            mediaSource.setCover(queryParameter3);
            mediaSource.setName(queryParameter5);
            mediaSource.setUpper(queryParameter);
            mediaSource.setUpId(j);
            mediaSource.setQualityType(fss.b().k().type);
            if (mediaSource.isInvalid()) {
                return null;
            }
            return mediaSource;
        } catch (NumberFormatException e2) {
            Log.d(hae.a(new byte[]{(byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 86, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96, (byte) 80, (byte) 113, (byte) 108, (byte) 105, (byte) 118}), hae.a(new byte[]{(byte) 108, (byte) 97, (byte) 37, (byte) 108, (byte) 107, (byte) 102, (byte) 106, (byte) 119, (byte) 119, (byte) 96, (byte) 102, (byte) 113, (byte) 36}));
            return null;
        }
    }

    public static void a(Object obj, goe bl_goe, boolean z) {
        MediaSource a;
        boolean h;
        String str = null;
        if (obj instanceof Song) {
            a = a((Song) obj);
            h = fvc.h(((Song) obj).limitation);
            str = ((Song) obj).limitDesc;
        } else if (obj instanceof MusicItem) {
            a = a((MusicItem) obj);
            h = fvc.h(((MusicItem) obj).limitation);
            str = ((MusicItem) obj).limitDesc;
        } else if (obj instanceof SongDetail) {
            a = a((SongDetail) obj);
            h = fvc.h(((SongDetail) obj).limitation);
            str = ((SongDetail) obj).limitDesc;
        } else if (obj instanceof LocalAudio) {
            a = a((LocalAudio) obj);
            h = false;
        } else {
            h = false;
            a = null;
        }
        if (bl_goe != null) {
            if (a != null) {
                fsb.a().a(a.getId(), a.getUpId());
            }
            if (h && !TextUtils.isEmpty(str)) {
                fto.b(bl_goe.getContext(), str);
            } else if (a == null || a.isInvalid()) {
                fto.a(bl_goe.getContext(), 2131693546, 1);
            } else if (blk.a().g() || fop.a(bl_goe.getContext()).a(a.getId())) {
                MediaSource a2 = fuz.a().c().a(Collections.singletonList(a), true);
                if (!(a2 == null || a(a2.attr))) {
                    fto.a(fuz.a().h(), 2131693311, 0);
                }
                if (a2 != null && z) {
                    bl_goe.c_(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 42, (byte) 97, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 42, (byte) 40, (byte) 52}));
                }
            } else {
                fte.a(bl_goe.getContext(), bl_goe.getResources().getString(2131693491));
            }
        }
    }

    public static void a(Object obj, goe bl_goe) {
        a(obj, bl_goe, true);
    }

    public static void a(List<a> list, int i, Context context) {
        SongDetail songDetail;
        if (i < 0 || list.get(i) == null) {
            songDetail = null;
        } else {
            songDetail = (SongDetail) ((a) list.get(i)).c;
        }
        if (songDetail == null) {
            fto.a(context, 2131693546, 1);
            return;
        }
        fsb.a().a(songDetail.id, songDetail.upId);
        if (fvc.g(songDetail.limitation)) {
            fto.b(context, songDetail.limitDesc);
        } else if (!blk.a().g() && !fop.a(context).a(songDetail.id)) {
            fte.a(context, context.getResources().getString(2131693491));
        } else if (a(songDetail) == null) {
            fto.a(context, 2131693546, 1);
        } else {
            List arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2) != null) {
                    arrayList.add(a((SongDetail) ((a) list.get(i2)).c));
                }
            }
            if (fuz.a().c().a(arrayList, songDetail.id)) {
                ((god) context).a(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 42, (byte) 97, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 42, (byte) 40, (byte) 52}));
            }
        }
    }

    public static boolean a(int i) {
        return (i & 8) != 0;
    }
}
