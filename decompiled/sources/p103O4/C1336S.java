package p103O4;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.Map;
import p103O4.AbstractC1359c0;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6508h;
import p346t3.C6462C;
import p346t3.C6482N;
import p346t3.C6483O;
import p346t3.C6501d0;
import p346t3.InterfaceC6510i;

/* renamed from: O4.S */
/* loaded from: classes2.dex */
public class C1336S implements AbstractC1359c0.InterfaceC7251e {

    /* renamed from: a */
    public Activity f4190a;

    /* renamed from: I */
    public static AbstractC6458A m5118I(AbstractC1359c0.C7248b c7248b) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4176f.m17518p(c7248b.m5278b()));
        if (c7248b.m5280d() != null) {
            firebaseAuth.m15384z(c7248b.m5280d());
        }
        return firebaseAuth.m15361m();
    }

    /* renamed from: J */
    public static /* synthetic */ void m5119J(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: K */
    public static /* synthetic */ void m5120K(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.F f7, Boolean bool) {
        AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
            return;
        }
        try {
            f7.mo5059a(AbstractC1381j1.m5464l((C6462C) Tasks.await(m5118I.m26984y0(bool.booleanValue()))));
        } catch (Exception e7) {
            f7.mo5060b(AbstractC1406w.m5513e(e7));
        }
    }

    /* renamed from: L */
    public static /* synthetic */ void m5121L(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: M */
    public static /* synthetic */ void m5122M(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: N */
    public static /* synthetic */ void m5123N(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: O */
    public static /* synthetic */ void m5124O(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: P */
    public static /* synthetic */ void m5125P(AbstractC1359c0.F f7, AbstractC6458A abstractC6458A, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5462j(abstractC6458A));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m5126Q(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: R */
    public static /* synthetic */ void m5127R(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: S */
    public static /* synthetic */ void m5128S(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception.getMessage().contains("User was not linked to an account with the given provider.")) {
            f7.mo5060b(AbstractC1406w.m5511c());
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(exception));
        }
    }

    /* renamed from: T */
    public static /* synthetic */ void m5129T(AbstractC1359c0.F f7, AbstractC6458A abstractC6458A, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5462j(abstractC6458A));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m5130U(final AbstractC6458A abstractC6458A, final AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            abstractC6458A.m26958G0().addOnCompleteListener(new OnCompleteListener() { // from class: O4.G
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    C1336S.m5129T(AbstractC1359c0.F.this, abstractC6458A, task2);
                }
            });
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: V */
    public static /* synthetic */ void m5131V(AbstractC1359c0.F f7, AbstractC6458A abstractC6458A, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5462j(abstractC6458A));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m5132W(final AbstractC6458A abstractC6458A, final AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            abstractC6458A.m26958G0().addOnCompleteListener(new OnCompleteListener() { // from class: O4.E
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    C1336S.m5131V(AbstractC1359c0.F.this, abstractC6458A, task2);
                }
            });
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m5133X(AbstractC1359c0.F f7, AbstractC6458A abstractC6458A, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5462j(abstractC6458A));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: Y */
    public static /* synthetic */ void m5134Y(final AbstractC6458A abstractC6458A, final AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            abstractC6458A.m26958G0().addOnCompleteListener(new OnCompleteListener() { // from class: O4.H
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    C1336S.m5133X(AbstractC1359c0.F.this, abstractC6458A, task2);
                }
            });
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: Z */
    public static /* synthetic */ void m5135Z(AbstractC1359c0.F f7, AbstractC6458A abstractC6458A, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5462j(abstractC6458A));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m5136a0(final AbstractC6458A abstractC6458A, final AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            abstractC6458A.m26958G0().addOnCompleteListener(new OnCompleteListener() { // from class: O4.F
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    C1336S.m5135Z(AbstractC1359c0.F.this, abstractC6458A, task2);
                }
            });
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m5137b0(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m5138c0(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: a */
    public void mo5151a(final AbstractC1359c0.C7248b c7248b, final Boolean bool, final AbstractC1359c0.F f7) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O4.z
            @Override // java.lang.Runnable
            public final void run() {
                C1336S.m5120K(AbstractC1359c0.C7248b.this, f7, bool);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: b */
    public void mo5152b(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.y yVar, final AbstractC1359c0.F f7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        C6482N.a m27019d = C6482N.m27019d(yVar.m5417c());
        if (yVar.m5418d() != null) {
            m27019d.m27027c(yVar.m5418d());
        }
        if (yVar.m5416b() != null) {
            m27019d.m27025a(yVar.m5416b());
        }
        m5118I.m26962K0(this.f4190a, m27019d.m27026b()).addOnCompleteListener(new OnCompleteListener() { // from class: O4.Q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1336S.m5124O(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: c */
    public void mo5153c(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.y yVar, final AbstractC1359c0.F f7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        C6482N.a m27019d = C6482N.m27019d(yVar.m5417c());
        if (yVar.m5418d() != null) {
            m27019d.m27027c(yVar.m5418d());
        }
        if (yVar.m5416b() != null) {
            m27019d.m27025a(yVar.m5416b());
        }
        m5118I.m26961J0(this.f4190a, m27019d.m27026b()).addOnCompleteListener(new OnCompleteListener() { // from class: O4.x
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1336S.m5122M(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: d */
    public void mo5154d(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.F f7) {
        final AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
        } else {
            m5118I.m26966N0(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.B
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5132W(AbstractC6458A.this, f7, task);
                }
            });
        }
    }

    /* renamed from: d0 */
    public void m5155d0(Activity activity) {
        this.f4190a = activity;
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: e */
    public void mo5156e(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.F f7) {
        final AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
        } else {
            m5118I.m26965M0(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.C
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5130U(AbstractC6458A.this, f7, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: f */
    public void mo5157f(AbstractC1359c0.C7248b c7248b, String str, AbstractC1359c0.q qVar, final AbstractC1359c0.G g7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            g7.mo5066b(AbstractC1406w.m5512d());
        } else if (qVar == null) {
            m5118I.m26969Q0(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.L
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5137b0(AbstractC1359c0.G.this, task);
                }
            });
        } else {
            m5118I.m26970R0(str, AbstractC1381j1.m5453a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: O4.M
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5138c0(AbstractC1359c0.G.this, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: g */
    public void mo5158g(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.F f7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
        } else {
            m5118I.m26963L0(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.O
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5128S(AbstractC1359c0.F.this, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: h */
    public void mo5159h(AbstractC1359c0.C7248b c7248b, final AbstractC1359c0.F f7) {
        final AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
        } else {
            m5118I.m26958G0().addOnCompleteListener(new OnCompleteListener() { // from class: O4.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5125P(AbstractC1359c0.F.this, m5118I, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: i */
    public void mo5160i(AbstractC1359c0.C7248b c7248b, final AbstractC1359c0.G g7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            g7.mo5066b(AbstractC1406w.m5512d());
        } else {
            m5118I.m26982x0().addOnCompleteListener(new OnCompleteListener() { // from class: O4.P
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5119J(AbstractC1359c0.G.this, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: j */
    public void mo5161j(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.q qVar, final AbstractC1359c0.G g7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            g7.mo5066b(AbstractC1406w.m5512d());
        } else if (qVar == null) {
            m5118I.m26959H0().addOnCompleteListener(new OnCompleteListener() { // from class: O4.I
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5126Q(AbstractC1359c0.G.this, task);
                }
            });
        } else {
            m5118I.m26960I0(AbstractC1381j1.m5453a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: O4.J
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5127R(AbstractC1359c0.G.this, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: k */
    public void mo5162k(AbstractC1359c0.C7248b c7248b, Map map, final AbstractC1359c0.F f7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        AbstractC6508h m5454b = AbstractC1381j1.m5454b(map);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
        } else if (m5454b == null) {
            f7.mo5060b(AbstractC1406w.m5510b());
        } else {
            m5118I.m26956E0(m5454b).addOnCompleteListener(new OnCompleteListener() { // from class: O4.K
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5121L(AbstractC1359c0.F.this, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: l */
    public void mo5163l(AbstractC1359c0.C7248b c7248b, Map map, final AbstractC1359c0.F f7) {
        AbstractC6458A m5118I = m5118I(c7248b);
        AbstractC6508h m5454b = AbstractC1381j1.m5454b(map);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
        } else if (m5454b == null) {
            f7.mo5060b(AbstractC1406w.m5510b());
        } else {
            m5118I.m26957F0(m5454b).addOnCompleteListener(new OnCompleteListener() { // from class: O4.D
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5123N(AbstractC1359c0.F.this, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: m */
    public void mo5164m(AbstractC1359c0.C7248b c7248b, Map map, final AbstractC1359c0.F f7) {
        final AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
            return;
        }
        C6483O c6483o = (C6483O) AbstractC1381j1.m5454b(map);
        if (c6483o == null) {
            f7.mo5060b(AbstractC1406w.m5510b());
        } else {
            m5118I.m26967O0(c6483o).addOnCompleteListener(new OnCompleteListener() { // from class: O4.A
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1336S.m5134Y(AbstractC6458A.this, f7, task);
                }
            });
        }
    }

    @Override // p103O4.AbstractC1359c0.InterfaceC7251e
    /* renamed from: n */
    public void mo5165n(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.D d7, final AbstractC1359c0.F f7) {
        final AbstractC6458A m5118I = m5118I(c7248b);
        if (m5118I == null) {
            f7.mo5060b(AbstractC1406w.m5512d());
            return;
        }
        C6501d0.a aVar = new C6501d0.a();
        if (d7.m5254c().booleanValue()) {
            aVar.m27073b(d7.m5253b());
        }
        if (d7.m5256e().booleanValue()) {
            if (d7.m5255d() != null) {
                aVar.m27074c(Uri.parse(d7.m5255d()));
            } else {
                aVar.m27074c(null);
            }
        }
        m5118I.m26968P0(aVar.m27072a()).addOnCompleteListener(new OnCompleteListener() { // from class: O4.N
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1336S.m5136a0(AbstractC6458A.this, f7, task);
            }
        });
    }
}
