package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import p346t3.C6483O;

/* loaded from: classes.dex */
final class zzaam implements zzaew<zzaik> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzaew zzb;
    private final /* synthetic */ zzaan zzc;

    public zzaam(zzaan zzaanVar, zzadp zzadpVar, zzaew zzaewVar) {
        this.zza = zzadpVar;
        this.zzb = zzaewVar;
        this.zzc = zzaanVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaik zzaikVar) {
        zzaik zzaikVar2 = zzaikVar;
        if (TextUtils.isEmpty(zzaikVar2.zze())) {
            this.zzc.zza.zza(new zzagw(zzaikVar2.zzd(), zzaikVar2.zzb(), Long.valueOf(zzaikVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzaikVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025), C6483O.m27033E0(zzaikVar2.zzc(), zzaikVar2.zze()));
        }
    }
}
