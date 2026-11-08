package p167X5;

import com.google.android.gms.common.api.C3643a;
import p125R5.AbstractC2290p;

/* renamed from: X5.J */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2849J {
    /* renamed from: a */
    public static final int m10272a(String str, int i7, int i8, int i9) {
        return (int) AbstractC2847H.m10264c(str, i7, i8, i9);
    }

    /* renamed from: b */
    public static final long m10273b(String str, long j7, long j8, long j9) {
        String m10265d = AbstractC2847H.m10265d(str);
        if (m10265d == null) {
            return j7;
        }
        Long m7734j = AbstractC2290p.m7734j(m10265d);
        if (m7734j == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m10265d + '\'').toString());
        }
        long longValue = m7734j.longValue();
        if (j8 <= longValue && longValue <= j9) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final String m10274c(String str, String str2) {
        String m10265d = AbstractC2847H.m10265d(str);
        return m10265d == null ? str2 : m10265d;
    }

    /* renamed from: d */
    public static final boolean m10275d(String str, boolean z6) {
        String m10265d = AbstractC2847H.m10265d(str);
        return m10265d != null ? Boolean.parseBoolean(m10265d) : z6;
    }

    /* renamed from: e */
    public static /* synthetic */ int m10276e(String str, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i8 = 1;
        }
        if ((i10 & 8) != 0) {
            i9 = C3643a.e.API_PRIORITY_OTHER;
        }
        return AbstractC2847H.m10263b(str, i7, i8, i9);
    }

    /* renamed from: f */
    public static /* synthetic */ long m10277f(String str, long j7, long j8, long j9, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j8 = 1;
        }
        long j10 = j8;
        if ((i7 & 8) != 0) {
            j9 = Long.MAX_VALUE;
        }
        return AbstractC2847H.m10264c(str, j7, j10, j9);
    }
}
