package p134T0;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p134T0.C2430c;
import p178Z2.AbstractC3033v;
import p232g0.C4295A;
import p259j0.AbstractC5331N;
import p259j0.AbstractC5346o;

/* renamed from: T0.f */
/* loaded from: classes.dex */
public abstract class AbstractC2433f {

    /* renamed from: a */
    public static final String[] f7205a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f7206b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f7207c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C2430c m8281a(String str) {
        try {
            return m8282b(str);
        } catch (C4295A | NumberFormatException | XmlPullParserException unused) {
            AbstractC5346o.m21867h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    public static C2430c m8282b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!AbstractC5331N.m21793f(newPullParser, "x:xmpmeta")) {
            throw C4295A.m17943a("Couldn't find xmp metadata", null);
        }
        AbstractC3033v m11050t = AbstractC3033v.m11050t();
        long j7 = -9223372036854775807L;
        do {
            newPullParser.next();
            if (AbstractC5331N.m21793f(newPullParser, "rdf:Description")) {
                if (!m8284d(newPullParser)) {
                    return null;
                }
                j7 = m8285e(newPullParser);
                m11050t = m8283c(newPullParser);
            } else if (AbstractC5331N.m21793f(newPullParser, "Container:Directory")) {
                m11050t = m8286f(newPullParser, "Container", "Item");
            } else if (AbstractC5331N.m21793f(newPullParser, "GContainer:Directory")) {
                m11050t = m8286f(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC5331N.m21791d(newPullParser, "x:xmpmeta"));
        if (m11050t.isEmpty()) {
            return null;
        }
        return new C2430c(j7, m11050t);
    }

    /* renamed from: c */
    public static AbstractC3033v m8283c(XmlPullParser xmlPullParser) {
        for (String str : f7207c) {
            String m21788a = AbstractC5331N.m21788a(xmlPullParser, str);
            if (m21788a != null) {
                return AbstractC3033v.m11052w(new C2430c.a("image/jpeg", "Primary", 0L, 0L), new C2430c.a("video/mp4", "MotionPhoto", Long.parseLong(m21788a), 0L));
            }
        }
        return AbstractC3033v.m11050t();
    }

    /* renamed from: d */
    public static boolean m8284d(XmlPullParser xmlPullParser) {
        for (String str : f7205a) {
            String m21788a = AbstractC5331N.m21788a(xmlPullParser, str);
            if (m21788a != null) {
                return Integer.parseInt(m21788a) == 1;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static long m8285e(XmlPullParser xmlPullParser) {
        for (String str : f7206b) {
            String m21788a = AbstractC5331N.m21788a(xmlPullParser, str);
            if (m21788a != null) {
                long parseLong = Long.parseLong(m21788a);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public static AbstractC3033v m8286f(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (AbstractC5331N.m21793f(xmlPullParser, str3)) {
                String m21788a = AbstractC5331N.m21788a(xmlPullParser, str2 + ":Mime");
                String m21788a2 = AbstractC5331N.m21788a(xmlPullParser, str2 + ":Semantic");
                String m21788a3 = AbstractC5331N.m21788a(xmlPullParser, str2 + ":Length");
                String m21788a4 = AbstractC5331N.m21788a(xmlPullParser, str2 + ":Padding");
                if (m21788a == null || m21788a2 == null) {
                    return AbstractC3033v.m11050t();
                }
                m11045m.mo11040a(new C2430c.a(m21788a, m21788a2, m21788a3 != null ? Long.parseLong(m21788a3) : 0L, m21788a4 != null ? Long.parseLong(m21788a4) : 0L));
            }
        } while (!AbstractC5331N.m21791d(xmlPullParser, str4));
        return m11045m.m11063k();
    }
}
