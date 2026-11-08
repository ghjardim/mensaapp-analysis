package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: P2.t3 */
/* loaded from: classes.dex */
public final class C1833t3 extends FutureTask implements Comparable {

    /* renamed from: a */
    public final long f5515a;

    /* renamed from: b */
    public final boolean f5516b;

    /* renamed from: c */
    public final String f5517c;

    /* renamed from: d */
    public final /* synthetic */ C1851v3 f5518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833t3(C1851v3 c1851v3, Runnable runnable, boolean z6, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f5518d = c1851v3;
        AbstractC3802r.m15129k(str);
        atomicLong = C1851v3.f5570l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f5515a = andIncrement;
        this.f5517c = str;
        this.f5516b = z6;
        if (andIncrement == Long.MAX_VALUE) {
            c1851v3.f5129a.mo5624b().m5936r().m5902a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C1833t3 c1833t3 = (C1833t3) obj;
        boolean z6 = c1833t3.f5516b;
        boolean z7 = this.f5516b;
        if (z7 == z6) {
            long j7 = this.f5515a;
            long j8 = c1833t3.f5515a;
            if (j7 < j8) {
                return -1;
            }
            if (j7 <= j8) {
                this.f5518d.f5129a.mo5624b().m5938t().m5903b("Two tasks share the same index. index", Long.valueOf(j7));
                return 0;
            }
        } else if (z7) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f5518d.f5129a.mo5624b().m5936r().m5903b(this.f5517c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833t3(C1851v3 c1851v3, Callable callable, boolean z6, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f5518d = c1851v3;
        AbstractC3802r.m15129k("Task exception on worker thread");
        atomicLong = C1851v3.f5570l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f5515a = andIncrement;
        this.f5517c = "Task exception on worker thread";
        this.f5516b = z6;
        if (andIncrement == Long.MAX_VALUE) {
            c1851v3.f5129a.mo5624b().m5936r().m5902a("Tasks index overflow");
        }
    }
}
