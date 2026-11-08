package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.media3.exoplayer.rtsp.C3383e;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2938u;
import p171Y2.C2925h;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p178Z2.C3034w;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p272k4.C5410A;
import p387z0.C7120u;
import p387z0.C7121v;

/* renamed from: androidx.media3.exoplayer.rtsp.h */
/* loaded from: classes.dex */
public abstract class AbstractC3386h {

    /* renamed from: a */
    public static final Pattern f11085a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b */
    public static final Pattern f11086b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c */
    public static final Pattern f11087c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d */
    public static final Pattern f11088d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e */
    public static final Pattern f11089e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f */
    public static final Pattern f11090f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g */
    public static final String f11091g = new String(new byte[]{10});

    /* renamed from: h */
    public static final String f11092h = new String(new byte[]{13, 10});

    /* renamed from: androidx.media3.exoplayer.rtsp.h$a */
    public static final class a {

        /* renamed from: a */
        public final String f11093a;

        /* renamed from: b */
        public final String f11094b;

        public a(String str, String str2) {
            this.f11093a = str;
            this.f11094b = str2;
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.h$b */
    public static final class b {

        /* renamed from: a */
        public final String f11095a;

        /* renamed from: b */
        public final long f11096b;

        public b(String str, long j7) {
            this.f11095a = str;
            this.f11096b = j7;
        }
    }

    /* renamed from: a */
    public static void m13346a(boolean z6, String str) {
        if (!z6) {
            throw C4295A.m17945c(str, null);
        }
    }

    /* renamed from: b */
    public static byte[] m13347b(List list) {
        return C2925h.m10526g(f11092h).m10530d(list).getBytes(C3385g.f11066n);
    }

    /* renamed from: c */
    public static String m13348c(int i7) {
        if (i7 == 200) {
            return "OK";
        }
        if (i7 == 461) {
            return "Unsupported Transport";
        }
        if (i7 == 500) {
            return "Internal Server Error";
        }
        if (i7 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i7 == 301) {
            return "Move Permanently";
        }
        if (i7 == 302) {
            return "Move Temporarily";
        }
        if (i7 == 400) {
            return "Bad Request";
        }
        if (i7 == 401) {
            return "Unauthorized";
        }
        if (i7 == 404) {
            return "Not Found";
        }
        if (i7 == 405) {
            return "Method Not Allowed";
        }
        switch (i7) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static byte[] m13349d(String str) {
        return str.getBytes(C3385g.f11066n);
    }

    /* renamed from: e */
    public static boolean m13350e(List list) {
        return f11086b.matcher((CharSequence) list.get(0)).matches();
    }

    /* renamed from: f */
    public static boolean m13351f(String str) {
        return f11085a.matcher(str).matches() || f11086b.matcher(str).matches();
    }

    /* renamed from: g */
    public static long m13352g(String str) {
        try {
            Matcher matcher = f11087c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) AbstractC5332a.m21800e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e7) {
            throw C4295A.m17945c(str, e7);
        }
    }

    /* renamed from: h */
    public static int m13353h(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e7) {
            throw C4295A.m17945c(str, e7);
        }
    }

    /* renamed from: i */
    public static int m13354i(String str) {
        str.hashCode();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: j */
    public static AbstractC3033v m13355j(String str) {
        if (str == null) {
            return AbstractC3033v.m11050t();
        }
        AbstractC3033v.a aVar = new AbstractC3033v.a();
        for (String str2 : AbstractC5330M.m21737e1(str, ",\\s?")) {
            int m13354i = m13354i(str2);
            if (m13354i != 0) {
                aVar.mo11040a(Integer.valueOf(m13354i));
            }
        }
        return aVar.m11063k();
    }

    /* renamed from: k */
    public static C7120u m13356k(List list) {
        Matcher matcher = f11085a.matcher((CharSequence) list.get(0));
        AbstractC5332a.m21796a(matcher.matches());
        int m13354i = m13354i((String) AbstractC5332a.m21800e(matcher.group(1)));
        Uri parse = Uri.parse((String) AbstractC5332a.m21800e(matcher.group(2)));
        int indexOf = list.indexOf(StringUtils.EMPTY);
        AbstractC5332a.m21796a(indexOf > 0);
        return new C7120u(parse, m13354i, new C3383e.b().m13258c(list.subList(1, indexOf)).m13260e(), C2925h.m10526g(f11092h).m10530d(list.subList(indexOf + 1, list.size())));
    }

    /* renamed from: l */
    public static C7121v m13357l(List list) {
        Matcher matcher = f11086b.matcher((CharSequence) list.get(0));
        AbstractC5332a.m21796a(matcher.matches());
        int parseInt = Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(1)));
        int indexOf = list.indexOf(StringUtils.EMPTY);
        AbstractC5332a.m21796a(indexOf > 0);
        return new C7121v(parseInt, new C3383e.b().m13258c(list.subList(1, indexOf)).m13260e(), C2925h.m10526g(f11092h).m10530d(list.subList(indexOf + 1, list.size())));
    }

