package p022D0;

import p022D0.InterfaceC0120F;
import p050H0.InterfaceC0533b;
import p232g0.AbstractC4303I;
import p232g0.C4311a;
import p232g0.C4331u;
import p259j0.AbstractC5330M;

/* renamed from: D0.A */
/* loaded from: classes.dex */
public final class C0115A extends AbstractC0169o0 {

    /* renamed from: A */
    public boolean f348A;

    /* renamed from: t */
    public final boolean f349t;

    /* renamed from: u */
    public final AbstractC4303I.c f350u;

    /* renamed from: v */
    public final AbstractC4303I.b f351v;

    /* renamed from: w */
    public a f352w;

    /* renamed from: x */
    public C0180z f353x;

    /* renamed from: y */
    public boolean f354y;

    /* renamed from: z */
    public boolean f355z;

    /* renamed from: D0.A$a */
    public static final class a extends AbstractC0177w {

        /* renamed from: h */
        public static final Object f356h = new Object();

        /* renamed from: f */
        public final Object f357f;

        /* renamed from: g */
        public final Object f358g;

        public a(AbstractC4303I abstractC4303I, Object obj, Object obj2) {
            super(abstractC4303I);
            this.f357f = obj;
            this.f358g = obj2;
        }

        /* renamed from: u */
        public static a m300u(C4331u c4331u) {
            return new a(new b(c4331u), AbstractC4303I.c.f14822q, f356h);
        }

