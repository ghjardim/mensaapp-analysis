package p022D0;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import com.google.android.gms.common.api.C3643a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p022D0.C0137X;
import p022D0.C0155h0;
import p022D0.C0172r;
import p022D0.C0176v;
import p022D0.InterfaceC0120F;
import p050H0.InterfaceC0544m;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.C0878m;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p171Y2.InterfaceC2939v;
import p178Z2.AbstractC3033v;
import p207d.AbstractC4094d;
import p232g0.C4327q;
import p232g0.C4331u;
import p249i1.C4517h;
import p249i1.C4524o;
import p249i1.InterfaceC4529t;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.C5498l;
import p276l0.InterfaceC5493g;
import p335s0.InterfaceC6321A;

/* renamed from: D0.r */
/* loaded from: classes.dex */
public final class C0172r implements InterfaceC0120F.a {

    /* renamed from: a */
    public final a f699a;

    /* renamed from: b */
    public InterfaceC5493g.a f700b;

    /* renamed from: c */
    public InterfaceC4529t.a f701c;

    /* renamed from: d */
    public InterfaceC0120F.a f702d;

    /* renamed from: e */
    public InterfaceC0544m f703e;

    /* renamed from: f */
    public long f704f;

    /* renamed from: g */
    public long f705g;

    /* renamed from: h */
    public long f706h;

    /* renamed from: i */
    public float f707i;

    /* renamed from: j */
    public float f708j;

    /* renamed from: k */
    public boolean f709k;

    /* renamed from: D0.r$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC0889x f710a;

        /* renamed from: d */
        public InterfaceC5493g.a f713d;

        /* renamed from: f */
        public InterfaceC4529t.a f715f;

        /* renamed from: g */
        public InterfaceC6321A f716g;

        /* renamed from: h */
        public InterfaceC0544m f717h;

        /* renamed from: b */
        public final Map f711b = new HashMap();

        /* renamed from: c */
        public final Map f712c = new HashMap();

        /* renamed from: e */
        public boolean f714e = true;

        public a(InterfaceC0889x interfaceC0889x, InterfaceC4529t.a aVar) {
            this.f710a = interfaceC0889x;
            this.f715f = aVar;
        }

        /* renamed from: f */
        public InterfaceC0120F.a m686f(int i7) {
            InterfaceC0120F.a aVar = (InterfaceC0120F.a) this.f712c.get(Integer.valueOf(i7));
            if (aVar != null) {
                return aVar;
            }
            InterfaceC0120F.a aVar2 = (InterfaceC0120F.a) m688l(i7).get();
            InterfaceC6321A interfaceC6321A = this.f716g;
            if (interfaceC6321A != null) {
                aVar2.mo342d(interfaceC6321A);
            }
            InterfaceC0544m interfaceC0544m = this.f717h;
            if (interfaceC0544m != null) {
                aVar2.mo341c(interfaceC0544m);
            }
            aVar2.mo339a(this.f715f);
            aVar2.mo340b(this.f714e);
            this.f712c.put(Integer.valueOf(i7), aVar2);
            return aVar2;
        }

        /* renamed from: k */
        public final /* synthetic */ InterfaceC0120F.a m687k(InterfaceC5493g.a aVar) {
            return new C0137X.b(aVar, this.f710a);
        }

