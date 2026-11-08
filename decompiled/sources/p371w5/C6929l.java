package p371w5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0789a;

/* renamed from: w5.l */
/* loaded from: classes2.dex */
public final class C6929l implements InterfaceC6923f, Serializable {

    /* renamed from: a */
    public InterfaceC0789a f24806a;

    /* renamed from: b */
    public volatile Object f24807b;

    /* renamed from: c */
    public final Object f24808c;

    public C6929l(InterfaceC0789a initializer, Object obj) {
        AbstractC5469l.m23028e(initializer, "initializer");
        this.f24806a = initializer;
        this.f24807b = C6932o.f24810a;
        this.f24808c = obj == null ? this : obj;
    }

    @Override // p371w5.InterfaceC6923f
    /* renamed from: d */
    public boolean mo28366d() {
        return this.f24807b != C6932o.f24810a;
    }

    @Override // p371w5.InterfaceC6923f
    public Object getValue() {
        Object obj;
        Object obj2 = this.f24807b;
        C6932o c6932o = C6932o.f24810a;
        if (obj2 != c6932o) {
            return obj2;
        }
        synchronized (this.f24808c) {
            obj = this.f24807b;
            if (obj == c6932o) {
                InterfaceC0789a interfaceC0789a = this.f24806a;
                AbstractC5469l.m23025b(interfaceC0789a);
                obj = interfaceC0789a.invoke();
                this.f24807b = obj;
                this.f24806a = null;
            }
        }
        return obj;
    }

    public String toString() {
        return mo28366d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C6929l(InterfaceC0789a interfaceC0789a, Object obj, int i7, AbstractC5464g abstractC5464g) {
        this(interfaceC0789a, (i7 & 2) != 0 ? null : obj);
    }
}
