package p167X5;

import p069J5.InterfaceC0804p;

/* renamed from: X5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2859d {

    /* renamed from: a */
    public static final C2846G f8828a = new C2846G("CLOSED");

    /* renamed from: b */
    public static final AbstractC2860e m10307b(AbstractC2860e abstractC2860e) {
        while (true) {
            Object m10316g = abstractC2860e.m10316g();
            if (m10316g == f8828a) {
                return abstractC2860e;
            }
            AbstractC2860e abstractC2860e2 = (AbstractC2860e) m10316g;
            if (abstractC2860e2 != null) {
                abstractC2860e = abstractC2860e2;
            } else if (abstractC2860e.m10319m()) {
                return abstractC2860e;
            }
        }
    }

    /* renamed from: c */
    public static final Object m10308c(AbstractC2843D abstractC2843D, long j7, InterfaceC0804p interfaceC0804p) {
        while (true) {
            if (abstractC2843D.f8806c >= j7 && !abstractC2843D.mo10254k()) {
                return AbstractC2844E.m10258a(abstractC2843D);
            }
            Object m10316g = abstractC2843D.m10316g();
            if (m10316g == f8828a) {
                return AbstractC2844E.m10258a(f8828a);
            }
            AbstractC2843D abstractC2843D2 = (AbstractC2843D) ((AbstractC2860e) m10316g);
            if (abstractC2843D2 == null) {
                abstractC2843D2 = (AbstractC2843D) interfaceC0804p.invoke(Long.valueOf(abstractC2843D.f8806c + 1), abstractC2843D);
                if (abstractC2843D.m10321o(abstractC2843D2)) {
                    if (abstractC2843D.mo10254k()) {
                        abstractC2843D.m10320n();
                    }
                }
            }
            abstractC2843D = abstractC2843D2;
        }
    }
}
