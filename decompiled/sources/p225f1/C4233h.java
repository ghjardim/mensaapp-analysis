package p225f1;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.C3643a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;
import p078L0.AbstractC0868c;
import p078L0.AbstractC0872g;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0847E;
import p078L0.C0854L;
import p078L0.C0873h;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0859Q;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p155W0.C2653a;
import p155W0.C2655c;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC3033v;
import p225f1.AbstractC4226a;
import p232g0.C4295A;
import p232g0.C4323m;
import p232g0.C4327q;
import p249i1.C4531v;
import p249i1.InterfaceC4529t;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5322E;
import p259j0.C5357z;
import p268k0.AbstractC5400d;

/* renamed from: f1.h */
/* loaded from: classes.dex */
public class C4233h implements InterfaceC0883r {

    /* renamed from: K */
    public static final InterfaceC0889x f14491K = new InterfaceC0889x() { // from class: f1.f
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m17737p;
            m17737p = C4233h.m17737p();
            return m17737p;
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

    /* renamed from: L */
    public static final byte[] f14492L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: M */
    public static final C4327q f14493M = new C4327q.b().m18264o0("application/x-emsg").m18234K();

    /* renamed from: A */
    public long f14494A;

    /* renamed from: B */
    public b f14495B;

    /* renamed from: C */
    public int f14496C;

    /* renamed from: D */
    public int f14497D;

    /* renamed from: E */
    public int f14498E;

    /* renamed from: F */
    public boolean f14499F;

    /* renamed from: G */
    public InterfaceC0885t f14500G;

    /* renamed from: H */
    public InterfaceC0861T[] f14501H;

    /* renamed from: I */
    public InterfaceC0861T[] f14502I;

    /* renamed from: J */
    public boolean f14503J;

    /* renamed from: a */
    public final InterfaceC4529t.a f14504a;

    /* renamed from: b */
    public final int f14505b;

    /* renamed from: c */
    public final C4244s f14506c;

    /* renamed from: d */
    public final List f14507d;

    /* renamed from: e */
    public final SparseArray f14508e;

    /* renamed from: f */
    public final C5357z f14509f;

    /* renamed from: g */
    public final C5357z f14510g;

    /* renamed from: h */
    public final C5357z f14511h;

    /* renamed from: i */
    public final byte[] f14512i;

    /* renamed from: j */
    public final C5357z f14513j;

    /* renamed from: k */
    public final C5322E f14514k;

    /* renamed from: l */
    public final C2655c f14515l;

    /* renamed from: m */
    public final C5357z f14516m;

    /* renamed from: n */
    public final ArrayDeque f14517n;

    /* renamed from: o */
    public final ArrayDeque f14518o;

    /* renamed from: p */
    public final InterfaceC0861T f14519p;

    /* renamed from: q */
    public AbstractC3033v f14520q;

    /* renamed from: r */
    public int f14521r;

    /* renamed from: s */
    public int f14522s;

    /* renamed from: t */
    public long f14523t;

    /* renamed from: u */
    public int f14524u;

    /* renamed from: v */
    public C5357z f14525v;

    /* renamed from: w */
    public long f14526w;

    /* renamed from: x */
    public int f14527x;

    /* renamed from: y */
    public long f14528y;

    /* renamed from: z */
    public long f14529z;

    /* renamed from: f1.h$a */
    public static final class a {

        /* renamed from: a */
        public final long f14530a;

        /* renamed from: b */
        public final boolean f14531b;

        /* renamed from: c */
        public final int f14532c;

        public a(long j7, boolean z6, int i7) {
            this.f14530a = j7;
            this.f14531b = z6;
            this.f14532c = i7;
        }
    }

    /* renamed from: f1.h$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0861T f14533a;

        /* renamed from: d */
        public C4247v f14536d;

        /* renamed from: e */
        public C4229d f14537e;

        /* renamed from: f */
        public int f14538f;

        /* renamed from: g */
        public int f14539g;

        /* renamed from: h */
        public int f14540h;

        /* renamed from: i */
        public int f14541i;

        /* renamed from: l */
        public boolean f14544l;

        /* renamed from: b */
        public final C4246u f14534b = new C4246u();

        /* renamed from: c */
        public final C5357z f14535c = new C5357z();

        /* renamed from: j */
        public final C5357z f14542j = new C5357z(1);

        /* renamed from: k */
        public final C5357z f14543k = new C5357z();

        public b(InterfaceC0861T interfaceC0861T, C4247v c4247v, C4229d c4229d) {
            this.f14533a = interfaceC0861T;
            this.f14536d = c4247v;
            this.f14537e = c4229d;
            m17763j(c4247v, c4229d);
        }

        /* renamed from: c */
        public int m17756c() {
            int i7 = !this.f14544l ? this.f14536d.f14635g[this.f14538f] : this.f14534b.f14621k[this.f14538f] ? 1 : 0;
            return m17760g() != null ? i7 | 1073741824 : i7;
        }

        /* renamed from: d */
        public long m17757d() {
            return !this.f14544l ? this.f14536d.f14631c[this.f14538f] : this.f14534b.f14617g[this.f14540h];
        }

        /* renamed from: e */
        public long m17758e() {
            return !this.f14544l ? this.f14536d.f14634f[this.f14538f] : this.f14534b.m17829c(this.f14538f);
        }

        /* renamed from: f */
        public int m17759f() {
            return !this.f14544l ? this.f14536d.f14632d[this.f14538f] : this.f14534b.f14619i[this.f14538f];
        }

        /* renamed from: g */
        public C4245t m17760g() {
            if (!this.f14544l) {
                return null;
            }
            int i7 = ((C4229d) AbstractC5330M.m21747i(this.f14534b.f14611a)).f14480a;
            C4245t c4245t = this.f14534b.f14624n;
            if (c4245t == null) {
                c4245t = this.f14536d.f14629a.m17825a(i7);
            }
            if (c4245t == null || !c4245t.f14606a) {
                return null;
            }
            return c4245t;
        }

        /* renamed from: h */
        public boolean m17761h() {
            this.f14538f++;
            if (!this.f14544l) {
                return false;
            }
            int i7 = this.f14539g + 1;
            this.f14539g = i7;
            int[] iArr = this.f14534b.f14618h;
            int i8 = this.f14540h;
            if (i7 != iArr[i8]) {
                return true;
            }
            this.f14540h = i8 + 1;
            this.f14539g = 0;
            return false;
        }

        /* renamed from: i */
        public int m17762i(int i7, int i8) {
            C5357z c5357z;
            C4245t m17760g = m17760g();
            if (m17760g == null) {
                return 0;
            }
            int i9 = m17760g.f14609d;
            if (i9 != 0) {
                c5357z = this.f14534b.f14625o;
            } else {
                byte[] bArr = (byte[]) AbstractC5330M.m21747i(m17760g.f14610e);
                this.f14543k.m21937R(bArr, bArr.length);
                C5357z c5357z2 = this.f14543k;
                i9 = bArr.length;
                c5357z = c5357z2;
            }
            boolean m17833g = this.f14534b.m17833g(this.f14538f);
            boolean z6 = m17833g || i8 != 0;
            this.f14542j.m21946e()[0] = (byte) ((z6 ? 128 : 0) | i9);
            this.f14542j.m21939T(0);
            this.f14533a.mo560b(this.f14542j, 1, 1);
            this.f14533a.mo560b(c5357z, i9, 1);
            if (!z6) {
                return i9 + 1;
            }
            if (!m17833g) {
                this.f14535c.m21935P(8);
                byte[] m21946e = this.f14535c.m21946e();
                m21946e[0] = 0;
                m21946e[1] = 1;
                m21946e[2] = (byte) ((i8 >> 8) & 255);
                m21946e[3] = (byte) (i8 & 255);
                m21946e[4] = (byte) ((i7 >> 24) & 255);
                m21946e[5] = (byte) ((i7 >> 16) & 255);
                m21946e[6] = (byte) ((i7 >> 8) & 255);
                m21946e[7] = (byte) (i7 & 255);
                this.f14533a.mo560b(this.f14535c, 8, 1);
                return i9 + 9;
            }
            C5357z c5357z3 = this.f14534b.f14625o;
            int m21932M = c5357z3.m21932M();
            c5357z3.m21940U(-2);
            int i10 = (m21932M * 6) + 2;
            if (i8 != 0) {
                this.f14535c.m21935P(i10);
                byte[] m21946e2 = this.f14535c.m21946e();
                c5357z3.m21953l(m21946e2, 0, i10);
                int i11 = (((m21946e2[2] & ForkServer.ERROR) << 8) | (m21946e2[3] & ForkServer.ERROR)) + i8;
                m21946e2[2] = (byte) ((i11 >> 8) & 255);
                m21946e2[3] = (byte) (i11 & 255);
                c5357z3 = this.f14535c;
            }
            this.f14533a.mo560b(c5357z3, i10, 1);
            return i9 + 1 + i10;
        }

        /* renamed from: j */
        public void m17763j(C4247v c4247v, C4229d c4229d) {
            this.f14536d = c4247v;
            this.f14537e = c4229d;
            this.f14533a.mo566e(c4247v.f14629a.f14600f);
            m17764k();
        }

        /* renamed from: k */
        public void m17764k() {
            this.f14534b.m17832f();
            this.f14538f = 0;
            this.f14540h = 0;
            this.f14539g = 0;
            this.f14541i = 0;
            this.f14544l = false;
        }

        /* renamed from: l */
        public void m17765l(long j7) {
            int i7 = this.f14538f;
            while (true) {
                C4246u c4246u = this.f14534b;
                if (i7 >= c4246u.f14616f || c4246u.m17829c(i7) > j7) {
                    return;
                }
                if (this.f14534b.f14621k[i7]) {
                    this.f14541i = i7;
                }
                i7++;
            }
        }

        /* renamed from: m */
        public void m17766m() {
            C4245t m17760g = m17760g();
            if (m17760g == null) {
                return;
            }
            C5357z c5357z = this.f14534b.f14625o;
            int i7 = m17760g.f14609d;
            if (i7 != 0) {
                c5357z.m21940U(i7);
            }
            if (this.f14534b.m17833g(this.f14538f)) {
                c5357z.m21940U(c5357z.m21932M() * 6);
            }
        }

        /* renamed from: n */
        public void m17767n(C4323m c4323m) {
            C4245t m17825a = this.f14536d.f14629a.m17825a(((C4229d) AbstractC5330M.m21747i(this.f14534b.f14611a)).f14480a);
            this.f14533a.mo566e(this.f14536d.f14629a.f14600f.m18193a().m18244U(c4323m.m18168c(m17825a != null ? m17825a.f14607b : null)).m18234K());
        }
    }

