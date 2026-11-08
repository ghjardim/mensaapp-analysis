package p022D0;

import p022D0.InterfaceC0117C;
import p043G0.InterfaceC0375y;
import p259j0.AbstractC5332a;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;

/* renamed from: D0.j0 */
/* loaded from: classes.dex */
public final class C0159j0 implements InterfaceC0117C, InterfaceC0117C.a {

    /* renamed from: a */
    public final InterfaceC0117C f673a;

    /* renamed from: b */
    public final long f674b;

    /* renamed from: c */
    public InterfaceC0117C.a f675c;

    /* renamed from: D0.j0$a */
    public static final class a implements InterfaceC0145c0 {

        /* renamed from: a */
        public final InterfaceC0145c0 f676a;

        /* renamed from: b */
        public final long f677b;

        public a(InterfaceC0145c0 interfaceC0145c0, long j7) {
            this.f676a = interfaceC0145c0;
            this.f677b = j7;
        }

        /* renamed from: a */
        public InterfaceC0145c0 m646a() {
            return this.f676a;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: b */
        public boolean mo487b() {
            return this.f676a.mo487b();
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: c */
        public void mo488c() {
            this.f676a.mo488c();
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: j */
        public int mo489j(long j7) {
            return this.f676a.mo489j(j7 - this.f677b);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: q */
        public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
            int mo490q = this.f676a.mo490q(c5756s0, c5561i, i7);
            if (mo490q == -4) {
                c5561i.f20079f += this.f677b;
            }
            return mo490q;
        }
    }

    public C0159j0(InterfaceC0117C interfaceC0117C, long j7) {
        this.f673a = interfaceC0117C;
        this.f674b = j7;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        long mo309a = this.f673a.mo309a();
        if (mo309a == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f674b + mo309a;
    }

    @Override // p022D0.InterfaceC0117C.a
    /* renamed from: c */
    public void mo322c(InterfaceC0117C interfaceC0117C) {
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f675c)).mo322c(this);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f673a.mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        return this.f673a.mo311e(c5762v0.m24365a().m24371f(c5762v0.f20981a - this.f674b).m24369d());
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        long mo312f = this.f673a.mo312f();
        if (mo312f == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f674b + mo312f;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        return this.f673a.mo313g(j7 - this.f674b, c5714a1) + this.f674b;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        this.f673a.mo314h(j7 - this.f674b);
    }

    /* renamed from: i */
    public InterfaceC0117C m644i() {
        return this.f673a;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        this.f673a.mo315l();
    }

    @Override // p022D0.InterfaceC0147d0.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo386b(InterfaceC0117C interfaceC0117C) {
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f675c)).mo386b(this);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        InterfaceC0145c0[] interfaceC0145c0Arr2 = new InterfaceC0145c0[interfaceC0145c0Arr.length];
        int i7 = 0;
        while (true) {
            InterfaceC0145c0 interfaceC0145c0 = null;
            if (i7 >= interfaceC0145c0Arr.length) {
                break;
            }
            a aVar = (a) interfaceC0145c0Arr[i7];
            if (aVar != null) {
                interfaceC0145c0 = aVar.m646a();
            }
            interfaceC0145c0Arr2[i7] = interfaceC0145c0;
            i7++;
        }
        long mo316n = this.f673a.mo316n(interfaceC0375yArr, zArr, interfaceC0145c0Arr2, zArr2, j7 - this.f674b);
        for (int i8 = 0; i8 < interfaceC0145c0Arr.length; i8++) {
            InterfaceC0145c0 interfaceC0145c02 = interfaceC0145c0Arr2[i8];
            if (interfaceC0145c02 == null) {
                interfaceC0145c0Arr[i8] = null;
            } else {
                InterfaceC0145c0 interfaceC0145c03 = interfaceC0145c0Arr[i8];
                if (interfaceC0145c03 == null || ((a) interfaceC0145c03).m646a() != interfaceC0145c02) {
                    interfaceC0145c0Arr[i8] = new a(interfaceC0145c02, this.f674b);
                }
            }
        }
        return mo316n + this.f674b;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        return this.f673a.mo317o(j7 - this.f674b) + this.f674b;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f675c = aVar;
        this.f673a.mo318p(this, j7 - this.f674b);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        long mo319s = this.f673a.mo319s();
        if (mo319s == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f674b + mo319s;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return this.f673a.mo320t();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        this.f673a.mo321u(j7 - this.f674b, z6);
    }
}
