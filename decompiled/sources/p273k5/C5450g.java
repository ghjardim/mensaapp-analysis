package p273k5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: k5.g */
/* loaded from: classes2.dex */
public class C5450g {

    /* renamed from: a */
    public final Class f19647a;

    /* renamed from: b */
    public final String f19648b;

    /* renamed from: c */
    public final Class[] f19649c;

    public C5450g(Class cls, String str, Class... clsArr) {
        this.f19647a = cls;
        this.f19648b = str;
        this.f19649c = clsArr;
    }

    /* renamed from: b */
    public static Method m22974b(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m22974b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final Method m22975a(Class cls) {
        Class cls2;
        String str = this.f19648b;
        if (str == null) {
            return null;
        }
        Method m22974b = m22974b(cls, str, this.f19649c);
        if (m22974b == null || (cls2 = this.f19647a) == null || cls2.isAssignableFrom(m22974b.getReturnType())) {
            return m22974b;
        }
        return null;
    }

    /* renamed from: c */
    public Object m22976c(Object obj, Object... objArr) {
        Method m22975a = m22975a(obj.getClass());
        if (m22975a == null) {
            throw new AssertionError("Method " + this.f19648b + " not supported for object " + obj);
        }
        try {
            return m22975a.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m22975a);
            assertionError.initCause(e7);
            throw assertionError;
        }
    }

    /* renamed from: d */
    public Object m22977d(Object obj, Object... objArr) {
        Method m22975a = m22975a(obj.getClass());
        if (m22975a == null) {
            return null;
        }
        try {
            return m22975a.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object m22978e(Object obj, Object... objArr) {
        try {
            return m22977d(obj, objArr);
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object m22979f(Object obj, Object... objArr) {
        try {
            return m22976c(obj, objArr);
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean m22980g(Object obj) {
        return m22975a(obj.getClass()) != null;
    }
}
