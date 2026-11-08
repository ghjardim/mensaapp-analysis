package p234g2;

import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;

/* renamed from: g2.j */
/* loaded from: classes.dex */
public final class C4377j implements InterfaceC3103b {

    /* renamed from: g2.j$a */
    public static final class a {

        /* renamed from: a */
        public static final C4377j f15561a = new C4377j();
    }

    /* renamed from: a */
    public static C4377j m18614a() {
        return a.f15561a;
    }

    /* renamed from: c */
    public static AbstractC4372e m18615c() {
        return (AbstractC4372e) AbstractC3105d.m11328c(AbstractC4373f.m18602d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC4372e get() {
        return m18615c();
    }
}
