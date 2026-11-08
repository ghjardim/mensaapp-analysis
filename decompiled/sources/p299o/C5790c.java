package p299o;

import java.util.concurrent.Executor;

/* renamed from: o.c */
/* loaded from: classes.dex */
public class C5790c extends AbstractC5792e {

    /* renamed from: c */
    public static volatile C5790c f21089c;

    /* renamed from: d */
    public static final Executor f21090d = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C5790c.m24454g(runnable);
        }
    };

    /* renamed from: e */
    public static final Executor f21091e = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C5790c.m24455h(runnable);
        }
    };

    /* renamed from: a */
    public AbstractC5792e f21092a;

    /* renamed from: b */
    public final AbstractC5792e f21093b;

    public C5790c() {
        C5791d c5791d = new C5791d();
        this.f21093b = c5791d;
        this.f21092a = c5791d;
    }

    /* renamed from: f */
    public static C5790c m24453f() {
        if (f21089c != null) {
            return f21089c;
        }
        synchronized (C5790c.class) {
            try {
                if (f21089c == null) {
                    f21089c = new C5790c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21089c;
    }

    /* renamed from: g */
    public static /* synthetic */ void m24454g(Runnable runnable) {
        m24453f().mo24458c(runnable);
    }

    /* renamed from: h */
    public static /* synthetic */ void m24455h(Runnable runnable) {
        m24453f().mo24456a(runnable);
    }

    @Override // p299o.AbstractC5792e
    /* renamed from: a */
    public void mo24456a(Runnable runnable) {
        this.f21092a.mo24456a(runnable);
    }

    @Override // p299o.AbstractC5792e
    /* renamed from: b */
    public boolean mo24457b() {
        return this.f21092a.mo24457b();
    }

    @Override // p299o.AbstractC5792e
    /* renamed from: c */
    public void mo24458c(Runnable runnable) {
        this.f21092a.mo24458c(runnable);
    }
}
