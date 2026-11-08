package p287m3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p137T3.InterfaceC2447b;
import p219e3.C4176f;
import p219e3.C4183m;
import p262j3.AbstractC5367c;
import p262j3.AbstractC5369e;
import p262j3.InterfaceC5365a;
import p262j3.InterfaceC5366b;
import p295n3.InterfaceC5781a;
import p303o3.InterfaceC5938a;

/* renamed from: m3.j */
/* loaded from: classes.dex */
public class C5584j extends AbstractC5369e {

    /* renamed from: a */
    public final C4176f f20163a;

    /* renamed from: b */
    public final InterfaceC2447b f20164b;

    /* renamed from: c */
    public final List f20165c;

    /* renamed from: d */
    public final List f20166d;

    /* renamed from: e */
    public final C5592r f20167e;

    /* renamed from: f */
    public final C5593s f20168f;

    /* renamed from: g */
    public final Executor f20169g;

    /* renamed from: h */
    public final Executor f20170h;

    /* renamed from: i */
    public final Executor f20171i;

    /* renamed from: j */
    public final Task f20172j;

    /* renamed from: k */
    public final InterfaceC5781a f20173k;

    /* renamed from: l */
    public InterfaceC5366b f20174l;

    /* renamed from: m */
    public InterfaceC5365a f20175m;

    /* renamed from: n */
    public AbstractC5367c f20176n;

    /* renamed from: o */
    public Task f20177o;

    public C5584j(C4176f c4176f, InterfaceC2447b interfaceC2447b, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15129k(interfaceC2447b);
        this.f20163a = c4176f;
        this.f20164b = interfaceC2447b;
        this.f20165c = new ArrayList();
        this.f20166d = new ArrayList();
        this.f20167e = new C5592r(c4176f.m17532m(), c4176f.m17535s());
        this.f20168f = new C5593s(c4176f.m17532m(), this, executor2, scheduledExecutorService);
        this.f20169g = executor;
        this.f20170h = executor2;
        this.f20171i = executor3;
        this.f20172j = m23359A(executor3);
        this.f20173k = new InterfaceC5781a.a();
    }

    /* renamed from: w */
    public static /* synthetic */ Task m23358w(Task task) {
        return task.isSuccessful() ? Tasks.forResult(C5577c.m23350c((AbstractC5367c) task.getResult())) : Tasks.forResult(C5577c.m23351d(new C4183m(task.getException().getMessage(), task.getException())));
    }

    /* renamed from: A */
    public final Task m23359A(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: m3.d
            @Override // java.lang.Runnable
            public final void run() {
                C5584j.this.m23372y(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: B */
    public void m23360B(AbstractC5367c abstractC5367c) {
        this.f20176n = abstractC5367c;
    }

    /* renamed from: C */
    public final void m23361C(final AbstractC5367c abstractC5367c) {
        this.f20171i.execute(new Runnable() { // from class: m3.i
            @Override // java.lang.Runnable
            public final void run() {
                C5584j.this.m23373z(abstractC5367c);
            }
        });
        m23360B(abstractC5367c);
        this.f20168f.m23406d(abstractC5367c);
    }

    @Override // p303o3.InterfaceC5939b
    /* renamed from: a */
    public void mo23362a(InterfaceC5938a interfaceC5938a) {
        AbstractC3802r.m15129k(interfaceC5938a);
        this.f20165c.remove(interfaceC5938a);
        this.f20168f.m23407e(this.f20165c.size() + this.f20166d.size());
    }

    @Override // p303o3.InterfaceC5939b
    /* renamed from: b */
    public Task mo23363b(final boolean z6) {
        return this.f20172j.continueWithTask(this.f20170h, new Continuation() { // from class: m3.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m23371x;
                m23371x = C5584j.this.m23371x(z6, task);
                return m23371x;
            }
        });
    }

    @Override // p303o3.InterfaceC5939b
    /* renamed from: c */
    public void mo23364c(InterfaceC5938a interfaceC5938a) {
        AbstractC3802r.m15129k(interfaceC5938a);
        this.f20165c.add(interfaceC5938a);
        this.f20168f.m23407e(this.f20165c.size() + this.f20166d.size());
        if (m23367s()) {
            interfaceC5938a.mo2143a(C5577c.m23350c(this.f20176n));
        }
    }

    @Override // p262j3.AbstractC5369e
    /* renamed from: d */
    public void mo22076d(AbstractC5369e.a aVar) {
        AbstractC3802r.m15129k(aVar);
        this.f20166d.add(aVar);
        this.f20168f.m23407e(this.f20165c.size() + this.f20166d.size());
        if (m23367s()) {
            aVar.mo4901a(this.f20176n);
        }
    }

    @Override // p262j3.AbstractC5369e
    /* renamed from: e */
    public Task mo22077e(final boolean z6) {
        return this.f20172j.continueWithTask(this.f20170h, new Continuation() { // from class: m3.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m23370v;
                m23370v = C5584j.this.m23370v(z6, task);
                return m23370v;
            }
        });
    }

    @Override // p262j3.AbstractC5369e
    /* renamed from: g */
    public Task mo22078g() {
        InterfaceC5365a interfaceC5365a = this.f20175m;
        return interfaceC5365a == null ? Tasks.forException(new C4183m("No AppCheckProvider installed.")) : interfaceC5365a.mo22069a();
    }

    @Override // p262j3.AbstractC5369e
    /* renamed from: h */
    public void mo22079h(InterfaceC5366b interfaceC5366b) {
        m23368t(interfaceC5366b, this.f20163a.m17537x());
    }

    @Override // p262j3.AbstractC5369e
    /* renamed from: i */
    public void mo22080i(AbstractC5369e.a aVar) {
        AbstractC3802r.m15129k(aVar);
        this.f20166d.remove(aVar);
        this.f20168f.m23407e(this.f20165c.size() + this.f20166d.size());
    }

    @Override // p262j3.AbstractC5369e
    /* renamed from: j */
    public void mo22081j(boolean z6) {
        this.f20168f.m23408f(z6);
    }

    /* renamed from: q */
    public Task m23365q() {
        return this.f20175m.mo22069a().onSuccessTask(this.f20169g, new SuccessContinuation() { // from class: m3.h
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m23369u;
                m23369u = C5584j.this.m23369u((AbstractC5367c) obj);
                return m23369u;
            }
        });
    }

