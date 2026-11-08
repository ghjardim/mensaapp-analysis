package p343t0;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p022D0.C0116B;
import p022D0.C0143b0;
import p022D0.C0165m0;
import p022D0.C0179y;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0145c0;
import p022D0.InterfaceC0147d0;
import p029E0.AbstractC0212e;
import p043G0.AbstractC0348C;
import p050H0.C0545n;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p078L0.AbstractC0860S;
import p078L0.C0879n;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p155W0.C2653a;
import p155W0.C2654b;
import p176Z0.C2971m;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4304J;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.C4334x;
import p232g0.InterfaceC4319i;
import p256j$.util.DesugarCollections;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p276l0.C5506t;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;
import p343t0.C6412f;
import p343t0.C6425s;

/* renamed from: t0.s */
/* loaded from: classes.dex */
public final class C6425s implements C0545n.b, C0545n.f, InterfaceC0147d0, InterfaceC0885t, C0143b0.d {

    /* renamed from: f0 */
    public static final Set f23250f0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A */
    public final Map f23251A;

    /* renamed from: B */
    public AbstractC0212e f23252B;

    /* renamed from: C */
    public d[] f23253C;

    /* renamed from: E */
    public Set f23255E;

    /* renamed from: F */
    public SparseIntArray f23256F;

    /* renamed from: G */
    public InterfaceC0861T f23257G;

    /* renamed from: H */
    public int f23258H;

    /* renamed from: I */
    public int f23259I;

    /* renamed from: J */
    public boolean f23260J;

    /* renamed from: K */
    public boolean f23261K;

    /* renamed from: L */
    public int f23262L;

    /* renamed from: M */
    public C4327q f23263M;

    /* renamed from: N */
    public C4327q f23264N;

    /* renamed from: O */
    public boolean f23265O;

    /* renamed from: P */
    public C0165m0 f23266P;

    /* renamed from: Q */
    public Set f23267Q;

    /* renamed from: R */
    public int[] f23268R;

    /* renamed from: S */
    public int f23269S;

    /* renamed from: T */
    public boolean f23270T;

    /* renamed from: U */
    public boolean[] f23271U;

    /* renamed from: V */
    public boolean[] f23272V;

    /* renamed from: W */
    public long f23273W;

    /* renamed from: X */
    public long f23274X;

    /* renamed from: Y */
    public boolean f23275Y;

    /* renamed from: Z */
    public boolean f23276Z;

    /* renamed from: a */
    public final String f23277a;

    /* renamed from: a0 */
    public boolean f23278a0;

    /* renamed from: b */
    public final int f23279b;

    /* renamed from: b0 */
    public boolean f23280b0;

    /* renamed from: c */
    public final b f23281c;

    /* renamed from: c0 */
    public long f23282c0;

    /* renamed from: d */
    public final C6412f f23283d;

    /* renamed from: d0 */
    public C4323m f23284d0;

    /* renamed from: e */
    public final InterfaceC0533b f23285e;

    /* renamed from: e0 */
    public C6416j f23286e0;

    /* renamed from: f */
    public final C4327q f23287f;

    /* renamed from: n */
    public final InterfaceC6364x f23288n;

    /* renamed from: o */
    public final InterfaceC6362v.a f23289o;

    /* renamed from: p */
    public final InterfaceC0544m f23290p;

    /* renamed from: r */
    public final InterfaceC0127M.a f23292r;

    /* renamed from: s */
    public final int f23293s;

    /* renamed from: u */
    public final ArrayList f23295u;

    /* renamed from: v */
    public final List f23296v;

    /* renamed from: w */
    public final Runnable f23297w;

    /* renamed from: x */
    public final Runnable f23298x;

    /* renamed from: y */
    public final Handler f23299y;

    /* renamed from: z */
    public final ArrayList f23300z;

    /* renamed from: q */
    public final C0545n f23291q = new C0545n("Loader:HlsSampleStreamWrapper");

    /* renamed from: t */
    public final C6412f.b f23294t = new C6412f.b();

    /* renamed from: D */
    public int[] f23254D = new int[0];

    /* renamed from: t0.s$b */
    public interface b extends InterfaceC0147d0.a {
        /* renamed from: j */
        void mo26841j();

        /* renamed from: k */
        void mo26842k(Uri uri);
    }

    /* renamed from: t0.s$c */
    public static class c implements InterfaceC0861T {

        /* renamed from: g */
        public static final C4327q f23301g = new C4327q.b().m18264o0("application/id3").m18234K();

        /* renamed from: h */
        public static final C4327q f23302h = new C4327q.b().m18264o0("application/x-emsg").m18234K();

        /* renamed from: a */
        public final C2654b f23303a = new C2654b();

        /* renamed from: b */
        public final InterfaceC0861T f23304b;

        /* renamed from: c */
        public final C4327q f23305c;

        /* renamed from: d */
        public C4327q f23306d;

        /* renamed from: e */
        public byte[] f23307e;

        /* renamed from: f */
        public int f23308f;

