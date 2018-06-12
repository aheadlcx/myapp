package bili3.com.googlecode.mp4parser.a.a;

import com.bilibili.bilibililive.im.entity.DataChangeNotify;
import com.googlecode.mp4parser.a.a.i.a;
import com.googlecode.mp4parser.a.b.b;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: BL */
public class h extends b {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int[] L;
    public i M;
    public g N;
    public int O;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public c i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public long r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public static h a(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        h hVar = new h();
        hVar.q = (int) bVar.a(8, "SPS: profile_idc");
        hVar.s = bVar.c("SPS: constraint_set_0_flag");
        hVar.t = bVar.c("SPS: constraint_set_1_flag");
        hVar.u = bVar.c("SPS: constraint_set_2_flag");
        hVar.v = bVar.c("SPS: constraint_set_3_flag");
        hVar.w = bVar.c("SPS: constraint_set_4_flag");
        hVar.x = bVar.c("SPS: constraint_set_5_flag");
        hVar.r = bVar.a(2, "SPS: reserved_zero_2bits");
        hVar.y = (int) bVar.a(8, "SPS: level_idc");
        hVar.z = bVar.a("SPS: seq_parameter_set_id");
        if (hVar.q == 100 || hVar.q == DataChangeNotify.TYPE_NEW_AT_RECEIVED || hVar.q == 122 || hVar.q == 144) {
            hVar.i = c.a(bVar.a("SPS: chroma_format_idc"));
            if (hVar.i == c.d) {
                hVar.A = bVar.c("SPS: residual_color_transform_flag");
            }
            hVar.n = bVar.a("SPS: bit_depth_luma_minus8");
            hVar.o = bVar.a("SPS: bit_depth_chroma_minus8");
            hVar.p = bVar.c("SPS: qpprime_y_zero_transform_bypass_flag");
            if (bVar.c("SPS: seq_scaling_matrix_present_lag")) {
                a(bVar, hVar);
            }
        } else {
            hVar.i = c.b;
        }
        hVar.j = bVar.a("SPS: log2_max_frame_num_minus4");
        hVar.a = bVar.a("SPS: pic_order_cnt_type");
        if (hVar.a == 0) {
            hVar.k = bVar.a("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (hVar.a == 1) {
            hVar.c = bVar.c("SPS: delta_pic_order_always_zero_flag");
            hVar.B = bVar.b("SPS: offset_for_non_ref_pic");
            hVar.C = bVar.b("SPS: offset_for_top_to_bottom_field");
            hVar.O = bVar.a("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            hVar.L = new int[hVar.O];
            for (int i = 0; i < hVar.O; i++) {
                hVar.L[i] = bVar.b("SPS: offsetForRefFrame [" + i + "]");
            }
        }
        hVar.D = bVar.a("SPS: num_ref_frames");
        hVar.E = bVar.c("SPS: gaps_in_frame_num_value_allowed_flag");
        hVar.m = bVar.a("SPS: pic_width_in_mbs_minus1");
        hVar.l = bVar.a("SPS: pic_height_in_map_units_minus1");
        hVar.F = bVar.c("SPS: frame_mbs_only_flag");
        if (!hVar.F) {
            hVar.g = bVar.c("SPS: mb_adaptive_frame_field_flag");
        }
        hVar.h = bVar.c("SPS: direct_8x8_inference_flag");
        hVar.G = bVar.c("SPS: frame_cropping_flag");
        if (hVar.G) {
            hVar.H = bVar.a("SPS: frame_crop_left_offset");
            hVar.I = bVar.a("SPS: frame_crop_right_offset");
            hVar.J = bVar.a("SPS: frame_crop_top_offset");
            hVar.K = bVar.a("SPS: frame_crop_bottom_offset");
        }
        if (bVar.c("SPS: vui_parameters_present_flag")) {
            hVar.M = a(bVar);
        }
        bVar.f();
        return hVar;
    }

    private static void a(b bVar, h hVar) throws IOException {
        hVar.N = new g();
        for (int i = 0; i < 8; i++) {
            if (bVar.c("SPS: seqScalingListPresentFlag")) {
                hVar.N.a = new f[8];
                hVar.N.b = new f[8];
                if (i < 6) {
                    hVar.N.a[i] = f.a(bVar, 16);
                } else {
                    hVar.N.b[i - 6] = f.a(bVar, 64);
                }
            }
        }
    }

    private static i a(b bVar) throws IOException {
        i iVar = new i();
        iVar.a = bVar.c("VUI: aspect_ratio_info_present_flag");
        if (iVar.a) {
            iVar.y = a.a((int) bVar.a(8, "VUI: aspect_ratio"));
            if (iVar.y == a.a) {
                iVar.b = (int) bVar.a(16, "VUI: sar_width");
                iVar.c = (int) bVar.a(16, "VUI: sar_height");
            }
        }
        iVar.d = bVar.c("VUI: overscan_info_present_flag");
        if (iVar.d) {
            iVar.e = bVar.c("VUI: overscan_appropriate_flag");
        }
        iVar.f = bVar.c("VUI: video_signal_type_present_flag");
        if (iVar.f) {
            iVar.g = (int) bVar.a(3, "VUI: video_format");
            iVar.h = bVar.c("VUI: video_full_range_flag");
            iVar.i = bVar.c("VUI: colour_description_present_flag");
            if (iVar.i) {
                iVar.j = (int) bVar.a(8, "VUI: colour_primaries");
                iVar.k = (int) bVar.a(8, "VUI: transfer_characteristics");
                iVar.l = (int) bVar.a(8, "VUI: matrix_coefficients");
            }
        }
        iVar.m = bVar.c("VUI: chroma_loc_info_present_flag");
        if (iVar.m) {
            iVar.n = bVar.a("VUI chroma_sample_loc_type_top_field");
            iVar.o = bVar.a("VUI chroma_sample_loc_type_bottom_field");
        }
        iVar.p = bVar.c("VUI: timing_info_present_flag");
        if (iVar.p) {
            iVar.q = (int) bVar.a(32, "VUI: num_units_in_tick");
            iVar.r = (int) bVar.a(32, "VUI: time_scale");
            iVar.s = bVar.c("VUI: fixed_frame_rate_flag");
        }
        boolean c = bVar.c("VUI: nal_hrd_parameters_present_flag");
        if (c) {
            iVar.v = b(bVar);
        }
        boolean c2 = bVar.c("VUI: vcl_hrd_parameters_present_flag");
        if (c2) {
            iVar.w = b(bVar);
        }
        if (c || c2) {
            iVar.t = bVar.c("VUI: low_delay_hrd_flag");
        }
        iVar.u = bVar.c("VUI: pic_struct_present_flag");
        if (bVar.c("VUI: bitstream_restriction_flag")) {
            iVar.x = new a();
            iVar.x.a = bVar.c("VUI: motion_vectors_over_pic_boundaries_flag");
            iVar.x.b = bVar.a("VUI max_bytes_per_pic_denom");
            iVar.x.c = bVar.a("VUI max_bits_per_mb_denom");
            iVar.x.d = bVar.a("VUI log2_max_mv_length_horizontal");
            iVar.x.e = bVar.a("VUI log2_max_mv_length_vertical");
            iVar.x.f = bVar.a("VUI num_reorder_frames");
            iVar.x.g = bVar.a("VUI max_dec_frame_buffering");
        }
        return iVar;
    }

    private static d b(b bVar) throws IOException {
        d dVar = new d();
        dVar.a = bVar.a("SPS: cpb_cnt_minus1");
        dVar.b = (int) bVar.a(4, "HRD: bit_rate_scale");
        dVar.c = (int) bVar.a(4, "HRD: cpb_size_scale");
        dVar.d = new int[(dVar.a + 1)];
        dVar.e = new int[(dVar.a + 1)];
        dVar.f = new boolean[(dVar.a + 1)];
        for (int i = 0; i <= dVar.a; i++) {
            dVar.d[i] = bVar.a("HRD: bit_rate_value_minus1");
            dVar.e[i] = bVar.a("HRD: cpb_size_value_minus1");
            dVar.f[i] = bVar.c("HRD: cbr_flag");
        }
        dVar.g = (int) bVar.a(5, "HRD: initial_cpb_removal_delay_length_minus1");
        dVar.h = (int) bVar.a(5, "HRD: cpb_removal_delay_length_minus1");
        dVar.i = (int) bVar.a(5, "HRD: dpb_output_delay_length_minus1");
        dVar.j = (int) bVar.a(5, "HRD: time_offset_length");
        return dVar;
    }

    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.a + ", \n        field_pic_flag=" + this.b + ", \n        delta_pic_order_always_zero_flag=" + this.c + ", \n        weighted_pred_flag=" + this.d + ", \n        weighted_bipred_idc=" + this.e + ", \n        entropy_coding_mode_flag=" + this.f + ", \n        mb_adaptive_frame_field_flag=" + this.g + ", \n        direct_8x8_inference_flag=" + this.h + ", \n        chroma_format_idc=" + this.i + ", \n        log2_max_frame_num_minus4=" + this.j + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.k + ", \n        pic_height_in_map_units_minus1=" + this.l + ", \n        pic_width_in_mbs_minus1=" + this.m + ", \n        bit_depth_luma_minus8=" + this.n + ", \n        bit_depth_chroma_minus8=" + this.o + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.p + ", \n        profile_idc=" + this.q + ", \n        constraint_set_0_flag=" + this.s + ", \n        constraint_set_1_flag=" + this.t + ", \n        constraint_set_2_flag=" + this.u + ", \n        constraint_set_3_flag=" + this.v + ", \n        constraint_set_4_flag=" + this.w + ", \n        constraint_set_5_flag=" + this.x + ", \n        level_idc=" + this.y + ", \n        seq_parameter_set_id=" + this.z + ", \n        residual_color_transform_flag=" + this.A + ", \n        offset_for_non_ref_pic=" + this.B + ", \n        offset_for_top_to_bottom_field=" + this.C + ", \n        num_ref_frames=" + this.D + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.E + ", \n        frame_mbs_only_flag=" + this.F + ", \n        frame_cropping_flag=" + this.G + ", \n        frame_crop_left_offset=" + this.H + ", \n        frame_crop_right_offset=" + this.I + ", \n        frame_crop_top_offset=" + this.J + ", \n        frame_crop_bottom_offset=" + this.K + ", \n        offsetForRefFrame=" + this.L + ", \n        vuiParams=" + this.M + ", \n        scalingMatrix=" + this.N + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.O + '}';
    }
}
