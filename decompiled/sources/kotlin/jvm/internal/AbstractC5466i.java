package kotlin.jvm.internal;

import p111P5.InterfaceC1968b;
import p111P5.InterfaceC1972f;

/* renamed from: kotlin.jvm.internal.i */
/* loaded from: classes2.dex */
public abstract class AbstractC5466i extends AbstractC5460c implements InterfaceC5465h, InterfaceC1972f {
    private final int arity;
    private final int flags;

    public AbstractC5466i(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.arity = i7;
        this.flags = i8 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC5460c
    public InterfaceC1968b computeReflected() {
        return AbstractC5481x.m23039a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5466i) {
            AbstractC5466i abstractC5466i = (AbstractC5466i) obj;
            return getName().equals(abstractC5466i.getName()) && getSignature().equals(abstractC5466i.getSignature()) && this.flags == abstractC5466i.flags && this.arity == abstractC5466i.arity && AbstractC5469l.m23024a(getBoundReceiver(), abstractC5466i.getBoundReceiver()) && AbstractC5469l.m23024a(getOwner(), abstractC5466i.getOwner());
        }
        if (obj instanceof InterfaceC1972f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC5465h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p111P5.InterfaceC1972f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p111P5.InterfaceC1972f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p111P5.InterfaceC1972f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p111P5.InterfaceC1972f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p111P5.InterfaceC1972f
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1968b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC5460c
    public InterfaceC1972f getReflected() {
        return (InterfaceC1972f) super.getReflected();
    }
}
