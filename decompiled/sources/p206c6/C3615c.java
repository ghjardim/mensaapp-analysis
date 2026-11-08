package p206c6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6934q;

/* renamed from: c6.c */
/* loaded from: classes2.dex */
public class C3615c extends AbstractC3610W {

    /* renamed from: i */
    public static final a f12094i = new a(null);

    /* renamed from: j */
    public static final ReentrantLock f12095j;

    /* renamed from: k */
    public static final Condition f12096k;

    /* renamed from: l */
    public static final long f12097l;

    /* renamed from: m */
    public static final long f12098m;

    /* renamed from: n */
    public static C3615c f12099n;

    /* renamed from: f */
    public boolean f12100f;

    /* renamed from: g */
    public C3615c f12101g;

    /* renamed from: h */
    public long f12102h;

    /* renamed from: c6.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: c */
        public final C3615c m14594c() {
            C3615c c3615c = C3615c.f12099n;
            AbstractC5469l.m23025b(c3615c);
            C3615c c3615c2 = c3615c.f12101g;
            if (c3615c2 == null) {
                long nanoTime = System.nanoTime();
                m14596e().await(C3615c.f12097l, TimeUnit.MILLISECONDS);
                C3615c c3615c3 = C3615c.f12099n;
                AbstractC5469l.m23025b(c3615c3);
                if (c3615c3.f12101g != null || System.nanoTime() - nanoTime < C3615c.f12098m) {
                    return null;
                }
                return C3615c.f12099n;
            }
            long m14589u = c3615c2.m14589u(System.nanoTime());
            if (m14589u > 0) {
                m14596e().await(m14589u, TimeUnit.NANOSECONDS);
                return null;
            }
            C3615c c3615c4 = C3615c.f12099n;
            AbstractC5469l.m23025b(c3615c4);
            c3615c4.f12101g = c3615c2.f12101g;
            c3615c2.f12101g = null;
            return c3615c2;
        }

        /* renamed from: d */
        public final boolean m14595d(C3615c c3615c) {
            ReentrantLock m14597f = C3615c.f12094i.m14597f();
            m14597f.lock();
            try {
                if (!c3615c.f12100f) {
                    return false;
                }
                c3615c.f12100f = false;
                for (C3615c c3615c2 = C3615c.f12099n; c3615c2 != null; c3615c2 = c3615c2.f12101g) {
                    if (c3615c2.f12101g == c3615c) {
                        c3615c2.f12101g = c3615c.f12101g;
                        c3615c.f12101g = null;
                        return false;
                    }
                }
                m14597f.unlock();
                return true;
            } finally {
                m14597f.unlock();
            }
        }

        /* renamed from: e */
        public final Condition m14596e() {
            return C3615c.f12096k;
        }

        /* renamed from: f */
        public final ReentrantLock m14597f() {
            return C3615c.f12095j;
        }

        /* renamed from: g */
        public final void m14598g(C3615c c3615c, long j7, boolean z6) {
            ReentrantLock m14597f = C3615c.f12094i.m14597f();
            m14597f.lock();
            try {
                if (c3615c.f12100f) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                c3615c.f12100f = true;
                if (C3615c.f12099n == null) {
                    C3615c.f12099n = new C3615c();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j7 != 0 && z6) {
                    c3615c.f12102h = Math.min(j7, c3615c.m14551a() - nanoTime) + nanoTime;
                } else if (j7 != 0) {
                    c3615c.f12102h = j7 + nanoTime;
                } else {
                    if (!z6) {
                        throw new AssertionError();
                    }
                    c3615c.f12102h = c3615c.m14551a();
                }
                long m14589u = c3615c.m14589u(nanoTime);
                C3615c c3615c2 = C3615c.f12099n;
                AbstractC5469l.m23025b(c3615c2);
                while (c3615c2.f12101g != null) {
                    C3615c c3615c3 = c3615c2.f12101g;
                    AbstractC5469l.m23025b(c3615c3);
                    if (m14589u < c3615c3.m14589u(nanoTime)) {
                        break;
                    }
                    c3615c2 = c3615c2.f12101g;
                    AbstractC5469l.m23025b(c3615c2);
                }
                c3615c.f12101g = c3615c2.f12101g;
                c3615c2.f12101g = c3615c;
                if (c3615c2 == C3615c.f12099n) {
                    C3615c.f12094i.m14596e().signal();
                }
                C6934q c6934q = C6934q.f24811a;
                m14597f.unlock();
            } catch (Throwable th) {
                m14597f.unlock();
                throw th;
            }
        }

