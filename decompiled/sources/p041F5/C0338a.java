package p041F5;

import p034E5.AbstractC0301a;
import p090M5.AbstractC1238c;
import p097N5.C1289a;

/* renamed from: F5.a */
/* loaded from: classes2.dex */
public class C0338a extends AbstractC0301a {

    /* renamed from: F5.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f1285a = new a();

        /* renamed from: b */
        public static final Integer f1286b;

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
                f1286b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f1286b = num2;
        }
    }

    @Override // p027D5.AbstractC0193a
    /* renamed from: b */
    public AbstractC1238c mo792b() {
        return m1343c(34) ? new C1289a() : super.mo792b();
    }

    /* renamed from: c */
    public final boolean m1343c(int i7) {
        Integer num = a.f1286b;
        return num == null || num.intValue() >= i7;
    }
}
