package p109P3;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p109P3.AbstractC1921c;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p116Q3.C2149r;
import p237g5.AbstractC4437g;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4448l0;

/* renamed from: P3.c */
/* loaded from: classes.dex */
public abstract class AbstractC1921c {

    /* renamed from: n */
    public static final long f5766n;

    /* renamed from: o */
    public static final long f5767o;

    /* renamed from: p */
    public static final long f5768p;

    /* renamed from: q */
    public static final long f5769q;

    /* renamed from: r */
    public static final long f5770r;

    /* renamed from: a */
    public C2138g.b f5771a;

    /* renamed from: b */
    public C2138g.b f5772b;

    /* renamed from: c */
    public final C1946z f5773c;

    /* renamed from: d */
    public final C4426a0 f5774d;

    /* renamed from: f */
    public final C2138g f5776f;

    /* renamed from: g */
    public final C2138g.d f5777g;

    /* renamed from: h */
    public final C2138g.d f5778h;

    /* renamed from: k */
    public AbstractC4437g f5781k;

    /* renamed from: l */
    public final C2149r f5782l;

    /* renamed from: m */
    public final InterfaceC1913W f5783m;

    /* renamed from: i */
    public EnumC1912V f5779i = EnumC1912V.Initial;

    /* renamed from: j */
    public long f5780j = 0;

    /* renamed from: e */
    public final b f5775e = new b();

    /* renamed from: P3.c$a */
    public class a {

        /* renamed from: a */
        public final long f5784a;

        public a(long j7) {
            this.f5784a = j7;
        }

        /* renamed from: a */
        public void m6844a(Runnable runnable) {
            AbstractC1921c.this.f5776f.m7242x();
            if (AbstractC1921c.this.f5780j == this.f5784a) {
                runnable.run();
            } else {
                AbstractC2155x.m7309a(AbstractC1921c.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* renamed from: P3.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1921c.this.m6828j();
        }
    }

    /* renamed from: P3.c$c */
    public class c implements InterfaceC1902K {

        /* renamed from: a */
        public final a f5787a;

        /* renamed from: b */
        public int f5788b = 0;

        public c(a aVar) {
            this.f5787a = aVar;
        }

        @Override // p109P3.InterfaceC1902K
        /* renamed from: a */
        public void mo6618a() {
            this.f5787a.m6844a(new Runnable() { // from class: P3.d
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1921c.c.this.m6852l();
                }
            });
        }

        @Override // p109P3.InterfaceC1902K
        /* renamed from: b */
        public void mo6619b(final C4448l0 c4448l0) {
            this.f5787a.m6844a(new Runnable() { // from class: P3.g
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1921c.c.this.m6849i(c4448l0);
                }
            });
        }

        @Override // p109P3.InterfaceC1902K
        /* renamed from: c */
        public void mo6620c(final C4424Z c4424z) {
            this.f5787a.m6844a(new Runnable() { // from class: P3.f
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1921c.c.this.m6850j(c4424z);
                }
            });
        }

