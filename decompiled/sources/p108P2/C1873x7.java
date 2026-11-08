package p108P2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.x7 */
/* loaded from: classes.dex */
public final class C1873x7 implements InterfaceC1825s4 {

    /* renamed from: a */
    public final zzde f5618a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f5619b;

    public C1873x7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzde zzdeVar) {
        this.f5619b = appMeasurementDynamiteService;
        this.f5618a = zzdeVar;
    }

    @Override // p108P2.InterfaceC1825s4
    /* renamed from: a */
    public final void mo6272a(String str, String str2, Bundle bundle, long j7) {
        try {
            this.f5618a.zzf(str, str2, bundle, j7);
        } catch (RemoteException e7) {
            C1460C3 c1460c3 = this.f5619b.f12635a;
            if (c1460c3 != null) {
                c1460c3.mo5624b().m5941w().m5903b("Event listener threw exception", e7);
            }
        }
    }
}
