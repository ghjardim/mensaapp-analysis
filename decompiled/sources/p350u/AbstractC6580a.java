package p350u;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;
import p211d3.InterfaceFutureC4115e;

/* renamed from: u.a */
/* loaded from: classes.dex */
public abstract class AbstractC6580a implements InterfaceFutureC4115e {

    /* renamed from: d */
    public static final boolean f23589d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f23590e = Logger.getLogger(AbstractC6580a.class.getName());

    /* renamed from: f */
    public static final b f23591f;

    /* renamed from: n */
    public static final Object f23592n;

    /* renamed from: a */
    public volatile Object f23593a;

    /* renamed from: b */
    public volatile e f23594b;

    /* renamed from: c */
    public volatile h f23595c;

    /* renamed from: u.a$b */
    public static abstract class b {
        public b() {
        }

        /* renamed from: a */
        public abstract boolean mo27336a(AbstractC6580a abstractC6580a, e eVar, e eVar2);

        /* renamed from: b */
        public abstract boolean mo27337b(AbstractC6580a abstractC6580a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo27338c(AbstractC6580a abstractC6580a, h hVar, h hVar2);

        /* renamed from: d */
        public abstract void mo27339d(h hVar, h hVar2);

        /* renamed from: e */
        public abstract void mo27340e(h hVar, Thread thread);
    }

    /* renamed from: u.a$c */
    public static final class c {

        /* renamed from: c */
        public static final c f23596c;

        /* renamed from: d */
        public static final c f23597d;

        /* renamed from: a */
        public final boolean f23598a;

        /* renamed from: b */
        public final Throwable f23599b;

        static {
            if (AbstractC6580a.f23589d) {
                f23597d = null;
                f23596c = null;
            } else {
                f23597d = new c(false, null);
                f23596c = new c(true, null);
            }
        }

        public c(boolean z6, Throwable th) {
            this.f23598a = z6;
            this.f23599b = th;
        }
    }

    /* renamed from: u.a$d */
    public static final class d {

        /* renamed from: b */
        public static final d f23600b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f23601a;

        /* renamed from: u.a$d$a */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f23601a = (Throwable) AbstractC6580a.m27320i(th);
        }
    }

    /* renamed from: u.a$e */
    public static final class e {

        /* renamed from: d */
        public static final e f23602d = new e(null, null);

        /* renamed from: a */
        public final Runnable f23603a;

        /* renamed from: b */
        public final Executor f23604b;

        /* renamed from: c */
        public e f23605c;

        public e(Runnable runnable, Executor executor) {
            this.f23603a = runnable;
            this.f23604b = executor;
        }
    }

