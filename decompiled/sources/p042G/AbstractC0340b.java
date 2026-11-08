package p042G;

import p256j$.util.Objects;

/* renamed from: G.b */
/* loaded from: classes.dex */
public abstract class AbstractC0340b {
    /* renamed from: a */
    public static boolean m1344a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* renamed from: b */
    public static int m1345b(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* renamed from: c */
    public static Object m1346c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: d */
    public static Object m1347d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