        public a() {
        }
    }

    /* renamed from: c6.c$b */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock m14597f;
            C3615c m14594c;
            while (true) {
                try {
                    a aVar = C3615c.f12094i;
                    m14597f = aVar.m14597f();
                    m14597f.lock();
                    try {
                        m14594c = aVar.m14594c();
                    } finally {
                        m14597f.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (m14594c == C3615c.f12099n) {
                    C3615c.f12099n = null;
                    return;
                }
                C6934q c6934q = C6934q.f24811a;
                m14597f.unlock();
                if (m14594c != null) {
                    m14594c.mo14550x();
                }
            }
        }
    }

    /* renamed from: c6.c$c */
    public static final class c implements InterfaceC3607T {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC3607T f12104b;

        public c(InterfaceC3607T interfaceC3607T) {
            this.f12104b = interfaceC3607T;
        }

        @Override // p206c6.InterfaceC3607T, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3615c c3615c = C3615c.this;
            InterfaceC3607T interfaceC3607T = this.f12104b;
            c3615c.m14587r();
            try {
                interfaceC3607T.close();
                C6934q c6934q = C6934q.f24811a;
                if (c3615c.m14588s()) {
                    throw c3615c.m14586l(null);
                }
            } catch (IOException e7) {
                if (!c3615c.m14588s()) {
                    throw e7;
                }
                throw c3615c.m14586l(e7);
            } finally {
                c3615c.m14588s();
            }
        }

        @Override // p206c6.InterfaceC3607T, java.io.Flushable
        public void flush() {
            C3615c c3615c = C3615c.this;
            InterfaceC3607T interfaceC3607T = this.f12104b;
            c3615c.m14587r();
            try {
                interfaceC3607T.flush();
                C6934q c6934q = C6934q.f24811a;
                if (c3615c.m14588s()) {
                    throw c3615c.m14586l(null);
                }
            } catch (IOException e7) {
                if (!c3615c.m14588s()) {
                    throw e7;
                }
                throw c3615c.m14586l(e7);
            } finally {
                c3615c.m14588s();
            }
        }

        @Override // p206c6.InterfaceC3607T
        /* renamed from: s */
        public void mo14482s(C3616d source, long j7) {
            AbstractC5469l.m23028e(source, "source");
            AbstractC3614b.m14567b(source.m14618c0(), 0L, j7);
            while (true) {
                long j8 = 0;
                if (j7 <= 0) {
                    return;
                }
                C3604P c3604p = source.f12107a;
                AbstractC5469l.m23025b(c3604p);
                while (true) {
                    if (j8 >= 65536) {
                        break;
                    }
                    j8 += c3604p.f12066c - c3604p.f12065b;
                    if (j8 >= j7) {
                        j8 = j7;
                        break;
                    } else {
                        c3604p = c3604p.f12069f;
                        AbstractC5469l.m23025b(c3604p);
                    }
                }
                C3615c c3615c = C3615c.this;
                InterfaceC3607T interfaceC3607T = this.f12104b;
                c3615c.m14587r();
                try {
                    interfaceC3607T.mo14482s(source, j8);
                    C6934q c6934q = C6934q.f24811a;
                    if (c3615c.m14588s()) {
                        throw c3615c.m14586l(null);
                    }
                    j7 -= j8;
                } catch (IOException e7) {
                    if (!c3615c.m14588s()) {
                        throw e7;
                    }
                    throw c3615c.m14586l(e7);
                } finally {
                    c3615c.m14588s();
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f12104b + ')';
        }
    }

    /* renamed from: c6.c$d */
    public static final class d implements InterfaceC3609V {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC3609V f12106b;

        public d(InterfaceC3609V interfaceC3609V) {
            this.f12106b = interfaceC3609V;
        }

        @Override // p206c6.InterfaceC3609V
        /* renamed from: P */
        public long mo14512P(C3616d sink, long j7) {
            AbstractC5469l.m23028e(sink, "sink");
            C3615c c3615c = C3615c.this;
            InterfaceC3609V interfaceC3609V = this.f12106b;
            c3615c.m14587r();
            try {
                long mo14512P = interfaceC3609V.mo14512P(sink, j7);
                if (c3615c.m14588s()) {
                    throw c3615c.m14586l(null);
                }
                return mo14512P;
            } catch (IOException e7) {
                if (c3615c.m14588s()) {
                    throw c3615c.m14586l(e7);
                }
                throw e7;
            } finally {
                c3615c.m14588s();
            }
        }

        @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            C3615c c3615c = C3615c.this;
            InterfaceC3609V interfaceC3609V = this.f12106b;
            c3615c.m14587r();
            try {
                interfaceC3609V.close();
                C6934q c6934q = C6934q.f24811a;
                if (c3615c.m14588s()) {
                    throw c3615c.m14586l(null);
                }
            } catch (IOException e7) {
                if (!c3615c.m14588s()) {
                    throw e7;
                }
                throw c3615c.m14586l(e7);
            } finally {
                c3615c.m14588s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f12106b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f12095j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC5469l.m23027d(newCondition, "lock.newCondition()");
        f12096k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f12097l = millis;
        f12098m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: l */
    public final IOException m14586l(IOException iOException) {
        return mo14549t(iOException);
    }

    /* renamed from: r */
    public final void m14587r() {
        long m14554d = m14554d();
        boolean m14552b = m14552b();
        if (m14554d != 0 || m14552b) {
            f12094i.m14598g(this, m14554d, m14552b);
        }
    }

    /* renamed from: s */
    public final boolean m14588s() {
        return f12094i.m14595d(this);
    }

    /* renamed from: t */
    public IOException mo14549t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: u */
    public final long m14589u(long j7) {
        return this.f12102h - j7;
    }

    /* renamed from: v */
    public final InterfaceC3607T m14590v(InterfaceC3607T sink) {
        AbstractC5469l.m23028e(sink, "sink");
        return new c(sink);
    }

    /* renamed from: w */
    public final InterfaceC3609V m14591w(InterfaceC3609V source) {
        AbstractC5469l.m23028e(source, "source");
        return new d(source);
    }

    /* renamed from: x */
    public void mo14550x() {
    }
}
