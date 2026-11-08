package com.google.android.gms.internal.p395firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzaki {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zzaji.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static int zza(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    public static <T> T zza(T t7) {
        t7.getClass();
        return t7;
    }

    public static <T> T zza(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }

    public static boolean zza(zzaln zzalnVar) {
        boolean z6 = zzalnVar instanceof zzaio;
        return false;
    }
}
