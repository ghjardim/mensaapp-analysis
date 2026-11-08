package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p259j0.AbstractC5330M;

/* renamed from: Z0.d */
/* loaded from: classes.dex */
public final class C2962d extends AbstractC2967i {
    public static final Parcelable.Creator<C2962d> CREATOR = new a();

    /* renamed from: b */
    public final String f9093b;

    /* renamed from: c */
    public final boolean f9094c;

    /* renamed from: d */
    public final boolean f9095d;

    /* renamed from: e */
    public final String[] f9096e;

    /* renamed from: f */
    public final AbstractC2967i[] f9097f;

    /* renamed from: Z0.d$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2962d createFromParcel(Parcel parcel) {
            return new C2962d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2962d[] newArray(int i7) {
            return new C2962d[i7];
        }
    }

    public C2962d(String str, boolean z6, boolean z7, String[] strArr, AbstractC2967i[] abstractC2967iArr) {
        super("CTOC");
        this.f9093b = str;
        this.f9094c = z6;
        this.f9095d = z7;
        this.f9096e = strArr;
        this.f9097f = abstractC2967iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2962d.class != obj.getClass()) {
            return false;
        }
        C2962d c2962d = (C2962d) obj;
        return this.f9094c == c2962d.f9094c && this.f9095d == c2962d.f9095d && AbstractC5330M.m21729c(this.f9093b, c2962d.f9093b) && Arrays.equals(this.f9096e, c2962d.f9096e) && Arrays.equals(this.f9097f, c2962d.f9097f);
    }

    public int hashCode() {
        int i7 = (((527 + (this.f9094c ? 1 : 0)) * 31) + (this.f9095d ? 1 : 0)) * 31;
        String str = this.f9093b;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9093b);
        parcel.writeByte(this.f9094c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9095d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9096e);
        parcel.writeInt(this.f9097f.length);
        for (AbstractC2967i abstractC2967i : this.f9097f) {
            parcel.writeParcelable(abstractC2967i, 0);
        }
    }

    public C2962d(Parcel parcel) {
        super("CTOC");
        this.f9093b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9094c = parcel.readByte() != 0;
        this.f9095d = parcel.readByte() != 0;
        this.f9096e = (String[]) AbstractC5330M.m21747i(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f9097f = new AbstractC2967i[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f9097f[i7] = (AbstractC2967i) parcel.readParcelable(AbstractC2967i.class.getClassLoader());
        }
    }
}
