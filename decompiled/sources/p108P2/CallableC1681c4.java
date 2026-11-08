package p108P2;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: P2.c4 */
/* loaded from: classes.dex */
public final class CallableC1681c4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5086a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f5087b;

    /* renamed from: c */
    public final /* synthetic */ BinderC1699e4 f5088c;

    public CallableC1681c4(BinderC1699e4 binderC1699e4, C1482E7 c1482e7, Bundle bundle) {
        this.f5086a = c1482e7;
        this.f5087b = bundle;
        this.f5088c = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f5088c;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        return c1828s72.m6344k(this.f5086a, this.f5087b);
    }
}
