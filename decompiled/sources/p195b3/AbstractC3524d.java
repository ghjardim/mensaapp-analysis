package p195b3;

import com.google.android.gms.common.api.C3643a;
import java.math.RoundingMode;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p171Y2.AbstractC2932o;
import p203c3.AbstractC3577g;

/* renamed from: b3.d */
/* loaded from: classes.dex */
public abstract class AbstractC3524d {

    /* renamed from: a */
    public static final byte[] f11859a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    public static final int[] f11860b = {1, 10, 100, PipesIterator.DEFAULT_QUEUE_SIZE, PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c */
    public static final int[] f11861c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, C3643a.e.API_PRIORITY_OTHER};

    /* renamed from: d */
    public static final int[] f11862d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    public static int[] f11863e = {C3643a.e.API_PRIORITY_OTHER, C3643a.e.API_PRIORITY_OTHER, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: b3.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11864a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f11864a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11864a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11864a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11864a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11864a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11864a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11864a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11864a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static int m14158a(int i7, int i8) {
        long j7 = i7 + i8;
        int i9 = (int) j7;
        AbstractC3526f.m14170b(j7 == ((long) i9), "checkedAdd", i7, i8);
        return i9;
    }

    /* renamed from: b */
    public static int m14159b(int i7, int i8, RoundingMode roundingMode) {
        AbstractC2932o.m10572o(roundingMode);
        if (i8 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i7 / i8;
        int i10 = i7 - (i8 * i9);
        if (i10 == 0) {
            return i9;
        }
        int i11 = ((i7 ^ i8) >> 31) | 1;
        switch (a.f11864a[roundingMode.ordinal()]) {
            case 1:
                AbstractC3526f.m14174f(i10 == 0);
                return i9;
            case 2:
                return i9;
            case 3:
                if (i11 >= 0) {
                    return i9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i11 <= 0) {
                    return i9;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i10);
                int abs2 = abs - (Math.abs(i8) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i9 & 1) != 0))) {
                            return i9;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i9;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i9 + i11;
    }

    /* renamed from: c */
    public static boolean m14160c(int i7) {
        return (i7 > 0) & ((i7 & (i7 + (-1))) == 0);
    }

    /* renamed from: d */
    public static int m14161d(int i7, int i8) {
        return (~(~(i7 - i8))) >>> 31;
    }

    /* renamed from: e */
    public static int m14162e(int i7, RoundingMode roundingMode) {
        AbstractC3526f.m14173e("x", i7);
        switch (a.f11864a[roundingMode.ordinal()]) {
            case 1:
                AbstractC3526f.m14174f(m14160c(i7));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - numberOfLeadingZeros) + m14161d((-1257966797) >>> numberOfLeadingZeros, i7);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }

    /* renamed from: f */
    public static int m14163f(int i7, int i8) {
        if (i8 > 0) {
            int i9 = i7 % i8;
            return i9 >= 0 ? i9 : i9 + i8;
        }
        throw new ArithmeticException("Modulus " + i8 + " must be > 0");
    }

    /* renamed from: g */
    public static int m14164g(int i7, int i8) {
        return AbstractC3577g.m14430m(i7 * i8);
    }
}
