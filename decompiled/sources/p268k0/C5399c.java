package p268k0;

import android.os.Parcel;
import android.os.Parcelable;
import p203c3.AbstractC3579i;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C5399c implements C4334x.b {
    public static final Parcelable.Creator<C5399c> CREATOR = new a();

    /* renamed from: a */
    public final long f19243a;

    /* renamed from: b */
    public final long f19244b;

    /* renamed from: c */
    public final long f19245c;

    /* renamed from: k0.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5399c createFromParcel(Parcel parcel) {
            return new C5399c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5399c[] newArray(int i7) {
            return new C5399c[i7];
        }
    }

    public /* synthetic */ C5399c(Parcel parcel, a aVar) {
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
        if (!(obj instanceof C5399c)) {
            return false;
        }
        C5399c c5399c = (C5399c) obj;
        return this.f19243a == c5399c.f19243a && this.f19244b == c5399c.f19244b && this.f19245c == c5399c.f19245c;
    }

    public int hashCode() {
        return ((((527 + AbstractC3579i.m14438b(this.f19243a)) * 31) + AbstractC3579i.m14438b(this.f19244b)) * 31) + AbstractC3579i.m14438b(this.f19245c);
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
        return "Mp4Timestamp: creation time=" + this.f19243a + ", modification time=" + this.f19244b + ", timescale=" + this.f19245c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f19243a);
        parcel.writeLong(this.f19244b);
        parcel.writeLong(this.f19245c);
    }

    public C5399c(long j7, long j8, long j9) {
        this.f19243a = j7;
        this.f19244b = j8;
        this.f19245c = j9;
    }

    public C5399c(Parcel parcel) {
        this.f19243a = parcel.readLong();
        this.f19244b = parcel.readLong();
        this.f19245c = parcel.readLong();
    }
}
