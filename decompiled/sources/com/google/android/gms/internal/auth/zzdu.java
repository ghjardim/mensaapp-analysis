package com.google.android.gms.internal.auth;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
final class zzdu {
    public static int zza(byte[] bArr, int i7, zzdt zzdtVar) {
        int zzh = zzh(bArr, i7, zzdtVar);
        int i8 = zzdtVar.zza;
        if (i8 < 0) {
            throw zzfb.zzc();
        }
        if (i8 > bArr.length - zzh) {
            throw zzfb.zzf();
        }
        if (i8 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return zzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, zzh, i8);
        return zzh + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & ForkServer.ERROR;
        int i9 = bArr[i7 + 1] & ForkServer.ERROR;
        int i10 = bArr[i7 + 2] & ForkServer.ERROR;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public static int zzc(zzgi zzgiVar, byte[] bArr, int i7, int i8, int i9, zzdt zzdtVar) {
        Object zzd = zzgiVar.zzd();
        int zzl = zzl(zzd, zzgiVar, bArr, i7, i8, i9, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzl;
    }

    public static int zzd(zzgi zzgiVar, byte[] bArr, int i7, int i8, zzdt zzdtVar) {
        Object zzd = zzgiVar.zzd();
        int zzm = zzm(zzd, zzgiVar, bArr, i7, i8, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzm;
    }

    public static int zze(zzgi zzgiVar, int i7, byte[] bArr, int i8, int i9, zzez zzezVar, zzdt zzdtVar) {
        int zzd = zzd(zzgiVar, bArr, i8, i9, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (zzd < i9) {
            int zzh = zzh(bArr, zzd, zzdtVar);
            if (i7 != zzdtVar.zza) {
                break;
            }
            zzd = zzd(zzgiVar, bArr, zzh, i9, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i7, zzdtVar);
        int i8 = zzdtVar.zza + zzh;
        while (zzh < i8) {
            zzh = zzh(bArr, zzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (zzh == i8) {
            return zzh;
        }
        throw zzfb.zzf();
    }

    public static int zzg(int i7, byte[] bArr, int i8, int i9, zzha zzhaVar, zzdt zzdtVar) {
        if ((i7 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int zzk = zzk(bArr, i8, zzdtVar);
            zzhaVar.zzh(i7, Long.valueOf(zzdtVar.zzb));
            return zzk;
        }
        if (i10 == 1) {
            zzhaVar.zzh(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int zzh = zzh(bArr, i8, zzdtVar);
            int i11 = zzdtVar.zza;
            if (i11 < 0) {
                throw zzfb.zzc();
            }
            if (i11 > bArr.length - zzh) {
                throw zzfb.zzf();
            }
            if (i11 == 0) {
                zzhaVar.zzh(i7, zzef.zzb);
            } else {
                zzhaVar.zzh(i7, zzef.zzk(bArr, zzh, i11));
            }
            return zzh + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzha zzd = zzha.zzd();
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int zzh2 = zzh(bArr, i8, zzdtVar);
            int i14 = zzdtVar.zza;
            i13 = i14;
            if (i14 == i12) {
                i8 = zzh2;
                break;
            }
            int zzg = zzg(i13, bArr, zzh2, i9, zzd, zzdtVar);
            i13 = i14;
            i8 = zzg;
        }
        if (i8 > i9 || i13 != i12) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i7, zzd);
        return i8;
    }

    public static int zzh(byte[] bArr, int i7, zzdt zzdtVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzi(b7, bArr, i8, zzdtVar);
        }
        zzdtVar.zza = b7;
        return i8;
    }

    public static int zzi(int i7, byte[] bArr, int i8, zzdt zzdtVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzdtVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzdtVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzdtVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzdtVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzdtVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzj(int i7, byte[] bArr, int i8, int i9, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i8, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (zzh < i9) {
            int zzh2 = zzh(bArr, zzh, zzdtVar);
            if (i7 != zzdtVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i7, zzdt zzdtVar) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            zzdtVar.zzb = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j8 = (j7 & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (r10 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        zzdtVar.zzb = j8;
        return i9;
    }

    public static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i7, int i8, int i9, zzdt zzdtVar) {
        int zzb = ((zzga) zzgiVar).zzb(obj, bArr, i7, i8, i9, zzdtVar);
        zzdtVar.zzc = obj;
        return zzb;
    }

    public static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i7, int i8, zzdt zzdtVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zzi(i10, bArr, i9, zzdtVar);
            i10 = zzdtVar.zza;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw zzfb.zzf();
        }
        int i12 = i10 + i11;
        zzgiVar.zzg(obj, bArr, i11, i12, zzdtVar);
        zzdtVar.zzc = obj;
        return i12;
    }

    public static long zzn(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }
}
