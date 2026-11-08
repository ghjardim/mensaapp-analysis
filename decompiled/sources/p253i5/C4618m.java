package p253i5;

import com.google.android.gms.common.api.C3643a;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4427b;
import p237g5.AbstractC4435f;
import p237g5.AbstractC4445k;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.C4449m;
import p253i5.C4623o0;
import p253i5.InterfaceC4634u;

/* renamed from: i5.m */
/* loaded from: classes2.dex */
public final class C4618m implements InterfaceC4634u {

    /* renamed from: a */
    public final InterfaceC4634u f17078a;

    /* renamed from: b */
    public final AbstractC4427b f17079b;

    /* renamed from: c */
    public final Executor f17080c;

    /* renamed from: i5.m$a */
    public class a extends AbstractC4565K {

        /* renamed from: a */
        public final InterfaceC4638w f17081a;

        /* renamed from: b */
        public final String f17082b;

        /* renamed from: d */
        public volatile C4448l0 f17084d;

        /* renamed from: e */
        public C4448l0 f17085e;

        /* renamed from: f */
        public C4448l0 f17086f;

        /* renamed from: c */
        public final AtomicInteger f17083c = new AtomicInteger(-2147483647);

        /* renamed from: g */
        public final C4623o0.a f17087g = new C7227a();

        /* renamed from: i5.m$a$a, reason: collision with other inner class name */
        public class C7227a implements C4623o0.a {
            public C7227a() {
            }

            @Override // p253i5.C4623o0.a
            /* renamed from: a */
            public void mo20018a() {
                if (a.this.f17083c.decrementAndGet() == 0) {
                    a.this.m20017k();
                }
            }
        }

        /* renamed from: i5.m$a$b */
        public class b extends AbstractC4427b.b {

            /* renamed from: a */
            public final /* synthetic */ C4426a0 f17090a;

            /* renamed from: b */
            public final /* synthetic */ C4429c f17091b;

            public b(C4426a0 c4426a0, C4429c c4429c) {
                this.f17090a = c4426a0;
                this.f17091b = c4429c;
            }
        }

        public a(InterfaceC4638w interfaceC4638w, String str) {
            this.f17081a = (InterfaceC4638w) AbstractC2932o.m10573p(interfaceC4638w, "delegate");
            this.f17082b = (String) AbstractC2932o.m10573p(str, "authority");
        }

        @Override // p253i5.AbstractC4565K
        /* renamed from: a */
        public InterfaceC4638w mo19520a() {
            return this.f17081a;
        }

        @Override // p253i5.AbstractC4565K, p253i5.InterfaceC4617l0
        /* renamed from: b */
        public void mo19348b(C4448l0 c4448l0) {
            AbstractC2932o.m10573p(c4448l0, "status");
            synchronized (this) {
                try {
                    if (this.f17083c.get() < 0) {
                        this.f17084d = c4448l0;
                        this.f17083c.addAndGet(C3643a.e.API_PRIORITY_OTHER);
                    } else if (this.f17086f != null) {
                        return;
                    }
                    if (this.f17083c.get() != 0) {
                        this.f17086f = c4448l0;
                    } else {
                        super.mo19348b(c4448l0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p253i5.AbstractC4565K, p253i5.InterfaceC4617l0
        /* renamed from: f */
        public void mo19350f(C4448l0 c4448l0) {
            AbstractC2932o.m10573p(c4448l0, "status");
            synchronized (this) {
                try {
                    if (this.f17083c.get() < 0) {
                        this.f17084d = c4448l0;
                        this.f17083c.addAndGet(C3643a.e.API_PRIORITY_OTHER);
                        if (this.f17083c.get() != 0) {
                            this.f17085e = c4448l0;
                        } else {
                            super.mo19350f(c4448l0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p253i5.AbstractC4565K, p253i5.InterfaceC4632t
        /* renamed from: g */
        public InterfaceC4628r mo19351g(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, AbstractC4445k[] abstractC4445kArr) {
            AbstractC4427b m18850c = c4429c.m18850c();
            if (m18850c == null) {
                m18850c = C4618m.this.f17079b;
            } else if (C4618m.this.f17079b != null) {
                m18850c = new C4449m(C4618m.this.f17079b, m18850c);
            }
            if (m18850c == null) {
                return this.f17083c.get() >= 0 ? new C4557G(this.f17084d, abstractC4445kArr) : this.f17081a.mo19351g(c4426a0, c4424z, c4429c, abstractC4445kArr);
            }
            C4623o0 c4623o0 = new C4623o0(this.f17081a, c4426a0, c4424z, c4429c, this.f17087g, abstractC4445kArr);
            if (this.f17083c.incrementAndGet() > 0) {
                this.f17087g.mo20018a();
                return new C4557G(this.f17084d, abstractC4445kArr);
            }
            try {
                m18850c.mo6910a(new b(c4426a0, c4429c), C4618m.this.f17080c, c4623o0);
            } catch (Throwable th) {
                c4623o0.mo18846b(C4448l0.f15803m.m18963q("Credentials should use fail() instead of throwing exceptions").m18962p(th));
            }
            return c4623o0.m20058d();
        }

        /* renamed from: k */
        public final void m20017k() {
            synchronized (this) {
                try {
                    if (this.f17083c.get() != 0) {
                        return;
                    }
                    C4448l0 c4448l0 = this.f17085e;
                    C4448l0 c4448l02 = this.f17086f;
                    this.f17085e = null;
                    this.f17086f = null;
                    if (c4448l0 != null) {
                        super.mo19350f(c4448l0);
                    }
                    if (c4448l02 != null) {
                        super.mo19348b(c4448l02);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C4618m(InterfaceC4634u interfaceC4634u, AbstractC4427b abstractC4427b, Executor executor) {
        this.f17078a = (InterfaceC4634u) AbstractC2932o.m10573p(interfaceC4634u, "delegate");
        this.f17079b = abstractC4427b;
        this.f17080c = (Executor) AbstractC2932o.m10573p(executor, "appExecutor");
    }

    @Override // p253i5.InterfaceC4634u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17078a.close();
    }

    @Override // p253i5.InterfaceC4634u
    /* renamed from: j0 */
    public ScheduledExecutorService mo20012j0() {
        return this.f17078a.mo20012j0();
    }

    @Override // p253i5.InterfaceC4634u
    /* renamed from: n0 */
    public InterfaceC4638w mo20013n0(SocketAddress socketAddress, InterfaceC4634u.a aVar, AbstractC4435f abstractC4435f) {
        return new a(this.f17078a.mo20013n0(socketAddress, aVar, abstractC4435f), aVar.m20141a());
    }

    @Override // p253i5.InterfaceC4634u
    /* renamed from: v0 */
    public Collection mo20014v0() {
        return this.f17078a.mo20014v0();
    }
}
