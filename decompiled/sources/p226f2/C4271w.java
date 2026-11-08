package p226f2;

import java.util.concurrent.Executor;
import p185a2.InterfaceC3103b;
import p234g2.InterfaceC4371d;
import p242h2.InterfaceC4484b;
import p364v5.InterfaceC6784a;

/* renamed from: f2.w */
/* loaded from: classes.dex */
public final class C4271w implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f14707a;

    /* renamed from: b */
    public final InterfaceC6784a f14708b;

    /* renamed from: c */
    public final InterfaceC6784a f14709c;

    /* renamed from: d */
    public final InterfaceC6784a f14710d;

    public C4271w(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4) {
        this.f14707a = interfaceC6784a;
        this.f14708b = interfaceC6784a2;
        this.f14709c = interfaceC6784a3;
        this.f14710d = interfaceC6784a4;
    }

    /* renamed from: a */
    public static C4271w m17891a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4) {
        return new C4271w(interfaceC6784a, interfaceC6784a2, interfaceC6784a3, interfaceC6784a4);
    }

    /* renamed from: c */
    public static C4270v m17892c(Executor executor, InterfaceC4371d interfaceC4371d, InterfaceC4272x interfaceC4272x, InterfaceC4484b interfaceC4484b) {
        return new C4270v(executor, interfaceC4371d, interfaceC4272x, interfaceC4484b);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4270v get() {
        return m17892c((Executor) this.f14707a.get(), (InterfaceC4371d) this.f14708b.get(), (InterfaceC4272x) this.f14709c.get(), (InterfaceC4484b) this.f14710d.get());
    }
}
