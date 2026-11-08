package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.dash.C3373d;
import androidx.media3.exoplayer.dash.InterfaceC3370a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p022D0.C0142b;
import p029E0.AbstractC0209b;
import p029E0.AbstractC0212e;
import p029E0.AbstractC0220m;
import p029E0.C0211d;
import p029E0.C0217j;
import p029E0.C0219l;
import p029E0.C0222o;
import p029E0.InterfaceC0213f;
import p043G0.InterfaceC0375y;
import p050H0.AbstractC0537f;
import p050H0.AbstractC0538g;
import p050H0.InterfaceC0544m;
import p050H0.InterfaceC0546o;
import p078L0.C0873h;
import p178Z2.AbstractC3035x;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5324G;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.C5497k;
import p276l0.C5506t;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;
import p292n0.C5714a1;
import p300o0.C5912w1;
import p319q0.AbstractC6169h;
import p319q0.C6163b;
import p319q0.C6170i;
import p319q0.InterfaceC6168g;
import p327r0.AbstractC6243j;
import p327r0.C6234a;
import p327r0.C6235b;
import p327r0.C6236c;
import p327r0.C6242i;

/* renamed from: androidx.media3.exoplayer.dash.c */
/* loaded from: classes.dex */
public class C3372c implements InterfaceC3370a {

    /* renamed from: a */
    public final InterfaceC0546o f10895a;

    /* renamed from: b */
    public final C6163b f10896b;

    /* renamed from: c */
    public final int[] f10897c;

    /* renamed from: d */
    public final int f10898d;

    /* renamed from: e */
    public final InterfaceC5493g f10899e;

    /* renamed from: f */
    public final long f10900f;

    /* renamed from: g */
    public final int f10901g;

    /* renamed from: h */
    public final C3373d.c f10902h;

    /* renamed from: i */
    public final b[] f10903i;

    /* renamed from: j */
    public InterfaceC0375y f10904j;

    /* renamed from: k */
    public C6236c f10905k;

    /* renamed from: l */
    public int f10906l;

    /* renamed from: m */
    public IOException f10907m;

    /* renamed from: n */
    public boolean f10908n;

    /* renamed from: o */
    public long f10909o = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.dash.c$a */
    public static final class a implements InterfaceC3370a.a {

        /* renamed from: a */
        public final InterfaceC5493g.a f10910a;

        /* renamed from: b */
        public final int f10911b;

        /* renamed from: c */
        public final InterfaceC0213f.a f10912c;

