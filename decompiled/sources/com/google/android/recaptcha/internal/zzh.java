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
import p132S5.InterfaceC2348Q;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzh extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j7, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j7;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, interfaceC7157e);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        Object m8084a;
        zzen zzenVar2;
        InterfaceC2348Q m8126b;
        Object m76e = AbstractC0024c.m76e();
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            AbstractC6928k.m28382b(obj);
            m8084a = obj;
        } else {
            AbstractC6928k.m28382b(obj);
            InterfaceC2334J interfaceC2334J = (InterfaceC2334J) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            zzen zzenVar3 = zzenVar;
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    m8126b = AbstractC2388k.m8126b(interfaceC2334J, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null);
                    arrayList.add(m8126b);
                }
            }
            InterfaceC2348Q[] interfaceC2348QArr = (InterfaceC2348Q[]) arrayList.toArray(new InterfaceC2348Q[0]);
            InterfaceC2348Q[] interfaceC2348QArr2 = (InterfaceC2348Q[]) Arrays.copyOf(interfaceC2348QArr, interfaceC2348QArr.length);
            this.zze = zzenVar3;
            this.zza = 1;
            m8084a = AbstractC2378f.m8084a(interfaceC2348QArr2, this);
            if (m8084a == m76e) {
                return m76e;
            }
            zzenVar2 = zzenVar3;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        Iterator it = ((List) m8084a).iterator();
        while (it.hasNext()) {
            Object m28380i = ((C6927j) it.next()).m28380i();
            if (C6927j.m28378g(m28380i)) {
                zzf.zzh((zzsi) m28380i);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}
