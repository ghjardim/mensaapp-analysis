package p012B4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: B4.a */
/* loaded from: classes.dex */
public abstract class AbstractC0050a {

    /* renamed from: a */
    public static final String f172a = C0055f.class.getName() + ".aot-shared-library-name";

    /* renamed from: b */
    public static final String f173b = C0055f.class.getName() + ".vm-snapshot-data";

    /* renamed from: c */
    public static final String f174c = C0055f.class.getName() + ".isolate-snapshot-data";

    /* renamed from: d */
    public static final String f175d = C0055f.class.getName() + ".flutter-assets-dir";

    /* renamed from: a */
    public static ApplicationInfo m117a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: b */
    public static boolean m118b(Bundle bundle, String str, boolean z6) {
        return bundle == null ? z6 : bundle.getBoolean(str, z6);
    }

    /* renamed from: c */
    public static String m119c(ApplicationInfo applicationInfo, Context context) {
        int i7;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i7 = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i7);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (xml.getName().equals("domain-config")) {
                        m123g(xml, jSONArray, false);
                    }
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m120d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    /* renamed from: e */
    public static C0051b m121e(Context context) {
        ApplicationInfo m117a = m117a(context);
        return new C0051b(m120d(m117a.metaData, f172a), m120d(m117a.metaData, f173b), m120d(m117a.metaData, f174c), m120d(m117a.metaData, f175d), m119c(m117a, context), m117a.nativeLibraryDir, m118b(m117a.metaData, "io.flutter.automatically-register-plugins", true));
    }

    /* renamed from: f */
    public static void m122f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z6) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        String trim = xmlResourceParser.getText().trim();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(trim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z6);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new IllegalStateException("Expected end of domain tag");
        }
    }

    /* renamed from: g */
    public static void m123g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z6) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z6);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    m122f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m123g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    m124h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m124h(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            } else {
                eventType = xmlResourceParser.next();
            }
        }
    }
}
