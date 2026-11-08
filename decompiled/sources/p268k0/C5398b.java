package p268k0;

import android.os.Parcel;
import android.os.Parcelable;
import p203c3.AbstractC3574d;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5332a;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class C5398b implements C4334x.b {
    public static final Parcelable.Creator<C5398b> CREATOR = new a();

    /* renamed from: a */
    public final float f19241a;

    /* renamed from: b */
    public final float f19242b;

    /* renamed from: k0.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5398b createFromParcel(Parcel parcel) {
            return new C5398b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5398b[] newArray(int i7) {
            return new C5398b[i7];
        }
    }

    public /* synthetic */ C5398b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: C */
    public /* synthetic */ C4327q mo8979C() {
        return AbstractC4335y.m18406b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5398b.class != obj.getClass()) {
            return false;
        }
        C5398b c5398b = (C5398b) obj;
        return this.f19241a == c5398b.f19241a && this.f19242b == c5398b.f19242b;
    }

    public int hashCode() {
        return ((527 + AbstractC3574d.m14412a(this.f19241a)) * 31) + AbstractC3574d.m14412a(this.f19242b);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public /* synthetic */ void mo8980o(C4333w.b bVar) {
        AbstractC4335y.m18407c(this, bVar);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        return "xyz: latitude=" + this.f19241a + ", longitude=" + this.f19242b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f19241a);
        parcel.writeFloat(this.f19242b);
    }

    public C5398b(float f7, float f8) {
        AbstractC5332a.m21797b(f7 >= -90.0f && f7 <= 90.0f && f8 >= -180.0f && f8 <= 180.0f, "Invalid latitude or longitude");
        this.f19241a = f7;
        this.f19242b = f8;
    }

    public C5398b(Parcel parcel) {
        this.f19241a = parcel.readFloat();
        this.f19242b = parcel.readFloat();
    }
}
