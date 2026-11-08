package p170Y1;

import p185a2.InterfaceC3103b;
import p218e2.InterfaceC4166e;
import p226f2.C4266r;
import p226f2.C4270v;
import p250i2.InterfaceC4534a;
import p364v5.InterfaceC6784a;

/* renamed from: Y1.v */
/* loaded from: classes.dex */
public final class C2915v implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f8989a;

    /* renamed from: b */
    public final InterfaceC6784a f8990b;

    /* renamed from: c */
    public final InterfaceC6784a f8991c;

    /* renamed from: d */
    public final InterfaceC6784a f8992d;

    /* renamed from: e */
    public final InterfaceC6784a f8993e;

    public C2915v(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5) {
        this.f8989a = interfaceC6784a;
        this.f8990b = interfaceC6784a2;
        this.f8991c = interfaceC6784a3;
        this.f8992d = interfaceC6784a4;
        this.f8993e = interfaceC6784a5;
    }

    /* renamed from: a */
    public static C2915v m10500a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5) {
        return new C2915v(interfaceC6784a, interfaceC6784a2, interfaceC6784a3, interfaceC6784a4, interfaceC6784a5);
    }

    /* renamed from: c */
    public static C2913t m10501c(InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, InterfaceC4166e interfaceC4166e, C4266r c4266r, C4270v c4270v) {
        return new C2913t(interfaceC4534a, interfaceC4534a2, interfaceC4166e, c4266r, c4270v);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2913t get() {
        return m10501c((InterfaceC4534a) this.f8989a.get(), (InterfaceC4534a) this.f8990b.get(), (InterfaceC4166e) this.f8991c.get(), (C4266r) this.f8992d.get(), (C4270v) this.f8993e.get());
    }
}
