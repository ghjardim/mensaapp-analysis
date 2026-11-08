package p081L3;

import android.util.SparseArray;
import com.google.protobuf.AbstractC4055i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p053H3.C0564j;
import p060I3.C0643e;
import p060I3.C0648j;
import p060I3.InterfaceC0639a;
import p067J3.C0737c0;
import p067J3.C0747h0;
import p067J3.C0749i0;
import p081L3.C1041Q;
import p088M3.AbstractC1175q;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1178t;
import p088M3.C1179u;
import p088M3.C1181w;
import p088M3.InterfaceC1167i;
import p095N3.AbstractC1266f;
import p095N3.C1267g;
import p095N3.C1268h;
import p095N3.C1269i;
import p095N3.C1272l;
import p095N3.C1273m;
import p109P3.C1906O;
import p109P3.C1914X;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.InterfaceC2123A;
import p116Q3.InterfaceC2145n;
import p219e3.C4188r;
import p256j$.util.Objects;
import p376x3.AbstractC6948c;
import p376x3.C6950e;

/* renamed from: L3.K */
/* loaded from: classes.dex */
public final class C1024K implements InterfaceC0639a {

    /* renamed from: o */
    public static final long f3384o = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a */
    public final AbstractC1085i0 f3385a;

    /* renamed from: b */
    public InterfaceC1078g f3386b;

    /* renamed from: c */
    public InterfaceC1096m f3387c;

    /* renamed from: d */
    public InterfaceC1076f0 f3388d;

    /* renamed from: e */
    public InterfaceC1063b f3389e;

    /* renamed from: f */
    public final InterfaceC1106p0 f3390f;

    /* renamed from: g */
    public C1102o f3391g;

    /* renamed from: h */
    public final C1091k0 f3392h;

    /* renamed from: i */
    public final C1103o0 f3393i;

    /* renamed from: j */
    public final InterfaceC1035N1 f3394j;

    /* renamed from: k */
    public final InterfaceC1060a f3395k;

    /* renamed from: l */
    public final SparseArray f3396l;

    /* renamed from: m */
    public final Map f3397m;

    /* renamed from: n */
    public final C0749i0 f3398n;

    /* renamed from: L3.K$b */
    public static class b {

        /* renamed from: a */
        public C1038O1 f3399a;

        /* renamed from: b */
        public int f3400b;

        public b() {
        }
    }

    /* renamed from: L3.K$c */
    public static class c {

        /* renamed from: a */
        public final Map f3401a;

        /* renamed from: b */
        public final Set f3402b;

        public c(Map map, Set set) {
            this.f3401a = map;
            this.f3402b = set;
        }
    }

    public C1024K(AbstractC1085i0 abstractC1085i0, C1091k0 c1091k0, C0564j c0564j) {
        AbstractC2133b.m7217d(abstractC1085i0.mo4222j(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f3385a = abstractC1085i0;
        this.f3392h = c1091k0;
        this.f3386b = abstractC1085i0.mo4215c();
        InterfaceC1035N1 mo4221i = abstractC1085i0.mo4221i();
        this.f3394j = mo4221i;
        this.f3395k = abstractC1085i0.mo4213a();
        this.f3398n = C0749i0.m3205b(mo4221i.mo4068d());
        this.f3390f = abstractC1085i0.mo4220h();
        C1103o0 c1103o0 = new C1103o0();
        this.f3393i = c1103o0;
        this.f3396l = new SparseArray();
        this.f3397m = new HashMap();
        abstractC1085i0.mo4219g().mo4107o(c1103o0);
        m4013O(c0564j);
    }

    /* renamed from: h0 */
    public static C0747h0 m3984h0(String str) {
        return C0737c0.m3090b(C1179u.m4565v("__bundle__/docs/" + str)).m3094D();
    }

    /* renamed from: p0 */
    public static boolean m3993p0(C1038O1 c1038o1, C1038O1 c1038o12, C1914X c1914x) {
        if (c1038o1.m4115d().isEmpty()) {
            return true;
        }
        long m17567h = c1038o12.m4117f().m4572f().m17567h() - c1038o1.m4117f().m4572f().m17567h();
        long j7 = f3384o;
        if (m17567h < j7 && c1038o12.m4113b().m4572f().m17567h() - c1038o1.m4113b().m4572f().m17567h() < j7) {
            return c1914x != null && (c1914x.m6756b().size() + c1914x.m6757c().size()) + c1914x.m6758d().size() > 0;
        }
        return true;
    }

    /* renamed from: A */
    public void m3999A(final List list) {
        this.f3385a.mo4224l("Configure indexes", new Runnable() { // from class: L3.J
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4019U(list);
            }
        });
    }

    /* renamed from: B */
    public void m4000B() {
        this.f3385a.mo4224l("Delete All Indexes", new Runnable() { // from class: L3.H
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4020V();
            }
        });
    }

