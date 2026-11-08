package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.X0 */
/* loaded from: classes.dex */
public final class C2057X0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2057X0> CREATOR = new C2059Y0();

    /* renamed from: a */
    public byte[] f6368a;

    public C2057X0(byte[] bArr) {
        this.f6368a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2057X0) {
            return Arrays.equals(this.f6368a, ((C2057X0) obj).f6368a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6368a)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 1, this.f6368a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
