package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import p346t3.C6501d0;
import p346t3.C6512j;
import p346t3.C6543y0;
import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
public final class zzzv {
    private final zzaeu zza;

    public zzzv(zzaeu zzaeuVar) {
        this.zza = (zzaeu) AbstractC3802r.m15129k(zzaeuVar);
    }

    public final void zzb(String str, String str2, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzabn(this, str2, zzadpVar));
    }

    public final void zzc(String str, String str2, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzabm(this, str2, zzadpVar));
    }

    public final void zzd(String str, String str2, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(new zzahd(str, null, str2), new zzaae(this, zzadpVar));
    }

    public final void zze(String str, String str2, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(new zzaft(str, str2), new zzaac(this, zzadpVar));
    }

    public final void zzf(String str, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzaar(this, zzadpVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzaie zzaieVar, zzadp zzadpVar, zzaet zzaetVar) {
        Status m27577a;
        if (zzaieVar.zzo()) {
            C6543y0 zzb = zzaieVar.zzb();
            String zzc = zzaieVar.zzc();
            String zzj = zzaieVar.zzj();
            if (zzaieVar.zzm()) {
                m27577a = new Status(17012);
            } else {
                m27577a = AbstractC6672r.m27577a(zzaieVar.zzd());
            }
            zzadpVar.zza(new zzzt(m27577a, zzb, zzc, zzj));
            return;
        }
        zzzvVar.zza(new zzagw(zzaieVar.zzi(), zzaieVar.zze(), Long.valueOf(zzaieVar.zza()), "Bearer"), zzaieVar.zzh(), zzaieVar.zzg(), Boolean.valueOf(zzaieVar.zzn()), zzaieVar.zzb(), zzadpVar, zzaetVar);
    }

    public final void zzf(String str, String str2, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str2, new zzaaq(this, str, zzadpVar));
    }

    private final void zzd(zzagn zzagnVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzagnVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzagnVar, new zzabj(this, zzadpVar));
    }

    public final void zzb(String str, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(new zzagk(str), new zzzu(this, zzadpVar));
    }

    public final void zzc(String str, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzabc(this, zzadpVar));
    }

    public final void zze(String str, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(new zzahn(str), new zzabi(this, zzadpVar));
    }

    public final void zzc(zzagn zzagnVar, zzadp zzadpVar) {
        zzd(zzagnVar, zzadpVar);
    }

    public final void zzd(String str, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(str, new zzabg(this, zzadpVar));
    }

    public final void zzb(zzagn zzagnVar, zzadp zzadpVar) {
        AbstractC3802r.m15123e(zzagnVar.zzc());
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzagnVar, new zzaaf(this, zzadpVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(new zzaif(str, str2, str3, str4), new zzzw(this, zzadpVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzahn zzahnVar, zzaet zzaetVar) {
        AbstractC3802r.m15129k(zzadpVar);
        AbstractC3802r.m15129k(zzahnVar);
        AbstractC3802r.m15129k(zzaetVar);
        zzzvVar.zza.zza(zzahnVar, new zzaak(zzzvVar, zzadpVar, zzaetVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzagw zzagwVar, zzahm zzahmVar, zzaet zzaetVar) {
        AbstractC3802r.m15129k(zzadpVar);
        AbstractC3802r.m15129k(zzagwVar);
        AbstractC3802r.m15129k(zzahmVar);
        AbstractC3802r.m15129k(zzaetVar);
        zzzvVar.zza.zza(new zzagj(zzagwVar.zzc()), new zzaab(zzzvVar, zzaetVar, zzadpVar, zzagwVar, zzahmVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzagw zzagwVar, zzagl zzaglVar, zzahm zzahmVar, zzaet zzaetVar) {
        AbstractC3802r.m15129k(zzadpVar);
        AbstractC3802r.m15129k(zzagwVar);
        AbstractC3802r.m15129k(zzaglVar);
        AbstractC3802r.m15129k(zzahmVar);
        AbstractC3802r.m15129k(zzaetVar);
        zzzvVar.zza.zza(zzahmVar, new zzaaa(zzzvVar, zzahmVar, zzaglVar, zzadpVar, zzagwVar, zzaetVar));
    }

    public final void zza(String str, String str2, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadpVar);
        zzahm zzahmVar = new zzahm();
        zzahmVar.zze(str);
        zzahmVar.zzh(str2);
        this.zza.zza(zzahmVar, new zzabp(this, zzadpVar));
    }

    public final void zza(zzahd zzahdVar, zzadp zzadpVar) {
        AbstractC3802r.m15123e(zzahdVar.zzb());
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzahdVar, new zzaag(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(new zzahn(str, str2, null, str3, str4, null), new zzzx(this, zzadpVar));
    }

    public final void zza(String str, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzabe(this, zzadpVar));
    }

    private final void zza(String str, zzaew<zzagw> zzaewVar) {
        AbstractC3802r.m15129k(zzaewVar);
        AbstractC3802r.m15123e(str);
        zzagw zzb = zzagw.zzb(str);
        if (zzb.zzg()) {
            zzaewVar.zza((zzaew<zzagw>) zzb);
        } else {
            this.zza.zza(new zzagk(zzb.zzd()), new zzabo(this, zzaewVar));
        }
    }

    public final void zza(zzaga zzagaVar, String str, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzagaVar);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzaaw(this, zzagaVar, zzadpVar));
    }

    public final void zza(zzagc zzagcVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzagcVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzagcVar, new zzaay(this, zzadpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafy zzafyVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzafyVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzafyVar, new zzzy(this, zzadpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagw zzagwVar, String str, String str2, Boolean bool, C6543y0 c6543y0, zzadp zzadpVar, zzaet zzaetVar) {
        AbstractC3802r.m15129k(zzagwVar);
        AbstractC3802r.m15129k(zzaetVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(new zzagj(zzagwVar.zzc()), new zzaad(this, zzaetVar, str2, str, bool, c6543y0, zzadpVar, zzagwVar));
    }

    public final void zza(zzagp zzagpVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzagpVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzagpVar, new zzabd(this, zzadpVar));
    }

    public final void zza(zzagu zzaguVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzaguVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzaguVar, new zzaba(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15123e(str3);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str3, new zzaal(this, str, str2, str4, str5, zzadpVar));
    }

    public final void zza(String str, zzaic zzaicVar, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzaicVar);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzaap(this, zzaicVar, zzadpVar));
    }

    public final void zza(String str, zzaih zzaihVar, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzaihVar);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzaan(this, zzaihVar, zzadpVar));
    }

    public final void zza(zzahf zzahfVar, zzadp zzadpVar) {
        this.zza.zza(zzahfVar, new zzabl(this, zzadpVar));
    }

    public final void zza(zzagn zzagnVar, zzadp zzadpVar) {
        AbstractC3802r.m15123e(zzagnVar.zzd());
        AbstractC3802r.m15129k(zzadpVar);
        zzd(zzagnVar, zzadpVar);
    }

    public final void zza(zzahk zzahkVar, zzadp zzadpVar) {
        AbstractC3802r.m15123e(zzahkVar.zzd());
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzahkVar, new zzaaj(this, zzadpVar));
    }

    public final void zza(zzaic zzaicVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzaicVar);
        AbstractC3802r.m15129k(zzadpVar);
        zzaicVar.zzb(true);
        this.zza.zza(zzaicVar, new zzaau(this, zzadpVar));
    }

    public final void zza(zzaid zzaidVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzaidVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzaidVar, new zzaah(this, zzadpVar));
    }

    public final void zza(C6512j c6512j, String str, zzadp zzadpVar) {
        AbstractC3802r.m15129k(c6512j);
        AbstractC3802r.m15129k(zzadpVar);
        if (c6512j.zzg()) {
            zza(c6512j.m27116C0(), new zzzz(this, c6512j, str, zzadpVar));
        } else {
            zza(new zzafy(c6512j, null, str), zzadpVar);
        }
    }

    public final void zza(zzaih zzaihVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzaihVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzaihVar, new zzaai(this, zzadpVar));
    }

    public final void zza(zzahp zzahpVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzahpVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzahpVar, new zzaax(this, zzahpVar, zzadpVar));
    }

    public final void zza(zzahr zzahrVar, zzadp zzadpVar) {
        AbstractC3802r.m15129k(zzahrVar);
        AbstractC3802r.m15129k(zzadpVar);
        this.zza.zza(zzahrVar, new zzabb(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzaas(this, str2, str3, zzadpVar));
    }

    public final void zza(String str, C6501d0 c6501d0, zzadp zzadpVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(c6501d0);
        AbstractC3802r.m15129k(zzadpVar);
        zza(str, new zzabk(this, c6501d0, zzadpVar));
    }
}
