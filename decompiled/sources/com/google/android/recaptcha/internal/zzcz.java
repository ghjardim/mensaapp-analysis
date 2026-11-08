package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzcz extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j7, RecaptchaAction recaptchaAction, String str, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzdcVar;
        this.zzc = j7;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzcn zzcnVar;
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j7 = this.zzc;
            zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j7, this);
            if (obj == m76e) {
                return m76e;
            }
        }
        return C6927j.m28372a(C6927j.m28373b((String) obj));
    }
}
