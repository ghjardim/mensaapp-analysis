package p240h0;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p259j0.AbstractC5332a;

/* renamed from: h0.e */
/* loaded from: classes.dex */
public final class C4479e {

    /* renamed from: a */
    public final int f15940a;

    /* renamed from: b */
    public final int f15941b;

    /* renamed from: c */
    public final float f15942c;

    /* renamed from: d */
    public final float f15943d;

    /* renamed from: e */
    public final float f15944e;

    /* renamed from: f */
    public final int f15945f;

    /* renamed from: g */
    public final int f15946g;

    /* renamed from: h */
    public final int f15947h;

    /* renamed from: i */
    public final short[] f15948i;

    /* renamed from: j */
    public short[] f15949j;

    /* renamed from: k */
    public int f15950k;

    /* renamed from: l */
    public short[] f15951l;

    /* renamed from: m */
    public int f15952m;

    /* renamed from: n */
    public short[] f15953n;

    /* renamed from: o */
    public int f15954o;

    /* renamed from: p */
    public int f15955p;

    /* renamed from: q */
    public int f15956q;

    /* renamed from: r */
    public int f15957r;

    /* renamed from: s */
    public int f15958s;

    /* renamed from: t */
    public int f15959t;

    /* renamed from: u */
    public int f15960u;

    /* renamed from: v */
    public int f15961v;

    public C4479e(int i7, int i8, float f7, float f8, int i9) {
        this.f15940a = i7;
        this.f15941b = i8;
        this.f15942c = f7;
        this.f15943d = f8;
        this.f15944e = i7 / i9;
        this.f15945f = i7 / 400;
        int i10 = i7 / 65;
        this.f15946g = i10;
        int i11 = i10 * 2;
        this.f15947h = i11;
        this.f15948i = new short[i11];
        this.f15949j = new short[i11 * i8];
        this.f15951l = new short[i11 * i8];
        this.f15953n = new short[i11 * i8];
    }

