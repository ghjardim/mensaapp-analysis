package p108P2;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzcr;

/* renamed from: P2.A */
/* loaded from: classes.dex */
public abstract class AbstractC1438A {

    /* renamed from: d */
    public static volatile Handler f4481d;

    /* renamed from: a */
    public final InterfaceC1726h4 f4482a;

    /* renamed from: b */
    public final Runnable f4483b;

    /* renamed from: c */
    public volatile long f4484c;

    public AbstractC1438A(InterfaceC1726h4 interfaceC1726h4) {
        AbstractC3802r.m15129k(interfaceC1726h4);
        this.f4482a = interfaceC1726h4;
        this.f4483b = new RunnableC1883z(this, interfaceC1726h4);
    }

    /* renamed from: b */
    public final void m5557b() {
        this.f4484c = 0L;
        m5561f().removeCallbacks(this.f4483b);
    }

    /* renamed from: c */
    public abstract void mo5558c();

    /* renamed from: d */
    public final void m5559d(long j7) {
        m5557b();
        if (j7 >= 0) {
            InterfaceC1726h4 interfaceC1726h4 = this.f4482a;
            this.f4484c = interfaceC1726h4.mo5626d().mo1110a();
            if (m5561f().postDelayed(this.f4483b, j7)) {
                return;
            }
            interfaceC1726h4.mo5624b().m5936r().m5903b("Failed to schedule delayed post. time", Long.valueOf(j7));
        }
    }

    /* renamed from: e */
    public final boolean m5560e() {
        return this.f4484c != 0;
    }

    /* renamed from: f */
    public final Handler m5561f() {
        Handler handler;
        if (f4481d != null) {
            return f4481d;
        }
        synchronized (AbstractC1438A.class) {
            try {
                if (f4481d == null) {
                    f4481d = new zzcr(this.f4482a.mo5625c().getMainLooper());
                }
                handler = f4481d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
