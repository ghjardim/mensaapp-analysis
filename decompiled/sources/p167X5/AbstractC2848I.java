package p167X5;

/* renamed from: X5.I */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2848I {

    /* renamed from: a */
    public static final int f8811a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m10270a() {
        return f8811a;
    }

    /* renamed from: b */
    public static final String m10271b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
