package p221e5;

import p023D1.AbstractC0181a;

/* renamed from: e5.f */
/* loaded from: classes2.dex */
public final class C4203f implements AutoCloseable {
    public C4203f(String str) {
        m17616a(str);
    }

    /* renamed from: a */
    public static void m17616a(String str) {
        AbstractC0181a.m729c(m17618d(str));
    }

    /* renamed from: c */
    public static void m17617c(String str, int i7) {
        AbstractC0181a.m727a(m17618d(str), i7);
    }

    /* renamed from: d */
    public static String m17618d(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    /* renamed from: g */
    public static void m17619g() {
        AbstractC0181a.m732f();
    }

    /* renamed from: h */
    public static void m17620h(String str, int i7) {
        AbstractC0181a.m730d(m17618d(str), i7);
    }

    /* renamed from: j */
    public static C4203f m17621j(String str) {
        return new C4203f(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m17619g();
    }
}
