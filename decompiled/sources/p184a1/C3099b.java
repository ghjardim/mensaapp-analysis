package p184a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p171Y2.AbstractC2928k;
import p178Z2.AbstractC3025n;
import p184a1.C3099b;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: a1.b */
/* loaded from: classes.dex */
public final class C3099b implements C4334x.b {
    public static final Parcelable.Creator<C3099b> CREATOR = new a();

    /* renamed from: a */
    public final List f9578a;

    /* renamed from: a1.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3099b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new C3099b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3099b[] newArray(int i7) {
            return new C3099b[i7];
        }
    }

    /* renamed from: a1.b$b */
    public static final class b implements Parcelable {

        /* renamed from: a */
        public final long f9580a;

        /* renamed from: b */
        public final long f9581b;

        /* renamed from: c */
        public final int f9582c;

        /* renamed from: d */
        public static final Comparator f9579d = new Comparator() { // from class: a1.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m11318b;
                m11318b = C3099b.b.m11318b((C3099b.b) obj, (C3099b.b) obj2);
                return m11318b;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a1.b$b$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(long j7, long j8, int i7) {
            AbstractC5332a.m21796a(j7 < j8);
            this.f9580a = j7;
            this.f9581b = j8;
            this.f9582c = i7;
        }

        /* renamed from: b */
        public static /* synthetic */ int m11318b(b bVar, b bVar2) {
            return AbstractC3025n.m11017j().mo11019e(bVar.f9580a, bVar2.f9580a).mo11019e(bVar.f9581b, bVar2.f9581b).mo11018d(bVar.f9582c, bVar2.f9582c).mo11023i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9580a == bVar.f9580a && this.f9581b == bVar.f9581b && this.f9582c == bVar.f9582c;
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(Long.valueOf(this.f9580a), Long.valueOf(this.f9581b), Integer.valueOf(this.f9582c));
        }

        public String toString() {
            return AbstractC5330M.m21685H("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f9580a), Long.valueOf(this.f9581b), Integer.valueOf(this.f9582c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f9580a);
            parcel.writeLong(this.f9581b);
            parcel.writeInt(this.f9582c);
        }
    }

    public C3099b(List list) {
        this.f9578a = list;
        AbstractC5332a.m21796a(!m11314a(list));
    }

    /* renamed from: a */
    public static boolean m11314a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j7 = ((b) list.get(0)).f9581b;
        for (int i7 = 1; i7 < list.size(); i7++) {
            if (((b) list.get(i7)).f9580a < j7) {
                return true;
            }
            j7 = ((b) list.get(i7)).f9581b;
        }
        return false;
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
        if (obj == null || C3099b.class != obj.getClass()) {
            return false;
        }
        return this.f9578a.equals(((C3099b) obj).f9578a);
    }

    public int hashCode() {
        return this.f9578a.hashCode();
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
        return "SlowMotion: segments=" + this.f9578a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f9578a);
    }
}
