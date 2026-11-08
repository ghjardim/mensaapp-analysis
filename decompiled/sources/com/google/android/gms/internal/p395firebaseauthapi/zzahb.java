package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p031E2.AbstractC0281q;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzahb {
    private List<zzahc> zza;

    public zzahb() {
        this.zza = new ArrayList();
    }

    public static zzahb zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahb(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            arrayList.add(jSONObject == null ? new zzahc() : new zzahc(AbstractC0281q.m1144a(jSONObject.optString("federatedId", null)), AbstractC0281q.m1144a(jSONObject.optString("displayName", null)), AbstractC0281q.m1144a(jSONObject.optString("photoUrl", null)), AbstractC0281q.m1144a(jSONObject.optString("providerId", null)), null, AbstractC0281q.m1144a(jSONObject.optString("phoneNumber", null)), AbstractC0281q.m1144a(jSONObject.optString("email", null))));
        }
        return new zzahb(arrayList);
    }

    private zzahb(List<zzahc> list) {
        if (!list.isEmpty()) {
            this.zza = DesugarCollections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzahc> zza() {
        return this.zza;
    }
}
