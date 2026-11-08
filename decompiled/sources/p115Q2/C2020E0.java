package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.E0 */
/* loaded from: classes.dex */
public final class C2020E0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2020E0> CREATOR = new C2022F0();

    /* renamed from: a */
    public byte[] f6228a;

    /* renamed from: b */
    public long f6229b;

    public C2020E0(byte[] bArr, long j7) {
        this.f6228a = bArr;
        this.f6229b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2020E0) {
            C2020E0 c2020e0 = (C2020E0) obj;
            if (Arrays.equals(this.f6228a, c2020e0.f6228a) && AbstractC3798p.m15099b(Long.valueOf(this.f6229b), Long.valueOf(c2020e0.f6229b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6228a)), Long.valueOf(this.f6229b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 1, this.f6228a, false);
        AbstractC7067c.m29140x(parcel, 2, this.f6229b);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