    public C4233h(InterfaceC4529t.a aVar, int i7) {
        this(aVar, i7, null, null, AbstractC3033v.m11050t(), null);
    }

    /* renamed from: A */
    public static void m17715A(C4245t c4245t, C5357z c5357z, C4246u c4246u) {
        int i7;
        int i8 = c4245t.f14609d;
        c5357z.m21939T(8);
        if ((AbstractC4226a.m17665b(c5357z.m21957p()) & 1) == 1) {
            c5357z.m21940U(8);
        }
        int m21926G = c5357z.m21926G();
        int m21930K = c5357z.m21930K();
        if (m21930K > c4246u.f14616f) {
            throw C4295A.m17943a("Saiz sample count " + m21930K + " is greater than fragment sample count" + c4246u.f14616f, null);
        }
        if (m21926G == 0) {
            boolean[] zArr = c4246u.f14623m;
            i7 = 0;
            for (int i9 = 0; i9 < m21930K; i9++) {
                int m21926G2 = c5357z.m21926G();
                i7 += m21926G2;
                zArr[i9] = m21926G2 > i8;
            }
        } else {
            i7 = m21926G * m21930K;
            Arrays.fill(c4246u.f14623m, 0, m21930K, m21926G > i8);
        }
        Arrays.fill(c4246u.f14623m, m21930K, c4246u.f14616f, false);
        if (i7 > 0) {
            c4246u.m17830d(i7);
        }
    }

