package p256j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.C4888i;
import p256j$.time.Instant;
import p256j$.time.LocalDateTime;
import p256j$.time.ZoneOffset;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.util.Objects;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.f */
/* loaded from: classes3.dex */
public final class C4931f implements Serializable {

    /* renamed from: i */
    private static final long[] f18118i = new long[0];

    /* renamed from: j */
    private static final C4930e[] f18119j = new C4930e[0];

    /* renamed from: k */
    private static final LocalDateTime[] f18120k = new LocalDateTime[0];

    /* renamed from: l */
    private static final C4927b[] f18121l = new C4927b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a */
    private final long[] f18122a;

    /* renamed from: b */
    private final ZoneOffset[] f18123b;

    /* renamed from: c */
    private final long[] f18124c;

    /* renamed from: d */
    private final LocalDateTime[] f18125d;

    /* renamed from: e */
    private final ZoneOffset[] f18126e;

    /* renamed from: f */
    private final C4930e[] f18127f;

    /* renamed from: g */
    private final TimeZone f18128g;

    /* renamed from: h */
    private final transient ConcurrentHashMap f18129h = new ConcurrentHashMap();

    /* renamed from: h */
    public static C4931f m21243h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new C4931f(zoneOffset);
    }

    private C4931f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, C4930e[] c4930eArr) {
        this.f18122a = jArr;
        this.f18123b = zoneOffsetArr;
        this.f18124c = jArr2;
        this.f18126e = zoneOffsetArr2;
        this.f18127f = c4930eArr;
        if (jArr2.length == 0) {
            this.f18125d = f18120k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 < jArr2.length) {
                int i8 = i7 + 1;
                C4927b c4927b = new C4927b(jArr2[i7], zoneOffsetArr2[i7], zoneOffsetArr2[i8]);
                if (c4927b.m21236z()) {
                    arrayList.add(c4927b.m21231m());
                    arrayList.add(c4927b.m21230l());
                } else {
                    arrayList.add(c4927b.m21230l());
                    arrayList.add(c4927b.m21231m());
                }
                i7 = i8;
            }
            this.f18125d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f18128g = null;
    }

    private C4931f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f18123b = zoneOffsetArr;
        long[] jArr = f18118i;
        this.f18122a = jArr;
        this.f18124c = jArr;
        this.f18125d = f18120k;
        this.f18126e = zoneOffsetArr;
        this.f18127f = f18119j;
        this.f18128g = null;
    }

    C4931f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {m21244i(timeZone.getRawOffset())};
        this.f18123b = zoneOffsetArr;
        long[] jArr = f18118i;
        this.f18122a = jArr;
        this.f18124c = jArr;
        this.f18125d = f18120k;
        this.f18126e = zoneOffsetArr;
        this.f18127f = f18119j;
        this.f18128g = timeZone;
    }

    /* renamed from: i */
    private static ZoneOffset m21244i(int i7) {
        return ZoneOffset.m20967T(i7 / PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C4926a(this.f18128g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        long[] jArr = this.f18122a;
        objectOutput.writeInt(jArr.length);
        for (long j7 : jArr) {
            C4926a.m21227c(j7, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f18123b) {
            C4926a.m21228d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f18124c;
        objectOutput.writeInt(jArr2.length);
        for (long j8 : jArr2) {
            C4926a.m21227c(j8, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f18126e) {
            C4926a.m21228d(zoneOffset2, objectOutput);
        }
        C4930e[] c4930eArr = this.f18127f;
        objectOutput.writeByte(c4930eArr.length);
        for (C4930e c4930e : c4930eArr) {
            c4930e.writeExternal(objectOutput);
        }
    }

    /* renamed from: k */
    final void m21249k(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f18128g.getID());
    }

    /* renamed from: j */
    static C4931f m21245j(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        long[] jArr = f18118i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            jArr2[i7] = C4926a.m21225a(objectInput);
        }
        int i8 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            zoneOffsetArr[i9] = C4926a.m21226b(objectInput);
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i10 = 0; i10 < readInt2; i10++) {
            jArr3[i10] = C4926a.m21225a(objectInput);
        }
        int i11 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zoneOffsetArr2[i12] = C4926a.m21226b(objectInput);
        }
        int readByte = objectInput.readByte();
        C4930e[] c4930eArr = readByte == 0 ? f18119j : new C4930e[readByte];
        for (int i13 = 0; i13 < readByte; i13++) {
            c4930eArr[i13] = C4930e.m21237b(objectInput);
        }
        return new C4931f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, c4930eArr);
    }

    /* renamed from: d */
    public final ZoneOffset m21246d(Instant instant) {
        TimeZone timeZone = this.f18128g;
        if (timeZone != null) {
            return m21244i(timeZone.getOffset(instant.m20925R()));
        }
        long[] jArr = this.f18124c;
        if (jArr.length == 0) {
            return this.f18123b[0];
        }
        long m20922K = instant.m20922K();
        int length = this.f18127f.length;
        ZoneOffset[] zoneOffsetArr = this.f18126e;
        if (length > 0 && m20922K > jArr[jArr.length - 1]) {
            C4927b[] m21240b = m21240b(m21241c(m20922K, zoneOffsetArr[zoneOffsetArr.length - 1]));
            C4927b c4927b = null;
            for (int i7 = 0; i7 < m21240b.length; i7++) {
                c4927b = m21240b[i7];
                if (m20922K < c4927b.m21229H()) {
                    return c4927b.m21234s();
                }
            }
            return c4927b.m21233o();
        }
        int binarySearch = Arrays.binarySearch(jArr, m20922K);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    /* renamed from: g */
    public final List m21248g(LocalDateTime localDateTime) {
        Object m21242e = m21242e(localDateTime);
        if (m21242e instanceof C4927b) {
            return ((C4927b) m21242e).m21235w();
        }
        return Collections.singletonList((ZoneOffset) m21242e);
    }

    /* renamed from: f */
    public final C4927b m21247f(LocalDateTime localDateTime) {
        Object m21242e = m21242e(localDateTime);
        if (m21242e instanceof C4927b) {
            return (C4927b) m21242e;
        }
        return null;
    }

    /* renamed from: e */
    private Object m21242e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f18123b;
        int i7 = 0;
        TimeZone timeZone = this.f18128g;
        if (timeZone != null) {
            C4927b[] m21240b = m21240b(localDateTime.m20938M());
            if (m21240b.length == 0) {
                return m21244i(timeZone.getOffset(AbstractC4843i.m21030n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = m21240b.length;
            while (i7 < length) {
                C4927b c4927b = m21240b[i7];
                Object m21239a = m21239a(localDateTime, c4927b);
                if ((m21239a instanceof C4927b) || m21239a.equals(c4927b.m21234s())) {
                    return m21239a;
                }
                i7++;
                obj = m21239a;
            }
            return obj;
        }
        if (this.f18124c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f18127f.length;
        LocalDateTime[] localDateTimeArr = this.f18125d;
        if (length2 > 0 && localDateTime.m20939N(localDateTimeArr[localDateTimeArr.length - 1])) {
            C4927b[] m21240b2 = m21240b(localDateTime.m20938M());
            int length3 = m21240b2.length;
            while (i7 < length3) {
                C4927b c4927b2 = m21240b2[i7];
                Object m21239a2 = m21239a(localDateTime, c4927b2);
                if ((m21239a2 instanceof C4927b) || m21239a2.equals(c4927b2.m21234s())) {
                    return m21239a2;
                }
                i7++;
                obj = m21239a2;
            }
            return obj;
        }
        int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f18126e;
        if (binarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else if (binarySearch < localDateTimeArr.length - 1) {
            int i8 = binarySearch + 1;
            if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i8])) {
                binarySearch = i8;
            }
        }
        if ((binarySearch & 1) != 0) {
            return zoneOffsetArr2[(binarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
        int i9 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i9];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i9 + 1];
        return zoneOffset2.m20971Q() > zoneOffset.m20971Q() ? new C4927b(localDateTime2, zoneOffset, zoneOffset2) : new C4927b(localDateTime3, zoneOffset, zoneOffset2);
    }

    /* renamed from: a */
    private static Object m21239a(LocalDateTime localDateTime, C4927b c4927b) {
        LocalDateTime m21231m = c4927b.m21231m();
        if (c4927b.m21236z()) {
            if (localDateTime.m20940O(m21231m)) {
                return c4927b.m21234s();
            }
            return localDateTime.m20940O(c4927b.m21230l()) ? c4927b : c4927b.m21233o();
        }
        if (localDateTime.m20940O(m21231m)) {
            return localDateTime.m20940O(c4927b.m21230l()) ? c4927b.m21234s() : c4927b;
        }
        return c4927b.m21233o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private C4927b[] m21240b(int i7) {
        long j7;
        Integer valueOf = Integer.valueOf(i7);
        ConcurrentHashMap concurrentHashMap = this.f18129h;
        C4927b[] c4927bArr = (C4927b[]) concurrentHashMap.get(valueOf);
        if (c4927bArr != null) {
            return c4927bArr;
        }
        TimeZone timeZone = this.f18128g;
        if (timeZone == null) {
            C4930e[] c4930eArr = this.f18127f;
            C4927b[] c4927bArr2 = new C4927b[c4930eArr.length];
            for (int i8 = 0; i8 < c4930eArr.length; i8++) {
                c4927bArr2[i8] = c4930eArr[i8].m21238a(i7);
            }
            if (i7 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, c4927bArr2);
            }
            return c4927bArr2;
        }
        C4927b[] c4927bArr3 = f18121l;
        if (i7 < 1800) {
            return c4927bArr3;
        }
        long m21030n = AbstractC4843i.m21030n(LocalDateTime.m20930P(i7 - 1), this.f18123b[0]);
        int offset = timeZone.getOffset(m21030n * 1000);
        long j8 = 31968000 + m21030n;
        while (m21030n < j8) {
            long j9 = 7776000 + m21030n;
            long j10 = m21030n;
            if (offset != timeZone.getOffset(j9 * 1000)) {
                m21030n = j10;
                while (j9 - m21030n > 1) {
                    int i9 = offset;
                    long j11 = j8;
                    long m20873k = AbstractC4815a.m20873k(j9 + m21030n, 2L);
                    if (timeZone.getOffset(m20873k * 1000) == i9) {
                        m21030n = m20873k;
                    } else {
                        j9 = m20873k;
                    }
                    offset = i9;
                    j8 = j11;
                }
                j7 = j8;
                int i10 = offset;
                if (timeZone.getOffset(m21030n * 1000) == i10) {
                    m21030n = j9;
                }
                ZoneOffset m21244i = m21244i(i10);
                offset = timeZone.getOffset(m21030n * 1000);
                ZoneOffset m21244i2 = m21244i(offset);
                if (m21241c(m21030n, m21244i2) == i7) {
                    c4927bArr3 = (C4927b[]) Arrays.copyOf(c4927bArr3, c4927bArr3.length + 1);
                    c4927bArr3[c4927bArr3.length - 1] = new C4927b(m21030n, m21244i, m21244i2);
                }
            } else {
                j7 = j8;
                m21030n = j9;
            }
            j8 = j7;
        }
        if (1916 <= i7 && i7 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, c4927bArr3);
        }
        return c4927bArr3;
    }

    /* renamed from: c */
    private static int m21241c(long j7, ZoneOffset zoneOffset) {
        return C4888i.m21115X(AbstractC4815a.m20873k(j7 + zoneOffset.m20971Q(), 86400)).m21121Q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4931f)) {
            return false;
        }
        C4931f c4931f = (C4931f) obj;
        return Objects.equals(this.f18128g, c4931f.f18128g) && Arrays.equals(this.f18122a, c4931f.f18122a) && Arrays.equals(this.f18123b, c4931f.f18123b) && Arrays.equals(this.f18124c, c4931f.f18124c) && Arrays.equals(this.f18126e, c4931f.f18126e) && Arrays.equals(this.f18127f, c4931f.f18127f);
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f18128g) ^ Arrays.hashCode(this.f18122a)) ^ Arrays.hashCode(this.f18123b)) ^ Arrays.hashCode(this.f18124c)) ^ Arrays.hashCode(this.f18126e)) ^ Arrays.hashCode(this.f18127f);
    }

    public final String toString() {
        TimeZone timeZone = this.f18128g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f18123b[r1.length - 1] + "]";
    }
}