    /* renamed from: p */
    public static void m19071p(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i9 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i10 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i13] = (short) (((sArr2[i15] * (i7 - i16)) + (sArr3[i14] * i16)) / i7);
                i13 += i8;
                i15 += i8;
                i14 += i8;
            }
        }
    }

    /* renamed from: a */
    public final void m19072a(float f7, int i7) {
        int i8;
        int i9;
        if (this.f15952m == i7) {
            return;
        }
        int i10 = this.f15940a;
        int i11 = (int) (i10 / f7);
        while (true) {
            if (i11 <= 16384 && i10 <= 16384) {
                break;
            }
            i11 /= 2;
            i10 /= 2;
        }
        m19086o(i7);
        int i12 = 0;
        while (true) {
            int i13 = this.f15954o;
            if (i12 >= i13 - 1) {
                m19091u(i13 - 1);
                return;
            }
            while (true) {
                i8 = this.f15955p;
                int i14 = (i8 + 1) * i11;
                i9 = this.f15956q;
                if (i14 <= i9 * i10) {
                    break;
                }
                this.f15951l = m19077f(this.f15951l, this.f15952m, 1);
                int i15 = 0;
                while (true) {
                    int i16 = this.f15941b;
                    if (i15 < i16) {
                        this.f15951l[(this.f15952m * i16) + i15] = m19085n(this.f15953n, (i16 * i12) + i15, i10, i11);
                        i15++;
                    }
                }
                this.f15956q++;
                this.f15952m++;
            }
            int i17 = i8 + 1;
            this.f15955p = i17;
            if (i17 == i10) {
                this.f15955p = 0;
                AbstractC5332a.m21802g(i9 == i11);
                this.f15956q = 0;
            }
            i12++;
        }
    }

    /* renamed from: b */
    public final void m19073b(float f7) {
        int m19093w;
        int i7 = this.f15950k;
        if (i7 < this.f15947h) {
            return;
        }
        int i8 = 0;
        do {
            if (this.f15957r > 0) {
                m19093w = m19074c(i8);
            } else {
                int m19078g = m19078g(this.f15949j, i8);
                m19093w = ((double) f7) > 1.0d ? m19078g + m19093w(this.f15949j, i8, f7, m19078g) : m19084m(this.f15949j, i8, f7, m19078g);
            }
            i8 += m19093w;
        } while (this.f15947h + i8 <= i7);
        m19092v(i8);
    }

    /* renamed from: c */
    public final int m19074c(int i7) {
        int min = Math.min(this.f15947h, this.f15957r);
        m19075d(this.f15949j, i7, min);
        this.f15957r -= min;
        return min;
    }

    /* renamed from: d */
    public final void m19075d(short[] sArr, int i7, int i8) {
        short[] m19077f = m19077f(this.f15951l, this.f15952m, i8);
        this.f15951l = m19077f;
        int i9 = this.f15941b;
        System.arraycopy(sArr, i7 * i9, m19077f, this.f15952m * i9, i9 * i8);
        this.f15952m += i8;
    }

    /* renamed from: e */
    public final void m19076e(short[] sArr, int i7, int i8) {
        int i9 = this.f15947h / i8;
        int i10 = this.f15941b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f15948i[i13] = (short) (i14 / i11);
        }
    }

    /* renamed from: f */
    public final short[] m19077f(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f15941b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    /* renamed from: g */
    public final int m19078g(short[] sArr, int i7) {
        int i8;
        int i9 = this.f15940a;
        int i10 = i9 > 4000 ? i9 / 4000 : 1;
        if (this.f15941b == 1 && i10 == 1) {
            i8 = m19079h(sArr, i7, this.f15945f, this.f15946g);
        } else {
            m19076e(sArr, i7, i10);
            int m19079h = m19079h(this.f15948i, 0, this.f15945f / i10, this.f15946g / i10);
            if (i10 != 1) {
                int i11 = m19079h * i10;
                int i12 = i10 * 4;
                int i13 = i11 - i12;
                int i14 = i11 + i12;
                int i15 = this.f15945f;
                if (i13 < i15) {
                    i13 = i15;
                }
                int i16 = this.f15946g;
                if (i14 > i16) {
                    i14 = i16;
                }
                if (this.f15941b == 1) {
                    i8 = m19079h(sArr, i7, i13, i14);
                } else {
                    m19076e(sArr, i7, 1);
                    i8 = m19079h(this.f15948i, 0, i13, i14);
                }
            } else {
                i8 = m19079h;
            }
        }
        int i17 = m19087q(this.f15960u, this.f15961v) ? this.f15958s : i8;
        this.f15959t = this.f15960u;
        this.f15958s = i8;
        return i17;
    }

    /* renamed from: h */
    public final int m19079h(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f15941b;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i8; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i8) + i16]);
            }
            if (i15 * i13 < i12 * i8) {
                i13 = i8;
                i12 = i15;
            }
            if (i15 * i11 > i14 * i8) {
                i11 = i8;
                i14 = i15;
            }
            i8++;
        }
        this.f15960u = i12 / i13;
        this.f15961v = i14 / i11;
        return i13;
    }

    /* renamed from: i */
    public void m19080i() {
        this.f15950k = 0;
        this.f15952m = 0;
        this.f15954o = 0;
        this.f15955p = 0;
        this.f15956q = 0;
        this.f15957r = 0;
        this.f15958s = 0;
        this.f15959t = 0;
        this.f15960u = 0;
        this.f15961v = 0;
    }

    /* renamed from: j */
    public void m19081j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f15941b, this.f15952m);
        shortBuffer.put(this.f15951l, 0, this.f15941b * min);
        int i7 = this.f15952m - min;
        this.f15952m = i7;
        short[] sArr = this.f15951l;
        int i8 = this.f15941b;
        System.arraycopy(sArr, min * i8, sArr, 0, i7 * i8);
    }

    /* renamed from: k */
    public int m19082k() {
        return this.f15952m * this.f15941b * 2;
    }

    /* renamed from: l */
    public int m19083l() {
        return this.f15950k * this.f15941b * 2;
    }

    /* renamed from: m */
    public final int m19084m(short[] sArr, int i7, float f7, int i8) {
        int i9;
        if (f7 < 0.5f) {
            i9 = (int) ((i8 * f7) / (1.0f - f7));
        } else {
            this.f15957r = (int) ((i8 * ((2.0f * f7) - 1.0f)) / (1.0f - f7));
            i9 = i8;
        }
        int i10 = i8 + i9;
        short[] m19077f = m19077f(this.f15951l, this.f15952m, i10);
        this.f15951l = m19077f;
        int i11 = this.f15941b;
        System.arraycopy(sArr, i7 * i11, m19077f, this.f15952m * i11, i11 * i8);
        m19071p(i9, this.f15941b, this.f15951l, this.f15952m + i8, sArr, i7 + i8, sArr, i7);
        this.f15952m += i10;
        return i9;
    }

    /* renamed from: n */
    public final short m19085n(short[] sArr, int i7, int i8, int i9) {
        short s7 = sArr[i7];
        short s8 = sArr[i7 + this.f15941b];
        int i10 = this.f15956q * i8;
        int i11 = this.f15955p;
        int i12 = i11 * i9;
        int i13 = (i11 + 1) * i9;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) (((s7 * i14) + ((i15 - i14) * s8)) / i15);
    }

    /* renamed from: o */
    public final void m19086o(int i7) {
        int i8 = this.f15952m - i7;
        short[] m19077f = m19077f(this.f15953n, this.f15954o, i8);
        this.f15953n = m19077f;
        short[] sArr = this.f15951l;
        int i9 = this.f15941b;
        System.arraycopy(sArr, i7 * i9, m19077f, this.f15954o * i9, i9 * i8);
        this.f15952m = i7;
        this.f15954o += i8;
    }

    /* renamed from: q */
    public final boolean m19087q(int i7, int i8) {
        return i7 != 0 && this.f15958s != 0 && i8 <= i7 * 3 && i7 * 2 > this.f15959t * 3;
    }

    /* renamed from: r */
    public final void m19088r() {
        int i7 = this.f15952m;
        float f7 = this.f15942c;
        float f8 = this.f15943d;
        float f9 = f7 / f8;
        float f10 = this.f15944e * f8;
        double d7 = f9;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            m19073b(f9);
        } else {
            m19075d(this.f15949j, 0, this.f15950k);
            this.f15950k = 0;
        }
        if (f10 != 1.0f) {
            m19072a(f10, i7);
        }
    }

    /* renamed from: s */
    public void m19089s() {
        int i7;
        int i8 = this.f15950k;
        float f7 = this.f15942c;
        float f8 = this.f15943d;
        int i9 = this.f15952m + ((int) ((((i8 / (f7 / f8)) + this.f15954o) / (this.f15944e * f8)) + 0.5f));
        this.f15949j = m19077f(this.f15949j, i8, (this.f15947h * 2) + i8);
        int i10 = 0;
        while (true) {
            i7 = this.f15947h;
            int i11 = this.f15941b;
            if (i10 >= i7 * 2 * i11) {
                break;
            }
            this.f15949j[(i11 * i8) + i10] = 0;
            i10++;
        }
        this.f15950k += i7 * 2;
        m19088r();
        if (this.f15952m > i9) {
            this.f15952m = i9;
        }
        this.f15950k = 0;
        this.f15957r = 0;
        this.f15954o = 0;
    }

    /* renamed from: t */
    public void m19090t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i7 = this.f15941b;
        int i8 = remaining / i7;
        short[] m19077f = m19077f(this.f15949j, this.f15950k, i8);
        this.f15949j = m19077f;
        shortBuffer.get(m19077f, this.f15950k * this.f15941b, ((i7 * i8) * 2) / 2);
        this.f15950k += i8;
        m19088r();
    }

    /* renamed from: u */
    public final void m19091u(int i7) {
        if (i7 == 0) {
            return;
        }
        short[] sArr = this.f15953n;
        int i8 = this.f15941b;
        System.arraycopy(sArr, i7 * i8, sArr, 0, (this.f15954o - i7) * i8);
        this.f15954o -= i7;
    }

    /* renamed from: v */
    public final void m19092v(int i7) {
        int i8 = this.f15950k - i7;
        short[] sArr = this.f15949j;
        int i9 = this.f15941b;
        System.arraycopy(sArr, i7 * i9, sArr, 0, i9 * i8);
        this.f15950k = i8;
    }

    /* renamed from: w */
    public final int m19093w(short[] sArr, int i7, float f7, int i8) {
        int i9;
        if (f7 >= 2.0f) {
            i9 = (int) (i8 / (f7 - 1.0f));
        } else {
            this.f15957r = (int) ((i8 * (2.0f - f7)) / (f7 - 1.0f));
            i9 = i8;
        }
        short[] m19077f = m19077f(this.f15951l, this.f15952m, i9);
        this.f15951l = m19077f;
        m19071p(i9, this.f15941b, m19077f, this.f15952m, sArr, i7, sArr, i7 + i8);
        this.f15952m += i9;
        return i9;
    }
}
