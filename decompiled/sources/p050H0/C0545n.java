package p050H0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p259j0.AbstractC5323F;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: H0.n */
/* loaded from: classes.dex */
public final class C0545n implements InterfaceC0546o {

    /* renamed from: d */
    public static final c f1785d = m2096h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final c f1786e = m2096h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final c f1787f;

    /* renamed from: g */
    public static final c f1788g;

    /* renamed from: a */
    public final ExecutorService f1789a;

    /* renamed from: b */
    public d f1790b;

    /* renamed from: c */
    public IOException f1791c;

    /* renamed from: H0.n$b */
    public interface b {
        /* renamed from: k */
        void mo468k(e eVar, long j7, long j8, boolean z6);

        /* renamed from: m */
        c mo471m(e eVar, long j7, long j8, IOException iOException, int i7);

        /* renamed from: r */
        void mo473r(e eVar, long j7, long j8);
    }

    /* renamed from: H0.n$c */
    public static final class c {

        /* renamed from: a */
        public final int f1792a;

        /* renamed from: b */
        public final long f1793b;

        /* renamed from: c */
        public boolean m2108c() {
            int i7 = this.f1792a;
            return i7 == 0 || i7 == 1;
        }

        public c(int i7, long j7) {
            this.f1792a = i7;
            this.f1793b = j7;
        }
    }

    /* renamed from: H0.n$d */
    public final class d extends Handler implements Runnable {

        /* renamed from: a */
        public final int f1794a;

        /* renamed from: b */
        public final e f1795b;

        /* renamed from: c */
        public final long f1796c;

        /* renamed from: d */
        public b f1797d;

        /* renamed from: e */
        public IOException f1798e;

        /* renamed from: f */
        public int f1799f;

        /* renamed from: n */
        public Thread f1800n;

        /* renamed from: o */
        public boolean f1801o;

        /* renamed from: p */
        public volatile boolean f1802p;

        public d(Looper looper, e eVar, b bVar, int i7, long j7) {
            super(looper);
            this.f1795b = eVar;
            this.f1797d = bVar;
            this.f1794a = i7;
            this.f1796c = j7;
        }

        /* renamed from: a */
        public void m2109a(boolean z6) {
            this.f1802p = z6;
            this.f1798e = null;
            if (hasMessages(1)) {
                this.f1801o = true;
                removeMessages(1);
                if (!z6) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f1801o = true;
                        this.f1795b.mo482c();
                        Thread thread = this.f1800n;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z6) {
                m2111c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC5332a.m21800e(this.f1797d)).mo468k(this.f1795b, elapsedRealtime, elapsedRealtime - this.f1796c, true);
                this.f1797d = null;
            }
        }

        /* renamed from: b */
        public final void m2110b() {
            this.f1798e = null;
            C0545n.this.f1789a.execute((Runnable) AbstractC5332a.m21800e(C0545n.this.f1790b));
        }

        /* renamed from: c */
        public final void m2111c() {
            C0545n.this.f1790b = null;
        }

