package p108P2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: P2.W6 */
/* loaded from: classes.dex */
public final class C1633W6 implements InterfaceC1816r4 {

    /* renamed from: a */
    public final zzde f4980a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f4981b;

    public C1633W6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzde zzdeVar) {
        this.f4981b = appMeasurementDynamiteService;
        this.f4980a = zzdeVar;
    }

    @Override // p108P2.InterfaceC1816r4
    /* renamed from: a */
    public final void mo5976a(String str, String str2, Bundle bundle, long j7) {
        try {
            this.f4980a.zzf(str, str2, bundle, j7);
        } catch (RemoteException e7) {
            C1460C3 c1460c3 = this.f4981b.f12635a;
            if (c1460c3 != null) {
                c1460c3.mo5624b().m5941w().m5903b("Event interceptor threw exception", e7);
            }
        }
    }
}
