package p253i5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.C2937t;
import p253i5.InterfaceC4632t;

/* renamed from: i5.W */
/* loaded from: classes2.dex */
public class C4588W {

    /* renamed from: g */
    public static final Logger f16665g = Logger.getLogger(C4588W.class.getName());

    /* renamed from: a */
    public final long f16666a;

    /* renamed from: b */
    public final C2937t f16667b;

    /* renamed from: c */
    public Map f16668c = new LinkedHashMap();

    /* renamed from: d */
    public boolean f16669d;

    /* renamed from: e */
    public Throwable f16670e;

    /* renamed from: f */
    public long f16671f;

    /* renamed from: i5.W$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4632t.a f16672a;

        /* renamed from: b */
        public final /* synthetic */ long f16673b;

        public a(InterfaceC4632t.a aVar, long j7) {
            this.f16672a = aVar;
            this.f16673b = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16672a.mo19858b(this.f16673b);
        }
    }

    /* renamed from: i5.W$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4632t.a f16674a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f16675b;

        public b(InterfaceC4632t.a aVar, Throwable th) {
            this.f16674a = aVar;
            this.f16675b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16674a.mo19857a(this.f16675b);
        }
    }

    public C4588W(long j7, C2937t c2937t) {
        this.f16666a = j7;
        this.f16667b = c2937t;
    }

    /* renamed from: b */
    public static Runnable m19685b(InterfaceC4632t.a aVar, long j7) {
        return new a(aVar, j7);
    }

    /* renamed from: c */
    public static Runnable m19686c(InterfaceC4632t.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    /* renamed from: e */
    public static void m19687e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f16665g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /* renamed from: g */
    public static void m19688g(InterfaceC4632t.a aVar, Executor executor, Throwable th) {
        m19687e(executor, m19686c(aVar, th));
    }

    /* renamed from: a */
    public void m19689a(InterfaceC4632t.a aVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f16669d) {
                    this.f16668c.put(aVar, executor);
                } else {
                    Throwable th = this.f16670e;
                    m19687e(executor, th != null ? m19686c(aVar, th) : m19685b(aVar, this.f16671f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public boolean m19690d() {
        synchronized (this) {
            try {
                if (this.f16669d) {
                    return false;
                }
                this.f16669d = true;
                long m10603d = this.f16667b.m10603d(TimeUnit.NANOSECONDS);
                this.f16671f = m10603d;
                Map map = this.f16668c;
                this.f16668c = null;
                for (Map.Entry entry : map.entrySet()) {
                    m19687e((Executor) entry.getValue(), m19685b((InterfaceC4632t.a) entry.getKey(), m10603d));
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void m19691f(Throwable th) {
        synchronized (this) {
            try {
                if (this.f16669d) {
                    return;
                }
                this.f16669d = true;
                this.f16670e = th;
                Map map = this.f16668c;
                this.f16668c = null;
                for (Map.Entry entry : map.entrySet()) {
                    m19688g((InterfaceC4632t.a) entry.getKey(), (Executor) entry.getValue(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public long m19692h() {
        return this.f16666a;
    }
}
