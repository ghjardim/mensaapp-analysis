package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzkl {
    public static void zza(boolean z6, String str, long j7, long j8) {
        if (z6) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j7 + ", " + j8 + ")");
    }

    public static void zzb(boolean z6) {
        if (!z6) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
