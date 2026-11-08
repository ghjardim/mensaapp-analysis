package p109P3;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3952f;
import com.google.protobuf.AbstractC4055i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p067J3.C0737c0;
import p067J3.C0755l0;
import p067J3.EnumC0733a0;
import p081L3.C1024K;
import p081L3.C1038O1;
import p081L3.EnumC1094l0;
import p088M3.C1164f;
import p088M3.C1181w;
import p095N3.C1267g;
import p095N3.C1268h;
import p109P3.AbstractC1918a0;
import p109P3.C1904M;
import p109P3.C1911U;
import p109P3.C1920b0;
import p109P3.C1922c0;
import p109P3.C1924d0;
import p109P3.InterfaceC1935o;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p116Q3.InterfaceC2145n;
import p237g5.C4448l0;
import p256j$.util.Objects;
import p376x3.C6950e;

/* renamed from: P3.U */
/* loaded from: classes.dex */
public final class C1911U implements C1920b0.c {

    /* renamed from: a */
    public final C1164f f5703a;

    /* renamed from: b */
    public final c f5704b;

    /* renamed from: c */
    public final C1024K f5705c;

    /* renamed from: d */
    public final C1938r f5706d;

    /* renamed from: e */
    public final InterfaceC1935o f5707e;

    /* renamed from: g */
    public final C1904M f5709g;

    /* renamed from: i */
    public final C1922c0 f5711i;

    /* renamed from: j */
    public final C1924d0 f5712j;

    /* renamed from: k */
    public C1920b0 f5713k;

    /* renamed from: h */
    public boolean f5710h = false;

    /* renamed from: f */
    public final Map f5708f = new HashMap();

    /* renamed from: l */
    public final Deque f5714l = new ArrayDeque();

    /* renamed from: P3.U$a */
    public class a implements C1922c0.a {
        public a() {
        }

        @Override // p109P3.InterfaceC1913W
        /* renamed from: a */
        public void mo6749a() {
            C1911U.this.m6746x();
        }

        @Override // p109P3.InterfaceC1913W
        /* renamed from: b */
        public void mo6750b(C4448l0 c4448l0) {
            C1911U.this.m6745w(c4448l0);
        }

        @Override // p109P3.C1922c0.a
        /* renamed from: c */
        public void mo6751c(C1181w c1181w, AbstractC1918a0 abstractC1918a0) {
            C1911U.this.m6744v(c1181w, abstractC1918a0);
        }
    }

    /* renamed from: P3.U$b */
    public class b implements C1924d0.a {
        public b() {
        }

        @Override // p109P3.InterfaceC1913W
        /* renamed from: a */
        public void mo6749a() {
            C1911U.this.f5712j.m6861E();
        }

        @Override // p109P3.InterfaceC1913W
        /* renamed from: b */
        public void mo6750b(C4448l0 c4448l0) {
            C1911U.this.m6713A(c4448l0);
        }

        @Override // p109P3.C1924d0.a
        /* renamed from: d */
        public void mo6752d(C1181w c1181w, List list) {
            C1911U.this.m6715C(c1181w, list);
        }

        @Override // p109P3.C1924d0.a
        /* renamed from: e */
        public void mo6753e() {
            C1911U.this.m6714B();
        }
    }

    /* renamed from: P3.U$c */
    public interface c {
        /* renamed from: a */
        void mo3077a(EnumC0733a0 enumC0733a0);

        /* renamed from: b */
        C6950e mo3078b(int i7);

        /* renamed from: c */
        void mo3079c(C1268h c1268h);

        /* renamed from: d */
        void mo3080d(C1906O c1906o);

        /* renamed from: e */
        void mo3081e(int i7, C4448l0 c4448l0);

        /* renamed from: f */
        void mo3082f(int i7, C4448l0 c4448l0);
    }

