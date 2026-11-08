package p226f2;

import java.util.Map;
import p250i2.InterfaceC4534a;

/* renamed from: f2.b */
/* loaded from: classes.dex */
public final class C4250b extends AbstractC4254f {

    /* renamed from: a */
    public final InterfaceC4534a f14639a;

    /* renamed from: b */
    public final Map f14640b;

    public C4250b(InterfaceC4534a interfaceC4534a, Map map) {
        if (interfaceC4534a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f14639a = interfaceC4534a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f14640b = map;
    }

    @Override // p226f2.AbstractC4254f
    /* renamed from: e */
    public InterfaceC4534a mo17836e() {
        return this.f14639a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4254f)) {
            return false;
        }
        AbstractC4254f abstractC4254f = (AbstractC4254f) obj;
        return this.f14639a.equals(abstractC4254f.mo17836e()) && this.f14640b.equals(abstractC4254f.mo17837h());
    }

    @Override // p226f2.AbstractC4254f
    /* renamed from: h */
    public Map mo17837h() {
        return this.f14640b;
    }

    public int hashCode() {
        return ((this.f14639a.hashCode() ^ 1000003) * 1000003) ^ this.f14640b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f14639a + ", values=" + this.f14640b + "}";
    }
}
