package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p259j0.AbstractC5330M;

/* renamed from: Z0.m */
/* loaded from: classes.dex */
public final class C2971m extends AbstractC2967i {
    public static final Parcelable.Creator<C2971m> CREATOR = new a();

    /* renamed from: b */
    public final String f9120b;

    /* renamed from: c */
    public final byte[] f9121c;

    /* renamed from: Z0.m$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2971m createFromParcel(Parcel parcel) {
            return new C2971m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2971m[] newArray(int i7) {
            return new C2971m[i7];
        }
    }

    public C2971m(String str, byte[] bArr) {
        super("PRIV");
        this.f9120b = str;
        this.f9121c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2971m.class != obj.getClass()) {
            return false;
        }
        C2971m c2971m = (C2971m) obj;
        return AbstractC5330M.m21729c(this.f9120b, c2971m.f9120b) && Arrays.equals(this.f9121c, c2971m.f9121c);
    }

    public int hashCode() {
        String str = this.f9120b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9121c);
    }

    @Override // p176Z0.AbstractC2967i
    public String toString() {
        return this.f9110a + ": owner=" + this.f9120b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9120b);
        parcel.writeByteArray(this.f9121c);
    }

    public C2971m(Parcel parcel) {
        super("PRIV");
        this.f9120b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9121c = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
    }
}
