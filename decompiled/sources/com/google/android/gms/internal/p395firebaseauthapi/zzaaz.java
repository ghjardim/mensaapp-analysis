package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaaz implements zzaew<zzafz> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzaaw zzb;

    public zzaaz(zzaaw zzaawVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzaawVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzafz zzafzVar) {
        zzafz zzafzVar2 = zzafzVar;
        this.zzb.zza.zza(new zzagw(zzafzVar2.zzb(), zzafzVar2.zza(), Long.valueOf(zzagy.zza(zzafzVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
