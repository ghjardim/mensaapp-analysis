package p157W2;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p207d.AbstractC4094d;

/* renamed from: W2.f */
/* loaded from: classes.dex */
public final class C2680f {

    /* renamed from: o */
    public static final Map f7918o = new HashMap();

    /* renamed from: a */
    public final Context f7919a;

    /* renamed from: b */
    public final C2667G f7920b;

    /* renamed from: c */
    public final String f7921c;

    /* renamed from: g */
    public boolean f7925g;

    /* renamed from: h */
    public final Intent f7926h;

    /* renamed from: i */
    public final InterfaceC2674N f7927i;

    /* renamed from: m */
    public ServiceConnection f7931m;

    /* renamed from: n */
    public IInterface f7932n;

    /* renamed from: d */
    public final List f7922d = new ArrayList();

    /* renamed from: e */
    public final Set f7923e = new HashSet();

    /* renamed from: f */
    public final Object f7924f = new Object();

    /* renamed from: k */
    public final IBinder.DeathRecipient f7929k = new IBinder.DeathRecipient() { // from class: W2.I
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2680f.m9160k(C2680f.this);
        }
    };

    /* renamed from: l */
    public final AtomicInteger f7930l = new AtomicInteger(0);

    /* renamed from: j */
    public final WeakReference f7928j = new WeakReference(null);

    public C2680f(Context context, C2667G c2667g, String str, Intent intent, InterfaceC2674N interfaceC2674N, InterfaceC2673M interfaceC2673M) {
        this.f7919a = context;
        this.f7920b = c2667g;
        this.f7921c = str;
        this.f7926h = intent;
        this.f7927i = interfaceC2674N;
    }

    /* renamed from: k */
    public static /* synthetic */ void m9160k(C2680f c2680f) {
        c2680f.f7920b.m9144d("reportBinderDeath", new Object[0]);
        AbstractC4094d.m17162a(c2680f.f7928j.get());
        c2680f.f7920b.m9144d("%s : Binder has died.", c2680f.f7921c);
        Iterator it = c2680f.f7922d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC2668H) it.next()).mo9146a(c2680f.m9174w());
        }
        c2680f.f7922d.clear();
        synchronized (c2680f.f7924f) {
            c2680f.m9175x();
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m9164o(final C2680f c2680f, final TaskCompletionSource taskCompletionSource) {
        c2680f.f7923e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: W2.J
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2680f.this.m9172u(taskCompletionSource, task);
            }
        });
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m9166q(C2680f c2680f, AbstractRunnableC2668H abstractRunnableC2668H) {
        if (c2680f.f7932n != null || c2680f.f7925g) {
            if (!c2680f.f7925g) {
                abstractRunnableC2668H.run();
                return;
            } else {
                c2680f.f7920b.m9144d("Waiting to bind to the service.", new Object[0]);
                c2680f.f7922d.add(abstractRunnableC2668H);
                return;
            }
        }
        c2680f.f7920b.m9144d("Initiate binding to the service.", new Object[0]);
        c2680f.f7922d.add(abstractRunnableC2668H);
        ServiceConnectionC2679e serviceConnectionC2679e = new ServiceConnectionC2679e(c2680f, null);
        c2680f.f7931m = serviceConnectionC2679e;
        c2680f.f7925g = true;
        if (c2680f.f7919a.bindService(c2680f.f7926h, serviceConnectionC2679e, 1)) {
            return;
        }
        c2680f.f7920b.m9144d("Failed to bind to the service.", new Object[0]);
        c2680f.f7925g = false;
        Iterator it = c2680f.f7922d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC2668H) it.next()).mo9146a(new C2681g());
        }
        c2680f.f7922d.clear();
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m9167r(C2680f c2680f) {
        c2680f.f7920b.m9144d("linkToDeath", new Object[0]);
        try {
            c2680f.f7932n.asBinder().linkToDeath(c2680f.f7929k, 0);
        } catch (RemoteException e7) {
            c2680f.f7920b.m9143c(e7, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ void m9168s(C2680f c2680f) {
        c2680f.f7920b.m9144d("unlinkToDeath", new Object[0]);
        c2680f.f7932n.asBinder().unlinkToDeath(c2680f.f7929k, 0);
    }

    /* renamed from: c */
    public final Handler m9169c() {
        Handler handler;
        Map map = f7918o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f7921c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f7921c, 10);
                    handlerThread.start();
                    map.put(this.f7921c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f7921c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m9170e() {
        return this.f7932n;
    }

    /* renamed from: t */
    public final void m9171t(AbstractRunnableC2668H abstractRunnableC2668H, TaskCompletionSource taskCompletionSource) {
        m9169c().post(new C2671K(this, abstractRunnableC2668H.m9148c(), taskCompletionSource, abstractRunnableC2668H));
    }

    /* renamed from: u */
    public final /* synthetic */ void m9172u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f7924f) {
            this.f7923e.remove(taskCompletionSource);
        }
    }

    /* renamed from: v */
    public final void m9173v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f7924f) {
            this.f7923e.remove(taskCompletionSource);
        }
        m9169c().post(new C2672L(this));
    }

    /* renamed from: w */
    public final RemoteException m9174w() {
        return new RemoteException(String.valueOf(this.f7921c).concat(" : Binder has died."));
    }

    /* renamed from: x */
    public final void m9175x() {
        Iterator it = this.f7923e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m9174w());
        }
        this.f7923e.clear();
    }
}
