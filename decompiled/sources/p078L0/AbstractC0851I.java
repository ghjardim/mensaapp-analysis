package p078L0;

/* renamed from: L0.I */
/* loaded from: classes.dex */
public abstract class AbstractC0851I {

    /* renamed from: a */
    public static final String[] f2921a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f2922b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f2923c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f2924d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f2925e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f2926f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f2927g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: L0.I$a */
    public static final class a {

        /* renamed from: a */
        public int f2928a;

        /* renamed from: b */
        public String f2929b;

        /* renamed from: c */
        public int f2930c;

        /* renamed from: d */
        public int f2931d;

        /* renamed from: e */
        public int f2932e;

        /* renamed from: f */
        public int f2933f;

        /* renamed from: g */
        public int f2934g;

        public a() {
        }

        /* renamed from: a */
        public boolean m3541a(int i7) {
            int i8;
            int i9;
            int i10;
            int i11;
            if (!AbstractC0851I.m3539l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
                return false;
            }
            this.f2928a = i8;
            this.f2929b = AbstractC0851I.f2921a[3 - i9];
            int i12 = AbstractC0851I.f2922b[i11];
            this.f2931d = i12;
            if (i8 == 2) {
                this.f2931d = i12 / 2;
            } else if (i8 == 0) {
                this.f2931d = i12 / 4;
            }
            int i13 = (i7 >>> 9) & 1;
            this.f2934g = AbstractC0851I.m3538k(i8, i9);
            if (i9 == 3) {
                int i14 = i8 == 3 ? AbstractC0851I.f2923c[i10 - 1] : AbstractC0851I.f2924d[i10 - 1];
                this.f2933f = i14;
                this.f2930c = (((i14 * 12) / this.f2931d) + i13) * 4;
            } else {
                if (i8 == 3) {
                    int i15 = i9 == 2 ? AbstractC0851I.f2925e[i10 - 1] : AbstractC0851I.f2926f[i10 - 1];
                    this.f2933f = i15;
                    this.f2930c = ((i15 * 144) / this.f2931d) + i13;
                } else {
                    int i16 = AbstractC0851I.f2927g[i10 - 1];
                    this.f2933f = i16;
                    this.f2930c = (((i9 == 1 ? 72 : 144) * i16) / this.f2931d) + i13;
                }
            }
            this.f2932e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f2928a = aVar.f2928a;
            this.f2929b = aVar.f2929b;
            this.f2930c = aVar.f2930c;
            this.f2931d = aVar.f2931d;
            this.f2932e = aVar.f2932e;
            this.f2933f = aVar.f2933f;
            this.f2934g = aVar.f2934g;
        }
    }

    /* renamed from: j */
    public static int m3537j(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!m3539l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = f2922b[i11];
        if (i8 == 2) {
            i12 /= 2;
        } else if (i8 == 0) {
            i12 /= 4;
        }
        int i13 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f2923c[i10 - 1] : f2924d[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i8 == 3 ? i9 == 2 ? f2925e[i10 - 1] : f2926f[i10 - 1] : f2927g[i10 - 1];
        if (i8 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i9 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    /* renamed from: k */
    public static int m3538k(int i7, int i8) {
        if (i8 == 1) {
            return i7 == 3 ? 1152 : 576;
        }
        if (i8 == 2) {
            return 1152;
        }
        if (i8 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static boolean m3539l(int i7) {
        return (i7 & (-2097152)) == -2097152;
    }

    /* renamed from: m */
    public static int m3540m(int i7) {
        int i8;
        int i9;
        if (!m3539l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i7 >>> 12) & 15;
        int i11 = (i7 >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        return m3538k(i8, i9);
    }
}
