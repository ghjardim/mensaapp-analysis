package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.ArrayList;
import java.util.List;
import p031E2.AbstractC0267c;

/* loaded from: classes.dex */
final class zzaaa implements zzaew<zzahl> {
    private final /* synthetic */ zzahm zza;
    private final /* synthetic */ zzagl zzb;
    private final /* synthetic */ zzadp zzc;
    private final /* synthetic */ zzagw zzd;
    private final /* synthetic */ zzaet zze;
    private final /* synthetic */ zzzv zzf;

    public zzaaa(zzzv zzzvVar, zzahm zzahmVar, zzagl zzaglVar, zzadp zzadpVar, zzagw zzagwVar, zzaet zzaetVar) {
        this.zza = zzahmVar;
        this.zzb = zzaglVar;
        this.zzc = zzadpVar;
        this.zzd = zzagwVar;
        this.zze = zzaetVar;
        this.zzf = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        zzahl zzahlVar2 = zzahlVar;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb(null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzc(null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzc(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            AbstractC3802r.m15123e(AbstractC0267c.m1107c("redacted".getBytes()));
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza(zzaj.zzh());
        }
        List<zzahc> zze = zzahlVar2.zze();
        if (zze == null) {
            zze = new ArrayList<>();
        }
        this.zzb.zza(zze);
        zzadp zzadpVar = this.zzc;
        zzagw zzagwVar = this.zzd;
        AbstractC3802r.m15129k(zzagwVar);
        AbstractC3802r.m15129k(zzahlVar2);
        String zzc = zzahlVar2.zzc();
        String zzd = zzahlVar2.zzd();
        if (!TextUtils.isEmpty(zzc) && !TextUtils.isEmpty(zzd)) {
            zzagwVar = new zzagw(zzd, zzc, Long.valueOf(zzahlVar2.zza()), zzagwVar.zze());
        }
        zzadpVar.zza(zzagwVar, this.zzb);
    }
}
