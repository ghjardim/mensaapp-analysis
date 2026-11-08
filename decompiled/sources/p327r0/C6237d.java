package p327r0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p050H0.C0547p;
import p155W0.C2653a;
import p171Y2.AbstractC2920c;
import p171Y2.AbstractC2922e;
import p178Z2.AbstractC2990D;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4317g;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.C4330t;
import p259j0.AbstractC5324G;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5331N;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p327r0.AbstractC6244k;

/* renamed from: r0.d */
/* loaded from: classes.dex */
public class C6237d extends DefaultHandler implements C0547p.a {

    /* renamed from: b */
    public static final Pattern f22301b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    public static final Pattern f22302c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    public static final Pattern f22303d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    public static final int[] f22304e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    public final XmlPullParserFactory f22305a;

    /* renamed from: r0.d$a */
    public static final class a {

        /* renamed from: a */
        public final C4327q f22306a;

        /* renamed from: b */
        public final AbstractC3033v f22307b;

        /* renamed from: c */
        public final AbstractC6244k f22308c;

        /* renamed from: d */
        public final String f22309d;

        /* renamed from: e */
        public final ArrayList f22310e;

        /* renamed from: f */
        public final ArrayList f22311f;

        /* renamed from: g */
        public final long f22312g;

        /* renamed from: h */
        public final List f22313h;

        /* renamed from: i */
        public final List f22314i;

        public a(C4327q c4327q, List list, AbstractC6244k abstractC6244k, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j7) {
            this.f22306a = c4327q;
            this.f22307b = AbstractC3033v.m11048p(list);
            this.f22308c = abstractC6244k;
            this.f22309d = str;
            this.f22310e = arrayList;
            this.f22311f = arrayList2;
            this.f22313h = list2;
            this.f22314i = list3;
            this.f22312g = j7;
        }
    }

