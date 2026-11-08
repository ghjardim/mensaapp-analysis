package com.google.android.gms.internal.p395firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagx {
    private Long zza;
    private Long zzb;

    public static zzagx zza(String str) {
        try {
            zzagx zzagxVar = new zzagx();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzagxVar.zza = Long.valueOf(jSONObject.optLong("iat"));
            zzagxVar.zzb = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzagxVar;
        } catch (JSONException e7) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e7));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e7));
        }
    }

    public final Long zzb() {
        return this.zza;
    }

    public final Long zza() {
        return this.zzb;
    }
}
