package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public abstract class zzcc {
    static final zzcc zza;
    public static final /* synthetic */ int zzb = 0;

    static {
        zzbu zzbuVar = new zzbu();
        zzbuVar.zza(StringUtils.EMPTY);
        zzbuVar.zzb(false);
        zzbuVar.zzd(1);
        zzbuVar.zze(1);
        zzbuVar.zzc();
        zzbu zzbuVar2 = new zzbu();
        zzbuVar2.zza(StringUtils.EMPTY);
        zzbuVar2.zzb(false);
        zzbuVar2.zzd(4);
        zzbuVar2.zze(1);
        zza = zzbuVar2.zzc();
        zzbu zzbuVar3 = new zzbu();
        zzbuVar3.zza(StringUtils.EMPTY);
        zzbuVar3.zzb(false);
        zzbuVar3.zzd(2);
        zzbuVar3.zze(1);
        zzbuVar3.zzc();
    }

    public abstract zzbs zza();

    public abstract zzbt zzb();

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract int zze();

    public abstract int zzf();
}
