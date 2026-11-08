package p237g5;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: g5.t */
/* loaded from: classes2.dex */
public final class C4462t implements Comparable {

    /* renamed from: d */
    public static final b f15889d = new b();

    /* renamed from: e */
    public static final long f15890e;

    /* renamed from: f */
    public static final long f15891f;

    /* renamed from: n */
    public static final long f15892n;

    /* renamed from: a */
    public final c f15893a;

    /* renamed from: b */
    public final long f15894b;

    /* renamed from: c */
    public volatile boolean f15895c;

    /* renamed from: g5.t$b */
    public static class b extends c {
        public b() {
        }

        @Override // p237g5.C4462t.c
        /* renamed from: a */
        public long mo19026a() {
            return System.nanoTime();
        }
    }

    /* renamed from: g5.t$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract long mo19026a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f15890e = nanos;
        f15891f = -nanos;
        f15892n = TimeUnit.SECONDS.toNanos(1L);
    }

    public C4462t(c cVar, long j7, boolean z6) {
        this(cVar, cVar.mo19026a(), j7, z6);
    }

    /* renamed from: b */
    public static C4462t m19016b(long j7, TimeUnit timeUnit) {
        return m19017f(j7, timeUnit, f15889d);
    }

    /* renamed from: f */
    public static C4462t m19017f(long j7, TimeUnit timeUnit, c cVar) {
        m19018g(timeUnit, "units");
        return new C4462t(cVar, timeUnit.toNanos(j7), true);
    }

    /* renamed from: g */
    public static Object m19018g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: j */
    public static c m19019j() {
        return f15889d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4462t)) {
            return false;
        }
        C4462t c4462t = (C4462t) obj;
        c cVar = this.f15893a;
        if (cVar != null ? cVar == c4462t.f15893a : c4462t.f15893a == null) {
            return this.f15894b == c4462t.f15894b;
        }
        return false;
    }

    /* renamed from: h */
    public final void m19020h(C4462t c4462t) {
        if (this.f15893a == c4462t.f15893a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f15893a + " and " + c4462t.f15893a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public int hashCode() {
        return Arrays.asList(this.f15893a, Long.valueOf(this.f15894b)).hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4462t c4462t) {
        m19020h(c4462t);
        long j7 = this.f15894b - c4462t.f15894b;
        if (j7 < 0) {
            return -1;
        }
        return j7 > 0 ? 1 : 0;
    }

    /* renamed from: k */
    public boolean m19022k(C4462t c4462t) {
        m19020h(c4462t);
        return this.f15894b - c4462t.f15894b < 0;
    }

    /* renamed from: l */
    public boolean m19023l() {
        if (!this.f15895c) {
            if (this.f15894b - this.f15893a.mo19026a() > 0) {
                return false;
            }
            this.f15895c = true;
        }
        return true;
    }

    /* renamed from: m */
    public C4462t m19024m(C4462t c4462t) {
        m19020h(c4462t);
        return m19022k(c4462t) ? this : c4462t;
    }

    /* renamed from: n */
    public long m19025n(TimeUnit timeUnit) {
        long mo19026a = this.f15893a.mo19026a();
        if (!this.f15895c && this.f15894b - mo19026a <= 0) {
            this.f15895c = true;
        }
        return timeUnit.convert(this.f15894b - mo19026a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long m19025n = m19025n(TimeUnit.NANOSECONDS);
        long abs = Math.abs(m19025n);
        long j7 = f15892n;
        long j8 = abs / j7;
        long abs2 = Math.abs(m19025n) % j7;
        StringBuilder sb = new StringBuilder();
        if (m19025n < 0) {
            sb.append('-');
        }
        sb.append(j8);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.f15893a != f15889d) {
            sb.append(" (ticker=" + this.f15893a + ")");
        }
        return sb.toString();
    }

    public C4462t(c cVar, long j7, long j8, boolean z6) {
        this.f15893a = cVar;
        long min = Math.min(f15890e, Math.max(f15891f, j8));
        this.f15894b = j7 + min;
        this.f15895c = z6 && min <= 0;
    }
}
