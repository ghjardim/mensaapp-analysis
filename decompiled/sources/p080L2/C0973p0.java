package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.p0 */
/* loaded from: classes.dex */
public final class C0973p0 extends AbstractC7065a {
    public static final Parcelable.Creator<C0973p0> CREATOR = new C0975q0();

    /* renamed from: a */
    public final byte[] f3263a;

    /* renamed from: b */
    public final byte[] f3264b;

    public C0973p0(byte[] bArr, byte[] bArr2) {
        this.f3263a = bArr;
        this.f3264b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0973p0)) {
            return false;
        }
        C0973p0 c0973p0 = (C0973p0) obj;
        return Arrays.equals(this.f3263a, c0973p0.f3263a) && Arrays.equals(this.f3264b, c0973p0.f3264b);
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f3263a, this.f3264b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 1, this.f3263a, false);
        AbstractC7067c.m29127k(parcel, 2, this.f3264b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
