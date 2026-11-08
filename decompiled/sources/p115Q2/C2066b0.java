package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.b0 */
/* loaded from: classes.dex */
public final class C2066b0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2066b0> CREATOR = new C2069c0();

    /* renamed from: a */
    public byte[] f6386a;

    public C2066b0(byte[] bArr) {
        this.f6386a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2066b0) {
            return Arrays.equals(this.f6386a, ((C2066b0) obj).f6386a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6386a)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 1, this.f6386a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
