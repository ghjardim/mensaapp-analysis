package p153V5;

import p006A5.AbstractC0024c;
import p069J5.InterfaceC0804p;
import p146U5.EnumC2583a;
import p146U5.InterfaceC2600r;
import p160W5.AbstractC2729e;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: V5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2630c extends AbstractC2729e {

    /* renamed from: d */
    public final InterfaceC0804p f7786d;

    public AbstractC2630c(InterfaceC0804p interfaceC0804p, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        super(interfaceC7161i, i7, enumC2583a);
        this.f7786d = interfaceC0804p;
    }

    /* renamed from: k */
    public static /* synthetic */ Object m9051k(AbstractC2630c abstractC2630c, InterfaceC2600r interfaceC2600r, InterfaceC7157e interfaceC7157e) {
        Object invoke = abstractC2630c.f7786d.invoke(interfaceC2600r, interfaceC7157e);
        return invoke == AbstractC0024c.m76e() ? invoke : C6934q.f24811a;
    }

    @Override // p160W5.AbstractC2729e
    /* renamed from: f */
    public Object mo9049f(InterfaceC2600r interfaceC2600r, InterfaceC7157e interfaceC7157e) {
        return m9051k(this, interfaceC2600r, interfaceC7157e);
    }

    @Override // p160W5.AbstractC2729e
    public String toString() {
        return "block[" + this.f7786d + "] -> " + super.toString();
    }
}
