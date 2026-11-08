package p232g0;

import android.net.Uri;
import java.util.Arrays;
import p232g0.C4331u;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class C4311a {

    /* renamed from: g */
    public static final C4311a f14976g = new C4311a(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h */
    public static final a f14977h = new a(0).m18122i(0);

    /* renamed from: i */
    public static final String f14978i = AbstractC5330M.m21783x0(1);

    /* renamed from: j */
    public static final String f14979j = AbstractC5330M.m21783x0(2);

    /* renamed from: k */
    public static final String f14980k = AbstractC5330M.m21783x0(3);

    /* renamed from: l */
    public static final String f14981l = AbstractC5330M.m21783x0(4);

    /* renamed from: a */
    public final Object f14982a;

    /* renamed from: b */
    public final int f14983b;

    /* renamed from: c */
    public final long f14984c;

    /* renamed from: d */
    public final long f14985d;

    /* renamed from: e */
    public final int f14986e;

    /* renamed from: f */
    public final a[] f14987f;

    /* renamed from: g0.a$a */
    public static final class a {

        /* renamed from: j */
        public static final String f14988j = AbstractC5330M.m21783x0(0);

        /* renamed from: k */
        public static final String f14989k = AbstractC5330M.m21783x0(1);

        /* renamed from: l */
        public static final String f14990l = AbstractC5330M.m21783x0(2);

        /* renamed from: m */
        public static final String f14991m = AbstractC5330M.m21783x0(3);

        /* renamed from: n */
        public static final String f14992n = AbstractC5330M.m21783x0(4);

        /* renamed from: o */
        public static final String f14993o = AbstractC5330M.m21783x0(5);

        /* renamed from: p */
        public static final String f14994p = AbstractC5330M.m21783x0(6);

        /* renamed from: q */
        public static final String f14995q = AbstractC5330M.m21783x0(7);

        /* renamed from: r */
        public static final String f14996r = AbstractC5330M.m21783x0(8);

        /* renamed from: a */
        public final long f14997a;

        /* renamed from: b */
        public final int f14998b;

        /* renamed from: c */
        public final int f14999c;

        /* renamed from: d */
        public final Uri[] f15000d;

        /* renamed from: e */
        public final C4331u[] f15001e;

        /* renamed from: f */
        public final int[] f15002f;

        /* renamed from: g */
        public final long[] f15003g;

        /* renamed from: h */
        public final long f15004h;

        /* renamed from: i */
        public final boolean f15005i;

        public a(long j7) {
            this(j7, -1, -1, new int[0], new C4331u[0], new long[0], 0L, false);
        }

        /* renamed from: b */
        public static long[] m18115b(long[] jArr, int i7) {
            int length = jArr.length;
            int max = Math.max(i7, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        /* renamed from: c */
        public static int[] m18116c(int[] iArr, int i7) {
            int length = iArr.length;
            int max = Math.max(i7, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: d */
        public int m18117d() {
            return m18118e(-1);
        }

        /* renamed from: e */
        public int m18118e(int i7) {
            int i8;
            int i9 = i7 + 1;
            while (true) {
                int[] iArr = this.f15002f;
                if (i9 >= iArr.length || this.f15005i || (i8 = iArr[i9]) == 0 || i8 == 1) {
                    break;
                }
                i9++;
            }
            return i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14997a == aVar.f14997a && this.f14998b == aVar.f14998b && this.f14999c == aVar.f14999c && Arrays.equals(this.f15001e, aVar.f15001e) && Arrays.equals(this.f15002f, aVar.f15002f) && Arrays.equals(this.f15003g, aVar.f15003g) && this.f15004h == aVar.f15004h && this.f15005i == aVar.f15005i;
        }

        /* renamed from: f */
        public boolean m18119f() {
            if (this.f14998b == -1) {
                return true;
            }
            for (int i7 = 0; i7 < this.f14998b; i7++) {
                int i8 = this.f15002f[i7];
                if (i8 == 0 || i8 == 1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m18120g() {
            return this.f15005i && this.f14997a == Long.MIN_VALUE && this.f14998b == -1;
        }

        /* renamed from: h */
        public boolean m18121h() {
            return this.f14998b == -1 || m18117d() < this.f14998b;
        }

        public int hashCode() {
            int i7 = ((this.f14998b * 31) + this.f14999c) * 31;
            long j7 = this.f14997a;
            int hashCode = (((((((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Arrays.hashCode(this.f15001e)) * 31) + Arrays.hashCode(this.f15002f)) * 31) + Arrays.hashCode(this.f15003g)) * 31;
            long j8 = this.f15004h;
            return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f15005i ? 1 : 0);
        }

        /* renamed from: i */
        public a m18122i(int i7) {
            int[] m18116c = m18116c(this.f15002f, i7);
            long[] m18115b = m18115b(this.f15003g, i7);
            return new a(this.f14997a, i7, this.f14999c, m18116c, (C4331u[]) Arrays.copyOf(this.f15001e, i7), m18115b, this.f15004h, this.f15005i);
        }

        public a(long j7, int i7, int i8, int[] iArr, C4331u[] c4331uArr, long[] jArr, long j8, boolean z6) {
            int i9 = 0;
            AbstractC5332a.m21796a(iArr.length == c4331uArr.length);
            this.f14997a = j7;
            this.f14998b = i7;
            this.f14999c = i8;
            this.f15002f = iArr;
            this.f15001e = c4331uArr;
            this.f15003g = jArr;
            this.f15004h = j8;
            this.f15005i = z6;
            this.f15000d = new Uri[c4331uArr.length];
            while (true) {
                Uri[] uriArr = this.f15000d;
                if (i9 >= uriArr.length) {
                    return;
                }
                C4331u c4331u = c4331uArr[i9];
                uriArr[i9] = c4331u == null ? null : ((C4331u.h) AbstractC5332a.m21800e(c4331u.f15212b)).f15304a;
                i9++;
            }
        }
    }

    public C4311a(Object obj, a[] aVarArr, long j7, long j8, int i7) {
        this.f14982a = obj;
        this.f14984c = j7;
        this.f14985d = j8;
        this.f14983b = aVarArr.length + i7;
        this.f14987f = aVarArr;
        this.f14986e = i7;
    }

    /* renamed from: a */
    public a m18109a(int i7) {
        int i8 = this.f14986e;
        return i7 < i8 ? f14977h : this.f14987f[i7 - i8];
    }

    /* renamed from: b */
    public int m18110b(long j7, long j8) {
        if (j7 == Long.MIN_VALUE) {
            return -1;
        }
        if (j8 != -9223372036854775807L && j7 >= j8) {
            return -1;
        }
        int i7 = this.f14986e;
        while (i7 < this.f14983b && ((m18109a(i7).f14997a != Long.MIN_VALUE && m18109a(i7).f14997a <= j7) || !m18109a(i7).m18121h())) {
            i7++;
        }
        if (i7 < this.f14983b) {
            return i7;
        }
        return -1;
    }

    /* renamed from: c */
    public int m18111c(long j7, long j8) {
        int i7 = this.f14983b - 1;
        int i8 = i7 - (m18112d(i7) ? 1 : 0);
        while (i8 >= 0 && m18113e(j7, j8, i8)) {
            i8--;
        }
        if (i8 < 0 || !m18109a(i8).m18119f()) {
            return -1;
        }
        return i8;
    }

    /* renamed from: d */
    public boolean m18112d(int i7) {
        return i7 == this.f14983b - 1 && m18109a(i7).m18120g();
    }

    /* renamed from: e */
    public final boolean m18113e(long j7, long j8, int i7) {
        if (j7 == Long.MIN_VALUE) {
            return false;
        }
        a m18109a = m18109a(i7);
        long j9 = m18109a.f14997a;
        return j9 == Long.MIN_VALUE ? j8 == -9223372036854775807L || (m18109a.f15005i && m18109a.f14998b == -1) || j7 < j8 : j7 < j9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4311a.class != obj.getClass()) {
            return false;
        }
        C4311a c4311a = (C4311a) obj;
        return AbstractC5330M.m21729c(this.f14982a, c4311a.f14982a) && this.f14983b == c4311a.f14983b && this.f14984c == c4311a.f14984c && this.f14985d == c4311a.f14985d && this.f14986e == c4311a.f14986e && Arrays.equals(this.f14987f, c4311a.f14987f);
    }

    public int hashCode() {
        int i7 = this.f14983b * 31;
        Object obj = this.f14982a;
        return ((((((((i7 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f14984c)) * 31) + ((int) this.f14985d)) * 31) + this.f14986e) * 31) + Arrays.hashCode(this.f14987f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f14982a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f14984c);
        sb.append(", adGroups=[");
        for (int i7 = 0; i7 < this.f14987f.length; i7++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f14987f[i7].f14997a);
            sb.append(", ads=[");
            for (int i8 = 0; i8 < this.f14987f[i7].f15002f.length; i8++) {
                sb.append("ad(state=");
                int i9 = this.f14987f[i7].f15002f[i8];
                if (i9 == 0) {
                    sb.append('_');
                } else if (i9 == 1) {
                    sb.append('R');
                } else if (i9 == 2) {
                    sb.append('S');
                } else if (i9 == 3) {
                    sb.append('P');
                } else if (i9 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f14987f[i7].f15003g[i8]);
                sb.append(')');
                if (i8 < this.f14987f[i7].f15002f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i7 < this.f14987f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
