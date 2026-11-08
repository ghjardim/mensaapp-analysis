package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2378f;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2334J;
import p132S5.InterfaceC2409u0;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzs extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, interfaceC7157e);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        InterfaceC2409u0 m8128d;
        Object m76e = AbstractC0024c.m76e();
        int i7 = this.zza;
        AbstractC6928k.m28382b(obj);
        if (i7 == 0) {
            InterfaceC2334J interfaceC2334J = (InterfaceC2334J) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                m8128d = AbstractC2388k.m8128d(interfaceC2334J, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3, null);
                arrayList2.add(m8128d);
            }
            InterfaceC2409u0[] interfaceC2409u0Arr = (InterfaceC2409u0[]) arrayList2.toArray(new InterfaceC2409u0[0]);
            InterfaceC2409u0[] interfaceC2409u0Arr2 = (InterfaceC2409u0[]) Arrays.copyOf(interfaceC2409u0Arr, interfaceC2409u0Arr.length);
            this.zza = 1;
            if (AbstractC2378f.m8086c(interfaceC2409u0Arr2, this) == m76e) {
                return m76e;
            }
        }
        C6927j.a aVar = C6927j.f24803b;
        zzq = this.zzb.zzq(this.zzc);
        return C6927j.m28372a(C6927j.m28373b(zzq));
    }
}
