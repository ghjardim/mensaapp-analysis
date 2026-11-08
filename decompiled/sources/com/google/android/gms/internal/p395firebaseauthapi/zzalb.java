package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
final class zzalb implements zzamf {
    private static final zzalk zza = new zzala();
    private final zzalk zzb;

    public zzalb() {
        this(new zzalc(zzakh.zza(), zza));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzamf
    public final <T> zzamc<T> zza(Class<T> cls) {
        zzame.zza((Class<?>) cls);
        zzall zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzalt.zza(zzame.zza(), zzajz.zza(), zza2.zza());
        }
        return zzalr.zza(cls, zza2, zzalx.zza(), zzakz.zza(), zzame.zza(), zzald.zza[zza2.zzb().ordinal()] != 1 ? zzajz.zza() : null, zzali.zza());
    }

    private zzalb(zzalk zzalkVar) {
        this.zzb = (zzalk) zzaki.zza(zzalkVar, "messageInfoFactory");
    }
}
