package com.google.android.gms.internal.p395firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0281q;
import p031E2.C0271g;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public class zzagw extends AbstractC7065a implements zzaea<zzagw> {
    public static final Parcelable.Creator<zzagw> CREATOR = new zzagv();
    private static final String zza = "zzagw";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzagw() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaea
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagw zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0281q.m1144a(jSONObject.optString("refresh_token"));
            this.zzc = AbstractC0281q.m1144a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = AbstractC0281q.m1144a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, this.zzb, false);
        AbstractC7067c.m29108E(parcel, 3, this.zzc, false);
        AbstractC7067c.m29142z(parcel, 4, Long.valueOf(zza()), false);
        AbstractC7067c.m29108E(parcel, 5, this.zze, false);
        Long l7 = this.zzf;
        l7.longValue();
        AbstractC7067c.m29142z(parcel, 6, l7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public final long zza() {
        Long l7 = this.zzd;
        if (l7 == null) {
            return 0L;
        }
        return l7.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzzp(e7);
        }
    }

    public final boolean zzg() {
        return C0271g.m1116d().mo1110a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public static zzagw zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzagw zzagwVar = new zzagw();
            zzagwVar.zzb = jSONObject.optString("refresh_token", null);
            zzagwVar.zzc = jSONObject.optString("access_token", null);
            zzagwVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzagwVar.zze = jSONObject.optString("token_type", null);
            zzagwVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzagwVar;
        } catch (JSONException e7) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzzp(e7);
        }
    }

    public final void zzc(String str) {
        this.zzb = AbstractC3802r.m15123e(str);
    }

    public zzagw(String str, String str2, Long l7, String str3) {
        this(str, str2, l7, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzagw(String str, String str2, Long l7, String str3, Long l8) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l7;
        this.zze = str3;
        this.zzf = l8;
    }

    public final String zzd() {
        return this.zzb;
    }
}
