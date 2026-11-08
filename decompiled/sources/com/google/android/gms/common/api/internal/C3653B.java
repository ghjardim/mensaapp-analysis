package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC3802r;
import p334s.C6309b;
import p368w2.C6861b;
import p368w2.C6869j;

/* renamed from: com.google.android.gms.common.api.internal.B */
/* loaded from: classes.dex */
public final class C3653B extends AbstractDialogInterfaceOnCancelListenerC3711q0 {

    /* renamed from: e */
    public final C6309b f12271e;

    /* renamed from: f */
    public final C3688f f12272f;

    public C3653B(InterfaceC3696j interfaceC3696j, C3688f c3688f, C6869j c6869j) {
        super(interfaceC3696j, c6869j);
        this.f12271e = new C6309b();
        this.f12272f = c3688f;
        this.mLifecycleFragment.mo14970b("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: j */
    public static void m14832j(Activity activity, C3688f c3688f, C3680b c3680b) {
        InterfaceC3696j fragment = AbstractC3694i.getFragment(activity);
        C3653B c3653b = (C3653B) fragment.mo14971c("ConnectionlessLifecycleHelper", C3653B.class);
        if (c3653b == null) {
            c3653b = new C3653B(fragment, c3688f, C6869j.m28253n());
        }
        AbstractC3802r.m15130l(c3680b, "ApiKey cannot be null");
        c3653b.f12271e.add(c3680b);
        c3688f.m14939b(c3653b);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3711q0
    /* renamed from: b */
    public final void mo14833b(C6861b c6861b, int i7) {
        this.f12272f.m14936F(c6861b, i7);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3711q0
    /* renamed from: c */
    public final void mo14834c() {
        this.f12272f.m14937G();
    }

    /* renamed from: i */
    public final C6309b m14835i() {
        return this.f12271e;
    }

    /* renamed from: k */
    public final void m14836k() {
        if (this.f12271e.isEmpty()) {
            return;
        }
        this.f12272f.m14939b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3694i
    public final void onResume() {
        super.onResume();
        m14836k();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3711q0, com.google.android.gms.common.api.internal.AbstractC3694i
    public final void onStart() {
        super.onStart();
        m14836k();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3711q0, com.google.android.gms.common.api.internal.AbstractC3694i
    public final void onStop() {
        super.onStop();
        this.f12272f.m14940c(this);
    }
}
