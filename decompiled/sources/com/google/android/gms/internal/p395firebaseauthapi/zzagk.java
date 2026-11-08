package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagk implements zzaeb {
    private String zza = zzagi.REFRESH_TOKEN.toString();
    private String zzb;

    public zzagk(String str) {
        this.zzb = AbstractC3802r.m15123e(str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
