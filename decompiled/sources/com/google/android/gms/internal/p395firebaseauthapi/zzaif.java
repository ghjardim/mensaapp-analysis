package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaif implements zzaeb {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze = true;

    public zzaif(String str, String str2, String str3, String str4) {
        this.zza = AbstractC3802r.m15123e(str);
        this.zzb = AbstractC3802r.m15123e(str2);
        this.zzc = str3;
        this.zzd = str4;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put("password", this.zzb);
        jSONObject.put("returnSecureToken", this.zze);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzail.zza(jSONObject, "captchaResponse", str2);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
