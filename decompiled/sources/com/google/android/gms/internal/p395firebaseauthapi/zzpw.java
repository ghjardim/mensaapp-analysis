package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
public final class zzpw extends RuntimeException {
    public zzpw(String str) {
        super(str);
    }

    public static <T> T zza(zzpz<T> zzpzVar) {
        try {
            return zzpzVar.zza();
        } catch (Exception e7) {
            throw new zzpw(e7);
        }
    }

    private zzpw(Throwable th) {
        super(th);
    }

    public zzpw(String str, Throwable th) {
        super(str, th);
    }
}
