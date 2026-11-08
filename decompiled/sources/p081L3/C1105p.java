package p081L3;

import com.google.protobuf.AbstractC4055i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p060I3.C0647i;
import p067J3.C0737c0;
import p067J3.C0747h0;
import p088M3.AbstractC1175q;
import p088M3.C1176r;
import p088M3.C1177s;
import p088M3.C1178t;
import p088M3.C1181w;
import p088M3.InterfaceC1167i;
import p095N3.AbstractC1266f;
import p095N3.C1267g;
import p102O3.C1296a;
import p102O3.C1297b;
import p102O3.C1298c;
import p102O3.C1299d;
import p102O3.C1300e;
import p109P3.C1907P;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;
import p252i4.C4544a;
import p263j4.C5371a;
import p272k4.C5410A;
import p272k4.C5414E;
import p272k4.C5428k;
import p272k4.C5433p;

/* renamed from: L3.p */
/* loaded from: classes.dex */
public final class C1105p {

    /* renamed from: a */
    public final C1907P f3618a;

    /* renamed from: L3.p$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3619a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3620b;

        static {
            int[] iArr = new int[C1298c.c.values().length];
            f3620b = iArr;
            try {
                iArr[C1298c.c.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3620b[C1298c.c.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C1296a.c.values().length];
            f3619a = iArr2;
            try {
                iArr2[C1296a.c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3619a[C1296a.c.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3619a[C1296a.c.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C1105p(C1907P c1907p) {
        this.f3618a = c1907p;
    }

    /* renamed from: a */
    public C0647i m4371a(C5371a c5371a) {
        return new C0647i(this.f3618a.m6697t(c5371a.m22089e0(), c5371a.m22090f0()), c5371a.m22088d0().equals(C5371a.c.FIRST) ? C0737c0.a.LIMIT_TO_FIRST : C0737c0.a.LIMIT_TO_LAST);
    }

    /* renamed from: b */
    public final C1177s m4372b(C5428k c5428k, boolean z6) {
        C1177s m4538p = C1177s.m4538p(this.f3618a.m6689l(c5428k.m22627g0()), this.f3618a.m6702y(c5428k.m22628h0()), C1178t.m4551g(c5428k.m22625e0()));
        return z6 ? m4538p.m4546t() : m4538p;
    }

    /* renamed from: c */
    public List m4373c(C4544a c4544a) {
        ArrayList arrayList = new ArrayList();
        for (C4544a.c cVar : c4544a.m19287e0()) {
            arrayList.add(AbstractC1175q.c.m4529f(C1176r.m4533v(cVar.m19296d0()), cVar.m19298f0().equals(C4544a.c.d.ARRAY_CONFIG) ? AbstractC1175q.c.a.CONTAINS : cVar.m19297e0().equals(C4544a.c.EnumC7224c.ASCENDING) ? AbstractC1175q.c.a.ASCENDING : AbstractC1175q.c.a.DESCENDING));
        }
        return arrayList;
    }

    /* renamed from: d */
    public C1177s m4374d(C1296a c1296a) {
        int i7 = a.f3619a[c1296a.m4935f0().ordinal()];
        if (i7 == 1) {
            return m4372b(c1296a.m4934e0(), c1296a.m4936g0());
        }
        if (i7 == 2) {
            return m4377g(c1296a.m4937h0(), c1296a.m4936g0());
        }
        if (i7 == 3) {
            return m4379i(c1296a.m4938i0());
        }
        throw AbstractC2133b.m7214a("Unknown MaybeDocument %s", c1296a);
    }

    /* renamed from: e */
    public AbstractC1266f m4375e(C5414E c5414e) {
        return this.f3618a.m6692o(c5414e);
    }

