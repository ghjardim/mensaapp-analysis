package p087M2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONException;
import org.json.JSONObject;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: M2.e */
/* loaded from: classes.dex */
public class C1150e extends AbstractC7065a {
    public static final Parcelable.Creator<C1150e> CREATOR = new C1157l();

    /* renamed from: a */
    public final C1147b f3739a;

    /* renamed from: b */
    public final String f3740b;

    /* renamed from: c */
    public String f3741c;

    public C1150e(C1147b c1147b, String str, String str2) {
        this.f3739a = (C1147b) AbstractC3802r.m15129k(c1147b);
        this.f3741c = str;
        this.f3740b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150e)) {
            return false;
        }
        C1150e c1150e = (C1150e) obj;
        String str = this.f3741c;
        if (str == null) {
            if (c1150e.f3741c != null) {
                return false;
            }
        } else if (!str.equals(c1150e.f3741c)) {
            return false;
        }
        if (!this.f3739a.equals(c1150e.f3739a)) {
            return false;
        }
        String str2 = this.f3740b;
        if (str2 == null) {
            if (c1150e.f3740b != null) {
                return false;
            }
        } else if (!str2.equals(c1150e.f3740b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3741c;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f3739a.hashCode();
        String str2 = this.f3740b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f3739a.m4438x0(), 11));
            if (this.f3739a.m4439y0() != EnumC1148c.UNKNOWN) {
                jSONObject.put("version", this.f3739a.m4439y0().toString());
            }
            if (this.f3739a.m4440z0() != null) {
                jSONObject.put("transports", this.f3739a.m4440z0().toString());
            }
            String str = this.f3741c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f3740b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 2, m4447z0(), i7, false);
        AbstractC7067c.m29108E(parcel, 3, m4446y0(), false);
        AbstractC7067c.m29108E(parcel, 4, m4445x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m4445x0() {
        return this.f3740b;
    }

    /* renamed from: y0 */
    public String m4446y0() {
        return this.f3741c;
    }

    /* renamed from: z0 */
    public C1147b m4447z0() {
        return this.f3739a;
    }
}
