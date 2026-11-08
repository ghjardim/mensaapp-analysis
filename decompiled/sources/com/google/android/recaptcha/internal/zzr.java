package com.google.android.recaptcha.internal;

import java.util.List;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzr extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzy zzyVar, String str, List list, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzr(this.zzb, this.zzc, this.zzd, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            if (obj == m76e) {
                return m76e;
            }
        }
        this.zzd.add((zzaa) obj);
        return C6934q.f24811a;
    }
}
