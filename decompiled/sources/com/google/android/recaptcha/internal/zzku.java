package com.google.android.recaptcha.internal;

import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzkt zzktVar) {
        int zzi = zzi(bArr, i7, zzktVar);
        int i8 = zzktVar.zza;
        if (i8 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            zzktVar.zzc = zzle.zzb;
            return zzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, zzi, i8);
        return zzi + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & ForkServer.ERROR;
        int i9 = bArr[i7 + 1] & ForkServer.ERROR;
        int i10 = bArr[i7 + 2] & ForkServer.ERROR;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public static int zzc(zzow zzowVar, byte[] bArr, int i7, int i8, int i9, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzm = zzm(zze, zzowVar, bArr, i7, i8, i9, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzow zzowVar, byte[] bArr, int i7, int i8, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzn = zzn(zze, zzowVar, bArr, i7, i8, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzow zzowVar, int i7, byte[] bArr, int i8, int i9, zznk zznkVar, zzkt zzktVar) {
        int zzd = zzd(zzowVar, bArr, i8, i9, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (zzd < i9) {
            int zzi = zzi(bArr, zzd, zzktVar);
            if (i7 != zzktVar.zza) {
                break;
            }
            zzd = zzd(zzowVar, bArr, zzi, i9, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i7, zzktVar);
        int i8 = zzktVar.zza + zzi;
        while (zzi < i8) {
            zzi = zzi(bArr, zzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (zzi == i8) {
            return zzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i7, zzkt zzktVar) {
        int zzi = zzi(bArr, i7, zzktVar);
        int i8 = zzktVar.zza;
        if (i8 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 == 0) {
            zzktVar.zzc = StringUtils.EMPTY;
            return zzi;
        }
        zzktVar.zzc = new String(bArr, zzi, i8, zznl.zza);
        return zzi + i8;
    }

    public static int zzh(int i7, byte[] bArr, int i8, int i9, zzpm zzpmVar, zzkt zzktVar) {
        if ((i7 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int zzl = zzl(bArr, i8, zzktVar);
            zzpmVar.zzj(i7, Long.valueOf(zzktVar.zzb));
            return zzl;
        }
        if (i10 == 1) {
            zzpmVar.zzj(i7, Long.valueOf(zzp(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int zzi = zzi(bArr, i8, zzktVar);
            int i11 = zzktVar.zza;
            if (i11 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - zzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzpmVar.zzj(i7, zzle.zzb);
            } else {
                zzpmVar.zzj(i7, zzle.zzk(bArr, zzi, i11));
            }
            return zzi + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzpm zzf = zzpm.zzf();
        int i13 = zzktVar.zze + 1;
        zzktVar.zze = i13;
        zzq(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int zzi2 = zzi(bArr, i8, zzktVar);
            i14 = zzktVar.zza;
            if (i14 == i12) {
                i8 = zzi2;
                break;
            }
            i8 = zzh(i14, bArr, zzi2, i9, zzf, zzktVar);
        }
        zzktVar.zze--;
        if (i8 > i9 || i14 != i12) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i7, zzf);
        return i8;
    }

    public static int zzi(byte[] bArr, int i7, zzkt zzktVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzj(b7, bArr, i8, zzktVar);
        }
        zzktVar.zza = b7;
        return i8;
    }

    public static int zzj(int i7, byte[] bArr, int i8, zzkt zzktVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzktVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzktVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzktVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzktVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzktVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzk(int i7, byte[] bArr, int i8, int i9, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i8, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (zzi < i9) {
            int zzi2 = zzi(bArr, zzi, zzktVar);
            if (i7 != zzktVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i7, zzkt zzktVar) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            zzktVar.zzb = j7;
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
        zzktVar.zzb = j8;
        return i9;
    }

    public static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i7, int i8, int i9, zzkt zzktVar) {
        zzol zzolVar = (zzol) zzowVar;
        int i10 = zzktVar.zze + 1;
        zzktVar.zze = i10;
        zzq(i10);
        int zzc = zzolVar.zzc(obj, bArr, i7, i8, i9, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i7, int i8, zzkt zzktVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zzj(i10, bArr, i9, zzktVar);
            i10 = zzktVar.zza;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = zzktVar.zze + 1;
        zzktVar.zze = i12;
        zzq(i12);
        int i13 = i10 + i11;
        zzowVar.zzi(obj, bArr, i11, i13, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i13;
    }

    public static int zzo(int i7, byte[] bArr, int i8, int i9, zzkt zzktVar) {
        if ((i7 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return zzl(bArr, i8, zzktVar);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return zzi(bArr, i8, zzktVar) + zzktVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = zzi(bArr, i8, zzktVar);
            i12 = zzktVar.zza;
            if (i12 == i11) {
                break;
            }
            i8 = zzo(i12, bArr, i8, i9, zzktVar);
        }
        if (i8 > i9 || i12 != i11) {
            throw new zznn("Failed to parse the message.");
        }
        return i8;
    }

    public static long zzp(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    private static void zzq(int i7) {
        if (i7 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
