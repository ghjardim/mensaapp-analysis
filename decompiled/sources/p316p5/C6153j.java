package p316p5;

import java.util.List;
import java.util.Map;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4418T;
import p237g5.AbstractC4430c0;
import p237g5.C4419U;
import p237g5.C4448l0;
import p253i5.AbstractC4568L0;
import p253i5.AbstractC4599c0;
import p253i5.InterfaceC4581S0;
import p316p5.C6151h;

/* renamed from: p5.j */
/* loaded from: classes2.dex */
public final class C6153j extends AbstractC4418T {
    @Override // p237g5.AbstractC4417S.c
    /* renamed from: a */
    public AbstractC4417S mo18697a(AbstractC4417S.e eVar) {
        return new C6151h(eVar, InterfaceC4581S0.f16612a);
    }

    @Override // p237g5.AbstractC4418T
    /* renamed from: b */
    public String mo18736b() {
        return "outlier_detection_experimental";
    }

    @Override // p237g5.AbstractC4418T
    /* renamed from: c */
    public int mo18737c() {
        return 5;
    }

    @Override // p237g5.AbstractC4418T
    /* renamed from: d */
    public boolean mo18738d() {
        return true;
    }

    @Override // p237g5.AbstractC4418T
    /* renamed from: e */
    public AbstractC4430c0.b mo18739e(Map map) {
        try {
            return m25714f(map);
        } catch (RuntimeException e7) {
            return AbstractC4430c0.b.m18892b(C4448l0.f15810t.m18962p(e7).m18963q("Failed parsing configuration for " + mo18736b()));
        }
    }

    /* renamed from: f */
    public final AbstractC4430c0.b m25714f(Map map) {
        Long m19832l = AbstractC4599c0.m19832l(map, "interval");
        Long m19832l2 = AbstractC4599c0.m19832l(map, "baseEjectionTime");
        Long m19832l3 = AbstractC4599c0.m19832l(map, "maxEjectionTime");
        Integer m19829i = AbstractC4599c0.m19829i(map, "maxEjectionPercentage");
        C6151h.g.a aVar = new C6151h.g.a();
        if (m19832l != null) {
            aVar.m25689e(m19832l);
        }
        if (m19832l2 != null) {
            aVar.m25686b(m19832l2);
        }
        if (m19832l3 != null) {
            aVar.m25691g(m19832l3);
        }
        if (m19829i != null) {
            aVar.m25690f(m19829i);
        }
        Map m19830j = AbstractC4599c0.m19830j(map, "successRateEjection");
        if (m19830j != null) {
            C6151h.g.c.a aVar2 = new C6151h.g.c.a();
            Integer m19829i2 = AbstractC4599c0.m19829i(m19830j, "stdevFactor");
            Integer m19829i3 = AbstractC4599c0.m19829i(m19830j, "enforcementPercentage");
            Integer m19829i4 = AbstractC4599c0.m19829i(m19830j, "minimumHosts");
            Integer m19829i5 = AbstractC4599c0.m19829i(m19830j, "requestVolume");
            if (m19829i2 != null) {
                aVar2.m25702e(m19829i2);
            }
            if (m19829i3 != null) {
                aVar2.m25699b(m19829i3);
            }
            if (m19829i4 != null) {
                aVar2.m25700c(m19829i4);
            }
            if (m19829i5 != null) {
                aVar2.m25701d(m19829i5);
            }
            aVar.m25692h(aVar2.m25698a());
        }
        Map m19830j2 = AbstractC4599c0.m19830j(map, "failurePercentageEjection");
        if (m19830j2 != null) {
            C6151h.g.b.a aVar3 = new C6151h.g.b.a();
            Integer m19829i6 = AbstractC4599c0.m19829i(m19830j2, "threshold");
            Integer m19829i7 = AbstractC4599c0.m19829i(m19830j2, "enforcementPercentage");
            Integer m19829i8 = AbstractC4599c0.m19829i(m19830j2, "minimumHosts");
            Integer m19829i9 = AbstractC4599c0.m19829i(m19830j2, "requestVolume");
            if (m19829i6 != null) {
                aVar3.m25697e(m19829i6);
            }
            if (m19829i7 != null) {
                aVar3.m25694b(m19829i7);
            }
            if (m19829i8 != null) {
                aVar3.m25695c(m19829i8);
            }
            if (m19829i9 != null) {
                aVar3.m25696d(m19829i9);
            }
            aVar.m25688d(aVar3.m25693a());
        }
        List m19534A = AbstractC4568L0.m19534A(AbstractC4599c0.m19826f(map, "childPolicy"));
        if (m19534A == null || m19534A.isEmpty()) {
            return AbstractC4430c0.b.m18892b(C4448l0.f15809s.m18963q("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        AbstractC4430c0.b m19559y = AbstractC4568L0.m19559y(m19534A, C4419U.m18740b());
        if (m19559y.m18894d() != null) {
            return m19559y;
        }
        aVar.m25687c((AbstractC4568L0.b) m19559y.m18893c());
        return AbstractC4430c0.b.m18891a(aVar.m25685a());
    }
}
