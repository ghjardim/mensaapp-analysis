package p015C0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p015C0.C0070a;
import p050H0.C0547p;
import p078L0.AbstractC0866a;
import p225f1.AbstractC4240o;
import p225f1.C4245t;
import p232g0.C4295A;
import p232g0.C4323m;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5335d;

/* renamed from: C0.b */
/* loaded from: classes.dex */
public class C0071b implements C0547p.a {

    /* renamed from: a */
    public final XmlPullParserFactory f242a;

    /* renamed from: C0.b$b */
    public static class b extends C4295A {
        public b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* renamed from: C0.b$c */
    public static class c extends a {

        /* renamed from: e */
        public boolean f247e;

        /* renamed from: f */
        public UUID f248f;

        /* renamed from: g */
        public byte[] f249g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: q */
        public static C4245t[] m193q(byte[] bArr) {
            return new C4245t[]{new C4245t(true, null, 8, m194r(bArr), 0, 0, null)};
        }

        /* renamed from: r */
        public static byte[] m194r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                sb.append((char) bArr[i7]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            m196t(decode, 0, 3);
            m196t(decode, 1, 2);
            m196t(decode, 4, 5);
            m196t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        public static String m195s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* renamed from: t */
        public static void m196t(byte[] bArr, int i7, int i8) {
            byte b7 = bArr[i7];
            bArr[i7] = bArr[i8];
            bArr[i8] = b7;
        }

        @Override // p015C0.C0071b.a
        /* renamed from: b */
        public Object mo178b() {
            UUID uuid = this.f248f;
            return new C0070a.a(uuid, AbstractC4240o.m17805a(uuid, this.f249g), m193q(this.f249g));
        }

        @Override // p015C0.C0071b.a
        /* renamed from: d */
        public boolean mo180d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p015C0.C0071b.a
        /* renamed from: h */
        public void mo184h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f247e = false;
            }
        }

        @Override // p015C0.C0071b.a
        /* renamed from: n */
        public void mo190n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f247e = true;
                this.f248f = UUID.fromString(m195s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p015C0.C0071b.a
        /* renamed from: o */
        public void mo191o(XmlPullParser xmlPullParser) {
            if (this.f247e) {
                this.f249g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: C0.b$d */
    public static class d extends a {

        /* renamed from: e */
        public C4327q f250e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: q */
        public static List m197q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] m21703Q = AbstractC5330M.m21703Q(str);
                byte[][] m21817j = AbstractC5335d.m21817j(m21703Q);
                if (m21817j == null) {
                    arrayList.add(m21703Q);
                } else {
                    Collections.addAll(arrayList, m21817j);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        public static String m198r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // p015C0.C0071b.a
        /* renamed from: b */
        public Object mo178b() {
            return this.f250e;
        }

        @Override // p015C0.C0071b.a
        /* renamed from: n */
        public void mo190n(XmlPullParser xmlPullParser) {
            int i7;
            C4327q.b bVar = new C4327q.b();
            String m198r = m198r(m189m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) m179c("Type")).intValue();
            if (intValue == 2) {
                bVar.m18240Q("video/mp4").m18271v0(m187k(xmlPullParser, "MaxWidth")).m18248Y(m187k(xmlPullParser, "MaxHeight")).m18251b0(m197q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (m198r == null) {
                    m198r = "audio/mp4a-latm";
                }
                int m187k = m187k(xmlPullParser, "Channels");
                int m187k2 = m187k(xmlPullParser, "SamplingRate");
                List m197q = m197q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (m197q.isEmpty() && "audio/mp4a-latm".equals(m198r)) {
                    m197q = Collections.singletonList(AbstractC0866a.m3582a(m187k2, m187k));
                }
                bVar.m18240Q("audio/mp4").m18237N(m187k).m18265p0(m187k2).m18251b0(m197q);
            } else if (intValue == 3) {
                String str = (String) m179c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i7 = 64;
                    } else if (str.equals("DESC")) {
                        i7 = 1024;
                    }
                    bVar.m18240Q("application/mp4").m18262m0(i7);
                }
                i7 = 0;
                bVar.m18240Q("application/mp4").m18262m0(i7);
            } else {
                bVar.m18240Q("application/mp4");
            }
            this.f250e = bVar.m18250a0(xmlPullParser.getAttributeValue(null, "Index")).m18252c0((String) m179c("Name")).m18264o0(m198r).m18236M(m187k(xmlPullParser, "Bitrate")).m18254e0((String) m179c("Language")).m18234K();
        }
    }

    /* renamed from: C0.b$e */
    public static class e extends a {

        /* renamed from: e */
        public final List f251e;

        /* renamed from: f */
        public int f252f;

        /* renamed from: g */
        public int f253g;

        /* renamed from: h */
        public long f254h;

        /* renamed from: i */
        public long f255i;

        /* renamed from: j */
        public long f256j;

        /* renamed from: k */
        public int f257k;

        /* renamed from: l */
        public boolean f258l;

        /* renamed from: m */
        public C0070a.a f259m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f257k = -1;
            this.f259m = null;
            this.f251e = new LinkedList();
        }

        @Override // p015C0.C0071b.a
        /* renamed from: a */
        public void mo177a(Object obj) {
            if (obj instanceof C0070a.b) {
                this.f251e.add((C0070a.b) obj);
            } else if (obj instanceof C0070a.a) {
                AbstractC5332a.m21802g(this.f259m == null);
                this.f259m = (C0070a.a) obj;
            }
        }

        @Override // p015C0.C0071b.a
        /* renamed from: b */
        public Object mo178b() {
            int size = this.f251e.size();
            C0070a.b[] bVarArr = new C0070a.b[size];
            this.f251e.toArray(bVarArr);
            if (this.f259m != null) {
                C0070a.a aVar = this.f259m;
                C4323m c4323m = new C4323m(new C4323m.b(aVar.f223a, "video/mp4", aVar.f224b));
                for (int i7 = 0; i7 < size; i7++) {
                    C0070a.b bVar = bVarArr[i7];
                    int i8 = bVar.f226a;
                    if (i8 == 2 || i8 == 1) {
                        C4327q[] c4327qArr = bVar.f235j;
                        for (int i9 = 0; i9 < c4327qArr.length; i9++) {
                            c4327qArr[i9] = c4327qArr[i9].m18193a().m18244U(c4323m).m18234K();
                        }
                    }
                }
            }
            return new C0070a(this.f252f, this.f253g, this.f254h, this.f255i, this.f256j, this.f257k, this.f258l, this.f259m, bVarArr);
        }

        @Override // p015C0.C0071b.a
        /* renamed from: n */
        public void mo190n(XmlPullParser xmlPullParser) {
            this.f252f = m187k(xmlPullParser, "MajorVersion");
            this.f253g = m187k(xmlPullParser, "MinorVersion");
            this.f254h = m186j(xmlPullParser, "TimeScale", 10000000L);
            this.f255i = m188l(xmlPullParser, "Duration");
            this.f256j = m186j(xmlPullParser, "DVRWindowLength", 0L);
            this.f257k = m185i(xmlPullParser, "LookaheadCount", -1);
            this.f258l = m183g(xmlPullParser, "IsLive", false);
            m192p("TimeScale", Long.valueOf(this.f254h));
        }
    }

