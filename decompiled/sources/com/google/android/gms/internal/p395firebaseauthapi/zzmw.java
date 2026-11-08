package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class zzmw {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 10; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i8 = 2; i8 < 20; i8 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i9 = 2; i9 < 10; i9 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 50; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i11 = 2; i11 < 100; i11 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j7 = jArr2[0];
        long j8 = jArr3[1] * j7;
        long j9 = jArr2[1];
        long j10 = jArr3[0];
        jArr[1] = j8 + (j9 * j10);
        long j11 = jArr2[1];
        long j12 = jArr3[1];
        jArr[2] = (j11 * 2 * j12) + (jArr3[2] * j7) + (jArr2[2] * j10);
        long j13 = jArr3[2];
        long j14 = jArr2[2];
        jArr[3] = (j11 * j13) + (j14 * j12) + (jArr3[3] * j7) + (jArr2[3] * j10);
        long j15 = jArr3[3];
        long j16 = jArr2[3];
        jArr[4] = (j14 * j13) + (((j11 * j15) + (j16 * j12)) * 2) + (jArr3[4] * j7) + (jArr2[4] * j10);
        long j17 = jArr3[4];
        long j18 = jArr2[4];
        jArr[5] = (j14 * j15) + (j16 * j13) + (j11 * j17) + (j18 * j12) + (jArr3[5] * j7) + (jArr2[5] * j10);
        long j19 = jArr3[5];
        long j20 = jArr2[5];
        jArr[6] = (((j16 * j15) + (j11 * j19) + (j20 * j12)) * 2) + (j14 * j17) + (j18 * j13) + (jArr3[6] * j7) + (jArr2[6] * j10);
        long j21 = jArr3[6];
        long j22 = jArr2[6];
        jArr[7] = (j16 * j17) + (j18 * j15) + (j14 * j19) + (j20 * j13) + (j11 * j21) + (j22 * j12) + (jArr3[7] * j7) + (jArr2[7] * j10);
        long j23 = jArr3[7];
        long j24 = jArr2[7];
        jArr[8] = (j18 * j17) + (((j16 * j19) + (j20 * j15) + (j11 * j23) + (j24 * j12)) * 2) + (j14 * j21) + (j22 * j13) + (jArr3[8] * j7) + (jArr2[8] * j10);
        long j25 = jArr3[8];
        long j26 = jArr2[8];
        jArr[9] = (j18 * j19) + (j20 * j17) + (j16 * j21) + (j22 * j15) + (j14 * j23) + (j24 * j13) + (j11 * j25) + (j26 * j12) + (j7 * jArr3[9]) + (jArr2[9] * j10);
        long j27 = jArr3[9];
        long j28 = jArr2[9];
        jArr[10] = (((j20 * j19) + (j16 * j23) + (j24 * j15) + (j11 * j27) + (j12 * j28)) * 2) + (j18 * j21) + (j22 * j17) + (j14 * j25) + (j26 * j13);
        jArr[11] = (j20 * j21) + (j22 * j19) + (j18 * j23) + (j24 * j17) + (j16 * j25) + (j26 * j15) + (j14 * j27) + (j13 * j28);
        jArr[12] = (j22 * j21) + (((j20 * j23) + (j24 * j19) + (j16 * j27) + (j15 * j28)) * 2) + (j18 * j25) + (j26 * j17);
        jArr[13] = (j22 * j23) + (j24 * j21) + (j20 * j25) + (j26 * j19) + (j18 * j27) + (j17 * j28);
        jArr[14] = (((j24 * j23) + (j20 * j27) + (j19 * j28)) * 2) + (j22 * j25) + (j26 * j21);
        jArr[15] = (j24 * j25) + (j26 * j23) + (j22 * j27) + (j21 * j28);
        jArr[16] = (j26 * j25) + (((j24 * j27) + (j23 * j28)) * 2);
        jArr[17] = (j26 * j27) + (j25 * j28);
        jArr[18] = j28 * 2 * j27;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] - jArr3[i7];
        }
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] + jArr3[i7];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i7;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i8 = 0;
        while (true) {
            if (i8 >= 2) {
                break;
            }
            int i9 = 0;
            while (i9 < 9) {
                long j7 = copyOf[i9];
                int i10 = -((int) (((j7 >> 31) & j7) >> zzd[i9 & 1]));
                copyOf[i9] = j7 + (i10 << r14);
                i9++;
                copyOf[i9] = copyOf[i9] - i10;
            }
            long j8 = copyOf[9];
            copyOf[9] = j8 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j8 >> 31) & j8) >> 25))) * 19);
            i8++;
        }
        long j9 = copyOf[0];
        copyOf[0] = j9 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j9 >> 31) & j9) >> 26)));
        int i11 = 0;
        for (i7 = 2; i11 < i7; i7 = 2) {
            int i12 = 0;
            while (i12 < 9) {
                long j10 = copyOf[i12];
                int i13 = (int) (j10 >> zzd[i12 & 1]);
                copyOf[i12] = j10 & zzc[r15];
                i12++;
                copyOf[i12] = copyOf[i12] + i13;
            }
            i11++;
        }
        copyOf[9] = copyOf[9] & 33554431;
        long j11 = copyOf[0] + (((int) (r9 >> 25)) * 19);
        copyOf[0] = j11;
        int i14 = ~((((int) j11) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) copyOf[i15]) ^ zzc[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i14);
        long j12 = 33554431 & i14;
        copyOf[1] = copyOf[1] - j12;
        for (int i21 = 2; i21 < 10; i21 += 2) {
            copyOf[i21] = copyOf[i21] - (67108863 & i14);
            int i22 = i21 + 1;
            copyOf[i22] = copyOf[i22] - j12;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            copyOf[i23] = copyOf[i23] << zzb[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = 0; i24 < 10; i24++) {
            int i25 = zza[i24];
            long j13 = bArr[i25];
            long j14 = copyOf[i24];
            bArr[i25] = (byte) (j13 | (j14 & 255));
            bArr[i25 + 1] = (byte) (bArr[r5] | ((j14 >> 8) & 255));
            bArr[i25 + 2] = (byte) (bArr[r5] | ((j14 >> 16) & 255));
            bArr[i25 + 3] = (byte) (bArr[r4] | ((j14 >> 24) & 255));
        }
        return bArr;
    }

    public static void zzb(long[] jArr) {
        long j7 = jArr[8];
        long j8 = jArr[18];
        long j9 = j7 + (j8 << 4);
        jArr[8] = j9;
        long j10 = j9 + (j8 << 1);
        jArr[8] = j10;
        jArr[8] = j10 + j8;
        long j11 = jArr[7];
        long j12 = jArr[17];
        long j13 = j11 + (j12 << 4);
        jArr[7] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[7] = j14;
        jArr[7] = j14 + j12;
        long j15 = jArr[6];
        long j16 = jArr[16];
        long j17 = j15 + (j16 << 4);
        jArr[6] = j17;
        long j18 = j17 + (j16 << 1);
        jArr[6] = j18;
        jArr[6] = j18 + j16;
        long j19 = jArr[5];
        long j20 = jArr[15];
        long j21 = j19 + (j20 << 4);
        jArr[5] = j21;
        long j22 = j21 + (j20 << 1);
        jArr[5] = j22;
        jArr[5] = j22 + j20;
        long j23 = jArr[4];
        long j24 = jArr[14];
        long j25 = j23 + (j24 << 4);
        jArr[4] = j25;
        long j26 = j25 + (j24 << 1);
        jArr[4] = j26;
        jArr[4] = j26 + j24;
        long j27 = jArr[3];
        long j28 = jArr[13];
        long j29 = j27 + (j28 << 4);
        jArr[3] = j29;
        long j30 = j29 + (j28 << 1);
        jArr[3] = j30;
        jArr[3] = j30 + j28;
        long j31 = jArr[2];
        long j32 = jArr[12];
        long j33 = j31 + (j32 << 4);
        jArr[2] = j33;
        long j34 = j33 + (j32 << 1);
        jArr[2] = j34;
        jArr[2] = j34 + j32;
        long j35 = jArr[1];
        long j36 = jArr[11];
        long j37 = j35 + (j36 << 4);
        jArr[1] = j37;
        long j38 = j37 + (j36 << 1);
        jArr[1] = j38;
        jArr[1] = j38 + j36;
        long j39 = jArr[0];
        long j40 = jArr[10];
        long j41 = j39 + (j40 << 4);
        jArr[0] = j41;
        long j42 = j41 + (j40 << 1);
        jArr[0] = j42;
        jArr[0] = j42 + j40;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = jArr2[2];
        long j10 = jArr2[3];
        long j11 = jArr2[4];
        long j12 = jArr2[5];
        long j13 = jArr2[6];
        long j14 = jArr2[7];
        long j15 = jArr2[8];
        long j16 = jArr2[9];
        zze(new long[]{j7 * j7, j7 * 2 * j8, ((j8 * j8) + (j7 * j9)) * 2, ((j8 * j9) + (j7 * j10)) * 2, (j9 * j9) + (j8 * 4 * j10) + (j7 * 2 * j11), ((j9 * j10) + (j8 * j11) + (j7 * j12)) * 2, ((j10 * j10) + (j9 * j11) + (j7 * j13) + (j8 * 2 * j12)) * 2, ((j10 * j11) + (j9 * j12) + (j8 * j13) + (j7 * j14)) * 2, (j11 * j11) + (((j9 * j13) + (j7 * j15) + (((j8 * j14) + (j10 * j12)) * 2)) * 2), ((j11 * j12) + (j10 * j13) + (j9 * j14) + (j8 * j15) + (j7 * j16)) * 2, ((j12 * j12) + (j11 * j13) + (j9 * j15) + (((j10 * j14) + (j8 * j16)) * 2)) * 2, ((j12 * j13) + (j11 * j14) + (j10 * j15) + (j9 * j16)) * 2, (j13 * j13) + (((j11 * j15) + (((j12 * j14) + (j10 * j16)) * 2)) * 2), ((j13 * j14) + (j12 * j15) + (j11 * j16)) * 2, ((j14 * j14) + (j13 * j15) + (j12 * 2 * j16)) * 2, ((j14 * j15) + (j13 * j16)) * 2, (j15 * j15) + (j14 * 4 * j16), j15 * 2 * j16, 2 * j16 * j16}, jArr);
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static void zza(long[] jArr) {
        jArr[10] = 0;
        int i7 = 0;
        while (i7 < 10) {
            long j7 = jArr[i7];
            long j8 = j7 / 67108864;
            jArr[i7] = j7 - (j8 << 26);
            int i8 = i7 + 1;
            long j9 = jArr[i8] + j8;
            jArr[i8] = j9;
            long j10 = j9 / 33554432;
            jArr[i8] = j9 - (j10 << 25);
            i7 += 2;
            jArr[i7] = jArr[i7] + j10;
        }
        long j11 = jArr[0];
        long j12 = jArr[10];
        long j13 = j11 + (j12 << 4);
        jArr[0] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[0] = j14;
        long j15 = j14 + j12;
        jArr[0] = j15;
        jArr[10] = 0;
        long j16 = j15 / 67108864;
        jArr[0] = j15 - (j16 << 26);
        jArr[1] = jArr[1] + j16;
    }

    public static void zza(long[] jArr, long[] jArr2, long j7) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] * j7;
        }
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i7 = 0; i7 < 10; i7++) {
            int i8 = zza[i7];
            jArr[i7] = (((((bArr[i8] & ForkServer.ERROR) | ((bArr[i8 + 1] & ForkServer.ERROR) << 8)) | ((bArr[i8 + 2] & ForkServer.ERROR) << 16)) | ((bArr[i8 + 3] & ForkServer.ERROR) << 24)) >> zzb[i7]) & zzc[i7 & 1];
        }
        return jArr;
    }
}
