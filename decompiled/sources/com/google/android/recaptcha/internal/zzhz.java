package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p371w5.AbstractC6931n;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) {
        zzhu zzhuVar;
        if (str.length() == 0) {
            throw new zzce(3, 17, null);
        }
        try {
            long zza = this.zza.zza(AbstractC7032w.m28890P(list));
            zzhuVar = zzhv.zza;
            zzhv zzhvVar = new zzhv(zza, 255L, zzhuVar);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                sb.append((char) AbstractC6931n.m28384b(AbstractC6931n.m28384b(str.charAt(i7)) ^ AbstractC6931n.m28384b((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
        } catch (Exception e7) {
            throw new zzce(3, 18, e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) {
        zzjh zzb = zzjh.zzb();
        zztz zzb2 = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), zza);
        return zzb2;
    }
}
