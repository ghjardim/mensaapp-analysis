package p232g0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p171Y2.AbstractC2920c;
import p207d.AbstractC4094d;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.z */
/* loaded from: classes.dex */
public abstract class AbstractC4336z {

    /* renamed from: a */
    public static final ArrayList f15434a = new ArrayList();

    /* renamed from: b */
    public static final Pattern f15435b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: g0.z$a */
    public static final class a {

        /* renamed from: a */
        public final int f15436a;

        /* renamed from: b */
        public final int f15437b;

        public a(int i7, int i8) {
            this.f15436a = i7;
            this.f15437b = i8;
        }

        /* renamed from: a */
        public int m18428a() {
            int i7 = this.f15437b;
            if (i7 == 2) {
                return 10;
            }
            if (i7 == 5) {
                return 11;
            }
            if (i7 == 29) {
                return 12;
            }
            if (i7 == 42) {
                return 16;
            }
            if (i7 != 22) {
                return i7 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static boolean m18408a(String str, String str2) {
        a m18416i;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (m18416i = m18416i(str2)) != null) {
                    int m18428a = m18416i.m18428a();
                    if (m18428a == 0 || m18428a == 16) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m18409b(String str, String str2) {
        return m18411d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m18410c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC5330M.m21743g1(str)) {
            String m18414g = m18414g(str2);
            if (m18414g != null && m18422o(m18414g)) {
                return m18414g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m18411d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] m21743g1 = AbstractC5330M.m21743g1(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : m21743g1) {
            if (str2.equals(m18414g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: e */
    public static String m18412e(String str) {
        ArrayList arrayList = f15434a;
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC4094d.m17162a(arrayList.get(0));
        throw null;
    }

    /* renamed from: f */
    public static int m18413f(String str, String str2) {
        a m18416i;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (m18416i = m18416i(str2)) == null) {
                    return 0;
                }
                return m18416i.m18428a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m18414g(String str) {
        a m18416i;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m10515e = AbstractC2920c.m10515e(str.trim());
        if (m10515e.startsWith("avc1") || m10515e.startsWith("avc3")) {
            return "video/avc";
        }
        if (m10515e.startsWith("hev1") || m10515e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m10515e.startsWith("dvav") || m10515e.startsWith("dva1") || m10515e.startsWith("dvhe") || m10515e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (m10515e.startsWith("av01")) {
            return "video/av01";
        }
        if (m10515e.startsWith("vp9") || m10515e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m10515e.startsWith("vp8") || m10515e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!m10515e.startsWith("mp4a")) {
            return m10515e.startsWith("mha1") ? "audio/mha1" : m10515e.startsWith("mhm1") ? "audio/mhm1" : (m10515e.startsWith("ac-3") || m10515e.startsWith("dac3")) ? "audio/ac3" : (m10515e.startsWith("ec-3") || m10515e.startsWith("dec3")) ? "audio/eac3" : m10515e.startsWith("ec+3") ? "audio/eac3-joc" : (m10515e.startsWith("ac-4") || m10515e.startsWith("dac4")) ? "audio/ac4" : m10515e.startsWith("dtsc") ? "audio/vnd.dts" : m10515e.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (m10515e.startsWith("dtsh") || m10515e.startsWith("dtsl")) ? "audio/vnd.dts.hd" : m10515e.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : m10515e.startsWith("opus") ? "audio/opus" : m10515e.startsWith("vorbis") ? "audio/vorbis" : m10515e.startsWith("flac") ? "audio/flac" : m10515e.startsWith("stpp") ? "application/ttml+xml" : m10515e.startsWith("wvtt") ? "text/vtt" : m10515e.contains("cea708") ? "application/cea-708" : (m10515e.contains("eia608") || m10515e.contains("cea608")) ? "application/cea-608" : m18412e(m10515e);
        }
        if (m10515e.startsWith("mp4a.") && (m18416i = m18416i(m10515e)) != null) {
            str2 = m18415h(m18416i.f15436a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    /* renamed from: h */
    public static String m18415h(int i7) {
        if (i7 == 32) {
            return "video/mp4v-es";
        }
        if (i7 == 33) {
            return "video/avc";
        }
        if (i7 == 35) {
            return "video/hevc";
        }
        if (i7 == 64) {
            return "audio/mp4a-latm";
        }
        if (i7 == 163) {
            return "video/wvc1";
        }
        if (i7 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i7 == 221) {
            return "audio/vorbis";
        }
        if (i7 == 165) {
            return "audio/ac3";
        }
        if (i7 == 166) {
            return "audio/eac3";
        }
        switch (i7) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i7) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: i */
    public static a m18416i(String str) {
        Matcher matcher = f15435b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) AbstractC5332a.m21800e(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new a(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m18417j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: k */
    public static int m18418k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m18422o(str)) {
            return 1;
        }
        if (m18426s(str)) {
            return 2;
        }
        if (m18425r(str)) {
            return 3;
        }
        if (m18423p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m18419l(str);
    }

    /* renamed from: l */
    public static int m18419l(String str) {
        ArrayList arrayList = f15434a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        AbstractC4094d.m17162a(arrayList.get(0));
        throw null;
    }

    /* renamed from: m */
    public static int m18420m(String str) {
        return m18418k(m18414g(str));
    }

    /* renamed from: n */
    public static String m18421n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC5330M.m21743g1(str)) {
            String m18414g = m18414g(str2);
            if (m18414g != null && m18426s(m18414g)) {
                return m18414g;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m18422o(String str) {
        return "audio".equals(m18417j(str));
    }

    /* renamed from: p */
    public static boolean m18423p(String str) {
        return "image".equals(m18417j(str)) || "application/x-image-uri".equals(str);
    }

    /* renamed from: q */
    public static boolean m18424q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* renamed from: r */
    public static boolean m18425r(String str) {
        return "text".equals(m18417j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: s */
    public static boolean m18426s(String str) {
        return "video".equals(m18417j(str));
    }

    /* renamed from: t */
    public static String m18427t(String str) {
        String m10515e;
        if (str == null) {
            return null;
        }
        m10515e = AbstractC2920c.m10515e(str);
        m10515e.hashCode();
        switch (m10515e) {
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return m10515e;
        }
    }
}
