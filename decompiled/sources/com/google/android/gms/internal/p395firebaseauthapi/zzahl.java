package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzahl implements zzaea<zzahl> {
    private static final String zza = "zzahl";
    private String zzb;
    private zzahb zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahl zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0281q.m1144a(jSONObject.optString("email", null));
            AbstractC0281q.m1144a(jSONObject.optString("passwordHash", null));
            jSONObject.optBoolean("emailVerified", false);
            AbstractC0281q.m1144a(jSONObject.optString("displayName", null));
            AbstractC0281q.m1144a(jSONObject.optString("photoUrl", null));
            this.zzc = zzahb.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = AbstractC0281q.m1144a(jSONObject.optString("idToken", null));
            this.zze = AbstractC0281q.m1144a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzahc> zze() {
        zzahb zzahbVar = this.zzc;
        if (zzahbVar != null) {
            return zzahbVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
