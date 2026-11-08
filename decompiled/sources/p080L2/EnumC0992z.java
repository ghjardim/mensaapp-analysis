package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p080L2.EnumC0992z;

/* renamed from: L2.z */
/* loaded from: classes.dex */
public enum EnumC0992z implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<EnumC0992z> CREATOR = new Parcelable.Creator() { // from class: L2.a0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0992z.m3860b(parcel.readString());
            } catch (EnumC0992z.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC0992z[i7];
        }
    };

    /* renamed from: a */
    public final String f3322a = "public-key";

    /* renamed from: L2.z$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    EnumC0992z(String str) {
    }

    /* renamed from: b */
    public static EnumC0992z m3860b(String str) {
        for (EnumC0992z enumC0992z : values()) {
            if (str.equals(enumC0992z.f3322a)) {
                return enumC0992z;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3322a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3322a);
    }
}