    /* renamed from: r */
    public InterfaceC2447b m23366r() {
        return this.f20164b;
    }

    /* renamed from: s */
    public final boolean m23367s() {
        AbstractC5367c abstractC5367c = this.f20176n;
        return abstractC5367c != null && abstractC5367c.mo22071a() - this.f20173k.mo24428a() > 300000;
    }

    /* renamed from: t */
    public void m23368t(InterfaceC5366b interfaceC5366b, boolean z6) {
        AbstractC3802r.m15129k(interfaceC5366b);
        this.f20174l = interfaceC5366b;
        this.f20175m = interfaceC5366b.mo22070a(this.f20163a);
        this.f20168f.m23408f(z6);
    }

    /* renamed from: u */
    public final /* synthetic */ Task m23369u(AbstractC5367c abstractC5367c) {
        m23361C(abstractC5367c);
        Iterator it = this.f20166d.iterator();
        while (it.hasNext()) {
            ((AbstractC5369e.a) it.next()).mo4901a(abstractC5367c);
        }
        C5577c m23350c = C5577c.m23350c(abstractC5367c);
        Iterator it2 = this.f20165c.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5938a) it2.next()).mo2143a(m23350c);
        }
        return Tasks.forResult(abstractC5367c);
    }

    /* renamed from: v */
    public final /* synthetic */ Task m23370v(boolean z6, Task task) {
        if (!z6 && m23367s()) {
            return Tasks.forResult(this.f20176n);
        }
        if (this.f20175m == null) {
            return Tasks.forException(new C4183m("No AppCheckProvider installed."));
        }
        Task task2 = this.f20177o;
        if (task2 == null || task2.isComplete() || this.f20177o.isCanceled()) {
            this.f20177o = m23365q();
        }
        return this.f20177o;
    }

    /* renamed from: x */
    public final /* synthetic */ Task m23371x(boolean z6, Task task) {
        if (!z6 && m23367s()) {
            return Tasks.forResult(C5577c.m23350c(this.f20176n));
        }
        if (this.f20175m == null) {
            return Tasks.forResult(C5577c.m23351d(new C4183m("No AppCheckProvider installed.")));
        }
        Task task2 = this.f20177o;
        if (task2 == null || task2.isComplete() || this.f20177o.isCanceled()) {
            this.f20177o = m23365q();
        }
        return this.f20177o.continueWithTask(this.f20170h, new Continuation() { // from class: m3.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Task m23358w;
                m23358w = C5584j.m23358w(task3);
                return m23358w;
            }
        });
    }

    /* renamed from: y */
    public final /* synthetic */ void m23372y(TaskCompletionSource taskCompletionSource) {
        AbstractC5367c m23400d = this.f20167e.m23400d();
        if (m23400d != null) {
            m23360B(m23400d);
        }
        taskCompletionSource.setResult(null);
    }

    /* renamed from: z */
    public final /* synthetic */ void m23373z(AbstractC5367c abstractC5367c) {
        this.f20167e.m23401e(abstractC5367c);
    }
}
