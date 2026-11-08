package com.google.android.gms.internal.p395firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzaik implements zzaea<zzaik> {
    private static final String zza = "zzaik";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;
    private String zzf;
    private String zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaik zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0281q.m1144a(jSONObject.optString("idToken", null));
            this.zzc = AbstractC0281q.m1144a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            AbstractC0281q.m1144a(jSONObject.optString("localId", null));
            this.zze = jSONObject.optBoolean("isNewUser", false);
            this.zzf = AbstractC0281q.m1144a(jSONObject.optString("temporaryProof", null));
            this.zzg = AbstractC0281q.m1144a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
