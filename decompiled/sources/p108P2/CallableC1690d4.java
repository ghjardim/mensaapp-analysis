package p108P2;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: P2.d4 */
/* loaded from: classes.dex */
public final class CallableC1690d4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5102a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f5103b;

    /* renamed from: c */
    public final /* synthetic */ BinderC1699e4 f5104c;

    public CallableC1690d4(BinderC1699e4 binderC1699e4, C1482E7 c1482e7, Bundle bundle) {
        this.f5102a = c1482e7;
        this.f5103b = bundle;
        this.f5104c = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f5104c;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        return c1828s72.m6344k(this.f5102a, this.f5103b);
    }
}
