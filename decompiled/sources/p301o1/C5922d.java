package p301o1;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p171Y2.AbstractC2920c;
import p249i1.AbstractC4518i;
import p249i1.AbstractC4528s;
import p249i1.C4522m;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5331N;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5336e;
import p259j0.AbstractC5346o;
import p259j0.InterfaceC5338g;
import p272k4.C5410A;

/* renamed from: o1.d */
/* loaded from: classes.dex */
public final class C5922d implements InterfaceC4529t {

    /* renamed from: b */
    public static final Pattern f21347b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c */
    public static final Pattern f21348c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d */
    public static final Pattern f21349d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e */
    public static final Pattern f21350e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f */
    public static final Pattern f21351f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: g */
    public static final Pattern f21352g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: h */
    public static final Pattern f21353h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i */
    public static final a f21354i = new a(30.0f, 1, 1);

    /* renamed from: a */
    public final XmlPullParserFactory f21355a;

    /* renamed from: o1.d$a */
    public static final class a {

        /* renamed from: a */
        public final float f21356a;

        /* renamed from: b */
        public final int f21357b;

        /* renamed from: c */
        public final int f21358c;

        public a(float f7, int i7, int i8) {
            this.f21356a = f7;
            this.f21357b = i7;
            this.f21358c = i8;
        }
    }

    /* renamed from: o1.d$b */
    public static final class b {

        /* renamed from: a */
        public final int f21359a;

        /* renamed from: b */
        public final int f21360b;

        public b(int i7, int i8) {
            this.f21359a = i7;
            this.f21360b = i8;
        }
    }

    public C5922d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f21355a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    /* renamed from: d */
    public static C5925g m24896d(C5925g c5925g) {
        return c5925g == null ? new C5925g() : c5925g;
    }

