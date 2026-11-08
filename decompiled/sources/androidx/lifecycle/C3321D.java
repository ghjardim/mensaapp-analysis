package androidx.lifecycle;

import androidx.lifecycle.AbstractC3345j;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: androidx.lifecycle.D */
/* loaded from: classes.dex */
public final class C3321D implements InterfaceC3347l {

    /* renamed from: a */
    public final C3324G f10693a;

    public C3321D(C3324G provider) {
        AbstractC5469l.m23028e(provider, "provider");
        this.f10693a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC3347l
    /* renamed from: d */
    public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(event, "event");
        if (event == AbstractC3345j.a.ON_CREATE) {
            source.mo9642a().mo12929c(this);
            this.f10693a.m12879d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
