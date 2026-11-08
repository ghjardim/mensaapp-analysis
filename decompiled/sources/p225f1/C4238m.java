package p225f1;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0868c;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0847E;
import p078L0.C0854L;
import p078L0.C0862U;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0859Q;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC3033v;
import p184a1.C3098a;
import p225f1.AbstractC4226a;
import p232g0.C4295A;
import p232g0.C4327q;
import p232g0.C4334x;
import p249i1.C4531v;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p268k0.AbstractC5400d;

/* renamed from: f1.m */
/* loaded from: classes.dex */
public final class C4238m implements InterfaceC0883r, InterfaceC0855M {

    /* renamed from: B */
    public static final InterfaceC0889x f14548B = new InterfaceC0889x() { // from class: f1.l
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m17789w;
            m17789w = C4238m.m17789w();
            return m17789w;
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: c */
        public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
            return AbstractC0888w.m3695b(this, z6);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
            return AbstractC0888w.m3694a(this, uri, map);
        }
    };

    /* renamed from: A */
    public C3098a f14549A;

    /* renamed from: a */
    public final InterfaceC4529t.a f14550a;

    /* renamed from: b */
    public final int f14551b;

    /* renamed from: c */
    public final C5357z f14552c;

    /* renamed from: d */
    public final C5357z f14553d;

    /* renamed from: e */
    public final C5357z f14554e;

    /* renamed from: f */
    public final C5357z f14555f;

    /* renamed from: g */
    public final ArrayDeque f14556g;

    /* renamed from: h */
    public final C4241p f14557h;

    /* renamed from: i */
    public final List f14558i;

    /* renamed from: j */
    public AbstractC3033v f14559j = AbstractC3033v.m11050t();

    /* renamed from: k */
    public int f14560k;

    /* renamed from: l */
    public int f14561l;

    /* renamed from: m */
    public long f14562m;

    /* renamed from: n */
    public int f14563n;

    /* renamed from: o */
    public C5357z f14564o;

    /* renamed from: p */
    public int f14565p;

    /* renamed from: q */
    public int f14566q;

    /* renamed from: r */
    public int f14567r;

    /* renamed from: s */
    public int f14568s;

    /* renamed from: t */
    public boolean f14569t;

    /* renamed from: u */
    public InterfaceC0885t f14570u;

    /* renamed from: v */
    public a[] f14571v;

    /* renamed from: w */
    public long[][] f14572w;

    /* renamed from: x */
    public int f14573x;

    /* renamed from: y */
    public long f14574y;

    /* renamed from: z */
    public int f14575z;

    /* renamed from: f1.m$a */
    public static final class a {

        /* renamed from: a */
        public final C4244s f14576a;

        /* renamed from: b */
        public final C4247v f14577b;

        /* renamed from: c */
        public final InterfaceC0861T f14578c;

        /* renamed from: d */
        public final C0862U f14579d;

        /* renamed from: e */
        public int f14580e;

        public a(C4244s c4244s, C4247v c4247v, InterfaceC0861T interfaceC0861T) {
            this.f14576a = c4244s;
            this.f14577b = c4247v;
            this.f14578c = interfaceC0861T;
            this.f14579d = "audio/true-hd".equals(c4244s.f14600f.f15138n) ? new C0862U() : null;
        }
    }

    public C4238m(InterfaceC4529t.a aVar, int i7) {
        this.f14550a = aVar;
        this.f14551b = i7;
        this.f14560k = (i7 & 4) != 0 ? 3 : 0;
        this.f14557h = new C4241p();
        this.f14558i = new ArrayList();
        this.f14555f = new C5357z(16);
        this.f14556g = new ArrayDeque();
        this.f14552c = new C5357z(AbstractC5400d.f19246a);
        this.f14553d = new C5357z(4);
        this.f14554e = new C5357z();
        this.f14565p = -1;
        this.f14570u = InterfaceC0885t.f3104h;
        this.f14571v = new a[0];
    }

    /* renamed from: B */
    public static int m17780B(C5357z c5357z) {
        c5357z.m21939T(8);
        int m17785o = m17785o(c5357z.m21957p());
        if (m17785o != 0) {
            return m17785o;
        }
        c5357z.m21940U(4);
        while (c5357z.m21942a() > 0) {
            int m17785o2 = m17785o(c5357z.m21957p());
            if (m17785o2 != 0) {
                return m17785o2;
            }
        }
        return 0;
    }

    /* renamed from: I */
    public static boolean m17781I(int i7) {
        return i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1701082227 || i7 == 1835365473;
    }

    /* renamed from: J */
    public static boolean m17782J(int i7) {
        return i7 == 1835296868 || i7 == 1836476516 || i7 == 1751411826 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1937011571 || i7 == 1668576371 || i7 == 1701606260 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1953196132 || i7 == 1718909296 || i7 == 1969517665 || i7 == 1801812339 || i7 == 1768715124;
    }

    /* renamed from: o */
    public static int m17785o(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: p */
    public static long[][] m17786p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            jArr[i7] = new long[aVarArr[i7].f14577b.f14630b];
            jArr2[i7] = aVarArr[i7].f14577b.f14634f[0];
        }
        long j7 = 0;
        int i8 = 0;
        while (i8 < aVarArr.length) {
            long j8 = Long.MAX_VALUE;
            int i9 = -1;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                if (!zArr[i10]) {
                    long j9 = jArr2[i10];
                    if (j9 <= j8) {
                        i9 = i10;
                        j8 = j9;
                    }
                }
            }
            int i11 = iArr[i9];
            long[] jArr3 = jArr[i9];
            jArr3[i11] = j7;
            C4247v c4247v = aVarArr[i9].f14577b;
            j7 += c4247v.f14632d[i11];
            int i12 = i11 + 1;
            iArr[i9] = i12;
            if (i12 < jArr3.length) {
                jArr2[i9] = c4247v.f14634f[i12];
            } else {
                zArr[i9] = true;
                i8++;
            }
        }
        return jArr;
    }

    /* renamed from: t */
    public static int m17787t(C4247v c4247v, long j7) {
        int m17834a = c4247v.m17834a(j7);
        return m17834a == -1 ? c4247v.m17835b(j7) : m17834a;
    }

    /* renamed from: w */
    public static /* synthetic */ InterfaceC0883r[] m17789w() {
        return new InterfaceC0883r[]{new C4238m(InterfaceC4529t.a.f16172a, 16)};
    }

    /* renamed from: x */
    public static long m17790x(C4247v c4247v, long j7, long j8) {
        int m17787t = m17787t(c4247v, j7);
        return m17787t == -1 ? j8 : Math.min(c4247v.f14631c[m17787t], j8);
    }

    /* renamed from: A */
    public final void m17791A() {
        if (this.f14575z != 2 || (this.f14551b & 2) == 0) {
            return;
        }
        this.f14570u.mo455b(0, 4).mo566e(new C4327q.b().m18257h0(this.f14549A == null ? null : new C4334x(this.f14549A)).m18234K());
        this.f14570u.mo472q();
        this.f14570u.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
    }

    /* renamed from: C */
    public final void m17792C(AbstractC4226a.a aVar) {
        C4334x c4334x;
        int i7;
        List list;
        C0847E c0847e;
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        boolean z6 = this.f14575z == 1;
        C0847E c0847e2 = new C0847E();
        AbstractC4226a.b m17670g = aVar.m17670g(1969517665);
        if (m17670g != null) {
            C4334x m17673C = AbstractC4227b.m17673C(m17670g);
            c0847e2.m3525c(m17673C);
            c4334x = m17673C;
        } else {
            c4334x = null;
        }
        AbstractC4226a.a m17669f = aVar.m17669f(1835365473);
        C4334x m17692p = m17669f != null ? AbstractC4227b.m17692p(m17669f) : null;
        C4334x c4334x2 = new C4334x(AbstractC4227b.m17694r(((AbstractC4226a.b) AbstractC5332a.m21800e(aVar.m17670g(1836476516))).f14447b));
        long j7 = -9223372036854775807L;
        C4334x c4334x3 = m17692p;
        List m17672B = AbstractC4227b.m17672B(aVar, c0847e2, -9223372036854775807L, null, (this.f14551b & 1) != 0, z6, new InterfaceC2924g() { // from class: f1.k
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                C4244s m17788v;
                m17788v = C4238m.m17788v((C4244s) obj);
                return m17788v;
            }
        });
        long j8 = -9223372036854775807L;
        int i12 = 0;
        int i13 = -1;
        while (i12 < m17672B.size()) {
            C4247v c4247v = (C4247v) m17672B.get(i12);
            if (c4247v.f14630b == 0) {
                list = m17672B;
                i7 = i10;
                i8 = i11;
                c0847e = c0847e2;
            } else {
                C4244s c4244s = c4247v.f14629a;
                C0847E c0847e3 = c0847e2;
                long j9 = c4244s.f14599e;
                if (j9 == j7) {
                    j9 = c4247v.f14636h;
                }
                j8 = Math.max(j8, j9);
                i7 = i10 + 1;
                list = m17672B;
                a aVar2 = new a(c4244s, c4247v, this.f14570u.mo455b(i10, c4244s.f14596b));
                int i14 = "audio/true-hd".equals(c4244s.f14600f.f15138n) ? c4247v.f14633e * 16 : c4247v.f14633e + 30;
                C4327q.b m18193a = c4244s.f14600f.m18193a();
                m18193a.m18255f0(i14);
                if (c4244s.f14596b == 2) {
                    if ((this.f14551b & 8) != 0) {
                        m18193a.m18262m0(c4244s.f14600f.f15130f | (i13 == -1 ? 1 : 2));
                    }
                    if (j9 > 0 && (i9 = c4247v.f14630b) > 0) {
                        m18193a.m18247X(i9 / (j9 / 1000000.0f));
                    }
                }
                c0847e = c0847e3;
                AbstractC4235j.m17778k(c4244s.f14596b, c0847e, m18193a);
                AbstractC4235j.m17779l(c4244s.f14596b, c4334x3, m18193a, this.f14558i.isEmpty() ? null : new C4334x(this.f14558i), c4334x, c4334x2);
                aVar2.f14578c.mo566e(m18193a.m18234K());
                if (c4244s.f14596b == 2 && i13 == -1) {
                    i13 = arrayList.size();
                }
                arrayList.add(aVar2);
                i8 = 1;
            }
            i12 += i8;
            c0847e2 = c0847e;
            i11 = i8;
            i10 = i7;
            m17672B = list;
            j7 = -9223372036854775807L;
        }
        this.f14573x = i13;
        this.f14574y = j8;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f14571v = aVarArr;
        this.f14572w = m17786p(aVarArr);
        this.f14570u.mo472q();
        this.f14570u.mo466j(this);
    }

    /* renamed from: D */
    public final void m17793D(long j7) {
        if (this.f14561l == 1836086884) {
            int i7 = this.f14563n;
            this.f14549A = new C3098a(0L, j7, -9223372036854775807L, j7 + i7, this.f14562m - i7);
        }
    }

    /* renamed from: E */
    public final boolean m17794E(InterfaceC0884s interfaceC0884s) {
        AbstractC4226a.a aVar;
        if (this.f14563n == 0) {
            if (!interfaceC0884s.mo3512d(this.f14555f.m21946e(), 0, 8, true)) {
                m17791A();
                return false;
            }
            this.f14563n = 8;
            this.f14555f.m21939T(0);
            this.f14562m = this.f14555f.m21928I();
            this.f14561l = this.f14555f.m21957p();
        }
        long j7 = this.f14562m;
        if (j7 == 1) {
            interfaceC0884s.readFully(this.f14555f.m21946e(), 8, 8);
            this.f14563n += 8;
            this.f14562m = this.f14555f.m21931L();
        } else if (j7 == 0) {
            long mo3511a = interfaceC0884s.mo3511a();
            if (mo3511a == -1 && (aVar = (AbstractC4226a.a) this.f14556g.peek()) != null) {
                mo3511a = aVar.f14444b;
            }
            if (mo3511a != -1) {
                this.f14562m = (mo3511a - interfaceC0884s.mo3522u()) + this.f14563n;
            }
        }
        if (this.f14562m < this.f14563n) {
            throw C4295A.m17947e("Atom size less than header length (unsupported).");
        }
        if (m17781I(this.f14561l)) {
            long mo3522u = interfaceC0884s.mo3522u();
            long j8 = this.f14562m;
            int i7 = this.f14563n;
            long j9 = (mo3522u + j8) - i7;
            if (j8 != i7 && this.f14561l == 1835365473) {
                m17803y(interfaceC0884s);
            }
            this.f14556g.push(new AbstractC4226a.a(this.f14561l, j9));
            if (this.f14562m == this.f14563n) {
                m17804z(j9);
            } else {
                m17799q();
            }
        } else if (m17782J(this.f14561l)) {
            AbstractC5332a.m21802g(this.f14563n == 8);
            AbstractC5332a.m21802g(this.f14562m <= 2147483647L);
            C5357z c5357z = new C5357z((int) this.f14562m);
            System.arraycopy(this.f14555f.m21946e(), 0, c5357z.m21946e(), 0, 8);
            this.f14564o = c5357z;
            this.f14560k = 1;
        } else {
            m17793D(interfaceC0884s.mo3522u() - this.f14563n);
            this.f14564o = null;
            this.f14560k = 1;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m17795F(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        boolean z6;
        long j7 = this.f14562m - this.f14563n;
        long mo3522u = interfaceC0884s.mo3522u() + j7;
        C5357z c5357z = this.f14564o;
        if (c5357z != null) {
            interfaceC0884s.readFully(c5357z.m21946e(), this.f14563n, (int) j7);
            if (this.f14561l == 1718909296) {
                this.f14569t = true;
                this.f14575z = m17780B(c5357z);
            } else if (!this.f14556g.isEmpty()) {
                ((AbstractC4226a.a) this.f14556g.peek()).m17668e(new AbstractC4226a.b(this.f14561l, c5357z));
            }
        } else {
            if (!this.f14569t && this.f14561l == 1835295092) {
                this.f14575z = 1;
            }
            if (j7 >= 262144) {
                c0854l.f2935a = interfaceC0884s.mo3522u() + j7;
                z6 = true;
                m17804z(mo3522u);
                return (z6 || this.f14560k == 2) ? false : true;
            }
            interfaceC0884s.mo3519q((int) j7);
        }
        z6 = false;
        m17804z(mo3522u);
        if (z6) {
        }
    }

    /* renamed from: G */
    public final int m17796G(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int i7;
        C0854L c0854l2;
        long mo3522u = interfaceC0884s.mo3522u();
        if (this.f14565p == -1) {
            int m17802u = m17802u(mo3522u);
            this.f14565p = m17802u;
            if (m17802u == -1) {
                return -1;
            }
        }
        a aVar = this.f14571v[this.f14565p];
        InterfaceC0861T interfaceC0861T = aVar.f14578c;
        int i8 = aVar.f14580e;
        C4247v c4247v = aVar.f14577b;
        long j7 = c4247v.f14631c[i8];
        int i9 = c4247v.f14632d[i8];
        C0862U c0862u = aVar.f14579d;
        long j8 = (j7 - mo3522u) + this.f14566q;
        if (j8 < 0) {
            i7 = 1;
            c0854l2 = c0854l;
        } else {
            if (j8 < 262144) {
                if (aVar.f14576a.f14601g == 1) {
                    j8 += 8;
                    i9 -= 8;
                }
                interfaceC0884s.mo3519q((int) j8);
                C4244s c4244s = aVar.f14576a;
                if (c4244s.f14604j == 0) {
                    if ("audio/ac4".equals(c4244s.f14600f.f15138n)) {
                        if (this.f14567r == 0) {
                            AbstractC0868c.m3599a(i9, this.f14554e);
                            interfaceC0861T.mo564d(this.f14554e, 7);
                            this.f14567r += 7;
                        }
                        i9 += 7;
                    } else if (c0862u != null) {
                        c0862u.m3560d(interfaceC0884s);
                    }
                    while (true) {
                        int i10 = this.f14567r;
                        if (i10 >= i9) {
                            break;
                        }
                        int mo558a = interfaceC0861T.mo558a(interfaceC0884s, i9 - i10, false);
                        this.f14566q += mo558a;
                        this.f14567r += mo558a;
                        this.f14568s -= mo558a;
                    }
                } else {
                    byte[] m21946e = this.f14553d.m21946e();
                    m21946e[0] = 0;
                    m21946e[1] = 0;
                    m21946e[2] = 0;
                    int i11 = aVar.f14576a.f14604j;
                    int i12 = 4 - i11;
                    while (this.f14567r < i9) {
                        int i13 = this.f14568s;
                        if (i13 == 0) {
                            interfaceC0884s.readFully(m21946e, i12, i11);
                            this.f14566q += i11;
                            this.f14553d.m21939T(0);
                            int m21957p = this.f14553d.m21957p();
                            if (m21957p < 0) {
                                throw C4295A.m17943a("Invalid NAL length", null);
                            }
                            this.f14568s = m21957p;
                            this.f14552c.m21939T(0);
                            interfaceC0861T.mo564d(this.f14552c, 4);
                            this.f14567r += 4;
                            i9 += i12;
                        } else {
                            int mo558a2 = interfaceC0861T.mo558a(interfaceC0884s, i13, false);
                            this.f14566q += mo558a2;
                            this.f14567r += mo558a2;
                            this.f14568s -= mo558a2;
                        }
                    }
                }
                int i14 = i9;
                C4247v c4247v2 = aVar.f14577b;
                long j9 = c4247v2.f14634f[i8];
                int i15 = c4247v2.f14635g[i8];
                if (c0862u != null) {
                    c0862u.m3559c(interfaceC0861T, j9, i15, i14, 0, null);
                    if (i8 + 1 == aVar.f14577b.f14630b) {
                        c0862u.m3557a(interfaceC0861T, null);
                    }
                } else {
                    interfaceC0861T.mo562c(j9, i15, i14, 0, null);
                }
                aVar.f14580e++;
                this.f14565p = -1;
                this.f14566q = 0;
                this.f14567r = 0;
                this.f14568s = 0;
                return 0;
            }
            c0854l2 = c0854l;
            i7 = 1;
        }
        c0854l2.f2935a = j7;
        return i7;
    }

    /* renamed from: H */
    public final int m17797H(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int m17815c = this.f14557h.m17815c(interfaceC0884s, c0854l, this.f14558i);
        if (m17815c == 1 && c0854l.f2935a == 0) {
            m17799q();
        }
        return m17815c;
    }

    /* renamed from: K */
    public final void m17798K(a aVar, long j7) {
        C4247v c4247v = aVar.f14577b;
        int m17834a = c4247v.m17834a(j7);
        if (m17834a == -1) {
            m17834a = c4247v.m17835b(j7);
        }
        aVar.f14580e = m17834a;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f14556g.clear();
        this.f14563n = 0;
        this.f14565p = -1;
        this.f14566q = 0;
        this.f14567r = 0;
        this.f14568s = 0;
        if (j7 == 0) {
            if (this.f14560k != 3) {
                m17799q();
                return;
            } else {
                this.f14557h.m17818g();
                this.f14558i.clear();
                return;
            }
        }
        for (a aVar : this.f14571v) {
            m17798K(aVar, j8);
            C0862U c0862u = aVar.f14579d;
            if (c0862u != null) {
                c0862u.m3558b();
            }
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        if ((this.f14551b & 16) == 0) {
            interfaceC0885t = new C4531v(interfaceC0885t, this.f14550a);
        }
        this.f14570u = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        while (true) {
            int i7 = this.f14560k;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        return m17796G(interfaceC0884s, c0854l);
                    }
                    if (i7 == 3) {
                        return m17797H(interfaceC0884s, c0854l);
                    }
                    throw new IllegalStateException();
                }
                if (m17795F(interfaceC0884s, c0854l)) {
                    return 1;
                }
            } else if (!m17794E(interfaceC0884s)) {
                return -1;
            }
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        InterfaceC0859Q m17824d = AbstractC4243r.m17824d(interfaceC0884s, (this.f14551b & 2) != 0);
        this.f14559j = m17824d != null ? AbstractC3033v.m11051u(m17824d) : AbstractC3033v.m11050t();
        return m17824d == null;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        return m17800r(j7, -1);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f14574y;
    }

    /* renamed from: q */
    public final void m17799q() {
        this.f14560k = 0;
        this.f14563n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p078L0.InterfaceC0855M.a m17800r(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            f1.m$a[] r4 = r0.f14571v
            int r5 = r4.length
            if (r5 != 0) goto L13
            L0.M$a r1 = new L0.M$a
            L0.N r2 = p078L0.C0856N.f2940c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f14573x
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            f1.v r4 = r4.f14577b
            int r6 = m17787t(r4, r1)
            if (r6 != r5) goto L35
            L0.M$a r1 = new L0.M$a
            L0.N r2 = p078L0.C0856N.f2940c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f14634f
            r12 = r11[r6]
            long[] r11 = r4.f14631c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f14630b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.m17835b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f14634f
            r9 = r2[r1]
            long[] r2 = r4.f14631c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            f1.m$a[] r4 = r0.f14571v
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f14573x
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            f1.v r4 = r4.f14577b
            long r5 = m17790x(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = m17790x(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            L0.N r3 = new L0.N
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            L0.M$a r1 = new L0.M$a
            r1.<init>(r3)
            return r1
        L8f:
            L0.N r4 = new L0.N
            r4.<init>(r9, r1)
            L0.M$a r1 = new L0.M$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p225f1.C4238m.m17800r(long, int):L0.M$a");
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC3033v mo698g() {
        return this.f14559j;
    }

    /* renamed from: u */
    public final int m17802u(long j7) {
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        long j8 = Long.MAX_VALUE;
        boolean z6 = true;
        long j9 = Long.MAX_VALUE;
        boolean z7 = true;
        long j10 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f14571v;
            if (i9 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i9];
            int i10 = aVar.f14580e;
            C4247v c4247v = aVar.f14577b;
            if (i10 != c4247v.f14630b) {
                long j11 = c4247v.f14631c[i10];
                long j12 = ((long[][]) AbstractC5330M.m21747i(this.f14572w))[i9][i10];
                long j13 = j11 - j7;
                boolean z8 = j13 < 0 || j13 >= 262144;
                if ((!z8 && z7) || (z8 == z7 && j13 < j10)) {
                    z7 = z8;
                    j10 = j13;
                    i8 = i9;
                    j9 = j12;
                }
                if (j12 < j8) {
                    z6 = z8;
                    i7 = i9;
                    j8 = j12;
                }
            }
            i9++;
        }
        return (j8 == Long.MAX_VALUE || !z6 || j9 < j8 + 10485760) ? i8 : i7;
    }

    /* renamed from: y */
    public final void m17803y(InterfaceC0884s interfaceC0884s) {
        this.f14554e.m21935P(8);
        interfaceC0884s.mo3521t(this.f14554e.m21946e(), 0, 8);
        AbstractC4227b.m17682f(this.f14554e);
        interfaceC0884s.mo3519q(this.f14554e.m21947f());
        interfaceC0884s.mo3518p();
    }

    /* renamed from: z */
    public final void m17804z(long j7) {
        while (!this.f14556g.isEmpty() && ((AbstractC4226a.a) this.f14556g.peek()).f14444b == j7) {
            AbstractC4226a.a aVar = (AbstractC4226a.a) this.f14556g.pop();
            if (aVar.f14443a == 1836019574) {
                m17792C(aVar);
                this.f14556g.clear();
                this.f14560k = 2;
            } else if (!this.f14556g.isEmpty()) {
                ((AbstractC4226a.a) this.f14556g.peek()).m17667d(aVar);
            }
        }
        if (this.f14560k != 2) {
            m17799q();
        }
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }

    /* renamed from: v */
    public static /* synthetic */ C4244s m17788v(C4244s c4244s) {
        return c4244s;
    }
}
