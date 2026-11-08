package p103O4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AbstractC3933b;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p103O4.AbstractC1359c0;
import p179Z3.C3038a;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6472H;
import p346t3.AbstractC6474I;
import p346t3.AbstractC6478K;
import p346t3.AbstractC6480L;
import p346t3.AbstractC6485Q;
import p346t3.InterfaceC6510i;

/* renamed from: O4.Y */
/* loaded from: classes2.dex */
public class C1348Y implements AbstractC1359c0.m, AbstractC1359c0.h {

    /* renamed from: a */
    public static final Map f4207a = new HashMap();

    /* renamed from: b */
    public static final Map f4208b = new HashMap();

    /* renamed from: c */
    public static final Map f4209c = new HashMap();

    /* renamed from: d */
    public static final Map f4210d = new HashMap();

    /* renamed from: m */
    public static /* synthetic */ void m5180m(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m5181n(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m5182o(AbstractC1359c0.F f7, Task task) {
        if (!task.isSuccessful()) {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
            return;
        }
        AbstractC6480L abstractC6480L = (AbstractC6480L) task.getResult();
        String uuid = UUID.randomUUID().toString();
        f4208b.put(uuid, abstractC6480L);
        f7.mo5059a(new AbstractC1359c0.w.a().m5408b(uuid).m5407a());
    }

    /* renamed from: p */
    public static /* synthetic */ void m5183p(AbstractC1359c0.F f7, Task task) {
        if (task.isSuccessful()) {
            f7.mo5059a(AbstractC1381j1.m5461i((InterfaceC6510i) task.getResult()));
        } else {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m5184q(AbstractC1359c0.G g7, Task task) {
        if (task.isSuccessful()) {
            g7.mo5065a();
        } else {
            g7.mo5066b(AbstractC1406w.m5513e(task.getException()));
        }
    }

    @Override // p103O4.AbstractC1359c0.m
    /* renamed from: a */
    public void mo5185a(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.F f7) {
        try {
            f7.mo5059a(AbstractC1381j1.m5457e(m5191l(c7248b).mo27004b()));
        } catch (C3038a e7) {
            f7.mo5060b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.m
    /* renamed from: b */
    public void mo5186b(AbstractC1359c0.C7248b c7248b, AbstractC1359c0.x xVar, String str, final AbstractC1359c0.G g7) {
        try {
            m5191l(c7248b).mo27003a(AbstractC6485Q.m27039a(AbstractC3933b.m15410a(xVar.m5411c(), xVar.m5410b())), str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.X
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1348Y.m5180m(AbstractC1359c0.G.this, task);
                }
            });
        } catch (C3038a e7) {
            g7.mo5066b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.m
    /* renamed from: c */
    public void mo5187c(AbstractC1359c0.C7248b c7248b, String str, final AbstractC1359c0.G g7) {
        try {
            m5191l(c7248b).mo27006d(str).addOnCompleteListener(new OnCompleteListener() { // from class: O4.W
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1348Y.m5184q(AbstractC1359c0.G.this, task);
                }
            });
        } catch (C3038a e7) {
            g7.mo5066b(AbstractC1406w.m5513e(e7));
        }
    }

    @Override // p103O4.AbstractC1359c0.m
    /* renamed from: d */
    public void mo5188d(AbstractC1359c0.C7248b c7248b, final AbstractC1359c0.F f7) {
        try {
            m5191l(c7248b).mo27005c().addOnCompleteListener(new OnCompleteListener() { // from class: O4.U
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1348Y.m5182o(AbstractC1359c0.F.this, task);
                }
            });
        } catch (C3038a e7) {
            f7.mo5060b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.m
    /* renamed from: e */
    public void mo5189e(AbstractC1359c0.C7248b c7248b, String str, String str2, final AbstractC1359c0.G g7) {
        try {
            m5191l(c7248b).mo27003a((AbstractC6474I) f4210d.get(str), str2).addOnCompleteListener(new OnCompleteListener() { // from class: O4.V
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1348Y.m5181n(AbstractC1359c0.G.this, task);
                }
            });
        } catch (C3038a e7) {
            g7.mo5066b(e7);
        }
    }

    @Override // p103O4.AbstractC1359c0.h
    /* renamed from: f */
    public void mo5190f(String str, AbstractC1359c0.x xVar, String str2, final AbstractC1359c0.F f7) {
        AbstractC6478K abstractC6478K = (AbstractC6478K) f4209c.get(str);
        if (abstractC6478K == null) {
            f7.mo5060b(AbstractC1406w.m5513e(new Exception("Resolver not found")));
        } else {
            abstractC6478K.mo27012A0(xVar != null ? AbstractC6485Q.m27039a(AbstractC3933b.m15410a(xVar.m5411c(), xVar.m5410b())) : (AbstractC6474I) f4210d.get(str2)).addOnCompleteListener(new OnCompleteListener() { // from class: O4.T
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1348Y.m5183p(AbstractC1359c0.F.this, task);
                }
            });
        }
    }

    /* renamed from: l */
    public AbstractC6472H m5191l(AbstractC1359c0.C7248b c7248b) {
        AbstractC6458A m5118I = C1336S.m5118I(c7248b);
        if (m5118I == null) {
            throw new C3038a("No user is signed in");
        }
        Map map = f4207a;
        if (map.get(c7248b.m5278b()) == null) {
            map.put(c7248b.m5278b(), new HashMap());
        }
        Map map2 = (Map) map.get(c7248b.m5278b());
        if (map2.get(m5118I.mo26979a()) == null) {
            map2.put(m5118I.mo26979a(), m5118I.mo26952A0());
        }
        return (AbstractC6472H) map2.get(m5118I.mo26979a());
    }
}
