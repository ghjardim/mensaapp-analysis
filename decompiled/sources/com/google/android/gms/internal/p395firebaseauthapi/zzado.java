package com.google.android.gms.internal.p395firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.ScheduledExecutorService;
import p003A2.C0019a;
import p219e3.C4176f;
import p346t3.AbstractC6474I;
import p346t3.C6483O;
import p346t3.C6484P;
import p346t3.C6490W;
import p346t3.C6501d0;
import p346t3.InterfaceC6493Z;

/* loaded from: classes.dex */
public final class zzado {
    private static final C0019a zza = new C0019a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzzv zzb;
    private final zzafd zzc;

    public zzado(C4176f c4176f, ScheduledExecutorService scheduledExecutorService) {
        AbstractC3802r.m15129k(c4176f);
        Context m17532m = c4176f.m17532m();
        AbstractC3802r.m15129k(m17532m);
        this.zzb = new zzzv(new zzaec(c4176f, zzaed.zza()));
        this.zzc = new zzafd(m17532m, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, String str2, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzb(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzc(String str, String str2, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzc(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzd(String str, String str2, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzd(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zze(String str, String str2, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        this.zzb.zze(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzf(String str, String str2, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzf(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zze(String str, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzf(str, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahd zzahdVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzahdVar);
        AbstractC3802r.m15123e(zzahdVar.zzb());
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(zzahdVar, new zzadp(zzadmVar, zza));
    }

    public final void zzd(String str, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zze(str, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzb(str, new zzadp(zzadmVar, zza));
    }

    public final void zzc(String str, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzc(str, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(str, str2, str3, str4, new zzadp(zzadmVar, zza));
    }

    public final void zzb(zzagn zzagnVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzagnVar);
        AbstractC3802r.m15123e(zzagnVar.zzc());
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzb(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zzc(zzagn zzagnVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzagnVar);
        this.zzb.zzc(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(str, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(zzadmVar);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzb(str, str2, str3, str4, new zzadp(zzadmVar, zza));
    }

    public final void zza(AbstractC6474I abstractC6474I, String str, String str2, String str3, zzadm zzadmVar) {
        zzaga zza2;
        AbstractC3802r.m15129k(abstractC6474I);
        AbstractC3802r.m15124f(str, "cachedTokenState should not be empty.");
        AbstractC3802r.m15129k(zzadmVar);
        if (abstractC6474I instanceof C6484P) {
            C6483O m27038a = ((C6484P) abstractC6474I).m27038a();
            zza2 = zzage.zza(str, (String) AbstractC3802r.m15129k(m27038a.zzc()), (String) AbstractC3802r.m15129k(m27038a.m27034A0()), str2, str3);
        } else if (abstractC6474I instanceof C6490W) {
            C6490W c6490w = (C6490W) abstractC6474I;
            zza2 = zzagg.zza(str, AbstractC3802r.m15123e(str2), AbstractC3802r.m15123e(((InterfaceC6493Z) AbstractC3802r.m15129k(c6490w.m27045a())).mo27054c()), AbstractC3802r.m15123e(c6490w.m27047c()), str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zza2, str, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, AbstractC6474I abstractC6474I, String str2, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(abstractC6474I);
        AbstractC3802r.m15129k(zzadmVar);
        if (abstractC6474I instanceof C6484P) {
            C6483O m27038a = ((C6484P) abstractC6474I).m27038a();
            this.zzb.zza(zzagd.zza(str, (String) AbstractC3802r.m15129k(m27038a.zzc()), (String) AbstractC3802r.m15129k(m27038a.m27034A0()), str2), new zzadp(zzadmVar, zza));
        } else {
            if (abstractC6474I instanceof C6490W) {
                C6490W c6490w = (C6490W) abstractC6474I;
                this.zzb.zza(zzagf.zza(str, AbstractC3802r.m15123e(c6490w.m27047c()), str2, AbstractC3802r.m15123e(c6490w.m27046b())), new zzadp(zzadmVar, zza));
                return;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final void zza(zzagp zzagpVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzagpVar);
        this.zzb.zza(zzagpVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzagu zzaguVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzaguVar);
        this.zzb.zza(zzaguVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15123e(str3);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, zzaic zzaicVar, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(zzaicVar);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(str, zzaicVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaha zzahaVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzadmVar);
        AbstractC3802r.m15129k(zzahaVar);
        this.zzb.zza(AbstractC3802r.m15123e(zzahaVar.zzb()), zzahaVar.zza(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahf zzahfVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzahfVar);
        this.zzb.zza(zzahfVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzagn zzagnVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzagnVar);
        AbstractC3802r.m15123e(zzagnVar.zzd());
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahk zzahkVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzadmVar);
        AbstractC3802r.m15129k(zzahkVar);
        String zzd = zzahkVar.zzd();
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(zzd)) {
            if (zzahkVar.zze()) {
                this.zzc.zzb(zzd);
            } else {
                this.zzc.zzb(zzadpVar, zzd);
                return;
            }
        }
        long zzb = zzahkVar.zzb();
        boolean zzf = zzahkVar.zzf();
        if (zza(zzb, zzf)) {
            zzahkVar.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzadpVar, zzb, zzf);
        this.zzb.zza(zzahkVar, this.zzc.zza(zzadpVar, zzd));
    }

    public final void zza(zzaho zzahoVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzahoVar);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zzd(zzahoVar.zza(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzaicVar);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(zzaicVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaid zzaidVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzaidVar);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(zzaidVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzafy zzafyVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzadmVar);
        AbstractC3802r.m15129k(zzafyVar.zzb());
        this.zzb.zza(zzafyVar.zzb(), zzafyVar.zzc(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzzr zzzrVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzadmVar);
        AbstractC3802r.m15129k(zzzrVar);
        this.zzb.zza(zzaex.zza((C6483O) AbstractC3802r.m15129k(zzzrVar.zza())), new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j7, boolean z6, boolean z7, String str4, String str5, String str6, boolean z8, zzadm zzadmVar) {
        AbstractC3802r.m15124f(str, "idToken should not be empty.");
        AbstractC3802r.m15129k(zzadmVar);
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z6) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzadpVar, str2);
                return;
            }
        }
        zzaht zza2 = zzaht.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j7, z8)) {
            zza2.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzadpVar, j7, z8);
        this.zzb.zza(zza2, this.zzc.zza(zzadpVar, str2));
    }

    public final void zza(zzzq zzzqVar, zzadm zzadmVar) {
        AbstractC3802r.m15129k(zzzqVar);
        AbstractC3802r.m15129k(zzadmVar);
        String m27041y = zzzqVar.zzb().m27041y();
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(m27041y)) {
            if (zzzqVar.zzh()) {
                this.zzc.zzb(m27041y);
            } else {
                this.zzc.zzb(zzadpVar, m27041y);
                return;
            }
        }
        long zza2 = zzzqVar.zza();
        boolean zzi = zzzqVar.zzi();
        zzahr zza3 = zzahr.zza(zzzqVar.zze(), zzzqVar.zzb().mo27008a(), zzzqVar.zzb().m27041y(), zzzqVar.zzd(), zzzqVar.zzg(), zzzqVar.zzf(), zzzqVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(m27041y, zzadpVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzadpVar, m27041y));
    }

    public final void zza(zzahv zzahvVar, zzadm zzadmVar) {
        this.zzb.zza(zzahvVar, new zzadp((zzadm) AbstractC3802r.m15129k(zzadmVar), zza));
    }

    public final void zza(String str, String str2, String str3, zzadm zzadmVar) {
        AbstractC3802r.m15124f(str, "cachedTokenState should not be empty.");
        AbstractC3802r.m15124f(str2, "uid should not be empty.");
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(str, str2, str3, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, C6501d0 c6501d0, zzadm zzadmVar) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(c6501d0);
        AbstractC3802r.m15129k(zzadmVar);
        this.zzb.zza(str, c6501d0, new zzadp(zzadmVar, zza));
    }

    private static boolean zza(long j7, boolean z6) {
        if (j7 > 0 && z6) {
            return true;
        }
        zza.m65g("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
