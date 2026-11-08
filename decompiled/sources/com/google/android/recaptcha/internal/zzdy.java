package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0800l;
import p132S5.AbstractC2358V0;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdy extends AbstractC0068l implements InterfaceC0800l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j7, zzec zzecVar, InterfaceC7157e interfaceC7157e) {
        super(1, interfaceC7157e);
        this.zzb = j7;
        this.zzc = zzecVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
        return new zzdy(this.zzb, this.zzc, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0800l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((InterfaceC7157e) obj)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 == 0) {
            long j7 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (AbstractC2358V0.m8039c(j7, zzdxVar, this) == m76e) {
                return m76e;
            }
        }
        return C6934q.f24811a;
    }
}
