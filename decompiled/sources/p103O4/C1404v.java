package p103O4;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p061I4.C0652d;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;
import p103O4.AbstractC1359c0;
import p103O4.C1378i1;
import p110P4.C1955i;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6476J;
import p346t3.AbstractC6478K;
import p346t3.AbstractC6480L;
import p346t3.AbstractC6508h;
import p346t3.C6482N;
import p346t3.C6483O;
import p346t3.C6486S;
import p346t3.InterfaceC6489V;
import p346t3.InterfaceC6500d;
import p346t3.InterfaceC6510i;

/* renamed from: O4.v */
/* loaded from: classes2.dex */
public class C1404v implements FlutterFirebasePlugin, InterfaceC0191a, InterfaceC0298a, AbstractC1359c0.InterfaceC7249c {

    /* renamed from: k */
    public static final HashMap f4435k = new HashMap();

    /* renamed from: c */
    public InterfaceC0651c f4436c;

    /* renamed from: d */
    public C0659k f4437d;

    /* renamed from: e */
    public Activity f4438e;

    /* renamed from: f */
    public final Map f4439f = new HashMap();

    /* renamed from: g */
    public final C1336S f4440g = new C1336S();

    /* renamed from: h */
    public final C1348Y f4441h = new C1348Y();

    /* renamed from: i */
    public final C1353a0 f4442i = new C1353a0();

    /* renamed from: j */
    public final C1356b0 f4443j = new C1356b0();

    /* renamed from: W */
    private Activity m5486W() {
        return this.f4438e;
    }

