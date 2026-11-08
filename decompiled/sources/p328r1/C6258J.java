package p328r1;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p232g0.C4295A;
import p249i1.C4531v;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5322E;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.J */
/* loaded from: classes.dex */
public final class C6258J implements InterfaceC0883r {

    /* renamed from: v */
    public static final InterfaceC0889x f22428v = new InterfaceC0889x() { // from class: r1.I
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m26164y;
            m26164y = C6258J.m26164y();
            return m26164y;
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

    /* renamed from: a */
    public final int f22429a;

    /* renamed from: b */
    public final int f22430b;

    /* renamed from: c */
    public final int f22431c;

    /* renamed from: d */
    public final List f22432d;

    /* renamed from: e */
    public final C5357z f22433e;

    /* renamed from: f */
    public final SparseIntArray f22434f;

    /* renamed from: g */
    public final InterfaceC6259K.c f22435g;

    /* renamed from: h */
    public final InterfaceC4529t.a f22436h;

    /* renamed from: i */
    public final SparseArray f22437i;

    /* renamed from: j */
    public final SparseBooleanArray f22438j;

    /* renamed from: k */
    public final SparseBooleanArray f22439k;

    /* renamed from: l */
    public final C6256H f22440l;

    /* renamed from: m */
    public C6255G f22441m;

    /* renamed from: n */
    public InterfaceC0885t f22442n;

    /* renamed from: o */
    public int f22443o;

    /* renamed from: p */
    public boolean f22444p;

    /* renamed from: q */
    public boolean f22445q;

    /* renamed from: r */
    public boolean f22446r;

    /* renamed from: s */
    public InterfaceC6259K f22447s;

    /* renamed from: t */
    public int f22448t;

    /* renamed from: u */
    public int f22449u;

    public C6258J(int i7, InterfaceC4529t.a aVar) {
        this(1, i7, aVar, new C5322E(0L), new C6271j(0), 112800);
    }

    /* renamed from: m */
    public static /* synthetic */ int m26154m(C6258J c6258j) {
        int i7 = c6258j.f22443o;
        c6258j.f22443o = i7 + 1;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ InterfaceC0883r[] m26164y() {
        return new InterfaceC0883r[]{new C6258J(1, InterfaceC4529t.a.f16172a)};
    }

    /* renamed from: z */
    private void m26165z(long j7) {
        if (this.f22445q) {
            return;
        }
        this.f22445q = true;
        if (this.f22440l.m26140b() == -9223372036854775807L) {
            this.f22442n.mo466j(new InterfaceC0855M.b(this.f22440l.m26140b()));
            return;
        }
        C6255G c6255g = new C6255G(this.f22440l.m26141c(), this.f22440l.m26140b(), j7, this.f22449u, this.f22431c);
        this.f22441m = c6255g;
        this.f22442n.mo466j(c6255g.m3608b());
    }

    /* renamed from: A */
    public final void m26166A() {
        this.f22438j.clear();
        this.f22437i.clear();
        SparseArray mo26173b = this.f22435g.mo26173b();
        int size = mo26173b.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f22437i.put(mo26173b.keyAt(i7), (InterfaceC6259K) mo26173b.valueAt(i7));
        }
        this.f22437i.put(0, new C6253E(new a()));
        this.f22447s = null;
    }

    /* renamed from: B */
    public final boolean m26167B(int i7) {
        return this.f22429a == 2 || this.f22444p || !this.f22439k.get(i7, false);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        C6255G c6255g;
        AbstractC5332a.m21802g(this.f22429a != 2);
        int size = this.f22432d.size();
        for (int i7 = 0; i7 < size; i7++) {
            C5322E c5322e = (C5322E) this.f22432d.get(i7);
            boolean z6 = c5322e.m21655f() == -9223372036854775807L;
            if (!z6) {
                long m21653d = c5322e.m21653d();
                z6 = (m21653d == -9223372036854775807L || m21653d == 0 || m21653d == j8) ? false : true;
            }
            if (z6) {
                c5322e.m21657i(j8);
            }
        }
        if (j8 != 0 && (c6255g = this.f22441m) != null) {
            c6255g.m3614h(j8);
        }
        this.f22433e.m21935P(0);
        this.f22434f.clear();
        for (int i8 = 0; i8 < this.f22437i.size(); i8++) {
            ((InterfaceC6259K) this.f22437i.valueAt(i8)).mo26134b();
        }
        this.f22448t = 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        if ((this.f22430b & 1) == 0) {
            interfaceC0885t = new C4531v(interfaceC0885t, this.f22436h);
        }
        this.f22442n = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        long mo3511a = interfaceC0884s.mo3511a();
        boolean z6 = this.f22429a == 2;
        if (this.f22444p) {
            if (mo3511a != -1 && !z6 && !this.f22440l.m26142d()) {
                return this.f22440l.m26143e(interfaceC0884s, c0854l, this.f22449u);
            }
            m26165z(mo3511a);
            if (this.f22446r) {
                this.f22446r = false;
                mo695a(0L, 0L);
                if (interfaceC0884s.mo3522u() != 0) {
                    c0854l.f2935a = 0L;
                    return 1;
                }
            }
            C6255G c6255g = this.f22441m;
            if (c6255g != null && c6255g.m3610d()) {
                return this.f22441m.m3609c(interfaceC0884s, c0854l);
            }
        }
        if (!m26168w(interfaceC0884s)) {
            for (int i7 = 0; i7 < this.f22437i.size(); i7++) {
                InterfaceC6259K interfaceC6259K = (InterfaceC6259K) this.f22437i.valueAt(i7);
                if (interfaceC6259K instanceof C6286y) {
                    C6286y c6286y = (C6286y) interfaceC6259K;
                    if (c6286y.m26320d(z6)) {
                        c6286y.mo26133a(new C5357z(), 1);
                    }
                }
            }
            return -1;
        }
        int m26169x = m26169x();
        int m21948g = this.f22433e.m21948g();
        if (m26169x > m21948g) {
            return 0;
        }
        int m21957p = this.f22433e.m21957p();
        if ((8388608 & m21957p) != 0) {
            this.f22433e.m21939T(m26169x);
            return 0;
        }
        int i8 = (4194304 & m21957p) != 0 ? 1 : 0;
        int i9 = (2096896 & m21957p) >> 8;
        boolean z7 = (m21957p & 32) != 0;
        InterfaceC6259K interfaceC6259K2 = (m21957p & 16) != 0 ? (InterfaceC6259K) this.f22437i.get(i9) : null;
        if (interfaceC6259K2 == null) {
            this.f22433e.m21939T(m26169x);
            return 0;
        }
        if (this.f22429a != 2) {
            int i10 = m21957p & 15;
            int i11 = this.f22434f.get(i9, i10 - 1);
            this.f22434f.put(i9, i10);
            if (i11 == i10) {
                this.f22433e.m21939T(m26169x);
                return 0;
            }
            if (i10 != ((i11 + 1) & 15)) {
                interfaceC6259K2.mo26134b();
            }
        }
        if (z7) {
            int m21926G = this.f22433e.m21926G();
            i8 |= (this.f22433e.m21926G() & 64) != 0 ? 2 : 0;
            this.f22433e.m21940U(m21926G - 1);
        }
        boolean z8 = this.f22444p;
        if (m26167B(i9)) {
            this.f22433e.m21938S(m26169x);
            interfaceC6259K2.mo26133a(this.f22433e, i8);
            this.f22433e.m21938S(m21948g);
        }
        if (this.f22429a != 2 && !z8 && this.f22444p && mo3511a != -1) {
            this.f22446r = true;
        }
        this.f22433e.m21939T(m26169x);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo700i(p078L0.InterfaceC0884s r7) {
        /*
            r6 = this;
            j0.z r0 = r6.f22433e
            byte[] r0 = r0.m21946e()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.mo3521t(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.mo3519q(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p328r1.C6258J.mo700i(L0.s):boolean");
    }

    /* renamed from: w */
    public final boolean m26168w(InterfaceC0884s interfaceC0884s) {
        byte[] m21946e = this.f22433e.m21946e();
        if (9400 - this.f22433e.m21947f() < 188) {
            int m21942a = this.f22433e.m21942a();
            if (m21942a > 0) {
                System.arraycopy(m21946e, this.f22433e.m21947f(), m21946e, 0, m21942a);
            }
            this.f22433e.m21937R(m21946e, m21942a);
        }
        while (this.f22433e.m21942a() < 188) {
            int m21948g = this.f22433e.m21948g();
            int read = interfaceC0884s.read(m21946e, m21948g, 9400 - m21948g);
            if (read == -1) {
                return false;
            }
            this.f22433e.m21938S(m21948g + read);
        }
        return true;
    }

    /* renamed from: x */
    public final int m26169x() {
        int m21947f = this.f22433e.m21947f();
        int m21948g = this.f22433e.m21948g();
        int m26178a = AbstractC6260L.m26178a(this.f22433e.m21946e(), m21947f, m21948g);
        this.f22433e.m21939T(m26178a);
        int i7 = m26178a + 188;
        if (i7 > m21948g) {
            int i8 = this.f22448t + (m26178a - m21947f);
            this.f22448t = i8;
            if (this.f22429a == 2 && i8 > 376) {
                throw C4295A.m17943a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f22448t = 0;
        }
        return i7;
    }

    public C6258J(int i7, int i8, InterfaceC4529t.a aVar, C5322E c5322e, InterfaceC6259K.c cVar, int i9) {
        this.f22435g = (InterfaceC6259K.c) AbstractC5332a.m21800e(cVar);
        this.f22431c = i9;
        this.f22429a = i7;
        this.f22430b = i8;
        this.f22436h = aVar;
        if (i7 == 1 || i7 == 2) {
            this.f22432d = Collections.singletonList(c5322e);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f22432d = arrayList;
            arrayList.add(c5322e);
        }
        this.f22433e = new C5357z(new byte[9400], 0);
        this.f22438j = new SparseBooleanArray();
        this.f22439k = new SparseBooleanArray();
        this.f22437i = new SparseArray();
        this.f22434f = new SparseIntArray();
        this.f22440l = new C6256H(i9);
        this.f22442n = InterfaceC0885t.f3104h;
        this.f22449u = -1;
        m26166A();
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }

    /* renamed from: r1.J$a */
    public class a implements InterfaceC6252D {

        /* renamed from: a */
        public final C5356y f22450a = new C5356y(new byte[4]);

        public a() {
        }

        @Override // p328r1.InterfaceC6252D
        /* renamed from: a */
        public void mo26131a(C5357z c5357z) {
            if (c5357z.m21926G() == 0 && (c5357z.m21926G() & 128) != 0) {
                c5357z.m21940U(6);
                int m21942a = c5357z.m21942a() / 4;
                for (int i7 = 0; i7 < m21942a; i7++) {
                    c5357z.m21952k(this.f22450a, 4);
                    int m21908h = this.f22450a.m21908h(16);
                    this.f22450a.m21918r(3);
                    if (m21908h == 0) {
                        this.f22450a.m21918r(13);
                    } else {
                        int m21908h2 = this.f22450a.m21908h(13);
                        if (C6258J.this.f22437i.get(m21908h2) == null) {
                            C6258J.this.f22437i.put(m21908h2, new C6253E(C6258J.this.new b(m21908h2)));
                            C6258J.m26154m(C6258J.this);
                        }
                    }
                }
                if (C6258J.this.f22429a != 2) {
                    C6258J.this.f22437i.remove(0);
                }
            }
        }

        @Override // p328r1.InterfaceC6252D
        /* renamed from: c */
        public void mo26132c(C5322E c5322e, InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        }
    }

    /* renamed from: r1.J$b */
    public class b implements InterfaceC6252D {

        /* renamed from: a */
        public final C5356y f22452a = new C5356y(new byte[5]);

        /* renamed from: b */
        public final SparseArray f22453b = new SparseArray();

        /* renamed from: c */
        public final SparseIntArray f22454c = new SparseIntArray();

        /* renamed from: d */
        public final int f22455d;

        public b(int i7) {
            this.f22455d = i7;
        }

        @Override // p328r1.InterfaceC6252D
        /* renamed from: a */
        public void mo26131a(C5357z c5357z) {
            C5322E c5322e;
            if (c5357z.m21926G() != 2) {
                return;
            }
            if (C6258J.this.f22429a == 1 || C6258J.this.f22429a == 2 || C6258J.this.f22443o == 1) {
                c5322e = (C5322E) C6258J.this.f22432d.get(0);
            } else {
                c5322e = new C5322E(((C5322E) C6258J.this.f22432d.get(0)).m21653d());
                C6258J.this.f22432d.add(c5322e);
            }
            if ((c5357z.m21926G() & 128) == 0) {
                return;
            }
            c5357z.m21940U(1);
            int m21932M = c5357z.m21932M();
            int i7 = 3;
            c5357z.m21940U(3);
            c5357z.m21952k(this.f22452a, 2);
            this.f22452a.m21918r(3);
            int i8 = 13;
            C6258J.this.f22449u = this.f22452a.m21908h(13);
            c5357z.m21952k(this.f22452a, 2);
            int i9 = 4;
            this.f22452a.m21918r(4);
            c5357z.m21940U(this.f22452a.m21908h(12));
            if (C6258J.this.f22429a == 2 && C6258J.this.f22447s == null) {
                InterfaceC6259K.b bVar = new InterfaceC6259K.b(21, null, 0, null, AbstractC5330M.f18805f);
                C6258J c6258j = C6258J.this;
                c6258j.f22447s = c6258j.f22435g.mo26172a(21, bVar);
                if (C6258J.this.f22447s != null) {
                    C6258J.this.f22447s.mo26135c(c5322e, C6258J.this.f22442n, new InterfaceC6259K.d(m21932M, 21, 8192));
                }
            }
            this.f22453b.clear();
            this.f22454c.clear();
            int m21942a = c5357z.m21942a();
            while (m21942a > 0) {
                c5357z.m21952k(this.f22452a, 5);
                int m21908h = this.f22452a.m21908h(8);
                this.f22452a.m21918r(i7);
                int m21908h2 = this.f22452a.m21908h(i8);
                this.f22452a.m21918r(i9);
                int m21908h3 = this.f22452a.m21908h(12);
                InterfaceC6259K.b m26170b = m26170b(c5357z, m21908h3);
                if (m21908h == 6 || m21908h == 5) {
                    m21908h = m26170b.f22460a;
                }
                m21942a -= m21908h3 + 5;
                int i10 = C6258J.this.f22429a == 2 ? m21908h : m21908h2;
                if (!C6258J.this.f22438j.get(i10)) {
                    InterfaceC6259K mo26172a = (C6258J.this.f22429a == 2 && m21908h == 21) ? C6258J.this.f22447s : C6258J.this.f22435g.mo26172a(m21908h, m26170b);
                    if (C6258J.this.f22429a != 2 || m21908h2 < this.f22454c.get(i10, 8192)) {
                        this.f22454c.put(i10, m21908h2);
                        this.f22453b.put(i10, mo26172a);
                    }
                }
                i7 = 3;
                i9 = 4;
                i8 = 13;
            }
            int size = this.f22454c.size();
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = this.f22454c.keyAt(i11);
                int valueAt = this.f22454c.valueAt(i11);
                C6258J.this.f22438j.put(keyAt, true);
                C6258J.this.f22439k.put(valueAt, true);
                InterfaceC6259K interfaceC6259K = (InterfaceC6259K) this.f22453b.valueAt(i11);
                if (interfaceC6259K != null) {
                    if (interfaceC6259K != C6258J.this.f22447s) {
                        interfaceC6259K.mo26135c(c5322e, C6258J.this.f22442n, new InterfaceC6259K.d(m21932M, keyAt, 8192));
                    }
                    C6258J.this.f22437i.put(valueAt, interfaceC6259K);
                }
            }
            if (C6258J.this.f22429a == 2) {
                if (C6258J.this.f22444p) {
                    return;
                }
                C6258J.this.f22442n.mo472q();
                C6258J.this.f22443o = 0;
                C6258J.this.f22444p = true;
                return;
            }
            C6258J.this.f22437i.remove(this.f22455d);
            C6258J c6258j2 = C6258J.this;
            c6258j2.f22443o = c6258j2.f22429a == 1 ? 0 : C6258J.this.f22443o - 1;
            if (C6258J.this.f22443o == 0) {
                C6258J.this.f22442n.mo472q();
                C6258J.this.f22444p = true;
            }
        }

        /* renamed from: b */
        public final InterfaceC6259K.b m26170b(C5357z c5357z, int i7) {
            int i8;
            int m21947f = c5357z.m21947f();
            int i9 = m21947f + i7;
            int i10 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i11 = 0;
            while (c5357z.m21947f() < i9) {
                int m21926G = c5357z.m21926G();
                int m21947f2 = c5357z.m21947f() + c5357z.m21926G();
                if (m21947f2 > i9) {
                    break;
                }
                if (m21926G == 5) {
                    long m21928I = c5357z.m21928I();
                    if (m21928I != 1094921523) {
                        if (m21928I != 1161904947) {
                            if (m21928I != 1094921524) {
                                if (m21928I == 1212503619) {
                                    i10 = 36;
                                }
                            }
                            i10 = 172;
                        }
                        i10 = 135;
                    }
                    i10 = 129;
                } else {
                    if (m21926G != 106) {
                        if (m21926G != 122) {
                            if (m21926G == 127) {
                                int m21926G2 = c5357z.m21926G();
                                if (m21926G2 != 21) {
                                    if (m21926G2 == 14) {
                                        i10 = 136;
                                    } else if (m21926G2 == 33) {
                                        i10 = 139;
                                    }
                                }
                                i10 = 172;
                            } else {
                                if (m21926G == 123) {
                                    i8 = 138;
                                } else if (m21926G == 10) {
                                    String trim = c5357z.m21923D(3).trim();
                                    i11 = c5357z.m21926G();
                                    str = trim;
                                } else if (m21926G == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (c5357z.m21947f() < m21947f2) {
                                        String trim2 = c5357z.m21923D(3).trim();
                                        int m21926G3 = c5357z.m21926G();
                                        byte[] bArr = new byte[4];
                                        c5357z.m21953l(bArr, 0, 4);
                                        arrayList2.add(new InterfaceC6259K.a(trim2, m21926G3, bArr));
                                    }
                                    arrayList = arrayList2;
                                    i10 = 89;
                                } else if (m21926G == 111) {
                                    i8 = 257;
                                }
                                i10 = i8;
                            }
                        }
                        i10 = 135;
                    }
                    i10 = 129;
                }
                c5357z.m21940U(m21947f2 - c5357z.m21947f());
            }
            c5357z.m21939T(i9);
            return new InterfaceC6259K.b(i10, str, i11, arrayList, Arrays.copyOfRange(c5357z.m21946e(), m21947f, i9));
        }

        @Override // p328r1.InterfaceC6252D
        /* renamed from: c */
        public void mo26132c(C5322E c5322e, InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        }
    }
}
