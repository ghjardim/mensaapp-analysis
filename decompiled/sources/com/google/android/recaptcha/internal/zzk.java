package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
final class zzk extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j7, zzsc zzscVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j7;
        this.zze = zzscVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, interfaceC7157e);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object m8084a;
        zzen zzenVar;
        InterfaceC2348Q m8126b;
        Object m28373b;
        Object m76e = AbstractC0024c.m76e();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            AbstractC6928k.m28382b(obj);
            m8084a = obj;
        } else {
            AbstractC6928k.m28382b(obj);
            InterfaceC2334J interfaceC2334J = (InterfaceC2334J) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                m8126b = AbstractC2388k.m8126b(interfaceC2334J, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, null);
                arrayList.add(m8126b);
            }
            InterfaceC2348Q[] interfaceC2348QArr = (InterfaceC2348Q[]) arrayList.toArray(new InterfaceC2348Q[0]);
            InterfaceC2348Q[] interfaceC2348QArr2 = (InterfaceC2348Q[]) Arrays.copyOf(interfaceC2348QArr, interfaceC2348QArr.length);
            this.zzf = zzf;
            this.zza = 1;
            m8084a = AbstractC2378f.m8084a(interfaceC2348QArr2, this);
            if (m8084a == m76e) {
                return m76e;
            }
            zzenVar = zzf;
        }
        List list = (List) m8084a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!C6927j.m28377f(((C6927j) it2.next()).m28380i())) {
                    zzenVar.zza();
                    m28373b = C6927j.m28373b(C6934q.f24811a);
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        C6927j.a aVar = C6927j.f24803b;
        m28373b = C6927j.m28373b(AbstractC6928k.m28381a(zzbdVar));
        return C6927j.m28372a(m28373b);
    }
}
