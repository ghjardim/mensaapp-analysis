package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0058b;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0800l;
import p132S5.InterfaceC2412w;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzea extends AbstractC0068l implements InterfaceC0800l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC2412w zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j7, InterfaceC2412w interfaceC2412w, InterfaceC7157e interfaceC7157e) {
        super(1, interfaceC7157e);
        this.zzc = zzecVar;
        this.zzd = j7;
        this.zze = interfaceC2412w;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
        return new zzea(this.zzc, this.zzd, this.zze, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0800l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((InterfaceC7157e) obj)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzbd e7;
        zzdt zzdtVar;
        zzen zzenVar2;
        zzdt zzdtVar2;
        zzcj zzcjVar;
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zzb;
        if (i7 == 0) {
            AbstractC6928k.m28382b(obj);
            zzekVar = this.zzc.zzb;
            zzen zzf = zzekVar.zzf(41);
            try {
                zzdtVar = this.zzc.zza;
                long j7 = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzdtVar.zzo(j7, this);
                if (zzo != m76e) {
                    zzenVar2 = zzf;
                    obj = zzo;
                }
                return m76e;
            } catch (zzbd e8) {
                zzenVar = zzf;
                e7 = e8;
                this.zzc.zzd = e7;
                zzenVar.zzb(e7);
                throw e7;
            }
        }
        if (i7 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                AbstractC6928k.m28382b(obj);
                zzenVar.zza();
                zzec zzecVar = this.zzc;
                zzcjVar = zzcm.zzb;
                zzecVar.zzf = zzcjVar;
                return AbstractC0058b.m149a(this.zze.mo8187v(C6934q.f24811a));
            } catch (zzbd e9) {
                e7 = e9;
                this.zzc.zzd = e7;
                zzenVar.zzb(e7);
                throw e7;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            AbstractC6928k.m28382b(obj);
        } catch (zzbd e10) {
            e7 = e10;
            zzenVar = zzenVar2;
            this.zzc.zzd = e7;
            zzenVar.zzb(e7);
            throw e7;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdtVar2 = this.zzc.zza;
        long j8 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j8, this) != m76e) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            zzec zzecVar2 = this.zzc;
            zzcjVar = zzcm.zzb;
            zzecVar2.zzf = zzcjVar;
            return AbstractC0058b.m149a(this.zze.mo8187v(C6934q.f24811a));
        }
        return m76e;
    }
}