    /* renamed from: C */
    public C1097m0 m4001C(C0737c0 c0737c0, boolean z6) {
        C6950e c6950e;
        C1181w c1181w;
        C1038O1 m4010L = m4010L(c0737c0.m3094D());
        C1181w c1181w2 = C1181w.f3793b;
        C6950e m4496h = C1170l.m4496h();
        if (m4010L != null) {
            c1181w = m4010L.m4113b();
            c6950e = this.f3394j.mo4071g(m4010L.m4119h());
        } else {
            c6950e = m4496h;
            c1181w = c1181w2;
        }
        C1091k0 c1091k0 = this.f3392h;
        if (z6) {
            c1181w2 = c1181w;
        }
        return new C1097m0(c1091k0.m4311e(c0737c0, c1181w2, c6950e), c6950e);
    }

    /* renamed from: D */
    public int m4002D() {
        return this.f3388d.mo4188h();
    }

    /* renamed from: E */
    public InterfaceC1096m m4003E() {
        return this.f3387c;
    }

    /* renamed from: F */
    public final Set m4004F(C1268h c1268h) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c1268h.m4855e().size(); i7++) {
            if (!((C1269i) c1268h.m4855e().get(i7)).m4857a().isEmpty()) {
                hashSet.add(((AbstractC1266f) c1268h.m4852b().m4850h().get(i7)).m4835g());
            }
        }
        return hashSet;
    }

    /* renamed from: G */
    public C1181w m4005G() {
        return this.f3394j.mo4072h();
    }

    /* renamed from: H */
    public AbstractC4055i m4006H() {
        return this.f3388d.mo4190j();
    }

    /* renamed from: I */
    public C1102o m4007I() {
        return this.f3391g;
    }

    /* renamed from: J */
    public C0648j m4008J(final String str) {
        return (C0648j) this.f3385a.mo4223k("Get named query", new InterfaceC2123A() { // from class: L3.r
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                C0648j m4021W;
                m4021W = C1024K.this.m4021W(str);
                return m4021W;
            }
        });
    }

    /* renamed from: K */
    public C1267g m4009K(int i7) {
        return this.f3388d.mo4187g(i7);
    }

    /* renamed from: L */
    public C1038O1 m4010L(C0747h0 c0747h0) {
        Integer num = (Integer) this.f3397m.get(c0747h0);
        return num != null ? (C1038O1) this.f3396l.get(num.intValue()) : this.f3394j.mo4073i(c0747h0);
    }

    /* renamed from: M */
    public AbstractC6948c m4011M(C0564j c0564j) {
        List mo4191k = this.f3388d.mo4191k();
        m4013O(c0564j);
        m4040r0();
        m4041s0();
        List mo4191k2 = this.f3388d.mo4191k();
        C6950e m4496h = C1170l.m4496h();
        Iterator it = Arrays.asList(mo4191k, mo4191k2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C1267g) it2.next()).m4850h().iterator();
                while (it3.hasNext()) {
                    m4496h = m4496h.m28471e(((AbstractC1266f) it3.next()).m4835g());
                }
            }
        }
        return this.f3391g.m4351d(m4496h);
    }

    /* renamed from: N */
    public boolean m4012N(final C0643e c0643e) {
        return ((Boolean) this.f3385a.mo4223k("Has newer bundle", new InterfaceC2123A() { // from class: L3.I
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                Boolean m4022X;
                m4022X = C1024K.this.m4022X(c0643e);
                return m4022X;
            }
        })).booleanValue();
    }

    /* renamed from: O */
    public final void m4013O(C0564j c0564j) {
        InterfaceC1096m mo4216d = this.f3385a.mo4216d(c0564j);
        this.f3387c = mo4216d;
        this.f3388d = this.f3385a.mo4217e(c0564j, mo4216d);
        InterfaceC1063b mo4214b = this.f3385a.mo4214b(c0564j);
        this.f3389e = mo4214b;
        this.f3391g = new C1102o(this.f3390f, this.f3388d, mo4214b, this.f3387c);
        this.f3390f.mo4243a(this.f3387c);
        this.f3392h.m4312f(this.f3391g, this.f3387c);
    }

    /* renamed from: P */
    public final /* synthetic */ AbstractC6948c m4014P(C1268h c1268h) {
        C1267g m4852b = c1268h.m4852b();
        this.f3388d.mo4183c(m4852b, c1268h.m4856f());
        m4046y(c1268h);
        this.f3388d.mo4181a();
        this.f3389e.mo4152c(c1268h.m4852b().m4847e());
        this.f3391g.m4362o(m4004F(c1268h));
        return this.f3391g.m4351d(m4852b.m4848f());
    }

    /* renamed from: Q */
    public final /* synthetic */ void m4015Q(b bVar, C0747h0 c0747h0) {
        int m3206c = this.f3398n.m3206c();
        bVar.f3400b = m3206c;
        C1038O1 c1038o1 = new C1038O1(c0747h0, m3206c, this.f3385a.mo4219g().mo4101e(), EnumC1094l0.LISTEN);
        bVar.f3399a = c1038o1;
        this.f3394j.mo4069e(c1038o1);
    }

    /* renamed from: R */
    public final /* synthetic */ AbstractC6948c m4016R(AbstractC6948c abstractC6948c, C1038O1 c1038o1) {
        C6950e m4496h = C1170l.m4496h();
        HashMap hashMap = new HashMap();
        Iterator it = abstractC6948c.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C1170l c1170l = (C1170l) entry.getKey();
            C1177s c1177s = (C1177s) entry.getValue();
            if (c1177s.mo4482c()) {
                m4496h = m4496h.m28471e(c1170l);
            }
            hashMap.put(c1170l, c1177s);
        }
        this.f3394j.mo4074j(c1038o1.m4119h());
        this.f3394j.mo4066b(m4496h, c1038o1.m4119h());
        c m4033j0 = m4033j0(hashMap);
        return this.f3391g.m4357j(m4033j0.f3401a, m4033j0.f3402b);
    }

    /* renamed from: S */
    public final /* synthetic */ AbstractC6948c m4017S(C1906O c1906o, C1181w c1181w) {
        Map m6646d = c1906o.m6646d();
        long mo4101e = this.f3385a.mo4219g().mo4101e();
        for (Map.Entry entry : m6646d.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int intValue = num.intValue();
            C1914X c1914x = (C1914X) entry.getValue();
            C1038O1 c1038o1 = (C1038O1) this.f3396l.get(intValue);
            if (c1038o1 != null) {
                this.f3394j.mo4070f(c1914x.m6758d(), intValue);
                this.f3394j.mo4066b(c1914x.m6756b(), intValue);
                C1038O1 m4123l = c1038o1.m4123l(mo4101e);
                if (c1906o.m6647e().containsKey(num)) {
                    AbstractC4055i abstractC4055i = AbstractC4055i.f13379b;
                    C1181w c1181w2 = C1181w.f3793b;
                    m4123l = m4123l.m4122k(abstractC4055i, c1181w2).m4121j(c1181w2);
                } else if (!c1914x.m6759e().isEmpty()) {
                    m4123l = m4123l.m4122k(c1914x.m6759e(), c1906o.m6645c());
                }
                this.f3396l.put(intValue, m4123l);
                if (m3993p0(c1038o1, m4123l, c1914x)) {
                    this.f3394j.mo4067c(m4123l);
                }
            }
        }
        Map m6643a = c1906o.m6643a();
        Set m6644b = c1906o.m6644b();
        for (C1170l c1170l : m6643a.keySet()) {
            if (m6644b.contains(c1170l)) {
                this.f3385a.mo4219g().mo4102f(c1170l);
            }
        }
        c m4033j0 = m4033j0(m6643a);
        Map map = m4033j0.f3401a;
        C1181w mo4072h = this.f3394j.mo4072h();
        if (!c1181w.equals(C1181w.f3793b)) {
            AbstractC2133b.m7217d(c1181w.compareTo(mo4072h) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", c1181w, mo4072h);
            this.f3394j.mo4065a(c1181w);
        }
        return this.f3391g.m4357j(map, m4033j0.f3402b);
    }

    /* renamed from: T */
    public final /* synthetic */ C1041Q.c m4018T(C1041Q c1041q) {
        return c1041q.m4130f(this.f3396l);
    }

    /* renamed from: U */
    public final /* synthetic */ void m4019U(List list) {
        Collection mo3963c = this.f3387c.mo3963c();
        Comparator comparator = AbstractC1175q.f3766b;
        final InterfaceC1096m interfaceC1096m = this.f3387c;
        Objects.requireNonNull(interfaceC1096m);
        InterfaceC2145n interfaceC2145n = new InterfaceC2145n() { // from class: L3.v
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                InterfaceC1096m.this.mo3968h((AbstractC1175q) obj);
            }
        };
        final InterfaceC1096m interfaceC1096m2 = this.f3387c;
        Objects.requireNonNull(interfaceC1096m2);
        AbstractC2131I.m7203r(mo3963c, list, comparator, interfaceC2145n, new InterfaceC2145n() { // from class: L3.w
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                InterfaceC1096m.this.mo3962b((AbstractC1175q) obj);
            }
        });
    }

    /* renamed from: V */
    public final /* synthetic */ void m4020V() {
        this.f3387c.mo3966f();
    }

    /* renamed from: W */
    public final /* synthetic */ C0648j m4021W(String str) {
        return this.f3395k.mo4149d(str);
    }

    /* renamed from: X */
    public final /* synthetic */ Boolean m4022X(C0643e c0643e) {
        C0643e mo4146a = this.f3395k.mo4146a(c0643e.m2552a());
        return Boolean.valueOf(mo4146a != null && mo4146a.m2553b().compareTo(c0643e.m2553b()) >= 0);
    }

    /* renamed from: Y */
    public final /* synthetic */ void m4023Y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1027L c1027l = (C1027L) it.next();
            int m4053d = c1027l.m4053d();
            this.f3393i.m4364b(c1027l.m4051b(), m4053d);
            C6950e m4052c = c1027l.m4052c();
            Iterator it2 = m4052c.iterator();
            while (it2.hasNext()) {
                this.f3385a.mo4219g().mo4104j((C1170l) it2.next());
            }
            this.f3393i.m4369g(m4052c, m4053d);
            if (!c1027l.m4054e()) {
                C1038O1 c1038o1 = (C1038O1) this.f3396l.get(m4053d);
                AbstractC2133b.m7217d(c1038o1 != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(m4053d));
                C1038O1 m4121j = c1038o1.m4121j(c1038o1.m4117f());
                this.f3396l.put(m4053d, m4121j);
                if (m3993p0(c1038o1, m4121j, null)) {
                    this.f3394j.mo4067c(m4121j);
                }
            }
        }
    }

    /* renamed from: Z */
    public final /* synthetic */ AbstractC6948c m4024Z(int i7) {
        C1267g mo4189i = this.f3388d.mo4189i(i7);
        AbstractC2133b.m7217d(mo4189i != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.f3388d.mo4184d(mo4189i);
        this.f3388d.mo4181a();
        this.f3389e.mo4152c(i7);
        this.f3391g.m4362o(mo4189i.m4848f());
        return this.f3391g.m4351d(mo4189i.m4848f());
    }

    @Override // p060I3.InterfaceC0639a
    /* renamed from: a */
    public void mo2544a(final C0648j c0648j, final C6950e c6950e) {
        final C1038O1 m4044w = m4044w(c0648j.m2607a().m2606b());
        final int m4119h = m4044w.m4119h();
        this.f3385a.mo4224l("Saved named query", new Runnable() { // from class: L3.s
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4027c0(c0648j, m4044w, m4119h, c6950e);
            }
        });
    }

    /* renamed from: a0 */
    public final /* synthetic */ void m4025a0(int i7) {
        C1038O1 c1038o1 = (C1038O1) this.f3396l.get(i7);
        AbstractC2133b.m7217d(c1038o1 != null, "Tried to release nonexistent target: %s", Integer.valueOf(i7));
        Iterator it = this.f3393i.m4370h(i7).iterator();
        while (it.hasNext()) {
            this.f3385a.mo4219g().mo4104j((C1170l) it.next());
        }
        this.f3385a.mo4219g().mo4105k(c1038o1);
        this.f3396l.remove(i7);
        this.f3397m.remove(c1038o1.m4118g());
    }

    @Override // p060I3.InterfaceC0639a
    /* renamed from: b */
    public void mo2545b(final C0643e c0643e) {
        this.f3385a.mo4224l("Save bundle", new Runnable() { // from class: L3.t
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4026b0(c0643e);
            }
        });
    }

    /* renamed from: b0 */
    public final /* synthetic */ void m4026b0(C0643e c0643e) {
        this.f3395k.mo4148c(c0643e);
    }

    @Override // p060I3.InterfaceC0639a
    /* renamed from: c */
    public AbstractC6948c mo2546c(final AbstractC6948c abstractC6948c, String str) {
        final C1038O1 m4044w = m4044w(m3984h0(str));
        return (AbstractC6948c) this.f3385a.mo4223k("Apply bundle documents", new InterfaceC2123A() { // from class: L3.G
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                AbstractC6948c m4016R;
                m4016R = C1024K.this.m4016R(abstractC6948c, m4044w);
                return m4016R;
            }
        });
    }

    /* renamed from: c0 */
    public final /* synthetic */ void m4027c0(C0648j c0648j, C1038O1 c1038o1, int i7, C6950e c6950e) {
        if (c0648j.m2609c().compareTo(c1038o1.m4117f()) > 0) {
            C1038O1 m4122k = c1038o1.m4122k(AbstractC4055i.f13379b, c0648j.m2609c());
            this.f3396l.append(i7, m4122k);
            this.f3394j.mo4067c(m4122k);
            this.f3394j.mo4074j(i7);
            this.f3394j.mo4066b(c6950e, i7);
        }
        this.f3395k.mo4147b(c0648j);
    }

    /* renamed from: d0 */
    public final /* synthetic */ void m4028d0(AbstractC4055i abstractC4055i) {
        this.f3388d.mo4185e(abstractC4055i);
    }

    /* renamed from: e0 */
    public final /* synthetic */ void m4029e0() {
        this.f3387c.start();
    }

    /* renamed from: f0 */
    public final /* synthetic */ void m4030f0() {
        this.f3388d.start();
    }

    /* renamed from: g0 */
    public final /* synthetic */ C1099n m4031g0(Set set, List list, C4188r c4188r) {
        Map mo4244b = this.f3390f.mo4244b(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : mo4244b.entrySet()) {
            if (!((C1177s) entry.getValue()).m4545o()) {
                hashSet.add((C1170l) entry.getKey());
            }
        }
        Map m4359l = this.f3391g.m4359l(mo4244b);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1266f abstractC1266f = (AbstractC1266f) it.next();
            C1178t m4833d = abstractC1266f.m4833d(((C1082h0) m4359l.get(abstractC1266f.m4835g())).m4303a());
            if (m4833d != null) {
                arrayList.add(new C1272l(abstractC1266f.m4835g(), m4833d, m4833d.m4559j(), C1273m.m4868a(true)));
            }
        }
        C1267g mo4186f = this.f3388d.mo4186f(c4188r, arrayList, list);
        this.f3389e.mo4154e(mo4186f.m4847e(), mo4186f.m4843a(m4359l, hashSet));
        return C1099n.m4345a(mo4186f.m4847e(), m4359l);
    }

    /* renamed from: i0 */
    public void m4032i0(final List list) {
        this.f3385a.mo4224l("notifyLocalViewChanges", new Runnable() { // from class: L3.F
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4023Y(list);
            }
        });
    }

    /* renamed from: j0 */
    public final c m4033j0(Map map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map mo4244b = this.f3390f.mo4244b(map.keySet());
        for (Map.Entry entry : map.entrySet()) {
            C1170l c1170l = (C1170l) entry.getKey();
            C1177s c1177s = (C1177s) entry.getValue();
            C1177s c1177s2 = (C1177s) mo4244b.get(c1170l);
            if (c1177s.mo4482c() != c1177s2.mo4482c()) {
                hashSet.add(c1170l);
            }
            if (c1177s.mo4488i() && c1177s.mo4490k().equals(C1181w.f3793b)) {
                arrayList.add(c1177s.getKey());
                hashMap.put(c1170l, c1177s);
            } else if (!c1177s2.m4545o() || c1177s.mo4490k().compareTo(c1177s2.mo4490k()) > 0 || (c1177s.mo4490k().compareTo(c1177s2.mo4490k()) == 0 && c1177s2.mo4486g())) {
                AbstractC2133b.m7217d(!C1181w.f3793b.equals(c1177s.mo4487h()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f3390f.mo4245c(c1177s, c1177s.mo4487h());
                hashMap.put(c1170l, c1177s);
            } else {
                AbstractC2155x.m7309a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", c1170l, c1177s2.mo4490k(), c1177s.mo4490k());
            }
        }
        this.f3390f.removeAll(arrayList);
        return new c(hashMap, hashSet);
    }

    /* renamed from: k0 */
    public InterfaceC1167i m4034k0(C1170l c1170l) {
        return this.f3391g.m4350c(c1170l);
    }

    /* renamed from: l0 */
    public AbstractC6948c m4035l0(final int i7) {
        return (AbstractC6948c) this.f3385a.mo4223k("Reject batch", new InterfaceC2123A() { // from class: L3.E
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                AbstractC6948c m4024Z;
                m4024Z = C1024K.this.m4024Z(i7);
                return m4024Z;
            }
        });
    }

    /* renamed from: m0 */
    public void m4036m0(final int i7) {
        this.f3385a.mo4224l("Release target", new Runnable() { // from class: L3.y
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4025a0(i7);
            }
        });
    }

    /* renamed from: n0 */
    public void m4037n0(boolean z6) {
        this.f3392h.m4316j(z6);
    }

    /* renamed from: o0 */
    public void m4038o0(final AbstractC4055i abstractC4055i) {
        this.f3385a.mo4224l("Set stream token", new Runnable() { // from class: L3.D
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4028d0(abstractC4055i);
            }
        });
    }

    /* renamed from: q0 */
    public void m4039q0() {
        this.f3385a.mo4218f().run();
        m4040r0();
        m4041s0();
    }

    /* renamed from: r0 */
    public final void m4040r0() {
        this.f3385a.mo4224l("Start IndexManager", new Runnable() { // from class: L3.q
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4029e0();
            }
        });
    }

    /* renamed from: s0 */
    public final void m4041s0() {
        this.f3385a.mo4224l("Start MutationQueue", new Runnable() { // from class: L3.B
            @Override // java.lang.Runnable
            public final void run() {
                C1024K.this.m4030f0();
            }
        });
    }

    /* renamed from: t0 */
    public C1099n m4042t0(final List list) {
        final C4188r m17564i = C4188r.m17564i();
        final HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((AbstractC1266f) it.next()).m4835g());
        }
        return (C1099n) this.f3385a.mo4223k("Locally write mutations", new InterfaceC2123A() { // from class: L3.u
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                C1099n m4031g0;
                m4031g0 = C1024K.this.m4031g0(hashSet, list, m17564i);
                return m4031g0;
            }
        });
    }

    /* renamed from: v */
    public AbstractC6948c m4043v(final C1268h c1268h) {
        return (AbstractC6948c) this.f3385a.mo4223k("Acknowledge batch", new InterfaceC2123A() { // from class: L3.z
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                AbstractC6948c m4014P;
                m4014P = C1024K.this.m4014P(c1268h);
                return m4014P;
            }
        });
    }

    /* renamed from: w */
    public C1038O1 m4044w(final C0747h0 c0747h0) {
        int i7;
        C1038O1 mo4073i = this.f3394j.mo4073i(c0747h0);
        if (mo4073i != null) {
            i7 = mo4073i.m4119h();
        } else {
            final b bVar = new b();
            this.f3385a.mo4224l("Allocate target", new Runnable() { // from class: L3.A
                @Override // java.lang.Runnable
                public final void run() {
                    C1024K.this.m4015Q(bVar, c0747h0);
                }
            });
            i7 = bVar.f3400b;
            mo4073i = bVar.f3399a;
        }
        if (this.f3396l.get(i7) == null) {
            this.f3396l.put(i7, mo4073i);
            this.f3397m.put(c0747h0, Integer.valueOf(i7));
        }
        return mo4073i;
    }

    /* renamed from: x */
    public AbstractC6948c m4045x(final C1906O c1906o) {
        final C1181w m6645c = c1906o.m6645c();
        return (AbstractC6948c) this.f3385a.mo4223k("Apply remote event", new InterfaceC2123A() { // from class: L3.x
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                AbstractC6948c m4017S;
                m4017S = C1024K.this.m4017S(c1906o, m6645c);
                return m4017S;
            }
        });
    }

    /* renamed from: y */
    public final void m4046y(C1268h c1268h) {
        C1267g m4852b = c1268h.m4852b();
        for (C1170l c1170l : m4852b.m4848f()) {
            C1177s mo4246d = this.f3390f.mo4246d(c1170l);
            C1181w c1181w = (C1181w) c1268h.m4854d().mo28451b(c1170l);
            AbstractC2133b.m7217d(c1181w != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (mo4246d.mo4490k().compareTo(c1181w) < 0) {
                m4852b.m4845c(mo4246d, c1268h);
                if (mo4246d.m4545o()) {
                    this.f3390f.mo4245c(mo4246d, c1268h.m4853c());
                }
            }
        }
        this.f3388d.mo4184d(m4852b);
    }

    /* renamed from: z */
    public C1041Q.c m4047z(final C1041Q c1041q) {
        return (C1041Q.c) this.f3385a.mo4223k("Collect garbage", new InterfaceC2123A() { // from class: L3.C
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                C1041Q.c m4018T;
                m4018T = C1024K.this.m4018T(c1041q);
                return m4018T;
            }
        });
    }
}
