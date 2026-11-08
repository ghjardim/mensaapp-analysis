package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;
import p346t3.C6521n0;

/* loaded from: classes.dex */
public class zzagm implements zzaea<zzagm> {
    private static final String zza = "zzagm";
    private zzago zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) {
        zzago zzagoVar;
        int i7;
        zzagl zzaglVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z6 = false;
                    int i8 = 0;
                    while (i8 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                        if (jSONObject2 == null) {
                            zzaglVar = new zzagl();
                            i7 = i8;
                        } else {
                            i7 = i8;
                            zzaglVar = new zzagl(AbstractC0281q.m1144a(jSONObject2.optString("localId", null)), AbstractC0281q.m1144a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z6), AbstractC0281q.m1144a(jSONObject2.optString("displayName", null)), AbstractC0281q.m1144a(jSONObject2.optString("photoUrl", null)), zzahb.zza(jSONObject2.optJSONArray("providerUserInfo")), AbstractC0281q.m1144a(jSONObject2.optString("rawPassword", null)), AbstractC0281q.m1144a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzagz.zza(jSONObject2.optJSONArray("mfaInfo")), C6521n0.m27122x0(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzaglVar);
                        i8 = i7 + 1;
                        z6 = false;
                    }
                    zzagoVar = new zzago(arrayList);
                }
                zzagoVar = new zzago(new ArrayList());
            } else {
                zzagoVar = new zzago();
            }
            this.zzb = zzagoVar;
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzail.zza(e, zza, str);
        }
    }

    public final List<zzagl> zza() {
        return this.zzb.zza();
    }
}
