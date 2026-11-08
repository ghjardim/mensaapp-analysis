package p093N1;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5469l;
import p042G.InterfaceC0339a;
import p079L1.C0901j;
import p371w5.C6934q;

/* renamed from: N1.g */
/* loaded from: classes.dex */
public final class C1256g implements InterfaceC0339a, Consumer {

    /* renamed from: a */
    public final Context f3978a;

    /* renamed from: b */
    public final ReentrantLock f3979b;

    /* renamed from: c */
    public C0901j f3980c;

    /* renamed from: d */
    public final Set f3981d;

    public C1256g(Context context) {
        AbstractC5469l.m23028e(context, "context");
        this.f3978a = context;
        this.f3979b = new ReentrantLock();
        this.f3981d = new LinkedHashSet();
    }

    @Override // p042G.InterfaceC0339a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(WindowLayoutInfo value) {
        AbstractC5469l.m23028e(value, "value");
        ReentrantLock reentrantLock = this.f3979b;
        reentrantLock.lock();
        try {
            this.f3980c = C1255f.f3977a.m4803c(this.f3978a, value);
            Iterator it = this.f3981d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0339a) it.next()).accept(this.f3980c);
            }
            C6934q c6934q = C6934q.f24811a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m4806b(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        ReentrantLock reentrantLock = this.f3979b;
        reentrantLock.lock();
        try {
            C0901j c0901j = this.f3980c;
            if (c0901j != null) {
                listener.accept(c0901j);
            }
            this.f3981d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final boolean m4807c() {
        return this.f3981d.isEmpty();
    }

    /* renamed from: d */
    public final void m4808d(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        ReentrantLock reentrantLock = this.f3979b;
        reentrantLock.lock();
        try {
            this.f3981d.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }
}
