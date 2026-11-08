package p219e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.C5475r;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p385y5.AbstractC7085a;

/* renamed from: e3.r */
/* loaded from: classes.dex */
public final class C4188r implements Comparable, Parcelable {

    /* renamed from: a */
    public final long f14027a;

    /* renamed from: b */
    public final int f14028b;

    /* renamed from: c */
    public static final b f14026c = new b(null);
    public static final Parcelable.Creator<C4188r> CREATOR = new a();

    /* renamed from: e3.r$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4188r createFromParcel(Parcel source) {
            AbstractC5469l.m23028e(source, "source");
            return new C4188r(source.readLong(), source.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4188r[] newArray(int i7) {
            return new C4188r[i7];
        }
    }

    /* renamed from: e3.r$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: c */
        public final C4188r m17572c() {
            return new C4188r(new Date());
        }

        /* renamed from: d */
        public final C6926i m17573d(Date date) {
            long time = date.getTime();
            long j7 = PipesIterator.DEFAULT_QUEUE_SIZE;
            long j8 = time / j7;
            int time2 = (int) ((date.getTime() % j7) * 1000000);
            return time2 < 0 ? AbstractC6930m.m28383a(Long.valueOf(j8 - 1), Integer.valueOf(time2 + 1000000000)) : AbstractC6930m.m28383a(Long.valueOf(j8), Integer.valueOf(time2));
        }

        /* renamed from: e */
        public final void m17574e(long j7, int i7) {
            if (i7 < 0 || i7 >= 1000000000) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i7).toString());
            }
            if (-62135596800L > j7 || j7 >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j7).toString());
            }
        }

        public b() {
        }
    }

    public C4188r(long j7, int i7) {
        f14026c.m17574e(j7, i7);
        this.f14027a = j7;
        this.f14028b = i7;
    }

    /* renamed from: i */
    public static final C4188r m17564i() {
        return f14026c.m17572c();
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4188r other) {
        AbstractC5469l.m23028e(other, "other");
        return AbstractC7085a.m29184b(this, other, new C5475r() { // from class: e3.r.c
            @Override // kotlin.jvm.internal.C5475r, p111P5.InterfaceC1974h
            public Object get(Object obj) {
                return Long.valueOf(((C4188r) obj).m17567h());
            }
        }, new C5475r() { // from class: e3.r.d
            @Override // kotlin.jvm.internal.C5475r, p111P5.InterfaceC1974h
            public Object get(Object obj) {
                return Integer.valueOf(((C4188r) obj).m17566f());
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4188r) && compareTo((C4188r) obj) == 0);
    }

    /* renamed from: f */
    public final int m17566f() {
        return this.f14028b;
    }

    /* renamed from: h */
    public final long m17567h() {
        return this.f14027a;
    }

    public int hashCode() {
        long j7 = this.f14027a;
        return (((((int) j7) * 1369) + ((int) (j7 >> 32))) * 37) + this.f14028b;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f14027a + ", nanoseconds=" + this.f14028b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        AbstractC5469l.m23028e(dest, "dest");
        dest.writeLong(this.f14027a);
        dest.writeInt(this.f14028b);
    }

    public C4188r(Date date) {
        AbstractC5469l.m23028e(date, "date");
        b bVar = f14026c;
        C6926i m17573d = bVar.m17573d(date);
        long longValue = ((Number) m17573d.m28368a()).longValue();
        int intValue = ((Number) m17573d.m28369b()).intValue();
        bVar.m17574e(longValue, intValue);
        this.f14027a = longValue;
        this.f14028b = intValue;
    }
}
