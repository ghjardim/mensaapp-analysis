package p198b6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5470m;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0805q;
import p132S5.AbstractC2328G;
import p132S5.AbstractC2342N;
import p132S5.AbstractC2400q;
import p132S5.C2396o;
import p132S5.InterfaceC2366Z0;
import p132S5.InterfaceC2394n;
import p167X5.AbstractC2843D;
import p167X5.C2846G;
import p189a6.InterfaceC3184e;
import p207d.AbstractC4094d;
import p350u.AbstractC6581b;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: b6.b */
/* loaded from: classes2.dex */
public class C3557b extends C3559d implements InterfaceC3556a {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11990i = AtomicReferenceFieldUpdater.newUpdater(C3557b.class, Object.class, "owner$volatile");

    /* renamed from: h */
    public final InterfaceC0805q f11991h;
    private volatile /* synthetic */ Object owner$volatile;

    /* renamed from: b6.b$a */
    public final class a implements InterfaceC2394n, InterfaceC2366Z0 {

        /* renamed from: a */
        public final C2396o f11992a;

        /* renamed from: b */
        public final Object f11993b;

        /* renamed from: b6.b$a$a, reason: collision with other inner class name */
        public static final class C7213a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public final /* synthetic */ C3557b f11995a;

            /* renamed from: b */
            public final /* synthetic */ a f11996b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7213a(C3557b c3557b, a aVar) {
                super(1);
                this.f11995a = c3557b;
                this.f11996b = aVar;
            }

            /* renamed from: a */
            public final void m14349a(Throwable th) {
                this.f11995a.mo14336c(this.f11996b.f11993b);
            }

