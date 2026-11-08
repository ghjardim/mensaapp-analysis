package p151V3;

import p151V3.C2623a;
import p151V3.C2625c;

/* renamed from: V3.d */
/* loaded from: classes.dex */
public abstract class AbstractC2626d {

    /* renamed from: a */
    public static AbstractC2626d f7776a = m9036a().mo9014a();

    /* renamed from: V3.d$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC2626d mo9014a();

        /* renamed from: b */
        public abstract a mo9015b(String str);

        /* renamed from: c */
        public abstract a mo9016c(long j7);

        /* renamed from: d */
        public abstract a mo9017d(String str);

        /* renamed from: e */
        public abstract a mo9018e(String str);

        /* renamed from: f */
        public abstract a mo9019f(String str);

        /* renamed from: g */
        public abstract a mo9020g(C2625c.a aVar);

        /* renamed from: h */
        public abstract a mo9021h(long j7);
    }

    /* renamed from: a */
    public static a m9036a() {
        return new C2623a.b().mo9021h(0L).mo9020g(C2625c.a.ATTEMPT_MIGRATION).mo9016c(0L);
    }

    /* renamed from: b */
    public abstract String mo9006b();

    /* renamed from: c */
    public abstract long mo9007c();

    /* renamed from: d */
    public abstract String mo9008d();

    /* renamed from: e */
    public abstract String mo9009e();

    /* renamed from: f */
    public abstract String mo9010f();

    /* renamed from: g */
    public abstract C2625c.a mo9011g();

    /* renamed from: h */
    public abstract long mo9012h();

    /* renamed from: i */
    public boolean m9037i() {
        return mo9011g() == C2625c.a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m9038j() {
        return mo9011g() == C2625c.a.NOT_GENERATED || mo9011g() == C2625c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m9039k() {
        return mo9011g() == C2625c.a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m9040l() {
        return mo9011g() == C2625c.a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m9041m() {
        return mo9011g() == C2625c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract a mo9013n();

    /* renamed from: o */
    public AbstractC2626d m9042o(String str, long j7, long j8) {
        return mo9013n().mo9015b(str).mo9016c(j7).mo9021h(j8).mo9014a();
    }

    /* renamed from: p */
    public AbstractC2626d m9043p() {
        return mo9013n().mo9015b(null).mo9014a();
    }

    /* renamed from: q */
    public AbstractC2626d m9044q(String str) {
        return mo9013n().mo9018e(str).mo9020g(C2625c.a.REGISTER_ERROR).mo9014a();
    }

    /* renamed from: r */
    public AbstractC2626d m9045r() {
        return mo9013n().mo9020g(C2625c.a.NOT_GENERATED).mo9014a();
    }

    /* renamed from: s */
    public AbstractC2626d m9046s(String str, String str2, long j7, String str3, long j8) {
        return mo9013n().mo9017d(str).mo9020g(C2625c.a.REGISTERED).mo9015b(str3).mo9019f(str2).mo9016c(j8).mo9021h(j7).mo9014a();
    }

    /* renamed from: t */
    public AbstractC2626d m9047t(String str) {
        return mo9013n().mo9017d(str).mo9020g(C2625c.a.UNREGISTERED).mo9014a();
    }
}
