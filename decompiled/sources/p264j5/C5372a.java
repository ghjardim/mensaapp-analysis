package p264j5;

import java.io.IOException;
import java.net.Socket;
import org.apache.tika.metadata.ClimateForcast;
import p171Y2.AbstractC2932o;
import p206c6.C3616d;
import p206c6.InterfaceC3607T;
import p253i5.ExecutorC4566K0;
import p264j5.C5373b;
import p281l5.C5547i;
import p281l5.EnumC5539a;
import p281l5.InterfaceC5541c;
import p324q5.AbstractC6227c;
import p324q5.C6226b;
import p324q5.C6229e;

/* renamed from: j5.a */
/* loaded from: classes2.dex */
public final class C5372a implements InterfaceC3607T {

    /* renamed from: c */
    public final ExecutorC4566K0 f19003c;

    /* renamed from: d */
    public final C5373b.a f19004d;

    /* renamed from: e */
    public final int f19005e;

    /* renamed from: p */
    public InterfaceC3607T f19009p;

    /* renamed from: q */
    public Socket f19010q;

    /* renamed from: r */
    public boolean f19011r;

    /* renamed from: s */
    public int f19012s;

    /* renamed from: t */
    public int f19013t;

    /* renamed from: a */
    public final Object f19001a = new Object();

    /* renamed from: b */
    public final C3616d f19002b = new C3616d();

    /* renamed from: f */
    public boolean f19006f = false;

    /* renamed from: n */
    public boolean f19007n = false;

    /* renamed from: o */
    public boolean f19008o = false;

    /* renamed from: j5.a$a */
    public class a extends e {

        /* renamed from: b */
        public final C6226b f19014b;

        public a() {
            super(C5372a.this, null);
            this.f19014b = AbstractC6227c.m25988f();
        }

