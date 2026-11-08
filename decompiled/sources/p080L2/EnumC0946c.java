package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p080L2.EnumC0946c;

/* renamed from: L2.c */
/* loaded from: classes.dex */
public enum EnumC0946c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC0946c> CREATOR = new Parcelable.Creator() { // from class: L2.k0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0946c.m3791b(parcel.readString());
            } catch (EnumC0946c.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC0946c[i7];
        }
    };

    /* renamed from: a */
    public final String f3210a;

    /* renamed from: L2.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    EnumC0946c(String str) {
        this.f3210a = str;
    }

    /* renamed from: b */
    public static EnumC0946c m3791b(String str) {
        for (EnumC0946c enumC0946c : values()) {
            if (str.equals(enumC0946c.f3210a)) {
                return enumC0946c;
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
        return this.f3210a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3210a);
    }
}
