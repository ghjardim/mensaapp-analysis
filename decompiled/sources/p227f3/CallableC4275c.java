package p227f3;

import com.google.android.gms.internal.measurement.zzff;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: f3.c */
/* loaded from: classes.dex */
public final class CallableC4275c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f14712a;

    public CallableC4275c(FirebaseAnalytics firebaseAnalytics) {
        this.f14712a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzff zzffVar;
        zzffVar = this.f14712a.f12778a;
        return zzffVar.zzh();
    }
}
