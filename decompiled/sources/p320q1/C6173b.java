package p320q1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2920c;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5336e;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: q1.b */
/* loaded from: classes.dex */
public final class C6173b {

    /* renamed from: c */
    public static final Pattern f22076c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f22077d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final C5357z f22078a = new C5357z();

    /* renamed from: b */
    public final StringBuilder f22079b = new StringBuilder();

    /* renamed from: b */
    public static boolean m25750b(C5357z c5357z) {
        int m21947f = c5357z.m21947f();
        int m21948g = c5357z.m21948g();
        byte[] m21946e = c5357z.m21946e();
        if (m21947f + 2 > m21948g) {
            return false;
        }
        int i7 = m21947f + 1;
        if (m21946e[m21947f] != 47) {
            return false;
        }
        int i8 = m21947f + 2;
        if (m21946e[i7] != 42) {
            return false;
        }
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= m21948g) {
                c5357z.m21940U(m21948g - c5357z.m21947f());
                return true;
            }
            if (((char) m21946e[i8]) == '*' && ((char) m21946e[i9]) == '/') {
                i8 += 2;
                m21948g = i8;
            } else {
                i8 = i9;
            }
        }
    }

    /* renamed from: c */
    public static boolean m25751c(C5357z c5357z) {
        char m25758k = m25758k(c5357z, c5357z.m21947f());
        if (m25758k != '\t' && m25758k != '\n' && m25758k != '\f' && m25758k != '\r' && m25758k != ' ') {
            return false;
        }
        c5357z.m21940U(1);
        return true;
    }

    /* renamed from: e */
    public static void m25752e(String str, C6174c c6174c) {
        Matcher matcher = f22077d.matcher(AbstractC2920c.m10515e(str));
        if (!matcher.matches()) {
            AbstractC5346o.m21867h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC5332a.m21800e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                c6174c.m25785t(3);
                break;
            case "em":
                c6174c.m25785t(2);
                break;
            case "px":
                c6174c.m25785t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        c6174c.m25784s(Float.parseFloat((String) AbstractC5332a.m21800e(matcher.group(1))));
    }

    /* renamed from: f */
    public static String m25753f(C5357z c5357z, StringBuilder sb) {
        boolean z6 = false;
        sb.setLength(0);
        int m21947f = c5357z.m21947f();
        int m21948g = c5357z.m21948g();
        while (m21947f < m21948g && !z6) {
            char c7 = (char) c5357z.m21946e()[m21947f];
            if ((c7 < 'A' || c7 > 'Z') && ((c7 < 'a' || c7 > 'z') && !((c7 >= '0' && c7 <= '9') || c7 == '#' || c7 == '-' || c7 == '.' || c7 == '_'))) {
                z6 = true;
            } else {
                m21947f++;
                sb.append(c7);
            }
        }
        c5357z.m21940U(m21947f - c5357z.m21947f());
        return sb.toString();
    }

    /* renamed from: g */
    public static String m25754g(C5357z c5357z, StringBuilder sb) {
        m25761n(c5357z);
        if (c5357z.m21942a() == 0) {
            return null;
        }
        String m25753f = m25753f(c5357z, sb);
        if (!StringUtils.EMPTY.equals(m25753f)) {
            return m25753f;
        }
        return StringUtils.EMPTY + ((char) c5357z.m21926G());
    }

    /* renamed from: h */
    public static String m25755h(C5357z c5357z, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z6 = false;
        while (!z6) {
            int m21947f = c5357z.m21947f();
            String m25754g = m25754g(c5357z, sb);
            if (m25754g == null) {
                return null;
            }
            if ("}".equals(m25754g) || ";".equals(m25754g)) {
                c5357z.m21939T(m21947f);
                z6 = true;
            } else {
                sb2.append(m25754g);
            }
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public static String m25756i(C5357z c5357z, StringBuilder sb) {
        m25761n(c5357z);
        if (c5357z.m21942a() < 5 || !"::cue".equals(c5357z.m21923D(5))) {
            return null;
        }
        int m21947f = c5357z.m21947f();
        String m25754g = m25754g(c5357z, sb);
        if (m25754g == null) {
            return null;
        }
        if ("{".equals(m25754g)) {
            c5357z.m21939T(m21947f);
            return StringUtils.EMPTY;
        }
        String m25759l = "(".equals(m25754g) ? m25759l(c5357z) : null;
        if (")".equals(m25754g(c5357z, sb))) {
            return m25759l;
        }
        return null;
    }

    /* renamed from: j */
    public static void m25757j(C5357z c5357z, C6174c c6174c, StringBuilder sb) {
        m25761n(c5357z);
        String m25753f = m25753f(c5357z, sb);
        if (!StringUtils.EMPTY.equals(m25753f) && TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(m25754g(c5357z, sb))) {
            m25761n(c5357z);
            String m25755h = m25755h(c5357z, sb);
            if (m25755h == null || StringUtils.EMPTY.equals(m25755h)) {
                return;
            }
            int m21947f = c5357z.m21947f();
            String m25754g = m25754g(c5357z, sb);
            if (!";".equals(m25754g)) {
                if (!"}".equals(m25754g)) {
                    return;
                } else {
                    c5357z.m21939T(m21947f);
                }
            }
            if ("color".equals(m25753f)) {
                c6174c.m25782q(AbstractC5336e.m21819b(m25755h));
                return;
            }
            if ("background-color".equals(m25753f)) {
                c6174c.m25779n(AbstractC5336e.m21819b(m25755h));
                return;
            }
            boolean z6 = true;
            if ("ruby-position".equals(m25753f)) {
                if ("over".equals(m25755h)) {
                    c6174c.m25787v(1);
                    return;
                } else {
                    if ("under".equals(m25755h)) {
                        c6174c.m25787v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(m25753f)) {
                if (!"all".equals(m25755h) && !m25755h.startsWith("digits")) {
                    z6 = false;
                }
                c6174c.m25781p(z6);
                return;
            }
            if ("text-decoration".equals(m25753f)) {
                if ("underline".equals(m25755h)) {
                    c6174c.m25765A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(m25753f)) {
                c6174c.m25783r(m25755h);
                return;
            }
            if ("font-weight".equals(m25753f)) {
                if ("bold".equals(m25755h)) {
                    c6174c.m25780o(true);
                }
            } else if ("font-style".equals(m25753f)) {
                if ("italic".equals(m25755h)) {
                    c6174c.m25786u(true);
                }
            } else if ("font-size".equals(m25753f)) {
                m25752e(m25755h, c6174c);
            }
        }
    }

    /* renamed from: k */
    public static char m25758k(C5357z c5357z, int i7) {
        return (char) c5357z.m21946e()[i7];
    }

    /* renamed from: l */
    public static String m25759l(C5357z c5357z) {
        int m21947f = c5357z.m21947f();
        int m21948g = c5357z.m21948g();
        boolean z6 = false;
        while (m21947f < m21948g && !z6) {
            int i7 = m21947f + 1;
            z6 = ((char) c5357z.m21946e()[m21947f]) == ')';
            m21947f = i7;
        }
        return c5357z.m21923D((m21947f - 1) - c5357z.m21947f()).trim();
    }

    /* renamed from: m */
    public static void m25760m(C5357z c5357z) {
        while (!TextUtils.isEmpty(c5357z.m21959r())) {
        }
    }

    /* renamed from: n */
    public static void m25761n(C5357z c5357z) {
        while (true) {
            for (boolean z6 = true; c5357z.m21942a() > 0 && z6; z6 = false) {
                if (!m25751c(c5357z) && !m25750b(c5357z)) {
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void m25762a(C6174c c6174c, String str) {
        if (StringUtils.EMPTY.equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f22076c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c6174c.m25791z((String) AbstractC5332a.m21800e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] m21737e1 = AbstractC5330M.m21737e1(str, "\\.");
        String str2 = m21737e1[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c6174c.m25790y(str2.substring(0, indexOf2));
            c6174c.m25789x(str2.substring(indexOf2 + 1));
        } else {
            c6174c.m25790y(str2);
        }
        if (m21737e1.length > 1) {
            c6174c.m25788w((String[]) AbstractC5330M.m21704Q0(m21737e1, 1, m21737e1.length));
        }
    }

    /* renamed from: d */
    public List m25763d(C5357z c5357z) {
        this.f22079b.setLength(0);
        int m21947f = c5357z.m21947f();
        m25760m(c5357z);
        this.f22078a.m21937R(c5357z.m21946e(), c5357z.m21947f());
        this.f22078a.m21939T(m21947f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String m25756i = m25756i(this.f22078a, this.f22079b);
            if (m25756i == null) {
                return arrayList;
            }
            if (!"{".equals(m25754g(this.f22078a, this.f22079b))) {
                return arrayList;
            }
            C6174c c6174c = new C6174c();
            m25762a(c6174c, m25756i);
            String str = null;
            boolean z6 = false;
            while (!z6) {
                int m21947f2 = this.f22078a.m21947f();
                String m25754g = m25754g(this.f22078a, this.f22079b);
                boolean z7 = m25754g == null || "}".equals(m25754g);
                if (!z7) {
                    this.f22078a.m21939T(m21947f2);
                    m25757j(this.f22078a, c6174c, this.f22079b);
                }
                str = m25754g;
                z6 = z7;
            }
            if ("}".equals(str)) {
                arrayList.add(c6174c);
            }
        }
    }
}
