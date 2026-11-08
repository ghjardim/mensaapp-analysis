package p253i5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: i5.B0 */
/* loaded from: classes2.dex */
public final class C4548B0 implements InterfaceC4605f0 {

    /* renamed from: b */
    public static final Logger f16292b = Logger.getLogger(C4548B0.class.getName());

    /* renamed from: c */
    public static final Constructor f16293c;

    /* renamed from: d */
    public static final Method f16294d;

    /* renamed from: e */
    public static final Method f16295e;

    /* renamed from: f */
    public static final RuntimeException f16296f;

    /* renamed from: g */
    public static final Object[] f16297g;

    /* renamed from: a */
    public final Object f16298a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", null);
            } catch (Throwable th) {
                th = th;
                method2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
            method2 = null;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i7];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i7++;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            f16292b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            if (th == null) {
            }
            f16293c = null;
            f16294d = null;
            f16295e = null;
            f16296f = new RuntimeException(th);
            f16297g = new Object[]{1L};
        }
        if (th == null || constructor == null) {
            f16293c = null;
            f16294d = null;
            f16295e = null;
            f16296f = new RuntimeException(th);
        } else {
            f16293c = constructor;
            f16294d = method;
            f16295e = method2;
            f16296f = null;
        }
        f16297g = new Object[]{1L};
    }

    public C4548B0() {
        RuntimeException runtimeException = f16296f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f16298a = f16293c.newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* renamed from: b */
    public static boolean m19363b() {
        return f16296f == null;
    }

    @Override // p253i5.InterfaceC4605f0
    /* renamed from: a */
    public void mo19364a(long j7) {
        try {
            f16294d.invoke(this.f16298a, j7 == 1 ? f16297g : new Object[]{Long.valueOf(j7)});
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
