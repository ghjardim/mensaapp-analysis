package p013B5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: B5.i */
/* loaded from: classes2.dex */
public final class C0065i {

    /* renamed from: a */
    public static final C0065i f208a = new C0065i();

    /* renamed from: b */
    public static final a f209b = new a(null, null, null);

    /* renamed from: c */
    public static a f210c;

    /* renamed from: B5.i$a */
    public static final class a {

        /* renamed from: a */
        public final Method f211a;

        /* renamed from: b */
        public final Method f212b;

        /* renamed from: c */
        public final Method f213c;

        public a(Method method, Method method2, Method method3) {
            this.f211a = method;
            this.f212b = method2;
            this.f213c = method3;
        }
    }

    /* renamed from: a */
    public final a m165a(AbstractC0057a abstractC0057a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC0057a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC0057a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f210c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f209b;
            f210c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m166b(AbstractC0057a continuation) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        AbstractC5469l.m23028e(continuation, "continuation");
        a aVar = f210c;
        if (aVar == null) {
            aVar = m165a(continuation);
        }
        if (aVar == f209b || (method = aVar.f211a) == null || (invoke = method.invoke(continuation.getClass(), null)) == null || (method2 = aVar.f212b) == null || (invoke2 = method2.invoke(invoke, null)) == null) {
            return null;
        }
        Method method3 = aVar.f213c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
