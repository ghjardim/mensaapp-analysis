package p253i5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4445k;
import p237g5.C4410K;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.C4459r;
import p237g5.ExecutorC4456p0;
import p253i5.InterfaceC4617l0;
import p253i5.InterfaceC4630s;

/* renamed from: i5.B */
/* loaded from: classes2.dex */
public final class C4547B implements InterfaceC4617l0 {

    /* renamed from: c */
    public final Executor f16270c;

    /* renamed from: d */
    public final ExecutorC4456p0 f16271d;

    /* renamed from: e */
    public Runnable f16272e;

    /* renamed from: f */
    public Runnable f16273f;

    /* renamed from: g */
    public Runnable f16274g;

    /* renamed from: h */
    public InterfaceC4617l0.a f16275h;

    /* renamed from: j */
    public C4448l0 f16277j;

    /* renamed from: k */
    public AbstractC4417S.j f16278k;

    /* renamed from: l */
    public long f16279l;

    /* renamed from: a */
    public final C4410K f16268a = C4410K.m18664a(C4547B.class, null);

    /* renamed from: b */
    public final Object f16269b = new Object();

    /* renamed from: i */
    public Collection f16276i = new LinkedHashSet();

    /* renamed from: i5.B$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4617l0.a f16280a;

        public a(InterfaceC4617l0.a aVar) {
            this.f16280a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16280a.mo19764e(true);
        }
    }

    /* renamed from: i5.B$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4617l0.a f16282a;

        public b(InterfaceC4617l0.a aVar) {
            this.f16282a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16282a.mo19764e(false);
        }
    }

    /* renamed from: i5.B$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4617l0.a f16284a;

        public c(InterfaceC4617l0.a aVar) {
            this.f16284a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16284a.mo19762c();
        }
    }

    /* renamed from: i5.B$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4448l0 f16286a;

        public d(C4448l0 c4448l0) {
            this.f16286a = c4448l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4547B.this.f16275h.mo19763d(this.f16286a);
        }
    }

    /* renamed from: i5.B$e */
    public class e extends C4549C {

        /* renamed from: j */
        public final AbstractC4417S.g f16288j;

        /* renamed from: k */
        public final C4459r f16289k;

        /* renamed from: l */
        public final AbstractC4445k[] f16290l;

        public /* synthetic */ e(C4547B c4547b, AbstractC4417S.g gVar, AbstractC4445k[] abstractC4445kArr, a aVar) {
            this(gVar, abstractC4445kArr);
        }

        /* renamed from: B */
        public final Runnable m19359B(InterfaceC4632t interfaceC4632t) {
            C4459r m19008b = this.f16289k.m19008b();
            try {
                InterfaceC4628r mo19351g = interfaceC4632t.mo19351g(this.f16288j.mo18715c(), this.f16288j.mo18714b(), this.f16288j.mo18713a(), this.f16290l);
                this.f16289k.m19010f(m19008b);
                return m19384x(mo19351g);
            } catch (Throwable th) {
                this.f16289k.m19010f(m19008b);
                throw th;
            }
        }

