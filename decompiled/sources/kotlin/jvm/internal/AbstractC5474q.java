package kotlin.jvm.internal;

import p111P5.InterfaceC1968b;
import p111P5.InterfaceC1974h;

/* renamed from: kotlin.jvm.internal.q */
/* loaded from: classes2.dex */
public abstract class AbstractC5474q extends AbstractC5476s implements InterfaceC1974h {
    public AbstractC5474q(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.AbstractC5460c
    public InterfaceC1968b computeReflected() {
        return AbstractC5481x.m23043e(this);
    }

    @Override // p111P5.InterfaceC1974h
    /* renamed from: d */
    public InterfaceC1974h.a mo7025d() {
        ((InterfaceC1974h) getReflected()).mo7025d();
        return null;
    }

    @Override // p069J5.InterfaceC0800l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
