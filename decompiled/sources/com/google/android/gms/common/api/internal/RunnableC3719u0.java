package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
/* loaded from: classes.dex */
public final class RunnableC3719u0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3694i f12396a;

    /* renamed from: b */
    public final /* synthetic */ String f12397b;

    /* renamed from: c */
    public final /* synthetic */ C3721v0 f12398c;

    public RunnableC3719u0(C3721v0 c3721v0, AbstractC3694i abstractC3694i, String str) {
        this.f12396a = abstractC3694i;
        this.f12397b = str;
        this.f12398c = c3721v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C3721v0 c3721v0 = this.f12398c;
        i7 = c3721v0.f12407b;
        if (i7 > 0) {
            AbstractC3694i abstractC3694i = this.f12396a;
            bundle = c3721v0.f12408c;
            if (bundle != null) {
                String str = this.f12397b;
                bundle3 = c3721v0.f12408c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            abstractC3694i.onCreate(bundle2);
        }
        i8 = this.f12398c.f12407b;
        if (i8 >= 2) {
            this.f12396a.onStart();
        }
        i9 = this.f12398c.f12407b;
        if (i9 >= 3) {
            this.f12396a.onResume();
        }
        i10 = this.f12398c.f12407b;
        if (i10 >= 4) {
            this.f12396a.onStop();
        }
        i11 = this.f12398c.f12407b;
        if (i11 >= 5) {
            this.f12396a.onDestroy();
        }
    }
}
