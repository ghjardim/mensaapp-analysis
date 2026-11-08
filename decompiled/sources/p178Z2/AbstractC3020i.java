package p178Z2;

import p171Y2.AbstractC2932o;

/* renamed from: Z2.i */
/* loaded from: classes.dex */
public abstract class AbstractC3020i {
    /* renamed from: a */
    public static void m10942a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* renamed from: b */
    public static int m10943b(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    /* renamed from: c */
    public static void m10944c(boolean z6) {
        AbstractC2932o.m10579v(z6, "no calls to next() since the last call to remove()");
    }
}
