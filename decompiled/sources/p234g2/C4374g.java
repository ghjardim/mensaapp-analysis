package p234g2;

import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;

/* renamed from: g2.g */
/* loaded from: classes.dex */
public final class C4374g implements InterfaceC3103b {

    /* renamed from: g2.g$a */
    public static final class a {

        /* renamed from: a */
        public static final C4374g f15558a = new C4374g();
    }

    /* renamed from: a */
    public static C4374g m18603a() {
        return a.f15558a;
    }

    /* renamed from: b */
    public static String m18604b() {
        return (String) AbstractC3105d.m11328c(AbstractC4373f.m18599a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m18604b();
    }
}
