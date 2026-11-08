package p193b1;

import android.os.Parcel;
import android.os.Parcelable;
import p259j0.AbstractC5330M;
import p259j0.C5357z;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C3508a extends AbstractC3509b {
    public static final Parcelable.Creator<C3508a> CREATOR = new a();

    /* renamed from: a */
    public final long f11774a;

    /* renamed from: b */
    public final long f11775b;

    /* renamed from: c */
    public final byte[] f11776c;

    /* renamed from: b1.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3508a createFromParcel(Parcel parcel) {
            return new C3508a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3508a[] newArray(int i7) {
            return new C3508a[i7];
        }
    }

    public /* synthetic */ C3508a(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static C3508a m14086a(C5357z c5357z, int i7, long j7) {
        long m21928I = c5357z.m21928I();
        int i8 = i7 - 4;
        byte[] bArr = new byte[i8];
        c5357z.m21953l(bArr, 0, i8);
        return new C3508a(m21928I, bArr, j7);
    }

    @Override // p193b1.AbstractC3509b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f11774a + ", identifier= " + this.f11775b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11774a);
        parcel.writeLong(this.f11775b);
        parcel.writeByteArray(this.f11776c);
    }

    public C3508a(long j7, byte[] bArr, long j8) {
        this.f11774a = j8;
        this.f11775b = j7;
        this.f11776c = bArr;
    }

    public C3508a(Parcel parcel) {
        this.f11774a = parcel.readLong();
        this.f11775b = parcel.readLong();
        this.f11776c = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
    }
}
