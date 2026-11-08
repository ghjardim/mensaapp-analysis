package p178Z2;

/* renamed from: Z2.L */
/* loaded from: classes.dex */
public abstract class AbstractC2998L {
    /* renamed from: a */
    public static Object m10838a(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i7);
    }

    /* renamed from: b */
    public static Object[] m10839b(Object... objArr) {
        m10840c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    public static Object[] m10840c(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            m10838a(objArr[i8], i8);
        }
        return objArr;
    }

    /* renamed from: d */
    public static Object[] m10841d(Object[] objArr, int i7) {
        return AbstractC3000N.m10849b(objArr, i7);
    }
}
