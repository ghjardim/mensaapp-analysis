package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import p052H2.InterfaceC0552a;

/* renamed from: com.google.android.gms.common.internal.y0 */
/* loaded from: classes.dex */
public final class C3817y0 extends zza implements InterfaceC3763V {
    public C3817y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3763V
    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3763V
    public final InterfaceC0552a zzd() {
        Parcel zzB = zzB(1, zza());
        InterfaceC0552a m2136a = InterfaceC0552a.a.m2136a(zzB.readStrongBinder());
        zzB.recycle();
        return m2136a;
    }
}
