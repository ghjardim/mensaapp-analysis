package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p080L2.EnumC0974q;

/* renamed from: L2.q */
/* loaded from: classes.dex */
public enum EnumC0974q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC0974q> CREATOR = new Parcelable.Creator() { // from class: L2.G0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0974q.m3825f(parcel.readInt());
            } catch (EnumC0974q.a e7) {
                throw new IllegalArgumentException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new EnumC0974q[i7];
        }
    };

    /* renamed from: a */
    public final int f3278a;

    /* renamed from: L2.q$a */
    public static class a extends Exception {
        public a(int i7) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i7)));
        }
    }

    EnumC0974q(int i7) {
        this.f3278a = i7;
    }

    /* renamed from: f */
    public static EnumC0974q m3825f(int i7) {
        for (EnumC0974q enumC0974q : values()) {
            if (i7 == enumC0974q.f3278a) {
                return enumC0974q;
            }
        }
        throw new a(i7);
    }

    /* renamed from: b */
    public int m3826b() {
        return this.f3278a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f3278a);
    }
}
