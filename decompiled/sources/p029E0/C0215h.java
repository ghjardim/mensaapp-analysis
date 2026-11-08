package p029E0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p022D0.C0143b0;
import p022D0.C0179y;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0145c0;
import p022D0.InterfaceC0147d0;
import p050H0.C0545n;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p232g0.C4327q;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;

/* renamed from: E0.h */
/* loaded from: classes.dex */
public class C0215h implements InterfaceC0145c0, InterfaceC0147d0, C0545n.b, C0545n.f {

    /* renamed from: A */
    public long f883A;

    /* renamed from: B */
    public int f884B;

    /* renamed from: C */
    public AbstractC0208a f885C;

    /* renamed from: D */
    public boolean f886D;

    /* renamed from: a */
    public final int f887a;

    /* renamed from: b */
    public final int[] f888b;

    /* renamed from: c */
    public final C4327q[] f889c;

    /* renamed from: d */
    public final boolean[] f890d;

    /* renamed from: e */
    public final InterfaceC0216i f891e;

    /* renamed from: f */
    public final InterfaceC0147d0.a f892f;

    /* renamed from: n */
    public final InterfaceC0127M.a f893n;

    /* renamed from: o */
    public final InterfaceC0544m f894o;

    /* renamed from: p */
    public final C0545n f895p;

    /* renamed from: q */
    public final C0214g f896q;

    /* renamed from: r */
    public final ArrayList f897r;

    /* renamed from: s */
    public final List f898s;

    /* renamed from: t */
    public final C0143b0 f899t;

    /* renamed from: u */
    public final C0143b0[] f900u;

    /* renamed from: v */
    public final C0210c f901v;

    /* renamed from: w */
    public AbstractC0212e f902w;

    /* renamed from: x */
    public C4327q f903x;

    /* renamed from: y */
    public b f904y;

    /* renamed from: z */
    public long f905z;

    /* renamed from: E0.h$b */
    public interface b {
        /* renamed from: i */
        void mo904i(C0215h c0215h);
    }

    public C0215h(int i7, int[] iArr, C4327q[] c4327qArr, InterfaceC0216i interfaceC0216i, InterfaceC0147d0.a aVar, InterfaceC0533b interfaceC0533b, long j7, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar2, InterfaceC0544m interfaceC0544m, InterfaceC0127M.a aVar3) {
        this.f887a = i7;
        int i8 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f888b = iArr;
        this.f889c = c4327qArr == null ? new C4327q[0] : c4327qArr;
        this.f891e = interfaceC0216i;
        this.f892f = aVar;
        this.f893n = aVar3;
        this.f894o = interfaceC0544m;
        this.f895p = new C0545n("ChunkSampleStream");
        this.f896q = new C0214g();
        ArrayList arrayList = new ArrayList();
        this.f897r = arrayList;
        this.f898s = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f900u = new C0143b0[length];
        this.f890d = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        C0143b0[] c0143b0Arr = new C0143b0[i9];
        C0143b0 m531k = C0143b0.m531k(interfaceC0533b, interfaceC6364x, aVar2);
        this.f899t = m531k;
        iArr2[0] = i7;
        c0143b0Arr[0] = m531k;
        while (i8 < length) {
            C0143b0 m532l = C0143b0.m532l(interfaceC0533b);
            this.f900u[i8] = m532l;
            int i10 = i8 + 1;
            c0143b0Arr[i10] = m532l;
            iArr2[i10] = this.f888b[i8];
            i8 = i10;
        }
        this.f901v = new C0210c(iArr2, c0143b0Arr);
        this.f905z = j7;
        this.f883A = j7;
    }