        public c(InterfaceC0861T interfaceC0861T, int i7) {
            this.f23304b = interfaceC0861T;
            if (i7 == 1) {
                this.f23305c = f23301g;
            } else {
                if (i7 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i7);
                }
                this.f23305c = f23302h;
            }
            this.f23307e = new byte[0];
            this.f23308f = 0;
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: a */
        public /* synthetic */ int mo558a(InterfaceC4319i interfaceC4319i, int i7, boolean z6) {
            return AbstractC0860S.m3555a(this, interfaceC4319i, i7, z6);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: b */
        public void mo560b(C5357z c5357z, int i7, int i8) {
            m26901h(this.f23308f + i7);
            c5357z.m21953l(this.f23307e, this.f23308f, i7);
            this.f23308f += i7;
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: c */
        public void mo562c(long j7, int i7, int i8, int i9, InterfaceC0861T.a aVar) {
            AbstractC5332a.m21800e(this.f23306d);
            C5357z m26902i = m26902i(i8, i9);
            if (!AbstractC5330M.m21729c(this.f23306d.f15138n, this.f23305c.f15138n)) {
                if (!"application/x-emsg".equals(this.f23306d.f15138n)) {
                    AbstractC5346o.m21867h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f23306d.f15138n);
                    return;
                }
                C2653a m9108c = this.f23303a.m9108c(m26902i);
                if (!m26900g(m9108c)) {
                    AbstractC5346o.m21867h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f23305c.f15138n, m9108c.mo8979C()));
                    return;
                }
                m26902i = new C5357z((byte[]) AbstractC5332a.m21800e(m9108c.mo8981q0()));
            }
            int m21942a = m26902i.m21942a();
            this.f23304b.mo564d(m26902i, m21942a);
            this.f23304b.mo562c(j7, i7, m21942a, 0, aVar);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: d */
        public /* synthetic */ void mo564d(C5357z c5357z, int i7) {
            AbstractC0860S.m3556b(this, c5357z, i7);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: e */
        public void mo566e(C4327q c4327q) {
            this.f23306d = c4327q;
            this.f23304b.mo566e(this.f23305c);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: f */
        public int mo568f(InterfaceC4319i interfaceC4319i, int i7, boolean z6, int i8) {
            m26901h(this.f23308f + i7);
            int read = interfaceC4319i.read(this.f23307e, this.f23308f, i7);
            if (read != -1) {
                this.f23308f += read;
                return read;
            }
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }

        /* renamed from: g */
        public final boolean m26900g(C2653a c2653a) {
            C4327q mo8979C = c2653a.mo8979C();
            return mo8979C != null && AbstractC5330M.m21729c(this.f23305c.f15138n, mo8979C.f15138n);
        }

        /* renamed from: h */
        public final void m26901h(int i7) {
            byte[] bArr = this.f23307e;
            if (bArr.length < i7) {
                this.f23307e = Arrays.copyOf(bArr, i7 + (i7 / 2));
            }
        }

        /* renamed from: i */
        public final C5357z m26902i(int i7, int i8) {
            int i9 = this.f23308f - i8;
            C5357z c5357z = new C5357z(Arrays.copyOfRange(this.f23307e, i9 - i7, i9));
            byte[] bArr = this.f23307e;
            System.arraycopy(bArr, i9, bArr, 0, i8);
            this.f23308f = i8;
            return c5357z;
        }
    }

    /* renamed from: t0.s$d */
    public static final class d extends C0143b0 {

        /* renamed from: H */
        public final Map f23309H;

        /* renamed from: I */
        public C4323m f23310I;

        @Override // p022D0.C0143b0, p078L0.InterfaceC0861T
        /* renamed from: c */
        public void mo562c(long j7, int i7, int i8, int i9, InterfaceC0861T.a aVar) {
            super.mo562c(j7, i7, i8, i9, aVar);
        }

        /* renamed from: i0 */
        public final C4334x m26903i0(C4334x c4334x) {
            if (c4334x == null) {
                return null;
            }
            int m18402e = c4334x.m18402e();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= m18402e) {
                    i8 = -1;
                    break;
                }
                C4334x.b m18401d = c4334x.m18401d(i8);
                if ((m18401d instanceof C2971m) && "com.apple.streaming.transportStreamTimestamp".equals(((C2971m) m18401d).f9120b)) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                return c4334x;
            }
            if (m18402e == 1) {
                return null;
            }
            C4334x.b[] bVarArr = new C4334x.b[m18402e - 1];
            while (i7 < m18402e) {
                if (i7 != i8) {
                    bVarArr[i7 < i8 ? i7 : i7 - 1] = c4334x.m18401d(i7);
                }
                i7++;
            }
            return new C4334x(bVarArr);
        }

        /* renamed from: j0 */
        public void m26904j0(C4323m c4323m) {
            this.f23310I = c4323m;
            m542J();
        }

        /* renamed from: k0 */
        public void m26905k0(C6416j c6416j) {
            m570g0(c6416j.f23199k);
        }

        @Override // p022D0.C0143b0
        /* renamed from: x */
        public C4327q mo586x(C4327q c4327q) {
            C4323m c4323m;
            C4323m c4323m2 = this.f23310I;
            if (c4323m2 == null) {
                c4323m2 = c4327q.f15142r;
            }
            if (c4323m2 != null && (c4323m = (C4323m) this.f23309H.get(c4323m2.f15069c)) != null) {
                c4323m2 = c4323m;
            }
            C4334x m26903i0 = m26903i0(c4327q.f15135k);
            if (c4323m2 != c4327q.f15142r || m26903i0 != c4327q.f15135k) {
                c4327q = c4327q.m18193a().m18244U(c4323m2).m18257h0(m26903i0).m18234K();
            }
            return super.mo586x(c4327q);
        }

        public d(InterfaceC0533b interfaceC0533b, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar, Map map) {
            super(interfaceC0533b, interfaceC6364x, aVar);
            this.f23309H = map;
        }
    }

