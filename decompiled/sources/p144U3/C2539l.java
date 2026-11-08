package p144U3;

import com.google.android.gms.tasks.TaskCompletionSource;
import p151V3.AbstractC2626d;

/* renamed from: U3.l */
/* loaded from: classes.dex */
public class C2539l implements InterfaceC2542o {

    /* renamed from: a */
    public final TaskCompletionSource f7411a;

    public C2539l(TaskCompletionSource taskCompletionSource) {
        this.f7411a = taskCompletionSource;
    }

    @Override // p144U3.InterfaceC2542o
    /* renamed from: a */
    public boolean mo8518a(Exception exc) {
        return false;
    }

    @Override // p144U3.InterfaceC2542o
    /* renamed from: b */
    public boolean mo8519b(AbstractC2626d abstractC2626d) {
        if (!abstractC2626d.m9040l() && !abstractC2626d.m9039k() && !abstractC2626d.m9037i()) {
            return false;
        }
        this.f7411a.trySetResult(abstractC2626d.mo9008d());
        return true;
    }
}
