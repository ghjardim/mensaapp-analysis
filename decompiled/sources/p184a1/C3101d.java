package p184a1;

import android.os.Parcel;
import android.os.Parcelable;
import p203c3.AbstractC3574d;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;

/* renamed from: a1.d */
/* loaded from: classes.dex */
public final class C3101d implements C4334x.b {
    public static final Parcelable.Creator<C3101d> CREATOR = new a();

    /* renamed from: a */
    public final float f9583a;

    /* renamed from: b */
    public final int f9584b;

    /* renamed from: a1.d$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3101d createFromParcel(Parcel parcel) {
            return new C3101d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3101d[] newArray(int i7) {
            return new C3101d[i7];
        }
    }

    public /* synthetic */ C3101d(Parcel parcel, a aVar) {
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
        if (obj == null || C3101d.class != obj.getClass()) {
            return false;
        }
        C3101d c3101d = (C3101d) obj;
        return this.f9583a == c3101d.f9583a && this.f9584b == c3101d.f9584b;
    }

    public int hashCode() {
        return ((527 + AbstractC3574d.m14412a(this.f9583a)) * 31) + this.f9584b;
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
        return "smta: captureFrameRate=" + this.f9583a + ", svcTemporalLayerCount=" + this.f9584b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f9583a);
        parcel.writeInt(this.f9584b);
    }

    public C3101d(float f7, int i7) {
        this.f9583a = f7;
        this.f9584b = i7;
    }

    public C3101d(Parcel parcel) {
        this.f9583a = parcel.readFloat();
        this.f9584b = parcel.readInt();
    }
}
