package com.google.android.gms.internal.p395firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AbstractC3933b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6508h;
import p346t3.C6462C;
import p346t3.C6483O;
import p346t3.C6484P;
import p346t3.C6486S;
import p346t3.C6490W;
import p346t3.C6501d0;
import p346t3.C6502e;
import p346t3.C6512j;
import p346t3.InterfaceC6489V;
import p346t3.InterfaceC6500d;
import p346t3.InterfaceC6510i;
import p354u3.AbstractC6627O;
import p354u3.C6646e;
import p354u3.C6654i;
import p354u3.C6658k;
import p354u3.C6668p;
import p354u3.InterfaceC6655i0;
import p354u3.InterfaceC6679u0;
import p354u3.InterfaceC6684x;
import p354u3.InterfaceC6686y;

/* loaded from: classes.dex */
public final class zzabq extends zzaep {
    public zzabq(C4176f c4176f, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzado(c4176f, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(C4176f c4176f, String str, String str2) {
        return zza((zzabt) new zzabt(str, str2).zza(c4176f));
    }

    public final Task<InterfaceC6500d> zzb(C4176f c4176f, String str, String str2) {
        return zza((zzabs) new zzabs(str, str2).zza(c4176f));
    }

    public final Task<InterfaceC6489V> zzc(C4176f c4176f, String str, String str2) {
        return zza((zzabw) new zzabw(str, str2).zza(c4176f));
    }

    public final Task<Void> zzd(C4176f c4176f, AbstractC6458A abstractC6458A, String str, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzadg) new zzadg(str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, String str, String str2, String str3) {
        return zza((zzabv) new zzabv(str, str2, str3).zza(c4176f));
    }

    public final Task<Void> zzb(C4176f c4176f, AbstractC6458A abstractC6458A, AbstractC6508h abstractC6508h, String str, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzacg) new zzacg(abstractC6508h, str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<InterfaceC6510i> zzc(C4176f c4176f, AbstractC6458A abstractC6458A, AbstractC6508h abstractC6508h, String str, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzacj) new zzacj(abstractC6508h, str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, String str, String str2, String str3, String str4, InterfaceC6679u0 interfaceC6679u0) {
        return zza((zzabu) new zzabu(str, str2, str3, str4).zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0));
    }

    public final Task<String> zzd(C4176f c4176f, String str, String str2) {
        return zza((zzadk) new zzadk(str, str2).zza(c4176f));
    }

    public final Task<InterfaceC6510i> zzb(C4176f c4176f, AbstractC6458A abstractC6458A, C6512j c6512j, String str, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzacl) new zzacl(c6512j, str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zzc(C4176f c4176f, AbstractC6458A abstractC6458A, String str, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzadh) new zzadh(str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(AbstractC6458A abstractC6458A, InterfaceC6686y interfaceC6686y) {
        return zza((zzabx) new zzabx().zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6686y>) interfaceC6686y).zza((InterfaceC6684x) interfaceC6686y));
    }

    public final Task<Void> zza(C4176f c4176f, C6484P c6484p, AbstractC6458A abstractC6458A, String str, InterfaceC6679u0 interfaceC6679u0) {
        zzafc.zza();
        zzabz zzabzVar = new zzabz(c6484p, abstractC6458A.zze(), str, null);
        zzabzVar.zza(c4176f).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6679u0);
        return zza(zzabzVar);
    }

    public final Task<InterfaceC6510i> zzb(C4176f c4176f, AbstractC6458A abstractC6458A, String str, String str2, String str3, String str4, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzacn) new zzacn(str, str2, str3, str4).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, C6490W c6490w, AbstractC6458A abstractC6458A, String str, String str2, InterfaceC6679u0 interfaceC6679u0) {
        zzabz zzabzVar = new zzabz(c6490w, abstractC6458A.zze(), str, str2);
        zzabzVar.zza(c4176f).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6679u0);
        return zza(zzabzVar);
    }

    public final Task<InterfaceC6510i> zzb(C4176f c4176f, AbstractC6458A abstractC6458A, C6483O c6483o, String str, InterfaceC6655i0 interfaceC6655i0) {
        zzafc.zza();
        return zza((zzacp) new zzacp(c6483o, str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, AbstractC6458A abstractC6458A, C6484P c6484p, String str, InterfaceC6679u0 interfaceC6679u0) {
        zzafc.zza();
        zzaby zzabyVar = new zzaby(c6484p, str, null);
        zzabyVar.zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0);
        if (abstractC6458A != null) {
            zzabyVar.zza(abstractC6458A);
        }
        return zza(zzabyVar);
    }

    public final Task<Void> zzb(C4176f c4176f, String str, C6502e c6502e, String str2, String str3) {
        c6502e.m27082G0(6);
        return zza((zzact) new zzact(str, c6502e, str2, str3, "sendSignInLinkToEmail").zza(c4176f));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, AbstractC6458A abstractC6458A, C6490W c6490w, String str, String str2, InterfaceC6679u0 interfaceC6679u0) {
        zzaby zzabyVar = new zzaby(c6490w, str, str2);
        zzabyVar.zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0);
        if (abstractC6458A != null) {
            zzabyVar.zza(abstractC6458A);
        }
        return zza(zzabyVar);
    }

    public final Task<InterfaceC6510i> zzb(C4176f c4176f, String str, String str2, String str3, String str4, InterfaceC6679u0 interfaceC6679u0) {
        return zza((zzacw) new zzacw(str, str2, str3, str4).zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0));
    }

    public final Task<C6462C> zza(C4176f c4176f, AbstractC6458A abstractC6458A, String str, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzacb) new zzacb(str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<C6462C, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<InterfaceC6510i> zzb(C4176f c4176f, AbstractC6458A abstractC6458A, String str, InterfaceC6655i0 interfaceC6655i0) {
        AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(interfaceC6655i0);
        List zzg = abstractC6458A.zzg();
        if ((zzg != null && !zzg.contains(str)) || abstractC6458A.mo26955D0()) {
            return Tasks.forException(zzadr.zza(new Status(17016, str)));
        }
        str.hashCode();
        if (!str.equals("password")) {
            return zza((zzade) new zzade(str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
        }
        return zza((zzadf) new zzadf().zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<zzags> zza() {
        return zza(new zzaca());
    }

    public final Task<zzagt> zza(String str, String str2) {
        return zza(new zzacd(str, str2));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, AbstractC6458A abstractC6458A, AbstractC6508h abstractC6508h, String str, InterfaceC6655i0 interfaceC6655i0) {
        AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15129k(abstractC6508h);
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(interfaceC6655i0);
        List zzg = abstractC6458A.zzg();
        if (zzg != null && zzg.contains(abstractC6508h.mo26997x0())) {
            return Tasks.forException(zzadr.zza(new Status(17015)));
        }
        if (abstractC6508h instanceof C6512j) {
            C6512j c6512j = (C6512j) abstractC6508h;
            if (!c6512j.m27117D0()) {
                return zza((zzacc) new zzacc(c6512j, str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
            }
            return zza((zzach) new zzach(c6512j).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
        }
        if (abstractC6508h instanceof C6483O) {
            zzafc.zza();
            return zza((zzace) new zzace((C6483O) abstractC6508h).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
        }
        AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15129k(abstractC6508h);
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(interfaceC6655i0);
        return zza((zzacf) new zzacf(abstractC6508h).zza(c4176f).zza(abstractC6458A).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, AbstractC6458A abstractC6458A, C6512j c6512j, String str, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzaci) new zzaci(c6512j, str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, AbstractC6458A abstractC6458A, String str, String str2, String str3, String str4, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzack) new zzack(str, str2, str3, str4).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, AbstractC6458A abstractC6458A, C6483O c6483o, String str, InterfaceC6655i0 interfaceC6655i0) {
        zzafc.zza();
        return zza((zzacm) new zzacm(c6483o, str).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, AbstractC6458A abstractC6458A, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzaco) new zzaco().zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzacr(str, str2, str3, str4));
    }

    public final Task<Void> zza(C4176f c4176f, C6502e c6502e, String str) {
        return zza((zzacq) new zzacq(str, c6502e).zza(c4176f));
    }

    public final Task<Void> zza(C4176f c4176f, String str, C6502e c6502e, String str2, String str3) {
        c6502e.m27082G0(1);
        return zza((zzact) new zzact(str, c6502e, str2, str3, "sendPasswordResetEmail").zza(c4176f));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzacs(str));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, InterfaceC6679u0 interfaceC6679u0, String str) {
        return zza((zzacv) new zzacv(str).zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, AbstractC6508h abstractC6508h, String str, InterfaceC6679u0 interfaceC6679u0) {
        return zza((zzacu) new zzacu(abstractC6508h, str).zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, String str, String str2, InterfaceC6679u0 interfaceC6679u0) {
        return zza((zzacx) new zzacx(str, str2).zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, C6512j c6512j, String str, InterfaceC6679u0 interfaceC6679u0) {
        return zza((zzacz) new zzacz(c6512j, str).zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0));
    }

    public final Task<InterfaceC6510i> zza(C4176f c4176f, C6483O c6483o, String str, InterfaceC6679u0 interfaceC6679u0) {
        zzafc.zza();
        return zza((zzacy) new zzacy(c6483o, str).zza(c4176f).zza((zzaeg<InterfaceC6510i, InterfaceC6679u0>) interfaceC6679u0));
    }

    public final Task<Void> zza(C6668p c6668p, String str, String str2, long j7, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8, AbstractC3933b.b bVar, Executor executor, Activity activity) {
        zzadb zzadbVar = new zzadb(c6668p, str, str2, j7, z6, z7, str3, str4, str5, z8);
        zzadbVar.zza(bVar, activity, executor, str);
        return zza(zzadbVar);
    }

    public final Task<zzahs> zza(C6668p c6668p, String str) {
        return zza(new zzada(c6668p, str));
    }

    public final Task<Void> zza(C6668p c6668p, C6486S c6486s, String str, long j7, boolean z6, boolean z7, String str2, String str3, String str4, boolean z8, AbstractC3933b.b bVar, Executor executor, Activity activity) {
        zzadd zzaddVar = new zzadd(c6486s, AbstractC3802r.m15123e(c6668p.zzc()), str, j7, z6, z7, str2, str3, str4, z8);
        zzaddVar.zza(bVar, activity, executor, c6486s.mo27008a());
        return zza(zzaddVar);
    }

    public final Task<Void> zza(C4176f c4176f, AbstractC6458A abstractC6458A, String str, String str2, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzadc) new zzadc(abstractC6458A.zze(), str, str2).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, AbstractC6458A abstractC6458A, C6483O c6483o, InterfaceC6655i0 interfaceC6655i0) {
        zzafc.zza();
        return zza((zzadj) new zzadj(c6483o).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(C4176f c4176f, AbstractC6458A abstractC6458A, C6501d0 c6501d0, InterfaceC6655i0 interfaceC6655i0) {
        return zza((zzadi) new zzadi(c6501d0).zza(c4176f).zza(abstractC6458A).zza((zzaeg<Void, InterfaceC6679u0>) interfaceC6655i0).zza((InterfaceC6684x) interfaceC6655i0));
    }

    public final Task<Void> zza(String str, String str2, C6502e c6502e) {
        c6502e.m27082G0(7);
        return zza(new zzadl(str, str2, c6502e));
    }

    public static C6654i zza(C4176f c4176f, zzagl zzaglVar) {
        AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15129k(zzaglVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6646e(zzaglVar, "firebase"));
        List<zzahc> zzl = zzaglVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i7 = 0; i7 < zzl.size(); i7++) {
                arrayList.add(new C6646e(zzl.get(i7)));
            }
        }
        C6654i c6654i = new C6654i(c4176f, arrayList);
        c6654i.m27550c1(new C6658k(zzaglVar.zzb(), zzaglVar.zza()));
        c6654i.m27551d1(zzaglVar.zzn());
        c6654i.m27549b1(zzaglVar.zze());
        c6654i.mo26977Y0(AbstractC6627O.m27504a(zzaglVar.zzk()));
        c6654i.mo26975W0(zzaglVar.zzd());
        return c6654i;
    }

    public final void zza(C4176f c4176f, zzahk zzahkVar, AbstractC3933b.b bVar, Activity activity, Executor executor) {
        zza((zzadn) new zzadn(zzahkVar).zza(c4176f).zza(bVar, activity, executor, zzahkVar.zzd()));
    }
}
