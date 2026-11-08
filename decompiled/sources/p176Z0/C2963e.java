package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import p259j0.AbstractC5330M;

/* renamed from: Z0.e */
/* loaded from: classes.dex */
public final class C2963e extends AbstractC2967i {
    public static final Parcelable.Creator<C2963e> CREATOR = new a();

    /* renamed from: b */
    public final String f9098b;

    /* renamed from: c */
    public final String f9099c;

    /* renamed from: d */
    public final String f9100d;

    /* renamed from: Z0.e$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2963e createFromParcel(Parcel parcel) {
            return new C2963e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2963e[] newArray(int i7) {
            return new C2963e[i7];
        }
    }

    public C2963e(String str, String str2, String str3) {
        super("COMM");
        this.f9098b = str;
        this.f9099c = str2;
        this.f9100d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2963e.class != obj.getClass()) {
            return false;
        }
        C2963e c2963e = (C2963e) obj;
        return AbstractC5330M.m21729c(this.f9099c, c2963e.f9099c) && AbstractC5330M.m21729c(this.f9098b, c2963e.f9098b) && AbstractC5330M.m21729c(this.f9100d, c2963e.f9100d);
    }

    public int hashCode() {
        String str = this.f9098b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9099c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9100d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p176Z0.AbstractC2967i
    public String toString() {
        return this.f9110a + ": language=" + this.f9098b + ", description=" + this.f9099c + ", text=" + this.f9100d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9110a);
        parcel.writeString(this.f9098b);
        parcel.writeString(this.f9100d);
    }

    public C2963e(Parcel parcel) {
        super("COMM");
        this.f9098b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9099c = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9100d = (String) AbstractC5330M.m21747i(parcel.readString());
    }
}
