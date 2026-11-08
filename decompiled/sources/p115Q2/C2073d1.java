package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.d1 */
/* loaded from: classes.dex */
public final class C2073d1 extends AbstractC7065a {
    public static final Parcelable.Creator<C2073d1> CREATOR = new C2076e1();

    /* renamed from: a */
    public C2033L[] f6395a;

    public C2073d1(C2033L[] c2033lArr) {
        this.f6395a = c2033lArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2073d1) {
            return Arrays.equals(this.f6395a, ((C2073d1) obj).f6395a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6395a)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29111H(parcel, 1, this.f6395a, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
