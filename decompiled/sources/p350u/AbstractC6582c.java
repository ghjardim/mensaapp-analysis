package p350u;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p211d3.InterfaceFutureC4115e;

/* renamed from: u.c */
/* loaded from: classes.dex */
public abstract class AbstractC6582c {

    /* renamed from: u.c$a */
    public static final class a {

        /* renamed from: a */
        public Object f23614a;

        /* renamed from: b */
        public d f23615b;

        /* renamed from: c */
        public C6583d f23616c = C6583d.m27354w();

        /* renamed from: d */
        public boolean f23617d;

        /* renamed from: a */
        public void m27345a() {
            this.f23614a = null;
            this.f23615b = null;
            this.f23616c.mo27332s(null);
        }

        /* renamed from: b */
        public boolean m27346b(Object obj) {
            this.f23617d = true;
            d dVar = this.f23615b;
            boolean z6 = dVar != null && dVar.m27352c(obj);
            if (z6) {
                m27348d();
            }
            return z6;
        }

        /* renamed from: c */
        public boolean m27347c() {
            this.f23617d = true;
            d dVar = this.f23615b;
            boolean z6 = dVar != null && dVar.m27351a(true);
            if (z6) {
                m27348d();
            }
            return z6;
        }

        /* renamed from: d */
        public final void m27348d() {
            this.f23614a = null;
            this.f23615b = null;
            this.f23616c = null;
        }

        /* renamed from: e */
        public boolean m27349e(Throwable th) {
            this.f23617d = true;
            d dVar = this.f23615b;
            boolean z6 = dVar != null && dVar.m27353d(th);
            if (z6) {
                m27348d();
            }
            return z6;
        }

        public void finalize() {
            C6583d c6583d;
            d dVar = this.f23615b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m27353d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f23614a));
            }
            if (this.f23617d || (c6583d = this.f23616c) == null) {
                return;
            }
            c6583d.mo27332s(null);
        }
    }

    /* renamed from: u.c$b */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: u.c$c */
    public interface c {
        /* renamed from: a */
        Object mo27350a(a aVar);
    }

    /* renamed from: u.c$d */
    public static final class d implements InterfaceFutureC4115e {

        /* renamed from: a */
        public final WeakReference f23618a;

        /* renamed from: b */
        public final AbstractC6580a f23619b = new a();

        /* renamed from: u.c$d$a */
        public class a extends AbstractC6580a {
            public a() {
            }

            @Override // p350u.AbstractC6580a
            /* renamed from: p */
            public String mo27329p() {
                a aVar = (a) d.this.f23618a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f23614a + "]";
            }
        }

        public d(a aVar) {
            this.f23618a = new WeakReference(aVar);
        }

        /* renamed from: a */
        public boolean m27351a(boolean z6) {
            return this.f23619b.cancel(z6);
        }

        @Override // p211d3.InterfaceFutureC4115e
        /* renamed from: b */
        public void mo17292b(Runnable runnable, Executor executor) {
            this.f23619b.mo17292b(runnable, executor);
        }

        /* renamed from: c */
        public boolean m27352c(Object obj) {
            return this.f23619b.mo27332s(obj);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            a aVar = (a) this.f23618a.get();
            boolean cancel = this.f23619b.cancel(z6);
            if (cancel && aVar != null) {
                aVar.m27345a();
            }
            return cancel;
        }

        /* renamed from: d */
        public boolean m27353d(Throwable th) {
            return this.f23619b.mo27333t(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f23619b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f23619b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f23619b.isDone();
        }

        public String toString() {
            return this.f23619b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j7, TimeUnit timeUnit) {
            return this.f23619b.get(j7, timeUnit);
        }
    }

    /* renamed from: a */
    public static InterfaceFutureC4115e m27344a(c cVar) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f23615b = dVar;
        aVar.f23614a = cVar.getClass();
        try {
            Object mo27350a = cVar.mo27350a(aVar);
            if (mo27350a != null) {
                aVar.f23614a = mo27350a;
            }
        } catch (Exception e7) {
            dVar.m27353d(e7);
        }
        return dVar;
    }
}
