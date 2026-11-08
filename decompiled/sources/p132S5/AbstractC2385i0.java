package p132S5;

import p167X5.C2846G;

/* renamed from: S5.i0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2385i0 {

    /* renamed from: a */
    public static final C2846G f7134a = new C2846G("REMOVED_TASK");

    /* renamed from: b */
    public static final C2846G f7135b = new C2846G("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m8121c(long j7) {
        if (j7 <= 0) {
            return 0L;
        }
        if (j7 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j7;
    }
}
