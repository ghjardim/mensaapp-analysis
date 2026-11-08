package p162X0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p171Y2.AbstractC2922e;
import p232g0.AbstractC4335y;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.C5357z;

/* renamed from: X0.a */
/* loaded from: classes.dex */
public final class C2797a implements C4334x.b {
    public static final Parcelable.Creator<C2797a> CREATOR = new a();

    /* renamed from: a */
    public final int f8525a;

    /* renamed from: b */
    public final String f8526b;

    /* renamed from: c */
    public final String f8527c;

    /* renamed from: d */
    public final int f8528d;

    /* renamed from: e */
    public final int f8529e;

    /* renamed from: f */
    public final int f8530f;

    /* renamed from: n */
    public final int f8531n;

    /* renamed from: o */
    public final byte[] f8532o;

    /* renamed from: X0.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2797a createFromParcel(Parcel parcel) {
            return new C2797a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2797a[] newArray(int i7) {
            return new C2797a[i7];
        }
    }

    public C2797a(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f8525a = i7;
        this.f8526b = str;
        this.f8527c = str2;
        this.f8528d = i8;
        this.f8529e = i9;
        this.f8530f = i10;
        this.f8531n = i11;
        this.f8532o = bArr;
    }

    /* renamed from: a */
    public static C2797a m9974a(C5357z c5357z) {
        int m21957p = c5357z.m21957p();
        String m18427t = AbstractC4336z.m18427t(c5357z.m21924E(c5357z.m21957p(), AbstractC2922e.f9008a));
        String m21923D = c5357z.m21923D(c5357z.m21957p());
        int m21957p2 = c5357z.m21957p();
        int m21957p3 = c5357z.m21957p();
        int m21957p4 = c5357z.m21957p();
        int m21957p5 = c5357z.m21957p();
        int m21957p6 = c5357z.m21957p();
        byte[] bArr = new byte[m21957p6];
        c5357z.m21953l(bArr, 0, m21957p6);
        return new C2797a(m21957p, m18427t, m21923D, m21957p2, m21957p3, m21957p4, m21957p5, bArr);
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
        if (obj == null || C2797a.class != obj.getClass()) {
            return false;
        }
        C2797a c2797a = (C2797a) obj;
        return this.f8525a == c2797a.f8525a && this.f8526b.equals(c2797a.f8526b) && this.f8527c.equals(c2797a.f8527c) && this.f8528d == c2797a.f8528d && this.f8529e == c2797a.f8529e && this.f8530f == c2797a.f8530f && this.f8531n == c2797a.f8531n && Arrays.equals(this.f8532o, c2797a.f8532o);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f8525a) * 31) + this.f8526b.hashCode()) * 31) + this.f8527c.hashCode()) * 31) + this.f8528d) * 31) + this.f8529e) * 31) + this.f8530f) * 31) + this.f8531n) * 31) + Arrays.hashCode(this.f8532o);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public void mo8980o(C4333w.b bVar) {
        bVar.m18363J(this.f8532o, this.f8525a);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f8526b + ", description=" + this.f8527c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8525a);
        parcel.writeString(this.f8526b);
        parcel.writeString(this.f8527c);
        parcel.writeInt(this.f8528d);
        parcel.writeInt(this.f8529e);
        parcel.writeInt(this.f8530f);
        parcel.writeInt(this.f8531n);
        parcel.writeByteArray(this.f8532o);
    }

    public C2797a(Parcel parcel) {
        this.f8525a = parcel.readInt();
        this.f8526b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f8527c = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f8528d = parcel.readInt();
        this.f8529e = parcel.readInt();
        this.f8530f = parcel.readInt();
        this.f8531n = parcel.readInt();
        this.f8532o = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
    }
}