    /* renamed from: C0.b$f */
    public static class f extends a {

        /* renamed from: e */
        public final String f260e;

        /* renamed from: f */
        public final List f261f;

        /* renamed from: g */
        public int f262g;

        /* renamed from: h */
        public String f263h;

        /* renamed from: i */
        public long f264i;

        /* renamed from: j */
        public String f265j;

        /* renamed from: k */
        public String f266k;

        /* renamed from: l */
        public int f267l;

        /* renamed from: m */
        public int f268m;

        /* renamed from: n */
        public int f269n;

        /* renamed from: o */
        public int f270o;

        /* renamed from: p */
        public String f271p;

        /* renamed from: q */
        public ArrayList f272q;

        /* renamed from: r */
        public long f273r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f260e = str;
            this.f261f = new LinkedList();
        }

        @Override // p015C0.C0071b.a
        /* renamed from: a */
        public void mo177a(Object obj) {
            if (obj instanceof C4327q) {
                this.f261f.add((C4327q) obj);
            }
        }

        @Override // p015C0.C0071b.a
        /* renamed from: b */
        public Object mo178b() {
            C4327q[] c4327qArr = new C4327q[this.f261f.size()];
            this.f261f.toArray(c4327qArr);
            return new C0070a.b(this.f260e, this.f266k, this.f262g, this.f263h, this.f264i, this.f265j, this.f267l, this.f268m, this.f269n, this.f270o, this.f271p, c4327qArr, this.f272q, this.f273r);
        }

        @Override // p015C0.C0071b.a
        /* renamed from: d */
        public boolean mo180d(String str) {
            return "c".equals(str);
        }

