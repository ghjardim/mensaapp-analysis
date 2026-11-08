package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.t */
/* loaded from: classes.dex */
public final /* synthetic */ class C4004t implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f13228a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f13228a.setException(exc);
    }
}