    /* renamed from: e */
    public static boolean m24897e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals(ExternalParsersConfigReaderMetKeys.METADATA_TAG) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: f */
    public static Layout.Alignment m24898f(String str) {
        String m10515e = AbstractC2920c.m10515e(str);
        m10515e.hashCode();
        switch (m10515e) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static int m24899g(XmlPullParser xmlPullParser, int i7) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i7;
        }
        Matcher matcher = f21353h.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC5346o.m21867h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i7;
        }
        boolean z6 = true;
        try {
            int parseInt = Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z6 = false;
            }
            AbstractC5332a.m21797b(z6, "Invalid cell resolution " + parseInt + StringUtils.SPACE + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            AbstractC5346o.m21867h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i7;
        }
    }

    /* renamed from: h */
    public static void m24900h(String str, C5925g c5925g) {
        Matcher matcher;
        String str2;
        String[] m21737e1 = AbstractC5330M.m21737e1(str, "\\s+");
        if (m21737e1.length == 1) {
            matcher = f21349d.matcher(str);
        } else {
            if (m21737e1.length != 2) {
                throw new C4522m("Invalid number of entries for fontSize: " + m21737e1.length + ".");
            }
            matcher = f21349d.matcher(m21737e1[1]);
            AbstractC5346o.m21867h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C4522m("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) AbstractC5332a.m21800e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                c5925g.m24953z(3);
                break;
            case "em":
                c5925g.m24953z(2);
                break;
            case "px":
                c5925g.m24953z(1);
                break;
            default:
                throw new C4522m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        c5925g.m24952y(Float.parseFloat((String) AbstractC5332a.m21800e(matcher.group(1))));
    }

    /* renamed from: i */
    public static a m24901i(XmlPullParser xmlPullParser) {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            AbstractC5332a.m21797b(AbstractC5330M.m21737e1(attributeValue2, StringUtils.SPACE).length == 2, "frameRateMultiplier doesn't have 2 parts");
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f7 = 1.0f;
        }
        a aVar = f21354i;
        int i7 = aVar.f21357b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i7 = Integer.parseInt(attributeValue3);
        }
        int i8 = aVar.f21358c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i8 = Integer.parseInt(attributeValue4);
        }
        return new a(parseInt * f7, i7, i8);
    }

    /* renamed from: j */
    public static Map m24902j(XmlPullParser xmlPullParser, Map map, int i7, b bVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "style")) {
                String m21788a = AbstractC5331N.m21788a(xmlPullParser, "style");
                C5925g m24907o = m24907o(xmlPullParser, new C5925g());
                if (m21788a != null) {
                    for (String str : m24908p(m21788a)) {
                        m24907o.m24928a((C5925g) map.get(str));
                    }
                }
                String m24934g = m24907o.m24934g();
                if (m24934g != null) {
                    map.put(m24934g, m24907o);
                }
            } else if (AbstractC5331N.m21793f(xmlPullParser, "region")) {
                C5923e m24905m = m24905m(xmlPullParser, i7, bVar);
                if (m24905m != null) {
                    map2.put(m24905m.f21361a, m24905m);
                }
            } else if (AbstractC5331N.m21793f(xmlPullParser, ExternalParsersConfigReaderMetKeys.METADATA_TAG)) {
                m24903k(xmlPullParser, map3);
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: k */
    public static void m24903k(XmlPullParser xmlPullParser, Map map) {
        String m21788a;
        do {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "image") && (m21788a = AbstractC5331N.m21788a(xmlPullParser, "id")) != null) {
                map.put(m21788a, xmlPullParser.nextText());
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, ExternalParsersConfigReaderMetKeys.METADATA_TAG));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: l */
    public static C5921c m24904l(XmlPullParser xmlPullParser, C5921c c5921c, Map map, a aVar) {
        long j7;
        long j8;
        char c7;
        int attributeCount = xmlPullParser.getAttributeCount();
        C5925g m24907o = m24907o(xmlPullParser, null);
        String str = null;
        String str2 = StringUtils.EMPTY;
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        String[] strArr = null;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c7 = 5;
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
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j11 = m24909q(attributeValue, aVar);
                    break;
                case 2:
                    j10 = m24909q(attributeValue, aVar);
                    break;
                case 3:
                    j9 = m24909q(attributeValue, aVar);
                    break;
                case 4:
                    String[] m24908p = m24908p(attributeValue);
                    if (m24908p.length > 0) {
                        strArr = m24908p;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c5921c != null) {
            long j12 = c5921c.f21337d;
            j7 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                if (j9 != -9223372036854775807L) {
                    j9 += j12;
                }
                if (j10 != -9223372036854775807L) {
                    j10 += j12;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        long j13 = j9;
        if (j10 == j7) {
            if (j11 != j7) {
                j8 = j13 + j11;
            } else if (c5921c != null) {
                long j14 = c5921c.f21338e;
                if (j14 != j7) {
                    j8 = j14;
                }
            }
            return C5921c.m24880c(xmlPullParser.getName(), j13, j8, m24907o, strArr, str2, str, c5921c);
        }
        j8 = j10;
        return C5921c.m24880c(xmlPullParser.getName(), j13, j8, m24907o, strArr, str2, str, c5921c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a6, code lost:
    
        if (r0.equals("tb") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0179  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p301o1.C5923e m24905m(org.xmlpull.v1.XmlPullParser r18, int r19, p301o1.C5922d.b r20) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p301o1.C5922d.m24905m(org.xmlpull.v1.XmlPullParser, int, o1.d$b):o1.e");
    }

    /* renamed from: n */
    public static float m24906n(String str) {
        Matcher matcher = f21350e.matcher(str);
        if (!matcher.matches()) {
            AbstractC5346o.m21867h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC5332a.m21800e(matcher.group(1)))));
        } catch (NumberFormatException e7) {
            AbstractC5346o.m21868i("TtmlParser", "Failed to parse shear: " + str, e7);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: o */
    public static C5925g m24907o(XmlPullParser xmlPullParser, C5925g c5925g) {
        char c7;
        boolean z6;
        boolean z7;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            String attributeName = xmlPullParser.getAttributeName(i7);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c7 = 14;
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
                    c5925g = m24896d(c5925g).m24918B("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    c5925g = m24896d(c5925g).m24951x(attributeValue);
                    break;
                case 2:
                    c5925g = m24896d(c5925g).m24924H(m24898f(attributeValue));
                    break;
                case 3:
                    String m10515e = AbstractC2920c.m10515e(attributeValue);
                    m10515e.hashCode();
                    switch (m10515e.hashCode()) {
                        case -1461280213:
                            if (m10515e.equals("nounderline")) {
                                z6 = false;
                                break;
                            }
                            z6 = -1;
                            break;
                        case -1026963764:
                            if (m10515e.equals("underline")) {
                                z6 = true;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 913457136:
                            if (m10515e.equals("nolinethrough")) {
                                z6 = 2;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 1679736913:
                            if (m10515e.equals("linethrough")) {
                                z6 = 3;
                                break;
                            }
                            z6 = -1;
                            break;
                        default:
                            z6 = -1;
                            break;
                    }
                    switch (z6) {
                        case false:
                            c5925g = m24896d(c5925g).m24927K(false);
                            break;
                        case true:
                            c5925g = m24896d(c5925g).m24927K(true);
                            break;
                        case true:
                            c5925g = m24896d(c5925g).m24919C(false);
                            break;
                        case true:
                            c5925g = m24896d(c5925g).m24919C(true);
                            break;
                    }
                case 4:
                    c5925g = m24896d(c5925g).m24949v("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        c5925g = m24896d(c5925g).m24917A(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String m10515e2 = AbstractC2920c.m10515e(attributeValue);
                    m10515e2.hashCode();
                    switch (m10515e2.hashCode()) {
                        case -618561360:
                            if (m10515e2.equals("baseContainer")) {
                                z7 = false;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -410956671:
                            if (m10515e2.equals("container")) {
                                z7 = true;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -250518009:
                            if (m10515e2.equals("delimiter")) {
                                z7 = 2;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -136074796:
                            if (m10515e2.equals("textContainer")) {
                                z7 = 3;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 3016401:
                            if (m10515e2.equals("base")) {
                                z7 = 4;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 3556653:
                            if (m10515e2.equals("text")) {
                                z7 = 5;
                                break;
                            }
                            z7 = -1;
                            break;
                        default:
                            z7 = -1;
                            break;
                    }
                    switch (z7) {
                        case false:
                        case true:
                            c5925g = m24896d(c5925g).m24922F(2);
                            break;
                        case true:
                            c5925g = m24896d(c5925g).m24922F(1);
                            break;
                        case true:
                            c5925g = m24896d(c5925g).m24922F(4);
                            break;
                        case true:
                        case true:
                            c5925g = m24896d(c5925g).m24922F(3);
                            break;
                    }
                case 7:
                    c5925g = m24896d(c5925g);
                    try {
                        c5925g.m24950w(AbstractC5336e.m21820c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC5346o.m21867h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    c5925g = m24896d(c5925g).m24923G(m24906n(attributeValue));
                    break;
                case '\t':
                    String m10515e3 = AbstractC2920c.m10515e(attributeValue);
                    m10515e3.hashCode();
                    if (m10515e3.equals("all")) {
                        c5925g = m24896d(c5925g).m24925I(true);
                        break;
                    } else if (m10515e3.equals("none")) {
                        c5925g = m24896d(c5925g).m24925I(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        c5925g = m24896d(c5925g);
                        m24900h(attributeValue, c5925g);
                        break;
                    } catch (C4522m unused2) {
                        AbstractC5346o.m21867h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    c5925g = m24896d(c5925g).m24926J(C5920b.m24878a(attributeValue));
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    String m10515e4 = AbstractC2920c.m10515e(attributeValue);
                    m10515e4.hashCode();
                    if (m10515e4.equals("before")) {
                        c5925g = m24896d(c5925g).m24921E(1);
                        break;
                    } else if (m10515e4.equals("after")) {
                        c5925g = m24896d(c5925g).m24921E(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    c5925g = m24896d(c5925g);
                    try {
                        c5925g.m24948u(AbstractC5336e.m21820c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC5346o.m21867h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    c5925g = m24896d(c5925g).m24920D(m24898f(attributeValue));
                    break;
            }
        }
        return c5925g;
    }

    /* renamed from: p */
    public static String[] m24908p(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : AbstractC5330M.m21737e1(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m24909q(java.lang.String r13, p301o1.C5922d.a r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p301o1.C5922d.m24909q(java.lang.String, o1.d$a):long");
    }

    /* renamed from: r */
    public static b m24910r(XmlPullParser xmlPullParser) {
        String m21788a = AbstractC5331N.m21788a(xmlPullParser, "extent");
        if (m21788a == null) {
            return null;
        }
        Matcher matcher = f21352g.matcher(m21788a);
        if (!matcher.matches()) {
            AbstractC5346o.m21867h("TtmlParser", "Ignoring non-pixel tts extent: " + m21788a);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(1))), Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            AbstractC5346o.m21867h("TtmlParser", "Ignoring malformed tts extent: " + m21788a);
            return null;
        }
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        char c7;
        a aVar;
        try {
            XmlPullParser newPullParser = this.f21355a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(StringUtils.EMPTY, new C5923e(StringUtils.EMPTY));
            b bVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVar2 = f21354i;
            C5926h c5926h = null;
            int i9 = 0;
            int i10 = 15;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C5921c c5921c = (C5921c) arrayDeque.peek();
                if (i9 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar2 = m24901i(newPullParser);
                            c7 = 15;
                            i10 = m24899g(newPullParser, 15);
                            bVar = m24910r(newPullParser);
                        } else {
                            c7 = 15;
                        }
                        b bVar2 = bVar;
                        a aVar3 = aVar2;
                        int i11 = i10;
                        if (m24897e(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar3;
                                m24902j(newPullParser, hashMap, i11, bVar2, hashMap2, hashMap3);
                            } else {
                                aVar = aVar3;
                                try {
                                    C5921c m24904l = m24904l(newPullParser, c5921c, hashMap2, aVar);
                                    arrayDeque.push(m24904l);
                                    if (c5921c != null) {
                                        c5921c.m24884a(m24904l);
                                    }
                                } catch (C4522m e7) {
                                    AbstractC5346o.m21868i("TtmlParser", "Suppressing parser error", e7);
                                    i9++;
                                }
                            }
                            aVar2 = aVar;
                            bVar = bVar2;
                            i10 = i11;
                        } else {
                            AbstractC5346o.m21865f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i9++;
                            aVar2 = aVar3;
                            bVar = bVar2;
                            i10 = i11;
                        }
                    } else if (eventType == 4) {
                        ((C5921c) AbstractC5332a.m21800e(c5921c)).m24884a(C5921c.m24881d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c5926h = new C5926h((C5921c) AbstractC5332a.m21800e((C5921c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i9++;
                } else if (eventType == 3) {
                    i9--;
                }
                newPullParser.next();
            }
            return (InterfaceC4520k) AbstractC5332a.m21800e(c5926h);
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        AbstractC4518i.m19231c(mo19257a(bArr, i7, i8), bVar, interfaceC5338g);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 1;
    }

    @Override // p249i1.InterfaceC4529t
    public /* synthetic */ void reset() {
        AbstractC4528s.m19256b(this);
    }
}