        /* renamed from: v */
        public static a m301v(AbstractC4303I abstractC4303I, Object obj, Object obj2) {
            return new a(abstractC4303I, obj, obj2);
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: b */
        public int mo302b(Object obj) {
            Object obj2;
            AbstractC4303I abstractC4303I = this.f731e;
            if (f356h.equals(obj) && (obj2 = this.f358g) != null) {
                obj = obj2;
            }
            return abstractC4303I.mo302b(obj);
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            this.f731e.mo303g(i7, bVar, z6);
            if (AbstractC5330M.m21729c(bVar.f14810b, this.f358g) && z6) {
                bVar.f14810b = f356h;
            }
            return bVar;
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: m */
        public Object mo304m(int i7) {
            Object mo304m = this.f731e.mo304m(i7);
            return AbstractC5330M.m21729c(mo304m, this.f358g) ? f356h : mo304m;
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: o */
        public AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
            this.f731e.mo305o(i7, cVar, j7);
            if (AbstractC5330M.m21729c(cVar.f14832a, this.f357f)) {
                cVar.f14832a = AbstractC4303I.c.f14822q;
            }
            return cVar;
        }

        /* renamed from: t */
        public a m306t(AbstractC4303I abstractC4303I) {
            return new a(abstractC4303I, this.f357f, this.f358g);
        }
    }

    /* renamed from: D0.A$b */
    public static final class b extends AbstractC4303I {

        /* renamed from: e */
        public final C4331u f359e;

        public b(C4331u c4331u) {
            this.f359e = c4331u;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: b */
        public int mo302b(Object obj) {
            return obj == a.f356h ? 0 : -1;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            bVar.m18053t(z6 ? 0 : null, z6 ? a.f356h : null, 0, -9223372036854775807L, 0L, C4311a.f14976g, true);
            return bVar;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: i */
        public int mo307i() {
            return 1;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: m */
        public Object mo304m(int i7) {
            return a.f356h;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: o */
        public AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
            cVar.m18060g(AbstractC4303I.c.f14822q, this.f359e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f14842k = true;
            return cVar;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: p */
        public int mo308p() {
            return 1;
        }
    }

    public C0115A(InterfaceC0120F interfaceC0120F, boolean z6) {
        super(interfaceC0120F);
        this.f349t = z6 && interfaceC0120F.mo334o();
        this.f350u = new AbstractC4303I.c();
        this.f351v = new AbstractC4303I.b();
        AbstractC4303I mo336q = interfaceC0120F.mo336q();
        if (mo336q == null) {
            this.f352w = a.m300u(interfaceC0120F.mo331i());
        } else {
            this.f352w = a.m301v(mo336q, null, null);
            this.f348A = true;
        }
    }

    @Override // p022D0.AbstractC0154h, p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        this.f355z = false;
        this.f354y = false;
        super.mo286E();
    }

    @Override // p022D0.AbstractC0169o0
    /* renamed from: M */
    public InterfaceC0120F.b mo287M(InterfaceC0120F.b bVar) {
        return bVar.m344a(m291X(bVar.f367a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    @Override // p022D0.AbstractC0169o0
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo288S(p232g0.AbstractC4303I r15) {
        /*
            r14 = this;
            boolean r0 = r14.f355z
            if (r0 == 0) goto L19
            D0.A$a r0 = r14.f352w
            D0.A$a r15 = r0.m306t(r15)
            r14.f352w = r15
            D0.z r15 = r14.f353x
            if (r15 == 0) goto Lb1
            long r0 = r15.m718m()
            r14.m295a0(r0)
            goto Lb1
        L19:
            boolean r0 = r15.m18032q()
            if (r0 == 0) goto L36
            boolean r0 = r14.f348A
            if (r0 == 0) goto L2a
            D0.A$a r0 = r14.f352w
            D0.A$a r15 = r0.m306t(r15)
            goto L32
        L2a:
            java.lang.Object r0 = p232g0.AbstractC4303I.c.f14822q
            java.lang.Object r1 = p022D0.C0115A.a.f356h
            D0.A$a r15 = p022D0.C0115A.a.m301v(r15, r0, r1)
        L32:
            r14.f352w = r15
            goto Lb1
        L36:
            g0.I$c r0 = r14.f350u
            r1 = 0
            r15.m18031n(r1, r0)
            g0.I$c r0 = r14.f350u
            long r2 = r0.m18056c()
            g0.I$c r0 = r14.f350u
            java.lang.Object r0 = r0.f14832a
            D0.z r4 = r14.f353x
            if (r4 == 0) goto L74
            long r4 = r4.m719q()
            D0.A$a r6 = r14.f352w
            D0.z r7 = r14.f353x
            D0.F$b r7 = r7.f745a
            java.lang.Object r7 = r7.f367a
            g0.I$b r8 = r14.f351v
            r6.mo18028h(r7, r8)
            g0.I$b r6 = r14.f351v
            long r6 = r6.m18047n()
            long r6 = r6 + r4
            D0.A$a r4 = r14.f352w
            g0.I$c r5 = r14.f350u
            g0.I$c r1 = r4.m18031n(r1, r5)
            long r4 = r1.m18056c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            g0.I$c r9 = r14.f350u
            g0.I$b r10 = r14.f351v
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.m18029j(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f348A
            if (r1 == 0) goto L94
            D0.A$a r0 = r14.f352w
            D0.A$a r15 = r0.m306t(r15)
            goto L98
        L94:
            D0.A$a r15 = p022D0.C0115A.a.m301v(r15, r0, r2)
        L98:
            r14.f352w = r15
            D0.z r15 = r14.f353x
            if (r15 == 0) goto Lb1
            boolean r0 = r14.m295a0(r3)
            if (r0 == 0) goto Lb1
            D0.F$b r15 = r15.f745a
            java.lang.Object r0 = r15.f367a
            java.lang.Object r0 = r14.m292Y(r0)
            D0.F$b r15 = r15.m344a(r0)
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            r0 = 1
            r14.f348A = r0
            r14.f355z = r0
            D0.A$a r0 = r14.f352w
            r14.m522D(r0)
            if (r15 == 0) goto Lc9
            D0.z r0 = r14.f353x
            java.lang.Object r0 = p259j0.AbstractC5332a.m21800e(r0)
            D0.z r0 = (p022D0.C0180z) r0
            r0.m717i(r15)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p022D0.C0115A.mo288S(g0.I):void");
    }

    @Override // p022D0.AbstractC0169o0
    /* renamed from: V */
    public void mo289V() {
        if (this.f349t) {
            return;
        }
        this.f354y = true;
        m663U();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C0180z mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        C0180z c0180z = new C0180z(bVar, interfaceC0533b, j7);
        c0180z.m724y(this.f695r);
        if (this.f355z) {
            c0180z.m717i(bVar.m344a(m292Y(bVar.f367a)));
        } else {
            this.f353x = c0180z;
            if (!this.f354y) {
                this.f354y = true;
                m663U();
            }
        }
        return c0180z;
    }

    /* renamed from: X */
    public final Object m291X(Object obj) {
        return (this.f352w.f358g == null || !this.f352w.f358g.equals(obj)) ? obj : a.f356h;
    }

    /* renamed from: Y */
    public final Object m292Y(Object obj) {
        return (this.f352w.f358g == null || !obj.equals(a.f356h)) ? obj : this.f352w.f358g;
    }

    /* renamed from: Z */
    public AbstractC4303I m293Z() {
        return this.f352w;
    }

    @Override // p022D0.AbstractC0169o0, p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public void mo294a(C4331u c4331u) {
        if (this.f348A) {
            this.f352w = this.f352w.m306t(new C0161k0(this.f352w.f731e, c4331u));
        } else {
            this.f352w = a.m300u(c4331u);
        }
        this.f695r.mo294a(c4331u);
    }

    /* renamed from: a0 */
    public final boolean m295a0(long j7) {
        C0180z c0180z = this.f353x;
        int mo302b = this.f352w.mo302b(c0180z.f745a.f367a);
        if (mo302b == -1) {
            return false;
        }
        long j8 = this.f352w.m18027f(mo302b, this.f351v).f14812d;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        c0180z.m722w(j7);
        return true;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        ((C0180z) interfaceC0117C).m723x();
        if (interfaceC0117C == this.f353x) {
            this.f353x = null;
        }
    }

    @Override // p022D0.AbstractC0154h, p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
    }
}
