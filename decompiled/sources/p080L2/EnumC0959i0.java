package p080L2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: L2.i0 */
/* loaded from: classes.dex */
public enum EnumC0959i0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<EnumC0959i0> CREATOR = new Parcelable.Creator() { // from class: L2.g0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0959i0.m3808b(parcel.readString());
            } catch (C0957h0 e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC0959i0[i7];
        }
    };

    /* renamed from: a */
    public final String f3242a;

    EnumC0959i0(String str) {
        this.f3242a = str;
    }

    /* renamed from: b */
    public static EnumC0959i0 m3808b(String str) {
        for (EnumC0959i0 enumC0959i0 : values()) {
            if (str.equals(enumC0959i0.f3242a)) {
                return enumC0959i0;
            }
        }
        throw new C0957h0(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3242a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3242a);
    }
}
