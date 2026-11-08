package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.List;
import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaat implements zzaew<zzagm> {
    private final /* synthetic */ zzaew zza;
    private final /* synthetic */ zzagw zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzadp zzd;
    private final /* synthetic */ zzaaq zze;

    public zzaat(zzaaq zzaaqVar, zzaew zzaewVar, zzagw zzagwVar, String str, zzadp zzadpVar) {
        this.zza = zzaewVar;
        this.zzb = zzagwVar;
        this.zzc = str;
        this.zzd = zzadpVar;
        this.zze = zzaaqVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzd.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagm zzagmVar) {
        List<zzagl> zza = zzagmVar.zza();
        if (zza != null && !zza.isEmpty()) {
            zzagl zzaglVar = zza.get(0);
            zzahm zzahmVar = new zzahm();
            zzahmVar.zzd(this.zzb.zzc()).zza(this.zzc);
            zzzv.zza(this.zze.zza, this.zzd, this.zzb, zzaglVar, zzahmVar, this.zza);
            return;
        }
        this.zza.zza("No users.");
    }
}
