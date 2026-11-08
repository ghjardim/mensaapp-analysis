package p253i5;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p171Y2.AbstractC2932o;

/* renamed from: i5.M0 */
/* loaded from: classes2.dex */
public final class C4570M0 {

    /* renamed from: d */
    public static final C4570M0 f16548d = new C4570M0(new a());

    /* renamed from: a */
    public final IdentityHashMap f16549a = new IdentityHashMap();

    /* renamed from: b */
    public final e f16550b;

    /* renamed from: c */
    public ScheduledExecutorService f16551c;

    /* renamed from: i5.M0$a */
    public class a implements e {
        @Override // p253i5.C4570M0.e
        /* renamed from: a */
        public ScheduledExecutorService mo19572a() {
            return Executors.newSingleThreadScheduledExecutor(AbstractC4580S.m19604j("grpc-shared-destroyer-%d", true));
        }
    }

    /* renamed from: i5.M0$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ c f16552a;

        /* renamed from: b */
        public final /* synthetic */ d f16553b;

        /* renamed from: c */
        public final /* synthetic */ Object f16554c;

        public b(c cVar, d dVar, Object obj) {
            this.f16552a = cVar;
            this.f16553b = dVar;
            this.f16554c = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (C4570M0.this) {
                try {
                    if (this.f16552a.f16557b == 0) {
                        try {
                            this.f16553b.mo19574b(this.f16554c);
                            C4570M0.this.f16549a.remove(this.f16553b);
                            if (C4570M0.this.f16549a.isEmpty()) {
                                C4570M0.this.f16551c.shutdown();
                                C4570M0.this.f16551c = null;
                            }
                        } catch (Throwable th) {
                            C4570M0.this.f16549a.remove(this.f16553b);
                            if (C4570M0.this.f16549a.isEmpty()) {
                                C4570M0.this.f16551c.shutdown();
                                C4570M0.this.f16551c = null;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: i5.M0$c */
    public static class c {

        /* renamed from: a */
        public final Object f16556a;

        /* renamed from: b */
        public int f16557b;

        /* renamed from: c */
        public ScheduledFuture f16558c;

        public c(Object obj) {
            this.f16556a = obj;
        }
    }

    /* renamed from: i5.M0$d */
    public interface d {
        /* renamed from: a */
        Object mo19573a();

        /* renamed from: b */
        void mo19574b(Object obj);
    }

    /* renamed from: i5.M0$e */
    public interface e {
        /* renamed from: a */
        ScheduledExecutorService mo19572a();
    }

    public C4570M0(e eVar) {
        this.f16550b = eVar;
    }

    /* renamed from: d */
    public static Object m19568d(d dVar) {
        return f16548d.m19570e(dVar);
    }

    /* renamed from: f */
    public static Object m19569f(d dVar, Object obj) {
        return f16548d.m19571g(dVar, obj);
    }

    /* renamed from: e */
    public synchronized Object m19570e(d dVar) {
        c cVar;
        try {
            cVar = (c) this.f16549a.get(dVar);
            if (cVar == null) {
                cVar = new c(dVar.mo19573a());
                this.f16549a.put(dVar, cVar);
            }
            ScheduledFuture scheduledFuture = cVar.f16558c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                cVar.f16558c = null;
            }
            cVar.f16557b++;
        } catch (Throwable th) {
            throw th;
        }
        return cVar.f16556a;
    }

    /* renamed from: g */
    public synchronized Object m19571g(d dVar, Object obj) {
        try {
            c cVar = (c) this.f16549a.get(dVar);
            if (cVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + dVar);
            }
            AbstractC2932o.m10562e(obj == cVar.f16556a, "Releasing the wrong instance");
            AbstractC2932o.m10579v(cVar.f16557b > 0, "Refcount has already reached zero");
            int i7 = cVar.f16557b - 1;
            cVar.f16557b = i7;
            if (i7 == 0) {
                AbstractC2932o.m10579v(cVar.f16558c == null, "Destroy task already scheduled");
                if (this.f16551c == null) {
                    this.f16551c = this.f16550b.mo19572a();
                }
                cVar.f16558c = this.f16551c.schedule(new RunnableC4603e0(new b(cVar, dVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }
}
