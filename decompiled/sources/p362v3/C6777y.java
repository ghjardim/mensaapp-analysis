package p362v3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p137T3.InterfaceC2447b;
import p256j$.util.DesugarCollections;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: v3.y */
/* loaded from: classes.dex */
public class C6777y implements InterfaceC2447b {

    /* renamed from: b */
    public volatile Set f24374b = null;

    /* renamed from: a */
    public volatile Set f24373a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C6777y(Collection collection) {
        this.f24373a.addAll(collection);
    }

    /* renamed from: b */
    public static C6777y m27811b(Collection collection) {
        return new C6777y((Set) collection);
    }

    /* renamed from: a */
    public synchronized void m27812a(InterfaceC2447b interfaceC2447b) {
        try {
            if (this.f24374b == null) {
                this.f24373a.add(interfaceC2447b);
            } else {
                this.f24374b.add(interfaceC2447b.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p137T3.InterfaceC2447b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f24374b == null) {
            synchronized (this) {
                try {
                    if (this.f24374b == null) {
                        this.f24374b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m27814d();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f24374b);
    }

    /* renamed from: d */
    public final synchronized void m27814d() {
        try {
            Iterator it = this.f24373a.iterator();
            while (it.hasNext()) {
                this.f24374b.add(((InterfaceC2447b) it.next()).get());
            }
            this.f24373a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
