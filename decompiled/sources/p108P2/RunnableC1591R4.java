package p108P2;

import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.R4 */
/* loaded from: classes.dex */
public final class RunnableC1591R4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcy f4913a;

    /* renamed from: b */
    public final /* synthetic */ String f4914b;

    /* renamed from: c */
    public final /* synthetic */ String f4915c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4916d;

    /* renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f4917e;

    public RunnableC1591R4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar, String str, String str2, boolean z6) {
        this.f4913a = zzcyVar;
        this.f4914b = str;
        this.f4915c = str2;
        this.f4916d = z6;
        this.f4917e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4917e.f12635a.m5617O().m6419x(this.f4913a, this.f4914b, this.f4915c, this.f4916d);
    }
}
