package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p132S5.InterfaceC2412w;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzeb extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC2412w zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC2412w interfaceC2412w, long j7, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzecVar;
        this.zzc = interfaceC2412w;
        this.zzd = j7;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzeb(this.zzb, this.zzc, this.zzd, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzci zzciVar;
        Object m76e = AbstractC0024c.m76e();
        try {
            if (this.zza != 0) {
                AbstractC6928k.m28382b(obj);
            } else {
                AbstractC6928k.m28382b(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == m76e) {
                    return m76e;
                }
            }
            ((Boolean) obj).booleanValue();
        } catch (zzbd e7) {
            zzec zzecVar = this.zzb;
            zzciVar = zzcm.zzd;
            zzecVar.zzf = zzciVar;
            this.zzc.mo8186r(e7);
        }
        return C6934q.f24811a;
    }
}
