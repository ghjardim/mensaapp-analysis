package p074K3;

import java.math.RoundingMode;

/* renamed from: K3.f */
/* loaded from: classes.dex */
public abstract class AbstractC0831f {

    /* renamed from: K3.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2866a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f2866a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2866a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2866a[RoundingMode.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2866a[RoundingMode.CEILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2866a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2866a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2866a[RoundingMode.HALF_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2866a[RoundingMode.HALF_UP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static int m3469a(int i7, int i8, RoundingMode roundingMode) {
        if (i8 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i7 / i8;
        int i10 = i7 - (i8 * i9);
        if (i10 == 0) {
            return i9;
        }
        int i11 = ((i7 ^ i8) >> 31) | 1;
        switch (a.f2866a[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return i9;
            case 3:
                break;
            case 4:
                if (i11 <= 0) {
                    return i9;
                }
                break;
            case 5:
                if (i11 >= 0) {
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
}
