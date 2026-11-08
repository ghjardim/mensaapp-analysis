package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: androidx.lifecycle.O */
/* loaded from: classes.dex */
public class C3332O {

    /* renamed from: a */
    public final Map f10724a = new LinkedHashMap();

    /* renamed from: a */
    public final void m12904a() {
        Iterator it = this.f10724a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3329L) it.next()).m12889b();
        }
        this.f10724a.clear();
    }

    /* renamed from: b */
    public final AbstractC3329L m12905b(String key) {
        AbstractC5469l.m23028e(key, "key");
        return (AbstractC3329L) this.f10724a.get(key);
    }

    /* renamed from: c */
    public final Set m12906c() {
        return new HashSet(this.f10724a.keySet());
    }

    /* renamed from: d */
    public final void m12907d(String key, AbstractC3329L viewModel) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(viewModel, "viewModel");
        AbstractC3329L abstractC3329L = (AbstractC3329L) this.f10724a.put(key, viewModel);
        if (abstractC3329L != null) {
            abstractC3329L.m12889b();
        }
    }
}
