package com.google.android.recaptcha.internal;

import java.util.List;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0058b;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2336K;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzfq extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, interfaceC7157e);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 == 0) {
            InterfaceC2334J interfaceC2334J = (InterfaceC2334J) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !AbstractC2336K.m8000e(interfaceC2334J)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e7) {
                    zzufVar.zzk();
                    AbstractC0058b.m151c(zzufVar.zzg());
                    AbstractC7032w.m28878D(zzufVar.zzj(), null, null, null, 0, null, new zzfp(this.zzd), 31, null);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzftVar.zzh(e7, zzgdVar2, this);
                    if (zzh == m76e) {
                        return m76e;
                    }
                }
            }
            return C6934q.f24811a;
        }
        return C6934q.f24811a;
    }
}
