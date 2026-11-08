package p167X5;

import java.util.List;
import p132S5.AbstractC2329G0;
import p371w5.C6920c;

/* renamed from: X5.w */
/* loaded from: classes2.dex */
public abstract class AbstractC2878w {
    /* renamed from: a */
    public static final AbstractC2879x m10390a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        m10393d();
        throw new C6920c();
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC2879x m10391b(Throwable th, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return m10390a(th, str);
    }

    /* renamed from: c */
    public static final boolean m10392c(AbstractC2329G0 abstractC2329G0) {
        return abstractC2329G0.mo7989K() instanceof AbstractC2879x;
    }

    /* renamed from: d */
    public static final Void m10393d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC2329G0 m10394e(InterfaceC2876u interfaceC2876u, List list) {
        try {
            return interfaceC2876u.mo8409b(list);
        } catch (Throwable th) {
            return m10390a(th, interfaceC2876u.mo8408a());
        }
    }
}
