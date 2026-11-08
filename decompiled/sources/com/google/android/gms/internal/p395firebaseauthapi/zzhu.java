package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class zzhu {
    private static long zza(byte[] bArr, int i7, int i8) {
        return (zza(bArr, i7) >> i8) & 67108863;
    }

    private static long zza(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16)) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j7, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j7);
            i8++;
            j7 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long zza = zza(bArr, 0, 0) & 67108863;
            long zza2 = zza(bArr, 3, 2) & 67108611;
            long zza3 = zza(bArr, 6, 4) & 67092735;
            long zza4 = zza(bArr, 9, 6) & 66076671;
            long zza5 = zza(bArr, 12, 8) & 1048575;
            long j7 = zza2 * 5;
            long j8 = zza3 * 5;
            long j9 = zza4 * 5;
            long j10 = zza5 * 5;
            int i7 = 17;
            byte[] bArr3 = new byte[17];
            long j11 = 0;
            int i8 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            while (i8 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i7, (byte) 0);
                }
                long zza6 = j15 + zza(bArr3, 0, 0);
                long zza7 = j11 + zza(bArr3, 3, 2);
                long zza8 = j12 + zza(bArr3, 6, 4);
                long zza9 = j13 + zza(bArr3, 9, 6);
                long zza10 = j14 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j16 = (zza6 * zza) + (zza7 * j10) + (zza8 * j9) + (zza9 * j8) + (zza10 * j7);
                long j17 = (zza6 * zza2) + (zza7 * zza) + (zza8 * j10) + (zza9 * j9) + (zza10 * j8);
                long j18 = (zza6 * zza3) + (zza7 * zza2) + (zza8 * zza) + (zza9 * j10) + (zza10 * j9);
                long j19 = (zza6 * zza4) + (zza7 * zza3) + (zza8 * zza2) + (zza9 * zza) + (zza10 * j10);
                long j20 = j17 + (j16 >> 26);
                long j21 = j18 + (j20 >> 26);
                long j22 = j19 + (j21 >> 26);
                long j23 = (zza6 * zza5) + (zza7 * zza4) + (zza8 * zza3) + (zza9 * zza2) + (zza10 * zza) + (j22 >> 26);
                long j24 = (j16 & 67108863) + ((j23 >> 26) * 5);
                j11 = (j20 & 67108863) + (j24 >> 26);
                i8 += 16;
                j12 = j21 & 67108863;
                j13 = j22 & 67108863;
                j14 = j23 & 67108863;
                i7 = 17;
                j15 = j24 & 67108863;
            }
            long j25 = j12 + (j11 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j13 + (j25 >> 26);
            long j28 = j27 & 67108863;
            long j29 = j14 + (j27 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j15 + ((j29 >> 26) * 5);
            long j32 = j31 & 67108863;
            long j33 = (j11 & 67108863) + (j31 >> 26);
            long j34 = j32 + 5;
            long j35 = j34 & 67108863;
            long j36 = (j34 >> 26) + j33;
            long j37 = j26 + (j36 >> 26);
            long j38 = j28 + (j37 >> 26);
            long j39 = (j30 + (j38 >> 26)) - 67108864;
            long j40 = j39 >> 63;
            long j41 = ~j40;
            long j42 = (j33 & j40) | (j36 & 67108863 & j41);
            long j43 = (j26 & j40) | (j37 & 67108863 & j41);
            long j44 = (j28 & j40) | (j38 & 67108863 & j41);
            long j45 = ((j42 << 26) | (j32 & j40) | (j35 & j41)) & 4294967295L;
            long j46 = ((j42 >> 6) | (j43 << 20)) & 4294967295L;
            long j47 = ((j43 >> 12) | (j44 << 14)) & 4294967295L;
            long j48 = ((((j39 & j41) | (j30 & j40)) << 8) | (j44 >> 18)) & 4294967295L;
            long zza11 = j45 + zza(bArr, 16);
            long j49 = zza11 & 4294967295L;
            long zza12 = j46 + zza(bArr, 20) + (zza11 >> 32);
            long zza13 = j47 + zza(bArr, 24) + (zza12 >> 32);
            long zza14 = (j48 + zza(bArr, 28) + (zza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j49, 0);
            zza(bArr4, zza12 & 4294967295L, 4);
            zza(bArr4, zza13 & 4294967295L, 8);
            zza(bArr4, zza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
