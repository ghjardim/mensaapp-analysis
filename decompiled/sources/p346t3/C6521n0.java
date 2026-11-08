package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p395firebaseauthapi.zzaj;
import com.google.android.gms.internal.p395firebaseauthapi.zzam;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: t3.n0 */
/* loaded from: classes.dex */
public final class C6521n0 extends AbstractC7065a {
    public static final Parcelable.Creator<C6521n0> CREATOR = new C6525p0();

    /* renamed from: a */
    public final String f23460a;

    /* renamed from: b */
    public final String f23461b;

    /* renamed from: c */
    public final String f23462c;

    public C6521n0(String str, String str2, String str3) {
        this.f23460a = str;
        this.f23461b = str2;
        this.f23462c = str3;
    }

    /* renamed from: x0 */
    public static zzaj m27122x0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaj.zza(new ArrayList());
        }
        zzam zzg = zzaj.zzg();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            zzg.zza(new C6521n0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    /* renamed from: y0 */
    public static final JSONObject m27123y0(C6521n0 c6521n0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", c6521n0.f23460a);
        jSONObject.put("name", c6521n0.f23461b);
        jSONObject.put("displayName", c6521n0.f23462c);
        return jSONObject;
    }

    /* renamed from: z0 */
    public static final C6521n0 m27124z0(JSONObject jSONObject) {
        return new C6521n0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23460a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f23461b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f23462c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
