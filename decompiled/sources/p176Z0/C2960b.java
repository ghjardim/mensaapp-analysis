package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p259j0.AbstractC5330M;

/* renamed from: Z0.b */
/* loaded from: classes.dex */
public final class C2960b extends AbstractC2967i {
    public static final Parcelable.Creator<C2960b> CREATOR = new a();

    /* renamed from: b */
    public final byte[] f9086b;

    /* renamed from: Z0.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2960b createFromParcel(Parcel parcel) {
            return new C2960b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2960b[] newArray(int i7) {
            return new C2960b[i7];
        }
    }

    public C2960b(String str, byte[] bArr) {
        super(str);
        this.f9086b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2960b.class != obj.getClass()) {
            return false;
        }
        C2960b c2960b = (C2960b) obj;
        return this.f9110a.equals(c2960b.f9110a) && Arrays.equals(this.f9086b, c2960b.f9086b);
    }

    public int hashCode() {
        return ((527 + this.f9110a.hashCode()) * 31) + Arrays.hashCode(this.f9086b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9110a);
        parcel.writeByteArray(this.f9086b);
    }

    public C2960b(Parcel parcel) {
        super((String) AbstractC5330M.m21747i(parcel.readString()));
        this.f9086b = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
    }
}
