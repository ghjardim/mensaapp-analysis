package p155W0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5330M;

/* renamed from: W0.a */
/* loaded from: classes.dex */
public final class C2653a implements C4334x.b {

    /* renamed from: a */
    public final String f7873a;

    /* renamed from: b */
    public final String f7874b;

    /* renamed from: c */
    public final long f7875c;

    /* renamed from: d */
    public final long f7876d;

    /* renamed from: e */
    public final byte[] f7877e;

    /* renamed from: f */
    public int f7878f;

    /* renamed from: n */
    public static final C4327q f7871n = new C4327q.b().m18264o0("application/id3").m18234K();

    /* renamed from: o */
    public static final C4327q f7872o = new C4327q.b().m18264o0("application/x-scte35").m18234K();
    public static final Parcelable.Creator<C2653a> CREATOR = new a();

    /* renamed from: W0.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2653a createFromParcel(Parcel parcel) {
            return new C2653a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2653a[] newArray(int i7) {
            return new C2653a[i7];
        }
    }

    public C2653a(String str, String str2, long j7, long j8, byte[] bArr) {
        this.f7873a = str;
        this.f7874b = str2;
        this.f7875c = j7;
        this.f7876d = j8;
        this.f7877e = bArr;
    }

    @Override // p232g0.C4334x.b
    /* renamed from: C */
    public C4327q mo8979C() {
        String str = this.f7873a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f7872o;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f7871n;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2653a.class != obj.getClass()) {
            return false;
        }
        C2653a c2653a = (C2653a) obj;
        return this.f7875c == c2653a.f7875c && this.f7876d == c2653a.f7876d && AbstractC5330M.m21729c(this.f7873a, c2653a.f7873a) && AbstractC5330M.m21729c(this.f7874b, c2653a.f7874b) && Arrays.equals(this.f7877e, c2653a.f7877e);
    }

    public int hashCode() {
        if (this.f7878f == 0) {
            String str = this.f7873a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7874b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j7 = this.f7875c;
            int i7 = (((hashCode + hashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f7876d;
            this.f7878f = ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + Arrays.hashCode(this.f7877e);
        }
        return this.f7878f;
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public /* synthetic */ void mo8980o(C4333w.b bVar) {
        AbstractC4335y.m18407c(this, bVar);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public byte[] mo8981q0() {
        if (mo8979C() != null) {
            return this.f7877e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f7873a + ", id=" + this.f7876d + ", durationMs=" + this.f7875c + ", value=" + this.f7874b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f7873a);
        parcel.writeString(this.f7874b);
        parcel.writeLong(this.f7875c);
        parcel.writeLong(this.f7876d);
        parcel.writeByteArray(this.f7877e);
    }

    public C2653a(Parcel parcel) {
        this.f7873a = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f7874b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f7875c = parcel.readLong();
        this.f7876d = parcel.readLong();
        this.f7877e = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
    }
}
