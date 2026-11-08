package p153V5;

import p006A5.AbstractC0024c;
import p069J5.InterfaceC0804p;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: V5.o */
/* loaded from: classes2.dex */
public final class C2642o extends AbstractC2628a {

    /* renamed from: a */
    public final InterfaceC0804p f7839a;

    public C2642o(InterfaceC0804p interfaceC0804p) {
        this.f7839a = interfaceC0804p;
    }

    @Override // p153V5.AbstractC2628a
    /* renamed from: d */
    public Object mo9048d(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
        Object invoke = this.f7839a.invoke(interfaceC2632e, interfaceC7157e);
        return invoke == AbstractC0024c.m76e() ? invoke : C6934q.f24811a;
    }
}
