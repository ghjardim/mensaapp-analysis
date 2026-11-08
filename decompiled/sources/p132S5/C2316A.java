package p132S5;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: S5.A */
/* loaded from: classes2.dex */
public final class C2316A {

    /* renamed from: a */
    public final Object f7017a;

    /* renamed from: b */
    public final InterfaceC2392m f7018b;

    /* renamed from: c */
    public final InterfaceC0800l f7019c;

    /* renamed from: d */
    public final Object f7020d;

    /* renamed from: e */
    public final Throwable f7021e;

    public C2316A(Object obj, InterfaceC2392m interfaceC2392m, InterfaceC0800l interfaceC0800l, Object obj2, Throwable th) {
        this.f7017a = obj;
        this.f7018b = interfaceC2392m;
        this.f7019c = interfaceC0800l;
        this.f7020d = obj2;
        this.f7021e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C2316A m7845b(C2316A c2316a, Object obj, InterfaceC2392m interfaceC2392m, InterfaceC0800l interfaceC0800l, Object obj2, Throwable th, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = c2316a.f7017a;
        }
        if ((i7 & 2) != 0) {
            interfaceC2392m = c2316a.f7018b;
        }
        InterfaceC2392m interfaceC2392m2 = interfaceC2392m;
        if ((i7 & 4) != 0) {
            interfaceC0800l = c2316a.f7019c;
        }
        InterfaceC0800l interfaceC0800l2 = interfaceC0800l;
        if ((i7 & 8) != 0) {
            obj2 = c2316a.f7020d;
        }
        Object obj4 = obj2;
        if ((i7 & 16) != 0) {
            th = c2316a.f7021e;
        }
        return c2316a.m7846a(obj, interfaceC2392m2, interfaceC0800l2, obj4, th);
    }

    /* renamed from: a */
    public final C2316A m7846a(Object obj, InterfaceC2392m interfaceC2392m, InterfaceC0800l interfaceC0800l, Object obj2, Throwable th) {
        return new C2316A(obj, interfaceC2392m, interfaceC0800l, obj2, th);
    }

    /* renamed from: c */
    public final boolean m7847c() {
        return this.f7021e != null;
    }

    /* renamed from: d */
    public final void m7848d(C2396o c2396o, Throwable th) {
        InterfaceC2392m interfaceC2392m = this.f7018b;
        if (interfaceC2392m != null) {
            c2396o.m8162k(interfaceC2392m, th);
        }
        InterfaceC0800l interfaceC0800l = this.f7019c;
        if (interfaceC0800l != null) {
            c2396o.m8163l(interfaceC0800l, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2316A)) {
            return false;
        }
        C2316A c2316a = (C2316A) obj;
        return AbstractC5469l.m23024a(this.f7017a, c2316a.f7017a) && AbstractC5469l.m23024a(this.f7018b, c2316a.f7018b) && AbstractC5469l.m23024a(this.f7019c, c2316a.f7019c) && AbstractC5469l.m23024a(this.f7020d, c2316a.f7020d) && AbstractC5469l.m23024a(this.f7021e, c2316a.f7021e);
    }

    public int hashCode() {
        Object obj = this.f7017a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC2392m interfaceC2392m = this.f7018b;
        int hashCode2 = (hashCode + (interfaceC2392m == null ? 0 : interfaceC2392m.hashCode())) * 31;
        InterfaceC0800l interfaceC0800l = this.f7019c;
        int hashCode3 = (hashCode2 + (interfaceC0800l == null ? 0 : interfaceC0800l.hashCode())) * 31;
        Object obj2 = this.f7020d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f7021e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f7017a + ", cancelHandler=" + this.f7018b + ", onCancellation=" + this.f7019c + ", idempotentResume=" + this.f7020d + ", cancelCause=" + this.f7021e + ')';
    }

    public /* synthetic */ C2316A(Object obj, InterfaceC2392m interfaceC2392m, InterfaceC0800l interfaceC0800l, Object obj2, Throwable th, int i7, AbstractC5464g abstractC5464g) {
        this(obj, (i7 & 2) != 0 ? null : interfaceC2392m, (i7 & 4) != 0 ? null : interfaceC0800l, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : th);
    }
}
