package p171Y2;

import java.util.Locale;
import org.apache.tika.utils.StringUtils;

/* renamed from: Y2.n */
/* loaded from: classes.dex */
public abstract class AbstractC2931n {

    /* renamed from: a */
    public static final InterfaceC2930m f9023a = m10555b();

    /* renamed from: Y2.n$b */
    public static final class b implements InterfaceC2930m {
        public b() {
        }
    }

    /* renamed from: a */
    public static String m10554a(double d7) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d7));
    }

    /* renamed from: b */
    public static InterfaceC2930m m10555b() {
        return new b();
    }

    /* renamed from: c */
    public static String m10556c(String str) {
        return str == null ? StringUtils.EMPTY : str;
    }

    /* renamed from: d */
    public static boolean m10557d(String str) {
        return str == null || str.isEmpty();
    }
}
