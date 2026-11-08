package p232g0;

import java.util.Arrays;
import java.util.List;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3571a;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.L */
/* loaded from: classes.dex */
public final class C4306L {

    /* renamed from: b */
    public static final C4306L f14954b = new C4306L(AbstractC3033v.m11050t());

    /* renamed from: c */
    public static final String f14955c = AbstractC5330M.m21783x0(0);

    /* renamed from: a */
    public final AbstractC3033v f14956a;

    /* renamed from: g0.L$a */
    public static final class a {

        /* renamed from: f */
        public static final String f14957f = AbstractC5330M.m21783x0(0);

        /* renamed from: g */
        public static final String f14958g = AbstractC5330M.m21783x0(1);

        /* renamed from: h */
        public static final String f14959h = AbstractC5330M.m21783x0(3);

        /* renamed from: i */
        public static final String f14960i = AbstractC5330M.m21783x0(4);

        /* renamed from: a */
        public final int f14961a;

        /* renamed from: b */
        public final C4304J f14962b;

        /* renamed from: c */
        public final boolean f14963c;

        /* renamed from: d */
        public final int[] f14964d;

        /* renamed from: e */
        public final boolean[] f14965e;

        public a(C4304J c4304j, boolean z6, int[] iArr, boolean[] zArr) {
            int i7 = c4304j.f14850a;
            this.f14961a = i7;
            boolean z7 = false;
            AbstractC5332a.m21796a(i7 == iArr.length && i7 == zArr.length);
            this.f14962b = c4304j;
            if (z6 && i7 > 1) {
                z7 = true;
            }
            this.f14963c = z7;
            this.f14964d = (int[]) iArr.clone();
            this.f14965e = (boolean[]) zArr.clone();
        }

        /* renamed from: a */
        public C4327q m18103a(int i7) {
            return this.f14962b.m18064a(i7);
        }

        /* renamed from: b */
        public int m18104b() {
            return this.f14962b.f14852c;
        }

        /* renamed from: c */
        public boolean m18105c() {
            return AbstractC3571a.m14407b(this.f14965e, true);
        }

        /* renamed from: d */
        public boolean m18106d(int i7) {
            return this.f14965e[i7];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14963c == aVar.f14963c && this.f14962b.equals(aVar.f14962b) && Arrays.equals(this.f14964d, aVar.f14964d) && Arrays.equals(this.f14965e, aVar.f14965e);
        }

        public int hashCode() {
            return (((((this.f14962b.hashCode() * 31) + (this.f14963c ? 1 : 0)) * 31) + Arrays.hashCode(this.f14964d)) * 31) + Arrays.hashCode(this.f14965e);
        }
    }

    public C4306L(List list) {
        this.f14956a = AbstractC3033v.m11048p(list);
    }

    /* renamed from: a */
    public AbstractC3033v m18101a() {
        return this.f14956a;
    }

    /* renamed from: b */
    public boolean m18102b(int i7) {
        for (int i8 = 0; i8 < this.f14956a.size(); i8++) {
            a aVar = (a) this.f14956a.get(i8);
            if (aVar.m18105c() && aVar.m18104b() == i7) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4306L.class != obj.getClass()) {
            return false;
        }
        return this.f14956a.equals(((C4306L) obj).f14956a);
    }

    public int hashCode() {
        return this.f14956a.hashCode();
    }
}
