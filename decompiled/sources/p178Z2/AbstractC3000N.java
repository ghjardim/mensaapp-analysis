package p178Z2;

import java.util.Arrays;
import java.util.Map;

/* renamed from: Z2.N */
/* loaded from: classes.dex */
public abstract class AbstractC3000N {
    /* renamed from: a */
    public static Object[] m10848a(Object[] objArr, int i7, int i8, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i7, i8, objArr2.getClass());
    }

    /* renamed from: b */
    public static Object[] m10849b(Object[] objArr, int i7) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i7);
    }

    /* renamed from: c */
    public static Map m10850c(int i7) {
        return C3022k.m10962w(i7);
    }

    /* renamed from: d */
    public static Map m10851d() {
        return C3022k.m10961r();
    }
}
