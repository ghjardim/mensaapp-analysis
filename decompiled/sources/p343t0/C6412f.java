package p343t0;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p022D0.C0142b;
import p029E0.AbstractC0209b;
import p029E0.AbstractC0212e;
import p029E0.AbstractC0218k;
import p029E0.InterfaceC0221n;
import p043G0.AbstractC0353c;
import p043G0.InterfaceC0375y;
import p050H0.AbstractC0537f;
import p050H0.AbstractC0538g;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p232g0.C4304J;
import p232g0.C4327q;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5324G;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;
import p292n0.C5714a1;
import p292n0.C5762v0;
import p300o0.C5912w1;
import p351u0.C6589f;
import p351u0.InterfaceC6594k;

/* renamed from: t0.f */
/* loaded from: classes.dex */
public class C6412f {

    /* renamed from: a */
    public final InterfaceC6414h f23149a;

    /* renamed from: b */
    public final InterfaceC5493g f23150b;

    /* renamed from: c */
    public final InterfaceC5493g f23151c;

    /* renamed from: d */
    public final C6428v f23152d;

    /* renamed from: e */
    public final Uri[] f23153e;

    /* renamed from: f */
    public final C4327q[] f23154f;

    /* renamed from: g */
    public final InterfaceC6594k f23155g;

    /* renamed from: h */
    public final C4304J f23156h;

    /* renamed from: i */
    public final List f23157i;

    /* renamed from: k */
    public final C5912w1 f23159k;

    /* renamed from: l */
    public final long f23160l;

    /* renamed from: m */
    public boolean f23161m;

    /* renamed from: o */
    public IOException f23163o;

    /* renamed from: p */
    public Uri f23164p;

    /* renamed from: q */
    public boolean f23165q;

    /* renamed from: r */
    public InterfaceC0375y f23166r;

    /* renamed from: t */
    public boolean f23168t;

    /* renamed from: u */
    public long f23169u = -9223372036854775807L;

    /* renamed from: j */
    public final C6411e f23158j = new C6411e(4);

    /* renamed from: n */
    public byte[] f23162n = AbstractC5330M.f18805f;

    /* renamed from: s */
    public long f23167s = -9223372036854775807L;

    /* renamed from: t0.f$a */
    public static final class a extends AbstractC0218k {

        /* renamed from: l */
        public byte[] f23170l;

        public a(InterfaceC5493g interfaceC5493g, C5497k c5497k, C4327q c4327q, int i7, Object obj, byte[] bArr) {
            super(interfaceC5493g, c5497k, 3, c4327q, i7, obj, bArr);
        }

        @Override // p029E0.AbstractC0218k
        /* renamed from: g */
        public void mo916g(byte[] bArr, int i7) {
            this.f23170l = Arrays.copyOf(bArr, i7);
        }

        /* renamed from: j */
        public byte[] m26806j() {
            return this.f23170l;
        }
    }

    /* renamed from: t0.f$b */
    public static final class b {

        /* renamed from: a */
        public AbstractC0212e f23171a;

        /* renamed from: b */
        public boolean f23172b;

        /* renamed from: c */
        public Uri f23173c;

        public b() {
            m26807a();
        }

        /* renamed from: a */
        public void m26807a() {
            this.f23171a = null;
            this.f23172b = false;
            this.f23173c = null;
        }
    }

    /* renamed from: t0.f$c */
    public static final class c extends AbstractC0209b {

        /* renamed from: e */
        public final List f23174e;

        /* renamed from: f */
        public final long f23175f;

        /* renamed from: g */
        public final String f23176g;

        public c(String str, long j7, List list) {
            super(0L, list.size() - 1);
            this.f23176g = str;
            this.f23175f = j7;
            this.f23174e = list;
        }

        @Override // p029E0.InterfaceC0221n
        /* renamed from: a */
        public long mo920a() {
            m852c();
            return this.f23175f + ((C6589f.e) this.f23174e.get((int) m853d())).f23684e;
        }

