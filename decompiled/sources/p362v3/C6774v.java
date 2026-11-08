package p362v3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p039F3.C0333a;
import p039F3.InterfaceC0334b;
import p039F3.InterfaceC0335c;
import p039F3.InterfaceC0336d;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: v3.v */
/* loaded from: classes.dex */
public class C6774v implements InterfaceC0336d, InterfaceC0335c {

    /* renamed from: a */
    public final Map f24367a = new HashMap();

    /* renamed from: b */
    public Queue f24368b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f24369c;

    public C6774v(Executor executor) {
        this.f24369c = executor;
    }

    /* renamed from: h */
    public static /* synthetic */ void m27808h(Map.Entry entry, C0333a c0333a) {
        ((InterfaceC0334b) entry.getKey()).mo1337a(c0333a);
    }

    @Override // p039F3.InterfaceC0335c
    /* renamed from: a */
    public void mo1338a(final C0333a c0333a) {
        AbstractC6750E.m27702b(c0333a);
        synchronized (this) {
            try {
                Queue queue = this.f24368b;
                if (queue != null) {
                    queue.add(c0333a);
                    return;
                }
                for (final Map.Entry entry : m27810g(c0333a)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: v3.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6774v.m27808h(entry, c0333a);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p039F3.InterfaceC0336d
    /* renamed from: b */
    public synchronized void mo1339b(Class cls, InterfaceC0334b interfaceC0334b) {
        AbstractC6750E.m27702b(cls);
        AbstractC6750E.m27702b(interfaceC0334b);
        if (this.f24367a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f24367a.get(cls);
            concurrentHashMap.remove(interfaceC0334b);
            if (concurrentHashMap.isEmpty()) {
                this.f24367a.remove(cls);
            }
        }
    }

    @Override // p039F3.InterfaceC0336d
    /* renamed from: c */
    public void mo1340c(Class cls, InterfaceC0334b interfaceC0334b) {
        mo1341d(cls, this.f24369c, interfaceC0334b);
    }

    @Override // p039F3.InterfaceC0336d
    /* renamed from: d */
    public synchronized void mo1341d(Class cls, Executor executor, InterfaceC0334b interfaceC0334b) {
        try {
            AbstractC6750E.m27702b(cls);
            AbstractC6750E.m27702b(interfaceC0334b);
            AbstractC6750E.m27702b(executor);
            if (!this.f24367a.containsKey(cls)) {
                this.f24367a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f24367a.get(cls)).put(interfaceC0334b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public void m27809f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f24368b;
                if (queue != null) {
                    this.f24368b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                mo1338a((C0333a) it.next());
            }
        }
    }

    /* renamed from: g */
    public final synchronized Set m27810g(C0333a c0333a) {
        Map map;
        try {
            map = (Map) this.f24367a.get(c0333a.m1336b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }
}
