package p171Y2;

import java.util.Arrays;

/* renamed from: Y2.k */
/* loaded from: classes.dex */
public abstract class AbstractC2928k extends AbstractC2923f {
    /* renamed from: a */
    public static boolean m10550a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m10551b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
