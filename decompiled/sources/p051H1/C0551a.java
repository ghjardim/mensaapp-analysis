package p051H1;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;
import p114Q1.C2010a;

/* renamed from: H1.a */
/* loaded from: classes.dex */
public final class C0551a {

    /* renamed from: a */
    public final ClassLoader f1823a;

    /* renamed from: H1.a$a */
    public static final class a extends AbstractC5470m implements InterfaceC0789a {
        public a() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            Class<?> loadClass = C0551a.this.f1823a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            AbstractC5469l.m23027d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return loadClass;
        }
    }

    /* renamed from: H1.a$b */
    public static final class b extends AbstractC5470m implements InterfaceC0789a {
        public b() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Method getWindowExtensionsMethod = C0551a.this.m2131d().getDeclaredMethod("getWindowExtensions", null);
            Class m2130c = C0551a.this.m2130c();
            C2010a c2010a = C2010a.f6218a;
            AbstractC5469l.m23027d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            return Boolean.valueOf(c2010a.m7148c(getWindowExtensionsMethod, m2130c) && c2010a.m7149d(getWindowExtensionsMethod));
        }
    }

    public C0551a(ClassLoader loader) {
        AbstractC5469l.m23028e(loader, "loader");
        this.f1823a = loader;
    }

    /* renamed from: c */
    public final Class m2130c() {
        Class<?> loadClass = this.f1823a.loadClass("androidx.window.extensions.WindowExtensions");
        AbstractC5469l.m23027d(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }

    /* renamed from: d */
    public final Class m2131d() {
        Class<?> loadClass = this.f1823a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        AbstractC5469l.m23027d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }

    /* renamed from: e */
    public final boolean m2132e() {
        return C2010a.f6218a.m7146a(new a());
    }

    /* renamed from: f */
    public final boolean m2133f() {
        return m2132e() && C2010a.m7145e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
