package p348t5;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: t5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6561c {

    /* renamed from: a */
    public final Map f23551a = new HashMap();

    /* renamed from: a */
    public final void m27275a() {
        this.f23551a.clear();
    }

    /* renamed from: b */
    public void mo27272b(String id) {
        AbstractC5469l.m23028e(id, "id");
        this.f23551a.remove(id);
    }

    /* renamed from: c */
    public final boolean m27276c(String str) {
        return this.f23551a.containsKey(str);
    }

    /* renamed from: d */
    public final Object m27277d(String id) {
        AbstractC5469l.m23028e(id, "id");
        if (!m27276c(id)) {
            throw new C6562d(id);
        }
        Object obj = this.f23551a.get(id);
        AbstractC5469l.m23025b(obj);
        return obj;
    }

    /* renamed from: e */
    public final void m27278e(String id, Object obj) {
        AbstractC5469l.m23028e(id, "id");
        this.f23551a.put(id, obj);
    }
}
