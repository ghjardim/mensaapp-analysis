package androidx.media3.exoplayer.smoothstreaming;

import androidx.media3.exoplayer.smoothstreaming.C3395c;
import androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b;
import java.util.ArrayList;
import java.util.List;
import p015C0.C0070a;
import p022D0.C0165m0;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0145c0;
import p022D0.InterfaceC0147d0;
import p022D0.InterfaceC0158j;
import p029E0.C0215h;
import p043G0.InterfaceC0375y;
import p050H0.AbstractC0537f;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p050H0.InterfaceC0546o;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC2990D;
import p178Z2.AbstractC3033v;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;
import p292n0.C5714a1;
import p292n0.C5762v0;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;

/* renamed from: androidx.media3.exoplayer.smoothstreaming.c */
/* loaded from: classes.dex */
public final class C3395c implements InterfaceC0117C, InterfaceC0147d0.a {

    /* renamed from: a */
    public final InterfaceC3394b.a f11148a;

    /* renamed from: b */
    public final InterfaceC5511y f11149b;

    /* renamed from: c */
    public final InterfaceC0546o f11150c;

    /* renamed from: d */
    public final InterfaceC6364x f11151d;

    /* renamed from: e */
    public final InterfaceC6362v.a f11152e;

    /* renamed from: f */
    public final InterfaceC0544m f11153f;

    /* renamed from: n */
    public final InterfaceC0127M.a f11154n;

    /* renamed from: o */
    public final InterfaceC0533b f11155o;

    /* renamed from: p */
    public final C0165m0 f11156p;

    /* renamed from: q */
    public final InterfaceC0158j f11157q;

    /* renamed from: r */
    public InterfaceC0117C.a f11158r;

    /* renamed from: s */
    public C0070a f11159s;

    /* renamed from: t */
    public C0215h[] f11160t = m13392v(0);

    /* renamed from: u */
    public InterfaceC0147d0 f11161u;

    public C3395c(C0070a c0070a, InterfaceC3394b.a aVar, InterfaceC5511y interfaceC5511y, InterfaceC0158j interfaceC0158j, AbstractC0537f abstractC0537f, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar2, InterfaceC0544m interfaceC0544m, InterfaceC0127M.a aVar3, InterfaceC0546o interfaceC0546o, InterfaceC0533b interfaceC0533b) {
        this.f11159s = c0070a;
        this.f11148a = aVar;
        this.f11149b = interfaceC5511y;
        this.f11150c = interfaceC0546o;
        this.f11151d = interfaceC6364x;
        this.f11152e = aVar2;
        this.f11153f = interfaceC0544m;
        this.f11154n = aVar3;
        this.f11155o = interfaceC0533b;
        this.f11157q = interfaceC0158j;
        this.f11156p = m13390q(c0070a, interfaceC6364x, aVar);
        this.f11161u = interfaceC0158j.mo643b();
    }

    /* renamed from: q */
    public static C0165m0 m13390q(C0070a c0070a, InterfaceC6364x interfaceC6364x, InterfaceC3394b.a aVar) {
        C4304J[] c4304jArr = new C4304J[c0070a.f220f.length];
        int i7 = 0;
        while (true) {
            C0070a.b[] bVarArr = c0070a.f220f;
            if (i7 >= bVarArr.length) {
                return new C0165m0(c4304jArr);
            }
            C4327q[] c4327qArr = bVarArr[i7].f235j;
            C4327q[] c4327qArr2 = new C4327q[c4327qArr.length];
            for (int i8 = 0; i8 < c4327qArr.length; i8++) {
                C4327q c4327q = c4327qArr[i8];
                c4327qArr2[i8] = aVar.mo13385c(c4327q.m18193a().m18241R(interfaceC6364x.mo26608d(c4327q)).m18234K());
            }
            c4304jArr[i7] = new C4304J(Integer.toString(i7), c4327qArr2);
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ List m13391r(C0215h c0215h) {
        return AbstractC3033v.m11051u(Integer.valueOf(c0215h.f887a));
    }

    /* renamed from: v */
    private static C0215h[] m13392v(int i7) {
        return new C0215h[i7];
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return this.f11161u.mo309a();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f11161u.mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        return this.f11161u.mo311e(c5762v0);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        return this.f11161u.mo312f();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        for (C0215h c0215h : this.f11160t) {
            if (c0215h.f887a == 2) {
                return c0215h.m900g(j7, c5714a1);
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        this.f11161u.mo314h(j7);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        this.f11150c.mo2097c();
    }

    /* renamed from: m */
    public final C0215h m13393m(InterfaceC0375y interfaceC0375y, long j7) {
        int m655d = this.f11156p.m655d(interfaceC0375y.mo389a());
        return new C0215h(this.f11159s.f220f[m655d].f226a, null, null, this.f11148a.mo13386d(this.f11150c, this.f11159s, m655d, interfaceC0375y, this.f11149b, null), this, this.f11155o, j7, this.f11151d, this.f11152e, this.f11153f, this.f11154n);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        InterfaceC0375y interfaceC0375y;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            InterfaceC0145c0 interfaceC0145c0 = interfaceC0145c0Arr[i7];
            if (interfaceC0145c0 != null) {
                C0215h c0215h = (C0215h) interfaceC0145c0;
                if (interfaceC0375yArr[i7] == null || !zArr[i7]) {
                    c0215h.m896P();
                    interfaceC0145c0Arr[i7] = null;
                } else {
                    ((InterfaceC3394b) c0215h.m886E()).mo13380a((InterfaceC0375y) AbstractC5332a.m21800e(interfaceC0375yArr[i7]));
                    arrayList.add(c0215h);
                }
            }
            if (interfaceC0145c0Arr[i7] == null && (interfaceC0375y = interfaceC0375yArr[i7]) != null) {
                C0215h m13393m = m13393m(interfaceC0375y, j7);
                arrayList.add(m13393m);
                interfaceC0145c0Arr[i7] = m13393m;
                zArr2[i7] = true;
            }
        }
        C0215h[] m13392v = m13392v(arrayList.size());
        this.f11160t = m13392v;
        arrayList.toArray(m13392v);
        this.f11161u = this.f11157q.mo642a(arrayList, AbstractC2990D.m10791k(arrayList, new InterfaceC2924g() { // from class: B0.a
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                List m13391r;
                m13391r = C3395c.m13391r((C0215h) obj);
                return m13391r;
            }
        }));
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        for (C0215h c0215h : this.f11160t) {
            c0215h.m898S(j7);
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f11158r = aVar;
        aVar.mo322c(this);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        return -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return this.f11156p;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        for (C0215h c0215h : this.f11160t) {
            c0215h.m901u(j7, z6);
        }
    }

    @Override // p022D0.InterfaceC0147d0.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo386b(C0215h c0215h) {
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f11158r)).mo386b(this);
    }

    /* renamed from: x */
    public void m13395x() {
        for (C0215h c0215h : this.f11160t) {
            c0215h.m896P();
        }
        this.f11158r = null;
    }

    /* renamed from: y */
    public void m13396y(C0070a c0070a) {
        this.f11159s = c0070a;
        for (C0215h c0215h : this.f11160t) {
            ((InterfaceC3394b) c0215h.m886E()).mo13381h(c0070a);
        }
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f11158r)).mo386b(this);
    }
}