    /* renamed from: B */
    public static void m17716B(AbstractC4226a.a aVar, String str, C4246u c4246u) {
        byte[] bArr = null;
        C5357z c5357z = null;
        C5357z c5357z2 = null;
        for (int i7 = 0; i7 < aVar.f14445c.size(); i7++) {
            AbstractC4226a.b bVar = (AbstractC4226a.b) aVar.f14445c.get(i7);
            C5357z c5357z3 = bVar.f14447b;
            int i8 = bVar.f14443a;
            if (i8 == 1935828848) {
                c5357z3.m21939T(12);
                if (c5357z3.m21957p() == 1936025959) {
                    c5357z = c5357z3;
                }
            } else if (i8 == 1936158820) {
                c5357z3.m21939T(12);
                if (c5357z3.m21957p() == 1936025959) {
                    c5357z2 = c5357z3;
                }
            }
        }
        if (c5357z == null || c5357z2 == null) {
            return;
        }
        c5357z.m21939T(8);
        int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
        c5357z.m21940U(4);
        if (m17666c == 1) {
            c5357z.m21940U(4);
        }
        if (c5357z.m21957p() != 1) {
            throw C4295A.m17947e("Entry count in sbgp != 1 (unsupported).");
        }
        c5357z2.m21939T(8);
        int m17666c2 = AbstractC4226a.m17666c(c5357z2.m21957p());
        c5357z2.m21940U(4);
        if (m17666c2 == 1) {
            if (c5357z2.m21928I() == 0) {
                throw C4295A.m17947e("Variable length description in sgpd found (unsupported)");
            }
        } else if (m17666c2 >= 2) {
            c5357z2.m21940U(4);
        }
        if (c5357z2.m21928I() != 1) {
            throw C4295A.m17947e("Entry count in sgpd != 1 (unsupported).");
        }
        c5357z2.m21940U(1);
        int m21926G = c5357z2.m21926G();
        int i9 = (m21926G & 240) >> 4;
        int i10 = m21926G & 15;
        boolean z6 = c5357z2.m21926G() == 1;
        if (z6) {
            int m21926G2 = c5357z2.m21926G();
            byte[] bArr2 = new byte[16];
            c5357z2.m21953l(bArr2, 0, 16);
            if (m21926G2 == 0) {
                int m21926G3 = c5357z2.m21926G();
                bArr = new byte[m21926G3];
                c5357z2.m21953l(bArr, 0, m21926G3);
            }
            c4246u.f14622l = true;
            c4246u.f14624n = new C4245t(z6, str, m21926G2, bArr2, i9, i10, bArr);
        }
    }

