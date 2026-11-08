package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaia;
import com.google.android.gms.internal.p395firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;
import p382y2.AbstractC7067c;

/* renamed from: t3.Y */
/* loaded from: classes.dex */
public class C6492Y extends AbstractC6476J {
    public static final Parcelable.Creator<C6492Y> CREATOR = new C6535u0();

    /* renamed from: a */
    public final String f23401a;

    /* renamed from: b */
    public final String f23402b;

    /* renamed from: c */
    public final long f23403c;

    /* renamed from: d */
    public final zzaia f23404d;

    public C6492Y(String str, String str2, long j7, zzaia zzaiaVar) {
        this.f23401a = AbstractC3802r.m15123e(str);
        this.f23402b = str2;
        this.f23403c = j7;
        this.f23404d = (zzaia) AbstractC3802r.m15130l(zzaiaVar, "totpInfo cannot be null.");
    }

    /* renamed from: A0 */
    public static C6492Y m27051A0(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long optLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new C6492Y(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzaia());
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: M */
    public String mo27007M() {
        return this.f23402b;
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: a */
    public String mo27008a() {
        return this.f23401a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, mo27008a(), false);
        AbstractC7067c.m29108E(parcel, 2, mo27007M(), false);
        AbstractC7067c.m29140x(parcel, 3, mo27009x0());
        AbstractC7067c.m29106C(parcel, 4, this.f23404d, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: x0 */
    public long mo27009x0() {
        return this.f23403c;
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: y0 */
    public String mo27010y0() {
        return "totp";
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: z0 */
    public JSONObject mo27011z0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f23401a);
            jSONObject.putOpt("displayName", this.f23402b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f23403c));
            jSONObject.putOpt("totpInfo", this.f23404d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzp(e7);
        }
    }
}
