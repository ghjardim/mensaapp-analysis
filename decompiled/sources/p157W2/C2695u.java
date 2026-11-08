package p157W2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: W2.u */
/* loaded from: classes.dex */
public final class C2695u extends AbstractC2675a implements InterfaceC2697w {
    public C2695u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p157W2.InterfaceC2697w
    /* renamed from: c */
    public final void mo9193c(Bundle bundle, InterfaceC2666F interfaceC2666F) {
        Parcel m9150a = m9150a();
        AbstractC2691q.m9187c(m9150a, bundle);
        m9150a.writeStrongBinder(interfaceC2666F);
        m9151b(6, m9150a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p157W2.InterfaceC2697w
    /* renamed from: u */
    public final void mo9194u(Bundle bundle, InterfaceC2699y interfaceC2699y) {
        Parcel m9150a = m9150a();
        AbstractC2691q.m9187c(m9150a, bundle);
        m9150a.writeStrongBinder(interfaceC2699y);
        m9151b(2, m9150a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p157W2.InterfaceC2697w
    /* renamed from: y */
    public final void mo9195y(Bundle bundle, InterfaceC2699y interfaceC2699y) {
        Parcel m9150a = m9150a();
        AbstractC2691q.m9187c(m9150a, bundle);
        m9150a.writeStrongBinder(interfaceC2699y);
        m9151b(3, m9150a);
    }
}
