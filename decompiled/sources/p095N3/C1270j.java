package p095N3;

import p088M3.AbstractC1184z;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;
import p272k4.C5413D;

/* renamed from: N3.j */
/* loaded from: classes.dex */
public class C1270j implements InterfaceC1276p {

    /* renamed from: a */
    public C5413D f4006a;

    public C1270j(C5413D c5413d) {
        AbstractC2133b.m7217d(AbstractC1184z.m4582B(c5413d), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f4006a = c5413d;
    }

    @Override // p095N3.InterfaceC1276p
    /* renamed from: a */
    public C5413D mo4817a(C5413D c5413d) {
        return AbstractC1184z.m4582B(c5413d) ? c5413d : (C5413D) C5413D.m22443x0().m22469D(0L).m17059n();
    }

    @Override // p095N3.InterfaceC1276p
    /* renamed from: c */
    public C5413D mo4819c(C5413D c5413d, C4188r c4188r) {
        C5413D mo4817a = mo4817a(c5413d);
        if (AbstractC1184z.m4613w(mo4817a) && AbstractC1184z.m4613w(this.f4006a)) {
            return (C5413D) C5413D.m22443x0().m22469D(m4862g(mo4817a.m22458r0(), m4861f())).m17059n();
        }
        if (AbstractC1184z.m4613w(mo4817a)) {
            return (C5413D) C5413D.m22443x0().m22467B(mo4817a.m22458r0() + m4860e()).m17059n();
        }
        AbstractC2133b.m7217d(AbstractC1184z.m4612v(mo4817a), "Expected NumberValue to be of type DoubleValue, but was ", c5413d.getClass().getCanonicalName());
        return (C5413D) C5413D.m22443x0().m22467B(mo4817a.m22456p0() + m4860e()).m17059n();
    }

    /* renamed from: d */
    public C5413D m4859d() {
        return this.f4006a;
    }

    /* renamed from: e */
    public final double m4860e() {
        if (AbstractC1184z.m4612v(this.f4006a)) {
            return this.f4006a.m22456p0();
        }
        if (AbstractC1184z.m4613w(this.f4006a)) {
            return this.f4006a.m22458r0();
        }
        throw AbstractC2133b.m7214a("Expected 'operand' to be of Number type, but was " + this.f4006a.getClass().getCanonicalName(), new Object[0]);
    }

    /* renamed from: f */
    public final long m4861f() {
        if (AbstractC1184z.m4612v(this.f4006a)) {
            return (long) this.f4006a.m22456p0();
        }
        if (AbstractC1184z.m4613w(this.f4006a)) {
            return this.f4006a.m22458r0();
        }
        throw AbstractC2133b.m7214a("Expected 'operand' to be of Number type, but was " + this.f4006a.getClass().getCanonicalName(), new Object[0]);
    }

    /* renamed from: g */
    public final long m4862g(long j7, long j8) {
        long j9 = j7 + j8;
        return ((j7 ^ j9) & (j8 ^ j9)) >= 0 ? j9 : j9 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // p095N3.InterfaceC1276p
    /* renamed from: b */
    public C5413D mo4818b(C5413D c5413d, C5413D c5413d2) {
        return c5413d2;
    }
}
