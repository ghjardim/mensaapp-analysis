package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafu implements zzaea<zzafu> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzafu";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafu zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e7) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e7.getMessage());
            throw new zzabr("Failed to parse error for string [" + str + "]", e7);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
