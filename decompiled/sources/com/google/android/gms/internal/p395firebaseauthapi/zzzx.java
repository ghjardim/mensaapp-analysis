package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzzx implements zzaew<zzahq> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzzx(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzahq zzahqVar) {
        zzahq zzahqVar2 = zzahqVar;
        this.zzb.zza(new zzagw(zzahqVar2.zzc(), zzahqVar2.zzb(), Long.valueOf(zzahqVar2.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }
}
