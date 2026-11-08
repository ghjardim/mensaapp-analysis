package p218e2;

import java.util.concurrent.Executor;
import p177Z1.InterfaceC2978e;
import p185a2.InterfaceC3103b;
import p226f2.InterfaceC4272x;
import p234g2.InterfaceC4371d;
import p242h2.InterfaceC4484b;
import p364v5.InterfaceC6784a;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public final class C4165d implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f13980a;

    /* renamed from: b */
    public final InterfaceC6784a f13981b;

    /* renamed from: c */
    public final InterfaceC6784a f13982c;

    /* renamed from: d */
    public final InterfaceC6784a f13983d;

    /* renamed from: e */
    public final InterfaceC6784a f13984e;

    public C4165d(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5) {
        this.f13980a = interfaceC6784a;
        this.f13981b = interfaceC6784a2;
        this.f13982c = interfaceC6784a3;
        this.f13983d = interfaceC6784a4;
        this.f13984e = interfaceC6784a5;
    }

    /* renamed from: a */
    public static C4165d m17493a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5) {
        return new C4165d(interfaceC6784a, interfaceC6784a2, interfaceC6784a3, interfaceC6784a4, interfaceC6784a5);
    }

    /* renamed from: c */
    public static C4164c m17494c(Executor executor, InterfaceC2978e interfaceC2978e, InterfaceC4272x interfaceC4272x, InterfaceC4371d interfaceC4371d, InterfaceC4484b interfaceC4484b) {
        return new C4164c(executor, interfaceC2978e, interfaceC4272x, interfaceC4371d, interfaceC4484b);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4164c get() {
        return m17494c((Executor) this.f13980a.get(), (InterfaceC2978e) this.f13981b.get(), (InterfaceC4272x) this.f13982c.get(), (InterfaceC4371d) this.f13983d.get(), (InterfaceC4484b) this.f13984e.get());
    }
}
