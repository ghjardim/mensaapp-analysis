package p264j5;

import com.google.android.gms.common.api.C3643a;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4421W;
import p237g5.AbstractC4435f;
import p237g5.AbstractC4467y;
import p237g5.EnumC4460r0;
import p253i5.AbstractC4580S;
import p253i5.C4570M0;
import p253i5.C4572N0;
import p253i5.C4587V0;
import p253i5.C4601d0;
import p253i5.C4606g;
import p253i5.C4611i0;
import p253i5.InterfaceC4627q0;
import p253i5.InterfaceC4634u;
import p253i5.InterfaceC4638w;
import p273k5.C5445b;
import p273k5.C5451h;
import p273k5.EnumC5444a;
import p273k5.EnumC5454k;

/* renamed from: j5.f */
/* loaded from: classes2.dex */
public final class C5377f extends AbstractC4467y {

    /* renamed from: r */
    public static final Logger f19035r = Logger.getLogger(C5377f.class.getName());

    /* renamed from: s */
    public static final C5445b f19036s = new C5445b.b(C5445b.f19625f).m22946g(EnumC5444a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC5444a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC5444a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC5444a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC5444a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC5444a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).m22949j(EnumC5454k.TLS_1_2).m22947h(true).m22944e();

    /* renamed from: t */
    public static final long f19037t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u */
    public static final C4570M0.d f19038u;

    /* renamed from: v */
    public static final InterfaceC4627q0 f19039v;

    /* renamed from: w */
    public static final EnumSet f19040w;

    /* renamed from: a */
    public final C4611i0 f19041a;

    /* renamed from: e */
    public SocketFactory f19045e;

    /* renamed from: f */
    public SSLSocketFactory f19046f;

    /* renamed from: h */
    public HostnameVerifier f19048h;

    /* renamed from: n */
    public boolean f19054n;

    /* renamed from: b */
    public C4587V0.b f19042b = C4587V0.m19677a();

    /* renamed from: c */
    public InterfaceC4627q0 f19043c = f19039v;

    /* renamed from: d */
    public InterfaceC4627q0 f19044d = C4572N0.m19575c(AbstractC4580S.f16590v);

    /* renamed from: i */
    public C5445b f19049i = f19036s;

    /* renamed from: j */
    public c f19050j = c.TLS;

    /* renamed from: k */
    public long f19051k = Long.MAX_VALUE;

    /* renamed from: l */
    public long f19052l = AbstractC4580S.f16582n;

    /* renamed from: m */
    public int f19053m = 65535;

    /* renamed from: o */
    public int f19055o = 4194304;

    /* renamed from: p */
    public int f19056p = C3643a.e.API_PRIORITY_OTHER;

    /* renamed from: q */
    public final boolean f19057q = false;

    /* renamed from: g */
    public final boolean f19047g = false;

