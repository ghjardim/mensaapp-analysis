package p022D0;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p022D0.C0143b0;
import p022D0.C0178x;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0127M;
import p043G0.InterfaceC0375y;
import p050H0.C0545n;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p078L0.AbstractC0846D;
import p078L0.C0854L;
import p078L0.C0879n;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p169Y0.C2892b;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4304J;
import p232g0.C4327q;
import p232g0.C4334x;
import p232g0.InterfaceC4319i;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5337f;
import p259j0.C5357z;
import p276l0.AbstractC5496j;
import p276l0.C5497k;
import p276l0.C5510x;
import p276l0.InterfaceC5493g;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;

/* renamed from: D0.W */
/* loaded from: classes.dex */
public final class C0136W implements InterfaceC0117C, InterfaceC0885t, C0545n.b, C0545n.f, C0143b0.d {

    /* renamed from: V */
    public static final Map f433V = m433M();

    /* renamed from: W */
    public static final C4327q f434W = new C4327q.b().m18250a0("icy").m18264o0("application/x-icy").m18234K();

    /* renamed from: C */
    public boolean f437C;

    /* renamed from: D */
    public boolean f438D;

    /* renamed from: E */
    public boolean f439E;

    /* renamed from: F */
    public boolean f440F;

    /* renamed from: G */
    public f f441G;

    /* renamed from: H */
    public InterfaceC0855M f442H;

    /* renamed from: I */
    public long f443I;

    /* renamed from: J */
    public boolean f444J;

    /* renamed from: L */
    public boolean f446L;

    /* renamed from: M */
    public boolean f447M;

    /* renamed from: N */
    public int f448N;

    /* renamed from: O */
    public boolean f449O;

    /* renamed from: P */
    public long f450P;

    /* renamed from: R */
    public boolean f452R;

    /* renamed from: S */
    public int f453S;

    /* renamed from: T */
    public boolean f454T;

    /* renamed from: U */
    public boolean f455U;

    /* renamed from: a */
    public final Uri f456a;

    /* renamed from: b */
    public final InterfaceC5493g f457b;

    /* renamed from: c */
    public final InterfaceC6364x f458c;

    /* renamed from: d */
    public final InterfaceC0544m f459d;

    /* renamed from: e */
    public final InterfaceC0127M.a f460e;

    /* renamed from: f */
    public final InterfaceC6362v.a f461f;

    /* renamed from: n */
    public final c f462n;

    /* renamed from: o */
    public final InterfaceC0533b f463o;

    /* renamed from: p */
    public final String f464p;

    /* renamed from: q */
    public final long f465q;

    /* renamed from: r */
    public final long f466r;

    /* renamed from: t */
    public final InterfaceC0131Q f468t;

    /* renamed from: y */
    public InterfaceC0117C.a f473y;

    /* renamed from: z */
    public C2892b f474z;

    /* renamed from: s */
    public final C0545n f467s = new C0545n("ProgressiveMediaPeriod");

    /* renamed from: u */
    public final C5337f f469u = new C5337f();

    /* renamed from: v */
    public final Runnable f470v = new Runnable() { // from class: D0.T
        @Override // java.lang.Runnable
        public final void run() {
            C0136W.this.m435V();
        }
    };

    /* renamed from: w */
    public final Runnable f471w = new Runnable() { // from class: D0.U
        @Override // java.lang.Runnable
        public final void run() {
            C0136W.this.m447S();
        }
    };

    /* renamed from: x */
    public final Handler f472x = AbstractC5330M.m21671A();

    /* renamed from: B */
    public e[] f436B = new e[0];

    /* renamed from: A */
    public C0143b0[] f435A = new C0143b0[0];

    /* renamed from: Q */
    public long f451Q = -9223372036854775807L;

    /* renamed from: K */
    public int f445K = 1;

    /* renamed from: D0.W$a */
    public class a extends AbstractC0846D {
        public a(InterfaceC0855M interfaceC0855M) {
            super(interfaceC0855M);
        }

