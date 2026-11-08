package p058I1;

import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;
import p111P5.AbstractC1970d;
import p111P5.InterfaceC1969c;
import p371w5.C6934q;

/* renamed from: I1.d */
/* loaded from: classes.dex */
public final class C0620d {

    /* renamed from: a */
    public final ClassLoader f2161a;

    /* renamed from: I1.d$a */
    public static final class a implements InvocationHandler {

        /* renamed from: a */
        public final InterfaceC1969c f2162a;

        /* renamed from: b */
        public final InterfaceC0800l f2163b;

        public a(InterfaceC1969c clazz, InterfaceC0800l consumer) {
            AbstractC5469l.m23028e(clazz, "clazz");
            AbstractC5469l.m23028e(consumer, "consumer");
            this.f2162a = clazz;
            this.f2163b = consumer;
        }

        /* renamed from: a */
        public final void m2511a(Object parameter) {
            AbstractC5469l.m23028e(parameter, "parameter");
            this.f2163b.invoke(parameter);
        }

        /* renamed from: b */
        public final boolean m2512b(Method method, Object[] objArr) {
            return AbstractC5469l.m23024a(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        /* renamed from: c */
        public final boolean m2513c(Method method, Object[] objArr) {
            return AbstractC5469l.m23024a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        /* renamed from: d */
        public final boolean m2514d(Method method, Object[] objArr) {
            return AbstractC5469l.m23024a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        /* renamed from: e */
        public final boolean m2515e(Method method, Object[] objArr) {
            return AbstractC5469l.m23024a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            AbstractC5469l.m23028e(obj, "obj");
            AbstractC5469l.m23028e(method, "method");
            if (m2512b(method, objArr)) {
                m2511a(AbstractC1970d.m7024a(this.f2162a, objArr != null ? objArr[0] : null));
                return C6934q.f24811a;
            }
            if (m2513c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (m2514d(method, objArr)) {
                return Integer.valueOf(this.f2163b.hashCode());
            }
            if (m2515e(method, objArr)) {
                return this.f2163b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* renamed from: I1.d$b */
    public interface b {
        /* renamed from: b */
        void mo2516b();
    }

    /* renamed from: I1.d$c */
    public static final class c implements b {

        /* renamed from: a */
        public final /* synthetic */ Method f2164a;

        /* renamed from: b */
        public final /* synthetic */ Object f2165b;

        /* renamed from: c */
        public final /* synthetic */ Object f2166c;

        public c(Method method, Object obj, Object obj2) {
            this.f2164a = method;
            this.f2165b = obj;
            this.f2166c = obj2;
        }

        @Override // p058I1.C0620d.b
        /* renamed from: b */
        public void mo2516b() {
            this.f2164a.invoke(this.f2165b, this.f2166c);
        }
    }

    public C0620d(ClassLoader loader) {
        AbstractC5469l.m23028e(loader, "loader");
        this.f2161a = loader;
    }

    /* renamed from: a */
    public final Object m2507a(InterfaceC1969c interfaceC1969c, InterfaceC0800l interfaceC0800l) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f2161a, new Class[]{m2510d()}, new a(interfaceC1969c, interfaceC0800l));
        AbstractC5469l.m23027d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return newProxyInstance;
    }

    /* renamed from: b */
    public final Class m2508b() {
        try {
            return m2510d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final b m2509c(Object obj, InterfaceC1969c clazz, String addMethodName, String removeMethodName, Activity activity, InterfaceC0800l consumer) {
        AbstractC5469l.m23028e(obj, "obj");
        AbstractC5469l.m23028e(clazz, "clazz");
        AbstractC5469l.m23028e(addMethodName, "addMethodName");
        AbstractC5469l.m23028e(removeMethodName, "removeMethodName");
        AbstractC5469l.m23028e(activity, "activity");
        AbstractC5469l.m23028e(consumer, "consumer");
        Object m2507a = m2507a(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, m2510d()).invoke(obj, activity, m2507a);
        return new c(obj.getClass().getMethod(removeMethodName, m2510d()), obj, m2507a);
    }

    /* renamed from: d */
    public final Class m2510d() {
        Class<?> loadClass = this.f2161a.loadClass("java.util.function.Consumer");
        AbstractC5469l.m23027d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
