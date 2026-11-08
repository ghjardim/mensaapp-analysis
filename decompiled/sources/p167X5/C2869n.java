package p167X5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p132S5.AbstractC2328G;
import p132S5.AbstractC2332I;
import p132S5.AbstractC2346P;
import p132S5.InterfaceC2353T;
import p132S5.InterfaceC2368a0;
import p132S5.InterfaceC2394n;
import p392z5.C7162j;
import p392z5.InterfaceC7161i;

/* renamed from: X5.n */
/* loaded from: classes2.dex */
public final class C2869n extends AbstractC2328G implements InterfaceC2353T {

    /* renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8841o = AtomicIntegerFieldUpdater.newUpdater(C2869n.class, "runningWorkers$volatile");

    /* renamed from: c */
    public final AbstractC2328G f8842c;

    /* renamed from: d */
    public final int f8843d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2353T f8844e;

    /* renamed from: f */
    public final C2874s f8845f;

    /* renamed from: n */
    public final Object f8846n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: X5.n$a */
    public final class a implements Runnable {

        /* renamed from: a */
        public Runnable f8847a;

        public a(Runnable runnable) {
            this.f8847a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7 = 0;
            while (true) {
                try {
                    this.f8847a.run();
                } catch (Throwable th) {
                    AbstractC2332I.m7992a(C7162j.f25439a, th);
                }
                Runnable m10344R = C2869n.this.m10344R();
                if (m10344R == null) {
                    return;
                }
                this.f8847a = m10344R;
                i7++;
                if (i7 >= 16 && C2869n.this.f8842c.mo7984F(C2869n.this)) {
                    C2869n.this.f8842c.mo7983D(C2869n.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2869n(AbstractC2328G abstractC2328G, int i7) {
        this.f8842c = abstractC2328G;
        this.f8843d = i7;
        InterfaceC2353T interfaceC2353T = abstractC2328G instanceof InterfaceC2353T ? (InterfaceC2353T) abstractC2328G : null;
        this.f8844e = interfaceC2353T == null ? AbstractC2346P.m8017a() : interfaceC2353T;
        this.f8845f = new C2874s(false);
        this.f8846n = new Object();
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: D */
    public void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        Runnable m10344R;
        this.f8845f.m10367a(runnable);
        if (f8841o.get(this) >= this.f8843d || !m10345S() || (m10344R = m10344R()) == null) {
            return;
        }
        this.f8842c.mo7983D(this, new a(m10344R));
    }

    /* renamed from: R */
    public final Runnable m10344R() {
        while (true) {
            Runnable runnable = (Runnable) this.f8845f.m10370e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f8846n) {
                f8841o.decrementAndGet(this);
                if (this.f8845f.m10369c() == 0) {
                    return null;
                }
                f8841o.incrementAndGet(this);
            }
        }
    }

    /* renamed from: S */
    public final boolean m10345S() {
        synchronized (this.f8846n) {
            if (f8841o.get(this) >= this.f8843d) {
                return false;
            }
            f8841o.incrementAndGet(this);
            return true;
        }
    }

    @Override // p132S5.InterfaceC2353T
    /* renamed from: d */
    public void mo8028d(long j7, InterfaceC2394n interfaceC2394n) {
        this.f8844e.mo8028d(j7, interfaceC2394n);
    }

    @Override // p132S5.InterfaceC2353T
    /* renamed from: y */
    public InterfaceC2368a0 mo8015y(long j7, Runnable runnable, InterfaceC7161i interfaceC7161i) {
        return this.f8844e.mo8015y(j7, runnable, interfaceC7161i);
    }
}