        @Override // p109P3.InterfaceC1902K
        /* renamed from: d */
        public void mo6621d(final Object obj) {
            final int i7 = this.f5788b + 1;
            this.f5787a.m6844a(new Runnable() { // from class: P3.e
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1921c.c.this.m6851k(i7, obj);
                }
            });
            this.f5788b = i7;
        }

        /* renamed from: i */
        public final /* synthetic */ void m6849i(C4448l0 c4448l0) {
            if (c4448l0.m18961o()) {
                AbstractC2155x.m7309a(AbstractC1921c.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractC1921c.this)));
            } else {
                AbstractC2155x.m7313e(AbstractC1921c.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractC1921c.this)), c4448l0);
            }
            AbstractC1921c.this.m6829k(c4448l0);
        }

        /* renamed from: j */
        public final /* synthetic */ void m6850j(C4424Z c4424z) {
            if (AbstractC2155x.m7311c()) {
                HashMap hashMap = new HashMap();
                for (String str : c4424z.m18782j()) {
                    if (C1938r.f5839d.contains(str.toLowerCase(Locale.ENGLISH))) {
                        hashMap.put(str, (String) c4424z.m18779g(C4424Z.g.m18802e(str, C4424Z.f15677e)));
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                AbstractC2155x.m7309a(AbstractC1921c.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractC1921c.this)), hashMap);
            }
        }

        /* renamed from: k */
        public final /* synthetic */ void m6851k(int i7, Object obj) {
            if (AbstractC2155x.m7311c()) {
                AbstractC2155x.m7309a(AbstractC1921c.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(AbstractC1921c.this)), Integer.valueOf(i7), obj);
            }
            if (i7 == 1) {
                AbstractC1921c.this.mo6836r(obj);
            } else {
                AbstractC1921c.this.mo6837s(obj);
            }
        }

        /* renamed from: l */
        public final /* synthetic */ void m6852l() {
            AbstractC2155x.m7309a(AbstractC1921c.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractC1921c.this)));
            AbstractC1921c.this.m6838t();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5766n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f5767o = timeUnit2.toMillis(1L);
        f5768p = timeUnit2.toMillis(1L);
        f5769q = timeUnit.toMillis(10L);
        f5770r = timeUnit.toMillis(10L);
    }

    public AbstractC1921c(C1946z c1946z, C4426a0 c4426a0, C2138g c2138g, C2138g.d dVar, C2138g.d dVar2, C2138g.d dVar3, InterfaceC1913W interfaceC1913W) {
        this.f5773c = c1946z;
        this.f5774d = c4426a0;
        this.f5776f = c2138g;
        this.f5777g = dVar2;
        this.f5778h = dVar3;
        this.f5783m = interfaceC1913W;
        this.f5782l = new C2149r(c2138g, dVar, f5766n, 1.5d, f5767o);
    }

    /* renamed from: g */
    public final void m6825g() {
        C2138g.b bVar = this.f5771a;
        if (bVar != null) {
            bVar.m7245c();
            this.f5771a = null;
        }
    }

    /* renamed from: h */
    public final void m6826h() {
        C2138g.b bVar = this.f5772b;
        if (bVar != null) {
            bVar.m7245c();
            this.f5772b = null;
        }
    }

    /* renamed from: i */
    public final void m6827i(EnumC1912V enumC1912V, C4448l0 c4448l0) {
        AbstractC2133b.m7217d(mo6832n(), "Only started streams should be closed.", new Object[0]);
        EnumC1912V enumC1912V2 = EnumC1912V.Error;
        AbstractC2133b.m7217d(enumC1912V == enumC1912V2 || c4448l0.m18961o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f5776f.m7242x();
        if (C1938r.m6890g(c4448l0)) {
            AbstractC2131I.m7202q(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", c4448l0.m18958l()));
        }
        m6826h();
        m6825g();
        this.f5782l.m7298c();
        this.f5780j++;
        C4448l0.b m18959m = c4448l0.m18959m();
        if (m18959m == C4448l0.b.OK) {
            this.f5782l.m7301f();
        } else if (m18959m == C4448l0.b.RESOURCE_EXHAUSTED) {
            AbstractC2155x.m7309a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f5782l.m7302g();
        } else if (m18959m == C4448l0.b.UNAUTHENTICATED && this.f5779i != EnumC1912V.Healthy) {
            this.f5773c.m6919h();
        } else if (m18959m == C4448l0.b.UNAVAILABLE && ((c4448l0.m18958l() instanceof UnknownHostException) || (c4448l0.m18958l() instanceof ConnectException))) {
            this.f5782l.m7303h(f5770r);
        }
        if (enumC1912V != enumC1912V2) {
            AbstractC2155x.m7309a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            mo6842x();
        }
        if (this.f5781k != null) {
            if (c4448l0.m18961o()) {
                AbstractC2155x.m7309a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f5781k.mo6932b();
            }
            this.f5781k = null;
        }
        this.f5779i = enumC1912V;
        this.f5783m.mo6750b(c4448l0);
    }

    /* renamed from: j */
    public final void m6828j() {
        if (mo6831m()) {
            m6827i(EnumC1912V.Initial, C4448l0.f15795e);
        }
    }

    /* renamed from: k */
    public void m6829k(C4448l0 c4448l0) {
        AbstractC2133b.m7217d(mo6832n(), "Can't handle server close on non-started stream!", new Object[0]);
        m6827i(EnumC1912V.Error, c4448l0);
    }

    /* renamed from: l */
    public void mo6830l() {
        AbstractC2133b.m7217d(!mo6832n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f5776f.m7242x();
        this.f5779i = EnumC1912V.Initial;
        this.f5782l.m7301f();
    }

    /* renamed from: m */
    public boolean mo6831m() {
        this.f5776f.m7242x();
        EnumC1912V enumC1912V = this.f5779i;
        return enumC1912V == EnumC1912V.Open || enumC1912V == EnumC1912V.Healthy;
    }

    /* renamed from: n */
    public boolean mo6832n() {
        this.f5776f.m7242x();
        EnumC1912V enumC1912V = this.f5779i;
        return enumC1912V == EnumC1912V.Starting || enumC1912V == EnumC1912V.Backoff || mo6831m();
    }

    /* renamed from: o */
    public final /* synthetic */ void m6833o() {
        if (mo6831m()) {
            this.f5779i = EnumC1912V.Healthy;
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void m6834p() {
        EnumC1912V enumC1912V = this.f5779i;
        AbstractC2133b.m7217d(enumC1912V == EnumC1912V.Backoff, "State should still be backoff but was %s", enumC1912V);
        this.f5779i = EnumC1912V.Initial;
        mo6840v();
        AbstractC2133b.m7217d(mo6832n(), "Stream should have started", new Object[0]);
    }

    /* renamed from: q */
    public void m6835q() {
        if (mo6831m() && this.f5772b == null) {
            this.f5772b = this.f5776f.m7233k(this.f5777g, f5768p, this.f5775e);
        }
    }

    /* renamed from: r */
    public abstract void mo6836r(Object obj);

    /* renamed from: s */
    public abstract void mo6837s(Object obj);

    /* renamed from: t */
    public final void m6838t() {
        this.f5779i = EnumC1912V.Open;
        this.f5783m.mo6749a();
        if (this.f5771a == null) {
            this.f5771a = this.f5776f.m7233k(this.f5778h, f5769q, new Runnable() { // from class: P3.b
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1921c.this.m6833o();
                }
            });
        }
    }

    /* renamed from: u */
    public final void m6839u() {
        AbstractC2133b.m7217d(this.f5779i == EnumC1912V.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f5779i = EnumC1912V.Backoff;
        this.f5782l.m7297b(new Runnable() { // from class: P3.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1921c.this.m6834p();
            }
        });
    }

    /* renamed from: v */
    public void mo6840v() {
        this.f5776f.m7242x();
        AbstractC2133b.m7217d(this.f5781k == null, "Last call still set", new Object[0]);
        AbstractC2133b.m7217d(this.f5772b == null, "Idle timer still set", new Object[0]);
        EnumC1912V enumC1912V = this.f5779i;
        if (enumC1912V == EnumC1912V.Error) {
            m6839u();
            return;
        }
        AbstractC2133b.m7217d(enumC1912V == EnumC1912V.Initial, "Already started", new Object[0]);
        this.f5781k = this.f5773c.m6924m(this.f5774d, new c(new a(this.f5780j)));
        this.f5779i = EnumC1912V.Starting;
    }

    /* renamed from: w */
    public void mo6841w() {
        if (mo6832n()) {
            m6827i(EnumC1912V.Initial, C4448l0.f15795e);
        }
    }

    /* renamed from: y */
    public void m6843y(Object obj) {
        this.f5776f.m7242x();
        AbstractC2155x.m7309a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), obj);
        m6826h();
        this.f5781k.mo18626d(obj);
    }

    /* renamed from: x */
    public void mo6842x() {
    }
}
