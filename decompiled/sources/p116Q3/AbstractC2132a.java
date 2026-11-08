package p116Q3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Q3.a */
/* loaded from: classes.dex */
public abstract class AbstractC2132a {
    /* renamed from: a */
    public static Object m7212a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* renamed from: b */
    public static AssertionError m7213b(String str, Throwable th) {
        AssertionError assertionError = new AssertionError(str);
        assertionError.initCause(th);
        return assertionError;
    }
}
