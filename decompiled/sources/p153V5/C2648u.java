package p153V5;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p132S5.C2396o;
import p160W5.AbstractC2727c;
import p160W5.AbstractC2728d;
import p167X5.AbstractC2861f;
import p167X5.C2846G;
import p366w0.AbstractC6820f;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: V5.u */
/* loaded from: classes2.dex */
public final class C2648u extends AbstractC2728d {

    /* renamed from: a */
    public final AtomicReference f7853a = new AtomicReference(null);

    @Override // p160W5.AbstractC2728d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo9099a(C2646s c2646s) {
        C2846G c2846g;
        if (AbstractC2861f.m10322a(this.f7853a) != null) {
            return false;
        }
        AtomicReference atomicReference = this.f7853a;
        c2846g = AbstractC2647t.f7851a;
        AbstractC2861f.m10323b(atomicReference, c2846g);
        return true;
    }

    /* renamed from: e */
    public final Object m9102e(InterfaceC7157e interfaceC7157e) {
        C2846G c2846g;
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        AtomicReference atomicReference = this.f7853a;
        c2846g = AbstractC2647t.f7851a;
        if (!AbstractC6820f.m28054a(atomicReference, c2846g, c2396o)) {
            C6927j.a aVar = C6927j.f24803b;
            c2396o.resumeWith(C6927j.m28373b(C6934q.f24811a));
        }
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y == AbstractC0024c.m76e() ? m8171y : C6934q.f24811a;
    }

    @Override // p160W5.AbstractC2728d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC7157e[] mo9100b(C2646s c2646s) {
        AbstractC2861f.m10323b(this.f7853a, null);
        return AbstractC2727c.f8050a;
    }

    /* renamed from: g */
    public final void m9104g() {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2846G c2846g4;
        AtomicReference atomicReference = this.f7853a;
        while (true) {
            Object m10322a = AbstractC2861f.m10322a(atomicReference);
            if (m10322a == null) {
                return;
            }
            c2846g = AbstractC2647t.f7852b;
            if (m10322a == c2846g) {
                return;
            }
            c2846g2 = AbstractC2647t.f7851a;
            if (m10322a == c2846g2) {
                AtomicReference atomicReference2 = this.f7853a;
                c2846g3 = AbstractC2647t.f7852b;
                if (AbstractC6820f.m28054a(atomicReference2, m10322a, c2846g3)) {
                    return;
                }
            } else {
                AtomicReference atomicReference3 = this.f7853a;
                c2846g4 = AbstractC2647t.f7851a;
                if (AbstractC6820f.m28054a(atomicReference3, m10322a, c2846g4)) {
                    C6927j.a aVar = C6927j.f24803b;
                    ((C2396o) m10322a).resumeWith(C6927j.m28373b(C6934q.f24811a));
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean m9105h() {
        C2846G c2846g;
        C2846G c2846g2;
        AtomicReference atomicReference = this.f7853a;
        c2846g = AbstractC2647t.f7851a;
        Object andSet = atomicReference.getAndSet(c2846g);
        AbstractC5469l.m23025b(andSet);
        c2846g2 = AbstractC2647t.f7852b;
        return andSet == c2846g2;
    }
}
