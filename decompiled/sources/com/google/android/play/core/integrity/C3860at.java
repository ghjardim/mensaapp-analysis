package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.C2680f;
import p157W2.InterfaceC2689o;

/* renamed from: com.google.android.play.core.integrity.at */
/* loaded from: classes.dex */
final class C3860at {

    /* renamed from: a */
    private final InterfaceC2689o f12684a;

    /* renamed from: b */
    private final InterfaceC2689o f12685b;

    public C3860at(InterfaceC2689o interfaceC2689o, InterfaceC2689o interfaceC2689o2) {
        this.f12684a = interfaceC2689o;
        this.f12685b = interfaceC2689o2;
    }

    /* renamed from: a */
    public final BinderC3859as m15221a(Activity activity, TaskCompletionSource taskCompletionSource, C2680f c2680f) {
        Object mo9182a = this.f12684a.mo9182a();
        mo9182a.getClass();
        InterfaceC3898k interfaceC3898k = (InterfaceC3898k) this.f12685b.mo9182a();
        interfaceC3898k.getClass();
        activity.getClass();
        c2680f.getClass();
        return new BinderC3859as((Context) mo9182a, interfaceC3898k, activity, taskCompletionSource, c2680f);
    }
}
