package p253i5;

import java.util.Map;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4430c0;
import p237g5.C4448l0;

/* renamed from: i5.I0 */
/* loaded from: classes2.dex */
public final class C4562I0 extends AbstractC4430c0.f {

    /* renamed from: a */
    public final boolean f16530a;

    /* renamed from: b */
    public final int f16531b;

    /* renamed from: c */
    public final int f16532c;

    /* renamed from: d */
    public final C4610i f16533d;

    public C4562I0(boolean z6, int i7, int i8, C4610i c4610i) {
        this.f16530a = z6;
        this.f16531b = i7;
        this.f16532c = i8;
        this.f16533d = (C4610i) AbstractC2932o.m10573p(c4610i, "autoLoadBalancerFactory");
    }

    @Override // p237g5.AbstractC4430c0.f
    /* renamed from: a */
    public AbstractC4430c0.b mo18908a(Map map) {
        Object m18893c;
        try {
            AbstractC4430c0.b m19983f = this.f16533d.m19983f(map);
            if (m19983f == null) {
                m18893c = null;
            } else {
                if (m19983f.m18894d() != null) {
                    return AbstractC4430c0.b.m18892b(m19983f.m18894d());
                }
                m18893c = m19983f.m18893c();
            }
            return AbstractC4430c0.b.m18891a(C4615k0.m20000b(map, this.f16530a, this.f16531b, this.f16532c, m18893c));
        } catch (RuntimeException e7) {
            return AbstractC4430c0.b.m18892b(C4448l0.f15797g.m18963q("failed to parse service config").m18962p(e7));
        }
    }
}
