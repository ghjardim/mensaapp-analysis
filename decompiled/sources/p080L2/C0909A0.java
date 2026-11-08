package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.A0 */
/* loaded from: classes.dex */
public final class C0909A0 extends AbstractC7065a {
    public static final Parcelable.Creator<C0909A0> CREATOR = new C0911B0();

    /* renamed from: a */
    public final long f3162a;

    /* renamed from: b */
    public final byte[] f3163b;

    /* renamed from: c */
    public final byte[] f3164c;

    /* renamed from: d */
    public final byte[] f3165d;

    public C0909A0(long j7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f3162a = j7;
        this.f3163b = (byte[]) AbstractC3802r.m15129k(bArr);
        this.f3164c = (byte[]) AbstractC3802r.m15129k(bArr2);
        this.f3165d = (byte[]) AbstractC3802r.m15129k(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0909A0)) {
            return false;
        }
        C0909A0 c0909a0 = (C0909A0) obj;
        return this.f3162a == c0909a0.f3162a && Arrays.equals(this.f3163b, c0909a0.f3163b) && Arrays.equals(this.f3164c, c0909a0.f3164c) && Arrays.equals(this.f3165d, c0909a0.f3165d);
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Long.valueOf(this.f3162a), this.f3163b, this.f3164c, this.f3165d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 1, this.f3162a);
        AbstractC7067c.m29127k(parcel, 2, this.f3163b, false);
        AbstractC7067c.m29127k(parcel, 3, this.f3164c, false);
        AbstractC7067c.m29127k(parcel, 4, this.f3165d, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
