package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p345t2.C6433b;
import p345t2.C6456y;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC7065a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C6456y();

    /* renamed from: a */
    public final String f12235a;

    /* renamed from: b */
    public final GoogleSignInOptions f12236b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f12235a = AbstractC3802r.m15123e(str);
        this.f12236b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f12235a.equals(signInConfiguration.f12235a)) {
            GoogleSignInOptions googleSignInOptions = this.f12236b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f12236b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C6433b().m26915a(this.f12235a).m26915a(this.f12236b).m26916b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f12235a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, str, false);
        AbstractC7067c.m29106C(parcel, 5, this.f12236b, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final GoogleSignInOptions m14787x0() {
        return this.f12236b;
    }
}
