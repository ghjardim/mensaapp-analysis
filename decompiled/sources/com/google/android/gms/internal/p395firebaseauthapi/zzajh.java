package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
class zzajh extends zzaje {
    protected final byte[] zzb;

    public zzajh(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaiw) || zzb() != ((zzaiw) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzajh)) {
            return obj.equals(this);
        }
        zzajh zzajhVar = (zzajh) obj;
        int zza = zza();
        int zza2 = zzajhVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzajhVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public byte zza(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public byte zzb(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final zzaji zzc() {
        return zzaji.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final zzaiw zza(int i7, int i8) {
        int zza = zzaiw.zza(0, i8, zzb());
        return zza == 0 ? zzaiw.zza : new zzaja(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final int zzb(int i7, int i8, int i9) {
        return zzaki.zza(i7, this.zzb, zze(), i9);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public void zza(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zzb, 0, bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final void zza(zzaix zzaixVar) {
        zzaixVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaje
    public final boolean zza(zzaiw zzaiwVar, int i7, int i8) {
        if (i8 <= zzaiwVar.zzb()) {
            if (i8 <= zzaiwVar.zzb()) {
                if (zzaiwVar instanceof zzajh) {
                    zzajh zzajhVar = (zzajh) zzaiwVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzajhVar.zzb;
                    int zze = zze() + i8;
                    int zze2 = zze();
                    int zze3 = zzajhVar.zze();
                    while (zze2 < zze) {
                        if (bArr[zze2] != bArr2[zze3]) {
                            return false;
                        }
                        zze2++;
                        zze3++;
                    }
                    return true;
                }
                return zzaiwVar.zza(0, i8).equals(zza(0, i8));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i8 + ", " + zzaiwVar.zzb());
        }
        throw new IllegalArgumentException("Length too large: " + i8 + zzb());
    }
}