    /* renamed from: C */
    public static void m17717C(C5357z c5357z, int i7, C4246u c4246u) {
        c5357z.m21939T(i7 + 8);
        int m17665b = AbstractC4226a.m17665b(c5357z.m21957p());
        if ((m17665b & 1) != 0) {
            throw C4295A.m17947e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (m17665b & 2) != 0;
        int m21930K = c5357z.m21930K();
        if (m21930K == 0) {
            Arrays.fill(c4246u.f14623m, 0, c4246u.f14616f, false);
            return;
        }
        if (m21930K == c4246u.f14616f) {
            Arrays.fill(c4246u.f14623m, 0, m21930K, z6);
            c4246u.m17830d(c5357z.m21942a());
            c4246u.m17828b(c5357z);
        } else {
            throw C4295A.m17943a("Senc sample count " + m21930K + " is different from fragment sample count" + c4246u.f14616f, null);
        }
    }

    /* renamed from: D */
    public static void m17718D(C5357z c5357z, C4246u c4246u) {
        m17717C(c5357z, 0, c4246u);
    }

    /* renamed from: E */
    public static Pair m17719E(C5357z c5357z, long j7) {
        long m21931L;
        long m21931L2;
        c5357z.m21939T(8);
        int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
        c5357z.m21940U(4);
        long m21928I = c5357z.m21928I();
        if (m17666c == 0) {
            m21931L = c5357z.m21928I();
            m21931L2 = c5357z.m21928I();
        } else {
            m21931L = c5357z.m21931L();
            m21931L2 = c5357z.m21931L();
        }
        long j8 = m21931L;
        long j9 = j7 + m21931L2;
        long m21718X0 = AbstractC5330M.m21718X0(j8, 1000000L, m21928I);
        c5357z.m21940U(2);
        int m21932M = c5357z.m21932M();
        int[] iArr = new int[m21932M];
        long[] jArr = new long[m21932M];
        long[] jArr2 = new long[m21932M];
        long[] jArr3 = new long[m21932M];
        long j10 = m21718X0;
        int i7 = 0;
        long j11 = j8;
        while (i7 < m21932M) {
            int m21957p = c5357z.m21957p();
            if ((m21957p & Integer.MIN_VALUE) != 0) {
                throw C4295A.m17943a("Unhandled indirect reference", null);
            }
            long m21928I2 = c5357z.m21928I();
            iArr[i7] = m21957p & C3643a.e.API_PRIORITY_OTHER;
            jArr[i7] = j9;
            jArr3[i7] = j10;
            long j12 = j11 + m21928I2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i8 = m21932M;
            long m21718X02 = AbstractC5330M.m21718X0(j12, 1000000L, m21928I);
            jArr4[i7] = m21718X02 - jArr5[i7];
            c5357z.m21940U(4);
            j9 += r1[i7];
            i7++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            m21932M = i8;
            j11 = j12;
            j10 = m21718X02;
        }
        return Pair.create(Long.valueOf(m21718X0), new C0873h(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: F */
    public static long m17720F(C5357z c5357z) {
        c5357z.m21939T(8);
        return AbstractC4226a.m17666c(c5357z.m21957p()) == 1 ? c5357z.m21931L() : c5357z.m21928I();
    }

    /* renamed from: G */
    public static b m17721G(C5357z c5357z, SparseArray sparseArray, boolean z6) {
        c5357z.m21939T(8);
        int m17665b = AbstractC4226a.m17665b(c5357z.m21957p());
        b bVar = (b) (z6 ? sparseArray.valueAt(0) : sparseArray.get(c5357z.m21957p()));
        if (bVar == null) {
            return null;
        }
        if ((m17665b & 1) != 0) {
            long m21931L = c5357z.m21931L();
            C4246u c4246u = bVar.f14534b;
            c4246u.f14613c = m21931L;
            c4246u.f14614d = m21931L;
        }
        C4229d c4229d = bVar.f14537e;
        bVar.f14534b.f14611a = new C4229d((m17665b & 2) != 0 ? c5357z.m21957p() - 1 : c4229d.f14480a, (m17665b & 8) != 0 ? c5357z.m21957p() : c4229d.f14481b, (m17665b & 16) != 0 ? c5357z.m21957p() : c4229d.f14482c, (m17665b & 32) != 0 ? c5357z.m21957p() : c4229d.f14483d);
        return bVar;
    }

    /* renamed from: H */
    public static void m17722H(AbstractC4226a.a aVar, SparseArray sparseArray, boolean z6, int i7, byte[] bArr) {
        b m17721G = m17721G(((AbstractC4226a.b) AbstractC5332a.m21800e(aVar.m17670g(1952868452))).f14447b, sparseArray, z6);
        if (m17721G == null) {
            return;
        }
        C4246u c4246u = m17721G.f14534b;
        long j7 = c4246u.f14627q;
        boolean z7 = c4246u.f14628r;
        m17721G.m17764k();
        m17721G.f14544l = true;
        AbstractC4226a.b m17670g = aVar.m17670g(1952867444);
        if (m17670g == null || (i7 & 2) != 0) {
            c4246u.f14627q = j7;
            c4246u.f14628r = z7;
        } else {
            c4246u.f14627q = m17720F(m17670g.f14447b);
            c4246u.f14628r = true;
        }
        m17725K(aVar, m17721G, i7);
        C4245t m17825a = m17721G.f14536d.f14629a.m17825a(((C4229d) AbstractC5332a.m21800e(c4246u.f14611a)).f14480a);
        AbstractC4226a.b m17670g2 = aVar.m17670g(1935763834);
        if (m17670g2 != null) {
            m17715A((C4245t) AbstractC5332a.m21800e(m17825a), m17670g2.f14447b, c4246u);
        }
        AbstractC4226a.b m17670g3 = aVar.m17670g(1935763823);
        if (m17670g3 != null) {
            m17740z(m17670g3.f14447b, c4246u);
        }
        AbstractC4226a.b m17670g4 = aVar.m17670g(1936027235);
        if (m17670g4 != null) {
            m17718D(m17670g4.f14447b, c4246u);
        }
        m17716B(aVar, m17825a != null ? m17825a.f14607b : null, c4246u);
        int size = aVar.f14445c.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC4226a.b bVar = (AbstractC4226a.b) aVar.f14445c.get(i8);
            if (bVar.f14443a == 1970628964) {
                m17726L(bVar.f14447b, c4246u, bArr);
            }
        }
    }

    /* renamed from: I */
    public static Pair m17723I(C5357z c5357z) {
        c5357z.m21939T(12);
        return Pair.create(Integer.valueOf(c5357z.m21957p()), new C4229d(c5357z.m21957p() - 1, c5357z.m21957p(), c5357z.m21957p(), c5357z.m21957p()));
    }

    /* renamed from: J */
    public static int m17724J(b bVar, int i7, int i8, C5357z c5357z, int i9) {
        boolean z6;
        int i10;
        boolean z7;
        int i11;
        boolean z8;
        boolean z9;
        boolean z10;
        int i12;
        b bVar2 = bVar;
        c5357z.m21939T(8);
        int m17665b = AbstractC4226a.m17665b(c5357z.m21957p());
        C4244s c4244s = bVar2.f14536d.f14629a;
        C4246u c4246u = bVar2.f14534b;
        C4229d c4229d = (C4229d) AbstractC5330M.m21747i(c4246u.f14611a);
        c4246u.f14618h[i7] = c5357z.m21930K();
        long[] jArr = c4246u.f14617g;
        long j7 = c4246u.f14613c;
        jArr[i7] = j7;
        if ((m17665b & 1) != 0) {
            jArr[i7] = j7 + c5357z.m21957p();
        }
        boolean z11 = (m17665b & 4) != 0;
        int i13 = c4229d.f14483d;
        if (z11) {
            i13 = c5357z.m21957p();
        }
        boolean z12 = (m17665b & 256) != 0;
        boolean z13 = (m17665b & 512) != 0;
        boolean z14 = (m17665b & 1024) != 0;
        boolean z15 = (m17665b & 2048) != 0;
        long j8 = m17736o(c4244s) ? ((long[]) AbstractC5330M.m21747i(c4244s.f14603i))[0] : 0L;
        int[] iArr = c4246u.f14619i;
        long[] jArr2 = c4246u.f14620j;
        boolean[] zArr = c4246u.f14621k;
        int i14 = i13;
        boolean z16 = c4244s.f14596b == 2 && (i8 & 1) != 0;
        int i15 = i9 + c4246u.f14618h[i7];
        boolean z17 = z16;
        long j9 = c4244s.f14597c;
        long j10 = c4246u.f14627q;
        int i16 = i9;
        while (i16 < i15) {
            int m17732e = m17732e(z12 ? c5357z.m21957p() : c4229d.f14481b);
            if (z13) {
                i10 = c5357z.m21957p();
                z6 = z12;
            } else {
                z6 = z12;
                i10 = c4229d.f14482c;
            }
            int m17732e2 = m17732e(i10);
            if (z14) {
                z7 = z11;
                i11 = c5357z.m21957p();
            } else if (i16 == 0 && z11) {
                z7 = z11;
                i11 = i14;
            } else {
                z7 = z11;
                i11 = c4229d.f14483d;
            }
            if (z15) {
                z8 = z15;
                z9 = z13;
                z10 = z14;
                i12 = c5357z.m21957p();
            } else {
                z8 = z15;
                z9 = z13;
                z10 = z14;
                i12 = 0;
            }
            long m21718X0 = AbstractC5330M.m21718X0((i12 + j10) - j8, 1000000L, j9);
            jArr2[i16] = m21718X0;
            if (!c4246u.f14628r) {
                jArr2[i16] = m21718X0 + bVar2.f14536d.f14636h;
            }
            iArr[i16] = m17732e2;
            zArr[i16] = ((i11 >> 16) & 1) == 0 && (!z17 || i16 == 0);
            j10 += m17732e;
            i16++;
            bVar2 = bVar;
            z12 = z6;
            z11 = z7;
            z15 = z8;
            z13 = z9;
            z14 = z10;
        }
        c4246u.f14627q = j10;
        return i15;
    }

    /* renamed from: K */
    public static void m17725K(AbstractC4226a.a aVar, b bVar, int i7) {
        List list = aVar.f14445c;
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4226a.b bVar2 = (AbstractC4226a.b) list.get(i10);
            if (bVar2.f14443a == 1953658222) {
                C5357z c5357z = bVar2.f14447b;
                c5357z.m21939T(12);
                int m21930K = c5357z.m21930K();
                if (m21930K > 0) {
                    i9 += m21930K;
                    i8++;
                }
            }
        }
        bVar.f14540h = 0;
        bVar.f14539g = 0;
        bVar.f14538f = 0;
        bVar.f14534b.m17831e(i8, i9);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC4226a.b bVar3 = (AbstractC4226a.b) list.get(i13);
            if (bVar3.f14443a == 1953658222) {
                i12 = m17724J(bVar, i11, i7, bVar3.f14447b, i12);
                i11++;
            }
        }
    }

    /* renamed from: L */
    public static void m17726L(C5357z c5357z, C4246u c4246u, byte[] bArr) {
        c5357z.m21939T(8);
        c5357z.m21953l(bArr, 0, 16);
        if (Arrays.equals(bArr, f14492L)) {
            m17717C(c5357z, 16, c4246u);
        }
    }

    /* renamed from: M */
    private void m17727M(long j7) {
        while (!this.f14517n.isEmpty() && ((AbstractC4226a.a) this.f14517n.peek()).f14444b == j7) {
            m17748r((AbstractC4226a.a) this.f14517n.pop());
        }
        m17733f();
    }

    /* renamed from: N */
    private boolean m17728N(InterfaceC0884s interfaceC0884s) {
        if (this.f14524u == 0) {
            if (!interfaceC0884s.mo3512d(this.f14516m.m21946e(), 0, 8, true)) {
                return false;
            }
            this.f14524u = 8;
            this.f14516m.m21939T(0);
            this.f14523t = this.f14516m.m21928I();
            this.f14522s = this.f14516m.m21957p();
        }
        long j7 = this.f14523t;
        if (j7 == 1) {
            interfaceC0884s.readFully(this.f14516m.m21946e(), 8, 8);
            this.f14524u += 8;
            this.f14523t = this.f14516m.m21931L();
        } else if (j7 == 0) {
            long mo3511a = interfaceC0884s.mo3511a();
            if (mo3511a == -1 && !this.f14517n.isEmpty()) {
                mo3511a = ((AbstractC4226a.a) this.f14517n.peek()).f14444b;
            }
            if (mo3511a != -1) {
                this.f14523t = (mo3511a - interfaceC0884s.mo3522u()) + this.f14524u;
            }
        }
        if (this.f14523t < this.f14524u) {
            throw C4295A.m17947e("Atom size less than header length (unsupported).");
        }
        long mo3522u = interfaceC0884s.mo3522u() - this.f14524u;
        int i7 = this.f14522s;
        if ((i7 == 1836019558 || i7 == 1835295092) && !this.f14503J) {
            this.f14500G.mo466j(new InterfaceC0855M.b(this.f14529z, mo3522u));
            this.f14503J = true;
        }
        if (this.f14522s == 1836019558) {
            int size = this.f14508e.size();
            for (int i8 = 0; i8 < size; i8++) {
                C4246u c4246u = ((b) this.f14508e.valueAt(i8)).f14534b;
                c4246u.f14612b = mo3522u;
                c4246u.f14614d = mo3522u;
                c4246u.f14613c = mo3522u;
            }
        }
        int i9 = this.f14522s;
        if (i9 == 1835295092) {
            this.f14495B = null;
            this.f14526w = mo3522u + this.f14523t;
            this.f14521r = 2;
            return true;
        }
        if (m17729R(i9)) {
            long mo3522u2 = (interfaceC0884s.mo3522u() + this.f14523t) - 8;
            this.f14517n.push(new AbstractC4226a.a(this.f14522s, mo3522u2));
            if (this.f14523t == this.f14524u) {
                m17727M(mo3522u2);
            } else {
                m17733f();
            }
        } else if (m17730S(this.f14522s)) {
            if (this.f14524u != 8) {
                throw C4295A.m17947e("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f14523t > 2147483647L) {
                throw C4295A.m17947e("Leaf atom with length > 2147483647 (unsupported).");
            }
            C5357z c5357z = new C5357z((int) this.f14523t);
            System.arraycopy(this.f14516m.m21946e(), 0, c5357z.m21946e(), 0, 8);
            this.f14525v = c5357z;
            this.f14521r = 1;
        } else {
            if (this.f14523t > 2147483647L) {
                throw C4295A.m17947e("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f14525v = null;
            this.f14521r = 1;
        }
        return true;
    }

    /* renamed from: R */
    private static boolean m17729R(int i7) {
        return i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1836019558 || i7 == 1953653094 || i7 == 1836475768 || i7 == 1701082227;
    }

    /* renamed from: S */
    private static boolean m17730S(int i7) {
        return i7 == 1751411826 || i7 == 1835296868 || i7 == 1836476516 || i7 == 1936286840 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1668576371 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1937011571 || i7 == 1952867444 || i7 == 1952868452 || i7 == 1953196132 || i7 == 1953654136 || i7 == 1953658222 || i7 == 1886614376 || i7 == 1935763834 || i7 == 1935763823 || i7 == 1936027235 || i7 == 1970628964 || i7 == 1935828848 || i7 == 1936158820 || i7 == 1701606260 || i7 == 1835362404 || i7 == 1701671783;
    }

    /* renamed from: e */
    public static int m17732e(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw C4295A.m17943a("Unexpected negative value: " + i7, null);
    }

    /* renamed from: f */
    private void m17733f() {
        this.f14521r = 0;
        this.f14524u = 0;
    }

    /* renamed from: k */
    public static C4323m m17734k(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC4226a.b bVar = (AbstractC4226a.b) list.get(i7);
            if (bVar.f14443a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] m21946e = bVar.f14447b.m21946e();
                UUID m17810f = AbstractC4240o.m17810f(m21946e);
                if (m17810f == null) {
                    AbstractC5346o.m21867h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C4323m.b(m17810f, "video/mp4", m21946e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C4323m(arrayList);
    }

    /* renamed from: l */
    public static b m17735l(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j7 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            b bVar2 = (b) sparseArray.valueAt(i7);
            if ((bVar2.f14544l || bVar2.f14538f != bVar2.f14536d.f14630b) && (!bVar2.f14544l || bVar2.f14540h != bVar2.f14534b.f14615e)) {
                long m17757d = bVar2.m17757d();
                if (m17757d < j7) {
                    bVar = bVar2;
                    j7 = m17757d;
                }
            }
        }
        return bVar;
    }

    /* renamed from: o */
    public static boolean m17736o(C4244s c4244s) {
        long[] jArr;
        long[] jArr2 = c4244s.f14602h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = c4244s.f14603i) == null) {
            return false;
        }
        long j7 = jArr2[0];
        return j7 == 0 || AbstractC5330M.m21718X0(j7 + jArr[0], 1000000L, c4244s.f14598d) >= c4244s.f14599e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ InterfaceC0883r[] m17737p() {
        return new InterfaceC0883r[]{new C4233h(InterfaceC4529t.a.f16172a, 32)};
    }

    /* renamed from: x */
    public static long m17738x(C5357z c5357z) {
        c5357z.m21939T(8);
        return AbstractC4226a.m17666c(c5357z.m21957p()) == 0 ? c5357z.m21928I() : c5357z.m21931L();
    }

    /* renamed from: y */
    public static void m17739y(AbstractC4226a.a aVar, SparseArray sparseArray, boolean z6, int i7, byte[] bArr) {
        int size = aVar.f14446d.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC4226a.a aVar2 = (AbstractC4226a.a) aVar.f14446d.get(i8);
            if (aVar2.f14443a == 1953653094) {
                m17722H(aVar2, sparseArray, z6, i7, bArr);
            }
        }
    }

    /* renamed from: z */
    public static void m17740z(C5357z c5357z, C4246u c4246u) {
        c5357z.m21939T(8);
        int m21957p = c5357z.m21957p();
        if ((AbstractC4226a.m17665b(m21957p) & 1) == 1) {
            c5357z.m21940U(8);
        }
        int m21930K = c5357z.m21930K();
        if (m21930K == 1) {
            c4246u.f14614d += AbstractC4226a.m17666c(m21957p) == 0 ? c5357z.m21928I() : c5357z.m21931L();
        } else {
            throw C4295A.m17943a("Unexpected saio entry count: " + m21930K, null);
        }
    }

    /* renamed from: O */
    public final void m17741O(InterfaceC0884s interfaceC0884s) {
        int i7 = ((int) this.f14523t) - this.f14524u;
        C5357z c5357z = this.f14525v;
        if (c5357z != null) {
            interfaceC0884s.readFully(c5357z.m21946e(), 8, i7);
            m17750t(new AbstractC4226a.b(this.f14522s, c5357z), interfaceC0884s.mo3522u());
        } else {
            interfaceC0884s.mo3519q(i7);
        }
        m17727M(interfaceC0884s.mo3522u());
    }

    /* renamed from: P */
    public final void m17742P(InterfaceC0884s interfaceC0884s) {
        int size = this.f14508e.size();
        long j7 = Long.MAX_VALUE;
        b bVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            C4246u c4246u = ((b) this.f14508e.valueAt(i7)).f14534b;
            if (c4246u.f14626p) {
                long j8 = c4246u.f14614d;
                if (j8 < j7) {
                    bVar = (b) this.f14508e.valueAt(i7);
                    j7 = j8;
                }
            }
        }
        if (bVar == null) {
            this.f14521r = 3;
            return;
        }
        int mo3522u = (int) (j7 - interfaceC0884s.mo3522u());
        if (mo3522u < 0) {
            throw C4295A.m17943a("Offset to encryption data was negative.", null);
        }
        interfaceC0884s.mo3519q(mo3522u);
        bVar.f14534b.m17827a(interfaceC0884s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final boolean m17743Q(InterfaceC0884s interfaceC0884s) {
        int mo558a;
        b bVar = this.f14495B;
        Throwable th = null;
        if (bVar == null) {
            bVar = m17735l(this.f14508e);
            if (bVar == null) {
                int mo3522u = (int) (this.f14526w - interfaceC0884s.mo3522u());
                if (mo3522u < 0) {
                    throw C4295A.m17943a("Offset to end of mdat was negative.", null);
                }
                interfaceC0884s.mo3519q(mo3522u);
                m17733f();
                return false;
            }
            int m17757d = (int) (bVar.m17757d() - interfaceC0884s.mo3522u());
            if (m17757d < 0) {
                AbstractC5346o.m21867h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                m17757d = 0;
            }
            interfaceC0884s.mo3519q(m17757d);
            this.f14495B = bVar;
        }
        int i7 = 4;
        int i8 = 1;
        if (this.f14521r == 3) {
            int m17759f = bVar.m17759f();
            this.f14496C = m17759f;
            if (bVar.f14538f < bVar.f14541i) {
                interfaceC0884s.mo3519q(m17759f);
                bVar.m17766m();
                if (!bVar.m17761h()) {
                    this.f14495B = null;
                }
                this.f14521r = 3;
                return true;
            }
            if (bVar.f14536d.f14629a.f14601g == 1) {
                this.f14496C = m17759f - 8;
                interfaceC0884s.mo3519q(8);
            }
            if ("audio/ac4".equals(bVar.f14536d.f14629a.f14600f.f15138n)) {
                this.f14497D = bVar.m17762i(this.f14496C, 7);
                AbstractC0868c.m3599a(this.f14496C, this.f14513j);
                bVar.f14533a.mo564d(this.f14513j, 7);
                this.f14497D += 7;
            } else {
                this.f14497D = bVar.m17762i(this.f14496C, 0);
            }
            this.f14496C += this.f14497D;
            this.f14521r = 4;
            this.f14498E = 0;
        }
        C4244s c4244s = bVar.f14536d.f14629a;
        InterfaceC0861T interfaceC0861T = bVar.f14533a;
        long m17758e = bVar.m17758e();
        C5322E c5322e = this.f14514k;
        if (c5322e != null) {
            m17758e = c5322e.m21650a(m17758e);
        }
        long j7 = m17758e;
        if (c4244s.f14604j == 0) {
            while (true) {
                int i9 = this.f14497D;
                int i10 = this.f14496C;
                if (i9 >= i10) {
                    break;
                }
                this.f14497D += interfaceC0861T.mo558a(interfaceC0884s, i10 - i9, false);
            }
        } else {
            byte[] m21946e = this.f14510g.m21946e();
            m21946e[0] = 0;
            m21946e[1] = 0;
            m21946e[2] = 0;
            int i11 = c4244s.f14604j;
            int i12 = i11 + 1;
            int i13 = 4 - i11;
            while (this.f14497D < this.f14496C) {
                int i14 = this.f14498E;
                if (i14 == 0) {
                    interfaceC0884s.readFully(m21946e, i13, i12);
                    this.f14510g.m21939T(0);
                    int m21957p = this.f14510g.m21957p();
                    if (m21957p < i8) {
                        throw C4295A.m17943a("Invalid NAL length", th);
                    }
                    this.f14498E = m21957p - 1;
                    this.f14509f.m21939T(0);
                    interfaceC0861T.mo564d(this.f14509f, i7);
                    interfaceC0861T.mo564d(this.f14510g, i8);
                    this.f14499F = (this.f14502I.length <= 0 || !AbstractC5400d.m22322g(c4244s.f14600f.f15138n, m21946e[i7])) ? 0 : i8;
                    this.f14497D += 5;
                    this.f14496C += i13;
                } else {
                    if (this.f14499F) {
                        this.f14511h.m21935P(i14);
                        interfaceC0884s.readFully(this.f14511h.m21946e(), 0, this.f14498E);
                        interfaceC0861T.mo564d(this.f14511h, this.f14498E);
                        mo558a = this.f14498E;
                        int m22333r = AbstractC5400d.m22333r(this.f14511h.m21946e(), this.f14511h.m21948g());
                        this.f14511h.m21939T("video/hevc".equals(c4244s.f14600f.f15138n) ? 1 : 0);
                        this.f14511h.m21938S(m22333r);
                        AbstractC0872g.m3648a(j7, this.f14511h, this.f14502I);
                    } else {
                        mo558a = interfaceC0861T.mo558a(interfaceC0884s, i14, false);
                    }
                    this.f14497D += mo558a;
                    this.f14498E -= mo558a;
                    th = null;
                    i7 = 4;
                    i8 = 1;
                }
            }
        }
        int m17756c = bVar.m17756c();
        C4245t m17760g = bVar.m17760g();
        interfaceC0861T.mo562c(j7, m17756c, this.f14496C, 0, m17760g != null ? m17760g.f14608c : null);
        m17753w(j7);
        if (!bVar.m17761h()) {
            this.f14495B = null;
        }
        this.f14521r = 3;
        return true;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        int size = this.f14508e.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((b) this.f14508e.valueAt(i7)).m17764k();
        }
        this.f14518o.clear();
        this.f14527x = 0;
        this.f14528y = j8;
        this.f14517n.clear();
        m17733f();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f14500G = (this.f14505b & 32) == 0 ? new C4531v(interfaceC0885t, this.f14504a) : interfaceC0885t;
        m17733f();
        m17746n();
        C4244s c4244s = this.f14506c;
        if (c4244s != null) {
            this.f14508e.put(0, new b(interfaceC0885t.mo455b(0, c4244s.f14596b), new C4247v(this.f14506c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C4229d(0, 0, 0, 0)));
            this.f14500G.mo472q();
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        while (true) {
            int i7 = this.f14521r;
            if (i7 != 0) {
                if (i7 == 1) {
                    m17741O(interfaceC0884s);
                } else if (i7 == 2) {
                    m17742P(interfaceC0884s);
                } else if (m17743Q(interfaceC0884s)) {
                    return 0;
                }
            } else if (!m17728N(interfaceC0884s)) {
                return -1;
            }
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        InterfaceC0859Q m17822b = AbstractC4243r.m17822b(interfaceC0884s);
        this.f14520q = m17822b != null ? AbstractC3033v.m11051u(m17822b) : AbstractC3033v.m11050t();
        return m17822b == null;
    }

    /* renamed from: j */
    public final C4229d m17744j(SparseArray sparseArray, int i7) {
        return sparseArray.size() == 1 ? (C4229d) sparseArray.valueAt(0) : (C4229d) AbstractC5332a.m21800e((C4229d) sparseArray.get(i7));
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC3033v mo698g() {
        return this.f14520q;
    }

    /* renamed from: n */
    public final void m17746n() {
        int i7;
        InterfaceC0861T[] interfaceC0861TArr = new InterfaceC0861T[2];
        this.f14501H = interfaceC0861TArr;
        InterfaceC0861T interfaceC0861T = this.f14519p;
        int i8 = 0;
        if (interfaceC0861T != null) {
            interfaceC0861TArr[0] = interfaceC0861T;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i9 = 100;
        if ((this.f14505b & 4) != 0) {
            interfaceC0861TArr[i7] = this.f14500G.mo455b(100, 5);
            i9 = 101;
            i7++;
        }
        InterfaceC0861T[] interfaceC0861TArr2 = (InterfaceC0861T[]) AbstractC5330M.m21702P0(this.f14501H, i7);
        this.f14501H = interfaceC0861TArr2;
        for (InterfaceC0861T interfaceC0861T2 : interfaceC0861TArr2) {
            interfaceC0861T2.mo566e(f14493M);
        }
        this.f14502I = new InterfaceC0861T[this.f14507d.size()];
        while (i8 < this.f14502I.length) {
            InterfaceC0861T mo455b = this.f14500G.mo455b(i9, 3);
            mo455b.mo566e((C4327q) this.f14507d.get(i8));
            this.f14502I[i8] = mo455b;
            i8++;
            i9++;
        }
    }

    /* renamed from: r */
    public final void m17748r(AbstractC4226a.a aVar) {
        int i7 = aVar.f14443a;
        if (i7 == 1836019574) {
            m17752v(aVar);
        } else if (i7 == 1836019558) {
            m17751u(aVar);
        } else {
            if (this.f14517n.isEmpty()) {
                return;
            }
            ((AbstractC4226a.a) this.f14517n.peek()).m17667d(aVar);
        }
    }

    /* renamed from: s */
    public final void m17749s(C5357z c5357z) {
        long m21718X0;
        String str;
        long m21718X02;
        String str2;
        long m21928I;
        long j7;
        if (this.f14501H.length == 0) {
            return;
        }
        c5357z.m21939T(8);
        int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
        if (m17666c == 0) {
            String str3 = (String) AbstractC5332a.m21800e(c5357z.m21920A());
            String str4 = (String) AbstractC5332a.m21800e(c5357z.m21920A());
            long m21928I2 = c5357z.m21928I();
            m21718X0 = AbstractC5330M.m21718X0(c5357z.m21928I(), 1000000L, m21928I2);
            long j8 = this.f14494A;
            long j9 = j8 != -9223372036854775807L ? j8 + m21718X0 : -9223372036854775807L;
            str = str3;
            m21718X02 = AbstractC5330M.m21718X0(c5357z.m21928I(), 1000L, m21928I2);
            str2 = str4;
            m21928I = c5357z.m21928I();
            j7 = j9;
        } else {
            if (m17666c != 1) {
                AbstractC5346o.m21867h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + m17666c);
                return;
            }
            long m21928I3 = c5357z.m21928I();
            j7 = AbstractC5330M.m21718X0(c5357z.m21931L(), 1000000L, m21928I3);
            long m21718X03 = AbstractC5330M.m21718X0(c5357z.m21928I(), 1000L, m21928I3);
            long m21928I4 = c5357z.m21928I();
            str = (String) AbstractC5332a.m21800e(c5357z.m21920A());
            m21718X02 = m21718X03;
            m21928I = m21928I4;
            str2 = (String) AbstractC5332a.m21800e(c5357z.m21920A());
            m21718X0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[c5357z.m21942a()];
        c5357z.m21953l(bArr, 0, c5357z.m21942a());
        C5357z c5357z2 = new C5357z(this.f14515l.m9110a(new C2653a(str, str2, m21718X02, m21928I, bArr)));
        int m21942a = c5357z2.m21942a();
        for (InterfaceC0861T interfaceC0861T : this.f14501H) {
            c5357z2.m21939T(0);
            interfaceC0861T.mo564d(c5357z2, m21942a);
        }
        if (j7 == -9223372036854775807L) {
            this.f14518o.addLast(new a(m21718X0, true, m21942a));
            this.f14527x += m21942a;
            return;
        }
        if (!this.f14518o.isEmpty()) {
            this.f14518o.addLast(new a(j7, false, m21942a));
            this.f14527x += m21942a;
            return;
        }
        C5322E c5322e = this.f14514k;
        if (c5322e != null && !c5322e.m21656g()) {
            this.f14518o.addLast(new a(j7, false, m21942a));
            this.f14527x += m21942a;
            return;
        }
        C5322E c5322e2 = this.f14514k;
        if (c5322e2 != null) {
            j7 = c5322e2.m21650a(j7);
        }
        for (InterfaceC0861T interfaceC0861T2 : this.f14501H) {
            interfaceC0861T2.mo562c(j7, 1, m21942a, 0, null);
        }
    }

    /* renamed from: t */
    public final void m17750t(AbstractC4226a.b bVar, long j7) {
        if (!this.f14517n.isEmpty()) {
            ((AbstractC4226a.a) this.f14517n.peek()).m17668e(bVar);
            return;
        }
        int i7 = bVar.f14443a;
        if (i7 != 1936286840) {
            if (i7 == 1701671783) {
                m17749s(bVar.f14447b);
            }
        } else {
            Pair m17719E = m17719E(bVar.f14447b, j7);
            this.f14494A = ((Long) m17719E.first).longValue();
            this.f14500G.mo466j((InterfaceC0855M) m17719E.second);
            this.f14503J = true;
        }
    }

    /* renamed from: u */
    public final void m17751u(AbstractC4226a.a aVar) {
        m17739y(aVar, this.f14508e, this.f14506c != null, this.f14505b, this.f14512i);
        C4323m m17734k = m17734k(aVar.f14445c);
        if (m17734k != null) {
            int size = this.f14508e.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((b) this.f14508e.valueAt(i7)).m17767n(m17734k);
            }
        }
        if (this.f14528y != -9223372036854775807L) {
            int size2 = this.f14508e.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((b) this.f14508e.valueAt(i8)).m17765l(this.f14528y);
            }
            this.f14528y = -9223372036854775807L;
        }
    }

    /* renamed from: v */
    public final void m17752v(AbstractC4226a.a aVar) {
        int i7 = 0;
        AbstractC5332a.m21803h(this.f14506c == null, "Unexpected moov box.");
        C4323m m17734k = m17734k(aVar.f14445c);
        AbstractC4226a.a aVar2 = (AbstractC4226a.a) AbstractC5332a.m21800e(aVar.m17669f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f14445c.size();
        long j7 = -9223372036854775807L;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC4226a.b bVar = (AbstractC4226a.b) aVar2.f14445c.get(i8);
            int i9 = bVar.f14443a;
            if (i9 == 1953654136) {
                Pair m17723I = m17723I(bVar.f14447b);
                sparseArray.put(((Integer) m17723I.first).intValue(), (C4229d) m17723I.second);
            } else if (i9 == 1835362404) {
                j7 = m17738x(bVar.f14447b);
            }
        }
        List m17672B = AbstractC4227b.m17672B(aVar, new C0847E(), j7, m17734k, (this.f14505b & 16) != 0, false, new InterfaceC2924g() { // from class: f1.g
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                return C4233h.this.m17747q((C4244s) obj);
            }
        });
        int size2 = m17672B.size();
        if (this.f14508e.size() != 0) {
            AbstractC5332a.m21802g(this.f14508e.size() == size2);
            while (i7 < size2) {
                C4247v c4247v = (C4247v) m17672B.get(i7);
                C4244s c4244s = c4247v.f14629a;
                ((b) this.f14508e.get(c4244s.f14595a)).m17763j(c4247v, m17744j(sparseArray, c4244s.f14595a));
                i7++;
            }
            return;
        }
        while (i7 < size2) {
            C4247v c4247v2 = (C4247v) m17672B.get(i7);
            C4244s c4244s2 = c4247v2.f14629a;
            this.f14508e.put(c4244s2.f14595a, new b(this.f14500G.mo455b(i7, c4244s2.f14596b), c4247v2, m17744j(sparseArray, c4244s2.f14595a)));
            this.f14529z = Math.max(this.f14529z, c4244s2.f14599e);
            i7++;
        }
        this.f14500G.mo472q();
    }

    /* renamed from: w */
    public final void m17753w(long j7) {
        while (!this.f14518o.isEmpty()) {
            a aVar = (a) this.f14518o.removeFirst();
            this.f14527x -= aVar.f14532c;
            long j8 = aVar.f14530a;
            if (aVar.f14531b) {
                j8 += j7;
            }
            C5322E c5322e = this.f14514k;
            if (c5322e != null) {
                j8 = c5322e.m21650a(j8);
            }
            for (InterfaceC0861T interfaceC0861T : this.f14501H) {
                interfaceC0861T.mo562c(j8, 1, aVar.f14532c, this.f14527x, null);
            }
        }
    }

    public C4233h(InterfaceC4529t.a aVar, int i7, C5322E c5322e, C4244s c4244s, List list, InterfaceC0861T interfaceC0861T) {
        this.f14504a = aVar;
        this.f14505b = i7;
        this.f14514k = c5322e;
        this.f14506c = c4244s;
        this.f14507d = DesugarCollections.unmodifiableList(list);
        this.f14519p = interfaceC0861T;
        this.f14515l = new C2655c();
        this.f14516m = new C5357z(16);
        this.f14509f = new C5357z(AbstractC5400d.f19246a);
        this.f14510g = new C5357z(5);
        this.f14511h = new C5357z();
        byte[] bArr = new byte[16];
        this.f14512i = bArr;
        this.f14513j = new C5357z(bArr);
        this.f14517n = new ArrayDeque();
        this.f14518o = new ArrayDeque();
        this.f14508e = new SparseArray();
        this.f14520q = AbstractC3033v.m11050t();
        this.f14529z = -9223372036854775807L;
        this.f14528y = -9223372036854775807L;
        this.f14494A = -9223372036854775807L;
        this.f14500G = InterfaceC0885t.f3104h;
        this.f14501H = new InterfaceC0861T[0];
        this.f14502I = new InterfaceC0861T[0];
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }

    /* renamed from: q */
    public C4244s m17747q(C4244s c4244s) {
        return c4244s;
    }
}
