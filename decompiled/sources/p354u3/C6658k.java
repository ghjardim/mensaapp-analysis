package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p346t3.InterfaceC6460B;
import p382y2.AbstractC7067c;

/* renamed from: u3.k */
/* loaded from: classes.dex */
public final class C6658k implements InterfaceC6460B {
    public static final Parcelable.Creator<C6658k> CREATOR = new C6656j();

    /* renamed from: a */
    public long f24051a;

    /* renamed from: b */
    public long f24052b;

    public C6658k(long j7, long j8) {
        this.f24051a = j7;
        this.f24052b = j8;
    }

    /* renamed from: b */
    public static C6658k m27557b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C6658k(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // p346t3.InterfaceC6460B
    /* renamed from: D */
    public final long mo26986D() {
        return this.f24052b;
    }

    @Override // p346t3.InterfaceC6460B
    /* renamed from: N */
    public final long mo26987N() {
        return this.f24051a;
    }

    /* renamed from: a */
    public final JSONObject m27558a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f24051a);
            jSONObject.put("creationTimestamp", this.f24052b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 1, mo26987N());
        AbstractC7067c.m29140x(parcel, 2, mo26986D());
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
