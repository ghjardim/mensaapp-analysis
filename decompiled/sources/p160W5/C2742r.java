package p160W5;

import p013B5.InterfaceC0061e;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: W5.r */
/* loaded from: classes2.dex */
public final class C2742r implements InterfaceC7157e, InterfaceC0061e {

    /* renamed from: a */
    public final InterfaceC7157e f8082a;

    /* renamed from: b */
    public final InterfaceC7161i f8083b;

    public C2742r(InterfaceC7157e interfaceC7157e, InterfaceC7161i interfaceC7161i) {
        this.f8082a = interfaceC7157e;
        this.f8083b = interfaceC7161i;
    }

    @Override // p013B5.InterfaceC0061e
    public InterfaceC0061e getCallerFrame() {
        InterfaceC7157e interfaceC7157e = this.f8082a;
        if (interfaceC7157e instanceof InterfaceC0061e) {
            return (InterfaceC0061e) interfaceC7157e;
        }
        return null;
    }

    @Override // p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        return this.f8083b;
    }

    @Override // p392z5.InterfaceC7157e
    public void resumeWith(Object obj) {
        this.f8082a.resumeWith(obj);
    }
}
