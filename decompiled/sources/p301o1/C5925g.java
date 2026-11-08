package p301o1;

import android.text.Layout;

/* renamed from: o1.g */
/* loaded from: classes.dex */
public final class C5925g {

    /* renamed from: a */
    public String f21371a;

    /* renamed from: b */
    public int f21372b;

    /* renamed from: c */
    public boolean f21373c;

    /* renamed from: d */
    public int f21374d;

    /* renamed from: e */
    public boolean f21375e;

    /* renamed from: k */
    public float f21381k;

    /* renamed from: l */
    public String f21382l;

    /* renamed from: o */
    public Layout.Alignment f21385o;

    /* renamed from: p */
    public Layout.Alignment f21386p;

    /* renamed from: r */
    public C5920b f21388r;

    /* renamed from: f */
    public int f21376f = -1;

    /* renamed from: g */
    public int f21377g = -1;

    /* renamed from: h */
    public int f21378h = -1;

    /* renamed from: i */
    public int f21379i = -1;

    /* renamed from: j */
    public int f21380j = -1;

    /* renamed from: m */
    public int f21383m = -1;

    /* renamed from: n */
    public int f21384n = -1;

    /* renamed from: q */
    public int f21387q = -1;

    /* renamed from: s */
    public float f21389s = Float.MAX_VALUE;

    /* renamed from: A */
    public C5925g m24917A(String str) {
        this.f21382l = str;
        return this;
    }

    /* renamed from: B */
    public C5925g m24918B(boolean z6) {
        this.f21379i = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public C5925g m24919C(boolean z6) {
        this.f21376f = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: D */
    public C5925g m24920D(Layout.Alignment alignment) {
        this.f21386p = alignment;
        return this;
    }

    /* renamed from: E */
    public C5925g m24921E(int i7) {
        this.f21384n = i7;
        return this;
    }

    /* renamed from: F */
    public C5925g m24922F(int i7) {
        this.f21383m = i7;
        return this;
    }

    /* renamed from: G */
    public C5925g m24923G(float f7) {
        this.f21389s = f7;
        return this;
    }

    /* renamed from: H */
    public C5925g m24924H(Layout.Alignment alignment) {
        this.f21385o = alignment;
        return this;
    }

    /* renamed from: I */
    public C5925g m24925I(boolean z6) {
        this.f21387q = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: J */
    public C5925g m24926J(C5920b c5920b) {
        this.f21388r = c5920b;
        return this;
    }

    /* renamed from: K */
    public C5925g m24927K(boolean z6) {
        this.f21377g = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C5925g m24928a(C5925g c5925g) {
        return m24945r(c5925g, true);
    }

    /* renamed from: b */
    public int m24929b() {
        if (this.f21375e) {
            return this.f21374d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m24930c() {
        if (this.f21373c) {
            return this.f21372b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m24931d() {
        return this.f21371a;
    }

    /* renamed from: e */
    public float m24932e() {
        return this.f21381k;
    }

    /* renamed from: f */
    public int m24933f() {
        return this.f21380j;
    }

    /* renamed from: g */
    public String m24934g() {
        return this.f21382l;
    }

    /* renamed from: h */
    public Layout.Alignment m24935h() {
        return this.f21386p;
    }

    /* renamed from: i */
    public int m24936i() {
        return this.f21384n;
    }

    /* renamed from: j */
    public int m24937j() {
        return this.f21383m;
    }

    /* renamed from: k */
    public float m24938k() {
        return this.f21389s;
    }

    /* renamed from: l */
    public int m24939l() {
        int i7 = this.f21378h;
        if (i7 == -1 && this.f21379i == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f21379i == 1 ? 2 : 0);
    }

    /* renamed from: m */
    public Layout.Alignment m24940m() {
        return this.f21385o;
    }

    /* renamed from: n */
    public boolean m24941n() {
        return this.f21387q == 1;
    }

    /* renamed from: o */
    public C5920b m24942o() {
        return this.f21388r;
    }

    /* renamed from: p */
    public boolean m24943p() {
        return this.f21375e;
    }

    /* renamed from: q */
    public boolean m24944q() {
        return this.f21373c;
    }

    /* renamed from: r */
    public final C5925g m24945r(C5925g c5925g, boolean z6) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c5925g != null) {
            if (!this.f21373c && c5925g.f21373c) {
                m24950w(c5925g.f21372b);
            }
            if (this.f21378h == -1) {
                this.f21378h = c5925g.f21378h;
            }
            if (this.f21379i == -1) {
                this.f21379i = c5925g.f21379i;
            }
            if (this.f21371a == null && (str = c5925g.f21371a) != null) {
                this.f21371a = str;
            }
            if (this.f21376f == -1) {
                this.f21376f = c5925g.f21376f;
            }
            if (this.f21377g == -1) {
                this.f21377g = c5925g.f21377g;
            }
            if (this.f21384n == -1) {
                this.f21384n = c5925g.f21384n;
            }
            if (this.f21385o == null && (alignment2 = c5925g.f21385o) != null) {
                this.f21385o = alignment2;
            }
            if (this.f21386p == null && (alignment = c5925g.f21386p) != null) {
                this.f21386p = alignment;
            }
            if (this.f21387q == -1) {
                this.f21387q = c5925g.f21387q;
            }
            if (this.f21380j == -1) {
                this.f21380j = c5925g.f21380j;
                this.f21381k = c5925g.f21381k;
            }
            if (this.f21388r == null) {
                this.f21388r = c5925g.f21388r;
            }
            if (this.f21389s == Float.MAX_VALUE) {
                this.f21389s = c5925g.f21389s;
            }
            if (z6 && !this.f21375e && c5925g.f21375e) {
                m24948u(c5925g.f21374d);
            }
            if (z6 && this.f21383m == -1 && (i7 = c5925g.f21383m) != -1) {
                this.f21383m = i7;
            }
        }
        return this;
    }

    /* renamed from: s */
    public boolean m24946s() {
        return this.f21376f == 1;
    }

    /* renamed from: t */
    public boolean m24947t() {
        return this.f21377g == 1;
    }

    /* renamed from: u */
    public C5925g m24948u(int i7) {
        this.f21374d = i7;
        this.f21375e = true;
        return this;
    }

    /* renamed from: v */
    public C5925g m24949v(boolean z6) {
        this.f21378h = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public C5925g m24950w(int i7) {
        this.f21372b = i7;
        this.f21373c = true;
        return this;
    }

    /* renamed from: x */
    public C5925g m24951x(String str) {
        this.f21371a = str;
        return this;
    }

    /* renamed from: y */
    public C5925g m24952y(float f7) {
        this.f21381k = f7;
        return this;
    }

    /* renamed from: z */
    public C5925g m24953z(int i7) {
        this.f21380j = i7;
        return this;
    }
}
