package p232g0;

import android.os.Parcel;
import android.os.Parcelable;
import p259j0.AbstractC5330M;

/* renamed from: g0.H */
/* loaded from: classes.dex */
public final class C4302H implements Comparable, Parcelable {
    public static final Parcelable.Creator<C4302H> CREATOR = new a();

    /* renamed from: d */
    public static final String f14794d = AbstractC5330M.m21783x0(0);

    /* renamed from: e */
    public static final String f14795e = AbstractC5330M.m21783x0(1);

    /* renamed from: f */
    public static final String f14796f = AbstractC5330M.m21783x0(2);

    /* renamed from: a */
    public final int f14797a;

    /* renamed from: b */
    public final int f14798b;

    /* renamed from: c */
    public final int f14799c;

    /* renamed from: g0.H$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4302H createFromParcel(Parcel parcel) {
            return new C4302H(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4302H[] newArray(int i7) {
            return new C4302H[i7];
        }
    }

    public C4302H(int i7, int i8, int i9) {
        this.f14797a = i7;
        this.f14798b = i8;
        this.f14799c = i9;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4302H c4302h) {
        int i7 = this.f14797a - c4302h.f14797a;
        if (i7 != 0) {
            return i7;
        }
        int i8 = this.f14798b - c4302h.f14798b;
        return i8 == 0 ? this.f14799c - c4302h.f14799c : i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4302H.class != obj.getClass()) {
            return false;
        }
        C4302H c4302h = (C4302H) obj;
        return this.f14797a == c4302h.f14797a && this.f14798b == c4302h.f14798b && this.f14799c == c4302h.f14799c;
    }

    public int hashCode() {
        return (((this.f14797a * 31) + this.f14798b) * 31) + this.f14799c;
    }

    public String toString() {
        return this.f14797a + "." + this.f14798b + "." + this.f14799c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f14797a);
        parcel.writeInt(this.f14798b);
        parcel.writeInt(this.f14799c);
    }

    public C4302H(Parcel parcel) {
        this.f14797a = parcel.readInt();
        this.f14798b = parcel.readInt();
        this.f14799c = parcel.readInt();
    }
}
