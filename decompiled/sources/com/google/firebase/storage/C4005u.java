package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* renamed from: com.google.firebase.storage.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C4005u implements OnCanceledListener {

    /* renamed from: a */
    public final /* synthetic */ CancellationTokenSource f13229a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f13229a.cancel();
    }
}
