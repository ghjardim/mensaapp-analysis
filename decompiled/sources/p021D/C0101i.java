package p021D;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: D.i */
/* loaded from: classes.dex */
public final class C0101i {

    /* renamed from: b */
    public static final C0101i f333b = m262a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC0103k f334a;

    /* renamed from: D.i$a */
    public static class a {

        /* renamed from: a */
        public static final Locale[] f335a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        public static Locale m270a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: D.i$b */
    public static class b {
        /* renamed from: a */
        public static LocaleList m271a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public C0101i(InterfaceC0103k interfaceC0103k) {
        this.f334a = interfaceC0103k;
    }

    /* renamed from: a */
    public static C0101i m262a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m266h(b.m271a(localeArr)) : new C0101i(new C0102j(localeArr));
    }

    /* renamed from: b */
    public static Locale m263b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: c */
    public static C0101i m264c(String str) {
        if (str == null || str.isEmpty()) {
            return m265e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            localeArr[i7] = a.m270a(split[i7]);
        }
        return m262a(localeArr);
    }

    /* renamed from: e */
    public static C0101i m265e() {
        return f333b;
    }

    /* renamed from: h */
    public static C0101i m266h(LocaleList localeList) {
        return new C0101i(new C0110r(localeList));
    }

    /* renamed from: d */
    public Locale m267d(int i7) {
        return this.f334a.get(i7);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0101i) && this.f334a.equals(((C0101i) obj).f334a);
    }

    /* renamed from: f */
    public boolean m268f() {
        return this.f334a.isEmpty();
    }

    /* renamed from: g */
    public Object m269g() {
        return this.f334a.mo273a();
    }

    public int hashCode() {
        return this.f334a.hashCode();
    }

    public String toString() {
        return this.f334a.toString();
    }
}
