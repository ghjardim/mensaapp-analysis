package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2384i;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzds extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzds(this.zzb, this.zzc, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = AbstractC2384i.m8118g(zzdtVar.zzi.zza().mo7995l(), new zzdh(zzdtVar, null), this);
            if (obj == m76e) {
                return m76e;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