    public C6425s(String str, int i7, b bVar, C6412f c6412f, Map map, InterfaceC0533b interfaceC0533b, long j7, C4327q c4327q, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar, InterfaceC0544m interfaceC0544m, InterfaceC0127M.a aVar2, int i8) {
        this.f23277a = str;
        this.f23279b = i7;
        this.f23281c = bVar;
        this.f23283d = c6412f;
        this.f23251A = map;
        this.f23285e = interfaceC0533b;
        this.f23287f = c4327q;
        this.f23288n = interfaceC6364x;
        this.f23289o = aVar;
        this.f23290p = interfaceC0544m;
        this.f23292r = aVar2;
        this.f23293s = i8;
        Set set = f23250f0;
        this.f23255E = new HashSet(set.size());
        this.f23256F = new SparseIntArray(set.size());
        this.f23253C = new d[0];
        this.f23272V = new boolean[0];
        this.f23271U = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f23295u = arrayList;
        this.f23296v = DesugarCollections.unmodifiableList(arrayList);
        this.f23300z = new ArrayList();
        this.f23297w = new Runnable() { // from class: t0.p
            @Override // java.lang.Runnable
            public final void run() {
                C6425s.this.m26870V();
            }
        };
        this.f23298x = new Runnable() { // from class: t0.q
            @Override // java.lang.Runnable
            public final void run() {
                C6425s.this.m26879e0();
            }
        };
        this.f23299y = AbstractC5330M.m21671A();
        this.f23273W = j7;
        this.f23274X = j7;
    }

