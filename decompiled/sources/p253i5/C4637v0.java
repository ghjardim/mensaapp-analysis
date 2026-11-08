package p253i5;

import java.util.Map;
import p171Y2.AbstractC2938u;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4418T;
import p237g5.AbstractC4430c0;
import p237g5.C4448l0;
import p253i5.C4635u0;

/* renamed from: i5.v0 */
/* loaded from: classes2.dex */
public final class C4637v0 extends AbstractC4418T {

    /* renamed from: b */
    public static boolean f17275b;

    static {
        f17275b = !AbstractC2938u.m10607a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // p237g5.AbstractC4417S.c
    /* renamed from: a */
    public AbstractC4417S mo18697a(AbstractC4417S.e eVar) {
        return f17275b ? new C4631s0(eVar) : new C4635u0(eVar);
    }

    @Override // p237g5.AbstractC4418T
    /* renamed from: b */
    public String mo18736b() {
        return "pick_first";
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
            return AbstractC4430c0.b.m18891a(new C4635u0.c(AbstractC4599c0.m19824d(map, "shuffleAddressList")));
        } catch (RuntimeException e7) {
            return AbstractC4430c0.b.m18892b(C4448l0.f15810t.m18962p(e7).m18963q("Failed parsing configuration for " + mo18736b()));
        }
    }
}
