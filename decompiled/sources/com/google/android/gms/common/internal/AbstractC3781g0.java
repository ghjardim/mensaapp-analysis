package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC3781g0 {

    /* renamed from: a */
    public Object f12505a;

    /* renamed from: b */
    public boolean f12506b = false;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3772c f12507c;

    public AbstractC3781g0(AbstractC3772c abstractC3772c, Object obj) {
        this.f12507c = abstractC3772c;
        this.f12505a = obj;
    }

    /* renamed from: a */
    public abstract void mo15035a(Object obj);

    /* renamed from: b */
    public abstract void mo15036b();

    /* renamed from: c */
    public final void m15075c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f12505a;
                if (this.f12506b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            mo15035a(obj);
        }
        synchronized (this) {
            this.f12506b = true;
        }
        m15077e();
    }

    /* renamed from: d */
    public final void m15076d() {
        synchronized (this) {
            this.f12505a = null;
        }
    }

    /* renamed from: e */
    public final void m15077e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m15076d();
        arrayList = this.f12507c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f12507c.zzt;
            arrayList2.remove(this);
        }
    }
}
