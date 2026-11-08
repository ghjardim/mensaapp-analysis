package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzwb;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zznk<P> extends zznl<P> implements zzci<P> {
    public zznk(String str, Class<P> cls, zzalw<? extends zzaln> zzalwVar) {
        super(str, cls, zzwb.zza.ASYMMETRIC_PRIVATE, zzalwVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzci
    public final zzwb zzc(zzaiw zzaiwVar) {
        Object zza = zzom.zza().zza((zzom) zzpn.zza(this.zza, zzaiwVar, this.zzb, zzxd.RAW, null), zzbl.zza());
        if (!(zza instanceof zzcf)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzpn zzpnVar = (zzpn) zzom.zza().zza(((zzcf) zza).zzb(), zzpn.class, zzbl.zza());
        return (zzwb) ((zzakg) zzwb.zza().zza(zzpnVar.zzf()).zza(zzpnVar.zzd()).zza(zzpnVar.zza()).zze());
    }
}