        @Override // p264j5.C5372a.e
        /* renamed from: a */
        public void mo22112a() {
            int i7;
            C3616d c3616d = new C3616d();
            C6229e m25990h = AbstractC6227c.m25990h("WriteRunnable.runWrite");
            try {
                AbstractC6227c.m25987e(this.f19014b);
                synchronized (C5372a.this.f19001a) {
                    c3616d.mo14482s(C5372a.this.f19002b, C5372a.this.f19002b.m14622g());
                    C5372a.this.f19006f = false;
                    i7 = C5372a.this.f19013t;
                }
                C5372a.this.f19009p.mo14482s(c3616d, c3616d.m14618c0());
                synchronized (C5372a.this.f19001a) {
                    C5372a.m22104h(C5372a.this, i7);
                }
                if (m25990h != null) {
                    m25990h.close();
                }
            } catch (Throwable th) {
                if (m25990h != null) {
                    try {
                        m25990h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: j5.a$b */
    public class b extends e {

        /* renamed from: b */
        public final C6226b f19016b;

        public b() {
            super(C5372a.this, null);
            this.f19016b = AbstractC6227c.m25988f();
        }

        @Override // p264j5.C5372a.e
        /* renamed from: a */
        public void mo22112a() {
            C3616d c3616d = new C3616d();
            C6229e m25990h = AbstractC6227c.m25990h("WriteRunnable.runFlush");
            try {
                AbstractC6227c.m25987e(this.f19016b);
                synchronized (C5372a.this.f19001a) {
                    c3616d.mo14482s(C5372a.this.f19002b, C5372a.this.f19002b.m14618c0());
                    C5372a.this.f19007n = false;
                }
                C5372a.this.f19009p.mo14482s(c3616d, c3616d.m14618c0());
                C5372a.this.f19009p.flush();
                if (m25990h != null) {
                    m25990h.close();
                }
            } catch (Throwable th) {
                if (m25990h != null) {
                    try {
                        m25990h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: j5.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C5372a.this.f19009p != null && C5372a.this.f19002b.m14618c0() > 0) {
                    C5372a.this.f19009p.mo14482s(C5372a.this.f19002b, C5372a.this.f19002b.m14618c0());
                }
            } catch (IOException e7) {
                C5372a.this.f19004d.mo22124h(e7);
            }
            C5372a.this.f19002b.close();
            try {
                if (C5372a.this.f19009p != null) {
                    C5372a.this.f19009p.close();
                }
            } catch (IOException e8) {
                C5372a.this.f19004d.mo22124h(e8);
            }
            try {
                if (C5372a.this.f19010q != null) {
                    C5372a.this.f19010q.close();
                }
            } catch (IOException e9) {
                C5372a.this.f19004d.mo22124h(e9);
            }
        }
    }

    /* renamed from: j5.a$d */
    public class d extends AbstractC5374c {
        public d(InterfaceC5541c interfaceC5541c) {
            super(interfaceC5541c);
        }

        @Override // p264j5.AbstractC5374c, p281l5.InterfaceC5541c
        /* renamed from: e */
        public void mo22113e(int i7, EnumC5539a enumC5539a) {
            C5372a.m22109v(C5372a.this);
            super.mo22113e(i7, enumC5539a);
        }

        @Override // p264j5.AbstractC5374c, p281l5.InterfaceC5541c
        /* renamed from: i */
        public void mo22114i(boolean z6, int i7, int i8) {
            if (z6) {
                C5372a.m22109v(C5372a.this);
            }
            super.mo22114i(z6, i7, i8);
        }

        @Override // p264j5.AbstractC5374c, p281l5.InterfaceC5541c
        /* renamed from: m0 */
        public void mo22115m0(C5547i c5547i) {
            C5372a.m22109v(C5372a.this);
            super.mo22115m0(c5547i);
        }
    }

    /* renamed from: j5.a$e */
    public abstract class e implements Runnable {
        public e() {
        }

        /* renamed from: a */
        public abstract void mo22112a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (C5372a.this.f19009p == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                mo22112a();
            } catch (Exception e7) {
                C5372a.this.f19004d.mo22124h(e7);
            }
        }

        public /* synthetic */ e(C5372a c5372a, a aVar) {
            this();
        }
    }

    public C5372a(ExecutorC4566K0 executorC4566K0, C5373b.a aVar, int i7) {
        this.f19003c = (ExecutorC4566K0) AbstractC2932o.m10573p(executorC4566K0, "executor");
        this.f19004d = (C5373b.a) AbstractC2932o.m10573p(aVar, "exceptionHandler");
        this.f19005e = i7;
    }

    /* renamed from: C */
    public static C5372a m22099C(ExecutorC4566K0 executorC4566K0, C5373b.a aVar, int i7) {
        return new C5372a(executorC4566K0, aVar, i7);
    }

    /* renamed from: h */
    public static /* synthetic */ int m22104h(C5372a c5372a, int i7) {
        int i8 = c5372a.f19013t - i7;
        c5372a.f19013t = i8;
        return i8;
    }

    /* renamed from: v */
    public static /* synthetic */ int m22109v(C5372a c5372a) {
        int i7 = c5372a.f19012s;
        c5372a.f19012s = i7 + 1;
        return i7;
    }

    @Override // p206c6.InterfaceC3607T, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19008o) {
            return;
        }
        this.f19008o = true;
        this.f19003c.execute(new c());
    }

    @Override // p206c6.InterfaceC3607T, java.io.Flushable
    public void flush() {
        if (this.f19008o) {
            throw new IOException("closed");
        }
        C6229e m25990h = AbstractC6227c.m25990h("AsyncSink.flush");
        try {
            synchronized (this.f19001a) {
                if (this.f19007n) {
                    if (m25990h != null) {
                        m25990h.close();
                    }
                } else {
                    this.f19007n = true;
                    this.f19003c.execute(new b());
                    if (m25990h != null) {
                        m25990h.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (m25990h != null) {
                try {
                    m25990h.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p206c6.InterfaceC3607T
    /* renamed from: s */
    public void mo14482s(C3616d c3616d, long j7) {
        AbstractC2932o.m10573p(c3616d, ClimateForcast.SOURCE);
        if (this.f19008o) {
            throw new IOException("closed");
        }
        C6229e m25990h = AbstractC6227c.m25990h("AsyncSink.write");
        try {
            synchronized (this.f19001a) {
                try {
                    this.f19002b.mo14482s(c3616d, j7);
                    int i7 = this.f19013t + this.f19012s;
                    this.f19013t = i7;
                    boolean z6 = false;
                    this.f19012s = 0;
                    if (this.f19011r || i7 <= this.f19005e) {
                        if (!this.f19006f && !this.f19007n && this.f19002b.m14622g() > 0) {
                            this.f19006f = true;
                        }
                        if (m25990h != null) {
                            m25990h.close();
                            return;
                        }
                        return;
                    }
                    this.f19011r = true;
                    z6 = true;
                    if (!z6) {
                        this.f19003c.execute(new a());
                        if (m25990h != null) {
                            m25990h.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f19010q.close();
                    } catch (IOException e7) {
                        this.f19004d.mo22124h(e7);
                    }
                    if (m25990h != null) {
                        m25990h.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (m25990h != null) {
                try {
                    m25990h.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: w */
    public void m22110w(InterfaceC3607T interfaceC3607T, Socket socket) {
        AbstractC2932o.m10579v(this.f19009p == null, "AsyncSink's becomeConnected should only be called once.");
        this.f19009p = (InterfaceC3607T) AbstractC2932o.m10573p(interfaceC3607T, "sink");
        this.f19010q = (Socket) AbstractC2932o.m10573p(socket, "socket");
    }

    /* renamed from: y */
    public InterfaceC5541c m22111y(InterfaceC5541c interfaceC5541c) {
        return new d(interfaceC5541c);
    }
}
