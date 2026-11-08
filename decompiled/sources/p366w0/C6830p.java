package p366w0;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import p232g0.AbstractC4336z;
import p232g0.C4318h;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p292n0.C5749p;

/* renamed from: w0.p */
/* loaded from: classes.dex */
public final class C6830p {

    /* renamed from: a */
    public final String f24544a;

    /* renamed from: b */
    public final String f24545b;

    /* renamed from: c */
    public final String f24546c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f24547d;

    /* renamed from: e */
    public final boolean f24548e;

    /* renamed from: f */
    public final boolean f24549f;

    /* renamed from: g */
    public final boolean f24550g;

    /* renamed from: h */
    public final boolean f24551h;

    /* renamed from: i */
    public final boolean f24552i;

    /* renamed from: j */
    public final boolean f24553j;

    /* renamed from: k */
    public final boolean f24554k;

    public C6830p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f24544a = (String) AbstractC5332a.m21800e(str);
        this.f24545b = str2;
        this.f24546c = str3;
        this.f24547d = codecCapabilities;
        this.f24551h = z6;
        this.f24552i = z7;
        this.f24553j = z8;
        this.f24548e = z9;
        this.f24549f = z10;
        this.f24550g = z11;
        this.f24554k = AbstractC4336z.m18426s(str2);
    }

    /* renamed from: A */
    public static boolean m28100A(String str, int i7) {
        if ("video/hevc".equals(str) && 2 == i7) {
            String str2 = AbstractC5330M.f18801b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m28101B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(AbstractC5330M.f18801b)) ? false : true;
    }

    /* renamed from: C */
    public static C6830p m28102C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        return new C6830p(str, str2, str3, codecCapabilities, z6, z7, z8, (z9 || codecCapabilities == null || !m28107h(codecCapabilities) || m28114z(str)) ? false : true, codecCapabilities != null && m28110s(codecCapabilities), z10 || (codecCapabilities != null && m28108q(codecCapabilities)));
    }

    /* renamed from: a */
    public static int m28103a(String str, String str2, int i7) {
        if (i7 > 1 || ((AbstractC5330M.f18800a >= 26 && i7 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i7;
        }
        int i8 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        AbstractC5346o.m21867h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i7 + " to " + i8 + "]");
        return i8;
    }

    /* renamed from: c */
    public static Point m28104c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC5330M.m21753k(i7, widthAlignment) * widthAlignment, AbstractC5330M.m21753k(i8, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    public static boolean m28105d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        Point m28104c = m28104c(videoCapabilities, i7, i8);
        int i9 = m28104c.x;
        int i10 = m28104c.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    /* renamed from: f */
    public static MediaCodecInfo.CodecProfileLevel[] m28106f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i7 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i7;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: h */
    public static boolean m28107h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: q */
    public static boolean m28108q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC5330M.f18800a >= 21 && m28109r(codecCapabilities);
    }

    /* renamed from: r */
    public static boolean m28109r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: s */
    public static boolean m28110s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC5330M.f18800a >= 21 && m28111t(codecCapabilities);
    }

    /* renamed from: t */
    public static boolean m28111t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: x */
    public static boolean m28112x(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: y */
    public static boolean m28113y(String str) {
        return AbstractC5330M.f18803d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: z */
    public static boolean m28114z(String str) {
        if (AbstractC5330M.f18800a <= 22) {
            String str2 = AbstractC5330M.f18803d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Point m28115b(int i7, int i8) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24547d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m28104c(videoCapabilities, i7, i8);
    }

    /* renamed from: e */
    public C5749p m28116e(C4327q c4327q, C4327q c4327q2) {
        int i7 = !AbstractC5330M.m21729c(c4327q.f15138n, c4327q2.f15138n) ? 8 : 0;
        if (this.f24554k) {
            if (c4327q.f15147w != c4327q2.f15147w) {
                i7 |= 1024;
            }
            if (!this.f24548e && (c4327q.f15144t != c4327q2.f15144t || c4327q.f15145u != c4327q2.f15145u)) {
                i7 |= 512;
            }
            if ((!C4318h.m18142h(c4327q.f15113A) || !C4318h.m18142h(c4327q2.f15113A)) && !AbstractC5330M.m21729c(c4327q.f15113A, c4327q2.f15113A)) {
                i7 |= 2048;
            }
            if (m28113y(this.f24544a) && !c4327q.m18196e(c4327q2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C5749p(this.f24544a, c4327q, c4327q2, c4327q.m18196e(c4327q2) ? 3 : 2, 0);
            }
        } else {
            if (c4327q.f15114B != c4327q2.f15114B) {
                i7 |= 4096;
            }
            if (c4327q.f15115C != c4327q2.f15115C) {
                i7 |= 8192;
            }
            if (c4327q.f15116D != c4327q2.f15116D) {
                i7 |= 16384;
            }
            if (i7 == 0 && "audio/mp4a-latm".equals(this.f24545b)) {
                Pair m27999r = AbstractC6811I.m27999r(c4327q);
                Pair m27999r2 = AbstractC6811I.m27999r(c4327q2);
                if (m27999r != null && m27999r2 != null) {
                    int intValue = ((Integer) m27999r.first).intValue();
                    int intValue2 = ((Integer) m27999r2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C5749p(this.f24544a, c4327q, c4327q2, 3, 0);
                    }
                }
            }
            if (!c4327q.m18196e(c4327q2)) {
                i7 |= 32;
            }
            if (m28112x(this.f24545b)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C5749p(this.f24544a, c4327q, c4327q2, 1, 0);
            }
        }
        return new C5749p(this.f24544a, c4327q, c4327q2, 0, i7);
    }

    /* renamed from: g */
    public MediaCodecInfo.CodecProfileLevel[] m28117g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24547d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: i */
    public boolean m28118i(int i7) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24547d;
        if (codecCapabilities == null) {
            m28128w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m28128w("channelCount.aCaps");
            return false;
        }
        if (m28103a(this.f24544a, this.f24545b, audioCapabilities.getMaxInputChannelCount()) >= i7) {
            return true;
        }
        m28128w("channelCount.support, " + i7);
        return false;
    }

    /* renamed from: j */
    public boolean m28119j(int i7) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24547d;
        if (codecCapabilities == null) {
            m28128w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m28128w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i7)) {
            return true;
        }
        m28128w("sampleRate.support, " + i7);
        return false;
    }

    /* renamed from: k */
    public final boolean m28120k(C4327q c4327q, boolean z6) {
        Pair m27999r = AbstractC6811I.m27999r(c4327q);
        if (m27999r == null) {
            return true;
        }
        int intValue = ((Integer) m27999r.first).intValue();
        int intValue2 = ((Integer) m27999r.second).intValue();
        if ("video/dolby-vision".equals(c4327q.f15138n)) {
            if (!"video/avc".equals(this.f24545b)) {
                intValue = "video/hevc".equals(this.f24545b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.f24554k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] m28117g = m28117g();
        if (AbstractC5330M.f18800a <= 23 && "video/x-vnd.on2.vp9".equals(this.f24545b) && m28117g.length == 0) {
            m28117g = m28106f(this.f24547d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m28117g) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z6) && !m28100A(this.f24545b, intValue))) {
                return true;
            }
        }
        m28128w("codec.profileLevel, " + c4327q.f15134j + ", " + this.f24546c);
        return false;
    }

    /* renamed from: l */
    public boolean m28121l(C4327q c4327q) {
        return m28124o(c4327q) && m28120k(c4327q, false);
    }

    /* renamed from: m */
    public boolean m28122m(C4327q c4327q) {
        int i7;
        if (!m28124o(c4327q) || !m28120k(c4327q, true)) {
            return false;
        }
        if (!this.f24554k) {
            if (AbstractC5330M.f18800a >= 21) {
                int i8 = c4327q.f15115C;
                if (i8 != -1 && !m28119j(i8)) {
                    return false;
                }
                int i9 = c4327q.f15114B;
                if (i9 != -1 && !m28118i(i9)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = c4327q.f15144t;
        if (i10 <= 0 || (i7 = c4327q.f15145u) <= 0) {
            return true;
        }
        if (AbstractC5330M.f18800a >= 21) {
            return m28126u(i10, i7, c4327q.f15146v);
        }
        boolean z6 = i10 * i7 <= AbstractC6811I.m27977P();
        if (!z6) {
            m28128w("legacyFrameSize, " + c4327q.f15144t + "x" + c4327q.f15145u);
        }
        return z6;
    }

    /* renamed from: n */
    public boolean m28123n() {
        if (AbstractC5330M.f18800a >= 29 && "video/x-vnd.on2.vp9".equals(this.f24545b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m28117g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m28124o(C4327q c4327q) {
        return this.f24545b.equals(c4327q.f15138n) || this.f24545b.equals(AbstractC6811I.m27994m(c4327q));
    }

    /* renamed from: p */
    public boolean m28125p(C4327q c4327q) {
        if (this.f24554k) {
            return this.f24548e;
        }
        Pair m27999r = AbstractC6811I.m27999r(c4327q);
        return m27999r != null && ((Integer) m27999r.first).intValue() == 42;
    }

    public String toString() {
        return this.f24544a;
    }

    /* renamed from: u */
    public boolean m28126u(int i7, int i8, double d7) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24547d;
        if (codecCapabilities == null) {
            m28128w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m28128w("sizeAndRate.vCaps");
            return false;
        }
        if (AbstractC5330M.f18800a >= 29) {
            int m28136c = AbstractC6836v.m28136c(videoCapabilities, i7, i8, d7);
            if (m28136c == 2) {
                return true;
            }
            if (m28136c == 1) {
                m28128w("sizeAndRate.cover, " + i7 + "x" + i8 + "@" + d7);
                return false;
            }
        }
        if (!m28105d(videoCapabilities, i7, i8, d7)) {
            if (i7 >= i8 || !m28101B(this.f24544a) || !m28105d(videoCapabilities, i8, i7, d7)) {
                m28128w("sizeAndRate.support, " + i7 + "x" + i8 + "@" + d7);
                return false;
            }
            m28127v("sizeAndRate.rotated, " + i7 + "x" + i8 + "@" + d7);
        }
        return true;
    }

    /* renamed from: v */
    public final void m28127v(String str) {
        AbstractC5346o.m21861b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f24544a + ", " + this.f24545b + "] [" + AbstractC5330M.f18804e + "]");
    }

    /* renamed from: w */
    public final void m28128w(String str) {
        AbstractC5346o.m21861b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f24544a + ", " + this.f24545b + "] [" + AbstractC5330M.f18804e + "]");
    }
}
