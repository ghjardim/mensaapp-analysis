package p232g0;

import java.util.Arrays;
import p259j0.AbstractC5330M;

/* renamed from: g0.h */
/* loaded from: classes.dex */
public final class C4318h {

    /* renamed from: h */
    public static final C4318h f15032h = new b().m18154d(1).m18153c(2).m18155e(3).m18151a();

    /* renamed from: i */
    public static final C4318h f15033i = new b().m18154d(1).m18153c(1).m18155e(2).m18151a();

    /* renamed from: j */
    public static final String f15034j = AbstractC5330M.m21783x0(0);

    /* renamed from: k */
    public static final String f15035k = AbstractC5330M.m21783x0(1);

    /* renamed from: l */
    public static final String f15036l = AbstractC5330M.m21783x0(2);

    /* renamed from: m */
    public static final String f15037m = AbstractC5330M.m21783x0(3);

    /* renamed from: n */
    public static final String f15038n = AbstractC5330M.m21783x0(4);

    /* renamed from: o */
    public static final String f15039o = AbstractC5330M.m21783x0(5);

    /* renamed from: a */
    public final int f15040a;

    /* renamed from: b */
    public final int f15041b;

    /* renamed from: c */
    public final int f15042c;

    /* renamed from: d */
    public final byte[] f15043d;

    /* renamed from: e */
    public final int f15044e;

    /* renamed from: f */
    public final int f15045f;

    /* renamed from: g */
    public int f15046g;

    /* renamed from: g0.h$b */
    public static final class b {

        /* renamed from: a */
        public int f15047a;

        /* renamed from: b */
        public int f15048b;

        /* renamed from: c */
        public int f15049c;

        /* renamed from: d */
        public byte[] f15050d;

        /* renamed from: e */
        public int f15051e;

        /* renamed from: f */
        public int f15052f;

        /* renamed from: a */
        public C4318h m18151a() {
            return new C4318h(this.f15047a, this.f15048b, this.f15049c, this.f15050d, this.f15051e, this.f15052f);
        }

        /* renamed from: b */
        public b m18152b(int i7) {
            this.f15052f = i7;
            return this;
        }

        /* renamed from: c */
        public b m18153c(int i7) {
            this.f15048b = i7;
            return this;
        }

        /* renamed from: d */
        public b m18154d(int i7) {
            this.f15047a = i7;
            return this;
        }

        /* renamed from: e */
        public b m18155e(int i7) {
            this.f15049c = i7;
            return this;
        }

        /* renamed from: f */
        public b m18156f(byte[] bArr) {
            this.f15050d = bArr;
            return this;
        }

        /* renamed from: g */
        public b m18157g(int i7) {
            this.f15051e = i7;
            return this;
        }

        public b() {
            this.f15047a = -1;
            this.f15048b = -1;
            this.f15049c = -1;
            this.f15051e = -1;
            this.f15052f = -1;
        }

        public b(C4318h c4318h) {
            this.f15047a = c4318h.f15040a;
            this.f15048b = c4318h.f15041b;
            this.f15049c = c4318h.f15042c;
            this.f15050d = c4318h.f15043d;
            this.f15051e = c4318h.f15044e;
            this.f15052f = c4318h.f15045f;
        }
    }

    /* renamed from: b */
    public static String m18138b(int i7) {
        if (i7 == -1) {
            return "NA";
        }
        return i7 + "bit Chroma";
    }

    /* renamed from: c */
    public static String m18139c(int i7) {
        if (i7 == -1) {
            return "Unset color range";
        }
        if (i7 == 1) {
            return "Full range";
        }
        if (i7 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i7;
    }

    /* renamed from: d */
    public static String m18140d(int i7) {
        if (i7 == -1) {
            return "Unset color space";
        }
        if (i7 == 6) {
            return "BT2020";
        }
        if (i7 == 1) {
            return "BT709";
        }
        if (i7 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i7;
    }

    /* renamed from: e */
    public static String m18141e(int i7) {
        if (i7 == -1) {
            return "Unset color transfer";
        }
        if (i7 == 10) {
            return "Gamma 2.2";
        }
        if (i7 == 1) {
            return "Linear";
        }
        if (i7 == 2) {
            return "sRGB";
        }
        if (i7 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i7 == 6) {
            return "ST2084 PQ";
        }
        if (i7 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i7;
    }

    /* renamed from: h */
    public static boolean m18142h(C4318h c4318h) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (c4318h == null) {
            return true;
        }
        int i11 = c4318h.f15040a;
        return (i11 == -1 || i11 == 1 || i11 == 2) && ((i7 = c4318h.f15041b) == -1 || i7 == 2) && (((i8 = c4318h.f15042c) == -1 || i8 == 3) && c4318h.f15043d == null && (((i9 = c4318h.f15045f) == -1 || i9 == 8) && ((i10 = c4318h.f15044e) == -1 || i10 == 8)));
    }

    /* renamed from: j */
    public static int m18143j(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: k */
    public static int m18144k(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: l */
    public static String m18145l(int i7) {
        if (i7 == -1) {
            return "NA";
        }
        return i7 + "bit Luma";
    }

    /* renamed from: a */
    public b m18146a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4318h.class != obj.getClass()) {
            return false;
        }
        C4318h c4318h = (C4318h) obj;
        return this.f15040a == c4318h.f15040a && this.f15041b == c4318h.f15041b && this.f15042c == c4318h.f15042c && Arrays.equals(this.f15043d, c4318h.f15043d) && this.f15044e == c4318h.f15044e && this.f15045f == c4318h.f15045f;
    }

    /* renamed from: f */
    public boolean m18147f() {
        return (this.f15044e == -1 || this.f15045f == -1) ? false : true;
    }

    /* renamed from: g */
    public boolean m18148g() {
        return (this.f15040a == -1 || this.f15041b == -1 || this.f15042c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f15046g == 0) {
            this.f15046g = ((((((((((527 + this.f15040a) * 31) + this.f15041b) * 31) + this.f15042c) * 31) + Arrays.hashCode(this.f15043d)) * 31) + this.f15044e) * 31) + this.f15045f;
        }
        return this.f15046g;
    }

    /* renamed from: i */
    public boolean m18149i() {
        return m18147f() || m18148g();
    }

    /* renamed from: m */
    public String m18150m() {
        String str;
        String m21685H = m18148g() ? AbstractC5330M.m21685H("%s/%s/%s", m18140d(this.f15040a), m18139c(this.f15041b), m18141e(this.f15042c)) : "NA/NA/NA";
        if (m18147f()) {
            str = this.f15044e + "/" + this.f15045f;
        } else {
            str = "NA/NA";
        }
        return m21685H + "/" + str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(m18140d(this.f15040a));
        sb.append(", ");
        sb.append(m18139c(this.f15041b));
        sb.append(", ");
        sb.append(m18141e(this.f15042c));
        sb.append(", ");
        sb.append(this.f15043d != null);
        sb.append(", ");
        sb.append(m18145l(this.f15044e));
        sb.append(", ");
        sb.append(m18138b(this.f15045f));
        sb.append(")");
        return sb.toString();
    }

    public C4318h(int i7, int i8, int i9, byte[] bArr, int i10, int i11) {
        this.f15040a = i7;
        this.f15041b = i8;
        this.f15042c = i9;
        this.f15043d = bArr;
        this.f15044e = i10;
        this.f15045f = i11;
    }
}
