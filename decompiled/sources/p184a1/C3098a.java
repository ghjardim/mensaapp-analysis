package p184a1;

import android.os.Parcel;
import android.os.Parcelable;
import p203c3.AbstractC3579i;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C3098a implements C4334x.b {
    public static final Parcelable.Creator<C3098a> CREATOR = new a();

    /* renamed from: a */
    public final long f9573a;

    /* renamed from: b */
    public final long f9574b;

    /* renamed from: c */
    public final long f9575c;

    /* renamed from: d */
    public final long f9576d;

    /* renamed from: e */
    public final long f9577e;

    /* renamed from: a1.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3098a createFromParcel(Parcel parcel) {
            return new C3098a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3098a[] newArray(int i7) {
            return new C3098a[i7];
        }
    }

    public /* synthetic */ C3098a(Parcel parcel, a aVar) {
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
        if (obj == null || C3098a.class != obj.getClass()) {
            return false;
        }
        C3098a c3098a = (C3098a) obj;
        return this.f9573a == c3098a.f9573a && this.f9574b == c3098a.f9574b && this.f9575c == c3098a.f9575c && this.f9576d == c3098a.f9576d && this.f9577e == c3098a.f9577e;
    }

    public int hashCode() {
        return ((((((((527 + AbstractC3579i.m14438b(this.f9573a)) * 31) + AbstractC3579i.m14438b(this.f9574b)) * 31) + AbstractC3579i.m14438b(this.f9575c)) * 31) + AbstractC3579i.m14438b(this.f9576d)) * 31) + AbstractC3579i.m14438b(this.f9577e);
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
        return "Motion photo metadata: photoStartPosition=" + this.f9573a + ", photoSize=" + this.f9574b + ", photoPresentationTimestampUs=" + this.f9575c + ", videoStartPosition=" + this.f9576d + ", videoSize=" + this.f9577e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f9573a);
        parcel.writeLong(this.f9574b);
        parcel.writeLong(this.f9575c);
        parcel.writeLong(this.f9576d);
        parcel.writeLong(this.f9577e);
    }

    public C3098a(long j7, long j8, long j9, long j10, long j11) {
        this.f9573a = j7;
        this.f9574b = j8;
        this.f9575c = j9;
        this.f9576d = j10;
        this.f9577e = j11;
    }

    public C3098a(Parcel parcel) {
        this.f9573a = parcel.readLong();
        this.f9574b = parcel.readLong();
        this.f9575c = parcel.readLong();
        this.f9576d = parcel.readLong();
        this.f9577e = parcel.readLong();
    }
}
