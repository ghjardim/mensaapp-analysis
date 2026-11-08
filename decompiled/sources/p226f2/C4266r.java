package p226f2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p149V1.C2610c;
import p170Y1.AbstractC2902i;
import p170Y1.AbstractC2908o;
import p170Y1.C2901h;
import p177Z1.AbstractC2979f;
import p177Z1.AbstractC2980g;
import p177Z1.InterfaceC2978e;
import p177Z1.InterfaceC2986m;
import p194b2.C3515a;
import p194b2.C3517c;
import p202c2.AbstractC3570a;
import p234g2.AbstractC4378k;
import p234g2.InterfaceC4370c;
import p234g2.InterfaceC4371d;
import p242h2.C4483a;
import p242h2.InterfaceC4484b;
import p250i2.InterfaceC4534a;
import p256j$.util.Objects;

/* renamed from: f2.r */
/* loaded from: classes.dex */
public class C4266r {

    /* renamed from: a */
    public final Context f14683a;

    /* renamed from: b */
    public final InterfaceC2978e f14684b;

    /* renamed from: c */
    public final InterfaceC4371d f14685c;

    /* renamed from: d */
    public final InterfaceC4272x f14686d;

    /* renamed from: e */
    public final Executor f14687e;

    /* renamed from: f */
    public final InterfaceC4484b f14688f;

    /* renamed from: g */
    public final InterfaceC4534a f14689g;

    /* renamed from: h */
    public final InterfaceC4534a f14690h;

    /* renamed from: i */
    public final InterfaceC4370c f14691i;

    public C4266r(Context context, InterfaceC2978e interfaceC2978e, InterfaceC4371d interfaceC4371d, InterfaceC4272x interfaceC4272x, Executor executor, InterfaceC4484b interfaceC4484b, InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, InterfaceC4370c interfaceC4370c) {
        this.f14683a = context;
        this.f14684b = interfaceC2978e;
        this.f14685c = interfaceC4371d;
        this.f14686d = interfaceC4272x;
        this.f14687e = executor;
        this.f14688f = interfaceC4484b;
        this.f14689g = interfaceC4534a;
        this.f14690h = interfaceC4534a2;
        this.f14691i = interfaceC4370c;
    }

    /* renamed from: j */
    public AbstractC2902i m17870j(InterfaceC2986m interfaceC2986m) {
        InterfaceC4484b interfaceC4484b = this.f14688f;
        final InterfaceC4370c interfaceC4370c = this.f14691i;
        Objects.requireNonNull(interfaceC4370c);
        return interfaceC2986m.mo9128a(AbstractC2902i.m10470a().mo10441i(this.f14689g.mo19269a()).mo10443k(this.f14690h.mo19269a()).mo10442j("GDT_CLIENT_METRICS").mo10440h(new C2901h(C2610c.m8990b("proto"), ((C3515a) interfaceC4484b.mo18544a(new InterfaceC4484b.a() { // from class: f2.h
            @Override // p242h2.InterfaceC4484b.a
            /* renamed from: a */
            public final Object mo17487a() {
                return InterfaceC4370c.this.mo18552g();
            }
        })).m14118f())).mo10436d());
    }

    /* renamed from: k */
    public boolean m17871k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f14683a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: l */
    public final /* synthetic */ Boolean m17872l(AbstractC2908o abstractC2908o) {
        return Boolean.valueOf(this.f14685c.mo18532I(abstractC2908o));
    }

    /* renamed from: m */
    public final /* synthetic */ Iterable m17873m(AbstractC2908o abstractC2908o) {
        return this.f14685c.mo18530H(abstractC2908o);
    }

    /* renamed from: n */
    public final /* synthetic */ Object m17874n(Iterable iterable, AbstractC2908o abstractC2908o, long j7) {
        this.f14685c.mo18559o0(iterable);
        this.f14685c.mo18540W(abstractC2908o, this.f14689g.mo19269a() + j7);
        return null;
    }

    /* renamed from: o */
    public final /* synthetic */ Object m17875o(Iterable iterable) {
        this.f14685c.mo18557n(iterable);
        return null;
    }

    /* renamed from: p */
    public final /* synthetic */ Object m17876p() {
        this.f14691i.mo18547c();
        return null;
    }

