package p253i5;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2932o;
import p171Y2.AbstractC2938u;
import p171Y2.C2936s;
import p171Y2.C2937t;
import p171Y2.InterfaceC2939v;
import p211d3.C4117g;
import p237g5.AbstractC4412M;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4438g0;
import p237g5.AbstractC4445k;
import p237g5.C4410K;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.InterfaceC4440h0;
import p253i5.C4570M0;
import p253i5.InterfaceC4579R0;
import p253i5.InterfaceC4630s;
import p256j$.util.DesugarCollections;

/* renamed from: i5.S */
/* loaded from: classes2.dex */
public abstract class AbstractC4580S {

    /* renamed from: a */
    public static final Logger f16569a = Logger.getLogger(AbstractC4580S.class.getName());

    /* renamed from: b */
    public static final Set f16570b = DesugarCollections.unmodifiableSet(EnumSet.of(C4448l0.b.OK, C4448l0.b.INVALID_ARGUMENT, C4448l0.b.NOT_FOUND, C4448l0.b.ALREADY_EXISTS, C4448l0.b.FAILED_PRECONDITION, C4448l0.b.ABORTED, C4448l0.b.OUT_OF_RANGE, C4448l0.b.DATA_LOSS));

    /* renamed from: c */
    public static final Charset f16571c = Charset.forName("US-ASCII");

    /* renamed from: d */
    public static final C4424Z.g f16572d = C4424Z.g.m18802e("grpc-timeout", new i());

    /* renamed from: e */
    public static final C4424Z.g f16573e;

    /* renamed from: f */
    public static final C4424Z.g f16574f;

    /* renamed from: g */
    public static final C4424Z.g f16575g;

    /* renamed from: h */
    public static final C4424Z.g f16576h;

    /* renamed from: i */
    public static final C4424Z.g f16577i;

    /* renamed from: j */
    public static final C4424Z.g f16578j;

    /* renamed from: k */
    public static final C4424Z.g f16579k;

    /* renamed from: l */
    public static final C4424Z.g f16580l;

    /* renamed from: m */
    public static final C2936s f16581m;

    /* renamed from: n */
    public static final long f16582n;

    /* renamed from: o */
    public static final long f16583o;

    /* renamed from: p */
    public static final long f16584p;

    /* renamed from: q */
    public static final InterfaceC4440h0 f16585q;

    /* renamed from: r */
    public static final InterfaceC4440h0 f16586r;

    /* renamed from: s */
    public static final C4429c.c f16587s;

    /* renamed from: t */
    public static final AbstractC4445k f16588t;

    /* renamed from: u */
    public static final C4570M0.d f16589u;

    /* renamed from: v */
    public static final C4570M0.d f16590v;

    /* renamed from: w */
    public static final InterfaceC2939v f16591w;

    /* renamed from: i5.S$a */
    public class a implements InterfaceC4440h0 {
        @Override // p237g5.InterfaceC4440h0
        /* renamed from: a */
        public AbstractC4438g0 mo18926a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* renamed from: i5.S$b */
    public class b extends AbstractC4445k {
    }

