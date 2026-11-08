package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaax implements zzaew<zzahs> {
    private final /* synthetic */ zzahp zza;
    private final /* synthetic */ zzadp zzb;

    public zzaax(zzzv zzzvVar, zzahp zzahpVar, zzadp zzadpVar) {
        this.zza = zzahpVar;
        this.zzb = zzadpVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzahs zzahsVar) {
        zzahs zzahsVar2 = zzahsVar;
        zzahp zzahpVar = this.zza;
        if (zzahpVar instanceof zzaht) {
            this.zzb.zzb(zzahsVar2.zza());
            return;
        }
        if (zzahpVar instanceof zzahv) {
            this.zzb.zza(zzahsVar2);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + ".");
    }
}