        public a(InterfaceC5493g.a aVar) {
            this(aVar, 1);
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC3370a.a
        /* renamed from: c */
        public C4327q mo13056c(C4327q c4327q) {
            return this.f10912c.mo866c(c4327q);
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC3370a.a
        /* renamed from: d */
        public InterfaceC3370a mo13057d(InterfaceC0546o interfaceC0546o, C6236c c6236c, C6163b c6163b, int i7, int[] iArr, InterfaceC0375y interfaceC0375y, int i8, long j7, boolean z6, List list, C3373d.c cVar, InterfaceC5511y interfaceC5511y, C5912w1 c5912w1, AbstractC0537f abstractC0537f) {
            InterfaceC5493g mo23075a = this.f10910a.mo23075a();
            if (interfaceC5511y != null) {
                mo23075a.mo711c(interfaceC5511y);
            }
            return new C3372c(this.f10912c, interfaceC0546o, c6236c, c6163b, i7, iArr, interfaceC0375y, i8, mo23075a, j7, this.f10911b, z6, list, cVar, c5912w1, abstractC0537f);
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC3370a.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo13055b(boolean z6) {
            this.f10912c.mo865b(z6);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC3370a.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo13054a(InterfaceC4529t.a aVar) {
            this.f10912c.mo864a(aVar);
            return this;
        }

        public a(InterfaceC5493g.a aVar, int i7) {
            this(C0211d.f852q, aVar, i7);
        }

        public a(InterfaceC0213f.a aVar, InterfaceC5493g.a aVar2, int i7) {
            this.f10912c = aVar;
            this.f10910a = aVar2;
            this.f10911b = i7;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0213f f10913a;

        /* renamed from: b */
        public final AbstractC6243j f10914b;

        /* renamed from: c */
        public final C6235b f10915c;

        /* renamed from: d */
        public final InterfaceC6168g f10916d;

        /* renamed from: e */
        public final long f10917e;

        /* renamed from: f */
        public final long f10918f;

        public b(long j7, AbstractC6243j abstractC6243j, C6235b c6235b, InterfaceC0213f interfaceC0213f, long j8, InterfaceC6168g interfaceC6168g) {
            this.f10917e = j7;
            this.f10914b = abstractC6243j;
            this.f10915c = c6235b;
            this.f10918f = j8;
            this.f10913a = interfaceC0213f;
            this.f10916d = interfaceC6168g;
        }

        /* renamed from: b */
        public b m13098b(long j7, AbstractC6243j abstractC6243j) {
            long mo25739f;
            InterfaceC6168g mo26092l = this.f10914b.mo26092l();
            InterfaceC6168g mo26092l2 = abstractC6243j.mo26092l();
            if (mo26092l == null) {
                return new b(j7, abstractC6243j, this.f10915c, this.f10913a, this.f10918f, mo26092l);
            }
            if (!mo26092l.mo25740g()) {
                return new b(j7, abstractC6243j, this.f10915c, this.f10913a, this.f10918f, mo26092l2);
            }
            long mo25742i = mo26092l.mo25742i(j7);
            if (mo25742i == 0) {
                return new b(j7, abstractC6243j, this.f10915c, this.f10913a, this.f10918f, mo26092l2);
            }
            AbstractC5332a.m21804i(mo26092l2);
            long mo25741h = mo26092l.mo25741h();
            long mo25736c = mo26092l.mo25736c(mo25741h);
            long j8 = mo25742i + mo25741h;
            long j9 = j8 - 1;
            long mo25736c2 = mo26092l.mo25736c(j9) + mo26092l.mo25734a(j9, j7);
            long mo25741h2 = mo26092l2.mo25741h();
            long mo25736c3 = mo26092l2.mo25736c(mo25741h2);
            long j10 = this.f10918f;
            if (mo25736c2 != mo25736c3) {
                if (mo25736c2 < mo25736c3) {
                    throw new C0142b();
                }
                if (mo25736c3 < mo25736c) {
                    mo25739f = j10 - (mo26092l2.mo25739f(mo25736c, j7) - mo25741h);
                    return new b(j7, abstractC6243j, this.f10915c, this.f10913a, mo25739f, mo26092l2);
                }
                j8 = mo26092l.mo25739f(mo25736c3, j7);
            }
            mo25739f = j10 + (j8 - mo25741h2);
            return new b(j7, abstractC6243j, this.f10915c, this.f10913a, mo25739f, mo26092l2);
        }

        /* renamed from: c */
        public b m13099c(InterfaceC6168g interfaceC6168g) {
            return new b(this.f10917e, this.f10914b, this.f10915c, this.f10913a, this.f10918f, interfaceC6168g);
        }

        /* renamed from: d */
        public b m13100d(C6235b c6235b) {
            return new b(this.f10917e, this.f10914b, c6235b, this.f10913a, this.f10918f, this.f10916d);
        }

        /* renamed from: e */
        public long m13101e(long j7) {
            return ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25735b(this.f10917e, j7) + this.f10918f;
        }

        /* renamed from: f */
        public long m13102f() {
            return ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25741h() + this.f10918f;
        }

        /* renamed from: g */
        public long m13103g(long j7) {
            return (m13101e(j7) + ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25743j(this.f10917e, j7)) - 1;
        }

        /* renamed from: h */
        public long m13104h() {
            return ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25742i(this.f10917e);
        }

        /* renamed from: i */
        public long m13105i(long j7) {
            return m13107k(j7) + ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25734a(j7 - this.f10918f, this.f10917e);
        }

        /* renamed from: j */
        public long m13106j(long j7) {
            return ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25739f(j7, this.f10917e) + this.f10918f;
        }

        /* renamed from: k */
        public long m13107k(long j7) {
            return ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25736c(j7 - this.f10918f);
        }

        /* renamed from: l */
        public C6242i m13108l(long j7) {
            return ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25738e(j7 - this.f10918f);
        }

        /* renamed from: m */
        public boolean m13109m(long j7, long j8) {
            return ((InterfaceC6168g) AbstractC5332a.m21804i(this.f10916d)).mo25740g() || j8 == -9223372036854775807L || m13105i(j7) <= j8;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$c */
    public static final class c extends AbstractC0209b {

        /* renamed from: e */
        public final b f10919e;

        /* renamed from: f */
        public final long f10920f;

        public c(b bVar, long j7, long j8, long j9) {
            super(j7, j8);
            this.f10919e = bVar;
            this.f10920f = j9;
        }

        @Override // p029E0.InterfaceC0221n
        /* renamed from: a */
        public long mo920a() {
            m852c();
            return this.f10919e.m13107k(m853d());
        }

        @Override // p029E0.InterfaceC0221n
        /* renamed from: b */
        public long mo921b() {
            m852c();
            return this.f10919e.m13105i(m853d());
        }
    }

    public C3372c(InterfaceC0213f.a aVar, InterfaceC0546o interfaceC0546o, C6236c c6236c, C6163b c6163b, int i7, int[] iArr, InterfaceC0375y interfaceC0375y, int i8, InterfaceC5493g interfaceC5493g, long j7, int i9, boolean z6, List list, C3373d.c cVar, C5912w1 c5912w1, AbstractC0537f abstractC0537f) {
        this.f10895a = interfaceC0546o;
        this.f10905k = c6236c;
        this.f10896b = c6163b;
        this.f10897c = iArr;
        this.f10904j = interfaceC0375y;
        this.f10898d = i8;
        this.f10899e = interfaceC5493g;
        this.f10906l = i7;
        this.f10900f = j7;
        this.f10901g = i9;
        this.f10902h = cVar;
        long m26010g = c6236c.m26010g(i7);
        ArrayList m13090o = m13090o();
        this.f10903i = new b[interfaceC0375y.length()];
        int i10 = 0;
        while (i10 < this.f10903i.length) {
            AbstractC6243j abstractC6243j = (AbstractC6243j) m13090o.get(interfaceC0375y.mo391c(i10));
            C6235b m25732j = c6163b.m25732j(abstractC6243j.f22339c);
            int i11 = i10;
            this.f10903i[i11] = new b(m26010g, abstractC6243j, m25732j == null ? (C6235b) abstractC6243j.f22339c.get(0) : m25732j, aVar.mo867d(i8, abstractC6243j.f22338b, z6, list, cVar, c5912w1), 0L, abstractC6243j.mo26092l());
            i10 = i11 + 1;
        }
    }

    @Override // androidx.media3.exoplayer.dash.InterfaceC3370a
    /* renamed from: a */
    public void mo13052a(InterfaceC0375y interfaceC0375y) {
        this.f10904j = interfaceC0375y;
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: b */
    public boolean mo905b(long j7, AbstractC0212e abstractC0212e, List list) {
        if (this.f10907m != null) {
            return false;
        }
        return this.f10904j.mo396j(j7, abstractC0212e, list);
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: c */
    public void mo906c() {
        IOException iOException = this.f10907m;
        if (iOException != null) {
            throw iOException;
        }
        this.f10895a.mo2097c();
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: d */
    public void mo907d(AbstractC0212e abstractC0212e) {
        C0873h mo862e;
        if (abstractC0212e instanceof C0219l) {
            int mo392d = this.f10904j.mo392d(((C0219l) abstractC0212e).f875d);
            b bVar = this.f10903i[mo392d];
            if (bVar.f10916d == null && (mo862e = ((InterfaceC0213f) AbstractC5332a.m21804i(bVar.f10913a)).mo862e()) != null) {
                this.f10903i[mo392d] = bVar.m13099c(new C6170i(mo862e, bVar.f10914b.f22340d));
            }
        }
        C3373d.c cVar = this.f10902h;
        if (cVar != null) {
            cVar.m13129i(abstractC0212e);
        }
    }

    @Override // androidx.media3.exoplayer.dash.InterfaceC3370a
    /* renamed from: e */
    public void mo13053e(C6236c c6236c, int i7) {
        try {
            this.f10905k = c6236c;
            this.f10906l = i7;
            long m26010g = c6236c.m26010g(i7);
            ArrayList m13090o = m13090o();
            for (int i8 = 0; i8 < this.f10903i.length; i8++) {
                AbstractC6243j abstractC6243j = (AbstractC6243j) m13090o.get(this.f10904j.mo391c(i8));
                b[] bVarArr = this.f10903i;
                bVarArr[i8] = bVarArr[i8].m13098b(m26010g, abstractC6243j);
            }
        } catch (C0142b e7) {
            this.f10907m = e7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // p029E0.InterfaceC0216i
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo908f(p292n0.C5762v0 r33, long r34, java.util.List r36, p029E0.C0214g r37) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.C3372c.mo908f(n0.v0, long, java.util.List, E0.g):void");
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: g */
    public long mo909g(long j7, C5714a1 c5714a1) {
        for (b bVar : this.f10903i) {
            if (bVar.f10916d != null) {
                long m13104h = bVar.m13104h();
                if (m13104h != 0) {
                    long m13106j = bVar.m13106j(j7);
                    long m13107k = bVar.m13107k(m13106j);
                    return c5714a1.m23938a(j7, m13107k, (m13107k >= j7 || (m13104h != -1 && m13106j >= (bVar.m13102f() + m13104h) - 1)) ? m13107k : bVar.m13107k(m13106j + 1));
                }
            }
        }
        return j7;
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: i */
    public int mo910i(long j7, List list) {
        return (this.f10907m != null || this.f10904j.length() < 2) ? list.size() : this.f10904j.mo401o(j7, list);
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: j */
    public boolean mo911j(AbstractC0212e abstractC0212e, boolean z6, InterfaceC0544m.c cVar, InterfaceC0544m interfaceC0544m) {
        InterfaceC0544m.b mo2085a;
        if (!z6) {
            return false;
        }
        C3373d.c cVar2 = this.f10902h;
        if (cVar2 != null && cVar2.m13130j(abstractC0212e)) {
            return true;
        }
        if (!this.f10905k.f22291d && (abstractC0212e instanceof AbstractC0220m)) {
            IOException iOException = cVar.f1783c;
            if ((iOException instanceof C5506t) && ((C5506t) iOException).f19849d == 404) {
                b bVar = this.f10903i[this.f10904j.mo392d(abstractC0212e.f875d)];
                long m13104h = bVar.m13104h();
                if (m13104h != -1 && m13104h != 0) {
                    if (((AbstractC0220m) abstractC0212e).mo912g() > (bVar.m13102f() + m13104h) - 1) {
                        this.f10908n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f10903i[this.f10904j.mo392d(abstractC0212e.f875d)];
        C6235b m25732j = this.f10896b.m25732j(bVar2.f10914b.f22339c);
        if (m25732j != null && !bVar2.f10915c.equals(m25732j)) {
            return true;
        }
        InterfaceC0544m.a m13086k = m13086k(this.f10904j, bVar2.f10914b.f22339c);
        if ((!m13086k.m2091a(2) && !m13086k.m2091a(1)) || (mo2085a = interfaceC0544m.mo2085a(m13086k, cVar)) == null || !m13086k.m2091a(mo2085a.f1779a)) {
            return false;
        }
        int i7 = mo2085a.f1779a;
        if (i7 == 2) {
            InterfaceC0375y interfaceC0375y = this.f10904j;
            return interfaceC0375y.mo405s(interfaceC0375y.mo392d(abstractC0212e.f875d), mo2085a.f1780b);
        }
        if (i7 != 1) {
            return false;
        }
        this.f10896b.m25729e(bVar2.f10915c, mo2085a.f1780b);
        return true;
    }

    /* renamed from: k */
    public final InterfaceC0544m.a m13086k(InterfaceC0375y interfaceC0375y, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC0375y.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (interfaceC0375y.mo395i(i8, elapsedRealtime)) {
                i7++;
            }
        }
        int m25726f = C6163b.m25726f(list);
        return new InterfaceC0544m.a(m25726f, m25726f - this.f10896b.m25730g(list), length, i7);
    }

    /* renamed from: l */
    public final long m13087l(long j7, long j8) {
        if (!this.f10905k.f22291d || this.f10903i[0].m13104h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m13089n(j7), this.f10903i[0].m13105i(this.f10903i[0].m13103g(j7))) - j8);
    }

    /* renamed from: m */
    public final Pair m13088m(long j7, C6242i c6242i, b bVar) {
        long j8 = j7 + 1;
        if (j8 >= bVar.m13104h()) {
            return null;
        }
        C6242i m13108l = bVar.m13108l(j8);
        String m21661a = AbstractC5324G.m21661a(c6242i.m26088b(bVar.f10915c.f22284a), m13108l.m26088b(bVar.f10915c.f22284a));
        String str = m13108l.f22333a + "-";
        if (m13108l.f22334b != -1) {
            str = str + (m13108l.f22333a + m13108l.f22334b);
        }
        return new Pair(m21661a, str);
    }

    /* renamed from: n */
    public final long m13089n(long j7) {
        C6236c c6236c = this.f10905k;
        long j8 = c6236c.f22288a;
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j7 - AbstractC5330M.m21692K0(j8 + c6236c.m26007d(this.f10906l).f22324b);
    }

    /* renamed from: o */
    public final ArrayList m13090o() {
        List list = this.f10905k.m26007d(this.f10906l).f22325c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f10897c) {
            arrayList.addAll(((C6234a) list.get(i7)).f22280c);
        }
        return arrayList;
    }

    /* renamed from: p */
    public final long m13091p(b bVar, AbstractC0220m abstractC0220m, long j7, long j8, long j9) {
        return abstractC0220m != null ? abstractC0220m.mo912g() : AbstractC5330M.m21768q(bVar.m13106j(j7), j8, j9);
    }

    /* renamed from: q */
    public AbstractC0212e m13092q(b bVar, InterfaceC5493g interfaceC5493g, C4327q c4327q, int i7, Object obj, C6242i c6242i, C6242i c6242i2, AbstractC0538g.a aVar) {
        C6242i c6242i3 = c6242i;
        AbstractC6243j abstractC6243j = bVar.f10914b;
        if (c6242i3 != null) {
            C6242i m26087a = c6242i3.m26087a(c6242i2, bVar.f10915c.f22284a);
            if (m26087a != null) {
                c6242i3 = m26087a;
            }
        } else {
            c6242i3 = (C6242i) AbstractC5332a.m21800e(c6242i2);
        }
        return new C0219l(interfaceC5493g, AbstractC6169h.m25744a(abstractC6243j, bVar.f10915c.f22284a, c6242i3, 0, AbstractC3035x.m11072j()), c4327q, i7, obj, bVar.f10913a);
    }

    /* renamed from: r */
    public AbstractC0212e m13093r(b bVar, InterfaceC5493g interfaceC5493g, int i7, C4327q c4327q, int i8, Object obj, long j7, int i9, long j8, long j9, AbstractC0538g.a aVar) {
        AbstractC6243j abstractC6243j = bVar.f10914b;
        long m13107k = bVar.m13107k(j7);
        C6242i m13108l = bVar.m13108l(j7);
        if (bVar.f10913a == null) {
            return new C0222o(interfaceC5493g, AbstractC6169h.m25744a(abstractC6243j, bVar.f10915c.f22284a, m13108l, bVar.m13109m(j7, j9) ? 0 : 8, AbstractC3035x.m11072j()), c4327q, i8, obj, m13107k, bVar.m13105i(j7), j7, i7, c4327q);
        }
        int i10 = 1;
        int i11 = 1;
        while (i10 < i9) {
            C6242i m26087a = m13108l.m26087a(bVar.m13108l(i10 + j7), bVar.f10915c.f22284a);
            if (m26087a == null) {
                break;
            }
            i11++;
            i10++;
            m13108l = m26087a;
        }
        long j10 = (i11 + j7) - 1;
        long m13105i = bVar.m13105i(j10);
        long j11 = bVar.f10917e;
        if (j11 == -9223372036854775807L || j11 > m13105i) {
            j11 = -9223372036854775807L;
        }
        C5497k m25744a = AbstractC6169h.m25744a(abstractC6243j, bVar.f10915c.f22284a, m13108l, bVar.m13109m(j10, j9) ? 0 : 8, AbstractC3035x.m11072j());
        long j12 = -abstractC6243j.f22340d;
        if (AbstractC4336z.m18423p(c4327q.f15138n)) {
            j12 += m13107k;
        }
        return new C0217j(interfaceC5493g, m25744a, c4327q, i8, obj, m13107k, m13105i, j8, j11, j7, i11, j12, bVar.f10913a);
    }

    @Override // p029E0.InterfaceC0216i
    public void release() {
        for (b bVar : this.f10903i) {
            InterfaceC0213f interfaceC0213f = bVar.f10913a;
            if (interfaceC0213f != null) {
                interfaceC0213f.release();
            }
        }
    }

    /* renamed from: s */
    public final b m13094s(int i7) {
        b bVar = this.f10903i[i7];
        C6235b m25732j = this.f10896b.m25732j(bVar.f10914b.f22339c);
        if (m25732j == null || m25732j.equals(bVar.f10915c)) {
            return bVar;
        }
        b m13100d = bVar.m13100d(m25732j);
        this.f10903i[i7] = m13100d;
        return m13100d;
    }
}