    /* renamed from: i5.S$c */
    public class c implements C4570M0.d {
        @Override // p253i5.C4570M0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19574b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // p253i5.C4570M0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor mo19573a() {
            return Executors.newCachedThreadPool(AbstractC4580S.m19604j("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* renamed from: i5.S$d */
    public class d implements C4570M0.d {
        @Override // p253i5.C4570M0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19574b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // p253i5.C4570M0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService mo19573a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC4580S.m19604j("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* renamed from: i5.S$e */
    public class e implements InterfaceC2939v {
        @Override // p171Y2.InterfaceC2939v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2937t get() {
            return C2937t.m10602c();
        }
    }

    /* renamed from: i5.S$f */
    public class f implements InterfaceC4632t {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4445k.a f16592a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4632t f16593b;

        public f(AbstractC4445k.a aVar, InterfaceC4632t interfaceC4632t) {
            this.f16592a = aVar;
            this.f16593b = interfaceC4632t;
        }

        @Override // p253i5.InterfaceC4632t
        /* renamed from: g */
        public InterfaceC4628r mo19351g(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, AbstractC4445k[] abstractC4445kArr) {
            AbstractC4445k mo18933a = this.f16592a.mo18933a(AbstractC4445k.b.m18934a().m18936b(c4429c).m18935a(), c4424z);
            AbstractC2932o.m10579v(abstractC4445kArr[abstractC4445kArr.length - 1] == AbstractC4580S.f16588t, "lb tracer already assigned");
            abstractC4445kArr[abstractC4445kArr.length - 1] = mo18933a;
            return this.f16593b.mo19351g(c4426a0, c4424z, c4429c, abstractC4445kArr);
        }

        @Override // p237g5.InterfaceC4415P
        /* renamed from: i */
        public C4410K mo18676i() {
            return this.f16593b.mo18676i();
        }
    }

    /* renamed from: i5.S$g */
    public static final class g implements AbstractC4412M.a {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // p237g5.C4424Z.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo18816b(byte[] bArr) {
            return bArr;
        }

        @Override // p237g5.C4424Z.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo18815a(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: i5.S$h */
    public static final class h {

        /* renamed from: c */
        public static final h f16594c;

        /* renamed from: d */
        public static final h f16595d;

        /* renamed from: e */
        public static final h f16596e;

        /* renamed from: f */
        public static final h f16597f;

        /* renamed from: n */
        public static final h f16598n;

        /* renamed from: o */
        public static final h f16599o;

        /* renamed from: p */
        public static final h f16600p;

        /* renamed from: q */
        public static final h f16601q;

        /* renamed from: r */
        public static final h f16602r;

        /* renamed from: s */
        public static final h f16603s;

        /* renamed from: t */
        public static final h f16604t;

        /* renamed from: u */
        public static final h f16605u;

        /* renamed from: v */
        public static final h f16606v;

        /* renamed from: w */
        public static final h f16607w;

        /* renamed from: x */
        public static final h[] f16608x;

        /* renamed from: y */
        public static final /* synthetic */ h[] f16609y;

        /* renamed from: a */
        public final int f16610a;

        /* renamed from: b */
        public final C4448l0 f16611b;

        static {
            C4448l0 c4448l0 = C4448l0.f15810t;
            h hVar = new h("NO_ERROR", 0, 0, c4448l0);
            f16594c = hVar;
            C4448l0 c4448l02 = C4448l0.f15809s;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, c4448l02);
            f16595d = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, c4448l02);
            f16596e = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, c4448l02);
            f16597f = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, c4448l02);
            f16598n = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, c4448l02);
            f16599o = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, c4448l02);
            f16600p = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, c4448l0);
            f16601q = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, C4448l0.f15796f);
            f16602r = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, c4448l02);
            f16603s = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, c4448l02);
            f16604t = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, C4448l0.f15804n.m18963q("Bandwidth exhausted"));
            f16605u = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, C4448l0.f15802l.m18963q("Permission denied as protocol is not secure enough to call"));
            f16606v = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, C4448l0.f15797g);
            f16607w = hVar14;
            f16609y = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            f16608x = m19618b();
        }

        public h(String str, int i7, int i8, C4448l0 c4448l0) {
            this.f16610a = i8;
            String str2 = "HTTP/2 error code: " + name();
            if (c4448l0.m18960n() != null) {
                str2 = str2 + " (" + c4448l0.m18960n() + ")";
            }
            this.f16611b = c4448l0.m18963q(str2);
        }

        /* renamed from: b */
        public static h[] m19618b() {
            h[] values = values();
            h[] hVarArr = new h[((int) values[values.length - 1].m19621f()) + 1];
            for (h hVar : values) {
                hVarArr[(int) hVar.m19621f()] = hVar;
            }
            return hVarArr;
        }

        /* renamed from: g */
        public static h m19619g(long j7) {
            h[] hVarArr = f16608x;
            if (j7 >= hVarArr.length || j7 < 0) {
                return null;
            }
            return hVarArr[(int) j7];
        }

        /* renamed from: i */
        public static C4448l0 m19620i(long j7) {
            h m19619g = m19619g(j7);
            if (m19619g != null) {
                return m19619g.m19622h();
            }
            return C4448l0.m18951h(f16596e.m19622h().m18959m().m18966g()).m18963q("Unrecognized HTTP/2 error code: " + j7);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f16609y.clone();
        }

        /* renamed from: f */
        public long m19621f() {
            return this.f16610a;
        }

        /* renamed from: h */
        public C4448l0 m19622h() {
            return this.f16611b;
        }
    }

    /* renamed from: i5.S$i */
    public static class i implements C4424Z.d {
        @Override // p237g5.C4424Z.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long mo18796b(String str) {
            AbstractC2932o.m10562e(str.length() > 0, "empty timeout");
            AbstractC2932o.m10562e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
            }
            if (charAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            if (charAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            if (charAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
            }
            if (charAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
            }
            if (charAt == 'n') {
                return Long.valueOf(parseLong);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
        }

        @Override // p237g5.C4424Z.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo18795a(Long l7) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l7.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l7.longValue() < 100000000) {
                return l7 + "n";
            }
            if (l7.longValue() < 100000000000L) {
                return timeUnit.toMicros(l7.longValue()) + "u";
            }
            if (l7.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l7.longValue()) + "m";
            }
            if (l7.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l7.longValue()) + "S";
            }
            if (l7.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l7.longValue()) + "M";
            }
            return timeUnit.toHours(l7.longValue()) + "H";
        }
    }

    static {
        C4424Z.d dVar = C4424Z.f15677e;
        f16573e = C4424Z.g.m18802e("grpc-encoding", dVar);
        a aVar = null;
        f16574f = AbstractC4412M.m18672b("grpc-accept-encoding", new g(aVar));
        f16575g = C4424Z.g.m18802e("content-encoding", dVar);
        f16576h = AbstractC4412M.m18672b("accept-encoding", new g(aVar));
        f16577i = C4424Z.g.m18802e("content-length", dVar);
        f16578j = C4424Z.g.m18802e("content-type", dVar);
        f16579k = C4424Z.g.m18802e("te", dVar);
        f16580l = C4424Z.g.m18802e("user-agent", dVar);
        f16581m = C2936s.m10589d(',').m10593h();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f16582n = timeUnit.toNanos(20L);
        f16583o = TimeUnit.HOURS.toNanos(2L);
        f16584p = timeUnit.toNanos(20L);
        f16585q = new C4641x0();
        f16586r = new a();
        f16587s = C4429c.c.m18870b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f16588t = new b();
        f16589u = new c();
        f16590v = new d();
        f16591w = new e();
    }

    /* renamed from: b */
    public static URI m19596b(String str) {
        AbstractC2932o.m10573p(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e7) {
            throw new IllegalArgumentException("Invalid authority: " + str, e7);
        }
    }

    /* renamed from: c */
    public static String m19597c(String str) {
        AbstractC2932o.m10568k(m19596b(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    /* renamed from: d */
    public static void m19598d(InterfaceC4579R0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                m19599e(next);
            }
        }
    }

    /* renamed from: e */
    public static void m19599e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e7) {
            f16569a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e7);
        }
    }

    /* renamed from: f */
    public static AbstractC4445k[] m19600f(C4429c c4429c, C4424Z c4424z, int i7, boolean z6) {
        List m18856i = c4429c.m18856i();
        int size = m18856i.size();
        AbstractC4445k[] abstractC4445kArr = new AbstractC4445k[size + 1];
        AbstractC4445k.b m18935a = AbstractC4445k.b.m18934a().m18936b(c4429c).m18938d(i7).m18937c(z6).m18935a();
        for (int i8 = 0; i8 < m18856i.size(); i8++) {
            abstractC4445kArr[i8] = ((AbstractC4445k.a) m18856i.get(i8)).mo18933a(m18935a, c4424z);
        }
        abstractC4445kArr[size] = f16588t;
        return abstractC4445kArr;
    }

    /* renamed from: g */
    public static boolean m19601g(String str, boolean z6) {
        String str2 = System.getenv(str);
        if (str2 == null) {
            str2 = System.getProperty(str);
        }
        return z6 ? AbstractC2938u.m10607a(str2) || Boolean.parseBoolean(str2) : !AbstractC2938u.m10607a(str2) && Boolean.parseBoolean(str2);
    }

    /* renamed from: h */
    public static String m19602h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.62.2");
        return sb.toString();
    }

    /* renamed from: i */
    public static String m19603i(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: j */
    public static ThreadFactory m19604j(String str, boolean z6) {
        return new C4117g().m17298e(z6).m17299f(str).m17297b();
    }

    /* renamed from: k */
    public static InterfaceC4632t m19605k(AbstractC4417S.f fVar, boolean z6) {
        AbstractC4417S.i m18711c = fVar.m18711c();
        InterfaceC4632t mo19666a = m18711c != null ? ((InterfaceC4585U0) m18711c.mo18729e()).mo19666a() : null;
        if (mo19666a != null) {
            AbstractC4445k.a m18710b = fVar.m18710b();
            return m18710b == null ? mo19666a : new f(m18710b, mo19666a);
        }
        if (!fVar.m18709a().m18961o()) {
            if (fVar.m18712d()) {
                return new C4559H(m19609o(fVar.m18709a()), InterfaceC4630s.a.DROPPED);
            }
            if (!z6) {
                return new C4559H(m19609o(fVar.m18709a()), InterfaceC4630s.a.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: l */
    public static C4448l0.b m19606l(int i7) {
        if (i7 >= 100 && i7 < 200) {
            return C4448l0.b.INTERNAL;
        }
        if (i7 != 400) {
            if (i7 == 401) {
                return C4448l0.b.UNAUTHENTICATED;
            }
            if (i7 == 403) {
                return C4448l0.b.PERMISSION_DENIED;
            }
            if (i7 == 404) {
                return C4448l0.b.UNIMPLEMENTED;
            }
            if (i7 != 429) {
                if (i7 != 431) {
                    switch (i7) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return C4448l0.b.UNKNOWN;
                    }
                }
            }
            return C4448l0.b.UNAVAILABLE;
        }
        return C4448l0.b.INTERNAL;
    }

    /* renamed from: m */
    public static C4448l0 m19607m(int i7) {
        return m19606l(i7).m18965f().m18963q("HTTP status code " + i7);
    }

    /* renamed from: n */
    public static boolean m19608n(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char charAt = lowerCase.charAt(16);
        return charAt == '+' || charAt == ';';
    }

    /* renamed from: o */
    public static C4448l0 m19609o(C4448l0 c4448l0) {
        AbstractC2932o.m10561d(c4448l0 != null);
        if (!f16570b.contains(c4448l0.m18959m())) {
            return c4448l0;
        }
        return C4448l0.f15809s.m18963q("Inappropriate status code from control plane: " + c4448l0.m18959m() + StringUtils.SPACE + c4448l0.m18960n()).m18962p(c4448l0.m18958l());
    }

    /* renamed from: p */
    public static boolean m19610p(C4429c c4429c) {
        return !Boolean.TRUE.equals(c4429c.m18855h(f16587s));
    }
}
