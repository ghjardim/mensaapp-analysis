package p146U5;

import kotlin.jvm.internal.AbstractC5481x;
import p069J5.InterfaceC0800l;
import p146U5.AbstractC2590h;
import p167X5.AbstractC2880y;
import p167X5.C2855P;
import p371w5.AbstractC6918a;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: U5.o */
/* loaded from: classes2.dex */
public class C2597o extends C2584b {

    /* renamed from: t */
    public final int f7614t;

    /* renamed from: u */
    public final EnumC2583a f7615u;

    public C2597o(int i7, EnumC2583a enumC2583a, InterfaceC0800l interfaceC0800l) {
        super(i7, interfaceC0800l);
        this.f7614t = i7;
        this.f7615u = enumC2583a;
        if (enumC2583a == EnumC2583a.f7562a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC5481x.m23040b(C2584b.class).mo7022b() + " instead").toString());
        }
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i7 + " was specified").toString());
    }

    /* renamed from: Q0 */
    public static /* synthetic */ Object m8875Q0(C2597o c2597o, Object obj, InterfaceC7157e interfaceC7157e) {
        C2855P m10398d;
        Object m8877S0 = c2597o.m8877S0(obj, true);
        if (!(m8877S0 instanceof AbstractC2590h.a)) {
            return C6934q.f24811a;
        }
        AbstractC2590h.m8851c(m8877S0);
        InterfaceC0800l interfaceC0800l = c2597o.f7577b;
        if (interfaceC0800l == null || (m10398d = AbstractC2880y.m10398d(interfaceC0800l, obj, null, 2, null)) == null) {
            throw c2597o.m8763S();
        }
        AbstractC6918a.m28362a(m10398d, c2597o.m8763S());
        throw m10398d;
    }

    /* renamed from: R0 */
    public final Object m8876R0(Object obj, boolean z6) {
        InterfaceC0800l interfaceC0800l;
        C2855P m10398d;
        Object mo8787p = super.mo8787p(obj);
        if (AbstractC2590h.m8854f(mo8787p) || AbstractC2590h.m8853e(mo8787p)) {
            return mo8787p;
        }
        if (!z6 || (interfaceC0800l = this.f7577b) == null || (m10398d = AbstractC2880y.m10398d(interfaceC0800l, obj, null, 2, null)) == null) {
            return AbstractC2590h.f7609a.m8857c(C6934q.f24811a);
        }
        throw m10398d;
    }

    /* renamed from: S0 */
    public final Object m8877S0(Object obj, boolean z6) {
        return this.f7615u == EnumC2583a.f7564c ? m8876R0(obj, z6) : m8748G0(obj);
    }

    @Override // p146U5.C2584b, p146U5.InterfaceC2602t
    /* renamed from: d */
    public Object mo8771d(Object obj, InterfaceC7157e interfaceC7157e) {
        return m8875Q0(this, obj, interfaceC7157e);
    }

    @Override // p146U5.C2584b
    /* renamed from: g0 */
    public boolean mo8777g0() {
        return this.f7615u == EnumC2583a.f7563b;
    }

    @Override // p146U5.C2584b, p146U5.InterfaceC2602t
    /* renamed from: p */
    public Object mo8787p(Object obj) {
        return m8877S0(obj, false);
    }
}
