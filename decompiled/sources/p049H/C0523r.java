package p049H;

import android.view.View;
import android.view.ViewParent;

/* renamed from: H.r */
/* loaded from: classes.dex */
public class C0523r {

    /* renamed from: a */
    public ViewParent f1709a;

    /* renamed from: b */
    public ViewParent f1710b;

    /* renamed from: c */
    public final View f1711c;

    /* renamed from: d */
    public boolean f1712d;

    /* renamed from: e */
    public int[] f1713e;

    public C0523r(View view) {
        this.f1711c = view;
    }

    /* renamed from: a */
    public boolean m1996a(float f7, float f8, boolean z6) {
        ViewParent m2004i;
        if (!m2008m() || (m2004i = m2004i(0)) == null) {
            return false;
        }
        return AbstractC0480G.m1822a(m2004i, this.f1711c, f7, f8, z6);
    }

    /* renamed from: b */
    public boolean m1997b(float f7, float f8) {
        ViewParent m2004i;
        if (!m2008m() || (m2004i = m2004i(0)) == null) {
            return false;
        }
        return AbstractC0480G.m1823b(m2004i, this.f1711c, f7, f8);
    }

    /* renamed from: c */
    public boolean m1998c(int i7, int i8, int[] iArr, int[] iArr2) {
        return m1999d(i7, i8, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m1999d(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        ViewParent m2004i;
        int i10;
        int i11;
        if (!m2008m() || (m2004i = m2004i(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1711c.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            iArr = m2005j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        AbstractC0480G.m1824c(m2004i, this.f1711c, i7, i8, iArr, i9);
        if (iArr2 != null) {
            this.f1711c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m2000e(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        m2003h(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    /* renamed from: f */
    public boolean m2001f(int i7, int i8, int i9, int i10, int[] iArr) {
        return m2003h(i7, i8, i9, i10, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m2002g(int i7, int i8, int i9, int i10, int[] iArr, int i11) {
        return m2003h(i7, i8, i9, i10, iArr, i11, null);
    }

    /* renamed from: h */
    public final boolean m2003h(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent m2004i;
        int i12;
        int i13;
        int[] iArr3;
        if (!m2008m() || (m2004i = m2004i(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1711c.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            int[] m2005j = m2005j();
            m2005j[0] = 0;
            m2005j[1] = 0;
            iArr3 = m2005j;
        } else {
            iArr3 = iArr2;
        }
        AbstractC0480G.m1825d(m2004i, this.f1711c, i7, i8, i9, i10, i11, iArr3);
        if (iArr != null) {
            this.f1711c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    /* renamed from: i */
    public final ViewParent m2004i(int i7) {
        if (i7 == 0) {
            return this.f1709a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f1710b;
    }

    /* renamed from: j */
    public final int[] m2005j() {
        if (this.f1713e == null) {
            this.f1713e = new int[2];
        }
        return this.f1713e;
    }

    /* renamed from: k */
    public boolean m2006k() {
        return m2007l(0);
    }

    /* renamed from: l */
    public boolean m2007l(int i7) {
        return m2004i(i7) != null;
    }

    /* renamed from: m */
    public boolean m2008m() {
        return this.f1712d;
    }

    /* renamed from: n */
    public void m2009n(boolean z6) {
        if (this.f1712d) {
            AbstractC0475B.m1741S(this.f1711c);
        }
        this.f1712d = z6;
    }

    /* renamed from: o */
    public final void m2010o(int i7, ViewParent viewParent) {
        if (i7 == 0) {
            this.f1709a = viewParent;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f1710b = viewParent;
        }
    }

    /* renamed from: p */
    public boolean m2011p(int i7) {
        return m2012q(i7, 0);
    }

    /* renamed from: q */
    public boolean m2012q(int i7, int i8) {
        if (m2007l(i8)) {
            return true;
        }
        if (!m2008m()) {
            return false;
        }
        View view = this.f1711c;
        for (ViewParent parent = this.f1711c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC0480G.m1827f(parent, view, this.f1711c, i7, i8)) {
                m2010o(i8, parent);
                AbstractC0480G.m1826e(parent, view, this.f1711c, i7, i8);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m2013r() {
        m2014s(0);
    }

    /* renamed from: s */
    public void m2014s(int i7) {
        ViewParent m2004i = m2004i(i7);
        if (m2004i != null) {
            AbstractC0480G.m1828g(m2004i, this.f1711c, i7);
            m2010o(i7, null);
        }
    }
}
