package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzfb extends AbstractC0068l implements InterfaceC0804p {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzfb(this.zza, this.zzb, this.zzc, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzey zzg;
        AbstractC0024c.m76e();
        AbstractC6928k.m28382b(obj);
        try {
            if (!zzff.zzb(this.zza).zzb(this.zzb)) {
                throw new zzbd(zzbb.zzc, zzba.zzQ, null);
            }
            zzg = this.zza.zzg();
            return zzg.zza(this.zzb, this.zzc);
        } catch (zzbd e7) {
            throw e7;
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e8.getMessage());
        }
    }
}
