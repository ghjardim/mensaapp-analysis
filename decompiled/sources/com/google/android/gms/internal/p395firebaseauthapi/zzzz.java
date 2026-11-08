package com.google.android.gms.internal.p395firebaseauthapi;

import p346t3.C6512j;
import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzzz implements zzaew<zzagw> {
    private final /* synthetic */ C6512j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzadp zzc;
    private final /* synthetic */ zzzv zzd;

    public zzzz(zzzv zzzvVar, C6512j c6512j, String str, zzadp zzadpVar) {
        this.zza = c6512j;
        this.zzb = str;
        this.zzc = zzadpVar;
        this.zzd = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzc.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        this.zzd.zza(new zzafy(this.zza, zzagwVar.zzc(), this.zzb), this.zzc);
    }
}
