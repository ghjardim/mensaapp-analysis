package p160W5;

import kotlin.jvm.internal.AbstractC5464g;
import p006A5.AbstractC0024c;
import p146U5.EnumC2583a;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2632e;
import p371w5.C6934q;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: W5.h */
/* loaded from: classes2.dex */
public final class C2732h extends AbstractC2731g {
    public /* synthetic */ C2732h(InterfaceC2631d interfaceC2631d, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a, int i8, AbstractC5464g abstractC5464g) {
        this(interfaceC2631d, (i8 & 2) != 0 ? C7162j.f25439a : interfaceC7161i, (i8 & 4) != 0 ? -3 : i7, (i8 & 8) != 0 ? EnumC2583a.f7562a : enumC2583a);
    }

    @Override // p160W5.AbstractC2729e
    /* renamed from: g */
    public AbstractC2729e mo9050g(InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        return new C2732h(this.f8061d, interfaceC7161i, i7, enumC2583a);
    }

    @Override // p160W5.AbstractC2731g
    /* renamed from: n */
    public Object mo9359n(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
        Object mo7083a = this.f8061d.mo7083a(interfaceC2632e, interfaceC7157e);
        return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
    }

    public C2732h(InterfaceC2631d interfaceC2631d, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        super(interfaceC2631d, interfaceC7161i, i7, enumC2583a);
    }
}
