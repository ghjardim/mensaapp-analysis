package p316p5;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC3028q;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4435f;
import p237g5.AbstractC4445k;
import p237g5.C4424Z;
import p237g5.C4425a;
import p237g5.C4448l0;
import p237g5.C4457q;
import p237g5.C4466x;
import p237g5.EnumC4455p;
import p237g5.ExecutorC4456p0;
import p253i5.AbstractC4568L0;
import p253i5.InterfaceC4581S0;

/* renamed from: p5.h */
/* loaded from: classes2.dex */
public final class C6151h extends AbstractC4417S {

    /* renamed from: p */
    public static final C4425a.c f21976p = C4425a.c.m18825a("addressTrackerKey");

    /* renamed from: g */
    public final c f21977g;

    /* renamed from: h */
    public final ExecutorC4456p0 f21978h;

    /* renamed from: i */
    public final AbstractC4417S.e f21979i;

    /* renamed from: j */
    public final C6148e f21980j;

    /* renamed from: k */
    public InterfaceC4581S0 f21981k;

    /* renamed from: l */
    public final ScheduledExecutorService f21982l;

    /* renamed from: m */
    public ExecutorC4456p0.d f21983m;

    /* renamed from: n */
    public Long f21984n;

    /* renamed from: o */
    public final AbstractC4435f f21985o;

    /* renamed from: p5.h$b */
    public static class b {

        /* renamed from: a */
        public g f21986a;

        /* renamed from: b */
        public volatile a f21987b;

        /* renamed from: c */
        public a f21988c;

        /* renamed from: d */
        public Long f21989d;

        /* renamed from: e */
        public int f21990e;

        /* renamed from: f */
        public final Set f21991f = new HashSet();

        /* renamed from: p5.h$b$a */
        public static class a {

            /* renamed from: a */
            public AtomicLong f21992a;

            /* renamed from: b */
            public AtomicLong f21993b;

            public a() {
                this.f21992a = new AtomicLong();
                this.f21993b = new AtomicLong();
            }

            /* renamed from: a */
            public void m25675a() {
                this.f21992a.set(0L);
                this.f21993b.set(0L);
            }
        }

        public b(g gVar) {
            this.f21987b = new a();
            this.f21988c = new a();
            this.f21986a = gVar;
        }

        /* renamed from: b */
        public boolean m25660b(i iVar) {
            if (m25671m() && !iVar.m25708o()) {
                iVar.m25707n();
            } else if (!m25671m() && iVar.m25708o()) {
                iVar.m25710q();
            }
            iVar.m25709p(this);
            return this.f21991f.add(iVar);
        }

        /* renamed from: c */
        public void m25661c() {
            int i7 = this.f21990e;
            this.f21990e = i7 == 0 ? 0 : i7 - 1;
        }

