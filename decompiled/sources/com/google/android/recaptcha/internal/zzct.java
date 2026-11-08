package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzct extends AbstractC0068l implements InterfaceC0804p {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcvVar, String str, long j7, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j7;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, interfaceC7157e);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzcn zzcnVar;
        Object m76e = AbstractC0024c.m76e();
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            AbstractC6928k.m28382b(obj);
        } else {
            AbstractC6928k.m28382b(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zza = zzcv.zza(this.zzd, this.zze);
            if (zza != null) {
                return zza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVar2 = this.zzg;
            if (zzcnVar2 == null) {
                zzcnVar2 = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            long j7 = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVar2;
            this.zzb = 1;
            if (zzcnVar2.zzb(j7, this) == m76e) {
                return m76e;
            }
            zzcnVar = zzcnVar2;
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        this.zzd.zzc = zzdcVar;
        return zzdcVar;
    }
}
