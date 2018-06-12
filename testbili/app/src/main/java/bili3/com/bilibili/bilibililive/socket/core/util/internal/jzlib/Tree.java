package bili3.com.bilibili.bilibililive.socket.core.util.internal.jzlib;

import com.bilibili.bilibililive.api.entity.BiliPostImage;
import com.bilibili.bilibililive.im.entity.DataChangeNotify;
import com.tencent.connect.share.QQShare;

/* compiled from: BL */
final class Tree {
    static final byte[] _dist_code = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 4, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 9, (byte) 9, (byte) 9, (byte) 9, (byte) 9, (byte) 9, (byte) 9, (byte) 9, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 0, (byte) 0, (byte) 16, (byte) 17, (byte) 18, (byte) 18, (byte) 19, (byte) 19, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29, (byte) 29};
    static final byte[] _length_code = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 8, (byte) 9, (byte) 9, (byte) 10, (byte) 10, (byte) 11, (byte) 11, (byte) 12, (byte) 12, (byte) 12, (byte) 12, (byte) 13, (byte) 13, (byte) 13, (byte) 13, (byte) 14, (byte) 14, (byte) 14, (byte) 14, (byte) 15, (byte) 15, (byte) 15, (byte) 15, (byte) 16, (byte) 16, (byte) 16, (byte) 16, (byte) 16, (byte) 16, (byte) 16, (byte) 16, (byte) 17, (byte) 17, (byte) 17, (byte) 17, (byte) 17, (byte) 17, (byte) 17, (byte) 17, (byte) 18, (byte) 18, (byte) 18, (byte) 18, (byte) 18, (byte) 18, (byte) 18, (byte) 18, (byte) 19, (byte) 19, (byte) 19, (byte) 19, (byte) 19, (byte) 19, (byte) 19, (byte) 19, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 20, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 21, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 22, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 24, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 25, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 26, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 28};
    static final int[] base_dist = new int[]{0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, 192, 256, 384, QQShare.QQ_SHARE_SUMMARY_MAX_LENGTH, 768, 1024, 1536, 2048, 3072, BiliPostImage.MAX_HEIGHT, 6144, 8192, 12288, 16384, 24576};
    static final int[] base_length = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, DataChangeNotify.TYPE_NEW_UP_ASSISTANT, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, 160, 192, 224, 0};
    static final byte[] bl_order = new byte[]{(byte) 16, (byte) 17, (byte) 18, (byte) 0, (byte) 8, (byte) 7, (byte) 9, (byte) 6, (byte) 10, (byte) 5, (byte) 11, (byte) 4, (byte) 12, (byte) 3, (byte) 13, (byte) 2, (byte) 14, (byte) 1, (byte) 15};
    static final int[] extra_blbits = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};
    static final int[] extra_dbits = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
    static final int[] extra_lbits = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};
    short[] dyn_tree;
    int max_code;
    StaticTree stat_desc;

    Tree() {
    }

    static int d_code(int i) {
        return i < 256 ? _dist_code[i] : _dist_code[(i >>> 7) + 256];
    }

    private void gen_bitlen(Deflate deflate) {
        int i;
        int i2;
        short[] sArr = this.dyn_tree;
        short[] sArr2 = this.stat_desc.static_tree;
        int[] iArr = this.stat_desc.extra_bits;
        int i3 = this.stat_desc.extra_base;
        short s = this.stat_desc.max_length;
        for (i = 0; i <= 15; i++) {
            deflate.bl_count[i] = (short) 0;
        }
        sArr[(deflate.heap[deflate.heap_max] * 2) + 1] = (short) 0;
        int i4 = deflate.heap_max + 1;
        i = 0;
        while (i4 < 573) {
            int i5 = deflate.heap[i4];
            int i6 = sArr[(sArr[(i5 * 2) + 1] * 2) + 1] + 1;
            if (i6 > s) {
                i++;
                i6 = s;
            }
            sArr[(i5 * 2) + 1] = (short) i6;
            if (i5 <= this.max_code) {
                short[] sArr3 = deflate.bl_count;
                sArr3[i6] = (short) (sArr3[i6] + 1);
                if (i5 >= i3) {
                    i2 = iArr[i5 - i3];
                } else {
                    i2 = 0;
                }
                short s2 = sArr[i5 * 2];
                deflate.opt_len = ((i6 + i2) * s2) + deflate.opt_len;
                if (sArr2 != null) {
                    deflate.static_len += (i2 + sArr2[(i5 * 2) + 1]) * s2;
                }
            }
            i4++;
        }
        if (i != 0) {
            do {
                i6 = s - 1;
                while (deflate.bl_count[i6] == (short) 0) {
                    i6--;
                }
                sArr3 = deflate.bl_count;
                sArr3[i6] = (short) (sArr3[i6] - 1);
                sArr3 = deflate.bl_count;
                i6++;
                sArr3[i6] = (short) (sArr3[i6] + 2);
                short[] sArr4 = deflate.bl_count;
                sArr4[s] = (short) (sArr4[s] - 1);
                i -= 2;
            } while (i > 0);
            i6 = i4;
            while (s != (short) 0) {
                i = deflate.bl_count[s];
                while (i != 0) {
                    i6--;
                    i2 = deflate.heap[i6];
                    if (i2 <= this.max_code) {
                        if (sArr[(i2 * 2) + 1] != s) {
                            deflate.opt_len = (int) (((long) deflate.opt_len) + ((((long) s) - ((long) sArr[(i2 * 2) + 1])) * ((long) sArr[i2 * 2])));
                            sArr[(i2 * 2) + 1] = (short) s;
                        }
                        i--;
                    }
                }
                s--;
            }
        }
    }

    void build_tree(Deflate deflate) {
        int i;
        short[] sArr = this.dyn_tree;
        short[] sArr2 = this.stat_desc.static_tree;
        int i2 = this.stat_desc.elems;
        int i3 = -1;
        deflate.heap_len = 0;
        deflate.heap_max = 573;
        for (i = 0; i < i2; i++) {
            if (sArr[i * 2] != (short) 0) {
                int[] iArr = deflate.heap;
                int i4 = deflate.heap_len + 1;
                deflate.heap_len = i4;
                iArr[i4] = i;
                deflate.depth[i] = (byte) 0;
                i3 = i;
            } else {
                sArr[(i * 2) + 1] = (short) 0;
            }
        }
        while (deflate.heap_len < 2) {
            int[] iArr2 = deflate.heap;
            int i5 = deflate.heap_len + 1;
            deflate.heap_len = i5;
            if (i3 < 2) {
                i3++;
                i = i3;
            } else {
                i = 0;
            }
            iArr2[i5] = i;
            sArr[i * 2] = (short) 1;
            deflate.depth[i] = (byte) 0;
            deflate.opt_len--;
            if (sArr2 != null) {
                deflate.static_len -= sArr2[(i * 2) + 1];
            }
        }
        this.max_code = i3;
        for (i = deflate.heap_len / 2; i >= 1; i--) {
            deflate.pqdownheap(sArr, i);
        }
        i = i2;
        while (true) {
            int i6 = deflate.heap[1];
            int[] iArr3 = deflate.heap;
            int[] iArr4 = deflate.heap;
            i4 = deflate.heap_len;
            deflate.heap_len = i4 - 1;
            iArr3[1] = iArr4[i4];
            deflate.pqdownheap(sArr, 1);
            i2 = deflate.heap[1];
            iArr4 = deflate.heap;
            i4 = deflate.heap_max - 1;
            deflate.heap_max = i4;
            iArr4[i4] = i6;
            iArr4 = deflate.heap;
            i4 = deflate.heap_max - 1;
            deflate.heap_max = i4;
            iArr4[i4] = i2;
            sArr[i * 2] = (short) (sArr[i6 * 2] + sArr[i2 * 2]);
            deflate.depth[i] = (byte) (Math.max(deflate.depth[i6], deflate.depth[i2]) + 1);
            i6 = (i6 * 2) + 1;
            short s = (short) i;
            sArr[(i2 * 2) + 1] = s;
            sArr[i6] = s;
            i6 = i + 1;
            deflate.heap[1] = i;
            deflate.pqdownheap(sArr, 1);
            if (deflate.heap_len < 2) {
                int[] iArr5 = deflate.heap;
                i6 = deflate.heap_max - 1;
                deflate.heap_max = i6;
                iArr5[i6] = deflate.heap[1];
                gen_bitlen(deflate);
                gen_codes(sArr, i3, deflate.bl_count);
                return;
            }
            i = i6;
        }
    }

    private static void gen_codes(short[] sArr, int i, short[] sArr2) {
        int i2 = 0;
        short[] sArr3 = new short[16];
        int i3 = 0;
        for (int i4 = 1; i4 <= 15; i4++) {
            i3 = (short) ((i3 + sArr2[i4 - 1]) << 1);
            sArr3[i4] = i3;
        }
        while (i2 <= i) {
            short s = sArr[(i2 * 2) + 1];
            if (s != (short) 0) {
                i3 = i2 * 2;
                short s2 = sArr3[s];
                sArr3[s] = (short) (s2 + 1);
                sArr[i3] = (short) bi_reverse(s2, s);
            }
            i2++;
        }
    }

    private static int bi_reverse(int i, int i2) {
        int i3 = 0;
        do {
            i >>>= 1;
            i3 = (i3 | (i & 1)) << 1;
            i2--;
        } while (i2 > 0);
        return i3 >>> 1;
    }
}
