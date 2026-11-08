package p108P2;

import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.v6 */
/* loaded from: classes.dex */
public final class RunnableC1854v6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcy f5580a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f5581b;

    public RunnableC1854v6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar) {
        this.f5580a = zzcyVar;
        this.f5581b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f5581b;
        appMeasurementDynamiteService.f12635a.m5619Q().m5692H(this.f5580a, appMeasurementDynamiteService.f12635a.m5634n());
    }
}
