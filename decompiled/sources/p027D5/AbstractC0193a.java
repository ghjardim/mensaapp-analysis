package p027D5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5469l;
import p090M5.AbstractC1238c;
import p090M5.C1237b;
import p378x5.AbstractC7020k;

/* renamed from: D5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0193a {

    /* renamed from: D5.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f785a = new a();

        /* renamed from: b */
        public static final Method f786b;

        /* renamed from: c */
        public static final Method f787c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC5469l.m23025b(methods);
            int length = methods.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                method = null;
                if (i8 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i8];
                if (AbstractC5469l.m23024a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC5469l.m23027d(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC5469l.m23024a(AbstractC7020k.m28824T(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i8++;
            }
            f786b = method2;
            int length2 = methods.length;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                Method method3 = methods[i7];
                if (AbstractC5469l.m23024a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i7++;
            }
            f787c = method;
        }
    }

    /* renamed from: a */
    public void mo791a(Throwable cause, Throwable exception) {
        AbstractC5469l.m23028e(cause, "cause");
        AbstractC5469l.m23028e(exception, "exception");
        Method method = a.f786b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    /* renamed from: b */
    public AbstractC1238c mo792b() {
        return new C1237b();
    }
}
