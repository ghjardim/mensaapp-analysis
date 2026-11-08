package p218e2;

import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;
import p226f2.AbstractC4254f;
import p250i2.InterfaceC4534a;
import p364v5.InterfaceC6784a;

/* renamed from: e2.g */
/* loaded from: classes.dex */
public final class C4168g implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f13985a;

    public C4168g(InterfaceC6784a interfaceC6784a) {
        this.f13985a = interfaceC6784a;
    }

    /* renamed from: a */
    public static AbstractC4254f m17497a(InterfaceC4534a interfaceC4534a) {
        return (AbstractC4254f) AbstractC3105d.m11328c(AbstractC4167f.m17496a(interfaceC4534a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C4168g m17498b(InterfaceC6784a interfaceC6784a) {
        return new C4168g(interfaceC6784a);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC4254f get() {
        return m17497a((InterfaceC4534a) this.f13985a.get());
    }
}
