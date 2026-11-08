package p050H0;

import java.util.regex.Pattern;
import p043G0.InterfaceC0375y;
import p232g0.AbstractC4336z;
import p259j0.AbstractC5332a;
import p276l0.C5497k;

/* renamed from: H0.g */
/* loaded from: classes.dex */
public abstract class AbstractC0538g {

    /* renamed from: H0.g$a */
    public static final class a {

        /* renamed from: a */
        public static final Pattern f1738a = Pattern.compile(".*-.*");

        /* renamed from: b */
        public static String m2061b(InterfaceC0375y interfaceC0375y) {
            AbstractC5332a.m21796a(interfaceC0375y != null);
            int m18418k = AbstractC4336z.m18418k(interfaceC0375y.mo403q().f15138n);
            if (m18418k == -1) {
                m18418k = AbstractC4336z.m18418k(interfaceC0375y.mo403q().f15137m);
            }
            if (m18418k == 1) {
                return "a";
            }
            if (m18418k == 2) {
                return "v";
            }
            return null;
        }

        /* renamed from: a */
        public abstract AbstractC0538g m2062a();

        /* renamed from: c */
        public abstract a m2063c(long j7);

        /* renamed from: d */
        public abstract a m2064d(String str);

        /* renamed from: e */
        public abstract a m2065e(String str);

        /* renamed from: f */
        public abstract a m2066f(String str);
    }

    /* renamed from: a */
    public abstract C5497k m2060a(C5497k c5497k);
}