        /* renamed from: l */
        public final InterfaceC2939v m688l(int i7) {
            InterfaceC2939v interfaceC2939v;
            InterfaceC2939v interfaceC2939v2;
            InterfaceC2939v interfaceC2939v3 = (InterfaceC2939v) this.f711b.get(Integer.valueOf(i7));
            if (interfaceC2939v3 != null) {
                return interfaceC2939v3;
            }
            final InterfaceC5493g.a aVar = (InterfaceC5493g.a) AbstractC5332a.m21800e(this.f713d);
            if (i7 == 0) {
                final Class asSubclass = DashMediaSource.Factory.class.asSubclass(InterfaceC0120F.a.class);
                interfaceC2939v = new InterfaceC2939v() { // from class: D0.m
                    @Override // p171Y2.InterfaceC2939v
                    public final Object get() {
                        InterfaceC0120F.a m666h;
                        m666h = C0172r.m666h(asSubclass, aVar);
                        return m666h;
                    }
                };
            } else if (i7 == 1) {
                final Class asSubclass2 = SsMediaSource.Factory.class.asSubclass(InterfaceC0120F.a.class);
                interfaceC2939v = new InterfaceC2939v() { // from class: D0.n
                    @Override // p171Y2.InterfaceC2939v
                    public final Object get() {
                        InterfaceC0120F.a m666h;
                        m666h = C0172r.m666h(asSubclass2, aVar);
                        return m666h;
                    }
                };
            } else {
                if (i7 != 2) {
                    if (i7 == 3) {
                        final Class asSubclass3 = RtspMediaSource.Factory.class.asSubclass(InterfaceC0120F.a.class);
                        interfaceC2939v2 = new InterfaceC2939v() { // from class: D0.p
                            @Override // p171Y2.InterfaceC2939v
                            public final Object get() {
                                InterfaceC0120F.a m665g;
                                m665g = C0172r.m665g(asSubclass3);
                                return m665g;
                            }
                        };
                    } else {
                        if (i7 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i7);
                        }
                        interfaceC2939v2 = new InterfaceC2939v() { // from class: D0.q
                            @Override // p171Y2.InterfaceC2939v
                            public final Object get() {
                                InterfaceC0120F.a m687k;
                                m687k = C0172r.a.this.m687k(aVar);
                                return m687k;
                            }
                        };
                    }
                    this.f711b.put(Integer.valueOf(i7), interfaceC2939v2);
                    return interfaceC2939v2;
                }
                final Class asSubclass4 = HlsMediaSource.Factory.class.asSubclass(InterfaceC0120F.a.class);
                interfaceC2939v = new InterfaceC2939v() { // from class: D0.o
                    @Override // p171Y2.InterfaceC2939v
                    public final Object get() {
                        InterfaceC0120F.a m666h;
                        m666h = C0172r.m666h(asSubclass4, aVar);
                        return m666h;
                    }
                };
            }
            interfaceC2939v2 = interfaceC2939v;
            this.f711b.put(Integer.valueOf(i7), interfaceC2939v2);
            return interfaceC2939v2;
        }

        /* renamed from: m */
        public void m689m(InterfaceC5493g.a aVar) {
            if (aVar != this.f713d) {
                this.f713d = aVar;
                this.f711b.clear();
                this.f712c.clear();
            }
        }

        /* renamed from: n */
        public void m690n(InterfaceC6321A interfaceC6321A) {
            this.f716g = interfaceC6321A;
            Iterator it = this.f712c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0120F.a) it.next()).mo342d(interfaceC6321A);
            }
        }

        /* renamed from: o */
        public void m691o(int i7) {
            InterfaceC0889x interfaceC0889x = this.f710a;
            if (interfaceC0889x instanceof C0878m) {
                ((C0878m) interfaceC0889x).m3669k(i7);
            }
        }

        /* renamed from: p */
        public void m692p(InterfaceC0544m interfaceC0544m) {
            this.f717h = interfaceC0544m;
            Iterator it = this.f712c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0120F.a) it.next()).mo341c(interfaceC0544m);
            }
        }

        /* renamed from: q */
        public void m693q(boolean z6) {
            this.f714e = z6;
            this.f710a.mo649c(z6);
            Iterator it = this.f712c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0120F.a) it.next()).mo340b(z6);
            }
        }

        /* renamed from: r */
        public void m694r(InterfaceC4529t.a aVar) {
            this.f715f = aVar;
            this.f710a.mo647a(aVar);
            Iterator it = this.f712c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0120F.a) it.next()).mo339a(aVar);
            }
        }
    }

    public C0172r(Context context) {
        this(new C5498l.a(context));
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC0120F.a m665g(Class cls) {
        return m668m(cls);
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC0120F.a m666h(Class cls, InterfaceC5493g.a aVar) {
        return m669n(cls, aVar);
    }

    /* renamed from: k */
    public static InterfaceC0120F m667k(C4331u c4331u, InterfaceC0120F interfaceC0120F) {
        C4331u.d dVar = c4331u.f15216f;
        if (dVar.f15241b == 0 && dVar.f15243d == Long.MIN_VALUE && !dVar.f15245f) {
            return interfaceC0120F;
        }
        C4331u.d dVar2 = c4331u.f15216f;
        return new C0150f(interfaceC0120F, dVar2.f15241b, dVar2.f15243d, !dVar2.f15246g, dVar2.f15244e, dVar2.f15245f);
    }

    /* renamed from: m */
    public static InterfaceC0120F.a m668m(Class cls) {
        try {
            return (InterfaceC0120F.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* renamed from: n */
    public static InterfaceC0120F.a m669n(Class cls, InterfaceC5493g.a aVar) {
        try {
            return (InterfaceC0120F.a) cls.getConstructor(InterfaceC5493g.a.class).newInstance(aVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // p022D0.InterfaceC0120F.a
    /* renamed from: e */
    public InterfaceC0120F mo343e(C4331u c4331u) {
        AbstractC5332a.m21800e(c4331u.f15212b);
        String scheme = c4331u.f15212b.f15304a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((InterfaceC0120F.a) AbstractC5332a.m21800e(this.f702d)).mo343e(c4331u);
        }
        if (Objects.equals(c4331u.f15212b.f15305b, "application/x-image-uri")) {
            long m21692K0 = AbstractC5330M.m21692K0(c4331u.f15212b.f15312i);
            AbstractC4094d.m17162a(AbstractC5332a.m21800e(null));
            return new C0176v.b(m21692K0, null).mo343e(c4331u);
        }
        C4331u.h hVar = c4331u.f15212b;
        int m21779v0 = AbstractC5330M.m21779v0(hVar.f15304a, hVar.f15305b);
        if (c4331u.f15212b.f15312i != -9223372036854775807L) {
            this.f699a.m691o(1);
        }
        try {
            InterfaceC0120F.a m686f = this.f699a.m686f(m21779v0);
            C4331u.g.a m18304a = c4331u.f15214d.m18304a();
            if (c4331u.f15214d.f15286a == -9223372036854775807L) {
                m18304a.m18315k(this.f704f);
            }
            if (c4331u.f15214d.f15289d == -3.4028235E38f) {
                m18304a.m18314j(this.f707i);
            }
            if (c4331u.f15214d.f15290e == -3.4028235E38f) {
                m18304a.m18312h(this.f708j);
            }
            if (c4331u.f15214d.f15287b == -9223372036854775807L) {
                m18304a.m18313i(this.f705g);
            }
            if (c4331u.f15214d.f15288c == -9223372036854775807L) {
                m18304a.m18311g(this.f706h);
            }
            C4331u.g m18310f = m18304a.m18310f();
            if (!m18310f.equals(c4331u.f15214d)) {
                c4331u = c4331u.m18275a().m18277b(m18310f).m18276a();
            }
            InterfaceC0120F mo343e = m686f.mo343e(c4331u);
            AbstractC3033v abstractC3033v = ((C4331u.h) AbstractC5330M.m21747i(c4331u.f15212b)).f15309f;
            if (!abstractC3033v.isEmpty()) {
                InterfaceC0120F[] interfaceC0120FArr = new InterfaceC0120F[abstractC3033v.size() + 1];
                interfaceC0120FArr[0] = mo343e;
                for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
                    if (this.f709k) {
                        final C4327q m18234K = new C4327q.b().m18264o0(((C4331u.k) abstractC3033v.get(i7)).f15324b).m18254e0(((C4331u.k) abstractC3033v.get(i7)).f15325c).m18266q0(((C4331u.k) abstractC3033v.get(i7)).f15326d).m18262m0(((C4331u.k) abstractC3033v.get(i7)).f15327e).m18252c0(((C4331u.k) abstractC3033v.get(i7)).f15328f).m18250a0(((C4331u.k) abstractC3033v.get(i7)).f15329g).m18234K();
                        C0137X.b bVar = new C0137X.b(this.f700b, new InterfaceC0889x() { // from class: D0.l
                            @Override // p078L0.InterfaceC0889x
                            /* renamed from: a */
                            public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
                                return AbstractC0888w.m3696c(this, aVar);
                            }

                            @Override // p078L0.InterfaceC0889x
                            /* renamed from: b */
                            public final InterfaceC0883r[] mo648b() {
                                InterfaceC0883r[] m671j;
                                m671j = C0172r.this.m671j(m18234K);
                                return m671j;
                            }

                            @Override // p078L0.InterfaceC0889x
                            /* renamed from: c */
                            public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
                                return AbstractC0888w.m3695b(this, z6);
                            }

                            @Override // p078L0.InterfaceC0889x
                            /* renamed from: d */
                            public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
                                return AbstractC0888w.m3694a(this, uri, map);
                            }
                        });
                        InterfaceC0544m interfaceC0544m = this.f703e;
                        if (interfaceC0544m != null) {
                            bVar.mo341c(interfaceC0544m);
                        }
                        interfaceC0120FArr[i7 + 1] = bVar.mo343e(C4331u.m18274b(((C4331u.k) abstractC3033v.get(i7)).f15323a.toString()));
                    } else {
                        C0155h0.b bVar2 = new C0155h0.b(this.f700b);
                        InterfaceC0544m interfaceC0544m2 = this.f703e;
                        if (interfaceC0544m2 != null) {
                            bVar2.m633b(interfaceC0544m2);
                        }
                        interfaceC0120FArr[i7 + 1] = bVar2.m632a((C4331u.k) abstractC3033v.get(i7), -9223372036854775807L);
                    }
                }
                mo343e = new C0130P(interfaceC0120FArr);
            }
            return m672l(c4331u, m667k(c4331u, mo343e));
        } catch (ClassNotFoundException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // p022D0.InterfaceC0120F.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0172r mo340b(boolean z6) {
        this.f709k = z6;
        this.f699a.m693q(z6);
        return this;
    }

    /* renamed from: j */
    public final /* synthetic */ InterfaceC0883r[] m671j(C4327q c4327q) {
        return new InterfaceC0883r[]{this.f701c.mo19226a(c4327q) ? new C4524o(this.f701c.mo19227b(c4327q), c4327q) : new b(c4327q)};
    }

    /* renamed from: l */
    public final InterfaceC0120F m672l(C4331u c4331u, InterfaceC0120F interfaceC0120F) {
        AbstractC5332a.m21800e(c4331u.f15212b);
        c4331u.f15212b.getClass();
        return interfaceC0120F;
    }

    /* renamed from: o */
    public C0172r m673o(InterfaceC5493g.a aVar) {
        this.f700b = aVar;
        this.f699a.m689m(aVar);
        return this;
    }

    @Override // p022D0.InterfaceC0120F.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0172r mo342d(InterfaceC6321A interfaceC6321A) {
        this.f699a.m690n((InterfaceC6321A) AbstractC5332a.m21801f(interfaceC6321A, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // p022D0.InterfaceC0120F.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0172r mo341c(InterfaceC0544m interfaceC0544m) {
        this.f703e = (InterfaceC0544m) AbstractC5332a.m21801f(interfaceC0544m, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f699a.m692p(interfaceC0544m);
        return this;
    }

    @Override // p022D0.InterfaceC0120F.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0172r mo339a(InterfaceC4529t.a aVar) {
        this.f701c = (InterfaceC4529t.a) AbstractC5332a.m21800e(aVar);
        this.f699a.m694r(aVar);
        return this;
    }

    public C0172r(Context context, InterfaceC0889x interfaceC0889x) {
        this(new C5498l.a(context), interfaceC0889x);
    }

    public C0172r(InterfaceC5493g.a aVar) {
        this(aVar, new C0878m());
    }

    public C0172r(InterfaceC5493g.a aVar, InterfaceC0889x interfaceC0889x) {
        this.f700b = aVar;
        C4517h c4517h = new C4517h();
        this.f701c = c4517h;
        a aVar2 = new a(interfaceC0889x, c4517h);
        this.f699a = aVar2;
        aVar2.m689m(aVar);
        this.f704f = -9223372036854775807L;
        this.f705g = -9223372036854775807L;
        this.f706h = -9223372036854775807L;
        this.f707i = -3.4028235E38f;
        this.f708j = -3.4028235E38f;
        this.f709k = true;
    }

    /* renamed from: D0.r$b */
    public static final class b implements InterfaceC0883r {

        /* renamed from: a */
        public final C4327q f718a;

        public b(C4327q c4327q) {
            this.f718a = c4327q;
        }

        @Override // p078L0.InterfaceC0883r
        /* renamed from: b */
        public void mo696b(InterfaceC0885t interfaceC0885t) {
            InterfaceC0861T mo455b = interfaceC0885t.mo455b(0, 3);
            interfaceC0885t.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
            interfaceC0885t.mo472q();
            mo455b.mo566e(this.f718a.m18193a().m18264o0("text/x-unknown").m18238O(this.f718a.f15138n).m18234K());
        }

        @Override // p078L0.InterfaceC0883r
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r mo697d() {
            return AbstractC0882q.m3688b(this);
        }

        @Override // p078L0.InterfaceC0883r
        /* renamed from: g */
        public /* synthetic */ List mo698g() {
            return AbstractC0882q.m3687a(this);
        }

        @Override // p078L0.InterfaceC0883r
        /* renamed from: h */
        public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
            return interfaceC0884s.mo3516l(C3643a.e.API_PRIORITY_OTHER) == -1 ? -1 : 0;
        }

        @Override // p078L0.InterfaceC0883r
        /* renamed from: i */
        public boolean mo700i(InterfaceC0884s interfaceC0884s) {
            return true;
        }

        @Override // p078L0.InterfaceC0883r
        public void release() {
        }

        @Override // p078L0.InterfaceC0883r
        /* renamed from: a */
        public void mo695a(long j7, long j8) {
        }
    }
}
