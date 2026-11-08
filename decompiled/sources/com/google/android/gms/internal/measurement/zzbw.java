package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzbw extends zzcc {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public /* synthetic */ zzbw(String str, boolean z6, int i7, zzbs zzbsVar, zzbt zzbtVar, int i8, zzbv zzbvVar) {
        this.zzc = str;
        this.zzd = i7;
        this.zze = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcc) {
            zzcc zzccVar = (zzcc) obj;
            if (this.zzc.equals(zzccVar.zzc())) {
                zzccVar.zzd();
                int i7 = this.zzd;
                int zze = zzccVar.zze();
                if (i7 == 0) {
                    throw null;
                }
                if (i7 == zze) {
                    zzccVar.zza();
                    zzccVar.zzb();
                    int i8 = this.zze;
                    int zzf = zzccVar.zzf();
                    if (i8 == 0) {
                        throw null;
                    }
                    if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() ^ 1000003;
        int i7 = this.zzd;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i7;
        if (this.zze != 0) {
            return (i8 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i7 = this.zzd;
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zze == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.zzc + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzbs zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzbt zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zzf() {
        return this.zze;
    }
}
