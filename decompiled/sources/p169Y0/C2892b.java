package p169Y0;

import android.os.Parcel;
import android.os.Parcelable;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: Y0.b */
/* loaded from: classes.dex */
public final class C2892b implements C4334x.b {
    public static final Parcelable.Creator<C2892b> CREATOR = new a();

    /* renamed from: a */
    public final int f8897a;

    /* renamed from: b */
    public final String f8898b;

    /* renamed from: c */
    public final String f8899c;

    /* renamed from: d */
    public final String f8900d;

    /* renamed from: e */
    public final boolean f8901e;

    /* renamed from: f */
    public final int f8902f;

    /* renamed from: Y0.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2892b createFromParcel(Parcel parcel) {
            return new C2892b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2892b[] newArray(int i7) {
            return new C2892b[i7];
        }
    }

    public C2892b(int i7, String str, String str2, String str3, boolean z6, int i8) {
        AbstractC5332a.m21796a(i8 == -1 || i8 > 0);
        this.f8897a = i7;
        this.f8898b = str;
        this.f8899c = str2;
        this.f8900d = str3;
        this.f8901e = z6;
        this.f8902f = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p169Y0.C2892b m10418a(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p169Y0.C2892b.m10418a(java.util.Map):Y0.b");
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
        if (obj == null || C2892b.class != obj.getClass()) {
            return false;
        }
        C2892b c2892b = (C2892b) obj;
        return this.f8897a == c2892b.f8897a && AbstractC5330M.m21729c(this.f8898b, c2892b.f8898b) && AbstractC5330M.m21729c(this.f8899c, c2892b.f8899c) && AbstractC5330M.m21729c(this.f8900d, c2892b.f8900d) && this.f8901e == c2892b.f8901e && this.f8902f == c2892b.f8902f;
    }

    public int hashCode() {
        int i7 = (527 + this.f8897a) * 31;
        String str = this.f8898b;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8899c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8900d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f8901e ? 1 : 0)) * 31) + this.f8902f;
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public void mo8980o(C4333w.b bVar) {
        String str = this.f8899c;
        if (str != null) {
            bVar.m18391l0(str);
        }
        String str2 = this.f8898b;
        if (str2 != null) {
            bVar.m18381b0(str2);
        }
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f8899c + "\", genre=\"" + this.f8898b + "\", bitrate=" + this.f8897a + ", metadataInterval=" + this.f8902f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8897a);
        parcel.writeString(this.f8898b);
        parcel.writeString(this.f8899c);
        parcel.writeString(this.f8900d);
        AbstractC5330M.m21761m1(parcel, this.f8901e);
        parcel.writeInt(this.f8902f);
    }

    public C2892b(Parcel parcel) {
        this.f8897a = parcel.readInt();
        this.f8898b = parcel.readString();
        this.f8899c = parcel.readString();
        this.f8900d = parcel.readString();
        this.f8901e = AbstractC5330M.m21712U0(parcel);
        this.f8902f = parcel.readInt();
    }
}
