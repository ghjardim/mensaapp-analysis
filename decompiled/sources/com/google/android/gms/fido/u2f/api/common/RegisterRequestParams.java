package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p087M2.C1146a;
import p087M2.C1149d;
import p087M2.C1150e;
import p087M2.C1156k;
import p382y2.AbstractC7067c;

@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new C1156k();

    /* renamed from: a */
    public final Integer f12614a;

    /* renamed from: b */
    public final Double f12615b;

    /* renamed from: c */
    public final Uri f12616c;

    /* renamed from: d */
    public final List f12617d;

    /* renamed from: e */
    public final List f12618e;

    /* renamed from: f */
    public final C1146a f12619f;

    /* renamed from: n */
    public final String f12620n;

    /* renamed from: o */
    public Set f12621o;

    public RegisterRequestParams(Integer num, Double d7, Uri uri, List list, List list2, C1146a c1146a, String str) {
        this.f12614a = num;
        this.f12615b = d7;
        this.f12616c = uri;
        AbstractC3802r.m15120b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f12617d = list;
        this.f12618e = list2;
        this.f12619f = c1146a;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1149d c1149d = (C1149d) it.next();
            AbstractC3802r.m15120b((uri == null && c1149d.m4442x0() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (c1149d.m4442x0() != null) {
                hashSet.add(Uri.parse(c1149d.m4442x0()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C1150e c1150e = (C1150e) it2.next();
            AbstractC3802r.m15120b((uri == null && c1150e.m4445x0() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (c1150e.m4445x0() != null) {
                hashSet.add(Uri.parse(c1150e.m4445x0()));
            }
        }
        this.f12621o = hashSet;
        AbstractC3802r.m15120b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f12620n = str;
    }

    /* renamed from: A0 */
    public List m15179A0() {
        return this.f12617d;
    }

    /* renamed from: B0 */
    public List m15180B0() {
        return this.f12618e;
    }

    /* renamed from: C0 */
    public Integer m15181C0() {
        return this.f12614a;
    }

    /* renamed from: D0 */
    public Double m15182D0() {
        return this.f12615b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return AbstractC3798p.m15099b(this.f12614a, registerRequestParams.f12614a) && AbstractC3798p.m15099b(this.f12615b, registerRequestParams.f12615b) && AbstractC3798p.m15099b(this.f12616c, registerRequestParams.f12616c) && AbstractC3798p.m15099b(this.f12617d, registerRequestParams.f12617d) && (((list = this.f12618e) == null && registerRequestParams.f12618e == null) || (list != null && (list2 = registerRequestParams.f12618e) != null && list.containsAll(list2) && registerRequestParams.f12618e.containsAll(this.f12618e))) && AbstractC3798p.m15099b(this.f12619f, registerRequestParams.f12619f) && AbstractC3798p.m15099b(this.f12620n, registerRequestParams.f12620n);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f12614a, this.f12616c, this.f12615b, this.f12617d, this.f12618e, this.f12619f, this.f12620n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29139w(parcel, 2, m15181C0(), false);
        AbstractC7067c.m29131o(parcel, 3, m15182D0(), false);
        AbstractC7067c.m29106C(parcel, 4, m15183x0(), i7, false);
        AbstractC7067c.m29112I(parcel, 5, m15179A0(), false);
        AbstractC7067c.m29112I(parcel, 6, m15180B0(), false);
        AbstractC7067c.m29106C(parcel, 7, m15184y0(), i7, false);
        AbstractC7067c.m29108E(parcel, 8, m15185z0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public Uri m15183x0() {
        return this.f12616c;
    }

    /* renamed from: y0 */
    public C1146a m15184y0() {
        return this.f12619f;
    }

    /* renamed from: z0 */
    public String m15185z0() {
        return this.f12620n;
    }
}
