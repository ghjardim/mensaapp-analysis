package p249i1;

import p178Z2.AbstractC3033v;
import p249i1.InterfaceC4529t;
import p256j$.util.Objects;
import p259j0.InterfaceC5338g;

/* renamed from: i1.s */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4528s {
    /* renamed from: a */
    public static InterfaceC4520k m19255a(InterfaceC4529t interfaceC4529t, byte[] bArr, int i7, int i8) {
        InterfaceC4529t.b bVar;
        final AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        bVar = InterfaceC4529t.b.f16173c;
        Objects.requireNonNull(m11045m);
        interfaceC4529t.mo19258b(bArr, i7, i8, bVar, new InterfaceC5338g() { // from class: i1.r
            @Override // p259j0.InterfaceC5338g
            public final void accept(Object obj) {
                AbstractC3033v.a.this.mo11040a((C4514e) obj);
            }
        });
        return new C4516g(m11045m.m11063k());
    }

    /* renamed from: b */
    public static void m19256b(InterfaceC4529t interfaceC4529t) {
    }
}
