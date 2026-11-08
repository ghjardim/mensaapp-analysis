package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.w0 */
/* loaded from: classes.dex */
public final class C2116w0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2116w0> CREATOR = new C2118x0();

    /* renamed from: a */
    public int f6436a;

    /* renamed from: b */
    public C2112u0[] f6437b;

    public C2116w0(int i7, C2112u0[] c2112u0Arr) {
        this.f6436a = i7;
        this.f6437b = c2112u0Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2116w0) {
            C2116w0 c2116w0 = (C2116w0) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6436a), Integer.valueOf(c2116w0.f6436a)) && Arrays.equals(this.f6437b, c2116w0.f6437b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6436a), Integer.valueOf(Arrays.hashCode(this.f6437b)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6436a);
        AbstractC7067c.m29111H(parcel, 2, this.f6437b, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
