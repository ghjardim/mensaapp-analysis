package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzom {
    public static /* bridge */ /* synthetic */ void zza(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) {
        if (zze(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || zze(b9) || zze(b10)) {
            throw new zzmm("Protocol message had invalid UTF-8.");
        }
        int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b7, byte b8, byte b9, char[] cArr, int i7) {
        if (!zze(b8)) {
            if (b7 == -32) {
                if (b8 >= -96) {
                    b7 = -32;
                }
            }
            if (b7 == -19) {
                if (b8 < -96) {
                    b7 = -19;
                }
            }
            if (!zze(b9)) {
                cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                return;
            }
        }
        throw new zzmm("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b7, byte b8, char[] cArr, int i7) {
        if (b7 < -62 || zze(b8)) {
            throw new zzmm("Protocol message had invalid UTF-8.");
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b7) {
        return b7 >= 0;
    }

    private static boolean zze(byte b7) {
        return b7 > -65;
    }
}
