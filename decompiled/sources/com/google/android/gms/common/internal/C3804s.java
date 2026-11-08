package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.s */
/* loaded from: classes.dex */
public final class C3804s {

    /* renamed from: b */
    public static C3804s f12556b;

    /* renamed from: c */
    public static final C3806t f12557c = new C3806t(0, false, false, 0, 0);

    /* renamed from: a */
    public C3806t f12558a;

    /* renamed from: b */
    public static synchronized C3804s m15135b() {
        C3804s c3804s;
        synchronized (C3804s.class) {
            try {
                if (f12556b == null) {
                    f12556b = new C3804s();
                }
                c3804s = f12556b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3804s;
    }

    /* renamed from: a */
    public C3806t m15136a() {
        return this.f12558a;
    }

    /* renamed from: c */
    public final synchronized void m15137c(C3806t c3806t) {
        if (c3806t == null) {
            this.f12558a = f12557c;
            return;
        }
        C3806t c3806t2 = this.f12558a;
        if (c3806t2 == null || c3806t2.m15139B0() < c3806t.m15139B0()) {
            this.f12558a = c3806t;
        }
    }
}
