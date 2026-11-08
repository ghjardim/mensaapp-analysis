package p338s3;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;
import p122R2.AbstractC2232d;
import p122R2.C2234f;
import p122R2.InterfaceC2233e;
import p219e3.C4176f;
import p262j3.InterfaceC5365a;
import p287m3.C5575a;
import p287m3.C5576b;
import p287m3.C5589o;
import p287m3.C5590p;
import p368w2.C6869j;

/* renamed from: s3.g */
/* loaded from: classes.dex */
public class C6389g implements InterfaceC5365a {

    /* renamed from: a */
    public final Task f23077a;

    /* renamed from: b */
    public final C5589o f23078b;

    /* renamed from: c */
    public final Executor f23079c;

    /* renamed from: d */
    public final Executor f23080d;

    /* renamed from: e */
    public final C5590p f23081e;

    /* renamed from: f */
    public final String f23082f;

    public C6389g(C4176f c4176f, Executor executor, Executor executor2, Executor executor3) {
        this(c4176f, new C5589o(c4176f), C6869j.m28253n(), executor, executor2, executor3);
    }

    /* renamed from: g */
    public static String m26691g(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 9 ? i7 != 18 ? "Unknown error." : "Google Play services is currently being updated on this device." : "The version of the Google Play services installed on this device is not authentic." : "The installed version of Google Play services has been disabled on this device." : "The installed version of Google Play services is out of date." : "Google Play services is missing on this device.";
    }

    /* renamed from: h */
    public static Task m26692h(final Context context, final C6869j c6869j, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: s3.b
            @Override // java.lang.Runnable
            public final void run() {
                C6389g.m26694l(C6869j.this, context, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: j */
    public static /* synthetic */ Task m26693j(C5575a c5575a) {
        return Tasks.forResult(C5576b.m23343c(c5575a));
    }

    /* renamed from: l */
    public static /* synthetic */ void m26694l(C6869j c6869j, Context context, TaskCompletionSource taskCompletionSource) {
        int mo28257g = c6869j.mo28257g(context);
        if (mo28257g == 0) {
            taskCompletionSource.setResult(AbstractC2232d.m7656a(context));
            return;
        }
        taskCompletionSource.setException(new IllegalStateException("SafetyNet unavailable; unable to connect to Google Play Services: " + m26691g(mo28257g)));
    }

    @Override // p262j3.InterfaceC5365a
    /* renamed from: a */
    public Task mo22069a() {
        return this.f23077a.onSuccessTask(this.f23079c, new SuccessContinuation() { // from class: s3.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m26697k;
                m26697k = C6389g.this.m26697k((C2234f) obj);
                return m26697k;
            }
        }).onSuccessTask(this.f23079c, new SuccessContinuation() { // from class: s3.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C6389g.this.m26695f((InterfaceC2233e.a) obj);
            }
        });
    }

    /* renamed from: f */
    public Task m26695f(InterfaceC2233e.a aVar) {
        AbstractC3802r.m15129k(aVar);
        String m7657c = aVar.m7657c();
        AbstractC3802r.m15123e(m7657c);
        final C6383a c6383a = new C6383a(m7657c);
        return Tasks.call(this.f23080d, new Callable() { // from class: s3.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5575a m26696i;
                m26696i = C6389g.this.m26696i(c6383a);
                return m26696i;
            }
        }).onSuccessTask(this.f23079c, new SuccessContinuation() { // from class: s3.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m26693j;
                m26693j = C6389g.m26693j((C5575a) obj);
                return m26693j;
            }
        });
    }

    /* renamed from: i */
    public final /* synthetic */ C5575a m26696i(C6383a c6383a) {
        return this.f23078b.m23388b(c6383a.m26686a().getBytes("UTF-8"), 1, this.f23081e);
    }

    /* renamed from: k */
    public final /* synthetic */ Task m26697k(C2234f c2234f) {
        return c2234f.m7659d(StringUtils.EMPTY.getBytes(), this.f23082f);
    }

    public C6389g(C4176f c4176f, C5589o c5589o, C6869j c6869j, Executor executor, Executor executor2, Executor executor3) {
        AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15129k(c5589o);
        AbstractC3802r.m15129k(c6869j);
        AbstractC3802r.m15129k(executor2);
        this.f23082f = c4176f.m17534r().m17547b();
        this.f23079c = executor;
        this.f23080d = executor3;
        this.f23077a = m26692h(c4176f.m17532m(), c6869j, executor2);
        this.f23078b = c5589o;
        this.f23081e = new C5590p();
    }
}
