package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC5469l;
import p200c0.C3566c;

/* renamed from: androidx.lifecycle.L */
/* loaded from: classes.dex */
public abstract class AbstractC3329L {

    /* renamed from: a */
    public final C3566c f10713a = new C3566c();

    /* renamed from: a */
    public final void m12888a(String key, AutoCloseable closeable) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(closeable, "closeable");
        C3566c c3566c = this.f10713a;
        if (c3566c != null) {
            c3566c.m14389d(key, closeable);
        }
    }

    /* renamed from: b */
    public final void m12889b() {
        C3566c c3566c = this.f10713a;
        if (c3566c != null) {
            c3566c.m14390e();
        }
        mo9543d();
    }

    /* renamed from: c */
    public final AutoCloseable m12890c(String key) {
        AbstractC5469l.m23028e(key, "key");
        C3566c c3566c = this.f10713a;
        if (c3566c != null) {
            return c3566c.m14392g(key);
        }
        return null;
    }

    /* renamed from: d */
    public void mo9543d() {
    }
}
