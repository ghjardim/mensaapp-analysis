package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p259j0.AbstractC5330M;

/* renamed from: Z0.f */
/* loaded from: classes.dex */
public final class C2964f extends AbstractC2967i {
    public static final Parcelable.Creator<C2964f> CREATOR = new a();

    /* renamed from: b */
    public final String f9101b;

    /* renamed from: c */
    public final String f9102c;

    /* renamed from: d */
    public final String f9103d;

    /* renamed from: e */
    public final byte[] f9104e;

    /* renamed from: Z0.f$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2964f createFromParcel(Parcel parcel) {
            return new C2964f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2964f[] newArray(int i7) {
            return new C2964f[i7];
        }
    }

    public C2964f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f9101b = str;
        this.f9102c = str2;
        this.f9103d = str3;
        this.f9104e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2964f.class != obj.getClass()) {
            return false;
        }
        C2964f c2964f = (C2964f) obj;
        return AbstractC5330M.m21729c(this.f9101b, c2964f.f9101b) && AbstractC5330M.m21729c(this.f9102c, c2964f.f9102c) && AbstractC5330M.m21729c(this.f9103d, c2964f.f9103d) && Arrays.equals(this.f9104e, c2964f.f9104e);
    }

    public int hashCode() {
        String str = this.f9101b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9102c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9103d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9104e);
    }

    @Override // p176Z0.AbstractC2967i
    public String toString() {
        return this.f9110a + ": mimeType=" + this.f9101b + ", filename=" + this.f9102c + ", description=" + this.f9103d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9101b);
        parcel.writeString(this.f9102c);
        parcel.writeString(this.f9103d);
        parcel.writeByteArray(this.f9104e);
    }

    public C2964f(Parcel parcel) {
        super("GEOB");
        this.f9101b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9102c = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9103d = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9104e = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
    }
}