        /* renamed from: d */
        public final long m2112d() {
            return Math.min((this.f1799f - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000);
        }

        /* renamed from: e */
        public void m2113e(int i7) {
            IOException iOException = this.f1798e;
            if (iOException != null && this.f1799f > i7) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m2114f(long j7) {
            AbstractC5332a.m21802g(C0545n.this.f1790b == null);
            C0545n.this.f1790b = this;
            if (j7 > 0) {
                sendEmptyMessageDelayed(1, j7);
            } else {
                m2110b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f1802p) {
                return;
            }
            int i7 = message.what;
            if (i7 == 1) {
                m2110b();
                return;
            }
            if (i7 == 4) {
                throw ((Error) message.obj);
            }
            m2111c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = elapsedRealtime - this.f1796c;
            b bVar = (b) AbstractC5332a.m21800e(this.f1797d);
            if (this.f1801o) {
                bVar.mo468k(this.f1795b, elapsedRealtime, j7, false);
                return;
            }
            int i8 = message.what;
            if (i8 == 2) {
                try {
                    bVar.mo473r(this.f1795b, elapsedRealtime, j7);
                    return;
                } catch (RuntimeException e7) {
                    AbstractC5346o.m21863d("LoadTask", "Unexpected exception handling load completed", e7);
                    C0545n.this.f1791c = new h(e7);
                    return;
                }
            }
            if (i8 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f1798e = iOException;
            int i9 = this.f1799f + 1;
            this.f1799f = i9;
            c mo471m = bVar.mo471m(this.f1795b, elapsedRealtime, j7, iOException, i9);
            if (mo471m.f1792a == 3) {
                C0545n.this.f1791c = this.f1798e;
            } else if (mo471m.f1792a != 2) {
                if (mo471m.f1792a == 1) {
                    this.f1799f = 1;
                }
                m2114f(mo471m.f1793b != -9223372036854775807L ? mo471m.f1793b : m2112d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            try {
                synchronized (this) {
                    z6 = this.f1801o;
                    this.f1800n = Thread.currentThread();
                }
                if (!z6) {
                    AbstractC5323F.m21659a("load:" + this.f1795b.getClass().getSimpleName());
                    try {
                        this.f1795b.mo481b();
                        AbstractC5323F.m21660b();
                    } catch (Throwable th) {
                        AbstractC5323F.m21660b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f1800n = null;
                    Thread.interrupted();
                }
                if (this.f1802p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e7) {
                if (this.f1802p) {
                    return;
                }
                obtainMessage(3, e7).sendToTarget();
            } catch (Error e8) {
                if (!this.f1802p) {
                    AbstractC5346o.m21863d("LoadTask", "Unexpected error loading stream", e8);
                    obtainMessage(4, e8).sendToTarget();
                }
                throw e8;
            } catch (Exception e9) {
                if (this.f1802p) {
                    return;
                }
                AbstractC5346o.m21863d("LoadTask", "Unexpected exception loading stream", e9);
                obtainMessage(3, new h(e9)).sendToTarget();
            } catch (OutOfMemoryError e10) {
                if (this.f1802p) {
                    return;
                }
                AbstractC5346o.m21863d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new h(e10)).sendToTarget();
            }
        }
    }

    /* renamed from: H0.n$e */
    public interface e {
        /* renamed from: b */
        void mo481b();

        /* renamed from: c */
        void mo482c();
    }

    /* renamed from: H0.n$f */
    public interface f {
        /* renamed from: i */
        void mo464i();
    }

    /* renamed from: H0.n$g */
    public static final class g implements Runnable {

        /* renamed from: a */
        public final f f1804a;

        public g(f fVar) {
            this.f1804a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1804a.mo464i();
        }
    }

    /* renamed from: H0.n$h */
    public static final class h extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected "
                r0.append(r1)
                java.lang.Class r1 = r4.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = r4.getMessage()
                if (r1 == 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ": "
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L33
            L31:
                java.lang.String r1 = ""
            L33:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050H0.C0545n.h.<init>(java.lang.Throwable):void");
        }
    }

    static {
        long j7 = -9223372036854775807L;
        f1787f = new c(2, j7);
        f1788g = new c(3, j7);
    }

    public C0545n(String str) {
        this.f1789a = AbstractC5330M.m21694L0("ExoPlayer:Loader:" + str);
    }

    /* renamed from: h */
    public static c m2096h(boolean z6, long j7) {
        return new c(z6 ? 1 : 0, j7);
    }

    @Override // p050H0.InterfaceC0546o
    /* renamed from: c */
    public void mo2097c() {
        m2102k(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void m2098f() {
        ((d) AbstractC5332a.m21804i(this.f1790b)).m2109a(false);
    }

    /* renamed from: g */
    public void m2099g() {
        this.f1791c = null;
    }

    /* renamed from: i */
    public boolean m2100i() {
        return this.f1791c != null;
    }

    /* renamed from: j */
    public boolean m2101j() {
        return this.f1790b != null;
    }

    /* renamed from: k */
    public void m2102k(int i7) {
        IOException iOException = this.f1791c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f1790b;
        if (dVar != null) {
            if (i7 == Integer.MIN_VALUE) {
                i7 = dVar.f1794a;
            }
            dVar.m2113e(i7);
        }
    }

    /* renamed from: l */
    public void m2103l() {
        m2104m(null);
    }

    /* renamed from: m */
    public void m2104m(f fVar) {
        d dVar = this.f1790b;
        if (dVar != null) {
            dVar.m2109a(true);
        }
        if (fVar != null) {
            this.f1789a.execute(new g(fVar));
        }
        this.f1789a.shutdown();
    }

    /* renamed from: n */
    public long m2105n(e eVar, b bVar, int i7) {
        Looper looper = (Looper) AbstractC5332a.m21804i(Looper.myLooper());
        this.f1791c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i7, elapsedRealtime).m2114f(0L);
        return elapsedRealtime;
    }
}
