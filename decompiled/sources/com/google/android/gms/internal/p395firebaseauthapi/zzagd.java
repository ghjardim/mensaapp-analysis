package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagd implements zzagc {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzagd(String str, String str2, String str3, String str4, String str5) {
        AbstractC3802r.m15123e(str);
        this.zza = AbstractC3802r.m15123e(str2);
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
    }

    public static zzagd zza(String str, String str2, String str3, String str4) {
        AbstractC3802r.m15123e(str3);
        AbstractC3802r.m15123e(str2);
        return new zzagd("phone", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzb;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zza);
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
