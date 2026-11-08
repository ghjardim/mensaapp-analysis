package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.C3473b;
import androidx.window.layout.adapter.sidecar.InterfaceC3472a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p042G.InterfaceC0339a;
import p058I1.C0627k;
import p079L1.C0901j;
import p086M1.InterfaceC1145a;
import p371w5.C6934q;
import p378x5.AbstractC7024o;

/* renamed from: androidx.window.layout.adapter.sidecar.b */
/* loaded from: classes.dex */
public final class C3473b implements InterfaceC1145a {

    /* renamed from: d */
    public static volatile C3473b f11651d;

    /* renamed from: a */
    public InterfaceC3472a f11653a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f11654b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public static final a f11650c = new a(null);

    /* renamed from: e */
    public static final ReentrantLock f11652e = new ReentrantLock();

    /* renamed from: androidx.window.layout.adapter.sidecar.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C3473b m13966a(Context context) {
            AbstractC5469l.m23028e(context, "context");
            if (C3473b.f11651d == null) {
                ReentrantLock reentrantLock = C3473b.f11652e;
                reentrantLock.lock();
                try {
                    if (C3473b.f11651d == null) {
                        C3473b.f11651d = new C3473b(C3473b.f11650c.m13967b(context));
                    }
                    C6934q c6934q = C6934q.f24811a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            C3473b c3473b = C3473b.f11651d;
            AbstractC5469l.m23025b(c3473b);
            return c3473b;
        }

        /* renamed from: b */
        public final InterfaceC3472a m13967b(Context context) {
            AbstractC5469l.m23028e(context, "context");
            try {
                if (!m13968c(SidecarCompat.f11638f.m13957c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.m13954n()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final boolean m13968c(C0627k c0627k) {
            return c0627k != null && c0627k.compareTo(C0627k.f2185f.m2530a()) >= 0;
        }

        public a() {
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.b$b */
    public final class b implements InterfaceC3472a.a {
        public b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.InterfaceC3472a.a
        /* renamed from: a */
        public void mo13958a(Activity activity, C0901j newLayout) {
            AbstractC5469l.m23028e(activity, "activity");
            AbstractC5469l.m23028e(newLayout, "newLayout");
            Iterator it = C3473b.this.m13964g().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (AbstractC5469l.m23024a(cVar.m13972d(), activity)) {
                    cVar.m13971b(newLayout);
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.b$c */
    public static final class c {

        /* renamed from: a */
        public final Activity f11656a;

        /* renamed from: b */
        public final Executor f11657b;

        /* renamed from: c */
        public final InterfaceC0339a f11658c;

        /* renamed from: d */
        public C0901j f11659d;

        public c(Activity activity, Executor executor, InterfaceC0339a callback) {
            AbstractC5469l.m23028e(activity, "activity");
            AbstractC5469l.m23028e(executor, "executor");
            AbstractC5469l.m23028e(callback, "callback");
            this.f11656a = activity;
            this.f11657b = executor;
            this.f11658c = callback;
        }

        /* renamed from: c */
        public static final void m13970c(c this$0, C0901j newLayoutInfo) {
            AbstractC5469l.m23028e(this$0, "this$0");
            AbstractC5469l.m23028e(newLayoutInfo, "$newLayoutInfo");
            this$0.f11658c.accept(newLayoutInfo);
        }

        /* renamed from: b */
        public final void m13971b(final C0901j newLayoutInfo) {
            AbstractC5469l.m23028e(newLayoutInfo, "newLayoutInfo");
            this.f11659d = newLayoutInfo;
            this.f11657b.execute(new Runnable() { // from class: O1.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3473b.c.m13970c(C3473b.c.this, newLayoutInfo);
                }
            });
        }

        /* renamed from: d */
        public final Activity m13972d() {
            return this.f11656a;
        }

        /* renamed from: e */
        public final InterfaceC0339a m13973e() {
            return this.f11658c;
        }

        /* renamed from: f */
        public final C0901j m13974f() {
            return this.f11659d;
        }
    }

    public C3473b(InterfaceC3472a interfaceC3472a) {
        this.f11653a = interfaceC3472a;
        InterfaceC3472a interfaceC3472a2 = this.f11653a;
        if (interfaceC3472a2 != null) {
            interfaceC3472a2.mo13946a(new b());
        }
    }

    @Override // p086M1.InterfaceC1145a
    /* renamed from: a */
    public void mo4430a(InterfaceC0339a callback) {
        AbstractC5469l.m23028e(callback, "callback");
        synchronized (f11652e) {
            try {
                if (this.f11653a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f11654b.iterator();
                while (it.hasNext()) {
                    c callbackWrapper = (c) it.next();
                    if (callbackWrapper.m13973e() == callback) {
                        AbstractC5469l.m23027d(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f11654b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m13963f(((c) it2.next()).m13972d());
                }
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p086M1.InterfaceC1145a
    /* renamed from: b */
    public void mo4431b(Context context, Executor executor, InterfaceC0339a callback) {
        Object obj;
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(executor, "executor");
        AbstractC5469l.m23028e(callback, "callback");
        C6934q c6934q = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f11652e;
            reentrantLock.lock();
            try {
                InterfaceC3472a interfaceC3472a = this.f11653a;
                if (interfaceC3472a == null) {
                    callback.accept(new C0901j(AbstractC7024o.m28861g()));
                    return;
                }
                boolean m13965h = m13965h(activity);
                c cVar = new c(activity, executor, callback);
                this.f11654b.add(cVar);
                if (m13965h) {
                    Iterator it = this.f11654b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (AbstractC5469l.m23024a(activity, ((c) obj).m13972d())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) obj;
                    C0901j m13974f = cVar2 != null ? cVar2.m13974f() : null;
                    if (m13974f != null) {
                        cVar.m13971b(m13974f);
                    }
                } else {
                    interfaceC3472a.mo13947b(activity);
                }
                C6934q c6934q2 = C6934q.f24811a;
                reentrantLock.unlock();
                c6934q = C6934q.f24811a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c6934q == null) {
            callback.accept(new C0901j(AbstractC7024o.m28861g()));
        }
    }

    /* renamed from: f */
    public final void m13963f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11654b;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC5469l.m23024a(((c) it.next()).m13972d(), activity)) {
                    return;
                }
            }
        }
        InterfaceC3472a interfaceC3472a = this.f11653a;
        if (interfaceC3472a != null) {
            interfaceC3472a.mo13948c(activity);
        }
    }

    /* renamed from: g */
    public final CopyOnWriteArrayList m13964g() {
        return this.f11654b;
    }

    /* renamed from: h */
    public final boolean m13965h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11654b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC5469l.m23024a(((c) it.next()).m13972d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
