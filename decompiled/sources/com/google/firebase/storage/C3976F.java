package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.storage.F */
/* loaded from: classes.dex */
public class C3976F {

    /* renamed from: c */
    public static final C3976F f13069c = new C3976F();

    /* renamed from: a */
    public final Map f13070a = new HashMap();

    /* renamed from: b */
    public final Object f13071b = new Object();

    /* renamed from: b */
    public static C3976F m15936b() {
        return f13069c;
    }

    /* renamed from: a */
    public void m15937a(AbstractC3975E abstractC3975E) {
        synchronized (this.f13071b) {
            this.f13070a.put(abstractC3975E.mo15887I().toString(), new WeakReference(abstractC3975E));
        }
    }

    /* renamed from: c */
    public void m15938c(AbstractC3975E abstractC3975E) {
        synchronized (this.f13071b) {
            try {
                String c4000p = abstractC3975E.mo15887I().toString();
                WeakReference weakReference = (WeakReference) this.f13070a.get(c4000p);
                AbstractC3975E abstractC3975E2 = weakReference != null ? (AbstractC3975E) weakReference.get() : null;
                if (abstractC3975E2 == null || abstractC3975E2 == abstractC3975E) {
                    this.f13070a.remove(c4000p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
