package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.m */
/* loaded from: classes2.dex */
public abstract class AbstractC5470m implements InterfaceC5465h, Serializable {
    private final int arity;

    public AbstractC5470m(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.InterfaceC5465h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String m23045g = AbstractC5481x.m23045g(this);
        AbstractC5469l.m23027d(m23045g, "renderLambdaToString(...)");
        return m23045g;
    }
}
