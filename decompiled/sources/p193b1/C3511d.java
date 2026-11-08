package p193b1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p256j$.util.DesugarCollections;
import p259j0.C5322E;
import p259j0.C5357z;

/* renamed from: b1.d */
/* loaded from: classes.dex */
public final class C3511d extends AbstractC3509b {
    public static final Parcelable.Creator<C3511d> CREATOR = new a();

    /* renamed from: a */
    public final long f11780a;

    /* renamed from: b */
    public final boolean f11781b;

    /* renamed from: c */
    public final boolean f11782c;

    /* renamed from: d */
    public final boolean f11783d;

    /* renamed from: e */
    public final boolean f11784e;

    /* renamed from: f */
    public final long f11785f;

    /* renamed from: n */
    public final long f11786n;

    /* renamed from: o */
    public final List f11787o;

    /* renamed from: p */
    public final boolean f11788p;

    /* renamed from: q */
    public final long f11789q;

    /* renamed from: r */
    public final int f11790r;

    /* renamed from: s */
    public final int f11791s;

    /* renamed from: t */
    public final int f11792t;

    /* renamed from: b1.d$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3511d createFromParcel(Parcel parcel) {
            return new C3511d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3511d[] newArray(int i7) {
            return new C3511d[i7];
        }
    }

    /* renamed from: b1.d$b */
    public static final class b {

        /* renamed from: a */
        public final int f11793a;

        /* renamed from: b */
        public final long f11794b;

        /* renamed from: c */
        public final long f11795c;

        public /* synthetic */ b(int i7, long j7, long j8, a aVar) {
            this(i7, j7, j8);
        }

        /* renamed from: a */
        public static b m14092a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m14093b(Parcel parcel) {
            parcel.writeInt(this.f11793a);
            parcel.writeLong(this.f11794b);
            parcel.writeLong(this.f11795c);
        }

        public b(int i7, long j7, long j8) {
            this.f11793a = i7;
            this.f11794b = j7;
            this.f11795c = j8;
        }
    }

    public /* synthetic */ C3511d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static C3511d m14089a(C5357z c5357z, long j7, C5322E c5322e) {
        List list;
        boolean z6;
        boolean z7;
        long j8;
        boolean z8;
        long j9;
        int i7;
        int i8;
        int i9;
        boolean z9;
        boolean z10;
        long j10;
        long m21928I = c5357z.m21928I();
        boolean z11 = (c5357z.m21926G() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z11) {
            list = emptyList;
            z6 = false;
            z7 = false;
            j8 = -9223372036854775807L;
            z8 = false;
            j9 = -9223372036854775807L;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            z9 = false;
        } else {
            int m21926G = c5357z.m21926G();
            boolean z12 = (m21926G & 128) != 0;
            boolean z13 = (m21926G & 64) != 0;
            boolean z14 = (m21926G & 32) != 0;
            boolean z15 = (m21926G & 16) != 0;
            long m14110b = (!z13 || z15) ? -9223372036854775807L : C3514g.m14110b(c5357z, j7);
            if (!z13) {
                int m21926G2 = c5357z.m21926G();
                ArrayList arrayList = new ArrayList(m21926G2);
                for (int i10 = 0; i10 < m21926G2; i10++) {
                    int m21926G3 = c5357z.m21926G();
                    long m14110b2 = !z15 ? C3514g.m14110b(c5357z, j7) : -9223372036854775807L;
                    arrayList.add(new b(m21926G3, m14110b2, c5322e.m21651b(m14110b2), null));
                }
                emptyList = arrayList;
            }
            if (z14) {
                long m21926G4 = c5357z.m21926G();
                boolean z16 = (128 & m21926G4) != 0;
                j10 = ((((m21926G4 & 1) << 32) | c5357z.m21928I()) * 1000) / 90;
                z10 = z16;
            } else {
                z10 = false;
                j10 = -9223372036854775807L;
            }
            i7 = c5357z.m21932M();
            z9 = z13;
            i8 = c5357z.m21926G();
            i9 = c5357z.m21926G();
            list = emptyList;
            long j11 = m14110b;
            z8 = z10;
            j9 = j10;
            z7 = z15;
            z6 = z12;
            j8 = j11;
        }
        return new C3511d(m21928I, z11, z6, z9, z7, j8, c5322e.m21651b(j8), list, z8, j9, i7, i8, i9);
    }

    @Override // p193b1.AbstractC3509b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f11785f + ", programSplicePlaybackPositionUs= " + this.f11786n + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11780a);
        parcel.writeByte(this.f11781b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11782c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11783d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11784e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11785f);
        parcel.writeLong(this.f11786n);
        int size = this.f11787o.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            ((b) this.f11787o.get(i8)).m14093b(parcel);
        }
        parcel.writeByte(this.f11788p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11789q);
        parcel.writeInt(this.f11790r);
        parcel.writeInt(this.f11791s);
        parcel.writeInt(this.f11792t);
    }

    public C3511d(long j7, boolean z6, boolean z7, boolean z8, boolean z9, long j8, long j9, List list, boolean z10, long j10, int i7, int i8, int i9) {
        this.f11780a = j7;
        this.f11781b = z6;
        this.f11782c = z7;
        this.f11783d = z8;
        this.f11784e = z9;
        this.f11785f = j8;
        this.f11786n = j9;
        this.f11787o = DesugarCollections.unmodifiableList(list);
        this.f11788p = z10;
        this.f11789q = j10;
        this.f11790r = i7;
        this.f11791s = i8;
        this.f11792t = i9;
    }

    public C3511d(Parcel parcel) {
        this.f11780a = parcel.readLong();
        this.f11781b = parcel.readByte() == 1;
        this.f11782c = parcel.readByte() == 1;
        this.f11783d = parcel.readByte() == 1;
        this.f11784e = parcel.readByte() == 1;
        this.f11785f = parcel.readLong();
        this.f11786n = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(b.m14092a(parcel));
        }
        this.f11787o = DesugarCollections.unmodifiableList(arrayList);
        this.f11788p = parcel.readByte() == 1;
        this.f11789q = parcel.readLong();
        this.f11790r = parcel.readInt();
        this.f11791s = parcel.readInt();
        this.f11792t = parcel.readInt();
    }
}
