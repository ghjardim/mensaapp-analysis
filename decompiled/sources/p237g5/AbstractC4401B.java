package p237g5;

import java.util.List;

/* renamed from: g5.B */
/* loaded from: classes2.dex */
public abstract class AbstractC4401B {

    /* renamed from: a */
    public static List f15587a;

    /* renamed from: b */
    public static boolean f15588b;

    /* renamed from: a */
    public static synchronized List m18628a() {
        List list;
        synchronized (AbstractC4401B.class) {
            f15588b = true;
            list = f15587a;
        }
        return list;
    }
}
