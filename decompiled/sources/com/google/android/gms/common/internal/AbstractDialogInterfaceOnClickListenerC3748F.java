package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC3696j;

/* renamed from: com.google.android.gms.common.internal.F */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC3748F implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC3748F m15027b(Activity activity, Intent intent, int i7) {
        return new C3746D(intent, activity, i7);
    }

    /* renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC3748F m15028c(InterfaceC3696j interfaceC3696j, Intent intent, int i7) {
        return new C3747E(intent, interfaceC3696j, 2);
    }

    /* renamed from: a */
    public abstract void mo15026a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                mo15026a();
            } catch (ActivityNotFoundException e7) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
