package p287m3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: m3.m */
/* loaded from: classes.dex */
public class C5587m {

    /* renamed from: a */
    public final C5584j f20180a;

    /* renamed from: b */
    public final Executor f20181b;

    /* renamed from: c */
    public final ScheduledExecutorService f20182c;

    /* renamed from: d */
    public volatile ScheduledFuture f20183d;

    /* renamed from: e */
    public volatile long f20184e = -1;

    public C5587m(C5584j c5584j, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f20180a = (C5584j) AbstractC3802r.m15129k(c5584j);
        this.f20181b = executor;
        this.f20182c = scheduledExecutorService;
    }

    /* renamed from: c */
    public void m23376c() {
        if (this.f20183d == null || this.f20183d.isDone()) {
            return;
        }
        this.f20183d.cancel(false);
    }

    /* renamed from: d */
    public final long m23377d() {
        if (this.f20184e == -1) {
            return 30L;
        }
        if (this.f20184e * 2 < 960) {
            return this.f20184e * 2;
        }
        return 960L;
    }

    /* renamed from: e */
    public final /* synthetic */ void m23378e(Exception exc) {
        m23381h();
    }

    /* renamed from: f */
    public final void m23379f() {
        this.f20180a.m23365q().addOnFailureListener(this.f20181b, new OnFailureListener() { // from class: m3.l
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C5587m.this.m23378e(exc);
            }
        });
    }

    /* renamed from: g */
    public void m23380g(long j7) {
        m23376c();
        this.f20184e = -1L;
        this.f20183d = this.f20182c.schedule(new RunnableC5585k(this), Math.max(0L, j7), TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    public final void m23381h() {
        m23376c();
        this.f20184e = m23377d();
        this.f20183d = this.f20182c.schedule(new RunnableC5585k(this), this.f20184e, TimeUnit.SECONDS);
    }
}
