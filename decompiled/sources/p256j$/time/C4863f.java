package p256j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.time.f */
/* loaded from: classes3.dex */
public final class C4863f implements Comparable, Serializable {

    /* renamed from: c */
    public static final C4863f f17967c = new C4863f(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a */
    private final long f17968a;

    /* renamed from: b */
    private final int f17969b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4863f c4863f = (C4863f) obj;
        int compare = Long.compare(this.f17968a, c4863f.f17968a);
        return compare != 0 ? compare : this.f17969b - c4863f.f17969b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    /* renamed from: o */
    public static C4863f m21061o(long j7) {
        return m21059l(j7, 0);
    }

    /* renamed from: s */
    public static C4863f m21062s(long j7, long j8) {
        return m21059l(AbstractC4815a.m20868f(j7, AbstractC4815a.m20873k(j8, 1000000000L)), (int) AbstractC4815a.m20872j(j8, 1000000000L));
    }

    /* renamed from: n */
    public static C4863f m21060n(long j7) {
        long j8 = j7 / 1000000000;
        int i7 = (int) (j7 % 1000000000);
        if (i7 < 0) {
            i7 = (int) (i7 + 1000000000);
            j8--;
        }
        return m21059l(j8, i7);
    }

    /* renamed from: l */
    private static C4863f m21059l(long j7, int i7) {
        if ((i7 | j7) == 0) {
            return f17967c;
        }
        return new C4863f(j7, i7);
    }

    private C4863f(long j7, int i7) {
        this.f17968a = j7;
        this.f17969b = i7;
    }

    /* renamed from: m */
    public final long m21063m() {
        return this.f17968a;
    }

    /* renamed from: w */
    public final long m21064w() {
        long j7 = this.f17969b;
        long j8 = this.f17968a;
        if (j8 < 0) {
            j8++;
            j7 -= 1000000000;
        }
        return AbstractC4815a.m20868f(AbstractC4815a.m20874l(j8, 1000000000L), j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4863f)) {
            return false;
        }
        C4863f c4863f = (C4863f) obj;
        return this.f17968a == c4863f.f17968a && this.f17969b == c4863f.f17969b;
    }

    public final int hashCode() {
        long j7 = this.f17968a;
        return (this.f17969b * 51) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        if (this == f17967c) {
            return "PT0S";
        }
        long j7 = this.f17968a;
        int i7 = this.f17969b;
        long j8 = (j7 >= 0 || i7 <= 0) ? j7 : 1 + j7;
        long j9 = j8 / 3600;
        int i8 = (int) ((j8 % 3600) / 60);
        int i9 = (int) (j8 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j9 != 0) {
            sb.append(j9);
            sb.append('H');
        }
        if (i8 != 0) {
            sb.append(i8);
            sb.append('M');
        }
        if (i9 == 0 && i7 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j7 >= 0 || i7 <= 0) {
            sb.append(i9);
        } else if (i9 == 0) {
            sb.append("-0");
        } else {
            sb.append(i9);
        }
        if (i7 > 0) {
            int length = sb.length();
            if (j7 < 0) {
                sb.append(2000000000 - i7);
            } else {
                sb.append(i7 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.f17968a);
        objectOutput.writeInt(this.f17969b);
    }
}
