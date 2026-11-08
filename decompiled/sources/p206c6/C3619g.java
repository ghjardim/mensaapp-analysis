package p206c6;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p125R5.AbstractC2291q;
import p214d6.AbstractC4132b;
import p378x5.AbstractC7019j;

/* renamed from: c6.g */
/* loaded from: classes2.dex */
public class C3619g implements Serializable, Comparable {

    /* renamed from: d */
    public static final a f12117d = new a(null);

    /* renamed from: e */
    public static final C3619g f12118e = new C3619g(new byte[0]);

    /* renamed from: a */
    public final byte[] f12119a;

    /* renamed from: b */
    public transient int f12120b;

    /* renamed from: c */
    public transient String f12121c;

    /* renamed from: c6.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C3619g m14654a(String str) {
            AbstractC5469l.m23028e(str, "<this>");
            C3619g c3619g = new C3619g(AbstractC3612Y.m14561a(str));
            c3619g.m14642A(str);
            return c3619g;
        }

        /* renamed from: b */
        public final C3619g m14655b(byte... data) {
            AbstractC5469l.m23028e(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            AbstractC5469l.m23027d(copyOf, "copyOf(this, size)");
            return new C3619g(copyOf);
        }

        public a() {
        }
    }

    public C3619g(byte[] data) {
        AbstractC5469l.m23028e(data, "data");
        this.f12119a = data;
    }

