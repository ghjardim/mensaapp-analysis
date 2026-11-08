package p237g5;

import java.util.concurrent.TimeoutException;
import p171Y2.AbstractC2932o;
import p237g5.C4448l0;

/* renamed from: g5.s */
/* loaded from: classes2.dex */
public abstract class AbstractC4461s {
    /* renamed from: a */
    public static C4448l0 m19015a(C4459r c4459r) {
        AbstractC2932o.m10573p(c4459r, "context must not be null");
        if (!c4459r.m19012h()) {
            return null;
        }
        Throwable m19009c = c4459r.m19009c();
        if (m19009c == null) {
            return C4448l0.f15796f.m18963q("io.grpc.Context was cancelled without error");
        }
        if (m19009c instanceof TimeoutException) {
            return C4448l0.f15799i.m18963q(m19009c.getMessage()).m18962p(m19009c);
        }
        C4448l0 m18954k = C4448l0.m18954k(m19009c);
        return (C4448l0.b.UNKNOWN.equals(m18954k.m18959m()) && m18954k.m18958l() == m19009c) ? C4448l0.f15796f.m18963q("Context cancelled").m18962p(m19009c) : m18954k.m18962p(m19009c);
    }
}
