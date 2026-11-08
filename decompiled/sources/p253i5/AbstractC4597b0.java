package p253i5;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p256j$.util.DesugarCollections;
import p288m4.C5594a;
import p288m4.EnumC5595b;

/* renamed from: i5.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4597b0 {

    /* renamed from: a */
    public static final Logger f16762a = Logger.getLogger(AbstractC4597b0.class.getName());

    /* renamed from: i5.b0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16763a;

        static {
            int[] iArr = new int[EnumC5595b.values().length];
            f16763a = iArr;
            try {
                iArr[EnumC5595b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16763a[EnumC5595b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16763a[EnumC5595b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16763a[EnumC5595b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16763a[EnumC5595b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16763a[EnumC5595b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a */
    public static Object m19795a(String str) {
        C5594a c5594a = new C5594a(new StringReader(str));
        try {
            return m19799e(c5594a);
        } finally {
            try {
                c5594a.close();
            } catch (IOException e7) {
                f16762a.log(Level.WARNING, "Failed to close", (Throwable) e7);
            }
        }
    }

    /* renamed from: b */
    public static List m19796b(C5594a c5594a) {
        c5594a.m23420a();
        ArrayList arrayList = new ArrayList();
        while (c5594a.m23436w()) {
            arrayList.add(m19799e(c5594a));
        }
        AbstractC2932o.m10579v(c5594a.m23419T() == EnumC5595b.END_ARRAY, "Bad token: " + c5594a.m23434r());
        c5594a.m23428j();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    public static Void m19797c(C5594a c5594a) {
        c5594a.m23415M();
        return null;
    }

    /* renamed from: d */
    public static Map m19798d(C5594a c5594a) {
        c5594a.m23421c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (c5594a.m23436w()) {
            linkedHashMap.put(c5594a.m23413G(), m19799e(c5594a));
        }
        AbstractC2932o.m10579v(c5594a.m23419T() == EnumC5595b.END_OBJECT, "Bad token: " + c5594a.m23434r());
        c5594a.m23431m();
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: e */
    public static Object m19799e(C5594a c5594a) {
        AbstractC2932o.m10579v(c5594a.m23436w(), "unexpected end of JSON");
        switch (a.f16763a[c5594a.m23419T().ordinal()]) {
            case 1:
                return m19796b(c5594a);
            case 2:
                return m19798d(c5594a);
            case 3:
                return c5594a.m23417R();
            case 4:
                return Double.valueOf(c5594a.m23412F());
            case 5:
                return Boolean.valueOf(c5594a.m23411D());
            case 6:
                return m19797c(c5594a);
            default:
                throw new IllegalStateException("Bad token: " + c5594a.m23434r());
        }
    }
}
