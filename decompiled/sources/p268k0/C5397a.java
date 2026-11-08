package p268k0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p203c3.AbstractC3577g;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5330M;

/* renamed from: k0.a */
/* loaded from: classes.dex */
public final class C5397a implements C4334x.b {
    public static final Parcelable.Creator<C5397a> CREATOR = new a();

    /* renamed from: a */
    public final String f19237a;

    /* renamed from: b */
    public final byte[] f19238b;

    /* renamed from: c */
    public final int f19239c;

    /* renamed from: d */
    public final int f19240d;

    /* renamed from: k0.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5397a createFromParcel(Parcel parcel) {
            return new C5397a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5397a[] newArray(int i7) {
            return new C5397a[i7];
        }
    }

    public /* synthetic */ C5397a(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: C */
    public /* synthetic */ C4327q mo8979C() {
        return AbstractC4335y.m18406b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5397a.class != obj.getClass()) {
            return false;
        }
        C5397a c5397a = (C5397a) obj;
        return this.f19237a.equals(c5397a.f19237a) && Arrays.equals(this.f19238b, c5397a.f19238b) && this.f19239c == c5397a.f19239c && this.f19240d == c5397a.f19240d;
    }

    public int hashCode() {
        return ((((((527 + this.f19237a.hashCode()) * 31) + Arrays.hashCode(this.f19238b)) * 31) + this.f19239c) * 31) + this.f19240d;
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public /* synthetic */ void mo8980o(C4333w.b bVar) {
        AbstractC4335y.m18407c(this, bVar);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        int i7 = this.f19240d;
        return "mdta: key=" + this.f19237a + ", value=" + (i7 != 1 ? i7 != 23 ? i7 != 67 ? AbstractC5330M.m21749i1(this.f19238b) : String.valueOf(AbstractC3577g.m14424g(this.f19238b)) : String.valueOf(Float.intBitsToFloat(AbstractC3577g.m14424g(this.f19238b))) : AbstractC5330M.m21687I(this.f19238b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19237a);
        parcel.writeByteArray(this.f19238b);
        parcel.writeInt(this.f19239c);
        parcel.writeInt(this.f19240d);
    }

    public C5397a(String str, byte[] bArr, int i7, int i8) {
        this.f19237a = str;
        this.f19238b = bArr;
        this.f19239c = i7;
        this.f19240d = i8;
    }

    public C5397a(Parcel parcel) {
        this.f19237a = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f19238b = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
        this.f19239c = parcel.readInt();
        this.f19240d = parcel.readInt();
    }
}
