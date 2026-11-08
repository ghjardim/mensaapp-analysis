package p013B5;

import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5481x;
import kotlin.jvm.internal.InterfaceC5465h;
import p392z5.InterfaceC7157e;

/* renamed from: B5.l */
/* loaded from: classes2.dex */
public abstract class AbstractC0068l extends AbstractC0060d implements InterfaceC5465h {
    private final int arity;

    public AbstractC0068l(int i7, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.InterfaceC5465h
    public int getArity() {
        return this.arity;
    }

    @Override // p013B5.AbstractC0057a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String m23044f = AbstractC5481x.m23044f(this);
        AbstractC5469l.m23027d(m23044f, "renderLambdaToString(...)");
        return m23044f;
    }
}
