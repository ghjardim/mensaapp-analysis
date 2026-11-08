package com.google.android.play.core.integrity;

import android.content.Context;
import p157W2.AbstractC2688n;

/* renamed from: com.google.android.play.core.integrity.q */
/* loaded from: classes.dex */
final class C3906q implements InterfaceC3913x {

    /* renamed from: a */
    private Context f12752a;

    private C3906q() {
    }

    /* renamed from: a */
    public final C3906q m15250a(Context context) {
        context.getClass();
        this.f12752a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC3913x
    /* renamed from: b */
    public final C3908s mo15251b() {
        AbstractC2688n.m9184a(this.f12752a, Context.class);
        return new C3908s(this.f12752a, null);
    }

    public /* synthetic */ C3906q(C3905p c3905p) {
    }
}
