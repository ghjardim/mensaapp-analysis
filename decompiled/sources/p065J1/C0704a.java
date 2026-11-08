package p065J1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p042G.InterfaceC0339a;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2388k;
import p132S5.AbstractC2393m0;
import p132S5.InterfaceC2334J;
import p132S5.InterfaceC2409u0;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2632e;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: J1.a */
/* loaded from: classes.dex */
public final class C0704a {

    /* renamed from: a */
    public final ReentrantLock f2471a = new ReentrantLock();

    /* renamed from: b */
    public final Map f2472b = new LinkedHashMap();

    /* renamed from: J1.a$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f2473a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC2631d f2474b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC0339a f2475c;

        /* renamed from: J1.a$a$a, reason: collision with other inner class name */
        public static final class C7172a implements InterfaceC2632e {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC0339a f2476a;

            public C7172a(InterfaceC0339a interfaceC0339a) {
                this.f2476a = interfaceC0339a;
            }

            @Override // p153V5.InterfaceC2632e
            /* renamed from: e */
            public final Object mo2989e(Object obj, InterfaceC7157e interfaceC7157e) {
                this.f2476a.accept(obj);
                return C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2631d interfaceC2631d, InterfaceC0339a interfaceC0339a, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f2474b = interfaceC2631d;
            this.f2475c = interfaceC0339a;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new a(this.f2474b, this.f2475c, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f2473a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                InterfaceC2631d interfaceC2631d = this.f2474b;
                C7172a c7172a = new C7172a(this.f2475c);
                this.f2473a = 1;
                if (interfaceC2631d.mo7083a(c7172a, this) == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return C6934q.f24811a;
        }
    }

    /* renamed from: a */
    public final void m2986a(Executor executor, InterfaceC0339a consumer, InterfaceC2631d flow) {
        InterfaceC2409u0 m8128d;
        AbstractC5469l.m23028e(executor, "executor");
        AbstractC5469l.m23028e(consumer, "consumer");
        AbstractC5469l.m23028e(flow, "flow");
        ReentrantLock reentrantLock = this.f2471a;
        reentrantLock.lock();
        try {
            if (this.f2472b.get(consumer) == null) {
                InterfaceC2334J m7996a = AbstractC2336K.m7996a(AbstractC2393m0.m8134a(executor));
                Map map = this.f2472b;
                m8128d = AbstractC2388k.m8128d(m7996a, null, null, new a(flow, consumer, null), 3, null);
                map.put(consumer, m8128d);
            }
            C6934q c6934q = C6934q.f24811a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2987b(InterfaceC0339a consumer) {
        AbstractC5469l.m23028e(consumer, "consumer");
        ReentrantLock reentrantLock = this.f2471a;
        reentrantLock.lock();
        try {
            InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) this.f2472b.get(consumer);
            if (interfaceC2409u0 != null) {
                InterfaceC2409u0.a.m8180b(interfaceC2409u0, null, 1, null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
