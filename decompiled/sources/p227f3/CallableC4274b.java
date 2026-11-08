package p227f3;

import com.google.android.gms.internal.measurement.zzff;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: f3.b */
/* loaded from: classes.dex */
public final class CallableC4274b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f14711a;

    public CallableC4274b(FirebaseAnalytics firebaseAnalytics) {
        this.f14711a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzff zzffVar;
        zzffVar = this.f14711a.f12778a;
        return zzffVar.zzl();
    }
}
