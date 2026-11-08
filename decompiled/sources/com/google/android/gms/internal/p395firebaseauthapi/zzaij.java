package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaij implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaij(String str, String str2, String str3) {
        this.zza = AbstractC3802r.m15123e(str);
        this.zzb = AbstractC3802r.m15123e(str2);
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
