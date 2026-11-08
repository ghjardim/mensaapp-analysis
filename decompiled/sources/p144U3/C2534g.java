package p144U3;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p137T3.InterfaceC2447b;
import p144U3.C2536i;
import p151V3.AbstractC2626d;
import p151V3.C2624b;
import p151V3.C2625c;
import p158W3.AbstractC2704d;
import p158W3.AbstractC2706f;
import p158W3.C2703c;
import p207d.AbstractC4094d;
import p219e3.C4176f;
import p362v3.C6776x;

/* renamed from: U3.g */
/* loaded from: classes.dex */
public class C2534g implements InterfaceC2535h {

    /* renamed from: m */
    public static final Object f7387m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f7388n = new a();

    /* renamed from: a */
    public final C4176f f7389a;

    /* renamed from: b */
    public final C2703c f7390b;

    /* renamed from: c */
    public final C2625c f7391c;

    /* renamed from: d */
    public final C2543p f7392d;

    /* renamed from: e */
    public final C6776x f7393e;

    /* renamed from: f */
    public final C2541n f7394f;

    /* renamed from: g */
    public final Object f7395g;

    /* renamed from: h */
    public final ExecutorService f7396h;

    /* renamed from: i */
    public final Executor f7397i;

    /* renamed from: j */
    public String f7398j;

    /* renamed from: k */
    public Set f7399k;

    /* renamed from: l */
    public final List f7400l;

