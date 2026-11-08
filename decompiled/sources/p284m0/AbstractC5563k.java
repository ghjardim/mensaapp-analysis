package p284m0;

import java.util.ArrayDeque;
import p259j0.AbstractC5332a;

/* renamed from: m0.k */
/* loaded from: classes.dex */
public abstract class AbstractC5563k implements InterfaceC5559g {

    /* renamed from: a */
    public final Thread f20088a;

    /* renamed from: e */
    public final C5561i[] f20092e;

    /* renamed from: f */
    public final AbstractC5562j[] f20093f;

    /* renamed from: g */
    public int f20094g;

    /* renamed from: h */
    public int f20095h;

    /* renamed from: i */
    public C5561i f20096i;

    /* renamed from: j */
    public AbstractC5560h f20097j;

    /* renamed from: k */
    public boolean f20098k;

    /* renamed from: l */
    public boolean f20099l;

    /* renamed from: m */
    public int f20100m;

    /* renamed from: b */
    public final Object f20089b = new Object();

    /* renamed from: n */
    public long f20101n = -9223372036854775807L;

    /* renamed from: c */
    public final ArrayDeque f20090c = new ArrayDeque();

    /* renamed from: d */
    public final ArrayDeque f20091d = new ArrayDeque();

    /* renamed from: m0.k$a */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AbstractC5563k.this.m23306v();
        }
    }

    public AbstractC5563k(C5561i[] c5561iArr, AbstractC5562j[] abstractC5562jArr) {
        this.f20092e = c5561iArr;
        this.f20094g = c5561iArr.length;
        for (int i7 = 0; i7 < this.f20094g; i7++) {
            this.f20092e[i7] = mo19236i();
        }
        this.f20093f = abstractC5562jArr;
        this.f20095h = abstractC5562jArr.length;
        for (int i8 = 0; i8 < this.f20095h; i8++) {
            this.f20093f[i8] = mo19237j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f20088a = aVar;
        aVar.start();
    }

    @Override // p284m0.InterfaceC5559g
    /* renamed from: b */
    public final void mo22058b(long j7) {
        boolean z6;
        synchronized (this.f20089b) {
            try {
                if (this.f20094g != this.f20092e.length && !this.f20098k) {
                    z6 = false;
                    AbstractC5332a.m21802g(z6);
                    this.f20101n = j7;
                }
                z6 = true;
                AbstractC5332a.m21802g(z6);
                this.f20101n = j7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p284m0.InterfaceC5559g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void mo22060f(C5561i c5561i) {
        synchronized (this.f20089b) {
            m23302r();
            AbstractC5332a.m21796a(c5561i == this.f20096i);
            this.f20090c.addLast(c5561i);
            m23301q();
            this.f20096i = null;
        }
    }

    @Override // p284m0.InterfaceC5559g
    public final void flush() {
        synchronized (this.f20089b) {
            try {
                this.f20098k = true;
                this.f20100m = 0;
                C5561i c5561i = this.f20096i;
                if (c5561i != null) {
                    m23303s(c5561i);
                    this.f20096i = null;
                }
                while (!this.f20090c.isEmpty()) {
                    m23303s((C5561i) this.f20090c.removeFirst());
                }
                while (!this.f20091d.isEmpty()) {
                    ((AbstractC5562j) this.f20091d.removeFirst()).mo19242r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final boolean m23296h() {
        return !this.f20090c.isEmpty() && this.f20095h > 0;
    }

    /* renamed from: i */
    public abstract C5561i mo19236i();

    /* renamed from: j */
    public abstract AbstractC5562j mo19237j();

    /* renamed from: k */
    public abstract AbstractC5560h mo19238k(Throwable th);

    /* renamed from: l */
    public abstract AbstractC5560h mo19239l(C5561i c5561i, AbstractC5562j abstractC5562j, boolean z6);

    /* renamed from: m */
    public final boolean m23297m() {
        AbstractC5560h mo19238k;
        synchronized (this.f20089b) {
            while (!this.f20099l && !m23296h()) {
                try {
                    this.f20089b.wait();
                } finally {
                }
            }
            if (this.f20099l) {
                return false;
            }
            C5561i c5561i = (C5561i) this.f20090c.removeFirst();
            AbstractC5562j[] abstractC5562jArr = this.f20093f;
            int i7 = this.f20095h - 1;
            this.f20095h = i7;
            AbstractC5562j abstractC5562j = abstractC5562jArr[i7];
            boolean z6 = this.f20098k;
            this.f20098k = false;
            if (c5561i.m23275m()) {
                abstractC5562j.m23272i(4);
            } else {
                abstractC5562j.f20085b = c5561i.f20079f;
                if (c5561i.m23276n()) {
                    abstractC5562j.m23272i(134217728);
                }
                if (!m23300p(c5561i.f20079f)) {
                    abstractC5562j.f20087d = true;
                }
                try {
                    mo19238k = mo19239l(c5561i, abstractC5562j, z6);
                } catch (OutOfMemoryError e7) {
                    mo19238k = mo19238k(e7);
                } catch (RuntimeException e8) {
                    mo19238k = mo19238k(e8);
                }
                if (mo19238k != null) {
                    synchronized (this.f20089b) {
                        this.f20097j = mo19238k;
                    }
                    return false;
                }
            }
            synchronized (this.f20089b) {
                try {
                    if (this.f20098k) {
                        abstractC5562j.mo19242r();
                    } else if (abstractC5562j.f20087d) {
                        this.f20100m++;
                        abstractC5562j.mo19242r();
                    } else {
                        abstractC5562j.f20086c = this.f20100m;
                        this.f20100m = 0;
                        this.f20091d.addLast(abstractC5562j);
                    }
                    m23303s(c5561i);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // p284m0.InterfaceC5559g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C5561i mo22059e() {
        C5561i c5561i;
        synchronized (this.f20089b) {
            m23302r();
            AbstractC5332a.m21802g(this.f20096i == null);
            int i7 = this.f20094g;
            if (i7 == 0) {
                c5561i = null;
            } else {
                C5561i[] c5561iArr = this.f20092e;
                int i8 = i7 - 1;
                this.f20094g = i8;
                c5561i = c5561iArr[i8];
            }
            this.f20096i = c5561i;
        }
        return c5561i;
    }

    @Override // p284m0.InterfaceC5559g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final AbstractC5562j mo21993a() {
        synchronized (this.f20089b) {
            try {
                m23302r();
                if (this.f20091d.isEmpty()) {
                    return null;
                }
                return (AbstractC5562j) this.f20091d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public final boolean m23300p(long j7) {
        boolean z6;
        synchronized (this.f20089b) {
            long j8 = this.f20101n;
            z6 = j8 == -9223372036854775807L || j7 >= j8;
        }
        return z6;
    }

    /* renamed from: q */
    public final void m23301q() {
        if (m23296h()) {
            this.f20089b.notify();
        }
    }

    /* renamed from: r */
    public final void m23302r() {
        AbstractC5560h abstractC5560h = this.f20097j;
        if (abstractC5560h != null) {
            throw abstractC5560h;
        }
    }

    @Override // p284m0.InterfaceC5559g
    public void release() {
        synchronized (this.f20089b) {
            this.f20099l = true;
            this.f20089b.notify();
        }
        try {
            this.f20088a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: s */
    public final void m23303s(C5561i c5561i) {
        c5561i.mo19253j();
        C5561i[] c5561iArr = this.f20092e;
        int i7 = this.f20094g;
        this.f20094g = i7 + 1;
        c5561iArr[i7] = c5561i;
    }

    /* renamed from: t */
    public void m23304t(AbstractC5562j abstractC5562j) {
        synchronized (this.f20089b) {
            m23305u(abstractC5562j);
            m23301q();
        }
    }

    /* renamed from: u */
    public final void m23305u(AbstractC5562j abstractC5562j) {
        abstractC5562j.mo19253j();
        AbstractC5562j[] abstractC5562jArr = this.f20093f;
        int i7 = this.f20095h;
        this.f20095h = i7 + 1;
        abstractC5562jArr[i7] = abstractC5562j;
    }

    /* renamed from: v */
    public final void m23306v() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (m23297m());
    }

    /* renamed from: w */
    public final void m23307w(int i7) {
        AbstractC5332a.m21802g(this.f20094g == this.f20092e.length);
        for (C5561i c5561i : this.f20092e) {
            c5561i.m23290s(i7);
        }
    }
}
