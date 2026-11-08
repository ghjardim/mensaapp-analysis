package p285m1;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2920c;
import p203c3.AbstractC3577g;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: m1.c */
/* loaded from: classes.dex */
public final class C5566c {

    /* renamed from: a */
    public final String f20115a;

    /* renamed from: b */
    public final int f20116b;

    /* renamed from: c */
    public final Integer f20117c;

    /* renamed from: d */
    public final Integer f20118d;

    /* renamed from: e */
    public final float f20119e;

    /* renamed from: f */
    public final boolean f20120f;

    /* renamed from: g */
    public final boolean f20121g;

    /* renamed from: h */
    public final boolean f20122h;

    /* renamed from: i */
    public final boolean f20123i;

    /* renamed from: j */
    public final int f20124j;

    /* renamed from: m1.c$a */
    public static final class a {

        /* renamed from: a */
        public final int f20125a;

        /* renamed from: b */
        public final int f20126b;

        /* renamed from: c */
        public final int f20127c;

        /* renamed from: d */
        public final int f20128d;

        /* renamed from: e */
        public final int f20129e;

        /* renamed from: f */
        public final int f20130f;

        /* renamed from: g */
        public final int f20131g;

        /* renamed from: h */
        public final int f20132h;

        /* renamed from: i */
        public final int f20133i;

        /* renamed from: j */
        public final int f20134j;

        /* renamed from: k */
        public final int f20135k;

