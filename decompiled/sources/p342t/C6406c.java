package p342t;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: t.c */
/* loaded from: classes.dex */
public final class C6406c {

    /* renamed from: a */
    public final LinkedHashMap f23129a;

    public C6406c(int i7, float f7) {
        this.f23129a = new LinkedHashMap(i7, f7, true);
    }

    /* renamed from: a */
    public final Object m26752a(Object key) {
        AbstractC5469l.m23028e(key, "key");
        return this.f23129a.get(key);
    }

    /* renamed from: b */
    public final Set m26753b() {
        Set entrySet = this.f23129a.entrySet();
        AbstractC5469l.m23027d(entrySet, "map.entries");
        return entrySet;
    }

    /* renamed from: c */
    public final boolean m26754c() {
        return this.f23129a.isEmpty();
    }

    /* renamed from: d */
    public final Object m26755d(Object key, Object value) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        return this.f23129a.put(key, value);
    }

    /* renamed from: e */
    public final Object m26756e(Object key) {
        AbstractC5469l.m23028e(key, "key");
        return this.f23129a.remove(key);
    }
}
