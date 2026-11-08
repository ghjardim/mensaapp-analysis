package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.s0 */
/* loaded from: classes.dex */
public final class C2108s0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2108s0> CREATOR = new C2110t0();

    /* renamed from: a */
    public String[] f6428a;

    public C2108s0(String[] strArr) {
        this.f6428a = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2108s0) {
            return Arrays.equals(this.f6428a, ((C2108s0) obj).f6428a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6428a)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29109F(parcel, 1, this.f6428a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