    /* renamed from: X */
    public static FirebaseAuth m5487X(AbstractC1359c0.C7248b c7248b) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4176f.m17518p(c7248b.m5278b()));
        if (c7248b.m5280d() != null) {
            firebaseAuth.m15384z(c7248b.m5280d());
        }
        String str = (String) C1955i.f5913e.get(c7248b.m5278b());
        if (str != null) {
            firebaseAuth.m15380x(str);
        }
        if (c7248b.m5279c() != null) {
            firebaseAuth.m15380x(c7248b.m5279c());
        }
        return firebaseAuth;
    }

    /* renamed from: Y */
    private void m5488Y(InterfaceC0651c interfaceC0651c) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f4437d = new C0659k(interfaceC0651c, "plugins.flutter.io/firebase_auth");
        AbstractC1302A0.m5057y(interfaceC0651c, this);
        AbstractC1332P0.m5092p(interfaceC0651c, this.f4440g);
        AbstractC1366e1.m5442g(interfaceC0651c, this.f4441h);
        AbstractC1335R0.m5107c(interfaceC0651c, this.f4441h);
        AbstractC1343V0.m5170e(interfaceC0651c, this.f4442i);
        AbstractC1349Y0.m5195d(interfaceC0651c, this.f4443j);
        this.f4436c = interfaceC0651c;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m5489Z(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m5490a0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5458f((InterfaceC6500d) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m5491b0(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m5492c0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m5493e0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(((InterfaceC6489V) task.getResult()).mo27044a());
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m5494f0(C4176f c4176f, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c4176f);
            AbstractC6458A m15361m = firebaseAuth.m15361m();
            String m15367p = firebaseAuth.m15367p();
            AbstractC1359c0.B m5462j = m15361m == null ? null : AbstractC1381j1.m5462j(m15361m);
            if (m15367p != null) {
                hashMap.put("APP_LANGUAGE_CODE", m15367p);
            }
            if (m5462j != null) {
                hashMap.put("APP_CURRENT_USER", AbstractC1381j1.m5455c(m5462j));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m5495g0(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m5496h0(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m5497i0(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m5498j0(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m5499k0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m5500l0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m5501m0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m5502n0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m5503o0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m5504p0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m5505q0(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a((String) task.getResult());
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m5506r0(C6483O c6483o) {
        f4435k.put(Integer.valueOf(c6483o.hashCode()), c6483o);
    }

    /* renamed from: s0 */
    private void m5507s0() {
        for (C0652d c0652d : this.f4439f.keySet()) {
            C0652d.d dVar = (C0652d.d) this.f4439f.get(c0652d);
            if (dVar != null) {
                dVar.mo2635a(null);
            }
            c0652d.m2628d(null);
        }
        this.f4439f.clear();
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: A */
    public void mo5285A(AbstractC1359c0.C7248b c7248b, String str, String str2, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15356j(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: O4.u
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5492c0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: B */
    public void mo5286B(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.y yVar, final AbstractC1359c0.F f7) {
        FirebaseAuth m5487X = m5487X(c7248b);
        C6482N.a m27020e = C6482N.m27020e(yVar.m5417c(), m5487X);
        if (yVar.m5418d() != null) {
            m27020e.m27027c(yVar.m5418d());
        }
        if (yVar.m5416b() != null) {
            m27020e.m27025a(yVar.m5416b());
        }
        m5487X.m15319G(m5486W(), m27020e.m27026b()).addOnCompleteListener(new OnCompleteListener() { // from class: O4.n
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5504p0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m5488Y(bVar.m786b());
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: a */
    public void mo5287a(AbstractC1359c0.C7248b c7248b, String str, AbstractC1359c0.q qVar, final AbstractC1359c0.G g7) {
        m5487X(c7248b).m15378w(str, AbstractC1381j1.m5453a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: O4.p
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5498j0(AbstractC1359c0.G.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: b */
    public void mo5288b(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.F f7) {
        try {
            FirebaseAuth m5487X = m5487X(c7248b);
            C1355b c1355b = new C1355b(m5487X);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + m5487X.m15359l().m17533q();
            C0652d c0652d = new C0652d(this.f4436c, str);
            c0652d.m2628d(c1355b);
            this.f4439f.put(c0652d, c1355b);
            f7.mo5059a(str);
        } catch (Exception e7) {
            f7.mo5060b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: c */
    public void mo5289c(AbstractC1359c0.C7248b c7248b, String str, String str2, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15316E(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: O4.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5503o0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: d */
    public void mo5290d(AbstractC1359c0.C7248b c7248b, Map map, final AbstractC1359c0.F f7) {
        FirebaseAuth m5487X = m5487X(c7248b);
        AbstractC6508h m5454b = AbstractC1381j1.m5454b(map);
        if (m5454b == null) {
            throw AbstractC1406w.m5510b();
        }
        m5487X.m15312B(m5454b).addOnCompleteListener(new OnCompleteListener() { // from class: O4.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5500l0(AbstractC1359c0.F.this, task);
            }
        });
    }

    /* renamed from: d0 */
    public final /* synthetic */ void m5508d0(TaskCompletionSource taskCompletionSource) {
        try {
            m5507s0();
            f4435k.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O4.c
            @Override // java.lang.Runnable
            public final void run() {
                C1404v.this.m5508d0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: e */
    public void mo5291e(AbstractC1359c0.C7248b c7248b, String str, String str2, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15315D(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: O4.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5502n0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: f */
    public void mo5292f(AbstractC1359c0.C7248b c7248b, final AbstractC1359c0.G g7) {
        m5487X(c7248b).m15370r().addOnCompleteListener(new OnCompleteListener() { // from class: O4.s
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5495g0(AbstractC1359c0.G.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: g */
    public void mo5293g(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15353h(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5490a0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(final C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O4.m
            @Override // java.lang.Runnable
            public final void run() {
                C1404v.m5494f0(C4176f.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: h */
    public void mo5294h(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15324J(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5505q0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c interfaceC0300c) {
        Activity mo1204g = interfaceC0300c.mo1204g();
        this.f4438e = mo1204g;
        this.f4440g.m5155d0(mo1204g);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        this.f4438e = null;
        this.f4440g.m5155d0(null);
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: k */
    public void mo5295k(AbstractC1359c0.C7248b c7248b, String str, String str2, final AbstractC1359c0.G g7) {
        m5487X(c7248b).m15354i(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: O4.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5491b0(AbstractC1359c0.G.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: l */
    public void mo5296l(AbstractC1359c0.C7248b c7248b, String str, AbstractC1359c0.q qVar, final AbstractC1359c0.G g7) {
        FirebaseAuth m5487X = m5487X(c7248b);
        if (qVar == null) {
            m5487X.m15375u(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.h
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1404v.m5496h0(AbstractC1359c0.G.this, task);
                }
            });
        } else {
            m5487X.m15377v(str, AbstractC1381j1.m5453a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: O4.i
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1404v.m5497i0(AbstractC1359c0.G.this, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: m */
    public void mo5297m(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.G g7) {
        Map map;
        try {
            FirebaseAuth m5487X = m5487X(c7248b);
            if (m5487X.m15361m() != null && (map = (Map) C1348Y.f4207a.get(c7248b.m5278b())) != null) {
                map.remove(m5487X.m15361m().mo26979a());
            }
            m5487X.m15318F();
            g7.mo5065a();
        } catch (Exception e7) {
            g7.mo5066b(e7);
        }
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c interfaceC0300c) {
        Activity mo1204g = interfaceC0300c.mo1204g();
        this.f4438e = mo1204g;
        this.f4440g.m5155d0(mo1204g);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        this.f4438e = null;
        this.f4440g.m5155d0(null);
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: p */
    public void mo5298p(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.G g7) {
        m5487X(c7248b).m15352g(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5489Z(AbstractC1359c0.G.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: q */
    public void mo5299q(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.t tVar, AbstractC1359c0.G g7) {
        try {
            FirebaseAuth m5487X = m5487X(c7248b);
            m5487X.m15365o().mo27128b(tVar.m5364b().booleanValue());
            if (tVar.m5365c() != null) {
                m5487X.m15365o().mo27127a(tVar.m5365c().booleanValue());
            }
            if (tVar.m5366d() != null && tVar.m5367e() != null) {
                m5487X.m15365o().mo27129c(tVar.m5366d(), tVar.m5367e());
            }
            g7.mo5065a();
        } catch (Exception e7) {
            g7.mo5066b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: r */
    public void mo5300r(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.F f7) {
        try {
            FirebaseAuth m5487X = m5487X(c7248b);
            C1372g1 c1372g1 = new C1372g1(m5487X);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + m5487X.m15359l().m17533q();
            C0652d c0652d = new C0652d(this.f4436c, str);
            c0652d.m2628d(c1372g1);
            this.f4439f.put(c0652d, c1372g1);
            f7.mo5059a(str);
        } catch (Exception e7) {
            f7.mo5060b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: s */
    public void mo5301s(AbstractC1359c0.C7248b c7248b, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15311A().addOnCompleteListener(new OnCompleteListener() { // from class: O4.q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5499k0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: t */
    public void mo5302t(AbstractC1359c0.C7248b c7248b, String str, AbstractC1359c0.G g7) {
        g7.mo5065a();
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: u */
    public void mo5303u(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.E e7, AbstractC1359c0.F f7) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            C0652d c0652d = new C0652d(this.f4436c, str);
            C6486S c6486s = null;
            AbstractC6480L abstractC6480L = e7.m5266e() != null ? (AbstractC6480L) C1348Y.f4208b.get(e7.m5266e()) : null;
            String m5265d = e7.m5265d();
            if (m5265d != null) {
                Iterator it = C1348Y.f4209c.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((AbstractC6478K) C1348Y.f4209c.get((String) it.next())).mo27014y0().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AbstractC6476J abstractC6476J = (AbstractC6476J) it2.next();
                            if (abstractC6476J.mo27008a().equals(m5265d) && (abstractC6476J instanceof C6486S)) {
                                c6486s = (C6486S) abstractC6476J;
                                break;
                            }
                        }
                    }
                }
            }
            C1378i1 c1378i1 = new C1378i1(m5486W(), c7248b, e7, abstractC6480L, c6486s, new C1378i1.b() { // from class: O4.t
                @Override // p103O4.C1378i1.b
                /* renamed from: a */
                public final void mo5452a(C6483O c6483o) {
                    C1404v.m5506r0(c6483o);
                }
            });
            c0652d.m2628d(c1378i1);
            this.f4439f.put(c0652d, c1378i1);
            f7.mo5059a(str);
        } catch (Exception e8) {
            f7.mo5060b(e8);
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: v */
    public void mo5304v(AbstractC1359c0.C7248b c7248b, String str, Long l7, AbstractC1359c0.G g7) {
        try {
            m5487X(c7248b).m15322I(str, l7.intValue());
            g7.mo5065a();
        } catch (Exception e7) {
            g7.mo5066b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: w */
    public void mo5305w(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15313C(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5501m0(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: x */
    public void mo5306x(AbstractC1359c0.C7248b c7248b, String str, AbstractC1359c0.F f7) {
        try {
            FirebaseAuth m5487X = m5487X(c7248b);
            if (str == null) {
                m5487X.m15321H();
            } else {
                m5487X.m15382y(str);
            }
            f7.mo5059a(m5487X.m15367p());
        } catch (Exception e7) {
            f7.mo5060b(e7);
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        this.f4437d.m2654e(null);
        AbstractC1302A0.m5057y(this.f4436c, null);
        AbstractC1332P0.m5092p(this.f4436c, null);
        AbstractC1366e1.m5442g(this.f4436c, null);
        AbstractC1335R0.m5107c(this.f4436c, null);
        AbstractC1343V0.m5170e(this.f4436c, null);
        AbstractC1349Y0.m5195d(this.f4436c, null);
        this.f4437d = null;
        this.f4436c = null;
        m5507s0();
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7249c
    /* renamed from: z */
    public void mo5307z(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.F f7) {
        m5487X(c7248b).m15357k(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1404v.m5493e0(AbstractC1359c0.F.this, task);
            }
        });
    }
}