            @Override // p069J5.InterfaceC0800l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14349a((Throwable) obj);
                return C6934q.f24811a;
            }
        }

        /* renamed from: b6.b$a$b */
        public static final class b extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public final /* synthetic */ C3557b f11997a;

            /* renamed from: b */
            public final /* synthetic */ a f11998b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3557b c3557b, a aVar) {
                super(1);
                this.f11997a = c3557b;
                this.f11998b = aVar;
            }

            /* renamed from: a */
            public final void m14350a(Throwable th) {
                C3557b.m14340s().set(this.f11997a, this.f11998b.f11993b);
                this.f11997a.mo14336c(this.f11998b.f11993b);
            }

            @Override // p069J5.InterfaceC0800l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14350a((Throwable) obj);
                return C6934q.f24811a;
            }
        }

        public a(C2396o c2396o, Object obj) {
            this.f11992a = c2396o;
            this.f11993b = obj;
        }

        @Override // p132S5.InterfaceC2394n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo8136f(C6934q c6934q, InterfaceC0800l interfaceC0800l) {
            C3557b.m14340s().set(C3557b.this, this.f11993b);
            this.f11992a.mo8136f(c6934q, new C7213a(C3557b.this, this));
        }

        @Override // p132S5.InterfaceC2366Z0
        /* renamed from: b */
        public void mo8056b(AbstractC2843D abstractC2843D, int i7) {
            this.f11992a.mo8056b(abstractC2843D, i7);
        }

        @Override // p132S5.InterfaceC2394n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo8138n(AbstractC2328G abstractC2328G, C6934q c6934q) {
            this.f11992a.mo8138n(abstractC2328G, c6934q);
        }

        @Override // p132S5.InterfaceC2394n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object mo8140q(C6934q c6934q, Object obj, InterfaceC0800l interfaceC0800l) {
            Object mo8140q = this.f11992a.mo8140q(c6934q, obj, new b(C3557b.this, this));
            if (mo8140q != null) {
                C3557b.m14340s().set(C3557b.this, this.f11993b);
            }
            return mo8140q;
        }

        @Override // p392z5.InterfaceC7157e
        public InterfaceC7161i getContext() {
            return this.f11992a.getContext();
        }

        @Override // p132S5.InterfaceC2394n
        /* renamed from: i */
        public Object mo8137i(Throwable th) {
            return this.f11992a.mo8137i(th);
        }

        @Override // p132S5.InterfaceC2394n
        public boolean isCompleted() {
            return this.f11992a.isCompleted();
        }

        @Override // p132S5.InterfaceC2394n
        /* renamed from: o */
        public void mo8139o(InterfaceC0800l interfaceC0800l) {
            this.f11992a.mo8139o(interfaceC0800l);
        }

        @Override // p392z5.InterfaceC7157e
        public void resumeWith(Object obj) {
            this.f11992a.resumeWith(obj);
        }

        @Override // p132S5.InterfaceC2394n
        /* renamed from: t */
        public void mo8141t(Object obj) {
            this.f11992a.mo8141t(obj);
        }
    }

    /* renamed from: b6.b$b */
    public static final class b extends AbstractC5470m implements InterfaceC0805q {

        /* renamed from: b6.b$b$a */
        public static final class a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public final /* synthetic */ C3557b f12000a;

            /* renamed from: b */
            public final /* synthetic */ Object f12001b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3557b c3557b, Object obj) {
                super(1);
                this.f12000a = c3557b;
                this.f12001b = obj;
            }

            /* renamed from: a */
            public final void m14352a(Throwable th) {
                this.f12000a.mo14336c(this.f12001b);
            }

            @Override // p069J5.InterfaceC0800l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14352a((Throwable) obj);
                return C6934q.f24811a;
            }
        }

        public b() {
            super(3);
        }

        /* renamed from: a */
        public final InterfaceC0800l m14351a(InterfaceC3184e interfaceC3184e, Object obj, Object obj2) {
            return new a(C3557b.this, obj);
        }

        @Override // p069J5.InterfaceC0805q
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo3350c(Object obj, Object obj2, Object obj3) {
            AbstractC4094d.m17162a(obj);
            return m14351a(null, obj2, obj3);
        }
    }

    public C3557b(boolean z6) {
        super(1, z6 ? 1 : 0);
        this.owner$volatile = z6 ? null : AbstractC3558c.f12002a;
        this.f11991h = new b();
    }

    /* renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m14340s() {
        return f11990i;
    }

    /* renamed from: v */
    public static /* synthetic */ Object m14341v(C3557b c3557b, Object obj, InterfaceC7157e interfaceC7157e) {
        if (c3557b.mo14335b(obj)) {
            return C6934q.f24811a;
        }
        Object m14344w = c3557b.m14344w(obj, interfaceC7157e);
        return m14344w == AbstractC0024c.m76e() ? m14344w : C6934q.f24811a;
    }

    @Override // p198b6.InterfaceC3556a
    /* renamed from: a */
    public Object mo14334a(Object obj, InterfaceC7157e interfaceC7157e) {
        return m14341v(this, obj, interfaceC7157e);
    }

    @Override // p198b6.InterfaceC3556a
    /* renamed from: b */
    public boolean mo14335b(Object obj) {
        int m14345x = m14345x(obj);
        if (m14345x == 0) {
            return true;
        }
        if (m14345x == 1) {
            return false;
        }
        if (m14345x != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // p198b6.InterfaceC3556a
    /* renamed from: c */
    public void mo14336c(Object obj) {
        C2846G c2846g;
        C2846G c2846g2;
        while (m14343u()) {
            Object obj2 = f11990i.get(this);
            c2846g = AbstractC3558c.f12002a;
            if (obj2 != c2846g) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11990i;
                c2846g2 = AbstractC3558c.f12002a;
                if (AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, obj2, c2846g2)) {
                    m14366n();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* renamed from: t */
    public final int m14342t(Object obj) {
        C2846G c2846g;
        while (m14343u()) {
            Object obj2 = f11990i.get(this);
            c2846g = AbstractC3558c.f12002a;
            if (obj2 != c2846g) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public String toString() {
        return "Mutex@" + AbstractC2342N.m8005b(this) + "[isLocked=" + m14343u() + ",owner=" + f11990i.get(this) + ']';
    }

    /* renamed from: u */
    public boolean m14343u() {
        return m14365h() == 0;
    }

    /* renamed from: w */
    public final Object m14344w(Object obj, InterfaceC7157e interfaceC7157e) {
        C2396o m8174b = AbstractC2400q.m8174b(AbstractC0023b.m74c(interfaceC7157e));
        try {
            m14361d(new a(m8174b, obj));
            Object m8171y = m8174b.m8171y();
            if (m8171y == AbstractC0024c.m76e()) {
                AbstractC0064h.m164c(interfaceC7157e);
            }
            return m8171y == AbstractC0024c.m76e() ? m8171y : C6934q.f24811a;
        } catch (Throwable th) {
            m8174b.m8154M();
            throw th;
        }
    }

    /* renamed from: x */
    public final int m14345x(Object obj) {
        while (!m14367o()) {
            if (obj == null) {
                return 1;
            }
            int m14342t = m14342t(obj);
            if (m14342t == 1) {
                return 2;
            }
            if (m14342t == 2) {
                return 1;
            }
        }
        f11990i.set(this, obj);
        return 0;
    }
}