        /* renamed from: d */
        public void m25662d(long j7) {
            this.f21989d = Long.valueOf(j7);
            this.f21990e++;
            Iterator it = this.f21991f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).m25707n();
            }
        }

        /* renamed from: e */
        public double m25663e() {
            return this.f21988c.f21993b.get() / m25664f();
        }

        /* renamed from: f */
        public long m25664f() {
            return this.f21988c.f21992a.get() + this.f21988c.f21993b.get();
        }

        /* renamed from: g */
        public void m25665g(boolean z6) {
            g gVar = this.f21986a;
            if (gVar.f22006e == null && gVar.f22007f == null) {
                return;
            }
            if (z6) {
                this.f21987b.f21992a.getAndIncrement();
            } else {
                this.f21987b.f21993b.getAndIncrement();
            }
        }

        /* renamed from: h */
        public boolean m25666h(long j7) {
            return j7 > this.f21989d.longValue() + Math.min(this.f21986a.f22003b.longValue() * ((long) this.f21990e), Math.max(this.f21986a.f22003b.longValue(), this.f21986a.f22004c.longValue()));
        }

        /* renamed from: i */
        public boolean m25667i(i iVar) {
            iVar.m25706m();
            return this.f21991f.remove(iVar);
        }

        /* renamed from: j */
        public void m25668j() {
            this.f21987b.m25675a();
            this.f21988c.m25675a();
        }

        /* renamed from: k */
        public void m25669k() {
            this.f21990e = 0;
        }

        /* renamed from: l */
        public void m25670l(g gVar) {
            this.f21986a = gVar;
        }

        /* renamed from: m */
        public boolean m25671m() {
            return this.f21989d != null;
        }

        /* renamed from: n */
        public double m25672n() {
            return this.f21988c.f21992a.get() / m25664f();
        }

        /* renamed from: o */
        public void m25673o() {
            this.f21988c.m25675a();
            a aVar = this.f21987b;
            this.f21987b = this.f21988c;
            this.f21988c = aVar;
        }

        /* renamed from: p */
        public void m25674p() {
            AbstractC2932o.m10579v(this.f21989d != null, "not currently ejected");
            this.f21989d = null;
            Iterator it = this.f21991f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).m25710q();
            }
        }

        public String toString() {
            return "AddressTracker{subchannels=" + this.f21991f + '}';
        }
    }

    /* renamed from: p5.h$c */
    public static class c extends AbstractC3028q {

        /* renamed from: a */
        public final Map f21994a = new HashMap();

        @Override // p178Z2.AbstractC3029r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map mo11030a() {
            return this.f21994a;
        }

        /* renamed from: f */
        public void m25676f() {
            for (b bVar : this.f21994a.values()) {
                if (bVar.m25671m()) {
                    bVar.m25674p();
                }
                bVar.m25669k();
            }
        }

        /* renamed from: g */
        public double m25677g() {
            if (this.f21994a.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.f21994a.values().iterator();
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                i8++;
                if (((b) it.next()).m25671m()) {
                    i7++;
                }
            }
            return (i7 / i8) * 100.0d;
        }

        /* renamed from: h */
        public void m25678h(Long l7) {
            for (b bVar : this.f21994a.values()) {
                if (!bVar.m25671m()) {
                    bVar.m25661c();
                }
                if (bVar.m25671m() && bVar.m25666h(l7.longValue())) {
                    bVar.m25674p();
                }
            }
        }

        /* renamed from: i */
        public void m25679i(g gVar, Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                SocketAddress socketAddress = (SocketAddress) it.next();
                if (!this.f21994a.containsKey(socketAddress)) {
                    this.f21994a.put(socketAddress, new b(gVar));
                }
            }
        }

        /* renamed from: j */
        public void m25680j() {
            Iterator it = this.f21994a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).m25668j();
            }
        }

        /* renamed from: k */
        public void m25681k() {
            Iterator it = this.f21994a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).m25673o();
            }
        }

        /* renamed from: l */
        public void m25682l(g gVar) {
            Iterator it = this.f21994a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).m25670l(gVar);
            }
        }
    }

    /* renamed from: p5.h$d */
    public class d extends AbstractC6146c {

        /* renamed from: a */
        public AbstractC4417S.e f21995a;

        public d(AbstractC4417S.e eVar) {
            this.f21995a = new C6149f(eVar);
        }

        @Override // p316p5.AbstractC6146c, p237g5.AbstractC4417S.e
        /* renamed from: a */
        public AbstractC4417S.i mo18698a(AbstractC4417S.b bVar) {
            i iVar = C6151h.this.new i(bVar, this.f21995a);
            List m18685a = bVar.m18685a();
            if (C6151h.m25657m(m18685a) && C6151h.this.f21977g.containsKey(((C4466x) m18685a.get(0)).m19034a().get(0))) {
                b bVar2 = (b) C6151h.this.f21977g.get(((C4466x) m18685a.get(0)).m19034a().get(0));
                bVar2.m25660b(iVar);
                if (bVar2.f21989d != null) {
                    iVar.m25707n();
                }
            }
            return iVar;
        }

        @Override // p316p5.AbstractC6146c, p237g5.AbstractC4417S.e
        /* renamed from: f */
        public void mo18703f(EnumC4455p enumC4455p, AbstractC4417S.j jVar) {
            this.f21995a.mo18703f(enumC4455p, C6151h.this.new h(jVar));
        }

        @Override // p316p5.AbstractC6146c
        /* renamed from: g */
        public AbstractC4417S.e mo25607g() {
            return this.f21995a;
        }
    }

    /* renamed from: p5.h$e */
    public class e implements Runnable {

        /* renamed from: a */
        public g f21997a;

        /* renamed from: b */
        public AbstractC4435f f21998b;

        public e(g gVar, AbstractC4435f abstractC4435f) {
            this.f21997a = gVar;
            this.f21998b = abstractC4435f;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6151h c6151h = C6151h.this;
            c6151h.f21984n = Long.valueOf(c6151h.f21981k.mo19625a());
            C6151h.this.f21977g.m25681k();
            for (j jVar : AbstractC6152i.m25713a(this.f21997a, this.f21998b)) {
                C6151h c6151h2 = C6151h.this;
                jVar.mo25683a(c6151h2.f21977g, c6151h2.f21984n.longValue());
            }
            C6151h c6151h3 = C6151h.this;
            c6151h3.f21977g.m25678h(c6151h3.f21984n);
        }
    }

    /* renamed from: p5.h$f */
    public static class f implements j {

        /* renamed from: a */
        public final g f22000a;

        /* renamed from: b */
        public final AbstractC4435f f22001b;

        public f(g gVar, AbstractC4435f abstractC4435f) {
            this.f22000a = gVar;
            this.f22001b = abstractC4435f;
        }

        @Override // p316p5.C6151h.j
        /* renamed from: a */
        public void mo25683a(c cVar, long j7) {
            List<b> m25658n = C6151h.m25658n(cVar, this.f22000a.f22007f.f22019d.intValue());
            if (m25658n.size() < this.f22000a.f22007f.f22018c.intValue() || m25658n.size() == 0) {
                return;
            }
            for (b bVar : m25658n) {
                if (cVar.m25677g() >= this.f22000a.f22005d.intValue()) {
                    return;
                }
                if (bVar.m25664f() >= this.f22000a.f22007f.f22019d.intValue() && bVar.m25663e() > this.f22000a.f22007f.f22016a.intValue() / 100.0d) {
                    this.f22001b.mo18925b(AbstractC4435f.a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", bVar, Double.valueOf(bVar.m25663e()));
                    if (new Random().nextInt(100) < this.f22000a.f22007f.f22017b.intValue()) {
                        bVar.m25662d(j7);
                    }
                }
            }
        }
    }

    /* renamed from: p5.h$g */
    public static final class g {

        /* renamed from: a */
        public final Long f22002a;

        /* renamed from: b */
        public final Long f22003b;

        /* renamed from: c */
        public final Long f22004c;

        /* renamed from: d */
        public final Integer f22005d;

        /* renamed from: e */
        public final c f22006e;

        /* renamed from: f */
        public final b f22007f;

        /* renamed from: g */
        public final AbstractC4568L0.b f22008g;

        /* renamed from: p5.h$g$a */
        public static class a {

            /* renamed from: a */
            public Long f22009a = 10000000000L;

            /* renamed from: b */
            public Long f22010b = 30000000000L;

            /* renamed from: c */
            public Long f22011c = 300000000000L;

            /* renamed from: d */
            public Integer f22012d = 10;

            /* renamed from: e */
            public c f22013e;

            /* renamed from: f */
            public b f22014f;

            /* renamed from: g */
            public AbstractC4568L0.b f22015g;

            /* renamed from: a */
            public g m25685a() {
                AbstractC2932o.m10578u(this.f22015g != null);
                return new g(this.f22009a, this.f22010b, this.f22011c, this.f22012d, this.f22013e, this.f22014f, this.f22015g);
            }

            /* renamed from: b */
            public a m25686b(Long l7) {
                AbstractC2932o.m10561d(l7 != null);
                this.f22010b = l7;
                return this;
            }

            /* renamed from: c */
            public a m25687c(AbstractC4568L0.b bVar) {
                AbstractC2932o.m10578u(bVar != null);
                this.f22015g = bVar;
                return this;
            }

            /* renamed from: d */
            public a m25688d(b bVar) {
                this.f22014f = bVar;
                return this;
            }

            /* renamed from: e */
            public a m25689e(Long l7) {
                AbstractC2932o.m10561d(l7 != null);
                this.f22009a = l7;
                return this;
            }

            /* renamed from: f */
            public a m25690f(Integer num) {
                AbstractC2932o.m10561d(num != null);
                this.f22012d = num;
                return this;
            }

            /* renamed from: g */
            public a m25691g(Long l7) {
                AbstractC2932o.m10561d(l7 != null);
                this.f22011c = l7;
                return this;
            }

            /* renamed from: h */
            public a m25692h(c cVar) {
                this.f22013e = cVar;
                return this;
            }
        }

        /* renamed from: p5.h$g$b */
        public static class b {

            /* renamed from: a */
            public final Integer f22016a;

            /* renamed from: b */
            public final Integer f22017b;

            /* renamed from: c */
            public final Integer f22018c;

            /* renamed from: d */
            public final Integer f22019d;

            /* renamed from: p5.h$g$b$a */
            public static class a {

                /* renamed from: a */
                public Integer f22020a = 85;

                /* renamed from: b */
                public Integer f22021b = 100;

                /* renamed from: c */
                public Integer f22022c = 5;

                /* renamed from: d */
                public Integer f22023d = 50;

                /* renamed from: a */
                public b m25693a() {
                    return new b(this.f22020a, this.f22021b, this.f22022c, this.f22023d);
                }

                /* renamed from: b */
                public a m25694b(Integer num) {
                    boolean z6 = false;
                    AbstractC2932o.m10561d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z6 = true;
                    }
                    AbstractC2932o.m10561d(z6);
                    this.f22021b = num;
                    return this;
                }

                /* renamed from: c */
                public a m25695c(Integer num) {
                    AbstractC2932o.m10561d(num != null);
                    AbstractC2932o.m10561d(num.intValue() >= 0);
                    this.f22022c = num;
                    return this;
                }

                /* renamed from: d */
                public a m25696d(Integer num) {
                    AbstractC2932o.m10561d(num != null);
                    AbstractC2932o.m10561d(num.intValue() >= 0);
                    this.f22023d = num;
                    return this;
                }

                /* renamed from: e */
                public a m25697e(Integer num) {
                    boolean z6 = false;
                    AbstractC2932o.m10561d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z6 = true;
                    }
                    AbstractC2932o.m10561d(z6);
                    this.f22020a = num;
                    return this;
                }
            }

            public b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f22016a = num;
                this.f22017b = num2;
                this.f22018c = num3;
                this.f22019d = num4;
            }
        }

        /* renamed from: p5.h$g$c */
        public static class c {

            /* renamed from: a */
            public final Integer f22024a;

            /* renamed from: b */
            public final Integer f22025b;

            /* renamed from: c */
            public final Integer f22026c;

            /* renamed from: d */
            public final Integer f22027d;

            /* renamed from: p5.h$g$c$a */
            public static final class a {

                /* renamed from: a */
                public Integer f22028a = 1900;

                /* renamed from: b */
                public Integer f22029b = 100;

                /* renamed from: c */
                public Integer f22030c = 5;

                /* renamed from: d */
                public Integer f22031d = 100;

                /* renamed from: a */
                public c m25698a() {
                    return new c(this.f22028a, this.f22029b, this.f22030c, this.f22031d);
                }

                /* renamed from: b */
                public a m25699b(Integer num) {
                    boolean z6 = false;
                    AbstractC2932o.m10561d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z6 = true;
                    }
                    AbstractC2932o.m10561d(z6);
                    this.f22029b = num;
                    return this;
                }

                /* renamed from: c */
                public a m25700c(Integer num) {
                    AbstractC2932o.m10561d(num != null);
                    AbstractC2932o.m10561d(num.intValue() >= 0);
                    this.f22030c = num;
                    return this;
                }

                /* renamed from: d */
                public a m25701d(Integer num) {
                    AbstractC2932o.m10561d(num != null);
                    AbstractC2932o.m10561d(num.intValue() >= 0);
                    this.f22031d = num;
                    return this;
                }

                /* renamed from: e */
                public a m25702e(Integer num) {
                    AbstractC2932o.m10561d(num != null);
                    this.f22028a = num;
                    return this;
                }
            }

            public c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f22024a = num;
                this.f22025b = num2;
                this.f22026c = num3;
                this.f22027d = num4;
            }
        }

        /* renamed from: a */
        public boolean m25684a() {
            return (this.f22006e == null && this.f22007f == null) ? false : true;
        }

        public g(Long l7, Long l8, Long l9, Integer num, c cVar, b bVar, AbstractC4568L0.b bVar2) {
            this.f22002a = l7;
            this.f22003b = l8;
            this.f22004c = l9;
            this.f22005d = num;
            this.f22006e = cVar;
            this.f22007f = bVar;
            this.f22008g = bVar2;
        }
    }

    /* renamed from: p5.h$h */
    public class h extends AbstractC4417S.j {

        /* renamed from: a */
        public final AbstractC4417S.j f22032a;

        /* renamed from: p5.h$h$a */
        public class a extends AbstractC4445k.a {

            /* renamed from: a */
            public final b f22034a;

            /* renamed from: b */
            public final AbstractC4445k.a f22035b;

            /* renamed from: p5.h$h$a$a, reason: collision with other inner class name */
            public class C7238a extends AbstractC6144a {

                /* renamed from: b */
                public final /* synthetic */ AbstractC4445k f22037b;

                public C7238a(AbstractC4445k abstractC4445k) {
                    this.f22037b = abstractC4445k;
                }

                @Override // p237g5.AbstractC4454o0
                /* renamed from: i */
                public void mo18988i(C4448l0 c4448l0) {
                    a.this.f22034a.m25665g(c4448l0.m18961o());
                    mo25605o().mo18988i(c4448l0);
                }

                @Override // p316p5.AbstractC6144a
                /* renamed from: o */
                public AbstractC4445k mo25605o() {
                    return this.f22037b;
                }
            }

            /* renamed from: p5.h$h$a$b */
            public class b extends AbstractC4445k {
                public b() {
                }

                @Override // p237g5.AbstractC4454o0
                /* renamed from: i */
                public void mo18988i(C4448l0 c4448l0) {
                    a.this.f22034a.m25665g(c4448l0.m18961o());
                }
            }

            public a(b bVar, AbstractC4445k.a aVar) {
                this.f22034a = bVar;
                this.f22035b = aVar;
            }

            @Override // p237g5.AbstractC4445k.a
            /* renamed from: a */
            public AbstractC4445k mo18933a(AbstractC4445k.b bVar, C4424Z c4424z) {
                AbstractC4445k.a aVar = this.f22035b;
                return aVar != null ? new C7238a(aVar.mo18933a(bVar, c4424z)) : new b();
            }
        }

        public h(AbstractC4417S.j jVar) {
            this.f22032a = jVar;
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            AbstractC4417S.f mo18683a = this.f22032a.mo18683a(gVar);
            AbstractC4417S.i m18711c = mo18683a.m18711c();
            return m18711c != null ? AbstractC4417S.f.m18708i(m18711c, new a((b) m18711c.mo18727c().m18819b(C6151h.f21976p), mo18683a.m18710b())) : mo18683a;
        }
    }

    /* renamed from: p5.h$i */
    public class i extends AbstractC6147d {

        /* renamed from: a */
        public final AbstractC4417S.i f22040a;

        /* renamed from: b */
        public b f22041b;

        /* renamed from: c */
        public boolean f22042c;

        /* renamed from: d */
        public C4457q f22043d;

        /* renamed from: e */
        public AbstractC4417S.k f22044e;

        /* renamed from: f */
        public final AbstractC4435f f22045f;

        /* renamed from: p5.h$i$a */
        public class a implements AbstractC4417S.k {

            /* renamed from: a */
            public final AbstractC4417S.k f22047a;

            public a(AbstractC4417S.k kVar) {
                this.f22047a = kVar;
            }

            @Override // p237g5.AbstractC4417S.k
            /* renamed from: a */
            public void mo18735a(C4457q c4457q) {
                i.this.f22043d = c4457q;
                if (i.this.f22042c) {
                    return;
                }
                this.f22047a.mo18735a(c4457q);
            }
        }

        public i(AbstractC4417S.b bVar, AbstractC4417S.e eVar) {
            AbstractC4417S.b.C7219b c7219b = AbstractC4417S.f15639c;
            AbstractC4417S.k kVar = (AbstractC4417S.k) bVar.m18687c(c7219b);
            if (kVar != null) {
                this.f22044e = kVar;
                this.f22040a = eVar.mo18698a(bVar.m18688e().m18690b(c7219b, new a(kVar)).m18691c());
            } else {
                this.f22040a = eVar.mo18698a(bVar);
            }
            this.f22045f = this.f22040a.mo18728d();
        }

        @Override // p316p5.AbstractC6147d, p237g5.AbstractC4417S.i
        /* renamed from: c */
        public C4425a mo18727c() {
            return this.f22041b != null ? this.f22040a.mo18727c().m18820d().m18824d(C6151h.f21976p, this.f22041b).m18821a() : this.f22040a.mo18727c();
        }

        @Override // p316p5.AbstractC6147d, p237g5.AbstractC4417S.i
        /* renamed from: g */
        public void mo18731g() {
            b bVar = this.f22041b;
            if (bVar != null) {
                bVar.m25667i(this);
            }
            super.mo18731g();
        }

        @Override // p316p5.AbstractC6147d, p237g5.AbstractC4417S.i
        /* renamed from: h */
        public void mo18732h(AbstractC4417S.k kVar) {
            if (this.f22044e != null) {
                super.mo18732h(kVar);
            } else {
                this.f22044e = kVar;
                super.mo18732h(new a(kVar));
            }
        }

        @Override // p316p5.AbstractC6147d, p237g5.AbstractC4417S.i
        /* renamed from: i */
        public void mo18733i(List list) {
            if (C6151h.m25657m(mo18726b()) && C6151h.m25657m(list)) {
                if (C6151h.this.f21977g.containsValue(this.f22041b)) {
                    this.f22041b.m25667i(this);
                }
                SocketAddress socketAddress = (SocketAddress) ((C4466x) list.get(0)).m19034a().get(0);
                if (C6151h.this.f21977g.containsKey(socketAddress)) {
                    ((b) C6151h.this.f21977g.get(socketAddress)).m25660b(this);
                }
            } else if (!C6151h.m25657m(mo18726b()) || C6151h.m25657m(list)) {
                if (!C6151h.m25657m(mo18726b()) && C6151h.m25657m(list)) {
                    SocketAddress socketAddress2 = (SocketAddress) ((C4466x) list.get(0)).m19034a().get(0);
                    if (C6151h.this.f21977g.containsKey(socketAddress2)) {
                        ((b) C6151h.this.f21977g.get(socketAddress2)).m25660b(this);
                    }
                }
            } else if (C6151h.this.f21977g.containsKey(m18725a().m19034a().get(0))) {
                b bVar = (b) C6151h.this.f21977g.get(m18725a().m19034a().get(0));
                bVar.m25667i(this);
                bVar.m25668j();
            }
            this.f22040a.mo18733i(list);
        }

        @Override // p316p5.AbstractC6147d
        /* renamed from: j */
        public AbstractC4417S.i mo25608j() {
            return this.f22040a;
        }

        /* renamed from: m */
        public void m25706m() {
            this.f22041b = null;
        }

        /* renamed from: n */
        public void m25707n() {
            this.f22042c = true;
            this.f22044e.mo18735a(C4457q.m18997b(C4448l0.f15810t));
            this.f22045f.mo18925b(AbstractC4435f.a.INFO, "Subchannel ejected: {0}", this);
        }

        /* renamed from: o */
        public boolean m25708o() {
            return this.f22042c;
        }

        /* renamed from: p */
        public void m25709p(b bVar) {
            this.f22041b = bVar;
        }

        /* renamed from: q */
        public void m25710q() {
            this.f22042c = false;
            C4457q c4457q = this.f22043d;
            if (c4457q != null) {
                this.f22044e.mo18735a(c4457q);
                this.f22045f.mo18925b(AbstractC4435f.a.INFO, "Subchannel unejected: {0}", this);
            }
        }

        @Override // p316p5.AbstractC6147d
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f22040a.mo18726b() + '}';
        }
    }

    /* renamed from: p5.h$j */
    public interface j {
        /* renamed from: a */
        void mo25683a(c cVar, long j7);
    }

    /* renamed from: p5.h$k */
    public static class k implements j {

        /* renamed from: a */
        public final g f22049a;

        /* renamed from: b */
        public final AbstractC4435f f22050b;

        public k(g gVar, AbstractC4435f abstractC4435f) {
            AbstractC2932o.m10562e(gVar.f22006e != null, "success rate ejection config is null");
            this.f22049a = gVar;
            this.f22050b = abstractC4435f;
        }

        /* renamed from: b */
        public static double m25711b(Collection collection) {
            Iterator it = collection.iterator();
            double d7 = 0.0d;
            while (it.hasNext()) {
                d7 += ((Double) it.next()).doubleValue();
            }
            return d7 / collection.size();
        }

        /* renamed from: c */
        public static double m25712c(Collection collection, double d7) {
            Iterator it = collection.iterator();
            double d8 = 0.0d;
            while (it.hasNext()) {
                double doubleValue = ((Double) it.next()).doubleValue() - d7;
                d8 += doubleValue * doubleValue;
            }
            return Math.sqrt(d8 / collection.size());
        }

        @Override // p316p5.C6151h.j
        /* renamed from: a */
        public void mo25683a(c cVar, long j7) {
            Iterator it;
            List m25658n = C6151h.m25658n(cVar, this.f22049a.f22006e.f22027d.intValue());
            if (m25658n.size() < this.f22049a.f22006e.f22026c.intValue() || m25658n.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = m25658n.iterator();
            while (it2.hasNext()) {
                arrayList.add(Double.valueOf(((b) it2.next()).m25672n()));
            }
            double m25711b = m25711b(arrayList);
            double m25712c = m25712c(arrayList, m25711b);
            double intValue = m25711b - ((this.f22049a.f22006e.f22024a.intValue() / 1000.0f) * m25712c);
            Iterator it3 = m25658n.iterator();
            while (it3.hasNext()) {
                b bVar = (b) it3.next();
                if (cVar.m25677g() >= this.f22049a.f22005d.intValue()) {
                    return;
                }
                if (bVar.m25672n() < intValue) {
                    it = it3;
                    this.f22050b.mo18925b(AbstractC4435f.a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", bVar, Double.valueOf(bVar.m25672n()), Double.valueOf(m25711b), Double.valueOf(m25712c), Double.valueOf(intValue));
                    if (new Random().nextInt(100) < this.f22049a.f22006e.f22025b.intValue()) {
                        bVar.m25662d(j7);
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
        }
    }

    public C6151h(AbstractC4417S.e eVar, InterfaceC4581S0 interfaceC4581S0) {
        AbstractC4435f mo18699b = eVar.mo18699b();
        this.f21985o = mo18699b;
        d dVar = new d((AbstractC4417S.e) AbstractC2932o.m10573p(eVar, "helper"));
        this.f21979i = dVar;
        this.f21980j = new C6148e(dVar);
        this.f21977g = new c();
        this.f21978h = (ExecutorC4456p0) AbstractC2932o.m10573p(eVar.mo18701d(), "syncContext");
        this.f21982l = (ScheduledExecutorService) AbstractC2932o.m10573p(eVar.mo18700c(), "timeService");
        this.f21981k = interfaceC4581S0;
        mo18699b.mo18924a(AbstractC4435f.a.DEBUG, "OutlierDetection lb created.");
    }

    /* renamed from: m */
    public static boolean m25657m(List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((C4466x) it.next()).m19034a().size();
            if (i7 > 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static List m25658n(c cVar, int i7) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.m25664f() >= i7) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: a */
    public C4448l0 mo18677a(AbstractC4417S.h hVar) {
        this.f21985o.mo18925b(AbstractC4435f.a.DEBUG, "Received resolution result: {0}", hVar);
        g gVar = (g) hVar.m18719c();
        ArrayList arrayList = new ArrayList();
        Iterator it = hVar.m18717a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C4466x) it.next()).m19034a());
        }
        this.f21977g.keySet().retainAll(arrayList);
        this.f21977g.m25682l(gVar);
        this.f21977g.m25679i(gVar, arrayList);
        this.f21980j.m25619r(gVar.f22008g.m19564b());
        if (gVar.m25684a()) {
            Long valueOf = this.f21984n == null ? gVar.f22002a : Long.valueOf(Math.max(0L, gVar.f22002a.longValue() - (this.f21981k.mo19625a() - this.f21984n.longValue())));
            ExecutorC4456p0.d dVar = this.f21983m;
            if (dVar != null) {
                dVar.m18994a();
                this.f21977g.m25680j();
            }
            this.f21983m = this.f21978h.m18992d(new e(gVar, this.f21985o), valueOf.longValue(), gVar.f22002a.longValue(), TimeUnit.NANOSECONDS, this.f21982l);
        } else {
            ExecutorC4456p0.d dVar2 = this.f21983m;
            if (dVar2 != null) {
                dVar2.m18994a();
                this.f21984n = null;
                this.f21977g.m25676f();
            }
        }
        this.f21980j.mo18680d(hVar.m18720e().m18724d(gVar.f22008g.m19563a()).m18721a());
        return C4448l0.f15795e;
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: c */
    public void mo18679c(C4448l0 c4448l0) {
        this.f21980j.mo18679c(c4448l0);
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: f */
    public void mo18682f() {
        this.f21980j.mo18682f();
    }
}
