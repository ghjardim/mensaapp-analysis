package p232g0;

import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: g0.J */
/* loaded from: classes.dex */
public final class C4304J {

    /* renamed from: f */
    public static final String f14848f = AbstractC5330M.m21783x0(0);

    /* renamed from: g */
    public static final String f14849g = AbstractC5330M.m21783x0(1);

    /* renamed from: a */
    public final int f14850a;

    /* renamed from: b */
    public final String f14851b;

    /* renamed from: c */
    public final int f14852c;

    /* renamed from: d */
    public final C4327q[] f14853d;

    /* renamed from: e */
    public int f14854e;

    public C4304J(C4327q... c4327qArr) {
        this(StringUtils.EMPTY, c4327qArr);
    }

    /* renamed from: c */
    public static void m18061c(String str, String str2, String str3, int i7) {
        AbstractC5346o.m21863d("TrackGroup", StringUtils.EMPTY, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i7 + ")"));
    }

    /* renamed from: d */
    public static String m18062d(String str) {
        return (str == null || str.equals("und")) ? StringUtils.EMPTY : str;
    }

    /* renamed from: e */
    public static int m18063e(int i7) {
        return i7 | 16384;
    }

    /* renamed from: a */
    public C4327q m18064a(int i7) {
        return this.f14853d[i7];
    }

    /* renamed from: b */
    public int m18065b(C4327q c4327q) {
        int i7 = 0;
        while (true) {
            C4327q[] c4327qArr = this.f14853d;
            if (i7 >= c4327qArr.length) {
                return -1;
            }
            if (c4327q == c4327qArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4304J.class != obj.getClass()) {
            return false;
        }
        C4304J c4304j = (C4304J) obj;
        return this.f14851b.equals(c4304j.f14851b) && Arrays.equals(this.f14853d, c4304j.f14853d);
    }

    /* renamed from: f */
    public final void m18066f() {
        String m18062d = m18062d(this.f14853d[0].f15128d);
        int m18063e = m18063e(this.f14853d[0].f15130f);
        int i7 = 1;
        while (true) {
            C4327q[] c4327qArr = this.f14853d;
            if (i7 >= c4327qArr.length) {
                return;
            }
            if (!m18062d.equals(m18062d(c4327qArr[i7].f15128d))) {
                C4327q[] c4327qArr2 = this.f14853d;
                m18061c("languages", c4327qArr2[0].f15128d, c4327qArr2[i7].f15128d, i7);
                return;
            } else {
                if (m18063e != m18063e(this.f14853d[i7].f15130f)) {
                    m18061c("role flags", Integer.toBinaryString(this.f14853d[0].f15130f), Integer.toBinaryString(this.f14853d[i7].f15130f), i7);
                    return;
                }
                i7++;
            }
        }
    }

    public int hashCode() {
        if (this.f14854e == 0) {
            this.f14854e = ((527 + this.f14851b.hashCode()) * 31) + Arrays.hashCode(this.f14853d);
        }
        return this.f14854e;
    }

    public C4304J(String str, C4327q... c4327qArr) {
        AbstractC5332a.m21796a(c4327qArr.length > 0);
        this.f14851b = str;
        this.f14853d = c4327qArr;
        this.f14850a = c4327qArr.length;
        int m18418k = AbstractC4336z.m18418k(c4327qArr[0].f15138n);
        this.f14852c = m18418k == -1 ? AbstractC4336z.m18418k(c4327qArr[0].f15137m) : m18418k;
        m18066f();
    }
}
