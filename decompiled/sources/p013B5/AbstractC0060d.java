package p013B5;

import kotlin.jvm.internal.AbstractC5469l;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: B5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC0060d extends AbstractC0057a {
    private final InterfaceC7161i _context;
    private transient InterfaceC7157e intercepted;

    public AbstractC0060d(InterfaceC7157e interfaceC7157e, InterfaceC7161i interfaceC7161i) {
        super(interfaceC7157e);
        this._context = interfaceC7161i;
    }

    @Override // p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        InterfaceC7161i interfaceC7161i = this._context;
        AbstractC5469l.m23025b(interfaceC7161i);
        return interfaceC7161i;
    }

    public final InterfaceC7157e intercepted() {
        InterfaceC7157e interfaceC7157e = this.intercepted;
        if (interfaceC7157e == null) {
            InterfaceC7158f interfaceC7158f = (InterfaceC7158f) getContext().get(InterfaceC7158f.f25437m);
            if (interfaceC7158f == null || (interfaceC7157e = interfaceC7158f.mo7987m(this)) == null) {
                interfaceC7157e = this;
            }
            this.intercepted = interfaceC7157e;
        }
        return interfaceC7157e;
    }

    @Override // p013B5.AbstractC0057a
    public void releaseIntercepted() {
        InterfaceC7157e interfaceC7157e = this.intercepted;
        if (interfaceC7157e != null && interfaceC7157e != this) {
            InterfaceC7161i.b bVar = getContext().get(InterfaceC7158f.f25437m);
            AbstractC5469l.m23025b(bVar);
            ((InterfaceC7158f) bVar).mo7986j(interfaceC7157e);
        }
        this.intercepted = C0059c.f207a;
    }

    public AbstractC0060d(InterfaceC7157e interfaceC7157e) {
        this(interfaceC7157e, interfaceC7157e != null ? interfaceC7157e.getContext() : null);
    }
}
