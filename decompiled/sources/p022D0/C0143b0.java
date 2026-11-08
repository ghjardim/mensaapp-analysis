package p022D0;

import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p022D0.C0143b0;
import p050H0.InterfaceC0533b;
import p078L0.AbstractC0860S;
import p078L0.InterfaceC0861T;
import p232g0.AbstractC4336z;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.InterfaceC4319i;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;
import p284m0.C5561i;
import p292n0.C5756s0;
import p335s0.InterfaceC6354n;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;

/* renamed from: D0.b0 */
/* loaded from: classes.dex */
public class C0143b0 implements InterfaceC0861T {

    /* renamed from: A */
    public C4327q f534A;

    /* renamed from: B */
    public C4327q f535B;

    /* renamed from: C */
    public long f536C;

    /* renamed from: E */
    public boolean f538E;

    /* renamed from: F */
    public long f539F;

    /* renamed from: G */
    public boolean f540G;

    /* renamed from: a */
    public final C0139Z f541a;

    /* renamed from: d */
    public final InterfaceC6364x f544d;

    /* renamed from: e */
    public final InterfaceC6362v.a f545e;

    /* renamed from: f */
    public d f546f;

    /* renamed from: g */
    public C4327q f547g;

    /* renamed from: h */
    public InterfaceC6354n f548h;

    /* renamed from: p */
    public int f556p;

    /* renamed from: q */
    public int f557q;

    /* renamed from: r */
    public int f558r;

    /* renamed from: s */
    public int f559s;

    /* renamed from: w */
    public boolean f563w;

    /* renamed from: z */
    public boolean f566z;

    /* renamed from: b */
    public final b f542b = new b();

    /* renamed from: i */
    public int f549i = PipesIterator.DEFAULT_QUEUE_SIZE;

