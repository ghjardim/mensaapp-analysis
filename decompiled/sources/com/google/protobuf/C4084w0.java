package com.google.protobuf;

import com.google.protobuf.InterfaceC4016C0;
import java.util.Arrays;

/* renamed from: com.google.protobuf.w0 */
/* loaded from: classes.dex */
public final class C4084w0 {

    /* renamed from: f */
    public static final C4084w0 f13589f = new C4084w0(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f13590a;

    /* renamed from: b */
    public int[] f13591b;

    /* renamed from: c */
    public Object[] f13592c;

    /* renamed from: d */
    public int f13593d;

    /* renamed from: e */
    public boolean f13594e;

    public C4084w0() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C4084w0 m16986c() {
        return f13589f;
    }

    /* renamed from: f */
    public static int m16987f(int[] iArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        return i8;
    }

    /* renamed from: g */
    public static int m16988g(Object[] objArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + objArr[i9].hashCode();
        }
        return i8;
    }

    /* renamed from: j */
    public static C4084w0 m16989j(C4084w0 c4084w0, C4084w0 c4084w02) {
        int i7 = c4084w0.f13590a + c4084w02.f13590a;
        int[] copyOf = Arrays.copyOf(c4084w0.f13591b, i7);
        System.arraycopy(c4084w02.f13591b, 0, copyOf, c4084w0.f13590a, c4084w02.f13590a);
        Object[] copyOf2 = Arrays.copyOf(c4084w0.f13592c, i7);
        System.arraycopy(c4084w02.f13592c, 0, copyOf2, c4084w0.f13590a, c4084w02.f13590a);
        return new C4084w0(i7, copyOf, copyOf2, true);
    }

    /* renamed from: k */
    public static C4084w0 m16990k() {
        return new C4084w0();
    }

    /* renamed from: l */
    public static boolean m16991l(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m16992o(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static void m16993q(int i7, Object obj, InterfaceC4016C0 interfaceC4016C0) {
        int m16178a = AbstractC4014B0.m16178a(i7);
        int m16179b = AbstractC4014B0.m16179b(i7);
        if (m16179b == 0) {
            interfaceC4016C0.mo16224n(m16178a, ((Long) obj).longValue());
            return;
        }
        if (m16179b == 1) {
            interfaceC4016C0.mo16218h(m16178a, ((Long) obj).longValue());
            return;
        }
        if (m16179b == 2) {
            interfaceC4016C0.mo16209N(m16178a, (AbstractC4055i) obj);
            return;
        }
        if (m16179b != 3) {
            if (m16179b != 5) {
                throw new RuntimeException(C4017D.m16240e());
            }
            interfaceC4016C0.mo16214d(m16178a, ((Integer) obj).intValue());
        } else if (interfaceC4016C0.mo16219i() == InterfaceC4016C0.a.ASCENDING) {
            interfaceC4016C0.mo16227q(m16178a);
            ((C4084w0) obj).m17003r(interfaceC4016C0);
            interfaceC4016C0.mo16197B(m16178a);
        } else {
            interfaceC4016C0.mo16197B(m16178a);
            ((C4084w0) obj).m17003r(interfaceC4016C0);
            interfaceC4016C0.mo16227q(m16178a);
        }
    }

    /* renamed from: a */
    public void m16994a() {
        if (!this.f13594e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void m16995b(int i7) {
        int[] iArr = this.f13591b;
        if (i7 > iArr.length) {
            int i8 = this.f13590a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f13591b = Arrays.copyOf(iArr, i7);
            this.f13592c = Arrays.copyOf(this.f13592c, i7);
        }
    }

    /* renamed from: d */
    public int m16996d() {
        int m16701T;
        int i7 = this.f13593d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f13590a; i9++) {
            int i10 = this.f13591b[i9];
            int m16178a = AbstractC4014B0.m16178a(i10);
            int m16179b = AbstractC4014B0.m16179b(i10);
            if (m16179b == 0) {
                m16701T = AbstractC4061l.m16701T(m16178a, ((Long) this.f13592c[i9]).longValue());
            } else if (m16179b == 1) {
                m16701T = AbstractC4061l.m16720p(m16178a, ((Long) this.f13592c[i9]).longValue());
            } else if (m16179b == 2) {
                m16701T = AbstractC4061l.m16712h(m16178a, (AbstractC4055i) this.f13592c[i9]);
            } else if (m16179b == 3) {
                m16701T = (AbstractC4061l.m16698Q(m16178a) * 2) + ((C4084w0) this.f13592c[i9]).m16996d();
            } else {
                if (m16179b != 5) {
                    throw new IllegalStateException(C4017D.m16240e());
                }
                m16701T = AbstractC4061l.m16718n(m16178a, ((Integer) this.f13592c[i9]).intValue());
            }
            i8 += m16701T;
        }
        this.f13593d = i8;
        return i8;
    }

    /* renamed from: e */
    public int m16997e() {
        int i7 = this.f13593d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f13590a; i9++) {
            i8 += AbstractC4061l.m16687F(AbstractC4014B0.m16178a(this.f13591b[i9]), (AbstractC4055i) this.f13592c[i9]);
        }
        this.f13593d = i8;
        return i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4084w0)) {
            return false;
        }
        C4084w0 c4084w0 = (C4084w0) obj;
        int i7 = this.f13590a;
        return i7 == c4084w0.f13590a && m16992o(this.f13591b, c4084w0.f13591b, i7) && m16991l(this.f13592c, c4084w0.f13592c, this.f13590a);
    }

