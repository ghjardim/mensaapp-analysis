package p264j5;

import com.google.android.gms.common.api.C3643a;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p171Y2.C2937t;
import p171Y2.InterfaceC2939v;
import p206c6.AbstractC3596H;
import p206c6.C3616d;
import p206c6.C3619g;
import p206c6.InterfaceC3609V;
import p206c6.InterfaceC3617e;
import p206c6.InterfaceC3618f;
import p237g5.AbstractC4402C;
import p237g5.AbstractC4445k;
import p237g5.C4403D;
import p237g5.C4404E;
import p237g5.C4410K;
import p237g5.C4424Z;
import p237g5.C4425a;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.C4450m0;
import p237g5.EnumC4442i0;
import p253i5.AbstractC4577Q;
import p253i5.AbstractC4580S;
import p253i5.AbstractC4590X;
import p253i5.C4576P0;
import p253i5.C4587V0;
import p253i5.C4588W;
import p253i5.C4601d0;
import p253i5.ExecutorC4566K0;
import p253i5.InterfaceC4617l0;
import p253i5.InterfaceC4630s;
import p253i5.InterfaceC4632t;
import p253i5.InterfaceC4638w;
import p256j$.util.DesugarCollections;
import p264j5.C5373b;
import p264j5.C5377f;
import p264j5.C5379h;
import p264j5.C5381j;
import p264j5.C5389r;
import p273k5.AbstractC5446c;
import p273k5.C5445b;
import p273k5.C5453j;
import p281l5.C5542d;
import p281l5.C5545g;
import p281l5.C5547i;
import p281l5.EnumC5539a;
import p281l5.EnumC5543e;
import p281l5.InterfaceC5540b;
import p281l5.InterfaceC5541c;
import p281l5.InterfaceC5548j;
import p289m5.C5597a;
import p289m5.C5598b;
import p324q5.AbstractC6227c;

/* renamed from: j5.i */
/* loaded from: classes2.dex */
public class C5380i implements InterfaceC4638w, C5373b.a, C5389r.d {

    /* renamed from: V */
    public static final Map f19113V = m22184R();

    /* renamed from: W */
    public static final Logger f19114W = Logger.getLogger(C5380i.class.getName());

    /* renamed from: A */
    public final SocketFactory f19115A;

    /* renamed from: B */
    public SSLSocketFactory f19116B;

    /* renamed from: C */
    public HostnameVerifier f19117C;

    /* renamed from: D */
    public Socket f19118D;

    /* renamed from: E */
    public int f19119E;

    /* renamed from: F */
    public final Deque f19120F;

    /* renamed from: G */
    public final C5445b f19121G;

    /* renamed from: H */
    public C4601d0 f19122H;

    /* renamed from: I */
    public boolean f19123I;

    /* renamed from: J */
    public long f19124J;

    /* renamed from: K */
    public long f19125K;

    /* renamed from: L */
    public boolean f19126L;

    /* renamed from: M */
    public final Runnable f19127M;

    /* renamed from: N */
    public final int f19128N;

    /* renamed from: O */
    public final boolean f19129O;

    /* renamed from: P */
    public final C4587V0 f19130P;

    /* renamed from: Q */
    public final AbstractC4590X f19131Q;

    /* renamed from: R */
    public C4404E.b f19132R;

    /* renamed from: S */
    public final C4403D f19133S;

    /* renamed from: T */
    public int f19134T;

    /* renamed from: U */
    public Runnable f19135U;

    /* renamed from: a */
    public final InetSocketAddress f19136a;

    /* renamed from: b */
    public final String f19137b;

    /* renamed from: c */
    public final String f19138c;

    /* renamed from: d */
    public final Random f19139d;

    /* renamed from: e */
    public final InterfaceC2939v f19140e;

    /* renamed from: f */
    public final int f19141f;

    /* renamed from: g */
    public final InterfaceC5548j f19142g;

    /* renamed from: h */
    public InterfaceC4617l0.a f19143h;

    /* renamed from: i */
    public C5373b f19144i;

    /* renamed from: j */
    public C5389r f19145j;

    /* renamed from: k */
    public final Object f19146k;

    /* renamed from: l */
    public final C4410K f19147l;

    /* renamed from: m */
    public int f19148m;

    /* renamed from: n */
    public final Map f19149n;

    /* renamed from: o */
    public final Executor f19150o;

    /* renamed from: p */
    public final ExecutorC4566K0 f19151p;

    /* renamed from: q */
    public final ScheduledExecutorService f19152q;

    /* renamed from: r */
    public final int f19153r;

    /* renamed from: s */
    public int f19154s;

    /* renamed from: t */
    public e f19155t;

    /* renamed from: u */
    public C4425a f19156u;

    /* renamed from: v */
    public C4448l0 f19157v;

    /* renamed from: w */
    public boolean f19158w;

    /* renamed from: x */
    public C4588W f19159x;

    /* renamed from: y */
    public boolean f19160y;

    /* renamed from: z */
    public boolean f19161z;

    /* renamed from: j5.i$a */
    public class a extends AbstractC4590X {
        public a() {
        }

        @Override // p253i5.AbstractC4590X
        /* renamed from: b */
        public void mo19698b() {
            C5380i.this.f19143h.mo19764e(true);
        }

        @Override // p253i5.AbstractC4590X
        /* renamed from: c */
        public void mo19699c() {
            C5380i.this.f19143h.mo19764e(false);
        }
    }

    /* renamed from: j5.i$b */
    public class b implements C4587V0.c {
        public b() {
        }
    }

