package p232g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p203c3.AbstractC3579i;
import p232g0.C4333w;
import p259j0.AbstractC5330M;

/* renamed from: g0.x */
/* loaded from: classes.dex */
public final class C4334x implements Parcelable {
    public static final Parcelable.Creator<C4334x> CREATOR = new a();

    /* renamed from: a */
    public final b[] f15432a;

    /* renamed from: b */
    public final long f15433b;

    /* renamed from: g0.x$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4334x createFromParcel(Parcel parcel) {
            return new C4334x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4334x[] newArray(int i7) {
            return new C4334x[i7];
        }
    }

    /* renamed from: g0.x$b */
    public interface b extends Parcelable {
        /* renamed from: C */
        C4327q mo8979C();

        /* renamed from: o */
        void mo8980o(C4333w.b bVar);

        /* renamed from: q0 */
        byte[] mo8981q0();
    }

    public C4334x(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    /* renamed from: a */
    public C4334x m18398a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new C4334x(this.f15433b, (b[]) AbstractC5330M.m21700O0(this.f15432a, bVarArr));
    }

    /* renamed from: b */
    public C4334x m18399b(C4334x c4334x) {
        return c4334x == null ? this : m18398a(c4334x.f15432a);
    }

    /* renamed from: c */
    public C4334x m18400c(long j7) {
        return this.f15433b == j7 ? this : new C4334x(j7, this.f15432a);
    }

    /* renamed from: d */
    public b m18401d(int i7) {
        return this.f15432a[i7];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m18402e() {
        return this.f15432a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4334x.class != obj.getClass()) {
            return false;
        }
        C4334x c4334x = (C4334x) obj;
        return Arrays.equals(this.f15432a, c4334x.f15432a) && this.f15433b == c4334x.f15433b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f15432a) * 31) + AbstractC3579i.m14438b(this.f15433b);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f15432a));
        if (this.f15433b == -9223372036854775807L) {
            str = StringUtils.EMPTY;
        } else {
            str = ", presentationTimeUs=" + this.f15433b;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f15432a.length);
        for (b bVar : this.f15432a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f15433b);
    }

    public C4334x(long j7, b... bVarArr) {
        this.f15433b = j7;
        this.f15432a = bVarArr;
    }

    public C4334x(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public C4334x(long j7, List list) {
        this(j7, (b[]) list.toArray(new b[0]));
    }

    public C4334x(Parcel parcel) {
        this.f15432a = new b[parcel.readInt()];
        int i7 = 0;
        while (true) {
            b[] bVarArr = this.f15432a;
            if (i7 < bVarArr.length) {
                bVarArr[i7] = (b) parcel.readParcelable(b.class.getClassLoader());
                i7++;
            } else {
                this.f15433b = parcel.readLong();
                return;
            }
        }
    }
}
