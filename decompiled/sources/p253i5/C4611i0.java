package p253i5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p207d.AbstractC4094d;
import p237g5.AbstractC4408I;
import p237g5.AbstractC4420V;
import p237g5.AbstractC4421W;
import p237g5.AbstractC4427b;
import p237g5.AbstractC4433e;
import p237g5.C4404E;
import p237g5.C4434e0;
import p237g5.C4453o;
import p237g5.C4464v;
import p237g5.InterfaceC4440h0;
import p253i5.C4555F;

/* renamed from: i5.i0 */
/* loaded from: classes2.dex */
public final class C4611i0 extends AbstractC4421W {

    /* renamed from: H */
    public static final Logger f17006H = Logger.getLogger(C4611i0.class.getName());

    /* renamed from: I */
    public static final long f17007I = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: J */
    public static final long f17008J = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: K */
    public static final InterfaceC4627q0 f17009K = C4572N0.m19575c(AbstractC4580S.f16589u);

    /* renamed from: L */
    public static final C4464v f17010L = C4464v.m19028c();

    /* renamed from: M */
    public static final C4453o f17011M = C4453o.m18978a();

    /* renamed from: N */
    public static final Method f17012N;

    /* renamed from: A */
    public boolean f17013A;

    /* renamed from: B */
    public boolean f17014B;

    /* renamed from: C */
    public boolean f17015C;

    /* renamed from: D */
    public boolean f17016D;

    /* renamed from: E */
    public boolean f17017E;

    /* renamed from: F */
    public final c f17018F;

    /* renamed from: G */
    public final b f17019G;

    /* renamed from: a */
    public InterfaceC4627q0 f17020a;

    /* renamed from: b */
    public InterfaceC4627q0 f17021b;

    /* renamed from: c */
    public final List f17022c;

    /* renamed from: d */
    public C4434e0 f17023d;

    /* renamed from: e */
    public final List f17024e;

    /* renamed from: f */
    public final String f17025f;

    /* renamed from: g */
    public final AbstractC4427b f17026g;

    /* renamed from: h */
    public final SocketAddress f17027h;

    /* renamed from: i */
    public String f17028i;

    /* renamed from: j */
    public String f17029j;

    /* renamed from: k */
    public String f17030k;

    /* renamed from: l */
    public boolean f17031l;

    /* renamed from: m */
    public C4464v f17032m;

    /* renamed from: n */
    public C4453o f17033n;

    /* renamed from: o */
    public long f17034o;

    /* renamed from: p */
    public int f17035p;

    /* renamed from: q */
    public int f17036q;

    /* renamed from: r */
    public long f17037r;

    /* renamed from: s */
    public long f17038s;

    /* renamed from: t */
    public boolean f17039t;

    /* renamed from: u */
    public C4404E f17040u;

    /* renamed from: v */
    public int f17041v;

    /* renamed from: w */
    public Map f17042w;

    /* renamed from: x */
    public boolean f17043x;

    /* renamed from: y */
    public InterfaceC4440h0 f17044y;

    /* renamed from: z */
    public boolean f17045z;

    /* renamed from: i5.i0$b */
    public interface b {
        /* renamed from: a */
        int mo19991a();
    }

    /* renamed from: i5.i0$c */
    public interface c {
        /* renamed from: a */
        InterfaceC4634u mo19992a();
    }

    /* renamed from: i5.i0$d */
    public static final class d implements b {
        public d() {
        }

        @Override // p253i5.C4611i0.b
        /* renamed from: a */
        public int mo19991a() {
            return 443;
        }
    }

    static {
        Method method;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class<?> cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e7) {
            f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            method = null;
            f17012N = method;
        } catch (NoSuchMethodException e8) {
            f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            method = null;
            f17012N = method;
        }
        f17012N = method;
    }

    public C4611i0(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    @Override // p237g5.AbstractC4421W
    /* renamed from: a */
    public AbstractC4420V mo18756a() {
        return new C4613j0(new C4609h0(this, this.f17018F.mo19992a(), new C4555F.a(), C4572N0.m19575c(AbstractC4580S.f16589u), AbstractC4580S.f16591w, m19990f(), InterfaceC4581S0.f16612a));
    }

    /* renamed from: e */
    public int m19989e() {
        return this.f17019G.mo19991a();
    }

    /* renamed from: f */
    public List m19990f() {
        boolean z6;
        Method method;
        ArrayList arrayList = new ArrayList(this.f17022c);
        List m18663a = AbstractC4408I.m18663a();
        if (m18663a != null) {
            arrayList.addAll(m18663a);
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 && this.f17045z && (method = f17012N) != null) {
            try {
                AbstractC4094d.m17162a(method.invoke(null, Boolean.valueOf(this.f17013A), Boolean.valueOf(this.f17014B), Boolean.valueOf(this.f17015C), Boolean.valueOf(this.f17016D)));
            } catch (IllegalAccessException e7) {
                f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            } catch (InvocationTargetException e8) {
                f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            }
        }
        if (!z6 && this.f17017E) {
            try {
                AbstractC4094d.m17162a(Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null));
            } catch (ClassNotFoundException e9) {
                f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e9);
            } catch (IllegalAccessException e10) {
                f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            } catch (NoSuchMethodException e11) {
                f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            } catch (InvocationTargetException e12) {
                f17006H.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
            }
        }
        return arrayList;
    }

    public C4611i0(String str, AbstractC4433e abstractC4433e, AbstractC4427b abstractC4427b, c cVar, b bVar) {
        InterfaceC4627q0 interfaceC4627q0 = f17009K;
        this.f17020a = interfaceC4627q0;
        this.f17021b = interfaceC4627q0;
        this.f17022c = new ArrayList();
        this.f17023d = C4434e0.m18915b();
        this.f17024e = new ArrayList();
        this.f17030k = "pick_first";
        this.f17032m = f17010L;
        this.f17033n = f17011M;
        this.f17034o = f17007I;
        this.f17035p = 5;
        this.f17036q = 5;
        this.f17037r = 16777216L;
        this.f17038s = 1048576L;
        this.f17039t = true;
        this.f17040u = C4404E.m18642g();
        this.f17043x = true;
        this.f17045z = true;
        this.f17013A = true;
        this.f17014B = true;
        this.f17015C = false;
        this.f17016D = true;
        this.f17017E = true;
        this.f17025f = (String) AbstractC2932o.m10573p(str, "target");
        this.f17026g = abstractC4427b;
        this.f17018F = (c) AbstractC2932o.m10573p(cVar, "clientTransportFactoryBuilder");
        this.f17027h = null;
        if (bVar != null) {
            this.f17019G = bVar;
        } else {
            this.f17019G = new d();
        }
    }
}