    /* renamed from: m */
    public static b m13358m(String str) {
        long parseInt;
        Matcher matcher = f11088d.matcher(str);
        if (!matcher.matches()) {
            throw C4295A.m17945c(str, null);
        }
        String str2 = (String) AbstractC5332a.m21800e(matcher.group(1));
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e7) {
                throw C4295A.m17945c(str, e7);
            }
        } else {
            parseInt = 60000;
        }
        return new b(str2, parseInt);
    }

    /* renamed from: n */
    public static a m13359n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            return null;
        }
        String[] m21740f1 = AbstractC5330M.m21740f1(userInfo, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        return new a(m21740f1[0], m21740f1[1]);
    }

    /* renamed from: o */
    public static C3381c m13360o(String str) {
        Matcher matcher = f11089e.matcher(str);
        if (matcher.find()) {
            return new C3381c(2, (String) AbstractC5332a.m21800e(matcher.group(1)), (String) AbstractC5332a.m21800e(matcher.group(3)), AbstractC2938u.m10610d(matcher.group(4)));
        }
        Matcher matcher2 = f11090f.matcher(str);
        if (matcher2.matches()) {
            return new C3381c(1, (String) AbstractC5332a.m21800e(matcher2.group(1)), StringUtils.EMPTY, StringUtils.EMPTY);
        }
        throw C4295A.m17945c("Invalid WWW-Authenticate header " + str, null);
    }

    /* renamed from: p */
    public static Uri m13361p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) AbstractC5332a.m21800e(uri.getAuthority());
        AbstractC5332a.m21796a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(AbstractC5330M.m21737e1(str, "@")[1]).build();
    }

    /* renamed from: q */
    public static AbstractC3033v m13362q(C7120u c7120u) {
        AbstractC5332a.m21796a(c7120u.f25299c.m13254d("CSeq") != null);
        AbstractC3033v.a aVar = new AbstractC3033v.a();
        aVar.mo11040a(AbstractC5330M.m21685H("%s %s %s", m13365t(c7120u.f25298b), c7120u.f25297a, "RTSP/1.0"));
        C3034w m13253b = c7120u.f25299c.m13253b();
        AbstractC3010Y it = m13253b.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3033v abstractC3033v = m13253b.get(str);
            for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
                aVar.mo11040a(AbstractC5330M.m21685H("%s: %s", str, abstractC3033v.get(i7)));
            }
        }
        aVar.mo11040a(StringUtils.EMPTY);
        aVar.mo11040a(c7120u.f25300d);
        return aVar.m11063k();
    }

    /* renamed from: r */
    public static AbstractC3033v m13363r(C7121v c7121v) {
        AbstractC5332a.m21796a(c7121v.f25302b.m13254d("CSeq") != null);
        AbstractC3033v.a aVar = new AbstractC3033v.a();
        aVar.mo11040a(AbstractC5330M.m21685H("%s %s %s", "RTSP/1.0", Integer.valueOf(c7121v.f25301a), m13348c(c7121v.f25301a)));
        C3034w m13253b = c7121v.f25302b.m13253b();
        AbstractC3010Y it = m13253b.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3033v abstractC3033v = m13253b.get(str);
            for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
                aVar.mo11040a(AbstractC5330M.m21685H("%s: %s", str, abstractC3033v.get(i7)));
            }
        }
        aVar.mo11040a(StringUtils.EMPTY);
        aVar.mo11040a(c7121v.f25303c);
        return aVar.m11063k();
    }

    /* renamed from: s */
    public static String[] m13364s(String str) {
        String str2 = f11092h;
        if (!str.contains(str2)) {
            str2 = f11091g;
        }
        return AbstractC5330M.m21737e1(str, str2);
    }

    /* renamed from: t */
    public static String m13365t(int i7) {
        switch (i7) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
