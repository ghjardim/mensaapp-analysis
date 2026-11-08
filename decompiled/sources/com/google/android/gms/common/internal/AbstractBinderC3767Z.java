package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.Z */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3767Z extends zzb implements InterfaceC3769a0 {
    /* renamed from: a */
    public static InterfaceC3769a0 m15043a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC3769a0 ? (InterfaceC3769a0) queryLocalInterface : new C3766Y(iBinder);
    }
}
