package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzagt implements zzaea<zzagt> {
    private static final String zza = "zzagt";
    private String zzb;
    private zzaj<zzahe> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagt zza(String str) {
        zzaj<zzahe> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0281q.m1144a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzam zzg = zzaj.zzg();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i7);
                        zzg.zza(jSONObject2 == null ? zzahe.zza(null, null) : zzahe.zza(AbstractC0281q.m1144a(jSONObject2.optString("provider")), AbstractC0281q.m1144a(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaj.zza(new ArrayList());
                this.zzc = zza2;
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

    public final String zzb(String str) {
        AbstractC3802r.m15123e(str);
        zzaj<zzahe> zzajVar = this.zzc;
        if (zzajVar != null && !zzajVar.isEmpty()) {
            zzaj<zzahe> zzajVar2 = this.zzc;
            int size = zzajVar2.size();
            int i7 = 0;
            while (i7 < size) {
                zzahe zzaheVar = zzajVar2.get(i7);
                i7++;
                zzahe zzaheVar2 = zzaheVar;
                String zza2 = zzaheVar2.zza();
                String zzb = zzaheVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzaheVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
