package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3698k;
import com.google.android.gms.common.internal.AbstractC3782h;
import com.google.android.gms.common.internal.AbstractC3812w;
import com.google.android.gms.common.internal.C3751I;
import com.google.android.gms.common.internal.C3796o;
import com.google.android.gms.common.internal.C3804s;
import com.google.android.gms.common.internal.C3806t;
import com.google.android.gms.common.internal.C3810v;
import com.google.android.gms.common.internal.InterfaceC3814x;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p031E2.AbstractC0272h;
import p207d.AbstractC4094d;
import p256j$.util.concurrent.ConcurrentHashMap;
import p272k4.C5410A;
import p272k4.C5413D;
import p334s.C6309b;
import p368w2.C6861b;
import p368w2.C6869j;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes.dex */
public class C3688f implements Handler.Callback {

    /* renamed from: w */
    public static final Status f12343w = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: x */
    public static final Status f12344x = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: y */
    public static final Object f12345y = new Object();

    /* renamed from: z */
    public static C3688f f12346z;

    /* renamed from: c */
    public C3810v f12349c;

    /* renamed from: d */
    public InterfaceC3814x f12350d;

    /* renamed from: e */
    public final Context f12351e;

    /* renamed from: f */
    public final C6869j f12352f;

    /* renamed from: n */
    public final C3751I f12353n;

    /* renamed from: u */
    public final Handler f12360u;

    /* renamed from: v */
    public volatile boolean f12361v;

    /* renamed from: a */
    public long f12347a = 10000;

    /* renamed from: b */
    public boolean f12348b = false;

    /* renamed from: o */
    public final AtomicInteger f12354o = new AtomicInteger(1);

    /* renamed from: p */
    public final AtomicInteger f12355p = new AtomicInteger(0);

    /* renamed from: q */
    public final Map f12356q = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: r */
    public C3653B f12357r = null;

    /* renamed from: s */
    public final Set f12358s = new C6309b();

    /* renamed from: t */
    public final Set f12359t = new C6309b();

