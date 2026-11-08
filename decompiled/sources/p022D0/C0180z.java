package p022D0;

import java.io.IOException;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p043G0.InterfaceC0375y;
import p050H0.InterfaceC0533b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p292n0.C5714a1;
import p292n0.C5762v0;

/* renamed from: D0.z */
/* loaded from: classes.dex */
public final class C0180z implements InterfaceC0117C, InterfaceC0117C.a {

    /* renamed from: a */
    public final InterfaceC0120F.b f745a;

    /* renamed from: b */
    public final long f746b;

    /* renamed from: c */
    public final InterfaceC0533b f747c;

    /* renamed from: d */
    public InterfaceC0120F f748d;

    /* renamed from: e */
    public InterfaceC0117C f749e;

    /* renamed from: f */
    public InterfaceC0117C.a f750f;

    /* renamed from: n */
    public a f751n;

    /* renamed from: o */
    public boolean f752o;

    /* renamed from: p */
    public long f753p = -9223372036854775807L;

    /* renamed from: D0.z$a */
    public interface a {
        /* renamed from: a */
        void m725a(InterfaceC0120F.b bVar);

        /* renamed from: b */
        void m726b(InterfaceC0120F.b bVar, IOException iOException);
    }

    public C0180z(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        this.f745a = bVar;
        this.f747c = interfaceC0533b;
        this.f746b = j7;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo309a();
    }

    @Override // p022D0.InterfaceC0117C.a
    /* renamed from: c */
    public void mo322c(InterfaceC0117C interfaceC0117C) {
        ((InterfaceC0117C.a) AbstractC5330M.m21747i(this.f750f)).mo322c(this);
        a aVar = this.f751n;
        if (aVar != null) {
            aVar.m725a(this.f745a);
        }
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        InterfaceC0117C interfaceC0117C = this.f749e;
        return interfaceC0117C != null && interfaceC0117C.mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        InterfaceC0117C interfaceC0117C = this.f749e;
        return interfaceC0117C != null && interfaceC0117C.mo311e(c5762v0);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        return ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo312f();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        return ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo313g(j7, c5714a1);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo314h(j7);
    }

    /* renamed from: i */
    public void m717i(InterfaceC0120F.b bVar) {
        long m720r = m720r(this.f746b);
        InterfaceC0117C mo296e = ((InterfaceC0120F) AbstractC5332a.m21800e(this.f748d)).mo296e(bVar, this.f747c, m720r);
        this.f749e = mo296e;
        if (this.f750f != null) {
            mo296e.mo318p(this, m720r);
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        try {
            InterfaceC0117C interfaceC0117C = this.f749e;
            if (interfaceC0117C != null) {
                interfaceC0117C.mo315l();
            } else {
                InterfaceC0120F interfaceC0120F = this.f748d;
                if (interfaceC0120F != null) {
                    interfaceC0120F.mo298n();
                }
            }
        } catch (IOException e7) {
            a aVar = this.f751n;
            if (aVar == null) {
                throw e7;
            }
            if (this.f752o) {
                return;
            }
            this.f752o = true;
            aVar.m726b(this.f745a, e7);
        }
    }

    /* renamed from: m */
    public long m718m() {
        return this.f753p;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        long j8 = this.f753p;
        long j9 = (j8 == -9223372036854775807L || j7 != this.f746b) ? j7 : j8;
        this.f753p = -9223372036854775807L;
        return ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo316n(interfaceC0375yArr, zArr, interfaceC0145c0Arr, zArr2, j9);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        return ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo317o(j7);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f750f = aVar;
        InterfaceC0117C interfaceC0117C = this.f749e;
        if (interfaceC0117C != null) {
            interfaceC0117C.mo318p(this, m720r(this.f746b));
        }
    }

    /* renamed from: q */
    public long m719q() {
        return this.f746b;
    }

    /* renamed from: r */
    public final long m720r(long j7) {
        long j8 = this.f753p;
        return j8 != -9223372036854775807L ? j8 : j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        return ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo319s();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo320t();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        ((InterfaceC0117C) AbstractC5330M.m21747i(this.f749e)).mo321u(j7, z6);
    }

    @Override // p022D0.InterfaceC0147d0.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo386b(InterfaceC0117C interfaceC0117C) {
        ((InterfaceC0117C.a) AbstractC5330M.m21747i(this.f750f)).mo386b(this);
    }

    /* renamed from: w */
    public void m722w(long j7) {
        this.f753p = j7;
    }

    /* renamed from: x */
    public void m723x() {
        if (this.f749e != null) {
            ((InterfaceC0120F) AbstractC5332a.m21800e(this.f748d)).mo297f(this.f749e);
        }
    }

    /* renamed from: y */
    public void m724y(InterfaceC0120F interfaceC0120F) {
        AbstractC5332a.m21802g(this.f748d == null);
        this.f748d = interfaceC0120F;
    }
}
