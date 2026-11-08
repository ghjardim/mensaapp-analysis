package p108P2;

import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.U5 */
/* loaded from: classes.dex */
public final class RunnableC1616U5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcy f4950a;

    /* renamed from: b */
    public final /* synthetic */ String f4951b;

    /* renamed from: c */
    public final /* synthetic */ String f4952c;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f4953d;

    public RunnableC1616U5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar, String str, String str2) {
        this.f4950a = zzcyVar;
        this.f4951b = str;
        this.f4952c = str2;
        this.f4953d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4953d.f12635a.m5617O().m6415t(this.f4950a, this.f4951b, this.f4952c);
    }
}
