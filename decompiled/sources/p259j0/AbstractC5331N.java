package p259j0;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: j0.N */
/* loaded from: classes.dex */
public abstract class AbstractC5331N {
    /* renamed from: a */
    public static String m21788a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m21789b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (m21795h(xmlPullParser.getAttributeName(i7)).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m21790c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m21791d(XmlPullParser xmlPullParser, String str) {
        return m21790c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m21792e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m21793f(XmlPullParser xmlPullParser, String str) {
        return m21792e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m21794g(XmlPullParser xmlPullParser, String str) {
        return m21792e(xmlPullParser) && m21795h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    public static String m21795h(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
