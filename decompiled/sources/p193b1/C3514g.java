package p193b1;

import android.os.Parcel;
import android.os.Parcelable;
import p259j0.C5322E;
import p259j0.C5357z;

/* renamed from: b1.g */
/* loaded from: classes.dex */
public final class C3514g extends AbstractC3509b {
    public static final Parcelable.Creator<C3514g> CREATOR = new a();

    /* renamed from: a */
    public final long f11810a;

    /* renamed from: b */
    public final long f11811b;

    /* renamed from: b1.g$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3514g createFromParcel(Parcel parcel) {
            return new C3514g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3514g[] newArray(int i7) {
            return new C3514g[i7];
        }
    }

    public /* synthetic */ C3514g(long j7, long j8, a aVar) {
        this(j7, j8);
    }

    /* renamed from: a */
    public static C3514g m14109a(C5357z c5357z, long j7, C5322E c5322e) {
        long m14110b = m14110b(c5357z, j7);
        return new C3514g(m14110b, c5322e.m21651b(m14110b));
    }

    /* renamed from: b */
    public static long m14110b(C5357z c5357z, long j7) {
        long m21926G = c5357z.m21926G();
        if ((128 & m21926G) != 0) {
            return 8589934591L & ((((m21926G & 1) << 32) | c5357z.m21928I()) + j7);
        }
        return -9223372036854775807L;
    }

    @Override // p193b1.AbstractC3509b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f11810a + ", playbackPositionUs= " + this.f11811b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11810a);
        parcel.writeLong(this.f11811b);
    }

    public C3514g(long j7, long j8) {
        this.f11810a = j7;
        this.f11811b = j8;
    }
}
