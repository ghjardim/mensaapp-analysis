package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzu extends AbstractC0068l implements InterfaceC0804p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzu(this.zzd, this.zze, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        List list;
        Iterator it;
        Object m76e = AbstractC0024c.m76e();
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            AbstractC6928k.m28382b(obj);
        } else {
            AbstractC6928k.m28382b(obj);
            if (!this.zzd.zzS()) {
                C6927j.a aVar = C6927j.f24803b;
                return C6927j.m28372a(C6927j.m28373b(AbstractC6928k.m28381a(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() == 0) {
                C6927j.a aVar2 = C6927j.f24803b;
                return C6927j.m28372a(C6927j.m28373b(AbstractC6928k.m28381a(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            this.zze.zzc = zzj.zzi();
            list = this.zze.zzb;
            it = list.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzj, this) == m76e) {
                return m76e;
            }
        }
        C6927j.a aVar3 = C6927j.f24803b;
        return C6927j.m28372a(C6927j.m28373b(C6934q.f24811a));
    }
}