    /* renamed from: U3.g$a */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f7401a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f7401a.getAndIncrement())));
        }
    }

    /* renamed from: U3.g$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7402a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7403b;

        static {
            int[] iArr = new int[AbstractC2706f.b.values().length];
            f7403b = iArr;
            try {
                iArr[AbstractC2706f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7403b[AbstractC2706f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7403b[AbstractC2706f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC2704d.b.values().length];
            f7402a = iArr2;
            try {
                iArr2[AbstractC2704d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7402a[AbstractC2704d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2534g(final C4176f c4176f, InterfaceC2447b interfaceC2447b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c4176f, new C2703c(c4176f.m17532m(), interfaceC2447b), new C2625c(c4176f), C2543p.m8524c(), new C6776x(new InterfaceC2447b() { // from class: U3.c
            @Override // p137T3.InterfaceC2447b
            public final Object get() {
                C2624b m8490z;
                m8490z = C2534g.m8490z(C4176f.this);
                return m8490z;
            }
        }), new C2541n());
    }

    /* renamed from: q */
    public static C2534g m8488q() {
        return m8489r(C4176f.m17517o());
    }

    /* renamed from: r */
    public static C2534g m8489r(C4176f c4176f) {
        AbstractC3802r.m15120b(c4176f != null, "Null is not a valid value of FirebaseApp.");
        return (C2534g) c4176f.m17531k(InterfaceC2535h.class);
    }

    /* renamed from: z */
    public static /* synthetic */ C2624b m8490z(C4176f c4176f) {
        return new C2624b(c4176f);
    }

    /* renamed from: A */
    public final void m8491A() {
        AbstractC3802r.m15124f(m8507n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3802r.m15124f(m8512u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3802r.m15124f(m8506m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3802r.m15120b(C2543p.m8527h(m8507n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3802r.m15120b(C2543p.m8526g(m8506m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: B */
    public final String m8492B(AbstractC2626d abstractC2626d) {
        if ((!this.f7389a.m17533q().equals("CHIME_ANDROID_SDK") && !this.f7389a.m17538y()) || !abstractC2626d.m9041m()) {
            return this.f7394f.m8523a();
        }
        String m9027f = m8509p().m9027f();
        return TextUtils.isEmpty(m9027f) ? this.f7394f.m8523a() : m9027f;
    }

    /* renamed from: C */
    public final AbstractC2626d m8493C(AbstractC2626d abstractC2626d) {
        AbstractC2704d m9229d = this.f7390b.m9229d(m8506m(), abstractC2626d.mo9008d(), m8512u(), m8507n(), (abstractC2626d.mo9008d() == null || abstractC2626d.mo9008d().length() != 11) ? null : m8509p().m9030i());
        int i7 = b.f7402a[m9229d.mo9204e().ordinal()];
        if (i7 == 1) {
            return abstractC2626d.m9046s(m9229d.mo9202c(), m9229d.mo9203d(), this.f7392d.m8529b(), m9229d.mo9201b().mo9213c(), m9229d.mo9201b().mo9214d());
        }
        if (i7 == 2) {
            return abstractC2626d.m9044q("BAD CONFIG");
        }
        throw new C2536i("Firebase Installations Service is unavailable. Please try again later.", C2536i.a.UNAVAILABLE);
    }

    /* renamed from: D */
    public final void m8494D(Exception exc) {
        synchronized (this.f7395g) {
            try {
                Iterator it = this.f7400l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2542o) it.next()).mo8518a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: E */
    public final void m8495E(AbstractC2626d abstractC2626d) {
        synchronized (this.f7395g) {
            try {
                Iterator it = this.f7400l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2542o) it.next()).mo8519b(abstractC2626d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: F */
    public final synchronized void m8496F(String str) {
        this.f7398j = str;
    }

    /* renamed from: G */
    public final synchronized void m8497G(AbstractC2626d abstractC2626d, AbstractC2626d abstractC2626d2) {
        if (this.f7399k.size() != 0 && !TextUtils.equals(abstractC2626d.mo9008d(), abstractC2626d2.mo9008d())) {
            Iterator it = this.f7399k.iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                abstractC2626d2.mo9008d();
                throw null;
            }
        }
    }

    @Override // p144U3.InterfaceC2535h
    /* renamed from: a */
    public Task mo8498a() {
        m8491A();
        String m8508o = m8508o();
        if (m8508o != null) {
            return Tasks.forResult(m8508o);
        }
        Task m8501h = m8501h();
        this.f7396h.execute(new Runnable() { // from class: U3.d
            @Override // java.lang.Runnable
            public final void run() {
                C2534g.this.m8515x();
            }
        });
        return m8501h;
    }

    @Override // p144U3.InterfaceC2535h
    /* renamed from: b */
    public Task mo8499b(final boolean z6) {
        m8491A();
        Task m8500g = m8500g();
        this.f7396h.execute(new Runnable() { // from class: U3.f
            @Override // java.lang.Runnable
            public final void run() {
                C2534g.this.m8516y(z6);
            }
        });
        return m8500g;
    }

    /* renamed from: g */
    public final Task m8500g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m8502i(new C2538k(this.f7392d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: h */
    public final Task m8501h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m8502i(new C2539l(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: i */
    public final void m8502i(InterfaceC2542o interfaceC2542o) {
        synchronized (this.f7395g) {
            this.f7400l.add(interfaceC2542o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8514w(boolean r3) {
        /*
            r2 = this;
            V3.d r0 = r2.m8510s()
            boolean r1 = r0.m9037i()     // Catch: p144U3.C2536i -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.m9040l()     // Catch: p144U3.C2536i -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            U3.p r3 = r2.f7392d     // Catch: p144U3.C2536i -> L1d
            boolean r3 = r3.m8531f(r0)     // Catch: p144U3.C2536i -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            V3.d r3 = r2.m8505l(r0)     // Catch: p144U3.C2536i -> L1d
            goto L28
        L24:
            V3.d r3 = r2.m8493C(r0)     // Catch: p144U3.C2536i -> L1d
        L28:
            r2.m8513v(r3)
            r2.m8497G(r0, r3)
            boolean r0 = r3.m9039k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.mo9008d()
            r2.m8496F(r0)
        L3b:
            boolean r0 = r3.m9037i()
            if (r0 == 0) goto L4c
            U3.i r3 = new U3.i
            U3.i$a r0 = p144U3.C2536i.a.BAD_CONFIG
            r3.<init>(r0)
            r2.m8494D(r3)
            goto L60
        L4c:
            boolean r0 = r3.m9038j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m8494D(r3)
            goto L60
        L5d:
            r2.m8495E(r3)
        L60:
            return
        L61:
            r2.m8494D(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p144U3.C2534g.m8514w(boolean):void");
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void m8516y(final boolean z6) {
        AbstractC2626d m8511t = m8511t();
        if (z6) {
            m8511t = m8511t.m9043p();
        }
        m8495E(m8511t);
        this.f7397i.execute(new Runnable() { // from class: U3.e
            @Override // java.lang.Runnable
            public final void run() {
                C2534g.this.m8514w(z6);
            }
        });
    }

    /* renamed from: l */
    public final AbstractC2626d m8505l(AbstractC2626d abstractC2626d) {
        AbstractC2706f m9230e = this.f7390b.m9230e(m8506m(), abstractC2626d.mo9008d(), m8512u(), abstractC2626d.mo9010f());
        int i7 = b.f7403b[m9230e.mo9212b().ordinal()];
        if (i7 == 1) {
            return abstractC2626d.m9042o(m9230e.mo9213c(), m9230e.mo9214d(), this.f7392d.m8529b());
        }
        if (i7 == 2) {
            return abstractC2626d.m9044q("BAD CONFIG");
        }
        if (i7 != 3) {
            throw new C2536i("Firebase Installations Service is unavailable. Please try again later.", C2536i.a.UNAVAILABLE);
        }
        m8496F(null);
        return abstractC2626d.m9045r();
    }

    /* renamed from: m */
    public String m8506m() {
        return this.f7389a.m17534r().m17547b();
    }

    /* renamed from: n */
    public String m8507n() {
        return this.f7389a.m17534r().m17548c();
    }

    /* renamed from: o */
    public final synchronized String m8508o() {
        return this.f7398j;
    }

    /* renamed from: p */
    public final C2624b m8509p() {
        return (C2624b) this.f7393e.get();
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: s */
    public final AbstractC2626d m8510s() {
        AbstractC2626d m9034d;
        synchronized (f7387m) {
            try {
                C2529b m8482a = C2529b.m8482a(this.f7389a.m17532m(), "generatefid.lock");
                try {
                    m9034d = this.f7391c.m9034d();
                    if (m8482a != null) {
                        m8482a.m8483b();
                    }
                } catch (Throwable th) {
                    if (m8482a != null) {
                        m8482a.m8483b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m9034d;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: t */
    public final AbstractC2626d m8511t() {
        AbstractC2626d m9034d;
        synchronized (f7387m) {
            try {
                C2529b m8482a = C2529b.m8482a(this.f7389a.m17532m(), "generatefid.lock");
                try {
                    m9034d = this.f7391c.m9034d();
                    if (m9034d.m9038j()) {
                        m9034d = this.f7391c.m9032b(m9034d.m9047t(m8492B(m9034d)));
                    }
                    if (m8482a != null) {
                        m8482a.m8483b();
                    }
                } catch (Throwable th) {
                    if (m8482a != null) {
                        m8482a.m8483b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m9034d;
    }

    /* renamed from: u */
    public String m8512u() {
        return this.f7389a.m17534r().m17552g();
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: v */
    public final void m8513v(AbstractC2626d abstractC2626d) {
        synchronized (f7387m) {
            try {
                C2529b m8482a = C2529b.m8482a(this.f7389a.m17532m(), "generatefid.lock");
                try {
                    this.f7391c.m9032b(abstractC2626d);
                    if (m8482a != null) {
                        m8482a.m8483b();
                    }
                } catch (Throwable th) {
                    if (m8482a != null) {
                        m8482a.m8483b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public final /* synthetic */ void m8515x() {
        m8516y(false);
    }

    public C2534g(ExecutorService executorService, Executor executor, C4176f c4176f, C2703c c2703c, C2625c c2625c, C2543p c2543p, C6776x c6776x, C2541n c2541n) {
        this.f7395g = new Object();
        this.f7399k = new HashSet();
        this.f7400l = new ArrayList();
        this.f7389a = c4176f;
        this.f7390b = c2703c;
        this.f7391c = c2625c;
        this.f7392d = c2543p;
        this.f7393e = c6776x;
        this.f7394f = c2541n;
        this.f7396h = executorService;
        this.f7397i = executor;
    }
}
