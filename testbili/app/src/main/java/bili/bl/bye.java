package bili.bl;

import android.support.annotation.NonNull;
import com.bilibili.bilibililive.followingcard.api.entity.OriginalUser;
import com.bilibili.bilibililive.followingcard.api.entity.cardBean.MusicCard;

/* compiled from: BL */
public class bye implements bws<MusicCard> {
    public /* synthetic */ OriginalUser a(@NonNull Object obj) {
        return f((MusicCard) obj);
    }

    public /* synthetic */ int b(@NonNull Object obj) {
        return e((MusicCard) obj);
    }

    public /* synthetic */ String c(@NonNull Object obj) {
        return d((MusicCard) obj);
    }

    public /* synthetic */ String d(@NonNull Object obj) {
        return c((MusicCard) obj);
    }

    public /* synthetic */ String e(@NonNull Object obj) {
        return b((MusicCard) obj);
    }

    public /* synthetic */ String f(@NonNull Object obj) {
        return a((MusicCard) obj);
    }

    public String a(@NonNull MusicCard musicCard) {
        return musicCard.intro;
    }

    public String b(@NonNull MusicCard musicCard) {
        return musicCard.cover;
    }

    public String c(@NonNull MusicCard musicCard) {
        return musicCard.title;
    }

    public String d(@NonNull MusicCard musicCard) {
        return musicCard.upper;
    }

    public int e(@NonNull MusicCard musicCard) {
        return musicCard.replyCnt;
    }

    public OriginalUser f(@NonNull MusicCard musicCard) {
        return new OriginalUser(musicCard.upId, musicCard.upper, musicCard.upperAvatar);
    }
}
