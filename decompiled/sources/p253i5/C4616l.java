package p253i5;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p237g5.ExecutorC4456p0;
import p253i5.InterfaceC4612j;

/* renamed from: i5.l */
/* loaded from: classes2.dex */
public final class C4616l implements InterfaceC4556F0 {

    /* renamed from: f */
    public static final Logger f17072f = Logger.getLogger(C4616l.class.getName());

    /* renamed from: a */
    public final ScheduledExecutorService f17073a;

    /* renamed from: b */
    public final ExecutorC4456p0 f17074b;

    /* renamed from: c */
    public final InterfaceC4612j.a f17075c;

    /* renamed from: d */
    public InterfaceC4612j f17076d;

    /* renamed from: e */
    public ExecutorC4456p0.d f17077e;

    public C4616l(InterfaceC4612j.a aVar, ScheduledExecutorService scheduledExecutorService, ExecutorC4456p0 executorC4456p0) {
        this.f17075c = aVar;
        this.f17073a = scheduledExecutorService;
        this.f17074b = executorC4456p0;
    }

    @Override // p253i5.InterfaceC4556F0
    /* renamed from: a */
    public void mo19510a(Runnable runnable) {
        this.f17074b.m18993e();
        if (this.f17076d == null) {
            this.f17076d = this.f17075c.get();
        }
        ExecutorC4456p0.d dVar = this.f17077e;
        if (dVar == null || !dVar.m18995b()) {
            long mo19508a = this.f17076d.mo19508a();
            this.f17077e = this.f17074b.m18991c(runnable, mo19508a, TimeUnit.NANOSECONDS, this.f17073a);
            f17072f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(mo19508a));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m20009c() {
        ExecutorC4456p0.d dVar = this.f17077e;
        if (dVar != null && dVar.m18995b()) {
            this.f17077e.m18994a();
        }
        this.f17076d = null;
    }

    @Override // p253i5.InterfaceC4556F0
    public void reset() {
        this.f17074b.m18993e();
        this.f17074b.execute(new Runnable() { // from class: i5.k
            @Override // java.lang.Runnable
            public final void run() {
                C4616l.this.m20009c();
            }
        });
    }
}
