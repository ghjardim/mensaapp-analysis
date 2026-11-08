package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC3303l0;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.g0 */
/* loaded from: classes.dex */
public final class C3293g0 {

    /* renamed from: f */
    public static final C3293g0 f10483f = new C3293g0(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f10484a;

    /* renamed from: b */
    public int[] f10485b;

    /* renamed from: c */
    public Object[] f10486c;

    /* renamed from: d */
    public int f10487d;

    /* renamed from: e */
    public boolean f10488e;

    public C3293g0() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C3293g0 m12445c() {
        return f10483f;
    }

    /* renamed from: f */
    public static int m12446f(int[] iArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        return i8;
    }

    /* renamed from: g */
    public static int m12447g(Object[] objArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + objArr[i9].hashCode();
        }
        return i8;
    }

    /* renamed from: j */
    public static C3293g0 m12448j(C3293g0 c3293g0, C3293g0 c3293g02) {
        int i7 = c3293g0.f10484a + c3293g02.f10484a;
        int[] copyOf = Arrays.copyOf(c3293g0.f10485b, i7);
        System.arraycopy(c3293g02.f10485b, 0, copyOf, c3293g0.f10484a, c3293g02.f10484a);
        Object[] copyOf2 = Arrays.copyOf(c3293g0.f10486c, i7);
        System.arraycopy(c3293g02.f10486c, 0, copyOf2, c3293g0.f10484a, c3293g02.f10484a);
        return new C3293g0(i7, copyOf, copyOf2, true);
    }

    /* renamed from: k */
    public static C3293g0 m12449k() {
        return new C3293g0();
    }

    /* renamed from: l */
    public static boolean m12450l(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m12451o(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static void m12452q(int i7, Object obj, InterfaceC3303l0 interfaceC3303l0) {
        int m12745a = AbstractC3301k0.m12745a(i7);
        int m12746b = AbstractC3301k0.m12746b(i7);
        if (m12746b == 0) {
            interfaceC3303l0.mo12707n(m12745a, ((Long) obj).longValue());
            return;
        }
        if (m12746b == 1) {
            interfaceC3303l0.mo12699h(m12745a, ((Long) obj).longValue());
            return;
        }
        if (m12746b == 2) {
            interfaceC3303l0.mo12671L(m12745a, (AbstractC3290f) obj);
            return;
        }
        if (m12746b != 3) {
            if (m12746b != 5) {
                throw new RuntimeException(C3313v.m12845e());
            }
            interfaceC3303l0.mo12691d(m12745a, ((Integer) obj).intValue());
        } else if (interfaceC3303l0.mo12701i() == InterfaceC3303l0.a.ASCENDING) {
            interfaceC3303l0.mo12710q(m12745a);
            ((C3293g0) obj).m12462r(interfaceC3303l0);
            interfaceC3303l0.mo12661B(m12745a);
        } else {
            interfaceC3303l0.mo12661B(m12745a);
            ((C3293g0) obj).m12462r(interfaceC3303l0);
            interfaceC3303l0.mo12710q(m12745a);
        }
    }

    /* renamed from: a */
    public void m12453a() {
        if (!this.f10488e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void m12454b(int i7) {
        int[] iArr = this.f10485b;
        if (i7 > iArr.length) {
            int i8 = this.f10484a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f10485b = Arrays.copyOf(iArr, i7);
            this.f10486c = Arrays.copyOf(this.f10486c, i7);
        }
    }

    /* renamed from: d */
    public int m12455d() {
        int m12508R;
        int i7 = this.f10487d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f10484a; i9++) {
            int i10 = this.f10485b[i9];
            int m12745a = AbstractC3301k0.m12745a(i10);
            int m12746b = AbstractC3301k0.m12746b(i10);
            if (m12746b == 0) {
                m12508R = AbstractC3296i.m12508R(m12745a, ((Long) this.f10486c[i9]).longValue());
            } else if (m12746b == 1) {
                m12508R = AbstractC3296i.m12525n(m12745a, ((Long) this.f10486c[i9]).longValue());
            } else if (m12746b == 2) {
                m12508R = AbstractC3296i.m12517f(m12745a, (AbstractC3290f) this.f10486c[i9]);
            } else if (m12746b == 3) {
                m12508R = (AbstractC3296i.m12505O(m12745a) * 2) + ((C3293g0) this.f10486c[i9]).m12455d();
            } else {
                if (m12746b != 5) {
                    throw new IllegalStateException(C3313v.m12845e());
                }
                m12508R = AbstractC3296i.m12523l(m12745a, ((Integer) this.f10486c[i9]).intValue());
            }
            i8 += m12508R;
        }
        this.f10487d = i8;
        return i8;
    }

    /* renamed from: e */
    public int m12456e() {
        int i7 = this.f10487d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f10484a; i9++) {
            i8 += AbstractC3296i.m12494D(AbstractC3301k0.m12745a(this.f10485b[i9]), (AbstractC3290f) this.f10486c[i9]);
        }
        this.f10487d = i8;
        return i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3293g0)) {
            return false;
        }
        C3293g0 c3293g0 = (C3293g0) obj;
        int i7 = this.f10484a;
        return i7 == c3293g0.f10484a && m12451o(this.f10485b, c3293g0.f10485b, i7) && m12450l(this.f10486c, c3293g0.f10486c, this.f10484a);
    }

