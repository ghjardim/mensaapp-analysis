package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzda extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j7, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j7;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzda(this.zzb, this.zzc, this.zzd, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 != 0) {
            zzf = ((C6927j) obj).m28380i();
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j7 = this.zzd;
            this.zza = 1;
            zzf = zzdcVar.zzf(recaptchaAction, j7, this);
            if (zzf == m76e) {
                return m76e;
            }
        }
        AbstractC6928k.m28382b(zzf);
        return zzf;
    }
}