    /* renamed from: u.a$f */
    public static final class f extends b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f23606a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f23607b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f23608c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f23609d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f23610e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f23606a = atomicReferenceFieldUpdater;
            this.f23607b = atomicReferenceFieldUpdater2;
            this.f23608c = atomicReferenceFieldUpdater3;
            this.f23609d = atomicReferenceFieldUpdater4;
            this.f23610e = atomicReferenceFieldUpdater5;
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: a */
        public boolean mo27336a(AbstractC6580a abstractC6580a, e eVar, e eVar2) {
            return AbstractC6581b.m27343a(this.f23609d, abstractC6580a, eVar, eVar2);
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: b */
        public boolean mo27337b(AbstractC6580a abstractC6580a, Object obj, Object obj2) {
            return AbstractC6581b.m27343a(this.f23610e, abstractC6580a, obj, obj2);
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: c */
        public boolean mo27338c(AbstractC6580a abstractC6580a, h hVar, h hVar2) {
            return AbstractC6581b.m27343a(this.f23608c, abstractC6580a, hVar, hVar2);
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: d */
        public void mo27339d(h hVar, h hVar2) {
            this.f23607b.lazySet(hVar, hVar2);
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: e */
        public void mo27340e(h hVar, Thread thread) {
            this.f23606a.lazySet(hVar, thread);
        }
    }

    /* renamed from: u.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: a */
        public boolean mo27336a(AbstractC6580a abstractC6580a, e eVar, e eVar2) {
            synchronized (abstractC6580a) {
                try {
                    if (abstractC6580a.f23594b != eVar) {
                        return false;
                    }
                    abstractC6580a.f23594b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: b */
        public boolean mo27337b(AbstractC6580a abstractC6580a, Object obj, Object obj2) {
            synchronized (abstractC6580a) {
                try {
                    if (abstractC6580a.f23593a != obj) {
                        return false;
                    }
                    abstractC6580a.f23593a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: c */
        public boolean mo27338c(AbstractC6580a abstractC6580a, h hVar, h hVar2) {
            synchronized (abstractC6580a) {
                try {
                    if (abstractC6580a.f23595c != hVar) {
                        return false;
                    }
                    abstractC6580a.f23595c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: d */
        public void mo27339d(h hVar, h hVar2) {
            hVar.f23613b = hVar2;
        }

        @Override // p350u.AbstractC6580a.b
        /* renamed from: e */
        public void mo27340e(h hVar, Thread thread) {
            hVar.f23612a = thread;
        }
    }

    /* renamed from: u.a$h */
    public static final class h {

        /* renamed from: c */
        public static final h f23611c = new h(false);

        /* renamed from: a */
        public volatile Thread f23612a;

        /* renamed from: b */
        public volatile h f23613b;

        public h(boolean z6) {
        }

        /* renamed from: a */
        public void m27341a(h hVar) {
            AbstractC6580a.f23591f.mo27339d(this, hVar);
        }

        /* renamed from: b */
        public void m27342b() {
            Thread thread = this.f23612a;
            if (thread != null) {
                this.f23612a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractC6580a.f23591f.mo27340e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6580a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6580a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6580a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f23591f = gVar;
        if (th != null) {
            f23590e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23592n = new Object();
    }

    /* renamed from: h */
    public static CancellationException m27319h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: i */
    public static Object m27320i(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: k */
    public static void m27321k(AbstractC6580a abstractC6580a) {
        abstractC6580a.m27330q();
        abstractC6580a.mo27325g();
        e m27326j = abstractC6580a.m27326j(null);
        while (m27326j != null) {
            e eVar = m27326j.f23605c;
            m27322l(m27326j.f23603a, m27326j.f23604b);
            m27326j = eVar;
        }
    }

    /* renamed from: l */
    public static void m27322l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f23590e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    /* renamed from: n */
    public static Object m27323n(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // p211d3.InterfaceFutureC4115e
    /* renamed from: b */
    public final void mo17292b(Runnable runnable, Executor executor) {
        m27320i(runnable);
        m27320i(executor);
        e eVar = this.f23594b;
        if (eVar != e.f23602d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f23605c = eVar;
                if (f23591f.mo27336a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f23594b;
                }
            } while (eVar != e.f23602d);
        }
        m27322l(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f23593a;
        if (obj == null) {
            if (f23591f.mo27337b(this, obj, f23589d ? new c(z6, new CancellationException("Future.cancel() was called.")) : z6 ? c.f23596c : c.f23597d)) {
                if (z6) {
                    m27328o();
                }
                m27321k(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m27324f(StringBuilder sb) {
        try {
            Object m27323n = m27323n(this);
            sb.append("SUCCESS, result=[");
            sb.append(m27334u(m27323n));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23593a;
        if (obj != null) {
            return m27327m(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f23595c;
            if (hVar != h.f23611c) {
                h hVar2 = new h();
                do {
                    hVar2.m27341a(hVar);
                    if (f23591f.mo27338c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m27331r(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23593a;
                            if (obj2 != null) {
                                return m27327m(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m27331r(hVar2);
                    } else {
                        hVar = this.f23595c;
                    }
                } while (hVar != h.f23611c);
            }
            return m27327m(this.f23593a);
        }
        while (nanos > 0) {
            Object obj3 = this.f23593a;
            if (obj3 != null) {
                return m27327m(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC6580a = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j7 + StringUtils.SPACE + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            boolean z6 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + StringUtils.SPACE + lowerCase;
                if (z6) {
                    str3 = str3 + ",";
                }
                str2 = str3 + StringUtils.SPACE;
            }
            if (z6) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractC6580a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23593a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23593a != null;
    }

    /* renamed from: j */
    public final e m27326j(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f23594b;
        } while (!f23591f.mo27336a(this, eVar2, e.f23602d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f23605c;
            eVar4.f23605c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: m */
    public final Object m27327m(Object obj) {
        if (obj instanceof c) {
            throw m27319h("Task was cancelled.", ((c) obj).f23599b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f23601a);
        }
        if (obj == f23592n) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public String mo27329p() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: q */
    public final void m27330q() {
        h hVar;
        do {
            hVar = this.f23595c;
        } while (!f23591f.mo27338c(this, hVar, h.f23611c));
        while (hVar != null) {
            hVar.m27342b();
            hVar = hVar.f23613b;
        }
    }

    /* renamed from: r */
    public final void m27331r(h hVar) {
        hVar.f23612a = null;
        while (true) {
            h hVar2 = this.f23595c;
            if (hVar2 == h.f23611c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f23613b;
                if (hVar2.f23612a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f23613b = hVar4;
                    if (hVar3.f23612a == null) {
                        break;
                    }
                } else if (!f23591f.mo27338c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* renamed from: s */
    public boolean mo27332s(Object obj) {
        if (obj == null) {
            obj = f23592n;
        }
        if (!f23591f.mo27337b(this, null, obj)) {
            return false;
        }
        m27321k(this);
        return true;
    }

    /* renamed from: t */
    public boolean mo27333t(Throwable th) {
        if (!f23591f.mo27337b(this, null, new d((Throwable) m27320i(th)))) {
            return false;
        }
        m27321k(this);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m27324f(sb);
        } else {
            try {
                str = mo27329p();
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m27324f(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public final String m27334u(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: v */
    public final boolean m27335v() {
        Object obj = this.f23593a;
        return (obj instanceof c) && ((c) obj).f23598a;
    }

    /* renamed from: g */
    public void mo27325g() {
    }

    /* renamed from: o */
    public void m27328o() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23593a;
            if (obj2 != null) {
                return m27327m(obj2);
            }
            h hVar = this.f23595c;
            if (hVar != h.f23611c) {
                h hVar2 = new h();
                do {
                    hVar2.m27341a(hVar);
                    if (f23591f.mo27338c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23593a;
                            } else {
                                m27331r(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return m27327m(obj);
                    }
                    hVar = this.f23595c;
                } while (hVar != h.f23611c);
            }
            return m27327m(this.f23593a);
        }
        throw new InterruptedException();
    }
}
