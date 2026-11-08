package p234g2;

import android.content.Context;
import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;
import p364v5.InterfaceC6784a;

/* renamed from: g2.h */
/* loaded from: classes.dex */
public final class C4375h implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f15559a;

    public C4375h(InterfaceC6784a interfaceC6784a) {
        this.f15559a = interfaceC6784a;
    }

    /* renamed from: a */
    public static C4375h m18607a(InterfaceC6784a interfaceC6784a) {
        return new C4375h(interfaceC6784a);
    }

    /* renamed from: c */
    public static String m18608c(Context context) {
        return (String) AbstractC3105d.m11328c(AbstractC4373f.m18600b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m18608c((Context) this.f15559a.get());
    }
}
