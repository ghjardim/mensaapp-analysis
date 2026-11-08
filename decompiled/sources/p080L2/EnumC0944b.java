package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p080L2.EnumC0944b;

/* renamed from: L2.b */
/* loaded from: classes.dex */
public enum EnumC0944b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC0944b> CREATOR = new Parcelable.Creator() { // from class: L2.I
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0944b.m3790b(parcel.readString());
            } catch (EnumC0944b.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC0944b[i7];
        }
    };

    /* renamed from: a */
    public final String f3205a;

    /* renamed from: L2.b$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    EnumC0944b(String str) {
        this.f3205a = str;
    }

    /* renamed from: b */
    public static EnumC0944b m3790b(String str) {
        for (EnumC0944b enumC0944b : values()) {
            if (str.equals(enumC0944b.f3205a)) {
                return enumC0944b;
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
        return this.f3205a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3205a);
    }
}
