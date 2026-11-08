package com.google.android.gms.internal.p395firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahw extends zzahs {
    private static final String zza = "zzahw";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahs
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzahw zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzae.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahs, com.google.android.gms.internal.p395firebaseauthapi.zzaea
    public final /* synthetic */ zzahs zza(String str) {
        return (zzahw) zza(str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahs
    public final String zza() {
        return this.zzb;
    }
}
