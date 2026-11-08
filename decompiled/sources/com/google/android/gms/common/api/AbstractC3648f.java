package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC3684d;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import com.google.android.gms.common.api.internal.InterfaceC3714s;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.f */
/* loaded from: classes.dex */
public abstract class AbstractC3648f {

    /* renamed from: a */
    public static final Set f12268a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.f$a */
    public interface a extends InterfaceC3686e {
    }

    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface b extends InterfaceC3704n {
    }

    /* renamed from: c */
    public static Set m14814c() {
        Set set = f12268a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: a */
    public abstract AbstractC3684d mo14815a(AbstractC3684d abstractC3684d);

    /* renamed from: b */
    public abstract AbstractC3684d mo14816b(AbstractC3684d abstractC3684d);

    /* renamed from: d */
    public abstract Looper mo14817d();

    /* renamed from: e */
    public boolean m14818e(InterfaceC3714s interfaceC3714s) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public void m14819f() {
        throw new UnsupportedOperationException();
    }
}
