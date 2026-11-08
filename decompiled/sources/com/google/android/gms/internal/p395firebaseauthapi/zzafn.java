package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzafn {
    private final String zza;

    public zzafn(String str) {
        this.zza = AbstractC3802r.m15123e(str);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
