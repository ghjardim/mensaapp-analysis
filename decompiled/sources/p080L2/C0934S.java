package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.S */
/* loaded from: classes.dex */
public final class C0934S extends AbstractC7065a {
    public static final Parcelable.Creator<C0934S> CREATOR = new C0935T();

    /* renamed from: a */
    public final byte[][] f3201a;

    public C0934S(byte[][] bArr) {
        AbstractC3802r.m15119a(bArr != null);
        AbstractC3802r.m15119a(1 == ((bArr.length & 1) ^ 1));
        int i7 = 0;
        while (i7 < bArr.length) {
            AbstractC3802r.m15119a(i7 == 0 || bArr[i7] != null);
            int i8 = i7 + 1;
            AbstractC3802r.m15119a(bArr[i8] != null);
            int length = bArr[i8].length;
            AbstractC3802r.m15119a(length == 32 || length == 64);
            i7 += 2;
        }
        this.f3201a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0934S) {
            return Arrays.deepEquals(this.f3201a, ((C0934S) obj).f3201a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 0;
        for (byte[] bArr : this.f3201a) {
            i7 ^= AbstractC3798p.m15100c(bArr);
        }
        return i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29128l(parcel, 1, this.f3201a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
