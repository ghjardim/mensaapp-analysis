package p074K3;

import com.google.android.gms.common.api.C3643a;
import com.google.protobuf.C4078t0;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p088M3.AbstractC1184z;
import p088M3.C1179u;
import p272k4.C5413D;
import p272k4.C5419b;
import p272k4.C5438u;
import p304o4.C5940a;

/* renamed from: K3.c */
/* loaded from: classes.dex */
public class C0828c {

    /* renamed from: a */
    public static final C0828c f2859a = new C0828c();

    /* renamed from: K3.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2860a;

        static {
            int[] iArr = new int[C5413D.c.values().length];
            f2860a = iArr;
            try {
                iArr[C5413D.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2860a[C5413D.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2860a[C5413D.c.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2860a[C5413D.c.INTEGER_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2860a[C5413D.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2860a[C5413D.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2860a[C5413D.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2860a[C5413D.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2860a[C5413D.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2860a[C5413D.c.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2860a[C5413D.c.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: a */
    public final void m3453a(C5419b c5419b, AbstractC0827b abstractC0827b) {
        m3462j(abstractC0827b, 50);
        Iterator it = c5419b.mo22555g().iterator();
        while (it.hasNext()) {
            m3458f((C5413D) it.next(), abstractC0827b);
        }
    }

    /* renamed from: b */
    public final void m3454b(String str, AbstractC0827b abstractC0827b) {
        m3462j(abstractC0827b, 37);
        C1179u m4565v = C1179u.m4565v(str);
        int m4471q = m4565v.m4471q();
        for (int i7 = 5; i7 < m4471q; i7++) {
            String m4468m = m4565v.m4468m(i7);
            m3462j(abstractC0827b, 60);
            m3461i(m4468m, abstractC0827b);
        }
    }

    /* renamed from: c */
    public final void m3455c(C5438u c5438u, AbstractC0827b abstractC0827b) {
        m3462j(abstractC0827b, 55);
        for (Map.Entry entry : c5438u.m22737d0().entrySet()) {
            String str = (String) entry.getKey();
            C5413D c5413d = (C5413D) entry.getValue();
            m3456d(str, abstractC0827b);
            m3458f(c5413d, abstractC0827b);
        }
    }

    /* renamed from: d */
    public final void m3456d(String str, AbstractC0827b abstractC0827b) {
        m3462j(abstractC0827b, 25);
        m3461i(str, abstractC0827b);
    }

    /* renamed from: e */
    public void m3457e(C5413D c5413d, AbstractC0827b abstractC0827b) {
        m3458f(c5413d, abstractC0827b);
        abstractC0827b.mo3450c();
    }

    /* renamed from: f */
    public final void m3458f(C5413D c5413d, AbstractC0827b abstractC0827b) {
        switch (a.f2860a[c5413d.m22463w0().ordinal()]) {
            case 1:
                m3462j(abstractC0827b, 5);
                return;
            case 2:
                m3462j(abstractC0827b, 10);
                abstractC0827b.mo3451d(c5413d.m22454m0() ? 1L : 0L);
                return;
            case 3:
                double m22456p0 = c5413d.m22456p0();
                if (Double.isNaN(m22456p0)) {
                    m3462j(abstractC0827b, 13);
                    return;
                }
                m3462j(abstractC0827b, 15);
                if (m22456p0 == -0.0d) {
                    abstractC0827b.mo3449b(0.0d);
                    return;
                } else {
                    abstractC0827b.mo3449b(m22456p0);
                    return;
                }
            case 4:
                m3462j(abstractC0827b, 15);
                abstractC0827b.mo3449b(c5413d.m22458r0());
                return;
            case 5:
                C4078t0 m22462v0 = c5413d.m22462v0();
                m3462j(abstractC0827b, 20);
                abstractC0827b.mo3451d(m22462v0.m16932e0());
                abstractC0827b.mo3451d(m22462v0.m16931d0());
                return;
            case 6:
                m3456d(c5413d.m22461u0(), abstractC0827b);
                m3460h(abstractC0827b);
                return;
            case 7:
                m3462j(abstractC0827b, 30);
                abstractC0827b.mo3448a(c5413d.m22455n0());
                m3460h(abstractC0827b);
                return;
            case 8:
                m3454b(c5413d.m22460t0(), abstractC0827b);
                return;
            case 9:
                C5940a m22457q0 = c5413d.m22457q0();
                m3462j(abstractC0827b, 45);
                abstractC0827b.mo3449b(m22457q0.m24962d0());
                abstractC0827b.mo3449b(m22457q0.m24963e0());
                return;
            case 10:
                if (AbstractC1184z.m4615y(c5413d)) {
                    m3462j(abstractC0827b, C3643a.e.API_PRIORITY_OTHER);
                    return;
                } else if (AbstractC1184z.m4584D(c5413d)) {
                    m3459g(c5413d.m22459s0(), abstractC0827b);
                    return;
                } else {
                    m3455c(c5413d.m22459s0(), abstractC0827b);
                    m3460h(abstractC0827b);
                    return;
                }
            case 11:
                m3453a(c5413d.m22453l0(), abstractC0827b);
                m3460h(abstractC0827b);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + c5413d.m22463w0());
        }
    }

    /* renamed from: g */
    public final void m3459g(C5438u c5438u, AbstractC0827b abstractC0827b) {
        Map m22737d0 = c5438u.m22737d0();
        m3462j(abstractC0827b, 53);
        int m22557i0 = ((C5413D) m22737d0.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m22453l0().m22557i0();
        m3462j(abstractC0827b, 15);
        abstractC0827b.mo3451d(m22557i0);
        m3456d(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, abstractC0827b);
        m3458f((C5413D) m22737d0.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR), abstractC0827b);
    }

    /* renamed from: h */
    public final void m3460h(AbstractC0827b abstractC0827b) {
        abstractC0827b.mo3451d(2L);
    }

    /* renamed from: i */
    public final void m3461i(String str, AbstractC0827b abstractC0827b) {
        abstractC0827b.mo3452e(str);
    }

    /* renamed from: j */
    public final void m3462j(AbstractC0827b abstractC0827b, int i7) {
        abstractC0827b.mo3451d(i7);
    }
}
