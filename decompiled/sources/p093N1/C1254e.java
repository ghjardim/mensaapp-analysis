package p093N1;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5469l;
import p042G.InterfaceC0339a;
import p086M1.InterfaceC1145a;
import p371w5.C6934q;

/* renamed from: N1.e */
/* loaded from: classes.dex */
public final class C1254e implements InterfaceC1145a {

    /* renamed from: a */
    public final WindowLayoutComponent f3973a;

    /* renamed from: b */
    public final ReentrantLock f3974b;

    /* renamed from: c */
    public final Map f3975c;

    /* renamed from: d */
    public final Map f3976d;

    public C1254e(WindowLayoutComponent component) {
        AbstractC5469l.m23028e(component, "component");
        this.f3973a = component;
        this.f3974b = new ReentrantLock();
        this.f3975c = new LinkedHashMap();
        this.f3976d = new LinkedHashMap();
    }

    @Override // p086M1.InterfaceC1145a
    /* renamed from: a */
    public void mo4430a(InterfaceC0339a callback) {
        AbstractC5469l.m23028e(callback, "callback");
        ReentrantLock reentrantLock = this.f3974b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f3976d.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            C1256g c1256g = (C1256g) this.f3975c.get(context);
            if (c1256g == null) {
                reentrantLock.unlock();
                return;
            }
            c1256g.m4808d(callback);
            this.f3976d.remove(callback);
            if (c1256g.m4807c()) {
                this.f3975c.remove(context);
                this.f3973a.removeWindowLayoutInfoListener(c1256g);
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
        ReentrantLock reentrantLock = this.f3974b;
        reentrantLock.lock();
        try {
            C1256g c1256g = (C1256g) this.f3975c.get(context);
            if (c1256g != null) {
                c1256g.m4806b(callback);
                this.f3976d.put(callback, context);
                c6934q = C6934q.f24811a;
            } else {
                c6934q = null;
            }
            if (c6934q == null) {
                C1256g c1256g2 = new C1256g(context);
                this.f3975c.put(context, c1256g2);
                this.f3976d.put(callback, context);
                c1256g2.m4806b(callback);
                this.f3973a.addWindowLayoutInfoListener(context, c1256g2);
            }
            C6934q c6934q2 = C6934q.f24811a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
