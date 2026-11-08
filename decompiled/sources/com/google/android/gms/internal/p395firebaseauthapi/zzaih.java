package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaih implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaih() {
    }

    public static zzaih zza(String str, String str2, boolean z6) {
        zzaih zzaihVar = new zzaih();
        zzaihVar.zzb = AbstractC3802r.m15123e(str);
        zzaihVar.zzc = AbstractC3802r.m15123e(str2);
        zzaihVar.zzf = z6;
        return zzaihVar;
    }

    public static zzaih zzb(String str, String str2, boolean z6) {
        zzaih zzaihVar = new zzaih();
        zzaihVar.zza = AbstractC3802r.m15123e(str);
        zzaihVar.zzd = AbstractC3802r.m15123e(str2);
        zzaihVar.zzf = z6;
        return zzaihVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
