package com.google.android.recaptcha.internal;

import p371w5.AbstractC6924g;
import p371w5.AbstractC6930m;
import p371w5.C6934q;
import p371w5.InterfaceC6923f;
import p378x5.AbstractC7004D;
import p378x5.AbstractC7023n;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final InterfaceC6923f zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i7 = zzav.zza;
        this.zzb = AbstractC6924g.m28367a(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, InterfaceC7157e interfaceC7157e) {
        zzen zzb = zzz.zzb(this, str);
        String zza = zzg().zza();
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza);
        zzf.zze(AbstractC7023n.m28856b(zzf2.zzk()));
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, InterfaceC7157e interfaceC7157e) {
        zzen zzc = zzz.zzc(this);
        if (zzseVar.zzl().length() == 0) {
            this.zzc = false;
            zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return C6934q.f24811a;
        }
        zzg().zzb(AbstractC7004D.m28733b(AbstractC6930m.m28383a("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzc.zza();
        return C6934q.f24811a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
