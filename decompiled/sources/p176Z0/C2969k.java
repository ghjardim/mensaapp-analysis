package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import p259j0.AbstractC5330M;

/* renamed from: Z0.k */
/* loaded from: classes.dex */
public final class C2969k extends AbstractC2967i {
    public static final Parcelable.Creator<C2969k> CREATOR = new a();

    /* renamed from: b */
    public final String f9112b;

    /* renamed from: c */
    public final String f9113c;

    /* renamed from: d */
    public final String f9114d;

    /* renamed from: Z0.k$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2969k createFromParcel(Parcel parcel) {
            return new C2969k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2969k[] newArray(int i7) {
            return new C2969k[i7];
        }
    }

    public C2969k(String str, String str2, String str3) {
        super("----");
        this.f9112b = str;
        this.f9113c = str2;
        this.f9114d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2969k.class != obj.getClass()) {
            return false;
        }
        C2969k c2969k = (C2969k) obj;
        return AbstractC5330M.m21729c(this.f9113c, c2969k.f9113c) && AbstractC5330M.m21729c(this.f9112b, c2969k.f9112b) && AbstractC5330M.m21729c(this.f9114d, c2969k.f9114d);
    }

    public int hashCode() {
        String str = this.f9112b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9113c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9114d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p176Z0.AbstractC2967i
    public String toString() {
        return this.f9110a + ": domain=" + this.f9112b + ", description=" + this.f9113c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9110a);
        parcel.writeString(this.f9112b);
        parcel.writeString(this.f9114d);
    }

    public C2969k(Parcel parcel) {
        super("----");
        this.f9112b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9113c = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9114d = (String) AbstractC5330M.m21747i(parcel.readString());
    }
}
