package p115Q2;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.s */
/* loaded from: classes.dex */
public final class C2107s extends AbstractC7065a {
    public static final Parcelable.Creator<C2107s> CREATOR = new C2109t();

    /* renamed from: a */
    public C2024G0[] f6424a;

    /* renamed from: b */
    public Bitmap f6425b;

    /* renamed from: c */
    public Bitmap f6426c;

    /* renamed from: d */
    public C2034L0[] f6427d;

    public C2107s(C2024G0[] c2024g0Arr, Bitmap bitmap, Bitmap bitmap2, C2034L0[] c2034l0Arr) {
        this.f6424a = c2024g0Arr;
        this.f6425b = bitmap;
        this.f6426c = bitmap2;
        this.f6427d = c2034l0Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2107s) {
            C2107s c2107s = (C2107s) obj;
            if (Arrays.equals(this.f6424a, c2107s.f6424a) && AbstractC3798p.m15099b(this.f6425b, c2107s.f6425b) && AbstractC3798p.m15099b(this.f6426c, c2107s.f6426c) && Arrays.equals(this.f6427d, c2107s.f6427d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6424a)), this.f6425b, this.f6426c, Integer.valueOf(Arrays.hashCode(this.f6427d)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29111H(parcel, 1, this.f6424a, i7, false);
        AbstractC7067c.m29106C(parcel, 2, this.f6425b, i7, false);
        AbstractC7067c.m29106C(parcel, 3, this.f6426c, i7, false);
        AbstractC7067c.m29111H(parcel, 4, this.f6427d, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
