package com.google.android.recaptcha.internal;

import p125R5.AbstractC2291q;
import p132S5.AbstractC2336K;
import p371w5.AbstractC6924g;
import p371w5.InterfaceC6923f;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class zzff {
    private final InterfaceC6923f zza;
    private final InterfaceC6923f zzb;
    private final InterfaceC6923f zzc;

    public zzff() {
        int i7 = zzav.zza;
        this.zza = AbstractC6924g.m28367a(zzfc.zza);
        this.zzb = AbstractC6924g.m28367a(zzfd.zza);
        this.zzc = AbstractC6924g.m28367a(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, InterfaceC7157e interfaceC7157e) {
        try {
            String zzl = zzscVar.zzl();
            String zzM = zzscVar.zzM();
            zzaq zzf = zzffVar.zzf();
            String str = null;
            if (zzf != null && zzf.zzd(zzM)) {
                zzen zzf2 = zzekVar.zzf(25);
                try {
                    String zza = zzffVar.zzf().zza(zzM);
                    if (zza != null) {
                        zzf2.zza();
                        str = zza;
                    }
                } catch (Exception e7) {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzR, e7.getMessage()));
                }
                zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
            }
            if (str == null) {
                zzaq zzf3 = zzffVar.zzf();
                if (zzf3 != null) {
                    zzf3.zzb();
                }
                zzen zzf4 = zzekVar.zzf(23);
                try {
                    str = zzffVar.zzg().zzb(zzl);
                    zzf4.zza();
                    zzen zzf5 = zzekVar.zzf(24);
                    try {
                        zzaq zzf6 = zzffVar.zzf();
                        if (zzf6 != null) {
                            zzf6.zzc(zzM, str);
                        }
                        zzf5.zza();
                    } catch (Exception e8) {
                        zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e8.getMessage()));
                    }
                } catch (zzbd e9) {
                    zzf4.zzb(e9);
                    throw e9;
                }
            }
            return AbstractC2291q.m7743s(zzscVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, null);
        } catch (Exception e10) {
            if (e10 instanceof zzbd) {
                throw e10;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e10.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, InterfaceC7157e interfaceC7157e) {
        return AbstractC2336K.m7998c(new zzfb(this, str, zztoVar, null), interfaceC7157e);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, InterfaceC7157e interfaceC7157e) {
        return zze(this, zzscVar, zzekVar, interfaceC7157e);
    }
}
