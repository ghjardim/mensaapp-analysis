package p067J3;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C3952f;
import com.google.protobuf.AbstractC4055i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p046G3.C0409W;
import p046G3.C0410X;
import p046G3.C0460x0;
import p053H3.C0564j;
import p060I3.C0642d;
import p060I3.C0643e;
import p060I3.C0644f;
import p060I3.InterfaceC0641c;
import p067J3.C0728W;
import p067J3.C0779x0;
import p067J3.C0783z0;
import p081L3.C1024K;
import p081L3.C1027L;
import p081L3.C1038O1;
import p081L3.C1097m0;
import p081L3.C1099n;
import p081L3.C1103o0;
import p081L3.EnumC1094l0;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1181w;
import p095N3.C1268h;
import p109P3.C1906O;
import p109P3.C1911U;
import p109P3.C1914X;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p116Q3.InterfaceC2153v;
import p237g5.C4448l0;
import p376x3.AbstractC6948c;
import p376x3.C6950e;

/* renamed from: J3.g0 */
/* loaded from: classes.dex */
public class C0745g0 implements C1911U.c {

    /* renamed from: o */
    public static final String f2610o = "g0";

    /* renamed from: a */
    public final C1024K f2611a;

    /* renamed from: b */
    public final C1911U f2612b;

    /* renamed from: e */
    public final int f2615e;

    /* renamed from: m */
    public C0564j f2623m;

    /* renamed from: n */
    public c f2624n;

    /* renamed from: c */
    public final Map f2613c = new HashMap();

    /* renamed from: d */
    public final Map f2614d = new HashMap();

    /* renamed from: f */
    public final LinkedHashSet f2616f = new LinkedHashSet();

    /* renamed from: g */
    public final Map f2617g = new HashMap();

    /* renamed from: h */
    public final Map f2618h = new HashMap();

    /* renamed from: i */
    public final C1103o0 f2619i = new C1103o0();

    /* renamed from: j */
    public final Map f2620j = new HashMap();

    /* renamed from: l */
    public final C0749i0 f2622l = C0749i0.m3204a();

    /* renamed from: k */
    public final Map f2621k = new HashMap();

    /* renamed from: J3.g0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2625a;

        static {
            int[] iArr = new int[C0728W.a.values().length];
            f2625a = iArr;
            try {
                iArr[C0728W.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2625a[C0728W.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: J3.g0$b */
    public static class b {

        /* renamed from: a */
        public final C1170l f2626a;

        /* renamed from: b */
        public boolean f2627b;

        public b(C1170l c1170l) {
            this.f2626a = c1170l;
        }
    }

    /* renamed from: J3.g0$c */
    public interface c {
        /* renamed from: a */
        void mo3173a(EnumC0733a0 enumC0733a0);

        /* renamed from: b */
        void mo3174b(List list);

        /* renamed from: c */
        void mo3175c(C0737c0 c0737c0, C4448l0 c4448l0);
    }

    public C0745g0(C1024K c1024k, C1911U c1911u, C0564j c0564j, int i7) {
        this.f2611a = c1024k;
        this.f2612b = c1911u;
        this.f2615e = i7;
        this.f2623m = c0564j;
    }

    /* renamed from: A */
    public void m3145A(C0737c0 c0737c0) {
        m3151h("stopListeningToRemoteStore");
        C0741e0 c0741e0 = (C0741e0) this.f2613c.get(c0737c0);
        AbstractC2133b.m7217d(c0741e0 != null, "Trying to stop listening to a query not found", new Object[0]);
        int m3143b = c0741e0.m3143b();
        List list = (List) this.f2614d.get(Integer.valueOf(m3143b));
        list.remove(c0737c0);
        if (list.isEmpty()) {
            this.f2612b.m6731S(m3143b);
        }
    }

    /* renamed from: B */
    public final void m3146B(C0728W c0728w) {
        C1170l m3065a = c0728w.m3065a();
        if (this.f2617g.containsKey(m3065a) || this.f2616f.contains(m3065a)) {
            return;
        }
        AbstractC2155x.m7309a(f2610o, "New document in limbo: %s", m3065a);
        this.f2616f.add(m3065a);
        m3162s();
    }

    /* renamed from: C */
    public Task m3147C(C2138g c2138g, C0460x0 c0460x0, InterfaceC2153v interfaceC2153v) {
        return new C0763p0(c2138g, this.f2612b, c0460x0, interfaceC2153v).m3284i();
    }

