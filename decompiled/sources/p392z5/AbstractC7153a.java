package p392z5;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p392z5.InterfaceC7161i;

/* renamed from: z5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7153a implements InterfaceC7161i.b {

    /* renamed from: a */
    public final InterfaceC7161i.c f25432a;

    public AbstractC7153a(InterfaceC7161i.c key) {
        AbstractC5469l.m23028e(key, "key");
        this.f25432a = key;
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public Object fold(Object obj, InterfaceC0804p interfaceC0804p) {
        return InterfaceC7161i.b.a.m29476a(this, obj, interfaceC0804p);
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i.b get(InterfaceC7161i.c cVar) {
        return InterfaceC7161i.b.a.m29477b(this, cVar);
    }

    @Override // p392z5.InterfaceC7161i.b
    public InterfaceC7161i.c getKey() {
        return this.f25432a;
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i minusKey(InterfaceC7161i.c cVar) {
        return InterfaceC7161i.b.a.m29478c(this, cVar);
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i plus(InterfaceC7161i interfaceC7161i) {
        return InterfaceC7161i.b.a.m29479d(this, interfaceC7161i);
    }
}