        @Override // p015C0.C0071b.a
        /* renamed from: n */
        public void mo190n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m200r(xmlPullParser);
            } else {
                m199q(xmlPullParser);
            }
        }

        /* renamed from: q */
        public final void m199q(XmlPullParser xmlPullParser) {
            int m201s = m201s(xmlPullParser);
            this.f262g = m201s;
            m192p("Type", Integer.valueOf(m201s));
            if (this.f262g == 3) {
                this.f263h = m189m(xmlPullParser, "Subtype");
            } else {
                this.f263h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m192p("Subtype", this.f263h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f265j = attributeValue;
            m192p("Name", attributeValue);
            this.f266k = m189m(xmlPullParser, "Url");
            this.f267l = m185i(xmlPullParser, "MaxWidth", -1);
            this.f268m = m185i(xmlPullParser, "MaxHeight", -1);
            this.f269n = m185i(xmlPullParser, "DisplayWidth", -1);
            this.f270o = m185i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f271p = attributeValue2;
            m192p("Language", attributeValue2);
            long m185i = m185i(xmlPullParser, "TimeScale", -1);
            this.f264i = m185i;
            if (m185i == -1) {
                this.f264i = ((Long) m179c("TimeScale")).longValue();
            }
            this.f272q = new ArrayList();
        }

        /* renamed from: r */
        public final void m200r(XmlPullParser xmlPullParser) {
            int size = this.f272q.size();
            long m186j = m186j(xmlPullParser, "t", -9223372036854775807L);
            int i7 = 1;
            if (m186j == -9223372036854775807L) {
                if (size == 0) {
                    m186j = 0;
                } else {
                    if (this.f273r == -1) {
                        throw C4295A.m17945c("Unable to infer start time", null);
                    }
                    m186j = this.f273r + ((Long) this.f272q.get(size - 1)).longValue();
                }
            }
            this.f272q.add(Long.valueOf(m186j));
            this.f273r = m186j(xmlPullParser, "d", -9223372036854775807L);
            long m186j2 = m186j(xmlPullParser, "r", 1L);
            if (m186j2 > 1 && this.f273r == -9223372036854775807L) {
                throw C4295A.m17945c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j7 = i7;
                if (j7 >= m186j2) {
                    return;
                }
                this.f272q.add(Long.valueOf((this.f273r * j7) + m186j));
                i7++;
            }
        }

        /* renamed from: s */
        public final int m201s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw C4295A.m17945c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public C0071b() {
        try {
            this.f242a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    @Override // p050H0.C0547p.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0070a mo175a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f242a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C0070a) new e(null, uri.toString()).m182f(newPullParser);
        } catch (XmlPullParserException e7) {
            throw C4295A.m17945c(null, e7);
        }
    }

    /* renamed from: C0.b$a */
    public static abstract class a {

        /* renamed from: a */
        public final String f243a;

        /* renamed from: b */
        public final String f244b;

        /* renamed from: c */
        public final a f245c;

        /* renamed from: d */
        public final List f246d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f245c = aVar;
            this.f243a = str;
            this.f244b = str2;
        }

        /* renamed from: b */
        public abstract Object mo178b();

        /* renamed from: c */
        public final Object m179c(String str) {
            for (int i7 = 0; i7 < this.f246d.size(); i7++) {
                Pair pair = (Pair) this.f246d.get(i7);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f245c;
            if (aVar == null) {
                return null;
            }
            return aVar.m179c(str);
        }

        /* renamed from: d */
        public boolean mo180d(String str) {
            return false;
        }

        /* renamed from: e */
        public final a m181e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        /* renamed from: f */
        public final Object m182f(XmlPullParser xmlPullParser) {
            boolean z6 = false;
            int i7 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f244b.equals(name)) {
                        mo190n(xmlPullParser);
                        z6 = true;
                    } else if (z6) {
                        if (i7 > 0) {
                            i7++;
                        } else if (mo180d(name)) {
                            mo190n(xmlPullParser);
                        } else {
                            a m181e = m181e(this, name, this.f243a);
                            if (m181e == null) {
                                i7 = 1;
                            } else {
                                mo177a(m181e.m182f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z6 && i7 == 0) {
                        mo191o(xmlPullParser);
                    }
                } else if (!z6) {
                    continue;
                } else if (i7 > 0) {
                    i7--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo184h(xmlPullParser);
                    if (!mo180d(name2)) {
                        return mo178b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: g */
        public final boolean m183g(XmlPullParser xmlPullParser, String str, boolean z6) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z6;
        }

        /* renamed from: i */
        public final int m185i(XmlPullParser xmlPullParser, String str, int i7) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i7;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e7) {
                throw C4295A.m17945c(null, e7);
            }
        }

        /* renamed from: j */
        public final long m186j(XmlPullParser xmlPullParser, String str, long j7) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j7;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e7) {
                throw C4295A.m17945c(null, e7);
            }
        }

        /* renamed from: k */
        public final int m187k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e7) {
                throw C4295A.m17945c(null, e7);
            }
        }

        /* renamed from: l */
        public final long m188l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e7) {
                throw C4295A.m17945c(null, e7);
            }
        }

        /* renamed from: m */
        public final String m189m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        /* renamed from: n */
        public abstract void mo190n(XmlPullParser xmlPullParser);

        /* renamed from: p */
        public final void m192p(String str, Object obj) {
            this.f246d.add(Pair.create(str, obj));
        }

        /* renamed from: a */
        public void mo177a(Object obj) {
        }

        /* renamed from: h */
        public void mo184h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: o */
        public void mo191o(XmlPullParser xmlPullParser) {
        }
    }
}
