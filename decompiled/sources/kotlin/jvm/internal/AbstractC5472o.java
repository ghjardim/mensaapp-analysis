package kotlin.jvm.internal;

import p111P5.InterfaceC1968b;
import p111P5.InterfaceC1973g;

/* renamed from: kotlin.jvm.internal.o */
/* loaded from: classes2.dex */
public abstract class AbstractC5472o extends AbstractC5476s implements InterfaceC1973g {
    public AbstractC5472o(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.AbstractC5460c
    public InterfaceC1968b computeReflected() {
        return AbstractC5481x.m23042d(this);
    }

    @Override // p069J5.InterfaceC0789a
    public Object invoke() {
        return get();
    }
}
