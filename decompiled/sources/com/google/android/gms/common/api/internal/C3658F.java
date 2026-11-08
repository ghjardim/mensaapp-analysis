package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c;

/* renamed from: com.google.android.gms.common.api.internal.F */
/* loaded from: classes.dex */
public final class C3658F implements ComponentCallbacks2C3682c.a {

    /* renamed from: a */
    public final /* synthetic */ C3688f f12277a;

    public C3658F(C3688f c3688f) {
        this.f12277a = c3688f;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c.a
    /* renamed from: a */
    public final void mo14842a(boolean z6) {
        C3688f c3688f = this.f12277a;
        c3688f.f12360u.sendMessage(c3688f.f12360u.obtainMessage(1, Boolean.valueOf(z6)));
    }
}
