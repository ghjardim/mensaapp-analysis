package p108P2;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: P2.o6 */
/* loaded from: classes.dex */
public final class RunnableC1791o6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ServiceConnectionC1827s6 f5278a;

    public RunnableC1791o6(ServiceConnectionC1827s6 serviceConnectionC1827s6) {
        this.f5278a = serviceConnectionC1827s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1836t6 c1836t6 = this.f5278a.f5470c;
        C1460C3 c1460c3 = c1836t6.f5129a;
        Context mo5625c = c1460c3.mo5625c();
        c1460c3.mo5623a();
        C1836t6.m6384j0(c1836t6, new ComponentName(mo5625c, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
