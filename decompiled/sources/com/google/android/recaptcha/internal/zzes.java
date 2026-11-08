package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2334J;
import p371w5.C6925h;
import p371w5.C6934q;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final InterfaceC2334J zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, InterfaceC2334J interfaceC2334J) {
        zzei zzeiVar;
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = interfaceC2334J;
        zzei zzeiVar2 = null;
        try {
            zzeiVar = zzei.zzd;
            zzeiVar = zzeiVar == null ? new zzei(context, null) : zzeiVar;
            zzei.zzd = zzeiVar;
            zzeiVar2 = zzeiVar;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zztx zzk;
        int zzN;
        int i7;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            for (List<zzej> list : AbstractC7032w.m28894T(zzeiVar2.zzd(), 20, 20, true)) {
                zzrd zzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        zzN = zzk.zzN();
                        i7 = zzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (zzN == 0) {
                        throw null;
                    }
                    if (i7 == 0) {
                        zzi.zzq(zzk.zzf());
                    } else if (i7 == 1) {
                        zzi.zzr(zzk.zzg());
                    } else {
                        if (i7 != 2) {
                            throw new C6925h();
                        }
                        C6934q c6934q = C6934q.f24811a;
                    }
                    arrayList.add(zzejVar);
                }
                if (zzi.zze() + zzi.zzf() != 0) {
                    if (this.zzc.zza(((zzrf) zzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        AbstractC2388k.m8128d(this.zzd, null, null, new zzer(this, zztxVar, null), 3, null);
        zzh();
    }
}
