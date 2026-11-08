package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.g */
/* loaded from: classes.dex */
public final class C2080g extends AbstractC7065a {
    public static final Parcelable.Creator<C2080g> CREATOR = new C2083h();

    /* renamed from: a */
    public C2060Z[] f6399a;

    /* renamed from: b */
    public int f6400b;

    public C2080g(C2060Z[] c2060zArr, int i7) {
        this.f6399a = c2060zArr;
        this.f6400b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2080g) {
            C2080g c2080g = (C2080g) obj;
            if (Arrays.equals(this.f6399a, c2080g.f6399a) && AbstractC3798p.m15099b(Integer.valueOf(this.f6400b), Integer.valueOf(c2080g.f6400b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f6399a)), Integer.valueOf(this.f6400b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29111H(parcel, 1, this.f6399a, i7, false);
        AbstractC7067c.m29136t(parcel, 2, this.f6400b);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