    /* renamed from: C */
    private void m876C(int i7) {
        AbstractC5332a.m21802g(!this.f895p.m2101j());
        int size = this.f897r.size();
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (!m888G(i7)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        long j7 = m887F().f879h;
        AbstractC0208a m885D = m885D(i7);
        if (this.f897r.isEmpty()) {
            this.f905z = this.f883A;
        }
        this.f886D = false;
        this.f893n.m361C(this.f887a, m885D.f878g, j7);
    }

    /* renamed from: H */
    private boolean m877H(AbstractC0212e abstractC0212e) {
        return abstractC0212e instanceof AbstractC0208a;
    }

    /* renamed from: R */
    private void m878R() {
        this.f899t.m554W();
        for (C0143b0 c0143b0 : this.f900u) {
            c0143b0.m554W();
        }
    }

    /* renamed from: B */
    public final void m884B(int i7) {
        int min = Math.min(m895O(i7, 0), this.f884B);
        if (min > 0) {
            AbstractC5330M.m21714V0(this.f897r, 0, min);
            this.f884B -= min;
        }
    }

    /* renamed from: D */
    public final AbstractC0208a m885D(int i7) {
        AbstractC0208a abstractC0208a = (AbstractC0208a) this.f897r.get(i7);
        ArrayList arrayList = this.f897r;
        AbstractC5330M.m21714V0(arrayList, i7, arrayList.size());
        this.f884B = Math.max(this.f884B, this.f897r.size());
        int i8 = 0;
        this.f899t.m583u(abstractC0208a.m849i(0));
        while (true) {
            C0143b0[] c0143b0Arr = this.f900u;
            if (i8 >= c0143b0Arr.length) {
                return abstractC0208a;
            }
            C0143b0 c0143b0 = c0143b0Arr[i8];
            i8++;
            c0143b0.m583u(abstractC0208a.m849i(i8));
        }
    }

    /* renamed from: E */
    public InterfaceC0216i m886E() {
        return this.f891e;
    }

    /* renamed from: F */
    public final AbstractC0208a m887F() {
        return (AbstractC0208a) this.f897r.get(r0.size() - 1);
    }

    /* renamed from: G */
    public final boolean m888G(int i7) {
        int m536D;
        AbstractC0208a abstractC0208a = (AbstractC0208a) this.f897r.get(i7);
        if (this.f899t.m536D() > abstractC0208a.m849i(0)) {
            return true;
        }
        int i8 = 0;
        do {
            C0143b0[] c0143b0Arr = this.f900u;
            if (i8 >= c0143b0Arr.length) {
                return false;
            }
            m536D = c0143b0Arr[i8].m536D();
            i8++;
        } while (m536D <= abstractC0208a.m849i(i8));
        return true;
    }

    /* renamed from: I */
    public boolean m889I() {
        return this.f905z != -9223372036854775807L;
    }

    /* renamed from: J */
    public final void m890J() {
        int m895O = m895O(this.f899t.m536D(), this.f884B - 1);
        while (true) {
            int i7 = this.f884B;
            if (i7 > m895O) {
                return;
            }
            this.f884B = i7 + 1;
            m891K(i7);
        }
    }

    /* renamed from: K */
    public final void m891K(int i7) {
        AbstractC0208a abstractC0208a = (AbstractC0208a) this.f897r.get(i7);
        C4327q c4327q = abstractC0208a.f875d;
        if (!c4327q.equals(this.f903x)) {
            this.f893n.m365h(this.f887a, c4327q, abstractC0208a.f876e, abstractC0208a.f877f, abstractC0208a.f878g);
        }
        this.f903x = c4327q;
    }

    @Override // p050H0.C0545n.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo468k(AbstractC0212e abstractC0212e, long j7, long j8, boolean z6) {
        this.f902w = null;
        this.f885C = null;
        C0179y c0179y = new C0179y(abstractC0212e.f872a, abstractC0212e.f873b, abstractC0212e.m873f(), abstractC0212e.m872e(), j7, j8, abstractC0212e.m870a());
        this.f894o.mo2086b(abstractC0212e.f872a);
        this.f893n.m374q(c0179y, abstractC0212e.f874c, this.f887a, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, abstractC0212e.f878g, abstractC0212e.f879h);
        if (z6) {
            return;
        }
        if (m889I()) {
            m878R();
        } else if (m877H(abstractC0212e)) {
            m885D(this.f897r.size() - 1);
            if (this.f897r.isEmpty()) {
                this.f905z = this.f883A;
            }
        }
        this.f892f.mo386b(this);
    }

