package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5464g;
import p104O5.AbstractC1421h;
import p132S5.InterfaceC2334J;
import p368w2.C6870k;
import p371w5.C6925h;
import p378x5.AbstractC7004D;
import p378x5.AbstractC7005E;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7025p;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public /* synthetic */ zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i7, AbstractC5464g abstractC5464g) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zza = zzekVar.zza();
        InterfaceC2334J zzc = zzbiVar.zzc();
        List m28864j = AbstractC7024o.m28864j(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zza, context, zzc, new zzan(context, zzc, zza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(C6870k.m28272f())));
        this.zza = zzekVar;
        this.zzb = m28864j;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map m28735d;
        List<zzaa> list = (List) this.zzd.remove(str);
        if (list != null) {
            m28735d = new LinkedHashMap(AbstractC1421h.m5528a(AbstractC7004D.m28732a(AbstractC7025p.m28868n(list, 10)), 16));
            for (zzaa zzaaVar : list) {
                m28735d.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            m28735d = AbstractC7005E.m28735d();
        }
        zzsz zzs = zzs(m28735d, str);
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        zzsf zzf2 = zzsg.zzf();
        byte[] zzd = zzs.zzd();
        zzf2.zze(zzkh.zzh().zzi(zzd, 0, zzd.length));
        zzf.zzf(zzf2);
        return (zzsi) zzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzf = zzsx.zzf();
        zzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] zzd = zza.zzd();
            zzf.zzf(zzcf.zza(zzkh.zzh().zzi(zzd, 0, zzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new C6925h();
            }
            zzte zza2 = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] zzd2 = zza2.zzd();
            zzf.zze(zzcf.zza(zzkh.zzh().zzi(zzd2, 0, zzd2.length), zzleVar));
        }
        return (zzsx) zzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzf = zzsz.zzf();
        zzf.zzq(str);
        List list = this.zzb;
        ArrayList<zzy> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        for (zzy zzyVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int zza = zzyVar.zza();
                zztd zzf2 = zzte.zzf();
                zzf2.zzf(zza);
                zzf2.zzr(13);
                zzf2.zzq(27);
                zzf.zzf(zzr(new zzw(zza, (zzte) zzf2.zzk())));
            }
        }
        Collection values = map.values();
        ArrayList arrayList2 = new ArrayList(AbstractC7025p.m28868n(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzf.zze(arrayList2);
        return (zzsz) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, InterfaceC7157e interfaceC7157e) {
        return zzq(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(java.lang.String r5, p392z5.InterfaceC7157e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p371w5.AbstractC6928k.m28382b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p371w5.AbstractC6928k.m28382b(r6)
            com.google.android.recaptcha.internal.zzs r6 = new com.google.android.recaptcha.internal.zzs
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.zzc = r3
            java.lang.Object r6 = p132S5.AbstractC2336K.m7998c(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            w5.j r6 = (p371w5.C6927j) r6
            java.lang.Object r5 = r6.m28380i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzf(java.lang.String, z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r5, p392z5.InterfaceC7157e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzt
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzt r0 = (com.google.android.recaptcha.internal.zzt) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzt r0 = new com.google.android.recaptcha.internal.zzt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p371w5.AbstractC6928k.m28382b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p371w5.AbstractC6928k.m28382b(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = p132S5.AbstractC2336K.m7998c(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            w5.j r6 = (p371w5.C6927j) r6
            java.lang.Object r5 = r6.m28380i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzh(com.google.android.recaptcha.internal.zzsc, z5.e):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
