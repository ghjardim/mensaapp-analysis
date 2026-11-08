package p167X5;

import p013B5.AbstractC0057a;
import p182a.C3094a;
import p371w5.AbstractC6928k;
import p371w5.C6927j;

/* renamed from: X5.F */
/* loaded from: classes2.dex */
public abstract class AbstractC2845F {

    /* renamed from: a */
    public static final StackTraceElement f8807a = new C3094a().m11309a();

    /* renamed from: b */
    public static final String f8808b;

    /* renamed from: c */
    public static final String f8809c;

    static {
        Object m28373b;
        Object m28373b2;
        try {
            C6927j.a aVar = C6927j.f24803b;
            m28373b = C6927j.m28373b(AbstractC0057a.class.getCanonicalName());
        } catch (Throwable th) {
            C6927j.a aVar2 = C6927j.f24803b;
            m28373b = C6927j.m28373b(AbstractC6928k.m28381a(th));
        }
        if (C6927j.m28375d(m28373b) != null) {
            m28373b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f8808b = (String) m28373b;
        try {
            m28373b2 = C6927j.m28373b(AbstractC2845F.class.getCanonicalName());
        } catch (Throwable th2) {
            C6927j.a aVar3 = C6927j.f24803b;
            m28373b2 = C6927j.m28373b(AbstractC6928k.m28381a(th2));
        }
        if (C6927j.m28375d(m28373b2) != null) {
            m28373b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f8809c = (String) m28373b2;
    }

    /* renamed from: a */
    public static final Throwable m10261a(Throwable th) {
        return th;
    }
}
