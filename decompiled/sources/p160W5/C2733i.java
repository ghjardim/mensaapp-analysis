package p160W5;

import p069J5.InterfaceC0804p;
import p392z5.InterfaceC7161i;

/* renamed from: W5.i */
/* loaded from: classes2.dex */
public final class C2733i implements InterfaceC7161i {

    /* renamed from: a */
    public final Throwable f8065a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7161i f8066b;

    public C2733i(Throwable th, InterfaceC7161i interfaceC7161i) {
        this.f8065a = th;
        this.f8066b = interfaceC7161i;
    }

    @Override // p392z5.InterfaceC7161i
    public Object fold(Object obj, InterfaceC0804p interfaceC0804p) {
        return this.f8066b.fold(obj, interfaceC0804p);
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i.b get(InterfaceC7161i.c cVar) {
        return this.f8066b.get(cVar);
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i minusKey(InterfaceC7161i.c cVar) {
        return this.f8066b.minusKey(cVar);
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i plus(InterfaceC7161i interfaceC7161i) {
        return this.f8066b.plus(interfaceC7161i);
    }
}
