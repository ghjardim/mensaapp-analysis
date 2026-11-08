package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p006A5.AbstractC0024c;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2334J;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class zzft implements zzfo {
    private final InterfaceC2334J zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(InterfaceC2334J interfaceC2334J, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = interfaceC2334J;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int zzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (zza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbk.zza;
        int zzk = zzufVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, InterfaceC7157e interfaceC7157e) {
        Object m7998c = AbstractC2336K.m7998c(new zzfq(zzgdVar, list, this, null), interfaceC7157e);
        return m7998c == AbstractC0024c.m76e() ? m7998c : C6934q.f24811a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, InterfaceC7157e interfaceC7157e) {
        Object m7998c = AbstractC2336K.m7998c(new zzfr(exc, zzgdVar, this, null), interfaceC7157e);
        return m7998c == AbstractC0024c.m76e() ? m7998c : C6934q.f24811a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        AbstractC2388k.m8128d(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3, null);
    }
}
