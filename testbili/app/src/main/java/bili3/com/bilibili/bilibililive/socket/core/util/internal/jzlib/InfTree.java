package bili3.com.bilibili.bilibililive.socket.core.util.internal.jzlib;

import bl.hae;
import com.bilibili.bilibililive.im.entity.DataChangeNotify;
import com.bilibili.bilibililive.im.entity.Notification;
import com.bilibili.music.app.base.download.DLSong;
import com.bilibili.upper.api.bean.VideoItem;
import com.tencent.connect.share.QQShare;

/* compiled from: BL */
final class InfTree {
    static final int BMAX = 15;
    static final int[] cpdext = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, fixed_bd, fixed_bd, 6, 6, 7, 7, 8, 8, fixed_bl, fixed_bl, 10, 10, 11, 11, 12, 12, 13, 13};
    static final int[] cpdist = new int[]{1, 2, 3, 4, fixed_bd, 7, fixed_bl, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
    static final int[] cplens = new int[]{3, 4, fixed_bd, 6, 7, 8, fixed_bl, 10, 11, 13, BMAX, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};
    static final int[] cplext = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, fixed_bd, fixed_bd, fixed_bd, fixed_bd, 0, DataChangeNotify.TYPE_NEW_UP_ASSISTANT, DataChangeNotify.TYPE_NEW_UP_ASSISTANT};
    static final int fixed_bd = 5;
    static final int fixed_bl = 9;
    static final int[] fixed_td = new int[]{80, fixed_bd, 1, 87, fixed_bd, 257, 83, fixed_bd, 17, 91, fixed_bd, 4097, 81, fixed_bd, fixed_bd, 89, fixed_bd, 1025, 85, fixed_bd, 65, 93, fixed_bd, 16385, 80, fixed_bd, 3, 88, fixed_bd, 513, 84, fixed_bd, 33, 92, fixed_bd, 8193, 82, fixed_bd, fixed_bl, 90, fixed_bd, 2049, 86, fixed_bd, 129, 192, fixed_bd, 24577, 80, fixed_bd, 2, 87, fixed_bd, 385, 83, fixed_bd, 25, 91, fixed_bd, 6145, 81, fixed_bd, 7, 89, fixed_bd, 1537, 85, fixed_bd, 97, 93, fixed_bd, 24577, 80, fixed_bd, 4, 88, fixed_bd, 769, 84, fixed_bd, 49, 92, fixed_bd, 12289, 82, fixed_bd, 13, 90, fixed_bd, 3073, 86, fixed_bd, 193, 192, fixed_bd, 24577};
    static final int[] fixed_tl = new int[]{96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, DataChangeNotify.TYPE_NEW_UP_ASSISTANT, 0, 8, 48, 0, fixed_bl, 192, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, fixed_bl, 160, 0, 8, 0, 0, 8, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, 0, 8, 64, 0, fixed_bl, 224, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, fixed_bl, 144, 83, 7, 59, 0, 8, 120, 0, 8, 56, 0, fixed_bl, Notification.TYPE_GROUP_AUTO_CREATED, 81, 7, 17, 0, 8, DataChangeNotify.TYPE_GROUP_LIST_CHANGED, 0, 8, 40, 0, fixed_bl, 176, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, fixed_bl, 240, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, fixed_bl, DLSong.DOWNLOAD_STATE_DOWNLOADING, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, fixed_bl, 168, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, fixed_bl, 232, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, fixed_bl, 152, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, fixed_bl, 216, 82, 7, 23, 0, 8, DataChangeNotify.TYPE_MY_FOLLOW_CHANGED, 0, 8, 44, 0, fixed_bl, 184, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, fixed_bl, 248, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, fixed_bl, 196, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, fixed_bl, 164, 0, 8, 2, 0, 8, 130, 0, 8, 66, 0, fixed_bl, 228, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, fixed_bl, 148, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, fixed_bl, 212, 82, 7, 19, 0, 8, 106, 0, 8, 42, 0, fixed_bl, 180, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, fixed_bl, 244, 80, 7, fixed_bd, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, fixed_bl, Notification.TYPE_GROUP_ADMIN_FIRED, 81, 7, BMAX, 0, 8, VideoItem.STATE_UPLOAD_PAUSE, 0, 8, 38, 0, fixed_bl, 172, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, fixed_bl, 236, 80, 7, fixed_bl, 0, 8, 94, 0, 8, 30, 0, fixed_bl, 156, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, fixed_bl, 220, 82, 7, 27, 0, 8, DataChangeNotify.TYPE_NEW_AT_RECEIVED, 0, 8, 46, 0, fixed_bl, 188, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, fixed_bl, 252, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, 113, 0, 8, 49, 0, fixed_bl, 194, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, fixed_bl, 162, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, fixed_bl, 226, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, fixed_bl, 146, 83, 7, 59, 0, 8, 121, 0, 8, 57, 0, fixed_bl, 210, 81, 7, 17, 0, 8, 105, 0, 8, 41, 0, fixed_bl, 178, 0, 8, fixed_bl, 0, 8, 137, 0, 8, 73, 0, fixed_bl, 242, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, 117, 0, 8, 53, 0, fixed_bl, Notification.TYPE_GROUP_JOINED, 81, 7, 13, 0, 8, VideoItem.STATE_UPLOAD_FAIL, 0, 8, 37, 0, fixed_bl, 170, 0, 8, fixed_bd, 0, 8, 133, 0, 8, 69, 0, fixed_bl, 234, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, fixed_bl, 154, 84, 7, 83, 0, 8, 125, 0, 8, 61, 0, fixed_bl, 218, 82, 7, 23, 0, 8, DataChangeNotify.TYPE_NEW_REPLY_RECIEVED, 0, 8, 45, 0, fixed_bl, 186, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, fixed_bl, 250, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, fixed_bl, 198, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, fixed_bl, 166, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, fixed_bl, 230, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, fixed_bl, 150, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, fixed_bl, 214, 82, 7, 19, 0, 8, 107, 0, 8, 43, 0, fixed_bl, 182, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, fixed_bl, 246, 80, 7, fixed_bd, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, fixed_bl, Notification.TYPE_GROUP_ADMIN_KICK_OFF, 81, 7, BMAX, 0, 8, VideoItem.STATE_SUBMIT_FAIL, 0, 8, 39, 0, fixed_bl, 174, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, fixed_bl, 238, 80, 7, fixed_bl, 0, 8, 95, 0, 8, 31, 0, fixed_bl, 158, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, fixed_bl, 222, 82, 7, 27, 0, 8, DataChangeNotify.TYPE_NEW_PRAISE_RECEIVED, 0, 8, 47, 0, fixed_bl, 190, 0, 8, BMAX, 0, 8, 143, 0, 8, 79, 0, fixed_bl, 254, 96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, DataChangeNotify.TYPE_NEW_UP_ASSISTANT, 0, 8, 48, 0, fixed_bl, 193, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, fixed_bl, 161, 0, 8, 0, 0, 8, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, 0, 8, 64, 0, fixed_bl, 225, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, fixed_bl, 145, 83, 7, 59, 0, 8, 120, 0, 8, 56, 0, fixed_bl, 209, 81, 7, 17, 0, 8, DataChangeNotify.TYPE_GROUP_LIST_CHANGED, 0, 8, 40, 0, fixed_bl, 177, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, fixed_bl, 241, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, fixed_bl, Notification.TYPE_GROUP_DISSOLVE, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, fixed_bl, 169, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, fixed_bl, 233, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, fixed_bl, 153, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, fixed_bl, 217, 82, 7, 23, 0, 8, DataChangeNotify.TYPE_MY_FOLLOW_CHANGED, 0, 8, 44, 0, fixed_bl, 185, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, fixed_bl, 249, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, fixed_bl, 197, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, fixed_bl, 165, 0, 8, 2, 0, 8, 130, 0, 8, 66, 0, fixed_bl, 229, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, fixed_bl, 149, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, fixed_bl, 213, 82, 7, 19, 0, 8, 106, 0, 8, 42, 0, fixed_bl, 181, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, fixed_bl, 245, 80, 7, fixed_bd, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, fixed_bl, Notification.TYPE_GROUP_MEMBER_KICKED, 81, 7, BMAX, 0, 8, VideoItem.STATE_UPLOAD_PAUSE, 0, 8, 38, 0, fixed_bl, 173, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, fixed_bl, 237, 80, 7, fixed_bl, 0, 8, 94, 0, 8, 30, 0, fixed_bl, 157, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, fixed_bl, 221, 82, 7, 27, 0, 8, DataChangeNotify.TYPE_NEW_AT_RECEIVED, 0, 8, 46, 0, fixed_bl, 189, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, fixed_bl, 253, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, 113, 0, 8, 49, 0, fixed_bl, 195, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, fixed_bl, 163, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, fixed_bl, 227, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, fixed_bl, 147, 83, 7, 59, 0, 8, 121, 0, 8, 57, 0, fixed_bl, 211, 81, 7, 17, 0, 8, 105, 0, 8, 41, 0, fixed_bl, 179, 0, 8, fixed_bl, 0, 8, 137, 0, 8, 73, 0, fixed_bl, 243, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, 117, 0, 8, 53, 0, fixed_bl, Notification.TYPE_GROUP_MEMBER_EXITED, 81, 7, 13, 0, 8, VideoItem.STATE_UPLOAD_FAIL, 0, 8, 37, 0, fixed_bl, 171, 0, 8, fixed_bd, 0, 8, 133, 0, 8, 69, 0, fixed_bl, 235, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, fixed_bl, 155, 84, 7, 83, 0, 8, 125, 0, 8, 61, 0, fixed_bl, 219, 82, 7, 23, 0, 8, DataChangeNotify.TYPE_NEW_REPLY_RECIEVED, 0, 8, 45, 0, fixed_bl, 187, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, fixed_bl, 251, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, fixed_bl, 199, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, fixed_bl, 167, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, fixed_bl, 231, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, fixed_bl, 151, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, fixed_bl, 215, 82, 7, 19, 0, 8, 107, 0, 8, 43, 0, fixed_bl, 183, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, fixed_bl, 247, 80, 7, fixed_bd, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, fixed_bl, Notification.TYPE_GROUP_ADMIN_DUTY, 81, 7, BMAX, 0, 8, VideoItem.STATE_SUBMIT_FAIL, 0, 8, 39, 0, fixed_bl, 175, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, fixed_bl, 239, 80, 7, fixed_bl, 0, 8, 95, 0, 8, 31, 0, fixed_bl, 159, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, fixed_bl, 223, 82, 7, 27, 0, 8, DataChangeNotify.TYPE_NEW_PRAISE_RECEIVED, 0, 8, 47, 0, fixed_bl, 191, 0, 8, BMAX, 0, 8, 143, 0, 8, 79, 0, fixed_bl, 255};
    private int[] c;
    private int[] hn;
    private int[] r;
    private int[] u;
    private int[] v;
    private int[] x;

    InfTree() {
    }

    private int huft_build(int[] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8) {
        int i4 = 0;
        int i5 = i2;
        do {
            int[] iArr9 = this.c;
            int i6 = iArr[i + i4];
            iArr9[i6] = iArr9[i6] + 1;
            i4++;
            i5--;
        } while (i5 != 0);
        if (this.c[0] == i2) {
            iArr4[0] = -1;
            iArr5[0] = 0;
            return 0;
        }
        i4 = iArr5[0];
        i5 = 1;
        while (i5 <= BMAX && this.c[i5] == 0) {
            i5++;
        }
        if (i4 < i5) {
            i4 = i5;
        }
        int i7 = BMAX;
        while (i7 != 0 && this.c[i7] == 0) {
            i7--;
        }
        if (i4 > i7) {
            i4 = i7;
        }
        iArr5[0] = i4;
        i6 = 1 << i5;
        int i8 = i5;
        while (i8 < i7) {
            i6 -= this.c[i8];
            if (i6 < 0) {
                return -3;
            }
            i8++;
            i6 <<= 1;
        }
        int i9 = i6 - this.c[i7];
        if (i9 < 0) {
            return -3;
        }
        int[] iArr10 = this.c;
        iArr10[i7] = iArr10[i7] + i9;
        int i10 = 0;
        this.x[1] = 0;
        i8 = 1;
        i6 = 2;
        int i11 = i7;
        while (true) {
            i11--;
            if (i11 == 0) {
                break;
            }
            i10 += this.c[i8];
            this.x[i6] = i10;
            i6++;
            i8++;
        }
        i8 = 0;
        i6 = 0;
        do {
            i10 = iArr[i + i6];
            if (i10 != 0) {
                int[] iArr11 = this.x;
                int i12 = iArr11[i10];
                iArr11[i10] = i12 + 1;
                iArr8[i12] = i8;
            }
            i6++;
            i8++;
        } while (i8 < i2);
        int i13 = this.x[i7];
        this.x[0] = 0;
        int i14 = -1;
        i8 = -i4;
        this.u[0] = 0;
        i10 = 0;
        i6 = 0;
        i11 = 0;
        i5 = 0;
        for (i12 = i5; i12 <= i7; i12++) {
            int i15 = this.c[i12];
            while (true) {
                int i16 = i15 - 1;
                if (i15 == 0) {
                    break;
                }
                int i17;
                i15 = i10;
                i10 = i14;
                i14 = i5;
                while (i12 > i8 + i4) {
                    i17 = i10 + 1;
                    i15 = i8 + i4;
                    i5 = i7 - i15;
                    i14 = i5 > i4 ? i4 : i5;
                    i5 = i12 - i15;
                    i8 = 1 << i5;
                    if (i8 > i16 + 1) {
                        i8 -= i16 + 1;
                        if (i5 < i14) {
                            i10 = i8;
                            i8 = i12;
                            while (true) {
                                i5++;
                                if (i5 >= i14) {
                                    break;
                                }
                                i10 <<= 1;
                                i8++;
                                if (i10 <= this.c[i8]) {
                                    break;
                                }
                                i10 -= this.c[i8];
                            }
                        }
                    }
                    i8 = 1 << i5;
                    if (iArr7[0] + i8 > 1440) {
                        return -3;
                    }
                    int[] iArr12 = this.u;
                    i10 = iArr7[0];
                    iArr12[i17] = i10;
                    iArr7[0] = iArr7[0] + i8;
                    if (i17 != 0) {
                        this.x[i17] = i11;
                        this.r[0] = (byte) i5;
                        this.r[1] = (byte) i4;
                        i5 = i11 >>> (i15 - i4);
                        this.r[2] = (i10 - this.u[i17 - 1]) - i5;
                        System.arraycopy(this.r, 0, iArr6, (i5 + this.u[i17 - 1]) * 3, 3);
                        i14 = i8;
                        i8 = i15;
                        i15 = i10;
                        i10 = i17;
                    } else {
                        iArr4[0] = i10;
                        i14 = i8;
                        i8 = i15;
                        i15 = i10;
                        i10 = i17;
                    }
                }
                this.r[1] = (byte) (i12 - i8);
                if (i6 >= i13) {
                    this.r[0] = 192;
                    i5 = i6;
                } else if (iArr8[i6] < i3) {
                    this.r[0] = (byte) (iArr8[i6] < 256 ? 0 : 96);
                    i5 = i6 + 1;
                    this.r[2] = iArr8[i6];
                } else {
                    this.r[0] = (byte) ((iArr3[iArr8[i6] - i3] + 16) + 64);
                    i5 = i6 + 1;
                    this.r[2] = iArr2[iArr8[i6] - i3];
                }
                i17 = 1 << (i12 - i8);
                for (i6 = i11 >>> i8; i6 < i14; i6 += i17) {
                    System.arraycopy(this.r, 0, iArr6, (i15 + i6) * 3, 3);
                }
                i6 = 1 << (i12 - 1);
                while ((i11 & i6) != 0) {
                    i11 ^= i6;
                    i6 >>>= 1;
                }
                i11 ^= i6;
                int i18 = i8;
                i8 = (1 << i8) - 1;
                i6 = i18;
                while ((i8 & i11) != this.x[i10]) {
                    i10--;
                    i6 -= i4;
                    i8 = (1 << i6) - 1;
                }
                i8 = i6;
                i6 = i5;
                i5 = i14;
                i14 = i10;
                i10 = i15;
                i15 = i16;
            }
        }
        return (i9 == 0 || i7 == 1) ? 0 : -5;
    }

    int inflate_trees_bits(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, ZStream zStream) {
        initWorkArea(19);
        this.hn[0] = 0;
        int huft_build = huft_build(iArr, 0, 19, 19, null, null, iArr3, iArr2, iArr4, this.hn, this.v);
        if (huft_build == -3) {
            zStream.msg = hae.a(new byte[]{(byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 112, (byte) 103, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 103, (byte) 96, (byte) 97, (byte) 37, (byte) 97, (byte) 124, (byte) 107, (byte) 100, (byte) 104, (byte) 108, (byte) 102, (byte) 37, (byte) 103, (byte) 108, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 118, (byte) 37, (byte) 113, (byte) 119, (byte) 96, (byte) 96});
            return huft_build;
        } else if (huft_build != -5 && iArr2[0] != 0) {
            return huft_build;
        } else {
            zStream.msg = hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 102, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 97, (byte) 124, (byte) 107, (byte) 100, (byte) 104, (byte) 108, (byte) 102, (byte) 37, (byte) 103, (byte) 108, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 118, (byte) 37, (byte) 113, (byte) 119, (byte) 96, (byte) 96});
            return -3;
        }
    }

    int inflate_trees_dynamic(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, ZStream zStream) {
        initWorkArea(288);
        this.hn[0] = 0;
        int huft_build = huft_build(iArr, 0, i, 257, cplens, cplext, iArr4, iArr2, iArr6, this.hn, this.v);
        if (huft_build == 0 && iArr2[0] != 0) {
            initWorkArea(288);
            huft_build = huft_build(iArr, i, i2, 0, cpdist, cpdext, iArr5, iArr3, iArr6, this.hn, this.v);
            if (huft_build == 0 && (iArr3[0] != 0 || i <= 257)) {
                return 0;
            }
            if (huft_build == -3) {
                zStream.msg = hae.a(new byte[]{(byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 112, (byte) 103, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 103, (byte) 96, (byte) 97, (byte) 37, (byte) 97, (byte) 108, (byte) 118, (byte) 113, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 37, (byte) 113, (byte) 119, (byte) 96, (byte) 96});
                return huft_build;
            } else if (huft_build == -5) {
                zStream.msg = hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 102, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 97, (byte) 108, (byte) 118, (byte) 113, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 37, (byte) 113, (byte) 119, (byte) 96, (byte) 96});
                return -3;
            } else if (huft_build == -4) {
                return huft_build;
            } else {
                zStream.msg = hae.a(new byte[]{(byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 37, (byte) 97, (byte) 108, (byte) 118, (byte) 113, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 37, (byte) 113, (byte) 119, (byte) 96, (byte) 96, (byte) 37, (byte) 114, (byte) 108, (byte) 113, (byte) 109, (byte) 37, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 118});
                return -3;
            }
        } else if (huft_build == -3) {
            zStream.msg = hae.a(new byte[]{(byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 112, (byte) 103, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 103, (byte) 96, (byte) 97, (byte) 37, (byte) 105, (byte) 108, (byte) 113, (byte) 96, (byte) 119, (byte) 100, (byte) 105, (byte) 42, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 37, (byte) 113, (byte) 119, (byte) 96, (byte) 96});
            return huft_build;
        } else if (huft_build == -4) {
            return huft_build;
        } else {
            zStream.msg = hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 102, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 105, (byte) 108, (byte) 113, (byte) 96, (byte) 119, (byte) 100, (byte) 105, (byte) 42, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 37, (byte) 113, (byte) 119, (byte) 96, (byte) 96});
            return -3;
        }
    }

    static int inflate_trees_fixed(int[] iArr, int[] iArr2, int[][] iArr3, int[][] iArr4) {
        iArr[0] = fixed_bl;
        iArr2[0] = fixed_bd;
        iArr3[0] = fixed_tl;
        iArr4[0] = fixed_td;
        return 0;
    }

    private void initWorkArea(int i) {
        if (this.hn == null) {
            this.hn = new int[1];
            this.v = new int[i];
            this.c = new int[16];
            this.r = new int[3];
            this.u = new int[BMAX];
            this.x = new int[16];
            return;
        }
        int i2;
        if (this.v.length < i) {
            this.v = new int[i];
        } else {
            for (i2 = 0; i2 < i; i2++) {
                this.v[i2] = 0;
            }
        }
        for (i2 = 0; i2 < 16; i2++) {
            this.c[i2] = 0;
        }
        for (i2 = 0; i2 < 3; i2++) {
            this.r[i2] = 0;
        }
        System.arraycopy(this.c, 0, this.u, 0, BMAX);
        System.arraycopy(this.c, 0, this.x, 0, 16);
    }
}
