package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p132S5.InterfaceC2348Q;

/* loaded from: classes.dex */
public final class zzas {
    public static final Task zza(InterfaceC2348Q interfaceC2348Q) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        interfaceC2348Q.invokeOnCompletion(new zzar(taskCompletionSource, interfaceC2348Q));
        return taskCompletionSource.getTask();
    }
}
