package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p259j0.AbstractC5330M;

/* renamed from: Z0.l */
/* loaded from: classes.dex */
public final class C2970l extends AbstractC2967i {
    public static final Parcelable.Creator<C2970l> CREATOR = new a();

    /* renamed from: b */
    public final int f9115b;

    /* renamed from: c */
    public final int f9116c;

    /* renamed from: d */
    public final int f9117d;

    /* renamed from: e */
    public final int[] f9118e;

    /* renamed from: f */
    public final int[] f9119f;

    /* renamed from: Z0.l$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2970l createFromParcel(Parcel parcel) {
            return new C2970l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2970l[] newArray(int i7) {
            return new C2970l[i7];
        }
    }

    public C2970l(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f9115b = i7;
        this.f9116c = i8;
        this.f9117d = i9;
        this.f9118e = iArr;
        this.f9119f = iArr2;
    }

    @Override // p176Z0.AbstractC2967i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2970l.class != obj.getClass()) {
            return false;
        }
        C2970l c2970l = (C2970l) obj;
        return this.f9115b == c2970l.f9115b && this.f9116c == c2970l.f9116c && this.f9117d == c2970l.f9117d && Arrays.equals(this.f9118e, c2970l.f9118e) && Arrays.equals(this.f9119f, c2970l.f9119f);
    }

    public int hashCode() {
        return ((((((((527 + this.f9115b) * 31) + this.f9116c) * 31) + this.f9117d) * 31) + Arrays.hashCode(this.f9118e)) * 31) + Arrays.hashCode(this.f9119f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f9115b);
        parcel.writeInt(this.f9116c);
        parcel.writeInt(this.f9117d);
        parcel.writeIntArray(this.f9118e);
        parcel.writeIntArray(this.f9119f);
    }

    public C2970l(Parcel parcel) {
        super("MLLT");
        this.f9115b = parcel.readInt();
        this.f9116c = parcel.readInt();
        this.f9117d = parcel.readInt();
        this.f9118e = (int[]) AbstractC5330M.m21747i(parcel.createIntArray());
        this.f9119f = (int[]) AbstractC5330M.m21747i(parcel.createIntArray());
    }
}