    @Override // p050H0.C0545n.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo473r(AbstractC0212e abstractC0212e, long j7, long j8) {
        this.f902w = null;
        this.f891e.mo907d(abstractC0212e);
        C0179y c0179y = new C0179y(abstractC0212e.f872a, abstractC0212e.f873b, abstractC0212e.m873f(), abstractC0212e.m872e(), j7, j8, abstractC0212e.m870a());
        this.f894o.mo2086b(abstractC0212e.f872a);
        this.f893n.m377t(c0179y, abstractC0212e.f874c, this.f887a, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, abstractC0212e.f878g, abstractC0212e.f879h);
        this.f892f.mo386b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    @Override // p050H0.C0545n.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p050H0.C0545n.c mo471m(p029E0.AbstractC0212e r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p029E0.C0215h.mo471m(E0.e, long, long, java.io.IOException, int):H0.n$c");
    }

    /* renamed from: O */
    public final int m895O(int i7, int i8) {
        do {
            i8++;
            if (i8 >= this.f897r.size()) {
                return this.f897r.size() - 1;
            }
        } while (((AbstractC0208a) this.f897r.get(i8)).m849i(0) <= i7);
        return i8 - 1;
    }

    /* renamed from: P */
    public void m896P() {
        m897Q(null);
    }

    /* renamed from: Q */
    public void m897Q(b bVar) {
        this.f904y = bVar;
        this.f899t.m550S();
        for (C0143b0 c0143b0 : this.f900u) {
            c0143b0.m550S();
        }
        this.f895p.m2104m(this);
    }

    /* renamed from: S */
    public void m898S(long j7) {
        AbstractC0208a abstractC0208a;
        this.f883A = j7;
        if (m889I()) {
            this.f905z = j7;
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f897r.size(); i8++) {
            abstractC0208a = (AbstractC0208a) this.f897r.get(i8);
            long j8 = abstractC0208a.f878g;
            if (j8 == j7 && abstractC0208a.f843k == -9223372036854775807L) {
                break;
            } else {
                if (j8 > j7) {
                    break;
                }
            }
        }
        abstractC0208a = null;
        if (abstractC0208a != null ? this.f899t.m557Z(abstractC0208a.m849i(0)) : this.f899t.m559a0(j7, j7 < mo309a())) {
            this.f884B = m895O(this.f899t.m536D(), 0);
            C0143b0[] c0143b0Arr = this.f900u;
            int length = c0143b0Arr.length;
            while (i7 < length) {
                c0143b0Arr[i7].m559a0(j7, true);
                i7++;
            }
            return;
        }
        this.f905z = j7;
        this.f886D = false;
        this.f897r.clear();
        this.f884B = 0;
        if (!this.f895p.m2101j()) {
            this.f895p.m2099g();
            m878R();
            return;
        }
        this.f899t.m580r();
        C0143b0[] c0143b0Arr2 = this.f900u;
        int length2 = c0143b0Arr2.length;
        while (i7 < length2) {
            c0143b0Arr2[i7].m580r();
            i7++;
        }
        this.f895p.m2098f();
    }

    /* renamed from: T */
    public a m899T(long j7, int i7) {
        for (int i8 = 0; i8 < this.f900u.length; i8++) {
            if (this.f888b[i8] == i7) {
                AbstractC5332a.m21802g(!this.f890d[i8]);
                this.f890d[i8] = true;
                this.f900u[i8].m559a0(j7, true);
                return new a(this, this.f900u[i8], i8);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        if (m889I()) {
            return this.f905z;
        }
        if (this.f886D) {
            return Long.MIN_VALUE;
        }
        return m887F().f879h;
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: b */
    public boolean mo487b() {
        return !m889I() && this.f899t.m544L(this.f886D);
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: c */
    public void mo488c() {
        this.f895p.mo2097c();
        this.f899t.m546O();
        if (this.f895p.m2101j()) {
            return;
        }
        this.f891e.mo906c();
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f895p.m2101j();
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        List list;
        long j7;
        if (this.f886D || this.f895p.m2101j() || this.f895p.m2100i()) {
            return false;
        }
        boolean m889I = m889I();
        if (m889I) {
            list = Collections.emptyList();
            j7 = this.f905z;
        } else {
            list = this.f898s;
            j7 = m887F().f879h;
        }
        this.f891e.mo908f(c5762v0, j7, list, this.f896q);
        C0214g c0214g = this.f896q;
        boolean z6 = c0214g.f882b;
        AbstractC0212e abstractC0212e = c0214g.f881a;
        c0214g.m874a();
        if (z6) {
            this.f905z = -9223372036854775807L;
            this.f886D = true;
            return true;
        }
        if (abstractC0212e == null) {
            return false;
        }
        this.f902w = abstractC0212e;
        if (m877H(abstractC0212e)) {
            AbstractC0208a abstractC0208a = (AbstractC0208a) abstractC0212e;
            if (m889I) {
                long j8 = abstractC0208a.f878g;
                long j9 = this.f905z;
                if (j8 != j9) {
                    this.f899t.m563c0(j9);
                    for (C0143b0 c0143b0 : this.f900u) {
                        c0143b0.m563c0(this.f905z);
                    }
                }
                this.f905z = -9223372036854775807L;
            }
            abstractC0208a.m851k(this.f901v);
            this.f897r.add(abstractC0208a);
        } else if (abstractC0212e instanceof C0219l) {
            ((C0219l) abstractC0212e).m919g(this.f901v);
        }
        this.f893n.m383z(new C0179y(abstractC0212e.f872a, abstractC0212e.f873b, this.f895p.m2105n(abstractC0212e, this, this.f894o.mo2088d(abstractC0212e.f874c))), abstractC0212e.f874c, this.f887a, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, abstractC0212e.f878g, abstractC0212e.f879h);
        return true;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        if (this.f886D) {
            return Long.MIN_VALUE;
        }
        if (m889I()) {
            return this.f905z;
        }
        long j7 = this.f883A;
        AbstractC0208a m887F = m887F();
        if (!m887F.mo913h()) {
            if (this.f897r.size() > 1) {
                m887F = (AbstractC0208a) this.f897r.get(r2.size() - 2);
            } else {
                m887F = null;
            }
        }
        if (m887F != null) {
            j7 = Math.max(j7, m887F.f879h);
        }
        return Math.max(j7, this.f899t.m533A());
    }

    /* renamed from: g */
    public long m900g(long j7, C5714a1 c5714a1) {
        return this.f891e.mo909g(j7, c5714a1);
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        if (this.f895p.m2100i() || m889I()) {
            return;
        }
        if (!this.f895p.m2101j()) {
            int mo910i = this.f891e.mo910i(j7, this.f898s);
            if (mo910i < this.f897r.size()) {
                m876C(mo910i);
                return;
            }
            return;
        }
        AbstractC0212e abstractC0212e = (AbstractC0212e) AbstractC5332a.m21800e(this.f902w);
        if (!(m877H(abstractC0212e) && m888G(this.f897r.size() - 1)) && this.f891e.mo905b(j7, abstractC0212e, this.f898s)) {
            this.f895p.m2098f();
            if (m877H(abstractC0212e)) {
                this.f885C = (AbstractC0208a) abstractC0212e;
            }
        }
    }

    @Override // p050H0.C0545n.f
    /* renamed from: i */
    public void mo464i() {
        this.f899t.m552U();
        for (C0143b0 c0143b0 : this.f900u) {
            c0143b0.m552U();
        }
        this.f891e.release();
        b bVar = this.f904y;
        if (bVar != null) {
            bVar.mo904i(this);
        }
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: j */
    public int mo489j(long j7) {
        if (m889I()) {
            return 0;
        }
        int m538F = this.f899t.m538F(j7, this.f886D);
        AbstractC0208a abstractC0208a = this.f885C;
        if (abstractC0208a != null) {
            m538F = Math.min(m538F, abstractC0208a.m849i(0) - this.f899t.m536D());
        }
        this.f899t.m569f0(m538F);
        m890J();
        return m538F;
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: q */
    public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
        if (m889I()) {
            return -3;
        }
        AbstractC0208a abstractC0208a = this.f885C;
        if (abstractC0208a != null && abstractC0208a.m849i(0) <= this.f899t.m536D()) {
            return -3;
        }
        m890J();
        return this.f899t.m551T(c5756s0, c5561i, i7, this.f886D);
    }

    /* renamed from: u */
    public void m901u(long j7, boolean z6) {
        if (m889I()) {
            return;
        }
        int m587y = this.f899t.m587y();
        this.f899t.m579q(j7, z6, true);
        int m587y2 = this.f899t.m587y();
        if (m587y2 > m587y) {
            long m588z = this.f899t.m588z();
            int i7 = 0;
            while (true) {
                C0143b0[] c0143b0Arr = this.f900u;
                if (i7 >= c0143b0Arr.length) {
                    break;
                }
                c0143b0Arr[i7].m579q(m588z, z6, this.f890d[i7]);
                i7++;
            }
        }
        m884B(m587y2);
    }

    /* renamed from: E0.h$a */
    public final class a implements InterfaceC0145c0 {

        /* renamed from: a */
        public final C0215h f906a;

        /* renamed from: b */
        public final C0143b0 f907b;

        /* renamed from: c */
        public final int f908c;

        /* renamed from: d */
        public boolean f909d;

        public a(C0215h c0215h, C0143b0 c0143b0, int i7) {
            this.f906a = c0215h;
            this.f907b = c0143b0;
            this.f908c = i7;
        }

        /* renamed from: a */
        private void m902a() {
            if (this.f909d) {
                return;
            }
            C0215h.this.f893n.m365h(C0215h.this.f888b[this.f908c], C0215h.this.f889c[this.f908c], 0, null, C0215h.this.f883A);
            this.f909d = true;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: b */
        public boolean mo487b() {
            return !C0215h.this.m889I() && this.f907b.m544L(C0215h.this.f886D);
        }

        /* renamed from: d */
        public void m903d() {
            AbstractC5332a.m21802g(C0215h.this.f890d[this.f908c]);
            C0215h.this.f890d[this.f908c] = false;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: j */
        public int mo489j(long j7) {
            if (C0215h.this.m889I()) {
                return 0;
            }
            int m538F = this.f907b.m538F(j7, C0215h.this.f886D);
            if (C0215h.this.f885C != null) {
                m538F = Math.min(m538F, C0215h.this.f885C.m849i(this.f908c + 1) - this.f907b.m536D());
            }
            this.f907b.m569f0(m538F);
            if (m538F > 0) {
                m902a();
            }
            return m538F;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: q */
        public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
            if (C0215h.this.m889I()) {
                return -3;
            }
            if (C0215h.this.f885C != null && C0215h.this.f885C.m849i(this.f908c + 1) <= this.f907b.m536D()) {
                return -3;
            }
            m902a();
            return this.f907b.m551T(c5756s0, c5561i, i7, C0215h.this.f886D);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: c */
        public void mo488c() {
        }
    }
}
