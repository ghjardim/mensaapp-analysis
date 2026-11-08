package p334s;

import java.lang.reflect.Array;

/* renamed from: s.c */
/* loaded from: classes.dex */
public abstract class AbstractC6310c {
    /* renamed from: a */
    public static Object[] m26427a(Object[] objArr, int i7) {
        if (objArr.length < i7) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
