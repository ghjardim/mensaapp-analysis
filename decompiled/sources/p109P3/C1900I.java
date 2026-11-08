package p109P3;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p067J3.C0754l;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p116Q3.InterfaceC2123A;
import p129S2.AbstractC2312a;
import p237g5.AbstractC4420V;
import p237g5.AbstractC4421W;
import p237g5.AbstractC4427b;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.EnumC4455p;
import p245h5.C4490a;
import p272k4.AbstractC5435r;
import p368w2.C6871l;
import p368w2.C6872m;

/* renamed from: P3.I */
/* loaded from: classes.dex */
public class C1900I {

    /* renamed from: h */
    public static InterfaceC2123A f5658h;

    /* renamed from: a */
    public Task f5659a;

    /* renamed from: b */
    public final C2138g f5660b;

    /* renamed from: c */
    public C4429c f5661c;

    /* renamed from: d */
    public C2138g.b f5662d;

    /* renamed from: e */
    public final Context f5663e;

    /* renamed from: f */
    public final C0754l f5664f;

    /* renamed from: g */
    public final AbstractC4427b f5665g;

    public C1900I(C2138g c2138g, Context context, C0754l c0754l, AbstractC4427b abstractC4427b) {
        this.f5660b = c2138g;
        this.f5663e = context;
        this.f5664f = c0754l;
        this.f5665g = abstractC4427b;
        m6606k();
    }

    /* renamed from: h */
    public final void m6603h() {
        if (this.f5662d != null) {
            AbstractC2155x.m7309a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f5662d.m7245c();
            this.f5662d = null;
        }
    }

    /* renamed from: i */
    public Task m6604i(final C4426a0 c4426a0) {
        return this.f5659a.continueWithTask(this.f5660b.m7237o(), new Continuation() { // from class: P3.F
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m6607l;
                m6607l = C1900I.this.m6607l(c4426a0, task);
                return m6607l;
            }
        });
    }

    /* renamed from: j */
    public final AbstractC4420V m6605j(Context context, C0754l c0754l) {
        AbstractC4421W abstractC4421W;
        try {
            AbstractC2312a.m7826a(context);
        } catch (IllegalStateException | C6871l | C6872m e7) {
            AbstractC2155x.m7313e("GrpcCallProvider", "Failed to update ssl context: %s", e7);
        }
        InterfaceC2123A interfaceC2123A = f5658h;
        if (interfaceC2123A != null) {
            abstractC4421W = (AbstractC4421W) interfaceC2123A.get();
        } else {
            AbstractC4421W m18755b = AbstractC4421W.m18755b(c0754l.m3231b());
            if (!c0754l.m3233d()) {
                m18755b.mo18758d();
            }
            abstractC4421W = m18755b;
        }
        abstractC4421W.mo18757c(30L, TimeUnit.SECONDS);
        return C4490a.m19107k(abstractC4421W).m19108i(context).mo18756a();
    }

    /* renamed from: k */
    public final void m6606k() {
        this.f5659a = Tasks.call(AbstractC2147p.f6509c, new Callable() { // from class: P3.B
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AbstractC4420V m6609n;
                m6609n = C1900I.this.m6609n();
                return m6609n;
            }
        });
    }

    /* renamed from: l */
    public final /* synthetic */ Task m6607l(C4426a0 c4426a0, Task task) {
        return Tasks.forResult(((AbstractC4420V) task.getResult()).mo18910h(c4426a0, this.f5661c));
    }

    /* renamed from: n */
    public final /* synthetic */ AbstractC4420V m6609n() {
        final AbstractC4420V m6605j = m6605j(this.f5663e, this.f5664f);
        this.f5660b.m7234l(new Runnable() { // from class: P3.C
            @Override // java.lang.Runnable
            public final void run() {
                C1900I.this.m6608m(m6605j);
            }
        });
        this.f5661c = ((AbstractC5435r.b) ((AbstractC5435r.b) AbstractC5435r.m22698f(m6605j).m24971c(this.f5665g)).m24972d(this.f5660b.m7237o())).m24970b();
        AbstractC2155x.m7309a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return m6605j;
    }

    /* renamed from: o */
    public final /* synthetic */ void m6610o(AbstractC4420V abstractC4420V) {
        AbstractC2155x.m7309a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        m6603h();
        m6615t(abstractC4420V);
    }

    /* renamed from: q */
    public final /* synthetic */ void m6612q(final AbstractC4420V abstractC4420V) {
        this.f5660b.m7234l(new Runnable() { // from class: P3.G
            @Override // java.lang.Runnable
            public final void run() {
                C1900I.this.m6611p(abstractC4420V);
            }
        });
    }

    /* renamed from: r */
    public final /* synthetic */ void m6613r(AbstractC4420V abstractC4420V) {
        abstractC4420V.mo18754o();
        m6606k();
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m6611p(final AbstractC4420V abstractC4420V) {
        EnumC4455p mo18751l = abstractC4420V.mo18751l(true);
        AbstractC2155x.m7309a("GrpcCallProvider", "Current gRPC connectivity state: " + mo18751l, new Object[0]);
        m6603h();
        if (mo18751l == EnumC4455p.CONNECTING) {
            AbstractC2155x.m7309a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f5662d = this.f5660b.m7233k(C2138g.d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: P3.D
                @Override // java.lang.Runnable
                public final void run() {
                    C1900I.this.m6610o(abstractC4420V);
                }
            });
        }
        abstractC4420V.mo18752m(mo18751l, new Runnable() { // from class: P3.E
            @Override // java.lang.Runnable
            public final void run() {
                C1900I.this.m6612q(abstractC4420V);
            }
        });
    }

    /* renamed from: t */
    public final void m6615t(final AbstractC4420V abstractC4420V) {
        this.f5660b.m7234l(new Runnable() { // from class: P3.H
            @Override // java.lang.Runnable
            public final void run() {
                C1900I.this.m6613r(abstractC4420V);
            }
        });
    }

    /* renamed from: u */
    public void m6616u() {
        try {
            AbstractC4420V abstractC4420V = (AbstractC4420V) Tasks.await(this.f5659a);
            abstractC4420V.mo18753n();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (abstractC4420V.mo18749j(1L, timeUnit)) {
                    return;
                }
                AbstractC2155x.m7309a(C1946z.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                abstractC4420V.mo18754o();
                if (abstractC4420V.mo18749j(60L, timeUnit)) {
                    return;
                }
                AbstractC2155x.m7313e(C1946z.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                abstractC4420V.mo18754o();
                AbstractC2155x.m7313e(C1946z.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            AbstractC2155x.m7313e(C1946z.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e7) {
            AbstractC2155x.m7313e(C1946z.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e7);
        }
    }
}
