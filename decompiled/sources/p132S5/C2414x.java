package p132S5;

import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p189a6.InterfaceC3182c;
import p392z5.InterfaceC7157e;

/* renamed from: S5.x */
/* loaded from: classes2.dex */
public final class C2414x extends C2321C0 implements InterfaceC2412w {
    public C2414x(InterfaceC2409u0 interfaceC2409u0) {
        super(true);
        m7917g0(interfaceC2409u0);
    }

    @Override // p132S5.C2321C0
    /* renamed from: Y */
    public boolean mo7911Y() {
        return true;
    }

    @Override // p132S5.InterfaceC2348Q
    public Object await(InterfaceC7157e interfaceC7157e) {
        Object m7885F = m7885F(interfaceC7157e);
        AbstractC0024c.m76e();
        return m7885F;
    }

    @Override // p132S5.InterfaceC2348Q
    public Object getCompleted() {
        return m7906T();
    }

    @Override // p132S5.InterfaceC2348Q
    public InterfaceC3182c getOnAwait() {
        InterfaceC3182c m7910X = m7910X();
        AbstractC5469l.m23026c(m7910X, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return m7910X;
    }

    @Override // p132S5.InterfaceC2412w
    /* renamed from: r */
    public boolean mo8186r(Throwable th) {
        return m7923m0(new C2318B(th, false, 2, null));
    }

    @Override // p132S5.InterfaceC2412w
    /* renamed from: v */
    public boolean mo8187v(Object obj) {
        return m7923m0(obj);
    }
}