    /* renamed from: D */
    public final void m3148D(List list, int i7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0728W c0728w = (C0728W) it.next();
            int i8 = a.f2625a[c0728w.m3066b().ordinal()];
            if (i8 == 1) {
                this.f2619i.m4363a(c0728w.m3065a(), i7);
                m3146B(c0728w);
            } else {
                if (i8 != 2) {
                    throw AbstractC2133b.m7214a("Unknown limbo change type: %s", c0728w.m3066b());
                }
                AbstractC2155x.m7309a(f2610o, "Document no longer in limbo: %s", c0728w.m3065a());
                C1170l m3065a = c0728w.m3065a();
                this.f2619i.m4368f(m3065a, i7);
                if (!this.f2619i.m4365c(m3065a)) {
                    m3165v(m3065a);
                }
            }
        }
    }

    /* renamed from: E */
    public void m3149E(List list, TaskCompletionSource taskCompletionSource) {
        m3151h("writeMutations");
        C1099n m4042t0 = this.f2611a.m4042t0(list);
        m3150g(m4042t0.m4346b(), taskCompletionSource);
        m3152i(m4042t0.m4347c(), null);
        this.f2612b.m6742t();
    }

    @Override // p109P3.C1911U.c
    /* renamed from: a */
    public void mo3077a(EnumC0733a0 enumC0733a0) {
        m3151h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2613c.entrySet().iterator();
        while (it.hasNext()) {
            C0781y0 m3316e = ((C0741e0) ((Map.Entry) it.next()).getValue()).m3144c().m3316e(enumC0733a0);
            AbstractC2133b.m7217d(m3316e.m3328a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (m3316e.m3329b() != null) {
                arrayList.add(m3316e.m3329b());
            }
        }
        this.f2624n.mo3174b(arrayList);
        this.f2624n.mo3173a(enumC0733a0);
    }

    @Override // p109P3.C1911U.c
    /* renamed from: b */
    public C6950e mo3078b(int i7) {
        b bVar = (b) this.f2618h.get(Integer.valueOf(i7));
        if (bVar != null && bVar.f2627b) {
            return C1170l.m4496h().m28471e(bVar.f2626a);
        }
        C6950e m4496h = C1170l.m4496h();
        if (this.f2614d.containsKey(Integer.valueOf(i7))) {
            for (C0737c0 c0737c0 : (List) this.f2614d.get(Integer.valueOf(i7))) {
                if (this.f2613c.containsKey(c0737c0)) {
                    m4496h = m4496h.m28474h(((C0741e0) this.f2613c.get(c0737c0)).m3144c().m3321k());
                }
            }
        }
        return m4496h;
    }

    @Override // p109P3.C1911U.c
    /* renamed from: c */
    public void mo3079c(C1268h c1268h) {
        m3151h("handleSuccessfulWrite");
        m3161r(c1268h.m4852b().m4847e(), null);
        m3166w(c1268h.m4852b().m4847e());
        m3152i(this.f2611a.m4043v(c1268h), null);
    }

    @Override // p109P3.C1911U.c
    /* renamed from: d */
    public void mo3080d(C1906O c1906o) {
        m3151h("handleRemoteEvent");
        for (Map.Entry entry : c1906o.m6646d().entrySet()) {
            Integer num = (Integer) entry.getKey();
            C1914X c1914x = (C1914X) entry.getValue();
            b bVar = (b) this.f2618h.get(num);
            if (bVar != null) {
                AbstractC2133b.m7217d((c1914x.m6756b().size() + c1914x.m6757c().size()) + c1914x.m6758d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (c1914x.m6756b().size() > 0) {
                    bVar.f2627b = true;
                } else if (c1914x.m6757c().size() > 0) {
                    AbstractC2133b.m7217d(bVar.f2627b, "Received change for limbo target document without add.", new Object[0]);
                } else if (c1914x.m6758d().size() > 0) {
                    AbstractC2133b.m7217d(bVar.f2627b, "Received remove for limbo target document without add.", new Object[0]);
                    bVar.f2627b = false;
                }
            }
        }
        m3152i(this.f2611a.m4045x(c1906o), c1906o);
    }

    @Override // p109P3.C1911U.c
    /* renamed from: e */
    public void mo3081e(int i7, C4448l0 c4448l0) {
        m3151h("handleRejectedWrite");
        AbstractC6948c m4035l0 = this.f2611a.m4035l0(i7);
        if (!m4035l0.isEmpty()) {
            m3160q(c4448l0, "Write failed at %s", ((C1170l) m4035l0.mo28454g()).m4505o());
        }
        m3161r(i7, c4448l0);
        m3166w(i7);
        m3152i(m4035l0, null);
    }

    @Override // p109P3.C1911U.c
    /* renamed from: f */
    public void mo3082f(int i7, C4448l0 c4448l0) {
        m3151h("handleRejectedListen");
        b bVar = (b) this.f2618h.get(Integer.valueOf(i7));
        C1170l c1170l = bVar != null ? bVar.f2626a : null;
        if (c1170l == null) {
            this.f2611a.m4036m0(i7);
            m3164u(i7, c4448l0);
            return;
        }
        this.f2617g.remove(c1170l);
        this.f2618h.remove(Integer.valueOf(i7));
        m3162s();
        C1181w c1181w = C1181w.f3793b;
        mo3080d(new C1906O(c1181w, Collections.emptyMap(), Collections.emptyMap(), Collections.singletonMap(c1170l, C1177s.m4540r(c1170l, c1181w)), Collections.singleton(c1170l)));
    }

    /* renamed from: g */
    public final void m3150g(int i7, TaskCompletionSource taskCompletionSource) {
        Map map = (Map) this.f2620j.get(this.f2623m);
        if (map == null) {
            map = new HashMap();
            this.f2620j.put(this.f2623m, map);
        }
        map.put(Integer.valueOf(i7), taskCompletionSource);
    }

    /* renamed from: h */
    public final void m3151h(String str) {
        AbstractC2133b.m7217d(this.f2624n != null, "Trying to call %s before setting callback", str);
    }

    /* renamed from: i */
    public final void m3152i(AbstractC6948c abstractC6948c, C1906O c1906o) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f2613c.entrySet().iterator();
        while (it.hasNext()) {
            C0741e0 c0741e0 = (C0741e0) ((Map.Entry) it.next()).getValue();
            C0779x0 m3144c = c0741e0.m3144c();
            C0779x0.b m3318h = m3144c.m3318h(abstractC6948c);
            boolean z6 = false;
            if (m3318h.m3327b()) {
                m3318h = m3144c.m3319i(this.f2611a.m4001C(c0741e0.m3142a(), false).m4343a(), m3318h);
            }
            C1914X c1914x = c1906o == null ? null : (C1914X) c1906o.m6646d().get(Integer.valueOf(c0741e0.m3143b()));
            if (c1906o != null && c1906o.m6647e().get(Integer.valueOf(c0741e0.m3143b())) != null) {
                z6 = true;
            }
            C0781y0 m3315d = c0741e0.m3144c().m3315d(m3318h, c1914x, z6);
            m3148D(m3315d.m3328a(), c0741e0.m3143b());
            if (m3315d.m3329b() != null) {
                arrayList.add(m3315d.m3329b());
                arrayList2.add(C1027L.m4050a(c0741e0.m3143b(), m3315d.m3329b()));
            }
        }
        this.f2624n.mo3174b(arrayList);
        this.f2611a.m4032i0(arrayList2);
    }

    /* renamed from: j */
    public final boolean m3153j(C4448l0 c4448l0) {
        C4448l0.b m18959m = c4448l0.m18959m();
        return (m18959m == C4448l0.b.FAILED_PRECONDITION && (c4448l0.m18960n() != null ? c4448l0.m18960n() : StringUtils.EMPTY).contains("requires an index")) || m18959m == C4448l0.b.PERMISSION_DENIED;
    }

    /* renamed from: k */
    public final void m3154k() {
        Iterator it = this.f2621k.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
            while (it2.hasNext()) {
                ((TaskCompletionSource) it2.next()).setException(new C3952f("'waitForPendingWrites' task is cancelled due to User change.", C3952f.a.CANCELLED));
            }
        }
        this.f2621k.clear();
    }

    /* renamed from: l */
    public void m3155l(C0564j c0564j) {
        boolean equals = this.f2623m.equals(c0564j);
        this.f2623m = c0564j;
        if (!equals) {
            m3154k();
            m3152i(this.f2611a.m4011M(c0564j), null);
        }
        this.f2612b.m6743u();
    }

    /* renamed from: m */
    public final C0783z0 m3156m(C0737c0 c0737c0, int i7, AbstractC4055i abstractC4055i) {
        C1097m0 m4001C = this.f2611a.m4001C(c0737c0, true);
        C0783z0.a aVar = C0783z0.a.NONE;
        if (this.f2614d.get(Integer.valueOf(i7)) != null) {
            aVar = ((C0741e0) this.f2613c.get((C0737c0) ((List) this.f2614d.get(Integer.valueOf(i7))).get(0))).m3144c().m3320j();
        }
        C1914X m6755a = C1914X.m6755a(aVar == C0783z0.a.SYNCED, abstractC4055i);
        C0779x0 c0779x0 = new C0779x0(c0737c0, m4001C.m4344b());
        C0781y0 m3314c = c0779x0.m3314c(c0779x0.m3318h(m4001C.m4343a()), m6755a);
        m3148D(m3314c.m3328a(), i7);
        this.f2613c.put(c0737c0, new C0741e0(c0737c0, i7, c0779x0));
        if (!this.f2614d.containsKey(Integer.valueOf(i7))) {
            this.f2614d.put(Integer.valueOf(i7), new ArrayList(1));
        }
        ((List) this.f2614d.get(Integer.valueOf(i7))).add(c0737c0);
        return m3314c.m3329b();
    }

    /* renamed from: n */
    public int m3157n(C0737c0 c0737c0, boolean z6) {
        m3151h("listen");
        AbstractC2133b.m7217d(!this.f2613c.containsKey(c0737c0), "We already listen to query: %s", c0737c0);
        C1038O1 m4044w = this.f2611a.m4044w(c0737c0.m3094D());
        this.f2624n.mo3174b(Collections.singletonList(m3156m(c0737c0, m4044w.m4119h(), m4044w.m4115d())));
        if (z6) {
            this.f2612b.m6718F(m4044w);
        }
        return m4044w.m4119h();
    }

    /* renamed from: o */
    public void m3158o(C0737c0 c0737c0) {
        m3151h("listenToRemoteStore");
        AbstractC2133b.m7217d(this.f2613c.containsKey(c0737c0), "This is the first listen to query: %s", c0737c0);
        this.f2612b.m6718F(this.f2611a.m4044w(c0737c0.m3094D()));
    }

    /* renamed from: p */
    public void m3159p(C0644f c0644f, C0409W c0409w) {
        try {
            try {
                C0643e m2560d = c0644f.m2560d();
                if (this.f2611a.m4012N(m2560d)) {
                    c0409w.m1607e(C0410X.m1613b(m2560d));
                    try {
                        c0644f.m2558b();
                        return;
                    } catch (IOException e7) {
                        AbstractC2155x.m7313e("SyncEngine", "Exception while closing bundle", e7);
                        return;
                    }
                }
                c0409w.m1608f(C0410X.m1612a(m2560d));
                C0642d c0642d = new C0642d(this.f2611a, m2560d);
                long j7 = 0;
                while (true) {
                    InterfaceC0641c m2562f = c0644f.m2562f();
                    if (m2562f == null) {
                        m3152i(c0642d.m2550b(), null);
                        this.f2611a.mo2545b(m2560d);
                        c0409w.m1607e(C0410X.m1613b(m2560d));
                        try {
                            c0644f.m2558b();
                            return;
                        } catch (IOException e8) {
                            AbstractC2155x.m7313e("SyncEngine", "Exception while closing bundle", e8);
                            return;
                        }
                    }
                    long m2561e = c0644f.m2561e();
                    C0410X m2549a = c0642d.m2549a(m2562f, m2561e - j7);
                    if (m2549a != null) {
                        c0409w.m1608f(m2549a);
                    }
                    j7 = m2561e;
                }
            } catch (Exception e9) {
                AbstractC2155x.m7313e("Firestore", "Loading bundle failed : %s", e9);
                c0409w.m1606d(new C3952f("Bundle failed to load", C3952f.a.INVALID_ARGUMENT, e9));
                try {
                    c0644f.m2558b();
                } catch (IOException e10) {
                    AbstractC2155x.m7313e("SyncEngine", "Exception while closing bundle", e10);
                }
            }
        } catch (Throwable th) {
            try {
                c0644f.m2558b();
            } catch (IOException e11) {
                AbstractC2155x.m7313e("SyncEngine", "Exception while closing bundle", e11);
            }
            throw th;
        }
    }

    /* renamed from: q */
    public final void m3160q(C4448l0 c4448l0, String str, Object... objArr) {
        if (m3153j(c4448l0)) {
            AbstractC2155x.m7313e("Firestore", "%s: %s", String.format(str, objArr), c4448l0);
        }
    }

    /* renamed from: r */
    public final void m3161r(int i7, C4448l0 c4448l0) {
        Map map = (Map) this.f2620j.get(this.f2623m);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i7);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(valueOf);
            if (taskCompletionSource != null) {
                if (c4448l0 != null) {
                    taskCompletionSource.setException(AbstractC2131I.m7206u(c4448l0));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(valueOf);
            }
        }
    }

    /* renamed from: s */
    public final void m3162s() {
        while (!this.f2616f.isEmpty() && this.f2617g.size() < this.f2615e) {
            Iterator it = this.f2616f.iterator();
            C1170l c1170l = (C1170l) it.next();
            it.remove();
            int m3206c = this.f2622l.m3206c();
            this.f2618h.put(Integer.valueOf(m3206c), new b(c1170l));
            this.f2617g.put(c1170l, Integer.valueOf(m3206c));
            this.f2612b.m6718F(new C1038O1(C0737c0.m3090b(c1170l.m4505o()).m3094D(), m3206c, -1L, EnumC1094l0.LIMBO_RESOLUTION));
        }
    }

    /* renamed from: t */
    public void m3163t(TaskCompletionSource taskCompletionSource) {
        if (!this.f2612b.m6736n()) {
            AbstractC2155x.m7309a(f2610o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int m4002D = this.f2611a.m4002D();
        if (m4002D == -1) {
            taskCompletionSource.setResult(null);
            return;
        }
        if (!this.f2621k.containsKey(Integer.valueOf(m4002D))) {
            this.f2621k.put(Integer.valueOf(m4002D), new ArrayList());
        }
        ((List) this.f2621k.get(Integer.valueOf(m4002D))).add(taskCompletionSource);
    }

    /* renamed from: u */
    public final void m3164u(int i7, C4448l0 c4448l0) {
        for (C0737c0 c0737c0 : (List) this.f2614d.get(Integer.valueOf(i7))) {
            this.f2613c.remove(c0737c0);
            if (!c4448l0.m18961o()) {
                this.f2624n.mo3175c(c0737c0, c4448l0);
                m3160q(c4448l0, "Listen for %s failed", c0737c0);
            }
        }
        this.f2614d.remove(Integer.valueOf(i7));
        C6950e m4366d = this.f2619i.m4366d(i7);
        this.f2619i.m4370h(i7);
        Iterator it = m4366d.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            if (!this.f2619i.m4365c(c1170l)) {
                m3165v(c1170l);
            }
        }
    }

    /* renamed from: v */
    public final void m3165v(C1170l c1170l) {
        this.f2616f.remove(c1170l);
        Integer num = (Integer) this.f2617g.get(c1170l);
        if (num != null) {
            this.f2612b.m6731S(num.intValue());
            this.f2617g.remove(c1170l);
            this.f2618h.remove(num);
            m3162s();
        }
    }

    /* renamed from: w */
    public final void m3166w(int i7) {
        if (this.f2621k.containsKey(Integer.valueOf(i7))) {
            Iterator it = ((List) this.f2621k.get(Integer.valueOf(i7))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            this.f2621k.remove(Integer.valueOf(i7));
        }
    }

    /* renamed from: x */
    public Task m3167x(C0737c0 c0737c0, List list) {
        return this.f2612b.m6722J(c0737c0, list);
    }

    /* renamed from: y */
    public void m3168y(c cVar) {
        this.f2624n = cVar;
    }

    /* renamed from: z */
    public void m3169z(C0737c0 c0737c0, boolean z6) {
        m3151h("stopListening");
        C0741e0 c0741e0 = (C0741e0) this.f2613c.get(c0737c0);
        AbstractC2133b.m7217d(c0741e0 != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f2613c.remove(c0737c0);
        int m3143b = c0741e0.m3143b();
        List list = (List) this.f2614d.get(Integer.valueOf(m3143b));
        list.remove(c0737c0);
        if (list.isEmpty()) {
            this.f2611a.m4036m0(m3143b);
            if (z6) {
                this.f2612b.m6731S(m3143b);
            }
            m3164u(m3143b, C4448l0.f15795e);
        }
    }
}
