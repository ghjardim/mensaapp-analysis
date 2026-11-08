package p132S5;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: S5.C */
/* loaded from: classes2.dex */
public final class C2320C {

    /* renamed from: a */
    public final Object f7025a;

    /* renamed from: b */
    public final InterfaceC0800l f7026b;

    public C2320C(Object obj, InterfaceC0800l interfaceC0800l) {
        this.f7025a = obj;
        this.f7026b = interfaceC0800l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2320C)) {
            return false;
        }
        C2320C c2320c = (C2320C) obj;
        return AbstractC5469l.m23024a(this.f7025a, c2320c.f7025a) && AbstractC5469l.m23024a(this.f7026b, c2320c.f7026b);
    }

    public int hashCode() {
        Object obj = this.f7025a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f7026b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f7025a + ", onCancellation=" + this.f7026b + ')';
    }
}
