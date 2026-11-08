package p192b0;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p192b0.AbstractC3503a;

/* renamed from: b0.b */
/* loaded from: classes.dex */
public final class C3504b extends AbstractC3503a {
    /* JADX WARN: Multi-variable type inference failed */
    public C3504b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p192b0.AbstractC3503a
    /* renamed from: a */
    public Object mo14080a(AbstractC3503a.b key) {
        AbstractC5469l.m23028e(key, "key");
        return m14081b().get(key);
    }

    /* renamed from: c */
    public final void m14082c(AbstractC3503a.b key, Object obj) {
        AbstractC5469l.m23028e(key, "key");
        m14081b().put(key, obj);
    }

    public C3504b(AbstractC3503a initialExtras) {
        AbstractC5469l.m23028e(initialExtras, "initialExtras");
        m14081b().putAll(initialExtras.m14081b());
    }

    public /* synthetic */ C3504b(AbstractC3503a abstractC3503a, int i7, AbstractC5464g abstractC5464g) {
        this((i7 & 1) != 0 ? AbstractC3503a.a.f11769b : abstractC3503a);
    }
}
