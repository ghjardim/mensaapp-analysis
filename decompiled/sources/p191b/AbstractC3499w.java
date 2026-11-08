package p191b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0789a;

/* renamed from: b.w */
/* loaded from: classes.dex */
public abstract class AbstractC3499w {

    /* renamed from: a */
    public boolean f11739a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f11740b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public InterfaceC0789a f11741c;

    public AbstractC3499w(boolean z6) {
        this.f11739a = z6;
    }

    /* renamed from: a */
    public final void m14044a(InterfaceC3479c cancellable) {
        AbstractC5469l.m23028e(cancellable, "cancellable");
        this.f11740b.add(cancellable);
    }

    /* renamed from: b */
    public final InterfaceC0789a m14045b() {
        return this.f11741c;
    }

    /* renamed from: c */
    public abstract void mo9524c();

    /* renamed from: d */
    public abstract void mo9525d();

    /* renamed from: e */
    public abstract void mo9526e(C3478b c3478b);

    /* renamed from: f */
    public abstract void mo9527f(C3478b c3478b);

    /* renamed from: g */
    public final boolean m14046g() {
        return this.f11739a;
    }

    /* renamed from: h */
    public final void m14047h() {
        Iterator it = this.f11740b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3479c) it.next()).cancel();
        }
    }

    /* renamed from: i */
    public final void m14048i(InterfaceC3479c cancellable) {
        AbstractC5469l.m23028e(cancellable, "cancellable");
        this.f11740b.remove(cancellable);
    }

    /* renamed from: j */
    public final void m14049j(boolean z6) {
        this.f11739a = z6;
        InterfaceC0789a interfaceC0789a = this.f11741c;
        if (interfaceC0789a != null) {
            interfaceC0789a.invoke();
        }
    }

    /* renamed from: k */
    public final void m14050k(InterfaceC0789a interfaceC0789a) {
        this.f11741c = interfaceC0789a;
    }
}
