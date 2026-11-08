package p206c6;

import kotlin.jvm.internal.AbstractC5469l;
import p214d6.AbstractC4135e;
import p378x5.AbstractC7019j;

/* renamed from: c6.S */
/* loaded from: classes2.dex */
public final class C3606S extends C3619g {

    /* renamed from: f */
    public final transient byte[][] f12076f;

    /* renamed from: n */
    public final transient int[] f12077n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3606S(byte[][] segments, int[] directory) {
        super(C3619g.f12118e.m14648j());
        AbstractC5469l.m23028e(segments, "segments");
        AbstractC5469l.m23028e(directory, "directory");
        this.f12076f = segments;
        this.f12077n = directory;
    }

    @Override // p206c6.C3619g
    /* renamed from: C */
    public C3619g mo14533C(int i7, int i8) {
        int m14569d = AbstractC3614b.m14569d(this, i8);
        if (i7 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i7 + " < 0").toString());
        }
        if (m14569d > size()) {
            throw new IllegalArgumentException(("endIndex=" + m14569d + " > length(" + size() + ')').toString());
        }
        int i9 = m14569d - i7;
        if (i9 < 0) {
            throw new IllegalArgumentException(("endIndex=" + m14569d + " < beginIndex=" + i7).toString());
        }
        if (i7 == 0 && m14569d == size()) {
            return this;
        }
        if (i7 == m14569d) {
            return C3619g.f12118e;
        }
        int m17351b = AbstractC4135e.m17351b(this, i7);
        int m17351b2 = AbstractC4135e.m17351b(this, m14569d - 1);
        byte[][] bArr = (byte[][]) AbstractC7019j.m28802l(m14538J(), m17351b, m17351b2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (m17351b <= m17351b2) {
            int i10 = m17351b;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(m14537I()[i10] - i7, i9);
                int i12 = i11 + 1;
                iArr[i11 + bArr.length] = m14537I()[m14538J().length + i10];
                if (i10 == m17351b2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = m17351b != 0 ? m14537I()[m17351b - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i7 - i13);
        return new C3606S(bArr, iArr);
    }

    @Override // p206c6.C3619g
    /* renamed from: E */
    public C3619g mo14534E() {
        return m14539K().mo14534E();
    }

    @Override // p206c6.C3619g
    /* renamed from: F */
    public byte[] mo14535F() {
        byte[] bArr = new byte[size()];
        int length = m14538J().length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int i10 = m14537I()[length + i7];
            int i11 = m14537I()[i7];
            int i12 = i11 - i8;
            AbstractC7019j.m28794d(m14538J()[i7], bArr, i9, i10, i10 + i12);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // p206c6.C3619g
    /* renamed from: H */
    public void mo14536H(C3616d buffer, int i7, int i8) {
        AbstractC5469l.m23028e(buffer, "buffer");
        int i9 = i7 + i8;
        int m17351b = AbstractC4135e.m17351b(this, i7);
        while (i7 < i9) {
            int i10 = m17351b == 0 ? 0 : m14537I()[m17351b - 1];
            int i11 = m14537I()[m17351b] - i10;
            int i12 = m14537I()[m14538J().length + m17351b];
            int min = Math.min(i9, i11 + i10) - i7;
            int i13 = i12 + (i7 - i10);
            C3604P c3604p = new C3604P(m14538J()[m17351b], i13, i13 + min, true, false);
            C3604P c3604p2 = buffer.f12107a;
            if (c3604p2 == null) {
                c3604p.f12070g = c3604p;
                c3604p.f12069f = c3604p;
                buffer.f12107a = c3604p;
            } else {
                AbstractC5469l.m23025b(c3604p2);
                C3604P c3604p3 = c3604p2.f12070g;
                AbstractC5469l.m23025b(c3604p3);
                c3604p3.m14526c(c3604p);
            }
            i7 += min;
            m17351b++;
        }
        buffer.m14615T(buffer.m14618c0() + i8);
    }

    /* renamed from: I */
    public final int[] m14537I() {
        return this.f12077n;
    }

    /* renamed from: J */
    public final byte[][] m14538J() {
        return this.f12076f;
    }

    /* renamed from: K */
    public final C3619g m14539K() {
        return new C3619g(mo14535F());
    }

    @Override // p206c6.C3619g
    /* renamed from: b */
    public String mo14540b() {
        return m14539K().mo14540b();
    }

    @Override // p206c6.C3619g
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3619g) {
            C3619g c3619g = (C3619g) obj;
            if (c3619g.size() == size() && mo14547x(0, c3619g, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // p206c6.C3619g
    public int hashCode() {
        int m14649k = m14649k();
        if (m14649k != 0) {
            return m14649k;
        }
        int length = m14538J().length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int i10 = m14537I()[length + i7];
            int i11 = m14537I()[i7];
            byte[] bArr = m14538J()[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        m14653z(i8);
        return i8;
    }

    @Override // p206c6.C3619g
    /* renamed from: l */
    public int mo14541l() {
        return m14537I()[m14538J().length - 1];
    }

    @Override // p206c6.C3619g
    /* renamed from: n */
    public String mo14542n() {
        return m14539K().mo14542n();
    }

    @Override // p206c6.C3619g
    /* renamed from: p */
    public int mo14543p(byte[] other, int i7) {
        AbstractC5469l.m23028e(other, "other");
        return m14539K().mo14543p(other, i7);
    }

    @Override // p206c6.C3619g
    /* renamed from: r */
    public byte[] mo14544r() {
        return mo14535F();
    }

    @Override // p206c6.C3619g
    /* renamed from: s */
    public byte mo14545s(int i7) {
        AbstractC3614b.m14567b(m14537I()[m14538J().length - 1], i7, 1L);
        int m17351b = AbstractC4135e.m17351b(this, i7);
        return m14538J()[m17351b][(i7 - (m17351b == 0 ? 0 : m14537I()[m17351b - 1])) + m14537I()[m14538J().length + m17351b]];
    }

    @Override // p206c6.C3619g
    public String toString() {
        return m14539K().toString();
    }

    @Override // p206c6.C3619g
    /* renamed from: u */
    public int mo14546u(byte[] other, int i7) {
        AbstractC5469l.m23028e(other, "other");
        return m14539K().mo14546u(other, i7);
    }

    @Override // p206c6.C3619g
    /* renamed from: x */
    public boolean mo14547x(int i7, C3619g other, int i8, int i9) {
        AbstractC5469l.m23028e(other, "other");
        if (i7 < 0 || i7 > size() - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int m17351b = AbstractC4135e.m17351b(this, i7);
        while (i7 < i10) {
            int i11 = m17351b == 0 ? 0 : m14537I()[m17351b - 1];
            int i12 = m14537I()[m17351b] - i11;
            int i13 = m14537I()[m14538J().length + m17351b];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!other.mo14548y(i8, m14538J()[m17351b], i13 + (i7 - i11), min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            m17351b++;
        }
        return true;
    }

    @Override // p206c6.C3619g
    /* renamed from: y */
    public boolean mo14548y(int i7, byte[] other, int i8, int i9) {
        AbstractC5469l.m23028e(other, "other");
        if (i7 < 0 || i7 > size() - i9 || i8 < 0 || i8 > other.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int m17351b = AbstractC4135e.m17351b(this, i7);
        while (i7 < i10) {
            int i11 = m17351b == 0 ? 0 : m14537I()[m17351b - 1];
            int i12 = m14537I()[m17351b] - i11;
            int i13 = m14537I()[m14538J().length + m17351b];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!AbstractC3614b.m14566a(m14538J()[m17351b], i13 + (i7 - i11), other, i8, min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            m17351b++;
        }
        return true;
    }
}
