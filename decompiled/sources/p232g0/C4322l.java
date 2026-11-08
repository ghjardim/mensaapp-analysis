package p232g0;

import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.l */
/* loaded from: classes.dex */
public final class C4322l {

    /* renamed from: e */
    public static final C4322l f15054e = new b(0).m18162e();

    /* renamed from: f */
    public static final String f15055f = AbstractC5330M.m21783x0(0);

    /* renamed from: g */
    public static final String f15056g = AbstractC5330M.m21783x0(1);

    /* renamed from: h */
    public static final String f15057h = AbstractC5330M.m21783x0(2);

    /* renamed from: i */
    public static final String f15058i = AbstractC5330M.m21783x0(3);

    /* renamed from: a */
    public final int f15059a;

    /* renamed from: b */
    public final int f15060b;

    /* renamed from: c */
    public final int f15061c;

    /* renamed from: d */
    public final String f15062d;

    /* renamed from: g0.l$b */
    public static final class b {

        /* renamed from: a */
        public final int f15063a;

        /* renamed from: b */
        public int f15064b;

        /* renamed from: c */
        public int f15065c;

        /* renamed from: d */
        public String f15066d;

        public b(int i7) {
            this.f15063a = i7;
        }

        /* renamed from: e */
        public C4322l m18162e() {
            AbstractC5332a.m21796a(this.f15064b <= this.f15065c);
            return new C4322l(this);
        }

        /* renamed from: f */
        public b m18163f(int i7) {
            this.f15065c = i7;
            return this;
        }

        /* renamed from: g */
        public b m18164g(int i7) {
            this.f15064b = i7;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4322l)) {
            return false;
        }
        C4322l c4322l = (C4322l) obj;
        return this.f15059a == c4322l.f15059a && this.f15060b == c4322l.f15060b && this.f15061c == c4322l.f15061c && AbstractC5330M.m21729c(this.f15062d, c4322l.f15062d);
    }

    public int hashCode() {
        int i7 = (((((527 + this.f15059a) * 31) + this.f15060b) * 31) + this.f15061c) * 31;
        String str = this.f15062d;
        return i7 + (str == null ? 0 : str.hashCode());
    }

    public C4322l(b bVar) {
        this.f15059a = bVar.f15063a;
        this.f15060b = bVar.f15064b;
        this.f15061c = bVar.f15065c;
        this.f15062d = bVar.f15066d;
    }
}
