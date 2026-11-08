package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzahg implements zzaea<zzahg> {
    private static final String zza = "zzahg";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzagz zze;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahg zza(String str) {
        String str2;
        char c7;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0281q.m1144a(jSONObject.optString("email"));
            this.zzc = AbstractC0281q.m1144a(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                this.zzd = (c7 == 0 || c7 == 1 || c7 == 2 || c7 == 3 || c7 == 4 || c7 == 5) ? optString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzagz.zza(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzail.zza(e, zza, str);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzb != null;
    }

    public final boolean zzf() {
        return this.zze != null;
    }

    public final boolean zzg() {
        return this.zzc != null;
    }

    public final boolean zzh() {
        return this.zzd != null;
    }

    public final zzagz zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
