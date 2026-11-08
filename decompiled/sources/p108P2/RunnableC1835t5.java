package p108P2;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.t5 */
/* loaded from: classes.dex */
public final class RunnableC1835t5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1633W6 f5520a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f5521b;

    public RunnableC1835t5(AppMeasurementDynamiteService appMeasurementDynamiteService, C1633W6 c1633w6) {
        this.f5520a = c1633w6;
        this.f5521b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5521b.f12635a.m5613K().m6201V(this.f5520a);
    }
}