    /* renamed from: h */
    public void m12457h() {
        if (this.f10488e) {
            this.f10488e = false;
        }
    }

    public int hashCode() {
        int i7 = this.f10484a;
        return ((((527 + i7) * 31) + m12446f(this.f10485b, i7)) * 31) + m12447g(this.f10486c, this.f10484a);
    }

    /* renamed from: i */
    public C3293g0 m12458i(C3293g0 c3293g0) {
        if (c3293g0.equals(m12445c())) {
            return this;
        }
        m12453a();
        int i7 = this.f10484a + c3293g0.f10484a;
        m12454b(i7);
        System.arraycopy(c3293g0.f10485b, 0, this.f10485b, this.f10484a, c3293g0.f10484a);
        System.arraycopy(c3293g0.f10486c, 0, this.f10486c, this.f10484a, c3293g0.f10484a);
        this.f10484a = i7;
        return this;
    }

    /* renamed from: m */
    public final void m12459m(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f10484a; i8++) {
            AbstractC3266L.m12102d(sb, i7, String.valueOf(AbstractC3301k0.m12745a(this.f10485b[i8])), this.f10486c[i8]);
        }
    }

    /* renamed from: n */
    public void m12460n(int i7, Object obj) {
        m12453a();
        m12454b(this.f10484a + 1);
        int[] iArr = this.f10485b;
        int i8 = this.f10484a;
        iArr[i8] = i7;
        this.f10486c[i8] = obj;
        this.f10484a = i8 + 1;
    }

    /* renamed from: p */
    public void m12461p(InterfaceC3303l0 interfaceC3303l0) {
        if (interfaceC3303l0.mo12701i() == InterfaceC3303l0.a.DESCENDING) {
            for (int i7 = this.f10484a - 1; i7 >= 0; i7--) {
                interfaceC3303l0.mo12689c(AbstractC3301k0.m12745a(this.f10485b[i7]), this.f10486c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f10484a; i8++) {
            interfaceC3303l0.mo12689c(AbstractC3301k0.m12745a(this.f10485b[i8]), this.f10486c[i8]);
        }
    }

    /* renamed from: r */
    public void m12462r(InterfaceC3303l0 interfaceC3303l0) {
        if (this.f10484a == 0) {
            return;
        }
        if (interfaceC3303l0.mo12701i() == InterfaceC3303l0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f10484a; i7++) {
                m12452q(this.f10485b[i7], this.f10486c[i7], interfaceC3303l0);
            }
            return;
        }
        for (int i8 = this.f10484a - 1; i8 >= 0; i8--) {
            m12452q(this.f10485b[i8], this.f10486c[i8], interfaceC3303l0);
        }
    }

    public C3293g0(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f10487d = -1;
        this.f10484a = i7;
        this.f10485b = iArr;
        this.f10486c = objArr;
        this.f10488e = z6;
    }
}