        @Override // p029E0.InterfaceC0221n
        /* renamed from: b */
        public long mo921b() {
            m852c();
            C6589f.e eVar = (C6589f.e) this.f23174e.get((int) m853d());
            return this.f23175f + eVar.f23684e + eVar.f23682c;
        }
    }

    /* renamed from: t0.f$d */
    public static final class d extends AbstractC0353c {

        /* renamed from: h */
        public int f23177h;

        public d(C4304J c4304j, int[] iArr) {
            super(c4304j, iArr);
            this.f23177h = mo392d(c4304j.m18064a(iArr[0]));
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: k */
        public int mo397k() {
            return this.f23177h;
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: n */
        public void mo400n(long j7, long j8, long j9, List list, InterfaceC0221n[] interfaceC0221nArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo395i(this.f23177h, elapsedRealtime)) {
                for (int i7 = this.f1333b - 1; i7 >= 0; i7--) {
                    if (!mo395i(i7, elapsedRealtime)) {
                        this.f23177h = i7;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: r */
        public int mo404r() {
            return 0;
        }

        @Override // p043G0.InterfaceC0375y
        /* renamed from: u */
        public Object mo407u() {
            return null;
        }
    }

    /* renamed from: t0.f$e */
    public static final class e {

        /* renamed from: a */
        public final C6589f.e f23178a;

        /* renamed from: b */
        public final long f23179b;

        /* renamed from: c */
        public final int f23180c;

        /* renamed from: d */
        public final boolean f23181d;

        public e(C6589f.e eVar, long j7, int i7) {
            this.f23178a = eVar;
            this.f23179b = j7;
            this.f23180c = i7;
            this.f23181d = (eVar instanceof C6589f.b) && ((C6589f.b) eVar).f23674t;
        }
    }

    public C6412f(InterfaceC6414h interfaceC6414h, InterfaceC6594k interfaceC6594k, Uri[] uriArr, C4327q[] c4327qArr, InterfaceC6413g interfaceC6413g, InterfaceC5511y interfaceC5511y, C6428v c6428v, long j7, List list, C5912w1 c5912w1, AbstractC0537f abstractC0537f) {
        this.f23149a = interfaceC6414h;
        this.f23155g = interfaceC6594k;
        this.f23153e = uriArr;
        this.f23154f = c4327qArr;
        this.f23152d = c6428v;
        this.f23160l = j7;
        this.f23157i = list;
        this.f23159k = c5912w1;
        InterfaceC5493g mo26764a = interfaceC6413g.mo26764a(1);
        this.f23150b = mo26764a;
        if (interfaceC5511y != null) {
            mo26764a.mo711c(interfaceC5511y);
        }
        this.f23151c = interfaceC6413g.mo26764a(3);
        this.f23156h = new C4304J(c4327qArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((c4327qArr[i7].f15130f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        this.f23166r = new d(this.f23156h, AbstractC3577g.m14431n(arrayList));
    }

    /* renamed from: e */
    public static Uri m26781e(C6589f c6589f, C6589f.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f23686n) == null) {
            return null;
        }
        return AbstractC5324G.m21666f(c6589f.f23717a, str);
    }

    /* renamed from: h */
    public static e m26782h(C6589f c6589f, long j7, int i7) {
        int i8 = (int) (j7 - c6589f.f23661k);
        if (i8 == c6589f.f23668r.size()) {
            if (i7 == -1) {
                i7 = 0;
            }
            if (i7 < c6589f.f23669s.size()) {
                return new e((C6589f.e) c6589f.f23669s.get(i7), j7, i7);
            }
            return null;
        }
        C6589f.d dVar = (C6589f.d) c6589f.f23668r.get(i8);
        if (i7 == -1) {
            return new e(dVar, j7, -1);
        }
        if (i7 < dVar.f23679t.size()) {
            return new e((C6589f.e) dVar.f23679t.get(i7), j7, i7);
        }
        int i9 = i8 + 1;
        if (i9 < c6589f.f23668r.size()) {
            return new e((C6589f.e) c6589f.f23668r.get(i9), j7 + 1, -1);
        }
        if (c6589f.f23669s.isEmpty()) {
            return null;
        }
        return new e((C6589f.e) c6589f.f23669s.get(0), j7 + 1, 0);
    }

    /* renamed from: j */
    public static List m26783j(C6589f c6589f, long j7, int i7) {
        int i8 = (int) (j7 - c6589f.f23661k);
        if (i8 < 0 || c6589f.f23668r.size() < i8) {
            return AbstractC3033v.m11050t();
        }
        ArrayList arrayList = new ArrayList();
        if (i8 < c6589f.f23668r.size()) {
            if (i7 != -1) {
                C6589f.d dVar = (C6589f.d) c6589f.f23668r.get(i8);
                if (i7 == 0) {
                    arrayList.add(dVar);
                } else if (i7 < dVar.f23679t.size()) {
                    List list = dVar.f23679t;
                    arrayList.addAll(list.subList(i7, list.size()));
                }
                i8++;
            }
            List list2 = c6589f.f23668r;
            arrayList.addAll(list2.subList(i8, list2.size()));
            i7 = 0;
        }
        if (c6589f.f23664n != -9223372036854775807L) {
            int i9 = i7 != -1 ? i7 : 0;
            if (i9 < c6589f.f23669s.size()) {
                List list3 = c6589f.f23669s;
                arrayList.addAll(list3.subList(i9, list3.size()));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public InterfaceC0221n[] m26784a(C6416j c6416j, long j7) {
        int i7;
        int m18065b = c6416j == null ? -1 : this.f23156h.m18065b(c6416j.f875d);
        int length = this.f23166r.length();
        InterfaceC0221n[] interfaceC0221nArr = new InterfaceC0221n[length];
        boolean z6 = false;
        int i8 = 0;
        while (i8 < length) {
            int mo391c = this.f23166r.mo391c(i8);
            Uri uri = this.f23153e[mo391c];
            if (this.f23155g.mo27389b(uri)) {
                C6589f mo27400o = this.f23155g.mo27400o(uri, z6);
                AbstractC5332a.m21800e(mo27400o);
                long mo27393f = mo27400o.f23658h - this.f23155g.mo27393f();
                i7 = i8;
                Pair m26789g = m26789g(c6416j, mo391c != m18065b ? true : z6, mo27400o, mo27393f, j7);
                interfaceC0221nArr[i7] = new c(mo27400o.f23717a, mo27393f, m26783j(mo27400o, ((Long) m26789g.first).longValue(), ((Integer) m26789g.second).intValue()));
            } else {
                interfaceC0221nArr[i8] = InterfaceC0221n.f924a;
                i7 = i8;
            }
            i8 = i7 + 1;
            z6 = false;
        }
        return interfaceC0221nArr;
    }

    /* renamed from: b */
    public final void m26785b() {
        this.f23155g.mo27391d(this.f23153e[this.f23166r.mo402p()]);
    }

    /* renamed from: c */
    public long m26786c(long j7, C5714a1 c5714a1) {
        int mo397k = this.f23166r.mo397k();
        Uri[] uriArr = this.f23153e;
        C6589f mo27400o = (mo397k >= uriArr.length || mo397k == -1) ? null : this.f23155g.mo27400o(uriArr[this.f23166r.mo402p()], true);
        if (mo27400o == null || mo27400o.f23668r.isEmpty() || !mo27400o.f23719c) {
            return j7;
        }
        long mo27393f = mo27400o.f23658h - this.f23155g.mo27393f();
        long j8 = j7 - mo27393f;
        int m21738f = AbstractC5330M.m21738f(mo27400o.f23668r, Long.valueOf(j8), true, true);
        long j9 = ((C6589f.d) mo27400o.f23668r.get(m21738f)).f23684e;
        return c5714a1.m23938a(j8, j9, m21738f != mo27400o.f23668r.size() - 1 ? ((C6589f.d) mo27400o.f23668r.get(m21738f + 1)).f23684e : j9) + mo27393f;
    }

    /* renamed from: d */
    public int m26787d(C6416j c6416j) {
        if (c6416j.f23203o == -1) {
            return 1;
        }
        C6589f c6589f = (C6589f) AbstractC5332a.m21800e(this.f23155g.mo27400o(this.f23153e[this.f23156h.m18065b(c6416j.f875d)], false));
        int i7 = (int) (c6416j.f923j - c6589f.f23661k);
        if (i7 < 0) {
            return 1;
        }
        List list = i7 < c6589f.f23668r.size() ? ((C6589f.d) c6589f.f23668r.get(i7)).f23679t : c6589f.f23669s;
        if (c6416j.f23203o >= list.size()) {
            return 2;
        }
        C6589f.b bVar = (C6589f.b) list.get(c6416j.f23203o);
        if (bVar.f23674t) {
            return 0;
        }
        return AbstractC5330M.m21729c(Uri.parse(AbstractC5324G.m21665e(c6589f.f23717a, bVar.f23680a)), c6416j.f873b.f19781a) ? 1 : 2;
    }

    /* renamed from: f */
    public void m26788f(C5762v0 c5762v0, long j7, List list, boolean z6, b bVar) {
        int m18065b;
        C5762v0 c5762v02;
        C6589f c6589f;
        long j8;
        C6416j c6416j = list.isEmpty() ? null : (C6416j) AbstractC2987A.m10751d(list);
        if (c6416j == null) {
            c5762v02 = c5762v0;
            m18065b = -1;
        } else {
            m18065b = this.f23156h.m18065b(c6416j.f875d);
            c5762v02 = c5762v0;
        }
        long j9 = c5762v02.f20981a;
        long j10 = j7 - j9;
        long m26801u = m26801u(j9);
        if (c6416j != null && !this.f23165q) {
            long m871d = c6416j.m871d();
            j10 = Math.max(0L, j10 - m871d);
            if (m26801u != -9223372036854775807L) {
                m26801u = Math.max(0L, m26801u - m871d);
            }
        }
        this.f23166r.mo400n(j9, j10, m26801u, list, m26784a(c6416j, j7));
        int mo402p = this.f23166r.mo402p();
        boolean z7 = m18065b != mo402p;
        Uri uri = this.f23153e[mo402p];
        if (!this.f23155g.mo27389b(uri)) {
            bVar.f23173c = uri;
            this.f23168t &= uri.equals(this.f23164p);
            this.f23164p = uri;
            return;
        }
        C6589f mo27400o = this.f23155g.mo27400o(uri, true);
        AbstractC5332a.m21800e(mo27400o);
        this.f23165q = mo27400o.f23719c;
        m26805y(mo27400o);
        long mo27393f = mo27400o.f23658h - this.f23155g.mo27393f();
        Uri uri2 = uri;
        Pair m26789g = m26789g(c6416j, z7, mo27400o, mo27393f, j7);
        long longValue = ((Long) m26789g.first).longValue();
        int intValue = ((Integer) m26789g.second).intValue();
        if (longValue >= mo27400o.f23661k || c6416j == null || !z7) {
            c6589f = mo27400o;
            j8 = mo27393f;
        } else {
            uri2 = this.f23153e[m18065b];
            C6589f mo27400o2 = this.f23155g.mo27400o(uri2, true);
            AbstractC5332a.m21800e(mo27400o2);
            j8 = mo27400o2.f23658h - this.f23155g.mo27393f();
            Pair m26789g2 = m26789g(c6416j, false, mo27400o2, j8, j7);
            longValue = ((Long) m26789g2.first).longValue();
            intValue = ((Integer) m26789g2.second).intValue();
            c6589f = mo27400o2;
            mo402p = m18065b;
        }
        if (mo402p != m18065b && m18065b != -1) {
            this.f23155g.mo27391d(this.f23153e[m18065b]);
        }
        if (longValue < c6589f.f23661k) {
            this.f23163o = new C0142b();
            return;
        }
        e m26782h = m26782h(c6589f, longValue, intValue);
        if (m26782h == null) {
            if (!c6589f.f23665o) {
                bVar.f23173c = uri2;
                this.f23168t &= uri2.equals(this.f23164p);
                this.f23164p = uri2;
                return;
            } else {
                if (z6 || c6589f.f23668r.isEmpty()) {
                    bVar.f23172b = true;
                    return;
                }
                m26782h = new e((C6589f.e) AbstractC2987A.m10751d(c6589f.f23668r), (c6589f.f23661k + c6589f.f23668r.size()) - 1, -1);
            }
        }
        this.f23168t = false;
        this.f23164p = null;
        this.f23169u = SystemClock.elapsedRealtime();
        Uri m26781e = m26781e(c6589f, m26782h.f23178a.f23681b);
        AbstractC0212e m26794n = m26794n(m26781e, mo402p, true, null);
        bVar.f23171a = m26794n;
        if (m26794n != null) {
            return;
        }
        Uri m26781e2 = m26781e(c6589f, m26782h.f23178a);
        AbstractC0212e m26794n2 = m26794n(m26781e2, mo402p, false, null);
        bVar.f23171a = m26794n2;
        if (m26794n2 != null) {
            return;
        }
        boolean m26812w = C6416j.m26812w(c6416j, uri2, c6589f, m26782h, j8);
        if (m26812w && m26782h.f23181d) {
            return;
        }
        bVar.f23171a = C6416j.m26809j(this.f23149a, this.f23150b, this.f23154f[mo402p], j8, c6589f, m26782h, uri2, this.f23157i, this.f23166r.mo404r(), this.f23166r.mo407u(), this.f23161m, this.f23152d, this.f23160l, c6416j, this.f23158j.m26778a(m26781e2), this.f23158j.m26778a(m26781e), m26812w, this.f23159k, null);
    }

    /* renamed from: g */
    public final Pair m26789g(C6416j c6416j, boolean z6, C6589f c6589f, long j7, long j8) {
        if (c6416j != null && !z6) {
            if (!c6416j.mo913h()) {
                return new Pair(Long.valueOf(c6416j.f923j), Integer.valueOf(c6416j.f23203o));
            }
            Long valueOf = Long.valueOf(c6416j.f23203o == -1 ? c6416j.mo912g() : c6416j.f923j);
            int i7 = c6416j.f23203o;
            return new Pair(valueOf, Integer.valueOf(i7 != -1 ? i7 + 1 : -1));
        }
        long j9 = c6589f.f23671u + j7;
        if (c6416j != null && !this.f23165q) {
            j8 = c6416j.f878g;
        }
        if (!c6589f.f23665o && j8 >= j9) {
            return new Pair(Long.valueOf(c6589f.f23661k + c6589f.f23668r.size()), -1);
        }
        long j10 = j8 - j7;
        int i8 = 0;
        int m21738f = AbstractC5330M.m21738f(c6589f.f23668r, Long.valueOf(j10), true, !this.f23155g.mo27394g() || c6416j == null);
        long j11 = m21738f + c6589f.f23661k;
        if (m21738f >= 0) {
            C6589f.d dVar = (C6589f.d) c6589f.f23668r.get(m21738f);
            List list = j10 < dVar.f23684e + dVar.f23682c ? dVar.f23679t : c6589f.f23669s;
            while (true) {
                if (i8 >= list.size()) {
                    break;
                }
                C6589f.b bVar = (C6589f.b) list.get(i8);
                if (j10 >= bVar.f23684e + bVar.f23682c) {
                    i8++;
                } else if (bVar.f23673s) {
                    j11 += list == c6589f.f23669s ? 1L : 0L;
                    r1 = i8;
                }
            }
        }
        return new Pair(Long.valueOf(j11), Integer.valueOf(r1));
    }

    /* renamed from: i */
    public int m26790i(long j7, List list) {
        return (this.f23163o != null || this.f23166r.length() < 2) ? list.size() : this.f23166r.mo401o(j7, list);
    }

    /* renamed from: k */
    public C4304J m26791k() {
        return this.f23156h;
    }

    /* renamed from: l */
    public InterfaceC0375y m26792l() {
        return this.f23166r;
    }

    /* renamed from: m */
    public boolean m26793m() {
        return this.f23165q;
    }

    /* renamed from: n */
    public final AbstractC0212e m26794n(Uri uri, int i7, boolean z6, AbstractC0538g.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] m26780c = this.f23158j.m26780c(uri);
        if (m26780c != null) {
            this.f23158j.m26779b(uri, m26780c);
            return null;
        }
        return new a(this.f23151c, new C5497k.b().m23094i(uri).m23087b(1).m23086a(), this.f23154f[i7], this.f23166r.mo404r(), this.f23166r.mo407u(), this.f23162n);
    }

    /* renamed from: o */
    public boolean m26795o(AbstractC0212e abstractC0212e, long j7) {
        InterfaceC0375y interfaceC0375y = this.f23166r;
        return interfaceC0375y.mo405s(interfaceC0375y.mo393e(this.f23156h.m18065b(abstractC0212e.f875d)), j7);
    }

    /* renamed from: p */
    public void m26796p() {
        IOException iOException = this.f23163o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f23164p;
        if (uri == null || !this.f23168t) {
            return;
        }
        this.f23155g.mo27392e(uri);
    }

    /* renamed from: q */
    public boolean m26797q(Uri uri) {
        return AbstractC5330M.m21772s(this.f23153e, uri);
    }

    /* renamed from: r */
    public void m26798r(AbstractC0212e abstractC0212e) {
        if (abstractC0212e instanceof a) {
            a aVar = (a) abstractC0212e;
            this.f23162n = aVar.m917h();
            this.f23158j.m26779b(aVar.f873b.f19781a, (byte[]) AbstractC5332a.m21800e(aVar.m26806j()));
        }
    }

    /* renamed from: s */
    public boolean m26799s(Uri uri, long j7) {
        int mo393e;
        int i7 = 0;
        while (true) {
            Uri[] uriArr = this.f23153e;
            if (i7 >= uriArr.length) {
                i7 = -1;
                break;
            }
            if (uriArr[i7].equals(uri)) {
                break;
            }
            i7++;
        }
        if (i7 == -1 || (mo393e = this.f23166r.mo393e(i7)) == -1) {
            return true;
        }
        this.f23168t |= uri.equals(this.f23164p);
        return j7 == -9223372036854775807L || (this.f23166r.mo405s(mo393e, j7) && this.f23155g.mo27396i(uri, j7));
    }

    /* renamed from: t */
    public void m26800t() {
        m26785b();
        this.f23163o = null;
    }

    /* renamed from: u */
    public final long m26801u(long j7) {
        long j8 = this.f23167s;
        if (j8 != -9223372036854775807L) {
            return j8 - j7;
        }
        return -9223372036854775807L;
    }

    /* renamed from: v */
    public void m26802v(boolean z6) {
        this.f23161m = z6;
    }

    /* renamed from: w */
    public void m26803w(InterfaceC0375y interfaceC0375y) {
        m26785b();
        this.f23166r = interfaceC0375y;
    }

    /* renamed from: x */
    public boolean m26804x(long j7, AbstractC0212e abstractC0212e, List list) {
        if (this.f23163o != null) {
            return false;
        }
        return this.f23166r.mo396j(j7, abstractC0212e, list);
    }

    /* renamed from: y */
    public final void m26805y(C6589f c6589f) {
        this.f23167s = c6589f.f23665o ? -9223372036854775807L : c6589f.m27427e() - this.f23155g.mo27393f();
    }
}
