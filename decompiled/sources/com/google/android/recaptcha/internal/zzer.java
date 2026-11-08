package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import java.util.List;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzer extends AbstractC0068l implements InterfaceC0804p {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzer(this.zza, this.zzb, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzei zzeiVar;
        zzei zzeiVar2;
        zzei zzeiVar3;
        zzei zzeiVar4;
        zzei zzeiVar5;
        zzei zzeiVar6;
        AbstractC0024c.m76e();
        AbstractC6928k.m28382b(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzeiVar = zzesVar.zze;
                if (zzeiVar != null) {
                    byte[] zzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                    zzeiVar2 = zzesVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzeiVar2.getWritableDatabase().insert("ce", null, contentValues);
                    zzeiVar3 = zzesVar.zze;
                    int zzb = zzeiVar3.zzb() - 500;
                    if (zzb > 0) {
                        zzeiVar5 = zzesVar.zze;
                        List m28885K = AbstractC7032w.m28885K(zzeiVar5.zzd(), zzb);
                        zzeiVar6 = zzesVar.zze;
                        zzeiVar6.zza(m28885K);
                    }
                    zzeiVar4 = zzesVar.zze;
                    if (zzeiVar4.zzb() >= 20) {
                        zzesVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C6934q.f24811a;
    }
}
