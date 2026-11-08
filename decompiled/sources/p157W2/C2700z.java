package p157W2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: W2.z */
/* loaded from: classes.dex */
public final class C2700z extends AbstractC2675a implements InterfaceC2662B {
    public C2700z(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p157W2.InterfaceC2662B
    /* renamed from: S */
    public final void mo9135S(Bundle bundle, InterfaceC2664D interfaceC2664D) {
        Parcel m9150a = m9150a();
        AbstractC2691q.m9187c(m9150a, bundle);
        m9150a.writeStrongBinder(interfaceC2664D);
        m9151b(2, m9150a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p157W2.InterfaceC2662B
    /* renamed from: c */
    public final void mo9136c(Bundle bundle, InterfaceC2666F interfaceC2666F) {
        Parcel m9150a = m9150a();
        AbstractC2691q.m9187c(m9150a, bundle);
        m9150a.writeStrongBinder(interfaceC2666F);
        m9151b(3, m9150a);
    }
}