    /* renamed from: j */
    public long[] f550j = new long[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: k */
    public long[] f551k = new long[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: n */
    public long[] f554n = new long[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: m */
    public int[] f553m = new int[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: l */
    public int[] f552l = new int[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: o */
    public InterfaceC0861T.a[] f555o = new InterfaceC0861T.a[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: c */
    public final C0157i0 f543c = new C0157i0(new InterfaceC5338g() { // from class: D0.a0
        @Override // p259j0.InterfaceC5338g
        public final void accept(Object obj) {
            C0143b0.m529M((C0143b0.c) obj);
        }
    });

    /* renamed from: t */
    public long f560t = Long.MIN_VALUE;

    /* renamed from: u */
    public long f561u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f562v = Long.MIN_VALUE;

    /* renamed from: y */
    public boolean f565y = true;

    /* renamed from: x */
    public boolean f564x = true;

    /* renamed from: D */
    public boolean f537D = true;

    /* renamed from: D0.b0$b */
    public static final class b {

        /* renamed from: a */
        public int f567a;

        /* renamed from: b */
        public long f568b;

        /* renamed from: c */
        public InterfaceC0861T.a f569c;
    }

    /* renamed from: D0.b0$c */
    public static final class c {

        /* renamed from: a */
        public final C4327q f570a;

        /* renamed from: b */
        public final InterfaceC6364x.b f571b;

        public c(C4327q c4327q, InterfaceC6364x.b bVar) {
            this.f570a = c4327q;
            this.f571b = bVar;
        }
    }

    /* renamed from: D0.b0$d */
    public interface d {
        /* renamed from: c */
        void mo457c(C4327q c4327q);
    }

    public C0143b0(InterfaceC0533b interfaceC0533b, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar) {
        this.f544d = interfaceC6364x;
        this.f545e = aVar;
        this.f541a = new C0139Z(interfaceC0533b);
    }

    /* renamed from: M */
    public static /* synthetic */ void m529M(c cVar) {
        cVar.f571b.release();
    }

    /* renamed from: k */
    public static C0143b0 m531k(InterfaceC0533b interfaceC0533b, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar) {
        return new C0143b0(interfaceC0533b, (InterfaceC6364x) AbstractC5332a.m21800e(interfaceC6364x), (InterfaceC6362v.a) AbstractC5332a.m21800e(aVar));
    }

    /* renamed from: l */
    public static C0143b0 m532l(InterfaceC0533b interfaceC0533b) {
        return new C0143b0(interfaceC0533b, null, null);
    }

    /* renamed from: A */
    public final synchronized long m533A() {
        return this.f562v;
    }

    /* renamed from: B */
    public final synchronized long m534B() {
        return Math.max(this.f561u, m535C(this.f559s));
    }

    /* renamed from: C */
    public final long m535C(int i7) {
        long j7 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int m537E = m537E(i7 - 1);
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = Math.max(j7, this.f554n[m537E]);
            if ((this.f553m[m537E] & 1) != 0) {
                break;
            }
            m537E--;
            if (m537E == -1) {
                m537E = this.f549i - 1;
            }
        }
        return j7;
    }

    /* renamed from: D */
    public final int m536D() {
        return this.f557q + this.f559s;
    }

    /* renamed from: E */
    public final int m537E(int i7) {
        int i8 = this.f558r + i7;
        int i9 = this.f549i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    /* renamed from: F */
    public final synchronized int m538F(long j7, boolean z6) {
        int m537E = m537E(this.f559s);
        if (m541I() && j7 >= this.f554n[m537E]) {
            if (j7 > this.f562v && z6) {
                return this.f556p - this.f559s;
            }
            int m585w = m585w(m537E, this.f556p - this.f559s, j7, true);
            if (m585w == -1) {
                return 0;
            }
            return m585w;
        }
        return 0;
    }

    /* renamed from: G */
    public final synchronized C4327q m539G() {
        return this.f565y ? null : this.f535B;
    }

    /* renamed from: H */
    public final int m540H() {
        return this.f557q + this.f556p;
    }

    /* renamed from: I */
    public final boolean m541I() {
        return this.f559s != this.f556p;
    }

    /* renamed from: J */
    public final void m542J() {
        this.f566z = true;
    }

    /* renamed from: K */
    public final synchronized boolean m543K() {
        return this.f563w;
    }

    /* renamed from: L */
    public synchronized boolean m544L(boolean z6) {
        C4327q c4327q;
        boolean z7 = true;
        if (m541I()) {
            if (((c) this.f543c.m639e(m536D())).f570a != this.f547g) {
                return true;
            }
            return m545N(m537E(this.f559s));
        }
        if (!z6 && !this.f563w && ((c4327q = this.f535B) == null || c4327q == this.f547g)) {
            z7 = false;
        }
        return z7;
    }

    /* renamed from: N */
    public final boolean m545N(int i7) {
        InterfaceC6354n interfaceC6354n = this.f548h;
        return interfaceC6354n == null || interfaceC6354n.mo26498e() == 4 || ((this.f553m[i7] & 1073741824) == 0 && this.f548h.mo26496c());
    }

    /* renamed from: O */
    public void m546O() {
        InterfaceC6354n interfaceC6354n = this.f548h;
        if (interfaceC6354n != null && interfaceC6354n.mo26498e() == 1) {
            throw ((InterfaceC6354n.a) AbstractC5332a.m21800e(this.f548h.mo26494a()));
        }
    }

    /* renamed from: P */
    public final void m547P(C4327q c4327q, C5756s0 c5756s0) {
        C4327q c4327q2 = this.f547g;
        boolean z6 = c4327q2 == null;
        C4323m c4323m = c4327q2 == null ? null : c4327q2.f15142r;
        this.f547g = c4327q;
        C4323m c4323m2 = c4327q.f15142r;
        InterfaceC6364x interfaceC6364x = this.f544d;
        c5756s0.f20950b = interfaceC6364x != null ? c4327q.m18194b(interfaceC6364x.mo26608d(c4327q)) : c4327q;
        c5756s0.f20949a = this.f548h;
        if (this.f544d == null) {
            return;
        }
        if (z6 || !AbstractC5330M.m21729c(c4323m, c4323m2)) {
            InterfaceC6354n interfaceC6354n = this.f548h;
            InterfaceC6354n mo26606b = this.f544d.mo26606b(this.f545e, c4327q);
            this.f548h = mo26606b;
            c5756s0.f20949a = mo26606b;
            if (interfaceC6354n != null) {
                interfaceC6354n.mo26500g(this.f545e);
            }
        }
    }

    /* renamed from: Q */
    public final synchronized int m548Q(C5756s0 c5756s0, C5561i c5561i, boolean z6, boolean z7, b bVar) {
        try {
            c5561i.f20078e = false;
            if (!m541I()) {
                if (!z7 && !this.f563w) {
                    C4327q c4327q = this.f535B;
                    if (c4327q == null || (!z6 && c4327q == this.f547g)) {
                        return -3;
                    }
                    m547P((C4327q) AbstractC5332a.m21800e(c4327q), c5756s0);
                    return -5;
                }
                c5561i.m23279q(4);
                c5561i.f20079f = Long.MIN_VALUE;
                return -4;
            }
            C4327q c4327q2 = ((c) this.f543c.m639e(m536D())).f570a;
            if (!z6 && c4327q2 == this.f547g) {
                int m537E = m537E(this.f559s);
                if (!m545N(m537E)) {
                    c5561i.f20078e = true;
                    return -3;
                }
                c5561i.m23279q(this.f553m[m537E]);
                if (this.f559s == this.f556p - 1 && (z7 || this.f563w)) {
                    c5561i.m23272i(536870912);
                }
                c5561i.f20079f = this.f554n[m537E];
                bVar.f567a = this.f552l[m537E];
                bVar.f568b = this.f551k[m537E];
                bVar.f569c = this.f555o[m537E];
                return -4;
            }
            m547P(c4327q2, c5756s0);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: R */
    public final synchronized long m549R() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return m541I() ? this.f550j[m537E(this.f559s)] : this.f536C;
    }

    /* renamed from: S */
    public void m550S() {
        m580r();
        m553V();
    }

    /* renamed from: T */
    public int m551T(C5756s0 c5756s0, C5561i c5561i, int i7, boolean z6) {
        int m548Q = m548Q(c5756s0, c5561i, (i7 & 2) != 0, z6, this.f542b);
        if (m548Q == -4 && !c5561i.m23275m()) {
            boolean z7 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z7) {
                    this.f541a.m507f(c5561i, this.f542b);
                } else {
                    this.f541a.m510m(c5561i, this.f542b);
                }
            }
            if (!z7) {
                this.f559s++;
            }
        }
        return m548Q;
    }

    /* renamed from: U */
    public void m552U() {
        m555X(true);
        m553V();
    }

    /* renamed from: V */
    public final void m553V() {
        InterfaceC6354n interfaceC6354n = this.f548h;
        if (interfaceC6354n != null) {
            interfaceC6354n.mo26500g(this.f545e);
            this.f548h = null;
            this.f547g = null;
        }
    }

    /* renamed from: W */
    public final void m554W() {
        m555X(false);
    }

    /* renamed from: X */
    public void m555X(boolean z6) {
        this.f541a.m511n();
        this.f556p = 0;
        this.f557q = 0;
        this.f558r = 0;
        this.f559s = 0;
        this.f564x = true;
        this.f560t = Long.MIN_VALUE;
        this.f561u = Long.MIN_VALUE;
        this.f562v = Long.MIN_VALUE;
        this.f563w = false;
        this.f543c.m636b();
        if (z6) {
            this.f534A = null;
            this.f535B = null;
            this.f565y = true;
            this.f537D = true;
        }
    }

    /* renamed from: Y */
    public final synchronized void m556Y() {
        this.f559s = 0;
        this.f541a.m512o();
    }

    /* renamed from: Z */
    public final synchronized boolean m557Z(int i7) {
        m556Y();
        int i8 = this.f557q;
        if (i7 >= i8 && i7 <= this.f556p + i8) {
            this.f560t = Long.MIN_VALUE;
            this.f559s = i7 - i8;
            return true;
        }
        return false;
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: a */
    public /* synthetic */ int mo558a(InterfaceC4319i interfaceC4319i, int i7, boolean z6) {
        return AbstractC0860S.m3555a(this, interfaceC4319i, i7, z6);
    }

    /* renamed from: a0 */
    public final synchronized boolean m559a0(long j7, boolean z6) {
        try {
            m556Y();
            int m537E = m537E(this.f559s);
            if (m541I() && j7 >= this.f554n[m537E] && (j7 <= this.f562v || z6)) {
                int m584v = this.f537D ? m584v(m537E, this.f556p - this.f559s, j7, z6) : m585w(m537E, this.f556p - this.f559s, j7, true);
                if (m584v == -1) {
                    return false;
                }
                this.f560t = j7;
                this.f559s += m584v;
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: b */
    public final void mo560b(C5357z c5357z, int i7, int i8) {
        this.f541a.m514q(c5357z, i7);
    }

    /* renamed from: b0 */
    public final void m561b0(long j7) {
        if (this.f539F != j7) {
            this.f539F = j7;
            m542J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // p078L0.InterfaceC0861T
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo562c(long r12, int r14, int r15, int r16, p078L0.InterfaceC0861T.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f566z
            if (r0 == 0) goto L10
            g0.q r0 = r8.f534A
            java.lang.Object r0 = p259j0.AbstractC5332a.m21804i(r0)
            g0.q r0 = (p232g0.C4327q) r0
            r11.mo566e(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f564x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f564x = r1
        L22:
            long r4 = r8.f539F
            long r4 = r4 + r12
            boolean r6 = r8.f537D
            if (r6 == 0) goto L54
            long r6 = r8.f560t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f538E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            g0.q r6 = r8.f535B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p259j0.AbstractC5346o.m21867h(r6, r0)
            r8.f538E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f540G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.m571h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f540G = r1
            goto L66
        L65:
            return
        L66:
            D0.Z r0 = r8.f541a
            long r0 = r0.m506e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m573i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p022D0.C0143b0.mo562c(long, int, int, int, L0.T$a):void");
    }

    /* renamed from: c0 */
    public final void m563c0(long j7) {
        this.f560t = j7;
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: d */
    public /* synthetic */ void mo564d(C5357z c5357z, int i7) {
        AbstractC0860S.m3556b(this, c5357z, i7);
    }

    /* renamed from: d0 */
    public final synchronized boolean m565d0(C4327q c4327q) {
        try {
            this.f565y = false;
            if (AbstractC5330M.m21729c(c4327q, this.f535B)) {
                return false;
            }
            if (this.f543c.m641g() || !((c) this.f543c.m640f()).f570a.equals(c4327q)) {
                this.f535B = c4327q;
            } else {
                this.f535B = ((c) this.f543c.m640f()).f570a;
            }
            boolean z6 = this.f537D;
            C4327q c4327q2 = this.f535B;
            this.f537D = z6 & AbstractC4336z.m18408a(c4327q2.f15138n, c4327q2.f15134j);
            this.f538E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: e */
    public final void mo566e(C4327q c4327q) {
        C4327q mo586x = mo586x(c4327q);
        this.f566z = false;
        this.f534A = c4327q;
        boolean m565d0 = m565d0(mo586x);
        d dVar = this.f546f;
        if (dVar == null || !m565d0) {
            return;
        }
        dVar.mo457c(mo586x);
    }

    /* renamed from: e0 */
    public final void m567e0(d dVar) {
        this.f546f = dVar;
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: f */
    public final int mo568f(InterfaceC4319i interfaceC4319i, int i7, boolean z6, int i8) {
        return this.f541a.m513p(interfaceC4319i, i7, z6);
    }

    /* renamed from: f0 */
    public final synchronized void m569f0(int i7) {
        boolean z6;
        if (i7 >= 0) {
            try {
                if (this.f559s + i7 <= this.f556p) {
                    z6 = true;
                    AbstractC5332a.m21796a(z6);
                    this.f559s += i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z6 = false;
        AbstractC5332a.m21796a(z6);
        this.f559s += i7;
    }

    /* renamed from: g0 */
    public final void m570g0(long j7) {
        this.f536C = j7;
    }

    /* renamed from: h */
    public final synchronized boolean m571h(long j7) {
        if (this.f556p == 0) {
            return j7 > this.f561u;
        }
        if (m534B() >= j7) {
            return false;
        }
        m582t(this.f557q + m574j(j7));
        return true;
    }

    /* renamed from: h0 */
    public final void m572h0() {
        this.f540G = true;
    }

    /* renamed from: i */
    public final synchronized void m573i(long j7, int i7, long j8, int i8, InterfaceC0861T.a aVar) {
        try {
            int i9 = this.f556p;
            if (i9 > 0) {
                int m537E = m537E(i9 - 1);
                AbstractC5332a.m21796a(this.f551k[m537E] + ((long) this.f552l[m537E]) <= j8);
            }
            this.f563w = (536870912 & i7) != 0;
            this.f562v = Math.max(this.f562v, j7);
            int m537E2 = m537E(this.f556p);
            this.f554n[m537E2] = j7;
            this.f551k[m537E2] = j8;
            this.f552l[m537E2] = i8;
            this.f553m[m537E2] = i7;
            this.f555o[m537E2] = aVar;
            this.f550j[m537E2] = this.f536C;
            if (this.f543c.m641g() || !((c) this.f543c.m640f()).f570a.equals(this.f535B)) {
                C4327q c4327q = (C4327q) AbstractC5332a.m21800e(this.f535B);
                InterfaceC6364x interfaceC6364x = this.f544d;
                this.f543c.m635a(m540H(), new c(c4327q, interfaceC6364x != null ? interfaceC6364x.mo26605a(this.f545e, c4327q) : InterfaceC6364x.b.f23019a));
            }
            int i10 = this.f556p + 1;
            this.f556p = i10;
            int i11 = this.f549i;
            if (i10 == i11) {
                int i12 = i11 + PipesIterator.DEFAULT_QUEUE_SIZE;
                long[] jArr = new long[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr = new int[i12];
                int[] iArr2 = new int[i12];
                InterfaceC0861T.a[] aVarArr = new InterfaceC0861T.a[i12];
                int i13 = this.f558r;
                int i14 = i11 - i13;
                System.arraycopy(this.f551k, i13, jArr2, 0, i14);
                System.arraycopy(this.f554n, this.f558r, jArr3, 0, i14);
                System.arraycopy(this.f553m, this.f558r, iArr, 0, i14);
                System.arraycopy(this.f552l, this.f558r, iArr2, 0, i14);
                System.arraycopy(this.f555o, this.f558r, aVarArr, 0, i14);
                System.arraycopy(this.f550j, this.f558r, jArr, 0, i14);
                int i15 = this.f558r;
                System.arraycopy(this.f551k, 0, jArr2, i14, i15);
                System.arraycopy(this.f554n, 0, jArr3, i14, i15);
                System.arraycopy(this.f553m, 0, iArr, i14, i15);
                System.arraycopy(this.f552l, 0, iArr2, i14, i15);
                System.arraycopy(this.f555o, 0, aVarArr, i14, i15);
                System.arraycopy(this.f550j, 0, jArr, i14, i15);
                this.f551k = jArr2;
                this.f554n = jArr3;
                this.f553m = iArr;
                this.f552l = iArr2;
                this.f555o = aVarArr;
                this.f550j = jArr;
                this.f558r = 0;
                this.f549i = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: j */
    public final int m574j(long j7) {
        int i7 = this.f556p;
        int m537E = m537E(i7 - 1);
        while (i7 > this.f559s && this.f554n[m537E] >= j7) {
            i7--;
            m537E--;
            if (m537E == -1) {
                m537E = this.f549i - 1;
            }
        }
        return i7;
    }

    /* renamed from: m */
    public final synchronized long m575m(long j7, boolean z6, boolean z7) {
        int i7;
        try {
            int i8 = this.f556p;
            if (i8 != 0) {
                long[] jArr = this.f554n;
                int i9 = this.f558r;
                if (j7 >= jArr[i9]) {
                    if (z7 && (i7 = this.f559s) != i8) {
                        i8 = i7 + 1;
                    }
                    int m585w = m585w(i9, i8, j7, z6);
                    if (m585w == -1) {
                        return -1L;
                    }
                    return m578p(m585w);
                }
            }
            return -1L;
        } finally {
        }
    }

    /* renamed from: n */
    public final synchronized long m576n() {
        int i7 = this.f556p;
        if (i7 == 0) {
            return -1L;
        }
        return m578p(i7);
    }

    /* renamed from: o */
    public synchronized long m577o() {
        int i7 = this.f559s;
        if (i7 == 0) {
            return -1L;
        }
        return m578p(i7);
    }

    /* renamed from: p */
    public final long m578p(int i7) {
        this.f561u = Math.max(this.f561u, m535C(i7));
        this.f556p -= i7;
        int i8 = this.f557q + i7;
        this.f557q = i8;
        int i9 = this.f558r + i7;
        this.f558r = i9;
        int i10 = this.f549i;
        if (i9 >= i10) {
            this.f558r = i9 - i10;
        }
        int i11 = this.f559s - i7;
        this.f559s = i11;
        if (i11 < 0) {
            this.f559s = 0;
        }
        this.f543c.m638d(i8);
        if (this.f556p != 0) {
            return this.f551k[this.f558r];
        }
        int i12 = this.f558r;
        if (i12 == 0) {
            i12 = this.f549i;
        }
        return this.f551k[i12 - 1] + this.f552l[r6];
    }

    /* renamed from: q */
    public final void m579q(long j7, boolean z6, boolean z7) {
        this.f541a.m504b(m575m(j7, z6, z7));
    }

    /* renamed from: r */
    public final void m580r() {
        this.f541a.m504b(m576n());
    }

    /* renamed from: s */
    public final void m581s() {
        this.f541a.m504b(m577o());
    }

    /* renamed from: t */
    public final long m582t(int i7) {
        int m540H = m540H() - i7;
        boolean z6 = false;
        AbstractC5332a.m21796a(m540H >= 0 && m540H <= this.f556p - this.f559s);
        int i8 = this.f556p - m540H;
        this.f556p = i8;
        this.f562v = Math.max(this.f561u, m535C(i8));
        if (m540H == 0 && this.f563w) {
            z6 = true;
        }
        this.f563w = z6;
        this.f543c.m637c(i7);
        int i9 = this.f556p;
        if (i9 == 0) {
            return 0L;
        }
        return this.f551k[m537E(i9 - 1)] + this.f552l[r9];
    }

    /* renamed from: u */
    public final void m583u(int i7) {
        this.f541a.m505c(m582t(i7));
    }

    /* renamed from: v */
    public final int m584v(int i7, int i8, long j7, boolean z6) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f554n[i7] >= j7) {
                return i9;
            }
            i7++;
            if (i7 == this.f549i) {
                i7 = 0;
            }
        }
        if (z6) {
            return i8;
        }
        return -1;
    }

    /* renamed from: w */
    public final int m585w(int i7, int i8, long j7, boolean z6) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = this.f554n[i7];
            if (j8 > j7) {
                return i9;
            }
            if (!z6 || (this.f553m[i7] & 1) != 0) {
                if (j8 == j7) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.f549i) {
                i7 = 0;
            }
        }
        return i9;
    }

    /* renamed from: x */
    public C4327q mo586x(C4327q c4327q) {
        return (this.f539F == 0 || c4327q.f15143s == Long.MAX_VALUE) ? c4327q : c4327q.m18193a().m18268s0(c4327q.f15143s + this.f539F).m18234K();
    }

    /* renamed from: y */
    public final int m587y() {
        return this.f557q;
    }

    /* renamed from: z */
    public final synchronized long m588z() {
        return this.f556p == 0 ? Long.MIN_VALUE : this.f554n[this.f558r];
    }
}
