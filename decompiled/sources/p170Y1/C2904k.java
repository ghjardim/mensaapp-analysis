package p170Y1;

import java.util.concurrent.Executor;
import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;

/* renamed from: Y1.k */
/* loaded from: classes.dex */
public final class C2904k implements InterfaceC3103b {

    /* renamed from: Y1.k$a */
    public static final class a {

        /* renamed from: a */
        public static final C2904k f8972a = new C2904k();
    }

    /* renamed from: a */
    public static C2904k m10480a() {
        return a.f8972a;
    }

    /* renamed from: b */
    public static Executor m10481b() {
        return (Executor) AbstractC3105d.m11328c(AbstractC2903j.m10479a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m10481b();
    }
}
