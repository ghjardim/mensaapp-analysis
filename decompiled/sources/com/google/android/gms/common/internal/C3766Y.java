package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p052H2.InterfaceC0552a;
import p368w2.C6850H;
import p368w2.C6852J;
import p368w2.C6854L;

/* renamed from: com.google.android.gms.common.internal.Y */
/* loaded from: classes.dex */
public final class C3766Y extends zza implements InterfaceC3769a0 {
    public C3766Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3769a0
    /* renamed from: N */
    public final boolean mo15040N(C6854L c6854l, InterfaceC0552a interfaceC0552a) {
        Parcel zza = zza();
        zzc.zzc(zza, c6854l);
        zzc.zze(zza, interfaceC0552a);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3769a0
    /* renamed from: O */
    public final C6852J mo15041O(C6850H c6850h) {
        Parcel zza = zza();
        zzc.zzc(zza, c6850h);
        Parcel zzB = zzB(8, zza);
        C6852J c6852j = (C6852J) zzc.zza(zzB, C6852J.CREATOR);
        zzB.recycle();
        return c6852j;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3769a0
    /* renamed from: W */
    public final C6852J mo15042W(C6850H c6850h) {
        Parcel zza = zza();
        zzc.zzc(zza, c6850h);
        Parcel zzB = zzB(6, zza);
        C6852J c6852j = (C6852J) zzc.zza(zzB, C6852J.CREATOR);
        zzB.recycle();
        return c6852j;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3769a0
    public final boolean zzi() {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
