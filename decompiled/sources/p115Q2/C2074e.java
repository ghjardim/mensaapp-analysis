package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.e */
/* loaded from: classes.dex */
public final class C2074e extends AbstractC7065a {
    public static final Parcelable.Creator<C2074e> CREATOR = new C2077f();

    /* renamed from: a */
    public C2052V[] f6396a;

    public C2074e(C2052V[] c2052vArr) {
        this.f6396a = c2052vArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2074e) {
            return Arrays.equals(this.f6396a, ((C2074e) obj).f6396a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6396a)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29111H(parcel, 2, this.f6396a, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
