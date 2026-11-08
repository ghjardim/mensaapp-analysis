package p087M2;

import android.os.Parcel;
import android.os.Parcelable;
import p087M2.EnumC1148c;

/* renamed from: M2.c */
/* loaded from: classes.dex */
public enum EnumC1148c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<EnumC1148c> CREATOR = new Parcelable.Creator() { // from class: M2.i
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC1148c.m4441b(parcel.readString());
            } catch (EnumC1148c.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC1148c[i7];
        }
    };

    /* renamed from: a */
    public final String f3734a;

    /* renamed from: M2.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    EnumC1148c(String str) {
        this.f3734a = str;
    }

    /* renamed from: b */
    public static EnumC1148c m4441b(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (EnumC1148c enumC1148c : values()) {
            if (str.equals(enumC1148c.f3734a)) {
                return enumC1148c;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3734a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3734a);
    }
}
