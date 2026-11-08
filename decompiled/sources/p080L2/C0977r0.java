package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.r0 */
/* loaded from: classes.dex */
public final class C0977r0 extends AbstractC7065a {
    public static final Parcelable.Creator<C0977r0> CREATOR = new C0979s0();

    /* renamed from: a */
    public final boolean f3280a;

    /* renamed from: b */
    public final byte[] f3281b;

    public C0977r0(boolean z6, byte[] bArr) {
        this.f3280a = z6;
        this.f3281b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0977r0)) {
            return false;
        }
        C0977r0 c0977r0 = (C0977r0) obj;
        return this.f3280a == c0977r0.f3280a && Arrays.equals(this.f3281b, c0977r0.f3281b);
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f3280a), this.f3281b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, this.f3280a);
        AbstractC7067c.m29127k(parcel, 2, this.f3281b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
