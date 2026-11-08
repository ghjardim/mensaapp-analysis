package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzkd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzkd(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.recaptcha.internal.zzjf.zzc(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.recaptcha.internal.zzjf.zzc(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkd.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkd) {
            zzkd zzkdVar = (zzkd) obj;
            boolean z6 = zzkdVar.zzi;
            if (Arrays.equals(this.zzf, zzkdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i7) {
        return this.zzf[i7];
    }

    public final int zzb(char c7) {
        if (c7 > 127) {
            throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c7))));
        }
        byte b7 = this.zzg[c7];
        if (b7 != -1) {
            return b7;
        }
        if (c7 <= ' ' || c7 == 127) {
            throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c7))));
        }
        throw new zzkf("Unrecognized character: " + c7);
    }

    public final boolean zzc(int i7) {
        return this.zzh[i7 % this.zzc];
    }

    public final boolean zzd(char c7) {
        return this.zzg[61] != -1;
    }

    private zzkd(String str, char[] cArr, byte[] bArr, boolean z6) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzkj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.zzd; i8++) {
                zArr[zzkj.zza(i8 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
        }
    }
}
