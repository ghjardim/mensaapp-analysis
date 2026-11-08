package p234g2;

import p185a2.InterfaceC3103b;
import p250i2.InterfaceC4534a;
import p364v5.InterfaceC6784a;

/* renamed from: g2.N */
/* loaded from: classes.dex */
public final class C4360N implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f15526a;

    /* renamed from: b */
    public final InterfaceC6784a f15527b;

    /* renamed from: c */
    public final InterfaceC6784a f15528c;

    /* renamed from: d */
    public final InterfaceC6784a f15529d;

    /* renamed from: e */
    public final InterfaceC6784a f15530e;

    public C4360N(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5) {
        this.f15526a = interfaceC6784a;
        this.f15527b = interfaceC6784a2;
        this.f15528c = interfaceC6784a3;
        this.f15529d = interfaceC6784a4;
        this.f15530e = interfaceC6784a5;
    }

    /* renamed from: a */
    public static C4360N m18564a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5) {
        return new C4360N(interfaceC6784a, interfaceC6784a2, interfaceC6784a3, interfaceC6784a4, interfaceC6784a5);
    }

    /* renamed from: c */
    public static C4359M m18565c(InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, Object obj, Object obj2, InterfaceC6784a interfaceC6784a) {
        return new C4359M(interfaceC4534a, interfaceC4534a2, (AbstractC4372e) obj, (C4366U) obj2, interfaceC6784a);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4359M get() {
        return m18565c((InterfaceC4534a) this.f15526a.get(), (InterfaceC4534a) this.f15527b.get(), this.f15528c.get(), this.f15529d.get(), this.f15530e);
    }
}
