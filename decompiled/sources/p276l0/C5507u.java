package p276l0;

import java.util.HashMap;
import java.util.Map;
import p256j$.util.DesugarCollections;

/* renamed from: l0.u */
/* loaded from: classes.dex */
public final class C5507u {

    /* renamed from: a */
    public final Map f19853a = new HashMap();

    /* renamed from: b */
    public Map f19854b;

    /* renamed from: a */
    public synchronized void m23129a(Map map) {
        this.f19854b = null;
        this.f19853a.clear();
        this.f19853a.putAll(map);
    }

    /* renamed from: b */
    public synchronized Map m23130b() {
        try {
            if (this.f19854b == null) {
                this.f19854b = DesugarCollections.unmodifiableMap(new HashMap(this.f19853a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19854b;
    }
}
