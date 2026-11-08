package p115Q2;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.Z0 */
/* loaded from: classes.dex */
public final class C2061Z0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2061Z0> CREATOR = new C2064a1();

    /* renamed from: a */
    public Bitmap[] f6378a;

    public C2061Z0(Bitmap[] bitmapArr) {
        this.f6378a = bitmapArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2061Z0) {
            return Arrays.equals(this.f6378a, ((C2061Z0) obj).f6378a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6378a)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29111H(parcel, 2, this.f6378a, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
