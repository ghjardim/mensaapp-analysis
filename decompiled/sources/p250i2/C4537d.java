package p250i2;

import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;

/* renamed from: i2.d */
/* loaded from: classes.dex */
public final class C4537d implements InterfaceC3103b {

    /* renamed from: i2.d$a */
    public static final class a {

        /* renamed from: a */
        public static final C4537d f16195a = new C4537d();
    }

    /* renamed from: a */
    public static C4537d m19276a() {
        return a.f16195a;
    }

    /* renamed from: c */
    public static InterfaceC4534a m19277c() {
        return (InterfaceC4534a) AbstractC3105d.m11328c(AbstractC4535b.m19271b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4534a get() {
        return m19277c();
    }
}
