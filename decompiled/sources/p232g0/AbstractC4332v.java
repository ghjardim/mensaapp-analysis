package p232g0;

import java.util.HashSet;

/* renamed from: g0.v */
/* loaded from: classes.dex */
public abstract class AbstractC4332v {

    /* renamed from: a */
    public static final HashSet f15330a = new HashSet();

    /* renamed from: b */
    public static String f15331b = "media3.common";

    /* renamed from: a */
    public static synchronized void m18323a(String str) {
        synchronized (AbstractC4332v.class) {
            if (f15330a.add(str)) {
                f15331b += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m18324b() {
        String str;
        synchronized (AbstractC4332v.class) {
            str = f15331b;
        }
        return str;
    }
}
