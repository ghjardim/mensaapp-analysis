package p203c3;

import com.google.android.gms.common.api.C3643a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2932o;

/* renamed from: c3.g */
/* loaded from: classes.dex */
public abstract class AbstractC3577g extends AbstractC3578h {

    /* renamed from: c3.g$a */
    public static class a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a */
        public final int[] f12034a;

        /* renamed from: b */
        public final int f12035b;

        /* renamed from: c */
        public final int f12036c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i7) {
            AbstractC2932o.m10570m(i7, size());
            return Integer.valueOf(this.f12034a[this.f12035b + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i7, Integer num) {
            AbstractC2932o.m10570m(i7, size());
            int[] iArr = this.f12034a;
            int i8 = this.f12035b;
            int i9 = iArr[i8 + i7];
            iArr[i8 + i7] = ((Integer) AbstractC2932o.m10572o(num)).intValue();
            return Integer.valueOf(i9);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && AbstractC3577g.m14428k(this.f12034a, ((Integer) obj).intValue(), this.f12035b, this.f12036c) != -1;
        }

        /* renamed from: e */
        public int[] m14436e() {
            return Arrays.copyOfRange(this.f12034a, this.f12035b, this.f12036c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f12034a[this.f12035b + i7] != aVar.f12034a[aVar.f12035b + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i7 = 1;
            for (int i8 = this.f12035b; i8 < this.f12036c; i8++) {
                i7 = (i7 * 31) + AbstractC3577g.m14426i(this.f12034a[i8]);
            }
            return i7;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m14428k;
            if (!(obj instanceof Integer) || (m14428k = AbstractC3577g.m14428k(this.f12034a, ((Integer) obj).intValue(), this.f12035b, this.f12036c)) < 0) {
                return -1;
            }
            return m14428k - this.f12035b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m14429l;
            if (!(obj instanceof Integer) || (m14429l = AbstractC3577g.m14429l(this.f12034a, ((Integer) obj).intValue(), this.f12035b, this.f12036c)) < 0) {
                return -1;
            }
            return m14429l - this.f12035b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12036c - this.f12035b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i7, int i8) {
            AbstractC2932o.m10577t(i7, i8, size());
            if (i7 == i8) {
                return Collections.emptyList();
            }
            int[] iArr = this.f12034a;
            int i9 = this.f12035b;
            return new a(iArr, i7 + i9, i9 + i8);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f12034a[this.f12035b]);
            int i7 = this.f12035b;
            while (true) {
                i7++;
                if (i7 >= this.f12036c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f12034a[i7]);
            }
        }

        public a(int[] iArr, int i7, int i8) {
            this.f12034a = iArr;
            this.f12035b = i7;
            this.f12036c = i8;
        }
    }

    /* renamed from: c */
    public static List m14420c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    /* renamed from: d */
    public static int m14421d(long j7) {
        int i7 = (int) j7;
        AbstractC2932o.m10567j(((long) i7) == j7, "Out of range: %s", j7);
        return i7;
    }

    /* renamed from: e */
    public static int m14422e(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 > i8 ? 1 : 0;
    }

    /* renamed from: f */
    public static int m14423f(int i7, int i8, int i9) {
        AbstractC2932o.m10566i(i8 <= i9, "min (%s) must be less than or equal to max (%s)", i8, i9);
        return Math.min(Math.max(i7, i8), i9);
    }

    /* renamed from: g */
    public static int m14424g(byte[] bArr) {
        AbstractC2932o.m10566i(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return m14425h(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* renamed from: h */
    public static int m14425h(byte b7, byte b8, byte b9, byte b10) {
        return (b7 << 24) | ((b8 & ForkServer.ERROR) << 16) | ((b9 & ForkServer.ERROR) << 8) | (b10 & ForkServer.ERROR);
    }

    /* renamed from: j */
    public static int m14427j(int[] iArr, int i7) {
        return m14428k(iArr, i7, 0, iArr.length);
    }

    /* renamed from: k */
    public static int m14428k(int[] iArr, int i7, int i8, int i9) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* renamed from: l */
    public static int m14429l(int[] iArr, int i7, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (iArr[i10] == i7) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static int m14430m(long j7) {
        if (j7 > 2147483647L) {
            return C3643a.e.API_PRIORITY_OTHER;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    /* renamed from: n */
    public static int[] m14431n(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).m14436e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = ((Number) AbstractC2932o.m10572o(array[i7])).intValue();
        }
        return iArr;
    }

    /* renamed from: o */
    public static Integer m14432o(String str) {
        return m14433p(str, 10);
    }

    /* renamed from: p */
    public static Integer m14433p(String str, int i7) {
        Long m14440d = AbstractC3579i.m14440d(str, i7);
        if (m14440d == null || m14440d.longValue() != m14440d.intValue()) {
            return null;
        }
        return Integer.valueOf(m14440d.intValue());
    }

    /* renamed from: i */
    public static int m14426i(int i7) {
        return i7;
    }
}
