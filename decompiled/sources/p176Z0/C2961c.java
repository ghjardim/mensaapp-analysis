package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p259j0.AbstractC5330M;

/* renamed from: Z0.c */
/* loaded from: classes.dex */
public final class C2961c extends AbstractC2967i {
    public static final Parcelable.Creator<C2961c> CREATOR = new a();

    /* renamed from: b */
    public final String f9087b;

    /* renamed from: c */
    public final int f9088c;

    /* renamed from: d */
    public final int f9089d;

    /* renamed from: e */
    public final long f9090e;

    /* renamed from: f */
    public final long f9091f;

    /* renamed from: n */
    public final AbstractC2967i[] f9092n;

    /* renamed from: Z0.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2961c createFromParcel(Parcel parcel) {
            return new C2961c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2961c[] newArray(int i7) {
            return new C2961c[i7];
        }
    }

    public C2961c(String str, int i7, int i8, long j7, long j8, AbstractC2967i[] abstractC2967iArr) {
        super("CHAP");
        this.f9087b = str;
        this.f9088c = i7;
        this.f9089d = i8;
        this.f9090e = j7;
        this.f9091f = j8;
        this.f9092n = abstractC2967iArr;
    }

    @Override // p176Z0.AbstractC2967i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2961c.class != obj.getClass()) {
            return false;
        }
        C2961c c2961c = (C2961c) obj;
        return this.f9088c == c2961c.f9088c && this.f9089d == c2961c.f9089d && this.f9090e == c2961c.f9090e && this.f9091f == c2961c.f9091f && AbstractC5330M.m21729c(this.f9087b, c2961c.f9087b) && Arrays.equals(this.f9092n, c2961c.f9092n);
    }

    public int hashCode() {
        int i7 = (((((((527 + this.f9088c) * 31) + this.f9089d) * 31) + ((int) this.f9090e)) * 31) + ((int) this.f9091f)) * 31;
        String str = this.f9087b;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9087b);
        parcel.writeInt(this.f9088c);
        parcel.writeInt(this.f9089d);
        parcel.writeLong(this.f9090e);
        parcel.writeLong(this.f9091f);
        parcel.writeInt(this.f9092n.length);
        for (AbstractC2967i abstractC2967i : this.f9092n) {
            parcel.writeParcelable(abstractC2967i, 0);
        }
    }

    public C2961c(Parcel parcel) {
        super("CHAP");
        this.f9087b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9088c = parcel.readInt();
        this.f9089d = parcel.readInt();
        this.f9090e = parcel.readLong();
        this.f9091f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f9092n = new AbstractC2967i[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f9092n[i7] = (AbstractC2967i) parcel.readParcelable(AbstractC2967i.class.getClassLoader());
        }
    }
}
