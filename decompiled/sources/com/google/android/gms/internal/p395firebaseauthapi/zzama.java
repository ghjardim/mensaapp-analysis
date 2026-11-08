package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
final class zzama implements zzall {
    private final zzaln zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzama(zzaln zzalnVar, String str, Object[] objArr) {
        this.zza = zzalnVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.zzd = i7 | (charAt2 << i8);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzall
    public final zzaln zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzall
    public final zzalz zzb() {
        int i7 = this.zzd;
        return (i7 & 1) != 0 ? zzalz.PROTO2 : (i7 & 4) == 4 ? zzalz.EDITIONS : zzalz.PROTO3;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzall
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
