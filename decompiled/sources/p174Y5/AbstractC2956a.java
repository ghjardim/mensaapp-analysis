package p174Y5;

import p006A5.AbstractC0023b;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p167X5.AbstractC2867l;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: Y5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2956a {
    /* renamed from: a */
    public static final void m10655a(InterfaceC7157e interfaceC7157e, Throwable th) {
        C6927j.a aVar = C6927j.f24803b;
        interfaceC7157e.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m10656b(InterfaceC0804p interfaceC0804p, Object obj, InterfaceC7157e interfaceC7157e, InterfaceC0800l interfaceC0800l) {
        try {
            InterfaceC7157e m74c = AbstractC0023b.m74c(AbstractC0023b.m72a(interfaceC0804p, obj, interfaceC7157e));
            C6927j.a aVar = C6927j.f24803b;
            AbstractC2867l.m10336b(m74c, C6927j.m28373b(C6934q.f24811a), interfaceC0800l);
        } catch (Throwable th) {
            m10655a(interfaceC7157e, th);
        }
    }

    /* renamed from: c */
    public static final void m10657c(InterfaceC7157e interfaceC7157e, InterfaceC7157e interfaceC7157e2) {
        try {
            InterfaceC7157e m74c = AbstractC0023b.m74c(interfaceC7157e);
            C6927j.a aVar = C6927j.f24803b;
            AbstractC2867l.m10337c(m74c, C6927j.m28373b(C6934q.f24811a), null, 2, null);
        } catch (Throwable th) {
            m10655a(interfaceC7157e2, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m10658d(InterfaceC0804p interfaceC0804p, Object obj, InterfaceC7157e interfaceC7157e, InterfaceC0800l interfaceC0800l, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            interfaceC0800l = null;
        }
        m10656b(interfaceC0804p, obj, interfaceC7157e, interfaceC0800l);
    }
}
