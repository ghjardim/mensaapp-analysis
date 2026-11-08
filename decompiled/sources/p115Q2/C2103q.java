package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.q */
/* loaded from: classes.dex */
public final class C2103q extends AbstractC7065a {
    public static final Parcelable.Creator<C2103q> CREATOR = new C2105r();

    /* renamed from: a */
    public C2020E0[] f6422a;

    public C2103q(C2020E0[] c2020e0Arr) {
        this.f6422a = c2020e0Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2103q) {
            return Arrays.equals(this.f6422a, ((C2103q) obj).f6422a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6422a)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29111H(parcel, 1, this.f6422a, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
