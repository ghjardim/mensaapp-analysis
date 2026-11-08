package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import p346t3.AbstractC6508h;
import p346t3.C6483O;
import p354u3.AbstractC6672r;
import p354u3.InterfaceC6684x;

/* loaded from: classes.dex */
final class zzaei implements zzadm {
    final /* synthetic */ zzaeg zza;

    public zzaei(zzaeg zzaegVar) {
        this.zza = zzaegVar;
    }

    private final void zza(zzaen zzaenVar) {
        this.zza.zzi.execute(new zzaeo(this, zzaenVar));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zzb(String str) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 8, "Unexpected response type " + i7);
        zza(new zzaek(this, str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zzc(String str) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 7, "Unexpected response type " + i7);
        zzaeg.zza(this.zza);
    }

    private final void zza(Status status, AbstractC6508h abstractC6508h, String str, String str2) {
        zzaeg.zza(this.zza, status);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzn = abstractC6508h;
        zzaegVar.zzo = str;
        zzaegVar.zzp = str2;
        InterfaceC6684x interfaceC6684x = zzaegVar.zzf;
        if (interfaceC6684x != null) {
            interfaceC6684x.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zzb() {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 6, "Unexpected response type " + i7);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zzc() {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 9, "Unexpected response type " + i7);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(String str) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 8, "Unexpected response type " + i7);
        this.zza.zzu = true;
        zza(new zzaem(this, str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzafw zzafwVar) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 3, "Unexpected response type " + i7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzl = zzafwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza() {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 5, "Unexpected response type " + i7);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzzt zzztVar) {
        zza(zzztVar.zza(), zzztVar.zzb(), zzztVar.zzc(), zzztVar.zzd());
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzzs zzzsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzq = zzzsVar;
        zzaegVar.zza(AbstractC6672r.m27577a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(Status status, C6483O c6483o) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 2, "Unexpected response type " + i7);
        zza(status, c6483o, null, null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(Status status) {
        String m14796A0 = status.m14796A0();
        if (m14796A0 != null) {
            if (m14796A0.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (m14796A0.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (m14796A0.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (m14796A0.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (m14796A0.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (m14796A0.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (m14796A0.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (m14796A0.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (m14796A0.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (m14796A0.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaeg zzaegVar = this.zza;
        if (zzaegVar.zza == 8) {
            zzaegVar.zzu = true;
            zza(new zzael(this, status));
        } else {
            zzaeg.zza(zzaegVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzags zzagsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzs = zzagsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzagt zzagtVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzr = zzagtVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar, zzagl zzaglVar) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 2, "Unexpected response type: " + i7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaegVar.zzk = zzaglVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzahg zzahgVar) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 4, "Unexpected response type " + i7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzm = zzahgVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzahh zzahhVar) {
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzahs zzahsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzt = zzahsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 1, "Unexpected response type: " + i7);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadm
    public final void zza(C6483O c6483o) {
        int i7 = this.zza.zza;
        AbstractC3802r.m15133o(i7 == 8, "Unexpected response type " + i7);
        this.zza.zzu = true;
        zza(new zzaej(this, c6483o));
    }
}
