package p234g2;

import android.content.Context;
import p185a2.InterfaceC3103b;
import p364v5.InterfaceC6784a;

/* renamed from: g2.V */
/* loaded from: classes.dex */
public final class C4367V implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f15541a;

    /* renamed from: b */
    public final InterfaceC6784a f15542b;

    /* renamed from: c */
    public final InterfaceC6784a f15543c;

    public C4367V(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3) {
        this.f15541a = interfaceC6784a;
        this.f15542b = interfaceC6784a2;
        this.f15543c = interfaceC6784a3;
    }

    /* renamed from: a */
    public static C4367V m18581a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3) {
        return new C4367V(interfaceC6784a, interfaceC6784a2, interfaceC6784a3);
    }

    /* renamed from: c */
    public static C4366U m18582c(Context context, String str, int i7) {
        return new C4366U(context, str, i7);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4366U get() {
        return m18582c((Context) this.f15541a.get(), (String) this.f15542b.get(), ((Integer) this.f15543c.get()).intValue());
    }
}
