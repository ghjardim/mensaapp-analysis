package p022D0;

import p022D0.C0150f;
import p022D0.InterfaceC0117C;
import p043G0.InterfaceC0375y;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;

/* renamed from: D0.e */
/* loaded from: classes.dex */
public final class C0148e implements InterfaceC0117C, InterfaceC0117C.a {

    /* renamed from: a */
    public final InterfaceC0117C f575a;

    /* renamed from: b */
    public InterfaceC0117C.a f576b;

    /* renamed from: c */
    public a[] f577c = new a[0];

    /* renamed from: d */
    public long f578d;

    /* renamed from: e */
    public long f579e;

    /* renamed from: f */
    public long f580f;

    /* renamed from: n */
    public C0150f.b f581n;

    /* renamed from: D0.e$a */
    public final class a implements InterfaceC0145c0 {

        /* renamed from: a */
        public final InterfaceC0145c0 f582a;

        /* renamed from: b */
        public boolean f583b;

        public a(InterfaceC0145c0 interfaceC0145c0) {
            this.f582a = interfaceC0145c0;
        }

        /* renamed from: a */
        public void m597a() {
            this.f583b = false;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: b */
        public boolean mo487b() {
            return !C0148e.this.m593m() && this.f582a.mo487b();
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: c */
        public void mo488c() {
            this.f582a.mo488c();
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: j */
        public int mo489j(long j7) {
            if (C0148e.this.m593m()) {
                return -3;
            }
            return this.f582a.mo489j(j7);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: q */
        public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
            if (C0148e.this.m593m()) {
                return -3;
            }
            if (this.f583b) {
                c5561i.m23279q(4);
                return -4;
            }
            long mo312f = C0148e.this.mo312f();
            int mo490q = this.f582a.mo490q(c5756s0, c5561i, i7);
            if (mo490q == -5) {
                C4327q c4327q = (C4327q) AbstractC5332a.m21800e(c5756s0.f20950b);
                int i8 = c4327q.f15117E;
                if (i8 != 0 || c4327q.f15118F != 0) {
                    C0148e c0148e = C0148e.this;
                    if (c0148e.f579e != 0) {
                        i8 = 0;
                    }
                    c5756s0.f20950b = c4327q.m18193a().m18245V(i8).m18246W(c0148e.f580f == Long.MIN_VALUE ? c4327q.f15118F : 0).m18234K();
                }
                return -5;
            }
            long j7 = C0148e.this.f580f;
            if (j7 == Long.MIN_VALUE || ((mo490q != -4 || c5561i.f20079f < j7) && !(mo490q == -3 && mo312f == Long.MIN_VALUE && !c5561i.f20078e))) {
                return mo490q;
            }
            c5561i.mo19253j();
            c5561i.m23279q(4);
            this.f583b = true;
            return -4;
        }
    }

    public C0148e(InterfaceC0117C interfaceC0117C, boolean z6, long j7, long j8) {
        this.f575a = interfaceC0117C;
        this.f578d = z6 ? j7 : -9223372036854775807L;
        this.f579e = j7;
        this.f580f = j8;
    }

    /* renamed from: v */
    public static boolean m591v(long j7, InterfaceC0375y[] interfaceC0375yArr) {
        if (j7 != 0) {
            for (InterfaceC0375y interfaceC0375y : interfaceC0375yArr) {
                if (interfaceC0375y != null) {
                    C4327q mo403q = interfaceC0375y.mo403q();
                    if (!AbstractC4336z.m18408a(mo403q.f15138n, mo403q.f15134j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        long mo309a = this.f575a.mo309a();
        if (mo309a != Long.MIN_VALUE) {
            long j7 = this.f580f;
            if (j7 == Long.MIN_VALUE || mo309a < j7) {
                return mo309a;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p022D0.InterfaceC0117C.a
    /* renamed from: c */
    public void mo322c(InterfaceC0117C interfaceC0117C) {
        if (this.f581n != null) {
            return;
        }
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f576b)).mo322c(this);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f575a.mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        return this.f575a.mo311e(c5762v0);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        long mo312f = this.f575a.mo312f();
        if (mo312f != Long.MIN_VALUE) {
            long j7 = this.f580f;
            if (j7 == Long.MIN_VALUE || mo312f < j7) {
                return mo312f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        long j8 = this.f579e;
        if (j7 == j8) {
            return j8;
        }
        return this.f575a.mo313g(j7, m592i(j7, c5714a1));
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        this.f575a.mo314h(j7);
    }

    /* renamed from: i */
    public final C5714a1 m592i(long j7, C5714a1 c5714a1) {
        long m21768q = AbstractC5330M.m21768q(c5714a1.f20654a, 0L, j7 - this.f579e);
        long j8 = c5714a1.f20655b;
        long j9 = this.f580f;
        long m21768q2 = AbstractC5330M.m21768q(j8, 0L, j9 == Long.MIN_VALUE ? Long.MAX_VALUE : j9 - j7);
        return (m21768q == c5714a1.f20654a && m21768q2 == c5714a1.f20655b) ? c5714a1 : new C5714a1(m21768q, m21768q2);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        C0150f.b bVar = this.f581n;
        if (bVar != null) {
            throw bVar;
        }
        this.f575a.mo315l();
    }

    /* renamed from: m */
    public boolean m593m() {
        return this.f578d != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo316n(p043G0.InterfaceC0375y[] r13, boolean[] r14, p022D0.InterfaceC0145c0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            D0.e$a[] r2 = new p022D0.C0148e.a[r2]
            r0.f577c = r2
            int r2 = r1.length
            D0.c0[] r9 = new p022D0.InterfaceC0145c0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            D0.e$a[] r3 = r0.f577c
            r4 = r1[r2]
            D0.e$a r4 = (p022D0.C0148e.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            D0.c0 r11 = r4.f582a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            D0.C r2 = r0.f575a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo316n(r3, r4, r5, r6, r7)
            boolean r4 = r12.m593m()
            if (r4 == 0) goto L43
            long r4 = r0.f579e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = m591v(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f578d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f579e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f580f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            p259j0.AbstractC5332a.m21802g(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            D0.e$a[] r4 = r0.f577c
            r4[r10] = r11
            goto L84
        L73:
            D0.e$a[] r5 = r0.f577c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            D0.c0 r6 = r6.f582a
            if (r6 == r4) goto L84
        L7d:
            D0.e$a r6 = new D0.e$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            D0.e$a[] r4 = r0.f577c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p022D0.C0148e.mo316n(G0.y[], boolean[], D0.c0[], boolean[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo317o(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f578d = r0
            D0.e$a[] r0 = r5.f577c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m597a()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            D0.C r0 = r5.f575a
            long r0 = r0.mo317o(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f579e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f580f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p259j0.AbstractC5332a.m21802g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p022D0.C0148e.mo317o(long):long");
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f576b = aVar;
        this.f575a.mo318p(this, j7);
    }

    @Override // p022D0.InterfaceC0147d0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo386b(InterfaceC0117C interfaceC0117C) {
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f576b)).mo386b(this);
    }

    /* renamed from: r */
    public void m595r(C0150f.b bVar) {
        this.f581n = bVar;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        if (m593m()) {
            long j7 = this.f578d;
            this.f578d = -9223372036854775807L;
            long mo319s = mo319s();
            return mo319s != -9223372036854775807L ? mo319s : j7;
        }
        long mo319s2 = this.f575a.mo319s();
        if (mo319s2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC5332a.m21802g(mo319s2 >= this.f579e);
        long j8 = this.f580f;
        AbstractC5332a.m21802g(j8 == Long.MIN_VALUE || mo319s2 <= j8);
        return mo319s2;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return this.f575a.mo320t();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        this.f575a.mo321u(j7, z6);
    }

    /* renamed from: w */
    public void m596w(long j7, long j8) {
        this.f579e = j7;
        this.f580f = j8;
    }
}
