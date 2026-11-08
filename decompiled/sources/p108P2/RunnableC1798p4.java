package p108P2;

import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.p4 */
/* loaded from: classes.dex */
public final class RunnableC1798p4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcy f5287a;

    /* renamed from: b */
    public final /* synthetic */ C1519J f5288b;

    /* renamed from: c */
    public final /* synthetic */ String f5289c;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f5290d;

    public RunnableC1798p4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar, C1519J c1519j, String str) {
        this.f5287a = zzcyVar;
        this.f5288b = c1519j;
        this.f5289c = str;
        this.f5290d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5290d.f12635a.m5617O().m6386A(this.f5287a, this.f5288b, this.f5289c);
    }
}
