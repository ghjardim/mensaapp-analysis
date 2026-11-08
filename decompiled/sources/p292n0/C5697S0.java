package p292n0;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5332a;
import p259j0.InterfaceC5334c;

/* renamed from: n0.S0 */
/* loaded from: classes.dex */
public final class C5697S0 {

    /* renamed from: a */
    public final b f20609a;

    /* renamed from: b */
    public final a f20610b;

    /* renamed from: c */
    public final InterfaceC5334c f20611c;

    /* renamed from: d */
    public final AbstractC4303I f20612d;

    /* renamed from: e */
    public int f20613e;

    /* renamed from: f */
    public Object f20614f;

    /* renamed from: g */
    public Looper f20615g;

    /* renamed from: h */
    public int f20616h;

    /* renamed from: i */
    public long f20617i = -9223372036854775807L;

    /* renamed from: j */
    public boolean f20618j = true;

    /* renamed from: k */
    public boolean f20619k;

    /* renamed from: l */
    public boolean f20620l;

    /* renamed from: m */
    public boolean f20621m;

    /* renamed from: n */
    public boolean f20622n;

    /* renamed from: n0.S0$a */
    public interface a {
        /* renamed from: f */
        void mo23884f(C5697S0 c5697s0);
    }

    /* renamed from: n0.S0$b */
    public interface b {
        /* renamed from: A */
        void mo2838A(int i7, Object obj);
    }

    public C5697S0(a aVar, b bVar, AbstractC4303I abstractC4303I, int i7, InterfaceC5334c interfaceC5334c, Looper looper) {
        this.f20610b = aVar;
        this.f20609a = bVar;
        this.f20612d = abstractC4303I;
        this.f20615g = looper;
        this.f20611c = interfaceC5334c;
        this.f20616h = i7;
    }

    /* renamed from: a */
    public synchronized boolean m23870a(long j7) {
        boolean z6;
        try {
            AbstractC5332a.m21802g(this.f20619k);
            AbstractC5332a.m21802g(this.f20615g.getThread() != Thread.currentThread());
            long mo21613b = this.f20611c.mo21613b() + j7;
            while (true) {
                z6 = this.f20621m;
                if (z6 || j7 <= 0) {
                    break;
                }
                this.f20611c.mo21617f();
                wait(j7);
                j7 = mo21613b - this.f20611c.mo21613b();
            }
            if (!z6) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20620l;
    }

    /* renamed from: b */
    public boolean m23871b() {
        return this.f20618j;
    }

    /* renamed from: c */
    public Looper m23872c() {
        return this.f20615g;
    }

    /* renamed from: d */
    public int m23873d() {
        return this.f20616h;
    }

    /* renamed from: e */
    public Object m23874e() {
        return this.f20614f;
    }

    /* renamed from: f */
    public long m23875f() {
        return this.f20617i;
    }

    /* renamed from: g */
    public b m23876g() {
        return this.f20609a;
    }

    /* renamed from: h */
    public AbstractC4303I m23877h() {
        return this.f20612d;
    }

    /* renamed from: i */
    public int m23878i() {
        return this.f20613e;
    }

    /* renamed from: j */
    public synchronized boolean m23879j() {
        return this.f20622n;
    }

    /* renamed from: k */
    public synchronized void m23880k(boolean z6) {
        this.f20620l = z6 | this.f20620l;
        this.f20621m = true;
        notifyAll();
    }

    /* renamed from: l */
    public C5697S0 m23881l() {
        AbstractC5332a.m21802g(!this.f20619k);
        if (this.f20617i == -9223372036854775807L) {
            AbstractC5332a.m21796a(this.f20618j);
        }
        this.f20619k = true;
        this.f20610b.mo23884f(this);
        return this;
    }

    /* renamed from: m */
    public C5697S0 m23882m(Object obj) {
        AbstractC5332a.m21802g(!this.f20619k);
        this.f20614f = obj;
        return this;
    }

    /* renamed from: n */
    public C5697S0 m23883n(int i7) {
        AbstractC5332a.m21802g(!this.f20619k);
        this.f20613e = i7;
        return this;
    }
}
