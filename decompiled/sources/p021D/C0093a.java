package p021D;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: D.a */
/* loaded from: classes.dex */
public final class C0093a {

    /* renamed from: a */
    public static final C0093a f320a = new C0093a();

    /* renamed from: b */
    public static final int f321b;

    /* renamed from: c */
    public static final int f322c;

    /* renamed from: d */
    public static final int f323d;

    /* renamed from: e */
    public static final int f324e;

    /* renamed from: D.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f325a = new a();

        /* renamed from: a */
        public final int m247a(int i7) {
            return SdkExtensions.getExtensionVersion(i7);
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f321b = i7 >= 30 ? a.f325a.m247a(30) : 0;
        f322c = i7 >= 30 ? a.f325a.m247a(31) : 0;
        f323d = i7 >= 30 ? a.f325a.m247a(33) : 0;
        f324e = i7 >= 30 ? a.f325a.m247a(1000000) : 0;
    }

    /* renamed from: a */
    public static final boolean m245a(String codename, String buildCodename) {
        AbstractC5469l.m23028e(codename, "codename");
        AbstractC5469l.m23028e(buildCodename, "buildCodename");
        if (AbstractC5469l.m23024a("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        AbstractC5469l.m23027d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        AbstractC5469l.m23027d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    /* renamed from: b */
    public static final boolean m246b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 35) {
            if (i7 >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC5469l.m23027d(CODENAME, "CODENAME");
                if (m245a("VanillaIceCream", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
