package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C4003s implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f13227a;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f13227a.setResult(obj);
    }
}
