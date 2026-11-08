package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p368w2.C6870k;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdh extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzdtVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzdh(this.zzb, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Application zzr;
        String str;
        Application zzr2;
        zzek zzekVar;
        zzbf zzt;
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 == 0) {
            zzbs zzbsVar = new zzbs(C6870k.m28272f());
            zzr = this.zzb.zzr();
            int zza = zzbsVar.zza(zzr);
            zzdt zzdtVar = this.zzb;
            str = zzdtVar.zza;
            zzr2 = zzdtVar.zzr();
            String packageName = zzr2.getPackageName();
            zzekVar = this.zzb.zzb;
            String zzd = zzekVar.zzd();
            zzt = this.zzb.zzt();
            int i8 = Build.VERSION.SDK_INT;
            String zza2 = zzt.zza();
            zztn zzf = zzto.zzf();
            zzf.zzt(str);
            zzf.zzq(packageName);
            zzf.zzu(zza);
            zzf.zzr("18.6.1");
            zzf.zzs(zzd);
            zzf.zzf(String.valueOf(i8));
            zzf.zze(zza2);
            zzto zztoVar = (zzto) zzf.zzk();
            zzdt zzdtVar2 = this.zzb;
            zzff zzg = zzdt.zzg(zzdtVar2);
            String zzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzg.zzc(zzb, zztoVar, this);
            if (obj == m76e) {
                return m76e;
            }
        }
        return obj;
    }
}
