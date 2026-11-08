package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes.dex */
public abstract class AbstractC3694i {
    protected final InterfaceC3696j mLifecycleFragment;

    public AbstractC3694i(InterfaceC3696j interfaceC3696j) {
        this.mLifecycleFragment = interfaceC3696j;
    }

    public static InterfaceC3696j getFragment(Activity activity) {
        return getFragment(new C3692h(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity mo14972e = this.mLifecycleFragment.mo14972e();
        AbstractC3802r.m15129k(mo14972e);
        return mo14972e;
    }

    public void onActivityResult(int i7, int i8, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static InterfaceC3696j getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static InterfaceC3696j getFragment(C3692h c3692h) {
        if (c3692h.m14958d()) {
            return C3723w0.m15010D1(c3692h.m14956b());
        }
        if (c3692h.m14957c()) {
            return FragmentC3717t0.m14984a(c3692h.m14955a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
