package p206c6;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6934q;

/* renamed from: c6.h */
/* loaded from: classes2.dex */
public abstract class AbstractC3620h implements Closeable {

    /* renamed from: a */
    public final boolean f12122a;

    /* renamed from: b */
    public boolean f12123b;

    /* renamed from: c */
    public int f12124c;

    /* renamed from: d */
    public final ReentrantLock f12125d = AbstractC3612Y.m14562b();

    /* renamed from: c6.h$a */
    public static final class a implements InterfaceC3607T {

        /* renamed from: a */
        public final AbstractC3620h f12126a;

        /* renamed from: b */
        public long f12127b;

        /* renamed from: c */
        public boolean f12128c;

        public a(AbstractC3620h fileHandle, long j7) {
            AbstractC5469l.m23028e(fileHandle, "fileHandle");
            this.f12126a = fileHandle;
            this.f12127b = j7;
        }

        @Override // p206c6.InterfaceC3607T, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12128c) {
                return;
            }
            this.f12128c = true;
            ReentrantLock m14666j = this.f12126a.m14666j();
            m14666j.lock();
            try {
                AbstractC3620h abstractC3620h = this.f12126a;
                abstractC3620h.f12124c--;
                if (this.f12126a.f12124c == 0 && this.f12126a.f12123b) {
                    C6934q c6934q = C6934q.f24811a;
                    m14666j.unlock();
                    this.f12126a.mo14667m();
                }
            } finally {
                m14666j.unlock();
            }
        }

        @Override // p206c6.InterfaceC3607T, java.io.Flushable
        public void flush() {
            if (this.f12128c) {
                throw new IllegalStateException("closed");
            }
            this.f12126a.mo14668o();
        }

        @Override // p206c6.InterfaceC3607T
        /* renamed from: s */
        public void mo14482s(C3616d source, long j7) {
            AbstractC5469l.m23028e(source, "source");
            if (this.f12128c) {
                throw new IllegalStateException("closed");
            }
            this.f12126a.m14665K(this.f12127b, source, j7);
            this.f12127b += j7;
        }
    }

    /* renamed from: c6.h$b */
    public static final class b implements InterfaceC3609V {

        /* renamed from: a */
        public final AbstractC3620h f12129a;

        /* renamed from: b */
        public long f12130b;

        /* renamed from: c */
        public boolean f12131c;

        public b(AbstractC3620h fileHandle, long j7) {
            AbstractC5469l.m23028e(fileHandle, "fileHandle");
            this.f12129a = fileHandle;
            this.f12130b = j7;
        }

        @Override // p206c6.InterfaceC3609V
        /* renamed from: P */
        public long mo14512P(C3616d sink, long j7) {
            AbstractC5469l.m23028e(sink, "sink");
            if (this.f12131c) {
                throw new IllegalStateException("closed");
            }
            long m14672y = this.f12129a.m14672y(this.f12130b, sink, j7);
            if (m14672y != -1) {
                this.f12130b += m14672y;
            }
            return m14672y;
        }

        @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.f12131c) {
                return;
            }
            this.f12131c = true;
            ReentrantLock m14666j = this.f12129a.m14666j();
            m14666j.lock();
            try {
                AbstractC3620h abstractC3620h = this.f12129a;
                abstractC3620h.f12124c--;
                if (this.f12129a.f12124c == 0 && this.f12129a.f12123b) {
                    C6934q c6934q = C6934q.f24811a;
                    m14666j.unlock();
                    this.f12129a.mo14667m();
                }
            } finally {
                m14666j.unlock();
            }
        }
    }

    public AbstractC3620h(boolean z6) {
        this.f12122a = z6;
    }

    /* renamed from: D */
    public static /* synthetic */ InterfaceC3607T m14656D(AbstractC3620h abstractC3620h, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i7 & 1) != 0) {
            j7 = 0;
        }
        return abstractC3620h.m14662C(j7);
    }

    /* renamed from: C */
    public final InterfaceC3607T m14662C(long j7) {
        if (!this.f12122a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f12125d;
        reentrantLock.lock();
        try {
            if (this.f12123b) {
                throw new IllegalStateException("closed");
            }
            this.f12124c++;
            reentrantLock.unlock();
            return new a(this, j7);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: F */
    public final long m14663F() {
        ReentrantLock reentrantLock = this.f12125d;
        reentrantLock.lock();
        try {
            if (this.f12123b) {
                throw new IllegalStateException("closed");
            }
            C6934q c6934q = C6934q.f24811a;
            reentrantLock.unlock();
            return mo14670v();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: G */
    public final InterfaceC3609V m14664G(long j7) {
        ReentrantLock reentrantLock = this.f12125d;
        reentrantLock.lock();
        try {
            if (this.f12123b) {
                throw new IllegalStateException("closed");
            }
            this.f12124c++;
            reentrantLock.unlock();
            return new b(this, j7);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: K */
    public final void m14665K(long j7, C3616d c3616d, long j8) {
        AbstractC3614b.m14567b(c3616d.m14618c0(), 0L, j8);
        long j9 = j8 + j7;
        while (j7 < j9) {
            C3604P c3604p = c3616d.f12107a;
            AbstractC5469l.m23025b(c3604p);
            int min = (int) Math.min(j9 - j7, c3604p.f12066c - c3604p.f12065b);
            mo14671w(j7, c3604p.f12064a, c3604p.f12065b, min);
            c3604p.f12065b += min;
            long j10 = min;
            j7 += j10;
            c3616d.m14615T(c3616d.m14618c0() - j10);
            if (c3604p.f12065b == c3604p.f12066c) {
                c3616d.f12107a = c3604p.m14525b();
                C3605Q.m14530b(c3604p);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f12125d;
        reentrantLock.lock();
        try {
            if (this.f12123b) {
                return;
            }
            this.f12123b = true;
            if (this.f12124c != 0) {
                return;
            }
            C6934q c6934q = C6934q.f24811a;
            reentrantLock.unlock();
            mo14667m();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f12122a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f12125d;
        reentrantLock.lock();
        try {
            if (this.f12123b) {
                throw new IllegalStateException("closed");
            }
            C6934q c6934q = C6934q.f24811a;
            reentrantLock.unlock();
            mo14668o();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: j */
    public final ReentrantLock m14666j() {
        return this.f12125d;
    }

    /* renamed from: m */
    public abstract void mo14667m();

    /* renamed from: o */
    public abstract void mo14668o();

    /* renamed from: r */
    public abstract int mo14669r(long j7, byte[] bArr, int i7, int i8);

    /* renamed from: v */
    public abstract long mo14670v();

    /* renamed from: w */
    public abstract void mo14671w(long j7, byte[] bArr, int i7, int i8);

    /* renamed from: y */
    public final long m14672y(long j7, C3616d c3616d, long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        long j9 = j8 + j7;
        long j10 = j7;
        while (true) {
            if (j10 >= j9) {
                break;
            }
            C3604P m14624k0 = c3616d.m14624k0(1);
            int mo14669r = mo14669r(j10, m14624k0.f12064a, m14624k0.f12066c, (int) Math.min(j9 - j10, 8192 - r7));
            if (mo14669r == -1) {
                if (m14624k0.f12065b == m14624k0.f12066c) {
                    c3616d.f12107a = m14624k0.m14525b();
                    C3605Q.m14530b(m14624k0);
                }
                if (j7 == j10) {
                    return -1L;
                }
            } else {
                m14624k0.f12066c += mo14669r;
                long j11 = mo14669r;
                j10 += j11;
                c3616d.m14615T(c3616d.m14618c0() + j11);
            }
        }
        return j10 - j7;
    }
}
