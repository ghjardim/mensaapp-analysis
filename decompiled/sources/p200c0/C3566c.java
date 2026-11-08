package p200c0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6934q;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public final class C3566c {

    /* renamed from: a */
    public final C3565b f12024a = new C3565b();

    /* renamed from: b */
    public final Map f12025b = new LinkedHashMap();

    /* renamed from: c */
    public final Set f12026c = new LinkedHashSet();

    /* renamed from: d */
    public volatile boolean f12027d;

    /* renamed from: d */
    public final void m14389d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(closeable, "closeable");
        if (this.f12027d) {
            m14391f(closeable);
            return;
        }
        synchronized (this.f12024a) {
            autoCloseable = (AutoCloseable) this.f12025b.put(key, closeable);
        }
        m14391f(autoCloseable);
    }

    /* renamed from: e */
    public final void m14390e() {
        if (this.f12027d) {
            return;
        }
        this.f12027d = true;
        synchronized (this.f12024a) {
            try {
                Iterator it = this.f12025b.values().iterator();
                while (it.hasNext()) {
                    m14391f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f12026c.iterator();
                while (it2.hasNext()) {
                    m14391f((AutoCloseable) it2.next());
                }
                this.f12026c.clear();
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m14391f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* renamed from: g */
    public final AutoCloseable m14392g(String key) {
        AutoCloseable autoCloseable;
        AbstractC5469l.m23028e(key, "key");
        synchronized (this.f12024a) {
            autoCloseable = (AutoCloseable) this.f12025b.get(key);
        }
        return autoCloseable;
    }
}
