package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p132S5.InterfaceC2348Q;
import p371w5.C6934q;

/* loaded from: classes.dex */
final class zzar extends AbstractC5470m implements InterfaceC0800l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ InterfaceC2348Q zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, InterfaceC2348Q interfaceC2348Q) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = interfaceC2348Q;
    }

    @Override // p069J5.InterfaceC0800l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return C6934q.f24811a;
    }
}
