package p354u3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzagl;
import com.google.android.gms.internal.p395firebaseauthapi.zzahc;
import com.google.android.gms.internal.p395firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;
import p346t3.InterfaceC6499c0;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: u3.e */
/* loaded from: classes.dex */
public final class C6646e extends AbstractC7065a implements InterfaceC6499c0 {
    public static final Parcelable.Creator<C6646e> CREATOR = new C6644d();

    /* renamed from: a */
    public String f24005a;

    /* renamed from: b */
    public String f24006b;

    /* renamed from: c */
    public String f24007c;

    /* renamed from: d */
    public String f24008d;

    /* renamed from: e */
    public Uri f24009e;

    /* renamed from: f */
    public String f24010f;

    /* renamed from: n */
    public String f24011n;

    /* renamed from: o */
    public boolean f24012o;

    /* renamed from: p */
    public String f24013p;

    public C6646e(zzahc zzahcVar) {
        AbstractC3802r.m15129k(zzahcVar);
        this.f24005a = zzahcVar.zzd();
        this.f24006b = AbstractC3802r.m15123e(zzahcVar.zzf());
        this.f24007c = zzahcVar.zzb();
        Uri zza = zzahcVar.zza();
        if (zza != null) {
            this.f24008d = zza.toString();
            this.f24009e = zza;
        }
        this.f24010f = zzahcVar.zzc();
        this.f24011n = zzahcVar.zze();
        this.f24012o = false;
        this.f24013p = zzahcVar.zzg();
    }

    /* renamed from: x0 */
    public static C6646e m27534x0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C6646e(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzzp(e7);
        }
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: M */
    public final String mo26964M() {
        return this.f24007c;
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: a */
    public final String mo26979a() {
        return this.f24005a;
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: f0 */
    public final String mo26980f0() {
        return this.f24010f;
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: g */
    public final String mo27065g() {
        return this.f24006b;
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: m */
    public final Uri mo26981m() {
        if (!TextUtils.isEmpty(this.f24008d) && this.f24009e == null) {
            this.f24009e = Uri.parse(this.f24008d);
        }
        return this.f24009e;
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: r */
    public final boolean mo27066r() {
        return this.f24012o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, mo26979a(), false);
        AbstractC7067c.m29108E(parcel, 2, mo27065g(), false);
        AbstractC7067c.m29108E(parcel, 3, mo26964M(), false);
        AbstractC7067c.m29108E(parcel, 4, this.f24008d, false);
        AbstractC7067c.m29108E(parcel, 5, mo26980f0(), false);
        AbstractC7067c.m29108E(parcel, 6, mo26983y(), false);
        AbstractC7067c.m29123g(parcel, 7, mo27066r());
        AbstractC7067c.m29108E(parcel, 8, this.f24013p, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: y */
    public final String mo26983y() {
        return this.f24011n;
    }

    /* renamed from: y0 */
    public final String m27535y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f24005a);
            jSONObject.putOpt("providerId", this.f24006b);
            jSONObject.putOpt("displayName", this.f24007c);
            jSONObject.putOpt("photoUrl", this.f24008d);
            jSONObject.putOpt("email", this.f24010f);
            jSONObject.putOpt("phoneNumber", this.f24011n);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f24012o));
            jSONObject.putOpt("rawUserInfo", this.f24013p);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzzp(e7);
        }
    }

    public final String zza() {
        return this.f24013p;
    }

    public C6646e(zzagl zzaglVar, String str) {
        AbstractC3802r.m15129k(zzaglVar);
        AbstractC3802r.m15123e(str);
        this.f24005a = AbstractC3802r.m15123e(zzaglVar.zzi());
        this.f24006b = str;
        this.f24010f = zzaglVar.zzh();
        this.f24007c = zzaglVar.zzg();
        Uri zzc = zzaglVar.zzc();
        if (zzc != null) {
            this.f24008d = zzc.toString();
            this.f24009e = zzc;
        }
        this.f24012o = zzaglVar.zzm();
        this.f24013p = null;
        this.f24011n = zzaglVar.zzj();
    }

    public C6646e(String str, String str2, String str3, String str4, String str5, String str6, boolean z6, String str7) {
        this.f24005a = str;
        this.f24006b = str2;
        this.f24010f = str3;
        this.f24011n = str4;
        this.f24007c = str5;
        this.f24008d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f24009e = Uri.parse(this.f24008d);
        }
        this.f24012o = z6;
        this.f24013p = str7;
    }
}
