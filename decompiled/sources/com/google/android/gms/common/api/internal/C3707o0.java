package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* loaded from: classes.dex */
public final class C3707o0 extends AbstractC3669Q {

    /* renamed from: a */
    public final /* synthetic */ Dialog f12386a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC3709p0 f12387b;

    public C3707o0(RunnableC3709p0 runnableC3709p0, Dialog dialog) {
        this.f12387b = runnableC3709p0;
        this.f12386a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3669Q
    /* renamed from: a */
    public final void mo14895a() {
        this.f12387b.f12389b.m14982d();
        if (this.f12386a.isShowing()) {
            this.f12386a.dismiss();
        }
    }
}
