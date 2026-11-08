package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* loaded from: classes.dex */
public final class FragmentC3717t0 extends Fragment implements InterfaceC3696j {

    /* renamed from: b */
    public static final WeakHashMap f12394b = new WeakHashMap();

    /* renamed from: a */
    public final C3721v0 f12395a = new C3721v0();

    /* renamed from: a */
    public static FragmentC3717t0 m14984a(Activity activity) {
        FragmentC3717t0 fragmentC3717t0;
        WeakHashMap weakHashMap = f12394b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC3717t0 = (FragmentC3717t0) weakReference.get()) != null) {
            return fragmentC3717t0;
        }
        try {
            FragmentC3717t0 fragmentC3717t02 = (FragmentC3717t0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC3717t02 == null || fragmentC3717t02.isRemoving()) {
                fragmentC3717t02 = new FragmentC3717t0();
                activity.getFragmentManager().beginTransaction().add(fragmentC3717t02, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC3717t02));
            return fragmentC3717t02;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3696j
    /* renamed from: b */
    public final void mo14970b(String str, AbstractC3694i abstractC3694i) {
        this.f12395a.m14998d(str, abstractC3694i);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3696j
    /* renamed from: c */
    public final AbstractC3694i mo14971c(String str, Class cls) {
        return this.f12395a.m14997c(str, cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f12395a.m14999e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3696j
    /* renamed from: e */
    public final Activity mo14972e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        this.f12395a.m15000f(i7, i8, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12395a.m15001g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f12395a.m15002h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f12395a.m15003i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f12395a.m15004j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f12395a.m15005k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f12395a.m15006l();
    }
}
