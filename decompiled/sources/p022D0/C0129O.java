package p022D0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p022D0.InterfaceC0117C;
import p029E0.AbstractC0212e;
import p029E0.InterfaceC0221n;
import p043G0.InterfaceC0375y;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC2990D;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p292n0.C5714a1;
import p292n0.C5762v0;

/* renamed from: D0.O */
/* loaded from: classes.dex */
public final class C0129O implements InterfaceC0117C, InterfaceC0117C.a {

    /* renamed from: a */
    public final InterfaceC0117C[] f402a;

    /* renamed from: c */
    public final InterfaceC0158j f404c;

    /* renamed from: f */
    public InterfaceC0117C.a f407f;

    /* renamed from: n */
    public C0165m0 f408n;

    /* renamed from: p */
    public InterfaceC0147d0 f410p;

    /* renamed from: d */
    public final ArrayList f405d = new ArrayList();

    /* renamed from: e */
    public final HashMap f406e = new HashMap();

    /* renamed from: b */
    public final IdentityHashMap f403b = new IdentityHashMap();

    /* renamed from: o */
    public InterfaceC0117C[] f409o = new InterfaceC0117C[0];

    /* renamed from: D0.O$a */
    public static final class a implements InterfaceC0375y {

        /* renamed from: a */
        public final InterfaceC0375y f411a;

        /* renamed from: b */
        public final C4304J f412b;

        public a(InterfaceC0375y interfaceC0375y, C4304J c4304j) {
            this.f411a = interfaceC0375y;
            this.f412b = c4304j;
        }

        @Override // p043G0.InterfaceC0347B
        /* renamed from: a */
        public C4304J mo389a() {
            return this.f412b;
        }

        @Override // p043G0.InterfaceC0347B
        /* renamed from: b */
        public C4327q mo390b(int i7) {
            return this.f412b.m18064a(this.f411a.mo391c(i7));
        }

        @Override // p043G0.InterfaceC0347B
        /* renamed from: c */
        public int mo391c(int i7) {
            return this.f411a.mo391c(i7);
        }

        @Override // p043G0.InterfaceC0347B
        /* renamed from: d */
        public int mo392d(C4327q c4327q) {
            return this.f411a.mo393e(this.f412b.m18065b(c4327q));
        }

