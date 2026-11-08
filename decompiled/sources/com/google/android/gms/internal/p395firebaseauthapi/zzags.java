package com.google.android.gms.internal.p395firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;

/* loaded from: classes.dex */
public class zzags implements zzaea<zzags> {
    private static final String zza = "zzags";
    private String zzb;

    public zzags() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzags zza(String str) {
        try {
            this.zzb = AbstractC0281q.m1144a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public zzags(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}
