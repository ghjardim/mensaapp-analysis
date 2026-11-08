package p193b1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p256j$.util.DesugarCollections;
import p259j0.C5357z;

/* renamed from: b1.f */
/* loaded from: classes.dex */
public final class C3513f extends AbstractC3509b {
    public static final Parcelable.Creator<C3513f> CREATOR = new a();

    /* renamed from: a */
    public final List f11796a;

    /* renamed from: b1.f$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3513f createFromParcel(Parcel parcel) {
            return new C3513f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3513f[] newArray(int i7) {
            return new C3513f[i7];
        }
    }

    /* renamed from: b1.f$b */
    public static final class b {

        /* renamed from: a */
        public final int f11797a;

        /* renamed from: b */
        public final long f11798b;

        public /* synthetic */ b(int i7, long j7, a aVar) {
            this(i7, j7);
        }

        /* renamed from: c */
        public static b m14101c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: d */
        public final void m14102d(Parcel parcel) {
            parcel.writeInt(this.f11797a);
            parcel.writeLong(this.f11798b);
        }

        public b(int i7, long j7) {
            this.f11797a = i7;
            this.f11798b = j7;
        }
    }

    public /* synthetic */ C3513f(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static C3513f m14096a(C5357z c5357z) {
        int m21926G = c5357z.m21926G();
        ArrayList arrayList = new ArrayList(m21926G);
        for (int i7 = 0; i7 < m21926G; i7++) {
            arrayList.add(c.m14107e(c5357z));
        }
        return new C3513f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int size = this.f11796a.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            ((c) this.f11796a.get(i8)).m14108f(parcel);
        }
    }

    public C3513f(List list) {
        this.f11796a = DesugarCollections.unmodifiableList(list);
    }

    public C3513f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(c.m14106d(parcel));
        }
        this.f11796a = DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: b1.f$c */
    public static final class c {

        /* renamed from: a */
        public final long f11799a;

        /* renamed from: b */
        public final boolean f11800b;

        /* renamed from: c */
        public final boolean f11801c;

        /* renamed from: d */
        public final boolean f11802d;

        /* renamed from: e */
        public final long f11803e;

        /* renamed from: f */
        public final List f11804f;

        /* renamed from: g */
        public final boolean f11805g;

        /* renamed from: h */
        public final long f11806h;

        /* renamed from: i */
        public final int f11807i;

        /* renamed from: j */
        public final int f11808j;

        /* renamed from: k */
        public final int f11809k;

        public c(long j7, boolean z6, boolean z7, boolean z8, List list, long j8, boolean z9, long j9, int i7, int i8, int i9) {
            this.f11799a = j7;
            this.f11800b = z6;
            this.f11801c = z7;
            this.f11802d = z8;
            this.f11804f = DesugarCollections.unmodifiableList(list);
            this.f11803e = j8;
            this.f11805g = z9;
            this.f11806h = j9;
            this.f11807i = i7;
            this.f11808j = i8;
            this.f11809k = i9;
        }

        /* renamed from: d */
        public static c m14106d(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: e */
        public static c m14107e(C5357z c5357z) {
            ArrayList arrayList;
            boolean z6;
            long j7;
            boolean z7;
            long j8;
            int i7;
            int i8;
            int i9;
            boolean z8;
            boolean z9;
            long j9;
            long m21928I = c5357z.m21928I();
            boolean z10 = (c5357z.m21926G() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z10) {
                arrayList = arrayList2;
                z6 = false;
                j7 = -9223372036854775807L;
                z7 = false;
                j8 = -9223372036854775807L;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                z8 = false;
            } else {
                int m21926G = c5357z.m21926G();
                boolean z11 = (m21926G & 128) != 0;
                boolean z12 = (m21926G & 64) != 0;
                boolean z13 = (m21926G & 32) != 0;
                long m21928I2 = z12 ? c5357z.m21928I() : -9223372036854775807L;
                if (!z12) {
                    int m21926G2 = c5357z.m21926G();
                    ArrayList arrayList3 = new ArrayList(m21926G2);
                    for (int i10 = 0; i10 < m21926G2; i10++) {
                        arrayList3.add(new b(c5357z.m21926G(), c5357z.m21928I(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z13) {
                    long m21926G3 = c5357z.m21926G();
                    boolean z14 = (128 & m21926G3) != 0;
                    j9 = ((((m21926G3 & 1) << 32) | c5357z.m21928I()) * 1000) / 90;
                    z9 = z14;
                } else {
                    z9 = false;
                    j9 = -9223372036854775807L;
                }
                int m21932M = c5357z.m21932M();
                int m21926G4 = c5357z.m21926G();
                z8 = z12;
                i9 = c5357z.m21926G();
                j8 = j9;
                arrayList = arrayList2;
                long j10 = m21928I2;
                i7 = m21932M;
                i8 = m21926G4;
                j7 = j10;
                boolean z15 = z11;
                z7 = z9;
                z6 = z15;
            }
            return new c(m21928I, z10, z6, z8, arrayList, j7, z7, j8, i7, i8, i9);
        }

        /* renamed from: f */
        public final void m14108f(Parcel parcel) {
            parcel.writeLong(this.f11799a);
            parcel.writeByte(this.f11800b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11801c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11802d ? (byte) 1 : (byte) 0);
            int size = this.f11804f.size();
            parcel.writeInt(size);
            for (int i7 = 0; i7 < size; i7++) {
                ((b) this.f11804f.get(i7)).m14102d(parcel);
            }
            parcel.writeLong(this.f11803e);
            parcel.writeByte(this.f11805g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f11806h);
            parcel.writeInt(this.f11807i);
            parcel.writeInt(this.f11808j);
            parcel.writeInt(this.f11809k);
        }

        public c(Parcel parcel) {
            this.f11799a = parcel.readLong();
            this.f11800b = parcel.readByte() == 1;
            this.f11801c = parcel.readByte() == 1;
            this.f11802d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i7 = 0; i7 < readInt; i7++) {
                arrayList.add(b.m14101c(parcel));
            }
            this.f11804f = DesugarCollections.unmodifiableList(arrayList);
            this.f11803e = parcel.readLong();
            this.f11805g = parcel.readByte() == 1;
            this.f11806h = parcel.readLong();
            this.f11807i = parcel.readInt();
            this.f11808j = parcel.readInt();
            this.f11809k = parcel.readInt();
        }
    }
}
