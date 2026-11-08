package androidx.lifecycle;

import androidx.lifecycle.AbstractC3345j;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.C0032d;

/* renamed from: androidx.lifecycle.E */
/* loaded from: classes.dex */
public final class C3322E implements InterfaceC3347l, Closeable {

    /* renamed from: a */
    public final String f10694a;

    /* renamed from: b */
    public final C3320C f10695b;

    /* renamed from: c */
    public boolean f10696c;

    public C3322E(String key, C3320C handle) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(handle, "handle");
        this.f10694a = key;
        this.f10695b = handle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.InterfaceC3347l
    /* renamed from: d */
    public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(event, "event");
        if (event == AbstractC3345j.a.ON_DESTROY) {
            this.f10696c = false;
            source.mo9642a().mo12929c(this);
        }
    }

    /* renamed from: o */
    public final void m12869o(C0032d registry, AbstractC3345j lifecycle) {
        AbstractC5469l.m23028e(registry, "registry");
        AbstractC5469l.m23028e(lifecycle, "lifecycle");
        if (this.f10696c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10696c = true;
        lifecycle.mo12927a(this);
        registry.m88h(this.f10694a, this.f10695b.m12865c());
    }

    /* renamed from: r */
    public final C3320C m12870r() {
        return this.f10695b;
    }

    /* renamed from: v */
    public final boolean m12871v() {
        return this.f10696c;
    }
}
