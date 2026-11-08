package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import p256j$.util.DesugarCollections;
import p334s.C6308a;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
/* loaded from: classes.dex */
public final class C3721v0 {

    /* renamed from: a */
    public final Map f12406a = DesugarCollections.synchronizedMap(new C6308a());

    /* renamed from: b */
    public int f12407b = 0;

    /* renamed from: c */
    public Bundle f12408c;

    /* renamed from: c */
    public final AbstractC3694i m14997c(String str, Class cls) {
        return (AbstractC3694i) cls.cast(this.f12406a.get(str));
    }

    /* renamed from: d */
    public final void m14998d(String str, AbstractC3694i abstractC3694i) {
        if (this.f12406a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f12406a.put(str, abstractC3694i);
        if (this.f12407b > 0) {
            new zzh(Looper.getMainLooper()).post(new RunnableC3719u0(this, abstractC3694i, str));
        }
    }

    /* renamed from: e */
    public final void m14999e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f12406a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3694i) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: f */
    public final void m15000f(int i7, int i8, Intent intent) {
        Iterator it = this.f12406a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3694i) it.next()).onActivityResult(i7, i8, intent);
        }
    }

    /* renamed from: g */
    public final void m15001g(Bundle bundle) {
        this.f12407b = 1;
        this.f12408c = bundle;
        for (Map.Entry entry : this.f12406a.entrySet()) {
            ((AbstractC3694i) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* renamed from: h */
    public final void m15002h() {
        this.f12407b = 5;
        Iterator it = this.f12406a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3694i) it.next()).onDestroy();
        }
    }

    /* renamed from: i */
    public final void m15003i() {
        this.f12407b = 3;
        Iterator it = this.f12406a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3694i) it.next()).onResume();
        }
    }

    /* renamed from: j */
    public final void m15004j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f12406a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC3694i) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* renamed from: k */
    public final void m15005k() {
        this.f12407b = 2;
        Iterator it = this.f12406a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3694i) it.next()).onStart();
        }
    }

    /* renamed from: l */
    public final void m15006l() {
        this.f12407b = 4;
        Iterator it = this.f12406a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3694i) it.next()).onStop();
        }
    }
}
