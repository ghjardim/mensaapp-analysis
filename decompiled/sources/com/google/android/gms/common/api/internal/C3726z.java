package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* loaded from: classes.dex */
public final class C3726z implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f12413a;

    /* renamed from: b */
    public final /* synthetic */ C3652A f12414b;

    public C3726z(C3652A c3652a, TaskCompletionSource taskCompletionSource) {
        this.f12414b = c3652a;
        this.f12413a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f12414b.f12270b;
        map.remove(this.f12413a);
    }
}
