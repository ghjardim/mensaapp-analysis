package p023D1;

import android.os.Trace;

/* renamed from: D1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0183c {
    /* renamed from: a */
    public static void m739a(String str, int i7) {
        Trace.beginAsyncSection(str, i7);
    }

    /* renamed from: b */
    public static void m740b(String str, int i7) {
        Trace.endAsyncSection(str, i7);
    }

    /* renamed from: c */
    public static boolean m741c() {
        return Trace.isEnabled();
    }
}
