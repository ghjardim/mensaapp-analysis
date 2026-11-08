package p157W2;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: W2.K */
/* loaded from: classes.dex */
public final class C2671K extends AbstractRunnableC2668H {

    /* renamed from: n */
    public final /* synthetic */ TaskCompletionSource f7908n;

    /* renamed from: o */
    public final /* synthetic */ AbstractRunnableC2668H f7909o;

    /* renamed from: p */
    public final /* synthetic */ C2680f f7910p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2671K(C2680f c2680f, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC2668H abstractRunnableC2668H) {
        super(taskCompletionSource);
        this.f7910p = c2680f;
        this.f7908n = taskCompletionSource2;
        this.f7909o = abstractRunnableC2668H;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        Object obj;
        AtomicInteger atomicInteger;
        C2667G c2667g;
        obj = this.f7910p.f7924f;
        synchronized (obj) {
            try {
                C2680f.m9164o(this.f7910p, this.f7908n);
                atomicInteger = this.f7910p.f7930l;
                if (atomicInteger.getAndIncrement() > 0) {
                    c2667g = this.f7910p.f7920b;
                    c2667g.m9144d("Already connected to the service.", new Object[0]);
                }
                C2680f.m9166q(this.f7910p, this.f7909o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
