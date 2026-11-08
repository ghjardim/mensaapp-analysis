package p387z0;

import android.os.SystemClock;
import java.util.List;
import p001A0.C0002a;
import p001A0.InterfaceC0012k;
import p078L0.AbstractC0882q;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: z0.d */
/* loaded from: classes.dex */
public final class C7103d implements InterfaceC0883r {

    /* renamed from: a */
    public final InterfaceC0012k f25234a;

    /* renamed from: d */
    public final int f25237d;

    /* renamed from: g */
    public InterfaceC0885t f25240g;

    /* renamed from: h */
    public boolean f25241h;

    /* renamed from: k */
    public boolean f25244k;

    /* renamed from: b */
    public final C5357z f25235b = new C5357z(65507);

    /* renamed from: c */
    public final C5357z f25236c = new C5357z();

    /* renamed from: e */
    public final Object f25238e = new Object();

    /* renamed from: f */
    public final C7106g f25239f = new C7106g();

    /* renamed from: i */
    public volatile long f25242i = -9223372036854775807L;

    /* renamed from: j */
    public volatile int f25243j = -1;

    /* renamed from: l */
    public long f25245l = -9223372036854775807L;

    /* renamed from: m */
    public long f25246m = -9223372036854775807L;

    public C7103d(C7107h c7107h, int i7) {
        this.f25237d = i7;
        this.f25234a = (InterfaceC0012k) AbstractC5332a.m21800e(new C0002a().m27a(c7107h));
    }

    /* renamed from: c */
    public static long m29294c(long j7) {
        return j7 - 30;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        synchronized (this.f25238e) {
            try {
                if (!this.f25244k) {
                    this.f25244k = true;
                }
                this.f25245l = j7;
                this.f25246m = j8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f25234a.mo30b(interfaceC0885t, this.f25237d);
        interfaceC0885t.mo472q();
        interfaceC0885t.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
        this.f25240g = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public boolean m29295e() {
        return this.f25241h;
    }

    /* renamed from: f */
    public void m29296f() {
        synchronized (this.f25238e) {
            this.f25244k = true;
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        AbstractC5332a.m21800e(this.f25240g);
        int read = interfaceC0884s.read(this.f25235b.m21946e(), 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f25235b.m21939T(0);
        this.f25235b.m21938S(read);
        C7104e m29302d = C7104e.m29302d(this.f25235b);
        if (m29302d == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long m29294c = m29294c(elapsedRealtime);
        this.f25239f.m29324e(m29302d, elapsedRealtime);
        C7104e m29325f = this.f25239f.m29325f(m29294c);
        if (m29325f == null) {
            return 0;
        }
        if (!this.f25241h) {
            if (this.f25242i == -9223372036854775807L) {
                this.f25242i = m29325f.f25255h;
            }
            if (this.f25243j == -1) {
                this.f25243j = m29325f.f25254g;
            }
            this.f25234a.mo32d(this.f25242i, this.f25243j);
            this.f25241h = true;
        }
        synchronized (this.f25238e) {
            try {
                if (!this.f25244k) {
                    do {
                        this.f25236c.m21936Q(m29325f.f25258k);
                        this.f25234a.mo31c(this.f25236c, m29325f.f25255h, m29325f.f25254g, m29325f.f25252e);
                        m29325f = this.f25239f.m29325f(m29294c);
                    } while (m29325f != null);
                } else if (this.f25245l != -9223372036854775807L && this.f25246m != -9223372036854775807L) {
                    this.f25239f.m29326g();
                    this.f25234a.mo29a(this.f25245l, this.f25246m);
                    this.f25244k = false;
                    this.f25245l = -9223372036854775807L;
                    this.f25246m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* renamed from: j */
    public void m29297j(int i7) {
        this.f25243j = i7;
    }

    /* renamed from: k */
    public void m29298k(long j7) {
        this.f25242i = j7;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
