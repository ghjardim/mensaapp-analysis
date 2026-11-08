package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p161X.AbstractActivityC2791u;
import p161X.AbstractComponentCallbacksC2786p;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* loaded from: classes.dex */
public final class C3723w0 extends AbstractComponentCallbacksC2786p implements InterfaceC3696j {

    /* renamed from: m0 */
    public static final WeakHashMap f12409m0 = new WeakHashMap();

    /* renamed from: l0 */
    public final C3721v0 f12410l0 = new C3721v0();

    /* renamed from: D1 */
    public static C3723w0 m15010D1(AbstractActivityC2791u abstractActivityC2791u) {
        C3723w0 c3723w0;
        WeakHashMap weakHashMap = f12409m0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC2791u);
        if (weakReference != null && (c3723w0 = (C3723w0) weakReference.get()) != null) {
            return c3723w0;
        }
        try {
            C3723w0 c3723w02 = (C3723w0) abstractActivityC2791u.m9927Y().m9476i0("SLifecycleFragmentImpl");
            if (c3723w02 == null || c3723w02.m9865e0()) {
                c3723w02 = new C3723w0();
                abstractActivityC2791u.m9927Y().m9487n().m9612c(c3723w02, "SLifecycleFragmentImpl").mo9616g();
            }
            weakHashMap.put(abstractActivityC2791u, new WeakReference(c3723w02));
            return c3723w02;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e7);
        }
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: J0 */
    public final void mo9830J0() {
        super.mo9830J0();
        this.f12410l0.m15003i();
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: K0 */
    public final void mo9787K0(Bundle bundle) {
        super.mo9787K0(bundle);
        this.f12410l0.m15004j(bundle);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: L0 */
    public final void mo9789L0() {
        super.mo9789L0();
        this.f12410l0.m15005k();
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: M0 */
    public final void mo3133M0() {
        super.mo3133M0();
        this.f12410l0.m15006l();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3696j
    /* renamed from: b */
    public final void mo14970b(String str, AbstractC3694i abstractC3694i) {
        this.f12410l0.m14998d(str, abstractC3694i);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3696j
    /* renamed from: c */
    public final AbstractC3694i mo14971c(String str, Class cls) {
        return this.f12410l0.m14997c(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3696j
    /* renamed from: e */
    public final Activity mo14972e() {
        return m9885n();
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: j0 */
    public final void mo9875j0(int i7, int i8, Intent intent) {
        super.mo9875j0(i7, i8, intent);
        this.f12410l0.m15000f(i7, i8, intent);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: k */
    public final void mo9877k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo9877k(str, fileDescriptor, printWriter, strArr);
        this.f12410l0.m14999e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: o0 */
    public final void mo9799o0(Bundle bundle) {
        super.mo9799o0(bundle);
        this.f12410l0.m15001g(bundle);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: t0 */
    public final void mo9903t0() {
        super.mo9903t0();
        this.f12410l0.m15002h();
    }
}