    /* renamed from: j5.f$a */
    public class a implements C4570M0.d {
        @Override // p253i5.C4570M0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19574b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // p253i5.C4570M0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor mo19573a() {
            return Executors.newCachedThreadPool(AbstractC4580S.m19604j("grpc-okhttp-%d", true));
        }
    }

    /* renamed from: j5.f$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19058a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19059b;

        static {
            int[] iArr = new int[c.values().length];
            f19059b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19059b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC5376e.values().length];
            f19058a = iArr2;
            try {
                iArr2[EnumC5376e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19058a[EnumC5376e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: j5.f$c */
    public enum c {
        TLS,
        PLAINTEXT
    }

    /* renamed from: j5.f$d */
    public final class d implements C4611i0.b {
        public d() {
        }

        @Override // p253i5.C4611i0.b
        /* renamed from: a */
        public int mo19991a() {
            return C5377f.this.m22132i();
        }

        public /* synthetic */ d(C5377f c5377f, a aVar) {
            this();
        }
    }

    /* renamed from: j5.f$e */
    public final class e implements C4611i0.c {
        public e() {
        }

        @Override // p253i5.C4611i0.c
        /* renamed from: a */
        public InterfaceC4634u mo19992a() {
            return C5377f.this.m22130f();
        }

        public /* synthetic */ e(C5377f c5377f, a aVar) {
            this();
        }
    }

    /* renamed from: j5.f$f */
    public static final class f implements InterfaceC4634u {

        /* renamed from: a */
        public final InterfaceC4627q0 f19065a;

        /* renamed from: b */
        public final Executor f19066b;

        /* renamed from: c */
        public final InterfaceC4627q0 f19067c;

        /* renamed from: d */
        public final ScheduledExecutorService f19068d;

        /* renamed from: e */
        public final C4587V0.b f19069e;

        /* renamed from: f */
        public final SocketFactory f19070f;

        /* renamed from: n */
        public final SSLSocketFactory f19071n;

        /* renamed from: o */
        public final HostnameVerifier f19072o;

        /* renamed from: p */
        public final C5445b f19073p;

        /* renamed from: q */
        public final int f19074q;

        /* renamed from: r */
        public final boolean f19075r;

        /* renamed from: s */
        public final long f19076s;

        /* renamed from: t */
        public final C4606g f19077t;

        /* renamed from: u */
        public final long f19078u;

        /* renamed from: v */
        public final int f19079v;

        /* renamed from: w */
        public final boolean f19080w;

        /* renamed from: x */
        public final int f19081x;

        /* renamed from: y */
        public final boolean f19082y;

        /* renamed from: z */
        public boolean f19083z;

        /* renamed from: j5.f$f$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4606g.b f19084a;

            public a(C4606g.b bVar) {
                this.f19084a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19084a.m19874a();
            }
        }

        public /* synthetic */ f(InterfaceC4627q0 interfaceC4627q0, InterfaceC4627q0 interfaceC4627q02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C5445b c5445b, int i7, boolean z6, long j7, long j8, int i8, boolean z7, int i9, C4587V0.b bVar, boolean z8, a aVar) {
            this(interfaceC4627q0, interfaceC4627q02, socketFactory, sSLSocketFactory, hostnameVerifier, c5445b, i7, z6, j7, j8, i8, z7, i9, bVar, z8);
        }

        @Override // p253i5.InterfaceC4634u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f19083z) {
                return;
            }
            this.f19083z = true;
            this.f19065a.mo19577b(this.f19066b);
            this.f19067c.mo19577b(this.f19068d);
        }

        @Override // p253i5.InterfaceC4634u
        /* renamed from: j0 */
        public ScheduledExecutorService mo20012j0() {
            return this.f19068d;
        }

        @Override // p253i5.InterfaceC4634u
        /* renamed from: n0 */
        public InterfaceC4638w mo20013n0(SocketAddress socketAddress, InterfaceC4634u.a aVar, AbstractC4435f abstractC4435f) {
            if (this.f19083z) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            C4606g.b m19873d = this.f19077t.m19873d();
            C5380i c5380i = new C5380i(this, (InetSocketAddress) socketAddress, aVar.m20141a(), aVar.m20144d(), aVar.m20142b(), aVar.m20143c(), new a(m19873d));
            if (this.f19075r) {
                c5380i.m22206U(true, m19873d.m19875b(), this.f19078u, this.f19080w);
            }
            return c5380i;
        }

        @Override // p253i5.InterfaceC4634u
        /* renamed from: v0 */
        public Collection mo20014v0() {
            return C5377f.m22129j();
        }

        public f(InterfaceC4627q0 interfaceC4627q0, InterfaceC4627q0 interfaceC4627q02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C5445b c5445b, int i7, boolean z6, long j7, long j8, int i8, boolean z7, int i9, C4587V0.b bVar, boolean z8) {
            this.f19065a = interfaceC4627q0;
            this.f19066b = (Executor) interfaceC4627q0.mo19576a();
            this.f19067c = interfaceC4627q02;
            this.f19068d = (ScheduledExecutorService) interfaceC4627q02.mo19576a();
            this.f19070f = socketFactory;
            this.f19071n = sSLSocketFactory;
            this.f19072o = hostnameVerifier;
            this.f19073p = c5445b;
            this.f19074q = i7;
            this.f19075r = z6;
            this.f19076s = j7;
            this.f19077t = new C4606g("keepalive time nanos", j7);
            this.f19078u = j8;
            this.f19079v = i8;
            this.f19080w = z7;
            this.f19081x = i9;
            this.f19082y = z8;
            this.f19069e = (C4587V0.b) AbstractC2932o.m10573p(bVar, "transportTracerFactory");
        }
    }

    static {
        a aVar = new a();
        f19038u = aVar;
        f19039v = C4572N0.m19575c(aVar);
        f19040w = EnumSet.of(EnumC4460r0.MTLS, EnumC4460r0.CUSTOM_MANAGERS);
    }

    public C5377f(String str) {
        a aVar = null;
        this.f19041a = new C4611i0(str, new e(this, aVar), new d(this, aVar));
    }

    /* renamed from: h */
    public static C5377f m22128h(String str) {
        return new C5377f(str);
    }

    /* renamed from: j */
    public static Collection m22129j() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // p237g5.AbstractC4467y
    /* renamed from: e */
    public AbstractC4421W mo19036e() {
        return this.f19041a;
    }

    /* renamed from: f */
    public f m22130f() {
        return new f(this.f19043c, this.f19044d, this.f19045e, m22131g(), this.f19048h, this.f19049i, this.f19055o, this.f19051k != Long.MAX_VALUE, this.f19051k, this.f19052l, this.f19053m, this.f19054n, this.f19056p, this.f19042b, false, null);
    }

    /* renamed from: g */
    public SSLSocketFactory m22131g() {
        int i7 = b.f19059b[this.f19050j.ordinal()];
        if (i7 == 1) {
            return null;
        }
        if (i7 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f19050j);
        }
        try {
            if (this.f19046f == null) {
                this.f19046f = SSLContext.getInstance("Default", C5451h.m22983e().m22989g()).getSocketFactory();
            }
            return this.f19046f;
        } catch (GeneralSecurityException e7) {
            throw new RuntimeException("TLS Provider failure", e7);
        }
    }

    /* renamed from: i */
    public int m22132i() {
        int i7 = b.f19059b[this.f19050j.ordinal()];
        if (i7 == 1) {
            return 80;
        }
        if (i7 == 2) {
            return 443;
        }
        throw new AssertionError(this.f19050j + " not handled");
    }

    @Override // p237g5.AbstractC4421W
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5377f mo18757c(long j7, TimeUnit timeUnit) {
        AbstractC2932o.m10562e(j7 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j7);
        this.f19051k = nanos;
        long m19848l = C4601d0.m19848l(nanos);
        this.f19051k = m19848l;
        if (m19848l >= f19037t) {
            this.f19051k = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // p237g5.AbstractC4421W
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5377f mo18758d() {
        AbstractC2932o.m10579v(!this.f19047g, "Cannot change security when using ChannelCredentials");
        this.f19050j = c.PLAINTEXT;
        return this;
    }
}
