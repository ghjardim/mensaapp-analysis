package p171Y2;

import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;

/* renamed from: Y2.t */
/* loaded from: classes.dex */
public final class C2937t {

    /* renamed from: a */
    public final AbstractC2943z f9037a = AbstractC2943z.m10621b();

    /* renamed from: b */
    public boolean f9038b;

    /* renamed from: c */
    public long f9039c;

    /* renamed from: d */
    public long f9040d;

    /* renamed from: Y2.t$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9041a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f9041a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9041a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9041a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9041a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9041a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9041a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9041a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    public static String m10600a(TimeUnit timeUnit) {
        switch (a.f9041a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static TimeUnit m10601b(long j7) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j7, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j7, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j7, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j7, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j7, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j7, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    /* renamed from: c */
    public static C2937t m10602c() {
        return new C2937t();
    }

    /* renamed from: d */
    public long m10603d(TimeUnit timeUnit) {
        return timeUnit.convert(m10604e(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: e */
    public final long m10604e() {
        return this.f9038b ? (this.f9037a.mo10622a() - this.f9040d) + this.f9039c : this.f9039c;
    }

    /* renamed from: f */
    public C2937t m10605f() {
        this.f9039c = 0L;
        this.f9038b = false;
        return this;
    }

    /* renamed from: g */
    public C2937t m10606g() {
        AbstractC2932o.m10579v(!this.f9038b, "This stopwatch is already running.");
        this.f9038b = true;
        this.f9040d = this.f9037a.mo10622a();
        return this;
    }

    public String toString() {
        long m10604e = m10604e();
        TimeUnit m10601b = m10601b(m10604e);
        return AbstractC2931n.m10554a(m10604e / TimeUnit.NANOSECONDS.convert(1L, m10601b)) + StringUtils.SPACE + m10600a(m10601b);
    }
}