    /* renamed from: f */
    public C1267g m4376f(C1300e c1300e) {
        int m5023k0 = c1300e.m5023k0();
        C4188r m6700w = this.f3618a.m6700w(c1300e.m5024l0());
        int m5022j0 = c1300e.m5022j0();
        ArrayList arrayList = new ArrayList(m5022j0);
        for (int i7 = 0; i7 < m5022j0; i7++) {
            arrayList.add(this.f3618a.m6692o(c1300e.m5021i0(i7)));
        }
        ArrayList arrayList2 = new ArrayList(c1300e.m5026n0());
        int i8 = 0;
        while (i8 < c1300e.m5026n0()) {
            C5414E m5025m0 = c1300e.m5025m0(i8);
            int i9 = i8 + 1;
            if (i9 >= c1300e.m5026n0() || !c1300e.m5025m0(i9).m22505r0()) {
                arrayList2.add(this.f3618a.m6692o(m5025m0));
            } else {
                AbstractC2133b.m7217d(c1300e.m5025m0(i8).m22506s0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                C5414E.b m22490v0 = C5414E.m22490v0(m5025m0);
                Iterator it = c1300e.m5025m0(i9).m22499l0().m22660b0().iterator();
                while (it.hasNext()) {
                    m22490v0.m22513w((C5433p.c) it.next());
                }
                arrayList2.add(this.f3618a.m6692o((C5414E) m22490v0.m17059n()));
                i8 = i9;
            }
            i8++;
        }
        return new C1267g(m5023k0, m6700w, arrayList, arrayList2);
    }

    /* renamed from: g */
    public final C1177s m4377g(C1297b c1297b, boolean z6) {
        C1177s m4540r = C1177s.m4540r(this.f3618a.m6689l(c1297b.m4955d0()), this.f3618a.m6702y(c1297b.m4956e0()));
        return z6 ? m4540r.m4546t() : m4540r;
    }

    /* renamed from: h */
    public C1038O1 m4378h(C1298c c1298c) {
        C0747h0 m6682e;
        int m4979p0 = c1298c.m4979p0();
        C1181w m6702y = this.f3618a.m6702y(c1298c.m4978o0());
        C1181w m6702y2 = this.f3618a.m6702y(c1298c.m4974k0());
        AbstractC4055i m4977n0 = c1298c.m4977n0();
        long m4975l0 = c1298c.m4975l0();
        int i7 = a.f3620b[c1298c.m4980q0().ordinal()];
        if (i7 == 1) {
            m6682e = this.f3618a.m6682e(c1298c.m4973j0());
        } else {
            if (i7 != 2) {
                throw AbstractC2133b.m7214a("Unknown targetType %d", c1298c.m4980q0());
            }
            m6682e = this.f3618a.m6698u(c1298c.m4976m0());
        }
        return new C1038O1(m6682e, m4979p0, m4975l0, EnumC1094l0.LISTEN, m6702y, m6702y2, m4977n0, null);
    }

    /* renamed from: i */
    public final C1177s m4379i(C1299d c1299d) {
        return C1177s.m4541s(this.f3618a.m6689l(c1299d.m5004d0()), this.f3618a.m6702y(c1299d.m5005e0()));
    }

    /* renamed from: j */
    public C5371a m4380j(C0647i c0647i) {
        C5410A.d m6669S = this.f3618a.m6669S(c0647i.m2606b());
        C5371a.b m22086g0 = C5371a.m22086g0();
        m22086g0.m22094w(c0647i.m2605a().equals(C0737c0.a.LIMIT_TO_FIRST) ? C5371a.c.FIRST : C5371a.c.LAST);
        m22086g0.m22095x(m6669S.m22413d0());
        m22086g0.m22096y(m6669S.m22414e0());
        return (C5371a) m22086g0.m17059n();
    }

    /* renamed from: k */
    public final C5428k m4381k(InterfaceC1167i interfaceC1167i) {
        C5428k.b m22623k0 = C5428k.m22623k0();
        m22623k0.m22633x(this.f3618a.m6662L(interfaceC1167i.getKey()));
        m22623k0.m22632w(interfaceC1167i.mo4480a().m4560k());
        m22623k0.m22634y(this.f3618a.m6673W(interfaceC1167i.mo4490k().m4572f()));
        return (C5428k) m22623k0.m17059n();
    }

    /* renamed from: l */
    public C4544a m4382l(List list) {
        C4544a.b m19283f0 = C4544a.m19283f0();
        m19283f0.m19290x(C4544a.d.COLLECTION_GROUP);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1175q.c cVar = (AbstractC1175q.c) it.next();
            C4544a.c.b m19295g0 = C4544a.c.m19295g0();
            m19295g0.m19304x(cVar.mo4457g().mo4464g());
            if (cVar.mo4458h() == AbstractC1175q.c.a.CONTAINS) {
                m19295g0.m19303w(C4544a.c.a.CONTAINS);
            } else if (cVar.mo4458h() == AbstractC1175q.c.a.ASCENDING) {
                m19295g0.m19305y(C4544a.c.EnumC7224c.ASCENDING);
            } else {
                m19295g0.m19305y(C4544a.c.EnumC7224c.DESCENDING);
            }
            m19283f0.m19289w(m19295g0);
        }
        return (C4544a) m19283f0.m17059n();
    }

