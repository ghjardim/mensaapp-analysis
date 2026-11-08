package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;
import p003A2.C0019a;
import p346t3.C6504f;
import p346t3.C6512j;

/* loaded from: classes.dex */
public class zzafy implements zzaeb {
    private static final String zza = "zzafy";
    private final String zzb;
    private final String zzc;
    private final C6512j zzd;
    private final String zze;
    private final String zzf;

    static {
        new C0019a(zzafy.class.getSimpleName(), new String[0]);
    }

    public zzafy(C6512j c6512j, String str, String str2) {
        this.zzd = (C6512j) AbstractC3802r.m15129k(c6512j);
        this.zzb = AbstractC3802r.m15123e(c6512j.zzc());
        this.zzc = AbstractC3802r.m15123e(c6512j.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeb
    public final String zza() {
        C6504f m27102c = C6504f.m27102c(this.zzc);
        String m27104a = m27102c != null ? m27102c.m27104a() : null;
        String m27106d = m27102c != null ? m27102c.m27106d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (m27104a != null) {
            jSONObject.put("oobCode", m27104a);
        }
        if (m27106d != null) {
            jSONObject.put("tenantId", m27106d);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzail.zza(jSONObject, "captchaResp", str2);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C6512j zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
