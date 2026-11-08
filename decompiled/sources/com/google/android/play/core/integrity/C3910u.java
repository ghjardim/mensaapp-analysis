package com.google.android.play.core.integrity;

import android.content.Context;
import p157W2.AbstractC2688n;

/* renamed from: com.google.android.play.core.integrity.u */
/* loaded from: classes.dex */
final class C3910u implements InterfaceC3862av {

    /* renamed from: a */
    private Context f12759a;

    private C3910u() {
    }

    /* renamed from: a */
    public final C3910u m15253a(Context context) {
        context.getClass();
        this.f12759a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC3862av
    /* renamed from: b */
    public final InterfaceC3863aw mo15223b() {
        AbstractC2688n.m9184a(this.f12759a, Context.class);
        return new C3912w(this.f12759a, null);
    }

    public /* synthetic */ C3910u(C3909t c3909t) {
    }
}
