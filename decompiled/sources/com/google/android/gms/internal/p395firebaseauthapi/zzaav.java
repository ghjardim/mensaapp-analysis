package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaav implements zzaew<zzaim> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzaas zzb;

    public zzaav(zzaas zzaasVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzaasVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaim zzaimVar) {
        zzaim zzaimVar2 = zzaimVar;
        if (!TextUtils.isEmpty(zzaimVar2.zza()) && !TextUtils.isEmpty(zzaimVar2.zzb())) {
            this.zzb.zza.zza(new zzagw(zzaimVar2.zzb(), zzaimVar2.zza(), Long.valueOf(zzagy.zza(zzaimVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
            return;
        }
        this.zza.zza(AbstractC6672r.m27577a("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
