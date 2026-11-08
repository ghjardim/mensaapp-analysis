package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzia extends zzmd implements zzni {
    private static final zzia zzb;
    private int zzd;
    private int zze = 1;
    private zzmj zzf = zzmd.zzcn();

    static {
        zzia zziaVar = new zzia();
        zzb = zziaVar;
        zzmd.zzct(zzia.class, zziaVar);
    }

    private zzia() {
    }

    public static zzhy zza() {
        return (zzhy) zzb.zzcg();
    }

    public static /* synthetic */ void zzc(zzia zziaVar, zzho zzhoVar) {
        zzhoVar.getClass();
        zzmj zzmjVar = zziaVar.zzf;
        if (!zzmjVar.zzc()) {
            zziaVar.zzf = zzmd.zzco(zzmjVar);
        }
        zziaVar.zzf.add(zzhoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzhz.zza, "zzf", zzho.class});
        }
        if (i8 == 3) {
            return new zzia();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzhy(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
