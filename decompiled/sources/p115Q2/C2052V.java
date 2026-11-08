package p115Q2;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.V */
/* loaded from: classes.dex */
public final class C2052V extends AbstractC7065a {
    public static final Parcelable.Creator<C2052V> CREATOR = new C2054W();

    /* renamed from: a */
    public C2056X f6283a;

    /* renamed from: b */
    public Bitmap f6284b;

    public C2052V(C2056X c2056x, Bitmap bitmap) {
        this.f6283a = c2056x;
        this.f6284b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2052V) {
            C2052V c2052v = (C2052V) obj;
            if (AbstractC3798p.m15099b(this.f6283a, c2052v.f6283a) && AbstractC3798p.m15099b(this.f6284b, c2052v.f6284b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6283a, this.f6284b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f6283a, i7, false);
        AbstractC7067c.m29106C(parcel, 2, this.f6284b, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
