package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.internal.U */
/* loaded from: classes.dex */
public abstract class AbstractC3762U extends AbstractC3781g0 {

    /* renamed from: d */
    public final int f12457d;

    /* renamed from: e */
    public final Bundle f12458e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC3772c f12459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3762U(AbstractC3772c abstractC3772c, int i7, Bundle bundle) {
        super(abstractC3772c, Boolean.TRUE);
        this.f12459f = abstractC3772c;
        this.f12457d = i7;
        this.f12458e = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3781g0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15035a(Object obj) {
        if (this.f12457d != 0) {
            this.f12459f.m15048c(1, null);
            Bundle bundle = this.f12458e;
            mo15037f(new C6861b(this.f12457d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC3772c.KEY_PENDING_INTENT) : null));
        } else {
            if (mo15038g()) {
                return;
            }
            this.f12459f.m15048c(1, null);
            mo15037f(new C6861b(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3781g0
    /* renamed from: b */
    public final void mo15036b() {
    }

    /* renamed from: f */
    public abstract void mo15037f(C6861b c6861b);

    /* renamed from: g */
    public abstract boolean mo15038g();
}
