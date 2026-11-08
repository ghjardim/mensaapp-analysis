package com.google.android.gms.internal.p395firebaseauthapi;

import android.util.Log;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahy extends zzahs {
    private static final String zza = "zzahy";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahs, com.google.android.gms.internal.p395firebaseauthapi.zzaea
    public final /* synthetic */ zzahs zza(String str) {
        return (zzahy) zza(str);
    }

    public final int zzb() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahs
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzahy zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (optJSONObject != null) {
                this.zzc = zzae.zza(optJSONObject.optString("sharedSecretKey"));
                this.zzd = optJSONObject.optInt("verificationCodeLength");
                this.zze = zzae.zza(optJSONObject.optString("hashingAlgorithm"));
                this.zzf = optJSONObject.optInt("periodSec");
                this.zzb = zzae.zza(optJSONObject.optString("sessionInfo"));
                String optString = optJSONObject.optString("finalizeEnrollmentTime");
                try {
                    this.zzg = zzanp.zza(zzanp.zza(optString));
                } catch (ParseException unused) {
                    Log.e(zza, "Failed to parse timestamp: " + optString);
                }
            }
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzahs
    public final String zza() {
        return this.zzb;
    }
}
