package p292n0;

import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: n0.a1 */
/* loaded from: classes.dex */
public final class C5714a1 {

    /* renamed from: c */
    public static final C5714a1 f20649c;

    /* renamed from: d */
    public static final C5714a1 f20650d;

    /* renamed from: e */
    public static final C5714a1 f20651e;

    /* renamed from: f */
    public static final C5714a1 f20652f;

    /* renamed from: g */
    public static final C5714a1 f20653g;

    /* renamed from: a */
    public final long f20654a;

    /* renamed from: b */
    public final long f20655b;

    static {
        C5714a1 c5714a1 = new C5714a1(0L, 0L);
        f20649c = c5714a1;
        f20650d = new C5714a1(Long.MAX_VALUE, Long.MAX_VALUE);
        f20651e = new C5714a1(Long.MAX_VALUE, 0L);
        f20652f = new C5714a1(0L, Long.MAX_VALUE);
        f20653g = c5714a1;
    }

    public C5714a1(long j7, long j8) {
        AbstractC5332a.m21796a(j7 >= 0);
        AbstractC5332a.m21796a(j8 >= 0);
        this.f20654a = j7;
        this.f20655b = j8;
    }

    /* renamed from: a */
    public long m23938a(long j7, long j8, long j9) {
        long j10 = this.f20654a;
        if (j10 == 0 && this.f20655b == 0) {
            return j7;
        }
        long m21746h1 = AbstractC5330M.m21746h1(j7, j10, Long.MIN_VALUE);
        long m21726b = AbstractC5330M.m21726b(j7, this.f20655b, Long.MAX_VALUE);
        boolean z6 = false;
        boolean z7 = m21746h1 <= j8 && j8 <= m21726b;
        if (m21746h1 <= j9 && j9 <= m21726b) {
            z6 = true;
        }
        return (z7 && z6) ? Math.abs(j8 - j7) <= Math.abs(j9 - j7) ? j8 : j9 : z7 ? j8 : z6 ? j9 : m21746h1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5714a1.class != obj.getClass()) {
            return false;
        }
        C5714a1 c5714a1 = (C5714a1) obj;
        return this.f20654a == c5714a1.f20654a && this.f20655b == c5714a1.f20655b;
    }

    public int hashCode() {
        return (((int) this.f20654a) * 31) + ((int) this.f20655b);
    }
}
