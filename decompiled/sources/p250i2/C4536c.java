package p250i2;

import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;

/* renamed from: i2.c */
/* loaded from: classes.dex */
public final class C4536c implements InterfaceC3103b {

    /* renamed from: i2.c$a */
    public static final class a {

        /* renamed from: a */
        public static final C4536c f16194a = new C4536c();
    }

    /* renamed from: a */
    public static C4536c m19272a() {
        return a.f16194a;
    }

    /* renamed from: b */
    public static InterfaceC4534a m19273b() {
        return (InterfaceC4534a) AbstractC3105d.m11328c(AbstractC4535b.m19270a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4534a get() {
        return m19273b();
    }
}
