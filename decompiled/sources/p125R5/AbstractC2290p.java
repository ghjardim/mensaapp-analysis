package p125R5;

import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: R5.p */
/* loaded from: classes2.dex */
public abstract class AbstractC2290p extends AbstractC2289o {
    /* renamed from: j */
    public static Long m7734j(String str) {
        AbstractC5469l.m23028e(str, "<this>");
        return m7735k(str, 10);
    }

    /* renamed from: k */
    public static final Long m7735k(String str, int i7) {
        boolean z6;
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC2275a.m7711a(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (AbstractC5469l.m23029f(charAt, 48) < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z6 = false;
                i8 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j7 = Long.MIN_VALUE;
                i8 = 1;
            }
        } else {
            z6 = false;
        }
        long j8 = -256204778801521550L;
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i8 < length) {
            int m7712b = AbstractC2275a.m7712b(str.charAt(i8), i7);
            if (m7712b < 0) {
                return null;
            }
            if (j9 < j10) {
                if (j10 == j8) {
                    j10 = j7 / i7;
                    if (j9 < j10) {
                    }
                }
                return null;
            }
            long j11 = j9 * i7;
            long j12 = m7712b;
            if (j11 < j7 + j12) {
                return null;
            }
            j9 = j11 - j12;
            i8++;
            j8 = -256204778801521550L;
        }
        return z6 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }
}
