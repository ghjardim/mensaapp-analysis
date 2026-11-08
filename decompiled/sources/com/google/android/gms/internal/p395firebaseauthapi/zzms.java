package com.google.android.gms.internal.p395firebaseauthapi;

import java.math.BigInteger;

/* loaded from: classes.dex */
final class zzms {
    static final zzms zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzms(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzms(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
