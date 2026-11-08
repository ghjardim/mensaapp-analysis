package p013B5;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: B5.g */
/* loaded from: classes2.dex */
public abstract class AbstractC0063g {
    /* renamed from: a */
    public static final void m158a(int i7, int i8) {
        if (i8 <= i7) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i7 + ", got " + i8 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    public static final InterfaceC0062f m159b(AbstractC0057a abstractC0057a) {
        return (InterfaceC0062f) abstractC0057a.getClass().getAnnotation(InterfaceC0062f.class);
    }

    /* renamed from: c */
    public static final int m160c(AbstractC0057a abstractC0057a) {
        try {
            Field declaredField = abstractC0057a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC0057a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m161d(AbstractC0057a abstractC0057a) {
        String str;
        AbstractC5469l.m23028e(abstractC0057a, "<this>");
        InterfaceC0062f m159b = m159b(abstractC0057a);
        if (m159b == null) {
            return null;
        }
        m158a(1, m159b.m157v());
        int m160c = m160c(abstractC0057a);
        int i7 = m160c < 0 ? -1 : m159b.m155l()[m160c];
        String m166b = C0065i.f208a.m166b(abstractC0057a);
        if (m166b == null) {
            str = m159b.m153c();
        } else {
            str = m166b + '/' + m159b.m153c();
        }
        return new StackTraceElement(str, m159b.m156m(), m159b.m154f(), i7);
    }
}
