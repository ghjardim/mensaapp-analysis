package com.google.android.gms.common.internal;

import android.os.Bundle;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.internal.k0 */
/* loaded from: classes.dex */
public final class C3789k0 extends AbstractC3762U {

    /* renamed from: g */
    public final /* synthetic */ AbstractC3772c f12522g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3789k0(AbstractC3772c abstractC3772c, int i7, Bundle bundle) {
        super(abstractC3772c, i7, bundle);
        this.f12522g = abstractC3772c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3762U
    /* renamed from: f */
    public final void mo15037f(C6861b c6861b) {
        if (this.f12522g.enableLocalFallback() && AbstractC3772c.zzo(this.f12522g)) {
            AbstractC3772c.zzk(this.f12522g, 16);
        } else {
            this.f12522g.zzc.mo14890a(c6861b);
            this.f12522g.onConnectionFailed(c6861b);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3762U
    /* renamed from: g */
    public final boolean mo15038g() {
        this.f12522g.zzc.mo14890a(C6861b.f24674e);
        return true;
    }
}
