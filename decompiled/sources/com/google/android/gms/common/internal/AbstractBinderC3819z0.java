package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import p052H2.InterfaceC0552a;

/* renamed from: com.google.android.gms.common.internal.z0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3819z0 extends zzb implements InterfaceC3763V {
    public AbstractBinderC3819z0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static InterfaceC3763V m15162a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC3763V ? (InterfaceC3763V) queryLocalInterface : new C3817y0(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC0552a zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else {
            if (i7 != 2) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