        @Override // p078L0.AbstractC0846D, p078L0.InterfaceC0855M
        /* renamed from: l */
        public long mo474l() {
            return C0136W.this.f443I;
        }
    }

    /* renamed from: D0.W$b */
    public final class b implements C0545n.e, C0178x.a {

        /* renamed from: b */
        public final Uri f477b;

        /* renamed from: c */
        public final C5510x f478c;

        /* renamed from: d */
        public final InterfaceC0131Q f479d;

        /* renamed from: e */
        public final InterfaceC0885t f480e;

        /* renamed from: f */
        public final C5337f f481f;

        /* renamed from: h */
        public volatile boolean f483h;

        /* renamed from: j */
        public long f485j;

        /* renamed from: l */
        public InterfaceC0861T f487l;

        /* renamed from: m */
        public boolean f488m;

        /* renamed from: g */
        public final C0854L f482g = new C0854L();

        /* renamed from: i */
        public boolean f484i = true;

        /* renamed from: a */
        public final long f476a = C0179y.m716a();

        /* renamed from: k */
        public C5497k f486k = m483i(0);

        public b(Uri uri, InterfaceC5493g interfaceC5493g, InterfaceC0131Q interfaceC0131Q, InterfaceC0885t interfaceC0885t, C5337f c5337f) {
            this.f477b = uri;
            this.f478c = new C5510x(interfaceC5493g);
            this.f479d = interfaceC0131Q;
            this.f480e = interfaceC0885t;
            this.f481f = c5337f;
        }

        @Override // p022D0.C0178x.a
        /* renamed from: a */
        public void mo480a(C5357z c5357z) {
            long max = !this.f488m ? this.f485j : Math.max(C0136W.this.m444O(true), this.f485j);
            int m21942a = c5357z.m21942a();
            InterfaceC0861T interfaceC0861T = (InterfaceC0861T) AbstractC5332a.m21800e(this.f487l);
            interfaceC0861T.mo564d(c5357z, m21942a);
            interfaceC0861T.mo562c(max, 1, m21942a, 0, null);
            this.f488m = true;
        }

