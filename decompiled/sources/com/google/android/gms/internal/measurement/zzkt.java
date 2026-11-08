package com.google.android.gms.internal.measurement;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
final class zzkt {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzks zzksVar) {
        int zzh = zzh(bArr, i7, zzksVar);
        int i8 = zzksVar.zza;
        if (i8 < 0) {
            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - zzh) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            zzksVar.zzc = zzld.zzb;
            return zzh;
        }
        zzksVar.zzc = zzld.zzj(bArr, zzh, i8);
        return zzh + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & ForkServer.ERROR;
        int i9 = bArr[i7 + 1] & ForkServer.ERROR;
        int i10 = bArr[i7 + 2] & ForkServer.ERROR;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public static int zzc(zzns zznsVar, byte[] bArr, int i7, int i8, int i9, zzks zzksVar) {
        Object zze = zznsVar.zze();
        int zzl = zzl(zze, zznsVar, bArr, i7, i8, i9, zzksVar);
        zznsVar.zzf(zze);
        zzksVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzns zznsVar, byte[] bArr, int i7, int i8, zzks zzksVar) {
        Object zze = zznsVar.zze();
        int zzm = zzm(zze, zznsVar, bArr, i7, i8, zzksVar);
        zznsVar.zzf(zze);
        zzksVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzns zznsVar, int i7, byte[] bArr, int i8, int i9, zzmj zzmjVar, zzks zzksVar) {
        int zzd = zzd(zznsVar, bArr, i8, i9, zzksVar);
        zzmjVar.add(zzksVar.zzc);
        while (zzd < i9) {
            int zzh = zzh(bArr, zzd, zzksVar);
            if (i7 != zzksVar.zza) {
                break;
            }
            zzd = zzd(zznsVar, bArr, zzh, i9, zzksVar);
            zzmjVar.add(zzksVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zzmj zzmjVar, zzks zzksVar) {
        zzme zzmeVar = (zzme) zzmjVar;
        int zzh = zzh(bArr, i7, zzksVar);
        int i8 = zzksVar.zza + zzh;
        while (zzh < i8) {
            zzh = zzh(bArr, zzh, zzksVar);
            zzmeVar.zzh(zzksVar.zza);
        }
        if (zzh == i8) {
            return zzh;
        }
        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i7, byte[] bArr, int i8, int i9, zzof zzofVar, zzks zzksVar) {
        if ((i7 >>> 3) == 0) {
            throw new zzmm("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int zzk = zzk(bArr, i8, zzksVar);
            zzofVar.zzj(i7, Long.valueOf(zzksVar.zzb));
            return zzk;
        }
        if (i10 == 1) {
            zzofVar.zzj(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int zzh = zzh(bArr, i8, zzksVar);
            int i11 = zzksVar.zza;
            if (i11 < 0) {
                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - zzh) {
                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzofVar.zzj(i7, zzld.zzb);
            } else {
                zzofVar.zzj(i7, zzld.zzj(bArr, zzh, i11));
            }
            return zzh + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzmm("Protocol message contained an invalid tag (zero).");
            }
            zzofVar.zzj(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzof zzf = zzof.zzf();
        int i13 = zzksVar.zze + 1;
        zzksVar.zze = i13;
        zzo(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int zzh2 = zzh(bArr, i8, zzksVar);
            i14 = zzksVar.zza;
            if (i14 == i12) {
                i8 = zzh2;
                break;
            }
            i8 = zzg(i14, bArr, zzh2, i9, zzf, zzksVar);
        }
        zzksVar.zze--;
        if (i8 > i9 || i14 != i12) {
            throw new zzmm("Failed to parse the message.");
        }
        zzofVar.zzj(i7, zzf);
        return i8;
    }

    public static int zzh(byte[] bArr, int i7, zzks zzksVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzi(b7, bArr, i8, zzksVar);
        }
        zzksVar.zza = b7;
        return i8;
    }

    public static int zzi(int i7, byte[] bArr, int i8, zzks zzksVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzksVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzksVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzksVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzksVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzksVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzj(int i7, byte[] bArr, int i8, int i9, zzmj zzmjVar, zzks zzksVar) {
        zzme zzmeVar = (zzme) zzmjVar;
        int zzh = zzh(bArr, i8, zzksVar);
        zzmeVar.zzh(zzksVar.zza);
        while (zzh < i9) {
            int zzh2 = zzh(bArr, zzh, zzksVar);
            if (i7 != zzksVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzksVar);
            zzmeVar.zzh(zzksVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i7, zzks zzksVar) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            zzksVar.zzb = j7;
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
        zzksVar.zzb = j8;
        return i9;
    }

    public static int zzl(Object obj, zzns zznsVar, byte[] bArr, int i7, int i8, int i9, zzks zzksVar) {
        zznk zznkVar = (zznk) zznsVar;
        int i10 = zzksVar.zze + 1;
        zzksVar.zze = i10;
        zzo(i10);
        int zzc = zznkVar.zzc(obj, bArr, i7, i8, i9, zzksVar);
        zzksVar.zze--;
        zzksVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzns zznsVar, byte[] bArr, int i7, int i8, zzks zzksVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zzi(i10, bArr, i9, zzksVar);
            i10 = zzksVar.zza;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = zzksVar.zze + 1;
        zzksVar.zze = i12;
        zzo(i12);
        int i13 = i10 + i11;
        zznsVar.zzh(obj, bArr, i11, i13, zzksVar);
        zzksVar.zze--;
        zzksVar.zzc = obj;
        return i13;
    }

    public static long zzn(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    private static void zzo(int i7) {
        if (i7 >= zzb) {
            throw new zzmm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
