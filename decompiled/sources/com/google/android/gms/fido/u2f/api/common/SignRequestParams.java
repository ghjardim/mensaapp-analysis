package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p087M2.C1146a;
import p087M2.C1150e;
import p087M2.C1158m;
import p382y2.AbstractC7067c;

@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new C1158m();

    /* renamed from: a */
    public final Integer f12622a;

    /* renamed from: b */
    public final Double f12623b;

    /* renamed from: c */
    public final Uri f12624c;

    /* renamed from: d */
    public final byte[] f12625d;

    /* renamed from: e */
    public final List f12626e;

    /* renamed from: f */
    public final C1146a f12627f;

    /* renamed from: n */
    public final String f12628n;

    /* renamed from: o */
    public final Set f12629o;

    public SignRequestParams(Integer num, Double d7, Uri uri, byte[] bArr, List list, C1146a c1146a, String str) {
        this.f12622a = num;
        this.f12623b = d7;
        this.f12624c = uri;
        this.f12625d = bArr;
        AbstractC3802r.m15120b((list == null || list.isEmpty()) ? false : true, "registeredKeys must not be null or empty");
        this.f12626e = list;
        this.f12627f = c1146a;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1150e c1150e = (C1150e) it.next();
            AbstractC3802r.m15120b((c1150e.m4445x0() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            c1150e.m4446y0();
            AbstractC3802r.m15120b(true, "register request has null challenge and no default challenge isprovided");
            if (c1150e.m4445x0() != null) {
                hashSet.add(Uri.parse(c1150e.m4445x0()));
            }
        }
        this.f12629o = hashSet;
        AbstractC3802r.m15120b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f12628n = str;
    }

    /* renamed from: A0 */
    public String m15186A0() {
        return this.f12628n;
    }

    /* renamed from: B0 */
    public List m15187B0() {
        return this.f12626e;
    }

    /* renamed from: C0 */
    public Integer m15188C0() {
        return this.f12622a;
    }

    /* renamed from: D0 */
    public Double m15189D0() {
        return this.f12623b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return AbstractC3798p.m15099b(this.f12622a, signRequestParams.f12622a) && AbstractC3798p.m15099b(this.f12623b, signRequestParams.f12623b) && AbstractC3798p.m15099b(this.f12624c, signRequestParams.f12624c) && Arrays.equals(this.f12625d, signRequestParams.f12625d) && this.f12626e.containsAll(signRequestParams.f12626e) && signRequestParams.f12626e.containsAll(this.f12626e) && AbstractC3798p.m15099b(this.f12627f, signRequestParams.f12627f) && AbstractC3798p.m15099b(this.f12628n, signRequestParams.f12628n);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f12622a, this.f12624c, this.f12623b, this.f12626e, this.f12627f, this.f12628n, Integer.valueOf(Arrays.hashCode(this.f12625d)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29139w(parcel, 2, m15188C0(), false);
        AbstractC7067c.m29131o(parcel, 3, m15189D0(), false);
        AbstractC7067c.m29106C(parcel, 4, m15190x0(), i7, false);
        AbstractC7067c.m29127k(parcel, 5, m15192z0(), false);
        AbstractC7067c.m29112I(parcel, 6, m15187B0(), false);
        AbstractC7067c.m29106C(parcel, 7, m15191y0(), i7, false);
        AbstractC7067c.m29108E(parcel, 8, m15186A0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public Uri m15190x0() {
        return this.f12624c;
    }

    /* renamed from: y0 */
    public C1146a m15191y0() {
        return this.f12627f;
    }

    /* renamed from: z0 */
    public byte[] m15192z0() {
        return this.f12625d;
    }
}