        @Override // p050H0.C0545n.e
        /* renamed from: b */
        public void mo481b() {
            int i7 = 0;
            while (i7 == 0 && !this.f483h) {
                try {
                    long j7 = this.f482g.f2935a;
                    C5497k m483i = m483i(j7);
                    this.f486k = m483i;
                    long mo714o = this.f478c.mo714o(m483i);
                    if (this.f483h) {
                        if (i7 != 1 && this.f479d.mo419c() != -1) {
                            this.f482g.f2935a = this.f479d.mo419c();
                        }
                        AbstractC5496j.m23079a(this.f478c);
                        return;
                    }
                    if (mo714o != -1) {
                        mo714o += j7;
                        C0136W.this.m454a0();
                    }
                    long j8 = mo714o;
                    C0136W.this.f474z = C2892b.m10418a(this.f478c.mo713n());
                    InterfaceC4319i interfaceC4319i = this.f478c;
                    if (C0136W.this.f474z != null && C0136W.this.f474z.f8902f != -1) {
                        interfaceC4319i = new C0178x(this.f478c, C0136W.this.f474z.f8902f, this);
                        InterfaceC0861T m445P = C0136W.this.m445P();
                        this.f487l = m445P;
                        m445P.mo566e(C0136W.f434W);
                    }
                    long j9 = j7;
                    this.f479d.mo421e(interfaceC4319i, this.f477b, this.f478c.mo713n(), j7, j8, this.f480e);
                    if (C0136W.this.f474z != null) {
                        this.f479d.mo420d();
                    }
                    if (this.f484i) {
                        this.f479d.mo417a(j9, this.f485j);
                        this.f484i = false;
                    }
                    while (true) {
                        long j10 = j9;
                        while (i7 == 0 && !this.f483h) {
                            try {
                                this.f481f.m21821a();
                                i7 = this.f479d.mo418b(this.f482g);
                                j9 = this.f479d.mo419c();
                                if (j9 > C0136W.this.f465q + j10) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f481f.m21823c();
                        C0136W.this.f472x.post(C0136W.this.f471w);
                    }
                    if (i7 == 1) {
                        i7 = 0;
                    } else if (this.f479d.mo419c() != -1) {
                        this.f482g.f2935a = this.f479d.mo419c();
                    }
                    AbstractC5496j.m23079a(this.f478c);
                } catch (Throwable th) {
                    if (i7 != 1 && this.f479d.mo419c() != -1) {
                        this.f482g.f2935a = this.f479d.mo419c();
                    }
                    AbstractC5496j.m23079a(this.f478c);
                    throw th;
                }
            }
        }

        @Override // p050H0.C0545n.e
        /* renamed from: c */
        public void mo482c() {
            this.f483h = true;
        }

        /* renamed from: i */
        public final C5497k m483i(long j7) {
            return new C5497k.b().m23094i(this.f477b).m23093h(j7).m23091f(C0136W.this.f464p).m23087b(6).m23090e(C0136W.f433V).m23086a();
        }

        /* renamed from: j */
        public final void m484j(long j7, long j8) {
            this.f482g.f2935a = j7;
            this.f485j = j8;
            this.f484i = true;
            this.f488m = false;
        }
    }

    /* renamed from: D0.W$c */
    public interface c {
        /* renamed from: h */
        void mo485h(long j7, boolean z6, boolean z7);
    }

    /* renamed from: D0.W$d */
    public final class d implements InterfaceC0145c0 {

        /* renamed from: a */
        public final int f490a;

        public d(int i7) {
            this.f490a = i7;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: b */
        public boolean mo487b() {
            return C0136W.this.m446R(this.f490a);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: c */
        public void mo488c() {
            C0136W.this.m453Z(this.f490a);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: j */
        public int mo489j(long j7) {
            return C0136W.this.m467j0(this.f490a, j7);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: q */
        public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
            return C0136W.this.m461f0(this.f490a, c5756s0, c5561i, i7);
        }
    }

    /* renamed from: D0.W$e */
    public static final class e {

        /* renamed from: a */
        public final int f492a;

        /* renamed from: b */
        public final boolean f493b;

        public e(int i7, boolean z6) {
            this.f492a = i7;
            this.f493b = z6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f492a == eVar.f492a && this.f493b == eVar.f493b;
        }

        public int hashCode() {
            return (this.f492a * 31) + (this.f493b ? 1 : 0);
        }
    }

    /* renamed from: D0.W$f */
    public static final class f {

        /* renamed from: a */
        public final C0165m0 f494a;

        /* renamed from: b */
        public final boolean[] f495b;

        /* renamed from: c */
        public final boolean[] f496c;

        /* renamed from: d */
        public final boolean[] f497d;

        public f(C0165m0 c0165m0, boolean[] zArr) {
            this.f494a = c0165m0;
            this.f495b = zArr;
            int i7 = c0165m0.f685a;
            this.f496c = new boolean[i7];
            this.f497d = new boolean[i7];
        }
    }

    public C0136W(Uri uri, InterfaceC5493g interfaceC5493g, InterfaceC0131Q interfaceC0131Q, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar, InterfaceC0544m interfaceC0544m, InterfaceC0127M.a aVar2, c cVar, InterfaceC0533b interfaceC0533b, String str, int i7, long j7) {
        this.f456a = uri;
        this.f457b = interfaceC5493g;
        this.f458c = interfaceC6364x;
        this.f461f = aVar;
        this.f459d = interfaceC0544m;
        this.f460e = aVar2;
        this.f462n = cVar;
        this.f463o = interfaceC0533b;
        this.f464p = str;
        this.f465q = i7;
        this.f468t = interfaceC0131Q;
        this.f466r = j7;
    }

    /* renamed from: M */
    public static Map m433M() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    /* renamed from: Q */
    private boolean m434Q() {
        return this.f451Q != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m435V() {
        if (this.f455U || this.f438D || !this.f437C || this.f442H == null) {
            return;
        }
        for (C0143b0 c0143b0 : this.f435A) {
            if (c0143b0.m539G() == null) {
                return;
            }
        }
        this.f469u.m21823c();
        int length = this.f435A.length;
        C4304J[] c4304jArr = new C4304J[length];
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            C4327q c4327q = (C4327q) AbstractC5332a.m21800e(this.f435A[i7].m539G());
            String str = c4327q.f15138n;
            boolean m18422o = AbstractC4336z.m18422o(str);
            boolean z6 = m18422o || AbstractC4336z.m18426s(str);
            zArr[i7] = z6;
            this.f439E = z6 | this.f439E;
            this.f440F = this.f466r != -9223372036854775807L && length == 1 && AbstractC4336z.m18423p(str);
            C2892b c2892b = this.f474z;
            if (c2892b != null) {
                if (m18422o || this.f436B[i7].f493b) {
                    C4334x c4334x = c4327q.f15135k;
                    c4327q = c4327q.m18193a().m18257h0(c4334x == null ? new C4334x(c2892b) : c4334x.m18398a(c2892b)).m18234K();
                }
                if (m18422o && c4327q.f15131g == -1 && c4327q.f15132h == -1 && c2892b.f8897a != -1) {
                    c4327q = c4327q.m18193a().m18236M(c2892b.f8897a).m18234K();
                }
            }
            c4304jArr[i7] = new C4304J(Integer.toString(i7), c4327q.m18194b(this.f458c.mo26608d(c4327q)));
        }
        this.f441G = new f(new C0165m0(c4304jArr), zArr);
        if (this.f440F && this.f443I == -9223372036854775807L) {
            this.f443I = this.f466r;
            this.f442H = new a(this.f442H);
        }
        this.f462n.mo485h(this.f443I, this.f442H.mo3499f(), this.f444J);
        this.f438D = true;
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f473y)).mo322c(this);
    }

    /* renamed from: K */
    public final void m441K() {
        AbstractC5332a.m21802g(this.f438D);
        AbstractC5332a.m21800e(this.f441G);
        AbstractC5332a.m21800e(this.f442H);
    }

    /* renamed from: L */
    public final boolean m442L(b bVar, int i7) {
        InterfaceC0855M interfaceC0855M;
        if (this.f449O || !((interfaceC0855M = this.f442H) == null || interfaceC0855M.mo474l() == -9223372036854775807L)) {
            this.f453S = i7;
            return true;
        }
        if (this.f438D && !m470l0()) {
            this.f452R = true;
            return false;
        }
        this.f447M = this.f438D;
        this.f450P = 0L;
        this.f453S = 0;
        for (C0143b0 c0143b0 : this.f435A) {
            c0143b0.m554W();
        }
        bVar.m484j(0L, 0L);
        return true;
    }

    /* renamed from: N */
    public final int m443N() {
        int i7 = 0;
        for (C0143b0 c0143b0 : this.f435A) {
            i7 += c0143b0.m540H();
        }
        return i7;
    }

    /* renamed from: O */
    public final long m444O(boolean z6) {
        long j7 = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.f435A.length; i7++) {
            if (z6 || ((f) AbstractC5332a.m21800e(this.f441G)).f496c[i7]) {
                j7 = Math.max(j7, this.f435A[i7].m533A());
            }
        }
        return j7;
    }

    /* renamed from: P */
    public InterfaceC0861T m445P() {
        return m460e0(new e(0, true));
    }

    /* renamed from: R */
    public boolean m446R(int i7) {
        return !m470l0() && this.f435A[i7].m544L(this.f454T);
    }

    /* renamed from: S */
    public final /* synthetic */ void m447S() {
        if (this.f455U) {
            return;
        }
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f473y)).mo386b(this);
    }

