package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.D */
/* loaded from: classes.dex */
public final class C3746D extends AbstractDialogInterfaceOnClickListenerC3748F {

    /* renamed from: a */
    public final /* synthetic */ Intent f12434a;

    /* renamed from: b */
    public final /* synthetic */ Activity f12435b;

    /* renamed from: c */
    public final /* synthetic */ int f12436c;

    public C3746D(Intent intent, Activity activity, int i7) {
        this.f12434a = intent;
        this.f12435b = activity;
        this.f12436c = i7;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC3748F
    /* renamed from: a */
    public final void mo15026a() {
        Intent intent = this.f12434a;
        if (intent != null) {
            this.f12435b.startActivityForResult(intent, this.f12436c);
        }
    }
}