        @Override // p043G0.InterfaceC0347B
        /* renamed from: e */
        public int mo393e(int i7) {
            return this.f411a.mo393e(i7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f411a.equals(aVar.f411a) && this.f412b.equals(aVar.f412b);
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: h */
        public void mo394h() {
            this.f411a.mo394h();
        }

        public int hashCode() {
            return ((527 + this.f412b.hashCode()) * 31) + this.f411a.hashCode();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: i */
        public boolean mo395i(int i7, long j7) {
            return this.f411a.mo395i(i7, j7);
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: j */
        public boolean mo396j(long j7, AbstractC0212e abstractC0212e, List list) {
            return this.f411a.mo396j(j7, abstractC0212e, list);
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: k */
        public int mo397k() {
            return this.f411a.mo397k();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: l */
        public void mo398l(boolean z6) {
            this.f411a.mo398l(z6);
        }

        @Override // p043G0.InterfaceC0347B
        public int length() {
            return this.f411a.length();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: m */
        public void mo399m() {
            this.f411a.mo399m();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: n */
        public void mo400n(long j7, long j8, long j9, List list, InterfaceC0221n[] interfaceC0221nArr) {
            this.f411a.mo400n(j7, j8, j9, list, interfaceC0221nArr);
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: o */
        public int mo401o(long j7, List list) {
            return this.f411a.mo401o(j7, list);
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: p */
        public int mo402p() {
            return this.f411a.mo402p();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: q */
        public C4327q mo403q() {
            return this.f412b.m18064a(this.f411a.mo402p());
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: r */
        public int mo404r() {
            return this.f411a.mo404r();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: s */
        public boolean mo405s(int i7, long j7) {
            return this.f411a.mo405s(i7, j7);
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: t */
        public void mo406t(float f7) {
            this.f411a.mo406t(f7);
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: u */
        public Object mo407u() {
            return this.f411a.mo407u();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: v */
        public void mo408v() {
            this.f411a.mo408v();
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: w */
        public void mo409w() {
            this.f411a.mo409w();
        }
    }

    public C0129O(InterfaceC0158j interfaceC0158j, long[] jArr, InterfaceC0117C... interfaceC0117CArr) {
        this.f404c = interfaceC0158j;
        this.f402a = interfaceC0117CArr;
        this.f410p = interfaceC0158j.mo643b();
        for (int i7 = 0; i7 < interfaceC0117CArr.length; i7++) {
            long j7 = jArr[i7];
            if (j7 != 0) {
                this.f402a[i7] = new C0159j0(interfaceC0117CArr[i7], j7);
            }
        }
    }

    /* renamed from: q */
    public static /* synthetic */ List m385q(InterfaceC0117C interfaceC0117C) {
        return interfaceC0117C.mo320t().m654c();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return this.f410p.mo309a();
    }

    @Override // p022D0.InterfaceC0117C.a
    /* renamed from: c */
    public void mo322c(InterfaceC0117C interfaceC0117C) {
        this.f405d.remove(interfaceC0117C);
        if (!this.f405d.isEmpty()) {
            return;
        }
        int i7 = 0;
        for (InterfaceC0117C interfaceC0117C2 : this.f402a) {
            i7 += interfaceC0117C2.mo320t().f685a;
        }
        C4304J[] c4304jArr = new C4304J[i7];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            InterfaceC0117C[] interfaceC0117CArr = this.f402a;
            if (i8 >= interfaceC0117CArr.length) {
                this.f408n = new C0165m0(c4304jArr);
                ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f407f)).mo322c(this);
                return;
            }
            C0165m0 mo320t = interfaceC0117CArr[i8].mo320t();
            int i10 = mo320t.f685a;
            int i11 = 0;
            while (i11 < i10) {
                C4304J m653b = mo320t.m653b(i11);
                C4327q[] c4327qArr = new C4327q[m653b.f14850a];
                for (int i12 = 0; i12 < m653b.f14850a; i12++) {
                    C4327q m18064a = m653b.m18064a(i12);
                    C4327q.b m18193a = m18064a.m18193a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    String str = m18064a.f15125a;
                    if (str == null) {
                        str = StringUtils.EMPTY;
                    }
                    sb.append(str);
                    c4327qArr[i12] = m18193a.m18250a0(sb.toString()).m18234K();
                }
                C4304J c4304j = new C4304J(i8 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + m653b.f14851b, c4327qArr);
                this.f406e.put(c4304j, m653b);
                c4304jArr[i9] = c4304j;
                i11++;
                i9++;
            }
            i8++;
        }
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f410p.mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        if (this.f405d.isEmpty()) {
            return this.f410p.mo311e(c5762v0);
        }
        int size = this.f405d.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((InterfaceC0117C) this.f405d.get(i7)).mo311e(c5762v0);
        }
        return false;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        return this.f410p.mo312f();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        InterfaceC0117C[] interfaceC0117CArr = this.f409o;
        return (interfaceC0117CArr.length > 0 ? interfaceC0117CArr[0] : this.f402a[0]).mo313g(j7, c5714a1);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        this.f410p.mo314h(j7);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        for (InterfaceC0117C interfaceC0117C : this.f402a) {
            interfaceC0117C.mo315l();
        }
    }

    /* renamed from: m */
    public InterfaceC0117C m387m(int i7) {
        InterfaceC0117C interfaceC0117C = this.f402a[i7];
        return interfaceC0117C instanceof C0159j0 ? ((C0159j0) interfaceC0117C).m644i() : interfaceC0117C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        InterfaceC0145c0 interfaceC0145c0;
        int[] iArr = new int[interfaceC0375yArr.length];
        int[] iArr2 = new int[interfaceC0375yArr.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            interfaceC0145c0 = null;
            if (i8 >= interfaceC0375yArr.length) {
                break;
            }
            InterfaceC0145c0 interfaceC0145c02 = interfaceC0145c0Arr[i8];
            Integer num = interfaceC0145c02 != null ? (Integer) this.f403b.get(interfaceC0145c02) : null;
            iArr[i8] = num == null ? -1 : num.intValue();
            InterfaceC0375y interfaceC0375y = interfaceC0375yArr[i8];
            if (interfaceC0375y != null) {
                String str = interfaceC0375y.mo389a().f14851b;
                iArr2[i8] = Integer.parseInt(str.substring(0, str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        this.f403b.clear();
        int length = interfaceC0375yArr.length;
        InterfaceC0145c0[] interfaceC0145c0Arr2 = new InterfaceC0145c0[length];
        InterfaceC0145c0[] interfaceC0145c0Arr3 = new InterfaceC0145c0[interfaceC0375yArr.length];
        InterfaceC0375y[] interfaceC0375yArr2 = new InterfaceC0375y[interfaceC0375yArr.length];
        ArrayList arrayList = new ArrayList(this.f402a.length);
        long j8 = j7;
        int i9 = 0;
        InterfaceC0375y[] interfaceC0375yArr3 = interfaceC0375yArr2;
        while (i9 < this.f402a.length) {
            for (int i10 = i7; i10 < interfaceC0375yArr.length; i10++) {
                interfaceC0145c0Arr3[i10] = iArr[i10] == i9 ? interfaceC0145c0Arr[i10] : interfaceC0145c0;
                if (iArr2[i10] == i9) {
                    InterfaceC0375y interfaceC0375y2 = (InterfaceC0375y) AbstractC5332a.m21800e(interfaceC0375yArr[i10]);
                    interfaceC0375yArr3[i10] = new a(interfaceC0375y2, (C4304J) AbstractC5332a.m21800e((C4304J) this.f406e.get(interfaceC0375y2.mo389a())));
                } else {
                    interfaceC0375yArr3[i10] = interfaceC0145c0;
                }
            }
            int i11 = i9;
            ArrayList arrayList2 = arrayList;
            InterfaceC0375y[] interfaceC0375yArr4 = interfaceC0375yArr3;
            long mo316n = this.f402a[i9].mo316n(interfaceC0375yArr3, zArr, interfaceC0145c0Arr3, zArr2, j8);
            if (i11 == 0) {
                j8 = mo316n;
            } else if (mo316n != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i12 = 0; i12 < interfaceC0375yArr.length; i12++) {
                if (iArr2[i12] == i11) {
                    InterfaceC0145c0 interfaceC0145c03 = (InterfaceC0145c0) AbstractC5332a.m21800e(interfaceC0145c0Arr3[i12]);
                    interfaceC0145c0Arr2[i12] = interfaceC0145c0Arr3[i12];
                    this.f403b.put(interfaceC0145c03, Integer.valueOf(i11));
                    z6 = true;
                } else if (iArr[i12] == i11) {
                    AbstractC5332a.m21802g(interfaceC0145c0Arr3[i12] == null);
                }
            }
            if (z6) {
                arrayList2.add(this.f402a[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            interfaceC0375yArr3 = interfaceC0375yArr4;
            i7 = 0;
            interfaceC0145c0 = null;
        }
        int i13 = i7;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC0145c0Arr2, i13, interfaceC0145c0Arr, i13, length);
        this.f409o = (InterfaceC0117C[]) arrayList3.toArray(new InterfaceC0117C[i13]);
        this.f410p = this.f404c.mo642a(arrayList3, AbstractC2990D.m10791k(arrayList3, new InterfaceC2924g() { // from class: D0.N
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                List m385q;
                m385q = C0129O.m385q((InterfaceC0117C) obj);
                return m385q;
            }
        }));
        return j8;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        long mo317o = this.f409o[0].mo317o(j7);
        int i7 = 1;
        while (true) {
            InterfaceC0117C[] interfaceC0117CArr = this.f409o;
            if (i7 >= interfaceC0117CArr.length) {
                return mo317o;
            }
            if (interfaceC0117CArr[i7].mo317o(mo317o) != mo317o) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f407f = aVar;
        Collections.addAll(this.f405d, this.f402a);
        for (InterfaceC0117C interfaceC0117C : this.f402a) {
            interfaceC0117C.mo318p(this, j7);
        }
    }

    @Override // p022D0.InterfaceC0147d0.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo386b(InterfaceC0117C interfaceC0117C) {
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f407f)).mo386b(this);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        long j7 = -9223372036854775807L;
        for (InterfaceC0117C interfaceC0117C : this.f409o) {
            long mo319s = interfaceC0117C.mo319s();
            if (mo319s != -9223372036854775807L) {
                if (j7 == -9223372036854775807L) {
                    for (InterfaceC0117C interfaceC0117C2 : this.f409o) {
                        if (interfaceC0117C2 == interfaceC0117C) {
                            break;
                        }
                        if (interfaceC0117C2.mo317o(mo319s) != mo319s) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j7 = mo319s;
                } else if (mo319s != j7) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j7 != -9223372036854775807L && interfaceC0117C.mo317o(j7) != j7) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return (C0165m0) AbstractC5332a.m21800e(this.f408n);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        for (InterfaceC0117C interfaceC0117C : this.f409o) {
            interfaceC0117C.mo321u(j7, z6);
        }
    }
}
