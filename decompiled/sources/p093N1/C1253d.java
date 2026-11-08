package p093N1;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5467j;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5481x;
import p042G.InterfaceC0339a;
import p058I1.C0620d;
import p069J5.InterfaceC0800l;
import p086M1.InterfaceC1145a;
import p371w5.C6934q;
import p378x5.AbstractC7024o;

/* renamed from: N1.d */
/* loaded from: classes.dex */
public final class C1253d implements InterfaceC1145a {

    /* renamed from: a */
    public final WindowLayoutComponent f3967a;

    /* renamed from: b */
    public final C0620d f3968b;

    /* renamed from: c */
    public final ReentrantLock f3969c;

    /* renamed from: d */
    public final Map f3970d;

    /* renamed from: e */
    public final Map f3971e;

    /* renamed from: f */
    public final Map f3972f;

    /* renamed from: N1.d$a */
    public /* synthetic */ class a extends AbstractC5467j implements InterfaceC0800l {
        public a(Object obj) {
            super(1, obj, C1256g.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        /* renamed from: f */
        public final void m4800f(WindowLayoutInfo p02) {
            AbstractC5469l.m23028e(p02, "p0");
            ((C1256g) this.receiver).accept(p02);
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4800f((WindowLayoutInfo) obj);
            return C6934q.f24811a;
        }
    }

    public C1253d(WindowLayoutComponent component, C0620d consumerAdapter) {
        AbstractC5469l.m23028e(component, "component");
        AbstractC5469l.m23028e(consumerAdapter, "consumerAdapter");
        this.f3967a = component;
        this.f3968b = consumerAdapter;
        this.f3969c = new ReentrantLock();
        this.f3970d = new LinkedHashMap();
        this.f3971e = new LinkedHashMap();
        this.f3972f = new LinkedHashMap();
    }

    @Override // p086M1.InterfaceC1145a
    /* renamed from: a */
    public void mo4430a(InterfaceC0339a callback) {
        AbstractC5469l.m23028e(callback, "callback");
        ReentrantLock reentrantLock = this.f3969c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f3971e.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            C1256g c1256g = (C1256g) this.f3970d.get(context);
            if (c1256g == null) {
                reentrantLock.unlock();
                return;
            }
            c1256g.m4808d(callback);
            this.f3971e.remove(callback);
            if (c1256g.m4807c()) {
                this.f3970d.remove(context);
                C0620d.b bVar = (C0620d.b) this.f3972f.remove(c1256g);
                if (bVar != null) {
                    bVar.mo2516b();
                }
            }
            C6934q c6934q = C6934q.f24811a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p086M1.InterfaceC1145a
    /* renamed from: b */
    public void mo4431b(Context context, Executor executor, InterfaceC0339a callback) {
        C6934q c6934q;
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(executor, "executor");
        AbstractC5469l.m23028e(callback, "callback");
        ReentrantLock reentrantLock = this.f3969c;
        reentrantLock.lock();
        try {
            C1256g c1256g = (C1256g) this.f3970d.get(context);
            if (c1256g != null) {
                c1256g.m4806b(callback);
                this.f3971e.put(callback, context);
                c6934q = C6934q.f24811a;
            } else {
                c6934q = null;
            }
            if (c6934q == null) {
                C1256g c1256g2 = new C1256g(context);
                this.f3970d.put(context, c1256g2);
                this.f3971e.put(callback, context);
                c1256g2.m4806b(callback);
                if (!(context instanceof Activity)) {
                    c1256g2.accept(new WindowLayoutInfo(AbstractC7024o.m28861g()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f3972f.put(c1256g2, this.f3968b.m2509c(this.f3967a, AbstractC5481x.m23040b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(c1256g2)));
                }
            }
            C6934q c6934q2 = C6934q.f24811a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
