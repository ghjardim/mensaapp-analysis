package p034E5;

import kotlin.jvm.internal.AbstractC5469l;
import p027D5.AbstractC0193a;

/* renamed from: E5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0301a extends AbstractC0193a {

    /* renamed from: E5.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f1144a = new a();

        /* renamed from: b */
        public static final Integer f1145b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f1145b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f1145b = num2;
        }
    }

    /* renamed from: c */
    private final boolean m1210c(int i7) {
        Integer num = a.f1145b;
        return num == null || num.intValue() >= i7;
    }

    @Override // p027D5.AbstractC0193a
    /* renamed from: a */
    public void mo791a(Throwable cause, Throwable exception) {
        AbstractC5469l.m23028e(cause, "cause");
        AbstractC5469l.m23028e(exception, "exception");
        if (m1210c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo791a(cause, exception);
        }
    }
}
