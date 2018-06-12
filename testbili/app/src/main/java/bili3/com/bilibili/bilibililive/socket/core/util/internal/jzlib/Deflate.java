package bili3.com.bilibili.bilibililive.socket.core.util.internal.jzlib;

import bl.hae;
import com.bilibili.bilibililive.api.entity.BiliPostImage;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;

/* compiled from: BL */
final class Deflate {
    private static final int BUSY_STATE = 113;
    private static final int BlockDone = 1;
    private static final int Buf_size = 16;
    private static final int DYN_TREES = 2;
    private static final int END_BLOCK = 256;
    private static final int FAST = 1;
    private static final int FINISH_STATE = 666;
    private static final int FinishDone = 3;
    private static final int FinishStarted = 2;
    private static final int INIT_STATE = 42;
    private static final int MAX_MATCH = 258;
    private static final int MIN_LOOKAHEAD = 262;
    private static final int MIN_MATCH = 3;
    private static final int NeedMore = 0;
    private static final int REPZ_11_138 = 18;
    private static final int REPZ_3_10 = 17;
    private static final int REP_3_6 = 16;
    private static final int SLOW = 2;
    private static final int STATIC_TREES = 1;
    private static final int STORED = 0;
    private static final int STORED_BLOCK = 0;
    private static final int Z_ASCII = 1;
    private static final int Z_BINARY = 0;
    private static final int Z_UNKNOWN = 2;
    private static final Config[] config_table = new Config[10];
    private static final String[] z_errmsg = new String[]{hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 96, (byte) 97, (byte) 37, (byte) 97, (byte) 108, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 100, (byte) 119, (byte) 124}), hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104, (byte) 37, (byte) 96, (byte) 107, (byte) 97}), Constants.STR_EMPTY, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 118, (byte) 112, (byte) 99, (byte) 99, (byte) 108, (byte) 102, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 104, (byte) 96, (byte) 104, (byte) 106, (byte) 119, (byte) 124}), hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 99, (byte) 99, (byte) 96, (byte) 119, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 102, (byte) 106, (byte) 104, (byte) 117, (byte) 100, (byte) 113, (byte) 108, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107}), Constants.STR_EMPTY};
    short bi_buf;
    int bi_valid;
    short[] bl_count = new short[REP_3_6];
    Tree bl_desc = new Tree();
    short[] bl_tree = new short[78];
    int block_start;
    int d_buf;
    Tree d_desc = new Tree();
    byte data_type;
    byte[] depth = new byte[573];
    short[] dyn_dtree = new short[122];
    short[] dyn_ltree = new short[1146];
    int good_match;
    private int gzipUncompressedBytes;
    int hash_bits;
    int hash_mask;
    int hash_shift;
    int hash_size;
    short[] head;
    int[] heap = new int[573];
    int heap_len;
    int heap_max;
    int ins_h;
    int l_buf;
    Tree l_desc = new Tree();
    int last_eob_len;
    int last_flush;
    int last_lit;
    int level;
    int lit_bufsize;
    int lookahead;
    int match_available;
    int match_length;
    int match_start;
    int matches;
    int max_chain_length;
    int max_lazy_match;
    int nice_match;
    int opt_len;
    int pending;
    byte[] pending_buf;
    int pending_buf_size;
    int pending_out;
    short[] prev;
    int prev_length;
    int prev_match;
    int static_len;
    int status;
    int strategy;
    ZStream strm;
    int strstart;
    int w_bits;
    int w_mask;
    int w_size;
    byte[] window;
    int window_size;
    WrapperType wrapperType;
    private boolean wroteTrailer;

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bilibili$bilibililive$socket$core$util$internal$jzlib$JZlib$WrapperType = new int[WrapperType.values().length];

        static {
            try {
                $SwitchMap$com$bilibili$bilibililive$socket$core$util$internal$jzlib$JZlib$WrapperType[WrapperType.ZLIB.ordinal()] = Deflate.Z_ASCII;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$bilibili$bilibililive$socket$core$util$internal$jzlib$JZlib$WrapperType[WrapperType.GZIP.ordinal()] = Deflate.Z_UNKNOWN;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* compiled from: BL */
    static final class Config {
        final int func;
        final int good_length;
        final int max_chain;
        final int max_lazy;
        final int nice_length;

        Config(int i, int i2, int i3, int i4, int i5) {
            this.good_length = i;
            this.max_lazy = i2;
            this.nice_length = i3;
            this.max_chain = i4;
            this.func = i5;
        }
    }

    static {
        config_table[Z_BINARY] = new Config(Z_BINARY, Z_BINARY, Z_BINARY, Z_BINARY, Z_BINARY);
        config_table[Z_ASCII] = new Config(4, 4, 8, 4, Z_ASCII);
        config_table[Z_UNKNOWN] = new Config(4, 5, REP_3_6, 8, Z_ASCII);
        config_table[MIN_MATCH] = new Config(4, 6, 32, 32, Z_ASCII);
        config_table[4] = new Config(4, 4, REP_3_6, REP_3_6, Z_UNKNOWN);
        config_table[5] = new Config(8, REP_3_6, 32, 32, Z_UNKNOWN);
        config_table[6] = new Config(8, REP_3_6, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, Z_UNKNOWN);
        config_table[7] = new Config(8, 32, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, END_BLOCK, Z_UNKNOWN);
        config_table[8] = new Config(32, QQShare.QQ_SHARE_TITLE_MAX_LENGTH, MAX_MATCH, 1024, Z_UNKNOWN);
        config_table[9] = new Config(32, MAX_MATCH, MAX_MATCH, BiliPostImage.MAX_HEIGHT, Z_UNKNOWN);
    }

    Deflate() {
    }

    private void lm_init() {
        this.window_size = this.w_size * Z_UNKNOWN;
        this.max_lazy_match = config_table[this.level].max_lazy;
        this.good_match = config_table[this.level].good_length;
        this.nice_match = config_table[this.level].nice_length;
        this.max_chain_length = config_table[this.level].max_chain;
        this.strstart = Z_BINARY;
        this.block_start = Z_BINARY;
        this.lookahead = Z_BINARY;
        this.prev_length = Z_UNKNOWN;
        this.match_length = Z_UNKNOWN;
        this.match_available = Z_BINARY;
        this.ins_h = Z_BINARY;
    }

    private void tr_init() {
        this.l_desc.dyn_tree = this.dyn_ltree;
        this.l_desc.stat_desc = StaticTree.static_l_desc;
        this.d_desc.dyn_tree = this.dyn_dtree;
        this.d_desc.stat_desc = StaticTree.static_d_desc;
        this.bl_desc.dyn_tree = this.bl_tree;
        this.bl_desc.stat_desc = StaticTree.static_bl_desc;
        this.bi_buf = (short) 0;
        this.bi_valid = Z_BINARY;
        this.last_eob_len = 8;
        init_block();
    }

    private void init_block() {
        int i;
        for (i = Z_BINARY; i < 286; i += Z_ASCII) {
            this.dyn_ltree[i * Z_UNKNOWN] = (short) 0;
        }
        for (i = Z_BINARY; i < 30; i += Z_ASCII) {
            this.dyn_dtree[i * Z_UNKNOWN] = (short) 0;
        }
        for (i = Z_BINARY; i < 19; i += Z_ASCII) {
            this.bl_tree[i * Z_UNKNOWN] = (short) 0;
        }
        this.dyn_ltree[QQShare.QQ_SHARE_SUMMARY_MAX_LENGTH] = (short) 1;
        this.static_len = Z_BINARY;
        this.opt_len = Z_BINARY;
        this.matches = Z_BINARY;
        this.last_lit = Z_BINARY;
    }

    void pqdownheap(short[] sArr, int i) {
        int i2 = this.heap[i];
        int i3 = i << Z_ASCII;
        while (i3 <= this.heap_len) {
            int i4;
            if (i3 >= this.heap_len || !smaller(sArr, this.heap[i3 + Z_ASCII], this.heap[i3], this.depth)) {
                i4 = i3;
            } else {
                i4 = i3 + Z_ASCII;
            }
            if (smaller(sArr, i2, this.heap[i4], this.depth)) {
                break;
            }
            this.heap[i] = this.heap[i4];
            i3 = i4 << Z_ASCII;
            i = i4;
        }
        this.heap[i] = i2;
    }

    private static boolean smaller(short[] sArr, int i, int i2, byte[] bArr) {
        short s = sArr[i * Z_UNKNOWN];
        short s2 = sArr[i2 * Z_UNKNOWN];
        return s < s2 || (s == s2 && bArr[i] <= bArr[i2]);
    }

    private void scan_tree(short[] sArr, int i) {
        int i2;
        int i3;
        short s = (short) -1;
        short s2 = sArr[Z_ASCII];
        if (s2 == (short) 0) {
            i2 = 138;
            i3 = MIN_MATCH;
        } else {
            i3 = 4;
            i2 = 7;
        }
        sArr[((i + Z_ASCII) * Z_UNKNOWN) + Z_ASCII] = (short) -1;
        int i4 = Z_BINARY;
        int i5 = Z_BINARY;
        while (i5 <= i) {
            short s3 = sArr[((i5 + Z_ASCII) * Z_UNKNOWN) + Z_ASCII];
            i4 += Z_ASCII;
            if (i4 >= i2 || s2 != s3) {
                short[] sArr2;
                if (i4 < i3) {
                    sArr2 = this.bl_tree;
                    i2 = s2 * Z_UNKNOWN;
                    sArr2[i2] = (short) (i4 + sArr2[i2]);
                } else if (s2 != (short) 0) {
                    if (s2 != s) {
                        sArr2 = this.bl_tree;
                        i2 = s2 * Z_UNKNOWN;
                        sArr2[i2] = (short) (sArr2[i2] + Z_ASCII);
                    }
                    sArr2 = this.bl_tree;
                    sArr2[32] = (short) (sArr2[32] + Z_ASCII);
                } else if (i4 <= 10) {
                    sArr2 = this.bl_tree;
                    sArr2[34] = (short) (sArr2[34] + Z_ASCII);
                } else {
                    sArr2 = this.bl_tree;
                    sArr2[36] = (short) (sArr2[36] + Z_ASCII);
                }
                if (s3 == (short) 0) {
                    i2 = 138;
                    i4 = Z_BINARY;
                    s = s2;
                    i3 = MIN_MATCH;
                } else if (s2 == s3) {
                    i2 = 6;
                    i4 = Z_BINARY;
                    s = s2;
                    i3 = MIN_MATCH;
                } else {
                    i3 = 4;
                    i2 = 7;
                    i4 = Z_BINARY;
                    s = s2;
                }
            }
            i5 += Z_ASCII;
            s2 = s3;
        }
    }

    private int build_bl_tree() {
        scan_tree(this.dyn_ltree, this.l_desc.max_code);
        scan_tree(this.dyn_dtree, this.d_desc.max_code);
        this.bl_desc.build_tree(this);
        int i = REPZ_11_138;
        while (i >= MIN_MATCH && this.bl_tree[(Tree.bl_order[i] * Z_UNKNOWN) + Z_ASCII] == (short) 0) {
            i--;
        }
        this.opt_len += ((((i + Z_ASCII) * MIN_MATCH) + 5) + 5) + 4;
        return i;
    }

    private void send_all_trees(int i, int i2, int i3) {
        send_bits(i - 257, 5);
        send_bits(i2 - 1, 5);
        send_bits(i3 - 4, 4);
        for (int i4 = Z_BINARY; i4 < i3; i4 += Z_ASCII) {
            send_bits(this.bl_tree[(Tree.bl_order[i4] * Z_UNKNOWN) + Z_ASCII], MIN_MATCH);
        }
        send_tree(this.dyn_ltree, i - 1);
        send_tree(this.dyn_dtree, i2 - 1);
    }

    private void send_tree(short[] sArr, int i) {
        int i2;
        int i3;
        short s = (short) -1;
        short s2 = sArr[Z_ASCII];
        if (s2 == (short) 0) {
            i2 = MIN_MATCH;
            i3 = 138;
        } else {
            i2 = 4;
            i3 = 7;
        }
        int i4 = i3;
        int i5 = Z_BINARY;
        i3 = i2;
        i2 = Z_BINARY;
        while (i5 <= i) {
            int i6;
            short s3 = sArr[((i5 + Z_ASCII) * Z_UNKNOWN) + Z_ASCII];
            i2 += Z_ASCII;
            if (i2 >= i4 || s2 != s3) {
                if (i2 < i3) {
                    do {
                        send_code(s2, this.bl_tree);
                        i2--;
                    } while (i2 != 0);
                } else if (s2 != (short) 0) {
                    if (s2 != s) {
                        send_code(s2, this.bl_tree);
                        i2--;
                    }
                    send_code(REP_3_6, this.bl_tree);
                    send_bits(i2 - 3, Z_UNKNOWN);
                } else if (i2 <= 10) {
                    send_code(REPZ_3_10, this.bl_tree);
                    send_bits(i2 - 3, MIN_MATCH);
                } else {
                    send_code(REPZ_11_138, this.bl_tree);
                    send_bits(i2 - 11, 7);
                }
                if (s3 == (short) 0) {
                    i2 = MIN_MATCH;
                    i3 = 138;
                    i4 = Z_BINARY;
                    s = s2;
                } else if (s2 == s3) {
                    i3 = 6;
                    i4 = Z_BINARY;
                    s = s2;
                    i2 = MIN_MATCH;
                } else {
                    i2 = 4;
                    i3 = 7;
                    i4 = Z_BINARY;
                    s = s2;
                }
            } else {
                i6 = i3;
                i3 = i4;
                i4 = i2;
                i2 = i6;
            }
            i5 += Z_ASCII;
            s2 = s3;
            i6 = i4;
            i4 = i3;
            i3 = i2;
            i2 = i6;
        }
    }

    private final void put_byte(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.pending_buf, this.pending, i2);
        this.pending += i2;
    }

    private final void put_byte(byte b) {
        byte[] bArr = this.pending_buf;
        int i = this.pending;
        this.pending = i + Z_ASCII;
        bArr[i] = b;
    }

    private final void put_short(int i) {
        put_byte((byte) i);
        put_byte((byte) (i >>> 8));
    }

    private final void putShortMSB(int i) {
        put_byte((byte) (i >> 8));
        put_byte((byte) i);
    }

    private final void send_code(int i, short[] sArr) {
        int i2 = i * Z_UNKNOWN;
        send_bits(sArr[i2] & 65535, sArr[i2 + Z_ASCII] & 65535);
    }

    private void send_bits(int i, int i2) {
        if (this.bi_valid > 16 - i2) {
            this.bi_buf = (short) (this.bi_buf | ((i << this.bi_valid) & 65535));
            put_short(this.bi_buf);
            this.bi_buf = (short) (i >>> (16 - this.bi_valid));
            this.bi_valid += i2 - 16;
            return;
        }
        this.bi_buf = (short) (this.bi_buf | ((i << this.bi_valid) & 65535));
        this.bi_valid += i2;
    }

    private void _tr_align() {
        send_bits(Z_UNKNOWN, MIN_MATCH);
        send_code(END_BLOCK, StaticTree.static_ltree);
        bi_flush();
        if (((this.last_eob_len + Z_ASCII) + 10) - this.bi_valid < 9) {
            send_bits(Z_UNKNOWN, MIN_MATCH);
            send_code(END_BLOCK, StaticTree.static_ltree);
            bi_flush();
        }
        this.last_eob_len = 7;
    }

    private boolean _tr_tally(int i, int i2) {
        this.pending_buf[this.d_buf + (this.last_lit * Z_UNKNOWN)] = (byte) (i >>> 8);
        this.pending_buf[(this.d_buf + (this.last_lit * Z_UNKNOWN)) + Z_ASCII] = (byte) i;
        this.pending_buf[this.l_buf + this.last_lit] = (byte) i2;
        this.last_lit += Z_ASCII;
        if (i == 0) {
            short[] sArr = this.dyn_ltree;
            int i3 = i2 * Z_UNKNOWN;
            sArr[i3] = (short) (sArr[i3] + Z_ASCII);
        } else {
            this.matches += Z_ASCII;
            int i4 = i - 1;
            short[] sArr2 = this.dyn_ltree;
            int i5 = ((Tree._length_code[i2] + END_BLOCK) + Z_ASCII) * Z_UNKNOWN;
            sArr2[i5] = (short) (sArr2[i5] + Z_ASCII);
            sArr2 = this.dyn_dtree;
            i4 = Tree.d_code(i4) * Z_UNKNOWN;
            sArr2[i4] = (short) (sArr2[i4] + Z_ASCII);
        }
        if ((this.last_lit & 8191) == 0 && this.level > Z_UNKNOWN) {
            i3 = this.last_lit * 8;
            i5 = this.strstart - this.block_start;
            for (i4 = Z_BINARY; i4 < 30; i4 += Z_ASCII) {
                i3 = (int) (((long) i3) + (((long) this.dyn_dtree[i4 * Z_UNKNOWN]) * (5 + ((long) Tree.extra_dbits[i4]))));
            }
            i4 = i3 >>> MIN_MATCH;
            if (this.matches < this.last_lit / Z_UNKNOWN && i4 < i5 / Z_UNKNOWN) {
                return true;
            }
        }
        return this.last_lit == this.lit_bufsize + -1;
    }

    private void compress_block(short[] sArr, short[] sArr2) {
        int i = Z_BINARY;
        if (this.last_lit != 0) {
            do {
                int i2 = ((this.pending_buf[this.d_buf + (i * Z_UNKNOWN)] << 8) & 65280) | (this.pending_buf[(this.d_buf + (i * Z_UNKNOWN)) + Z_ASCII] & 255);
                int i3 = this.pending_buf[this.l_buf + i] & 255;
                i += Z_ASCII;
                if (i2 == 0) {
                    send_code(i3, sArr);
                } else {
                    byte b = Tree._length_code[i3];
                    send_code((b + END_BLOCK) + Z_ASCII, sArr);
                    int i4 = Tree.extra_lbits[b];
                    if (i4 != 0) {
                        send_bits(i3 - Tree.base_length[b], i4);
                    }
                    i2--;
                    i3 = Tree.d_code(i2);
                    send_code(i3, sArr2);
                    int i5 = Tree.extra_dbits[i3];
                    if (i5 != 0) {
                        send_bits(i2 - Tree.base_dist[i3], i5);
                    }
                }
            } while (i < this.last_lit);
        }
        send_code(END_BLOCK, sArr);
        this.last_eob_len = sArr[513];
    }

    private void set_data_type() {
        int i = Z_BINARY;
        int i2 = Z_BINARY;
        int i3 = Z_BINARY;
        while (i3 < 7) {
            i2 += this.dyn_ltree[i3 * Z_UNKNOWN];
            i3 += Z_ASCII;
        }
        int i4 = Z_BINARY;
        while (i3 < QQShare.QQ_SHARE_TITLE_MAX_LENGTH) {
            i4 += this.dyn_ltree[i3 * Z_UNKNOWN];
            i3 += Z_ASCII;
        }
        while (i3 < END_BLOCK) {
            i2 += this.dyn_ltree[i3 * Z_UNKNOWN];
            i3 += Z_ASCII;
        }
        if (i2 <= (i4 >>> Z_UNKNOWN)) {
            i = Z_ASCII;
        }
        this.data_type = (byte) i;
    }

    private void bi_flush() {
        if (this.bi_valid == REP_3_6) {
            put_short(this.bi_buf);
            this.bi_buf = (short) 0;
            this.bi_valid = Z_BINARY;
        } else if (this.bi_valid >= 8) {
            put_byte((byte) this.bi_buf);
            this.bi_buf = (short) (this.bi_buf >>> 8);
            this.bi_valid -= 8;
        }
    }

    private void bi_windup() {
        if (this.bi_valid > 8) {
            put_short(this.bi_buf);
        } else if (this.bi_valid > 0) {
            put_byte((byte) this.bi_buf);
        }
        this.bi_buf = (short) 0;
        this.bi_valid = Z_BINARY;
    }

    private void copy_block(int i, int i2, boolean z) {
        bi_windup();
        this.last_eob_len = 8;
        if (z) {
            put_short((short) i2);
            put_short((short) (i2 ^ -1));
        }
        put_byte(this.window, i, i2);
    }

    private void flush_block_only(boolean z) {
        _tr_flush_block(this.block_start >= 0 ? this.block_start : -1, this.strstart - this.block_start, z);
        this.block_start = this.strstart;
        this.strm.flush_pending();
    }

    private int deflate_stored(int i) {
        boolean z;
        int i2 = Z_ASCII;
        int i3 = 65535;
        if (65535 > this.pending_buf_size - 5) {
            i3 = this.pending_buf_size - 5;
        }
        while (true) {
            if (this.lookahead <= Z_ASCII) {
                fill_window();
                if (this.lookahead != 0 || i != 0) {
                    if (this.lookahead == 0) {
                        break;
                    }
                }
                return Z_BINARY;
            }
            this.strstart += this.lookahead;
            this.lookahead = Z_BINARY;
            int i4 = this.block_start + i3;
            if (this.strstart == 0 || this.strstart >= i4) {
                this.lookahead = this.strstart - i4;
                this.strstart = i4;
                flush_block_only(false);
                if (this.strm.avail_out == 0) {
                    return Z_BINARY;
                }
            }
            if (this.strstart - this.block_start >= this.w_size - 262) {
                flush_block_only(false);
                if (this.strm.avail_out == 0) {
                    return Z_BINARY;
                }
            }
        }
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        flush_block_only(z);
        if (this.strm.avail_out != 0) {
            if (i == 4) {
                i2 = MIN_MATCH;
            }
            return i2;
        } else if (i == 4) {
            return Z_UNKNOWN;
        } else {
            return Z_BINARY;
        }
    }

    private void _tr_stored_block(int i, int i2, boolean z) {
        send_bits((z ? Z_ASCII : Z_BINARY) + Z_BINARY, MIN_MATCH);
        copy_block(i, i2, true);
    }

    private void _tr_flush_block(int i, int i2, boolean z) {
        int build_bl_tree;
        int i3;
        int i4;
        int i5 = Z_ASCII;
        if (this.level > 0) {
            if (this.data_type == (byte) 2) {
                set_data_type();
            }
            this.l_desc.build_tree(this);
            this.d_desc.build_tree(this);
            build_bl_tree = build_bl_tree();
            i3 = ((this.opt_len + MIN_MATCH) + 7) >>> MIN_MATCH;
            i4 = ((this.static_len + MIN_MATCH) + 7) >>> MIN_MATCH;
            if (i4 <= i3) {
                i3 = i4;
            }
        } else {
            build_bl_tree = i2 + 5;
            i4 = build_bl_tree;
            i3 = build_bl_tree;
            build_bl_tree = Z_BINARY;
        }
        if (i2 + 4 <= i3 && i != -1) {
            _tr_stored_block(i, i2, z);
        } else if (i4 == i3) {
            if (!z) {
                i5 = Z_BINARY;
            }
            send_bits(i5 + Z_UNKNOWN, MIN_MATCH);
            compress_block(StaticTree.static_ltree, StaticTree.static_dtree);
        } else {
            if (!z) {
                i5 = Z_BINARY;
            }
            send_bits(i5 + 4, MIN_MATCH);
            send_all_trees(this.l_desc.max_code + Z_ASCII, this.d_desc.max_code + Z_ASCII, build_bl_tree + Z_ASCII);
            compress_block(this.dyn_ltree, this.dyn_dtree);
        }
        init_block();
        if (z) {
            bi_windup();
        }
    }

    private void fill_window() {
        do {
            int i;
            int i2 = (this.window_size - this.lookahead) - this.strstart;
            if (i2 == 0 && this.strstart == 0 && this.lookahead == 0) {
                i = this.w_size;
            } else if (i2 == -1) {
                i = i2 - 1;
            } else if (this.strstart >= (this.w_size + this.w_size) - 262) {
                int i3;
                System.arraycopy(this.window, this.w_size, this.window, Z_BINARY, this.w_size);
                this.match_start -= this.w_size;
                this.strstart -= this.w_size;
                this.block_start -= this.w_size;
                i = this.hash_size;
                int i4 = i;
                do {
                    i--;
                    i3 = this.head[i] & 65535;
                    this.head[i] = i3 >= this.w_size ? (short) (i3 - this.w_size) : (short) 0;
                    i4--;
                } while (i4 != 0);
                i = this.w_size;
                i4 = i;
                do {
                    short s;
                    i--;
                    i3 = this.prev[i] & 65535;
                    short[] sArr = this.prev;
                    if (i3 >= this.w_size) {
                        s = (short) (i3 - this.w_size);
                    } else {
                        s = (short) 0;
                    }
                    sArr[i] = s;
                    i4--;
                } while (i4 != 0);
                i = this.w_size + i2;
            } else {
                i = i2;
            }
            if (this.strm.avail_in != 0) {
                this.lookahead = this.strm.read_buf(this.window, this.strstart + this.lookahead, i) + this.lookahead;
                if (this.lookahead >= MIN_MATCH) {
                    this.ins_h = this.window[this.strstart] & 255;
                    this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + Z_ASCII] & 255)) & this.hash_mask;
                }
                if (this.lookahead >= MIN_LOOKAHEAD) {
                    return;
                }
            } else {
                return;
            }
        } while (this.strm.avail_in != 0);
    }

    private int deflate_fast(int i) {
        int i2 = Z_ASCII;
        int i3 = Z_BINARY;
        while (true) {
            int i4;
            boolean z;
            if (this.lookahead < MIN_LOOKAHEAD) {
                fill_window();
                if (this.lookahead >= MIN_LOOKAHEAD || i != 0) {
                    if (this.lookahead == 0) {
                        break;
                    }
                }
                return Z_BINARY;
            }
            if (this.lookahead >= MIN_MATCH) {
                this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[(this.strstart + MIN_MATCH) - 1] & 255)) & this.hash_mask;
                i4 = this.head[this.ins_h] & 65535;
                this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                this.head[this.ins_h] = (short) this.strstart;
            } else {
                i4 = i3;
            }
            if (!(((long) i4) == 0 || ((this.strstart - i4) & 65535) > this.w_size - 262 || this.strategy == Z_UNKNOWN)) {
                this.match_length = longest_match(i4);
            }
            boolean _tr_tally;
            boolean z2;
            if (this.match_length >= MIN_MATCH) {
                _tr_tally = _tr_tally(this.strstart - this.match_start, this.match_length - 3);
                this.lookahead -= this.match_length;
                if (this.match_length > this.max_lazy_match || this.lookahead < MIN_MATCH) {
                    this.strstart += this.match_length;
                    this.match_length = Z_BINARY;
                    this.ins_h = this.window[this.strstart] & 255;
                    this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + Z_ASCII] & 255)) & this.hash_mask;
                    z2 = _tr_tally;
                    i3 = i4;
                    z = z2;
                } else {
                    this.match_length--;
                    int i5;
                    do {
                        this.strstart += Z_ASCII;
                        this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[(this.strstart + MIN_MATCH) - 1] & 255)) & this.hash_mask;
                        i4 = this.head[this.ins_h] & 65535;
                        this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                        this.head[this.ins_h] = (short) this.strstart;
                        i5 = this.match_length - 1;
                        this.match_length = i5;
                    } while (i5 != 0);
                    this.strstart += Z_ASCII;
                    z2 = _tr_tally;
                    i3 = i4;
                    z = z2;
                }
            } else {
                _tr_tally = _tr_tally(Z_BINARY, this.window[this.strstart] & 255);
                this.lookahead--;
                this.strstart += Z_ASCII;
                z2 = _tr_tally;
                i3 = i4;
                z = z2;
            }
            if (z) {
                flush_block_only(false);
                if (this.strm.avail_out == 0) {
                    return Z_BINARY;
                }
            }
        }
        flush_block_only(i == 4);
        if (this.strm.avail_out != 0) {
            if (i == 4) {
                i2 = MIN_MATCH;
            }
            return i2;
        } else if (i == 4) {
            return Z_UNKNOWN;
        } else {
            return Z_BINARY;
        }
    }

    private int deflate_slow(int i) {
        boolean z;
        int i2 = Z_ASCII;
        int i3 = Z_BINARY;
        while (true) {
            if (this.lookahead < MIN_LOOKAHEAD) {
                fill_window();
                if (this.lookahead >= MIN_LOOKAHEAD || i != 0) {
                    if (this.lookahead == 0) {
                        break;
                    }
                }
                return Z_BINARY;
            }
            if (this.lookahead >= MIN_MATCH) {
                this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[(this.strstart + MIN_MATCH) - 1] & 255)) & this.hash_mask;
                i3 = this.head[this.ins_h] & 65535;
                this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                this.head[this.ins_h] = (short) this.strstart;
            }
            this.prev_length = this.match_length;
            this.prev_match = this.match_start;
            this.match_length = Z_UNKNOWN;
            if (i3 != 0 && this.prev_length < this.max_lazy_match && ((this.strstart - i3) & 65535) <= this.w_size - 262) {
                if (this.strategy != Z_UNKNOWN) {
                    this.match_length = longest_match(i3);
                }
                if (this.match_length <= 5 && (this.strategy == Z_ASCII || (this.match_length == MIN_MATCH && this.strstart - this.match_start > BiliPostImage.MAX_HEIGHT))) {
                    this.match_length = Z_UNKNOWN;
                }
            }
            if (this.prev_length >= MIN_MATCH && this.match_length <= this.prev_length) {
                int i4 = (this.strstart + this.lookahead) - 3;
                boolean _tr_tally = _tr_tally((this.strstart - 1) - this.prev_match, this.prev_length - 3);
                this.lookahead -= this.prev_length - 1;
                this.prev_length -= 2;
                int i5;
                do {
                    i5 = this.strstart + Z_ASCII;
                    this.strstart = i5;
                    if (i5 <= i4) {
                        this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[(this.strstart + MIN_MATCH) - 1] & 255)) & this.hash_mask;
                        i3 = this.head[this.ins_h] & 65535;
                        this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                        this.head[this.ins_h] = (short) this.strstart;
                    }
                    i5 = this.prev_length - 1;
                    this.prev_length = i5;
                } while (i5 != 0);
                this.match_available = Z_BINARY;
                this.match_length = Z_UNKNOWN;
                this.strstart += Z_ASCII;
                if (_tr_tally) {
                    flush_block_only(false);
                    if (this.strm.avail_out == 0) {
                        return Z_BINARY;
                    }
                } else {
                    continue;
                }
            } else if (this.match_available != 0) {
                if (_tr_tally(Z_BINARY, this.window[this.strstart - 1] & 255)) {
                    flush_block_only(false);
                }
                this.strstart += Z_ASCII;
                this.lookahead--;
                if (this.strm.avail_out == 0) {
                    return Z_BINARY;
                }
            } else {
                this.match_available = Z_ASCII;
                this.strstart += Z_ASCII;
                this.lookahead--;
            }
        }
        if (this.match_available != 0) {
            _tr_tally(Z_BINARY, this.window[this.strstart - 1] & 255);
            this.match_available = Z_BINARY;
        }
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        flush_block_only(z);
        if (this.strm.avail_out != 0) {
            if (i == 4) {
                i2 = MIN_MATCH;
            }
            return i2;
        } else if (i == 4) {
            return Z_UNKNOWN;
        } else {
            return Z_BINARY;
        }
    }

    private int longest_match(int i) {
        int i2;
        byte b;
        int i3 = this.max_chain_length;
        int i4 = this.strstart;
        int i5 = this.prev_length;
        int i6 = this.strstart > this.w_size + -262 ? this.strstart - (this.w_size - 262) : Z_BINARY;
        int i7 = this.nice_match;
        int i8 = this.w_mask;
        int i9 = this.strstart + MAX_MATCH;
        byte b2 = this.window[(i4 + i5) - 1];
        byte b3 = this.window[i4 + i5];
        if (this.prev_length >= this.good_match) {
            i3 >>= Z_UNKNOWN;
        }
        byte b4;
        if (i7 > this.lookahead) {
            b4 = b3;
            b3 = b2;
            i2 = this.lookahead;
            i7 = i5;
            i5 = i4;
            i4 = i3;
            b = b4;
        } else {
            b4 = b3;
            b3 = b2;
            i2 = i7;
            i7 = i5;
            i5 = i4;
            i4 = i3;
            b = b4;
        }
        do {
            if (this.window[i + i7] == b && this.window[(i + i7) - 1] == r2 && this.window[i] == this.window[i5]) {
                int i10 = i + Z_ASCII;
                if (this.window[i10] == this.window[i5 + Z_ASCII]) {
                    int i11 = i5 + Z_UNKNOWN;
                    i5 = i10 + Z_ASCII;
                    do {
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                        i11 += Z_ASCII;
                        i5 += Z_ASCII;
                        if (this.window[i11] != this.window[i5]) {
                            break;
                        }
                    } while (i11 < i9);
                    i5 = 258 - (i9 - i11);
                    i11 = i9 - 258;
                    if (i5 > i7) {
                        this.match_start = i;
                        if (i5 >= i2) {
                            i7 = i5;
                            break;
                        }
                        b3 = this.window[(i11 + i5) - 1];
                        b = this.window[i11 + i5];
                        i7 = i5;
                        i5 = i11;
                    } else {
                        i5 = i11;
                    }
                }
            }
            i = this.prev[i & i8] & 65535;
            if (i <= i6) {
                break;
            }
            i4--;
        } while (i4 != 0);
        return i7 <= this.lookahead ? i7 : this.lookahead;
    }

    int deflateInit(ZStream zStream, int i, int i2, WrapperType wrapperType) {
        return deflateInit2(zStream, i, 8, i2, 8, Z_BINARY, wrapperType);
    }

    private int deflateInit2(ZStream zStream, int i, int i2, int i3, int i4, int i5, WrapperType wrapperType) {
        if (wrapperType == WrapperType.ZLIB_OR_NONE) {
            throw new IllegalArgumentException(hae.a(new byte[]{(byte) 95, (byte) 73, (byte) 76, (byte) 71, (byte) 90, (byte) 74, (byte) 87, (byte) 90, (byte) 75, (byte) 74, (byte) 75, (byte) 64, (byte) 37, (byte) 100, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 96, (byte) 97, (byte) 37, (byte) 106, (byte) 107, (byte) 105, (byte) 124, (byte) 37, (byte) 99, (byte) 106, (byte) 119, (byte) 37, (byte) 108, (byte) 107, (byte) 99, (byte) 105, (byte) 100, (byte) 113, (byte) 96}));
        }
        zStream.msg = null;
        if (i == -1) {
            i = 6;
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(hae.a(new byte[]{(byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 71, (byte) 108, (byte) 113, (byte) 118, (byte) 63, (byte) 37}) + i3);
        } else if (i4 < Z_ASCII || i4 > 9 || i2 != 8 || i3 < 9 || i3 > 15 || i < 0 || i > 9 || i5 < 0 || i5 > Z_UNKNOWN) {
            return -2;
        } else {
            zStream.dstate = this;
            this.wrapperType = wrapperType;
            this.w_bits = i3;
            this.w_size = Z_ASCII << this.w_bits;
            this.w_mask = this.w_size - 1;
            this.hash_bits = i4 + 7;
            this.hash_size = Z_ASCII << this.hash_bits;
            this.hash_mask = this.hash_size - 1;
            this.hash_shift = ((this.hash_bits + MIN_MATCH) - 1) / MIN_MATCH;
            this.window = new byte[(this.w_size * Z_UNKNOWN)];
            this.prev = new short[this.w_size];
            this.head = new short[this.hash_size];
            this.lit_bufsize = Z_ASCII << (i4 + 6);
            this.pending_buf = new byte[(this.lit_bufsize * 4)];
            this.pending_buf_size = this.lit_bufsize * 4;
            this.d_buf = this.lit_bufsize / Z_UNKNOWN;
            this.l_buf = this.lit_bufsize * MIN_MATCH;
            this.level = i;
            this.strategy = i5;
            return deflateReset(zStream);
        }
    }

    private int deflateReset(ZStream zStream) {
        zStream.total_out = 0;
        zStream.total_in = 0;
        zStream.msg = null;
        this.pending = Z_BINARY;
        this.pending_out = Z_BINARY;
        this.wroteTrailer = false;
        this.status = this.wrapperType == WrapperType.NONE ? BUSY_STATE : INIT_STATE;
        zStream.adler = Adler32.adler32(0, null, Z_BINARY, Z_BINARY);
        zStream.crc32 = Z_BINARY;
        this.gzipUncompressedBytes = Z_BINARY;
        this.last_flush = Z_BINARY;
        tr_init();
        lm_init();
        return Z_BINARY;
    }

    int deflateEnd() {
        if (this.status != INIT_STATE && this.status != BUSY_STATE && this.status != FINISH_STATE) {
            return -2;
        }
        this.pending_buf = null;
        this.head = null;
        this.prev = null;
        this.window = null;
        return this.status == BUSY_STATE ? -3 : Z_BINARY;
    }

    int deflateParams(ZStream zStream, int i, int i2) {
        int i3 = Z_BINARY;
        if (i == -1) {
            i = 6;
        }
        if (i < 0 || i > 9 || i2 < 0 || i2 > Z_UNKNOWN) {
            return -2;
        }
        if (!(config_table[this.level].func == config_table[i].func || zStream.total_in == 0)) {
            i3 = zStream.deflate(Z_ASCII);
        }
        if (this.level != i) {
            this.level = i;
            this.max_lazy_match = config_table[this.level].max_lazy;
            this.good_match = config_table[this.level].good_length;
            this.nice_match = config_table[this.level].nice_length;
            this.max_chain_length = config_table[this.level].max_chain;
        }
        this.strategy = i2;
        return i3;
    }

    int deflateSetDictionary(ZStream zStream, byte[] bArr, int i) {
        if (bArr == null || this.status != INIT_STATE) {
            return -2;
        }
        zStream.adler = Adler32.adler32(zStream.adler, bArr, Z_BINARY, i);
        if (i < MIN_MATCH) {
            return Z_BINARY;
        }
        int i2;
        if (i > this.w_size - 262) {
            int i3 = this.w_size - 262;
            i2 = i - i3;
            i = i3;
        } else {
            i2 = Z_BINARY;
        }
        System.arraycopy(bArr, i2, this.window, Z_BINARY, i);
        this.strstart = i;
        this.block_start = i;
        this.ins_h = this.window[Z_BINARY] & 255;
        this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[Z_ASCII] & 255)) & this.hash_mask;
        for (i2 = Z_BINARY; i2 <= i - 3; i2 += Z_ASCII) {
            this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[(i2 + MIN_MATCH) - 1] & 255)) & this.hash_mask;
            this.prev[this.w_mask & i2] = this.head[this.ins_h];
            this.head[this.ins_h] = (short) i2;
        }
        return Z_BINARY;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int deflate(com.bilibili.bilibililive.socket.core.util.internal.jzlib.ZStream r12, int r13) {
        /*
        r11 = this;
        r1 = 3;
        r3 = 1;
        r4 = -1;
        r10 = 4;
        r2 = 0;
        if (r13 > r10) goto L_0x0009;
    L_0x0007:
        if (r13 >= 0) goto L_0x000b;
    L_0x0009:
        r2 = -2;
    L_0x000a:
        return r2;
    L_0x000b:
        r0 = r12.next_out;
        if (r0 == 0) goto L_0x001f;
    L_0x000f:
        r0 = r12.next_in;
        if (r0 != 0) goto L_0x0017;
    L_0x0013:
        r0 = r12.avail_in;
        if (r0 != 0) goto L_0x001f;
    L_0x0017:
        r0 = r11.status;
        r5 = 666; // 0x29a float:9.33E-43 double:3.29E-321;
        if (r0 != r5) goto L_0x0027;
    L_0x001d:
        if (r13 == r10) goto L_0x0027;
    L_0x001f:
        r0 = z_errmsg;
        r0 = r0[r10];
        r12.msg = r0;
        r2 = -2;
        goto L_0x000a;
    L_0x0027:
        r0 = r12.avail_out;
        if (r0 != 0) goto L_0x0034;
    L_0x002b:
        r0 = z_errmsg;
        r1 = 7;
        r0 = r0[r1];
        r12.msg = r0;
        r2 = -5;
        goto L_0x000a;
    L_0x0034:
        r11.strm = r12;
        r5 = r11.last_flush;
        r11.last_flush = r13;
        r0 = r11.status;
        r6 = 42;
        if (r0 != r6) goto L_0x0051;
    L_0x0040:
        r0 = com.bilibili.bilibililive.socket.core.util.internal.jzlib.Deflate.AnonymousClass1.$SwitchMap$com$bilibili$bilibililive$socket$core$util$internal$jzlib$JZlib$WrapperType;
        r6 = r11.wrapperType;
        r6 = r6.ordinal();
        r0 = r0[r6];
        switch(r0) {
            case 1: goto L_0x005f;
            case 2: goto L_0x00a6;
            default: goto L_0x004d;
        };
    L_0x004d:
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r11.status = r0;
    L_0x0051:
        r0 = r11.pending;
        if (r0 == 0) goto L_0x00e2;
    L_0x0055:
        r12.flush_pending();
        r0 = r12.avail_out;
        if (r0 != 0) goto L_0x00f4;
    L_0x005c:
        r11.last_flush = r4;
        goto L_0x000a;
    L_0x005f:
        r0 = r11.w_bits;
        r0 = r0 + -8;
        r0 = r0 << 4;
        r0 = r0 + 8;
        r6 = r0 << 8;
        r0 = r11.level;
        r0 = r0 + -1;
        r0 = r0 & 255;
        r0 = r0 >> 1;
        if (r0 <= r1) goto L_0x0074;
    L_0x0073:
        r0 = r1;
    L_0x0074:
        r0 = r0 << 6;
        r0 = r0 | r6;
        r6 = r11.strstart;
        if (r6 == 0) goto L_0x007d;
    L_0x007b:
        r0 = r0 | 32;
    L_0x007d:
        r6 = r0 % 31;
        r6 = 31 - r6;
        r0 = r0 + r6;
        r11.putShortMSB(r0);
        r0 = r11.strstart;
        if (r0 == 0) goto L_0x009c;
    L_0x0089:
        r6 = r12.adler;
        r0 = 16;
        r6 = r6 >>> r0;
        r0 = (int) r6;
        r11.putShortMSB(r0);
        r6 = r12.adler;
        r8 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r6 & r8;
        r0 = (int) r6;
        r11.putShortMSB(r0);
    L_0x009c:
        r6 = 0;
        r0 = 0;
        r6 = com.bilibili.bilibililive.socket.core.util.internal.jzlib.Adler32.adler32(r6, r0, r2, r2);
        r12.adler = r6;
        goto L_0x004d;
    L_0x00a6:
        r0 = 31;
        r11.put_byte(r0);
        r0 = -117; // 0xffffffffffffff8b float:NaN double:NaN;
        r11.put_byte(r0);
        r0 = 8;
        r11.put_byte(r0);
        r11.put_byte(r2);
        r11.put_byte(r2);
        r11.put_byte(r2);
        r11.put_byte(r2);
        r11.put_byte(r2);
        r0 = config_table;
        r6 = r11.level;
        r0 = r0[r6];
        r0 = r0.func;
        switch(r0) {
            case 1: goto L_0x00d9;
            case 2: goto L_0x00dd;
            default: goto L_0x00cf;
        };
    L_0x00cf:
        r11.put_byte(r2);
    L_0x00d2:
        r11.put_byte(r4);
        r12.crc32 = r2;
        goto L_0x004d;
    L_0x00d9:
        r11.put_byte(r10);
        goto L_0x00d2;
    L_0x00dd:
        r0 = 2;
        r11.put_byte(r0);
        goto L_0x00d2;
    L_0x00e2:
        r0 = r12.avail_in;
        if (r0 != 0) goto L_0x00f4;
    L_0x00e6:
        if (r13 > r5) goto L_0x00f4;
    L_0x00e8:
        if (r13 == r10) goto L_0x00f4;
    L_0x00ea:
        r0 = z_errmsg;
        r1 = 7;
        r0 = r0[r1];
        r12.msg = r0;
        r2 = -5;
        goto L_0x000a;
    L_0x00f4:
        r0 = r11.status;
        r5 = 666; // 0x29a float:9.33E-43 double:3.29E-321;
        if (r0 != r5) goto L_0x0108;
    L_0x00fa:
        r0 = r12.avail_in;
        if (r0 == 0) goto L_0x0108;
    L_0x00fe:
        r0 = z_errmsg;
        r1 = 7;
        r0 = r0[r1];
        r12.msg = r0;
        r2 = -5;
        goto L_0x000a;
    L_0x0108:
        r5 = r12.next_in_index;
        r0 = r12.avail_in;	 Catch:{ all -> 0x019b }
        if (r0 != 0) goto L_0x011a;
    L_0x010e:
        r0 = r11.lookahead;	 Catch:{ all -> 0x019b }
        if (r0 != 0) goto L_0x011a;
    L_0x0112:
        if (r13 == 0) goto L_0x0184;
    L_0x0114:
        r0 = r11.status;	 Catch:{ all -> 0x019b }
        r6 = 666; // 0x29a float:9.33E-43 double:3.29E-321;
        if (r0 == r6) goto L_0x0184;
    L_0x011a:
        r0 = config_table;	 Catch:{ all -> 0x019b }
        r6 = r11.level;	 Catch:{ all -> 0x019b }
        r0 = r0[r6];	 Catch:{ all -> 0x019b }
        r0 = r0.func;	 Catch:{ all -> 0x019b }
        switch(r0) {
            case 0: goto L_0x0145;
            case 1: goto L_0x014a;
            case 2: goto L_0x014f;
            default: goto L_0x0125;
        };	 Catch:{ all -> 0x019b }
    L_0x0125:
        r0 = r4;
    L_0x0126:
        r4 = 2;
        if (r0 == r4) goto L_0x012b;
    L_0x0129:
        if (r0 != r1) goto L_0x012f;
    L_0x012b:
        r4 = 666; // 0x29a float:9.33E-43 double:3.29E-321;
        r11.status = r4;	 Catch:{ all -> 0x019b }
    L_0x012f:
        if (r0 == 0) goto L_0x0134;
    L_0x0131:
        r4 = 2;
        if (r0 != r4) goto L_0x0154;
    L_0x0134:
        r0 = r12.avail_out;	 Catch:{ all -> 0x019b }
        if (r0 != 0) goto L_0x013b;
    L_0x0138:
        r0 = -1;
        r11.last_flush = r0;	 Catch:{ all -> 0x019b }
    L_0x013b:
        r0 = r11.gzipUncompressedBytes;
        r1 = r12.next_in_index;
        r1 = r1 - r5;
        r0 = r0 + r1;
        r11.gzipUncompressedBytes = r0;
        goto L_0x000a;
    L_0x0145:
        r0 = r11.deflate_stored(r13);	 Catch:{ all -> 0x019b }
        goto L_0x0126;
    L_0x014a:
        r0 = r11.deflate_fast(r13);	 Catch:{ all -> 0x019b }
        goto L_0x0126;
    L_0x014f:
        r0 = r11.deflate_slow(r13);	 Catch:{ all -> 0x019b }
        goto L_0x0126;
    L_0x0154:
        if (r0 != r3) goto L_0x0184;
    L_0x0156:
        if (r13 != r3) goto L_0x016f;
    L_0x0158:
        r11._tr_align();	 Catch:{ all -> 0x019b }
    L_0x015b:
        r12.flush_pending();	 Catch:{ all -> 0x019b }
        r0 = r12.avail_out;	 Catch:{ all -> 0x019b }
        if (r0 != 0) goto L_0x0184;
    L_0x0162:
        r0 = -1;
        r11.last_flush = r0;	 Catch:{ all -> 0x019b }
        r0 = r11.gzipUncompressedBytes;
        r1 = r12.next_in_index;
        r1 = r1 - r5;
        r0 = r0 + r1;
        r11.gzipUncompressedBytes = r0;
        goto L_0x000a;
    L_0x016f:
        r0 = 0;
        r4 = 0;
        r6 = 0;
        r11._tr_stored_block(r0, r4, r6);	 Catch:{ all -> 0x019b }
        if (r13 != r1) goto L_0x015b;
    L_0x0177:
        r0 = r2;
    L_0x0178:
        r1 = r11.hash_size;	 Catch:{ all -> 0x019b }
        if (r0 >= r1) goto L_0x015b;
    L_0x017c:
        r1 = r11.head;	 Catch:{ all -> 0x019b }
        r4 = 0;
        r1[r0] = r4;	 Catch:{ all -> 0x019b }
        r0 = r0 + 1;
        goto L_0x0178;
    L_0x0184:
        r0 = r11.gzipUncompressedBytes;
        r1 = r12.next_in_index;
        r1 = r1 - r5;
        r0 = r0 + r1;
        r11.gzipUncompressedBytes = r0;
        if (r13 != r10) goto L_0x000a;
    L_0x018e:
        r0 = r11.wrapperType;
        r1 = com.bilibili.bilibililive.socket.core.util.internal.jzlib.JZlib.WrapperType.NONE;
        if (r0 == r1) goto L_0x0198;
    L_0x0194:
        r0 = r11.wroteTrailer;
        if (r0 == 0) goto L_0x01a5;
    L_0x0198:
        r2 = r3;
        goto L_0x000a;
    L_0x019b:
        r0 = move-exception;
        r1 = r11.gzipUncompressedBytes;
        r2 = r12.next_in_index;
        r2 = r2 - r5;
        r1 = r1 + r2;
        r11.gzipUncompressedBytes = r1;
        throw r0;
    L_0x01a5:
        r0 = com.bilibili.bilibililive.socket.core.util.internal.jzlib.Deflate.AnonymousClass1.$SwitchMap$com$bilibili$bilibililive$socket$core$util$internal$jzlib$JZlib$WrapperType;
        r1 = r11.wrapperType;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x01bf;
            case 2: goto L_0x01d3;
            default: goto L_0x01b2;
        };
    L_0x01b2:
        r12.flush_pending();
        r11.wroteTrailer = r3;
        r0 = r11.pending;
        if (r0 == 0) goto L_0x0220;
    L_0x01bb:
        r0 = r2;
    L_0x01bc:
        r2 = r0;
        goto L_0x000a;
    L_0x01bf:
        r0 = r12.adler;
        r4 = 16;
        r0 = r0 >>> r4;
        r0 = (int) r0;
        r11.putShortMSB(r0);
        r0 = r12.adler;
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r0 = r0 & r4;
        r0 = (int) r0;
        r11.putShortMSB(r0);
        goto L_0x01b2;
    L_0x01d3:
        r0 = r12.crc32;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        r0 = r12.crc32;
        r0 = r0 >>> 8;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        r0 = r12.crc32;
        r0 = r0 >>> 16;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        r0 = r12.crc32;
        r0 = r0 >>> 24;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        r0 = r11.gzipUncompressedBytes;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        r0 = r11.gzipUncompressedBytes;
        r0 = r0 >>> 8;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        r0 = r11.gzipUncompressedBytes;
        r0 = r0 >>> 16;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        r0 = r11.gzipUncompressedBytes;
        r0 = r0 >>> 24;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r11.put_byte(r0);
        goto L_0x01b2;
    L_0x0220:
        r0 = r3;
        goto L_0x01bc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bilibililive.socket.core.util.internal.jzlib.Deflate.deflate(com.bilibili.bilibililive.socket.core.util.internal.jzlib.ZStream, int):int");
    }
}
