package p144U3;

import com.google.android.gms.tasks.TaskCompletionSource;
import p151V3.AbstractC2626d;

/* renamed from: U3.k */
/* loaded from: classes.dex */
public class C2538k implements InterfaceC2542o {

    /* renamed from: a */
    public final C2543p f7409a;

    /* renamed from: b */
    public final TaskCompletionSource f7410b;

    public C2538k(C2543p c2543p, TaskCompletionSource taskCompletionSource) {
        this.f7409a = c2543p;
        this.f7410b = taskCompletionSource;
    }

    @Override // p144U3.InterfaceC2542o
    /* renamed from: a */
    public boolean mo8518a(Exception exc) {
        this.f7410b.trySetException(exc);
        return true;
    }

    @Override // p144U3.InterfaceC2542o
    /* renamed from: b */
    public boolean mo8519b(AbstractC2626d abstractC2626d) {
        if (!abstractC2626d.m9039k() || this.f7409a.m8531f(abstractC2626d)) {
            return false;
        }
        this.f7410b.setResult(AbstractC2540m.m8520a().mo8479b(abstractC2626d.mo9006b()).mo8481d(abstractC2626d.mo9007c()).mo8480c(abstractC2626d.mo9012h()).mo8478a());
        return true;
    }
}
