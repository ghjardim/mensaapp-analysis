package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* loaded from: classes.dex */
final class zzlh extends zzlk {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlh(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzb(byte b7) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.zze;
        try {
            int i8 = i7 + 1;
            try {
                this.zzc[i7] = b7;
                this.zze = i8;
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                i7 = i8;
                throw new zzli(i7, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i8);
            this.zze += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzli(this.zze, this.zzd, i8, e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzd(int i7, boolean z6) {
        zzt(i7 << 3);
        zzb(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zze(int i7, zzld zzldVar) {
        zzt((i7 << 3) | 2);
        zzt(zzldVar.zzd());
        zzldVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzf(int i7, int i8) {
        zzt((i7 << 3) | 5);
        zzg(i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzg(int i7) {
        int i8 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.zze = i8 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzli(i8, this.zzd, 4, e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzh(int i7, long j7) {
        zzt((i7 << 3) | 1);
        zzi(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzi(long j7) {
        int i7 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.zze = i7 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzli(i7, this.zzd, 8, e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzj(int i7, int i8) {
        zzt(i7 << 3);
        zzk(i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzk(int i7) {
        if (i7 >= 0) {
            zzt(i7);
        } else {
            zzv(i7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzl(byte[] bArr, int i7, int i8) {
        zzc(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzm(int i7, zznh zznhVar, zzns zznsVar) {
        zzt((i7 << 3) | 2);
        zzt(((zzko) zznhVar).zzca(zznsVar));
        zznsVar.zzi(zznhVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzn(int i7, zznh zznhVar) {
        zzt(11);
        zzs(2, i7);
        zzt(26);
        zzt(zznhVar.zzcf());
        zznhVar.zzcB(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzo(int i7, zzld zzldVar) {
        zzt(11);
        zzs(2, i7);
        zze(3, zzldVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzp(int i7, String str) {
        zzt((i7 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i7 = this.zze;
        try {
            int zzz = zzlk.zzz(str.length() * 3);
            int zzz2 = zzlk.zzz(str.length());
            if (zzz2 != zzz) {
                zzt(zzoo.zzc(str));
                byte[] bArr = this.zzc;
                int i8 = this.zze;
                this.zze = zzoo.zzb(str, bArr, i8, this.zzd - i8);
                return;
            }
            int i9 = i7 + zzz2;
            this.zze = i9;
            int zzb = zzoo.zzb(str, this.zzc, i9, this.zzd - i9);
            this.zze = i7;
            zzt((zzb - i7) - zzz2);
            this.zze = zzb;
        } catch (zzon e7) {
            this.zze = i7;
            zzC(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzli(e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzr(int i7, int i8) {
        zzt((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzs(int i7, int i8) {
        zzt(i7 << 3);
        zzt(i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzt(int i7) {
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.zze;
        while ((i7 & (-128)) != 0) {
            try {
                i8 = i9 + 1;
                try {
                    this.zzc[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                    i9 = i8;
                    throw new zzli(i9, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException = e8;
                throw new zzli(i9, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.zzc[i9] = (byte) i7;
        this.zze = i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzu(int i7, long j7) {
        zzt(i7 << 3);
        zzv(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzv(long j7) {
        boolean z6;
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i8;
        int i9 = this.zze;
        z6 = zzlk.zzd;
        if (!z6 || this.zzd - i9 < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    i8 = i9 + 1;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                }
                try {
                    this.zzc[i9] = (byte) (((int) j7) | 128);
                    j7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e8) {
                    e = e8;
                    i9 = i8;
                    indexOutOfBoundsException = e;
                    throw new zzli(i9, this.zzd, 1, indexOutOfBoundsException);
                }
            }
            i7 = i9 + 1;
            try {
                this.zzc[i9] = (byte) j7;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i9 = i7;
                throw new zzli(i9, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j7 & (-128)) != 0) {
                zzol.zzn(this.zzc, i9, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i9++;
            }
            i7 = i9 + 1;
            zzol.zzn(this.zzc, i9, (byte) j7);
        }
        this.zze = i7;
    }
}
