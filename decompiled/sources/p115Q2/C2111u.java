package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.u */
/* loaded from: classes.dex */
public final class C2111u extends AbstractC7065a {
    public static final Parcelable.Creator<C2111u> CREATOR = new C2113v();

    /* renamed from: a */
    public boolean f6429a;

    /* renamed from: b */
    public int[] f6430b;

    public C2111u(boolean z6, int[] iArr) {
        this.f6429a = z6;
        this.f6430b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2111u) {
            C2111u c2111u = (C2111u) obj;
            if (AbstractC3798p.m15099b(Boolean.valueOf(this.f6429a), Boolean.valueOf(c2111u.f6429a)) && Arrays.equals(this.f6430b, c2111u.f6430b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f6429a), Integer.valueOf(Arrays.hashCode(this.f6430b)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, this.f6429a);
        AbstractC7067c.m29137u(parcel, 2, this.f6430b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