    /* renamed from: m */
    public C1296a m4383m(InterfaceC1167i interfaceC1167i) {
        C1296a.b m4932j0 = C1296a.m4932j0();
        if (interfaceC1167i.mo4488i()) {
            m4932j0.m4946y(m4386p(interfaceC1167i));
        } else if (interfaceC1167i.mo4482c()) {
            m4932j0.m4944w(m4381k(interfaceC1167i));
        } else {
            if (!interfaceC1167i.mo4489j()) {
                throw AbstractC2133b.m7214a("Cannot encode invalid document %s", interfaceC1167i);
            }
            m4932j0.m4947z(m4388r(interfaceC1167i));
        }
        m4932j0.m4945x(interfaceC1167i.mo4483d());
        return (C1296a) m4932j0.m17059n();
    }

    /* renamed from: n */
    public C5414E m4384n(AbstractC1266f abstractC1266f) {
        return this.f3618a.m6665O(abstractC1266f);
    }

    /* renamed from: o */
    public C1300e m4385o(C1267g c1267g) {
        C1300e.b m5014o0 = C1300e.m5014o0();
        m5014o0.m5031y(c1267g.m4847e());
        m5014o0.m5032z(this.f3618a.m6673W(c1267g.m4849g()));
        Iterator it = c1267g.m4846d().iterator();
        while (it.hasNext()) {
            m5014o0.m5029w(this.f3618a.m6665O((AbstractC1266f) it.next()));
        }
        Iterator it2 = c1267g.m4850h().iterator();
        while (it2.hasNext()) {
            m5014o0.m5030x(this.f3618a.m6665O((AbstractC1266f) it2.next()));
        }
        return (C1300e) m5014o0.m17059n();
    }

    /* renamed from: p */
    public final C1297b m4386p(InterfaceC1167i interfaceC1167i) {
        C1297b.b m4954f0 = C1297b.m4954f0();
        m4954f0.m4959w(this.f3618a.m6662L(interfaceC1167i.getKey()));
        m4954f0.m4960x(this.f3618a.m6673W(interfaceC1167i.mo4490k().m4572f()));
        return (C1297b) m4954f0.m17059n();
    }

    /* renamed from: q */
    public C1298c m4387q(C1038O1 c1038o1) {
        EnumC1094l0 enumC1094l0 = EnumC1094l0.LISTEN;
        AbstractC2133b.m7217d(enumC1094l0.equals(c1038o1.m4114c()), "Only queries with purpose %s may be stored, got %s", enumC1094l0, c1038o1.m4114c());
        C1298c.b m4970r0 = C1298c.m4970r0();
        m4970r0.m4991D(c1038o1.m4119h()).m4995z(c1038o1.m4116e()).m4994y(this.f3618a.m6675Y(c1038o1.m4113b())).m4990C(this.f3618a.m6675Y(c1038o1.m4117f())).m4989B(c1038o1.m4115d());
        C0747h0 m4118g = c1038o1.m4118g();
        if (m4118g.m3197s()) {
            m4970r0.m4993x(this.f3618a.m6656F(m4118g));
        } else {
            m4970r0.m4988A(this.f3618a.m6669S(m4118g));
        }
        return (C1298c) m4970r0.m17059n();
    }

    /* renamed from: r */
    public final C1299d m4388r(InterfaceC1167i interfaceC1167i) {
        C1299d.b m5002f0 = C1299d.m5002f0();
        m5002f0.m5007w(this.f3618a.m6662L(interfaceC1167i.getKey()));
        m5002f0.m5008x(this.f3618a.m6673W(interfaceC1167i.mo4490k().m4572f()));
        return (C1299d) m5002f0.m17059n();
    }
}
