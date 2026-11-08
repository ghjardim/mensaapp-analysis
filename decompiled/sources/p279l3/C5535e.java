package p279l3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p137T3.InterfaceC2447b;
import p207d.AbstractC4094d;
import p219e3.C4176f;
import p262j3.InterfaceC5365a;
import p287m3.C5575a;
import p287m3.C5576b;
import p287m3.C5589o;
import p287m3.C5590p;

/* renamed from: l3.e */
/* loaded from: classes.dex */
public class C5535e implements InterfaceC5365a {

    /* renamed from: f */
    public static final String f19938f = "l3.e";

    /* renamed from: a */
    public final C5589o f19939a;

    /* renamed from: b */
    public final Executor f19940b;

    /* renamed from: c */
    public final Executor f19941c;

    /* renamed from: d */
    public final C5590p f19942d;

    /* renamed from: e */
    public final Task f19943e;

    public C5535e(C4176f c4176f, InterfaceC2447b interfaceC2447b, Executor executor, Executor executor2, Executor executor3) {
        AbstractC3802r.m15129k(c4176f);
        this.f19939a = new C5589o(c4176f);
        this.f19940b = executor;
        this.f19941c = executor3;
        this.f19942d = new C5590p();
        if (interfaceC2447b.get() == null) {
            this.f19943e = m23176f(c4176f, executor2);
        } else {
            AbstractC4094d.m17162a(interfaceC2447b.get());
            throw null;
        }
    }

    /* renamed from: f */
    public static Task m23176f(final C4176f c4176f, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: l3.c
            @Override // java.lang.Runnable
            public final void run() {
                C5535e.m23177g(C4176f.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public static /* synthetic */ void m23177g(C4176f c4176f, TaskCompletionSource taskCompletionSource) {
        C5537g c5537g = new C5537g(c4176f.m17532m(), c4176f.m17535s());
        String m23182a = c5537g.m23182a();
        if (m23182a == null) {
            m23182a = UUID.randomUUID().toString();
            c5537g.m23183b(m23182a);
        }
        Log.d(f19938f, "Enter this debug secret into the allow list in the Firebase Console for your project: " + m23182a);
        taskCompletionSource.setResult(m23182a);
    }

    /* renamed from: j */
    public static /* synthetic */ Task m23178j(C5575a c5575a) {
        return Tasks.forResult(C5576b.m23343c(c5575a));
    }

    @Override // p262j3.InterfaceC5365a
    /* renamed from: a */
    public Task mo22069a() {
        return this.f19943e.onSuccessTask(this.f19940b, new SuccessContinuation() { // from class: l3.a
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m23180i;
                m23180i = C5535e.this.m23180i((String) obj);
                return m23180i;
            }
        }).onSuccessTask(this.f19940b, new SuccessContinuation() { // from class: l3.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m23178j;
                m23178j = C5535e.m23178j((C5575a) obj);
                return m23178j;
            }
        });
    }

    /* renamed from: h */
    public final /* synthetic */ C5575a m23179h(C5536f c5536f) {
        return this.f19939a.m23388b(c5536f.m23181a().getBytes("UTF-8"), 2, this.f19942d);
    }

    /* renamed from: i */
    public final /* synthetic */ Task m23180i(String str) {
        final C5536f c5536f = new C5536f(str);
        return Tasks.call(this.f19941c, new Callable() { // from class: l3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5575a m23179h;
                m23179h = C5535e.this.m23179h(c5536f);
                return m23179h;
            }
        });
    }
}
