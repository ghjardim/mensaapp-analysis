package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzmz implements zznt {
    private static final zznf zza = new zzmx();
    private final zznf zzb;

    public zzmz() {
        zzly zza2 = zzly.zza();
        int i7 = zznp.zza;
        zzmy zzmyVar = new zzmy(zza2, zza);
        byte[] bArr = zzmk.zzb;
        this.zzb = zzmyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final zzns zza(Class cls) {
        int i7 = zznu.zza;
        if (!zzmd.class.isAssignableFrom(cls)) {
            int i8 = zznp.zza;
        }
        zzne zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i9 = zznp.zza;
            return zznl.zzc(zznu.zzm(), zzls.zza(), zzb.zza());
        }
        int i10 = zznp.zza;
        return zznk.zzl(cls, zzb, zznn.zza(), zzmv.zza(), zznu.zzm(), zzb.zzc() + (-1) != 1 ? zzls.zza() : null, zznd.zza());
    }
}
