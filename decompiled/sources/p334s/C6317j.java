package p334s;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import p342t.C6405b;
import p342t.C6406c;
import p371w5.C6934q;

/* renamed from: s.j */
/* loaded from: classes.dex */
public class C6317j {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final C6405b lock;
    private final C6406c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public C6317j(int i7) {
        this.maxSize = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new C6406c(0, 0.75f);
        this.lock = new C6405b();
    }

    /* renamed from: a */
    public final int m26449a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object key) {
        AbstractC5469l.m23028e(key, "key");
        return null;
    }

    public final int createCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.createCount;
        }
        return i7;
    }

    public void entryRemoved(boolean z6, Object key, Object oldValue, Object obj) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.evictionCount;
        }
        return i7;
    }

    public final Object get(Object key) {
        Object m26755d;
        AbstractC5469l.m23028e(key, "key");
        synchronized (this.lock) {
            Object m26752a = this.map.m26752a(key);
            if (m26752a != null) {
                this.hitCount++;
                return m26752a;
            }
            this.missCount++;
            Object create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    m26755d = this.map.m26755d(key, create);
                    if (m26755d != null) {
                        this.map.m26755d(key, m26755d);
                    } else {
                        this.size += m26449a(key, create);
                        C6934q c6934q = C6934q.f24811a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (m26755d != null) {
                entryRemoved(false, key, create, m26755d);
                return m26755d;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.hitCount;
        }
        return i7;
    }

    public final int maxSize() {
        int i7;
        synchronized (this.lock) {
            i7 = this.maxSize;
        }
        return i7;
    }

    public final int missCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.missCount;
        }
        return i7;
    }

    public final Object put(Object key, Object value) {
        Object m26755d;
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += m26449a(key, value);
                m26755d = this.map.m26755d(key, value);
                if (m26755d != null) {
                    this.size -= m26449a(key, m26755d);
                }
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m26755d != null) {
            entryRemoved(false, key, m26755d, value);
        }
        trimToSize(this.maxSize);
        return m26755d;
    }

    public final int putCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.putCount;
        }
        return i7;
    }

    public final Object remove(Object key) {
        Object m26756e;
        AbstractC5469l.m23028e(key, "key");
        synchronized (this.lock) {
            try {
                m26756e = this.map.m26756e(key);
                if (m26756e != null) {
                    this.size -= m26449a(key, m26756e);
                }
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m26756e != null) {
            entryRemoved(false, key, m26756e, null);
        }
        return m26756e;
    }

    public void resize(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i7;
            C6934q c6934q = C6934q.f24811a;
        }
        trimToSize(i7);
    }

    public final int size() {
        int i7;
        synchronized (this.lock) {
            i7 = this.size;
        }
        return i7;
    }

    public int sizeOf(Object key, Object value) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                for (Map.Entry entry : this.map.m26753b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i7 = this.hitCount;
                int i8 = this.missCount + i7;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            t.b r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L57
            t.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.m26754c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L57
            goto L16
        L14:
            r6 = move-exception
            goto L5f
        L16:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L55
            t.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.m26754c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L55
        L23:
            t.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.m26753b()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = p378x5.AbstractC7032w.m28899x(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            monitor-exit(r0)
            return
        L33:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            t.c r3 = r5.map     // Catch: java.lang.Throwable -> L14
            r3.m26756e(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.size     // Catch: java.lang.Throwable -> L14
            int r4 = r5.m26449a(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L55:
            monitor-exit(r0)
            return
        L57:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L5f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p334s.C6317j.trimToSize(int):void");
    }
}