    /* renamed from: D */
    public static C0879n m26846D(int i7, int i8) {
        AbstractC5346o.m21867h("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i8);
        return new C0879n();
    }

    /* renamed from: G */
    public static C4327q m26847G(C4327q c4327q, C4327q c4327q2, boolean z6) {
        String m18411d;
        String str;
        if (c4327q == null) {
            return c4327q2;
        }
        int m18418k = AbstractC4336z.m18418k(c4327q2.f15138n);
        if (AbstractC5330M.m21705R(c4327q.f15134j, m18418k) == 1) {
            m18411d = AbstractC5330M.m21707S(c4327q.f15134j, m18418k);
            str = AbstractC4336z.m18414g(m18411d);
        } else {
            m18411d = AbstractC4336z.m18411d(c4327q.f15134j, c4327q2.f15138n);
            str = c4327q2.f15138n;
        }
        C4327q.b m18238O = c4327q2.m18193a().m18250a0(c4327q.f15125a).m18252c0(c4327q.f15126b).m18253d0(c4327q.f15127c).m18254e0(c4327q.f15128d).m18266q0(c4327q.f15129e).m18262m0(c4327q.f15130f).m18236M(z6 ? c4327q.f15131g : -1).m18259j0(z6 ? c4327q.f15132h : -1).m18238O(m18411d);
        if (m18418k == 2) {
            m18238O.m18271v0(c4327q.f15144t).m18248Y(c4327q.f15145u).m18247X(c4327q.f15146v);
        }
        if (str != null) {
            m18238O.m18264o0(str);
        }
        int i7 = c4327q.f15114B;
        if (i7 != -1 && m18418k == 1) {
            m18238O.m18237N(i7);
        }
        C4334x c4334x = c4327q.f15135k;
        if (c4334x != null) {
            C4334x c4334x2 = c4327q2.f15135k;
            if (c4334x2 != null) {
                c4334x = c4334x2.m18399b(c4334x);
            }
            m18238O.m18257h0(c4334x);
        }
        return m18238O.m18234K();
    }

    /* renamed from: K */
    public static boolean m26848K(C4327q c4327q, C4327q c4327q2) {
        String str = c4327q.f15138n;
        String str2 = c4327q2.f15138n;
        int m18418k = AbstractC4336z.m18418k(str);
        if (m18418k != 3) {
            return m18418k == AbstractC4336z.m18418k(str2);
        }
        if (AbstractC5330M.m21729c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c4327q.f15119G == c4327q2.f15119G;
        }
        return false;
    }

    /* renamed from: N */
    public static int m26849N(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: P */
    public static boolean m26850P(AbstractC0212e abstractC0212e) {
        return abstractC0212e instanceof C6416j;
    }

    /* renamed from: Q */
    private boolean m26851Q() {
        return this.f23274X != -9223372036854775807L;
    }

    /* renamed from: A */
    public final void m26855A() {
        C4327q c4327q;
        int length = this.f23253C.length;
        int i7 = -2;
        int i8 = -1;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            String str = ((C4327q) AbstractC5332a.m21804i(this.f23253C[i9].m539G())).f15138n;
            int i10 = AbstractC4336z.m18426s(str) ? 2 : AbstractC4336z.m18422o(str) ? 1 : AbstractC4336z.m18425r(str) ? 3 : -2;
            if (m26849N(i10) > m26849N(i7)) {
                i8 = i9;
                i7 = i10;
            } else if (i10 == i7 && i8 != -1) {
                i8 = -1;
            }
            i9++;
        }
        C4304J m26791k = this.f23283d.m26791k();
        int i11 = m26791k.f14850a;
        this.f23269S = -1;
        this.f23268R = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f23268R[i12] = i12;
        }
        C4304J[] c4304jArr = new C4304J[length];
        int i13 = 0;
        while (i13 < length) {
            C4327q c4327q2 = (C4327q) AbstractC5332a.m21804i(this.f23253C[i13].m539G());
            if (i13 == i8) {
                C4327q[] c4327qArr = new C4327q[i11];
                for (int i14 = 0; i14 < i11; i14++) {
                    C4327q m18064a = m26791k.m18064a(i14);
                    if (i7 == 1 && (c4327q = this.f23287f) != null) {
                        m18064a = m18064a.m18197h(c4327q);
                    }
                    c4327qArr[i14] = i11 == 1 ? c4327q2.m18197h(m18064a) : m26847G(m18064a, c4327q2, true);
                }
                c4304jArr[i13] = new C4304J(this.f23277a, c4327qArr);
                this.f23269S = i13;
            } else {
                C4327q c4327q3 = (i7 == 2 && AbstractC4336z.m18422o(c4327q2.f15138n)) ? this.f23287f : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f23277a);
                sb.append(":muxed:");
                sb.append(i13 < i8 ? i13 : i13 - 1);
                c4304jArr[i13] = new C4304J(sb.toString(), m26847G(c4327q3, c4327q2, false));
            }
            i13++;
        }
        this.f23266P = m26859F(c4304jArr);
        AbstractC5332a.m21802g(this.f23267Q == null);
        this.f23267Q = Collections.emptySet();
    }

    /* renamed from: B */
    public final boolean m26856B(int i7) {
        for (int i8 = i7; i8 < this.f23295u.size(); i8++) {
            if (((C6416j) this.f23295u.get(i8)).f23202n) {
                return false;
            }
        }
        C6416j c6416j = (C6416j) this.f23295u.get(i7);
        for (int i9 = 0; i9 < this.f23253C.length; i9++) {
            if (this.f23253C[i9].m536D() > c6416j.m26814m(i9)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public void m26857C() {
        if (this.f23261K) {
            return;
        }
        mo311e(new C5762v0.b().m24371f(this.f23273W).m24369d());
    }

    /* renamed from: E */
    public final C0143b0 m26858E(int i7, int i8) {
        int length = this.f23253C.length;
        boolean z6 = true;
        if (i8 != 1 && i8 != 2) {
            z6 = false;
        }
        d dVar = new d(this.f23285e, this.f23288n, this.f23289o, this.f23251A);
        dVar.m563c0(this.f23273W);
        if (z6) {
            dVar.m26904j0(this.f23284d0);
        }
        dVar.m561b0(this.f23282c0);
        C6416j c6416j = this.f23286e0;
        if (c6416j != null) {
            dVar.m26905k0(c6416j);
        }
        dVar.m567e0(this);
        int i9 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f23254D, i9);
        this.f23254D = copyOf;
        copyOf[length] = i7;
        this.f23253C = (d[]) AbstractC5330M.m21698N0(this.f23253C, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f23272V, i9);
        this.f23272V = copyOf2;
        copyOf2[length] = z6;
        this.f23270T |= z6;
        this.f23255E.add(Integer.valueOf(i8));
        this.f23256F.append(i8, length);
        if (m26849N(i8) > m26849N(this.f23258H)) {
            this.f23259I = length;
            this.f23258H = i8;
        }
        this.f23271U = Arrays.copyOf(this.f23271U, i9);
        return dVar;
    }

    /* renamed from: F */
    public final C0165m0 m26859F(C4304J[] c4304jArr) {
        for (int i7 = 0; i7 < c4304jArr.length; i7++) {
            C4304J c4304j = c4304jArr[i7];
            C4327q[] c4327qArr = new C4327q[c4304j.f14850a];
            for (int i8 = 0; i8 < c4304j.f14850a; i8++) {
                C4327q m18064a = c4304j.m18064a(i8);
                c4327qArr[i8] = m18064a.m18194b(this.f23288n.mo26608d(m18064a));
            }
            c4304jArr[i7] = new C4304J(c4304j.f14851b, c4327qArr);
        }
        return new C0165m0(c4304jArr);
    }

    /* renamed from: H */
    public final void m26860H(int i7) {
        AbstractC5332a.m21802g(!this.f23291q.m2101j());
        while (true) {
            if (i7 >= this.f23295u.size()) {
                i7 = -1;
                break;
            } else if (m26856B(i7)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        long j7 = m26863L().f879h;
        C6416j m26861I = m26861I(i7);
        if (this.f23295u.isEmpty()) {
            this.f23274X = this.f23273W;
        } else {
            ((C6416j) AbstractC2987A.m10751d(this.f23295u)).m26816o();
        }
        this.f23278a0 = false;
        this.f23292r.m361C(this.f23258H, m26861I.f878g, j7);
    }

    /* renamed from: I */
    public final C6416j m26861I(int i7) {
        C6416j c6416j = (C6416j) this.f23295u.get(i7);
        ArrayList arrayList = this.f23295u;
        AbstractC5330M.m21714V0(arrayList, i7, arrayList.size());
        for (int i8 = 0; i8 < this.f23253C.length; i8++) {
            this.f23253C[i8].m583u(c6416j.m26814m(i8));
        }
        return c6416j;
    }

    /* renamed from: J */
    public final boolean m26862J(C6416j c6416j) {
        int i7 = c6416j.f23199k;
        int length = this.f23253C.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (this.f23271U[i8] && this.f23253C[i8].m549R() == i7) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public final C6416j m26863L() {
        return (C6416j) this.f23295u.get(r0.size() - 1);
    }

    /* renamed from: M */
    public final InterfaceC0861T m26864M(int i7, int i8) {
        AbstractC5332a.m21796a(f23250f0.contains(Integer.valueOf(i8)));
        int i9 = this.f23256F.get(i8, -1);
        if (i9 == -1) {
            return null;
        }
        if (this.f23255E.add(Integer.valueOf(i8))) {
            this.f23254D[i9] = i7;
        }
        return this.f23254D[i9] == i7 ? this.f23253C[i9] : m26846D(i7, i8);
    }

    /* renamed from: O */
    public final void m26865O(C6416j c6416j) {
        this.f23286e0 = c6416j;
        this.f23263M = c6416j.f875d;
        this.f23274X = -9223372036854775807L;
        this.f23295u.add(c6416j);
        AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        for (d dVar : this.f23253C) {
            m11045m.mo11040a(Integer.valueOf(dVar.m540H()));
        }
        c6416j.m26815n(this, m11045m.m11063k());
        for (d dVar2 : this.f23253C) {
            dVar2.m26905k0(c6416j);
            if (c6416j.f23202n) {
                dVar2.m572h0();
            }
        }
    }

    /* renamed from: R */
    public boolean m26866R(int i7) {
        return !m26851Q() && this.f23253C[i7].m544L(this.f23278a0);
    }

    /* renamed from: S */
    public boolean m26867S() {
        return this.f23258H == 2;
    }

    /* renamed from: T */
    public final /* synthetic */ void m26868T(C6416j c6416j) {
        this.f23281c.mo26842k(c6416j.f23201m);
    }

    /* renamed from: U */
    public final void m26869U() {
        int i7 = this.f23266P.f685a;
        int[] iArr = new int[i7];
        this.f23268R = iArr;
        Arrays.fill(iArr, -1);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = 0;
            while (true) {
                d[] dVarArr = this.f23253C;
                if (i9 >= dVarArr.length) {
                    break;
                }
                if (m26848K((C4327q) AbstractC5332a.m21804i(dVarArr[i9].m539G()), this.f23266P.m653b(i8).m18064a(0))) {
                    this.f23268R[i8] = i9;
                    break;
                }
                i9++;
            }
        }
        Iterator it = this.f23300z.iterator();
        while (it.hasNext()) {
            ((C6420n) it.next()).m26843a();
        }
    }

    /* renamed from: V */
    public final void m26870V() {
        if (!this.f23265O && this.f23268R == null && this.f23260J) {
            for (d dVar : this.f23253C) {
                if (dVar.m539G() == null) {
                    return;
                }
            }
            if (this.f23266P != null) {
                m26869U();
                return;
            }
            m26855A();
            m26890n0();
            this.f23281c.mo26841j();
        }
    }

    /* renamed from: W */
    public void m26871W() {
        this.f23291q.mo2097c();
        this.f23283d.m26796p();
    }

    /* renamed from: X */
    public void m26872X(int i7) {
        m26871W();
        this.f23253C[i7].m546O();
    }

    @Override // p050H0.C0545n.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo468k(AbstractC0212e abstractC0212e, long j7, long j8, boolean z6) {
        this.f23252B = null;
        C0179y c0179y = new C0179y(abstractC0212e.f872a, abstractC0212e.f873b, abstractC0212e.m873f(), abstractC0212e.m872e(), j7, j8, abstractC0212e.m870a());
        this.f23290p.mo2086b(abstractC0212e.f872a);
        this.f23292r.m374q(c0179y, abstractC0212e.f874c, this.f23279b, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, abstractC0212e.f878g, abstractC0212e.f879h);
        if (z6) {
            return;
        }
        if (m26851Q() || this.f23262L == 0) {
            m26884i0();
        }
        if (this.f23262L > 0) {
            this.f23281c.mo386b(this);
        }
    }

    @Override // p050H0.C0545n.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo473r(AbstractC0212e abstractC0212e, long j7, long j8) {
        this.f23252B = null;
        this.f23283d.m26798r(abstractC0212e);
        C0179y c0179y = new C0179y(abstractC0212e.f872a, abstractC0212e.f873b, abstractC0212e.m873f(), abstractC0212e.m872e(), j7, j8, abstractC0212e.m870a());
        this.f23290p.mo2086b(abstractC0212e.f872a);
        this.f23292r.m377t(c0179y, abstractC0212e.f874c, this.f23279b, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, abstractC0212e.f878g, abstractC0212e.f879h);
        if (this.f23261K) {
            this.f23281c.mo386b(this);
        } else {
            mo311e(new C5762v0.b().m24371f(this.f23273W).m24369d());
        }
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        if (m26851Q()) {
            return this.f23274X;
        }
        if (this.f23278a0) {
            return Long.MIN_VALUE;
        }
        return m26863L().f879h;
    }

    @Override // p050H0.C0545n.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C0545n.c mo471m(AbstractC0212e abstractC0212e, long j7, long j8, IOException iOException, int i7) {
        C0545n.c m2096h;
        int i8;
        boolean m26850P = m26850P(abstractC0212e);
        if (m26850P && !((C6416j) abstractC0212e).m26817q() && (iOException instanceof C5506t) && ((i8 = ((C5506t) iOException).f19849d) == 410 || i8 == 404)) {
            return C0545n.f1785d;
        }
        long m870a = abstractC0212e.m870a();
        C0179y c0179y = new C0179y(abstractC0212e.f872a, abstractC0212e.f873b, abstractC0212e.m873f(), abstractC0212e.m872e(), j7, j8, m870a);
        InterfaceC0544m.c cVar = new InterfaceC0544m.c(c0179y, new C0116B(abstractC0212e.f874c, this.f23279b, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, AbstractC5330M.m21758l1(abstractC0212e.f878g), AbstractC5330M.m21758l1(abstractC0212e.f879h)), iOException, i7);
        InterfaceC0544m.b mo2085a = this.f23290p.mo2085a(AbstractC0348C.m1373c(this.f23283d.m26792l()), cVar);
        boolean m26795o = (mo2085a == null || mo2085a.f1779a != 2) ? false : this.f23283d.m26795o(abstractC0212e, mo2085a.f1780b);
        if (m26795o) {
            if (m26850P && m870a == 0) {
                ArrayList arrayList = this.f23295u;
                AbstractC5332a.m21802g(((C6416j) arrayList.remove(arrayList.size() - 1)) == abstractC0212e);
                if (this.f23295u.isEmpty()) {
                    this.f23274X = this.f23273W;
                } else {
                    ((C6416j) AbstractC2987A.m10751d(this.f23295u)).m26816o();
                }
            }
            m2096h = C0545n.f1787f;
        } else {
            long mo2087c = this.f23290p.mo2087c(cVar);
            m2096h = mo2087c != -9223372036854775807L ? C0545n.m2096h(false, mo2087c) : C0545n.f1788g;
        }
        C0545n.c cVar2 = m2096h;
        boolean m2108c = cVar2.m2108c();
        this.f23292r.m379v(c0179y, abstractC0212e.f874c, this.f23279b, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, abstractC0212e.f878g, abstractC0212e.f879h, iOException, !m2108c);
        if (!m2108c) {
            this.f23252B = null;
            this.f23290p.mo2086b(abstractC0212e.f872a);
        }
        if (m26795o) {
            if (this.f23261K) {
                this.f23281c.mo386b(this);
            } else {
                mo311e(new C5762v0.b().m24371f(this.f23273W).m24369d());
            }
        }
        return cVar2;
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: b */
    public InterfaceC0861T mo455b(int i7, int i8) {
        InterfaceC0861T interfaceC0861T;
        if (!f23250f0.contains(Integer.valueOf(i8))) {
            int i9 = 0;
            while (true) {
                InterfaceC0861T[] interfaceC0861TArr = this.f23253C;
                if (i9 >= interfaceC0861TArr.length) {
                    interfaceC0861T = null;
                    break;
                }
                if (this.f23254D[i9] == i7) {
                    interfaceC0861T = interfaceC0861TArr[i9];
                    break;
                }
                i9++;
            }
        } else {
            interfaceC0861T = m26864M(i7, i8);
        }
        if (interfaceC0861T == null) {
            if (this.f23280b0) {
                return m26846D(i7, i8);
            }
            interfaceC0861T = m26858E(i7, i8);
        }
        if (i8 != 5) {
            return interfaceC0861T;
        }
        if (this.f23257G == null) {
            this.f23257G = new c(interfaceC0861T, this.f23293s);
        }
        return this.f23257G;
    }

    /* renamed from: b0 */
    public void m26876b0() {
        this.f23255E.clear();
    }

    @Override // p022D0.C0143b0.d
    /* renamed from: c */
    public void mo457c(C4327q c4327q) {
        this.f23299y.post(this.f23297w);
    }

    /* renamed from: c0 */
    public boolean m26877c0(Uri uri, InterfaceC0544m.c cVar, boolean z6) {
        InterfaceC0544m.b mo2085a;
        if (!this.f23283d.m26797q(uri)) {
            return true;
        }
        long j7 = (z6 || (mo2085a = this.f23290p.mo2085a(AbstractC0348C.m1373c(this.f23283d.m26792l()), cVar)) == null || mo2085a.f1779a != 2) ? -9223372036854775807L : mo2085a.f1780b;
        return this.f23283d.m26799s(uri, j7) && j7 != -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f23291q.m2101j();
    }

    /* renamed from: d0 */
    public void m26878d0() {
        if (this.f23295u.isEmpty()) {
            return;
        }
        final C6416j c6416j = (C6416j) AbstractC2987A.m10751d(this.f23295u);
        int m26787d = this.f23283d.m26787d(c6416j);
        if (m26787d == 1) {
            c6416j.m26822v();
            return;
        }
        if (m26787d == 0) {
            this.f23299y.post(new Runnable() { // from class: t0.o
                @Override // java.lang.Runnable
                public final void run() {
                    C6425s.this.m26868T(c6416j);
                }
            });
        } else if (m26787d == 2 && !this.f23278a0 && this.f23291q.m2101j()) {
            this.f23291q.m2098f();
        }
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        List list;
        long max;
        if (this.f23278a0 || this.f23291q.m2101j() || this.f23291q.m2100i()) {
            return false;
        }
        if (m26851Q()) {
            list = Collections.emptyList();
            max = this.f23274X;
            for (d dVar : this.f23253C) {
                dVar.m563c0(this.f23274X);
            }
        } else {
            list = this.f23296v;
            C6416j m26863L = m26863L();
            max = m26863L.mo913h() ? m26863L.f879h : Math.max(this.f23273W, m26863L.f878g);
        }
        List list2 = list;
        long j7 = max;
        this.f23294t.m26807a();
        this.f23283d.m26788f(c5762v0, j7, list2, this.f23261K || !list2.isEmpty(), this.f23294t);
        C6412f.b bVar = this.f23294t;
        boolean z6 = bVar.f23172b;
        AbstractC0212e abstractC0212e = bVar.f23171a;
        Uri uri = bVar.f23173c;
        if (z6) {
            this.f23274X = -9223372036854775807L;
            this.f23278a0 = true;
            return true;
        }
        if (abstractC0212e == null) {
            if (uri != null) {
                this.f23281c.mo26842k(uri);
            }
            return false;
        }
        if (m26850P(abstractC0212e)) {
            m26865O((C6416j) abstractC0212e);
        }
        this.f23252B = abstractC0212e;
        this.f23292r.m383z(new C0179y(abstractC0212e.f872a, abstractC0212e.f873b, this.f23291q.m2105n(abstractC0212e, this, this.f23290p.mo2088d(abstractC0212e.f874c))), abstractC0212e.f874c, this.f23279b, abstractC0212e.f875d, abstractC0212e.f876e, abstractC0212e.f877f, abstractC0212e.f878g, abstractC0212e.f879h);
        return true;
    }

    /* renamed from: e0 */
    public final void m26879e0() {
        this.f23260J = true;
        m26870V();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        /*
            r7 = this;
            boolean r0 = r7.f23278a0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.m26851Q()
            if (r0 == 0) goto L10
            long r0 = r7.f23274X
            return r0
        L10:
            long r0 = r7.f23273W
            t0.j r2 = r7.m26863L()
            boolean r3 = r2.mo913h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.f23295u
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.f23295u
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            t0.j r2 = (p343t0.C6416j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f879h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f23260J
            if (r2 == 0) goto L55
            t0.s$d[] r2 = r7.f23253C
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.m533A()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p343t0.C6425s.mo312f():long");
    }

    /* renamed from: f0 */
    public void m26880f0(C4304J[] c4304jArr, int i7, int... iArr) {
        this.f23266P = m26859F(c4304jArr);
        this.f23267Q = new HashSet();
        for (int i8 : iArr) {
            this.f23267Q.add(this.f23266P.m653b(i8));
        }
        this.f23269S = i7;
        Handler handler = this.f23299y;
        final b bVar = this.f23281c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: t0.r
            @Override // java.lang.Runnable
            public final void run() {
                C6425s.b.this.mo26841j();
            }
        });
        m26890n0();
    }

    /* renamed from: g */
    public long m26881g(long j7, C5714a1 c5714a1) {
        return this.f23283d.m26786c(j7, c5714a1);
    }

    /* renamed from: g0 */
    public int m26882g0(int i7, C5756s0 c5756s0, C5561i c5561i, int i8) {
        if (m26851Q()) {
            return -3;
        }
        int i9 = 0;
        if (!this.f23295u.isEmpty()) {
            int i10 = 0;
            while (i10 < this.f23295u.size() - 1 && m26862J((C6416j) this.f23295u.get(i10))) {
                i10++;
            }
            AbstractC5330M.m21714V0(this.f23295u, 0, i10);
            C6416j c6416j = (C6416j) this.f23295u.get(0);
            C4327q c4327q = c6416j.f875d;
            if (!c4327q.equals(this.f23264N)) {
                this.f23292r.m365h(this.f23279b, c4327q, c6416j.f876e, c6416j.f877f, c6416j.f878g);
            }
            this.f23264N = c4327q;
        }
        if (!this.f23295u.isEmpty() && !((C6416j) this.f23295u.get(0)).m26817q()) {
            return -3;
        }
        int m551T = this.f23253C[i7].m551T(c5756s0, c5561i, i8, this.f23278a0);
        if (m551T == -5) {
            C4327q c4327q2 = (C4327q) AbstractC5332a.m21800e(c5756s0.f20950b);
            if (i7 == this.f23259I) {
                int m14421d = AbstractC3577g.m14421d(this.f23253C[i7].m549R());
                while (i9 < this.f23295u.size() && ((C6416j) this.f23295u.get(i9)).f23199k != m14421d) {
                    i9++;
                }
                c4327q2 = c4327q2.m18197h(i9 < this.f23295u.size() ? ((C6416j) this.f23295u.get(i9)).f875d : (C4327q) AbstractC5332a.m21800e(this.f23263M));
            }
            c5756s0.f20950b = c4327q2;
        }
        return m551T;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        if (this.f23291q.m2100i() || m26851Q()) {
            return;
        }
        if (this.f23291q.m2101j()) {
            AbstractC5332a.m21800e(this.f23252B);
            if (this.f23283d.m26804x(j7, this.f23252B, this.f23296v)) {
                this.f23291q.m2098f();
                return;
            }
            return;
        }
        int size = this.f23296v.size();
        while (size > 0 && this.f23283d.m26787d((C6416j) this.f23296v.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f23296v.size()) {
            m26860H(size);
        }
        int m26790i = this.f23283d.m26790i(j7, this.f23296v);
        if (m26790i < this.f23295u.size()) {
            m26860H(m26790i);
        }
    }

    /* renamed from: h0 */
    public void m26883h0() {
        if (this.f23261K) {
            for (d dVar : this.f23253C) {
                dVar.m550S();
            }
        }
        this.f23283d.m26800t();
        this.f23291q.m2104m(this);
        this.f23299y.removeCallbacksAndMessages(null);
        this.f23265O = true;
        this.f23300z.clear();
    }

    @Override // p050H0.C0545n.f
    /* renamed from: i */
    public void mo464i() {
        for (d dVar : this.f23253C) {
            dVar.m552U();
        }
    }

    /* renamed from: i0 */
    public final void m26884i0() {
        for (d dVar : this.f23253C) {
            dVar.m555X(this.f23275Y);
        }
        this.f23275Y = false;
    }

    /* renamed from: j0 */
    public final boolean m26885j0(long j7, C6416j c6416j) {
        int length = this.f23253C.length;
        for (int i7 = 0; i7 < length; i7++) {
            d dVar = this.f23253C[i7];
            if (!(c6416j != null ? dVar.m557Z(c6416j.m26814m(i7)) : dVar.m559a0(j7, false)) && (this.f23272V[i7] || !this.f23270T)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    public boolean m26886k0(long j7, boolean z6) {
        C6416j c6416j;
        this.f23273W = j7;
        if (m26851Q()) {
            this.f23274X = j7;
            return true;
        }
        if (this.f23283d.m26793m()) {
            for (int i7 = 0; i7 < this.f23295u.size(); i7++) {
                c6416j = (C6416j) this.f23295u.get(i7);
                if (c6416j.f878g == j7) {
                    break;
                }
            }
        }
        c6416j = null;
        if (this.f23260J && !z6 && m26885j0(j7, c6416j)) {
            return false;
        }
        this.f23274X = j7;
        this.f23278a0 = false;
        this.f23295u.clear();
        if (this.f23291q.m2101j()) {
            if (this.f23260J) {
                for (d dVar : this.f23253C) {
                    dVar.m580r();
                }
            }
            this.f23291q.m2098f();
        } else {
            this.f23291q.m2099g();
            m26884i0();
        }
        return true;
    }

    /* renamed from: l */
    public void m26887l() {
        m26871W();
        if (this.f23278a0 && !this.f23261K) {
            throw C4295A.m17943a("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        if (r11.mo402p() != r19.f23283d.m26791k().m18065b(r1.f875d)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m26888l0(p043G0.InterfaceC0375y[] r20, boolean[] r21, p022D0.InterfaceC0145c0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p343t0.C6425s.m26888l0(G0.y[], boolean[], D0.c0[], boolean[], long, boolean):boolean");
    }

    /* renamed from: m0 */
    public void m26889m0(C4323m c4323m) {
        if (AbstractC5330M.m21729c(this.f23284d0, c4323m)) {
            return;
        }
        this.f23284d0 = c4323m;
        int i7 = 0;
        while (true) {
            d[] dVarArr = this.f23253C;
            if (i7 >= dVarArr.length) {
                return;
            }
            if (this.f23272V[i7]) {
                dVarArr[i7].m26904j0(c4323m);
            }
            i7++;
        }
    }

    /* renamed from: n0 */
    public final void m26890n0() {
        this.f23261K = true;
    }

    /* renamed from: o0 */
    public void m26891o0(boolean z6) {
        this.f23283d.m26802v(z6);
    }

    /* renamed from: p0 */
    public void m26892p0(long j7) {
        if (this.f23282c0 != j7) {
            this.f23282c0 = j7;
            for (d dVar : this.f23253C) {
                dVar.m561b0(j7);
            }
        }
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: q */
    public void mo472q() {
        this.f23280b0 = true;
        this.f23299y.post(this.f23298x);
    }

    /* renamed from: q0 */
    public int m26893q0(int i7, long j7) {
        if (m26851Q()) {
            return 0;
        }
        d dVar = this.f23253C[i7];
        int m538F = dVar.m538F(j7, this.f23278a0);
        C6416j c6416j = (C6416j) AbstractC2987A.m10752e(this.f23295u, null);
        if (c6416j != null && !c6416j.m26817q()) {
            m538F = Math.min(m538F, c6416j.m26814m(i7) - dVar.m536D());
        }
        dVar.m569f0(m538F);
        return m538F;
    }

    /* renamed from: r0 */
    public void m26894r0(int i7) {
        m26898y();
        AbstractC5332a.m21800e(this.f23268R);
        int i8 = this.f23268R[i7];
        AbstractC5332a.m21802g(this.f23271U[i8]);
        this.f23271U[i8] = false;
    }

    /* renamed from: s0 */
    public final void m26895s0(InterfaceC0145c0[] interfaceC0145c0Arr) {
        this.f23300z.clear();
        for (InterfaceC0145c0 interfaceC0145c0 : interfaceC0145c0Arr) {
            if (interfaceC0145c0 != null) {
                this.f23300z.add((C6420n) interfaceC0145c0);
            }
        }
    }

    /* renamed from: t */
    public C0165m0 m26896t() {
        m26898y();
        return this.f23266P;
    }

    /* renamed from: u */
    public void m26897u(long j7, boolean z6) {
        if (!this.f23260J || m26851Q()) {
            return;
        }
        int length = this.f23253C.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f23253C[i7].m579q(j7, z6, this.f23271U[i7]);
        }
    }

    /* renamed from: y */
    public final void m26898y() {
        AbstractC5332a.m21802g(this.f23261K);
        AbstractC5332a.m21800e(this.f23266P);
        AbstractC5332a.m21800e(this.f23267Q);
    }

    /* renamed from: z */
    public int m26899z(int i7) {
        m26898y();
        AbstractC5332a.m21800e(this.f23268R);
        int i8 = this.f23268R[i7];
        if (i8 == -1) {
            return this.f23267Q.contains(this.f23266P.m653b(i7)) ? -3 : -2;
        }
        boolean[] zArr = this.f23271U;
        if (zArr[i8]) {
            return -2;
        }
        zArr[i8] = true;
        return i8;
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: j */
    public void mo466j(InterfaceC0855M interfaceC0855M) {
    }
}