    /* renamed from: h */
    public void m16998h() {
        if (this.f13594e) {
            this.f13594e = false;
        }
    }

    public int hashCode() {
        int i7 = this.f13590a;
        return ((((527 + i7) * 31) + m16987f(this.f13591b, i7)) * 31) + m16988g(this.f13592c, this.f13590a);
    }

    /* renamed from: i */
    public C4084w0 m16999i(C4084w0 c4084w0) {
        if (c4084w0.equals(m16986c())) {
            return this;
        }
        m16994a();
        int i7 = this.f13590a + c4084w0.f13590a;
        m16995b(i7);
        System.arraycopy(c4084w0.f13591b, 0, this.f13591b, this.f13590a, c4084w0.f13590a);
        System.arraycopy(c4084w0.f13592c, 0, this.f13592c, this.f13590a, c4084w0.f13590a);
        this.f13590a = i7;
        return this;
    }

    /* renamed from: m */
    public final void m17000m(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f13590a; i8++) {
            AbstractC4036X.m16327d(sb, i7, String.valueOf(AbstractC4014B0.m16178a(this.f13591b[i8])), this.f13592c[i8]);
        }
    }

    /* renamed from: n */
    public void m17001n(int i7, Object obj) {
        m16994a();
        m16995b(this.f13590a + 1);
        int[] iArr = this.f13591b;
        int i8 = this.f13590a;
        iArr[i8] = i7;
        this.f13592c[i8] = obj;
        this.f13590a = i8 + 1;
    }

    /* renamed from: p */
    public void m17002p(InterfaceC4016C0 interfaceC4016C0) {
        if (interfaceC4016C0.mo16219i() == InterfaceC4016C0.a.DESCENDING) {
            for (int i7 = this.f13590a - 1; i7 >= 0; i7--) {
                interfaceC4016C0.mo16213c(AbstractC4014B0.m16178a(this.f13591b[i7]), this.f13592c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f13590a; i8++) {
            interfaceC4016C0.mo16213c(AbstractC4014B0.m16178a(this.f13591b[i8]), this.f13592c[i8]);
        }
    }

    /* renamed from: r */
    public void m17003r(InterfaceC4016C0 interfaceC4016C0) {
        if (this.f13590a == 0) {
            return;
        }
        if (interfaceC4016C0.mo16219i() == InterfaceC4016C0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f13590a; i7++) {
                m16993q(this.f13591b[i7], this.f13592c[i7], interfaceC4016C0);
            }
            return;
        }
        for (int i8 = this.f13590a - 1; i8 >= 0; i8--) {
            m16993q(this.f13591b[i8], this.f13592c[i8], interfaceC4016C0);
        }
    }

    public C4084w0(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f13593d = -1;
        this.f13590a = i7;
        this.f13591b = iArr;
        this.f13592c = objArr;
        this.f13594e = z6;
    }
}