    public C1911U(C1164f c1164f, final c cVar, C1024K c1024k, C1938r c1938r, final C2138g c2138g, InterfaceC1935o interfaceC1935o) {
        this.f5703a = c1164f;
        this.f5704b = cVar;
        this.f5705c = c1024k;
        this.f5706d = c1938r;
        this.f5707e = interfaceC1935o;
        Objects.requireNonNull(cVar);
        this.f5709g = new C1904M(c2138g, new C1904M.a() { // from class: P3.Q
            @Override // p109P3.C1904M.a
            /* renamed from: a */
            public final void mo6631a(EnumC0733a0 enumC0733a0) {
                C1911U.c.this.mo3077a(enumC0733a0);
            }
        });
        this.f5711i = c1938r.m6895e(new a());
        this.f5712j = c1938r.m6896f(new b());
        interfaceC1935o.mo6869a(new InterfaceC2145n() { // from class: P3.S
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1911U.this.m6717E(c2138g, (InterfaceC1935o.a) obj);
            }
        });
    }

    /* renamed from: A */
    public final void m6713A(C4448l0 c4448l0) {
        if (c4448l0.m18961o()) {
            AbstractC2133b.m7217d(!m6726N(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!c4448l0.m18961o() && !this.f5714l.isEmpty()) {
            if (this.f5712j.m6857A()) {
                m6747y(c4448l0);
            } else {
                m6748z(c4448l0);
            }
        }
        if (m6726N()) {
            m6730R();
        }
    }

    /* renamed from: B */
    public final void m6714B() {
        this.f5705c.m4038o0(this.f5712j.m6863z());
        Iterator it = this.f5714l.iterator();
        while (it.hasNext()) {
            this.f5712j.m6862F(((C1267g) it.next()).m4850h());
        }
    }

    /* renamed from: C */
    public final void m6715C(C1181w c1181w, List list) {
        this.f5704b.mo3079c(C1268h.m4851a((C1267g) this.f5714l.poll(), c1181w, list, this.f5712j.m6863z()));
        m6742t();
    }

    /* renamed from: D */
    public final /* synthetic */ void m6716D(InterfaceC1935o.a aVar) {
        if (aVar.equals(InterfaceC1935o.a.REACHABLE) && this.f5709g.m6624c().equals(EnumC0733a0.ONLINE)) {
            return;
        }
        if (!(aVar.equals(InterfaceC1935o.a.UNREACHABLE) && this.f5709g.m6624c().equals(EnumC0733a0.OFFLINE)) && m6736n()) {
            AbstractC2155x.m7309a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            m6721I();
        }
    }

    /* renamed from: E */
    public final /* synthetic */ void m6717E(C2138g c2138g, final InterfaceC1935o.a aVar) {
        c2138g.m7234l(new Runnable() { // from class: P3.T
            @Override // java.lang.Runnable
            public final void run() {
                C1911U.this.m6716D(aVar);
            }
        });
    }

    /* renamed from: F */
    public void m6718F(C1038O1 c1038o1) {
        Integer valueOf = Integer.valueOf(c1038o1.m4119h());
        if (this.f5708f.containsKey(valueOf)) {
            return;
        }
        this.f5708f.put(valueOf, c1038o1);
        if (m6725M()) {
            m6729Q();
        } else if (this.f5711i.mo6831m()) {
            m6724L(c1038o1);
        }
    }

    /* renamed from: G */
    public final void m6719G(AbstractC1918a0.d dVar) {
        AbstractC2133b.m7217d(dVar.m6794a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer num : dVar.m6797d()) {
            if (this.f5708f.containsKey(num)) {
                this.f5708f.remove(num);
                this.f5713k.m6815q(num.intValue());
                this.f5704b.mo3082f(num.intValue(), dVar.m6794a());
            }
        }
    }

    /* renamed from: H */
    public final void m6720H(C1181w c1181w) {
        AbstractC2133b.m7217d(!c1181w.equals(C1181w.f3793b), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        C1906O m6801c = this.f5713k.m6801c(c1181w);
        for (Map.Entry entry : m6801c.m6646d().entrySet()) {
            C1914X c1914x = (C1914X) entry.getValue();
            if (!c1914x.m6759e().isEmpty()) {
                Integer num = (Integer) entry.getKey();
                num.intValue();
                C1038O1 c1038o1 = (C1038O1) this.f5708f.get(num);
                if (c1038o1 != null) {
                    this.f5708f.put(num, c1038o1.m4122k(c1914x.m6759e(), c1181w));
                }
            }
        }
        for (Map.Entry entry2 : m6801c.m6647e().entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            int intValue = num2.intValue();
            C1038O1 c1038o12 = (C1038O1) this.f5708f.get(num2);
            if (c1038o12 != null) {
                this.f5708f.put(num2, c1038o12.m4122k(AbstractC4055i.f13379b, c1038o12.m4117f()));
                m6723K(intValue);
                m6724L(new C1038O1(c1038o12.m4118g(), intValue, c1038o12.m4116e(), (EnumC1094l0) entry2.getValue()));
            }
        }
        this.f5704b.mo3080d(m6801c);
    }

    /* renamed from: I */
    public final void m6721I() {
        this.f5710h = false;
        m6740r();
        this.f5709g.m6630i(EnumC0733a0.UNKNOWN);
        this.f5712j.mo6830l();
        this.f5711i.mo6830l();
        m6741s();
    }

    /* renamed from: J */
    public Task m6722J(C0737c0 c0737c0, List list) {
        return m6736n() ? this.f5706d.m6900n(c0737c0, list) : Tasks.forException(new C3952f("Failed to get result from server.", C3952f.a.UNAVAILABLE));
    }

    /* renamed from: K */
    public final void m6723K(int i7) {
        this.f5713k.m6813o(i7);
        this.f5711i.m6854B(i7);
    }

    /* renamed from: L */
    public final void m6724L(C1038O1 c1038o1) {
        this.f5713k.m6813o(c1038o1.m4119h());
        if (!c1038o1.m4115d().isEmpty() || c1038o1.m4117f().compareTo(C1181w.f3793b) > 0) {
            c1038o1 = c1038o1.m4120i(Integer.valueOf(mo6733b(c1038o1.m4119h()).size()));
        }
        this.f5711i.m6855C(c1038o1);
    }

    /* renamed from: M */
    public final boolean m6725M() {
        return (!m6736n() || this.f5711i.mo6832n() || this.f5708f.isEmpty()) ? false : true;
    }

    /* renamed from: N */
    public final boolean m6726N() {
        return (!m6736n() || this.f5712j.mo6832n() || this.f5714l.isEmpty()) ? false : true;
    }

    /* renamed from: O */
    public void m6727O() {
        AbstractC2155x.m7309a("RemoteStore", "Shutting down", new Object[0]);
        this.f5707e.shutdown();
        this.f5710h = false;
        m6740r();
        this.f5706d.m6901o();
        this.f5709g.m6630i(EnumC0733a0.UNKNOWN);
    }

    /* renamed from: P */
    public void m6728P() {
        m6741s();
    }

    /* renamed from: Q */
    public final void m6729Q() {
        AbstractC2133b.m7217d(m6725M(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f5713k = new C1920b0(this.f5703a, this);
        this.f5711i.mo6840v();
        this.f5709g.m6626e();
    }

    /* renamed from: R */
    public final void m6730R() {
        AbstractC2133b.m7217d(m6726N(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f5712j.mo6840v();
    }

    /* renamed from: S */
    public void m6731S(int i7) {
        AbstractC2133b.m7217d(((C1038O1) this.f5708f.remove(Integer.valueOf(i7))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i7));
        if (this.f5711i.mo6831m()) {
            m6723K(i7);
        }
        if (this.f5708f.isEmpty()) {
            if (this.f5711i.mo6831m()) {
                this.f5711i.m6835q();
            } else if (m6736n()) {
                this.f5709g.m6630i(EnumC0733a0.UNKNOWN);
            }
        }
    }

    @Override // p109P3.C1920b0.c
    /* renamed from: a */
    public C1038O1 mo6732a(int i7) {
        return (C1038O1) this.f5708f.get(Integer.valueOf(i7));
    }

    @Override // p109P3.C1920b0.c
    /* renamed from: b */
    public C6950e mo6733b(int i7) {
        return this.f5704b.mo3078b(i7);
    }

    /* renamed from: l */
    public final void m6734l(C1267g c1267g) {
        AbstractC2133b.m7217d(m6735m(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f5714l.add(c1267g);
        if (this.f5712j.mo6831m() && this.f5712j.m6857A()) {
            this.f5712j.m6862F(c1267g.m4850h());
        }
    }

    /* renamed from: m */
    public final boolean m6735m() {
        return m6736n() && this.f5714l.size() < 10;
    }

    /* renamed from: n */
    public boolean m6736n() {
        return this.f5710h;
    }

    /* renamed from: o */
    public final void m6737o() {
        this.f5713k = null;
    }

    /* renamed from: p */
    public C0755l0 m6738p() {
        return new C0755l0(this.f5706d);
    }

    /* renamed from: q */
    public void m6739q() {
        this.f5710h = false;
        m6740r();
        this.f5709g.m6630i(EnumC0733a0.OFFLINE);
    }

    /* renamed from: r */
    public final void m6740r() {
        this.f5711i.mo6841w();
        this.f5712j.mo6841w();
        if (!this.f5714l.isEmpty()) {
            AbstractC2155x.m7309a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f5714l.size()));
            this.f5714l.clear();
        }
        m6737o();
    }

    /* renamed from: s */
    public void m6741s() {
        this.f5710h = true;
        if (m6736n()) {
            this.f5712j.m6860D(this.f5705c.m4006H());
            if (m6725M()) {
                m6729Q();
            } else {
                this.f5709g.m6630i(EnumC0733a0.UNKNOWN);
            }
            m6742t();
        }
    }

    /* renamed from: t */
    public void m6742t() {
        int m4847e = this.f5714l.isEmpty() ? -1 : ((C1267g) this.f5714l.getLast()).m4847e();
        while (true) {
            if (!m6735m()) {
                break;
            }
            C1267g m4009K = this.f5705c.m4009K(m4847e);
            if (m4009K != null) {
                m6734l(m4009K);
                m4847e = m4009K.m4847e();
            } else if (this.f5714l.size() == 0) {
                this.f5712j.m6835q();
            }
        }
        if (m6726N()) {
            m6730R();
        }
    }

    /* renamed from: u */
    public void m6743u() {
        if (m6736n()) {
            AbstractC2155x.m7309a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            m6721I();
        }
    }

    /* renamed from: v */
    public final void m6744v(C1181w c1181w, AbstractC1918a0 abstractC1918a0) {
        this.f5709g.m6630i(EnumC0733a0.ONLINE);
        AbstractC2133b.m7217d((this.f5711i == null || this.f5713k == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z6 = abstractC1918a0 instanceof AbstractC1918a0.d;
        AbstractC1918a0.d dVar = z6 ? (AbstractC1918a0.d) abstractC1918a0 : null;
        if (dVar != null && dVar.m6795b().equals(AbstractC1918a0.e.Removed) && dVar.m6794a() != null) {
            m6719G(dVar);
            return;
        }
        if (abstractC1918a0 instanceof AbstractC1918a0.b) {
            this.f5713k.m6807i((AbstractC1918a0.b) abstractC1918a0);
        } else if (abstractC1918a0 instanceof AbstractC1918a0.c) {
            this.f5713k.m6808j((AbstractC1918a0.c) abstractC1918a0);
        } else {
            AbstractC2133b.m7217d(z6, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.f5713k.m6809k((AbstractC1918a0.d) abstractC1918a0);
        }
        if (c1181w.equals(C1181w.f3793b) || c1181w.compareTo(this.f5705c.m4005G()) < 0) {
            return;
        }
        m6720H(c1181w);
    }

    /* renamed from: w */
    public final void m6745w(C4448l0 c4448l0) {
        if (c4448l0.m18961o()) {
            AbstractC2133b.m7217d(!m6725M(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        m6737o();
        if (!m6725M()) {
            this.f5709g.m6630i(EnumC0733a0.UNKNOWN);
        } else {
            this.f5709g.m6625d(c4448l0);
            m6729Q();
        }
    }

    /* renamed from: x */
    public final void m6746x() {
        Iterator it = this.f5708f.values().iterator();
        while (it.hasNext()) {
            m6724L((C1038O1) it.next());
        }
    }

    /* renamed from: y */
    public final void m6747y(C4448l0 c4448l0) {
        AbstractC2133b.m7217d(!c4448l0.m18961o(), "Handling write error with status OK.", new Object[0]);
        if (C1938r.m6893j(c4448l0)) {
            C1267g c1267g = (C1267g) this.f5714l.poll();
            this.f5712j.mo6830l();
            this.f5704b.mo3081e(c1267g.m4847e(), c4448l0);
            m6742t();
        }
    }

    /* renamed from: z */
    public final void m6748z(C4448l0 c4448l0) {
        AbstractC2133b.m7217d(!c4448l0.m18961o(), "Handling write error with status OK.", new Object[0]);
        if (C1938r.m6892i(c4448l0)) {
            AbstractC2155x.m7309a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", AbstractC2131I.m7183C(this.f5712j.m6863z()), c4448l0);
            C1924d0 c1924d0 = this.f5712j;
            AbstractC4055i abstractC4055i = C1924d0.f5793v;
            c1924d0.m6860D(abstractC4055i);
            this.f5705c.m4038o0(abstractC4055i);
        }
    }
}
