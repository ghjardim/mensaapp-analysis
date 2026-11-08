package p342t;

import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: t.a */
/* loaded from: classes.dex */
public abstract class AbstractC6404a {

    /* renamed from: a */
    public static final int[] f23126a = new int[0];

    /* renamed from: b */
    public static final long[] f23127b = new long[0];

    /* renamed from: c */
    public static final Object[] f23128c = new Object[0];

    /* renamed from: a */
    public static final int m26746a(int[] array, int i7, int i8) {
        AbstractC5469l.m23028e(array, "array");
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = array[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    /* renamed from: b */
    public static final int m26747b(long[] array, int i7, long j7) {
        AbstractC5469l.m23028e(array, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j8 = array[i10];
            if (j8 < j7) {
                i9 = i10 + 1;
            } else {
                if (j8 <= j7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    /* renamed from: c */
    public static final boolean m26748c(Object obj, Object obj2) {
        return AbstractC5469l.m23024a(obj, obj2);
    }

    /* renamed from: d */
    public static final int m26749d(int i7) {
        for (int i8 = 4; i8 < 32; i8++) {
            int i9 = (1 << i8) - 12;
            if (i7 <= i9) {
                return i9;
            }
        }
        return i7;
    }

    /* renamed from: e */
    public static final int m26750e(int i7) {
        return m26749d(i7 * 4) / 4;
    }

    /* renamed from: f */
    public static final int m26751f(int i7) {
        return m26749d(i7 * 8) / 8;
    }
}
