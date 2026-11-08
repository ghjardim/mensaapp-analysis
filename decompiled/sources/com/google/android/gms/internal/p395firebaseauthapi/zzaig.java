package com.google.android.gms.internal.p395firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzaig implements zzaea<zzaig> {
    private static final String zza = "zzaig";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaig zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0281q.m1144a(jSONObject.optString("idToken", null));
            this.zzc = AbstractC0281q.m1144a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
