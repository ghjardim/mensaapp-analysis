package p366w0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import p171Y2.AbstractC2920c;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4336z;
import p232g0.C4318h;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p272k4.C5410A;
import p272k4.C5413D;
import p366w0.AbstractC6811I;

/* renamed from: w0.I */
/* loaded from: classes.dex */
public abstract class AbstractC6811I {

    /* renamed from: a */
    public static final Pattern f24472a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap f24473b = new HashMap();

    /* renamed from: c */
    public static int f24474c = -1;

    /* renamed from: w0.I$b */
    public static final class b {

        /* renamed from: a */
        public final String f24475a;

        /* renamed from: b */
        public final boolean f24476b;

        /* renamed from: c */
        public final boolean f24477c;

        public b(String str, boolean z6, boolean z7) {
            this.f24475a = str;
            this.f24476b = z6;
            this.f24477c = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f24475a, bVar.f24475a) && this.f24476b == bVar.f24476b && this.f24477c == bVar.f24477c;
        }

        public int hashCode() {
            return ((((this.f24475a.hashCode() + 31) * 31) + (this.f24476b ? 1231 : 1237)) * 31) + (this.f24477c ? 1231 : 1237);
        }
    }

    /* renamed from: w0.I$c */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: w0.I$d */
    public interface d {
        /* renamed from: a */
        MediaCodecInfo mo28008a(int i7);

        /* renamed from: b */
        boolean mo28009b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo28010c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo28011d();

        /* renamed from: e */
        boolean mo28012e();
    }

    /* renamed from: w0.I$e */
    public static final class e implements d {
        public e() {
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: a */
        public MediaCodecInfo mo28008a(int i7) {
            return MediaCodecList.getCodecInfoAt(i7);
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: b */
        public boolean mo28009b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: c */
        public boolean mo28010c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: d */
        public int mo28011d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: e */
        public boolean mo28012e() {
            return false;
        }
    }

    /* renamed from: w0.I$f */
    public static final class f implements d {

        /* renamed from: a */
        public final int f24478a;

        /* renamed from: b */
        public MediaCodecInfo[] f24479b;

        public f(boolean z6, boolean z7) {
            this.f24478a = (z6 || z7) ? 1 : 0;
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: a */
        public MediaCodecInfo mo28008a(int i7) {
            m28013f();
            return this.f24479b[i7];
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: b */
        public boolean mo28009b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: c */
        public boolean mo28010c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: d */
        public int mo28011d() {
            m28013f();
            return this.f24479b.length;
        }

        @Override // p366w0.AbstractC6811I.d
        /* renamed from: e */
        public boolean mo28012e() {
            return true;
        }

        /* renamed from: f */
        public final void m28013f() {
            if (this.f24479b == null) {
                this.f24479b = new MediaCodecList(this.f24478a).getCodecInfos();
            }
        }
    }

    /* renamed from: w0.I$g */
    public interface g {
        /* renamed from: a */
        int mo27961a(Object obj);
    }

    /* renamed from: A */
    public static Pair m27962A(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int m27981T = m27981T(parseInt);
            if (m27981T == -1) {
                AbstractC5346o.m21867h("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int m27980S = m27980S(parseInt2);
            if (m27980S != -1) {
                return new Pair(Integer.valueOf(m27981T), Integer.valueOf(m27980S));
            }
            AbstractC5346o.m21867h("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* renamed from: B */
    public static Integer m27963B(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    /* renamed from: C */
    public static boolean m27964C(MediaCodecInfo mediaCodecInfo) {
        return AbstractC5330M.f18800a >= 29 && m27965D(mediaCodecInfo);
    }

    /* renamed from: D */
    public static boolean m27965D(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    /* renamed from: E */
    public static boolean m27966E(MediaCodecInfo mediaCodecInfo, String str, boolean z6, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z6 && str.endsWith(".secure"))) {
            return false;
        }
        int i7 = AbstractC5330M.f18800a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC5330M.f18802c))) {
            String str3 = AbstractC5330M.f18801b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i7 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC5330M.f18802c)) {
            String str4 = AbstractC5330M.f18801b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i7 == 19 && AbstractC5330M.f18801b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: F */
    public static boolean m27967F(MediaCodecInfo mediaCodecInfo, String str) {
        return AbstractC5330M.f18800a >= 29 ? m27968G(mediaCodecInfo) : !m27969H(mediaCodecInfo, str);
    }

    /* renamed from: G */
    public static boolean m27968G(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    /* renamed from: H */
    public static boolean m27969H(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC5330M.f18800a >= 29) {
            return m27970I(mediaCodecInfo);
        }
        if (AbstractC4336z.m18422o(str)) {
            return true;
        }
        String m10515e = AbstractC2920c.m10515e(mediaCodecInfo.getName());
        if (m10515e.startsWith("arc.")) {
            return false;
        }
        if (m10515e.startsWith("omx.google.") || m10515e.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((m10515e.startsWith("omx.sec.") && m10515e.contains(".sw.")) || m10515e.equals("omx.qcom.video.decoder.hevcswvdec") || m10515e.startsWith("c2.android.") || m10515e.startsWith("c2.google.")) {
            return true;
        }
        return (m10515e.startsWith("omx.") || m10515e.startsWith("c2.")) ? false : true;
    }

    /* renamed from: I */
    public static boolean m27970I(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    /* renamed from: J */
    public static boolean m27971J(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC5330M.f18800a >= 29) {
            return m27972K(mediaCodecInfo);
        }
        String m10515e = AbstractC2920c.m10515e(mediaCodecInfo.getName());
        return (m10515e.startsWith("omx.google.") || m10515e.startsWith("c2.android.") || m10515e.startsWith("c2.google.")) ? false : true;
    }

    /* renamed from: K */
    public static boolean m27972K(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    /* renamed from: L */
    public static /* synthetic */ int m27973L(C6830p c6830p) {
        String str = c6830p.f24544a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC5330M.f18800a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: M */
    public static /* synthetic */ int m27974M(C6830p c6830p) {
        return c6830p.f24544a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: N */
    public static /* synthetic */ int m27975N(C4327q c4327q, C6830p c6830p) {
        return c6830p.m28121l(c4327q) ? 1 : 0;
    }

    /* renamed from: O */
    public static /* synthetic */ int m27976O(g gVar, Object obj, Object obj2) {
        return gVar.mo27961a(obj2) - gVar.mo27961a(obj);
    }

    /* renamed from: P */
    public static int m27977P() {
        if (f24474c == -1) {
            int i7 = 0;
            C6830p m28000s = m28000s("video/avc", false, false);
            if (m28000s != null) {
                MediaCodecInfo.CodecProfileLevel[] m28117g = m28000s.m28117g();
                int length = m28117g.length;
                int i8 = 0;
                while (i7 < length) {
                    i8 = Math.max(m27989h(m28117g[i7].level), i8);
                    i7++;
                }
                i7 = Math.max(i8, AbstractC5330M.f18800a >= 21 ? 345600 : 172800);
            }
            f24474c = i7;
        }
        return f24474c;
    }

    /* renamed from: Q */
    public static int m27978Q(int i7) {
        int i8 = 17;
        if (i7 != 17) {
            i8 = 20;
            if (i7 != 20) {
                i8 = 23;
                if (i7 != 23) {
                    i8 = 29;
                    if (i7 != 29) {
                        i8 = 39;
                        if (i7 != 39) {
                            i8 = 42;
                            if (i7 != 42) {
                                switch (i7) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i8;
    }

    /* renamed from: R */
    public static void m27979R(List list, final g gVar) {
        Collections.sort(list, new Comparator() { // from class: w0.H
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m27976O;
                m27976O = AbstractC6811I.m27976O(AbstractC6811I.g.this, obj, obj2);
                return m27976O;
            }
        });
    }

    /* renamed from: S */
    public static int m27980S(int i7) {
        if (i7 == 10) {
            return 1;
        }
        if (i7 == 11) {
            return 2;
        }
        if (i7 == 20) {
            return 4;
        }
        if (i7 == 21) {
            return 8;
        }
        if (i7 == 30) {
            return 16;
        }
        if (i7 == 31) {
            return 32;
        }
        if (i7 == 40) {
            return 64;
        }
        if (i7 == 41) {
            return 128;
        }
        if (i7 == 50) {
            return 256;
        }
        if (i7 == 51) {
            return 512;
        }
        switch (i7) {
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: T */
    public static int m27981T(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: e */
    public static void m27986e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (AbstractC5330M.f18800a < 26 && AbstractC5330M.f18801b.equals("R9") && list.size() == 1 && ((C6830p) list.get(0)).f24544a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C6830p.m28102C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m27979R(list, new g() { // from class: w0.E
                @Override // p366w0.AbstractC6811I.g
                /* renamed from: a */
                public final int mo27961a(Object obj) {
                    int m27973L;
                    m27973L = AbstractC6811I.m27973L((C6830p) obj);
                    return m27973L;
                }
            });
        }
        int i7 = AbstractC5330M.f18800a;
        if (i7 < 21 && list.size() > 1) {
            String str2 = ((C6830p) list.get(0)).f24544a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m27979R(list, new g() { // from class: w0.F
                    @Override // p366w0.AbstractC6811I.g
                    /* renamed from: a */
                    public final int mo27961a(Object obj) {
                        int m27974M;
                        m27974M = AbstractC6811I.m27974M((C6830p) obj);
                        return m27974M;
                    }
                });
            }
        }
        if (i7 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C6830p) list.get(0)).f24544a)) {
            return;
        }
        list.add((C6830p) list.remove(0));
    }

    /* renamed from: f */
    public static int m27987f(int i7) {
        switch (i7) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return 262144;
            case 19:
                return 524288;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    public static int m27988g(int i7) {
        switch (i7) {
            case 10:
                return 1;
            case 11:
                return 4;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 8;
            case 13:
                return 16;
            default:
                switch (i7) {
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i7) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i7) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i7) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    public static int m27989h(int i7) {
        if (i7 == 1 || i7 == 2) {
            return 25344;
        }
        switch (i7) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    public static int m27990i(int i7) {
        if (i7 == 66) {
            return 1;
        }
        if (i7 == 77) {
            return 2;
        }
        if (i7 == 88) {
            return 4;
        }
        if (i7 == 100) {
            return 8;
        }
        if (i7 == 110) {
            return 16;
        }
        if (i7 != 122) {
            return i7 != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: j */
    public static Integer m27991j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    /* renamed from: k */
    public static Integer m27992k(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    /* renamed from: l */
    public static Pair m27993l(String str, String[] strArr) {
        int m27978Q;
        if (strArr.length != 3) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(AbstractC4336z.m18415h(Integer.parseInt(strArr[1], 16))) && (m27978Q = m27978Q(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(m27978Q), 0);
            }
        } catch (NumberFormatException unused) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: m */
    public static String m27994m(C4327q c4327q) {
        Pair m27999r;
        if ("audio/eac3-joc".equals(c4327q.f15138n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c4327q.f15138n) || (m27999r = m27999r(c4327q)) == null) {
            return null;
        }
        int intValue = ((Integer) m27999r.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        if (intValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    /* renamed from: n */
    public static List m27995n(InterfaceC6840z interfaceC6840z, C4327q c4327q, boolean z6, boolean z7) {
        String m27994m = m27994m(c4327q);
        return m27994m == null ? AbstractC3033v.m11050t() : interfaceC6840z.mo28209a(m27994m, z6, z7);
    }

    /* renamed from: o */
    public static Pair m27996o(String str, String[] strArr, C4318h c4318h) {
        int i7;
        if (strArr.length < 4) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                AbstractC5346o.m21867h("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                AbstractC5346o.m21867h("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            int i8 = parseInt3 != 8 ? (c4318h == null || !(c4318h.f15043d != null || (i7 = c4318h.f15042c) == 7 || i7 == 6)) ? 2 : 4096 : 1;
            int m27987f = m27987f(parseInt2);
            if (m27987f != -1) {
                return new Pair(Integer.valueOf(i8), Integer.valueOf(m27987f));
            }
            AbstractC5346o.m21867h("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* renamed from: p */
    public static Pair m27997p(String str, String[] strArr) {
        int parseInt;
        int i7;
        if (strArr.length < 2) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i7 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i7 = parseInt2;
            }
            int m27990i = m27990i(i7);
            if (m27990i == -1) {
                AbstractC5346o.m21867h("MediaCodecUtil", "Unknown AVC profile: " + i7);
                return null;
            }
            int m27988g = m27988g(parseInt);
            if (m27988g != -1) {
                return new Pair(Integer.valueOf(m27990i), Integer.valueOf(m27988g));
            }
            AbstractC5346o.m21867h("MediaCodecUtil", "Unknown AVC level: " + parseInt);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: q */
    public static String m27998q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L11;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair m27999r(p232g0.C4327q r6) {
        /*
            r0 = 0
            java.lang.String r1 = r6.f15134j
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = "video/dolby-vision"
            java.lang.String r4 = r6.f15138n
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1e
            java.lang.String r6 = r6.f15134j
            android.util.Pair r6 = m28006y(r6, r1)
            return r6
        L1e:
            r3 = r1[r0]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r0 = r4
            goto L78
        L2d:
            java.lang.String r0 = "vp09"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L36
            goto L2b
        L36:
            r0 = 6
            goto L78
        L38:
            java.lang.String r0 = "mp4a"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto L2b
        L41:
            r0 = 5
            goto L78
        L43:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
            goto L2b
        L4c:
            r0 = 4
            goto L78
        L4e:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L57
            goto L2b
        L57:
            r0 = 3
            goto L78
        L59:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L62
            goto L2b
        L62:
            r0 = 2
            goto L78
        L64:
            java.lang.String r0 = "avc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            goto L2b
        L6d:
            r0 = 1
            goto L78
        L6f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r2
        L7c:
            java.lang.String r6 = r6.f15134j
            android.util.Pair r6 = m27962A(r6, r1)
            return r6
        L83:
            java.lang.String r6 = r6.f15134j
            android.util.Pair r6 = m27993l(r6, r1)
            return r6
        L8a:
            java.lang.String r0 = r6.f15134j
            g0.h r6 = r6.f15113A
            android.util.Pair r6 = m28007z(r0, r1, r6)
            return r6
        L93:
            java.lang.String r6 = r6.f15134j
            android.util.Pair r6 = m27997p(r6, r1)
            return r6
        L9a:
            java.lang.String r0 = r6.f15134j
            g0.h r6 = r6.f15113A
            android.util.Pair r6 = m27996o(r0, r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p366w0.AbstractC6811I.m27999r(g0.q):android.util.Pair");
    }

    /* renamed from: s */
    public static C6830p m28000s(String str, boolean z6, boolean z7) {
        List m28001t = m28001t(str, z6, z7);
        if (m28001t.isEmpty()) {
            return null;
        }
        return (C6830p) m28001t.get(0);
    }

    /* renamed from: t */
    public static synchronized List m28001t(String str, boolean z6, boolean z7) {
        synchronized (AbstractC6811I.class) {
            try {
                b bVar = new b(str, z6, z7);
                HashMap hashMap = f24473b;
                List list = (List) hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i7 = AbstractC5330M.f18800a;
                ArrayList m28002u = m28002u(bVar, i7 >= 21 ? new f(z6, z7) : new e());
                if (z6 && m28002u.isEmpty() && 21 <= i7 && i7 <= 23) {
                    m28002u = m28002u(bVar, new e());
                    if (!m28002u.isEmpty()) {
                        AbstractC5346o.m21867h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C6830p) m28002u.get(0)).f24544a);
                    }
                }
                m27986e(str, m28002u);
                AbstractC3033v m11048p = AbstractC3033v.m11048p(m28002u);
                hashMap.put(bVar, m11048p);
                return m11048p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008c, code lost:
    
        if (r1.f24476b == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0124, B:10:0x002d, B:13:0x0038, B:39:0x00fd, B:42:0x0105, B:44:0x010b, B:47:0x0130, B:48:0x0153), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m28002u(p366w0.AbstractC6811I.b r24, p366w0.AbstractC6811I.d r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p366w0.AbstractC6811I.m28002u(w0.I$b, w0.I$d):java.util.ArrayList");
    }

    /* renamed from: v */
    public static List m28003v(InterfaceC6840z interfaceC6840z, C4327q c4327q, boolean z6, boolean z7) {
        List mo28209a = interfaceC6840z.mo28209a(c4327q.f15138n, z6, z7);
        return AbstractC3033v.m11045m().m11062j(mo28209a).m11062j(m27995n(interfaceC6840z, c4327q, z6, z7)).m11063k();
    }

    /* renamed from: w */
    public static List m28004w(List list, final C4327q c4327q) {
        ArrayList arrayList = new ArrayList(list);
        m27979R(arrayList, new g() { // from class: w0.G
            @Override // p366w0.AbstractC6811I.g
            /* renamed from: a */
            public final int mo27961a(Object obj) {
                int m27975N;
                m27975N = AbstractC6811I.m27975N(C4327q.this, (C6830p) obj);
                return m27975N;
            }
        });
        return arrayList;
    }

    /* renamed from: x */
    public static C6830p m28005x() {
        return m28000s("audio/raw", false, false);
    }

    /* renamed from: y */
    public static Pair m28006y(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f24472a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer m27992k = m27992k(group);
        if (m27992k == null) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer m27991j = m27991j(str2);
        if (m27991j != null) {
            return new Pair(m27992k, m27991j);
        }
        AbstractC5346o.m21867h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    /* renamed from: z */
    public static Pair m28007z(String str, String[] strArr, C4318h c4318h) {
        if (strArr.length < 4) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i7 = 1;
        Matcher matcher = f24472a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC5346o.m21867h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                AbstractC5346o.m21867h("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
            i7 = (c4318h == null || c4318h.f15042c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer m27963B = m27963B(str2);
        if (m27963B != null) {
            return new Pair(Integer.valueOf(i7), m27963B);
        }
        AbstractC5346o.m21867h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