        @Override // p253i5.C4549C, p253i5.InterfaceC4628r
        /* renamed from: a */
        public void mo19360a(C4448l0 c4448l0) {
            super.mo19360a(c4448l0);
            synchronized (C4547B.this.f16269b) {
                try {
                    if (C4547B.this.f16274g != null) {
                        boolean remove = C4547B.this.f16276i.remove(this);
                        if (!C4547B.this.m19354r() && remove) {
                            C4547B.this.f16271d.m18990b(C4547B.this.f16273f);
                            if (C4547B.this.f16277j != null) {
                                C4547B.this.f16271d.m18990b(C4547B.this.f16274g);
                                C4547B.this.f16274g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C4547B.this.f16271d.m18989a();
        }

        @Override // p253i5.C4549C, p253i5.InterfaceC4628r
        /* renamed from: j */
        public void mo19361j(C4592Y c4592y) {
            if (this.f16288j.mo18713a().m18857j()) {
                c4592y.m19703a("wait_for_ready");
            }
            super.mo19361j(c4592y);
        }

        @Override // p253i5.C4549C
        /* renamed from: v */
        public void mo19362v(C4448l0 c4448l0) {
            for (AbstractC4445k abstractC4445k : this.f16290l) {
                abstractC4445k.mo18988i(c4448l0);
            }
        }

        public e(AbstractC4417S.g gVar, AbstractC4445k[] abstractC4445kArr) {
            this.f16289k = C4459r.m19004e();
            this.f16288j = gVar;
            this.f16290l = abstractC4445kArr;
        }
    }

    public C4547B(Executor executor, ExecutorC4456p0 executorC4456p0) {
        this.f16270c = executor;
        this.f16271d = executorC4456p0;
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: b */
    public final void mo19348b(C4448l0 c4448l0) {
        Collection<e> collection;
        Runnable runnable;
        mo19350f(c4448l0);
        synchronized (this.f16269b) {
            try {
                collection = this.f16276i;
                runnable = this.f16274g;
                this.f16274g = null;
                if (!collection.isEmpty()) {
                    this.f16276i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable m19384x = eVar.m19384x(new C4557G(c4448l0, InterfaceC4630s.a.REFUSED, eVar.f16290l));
                if (m19384x != null) {
                    m19384x.run();
                }
            }
            this.f16271d.execute(runnable);
        }
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: d */
    public final Runnable mo19349d(InterfaceC4617l0.a aVar) {
        this.f16275h = aVar;
        this.f16272e = new a(aVar);
        this.f16273f = new b(aVar);
        this.f16274g = new c(aVar);
        return null;
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: f */
    public final void mo19350f(C4448l0 c4448l0) {
        Runnable runnable;
        synchronized (this.f16269b) {
            try {
                if (this.f16277j != null) {
                    return;
                }
                this.f16277j = c4448l0;
                this.f16271d.m18990b(new d(c4448l0));
                if (!m19354r() && (runnable = this.f16274g) != null) {
                    this.f16271d.m18990b(runnable);
                    this.f16274g = null;
                }
                this.f16271d.m18989a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p253i5.InterfaceC4632t
    /* renamed from: g */
    public final InterfaceC4628r mo19351g(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, AbstractC4445k[] abstractC4445kArr) {
        InterfaceC4628r c4557g;
        try {
            C4639w0 c4639w0 = new C4639w0(c4426a0, c4424z, c4429c);
            AbstractC4417S.j jVar = null;
            long j7 = -1;
            while (true) {
                synchronized (this.f16269b) {
                    if (this.f16277j == null) {
                        AbstractC4417S.j jVar2 = this.f16278k;
                        if (jVar2 != null) {
                            if (jVar != null && j7 == this.f16279l) {
                                c4557g = m19352p(c4639w0, abstractC4445kArr);
                                break;
                            }
                            j7 = this.f16279l;
                            InterfaceC4632t m19605k = AbstractC4580S.m19605k(jVar2.mo18683a(c4639w0), c4429c.m18857j());
                            if (m19605k != null) {
                                c4557g = m19605k.mo19351g(c4639w0.mo18715c(), c4639w0.mo18714b(), c4639w0.mo18713a(), abstractC4445kArr);
                                break;
                            }
                            jVar = jVar2;
                        } else {
                            c4557g = m19352p(c4639w0, abstractC4445kArr);
                            break;
                        }
                    } else {
                        c4557g = new C4557G(this.f16277j, abstractC4445kArr);
                        break;
                    }
                }
            }
            return c4557g;
        } finally {
            this.f16271d.m18989a();
        }
    }

    @Override // p237g5.InterfaceC4415P
    /* renamed from: i */
    public C4410K mo18676i() {
        return this.f16268a;
    }

    /* renamed from: p */
    public final e m19352p(AbstractC4417S.g gVar, AbstractC4445k[] abstractC4445kArr) {
        e eVar = new e(this, gVar, abstractC4445kArr, null);
        this.f16276i.add(eVar);
        if (m19353q() == 1) {
            this.f16271d.m18990b(this.f16272e);
        }
        for (AbstractC4445k abstractC4445k : abstractC4445kArr) {
            abstractC4445k.mo18928j();
        }
        return eVar;
    }

    /* renamed from: q */
    public final int m19353q() {
        int size;
        synchronized (this.f16269b) {
            size = this.f16276i.size();
        }
        return size;
    }

    /* renamed from: r */
    public final boolean m19354r() {
        boolean z6;
        synchronized (this.f16269b) {
            z6 = !this.f16276i.isEmpty();
        }
        return z6;
    }

    /* renamed from: s */
    public final void m19355s(AbstractC4417S.j jVar) {
        Runnable runnable;
        synchronized (this.f16269b) {
            this.f16278k = jVar;
            this.f16279l++;
            if (jVar != null && m19354r()) {
                ArrayList arrayList = new ArrayList(this.f16276i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    AbstractC4417S.f mo18683a = jVar.mo18683a(eVar.f16288j);
                    C4429c mo18713a = eVar.f16288j.mo18713a();
                    InterfaceC4632t m19605k = AbstractC4580S.m19605k(mo18683a, mo18713a.m18857j());
                    if (m19605k != null) {
                        Executor executor = this.f16270c;
                        if (mo18713a.m18852e() != null) {
                            executor = mo18713a.m18852e();
                        }
                        Runnable m19359B = eVar.m19359B(m19605k);
                        if (m19359B != null) {
                            executor.execute(m19359B);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f16269b) {
                    try {
                        if (m19354r()) {
                            this.f16276i.removeAll(arrayList2);
                            if (this.f16276i.isEmpty()) {
                                this.f16276i = new LinkedHashSet();
                            }
                            if (!m19354r()) {
                                this.f16271d.m18990b(this.f16273f);
                                if (this.f16277j != null && (runnable = this.f16274g) != null) {
                                    this.f16271d.m18990b(runnable);
                                    this.f16274g = null;
                                }
                            }
                            this.f16271d.m18989a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
