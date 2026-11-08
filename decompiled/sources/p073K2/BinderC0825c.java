package p073K2;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: K2.c */
/* loaded from: classes.dex */
public final class BinderC0825c extends zzq {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f2854a;

    public BinderC0825c(C0823a c0823a, TaskCompletionSource taskCompletionSource) {
        this.f2854a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        AbstractC3722w.m15008b(status, pendingIntent, this.f2854a);
    }
}
