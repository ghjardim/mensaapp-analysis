package p110P4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p026D4.InterfaceC0191a;
import p110P4.AbstractC1962p;
import p219e3.C4176f;
import p219e3.C4185o;

/* renamed from: P4.i */
/* loaded from: classes2.dex */
public class C1955i implements InterfaceC0191a, AbstractC1962p.b, AbstractC1962p.a {

    /* renamed from: e */
    public static Map f5913e = new HashMap();

    /* renamed from: c */
    public Context f5914c;

    /* renamed from: d */
    public boolean f5915d = false;

    /* renamed from: q */
    public static /* synthetic */ void m6942q(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                C4176f.m17518p(str).m17530j();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m6943u(AbstractC1962p.f fVar, Task task) {
        if (task.isSuccessful()) {
            fVar.mo6964a(task.getResult());
        } else {
            fVar.mo6965b(task.getException());
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m6944w(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            C4176f.m17518p(str).m17526F(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m6945x(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            C4176f.m17518p(str).m17525E(bool.booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        AbstractC1966t.m7017e(bVar.m786b(), this);
        AbstractC1961o.m6963e(bVar.m786b(), this);
        this.f5914c = bVar.m785a();
    }

    @Override // p110P4.AbstractC1962p.b
    /* renamed from: a */
    public void mo6946a(AbstractC1962p.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.d
            @Override // java.lang.Runnable
            public final void run() {
                C1955i.this.m6956t(taskCompletionSource);
            }
        });
        m6958z(taskCompletionSource, fVar);
    }

    @Override // p110P4.AbstractC1962p.b
    /* renamed from: b */
    public void mo6947b(final String str, final AbstractC1962p.d dVar, AbstractC1962p.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.f
            @Override // java.lang.Runnable
            public final void run() {
                C1955i.this.m6955s(dVar, str, taskCompletionSource);
            }
        });
        m6958z(taskCompletionSource, fVar);
    }

    @Override // p110P4.AbstractC1962p.a
    /* renamed from: c */
    public void mo6948c(final String str, final Boolean bool, AbstractC1962p.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.c
            @Override // java.lang.Runnable
            public final void run() {
                C1955i.m6944w(str, bool, taskCompletionSource);
            }
        });
        m6958z(taskCompletionSource, fVar);
    }

    @Override // p110P4.AbstractC1962p.b
    /* renamed from: d */
    public void mo6949d(AbstractC1962p.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.b
            @Override // java.lang.Runnable
            public final void run() {
                C1955i.this.m6957v(taskCompletionSource);
            }
        });
        m6958z(taskCompletionSource, fVar);
    }

    @Override // p110P4.AbstractC1962p.a
    /* renamed from: e */
    public void mo6950e(final String str, final Boolean bool, AbstractC1962p.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.e
            @Override // java.lang.Runnable
            public final void run() {
                C1955i.m6945x(str, bool, taskCompletionSource);
            }
        });
        m6958z(taskCompletionSource, fVar);
    }

    @Override // p110P4.AbstractC1962p.a
    /* renamed from: f */
    public void mo6951f(final String str, AbstractC1962p.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.a
            @Override // java.lang.Runnable
            public final void run() {
                C1955i.m6942q(str, taskCompletionSource);
            }
        });
        m6958z(taskCompletionSource, fVar);
    }

    /* renamed from: o */
    public final Task m6952o(final C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.h
            @Override // java.lang.Runnable
            public final void run() {
                C1955i.this.m6954r(c4176f, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: p */
    public final AbstractC1962p.d m6953p(C4185o c4185o) {
        AbstractC1962p.d.a aVar = new AbstractC1962p.d.a();
        aVar.m6995b(c4185o.m17547b());
        aVar.m6996c(c4185o.m17548c());
        if (c4185o.m17551f() != null) {
            aVar.m6998e(c4185o.m17551f());
        }
        if (c4185o.m17552g() != null) {
            aVar.m6999f(c4185o.m17552g());
        }
        aVar.m6997d(c4185o.m17549d());
        aVar.m7000g(c4185o.m17553h());
        aVar.m7001h(c4185o.m17550e());
        return aVar.m6994a();
    }

    /* renamed from: r */
    public final /* synthetic */ void m6954r(C4176f c4176f, TaskCompletionSource taskCompletionSource) {
        try {
            AbstractC1962p.e.a aVar = new AbstractC1962p.e.a();
            aVar.m7010c(c4176f.m17533q());
            aVar.m7011d(m6953p(c4176f.m17534r()));
            aVar.m7009b(Boolean.valueOf(c4176f.m17537x()));
            aVar.m7012e((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(c4176f)));
            taskCompletionSource.setResult(aVar.m7008a());
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void m6955s(AbstractC1962p.d dVar, String str, TaskCompletionSource taskCompletionSource) {
        try {
            C4185o m17554a = new C4185o.b().m17555b(dVar.m6971b()).m17556c(dVar.m6972c()).m17557d(dVar.m6974e()).m17559f(dVar.m6975f()).m17560g(dVar.m6976g()).m17561h(dVar.m6977h()).m17558e(dVar.m6978i()).m17554a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (dVar.m6973d() != null) {
                f5913e.put(str, dVar.m6973d());
            }
            taskCompletionSource.setResult((AbstractC1962p.e) Tasks.await(m6952o(C4176f.m17521w(this.f5914c, m17554a, str))));
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: t */
    public final /* synthetic */ void m6956t(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.f5915d) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f5915d = true;
            }
            List m17516n = C4176f.m17516n(this.f5914c);
            ArrayList arrayList = new ArrayList(m17516n.size());
            Iterator it = m17516n.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC1962p.e) Tasks.await(m6952o((C4176f) it.next())));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: v */
    public final /* synthetic */ void m6957v(TaskCompletionSource taskCompletionSource) {
        try {
            C4185o m17546a = C4185o.m17546a(this.f5914c);
            if (m17546a == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(m6953p(m17546a));
            }
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        this.f5914c = null;
        AbstractC1966t.m7017e(bVar.m786b(), null);
        AbstractC1961o.m6963e(bVar.m786b(), null);
    }

    /* renamed from: z */
    public final void m6958z(TaskCompletionSource taskCompletionSource, final AbstractC1962p.f fVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: P4.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1955i.m6943u(AbstractC1962p.f.this, task);
            }
        });
    }
}
