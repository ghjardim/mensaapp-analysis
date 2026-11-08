package com.google.android.gms.internal.p395firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzahq implements zzaea<zzahq> {
    private static final String zza = "zzahq";
    private String zzb;
    private String zzc;
    private long zzd;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahq zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0281q.m1144a(jSONObject.optString("idToken", null));
            AbstractC0281q.m1144a(jSONObject.optString("displayName", null));
            AbstractC0281q.m1144a(jSONObject.optString("email", null));
            this.zzc = AbstractC0281q.m1144a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
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

    public final String zzb() {
        return this.zzb;
    }
}