    /* renamed from: q */
    public final /* synthetic */ Object m17877q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f14691i.mo18549d(((Integer) r0.getValue()).intValue(), C3517c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* renamed from: r */
    public final /* synthetic */ Object m17878r(AbstractC2908o abstractC2908o, long j7) {
        this.f14685c.mo18540W(abstractC2908o, this.f14689g.mo19269a() + j7);
        return null;
    }

    /* renamed from: s */
    public final /* synthetic */ Object m17879s(AbstractC2908o abstractC2908o, int i7) {
        this.f14686d.mo17846b(abstractC2908o, i7 + 1);
        return null;
    }

    /* renamed from: t */
    public final /* synthetic */ void m17880t(final AbstractC2908o abstractC2908o, final int i7, Runnable runnable) {
        try {
            try {
                InterfaceC4484b interfaceC4484b = this.f14688f;
                final InterfaceC4371d interfaceC4371d = this.f14685c;
                Objects.requireNonNull(interfaceC4371d);
                interfaceC4484b.mo18544a(new InterfaceC4484b.a() { // from class: f2.i
                    @Override // p242h2.InterfaceC4484b.a
                    /* renamed from: a */
                    public final Object mo17487a() {
                        return Integer.valueOf(InterfaceC4371d.this.mo18554k());
                    }
                });
                if (m17871k()) {
                    m17881u(abstractC2908o, i7);
                } else {
                    this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.j
                        @Override // p242h2.InterfaceC4484b.a
                        /* renamed from: a */
                        public final Object mo17487a() {
                            Object m17879s;
                            m17879s = C4266r.this.m17879s(abstractC2908o, i7);
                            return m17879s;
                        }
                    });
                }
            } catch (C4483a unused) {
                this.f14686d.mo17846b(abstractC2908o, i7 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    /* renamed from: u */
    public AbstractC2980g m17881u(final AbstractC2908o abstractC2908o, int i7) {
        AbstractC2980g mo9129b;
        InterfaceC2986m mo10730a = this.f14684b.mo10730a(abstractC2908o.mo10455b());
        long j7 = 0;
        AbstractC2980g m10734e = AbstractC2980g.m10734e(0L);
        while (true) {
            final long j8 = j7;
            while (((Boolean) this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.k
                @Override // p242h2.InterfaceC4484b.a
                /* renamed from: a */
                public final Object mo17487a() {
                    Boolean m17872l;
                    m17872l = C4266r.this.m17872l(abstractC2908o);
                    return m17872l;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.l
                    @Override // p242h2.InterfaceC4484b.a
                    /* renamed from: a */
                    public final Object mo17487a() {
                        Iterable m17873m;
                        m17873m = C4266r.this.m17873m(abstractC2908o);
                        return m17873m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m10734e;
                }
                if (mo10730a == null) {
                    AbstractC3570a.m14400b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC2908o);
                    mo9129b = AbstractC2980g.m10732a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC4378k) it.next()).mo18595b());
                    }
                    if (abstractC2908o.m10488e()) {
                        arrayList.add(m17870j(mo10730a));
                    }
                    mo9129b = mo10730a.mo9129b(AbstractC2979f.m10731a().mo10722b(arrayList).mo10723c(abstractC2908o.mo10456c()).mo10721a());
                }
                m10734e = mo9129b;
                if (m10734e.mo10725c() == AbstractC2980g.a.TRANSIENT_ERROR) {
                    this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.m
                        @Override // p242h2.InterfaceC4484b.a
                        /* renamed from: a */
                        public final Object mo17487a() {
                            Object m17874n;
                            m17874n = C4266r.this.m17874n(iterable, abstractC2908o, j8);
                            return m17874n;
                        }
                    });
                    this.f14686d.mo17845a(abstractC2908o, i7 + 1, true);
                    return m10734e;
                }
                this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.n
                    @Override // p242h2.InterfaceC4484b.a
                    /* renamed from: a */
                    public final Object mo17487a() {
                        Object m17875o;
                        m17875o = C4266r.this.m17875o(iterable);
                        return m17875o;
                    }
                });
                if (m10734e.mo10725c() == AbstractC2980g.a.OK) {
                    j7 = Math.max(j8, m10734e.mo10724b());
                    if (abstractC2908o.m10488e()) {
                        this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.o
                            @Override // p242h2.InterfaceC4484b.a
                            /* renamed from: a */
                            public final Object mo17487a() {
                                Object m17876p;
                                m17876p = C4266r.this.m17876p();
                                return m17876p;
                            }
                        });
                    }
                } else if (m10734e.mo10725c() == AbstractC2980g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String mo10434j = ((AbstractC4378k) it2.next()).mo18595b().mo10434j();
                        if (hashMap.containsKey(mo10434j)) {
                            hashMap.put(mo10434j, Integer.valueOf(((Integer) hashMap.get(mo10434j)).intValue() + 1));
                        } else {
                            hashMap.put(mo10434j, 1);
                        }
                    }
                    this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.p
                        @Override // p242h2.InterfaceC4484b.a
                        /* renamed from: a */
                        public final Object mo17487a() {
                            Object m17877q;
                            m17877q = C4266r.this.m17877q(hashMap);
                            return m17877q;
                        }
                    });
                }
            }
            this.f14688f.mo18544a(new InterfaceC4484b.a() { // from class: f2.q
                @Override // p242h2.InterfaceC4484b.a
                /* renamed from: a */
                public final Object mo17487a() {
                    Object m17878r;
                    m17878r = C4266r.this.m17878r(abstractC2908o, j8);
                    return m17878r;
                }
            });
            return m10734e;
        }
    }

    /* renamed from: v */
    public void m17882v(final AbstractC2908o abstractC2908o, final int i7, final Runnable runnable) {
        this.f14687e.execute(new Runnable() { // from class: f2.g
            @Override // java.lang.Runnable
            public final void run() {
                C4266r.this.m17880t(abstractC2908o, i7, runnable);
            }
        });
    }
}
