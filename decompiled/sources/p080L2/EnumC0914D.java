package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import org.apache.tika.utils.StringUtils;
import p080L2.EnumC0914D;

/* renamed from: L2.D */
/* loaded from: classes.dex */
public enum EnumC0914D implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<EnumC0914D> CREATOR = new Parcelable.Creator() { // from class: L2.c0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = StringUtils.EMPTY;
            }
            try {
                return EnumC0914D.m3781b(readString);
            } catch (EnumC0914D.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC0914D[i7];
        }
    };

    /* renamed from: a */
    public final String f3181a;

    /* renamed from: L2.D$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    EnumC0914D(String str) {
        this.f3181a = str;
    }

    /* renamed from: b */
    public static EnumC0914D m3781b(String str) {
        for (EnumC0914D enumC0914D : values()) {
            if (str.equals(enumC0914D.f3181a)) {
                return enumC0914D;
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
        return this.f3181a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3181a);
    }
}
