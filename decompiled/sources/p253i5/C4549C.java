package p253i5;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p171Y2.AbstractC2932o;
import p237g5.C4424Z;
import p237g5.C4448l0;
import p237g5.C4462t;
import p237g5.C4464v;
import p237g5.InterfaceC4451n;
import p253i5.InterfaceC4579R0;
import p253i5.InterfaceC4630s;

/* renamed from: i5.C */
/* loaded from: classes2.dex */
public class C4549C implements InterfaceC4628r {

    /* renamed from: a */
    public volatile boolean f16299a;

    /* renamed from: b */
    public InterfaceC4630s f16300b;

    /* renamed from: c */
    public InterfaceC4628r f16301c;

    /* renamed from: d */
    public C4448l0 f16302d;

    /* renamed from: f */
    public o f16304f;

    /* renamed from: g */
    public long f16305g;

    /* renamed from: h */
    public long f16306h;

    /* renamed from: e */
    public List f16303e = new ArrayList();

    /* renamed from: i */
    public List f16307i = new ArrayList();

    /* renamed from: i5.C$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f16308a;

        public a(int i7) {
            this.f16308a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19368d(this.f16308a);
        }
    }

    /* renamed from: i5.C$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19378p();
        }
    }

    /* renamed from: i5.C$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4451n f16311a;

        public c(InterfaceC4451n interfaceC4451n) {
            this.f16311a = interfaceC4451n;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19369e(this.f16311a);
        }
    }

    /* renamed from: i5.C$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f16313a;

        public d(boolean z6) {
            this.f16313a = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19379q(this.f16313a);
        }
    }

    /* renamed from: i5.C$e */
    public class e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4464v f16315a;