    /* renamed from: D */
    public static /* synthetic */ C3619g m14637D(C3619g c3619g, int i7, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = AbstractC3614b.m14568c();
        }
        return c3619g.mo14533C(i7, i8);
    }

    /* renamed from: g */
    public static final C3619g m14638g(String str) {
        return f12117d.m14654a(str);
    }

    /* renamed from: q */
    public static /* synthetic */ int m14639q(C3619g c3619g, C3619g c3619g2, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return c3619g.m14651o(c3619g2, i7);
    }

    /* renamed from: v */
    public static /* synthetic */ int m14640v(C3619g c3619g, C3619g c3619g2, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i8 & 2) != 0) {
            i7 = AbstractC3614b.m14568c();
        }
        return c3619g.m14652t(c3619g2, i7);
    }

    /* renamed from: w */
    public static final C3619g m14641w(byte... bArr) {
        return f12117d.m14655b(bArr);
    }

    /* renamed from: A */
    public final void m14642A(String str) {
        this.f12121c = str;
    }

    /* renamed from: B */
    public final boolean m14643B(C3619g prefix) {
        AbstractC5469l.m23028e(prefix, "prefix");
        return mo14547x(0, prefix, 0, prefix.size());
    }

    /* renamed from: C */
    public C3619g mo14533C(int i7, int i8) {
        int m14569d = AbstractC3614b.m14569d(this, i8);
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (m14569d <= m14648j().length) {
            if (m14569d - i7 >= 0) {
                return (i7 == 0 && m14569d == m14648j().length) ? this : new C3619g(AbstractC7019j.m28801k(m14648j(), i7, m14569d));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + m14648j().length + ')').toString());
    }

    /* renamed from: E */
    public C3619g mo14534E() {
        for (int i7 = 0; i7 < m14648j().length; i7++) {
            byte b7 = m14648j()[i7];
            if (b7 >= 65 && b7 <= 90) {
                byte[] m14648j = m14648j();
                byte[] copyOf = Arrays.copyOf(m14648j, m14648j.length);
                AbstractC5469l.m23027d(copyOf, "copyOf(this, size)");
                copyOf[i7] = (byte) (b7 + 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b8 = copyOf[i8];
                    if (b8 >= 65 && b8 <= 90) {
                        copyOf[i8] = (byte) (b8 + 32);
                    }
                }
                return new C3619g(copyOf);
            }
        }
        return this;
    }

    /* renamed from: F */
    public byte[] mo14535F() {
        byte[] m14648j = m14648j();
        byte[] copyOf = Arrays.copyOf(m14648j, m14648j.length);
        AbstractC5469l.m23027d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: G */
    public String m14644G() {
        String m14650m = m14650m();
        if (m14650m != null) {
            return m14650m;
        }
        String m14563c = AbstractC3612Y.m14563c(mo14544r());
        m14642A(m14563c);
        return m14563c;
    }

    /* renamed from: H */
    public void mo14536H(C3616d buffer, int i7, int i8) {
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC4132b.m17327c(this, buffer, i7, i8);
    }

    /* renamed from: b */
    public String mo14540b() {
        return AbstractC3613a.m14565b(m14648j(), null, 1, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3619g) {
            C3619g c3619g = (C3619g) obj;
            if (c3619g.size() == m14648j().length && c3619g.mo14548y(0, m14648j(), 0, m14648j().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(p206c6.C3619g r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.m14647i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m14647i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p206c6.C3619g.compareTo(c6.g):int");
    }

    /* renamed from: h */
    public final boolean m14646h(C3619g suffix) {
        AbstractC5469l.m23028e(suffix, "suffix");
        return mo14547x(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public int hashCode() {
        int m14649k = m14649k();
        if (m14649k != 0) {
            return m14649k;
        }
        int hashCode = Arrays.hashCode(m14648j());
        m14653z(hashCode);
        return hashCode;
    }

    /* renamed from: i */
    public final byte m14647i(int i7) {
        return mo14545s(i7);
    }

    /* renamed from: j */
    public final byte[] m14648j() {
        return this.f12119a;
    }

    /* renamed from: k */
    public final int m14649k() {
        return this.f12120b;
    }

    /* renamed from: l */
    public int mo14541l() {
        return m14648j().length;
    }

    /* renamed from: m */
    public final String m14650m() {
        return this.f12121c;
    }

    /* renamed from: n */
    public String mo14542n() {
        char[] cArr = new char[m14648j().length * 2];
        int i7 = 0;
        for (byte b7 : m14648j()) {
            int i8 = i7 + 1;
            cArr[i7] = AbstractC4132b.m17328d()[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = AbstractC4132b.m17328d()[b7 & 15];
        }
        return AbstractC2291q.m7736l(cArr);
    }

    /* renamed from: o */
    public final int m14651o(C3619g other, int i7) {
        AbstractC5469l.m23028e(other, "other");
        return mo14543p(other.mo14544r(), i7);
    }

    /* renamed from: p */
    public int mo14543p(byte[] other, int i7) {
        AbstractC5469l.m23028e(other, "other");
        int length = m14648j().length - other.length;
        int max = Math.max(i7, 0);
        if (max <= length) {
            while (!AbstractC3614b.m14566a(m14648j(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    /* renamed from: r */
    public byte[] mo14544r() {
        return m14648j();
    }

    /* renamed from: s */
    public byte mo14545s(int i7) {
        return m14648j()[i7];
    }

    public final int size() {
        return mo14541l();
    }

    /* renamed from: t */
    public final int m14652t(C3619g other, int i7) {
        AbstractC5469l.m23028e(other, "other");
        return mo14546u(other.mo14544r(), i7);
    }

    public String toString() {
        int m17326b;
        String str;
        if (m14648j().length == 0) {
            str = "[size=0]";
        } else {
            m17326b = AbstractC4132b.m17326b(m14648j(), 64);
            if (m17326b != -1) {
                String m14644G = m14644G();
                String substring = m14644G.substring(0, m17326b);
                AbstractC5469l.m23027d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String m7743s = AbstractC2291q.m7743s(AbstractC2291q.m7743s(AbstractC2291q.m7743s(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (m17326b >= m14644G.length()) {
                    return "[text=" + m7743s + ']';
                }
                return "[size=" + m14648j().length + " text=" + m7743s + "…]";
            }
            if (m14648j().length > 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(m14648j().length);
                sb.append(" hex=");
                int m14569d = AbstractC3614b.m14569d(this, 64);
                if (m14569d <= m14648j().length) {
                    if (m14569d < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex");
                    }
                    sb.append((m14569d == m14648j().length ? this : new C3619g(AbstractC7019j.m28801k(m14648j(), 0, m14569d))).mo14542n());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + m14648j().length + ')').toString());
            }
            str = "[hex=" + mo14542n() + ']';
        }
        return str;
    }

    /* renamed from: u */
    public int mo14546u(byte[] other, int i7) {
        AbstractC5469l.m23028e(other, "other");
        for (int min = Math.min(AbstractC3614b.m14569d(this, i7), m14648j().length - other.length); -1 < min; min--) {
            if (AbstractC3614b.m14566a(m14648j(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public boolean mo14547x(int i7, C3619g other, int i8, int i9) {
        AbstractC5469l.m23028e(other, "other");
        return other.mo14548y(i8, m14648j(), i7, i9);
    }

    /* renamed from: y */
    public boolean mo14548y(int i7, byte[] other, int i8, int i9) {
        AbstractC5469l.m23028e(other, "other");
        return i7 >= 0 && i7 <= m14648j().length - i9 && i8 >= 0 && i8 <= other.length - i9 && AbstractC3614b.m14566a(m14648j(), i7, other, i8, i9);
    }

    /* renamed from: z */
    public final void m14653z(int i7) {
        this.f12120b = i7;
    }
}
