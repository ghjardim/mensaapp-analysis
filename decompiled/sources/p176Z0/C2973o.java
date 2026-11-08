package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import p259j0.AbstractC5330M;

/* renamed from: Z0.o */
/* loaded from: classes.dex */
public final class C2973o extends AbstractC2967i {
    public static final Parcelable.Creator<C2973o> CREATOR = new a();

    /* renamed from: b */
    public final String f9125b;

    /* renamed from: c */
    public final String f9126c;

    /* renamed from: Z0.o$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2973o createFromParcel(Parcel parcel) {
            return new C2973o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2973o[] newArray(int i7) {
            return new C2973o[i7];
        }
    }

    public C2973o(String str, String str2, String str3) {
        super(str);
        this.f9125b = str2;
        this.f9126c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2973o.class != obj.getClass()) {
            return false;
        }
        C2973o c2973o = (C2973o) obj;
        return this.f9110a.equals(c2973o.f9110a) && AbstractC5330M.m21729c(this.f9125b, c2973o.f9125b) && AbstractC5330M.m21729c(this.f9126c, c2973o.f9126c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f9110a.hashCode()) * 31;
        String str = this.f9125b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9126c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p176Z0.AbstractC2967i
    public String toString() {
        return this.f9110a + ": url=" + this.f9126c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9110a);
        parcel.writeString(this.f9125b);
        parcel.writeString(this.f9126c);
    }

    public C2973o(Parcel parcel) {
        super((String) AbstractC5330M.m21747i(parcel.readString()));
        this.f9125b = parcel.readString();
        this.f9126c = (String) AbstractC5330M.m21747i(parcel.readString());
    }
}
