package p108P2;

import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.O3 */
/* loaded from: classes.dex */
public final class RunnableC1567O3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcy f4858a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f4859b;

    public RunnableC1567O3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar) {
        this.f4858a = zzcyVar;
        this.f4859b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4859b.f12635a.m5617O().m6413r(this.f4858a);
    }
}
