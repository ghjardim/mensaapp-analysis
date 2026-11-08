package p108P2;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.h3 */
/* loaded from: classes.dex */
public final class C1725h3 {

    /* renamed from: a */
    public final InterfaceC1716g3 f5146a;

    public C1725h3(InterfaceC1716g3 interfaceC1716g3) {
        AbstractC3802r.m15129k(interfaceC1716g3);
        this.f5146a = interfaceC1716g3;
    }

    /* renamed from: a */
    public final void m6086a(Context context, Intent intent) {
        C1460C3 m5596J = C1460C3.m5596J(context, null, null);
        C1558N2 mo5624b = m5596J.mo5624b();
        if (intent == null) {
            mo5624b.m5941w().m5902a("Receiver called with null intent");
            return;
        }
        m5596J.mo5623a();
        String action = intent.getAction();
        mo5624b.m5940v().m5903b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                mo5624b.m5941w().m5902a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo5624b.m5940v().m5902a("Starting wakeful intent.");
            this.f5146a.mo6077a(context, className);
        }
    }
}
