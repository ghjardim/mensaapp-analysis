package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;
import p382y2.AbstractC7067c;

/* renamed from: t3.S */
/* loaded from: classes.dex */
public class C6486S extends AbstractC6476J {
    public static final Parcelable.Creator<C6486S> CREATOR = new C6531s0();

    /* renamed from: a */
    public final String f23393a;

    /* renamed from: b */
    public final String f23394b;

    /* renamed from: c */
    public final long f23395c;

    /* renamed from: d */
    public final String f23396d;

    public C6486S(String str, String str2, long j7, String str3) {
        this.f23393a = AbstractC3802r.m15123e(str);
        this.f23394b = str2;
        this.f23395c = j7;
        this.f23396d = AbstractC3802r.m15123e(str3);
    }

    /* renamed from: A0 */
    public static C6486S m27040A0(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new C6486S(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: M */
    public String mo27007M() {
        return this.f23394b;
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: a */
    public String mo27008a() {
        return this.f23393a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, mo27008a(), false);
        AbstractC7067c.m29108E(parcel, 2, mo27007M(), false);
        AbstractC7067c.m29140x(parcel, 3, mo27009x0());
        AbstractC7067c.m29108E(parcel, 4, m27041y(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: x0 */
    public long mo27009x0() {
        return this.f23395c;
    }

    /* renamed from: y */
    public String m27041y() {
        return this.f23396d;
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: y0 */
    public String mo27010y0() {
        return "phone";
    }

    @Override // p346t3.AbstractC6476J
    /* renamed from: z0 */
    public JSONObject mo27011z0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f23393a);
            jSONObject.putOpt("displayName", this.f23394b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f23395c));
            jSONObject.putOpt("phoneNumber", this.f23396d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzp(e7);
        }
    }
}
