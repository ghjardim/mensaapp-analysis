package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p337s2.C6382k;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public class SignInAccount extends AbstractC7065a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C6382k();

    /* renamed from: a */
    public final String f12232a;

    /* renamed from: b */
    public final GoogleSignInAccount f12233b;

    /* renamed from: c */
    public final String f12234c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f12233b = googleSignInAccount;
        this.f12232a = AbstractC3802r.m15124f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f12234c = AbstractC3802r.m15124f(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f12232a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 4, str, false);
        AbstractC7067c.m29106C(parcel, 7, this.f12233b, i7, false);
        AbstractC7067c.m29108E(parcel, 8, this.f12234c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final GoogleSignInAccount m14780x0() {
        return this.f12233b;
    }
}
