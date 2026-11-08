package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;
import p346t3.C6543y0;

/* loaded from: classes.dex */
public class zzaie implements zzaea<zzaie> {
    private static final String zza = "zzaie";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzagz> zzp;
    private String zzq;

    public final long zza() {
        return this.zze;
    }

    public final C6543y0 zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        return C6543y0.m27138G0(this.zzg, this.zzk, this.zzj, this.zzn, this.zzl);
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzagz> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzq);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaie zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = AbstractC0281q.m1144a(jSONObject.optString("idToken", null));
            this.zzd = AbstractC0281q.m1144a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            AbstractC0281q.m1144a(jSONObject.optString("localId", null));
            this.zzf = AbstractC0281q.m1144a(jSONObject.optString("email", null));
            AbstractC0281q.m1144a(jSONObject.optString("displayName", null));
            AbstractC0281q.m1144a(jSONObject.optString("photoUrl", null));
            this.zzg = AbstractC0281q.m1144a(jSONObject.optString("providerId", null));
            this.zzh = AbstractC0281q.m1144a(jSONObject.optString("rawUserInfo", null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", null);
            this.zzk = jSONObject.optString("oauthIdToken", null);
            this.zzm = AbstractC0281q.m1144a(jSONObject.optString("errorMessage", null));
            this.zzn = AbstractC0281q.m1144a(jSONObject.optString("pendingToken", null));
            this.zzo = AbstractC0281q.m1144a(jSONObject.optString("tenantId", null));
            this.zzp = zzagz.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = AbstractC0281q.m1144a(jSONObject.optString("mfaPendingCredential", null));
            this.zzl = AbstractC0281q.m1144a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }
}