        public a(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f20125a = i7;
            this.f20126b = i8;
            this.f20127c = i9;
            this.f20128d = i10;
            this.f20129e = i11;
            this.f20130f = i12;
            this.f20131g = i13;
            this.f20132h = i14;
            this.f20133i = i15;
            this.f20134j = i16;
            this.f20135k = i17;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static a m23331a(String str) {
            char c7;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < split.length; i17++) {
                String m10515e = AbstractC2920c.m10515e(split[i17].trim());
                m10515e.hashCode();
                switch (m10515e.hashCode()) {
                    case -1178781136:
                        if (m10515e.equals("italic")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1026963764:
                        if (m10515e.equals("underline")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -192095652:
                        if (m10515e.equals("strikeout")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -70925746:
                        if (m10515e.equals("primarycolour")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3029637:
                        if (m10515e.equals("bold")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3373707:
                        if (m10515e.equals("name")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 366554320:
                        if (m10515e.equals("fontsize")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 767321349:
                        if (m10515e.equals("borderstyle")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1767875043:
                        if (m10515e.equals("alignment")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1988365454:
                        if (m10515e.equals("outlinecolour")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        i13 = i17;
                        break;
                    case 1:
                        i14 = i17;
                        break;
                    case 2:
                        i15 = i17;
                        break;
                    case 3:
                        i9 = i17;
                        break;
                    case 4:
                        i12 = i17;
                        break;
                    case 5:
                        i7 = i17;
                        break;
                    case 6:
                        i11 = i17;
                        break;
                    case 7:
                        i16 = i17;
                        break;
                    case '\b':
                        i8 = i17;
                        break;
                    case '\t':
                        i10 = i17;
                        break;
                }
            }
            if (i7 != -1) {
                return new a(i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, split.length);
            }
            return null;
        }
    }

    /* renamed from: m1.c$b */
    public static final class b {

        /* renamed from: c */
        public static final Pattern f20136c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        public static final Pattern f20137d = Pattern.compile(AbstractC5330M.m21685H("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        public static final Pattern f20138e = Pattern.compile(AbstractC5330M.m21685H("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        public static final Pattern f20139f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f20140a;

        /* renamed from: b */
        public final PointF f20141b;

        public b(int i7, PointF pointF) {
            this.f20140a = i7;
            this.f20141b = pointF;
        }

        /* renamed from: a */
        public static int m23332a(String str) {
            Matcher matcher = f20139f.matcher(str);
            if (matcher.find()) {
                return C5566c.m23326e((String) AbstractC5332a.m21800e(matcher.group(1)));
            }
            return -1;
        }

        /* renamed from: b */
        public static b m23333b(String str) {
            Matcher matcher = f20136c.matcher(str);
            PointF pointF = null;
            int i7 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC5332a.m21800e(matcher.group(1));
                try {
                    PointF m23334c = m23334c(str2);
                    if (m23334c != null) {
                        pointF = m23334c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int m23332a = m23332a(str2);
                    if (m23332a != -1) {
                        i7 = m23332a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i7, pointF);
        }

        /* renamed from: c */
        public static PointF m23334c(String str) {
            String group;
            String group2;
            Matcher matcher = f20137d.matcher(str);
            Matcher matcher2 = f20138e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    AbstractC5346o.m21865f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) AbstractC5332a.m21800e(group)).trim()), Float.parseFloat(((String) AbstractC5332a.m21800e(group2)).trim()));
        }

        /* renamed from: d */
        public static String m23335d(String str) {
            return f20136c.matcher(str).replaceAll(StringUtils.EMPTY);
        }
    }

    public C5566c(String str, int i7, Integer num, Integer num2, float f7, boolean z6, boolean z7, boolean z8, boolean z9, int i8) {
        this.f20115a = str;
        this.f20116b = i7;
        this.f20117c = num;
        this.f20118d = num2;
        this.f20119e = f7;
        this.f20120f = z6;
        this.f20121g = z7;
        this.f20122h = z8;
        this.f20123i = z9;
        this.f20124j = i8;
    }

    /* renamed from: b */
    public static C5566c m23323b(String str, a aVar) {
        AbstractC5332a.m21796a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i7 = aVar.f20135k;
        if (length != i7) {
            AbstractC5346o.m21867h("SsaStyle", AbstractC5330M.m21685H("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i7), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f20125a].trim();
            int i8 = aVar.f20126b;
            int m23326e = i8 != -1 ? m23326e(split[i8].trim()) : -1;
            int i9 = aVar.f20127c;
            Integer m23329h = i9 != -1 ? m23329h(split[i9].trim()) : null;
            int i10 = aVar.f20128d;
            Integer m23329h2 = i10 != -1 ? m23329h(split[i10].trim()) : null;
            int i11 = aVar.f20129e;
            float m23330i = i11 != -1 ? m23330i(split[i11].trim()) : -3.4028235E38f;
            int i12 = aVar.f20130f;
            boolean z6 = i12 != -1 && m23327f(split[i12].trim());
            int i13 = aVar.f20131g;
            boolean z7 = i13 != -1 && m23327f(split[i13].trim());
            int i14 = aVar.f20132h;
            boolean z8 = i14 != -1 && m23327f(split[i14].trim());
            int i15 = aVar.f20133i;
            boolean z9 = i15 != -1 && m23327f(split[i15].trim());
            int i16 = aVar.f20134j;
            return new C5566c(trim, m23326e, m23329h, m23329h2, m23330i, z6, z7, z8, z9, i16 != -1 ? m23328g(split[i16].trim()) : -1);
        } catch (RuntimeException e7) {
            AbstractC5346o.m21868i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e7);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m23324c(int i7) {
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static boolean m23325d(int i7) {
        return i7 == 1 || i7 == 3;
    }

    /* renamed from: e */
    public static int m23326e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m23324c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC5346o.m21867h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: f */
    public static boolean m23327f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e7) {
            AbstractC5346o.m21868i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }

    /* renamed from: g */
    public static int m23328g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m23325d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC5346o.m21867h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    /* renamed from: h */
    public static Integer m23329h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC5332a.m21796a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC3577g.m14421d(((parseLong >> 24) & 255) ^ 255), AbstractC3577g.m14421d(parseLong & 255), AbstractC3577g.m14421d((parseLong >> 8) & 255), AbstractC3577g.m14421d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            AbstractC5346o.m21868i("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }

    /* renamed from: i */
    public static float m23330i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e7) {
            AbstractC5346o.m21868i("SsaStyle", "Failed to parse font size: '" + str + "'", e7);
            return -3.4028235E38f;
        }
    }
}
