package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p207d.AbstractC4093c;
import p207d.C4097g;

/* loaded from: classes.dex */
final class zzu extends zzy {
    final /* synthetic */ AbstractC4093c zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzu(zzx zzxVar, AbstractC4093c abstractC4093c, TaskCompletionSource taskCompletionSource) {
        this.zza = abstractC4093c;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzh(Status status) {
        if (status.m14799D0() && status.m14797B0() && this.zza != null) {
            this.zza.m17159a(new C4097g.a(((PendingIntent) AbstractC3802r.m15129k(status.m14802y0())).getIntentSender()).m17182a());
        }
        AbstractC3722w.m15009c(status, null, this.zzb);
    }
}
