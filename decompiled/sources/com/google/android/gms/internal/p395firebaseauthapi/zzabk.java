package com.google.android.gms.internal.p395firebaseauthapi;

import p346t3.C6501d0;
import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzabk implements zzaew<zzagw> {
    private final /* synthetic */ C6501d0 zza;
    private final /* synthetic */ zzadp zzb;
    private final /* synthetic */ zzzv zzc;

    public zzabk(zzzv zzzvVar, C6501d0 c6501d0, zzadp zzadpVar) {
        this.zza = c6501d0;
        this.zzb = zzadpVar;
        this.zzc = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzagw zzagwVar2 = zzagwVar;
        zzahm zzahmVar = new zzahm();
        zzahmVar.zzd(zzagwVar2.zzc());
        if (this.zza.m27071y0() || this.zza.m27069M() != null) {
            zzahmVar.zzb(this.zza.m27069M());
        }
        if (this.zza.zzc() || this.zza.m27070x0() != null) {
            zzahmVar.zzg(this.zza.zza());
        }
        zzzv.zza(this.zzc, this.zzb, zzagwVar2, zzahmVar, this);
    }
}
