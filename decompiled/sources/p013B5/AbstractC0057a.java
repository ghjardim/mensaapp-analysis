package p013B5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* renamed from: B5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0057a implements InterfaceC7157e, InterfaceC0061e, Serializable {
    private final InterfaceC7157e completion;

    public AbstractC0057a(InterfaceC7157e interfaceC7157e) {
        this.completion = interfaceC7157e;
    }

    public InterfaceC7157e create(InterfaceC7157e completion) {
        AbstractC5469l.m23028e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p013B5.InterfaceC0061e
    public InterfaceC0061e getCallerFrame() {
        InterfaceC7157e interfaceC7157e = this.completion;
        if (interfaceC7157e instanceof InterfaceC0061e) {
            return (InterfaceC0061e) interfaceC7157e;
        }
        return null;
    }

    public final InterfaceC7157e getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return AbstractC0063g.m161d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p392z5.InterfaceC7157e
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        InterfaceC7157e interfaceC7157e = this;
        while (true) {
            AbstractC0064h.m163b(interfaceC7157e);
            AbstractC0057a abstractC0057a = (AbstractC0057a) interfaceC7157e;
            InterfaceC7157e interfaceC7157e2 = abstractC0057a.completion;
            AbstractC5469l.m23025b(interfaceC7157e2);
            try {
                invokeSuspend = abstractC0057a.invokeSuspend(obj);
            } catch (Throwable th) {
                C6927j.a aVar = C6927j.f24803b;
                obj = C6927j.m28373b(AbstractC6928k.m28381a(th));
            }
            if (invokeSuspend == AbstractC0024c.m76e()) {
                return;
            }
            obj = C6927j.m28373b(invokeSuspend);
            abstractC0057a.releaseIntercepted();
            if (!(interfaceC7157e2 instanceof AbstractC0057a)) {
                interfaceC7157e2.resumeWith(obj);
                return;
            }
            interfaceC7157e = interfaceC7157e2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC7157e create(Object obj, InterfaceC7157e completion) {
        AbstractC5469l.m23028e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
