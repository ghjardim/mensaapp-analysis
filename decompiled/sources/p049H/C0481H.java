package p049H;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p042G.AbstractC0340b;
import p042G.AbstractC0343e;
import p256j$.util.Objects;
import p386z.C7087b;

/* renamed from: H.H */
/* loaded from: classes.dex */
public class C0481H {

    /* renamed from: b */
    public static final C0481H f1650b;

    /* renamed from: a */
    public final k f1651a;

    /* renamed from: H.H$a */
    public static final class a {

        /* renamed from: a */
        public final e f1652a;

        public a() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                this.f1652a = new d();
            } else if (i7 >= 29) {
                this.f1652a = new c();
            } else {
                this.f1652a = new b();
            }
        }

        /* renamed from: a */
        public C0481H m1851a() {
            return this.f1652a.mo1853b();
        }
    }

    /* renamed from: H.H$b */
    public static class b extends e {

        /* renamed from: e */
        public static Field f1653e = null;

        /* renamed from: f */
        public static boolean f1654f = false;

        /* renamed from: g */
        public static Constructor f1655g = null;

        /* renamed from: h */
        public static boolean f1656h = false;

        /* renamed from: c */
        public WindowInsets f1657c = m1852g();

        /* renamed from: d */
        public C7087b f1658d;

        /* renamed from: g */
        private static WindowInsets m1852g() {
            if (!f1654f) {
                try {
                    f1653e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
                }
                f1654f = true;
            }
            Field field = f1653e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
                }
            }
            if (!f1656h) {
                try {
                    f1655g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
                }
                f1656h = true;
            }
            Constructor constructor = f1655g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
                }
            }
            return null;
        }

        @Override // p049H.C0481H.e
        /* renamed from: b */
        public C0481H mo1853b() {
            m1858a();
            C0481H m1836n = C0481H.m1836n(this.f1657c);
            m1836n.m1846i(this.f1661b);
            m1836n.m1849l(this.f1658d);
            return m1836n;
        }

        @Override // p049H.C0481H.e
        /* renamed from: e */
        public void mo1854e(C7087b c7087b) {
            WindowInsets windowInsets = this.f1657c;
            if (windowInsets != null) {
                this.f1657c = windowInsets.replaceSystemWindowInsets(c7087b.f25179a, c7087b.f25180b, c7087b.f25181c, c7087b.f25182d);
            }
        }
    }

    /* renamed from: H.H$c */
    public static class c extends e {

        /* renamed from: c */
        public final WindowInsets.Builder f1659c = AbstractC0482I.m1892a();

        @Override // p049H.C0481H.e
        /* renamed from: b */
        public C0481H mo1853b() {
            WindowInsets build;
            m1858a();
            build = this.f1659c.build();
            C0481H m1836n = C0481H.m1836n(build);
            m1836n.m1846i(this.f1661b);
            return m1836n;
        }

        @Override // p049H.C0481H.e
        /* renamed from: c */
        public void mo1855c(C7087b c7087b) {
            this.f1659c.setMandatorySystemGestureInsets(c7087b.m29196e());
        }

        @Override // p049H.C0481H.e
        /* renamed from: d */
        public void mo1856d(C7087b c7087b) {
            this.f1659c.setSystemGestureInsets(c7087b.m29196e());
        }

        @Override // p049H.C0481H.e
        /* renamed from: e */
        public void mo1854e(C7087b c7087b) {
            this.f1659c.setSystemWindowInsets(c7087b.m29196e());
        }

        @Override // p049H.C0481H.e
        /* renamed from: f */
        public void mo1857f(C7087b c7087b) {
            this.f1659c.setTappableElementInsets(c7087b.m29196e());
        }
    }

    /* renamed from: H.H$d */
    public static class d extends c {
    }

    /* renamed from: H.H$e */
    public static class e {

        /* renamed from: a */
        public final C0481H f1660a;

        /* renamed from: b */
        public C7087b[] f1661b;

        public e() {
            this(new C0481H((C0481H) null));
        }

        /* renamed from: a */
        public final void m1858a() {
            C7087b[] c7087bArr = this.f1661b;
            if (c7087bArr != null) {
                C7087b c7087b = c7087bArr[l.m1885d(1)];
                C7087b c7087b2 = this.f1661b[l.m1885d(2)];
                if (c7087b2 == null) {
                    c7087b2 = this.f1660a.m1843f(2);
                }
                if (c7087b == null) {
                    c7087b = this.f1660a.m1843f(1);
                }
                mo1854e(C7087b.m29192a(c7087b, c7087b2));
                C7087b c7087b3 = this.f1661b[l.m1885d(16)];
                if (c7087b3 != null) {
                    mo1856d(c7087b3);
                }
                C7087b c7087b4 = this.f1661b[l.m1885d(32)];
                if (c7087b4 != null) {
                    mo1855c(c7087b4);
                }
                C7087b c7087b5 = this.f1661b[l.m1885d(64)];
                if (c7087b5 != null) {
                    mo1857f(c7087b5);
                }
            }
        }

        /* renamed from: b */
        public abstract C0481H mo1853b();

        /* renamed from: e */
        public abstract void mo1854e(C7087b c7087b);

        public e(C0481H c0481h) {
            this.f1660a = c0481h;
        }

        /* renamed from: c */
        public void mo1855c(C7087b c7087b) {
        }

        /* renamed from: d */
        public void mo1856d(C7087b c7087b) {
        }

        /* renamed from: f */
        public void mo1857f(C7087b c7087b) {
        }
    }

    /* renamed from: H.H$h */
    public static class h extends g {
        public h(C0481H c0481h, WindowInsets windowInsets) {
            super(c0481h, windowInsets);
        }

        @Override // p049H.C0481H.k
        /* renamed from: a */
        public C0481H mo1877a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f1667c.consumeDisplayCutout();
            return C0481H.m1836n(consumeDisplayCutout);
        }

        @Override // p049H.C0481H.f, p049H.C0481H.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f1667c, hVar.f1667c) && Objects.equals(this.f1671g, hVar.f1671g);
        }

        @Override // p049H.C0481H.k
        /* renamed from: f */
        public C0513h mo1878f() {
            DisplayCutout displayCutout;
            displayCutout = this.f1667c.getDisplayCutout();
            return C0513h.m1951e(displayCutout);
        }

        @Override // p049H.C0481H.k
        public int hashCode() {
            return this.f1667c.hashCode();
        }

        public h(C0481H c0481h, h hVar) {
            super(c0481h, hVar);
        }
    }

    /* renamed from: H.H$j */
    public static class j extends i {

        /* renamed from: q */
        public static final C0481H f1676q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f1676q = C0481H.m1836n(windowInsets);
        }

        public j(C0481H c0481h, WindowInsets windowInsets) {
            super(c0481h, windowInsets);
        }

        @Override // p049H.C0481H.f, p049H.C0481H.k
        /* renamed from: g */
        public C7087b mo1865g(int i7) {
            Insets insets;
            insets = this.f1667c.getInsets(m.m1891a(i7));
            return C7087b.m29195d(insets);
        }

        public j(C0481H c0481h, j jVar) {
            super(c0481h, jVar);
        }

        @Override // p049H.C0481H.f, p049H.C0481H.k
        /* renamed from: d */
        public final void mo1863d(View view) {
        }
    }

    /* renamed from: H.H$l */
    public static final class l {
        /* renamed from: a */
        public static int m1882a() {
            return 4;
        }

        /* renamed from: b */
        public static int m1883b() {
            return 128;
        }

        /* renamed from: c */
        public static int m1884c() {
            return 8;
        }

        /* renamed from: d */
        public static int m1885d(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 == 8) {
                return 3;
            }
            if (i7 == 16) {
                return 4;
            }
            if (i7 == 32) {
                return 5;
            }
            if (i7 == 64) {
                return 6;
            }
            if (i7 == 128) {
                return 7;
            }
            if (i7 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i7);
        }

        /* renamed from: e */
        public static int m1886e() {
            return 32;
        }

        /* renamed from: f */
        public static int m1887f() {
            return 2;
        }

        /* renamed from: g */
        public static int m1888g() {
            return 1;
        }

        /* renamed from: h */
        public static int m1889h() {
            return 16;
        }

        /* renamed from: i */
        public static int m1890i() {
            return 64;
        }
    }

    /* renamed from: H.H$m */
    public static final class m {
        /* renamed from: a */
        public static int m1891a(int i7) {
            int statusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= statusBars;
                }
            }
            return i8;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1650b = j.f1676q;
        } else {
            f1650b = k.f1677b;
        }
    }

    public C0481H(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f1651a = new j(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f1651a = new i(this, windowInsets);
        } else if (i7 >= 28) {
            this.f1651a = new h(this, windowInsets);
        } else {
            this.f1651a = new g(this, windowInsets);
        }
    }

    /* renamed from: n */
    public static C0481H m1836n(WindowInsets windowInsets) {
        return m1837o(windowInsets, null);
    }

    /* renamed from: o */
    public static C0481H m1837o(WindowInsets windowInsets, View view) {
        C0481H c0481h = new C0481H((WindowInsets) AbstractC0343e.m1353c(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0481h.m1848k(AbstractC0475B.m1758q(view));
            c0481h.m1841d(view.getRootView());
        }
        return c0481h;
    }

    /* renamed from: a */
    public C0481H m1838a() {
        return this.f1651a.mo1877a();
    }

    /* renamed from: b */
    public C0481H m1839b() {
        return this.f1651a.mo1872b();
    }

    /* renamed from: c */
    public C0481H m1840c() {
        return this.f1651a.mo1873c();
    }

    /* renamed from: d */
    public void m1841d(View view) {
        this.f1651a.mo1863d(view);
    }

    /* renamed from: e */
    public C0513h m1842e() {
        return this.f1651a.mo1878f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0481H) {
            return AbstractC0340b.m1344a(this.f1651a, ((C0481H) obj).f1651a);
        }
        return false;
    }

    /* renamed from: f */
    public C7087b m1843f(int i7) {
        return this.f1651a.mo1865g(i7);
    }

    /* renamed from: g */
    public C7087b m1844g() {
        return this.f1651a.mo1874i();
    }

    /* renamed from: h */
    public boolean m1845h() {
        return this.f1651a.mo1875m();
    }

    public int hashCode() {
        k kVar = this.f1651a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* renamed from: i */
    public void m1846i(C7087b[] c7087bArr) {
        this.f1651a.mo1868o(c7087bArr);
    }

    /* renamed from: j */
    public void m1847j(C7087b c7087b) {
        this.f1651a.mo1869p(c7087b);
    }

    /* renamed from: k */
    public void m1848k(C0481H c0481h) {
        this.f1651a.mo1870q(c0481h);
    }

    /* renamed from: l */
    public void m1849l(C7087b c7087b) {
        this.f1651a.mo1876r(c7087b);
    }

    /* renamed from: m */
    public WindowInsets m1850m() {
        k kVar = this.f1651a;
        if (kVar instanceof f) {
            return ((f) kVar).f1667c;
        }
        return null;
    }

    /* renamed from: H.H$g */
    public static class g extends f {

        /* renamed from: m */
        public C7087b f1672m;

        public g(C0481H c0481h, WindowInsets windowInsets) {
            super(c0481h, windowInsets);
            this.f1672m = null;
        }

        @Override // p049H.C0481H.k
        /* renamed from: b */
        public C0481H mo1872b() {
            return C0481H.m1836n(this.f1667c.consumeStableInsets());
        }

        @Override // p049H.C0481H.k
        /* renamed from: c */
        public C0481H mo1873c() {
            return C0481H.m1836n(this.f1667c.consumeSystemWindowInsets());
        }

        @Override // p049H.C0481H.k
        /* renamed from: i */
        public final C7087b mo1874i() {
            if (this.f1672m == null) {
                this.f1672m = C7087b.m29193b(this.f1667c.getStableInsetLeft(), this.f1667c.getStableInsetTop(), this.f1667c.getStableInsetRight(), this.f1667c.getStableInsetBottom());
            }
            return this.f1672m;
        }

        @Override // p049H.C0481H.k
        /* renamed from: m */
        public boolean mo1875m() {
            return this.f1667c.isConsumed();
        }

        @Override // p049H.C0481H.k
        /* renamed from: r */
        public void mo1876r(C7087b c7087b) {
            this.f1672m = c7087b;
        }

        public g(C0481H c0481h, g gVar) {
            super(c0481h, gVar);
            this.f1672m = null;
            this.f1672m = gVar.f1672m;
        }
    }

    /* renamed from: H.H$f */
    public static class f extends k {

        /* renamed from: h */
        public static boolean f1662h = false;

        /* renamed from: i */
        public static Method f1663i;

        /* renamed from: j */
        public static Class f1664j;

        /* renamed from: k */
        public static Field f1665k;

        /* renamed from: l */
        public static Field f1666l;

        /* renamed from: c */
        public final WindowInsets f1667c;

        /* renamed from: d */
        public C7087b[] f1668d;

        /* renamed from: e */
        public C7087b f1669e;

        /* renamed from: f */
        public C0481H f1670f;

        /* renamed from: g */
        public C7087b f1671g;

        public f(C0481H c0481h, WindowInsets windowInsets) {
            super(c0481h);
            this.f1669e = null;
            this.f1667c = windowInsets;
        }

        /* renamed from: s */
        private C7087b m1859s(int i7, boolean z6) {
            C7087b c7087b = C7087b.f25178e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    c7087b = C7087b.m29192a(c7087b, m1871t(i8, z6));
                }
            }
            return c7087b;
        }

        /* renamed from: u */
        private C7087b m1860u() {
            C0481H c0481h = this.f1670f;
            return c0481h != null ? c0481h.m1844g() : C7087b.f25178e;
        }

        /* renamed from: v */
        private C7087b m1861v(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1662h) {
                m1862w();
            }
            Method method = f1663i;
            if (method != null && f1664j != null && f1665k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1665k.get(f1666l.get(invoke));
                    if (rect != null) {
                        return C7087b.m29194c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }

        /* renamed from: w */
        private static void m1862w() {
            try {
                f1663i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1664j = cls;
                f1665k = cls.getDeclaredField("mVisibleInsets");
                f1666l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1665k.setAccessible(true);
                f1666l.setAccessible(true);
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
            f1662h = true;
        }

        @Override // p049H.C0481H.k
        /* renamed from: d */
        public void mo1863d(View view) {
            C7087b m1861v = m1861v(view);
            if (m1861v == null) {
                m1861v = C7087b.f25178e;
            }
            mo1869p(m1861v);
        }

        @Override // p049H.C0481H.k
        /* renamed from: e */
        public void mo1864e(C0481H c0481h) {
            c0481h.m1848k(this.f1670f);
            c0481h.m1847j(this.f1671g);
        }

        @Override // p049H.C0481H.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1671g, ((f) obj).f1671g);
            }
            return false;
        }

        @Override // p049H.C0481H.k
        /* renamed from: g */
        public C7087b mo1865g(int i7) {
            return m1859s(i7, false);
        }

        @Override // p049H.C0481H.k
        /* renamed from: k */
        public final C7087b mo1866k() {
            if (this.f1669e == null) {
                this.f1669e = C7087b.m29193b(this.f1667c.getSystemWindowInsetLeft(), this.f1667c.getSystemWindowInsetTop(), this.f1667c.getSystemWindowInsetRight(), this.f1667c.getSystemWindowInsetBottom());
            }
            return this.f1669e;
        }

        @Override // p049H.C0481H.k
        /* renamed from: n */
        public boolean mo1867n() {
            return this.f1667c.isRound();
        }

        @Override // p049H.C0481H.k
        /* renamed from: o */
        public void mo1868o(C7087b[] c7087bArr) {
            this.f1668d = c7087bArr;
        }

        @Override // p049H.C0481H.k
        /* renamed from: p */
        public void mo1869p(C7087b c7087b) {
            this.f1671g = c7087b;
        }

        @Override // p049H.C0481H.k
        /* renamed from: q */
        public void mo1870q(C0481H c0481h) {
            this.f1670f = c0481h;
        }

        /* renamed from: t */
        public C7087b m1871t(int i7, boolean z6) {
            C7087b m1844g;
            int i8;
            if (i7 == 1) {
                return z6 ? C7087b.m29193b(0, Math.max(m1860u().f25180b, mo1866k().f25180b), 0, 0) : C7087b.m29193b(0, mo1866k().f25180b, 0, 0);
            }
            if (i7 == 2) {
                if (z6) {
                    C7087b m1860u = m1860u();
                    C7087b mo1874i = mo1874i();
                    return C7087b.m29193b(Math.max(m1860u.f25179a, mo1874i.f25179a), 0, Math.max(m1860u.f25181c, mo1874i.f25181c), Math.max(m1860u.f25182d, mo1874i.f25182d));
                }
                C7087b mo1866k = mo1866k();
                C0481H c0481h = this.f1670f;
                m1844g = c0481h != null ? c0481h.m1844g() : null;
                int i9 = mo1866k.f25182d;
                if (m1844g != null) {
                    i9 = Math.min(i9, m1844g.f25182d);
                }
                return C7087b.m29193b(mo1866k.f25179a, 0, mo1866k.f25181c, i9);
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return mo1880j();
                }
                if (i7 == 32) {
                    return mo1879h();
                }
                if (i7 == 64) {
                    return mo1881l();
                }
                if (i7 != 128) {
                    return C7087b.f25178e;
                }
                C0481H c0481h2 = this.f1670f;
                C0513h m1842e = c0481h2 != null ? c0481h2.m1842e() : mo1878f();
                return m1842e != null ? C7087b.m29193b(m1842e.m1953b(), m1842e.m1955d(), m1842e.m1954c(), m1842e.m1952a()) : C7087b.f25178e;
            }
            C7087b[] c7087bArr = this.f1668d;
            m1844g = c7087bArr != null ? c7087bArr[l.m1885d(8)] : null;
            if (m1844g != null) {
                return m1844g;
            }
            C7087b mo1866k2 = mo1866k();
            C7087b m1860u2 = m1860u();
            int i10 = mo1866k2.f25182d;
            if (i10 > m1860u2.f25182d) {
                return C7087b.m29193b(0, 0, 0, i10);
            }
            C7087b c7087b = this.f1671g;
            return (c7087b == null || c7087b.equals(C7087b.f25178e) || (i8 = this.f1671g.f25182d) <= m1860u2.f25182d) ? C7087b.f25178e : C7087b.m29193b(0, 0, 0, i8);
        }

        public f(C0481H c0481h, f fVar) {
            this(c0481h, new WindowInsets(fVar.f1667c));
        }
    }

    /* renamed from: H.H$i */
    public static class i extends h {

        /* renamed from: n */
        public C7087b f1673n;

        /* renamed from: o */
        public C7087b f1674o;

        /* renamed from: p */
        public C7087b f1675p;

        public i(C0481H c0481h, WindowInsets windowInsets) {
            super(c0481h, windowInsets);
            this.f1673n = null;
            this.f1674o = null;
            this.f1675p = null;
        }

        @Override // p049H.C0481H.k
        /* renamed from: h */
        public C7087b mo1879h() {
            Insets mandatorySystemGestureInsets;
            if (this.f1674o == null) {
                mandatorySystemGestureInsets = this.f1667c.getMandatorySystemGestureInsets();
                this.f1674o = C7087b.m29195d(mandatorySystemGestureInsets);
            }
            return this.f1674o;
        }

        @Override // p049H.C0481H.k
        /* renamed from: j */
        public C7087b mo1880j() {
            Insets systemGestureInsets;
            if (this.f1673n == null) {
                systemGestureInsets = this.f1667c.getSystemGestureInsets();
                this.f1673n = C7087b.m29195d(systemGestureInsets);
            }
            return this.f1673n;
        }

        @Override // p049H.C0481H.k
        /* renamed from: l */
        public C7087b mo1881l() {
            Insets tappableElementInsets;
            if (this.f1675p == null) {
                tappableElementInsets = this.f1667c.getTappableElementInsets();
                this.f1675p = C7087b.m29195d(tappableElementInsets);
            }
            return this.f1675p;
        }

        public i(C0481H c0481h, i iVar) {
            super(c0481h, iVar);
            this.f1673n = null;
            this.f1674o = null;
            this.f1675p = null;
        }

        @Override // p049H.C0481H.g, p049H.C0481H.k
        /* renamed from: r */
        public void mo1876r(C7087b c7087b) {
        }
    }

    public C0481H(C0481H c0481h) {
        if (c0481h != null) {
            k kVar = c0481h.f1651a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && (kVar instanceof j)) {
                this.f1651a = new j(this, (j) kVar);
            } else if (i7 >= 29 && (kVar instanceof i)) {
                this.f1651a = new i(this, (i) kVar);
            } else if (i7 >= 28 && (kVar instanceof h)) {
                this.f1651a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f1651a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f1651a = new f(this, (f) kVar);
            } else {
                this.f1651a = new k(this);
            }
            kVar.mo1864e(this);
            return;
        }
        this.f1651a = new k(this);
    }

    /* renamed from: H.H$k */
    public static class k {

        /* renamed from: b */
        public static final C0481H f1677b = new a().m1851a().m1838a().m1839b().m1840c();

        /* renamed from: a */
        public final C0481H f1678a;

        public k(C0481H c0481h) {
            this.f1678a = c0481h;
        }

        /* renamed from: a */
        public C0481H mo1877a() {
            return this.f1678a;
        }

        /* renamed from: b */
        public C0481H mo1872b() {
            return this.f1678a;
        }

        /* renamed from: c */
        public C0481H mo1873c() {
            return this.f1678a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return mo1867n() == kVar.mo1867n() && mo1875m() == kVar.mo1875m() && AbstractC0340b.m1344a(mo1866k(), kVar.mo1866k()) && AbstractC0340b.m1344a(mo1874i(), kVar.mo1874i()) && AbstractC0340b.m1344a(mo1878f(), kVar.mo1878f());
        }

        /* renamed from: f */
        public C0513h mo1878f() {
            return null;
        }

        /* renamed from: g */
        public C7087b mo1865g(int i7) {
            return C7087b.f25178e;
        }

        /* renamed from: h */
        public C7087b mo1879h() {
            return mo1866k();
        }

        public int hashCode() {
            return AbstractC0340b.m1345b(Boolean.valueOf(mo1867n()), Boolean.valueOf(mo1875m()), mo1866k(), mo1874i(), mo1878f());
        }

        /* renamed from: i */
        public C7087b mo1874i() {
            return C7087b.f25178e;
        }

        /* renamed from: j */
        public C7087b mo1880j() {
            return mo1866k();
        }

        /* renamed from: k */
        public C7087b mo1866k() {
            return C7087b.f25178e;
        }

        /* renamed from: l */
        public C7087b mo1881l() {
            return mo1866k();
        }

        /* renamed from: m */
        public boolean mo1875m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo1867n() {
            return false;
        }

        /* renamed from: d */
        public void mo1863d(View view) {
        }

        /* renamed from: e */
        public void mo1864e(C0481H c0481h) {
        }

        /* renamed from: o */
        public void mo1868o(C7087b[] c7087bArr) {
        }

        /* renamed from: p */
        public void mo1869p(C7087b c7087b) {
        }

        /* renamed from: q */
        public void mo1870q(C0481H c0481h) {
        }

        /* renamed from: r */
        public void mo1876r(C7087b c7087b) {
        }
    }
}
