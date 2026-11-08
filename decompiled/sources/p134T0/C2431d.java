package p134T0;

import p078L0.AbstractC0845C;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5332a;

/* renamed from: T0.d */
/* loaded from: classes.dex */
public final class C2431d extends AbstractC0845C {

    /* renamed from: b */
    public final long f7200b;

    public C2431d(InterfaceC0884s interfaceC0884s, long j7) {
        super(interfaceC0884s);
        AbstractC5332a.m21796a(interfaceC0884s.mo3522u() >= j7);
        this.f7200b = j7;
    }

    @Override // p078L0.AbstractC0845C, p078L0.InterfaceC0884s
    /* renamed from: a */
    public long mo3511a() {
        return super.mo3511a() - this.f7200b;
    }

    @Override // p078L0.AbstractC0845C, p078L0.InterfaceC0884s
    /* renamed from: i */
    public long mo3514i() {
        return super.mo3514i() - this.f7200b;
    }

    @Override // p078L0.AbstractC0845C, p078L0.InterfaceC0884s
    /* renamed from: u */
    public long mo3522u() {
        return super.mo3522u() - this.f7200b;
    }
}