    public C6237d() {
        try {
            this.f22305a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    /* renamed from: D */
    public static int m26011D(List list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6238e c6238e = (C6238e) list.get(i7);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c6238e.f22315a) && (str = c6238e.f22316b) != null) {
                Matcher matcher = f22302c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC5346o.m21867h("MpdParser", "Unable to parse CEA-608 channel number from: " + c6238e.f22316b);
            }
        }
        return -1;
    }

    /* renamed from: E */
    public static int m26012E(List list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6238e c6238e = (C6238e) list.get(i7);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c6238e.f22315a) && (str = c6238e.f22316b) != null) {
                Matcher matcher = f22303d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC5346o.m21867h("MpdParser", "Unable to parse CEA-708 service block number from: " + c6238e.f22316b);
            }
        }
        return -1;
    }

    /* renamed from: H */
    public static long m26013H(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : AbstractC5330M.m21706R0(attributeValue);
    }

    /* renamed from: I */
    public static C6238e m26014I(XmlPullParser xmlPullParser, String str) {
        String m26029r0 = m26029r0(xmlPullParser, "schemeIdUri", StringUtils.EMPTY);
        String m26029r02 = m26029r0(xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, null);
        String m26029r03 = m26029r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!AbstractC5331N.m21791d(xmlPullParser, str));
        return new C6238e(m26029r0, m26029r02, m26029r03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: J */
    public static int m26015J(XmlPullParser xmlPullParser) {
        char c7;
        String attributeValue = xmlPullParser.getAttributeValue(null, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        if (attributeValue == null) {
            return -1;
        }
        String m10515e = AbstractC2920c.m10515e(attributeValue);
        m10515e.hashCode();
        switch (m10515e.hashCode()) {
            case 1596796:
                if (m10515e.equals("4000")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 2937391:
                if (m10515e.equals("a000")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 3094034:
                if (m10515e.equals("f800")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 3094035:
                if (m10515e.equals("f801")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 3133436:
                if (m10515e.equals("fa01")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
        }
        return -1;
    }

    /* renamed from: K */
    public static int m26016K(XmlPullParser xmlPullParser) {
        int m26022U = m26022U(xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, -1);
        if (m26022U <= 0 || m26022U >= 33) {
            return -1;
        }
        return m26022U;
    }

    /* renamed from: L */
    public static int m26017L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    /* renamed from: M */
    public static long m26018M(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : AbstractC5330M.m21708S0(attributeValue);
    }

    /* renamed from: N */
    public static String m26019N(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6238e c6238e = (C6238e) list.get(i7);
            String str = c6238e.f22315a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(c6238e.f22316b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(c6238e.f22316b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: R */
    public static float m26020R(XmlPullParser xmlPullParser, String str, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f7 : Float.parseFloat(attributeValue);
    }

    /* renamed from: S */
    public static float m26021S(XmlPullParser xmlPullParser, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f7;
        }
        Matcher matcher = f22301b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f7;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    /* renamed from: U */
    public static int m26022U(XmlPullParser xmlPullParser, String str, int i7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i7 : Integer.parseInt(attributeValue);
    }

    /* renamed from: W */
    public static long m26023W(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6238e c6238e = (C6238e) list.get(i7);
            if (AbstractC2920c.m10511a("http://dashif.org/guidelines/last-segment-number", c6238e.f22315a)) {
                return Long.parseLong(c6238e.f22316b);
            }
        }
        return -1L;
    }

    /* renamed from: X */
    public static long m26024X(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : Long.parseLong(attributeValue);
    }

    /* renamed from: Z */
    public static int m26025Z(XmlPullParser xmlPullParser) {
        int m26022U = m26022U(xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, -1);
        if (m26022U < 0) {
            return -1;
        }
        int[] iArr = f22304e;
        if (m26022U < iArr.length) {
            return iArr[m26022U];
        }
        return -1;
    }

    /* renamed from: p */
    public static int m26026p(int i7, int i8) {
        if (i7 == -1) {
            return i8;
        }
        if (i8 == -1) {
            return i7;
        }
        AbstractC5332a.m21802g(i7 == i8);
        return i7;
    }

    /* renamed from: q */
    public static String m26027q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC5332a.m21802g(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    public static void m26028r(ArrayList arrayList) {
        String str;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                str = null;
                break;
            }
            C4323m.b bVar = (C4323m.b) arrayList.get(i7);
            if (AbstractC4317g.f15029c.equals(bVar.f15072b) && (str = bVar.f15073c) != null) {
                arrayList.remove(i7);
                break;
            }
            i7++;
        }
        if (str == null) {
            return;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C4323m.b bVar2 = (C4323m.b) arrayList.get(i8);
            if (AbstractC4317g.f15028b.equals(bVar2.f15072b) && bVar2.f15073c == null) {
                arrayList.set(i8, new C4323m.b(AbstractC4317g.f15029c, str, bVar2.f15074d, bVar2.f15075e));
            }
        }
    }

    /* renamed from: r0 */
    public static String m26029r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: s */
    public static void m26030s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C4323m.b bVar = (C4323m.b) arrayList.get(size);
            if (!bVar.m18175c()) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    if (((C4323m.b) arrayList.get(i7)).m18173a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i7++;
                }
            }
        }
    }

    /* renamed from: s0 */
    public static String m26031s0(XmlPullParser xmlPullParser, String str) {
        String str2 = StringUtils.EMPTY;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m26034w(xmlPullParser);
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: t */
    public static long m26032t(long j7, long j8) {
        if (j8 != -9223372036854775807L) {
            j7 = j8;
        }
        if (j7 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j7;
    }

    /* renamed from: u */
    public static String m26033u(String str, String str2) {
        if (AbstractC4336z.m18422o(str)) {
            return AbstractC4336z.m18410c(str2);
        }
        if (AbstractC4336z.m18426s(str)) {
            return AbstractC4336z.m18421n(str2);
        }
        if (AbstractC4336z.m18425r(str)) {
            return str;
        }
        if (AbstractC4336z.m18423p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String m18414g = AbstractC4336z.m18414g(str2);
        return "text/vtt".equals(m18414g) ? "application/x-mp4-vtt" : m18414g;
    }

    /* renamed from: w */
    public static void m26034w(XmlPullParser xmlPullParser) {
        if (AbstractC5331N.m21792e(xmlPullParser)) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (AbstractC5331N.m21792e(xmlPullParser)) {
                    i7++;
                } else if (AbstractC5331N.m21790c(xmlPullParser)) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: A */
    public int m26035A(XmlPullParser xmlPullParser) {
        char c7;
        String m26029r0 = m26029r0(xmlPullParser, "schemeIdUri", null);
        m26029r0.hashCode();
        int i7 = -1;
        switch (m26029r0.hashCode()) {
            case -2128649360:
                if (m26029r0.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1352850286:
                if (m26029r0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -1138141449:
                if (m26029r0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -986633423:
                if (m26029r0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -79006963:
                if (m26029r0.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 312179081:
                if (m26029r0.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 2036691300:
                if (m26029r0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c7 = 6;
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
            case 4:
                i7 = m26016K(xmlPullParser);
                break;
            case 1:
                i7 = m26022U(xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, -1);
                break;
            case 2:
            case 6:
                i7 = m26015J(xmlPullParser);
                break;
            case 3:
                i7 = m26025Z(xmlPullParser);
                break;
            case 5:
                i7 = m26017L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC5331N.m21791d(xmlPullParser, "AudioChannelConfiguration"));
        return i7;
    }

    /* renamed from: B */
    public long m26036B(XmlPullParser xmlPullParser, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j7;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: C */
    public List m26037C(XmlPullParser xmlPullParser, List list, boolean z6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z6 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String m26031s0 = m26031s0(xmlPullParser, "BaseURL");
        if (AbstractC5324G.m21663c(m26031s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = m26031s0;
            }
            return AbstractC2990D.m10790j(new C6235b(m26031s0, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6235b c6235b = (C6235b) list.get(i7);
            String m21665e = AbstractC5324G.m21665e(c6235b.f22284a, m26031s0);
            String str = attributeValue3 == null ? m21665e : attributeValue3;
            if (z6) {
                parseInt = c6235b.f22286c;
                parseInt2 = c6235b.f22287d;
                str = c6235b.f22285b;
            }
            arrayList.add(new C6235b(m21665e, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair m26038F(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p327r0.C6237d.m26038F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: G */
    public int m26039G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* renamed from: O */
    public Pair m26040O(XmlPullParser xmlPullParser, String str, String str2, long j7, long j8, ByteArrayOutputStream byteArrayOutputStream) {
        long m26024X = m26024X(xmlPullParser, "id", 0L);
        long m26024X2 = m26024X(xmlPullParser, "duration", -9223372036854775807L);
        long m26024X3 = m26024X(xmlPullParser, "presentationTime", 0L);
        long m21718X0 = AbstractC5330M.m21718X0(m26024X2, 1000L, j7);
        long m21718X02 = AbstractC5330M.m21718X0(m26024X3 - j8, 1000000L, j7);
        String m26029r0 = m26029r0(xmlPullParser, "messageData", null);
        byte[] m26041P = m26041P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(m21718X02);
        if (m26029r0 != null) {
            m26041P = AbstractC5330M.m21773s0(m26029r0);
        }
        return Pair.create(valueOf, m26051d(str, str2, m26024X, m21718X0, m26041P));
    }

    /* renamed from: P */
    public byte[] m26041P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, AbstractC2922e.f9010c.name());
        xmlPullParser.nextToken();
        while (!AbstractC5331N.m21791d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i7 = 0; i7 < xmlPullParser.getAttributeCount(); i7++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i7), xmlPullParser.getAttributeName(i7), xmlPullParser.getAttributeValue(i7));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: Q */
    public C6239f m26042Q(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        long j7;
        ArrayList arrayList;
        String m26029r0 = m26029r0(xmlPullParser, "schemeIdUri", StringUtils.EMPTY);
        String m26029r02 = m26029r0(xmlPullParser, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, StringUtils.EMPTY);
        long m26024X = m26024X(xmlPullParser, "timescale", 1L);
        long m26024X2 = m26024X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j8 = m26024X2;
                j7 = m26024X2;
                arrayList = arrayList2;
                arrayList.add(m26040O(xmlPullParser, m26029r0, m26029r02, m26024X, j8, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j7 = m26024X2;
                arrayList = arrayList2;
                m26034w(xmlPullParser);
            }
            if (AbstractC5331N.m21791d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            m26024X2 = j7;
        }
        long[] jArr = new long[arrayList.size()];
        C2653a[] c2653aArr = new C2653a[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Pair pair = (Pair) arrayList.get(i7);
            jArr[i7] = ((Long) pair.first).longValue();
            c2653aArr[i7] = (C2653a) pair.second;
        }
        return m26053e(m26029r0, m26029r02, m26024X, jArr, c2653aArr);
    }

    /* renamed from: T */
    public C6242i m26043T(XmlPullParser xmlPullParser) {
        return m26052d0(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: V */
    public C4330t m26044V(XmlPullParser xmlPullParser) {
        return new C4330t(xmlPullParser.getAttributeValue(null, "lang"), m26031s0(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01dc A[LOOP:0: B:18:0x00a0->B:26:0x01dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d5  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p327r0.C6236c m26045Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p327r0.C6237d.m26045Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):r0.c");
    }

    /* renamed from: a0 */
    public Pair m26046a0(XmlPullParser xmlPullParser, List list, long j7, long j8, long j9, long j10, boolean z6) {
        long j11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j12;
        AbstractC6244k m26068l0;
        C6237d c6237d = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long m26018M = m26018M(xmlPullParser2, "start", j7);
        long j13 = -9223372036854775807L;
        long j14 = j9 != -9223372036854775807L ? j9 + m26018M : -9223372036854775807L;
        long m26018M2 = m26018M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j15 = j8;
        boolean z7 = false;
        long j16 = -9223372036854775807L;
        AbstractC6244k abstractC6244k = null;
        C6238e c6238e = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser2, "BaseURL")) {
                if (!z7) {
                    j15 = c6237d.m26036B(xmlPullParser2, j15);
                    z7 = true;
                }
                arrayList6.addAll(c6237d.m26037C(xmlPullParser2, list, z6));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j12 = j13;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (AbstractC5331N.m21793f(xmlPullParser2, "AdaptationSet")) {
                    j11 = j15;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(m26083y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, abstractC6244k, m26018M2, j15, j16, j14, j10, z6));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j11 = j15;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (AbstractC5331N.m21793f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(m26042Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (AbstractC5331N.m21793f(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        abstractC6244k = m26064j0(xmlPullParser2, null);
                        obj = null;
                        j15 = j11;
                        j12 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (AbstractC5331N.m21793f(xmlPullParser2, "SegmentList")) {
                            long m26036B = m26036B(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            m26068l0 = m26066k0(xmlPullParser, null, j14, m26018M2, j11, m26036B, j10);
                            j16 = m26036B;
                            j15 = j11;
                            j12 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (AbstractC5331N.m21793f(xmlPullParser2, "SegmentTemplate")) {
                                long m26036B2 = m26036B(xmlPullParser2, -9223372036854775807L);
                                j12 = -9223372036854775807L;
                                m26068l0 = m26068l0(xmlPullParser, null, AbstractC3033v.m11050t(), j14, m26018M2, j11, m26036B2, j10);
                                j16 = m26036B2;
                                j15 = j11;
                            } else {
                                j12 = -9223372036854775807L;
                                if (AbstractC5331N.m21793f(xmlPullParser2, "AssetIdentifier")) {
                                    c6238e = m26014I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    m26034w(xmlPullParser);
                                }
                                j15 = j11;
                            }
                        }
                        abstractC6244k = m26068l0;
                    }
                }
                obj = null;
                j12 = -9223372036854775807L;
                j15 = j11;
            }
            if (AbstractC5331N.m21791d(xmlPullParser2, "Period")) {
                return Pair.create(m26059h(attributeValue, m26018M, arrayList2, arrayList3, c6238e), Long.valueOf(m26018M2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j13 = j12;
            c6237d = this;
        }
    }

    /* renamed from: b */
    public final long m26047b(List list, long j7, long j8, int i7, long j9) {
        int m21756l = i7 >= 0 ? i7 + 1 : (int) AbstractC5330M.m21756l(j9 - j7, j8);
        for (int i8 = 0; i8 < m21756l; i8++) {
            list.add(m26069m(j7, j8));
            j7 += j8;
        }
        return j7;
    }

    /* renamed from: b0 */
    public String[] m26048b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    /* renamed from: c */
    public C6234a m26049c(long j7, int i7, List list, List list2, List list3, List list4) {
        return new C6234a(j7, i7, list, list2, list3, list4);
    }

    /* renamed from: c0 */
    public C6241h m26050c0(XmlPullParser xmlPullParser) {
        String str = null;
        String m26029r0 = m26029r0(xmlPullParser, "moreInformationURL", null);
        String m26029r02 = m26029r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (AbstractC5331N.m21793f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (AbstractC5331N.m21793f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m26034w(xmlPullParser);
            }
            String str4 = str3;
            if (AbstractC5331N.m21791d(xmlPullParser, "ProgramInformation")) {
                return new C6241h(str, str2, str4, m26029r0, m26029r02);
            }
            str3 = str4;
        }
    }

    /* renamed from: d */
    public C2653a m26051d(String str, String str2, long j7, long j8, byte[] bArr) {
        return new C2653a(str, str2, j8, j7, bArr);
    }

    /* renamed from: d0 */
    public C6242i m26052d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j7;
        long j8;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j7 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j8 = (Long.parseLong(split[1]) - j7) + 1;
                return m26061i(attributeValue, j7, j8);
            }
        } else {
            j7 = 0;
        }
        j8 = -1;
        return m26061i(attributeValue, j7, j8);
    }

    /* renamed from: e */
    public C6239f m26053e(String str, String str2, long j7, long[] jArr, C2653a[] c2653aArr) {
        return new C6239f(str, str2, j7, jArr, c2653aArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ee A[LOOP:0: B:2:0x006a->B:11:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01ee], SYNTHETIC] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p327r0.C6237d.a m26054e0(org.xmlpull.v1.XmlPullParser r36, java.util.List r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List r46, java.util.List r47, java.util.List r48, java.util.List r49, p327r0.AbstractC6244k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p327r0.C6237d.m26054e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, r0.k, long, long, long, long, long, boolean):r0.d$a");
    }

    /* renamed from: f */
    public C4327q m26055f(String str, String str2, int i7, int i8, float f7, int i9, int i10, int i11, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String m26033u = m26033u(str2, str5);
        if ("audio/eac3".equals(m26033u)) {
            m26033u = m26019N(list4);
            if ("audio/eac3-joc".equals(m26033u)) {
                str5 = "ec+3";
            }
        }
        int m26075p0 = m26075p0(list);
        int m26062i0 = m26062i0(list) | m26056f0(list2) | m26060h0(list3) | m26060h0(list4);
        Pair m26077t0 = m26077t0(list3);
        C4327q.b m18254e0 = new C4327q.b().m18250a0(str).m18240Q(str2).m18264o0(m26033u).m18238O(str5).m18259j0(i11).m18266q0(m26075p0).m18262m0(m26062i0).m18254e0(str3);
        int i12 = -1;
        C4327q.b m18270u0 = m18254e0.m18269t0(m26077t0 != null ? ((Integer) m26077t0.first).intValue() : -1).m18270u0(m26077t0 != null ? ((Integer) m26077t0.second).intValue() : -1);
        if (AbstractC4336z.m18426s(m26033u)) {
            m18270u0.m18271v0(i7).m18248Y(i8).m18247X(f7);
        } else if (AbstractC4336z.m18422o(m26033u)) {
            m18270u0.m18237N(i9).m18265p0(i10);
        } else if (AbstractC4336z.m18425r(m26033u)) {
            if ("application/cea-608".equals(m26033u)) {
                i12 = m26011D(list2);
            } else if ("application/cea-708".equals(m26033u)) {
                i12 = m26012E(list2);
            }
            m18270u0.m18235L(i12);
        } else if (AbstractC4336z.m18423p(m26033u)) {
            m18270u0.m18271v0(i7).m18248Y(i8);
        }
        return m18270u0.m18234K();
    }

    /* renamed from: f0 */
    public int m26056f0(List list) {
        int m26078u0;
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            C6238e c6238e = (C6238e) list.get(i8);
            if (AbstractC2920c.m10511a("urn:mpeg:dash:role:2011", c6238e.f22315a)) {
                m26078u0 = m26058g0(c6238e.f22316b);
            } else if (AbstractC2920c.m10511a("urn:tva:metadata:cs:AudioPurposeCS:2007", c6238e.f22315a)) {
                m26078u0 = m26078u0(c6238e.f22316b);
            }
            i7 |= m26078u0;
        }
        return i7;
    }

    /* renamed from: g */
    public C6236c m26057g(long j7, long j8, long j9, boolean z6, long j10, long j11, long j12, long j13, C6241h c6241h, C6248o c6248o, C6245l c6245l, Uri uri, List list) {
        return new C6236c(j7, j8, j9, z6, j10, j11, j12, j13, c6241h, c6248o, c6245l, uri, list);
    }

    /* renamed from: g0 */
    public int m26058g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: h */
    public C6240g m26059h(String str, long j7, List list, List list2, C6238e c6238e) {
        return new C6240g(str, j7, list, list2, c6238e);
    }

    /* renamed from: h0 */
    public int m26060h0(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (AbstractC2920c.m10511a("http://dashif.org/guidelines/trickmode", ((C6238e) list.get(i8)).f22315a)) {
                i7 = 16384;
            }
        }
        return i7;
    }

    /* renamed from: i */
    public C6242i m26061i(String str, long j7, long j8) {
        return new C6242i(str, j7, j8);
    }

    /* renamed from: i0 */
    public int m26062i0(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            C6238e c6238e = (C6238e) list.get(i8);
            if (AbstractC2920c.m10511a("urn:mpeg:dash:role:2011", c6238e.f22315a)) {
                i7 |= m26058g0(c6238e.f22316b);
            }
        }
        return i7;
    }

    /* renamed from: j */
    public AbstractC6243j m26063j(a aVar, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C4327q.b m18193a = aVar.f22306a.m18193a();
        if (str == null || !list.isEmpty()) {
            m18193a.m18253d0(list);
        } else {
            m18193a.m18252c0(str);
        }
        String str3 = aVar.f22309d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList arrayList3 = aVar.f22310e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m26028r(arrayList3);
            m26030s(arrayList3);
            m18193a.m18244U(new C4323m(str3, arrayList3));
        }
        ArrayList arrayList4 = aVar.f22311f;
        arrayList4.addAll(arrayList2);
        return AbstractC6243j.m26090o(aVar.f22312g, m18193a.m18234K(), aVar.f22307b, aVar.f22308c, arrayList4, aVar.f22313h, aVar.f22314i, null);
    }

    /* renamed from: j0 */
    public AbstractC6244k.e m26064j0(XmlPullParser xmlPullParser, AbstractC6244k.e eVar) {
        long j7;
        long j8;
        long m26024X = m26024X(xmlPullParser, "timescale", eVar != null ? eVar.f22352b : 1L);
        long m26024X2 = m26024X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f22353c : 0L);
        long j9 = eVar != null ? eVar.f22366d : 0L;
        long j10 = eVar != null ? eVar.f22367e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j8 = Long.parseLong(split[0]);
            j7 = (Long.parseLong(split[1]) - j8) + 1;
        } else {
            j7 = j10;
            j8 = j9;
        }
        C6242i c6242i = eVar != null ? eVar.f22351a : null;
        do {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "Initialization")) {
                c6242i = m26043T(xmlPullParser);
            } else {
                m26034w(xmlPullParser);
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, "SegmentBase"));
        return m26071n(c6242i, m26024X, m26024X2, j8, j7);
    }

    /* renamed from: k */
    public AbstractC6244k.b m26065k(C6242i c6242i, long j7, long j8, long j9, long j10, List list, long j11, List list2, long j12, long j13) {
        return new AbstractC6244k.b(c6242i, j7, j8, j9, j10, list, j11, list2, AbstractC5330M.m21692K0(j12), AbstractC5330M.m21692K0(j13));
    }

    /* renamed from: k0 */
    public AbstractC6244k.b m26066k0(XmlPullParser xmlPullParser, AbstractC6244k.b bVar, long j7, long j8, long j9, long j10, long j11) {
        long m26024X = m26024X(xmlPullParser, "timescale", bVar != null ? bVar.f22352b : 1L);
        long m26024X2 = m26024X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f22353c : 0L);
        long m26024X3 = m26024X(xmlPullParser, "duration", bVar != null ? bVar.f22355e : -9223372036854775807L);
        long m26024X4 = m26024X(xmlPullParser, "startNumber", bVar != null ? bVar.f22354d : 1L);
        long m26032t = m26032t(j9, j10);
        List list = null;
        List list2 = null;
        C6242i c6242i = null;
        do {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "Initialization")) {
                c6242i = m26043T(xmlPullParser);
            } else if (AbstractC5331N.m21793f(xmlPullParser, "SegmentTimeline")) {
                list = m26070m0(xmlPullParser, m26024X, j8);
            } else if (AbstractC5331N.m21793f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(m26072n0(xmlPullParser));
            } else {
                m26034w(xmlPullParser);
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (c6242i == null) {
                c6242i = bVar.f22351a;
            }
            if (list == null) {
                list = bVar.f22356f;
            }
            if (list2 == null) {
                list2 = bVar.f22360j;
            }
        }
        return m26065k(c6242i, m26024X, m26024X2, m26024X4, m26024X3, list, m26032t, list2, j11, j7);
    }

    /* renamed from: l */
    public AbstractC6244k.c m26067l(C6242i c6242i, long j7, long j8, long j9, long j10, long j11, List list, long j12, C6247n c6247n, C6247n c6247n2, long j13, long j14) {
        return new AbstractC6244k.c(c6242i, j7, j8, j9, j10, j11, list, j12, c6247n, c6247n2, AbstractC5330M.m21692K0(j13), AbstractC5330M.m21692K0(j14));
    }

    /* renamed from: l0 */
    public AbstractC6244k.c m26068l0(XmlPullParser xmlPullParser, AbstractC6244k.c cVar, List list, long j7, long j8, long j9, long j10, long j11) {
        long m26024X = m26024X(xmlPullParser, "timescale", cVar != null ? cVar.f22352b : 1L);
        long m26024X2 = m26024X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f22353c : 0L);
        long m26024X3 = m26024X(xmlPullParser, "duration", cVar != null ? cVar.f22355e : -9223372036854775807L);
        long m26024X4 = m26024X(xmlPullParser, "startNumber", cVar != null ? cVar.f22354d : 1L);
        long m26023W = m26023W(list);
        long m26032t = m26032t(j9, j10);
        List list2 = null;
        C6247n m26080v0 = m26080v0(xmlPullParser, "media", cVar != null ? cVar.f22362k : null);
        C6247n m26080v02 = m26080v0(xmlPullParser, "initialization", cVar != null ? cVar.f22361j : null);
        C6242i c6242i = null;
        do {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "Initialization")) {
                c6242i = m26043T(xmlPullParser);
            } else if (AbstractC5331N.m21793f(xmlPullParser, "SegmentTimeline")) {
                list2 = m26070m0(xmlPullParser, m26024X, j8);
            } else {
                m26034w(xmlPullParser);
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (c6242i == null) {
                c6242i = cVar.f22351a;
            }
            if (list2 == null) {
                list2 = cVar.f22356f;
            }
        }
        return m26067l(c6242i, m26024X, m26024X2, m26024X4, m26023W, m26024X3, list2, m26032t, m26080v02, m26080v0, j11, j7);
    }

    /* renamed from: m */
    public AbstractC6244k.d m26069m(long j7, long j8) {
        return new AbstractC6244k.d(j7, j8);
    }

    /* renamed from: m0 */
    public List m26070m0(XmlPullParser xmlPullParser, long j7, long j8) {
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        long j10 = -9223372036854775807L;
        boolean z6 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "S")) {
                long m26024X = m26024X(xmlPullParser, "t", -9223372036854775807L);
                if (z6) {
                    j9 = m26047b(arrayList, j9, j10, i7, m26024X);
                }
                if (m26024X == -9223372036854775807L) {
                    m26024X = j9;
                }
                j10 = m26024X(xmlPullParser, "d", -9223372036854775807L);
                i7 = m26022U(xmlPullParser, "r", 0);
                z6 = true;
                j9 = m26024X;
            } else {
                m26034w(xmlPullParser);
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, "SegmentTimeline"));
        if (z6) {
            m26047b(arrayList, j9, j10, i7, AbstractC5330M.m21718X0(j8, j7, 1000L));
        }
        return arrayList;
    }

    /* renamed from: n */
    public AbstractC6244k.e m26071n(C6242i c6242i, long j7, long j8, long j9, long j10) {
        return new AbstractC6244k.e(c6242i, j7, j8, j9, j10);
    }

    /* renamed from: n0 */
    public C6242i m26072n0(XmlPullParser xmlPullParser) {
        return m26052d0(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: o */
    public C6248o m26073o(String str, String str2) {
        return new C6248o(str, str2);
    }

    /* renamed from: o0 */
    public int m26074o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* renamed from: p0 */
    public int m26075p0(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            C6238e c6238e = (C6238e) list.get(i8);
            if (AbstractC2920c.m10511a("urn:mpeg:dash:role:2011", c6238e.f22315a)) {
                i7 |= m26074o0(c6238e.f22316b);
            }
        }
        return i7;
    }

    /* renamed from: q0 */
    public C6245l m26076q0(XmlPullParser xmlPullParser) {
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        float f7 = -3.4028235E38f;
        float f8 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, "Latency")) {
                j7 = m26024X(xmlPullParser, "target", -9223372036854775807L);
                j8 = m26024X(xmlPullParser, "min", -9223372036854775807L);
                j9 = m26024X(xmlPullParser, "max", -9223372036854775807L);
            } else if (AbstractC5331N.m21793f(xmlPullParser, "PlaybackRate")) {
                f7 = m26020R(xmlPullParser, "min", -3.4028235E38f);
                f8 = m26020R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j10 = j7;
            long j11 = j8;
            long j12 = j9;
            float f9 = f7;
            float f10 = f8;
            if (AbstractC5331N.m21791d(xmlPullParser, "ServiceDescription")) {
                return new C6245l(j10, j11, j12, f9, f10);
            }
            j7 = j10;
            j8 = j11;
            j9 = j12;
            f7 = f9;
            f8 = f10;
        }
    }

    /* renamed from: t0 */
    public Pair m26077t0(List list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6238e c6238e = (C6238e) list.get(i7);
            if ((AbstractC2920c.m10511a("http://dashif.org/thumbnail_tile", c6238e.f22315a) || AbstractC2920c.m10511a("http://dashif.org/guidelines/thumbnail_tile", c6238e.f22315a)) && (str = c6238e.f22316b) != null) {
                String[] m21737e1 = AbstractC5330M.m21737e1(str, "x");
                if (m21737e1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(m21737e1[0])), Integer.valueOf(Integer.parseInt(m21737e1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: u0 */
    public int m26078u0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: v */
    public final boolean m26079v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    public C6247n m26080v0(XmlPullParser xmlPullParser, String str, C6247n c6247n) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? C6247n.m26108b(attributeValue) : c6247n;
    }

    /* renamed from: w0 */
    public C6248o m26081w0(XmlPullParser xmlPullParser) {
        return m26073o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
    }

    @Override // p050H0.C0547p.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C6236c mo175a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f22305a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m26045Y(newPullParser, uri);
            }
            throw C4295A.m17945c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw C4295A.m17945c(null, e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0352 A[LOOP:0: B:2:0x007f->B:10:0x0352, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0310 A[EDGE_INSN: B:11:0x0310->B:12:0x0310 BREAK  A[LOOP:0: B:2:0x007f->B:10:0x0352], SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p327r0.C6234a m26083y(org.xmlpull.v1.XmlPullParser r57, java.util.List r58, p327r0.AbstractC6244k r59, long r60, long r62, long r64, long r66, long r68, boolean r70) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p327r0.C6237d.m26083y(org.xmlpull.v1.XmlPullParser, java.util.List, r0.k, long, long, long, long, long, boolean):r0.a");
    }

    /* renamed from: z */
    public void m26084z(XmlPullParser xmlPullParser) {
        m26034w(xmlPullParser);
    }
}
