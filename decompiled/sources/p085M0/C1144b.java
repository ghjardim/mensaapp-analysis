package p085M0;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.C0874i;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p232g0.C4295A;
import p232g0.C4327q;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: M0.b */
/* loaded from: classes.dex */
public final class C1144b implements InterfaceC0883r {

    /* renamed from: r */
    public static final int[] f3696r;

    /* renamed from: u */
    public static final int f3699u;

    /* renamed from: a */
    public final byte[] f3700a;

    /* renamed from: b */
    public final int f3701b;

    /* renamed from: c */
    public boolean f3702c;

    /* renamed from: d */
    public long f3703d;

    /* renamed from: e */
    public int f3704e;

    /* renamed from: f */
    public int f3705f;

    /* renamed from: g */
    public boolean f3706g;

    /* renamed from: h */
    public long f3707h;

    /* renamed from: i */
    public int f3708i;

    /* renamed from: j */
    public int f3709j;

    /* renamed from: k */
    public long f3710k;

    /* renamed from: l */
    public InterfaceC0885t f3711l;

    /* renamed from: m */
    public InterfaceC0861T f3712m;

    /* renamed from: n */
    public InterfaceC0855M f3713n;

    /* renamed from: o */
    public boolean f3714o;

    /* renamed from: p */
    public static final InterfaceC0889x f3694p = new InterfaceC0889x() { // from class: M0.a
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m4417o;
            m4417o = C1144b.m4417o();
            return m4417o;
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

    /* renamed from: q */
    public static final int[] f3695q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    public static final byte[] f3697s = AbstractC5330M.m21773s0("#!AMR\n");

    /* renamed from: t */
    public static final byte[] f3698t = AbstractC5330M.m21773s0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f3696r = iArr;
        f3699u = iArr[8];
    }

    public C1144b() {
        this(0);
    }

    /* renamed from: f */
    public static int m4416f(int i7, long j7) {
        return (int) ((i7 * 8000000) / j7);
    }

    /* renamed from: o */
    public static /* synthetic */ InterfaceC0883r[] m4417o() {
        return new InterfaceC0883r[]{new C1144b()};
    }

    /* renamed from: r */
    public static boolean m4418r(InterfaceC0884s interfaceC0884s, byte[] bArr) {
        interfaceC0884s.mo3518p();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0884s.mo3521t(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f3703d = 0L;
        this.f3704e = 0;
        this.f3705f = 0;
        if (j7 != 0) {
            InterfaceC0855M interfaceC0855M = this.f3713n;
            if (interfaceC0855M instanceof C0874i) {
                this.f3710k = ((C0874i) interfaceC0855M).m3654b(j7);
                return;
            }
        }
        this.f3710k = 0L;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f3711l = interfaceC0885t;
        this.f3712m = interfaceC0885t.mo455b(0, 1);
        interfaceC0885t.mo472q();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final void m4419e() {
        AbstractC5332a.m21804i(this.f3712m);
        AbstractC5330M.m21747i(this.f3711l);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        m4419e();
        if (interfaceC0884s.mo3522u() == 0 && !m4428t(interfaceC0884s)) {
            throw C4295A.m17943a("Could not find AMR header.", null);
        }
        m4425p();
        int m4429u = m4429u(interfaceC0884s);
        m4426q(interfaceC0884s.mo3511a(), m4429u);
        return m4429u;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        return m4428t(interfaceC0884s);
    }

    /* renamed from: j */
    public final InterfaceC0855M m4420j(long j7, boolean z6) {
        return new C0874i(j7, this.f3707h, m4416f(this.f3708i, 20000L), this.f3708i, z6);
    }

    /* renamed from: k */
    public final int m4421k(int i7) {
        if (m4423m(i7)) {
            return this.f3702c ? f3696r[i7] : f3695q[i7];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f3702c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i7);
        throw C4295A.m17943a(sb.toString(), null);
    }

    /* renamed from: l */
    public final boolean m4422l(int i7) {
        return !this.f3702c && (i7 < 12 || i7 > 14);
    }

    /* renamed from: m */
    public final boolean m4423m(int i7) {
        return i7 >= 0 && i7 <= 15 && (m4424n(i7) || m4422l(i7));
    }

    /* renamed from: n */
    public final boolean m4424n(int i7) {
        return this.f3702c && (i7 < 10 || i7 > 13);
    }

    /* renamed from: p */
    public final void m4425p() {
        if (this.f3714o) {
            return;
        }
        this.f3714o = true;
        boolean z6 = this.f3702c;
        this.f3712m.mo566e(new C4327q.b().m18264o0(z6 ? "audio/amr-wb" : "audio/3gpp").m18255f0(f3699u).m18237N(1).m18265p0(z6 ? 16000 : 8000).m18234K());
    }

    /* renamed from: q */
    public final void m4426q(long j7, int i7) {
        int i8;
        if (this.f3706g) {
            return;
        }
        int i9 = this.f3701b;
        if ((i9 & 1) == 0 || j7 == -1 || !((i8 = this.f3708i) == -1 || i8 == this.f3704e)) {
            InterfaceC0855M.b bVar = new InterfaceC0855M.b(-9223372036854775807L);
            this.f3713n = bVar;
            this.f3711l.mo466j(bVar);
            this.f3706g = true;
            return;
        }
        if (this.f3709j >= 20 || i7 == -1) {
            InterfaceC0855M m4420j = m4420j(j7, (i9 & 2) != 0);
            this.f3713n = m4420j;
            this.f3711l.mo466j(m4420j);
            this.f3706g = true;
        }
    }

    /* renamed from: s */
    public final int m4427s(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3521t(this.f3700a, 0, 1);
        byte b7 = this.f3700a[0];
        if ((b7 & 131) <= 0) {
            return m4421k((b7 >> 3) & 15);
        }
        throw C4295A.m17943a("Invalid padding bits for frame header " + ((int) b7), null);
    }

    /* renamed from: t */
    public final boolean m4428t(InterfaceC0884s interfaceC0884s) {
        byte[] bArr = f3697s;
        if (m4418r(interfaceC0884s, bArr)) {
            this.f3702c = false;
            interfaceC0884s.mo3519q(bArr.length);
            return true;
        }
        byte[] bArr2 = f3698t;
        if (!m4418r(interfaceC0884s, bArr2)) {
            return false;
        }
        this.f3702c = true;
        interfaceC0884s.mo3519q(bArr2.length);
        return true;
    }

    /* renamed from: u */
    public final int m4429u(InterfaceC0884s interfaceC0884s) {
        if (this.f3705f == 0) {
            try {
                int m4427s = m4427s(interfaceC0884s);
                this.f3704e = m4427s;
                this.f3705f = m4427s;
                if (this.f3708i == -1) {
                    this.f3707h = interfaceC0884s.mo3522u();
                    this.f3708i = this.f3704e;
                }
                if (this.f3708i == this.f3704e) {
                    this.f3709j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int mo558a = this.f3712m.mo558a(interfaceC0884s, this.f3705f, true);
        if (mo558a == -1) {
            return -1;
        }
        int i7 = this.f3705f - mo558a;
        this.f3705f = i7;
        if (i7 > 0) {
            return 0;
        }
        this.f3712m.mo562c(this.f3710k + this.f3703d, 1, this.f3704e, 0, null);
        this.f3703d += 20000;
        return 0;
    }

    public C1144b(int i7) {
        this.f3701b = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f3700a = new byte[1];
        this.f3708i = -1;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
