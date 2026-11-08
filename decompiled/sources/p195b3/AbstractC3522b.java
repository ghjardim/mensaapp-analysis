package p195b3;

import java.math.RoundingMode;

/* renamed from: b3.b */
/* loaded from: classes.dex */
public abstract class AbstractC3522b {

    /* renamed from: a */
    public static final double f11856a = Math.log(2.0d);

    /* renamed from: b */
    public static final double[] f11857b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: b3.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11858a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f11858a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11858a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11858a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11858a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11858a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11858a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11858a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11858a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m14153a(double d7) {
        return AbstractC3523c.m14157b(d7) && (d7 == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC3523c.m14156a(d7)) <= Math.getExponent(d7));
    }

    /* renamed from: b */
    public static double m14154b(double d7, RoundingMode roundingMode) {
        if (!AbstractC3523c.m14157b(d7)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f11858a[roundingMode.ordinal()]) {
            case 1:
                AbstractC3526f.m14174f(m14153a(d7));
                return d7;
            case 2:
                return (d7 >= 0.0d || m14153a(d7)) ? d7 : ((long) d7) - 1;
            case 3:
                return (d7 <= 0.0d || m14153a(d7)) ? d7 : ((long) d7) + 1;
            case 4:
                return d7;
            case 5:
                if (m14153a(d7)) {
                    return d7;
                }
                return ((long) d7) + (d7 > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d7);
            case 7:
                double rint = Math.rint(d7);
                return Math.abs(d7 - rint) == 0.5d ? d7 + Math.copySign(0.5d, d7) : rint;
            case 8:
                double rint2 = Math.rint(d7);
                return Math.abs(d7 - rint2) == 0.5d ? d7 : rint2;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: c */
    public static long m14155c(double d7, RoundingMode roundingMode) {
        double m14154b = m14154b(d7, roundingMode);
        AbstractC3526f.m14169a(((-9.223372036854776E18d) - m14154b < 1.0d) & (m14154b < 9.223372036854776E18d), d7, roundingMode);
        return (long) m14154b;
    }
}
