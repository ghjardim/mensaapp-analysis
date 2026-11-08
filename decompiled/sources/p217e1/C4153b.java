package p217e1;

import java.math.RoundingMode;
import org.apache.tika.pipes.PipesConfigBase;
import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;
import p259j0.C5347p;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C4153b implements InterfaceC4158g {

    /* renamed from: a */
    public final long f13919a;

    /* renamed from: b */
    public final C5347p f13920b;

    /* renamed from: c */
    public final C5347p f13921c;

    /* renamed from: d */
    public final int f13922d;

    /* renamed from: e */
    public long f13923e;

    public C4153b(long j7, long j8, long j9) {
        this.f13923e = j7;
        this.f13919a = j9;
        C5347p c5347p = new C5347p();
        this.f13920b = c5347p;
        C5347p c5347p2 = new C5347p();
        this.f13921c = c5347p2;
        c5347p.m21873a(0L);
        c5347p2.m21873a(j8);
        int i7 = -2147483647;
        if (j7 == -9223372036854775807L) {
            this.f13922d = -2147483647;
            return;
        }
        long m21725a1 = AbstractC5330M.m21725a1(j8 - j9, 8L, j7, RoundingMode.HALF_UP);
        if (m21725a1 > 0 && m21725a1 <= 2147483647L) {
            i7 = (int) m21725a1;
        }
        this.f13922d = i7;
    }

    /* renamed from: a */
    public boolean m17458a(long j7) {
        C5347p c5347p = this.f13920b;
        return j7 - c5347p.m21874b(c5347p.m21875c() - 1) < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;
    }

    /* renamed from: b */
    public void m17459b(long j7, long j8) {
        if (m17458a(j7)) {
            return;
        }
        this.f13920b.m21873a(j7);
        this.f13921c.m21873a(j8);
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: c */
    public long mo17455c(long j7) {
        return this.f13920b.m21874b(AbstractC5330M.m21735e(this.f13921c, j7, true, true));
    }

    /* renamed from: d */
    public void m17460d(long j7) {
        this.f13923e = j7;
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: e */
    public long mo17456e() {
        return this.f13919a;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        int m21735e = AbstractC5330M.m21735e(this.f13920b, j7, true, true);
        C0856N c0856n = new C0856N(this.f13920b.m21874b(m21735e), this.f13921c.m21874b(m21735e));
        if (c0856n.f2941a == j7 || m21735e == this.f13920b.m21875c() - 1) {
            return new InterfaceC0855M.a(c0856n);
        }
        int i7 = m21735e + 1;
        return new InterfaceC0855M.a(c0856n, new C0856N(this.f13920b.m21874b(i7), this.f13921c.m21874b(i7)));
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: k */
    public int mo17457k() {
        return this.f13922d;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f13923e;
    }
}
