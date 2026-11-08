package p225f1;

import p078L0.InterfaceC0884s;
import p259j0.C5357z;

/* renamed from: f1.u */
/* loaded from: classes.dex */
public final class C4246u {

    /* renamed from: a */
    public C4229d f14611a;

    /* renamed from: b */
    public long f14612b;

    /* renamed from: c */
    public long f14613c;

    /* renamed from: d */
    public long f14614d;

    /* renamed from: e */
    public int f14615e;

    /* renamed from: f */
    public int f14616f;

    /* renamed from: l */
    public boolean f14622l;

    /* renamed from: n */
    public C4245t f14624n;

    /* renamed from: p */
    public boolean f14626p;

    /* renamed from: q */
    public long f14627q;

    /* renamed from: r */
    public boolean f14628r;

    /* renamed from: g */
    public long[] f14617g = new long[0];

    /* renamed from: h */
    public int[] f14618h = new int[0];

    /* renamed from: i */
    public int[] f14619i = new int[0];

    /* renamed from: j */
    public long[] f14620j = new long[0];

    /* renamed from: k */
    public boolean[] f14621k = new boolean[0];

    /* renamed from: m */
    public boolean[] f14623m = new boolean[0];

    /* renamed from: o */
    public final C5357z f14625o = new C5357z();

    /* renamed from: a */
    public void m17827a(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.readFully(this.f14625o.m21946e(), 0, this.f14625o.m21948g());
        this.f14625o.m21939T(0);
        this.f14626p = false;
    }

    /* renamed from: b */
    public void m17828b(C5357z c5357z) {
        c5357z.m21953l(this.f14625o.m21946e(), 0, this.f14625o.m21948g());
        this.f14625o.m21939T(0);
        this.f14626p = false;
    }

    /* renamed from: c */
    public long m17829c(int i7) {
        return this.f14620j[i7];
    }

    /* renamed from: d */
    public void m17830d(int i7) {
        this.f14625o.m21935P(i7);
        this.f14622l = true;
        this.f14626p = true;
    }

    /* renamed from: e */
    public void m17831e(int i7, int i8) {
        this.f14615e = i7;
        this.f14616f = i8;
        if (this.f14618h.length < i7) {
            this.f14617g = new long[i7];
            this.f14618h = new int[i7];
        }
        if (this.f14619i.length < i8) {
            int i9 = (i8 * 125) / 100;
            this.f14619i = new int[i9];
            this.f14620j = new long[i9];
            this.f14621k = new boolean[i9];
            this.f14623m = new boolean[i9];
        }
    }

    /* renamed from: f */
    public void m17832f() {
        this.f14615e = 0;
        this.f14627q = 0L;
        this.f14628r = false;
        this.f14622l = false;
        this.f14626p = false;
        this.f14624n = null;
    }

    /* renamed from: g */
    public boolean m17833g(int i7) {
        return this.f14622l && this.f14623m[i7];
    }
}
