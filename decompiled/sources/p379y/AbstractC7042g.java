package p379y;

import java.lang.reflect.Array;

/* renamed from: y.g */
/* loaded from: classes.dex */
public abstract class AbstractC7042g {
    /* renamed from: a */
    public static int[] m28985a(int[] iArr, int i7, int i8) {
        if (i7 + 1 > iArr.length) {
            int[] iArr2 = new int[m28987c(i7)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            iArr = iArr2;
        }
        iArr[i7] = i8;
        return iArr;
    }

    /* renamed from: b */
    public static Object[] m28986b(Object[] objArr, int i7, Object obj) {
        if (i7 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m28987c(i7));
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            objArr = objArr2;
        }
        objArr[i7] = obj;
        return objArr;
    }

    /* renamed from: c */
    public static int m28987c(int i7) {
        if (i7 <= 4) {
            return 8;
        }
        return i7 * 2;
    }
}
