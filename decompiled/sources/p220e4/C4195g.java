package p220e4;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.storage.C3977G;
import java.util.concurrent.Executor;

/* renamed from: e4.g */
/* loaded from: classes.dex */
public class C4195g {

    /* renamed from: b */
    public static boolean f14052b = false;

    /* renamed from: a */
    public final Executor f14053a;

    public C4195g(Executor executor) {
        if (executor != null) {
            this.f14053a = executor;
        } else if (f14052b) {
            this.f14053a = null;
        } else {
            this.f14053a = C3977G.m15939b().m15942c();
        }
    }

    /* renamed from: a */
    public void m17600a(Runnable runnable) {
        AbstractC3802r.m15129k(runnable);
        Executor executor = this.f14053a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            C3977G.m15939b().m15943e(runnable);
        }
    }
}