        public e(C4464v c4464v) {
            this.f16315a = c4464v;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19376n(this.f16315a);
        }
    }

    /* renamed from: i5.C$f */
    public class f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f16317a;

        public f(int i7) {
            this.f16317a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19370g(this.f16317a);
        }
    }

    /* renamed from: i5.C$g */
    public class g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f16319a;

        public g(int i7) {
            this.f16319a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19371h(this.f16319a);
        }
    }

    /* renamed from: i5.C$h */
    public class h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4462t f16321a;

        public h(C4462t c4462t) {
            this.f16321a = c4462t;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19375m(this.f16321a);
        }
    }

    /* renamed from: i5.C$i */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.m19381t();
        }
    }

    /* renamed from: i5.C$j */
    public class j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f16324a;

        public j(String str) {
            this.f16324a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19373k(this.f16324a);
        }
    }

    /* renamed from: i5.C$k */
    public class k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InputStream f16326a;

        public k(InputStream inputStream) {
            this.f16326a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19377o(this.f16326a);
        }
    }

    /* renamed from: i5.C$l */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.flush();
        }
    }

    /* renamed from: i5.C$m */
    public class m implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4448l0 f16329a;

        public m(C4448l0 c4448l0) {
            this.f16329a = c4448l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19360a(this.f16329a);
        }
    }

    /* renamed from: i5.C$n */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549C.this.f16301c.mo19374l();
        }
    }

    /* renamed from: i5.C$o */
    public static class o implements InterfaceC4630s {

        /* renamed from: a */
        public final InterfaceC4630s f16332a;

        /* renamed from: b */
        public volatile boolean f16333b;

        /* renamed from: c */
        public List f16334c = new ArrayList();

        /* renamed from: i5.C$o$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4579R0.a f16335a;

            public a(InterfaceC4579R0.a aVar) {
                this.f16335a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16332a.mo19386a(this.f16335a);
            }
        }

        /* renamed from: i5.C$o$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16332a.mo19389d();
            }
        }

        /* renamed from: i5.C$o$c */
        public class c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4424Z f16338a;

            public c(C4424Z c4424z) {
                this.f16338a = c4424z;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16332a.mo19388c(this.f16338a);
            }
        }

        /* renamed from: i5.C$o$d */
        public class d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4448l0 f16340a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC4630s.a f16341b;

            /* renamed from: c */
            public final /* synthetic */ C4424Z f16342c;

            public d(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
                this.f16340a = c4448l0;
                this.f16341b = aVar;
                this.f16342c = c4424z;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16332a.mo19387b(this.f16340a, this.f16341b, this.f16342c);
            }
        }

        public o(InterfaceC4630s interfaceC4630s) {
            this.f16332a = interfaceC4630s;
        }

        @Override // p253i5.InterfaceC4579R0
        /* renamed from: a */
        public void mo19386a(InterfaceC4579R0.a aVar) {
            if (this.f16333b) {
                this.f16332a.mo19386a(aVar);
            } else {
                m19390f(new a(aVar));
            }
        }

        @Override // p253i5.InterfaceC4630s
        /* renamed from: b */
        public void mo19387b(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
            m19390f(new d(c4448l0, aVar, c4424z));
        }

        @Override // p253i5.InterfaceC4630s
        /* renamed from: c */
        public void mo19388c(C4424Z c4424z) {
            m19390f(new c(c4424z));
        }

        @Override // p253i5.InterfaceC4579R0
        /* renamed from: d */
        public void mo19389d() {
            if (this.f16333b) {
                this.f16332a.mo19389d();
            } else {
                m19390f(new b());
            }
        }

        /* renamed from: f */
        public final void m19390f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f16333b) {
                        runnable.run();
                    } else {
                        this.f16334c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: g */
        public void m19391g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f16334c.isEmpty()) {
                            this.f16334c = null;
                            this.f16333b = true;
                            return;
                        } else {
                            list = this.f16334c;
                            this.f16334c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: a */
    public void mo19360a(C4448l0 c4448l0) {
        boolean z6 = false;
        AbstractC2932o.m10579v(this.f16300b != null, "May only be called after start");
        AbstractC2932o.m10573p(c4448l0, "reason");
        synchronized (this) {
            try {
                if (this.f16301c == null) {
                    m19383w(C4625p0.f17168a);
                    this.f16302d = c4448l0;
                } else {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            m19380s(new m(c4448l0));
            return;
        }
        m19381t();
        mo19362v(c4448l0);
        this.f16300b.mo19387b(c4448l0, InterfaceC4630s.a.PROCESSED, new C4424Z());
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: b */
    public boolean mo19367b() {
        if (this.f16299a) {
            return this.f16301c.mo19367b();
        }
        return false;
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: d */
    public void mo19368d(int i7) {
        AbstractC2932o.m10579v(this.f16300b != null, "May only be called after start");
        if (this.f16299a) {
            this.f16301c.mo19368d(i7);
        } else {
            m19380s(new a(i7));
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: e */
    public void mo19369e(InterfaceC4451n interfaceC4451n) {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        AbstractC2932o.m10573p(interfaceC4451n, "compressor");
        this.f16307i.add(new c(interfaceC4451n));
    }

    @Override // p253i5.InterfaceC4578Q0
    public void flush() {
        AbstractC2932o.m10579v(this.f16300b != null, "May only be called after start");
        if (this.f16299a) {
            this.f16301c.flush();
        } else {
            m19380s(new l());
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: g */
    public void mo19370g(int i7) {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        this.f16307i.add(new f(i7));
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: h */
    public void mo19371h(int i7) {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        this.f16307i.add(new g(i7));
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: i */
    public void mo19372i(InterfaceC4630s interfaceC4630s) {
        C4448l0 c4448l0;
        boolean z6;
        AbstractC2932o.m10573p(interfaceC4630s, "listener");
        AbstractC2932o.m10579v(this.f16300b == null, "already started");
        synchronized (this) {
            try {
                c4448l0 = this.f16302d;
                z6 = this.f16299a;
                if (!z6) {
                    o oVar = new o(interfaceC4630s);
                    this.f16304f = oVar;
                    interfaceC4630s = oVar;
                }
                this.f16300b = interfaceC4630s;
                this.f16305g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4448l0 != null) {
            interfaceC4630s.mo19387b(c4448l0, InterfaceC4630s.a.PROCESSED, new C4424Z());
        } else if (z6) {
            m19382u(interfaceC4630s);
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: j */
    public void mo19361j(C4592Y c4592y) {
        synchronized (this) {
            try {
                if (this.f16300b == null) {
                    return;
                }
                if (this.f16301c != null) {
                    c4592y.m19704b("buffered_nanos", Long.valueOf(this.f16306h - this.f16305g));
                    this.f16301c.mo19361j(c4592y);
                } else {
                    c4592y.m19704b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f16305g));
                    c4592y.m19703a("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: k */
    public void mo19373k(String str) {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        AbstractC2932o.m10573p(str, "authority");
        this.f16307i.add(new j(str));
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: l */
    public void mo19374l() {
        AbstractC2932o.m10579v(this.f16300b != null, "May only be called after start");
        m19380s(new n());
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: m */
    public void mo19375m(C4462t c4462t) {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        this.f16307i.add(new h(c4462t));
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: n */
    public void mo19376n(C4464v c4464v) {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        AbstractC2932o.m10573p(c4464v, "decompressorRegistry");
        this.f16307i.add(new e(c4464v));
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: o */
    public void mo19377o(InputStream inputStream) {
        AbstractC2932o.m10579v(this.f16300b != null, "May only be called after start");
        AbstractC2932o.m10573p(inputStream, "message");
        if (this.f16299a) {
            this.f16301c.mo19377o(inputStream);
        } else {
            m19380s(new k(inputStream));
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: p */
    public void mo19378p() {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        this.f16307i.add(new b());
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: q */
    public void mo19379q(boolean z6) {
        AbstractC2932o.m10579v(this.f16300b == null, "May only be called before start");
        this.f16307i.add(new d(z6));
    }

    /* renamed from: s */
    public final void m19380s(Runnable runnable) {
        AbstractC2932o.m10579v(this.f16300b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f16299a) {
                    runnable.run();
                } else {
                    this.f16303e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19381t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f16303e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f16303e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f16299a = r0     // Catch: java.lang.Throwable -> L1d
            i5.C$o r0 = r3.f16304f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.m19391g()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f16303e     // Catch: java.lang.Throwable -> L1d
            r3.f16303e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253i5.C4549C.m19381t():void");
    }

    /* renamed from: u */
    public final void m19382u(InterfaceC4630s interfaceC4630s) {
        Iterator it = this.f16307i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f16307i = null;
        this.f16301c.mo19372i(interfaceC4630s);
    }

    /* renamed from: w */
    public final void m19383w(InterfaceC4628r interfaceC4628r) {
        InterfaceC4628r interfaceC4628r2 = this.f16301c;
        AbstractC2932o.m10581x(interfaceC4628r2 == null, "realStream already set to %s", interfaceC4628r2);
        this.f16301c = interfaceC4628r;
        this.f16306h = System.nanoTime();
    }

    /* renamed from: x */
    public final Runnable m19384x(InterfaceC4628r interfaceC4628r) {
        synchronized (this) {
            try {
                if (this.f16301c != null) {
                    return null;
                }
                m19383w((InterfaceC4628r) AbstractC2932o.m10573p(interfaceC4628r, "stream"));
                InterfaceC4630s interfaceC4630s = this.f16300b;
                if (interfaceC4630s == null) {
                    this.f16303e = null;
                    this.f16299a = true;
                }
                if (interfaceC4630s == null) {
                    return null;
                }
                m19382u(interfaceC4630s);
                return new i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: v */
    public void mo19362v(C4448l0 c4448l0) {
    }
}