    public C3688f(Context context, Looper looper, C6869j c6869j) {
        this.f12361v = true;
        this.f12351e = context;
        zau zauVar = new zau(looper, this);
        this.f12360u = zauVar;
        this.f12352f = c6869j;
        this.f12353n = new C3751I(c6869j);
        if (AbstractC0272h.m1117a(context)) {
            this.f12361v = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m14919a() {
        synchronized (f12345y) {
            try {
                C3688f c3688f = f12346z;
                if (c3688f != null) {
                    c3688f.f12355p.incrementAndGet();
                    Handler handler = c3688f.f12360u;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public static Status m14921g(C3680b c3680b, C6861b c6861b) {
        return new Status(c6861b, "API: " + c3680b.m14904b() + " is not available on this device. Connection failed with: " + String.valueOf(c6861b));
    }

    /* renamed from: u */
    public static C3688f m14929u(Context context) {
        C3688f c3688f;
        synchronized (f12345y) {
            try {
                if (f12346z == null) {
                    f12346z = new C3688f(context.getApplicationContext(), AbstractC3782h.m15079c().getLooper(), C6869j.m28253n());
                }
                c3688f = f12346z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3688f;
    }

    /* renamed from: C */
    public final void m14933C(AbstractC3647e abstractC3647e, int i7, AbstractC3684d abstractC3684d) {
        this.f12360u.sendMessage(this.f12360u.obtainMessage(4, new C3675X(new C3697j0(i7, abstractC3684d), this.f12355p.get(), abstractC3647e)));
    }

    /* renamed from: D */
    public final void m14934D(AbstractC3647e abstractC3647e, int i7, AbstractC3720v abstractC3720v, TaskCompletionSource taskCompletionSource, InterfaceC3716t interfaceC3716t) {
        m14946k(taskCompletionSource, abstractC3720v.m14987d(), abstractC3647e);
        this.f12360u.sendMessage(this.f12360u.obtainMessage(4, new C3675X(new C3699k0(i7, abstractC3720v, taskCompletionSource, interfaceC3716t), this.f12355p.get(), abstractC3647e)));
    }

    /* renamed from: E */
    public final void m14935E(C3796o c3796o, int i7, long j7, int i8) {
        this.f12360u.sendMessage(this.f12360u.obtainMessage(18, new C3674W(c3796o, i7, j7, i8)));
    }

    /* renamed from: F */
    public final void m14936F(C6861b c6861b, int i7) {
        if (m14942f(c6861b, i7)) {
            return;
        }
        Handler handler = this.f12360u;
        handler.sendMessage(handler.obtainMessage(5, i7, 0, c6861b));
    }

    /* renamed from: G */
    public final void m14937G() {
        Handler handler = this.f12360u;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: H */
    public final void m14938H(AbstractC3647e abstractC3647e) {
        Handler handler = this.f12360u;
        handler.sendMessage(handler.obtainMessage(7, abstractC3647e));
    }

    /* renamed from: b */
    public final void m14939b(C3653B c3653b) {
        synchronized (f12345y) {
            try {
                if (this.f12357r != c3653b) {
                    this.f12357r = c3653b;
                    this.f12358s.clear();
                }
                this.f12358s.addAll(c3653b.m14835i());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m14940c(C3653B c3653b) {
        synchronized (f12345y) {
            try {
                if (this.f12357r == c3653b) {
                    this.f12357r = null;
                    this.f12358s.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final boolean m14941e() {
        if (this.f12348b) {
            return false;
        }
        C3806t m15136a = C3804s.m15135b().m15136a();
        if (m15136a != null && !m15136a.m15142z0()) {
            return false;
        }
        int m15029a = this.f12353n.m15029a(this.f12351e, 203400000);
        return m15029a == -1 || m15029a == 0;
    }

    /* renamed from: f */
    public final boolean m14942f(C6861b c6861b, int i7) {
        return this.f12352f.m28271x(this.f12351e, c6861b, i7);
    }

    /* renamed from: h */
    public final C3663K m14943h(AbstractC3647e abstractC3647e) {
        Map map = this.f12356q;
        C3680b apiKey = abstractC3647e.getApiKey();
        C3663K c3663k = (C3663K) map.get(apiKey);
        if (c3663k == null) {
            c3663k = new C3663K(this, abstractC3647e);
            this.f12356q.put(apiKey, c3663k);
        }
        if (c3663k.m14864c()) {
            this.f12359t.add(apiKey);
        }
        c3663k.m14854E();
        return c3663k;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C3680b c3680b;
        boolean m14879r;
        C3680b c3680b2;
        C3680b c3680b3;
        C3680b c3680b4;
        C3680b c3680b5;
        int i7 = message.what;
        C3663K c3663k = null;
        switch (i7) {
            case 1:
                this.f12347a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f12360u.removeMessages(12);
                for (C3680b c3680b6 : this.f12356q.keySet()) {
                    Handler handler = this.f12360u;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c3680b6), this.f12347a);
                }
                return true;
            case 2:
                AbstractC4094d.m17162a(message.obj);
                throw null;
            case 3:
                for (C3663K c3663k2 : this.f12356q.values()) {
                    c3663k2.m14853D();
                    c3663k2.m14854E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C3675X c3675x = (C3675X) message.obj;
                C3663K c3663k3 = (C3663K) this.f12356q.get(c3675x.f12320c.getApiKey());
                if (c3663k3 == null) {
                    c3663k3 = m14943h(c3675x.f12320c);
                }
                if (!c3663k3.m14864c() || this.f12355p.get() == c3675x.f12319b) {
                    c3663k3.m14855F(c3675x.f12318a);
                } else {
                    c3675x.f12318a.mo14951a(f12343w);
                    c3663k3.m14860K();
                }
                return true;
            case 5:
                int i8 = message.arg1;
                C6861b c6861b = (C6861b) message.obj;
                Iterator it = this.f12356q.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3663K c3663k4 = (C3663K) it.next();
                        if (c3663k4.m14880s() == i8) {
                            c3663k = c3663k4;
                        }
                    }
                }
                if (c3663k == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i8 + " while trying to fail enqueued calls.", new Exception());
                } else if (c6861b.m28242x0() == 13) {
                    c3663k.m14869h(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f12352f.mo28256e(c6861b.m28242x0()) + ": " + c6861b.m28243y0()));
                } else {
                    c3680b = c3663k.f12285c;
                    c3663k.m14869h(m14921g(c3680b, c6861b));
                }
                return true;
            case 6:
                if (this.f12351e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C3682c.m14906c((Application) this.f12351e.getApplicationContext());
                    ComponentCallbacks2C3682c.m14905b().m14907a(new C3658F(this));
                    if (!ComponentCallbacks2C3682c.m14905b().m14909e(true)) {
                        this.f12347a = 300000L;
                    }
                }
                return true;
            case 7:
                m14943h((AbstractC3647e) message.obj);
                return true;
            case 9:
                if (this.f12356q.containsKey(message.obj)) {
                    ((C3663K) this.f12356q.get(message.obj)).m14859J();
                }
                return true;
            case 10:
                Iterator it2 = this.f12359t.iterator();
                while (it2.hasNext()) {
                    C3663K c3663k5 = (C3663K) this.f12356q.remove((C3680b) it2.next());
                    if (c3663k5 != null) {
                        c3663k5.m14860K();
                    }
                }
                this.f12359t.clear();
                return true;
            case 11:
                if (this.f12356q.containsKey(message.obj)) {
                    ((C3663K) this.f12356q.get(message.obj)).m14861L();
                }
                return true;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (this.f12356q.containsKey(message.obj)) {
                    ((C3663K) this.f12356q.get(message.obj)).m14865d();
                }
                return true;
            case 14:
                C3655C c3655c = (C3655C) message.obj;
                C3680b m14840a = c3655c.m14840a();
                if (this.f12356q.containsKey(m14840a)) {
                    m14879r = ((C3663K) this.f12356q.get(m14840a)).m14879r(false);
                    c3655c.m14841b().setResult(Boolean.valueOf(m14879r));
                } else {
                    c3655c.m14841b().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                C3665M c3665m = (C3665M) message.obj;
                Map map = this.f12356q;
                c3680b2 = c3665m.f12296a;
                if (map.containsKey(c3680b2)) {
                    Map map2 = this.f12356q;
                    c3680b3 = c3665m.f12296a;
                    C3663K.m14845B((C3663K) map2.get(c3680b3), c3665m);
                }
                return true;
            case 16:
                C3665M c3665m2 = (C3665M) message.obj;
                Map map3 = this.f12356q;
                c3680b4 = c3665m2.f12296a;
                if (map3.containsKey(c3680b4)) {
                    Map map4 = this.f12356q;
                    c3680b5 = c3665m2.f12296a;
                    C3663K.m14846C((C3663K) map4.get(c3680b5), c3665m2);
                }
                return true;
            case 17:
                m14945j();
                return true;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                C3674W c3674w = (C3674W) message.obj;
                if (c3674w.f12316c == 0) {
                    m14944i().mo15157a(new C3810v(c3674w.f12315b, Arrays.asList(c3674w.f12314a)));
                } else {
                    C3810v c3810v = this.f12349c;
                    if (c3810v != null) {
                        List m15150y0 = c3810v.m15150y0();
                        if (c3810v.m15149x0() != c3674w.f12315b || (m15150y0 != null && m15150y0.size() >= c3674w.f12317d)) {
                            this.f12360u.removeMessages(17);
                            m14945j();
                        } else {
                            this.f12349c.m15151z0(c3674w.f12314a);
                        }
                    }
                    if (this.f12349c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c3674w.f12314a);
                        this.f12349c = new C3810v(c3674w.f12315b, arrayList);
                        Handler handler2 = this.f12360u;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c3674w.f12316c);
                    }
                }
                return true;
            case 19:
                this.f12348b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
    }

    /* renamed from: i */
    public final InterfaceC3814x m14944i() {
        if (this.f12350d == null) {
            this.f12350d = AbstractC3812w.m15152a(this.f12351e);
        }
        return this.f12350d;
    }

    /* renamed from: j */
    public final void m14945j() {
        C3810v c3810v = this.f12349c;
        if (c3810v != null) {
            if (c3810v.m15149x0() > 0 || m14941e()) {
                m14944i().mo15157a(c3810v);
            }
            this.f12349c = null;
        }
    }

    /* renamed from: k */
    public final void m14946k(TaskCompletionSource taskCompletionSource, int i7, AbstractC3647e abstractC3647e) {
        C3673V m14900a;
        if (i7 == 0 || (m14900a = C3673V.m14900a(this, i7, abstractC3647e.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f12360u;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.E
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, m14900a);
    }

    /* renamed from: l */
    public final int m14947l() {
        return this.f12354o.getAndIncrement();
    }

    /* renamed from: t */
    public final C3663K m14948t(C3680b c3680b) {
        return (C3663K) this.f12356q.get(c3680b);
    }

    /* renamed from: w */
    public final Task m14949w(AbstractC3647e abstractC3647e) {
        C3655C c3655c = new C3655C(abstractC3647e.getApiKey());
        this.f12360u.sendMessage(this.f12360u.obtainMessage(14, c3655c));
        return c3655c.m14841b().getTask();
    }

    /* renamed from: x */
    public final Task m14950x(AbstractC3647e abstractC3647e, C3698k.a aVar, int i7) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m14946k(taskCompletionSource, i7, abstractC3647e);
        this.f12360u.sendMessage(this.f12360u.obtainMessage(13, new C3675X(new C3701l0(aVar, taskCompletionSource), this.f12355p.get(), abstractC3647e)));
        return taskCompletionSource.getTask();
    }
}