    /* renamed from: T */
    public final /* synthetic */ void m448T() {
        this.f449O = true;
    }

    /* renamed from: W */
    public final void m450W(int i7) {
        m441K();
        f fVar = this.f441G;
        boolean[] zArr = fVar.f497d;
        if (zArr[i7]) {
            return;
        }
        C4327q m18064a = fVar.f494a.m653b(i7).m18064a(0);
        this.f460e.m365h(AbstractC4336z.m18418k(m18064a.f15138n), m18064a, 0, null, this.f450P);
        zArr[i7] = true;
    }

    /* renamed from: X */
    public final void m451X(int i7) {
        m441K();
        boolean[] zArr = this.f441G.f495b;
        if (this.f452R && zArr[i7]) {
            if (this.f435A[i7].m544L(false)) {
                return;
            }
            this.f451Q = 0L;
            this.f452R = false;
            this.f447M = true;
            this.f450P = 0L;
            this.f453S = 0;
            for (C0143b0 c0143b0 : this.f435A) {
                c0143b0.m554W();
            }
            ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f473y)).mo386b(this);
        }
    }

    /* renamed from: Y */
    public void m452Y() {
        this.f467s.m2102k(this.f459d.mo2088d(this.f445K));
    }

    /* renamed from: Z */
    public void m453Z(int i7) {
        this.f435A[i7].m546O();
        m452Y();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return mo312f();
    }

    /* renamed from: a0 */
    public final void m454a0() {
        this.f472x.post(new Runnable() { // from class: D0.S
            @Override // java.lang.Runnable
            public final void run() {
                C0136W.this.m448T();
            }
        });
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: b */
    public InterfaceC0861T mo455b(int i7, int i8) {
        return m460e0(new e(i7, false));
    }

    @Override // p050H0.C0545n.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo468k(b bVar, long j7, long j8, boolean z6) {
        C5510x c5510x = bVar.f478c;
        C0179y c0179y = new C0179y(bVar.f476a, bVar.f486k, c5510x.m23137v(), c5510x.m23138w(), j7, j8, c5510x.m23136g());
        this.f459d.mo2086b(bVar.f476a);
        this.f460e.m374q(c0179y, 1, -1, null, 0, null, bVar.f485j, this.f443I);
        if (z6) {
            return;
        }
        for (C0143b0 c0143b0 : this.f435A) {
            c0143b0.m554W();
        }
        if (this.f448N > 0) {
            ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f473y)).mo386b(this);
        }
    }

    @Override // p022D0.C0143b0.d
    /* renamed from: c */
    public void mo457c(C4327q c4327q) {
        this.f472x.post(this.f470v);
    }

    @Override // p050H0.C0545n.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo473r(b bVar, long j7, long j8) {
        InterfaceC0855M interfaceC0855M;
        if (this.f443I == -9223372036854775807L && (interfaceC0855M = this.f442H) != null) {
            boolean mo3499f = interfaceC0855M.mo3499f();
            long m444O = m444O(true);
            long j9 = m444O == Long.MIN_VALUE ? 0L : m444O + 10000;
            this.f443I = j9;
            this.f462n.mo485h(j9, mo3499f, this.f444J);
        }
        C5510x c5510x = bVar.f478c;
        C0179y c0179y = new C0179y(bVar.f476a, bVar.f486k, c5510x.m23137v(), c5510x.m23138w(), j7, j8, c5510x.m23136g());
        this.f459d.mo2086b(bVar.f476a);
        this.f460e.m377t(c0179y, 1, -1, null, 0, null, bVar.f485j, this.f443I);
        this.f454T = true;
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f473y)).mo386b(this);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f467s.m2101j() && this.f469u.m21824d();
    }

    @Override // p050H0.C0545n.b
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C0545n.c mo471m(b bVar, long j7, long j8, IOException iOException, int i7) {
        C0545n.c m2096h;
        C5510x c5510x = bVar.f478c;
        C0179y c0179y = new C0179y(bVar.f476a, bVar.f486k, c5510x.m23137v(), c5510x.m23138w(), j7, j8, c5510x.m23136g());
        long mo2087c = this.f459d.mo2087c(new InterfaceC0544m.c(c0179y, new C0116B(1, -1, null, 0, null, AbstractC5330M.m21758l1(bVar.f485j), AbstractC5330M.m21758l1(this.f443I)), iOException, i7));
        if (mo2087c == -9223372036854775807L) {
            m2096h = C0545n.f1788g;
        } else {
            int m443N = m443N();
            m2096h = m442L(bVar, m443N) ? C0545n.m2096h(m443N > this.f453S, mo2087c) : C0545n.f1787f;
        }
        boolean m2108c = m2096h.m2108c();
        this.f460e.m379v(c0179y, 1, -1, null, 0, null, bVar.f485j, this.f443I, iOException, !m2108c);
        if (!m2108c) {
            this.f459d.mo2086b(bVar.f476a);
        }
        return m2096h;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        if (this.f454T || this.f467s.m2100i() || this.f452R) {
            return false;
        }
        if (this.f438D && this.f448N == 0) {
            return false;
        }
        boolean m21825e = this.f469u.m21825e();
        if (this.f467s.m2101j()) {
            return m21825e;
        }
        m469k0();
        return true;
    }

    /* renamed from: e0 */
    public final InterfaceC0861T m460e0(e eVar) {
        int length = this.f435A.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (eVar.equals(this.f436B[i7])) {
                return this.f435A[i7];
            }
        }
        if (this.f437C) {
            AbstractC5346o.m21867h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f492a + ") after finishing tracks.");
            return new C0879n();
        }
        C0143b0 m531k = C0143b0.m531k(this.f463o, this.f458c, this.f461f);
        m531k.m567e0(this);
        int i8 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f436B, i8);
        eVarArr[length] = eVar;
        this.f436B = (e[]) AbstractC5330M.m21750j(eVarArr);
        C0143b0[] c0143b0Arr = (C0143b0[]) Arrays.copyOf(this.f435A, i8);
        c0143b0Arr[length] = m531k;
        this.f435A = (C0143b0[]) AbstractC5330M.m21750j(c0143b0Arr);
        return m531k;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        long j7;
        m441K();
        if (this.f454T || this.f448N == 0) {
            return Long.MIN_VALUE;
        }
        if (m434Q()) {
            return this.f451Q;
        }
        if (this.f439E) {
            int length = this.f435A.length;
            j7 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                f fVar = this.f441G;
                if (fVar.f495b[i7] && fVar.f496c[i7] && !this.f435A[i7].m543K()) {
                    j7 = Math.min(j7, this.f435A[i7].m533A());
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = m444O(false);
        }
        return j7 == Long.MIN_VALUE ? this.f450P : j7;
    }

    /* renamed from: f0 */
    public int m461f0(int i7, C5756s0 c5756s0, C5561i c5561i, int i8) {
        if (m470l0()) {
            return -3;
        }
        m450W(i7);
        int m551T = this.f435A[i7].m551T(c5756s0, c5561i, i8, this.f454T);
        if (m551T == -3) {
            m451X(i7);
        }
        return m551T;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        m441K();
        if (!this.f442H.mo3499f()) {
            return 0L;
        }
        InterfaceC0855M.a mo3500j = this.f442H.mo3500j(j7);
        return c5714a1.m23938a(j7, mo3500j.f2936a.f2941a, mo3500j.f2937b.f2941a);
    }

    /* renamed from: g0 */
    public void m462g0() {
        if (this.f438D) {
            for (C0143b0 c0143b0 : this.f435A) {
                c0143b0.m550S();
            }
        }
        this.f467s.m2104m(this);
        this.f472x.removeCallbacksAndMessages(null);
        this.f473y = null;
        this.f455U = true;
    }

    /* renamed from: h0 */
    public final boolean m463h0(boolean[] zArr, long j7) {
        int length = this.f435A.length;
        for (int i7 = 0; i7 < length; i7++) {
            C0143b0 c0143b0 = this.f435A[i7];
            if (!(this.f440F ? c0143b0.m557Z(c0143b0.m587y()) : c0143b0.m559a0(j7, false)) && (zArr[i7] || !this.f439E)) {
                return false;
            }
        }
        return true;
    }

    @Override // p050H0.C0545n.f
    /* renamed from: i */
    public void mo464i() {
        for (C0143b0 c0143b0 : this.f435A) {
            c0143b0.m552U();
        }
        this.f468t.release();
    }

    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final void m449U(InterfaceC0855M interfaceC0855M) {
        this.f442H = this.f474z == null ? interfaceC0855M : new InterfaceC0855M.b(-9223372036854775807L);
        this.f443I = interfaceC0855M.mo474l();
        boolean z6 = !this.f449O && interfaceC0855M.mo474l() == -9223372036854775807L;
        this.f444J = z6;
        this.f445K = z6 ? 7 : 1;
        if (this.f438D) {
            this.f462n.mo485h(this.f443I, interfaceC0855M.mo3499f(), this.f444J);
        } else {
            m435V();
        }
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: j */
    public void mo466j(final InterfaceC0855M interfaceC0855M) {
        this.f472x.post(new Runnable() { // from class: D0.V
            @Override // java.lang.Runnable
            public final void run() {
                C0136W.this.m449U(interfaceC0855M);
            }
        });
    }

    /* renamed from: j0 */
    public int m467j0(int i7, long j7) {
        if (m470l0()) {
            return 0;
        }
        m450W(i7);
        C0143b0 c0143b0 = this.f435A[i7];
        int m538F = c0143b0.m538F(j7, this.f454T);
        c0143b0.m569f0(m538F);
        if (m538F == 0) {
            m451X(i7);
        }
        return m538F;
    }

    /* renamed from: k0 */
    public final void m469k0() {
        b bVar = new b(this.f456a, this.f457b, this.f468t, this, this.f469u);
        if (this.f438D) {
            AbstractC5332a.m21802g(m434Q());
            long j7 = this.f443I;
            if (j7 != -9223372036854775807L && this.f451Q > j7) {
                this.f454T = true;
                this.f451Q = -9223372036854775807L;
                return;
            }
            bVar.m484j(((InterfaceC0855M) AbstractC5332a.m21800e(this.f442H)).mo3500j(this.f451Q).f2936a.f2942b, this.f451Q);
            for (C0143b0 c0143b0 : this.f435A) {
                c0143b0.m563c0(this.f451Q);
            }
            this.f451Q = -9223372036854775807L;
        }
        this.f453S = m443N();
        this.f460e.m383z(new C0179y(bVar.f476a, bVar.f486k, this.f467s.m2105n(bVar, this, this.f459d.mo2088d(this.f445K))), 1, -1, null, 0, null, bVar.f485j, this.f443I);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        m452Y();
        if (this.f454T && !this.f438D) {
            throw C4295A.m17943a("Loading finished before preparation is complete.", null);
        }
    }

    /* renamed from: l0 */
    public final boolean m470l0() {
        return this.f447M || m434Q();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        InterfaceC0375y interfaceC0375y;
        m441K();
        f fVar = this.f441G;
        C0165m0 c0165m0 = fVar.f494a;
        boolean[] zArr3 = fVar.f496c;
        int i7 = this.f448N;
        int i8 = 0;
        for (int i9 = 0; i9 < interfaceC0375yArr.length; i9++) {
            InterfaceC0145c0 interfaceC0145c0 = interfaceC0145c0Arr[i9];
            if (interfaceC0145c0 != null && (interfaceC0375yArr[i9] == null || !zArr[i9])) {
                int i10 = ((d) interfaceC0145c0).f490a;
                AbstractC5332a.m21802g(zArr3[i10]);
                this.f448N--;
                zArr3[i10] = false;
                interfaceC0145c0Arr[i9] = null;
            }
        }
        boolean z6 = !this.f446L ? j7 == 0 || this.f440F : i7 != 0;
        for (int i11 = 0; i11 < interfaceC0375yArr.length; i11++) {
            if (interfaceC0145c0Arr[i11] == null && (interfaceC0375y = interfaceC0375yArr[i11]) != null) {
                AbstractC5332a.m21802g(interfaceC0375y.length() == 1);
                AbstractC5332a.m21802g(interfaceC0375y.mo391c(0) == 0);
                int m655d = c0165m0.m655d(interfaceC0375y.mo389a());
                AbstractC5332a.m21802g(!zArr3[m655d]);
                this.f448N++;
                zArr3[m655d] = true;
                interfaceC0145c0Arr[i11] = new d(m655d);
                zArr2[i11] = true;
                if (!z6) {
                    C0143b0 c0143b0 = this.f435A[m655d];
                    z6 = (c0143b0.m536D() == 0 || c0143b0.m559a0(j7, true)) ? false : true;
                }
            }
        }
        if (this.f448N == 0) {
            this.f452R = false;
            this.f447M = false;
            if (this.f467s.m2101j()) {
                C0143b0[] c0143b0Arr = this.f435A;
                int length = c0143b0Arr.length;
                while (i8 < length) {
                    c0143b0Arr[i8].m580r();
                    i8++;
                }
                this.f467s.m2098f();
            } else {
                this.f454T = false;
                C0143b0[] c0143b0Arr2 = this.f435A;
                int length2 = c0143b0Arr2.length;
                while (i8 < length2) {
                    c0143b0Arr2[i8].m554W();
                    i8++;
                }
            }
        } else if (z6) {
            j7 = mo317o(j7);
            while (i8 < interfaceC0145c0Arr.length) {
                if (interfaceC0145c0Arr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.f446L = true;
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        m441K();
        boolean[] zArr = this.f441G.f495b;
        if (!this.f442H.mo3499f()) {
            j7 = 0;
        }
        int i7 = 0;
        this.f447M = false;
        this.f450P = j7;
        if (m434Q()) {
            this.f451Q = j7;
            return j7;
        }
        if (this.f445K != 7 && ((this.f454T || this.f467s.m2101j()) && m463h0(zArr, j7))) {
            return j7;
        }
        this.f452R = false;
        this.f451Q = j7;
        this.f454T = false;
        if (this.f467s.m2101j()) {
            C0143b0[] c0143b0Arr = this.f435A;
            int length = c0143b0Arr.length;
            while (i7 < length) {
                c0143b0Arr[i7].m580r();
                i7++;
            }
            this.f467s.m2098f();
        } else {
            this.f467s.m2099g();
            C0143b0[] c0143b0Arr2 = this.f435A;
            int length2 = c0143b0Arr2.length;
            while (i7 < length2) {
                c0143b0Arr2[i7].m554W();
                i7++;
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f473y = aVar;
        this.f469u.m21825e();
        m469k0();
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: q */
    public void mo472q() {
        this.f437C = true;
        this.f472x.post(this.f470v);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        if (!this.f447M) {
            return -9223372036854775807L;
        }
        if (!this.f454T && m443N() <= this.f453S) {
            return -9223372036854775807L;
        }
        this.f447M = false;
        return this.f450P;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        m441K();
        return this.f441G.f494a;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        if (this.f440F) {
            return;
        }
        m441K();
        if (m434Q()) {
            return;
        }
        boolean[] zArr = this.f441G.f496c;
        int length = this.f435A.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f435A[i7].m579q(j7, z6, zArr[i7]);
        }
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
    }
}
