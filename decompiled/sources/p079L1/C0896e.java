package p079L1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import kotlin.jvm.internal.AbstractC5481x;
import p051H1.C0551a;
import p058I1.C0620d;
import p058I1.C0621e;
import p069J5.InterfaceC0789a;
import p114Q1.C2010a;

/* renamed from: L1.e */
/* loaded from: classes.dex */
public final class C0896e {

    /* renamed from: a */
    public final ClassLoader f3125a;

    /* renamed from: b */
    public final C0620d f3126b;

    /* renamed from: c */
    public final C0551a f3127c;

    /* renamed from: L1.e$a */
    public static final class a extends AbstractC5470m implements InterfaceC0789a {
        public a() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z6;
            Class m3732f = C0896e.this.m3732f();
            Method getBoundsMethod = m3732f.getMethod("getBounds", null);
            Method getTypeMethod = m3732f.getMethod("getType", null);
            Method getStateMethod = m3732f.getMethod("getState", null);
            C2010a c2010a = C2010a.f6218a;
            AbstractC5469l.m23027d(getBoundsMethod, "getBoundsMethod");
            if (c2010a.m7147b(getBoundsMethod, AbstractC5481x.m23040b(Rect.class)) && c2010a.m7149d(getBoundsMethod)) {
                AbstractC5469l.m23027d(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (c2010a.m7147b(getTypeMethod, AbstractC5481x.m23040b(cls)) && c2010a.m7149d(getTypeMethod)) {
                    AbstractC5469l.m23027d(getStateMethod, "getStateMethod");
                    if (c2010a.m7147b(getStateMethod, AbstractC5481x.m23040b(cls)) && c2010a.m7149d(getStateMethod)) {
                        z6 = true;
                        return Boolean.valueOf(z6);
                    }
                }
            }
            z6 = false;
            return Boolean.valueOf(z6);
        }
    }

    /* renamed from: L1.e$b */
    public static final class b extends AbstractC5470m implements InterfaceC0789a {
        public b() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        
            if (r3.m7149d(r2) != false) goto L12;
         */
        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                L1.e r2 = p079L1.C0896e.this
                I1.d r2 = p079L1.C0896e.m3727a(r2)
                java.lang.Class r2 = r2.m2508b()
                if (r2 != 0) goto L11
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L11:
                L1.e r3 = p079L1.C0896e.this
                java.lang.Class r3 = p079L1.C0896e.m3730d(r3)
                r4 = 2
                java.lang.Class[] r4 = new java.lang.Class[r4]
                java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
                r4[r1] = r5
                r4[r0] = r2
                java.lang.String r5 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r4 = r3.getMethod(r5, r4)
                java.lang.String r5 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r6 = new java.lang.Class[r0]
                r6[r1] = r2
                java.lang.reflect.Method r2 = r3.getMethod(r5, r6)
                Q1.a r3 = p114Q1.C2010a.f6218a
                java.lang.String r5 = "addListenerMethod"
                kotlin.jvm.internal.AbstractC5469l.m23027d(r4, r5)
                boolean r4 = r3.m7149d(r4)
                if (r4 == 0) goto L49
                java.lang.String r4 = "removeListenerMethod"
                kotlin.jvm.internal.AbstractC5469l.m23027d(r2, r4)
                boolean r2 = r3.m7149d(r2)
                if (r2 == 0) goto L49
                goto L4a
            L49:
                r0 = r1
            L4a:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p079L1.C0896e.b.invoke():java.lang.Boolean");
        }
    }

    /* renamed from: L1.e$c */
    public static final class c extends AbstractC5470m implements InterfaceC0789a {
        public c() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Class m3734h = C0896e.this.m3734h();
            boolean z6 = false;
            Method addListenerMethod = m3734h.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
            Method removeListenerMethod = m3734h.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            C2010a c2010a = C2010a.f6218a;
            AbstractC5469l.m23027d(addListenerMethod, "addListenerMethod");
            if (c2010a.m7149d(addListenerMethod)) {
                AbstractC5469l.m23027d(removeListenerMethod, "removeListenerMethod");
                if (c2010a.m7149d(removeListenerMethod)) {
                    z6 = true;
                }
            }
            return Boolean.valueOf(z6);
        }
    }

    /* renamed from: L1.e$d */
    public static final class d extends AbstractC5470m implements InterfaceC0789a {
        public d() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Method getWindowLayoutComponentMethod = C0896e.this.f3127c.m2130c().getMethod("getWindowLayoutComponent", null);
            Class m3734h = C0896e.this.m3734h();
            C2010a c2010a = C2010a.f6218a;
            AbstractC5469l.m23027d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(c2010a.m7149d(getWindowLayoutComponentMethod) && c2010a.m7148c(getWindowLayoutComponentMethod, m3734h));
        }
    }

    public C0896e(ClassLoader loader, C0620d consumerAdapter) {
        AbstractC5469l.m23028e(loader, "loader");
        AbstractC5469l.m23028e(consumerAdapter, "consumerAdapter");
        this.f3125a = loader;
        this.f3126b = consumerAdapter;
        this.f3127c = new C0551a(loader);
    }

    /* renamed from: e */
    public final boolean m3731e() {
        if (!m3740n()) {
            return false;
        }
        int m2517a = C0621e.f2167a.m2517a();
        if (m2517a == 1) {
            return m3735i();
        }
        if (2 > m2517a || m2517a > Integer.MAX_VALUE) {
            return false;
        }
        return m3736j();
    }

    /* renamed from: f */
    public final Class m3732f() {
        Class<?> loadClass = this.f3125a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        AbstractC5469l.m23027d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }

    /* renamed from: g */
    public final WindowLayoutComponent m3733g() {
        if (!m3731e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final Class m3734h() {
        Class<?> loadClass = this.f3125a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        AbstractC5469l.m23027d(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }

    /* renamed from: i */
    public final boolean m3735i() {
        return m3738l();
    }

    /* renamed from: j */
    public final boolean m3736j() {
        return m3735i() && m3739m();
    }

    /* renamed from: k */
    public final boolean m3737k() {
        return C2010a.m7145e("FoldingFeature class is not valid", new a());
    }

    /* renamed from: l */
    public final boolean m3738l() {
        return C2010a.m7145e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    /* renamed from: m */
    public final boolean m3739m() {
        return C2010a.m7145e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    /* renamed from: n */
    public final boolean m3740n() {
        return this.f3127c.m2133f() && m3741o() && m3737k();
    }

    /* renamed from: o */
    public final boolean m3741o() {
        return C2010a.m7145e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }
}
