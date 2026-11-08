package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
final class zzafp extends zzahf {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzagh zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahf) {
            zzahf zzahfVar = (zzahf) obj;
            if (this.zza.equals(zzahfVar.zzd()) && ((str = this.zzb) != null ? str.equals(zzahfVar.zze()) : zzahfVar.zze() == null) && this.zzc.equals(zzahfVar.zzf()) && this.zzd.equals(zzahfVar.zzb()) && this.zze.equals(zzahfVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        return "RevokeTokenRequest{providerId=" + this.zza + ", tenantId=" + this.zzb + ", token=" + this.zzc + ", tokenType=" + String.valueOf(this.zzd) + ", idToken=" + this.zze + "}";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahf
    public final zzagh zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahf
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahf
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahf
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahf
    public final String zzf() {
        return this.zzc;
    }

    private zzafp(String str, String str2, String str3, zzagh zzaghVar, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzaghVar;
        this.zze = str4;
    }
}
