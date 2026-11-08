package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.A0 */
/* loaded from: classes.dex */
public final class C2012A0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2012A0> CREATOR = new C2014B0();

    /* renamed from: a */
    public boolean f6220a;

    /* renamed from: b */
    public byte[] f6221b;

    public C2012A0(boolean z6, byte[] bArr) {
        this.f6220a = z6;
        this.f6221b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2012A0) {
            C2012A0 c2012a0 = (C2012A0) obj;
            if (AbstractC3798p.m15099b(Boolean.valueOf(this.f6220a), Boolean.valueOf(c2012a0.f6220a)) && Arrays.equals(this.f6221b, c2012a0.f6221b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f6220a), Integer.valueOf(Arrays.hashCode(this.f6221b)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, this.f6220a);
        AbstractC7067c.m29127k(parcel, 2, this.f6221b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
