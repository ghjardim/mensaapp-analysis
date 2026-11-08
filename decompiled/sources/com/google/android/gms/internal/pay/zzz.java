package com.google.android.gms.internal.pay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzz extends zzy {
    private final WeakReference zza;
    private final int zzb;

    public zzz(Activity activity, int i7) {
        this.zza = new WeakReference(activity);
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzh(Status status) {
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            Log.d("PayClientImpl", "Ignoring onPendingIntent, Activity is gone");
            return;
        }
        if (status.m14797B0()) {
            try {
                status.m14800E0(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e7) {
                Log.w("PayClientImpl", "Exception starting pending intent", e7);
            }
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, new Intent(), 1073741824);
        if (createPendingResult == null) {
            Log.w("PayClientImpl", "Null pending result returned for onPendingIntent");
            return;
        }
        try {
            createPendingResult.send(status.m14799D0() ? -1 : status.m14803z0());
        } catch (PendingIntent.CanceledException e8) {
            Log.w("PayClientImpl", "Exception setting pending result", e8);
        }
    }
}
