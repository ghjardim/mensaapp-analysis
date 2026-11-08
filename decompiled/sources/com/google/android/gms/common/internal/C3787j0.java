package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3772c;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.internal.j0 */
/* loaded from: classes.dex */
public final class C3787j0 extends AbstractC3762U {

    /* renamed from: g */
    public final IBinder f12520g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC3772c f12521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3787j0(AbstractC3772c abstractC3772c, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC3772c, i7, bundle);
        this.f12521h = abstractC3772c;
        this.f12520g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3762U
    /* renamed from: f */
    public final void mo15037f(C6861b c6861b) {
        if (this.f12521h.zzx != null) {
            this.f12521h.zzx.mo6274a(c6861b);
        }
        this.f12521h.onConnectionFailed(c6861b);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3762U
    /* renamed from: g */
    public final boolean mo15038g() {
        AbstractC3772c.a aVar;
        AbstractC3772c.a aVar2;
        try {
            IBinder iBinder = this.f12520g;
            AbstractC3802r.m15129k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f12521h.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f12521h.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = this.f12521h.createServiceInterface(this.f12520g);
            if (createServiceInterface == null || !(AbstractC3772c.zzn(this.f12521h, 2, 4, createServiceInterface) || AbstractC3772c.zzn(this.f12521h, 3, 4, createServiceInterface))) {
                return false;
            }
            this.f12521h.zzC = null;
            AbstractC3772c abstractC3772c = this.f12521h;
            Bundle connectionHint = abstractC3772c.getConnectionHint();
            aVar = abstractC3772c.zzw;
            if (aVar == null) {
                return true;
            }
            aVar2 = this.f12521h.zzw;
            aVar2.mo6278f(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
