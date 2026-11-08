package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;
import p346t3.C6502e;

/* loaded from: classes.dex */
public final class zzagn implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C6502e zze;
    private String zzf;
    private String zzg;

    public zzagn(int i7) {
        this.zza = zza(i7);
    }

    public static zzagn zza(C6502e c6502e, String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(c6502e);
        return new zzagn(7, c6502e, null, str2, str, null, null);
    }

    public final C6502e zzb() {
        return this.zze;
    }

    public final zzagn zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzagn zzd(String str) {
        this.zzd = AbstractC3802r.m15123e(str);
        return this;
    }

    public final zzagn zzb(String str) {
        this.zzb = AbstractC3802r.m15123e(str);
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzagn(int i7, C6502e c6502e, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (C6502e) AbstractC3802r.m15129k(c6502e);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzagn zza(C6502e c6502e) {
        this.zze = (C6502e) AbstractC3802r.m15129k(c6502e);
        return this;
    }

    public final zzagn zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i7) {
        if (i7 == 1) {
            return "PASSWORD_RESET";
        }
        if (i7 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i7 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i7 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeb
    public final String zza() {
        int i7;
        i7 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i7 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i7 = 7;
                break;
            case "EMAIL_SIGNIN":
                i7 = 6;
                break;
            default:
                i7 = 0;
                break;
        }
        jSONObject.put("requestType", i7);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C6502e c6502e = this.zze;
        if (c6502e != null) {
            jSONObject.put("androidInstallApp", c6502e.m27085y0());
            jSONObject.put("canHandleCodeInApp", this.zze.m27084x0());
            if (this.zze.m27080D0() != null) {
                jSONObject.put("continueUrl", this.zze.m27080D0());
            }
            if (this.zze.m27078B0() != null) {
                jSONObject.put("iosBundleId", this.zze.m27078B0());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.m27077A0() != null) {
                jSONObject.put("androidPackageName", this.zze.m27077A0());
            }
            if (this.zze.m27086z0() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.m27086z0());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
            if (this.zze.m27079C0() != null) {
                jSONObject.put("linkDomain", this.zze.m27079C0());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzail.zza(jSONObject, "captchaResp", str6);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
