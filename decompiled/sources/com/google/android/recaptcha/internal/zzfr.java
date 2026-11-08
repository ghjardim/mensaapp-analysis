package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5481x;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2336K;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzfr extends AbstractC0068l implements InterfaceC0804p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, interfaceC7157e);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zztd zztdVar;
        AbstractC0024c.m76e();
        AbstractC6928k.m28382b(obj);
        InterfaceC2334J interfaceC2334J = (InterfaceC2334J) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVar = ((zzce) exc).zza();
            zztdVar.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zzf = zzte.zzf();
            zzf.zze(zzgdVar.zza());
            zzf.zzr(2);
            zzf.zzq(2);
            zztdVar = zzf;
        }
        zzte zzteVar = (zzte) zztdVar.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        AbstractC5481x.m23040b(this.zza.getClass()).mo7022b();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zza = zzev.zza(zzb, zzbnVar);
        String zzd = this.zzb.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        if (AbstractC2336K.m8000e(interfaceC2334J)) {
            zzft zzftVar = this.zzc;
            zzkh zzh = zzkh.zzh();
            byte[] zzd2 = zzteVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzkh zzh2 = zzkh.zzh();
            byte[] zzd3 = zza.zzd();
            zzftVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return C6934q.f24811a;
    }
}
