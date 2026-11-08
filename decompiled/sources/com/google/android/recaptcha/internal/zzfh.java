package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzfh extends AbstractC0068l implements InterfaceC0804p {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzfh(this.zza, this.zzb, this.zzc, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        AbstractC0024c.m76e();
        AbstractC6928k.m28382b(obj);
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = zzfj.zza(this.zza).zza(this.zzb.zzd());
                    zzewVar.zzc();
                    zzewVar.zze(this.zzc.zzd());
                    zzsr zzsrVar = (zzsr) zzewVar.zza(zzsr.zzi());
                    zzewVar.zzd();
                    return zzsrVar;
                } catch (zzbd e7) {
                    throw e7;
                }
            } catch (Exception e8) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e8.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th;
        }
    }
}
