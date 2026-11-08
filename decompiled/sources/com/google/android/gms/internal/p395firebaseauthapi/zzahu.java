package com.google.android.gms.internal.p395firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzahu implements zzaea<zzahu> {
    private static final String zza = "zzahu";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahu zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = AbstractC0281q.m1144a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
