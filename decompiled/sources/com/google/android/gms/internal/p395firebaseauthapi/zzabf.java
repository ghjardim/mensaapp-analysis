package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class zzabf implements zzaew<zzagm> {
    private final /* synthetic */ zzaew zza;
    private final /* synthetic */ zzadp zzb;
    private final /* synthetic */ zzagw zzc;

    public zzabf(zzabc zzabcVar, zzaew zzaewVar, zzadp zzadpVar, zzagw zzagwVar) {
        this.zza = zzaewVar;
        this.zzb = zzadpVar;
        this.zzc = zzagwVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagm zzagmVar) {
        List<zzagl> zza = zzagmVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzb.zza(this.zzc, zza.get(0));
        }
    }
}
