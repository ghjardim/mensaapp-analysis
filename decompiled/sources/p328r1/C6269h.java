package p328r1;

import android.net.Uri;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.C0874i;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p232g0.C4295A;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.h */
/* loaded from: classes.dex */
public final class C6269h implements InterfaceC0883r {

    /* renamed from: m */
    public static final InterfaceC0889x f22507m = new InterfaceC0889x() { // from class: r1.g
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m26202k;
            m26202k = C6269h.m26202k();
            return m26202k;
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
    public final int f22508a;

    /* renamed from: b */
    public final C6270i f22509b;

    /* renamed from: c */
    public final C5357z f22510c;

    /* renamed from: d */
    public final C5357z f22511d;

    /* renamed from: e */
    public final C5356y f22512e;

    /* renamed from: f */
    public InterfaceC0885t f22513f;

    /* renamed from: g */
    public long f22514g;

    /* renamed from: h */
    public long f22515h;

    /* renamed from: i */
    public int f22516i;

    /* renamed from: j */
    public boolean f22517j;

    /* renamed from: k */
    public boolean f22518k;

    /* renamed from: l */
    public boolean f22519l;

    public C6269h() {
        this(0);
    }

    /* renamed from: f */
    private static int m26200f(int i7, long j7) {
        return (int) ((i7 * 8000000) / j7);
    }

    /* renamed from: j */
    private InterfaceC0855M m26201j(long j7, boolean z6) {
        return new C0874i(j7, this.f22515h, m26200f(this.f22516i, this.f22509b.m26212k()), this.f22516i, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ InterfaceC0883r[] m26202k() {
        return new InterfaceC0883r[]{new C6269h()};
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f22518k = false;
        this.f22509b.mo26187b();
        this.f22514g = j8;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f22513f = interfaceC0885t;
        this.f22509b.mo26188c(interfaceC0885t, new InterfaceC6259K.d(0, 1));
        interfaceC0885t.mo472q();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final void m26203e(InterfaceC0884s interfaceC0884s) {
        if (this.f22517j) {
            return;
        }
        this.f22516i = -1;
        interfaceC0884s.mo3518p();
        long j7 = 0;
        if (interfaceC0884s.mo3522u() == 0) {
            m26205m(interfaceC0884s);
        }
        int i7 = 0;
        int i8 = 0;
        while (interfaceC0884s.mo3513h(this.f22511d.m21946e(), 0, 2, true)) {
            try {
                this.f22511d.m21939T(0);
                if (!C6270i.m26207m(this.f22511d.m21932M())) {
                    break;
                }
                if (!interfaceC0884s.mo3513h(this.f22511d.m21946e(), 0, 4, true)) {
                    break;
                }
                this.f22512e.m21916p(14);
                int m21908h = this.f22512e.m21908h(13);
                if (m21908h <= 6) {
                    this.f22517j = true;
                    throw C4295A.m17943a("Malformed ADTS stream", null);
                }
                j7 += m21908h;
                i8++;
                if (i8 != 1000 && interfaceC0884s.mo3520r(m21908h - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i7 = i8;
        interfaceC0884s.mo3518p();
        if (i7 > 0) {
            this.f22516i = (int) (j7 / i7);
        } else {
            this.f22516i = -1;
        }
        this.f22517j = true;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        AbstractC5332a.m21804i(this.f22513f);
        long mo3511a = interfaceC0884s.mo3511a();
        int i7 = this.f22508a;
        if ((i7 & 2) != 0 || ((i7 & 1) != 0 && mo3511a != -1)) {
            m26203e(interfaceC0884s);
        }
        int read = interfaceC0884s.read(this.f22510c.m21946e(), 0, 2048);
        boolean z6 = read == -1;
        m26204l(mo3511a, z6);
        if (z6) {
            return -1;
        }
        this.f22510c.m21939T(0);
        this.f22510c.m21938S(read);
        if (!this.f22518k) {
            this.f22509b.mo26190e(this.f22514g, 4);
            this.f22518k = true;
        }
        this.f22509b.mo26186a(this.f22510c);
        return 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        int m26205m = m26205m(interfaceC0884s);
        int i7 = m26205m;
        int i8 = 0;
        int i9 = 0;
        do {
            interfaceC0884s.mo3521t(this.f22511d.m21946e(), 0, 2);
            this.f22511d.m21939T(0);
            if (C6270i.m26207m(this.f22511d.m21932M())) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                interfaceC0884s.mo3521t(this.f22511d.m21946e(), 0, 4);
                this.f22512e.m21916p(14);
                int m21908h = this.f22512e.m21908h(13);
                if (m21908h <= 6) {
                    i7++;
                    interfaceC0884s.mo3518p();
                    interfaceC0884s.mo3515k(i7);
                } else {
                    interfaceC0884s.mo3515k(m21908h - 6);
                    i9 += m21908h;
                }
            } else {
                i7++;
                interfaceC0884s.mo3518p();
                interfaceC0884s.mo3515k(i7);
            }
            i8 = 0;
            i9 = 0;
        } while (i7 - m26205m < 8192);
        return false;
    }

    /* renamed from: l */
    public final void m26204l(long j7, boolean z6) {
        if (this.f22519l) {
            return;
        }
        boolean z7 = (this.f22508a & 1) != 0 && this.f22516i > 0;
        if (z7 && this.f22509b.m26212k() == -9223372036854775807L && !z6) {
            return;
        }
        if (!z7 || this.f22509b.m26212k() == -9223372036854775807L) {
            this.f22513f.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
        } else {
            this.f22513f.mo466j(m26201j(j7, (this.f22508a & 2) != 0));
        }
        this.f22519l = true;
    }

    /* renamed from: m */
    public final int m26205m(InterfaceC0884s interfaceC0884s) {
        int i7 = 0;
        while (true) {
            interfaceC0884s.mo3521t(this.f22511d.m21946e(), 0, 10);
            this.f22511d.m21939T(0);
            if (this.f22511d.m21929J() != 4801587) {
                break;
            }
            this.f22511d.m21940U(3);
            int m21925F = this.f22511d.m21925F();
            i7 += m21925F + 10;
            interfaceC0884s.mo3515k(m21925F);
        }
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3515k(i7);
        if (this.f22515h == -1) {
            this.f22515h = i7;
        }
        return i7;
    }

    public C6269h(int i7) {
        this.f22508a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f22509b = new C6270i(true);
        this.f22510c = new C5357z(2048);
        this.f22516i = -1;
        this.f22515h = -1L;
        C5357z c5357z = new C5357z(10);
        this.f22511d = c5357z;
        this.f22512e = new C5356y(c5357z.m21946e());
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