    /* renamed from: j5.i$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = C5380i.this.f19135U;
            if (runnable != null) {
                runnable.run();
            }
            C5380i.this.f19150o.execute(C5380i.this.f19155t);
            synchronized (C5380i.this.f19146k) {
                C5380i.this.f19119E = C3643a.e.API_PRIORITY_OTHER;
                C5380i.this.m22223l0();
            }
            C5380i.this.getClass();
        }
    }

    public C5380i(C5377f.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C4425a c4425a, C4403D c4403d, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, c4425a, AbstractC4580S.f16591w, new C5545g(), c4403d, runnable);
    }

    /* renamed from: E */
    public static /* synthetic */ int m22171E(C5380i c5380i, int i7) {
        int i8 = c5380i.f19154s + i7;
        c5380i.f19154s = i8;
        return i8;
    }

    /* renamed from: R */
    public static Map m22184R() {
        EnumMap enumMap = new EnumMap(EnumC5539a.class);
        EnumC5539a enumC5539a = EnumC5539a.NO_ERROR;
        C4448l0 c4448l0 = C4448l0.f15809s;
        enumMap.put((EnumMap) enumC5539a, (EnumC5539a) c4448l0.m18963q("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) EnumC5539a.PROTOCOL_ERROR, (EnumC5539a) c4448l0.m18963q("Protocol error"));
        enumMap.put((EnumMap) EnumC5539a.INTERNAL_ERROR, (EnumC5539a) c4448l0.m18963q("Internal error"));
        enumMap.put((EnumMap) EnumC5539a.FLOW_CONTROL_ERROR, (EnumC5539a) c4448l0.m18963q("Flow control error"));
        enumMap.put((EnumMap) EnumC5539a.STREAM_CLOSED, (EnumC5539a) c4448l0.m18963q("Stream closed"));
        enumMap.put((EnumMap) EnumC5539a.FRAME_TOO_LARGE, (EnumC5539a) c4448l0.m18963q("Frame too large"));
        enumMap.put((EnumMap) EnumC5539a.REFUSED_STREAM, (EnumC5539a) C4448l0.f15810t.m18963q("Refused stream"));
        enumMap.put((EnumMap) EnumC5539a.CANCEL, (EnumC5539a) C4448l0.f15796f.m18963q("Cancelled"));
        enumMap.put((EnumMap) EnumC5539a.COMPRESSION_ERROR, (EnumC5539a) c4448l0.m18963q("Compression error"));
        enumMap.put((EnumMap) EnumC5539a.CONNECT_ERROR, (EnumC5539a) c4448l0.m18963q("Connect error"));
        enumMap.put((EnumMap) EnumC5539a.ENHANCE_YOUR_CALM, (EnumC5539a) C4448l0.f15804n.m18963q("Enhance your calm"));
        enumMap.put((EnumMap) EnumC5539a.INADEQUATE_SECURITY, (EnumC5539a) C4448l0.f15802l.m18963q("Inadequate security"));
        return DesugarCollections.unmodifiableMap(enumMap);
    }

    /* renamed from: g0 */
    public static String m22185g0(InterfaceC3609V interfaceC3609V) {
        C3616d c3616d = new C3616d();
        while (interfaceC3609V.mo14512P(c3616d, 1L) != -1) {
            if (c3616d.m14627o(c3616d.m14618c0() - 1) == 10) {
                return c3616d.m14613R();
            }
        }
        throw new EOFException("\\n not found: " + c3616d.m14606F().mo14542n());
    }

    /* renamed from: p0 */
    public static C4448l0 m22193p0(EnumC5539a enumC5539a) {
        C4448l0 c4448l0 = (C4448l0) f19113V.get(enumC5539a);
        if (c4448l0 != null) {
            return c4448l0;
        }
        return C4448l0.f15797g.m18963q("Unknown http2 error code: " + enumC5539a.f19966a);
    }

    /* renamed from: S */
    public final C5598b m22204S(InetSocketAddress inetSocketAddress, String str, String str2) {
        C5597a m23451a = new C5597a.b().m23455k("https").m23453h(inetSocketAddress.getHostName()).m23454j(inetSocketAddress.getPort()).m23451a();
        C5598b.b m23461d = new C5598b.b().m23462e(m23451a).m23461d("Host", m23451a.m23443c() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + m23451a.m23444f()).m23461d("User-Agent", this.f19138c);
        if (str != null && str2 != null) {
            m23461d.m23461d("Proxy-Authorization", AbstractC5446c.m22950a(str, str2));
        }
        return m23461d.m23460c();
    }

    /* renamed from: T */
    public final Socket m22205T(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket socket = null;
        try {
            socket = inetSocketAddress2.getAddress() != null ? this.f19115A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.f19115A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(this.f19134T);
            InterfaceC3609V m14474f = AbstractC3596H.m14474f(socket);
            InterfaceC3617e m14469a = AbstractC3596H.m14469a(AbstractC3596H.m14472d(socket));
            C5598b m22204S = m22204S(inetSocketAddress, str, str2);
            C5597a m23457b = m22204S.m23457b();
            m14469a.mo14506O(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", m23457b.m23443c(), Integer.valueOf(m23457b.m23444f()))).mo14506O("\r\n");
            int m22960b = m22204S.m23456a().m22960b();
            for (int i7 = 0; i7 < m22960b; i7++) {
                m14469a.mo14506O(m22204S.m23456a().m22959a(i7)).mo14506O(": ").mo14506O(m22204S.m23456a().m22961c(i7)).mo14506O("\r\n");
            }
            m14469a.mo14506O("\r\n");
            m14469a.flush();
            C5453j m22998a = C5453j.m22998a(m22185g0(m14474f));
            while (!m22185g0(m14474f).equals(StringUtils.EMPTY)) {
            }
            int i8 = m22998a.f19682b;
            if (i8 >= 200 && i8 < 300) {
                socket.setSoTimeout(0);
                return socket;
            }
            C3616d c3616d = new C3616d();
            try {
                socket.shutdownOutput();
                m14474f.mo14512P(c3616d, 1024L);
            } catch (IOException e7) {
                c3616d.mo14506O("Unable to read body: " + e7.toString());
            }
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw C4448l0.f15810t.m18963q(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(m22998a.f19682b), m22998a.f19683c, c3616d.m14612N())).m18955c();
        } catch (IOException e8) {
            if (socket != null) {
                AbstractC4580S.m19599e(socket);
            }
            throw C4448l0.f15810t.m18963q("Failed trying to connect with proxy").m18962p(e8).m18955c();
        }
    }

    /* renamed from: U */
    public void m22206U(boolean z6, long j7, long j8, boolean z7) {
        this.f19123I = z6;
        this.f19124J = j7;
        this.f19125K = j8;
        this.f19126L = z7;
    }

    /* renamed from: V */
    public void m22207V(int i7, C4448l0 c4448l0, InterfaceC4630s.a aVar, boolean z6, EnumC5539a enumC5539a, C4424Z c4424z) {
        synchronized (this.f19146k) {
            try {
                C5379h c5379h = (C5379h) this.f19149n.remove(Integer.valueOf(i7));
                if (c5379h != null) {
                    if (enumC5539a != null) {
                        this.f19144i.mo22113e(i7, EnumC5539a.CANCEL);
                    }
                    if (c4448l0 != null) {
                        C5379h.b mo19802u = c5379h.mo19802u();
                        if (c4424z == null) {
                            c4424z = new C4424Z();
                        }
                        mo19802u.m19789M(c4448l0, aVar, z6, c4424z);
                    }
                    if (!m22223l0()) {
                        m22225n0();
                        m22216d0(c5379h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: W */
    public String m22208W() {
        URI m19596b = AbstractC4580S.m19596b(this.f19137b);
        return m19596b.getHost() != null ? m19596b.getHost() : this.f19137b;
    }

    /* renamed from: X */
    public int m22209X() {
        URI m19596b = AbstractC4580S.m19596b(this.f19137b);
        return m19596b.getPort() != -1 ? m19596b.getPort() : this.f19136a.getPort();
    }

    /* renamed from: Y */
    public final Throwable m22210Y() {
        synchronized (this.f19146k) {
            try {
                C4448l0 c4448l0 = this.f19157v;
                if (c4448l0 != null) {
                    return c4448l0.m18955c();
                }
                return C4448l0.f15810t.m18963q("Connection closed").m18955c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: Z */
    public C5379h m22211Z(int i7) {
        C5379h c5379h;
        synchronized (this.f19146k) {
            c5379h = (C5379h) this.f19149n.get(Integer.valueOf(i7));
        }
        return c5379h;
    }

    @Override // p264j5.C5389r.d
    /* renamed from: a */
    public C5389r.c[] mo22212a() {
        C5389r.c[] cVarArr;
        synchronized (this.f19146k) {
            try {
                cVarArr = new C5389r.c[this.f19149n.size()];
                Iterator it = this.f19149n.values().iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    cVarArr[i7] = ((C5379h) it.next()).mo19802u().m22158b0();
                    i7++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarArr;
    }

    /* renamed from: a0 */
    public final void m22213a0() {
        synchronized (this.f19146k) {
            this.f19130P.m19683g(new b());
        }
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: b */
    public void mo19348b(C4448l0 c4448l0) {
        mo19350f(c4448l0);
        synchronized (this.f19146k) {
            try {
                Iterator it = this.f19149n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((C5379h) entry.getValue()).mo19802u().m19790N(c4448l0, false, new C4424Z());
                    m22216d0((C5379h) entry.getValue());
                }
                for (C5379h c5379h : this.f19120F) {
                    c5379h.mo19802u().m19789M(c4448l0, InterfaceC4630s.a.MISCARRIED, true, new C4424Z());
                    m22216d0(c5379h);
                }
                this.f19120F.clear();
                m22225n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b0 */
    public boolean m22214b0() {
        return this.f19116B == null;
    }

    @Override // p253i5.InterfaceC4638w
    /* renamed from: c */
    public C4425a mo19521c() {
        return this.f19156u;
    }

    /* renamed from: c0 */
    public boolean m22215c0(int i7) {
        boolean z6;
        synchronized (this.f19146k) {
            if (i7 < this.f19148m) {
                z6 = true;
                if ((i7 & 1) == 1) {
                }
            }
            z6 = false;
        }
        return z6;
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: d */
    public Runnable mo19349d(InterfaceC4617l0.a aVar) {
        this.f19143h = (InterfaceC4617l0.a) AbstractC2932o.m10573p(aVar, "listener");
        if (this.f19123I) {
            C4601d0 c4601d0 = new C4601d0(new C4601d0.c(this), this.f19152q, this.f19124J, this.f19125K, this.f19126L);
            this.f19122H = c4601d0;
            c4601d0.m19852p();
        }
        C5372a m22099C = C5372a.m22099C(this.f19151p, this, PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);
        InterfaceC5541c m22111y = m22099C.m22111y(this.f19142g.mo23229b(AbstractC3596H.m14469a(m22099C), true));
        synchronized (this.f19146k) {
            C5373b c5373b = new C5373b(this, m22111y);
            this.f19144i = c5373b;
            this.f19145j = new C5389r(this, c5373b);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f19151p.execute(new c(countDownLatch, m22099C));
        try {
            m22220i0();
            countDownLatch.countDown();
            this.f19151p.execute(new d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* renamed from: d0 */
    public final void m22216d0(C5379h c5379h) {
        if (this.f19161z && this.f19120F.isEmpty() && this.f19149n.isEmpty()) {
            this.f19161z = false;
            C4601d0 c4601d0 = this.f19122H;
            if (c4601d0 != null) {
                c4601d0.m19851o();
            }
        }
        if (c5379h.m19770y()) {
            this.f19131Q.m19701e(c5379h, false);
        }
    }

    @Override // p253i5.InterfaceC4632t
    /* renamed from: e */
    public void mo19522e(InterfaceC4632t.a aVar, Executor executor) {
        long nextLong;
        synchronized (this.f19146k) {
            try {
                boolean z6 = true;
                AbstractC2932o.m10578u(this.f19144i != null);
                if (this.f19160y) {
                    C4588W.m19688g(aVar, executor, m22210Y());
                    return;
                }
                C4588W c4588w = this.f19159x;
                if (c4588w != null) {
                    nextLong = 0;
                    z6 = false;
                } else {
                    nextLong = this.f19139d.nextLong();
                    C2937t c2937t = (C2937t) this.f19140e.get();
                    c2937t.m10606g();
                    C4588W c4588w2 = new C4588W(nextLong, c2937t);
                    this.f19159x = c4588w2;
                    this.f19130P.m19678b();
                    c4588w = c4588w2;
                }
                if (z6) {
                    this.f19144i.mo22114i(false, (int) (nextLong >>> 32), (int) nextLong);
                }
                c4588w.m19689a(aVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p253i5.InterfaceC4632t
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C5379h mo19351g(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, AbstractC4445k[] abstractC4445kArr) {
        AbstractC2932o.m10573p(c4426a0, "method");
        AbstractC2932o.m10573p(c4424z, "headers");
        C4576P0 m19582h = C4576P0.m19582h(abstractC4445kArr, mo19521c(), c4424z);
        synchronized (this.f19146k) {
            try {
                try {
                    return new C5379h(c4426a0, c4424z, this.f19144i, this, this.f19145j, this.f19146k, this.f19153r, this.f19141f, this.f19137b, this.f19138c, m19582h, this.f19130P, c4429c, this.f19129O);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: f */
    public void mo19350f(C4448l0 c4448l0) {
        synchronized (this.f19146k) {
            try {
                if (this.f19157v != null) {
                    return;
                }
                this.f19157v = c4448l0;
                this.f19143h.mo19763d(c4448l0);
                m22225n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f0 */
    public final void m22218f0(EnumC5539a enumC5539a, String str) {
        m22222k0(0, enumC5539a, m22193p0(enumC5539a).m18957e(str));
    }

    @Override // p264j5.C5373b.a
    /* renamed from: h */
    public void mo22124h(Throwable th) {
        AbstractC2932o.m10573p(th, "failureCause");
        m22222k0(0, EnumC5539a.INTERNAL_ERROR, C4448l0.f15810t.m18962p(th));
    }

    /* renamed from: h0 */
    public void m22219h0(C5379h c5379h) {
        this.f19120F.remove(c5379h);
        m22216d0(c5379h);
    }

    @Override // p237g5.InterfaceC4415P
    /* renamed from: i */
    public C4410K mo18676i() {
        return this.f19147l;
    }

    /* renamed from: i0 */
    public final void m22220i0() {
        synchronized (this.f19146k) {
            try {
                this.f19144i.mo22117B();
                C5547i c5547i = new C5547i();
                AbstractC5385n.m22264c(c5547i, 7, this.f19141f);
                this.f19144i.mo22119U(c5547i);
                if (this.f19141f > 65535) {
                    this.f19144i.mo22120f(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j0 */
    public final void m22221j0(C5379h c5379h) {
        if (!this.f19161z) {
            this.f19161z = true;
            C4601d0 c4601d0 = this.f19122H;
            if (c4601d0 != null) {
                c4601d0.m19850n();
            }
        }
        if (c5379h.m19770y()) {
            this.f19131Q.m19701e(c5379h, true);
        }
    }

    /* renamed from: k0 */
    public final void m22222k0(int i7, EnumC5539a enumC5539a, C4448l0 c4448l0) {
        synchronized (this.f19146k) {
            try {
                if (this.f19157v == null) {
                    this.f19157v = c4448l0;
                    this.f19143h.mo19763d(c4448l0);
                }
                if (enumC5539a != null && !this.f19158w) {
                    this.f19158w = true;
                    this.f19144i.mo22118L(0, enumC5539a, new byte[0]);
                }
                Iterator it = this.f19149n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i7) {
                        it.remove();
                        ((C5379h) entry.getValue()).mo19802u().m19789M(c4448l0, InterfaceC4630s.a.REFUSED, false, new C4424Z());
                        m22216d0((C5379h) entry.getValue());
                    }
                }
                for (C5379h c5379h : this.f19120F) {
                    c5379h.mo19802u().m19789M(c4448l0, InterfaceC4630s.a.MISCARRIED, true, new C4424Z());
                    m22216d0(c5379h);
                }
                this.f19120F.clear();
                m22225n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l0 */
    public final boolean m22223l0() {
        boolean z6 = false;
        while (!this.f19120F.isEmpty() && this.f19149n.size() < this.f19119E) {
            m22224m0((C5379h) this.f19120F.poll());
            z6 = true;
        }
        return z6;
    }

    /* renamed from: m0 */
    public final void m22224m0(C5379h c5379h) {
        AbstractC2932o.m10579v(c5379h.mo19802u().m22159c0() == -1, "StreamId already assigned");
        this.f19149n.put(Integer.valueOf(this.f19148m), c5379h);
        m22221j0(c5379h);
        c5379h.mo19802u().m22162f0(this.f19148m);
        if ((c5379h.m22150M() != C4426a0.d.UNARY && c5379h.m22150M() != C4426a0.d.SERVER_STREAMING) || c5379h.m22152O()) {
            this.f19144i.flush();
        }
        int i7 = this.f19148m;
        if (i7 < 2147483645) {
            this.f19148m = i7 + 2;
        } else {
            this.f19148m = C3643a.e.API_PRIORITY_OTHER;
            m22222k0(C3643a.e.API_PRIORITY_OTHER, EnumC5539a.NO_ERROR, C4448l0.f15810t.m18963q("Stream ids exhausted"));
        }
    }

    /* renamed from: n0 */
    public final void m22225n0() {
        if (this.f19157v == null || !this.f19149n.isEmpty() || !this.f19120F.isEmpty() || this.f19160y) {
            return;
        }
        this.f19160y = true;
        C4601d0 c4601d0 = this.f19122H;
        if (c4601d0 != null) {
            c4601d0.m19853q();
        }
        C4588W c4588w = this.f19159x;
        if (c4588w != null) {
            c4588w.m19691f(m22210Y());
            this.f19159x = null;
        }
        if (!this.f19158w) {
            this.f19158w = true;
            this.f19144i.mo22118L(0, EnumC5539a.NO_ERROR, new byte[0]);
        }
        this.f19144i.close();
    }

    /* renamed from: o0 */
    public void m22226o0(C5379h c5379h) {
        if (this.f19157v != null) {
            c5379h.mo19802u().m19789M(this.f19157v, InterfaceC4630s.a.MISCARRIED, true, new C4424Z());
        } else if (this.f19149n.size() < this.f19119E) {
            m22224m0(c5379h);
        } else {
            this.f19120F.add(c5379h);
            m22221j0(c5379h);
        }
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10539c("logId", this.f19147l.m18668d()).m10540d("address", this.f19136a).toString();
    }

    public C5380i(C5377f.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C4425a c4425a, InterfaceC2939v interfaceC2939v, InterfaceC5548j interfaceC5548j, C4403D c4403d, Runnable runnable) {
        this.f19139d = new Random();
        this.f19146k = new Object();
        this.f19149n = new HashMap();
        this.f19119E = 0;
        this.f19120F = new LinkedList();
        this.f19131Q = new a();
        this.f19134T = 30000;
        this.f19136a = (InetSocketAddress) AbstractC2932o.m10573p(inetSocketAddress, "address");
        this.f19137b = str;
        this.f19153r = fVar.f19074q;
        this.f19141f = fVar.f19079v;
        this.f19150o = (Executor) AbstractC2932o.m10573p(fVar.f19066b, "executor");
        this.f19151p = new ExecutorC4566K0(fVar.f19066b);
        this.f19152q = (ScheduledExecutorService) AbstractC2932o.m10573p(fVar.f19068d, "scheduledExecutorService");
        this.f19148m = 3;
        SocketFactory socketFactory = fVar.f19070f;
        this.f19115A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f19116B = fVar.f19071n;
        this.f19117C = fVar.f19072o;
        this.f19121G = (C5445b) AbstractC2932o.m10573p(fVar.f19073p, "connectionSpec");
        this.f19140e = (InterfaceC2939v) AbstractC2932o.m10573p(interfaceC2939v, "stopwatchFactory");
        this.f19142g = (InterfaceC5548j) AbstractC2932o.m10573p(interfaceC5548j, "variant");
        this.f19138c = AbstractC4580S.m19602h("okhttp", str2);
        this.f19133S = c4403d;
        this.f19127M = (Runnable) AbstractC2932o.m10573p(runnable, "tooManyPingsRunnable");
        this.f19128N = fVar.f19081x;
        this.f19130P = fVar.f19069e.m19684a();
        this.f19147l = C4410K.m18664a(getClass(), inetSocketAddress.toString());
        this.f19156u = C4425a.m18818c().m18824d(AbstractC4577Q.f16568b, c4425a).m18821a();
        this.f19129O = fVar.f19082y;
        m22213a0();
    }

    /* renamed from: j5.i$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f19164a;

        /* renamed from: b */
        public final /* synthetic */ C5372a f19165b;

        public c(CountDownLatch countDownLatch, C5372a c5372a) {
            this.f19164a = countDownLatch;
            this.f19165b = c5372a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5380i c5380i;
            e eVar;
            Socket m22205T;
            SSLSession sSLSession;
            Socket socket;
            try {
                this.f19164a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            InterfaceC3618f m14470b = AbstractC3596H.m14470b(new a());
            try {
                try {
                    C5380i c5380i2 = C5380i.this;
                    C4403D c4403d = c5380i2.f19133S;
                    if (c4403d == null) {
                        m22205T = c5380i2.f19115A.createSocket(C5380i.this.f19136a.getAddress(), C5380i.this.f19136a.getPort());
                    } else {
                        if (!(c4403d.m18631b() instanceof InetSocketAddress)) {
                            throw C4448l0.f15809s.m18963q("Unsupported SocketAddress implementation " + C5380i.this.f19133S.m18631b().getClass()).m18955c();
                        }
                        C5380i c5380i3 = C5380i.this;
                        m22205T = c5380i3.m22205T(c5380i3.f19133S.m18632c(), (InetSocketAddress) C5380i.this.f19133S.m18631b(), C5380i.this.f19133S.m18633d(), C5380i.this.f19133S.m18630a());
                    }
                    Socket socket2 = m22205T;
                    if (C5380i.this.f19116B != null) {
                        SSLSocket m22266b = AbstractC5386o.m22266b(C5380i.this.f19116B, C5380i.this.f19117C, socket2, C5380i.this.m22208W(), C5380i.this.m22209X(), C5380i.this.f19121G);
                        sSLSession = m22266b.getSession();
                        socket = m22266b;
                    } else {
                        sSLSession = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    InterfaceC3618f m14470b2 = AbstractC3596H.m14470b(AbstractC3596H.m14474f(socket));
                    this.f19165b.m22110w(AbstractC3596H.m14472d(socket), socket);
                    C5380i c5380i4 = C5380i.this;
                    c5380i4.f19156u = c5380i4.f19156u.m18820d().m18824d(AbstractC4402C.f15589a, socket.getRemoteSocketAddress()).m18824d(AbstractC4402C.f15590b, socket.getLocalSocketAddress()).m18824d(AbstractC4402C.f15591c, sSLSession).m18824d(AbstractC4577Q.f16567a, sSLSession == null ? EnumC4442i0.NONE : EnumC4442i0.PRIVACY_AND_INTEGRITY).m18821a();
                    C5380i c5380i5 = C5380i.this;
                    c5380i5.f19155t = c5380i5.new e(c5380i5.f19142g.mo23228a(m14470b2, true));
                    synchronized (C5380i.this.f19146k) {
                        try {
                            C5380i.this.f19118D = (Socket) AbstractC2932o.m10573p(socket, "socket");
                            if (sSLSession != null) {
                                C5380i.this.f19132R = new C4404E.b(new C4404E.c(sSLSession));
                            }
                        } finally {
                        }
                    }
                } catch (C4450m0 e7) {
                    C5380i.this.m22222k0(0, EnumC5539a.INTERNAL_ERROR, e7.m18976a());
                    c5380i = C5380i.this;
                    eVar = c5380i.new e(c5380i.f19142g.mo23228a(m14470b, true));
                    c5380i.f19155t = eVar;
                } catch (Exception e8) {
                    C5380i.this.mo22124h(e8);
                    c5380i = C5380i.this;
                    eVar = c5380i.new e(c5380i.f19142g.mo23228a(m14470b, true));
                    c5380i.f19155t = eVar;
                }
            } catch (Throwable th) {
                C5380i c5380i6 = C5380i.this;
                c5380i6.f19155t = c5380i6.new e(c5380i6.f19142g.mo23228a(m14470b, true));
                throw th;
            }
        }

        /* renamed from: j5.i$c$a */
        public class a implements InterfaceC3609V {
            public a() {
            }

            @Override // p206c6.InterfaceC3609V
            /* renamed from: P */
            public long mo14512P(C3616d c3616d, long j7) {
                return -1L;
            }

            @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
            public void close() {
            }
        }
    }

    /* renamed from: j5.i$e */
    public class e implements InterfaceC5540b.a, Runnable {

        /* renamed from: b */
        public InterfaceC5540b f19170b;

        /* renamed from: a */
        public final C5381j f19169a = new C5381j(Level.FINE, C5380i.class);

        /* renamed from: c */
        public boolean f19171c = true;

        public e(InterfaceC5540b interfaceC5540b) {
            this.f19170b = interfaceC5540b;
        }

        /* renamed from: a */
        public final int m22227a(List list) {
            long j7 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                C5542d c5542d = (C5542d) list.get(i7);
                j7 += c5542d.f19976a.size() + 32 + c5542d.f19977b.size();
            }
            return (int) Math.min(j7, 2147483647L);
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: e */
        public void mo22228e(int i7, EnumC5539a enumC5539a) {
            this.f19169a.m22247h(C5381j.a.INBOUND, i7, enumC5539a);
            C4448l0 m18957e = C5380i.m22193p0(enumC5539a).m18957e("Rst Stream");
            boolean z6 = m18957e.m18959m() == C4448l0.b.CANCELLED || m18957e.m18959m() == C4448l0.b.DEADLINE_EXCEEDED;
            synchronized (C5380i.this.f19146k) {
                try {
                    C5379h c5379h = (C5379h) C5380i.this.f19149n.get(Integer.valueOf(i7));
                    if (c5379h != null) {
                        AbstractC6227c.m25986d("OkHttpClientTransport$ClientFrameHandler.rstStream", c5379h.mo19802u().m22164h0());
                        C5380i.this.m22207V(i7, m18957e, enumC5539a == EnumC5539a.REFUSED_STREAM ? InterfaceC4630s.a.REFUSED : InterfaceC4630s.a.PROCESSED, z6, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo22229f(int r8, long r9) {
            /*
                r7 = this;
                j5.j r0 = r7.f19169a
                j5.j$a r1 = p264j5.C5381j.a.INBOUND
                r0.m22250k(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                j5.i r8 = p264j5.C5380i.this
                l5.a r10 = p281l5.EnumC5539a.PROTOCOL_ERROR
                p264j5.C5380i.m22168B(r8, r10, r9)
                goto L2b
            L19:
                j5.i r0 = p264j5.C5380i.this
                g5.l0 r10 = p237g5.C4448l0.f15809s
                g5.l0 r2 = r10.m18963q(r9)
                i5.s$a r3 = p253i5.InterfaceC4630s.a.PROCESSED
                l5.a r5 = p281l5.EnumC5539a.PROTOCOL_ERROR
                r6 = 0
                r4 = 0
                r1 = r8
                r0.m22207V(r1, r2, r3, r4, r5, r6)
            L2b:
                return
            L2c:
                j5.i r0 = p264j5.C5380i.this
                java.lang.Object r0 = p264j5.C5380i.m22187k(r0)
                monitor-enter(r0)
                if (r8 != 0) goto L44
                j5.i r8 = p264j5.C5380i.this     // Catch: java.lang.Throwable -> L42
                j5.r r8 = p264j5.C5380i.m22201x(r8)     // Catch: java.lang.Throwable -> L42
                r1 = 0
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r8.m22274g(r1, r9)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                return
            L42:
                r8 = move-exception
                goto L90
            L44:
                j5.i r1 = p264j5.C5380i.this     // Catch: java.lang.Throwable -> L42
                java.util.Map r1 = p264j5.C5380i.m22173G(r1)     // Catch: java.lang.Throwable -> L42
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L42
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
                j5.h r1 = (p264j5.C5379h) r1     // Catch: java.lang.Throwable -> L42
                if (r1 == 0) goto L69
                j5.i r2 = p264j5.C5380i.this     // Catch: java.lang.Throwable -> L42
                j5.r r2 = p264j5.C5380i.m22201x(r2)     // Catch: java.lang.Throwable -> L42
                j5.h$b r1 = r1.mo19802u()     // Catch: java.lang.Throwable -> L42
                j5.r$c r1 = r1.m22158b0()     // Catch: java.lang.Throwable -> L42
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r2.m22274g(r1, r9)     // Catch: java.lang.Throwable -> L42
                goto L73
            L69:
                j5.i r9 = p264j5.C5380i.this     // Catch: java.lang.Throwable -> L42
                boolean r9 = r9.m22215c0(r8)     // Catch: java.lang.Throwable -> L42
                if (r9 != 0) goto L73
                r9 = 1
                goto L74
            L73:
                r9 = 0
            L74:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                if (r9 == 0) goto L8f
                j5.i r9 = p264j5.C5380i.this
                l5.a r10 = p281l5.EnumC5539a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                p264j5.C5380i.m22168B(r9, r10, r8)
            L8f:
                return
            L90:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p264j5.C5380i.e.mo22229f(int, long):void");
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: i */
        public void mo22230i(boolean z6, int i7, int i8) {
            C4588W c4588w;
            long j7 = (i7 << 32) | (i8 & 4294967295L);
            this.f19169a.m22244e(C5381j.a.INBOUND, j7);
            if (!z6) {
                synchronized (C5380i.this.f19146k) {
                    C5380i.this.f19144i.mo22114i(true, i7, i8);
                }
                return;
            }
            synchronized (C5380i.this.f19146k) {
                try {
                    c4588w = null;
                    if (C5380i.this.f19159x == null) {
                        C5380i.f19114W.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (C5380i.this.f19159x.m19692h() == j7) {
                        C4588W c4588w2 = C5380i.this.f19159x;
                        C5380i.this.f19159x = null;
                        c4588w = c4588w2;
                    } else {
                        C5380i.f19114W.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(C5380i.this.f19159x.m19692h()), Long.valueOf(j7)));
                    }
                } finally {
                }
            }
            if (c4588w != null) {
                c4588w.m19690d();
            }
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: k */
        public void mo22232k(boolean z6, boolean z7, int i7, int i8, List list, EnumC5543e enumC5543e) {
            C4448l0 c4448l0;
            int m22227a;
            boolean z8 = true;
            this.f19169a.m22243d(C5381j.a.INBOUND, i7, list, z7);
            if (C5380i.this.f19128N == Integer.MAX_VALUE || (m22227a = m22227a(list)) <= C5380i.this.f19128N) {
                c4448l0 = null;
            } else {
                c4448l0 = C4448l0.f15804n.m18963q(String.format(Locale.US, "Response %s metadata larger than %d: %d", z7 ? "trailer" : "header", Integer.valueOf(C5380i.this.f19128N), Integer.valueOf(m22227a)));
            }
            synchronized (C5380i.this.f19146k) {
                try {
                    C5379h c5379h = (C5379h) C5380i.this.f19149n.get(Integer.valueOf(i7));
                    if (c5379h == null) {
                        if (C5380i.this.m22215c0(i7)) {
                            C5380i.this.f19144i.mo22113e(i7, EnumC5539a.STREAM_CLOSED);
                        }
                    } else if (c4448l0 == null) {
                        AbstractC6227c.m25986d("OkHttpClientTransport$ClientFrameHandler.headers", c5379h.mo19802u().m22164h0());
                        c5379h.mo19802u().m22166j0(list, z7);
                    } else {
                        if (!z7) {
                            C5380i.this.f19144i.mo22113e(i7, EnumC5539a.CANCEL);
                        }
                        c5379h.mo19802u().m19790N(c4448l0, false, new C4424Z());
                    }
                    z8 = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z8) {
                C5380i.this.m22218f0(EnumC5539a.PROTOCOL_ERROR, "Received header for unknown stream: " + i7);
            }
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: l */
        public void mo22233l(boolean z6, C5547i c5547i) {
            boolean z7;
            this.f19169a.m22248i(C5381j.a.INBOUND, c5547i);
            synchronized (C5380i.this.f19146k) {
                try {
                    if (AbstractC5385n.m22263b(c5547i, 4)) {
                        C5380i.this.f19119E = AbstractC5385n.m22262a(c5547i, 4);
                    }
                    if (AbstractC5385n.m22263b(c5547i, 7)) {
                        z7 = C5380i.this.f19145j.m22273f(AbstractC5385n.m22262a(c5547i, 7));
                    } else {
                        z7 = false;
                    }
                    if (this.f19171c) {
                        C5380i c5380i = C5380i.this;
                        c5380i.f19156u = c5380i.f19143h.mo19760a(C5380i.this.f19156u);
                        C5380i.this.f19143h.mo19761b();
                        this.f19171c = false;
                    }
                    C5380i.this.f19144i.mo22115m0(c5547i);
                    if (z7) {
                        C5380i.this.f19145j.m22275h();
                    }
                    C5380i.this.m22223l0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: m */
        public void mo22234m(int i7, EnumC5539a enumC5539a, C3619g c3619g) {
            this.f19169a.m22242c(C5381j.a.INBOUND, i7, enumC5539a, c3619g);
            if (enumC5539a == EnumC5539a.ENHANCE_YOUR_CALM) {
                String m14644G = c3619g.m14644G();
                C5380i.f19114W.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, m14644G));
                if ("too_many_pings".equals(m14644G)) {
                    C5380i.this.f19127M.run();
                }
            }
            C4448l0 m18957e = AbstractC4580S.h.m19620i(enumC5539a.f19966a).m18957e("Received Goaway");
            if (c3619g.size() > 0) {
                m18957e = m18957e.m18957e(c3619g.m14644G());
            }
            C5380i.this.m22222k0(i7, null, m18957e);
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: o */
        public void mo22236o(boolean z6, int i7, InterfaceC3618f interfaceC3618f, int i8, int i9) {
            this.f19169a.m22241b(C5381j.a.INBOUND, i7, interfaceC3618f.mo14522x(), i8, z6);
            C5379h m22211Z = C5380i.this.m22211Z(i7);
            if (m22211Z != null) {
                long j7 = i8;
                interfaceC3618f.mo14520s0(j7);
                C3616d c3616d = new C3616d();
                c3616d.mo14482s(interfaceC3618f.mo14522x(), j7);
                AbstractC6227c.m25986d("OkHttpClientTransport$ClientFrameHandler.data", m22211Z.mo19802u().m22164h0());
                synchronized (C5380i.this.f19146k) {
                    m22211Z.mo19802u().m22165i0(c3616d, z6, i9 - i8);
                }
            } else {
                if (!C5380i.this.m22215c0(i7)) {
                    C5380i.this.m22218f0(EnumC5539a.PROTOCOL_ERROR, "Received data for unknown stream: " + i7);
                    return;
                }
                synchronized (C5380i.this.f19146k) {
                    C5380i.this.f19144i.mo22113e(i7, EnumC5539a.STREAM_CLOSED);
                }
                interfaceC3618f.skip(i8);
            }
            C5380i.m22171E(C5380i.this, i9);
            if (C5380i.this.f19154s >= C5380i.this.f19141f * 0.5f) {
                synchronized (C5380i.this.f19146k) {
                    C5380i.this.f19144i.mo22120f(0, C5380i.this.f19154s);
                }
                C5380i.this.f19154s = 0;
            }
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: p */
        public void mo22237p(int i7, int i8, List list) {
            this.f19169a.m22246g(C5381j.a.INBOUND, i7, i8, list);
            synchronized (C5380i.this.f19146k) {
                C5380i.this.f19144i.mo22113e(i7, EnumC5539a.PROTOCOL_ERROR);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C4448l0 c4448l0;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f19170b.mo23185X(this)) {
                try {
                    if (C5380i.this.f19122H != null) {
                        C5380i.this.f19122H.m19849m();
                    }
                } catch (Throwable th) {
                    try {
                        C5380i.this.m22222k0(0, EnumC5539a.PROTOCOL_ERROR, C4448l0.f15809s.m18963q("error in frame handler").m18962p(th));
                        try {
                            this.f19170b.close();
                        } catch (IOException e7) {
                            e = e7;
                            C5380i.f19114W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e8) {
                            if (!"bio == null".equals(e8.getMessage())) {
                                throw e8;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f19170b.close();
                        } catch (IOException e9) {
                            C5380i.f19114W.log(Level.INFO, "Exception closing frame reader", (Throwable) e9);
                        } catch (RuntimeException e10) {
                            if (!"bio == null".equals(e10.getMessage())) {
                                throw e10;
                            }
                        }
                        C5380i.this.f19143h.mo19762c();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (C5380i.this.f19146k) {
                c4448l0 = C5380i.this.f19157v;
            }
            if (c4448l0 == null) {
                c4448l0 = C4448l0.f15810t.m18963q("End of stream or IOException");
            }
            C5380i.this.m22222k0(0, EnumC5539a.INTERNAL_ERROR, c4448l0);
            try {
                this.f19170b.close();
            } catch (IOException e11) {
                e = e11;
                C5380i.f19114W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e12) {
                if (!"bio == null".equals(e12.getMessage())) {
                    throw e12;
                }
            }
            C5380i.this.f19143h.mo19762c();
            Thread.currentThread().setName(name);
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: j */
        public void mo22231j() {
        }

        @Override // p281l5.InterfaceC5540b.a
        /* renamed from: n */
        public void mo22235n(int i7, int i8, int i9, boolean z6) {
        }
    }
}
