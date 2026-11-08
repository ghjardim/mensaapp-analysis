package p259j0;

import android.text.TextUtils;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5332a {
    /* renamed from: a */
    public static void m21796a(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m21797b(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m21798c(int i7, int i8, int i9) {
        if (i7 < i8 || i7 >= i9) {
            throw new IndexOutOfBoundsException();
        }
        return i7;
    }

    /* renamed from: d */
    public static String m21799d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    /* renamed from: e */
    public static Object m21800e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    public static Object m21801f(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: g */
    public static void m21802g(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public static void m21803h(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: i */
    public static Object m21804i(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    /* renamed from: j */
    public static Object m21805j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }
}
