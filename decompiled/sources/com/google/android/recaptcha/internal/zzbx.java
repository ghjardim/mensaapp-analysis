package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p132S5.AbstractC2416y;
import p132S5.InterfaceC2348Q;
import p132S5.InterfaceC2409u0;
import p132S5.InterfaceC2412w;

/* loaded from: classes.dex */
public final class zzbx {
    public static final InterfaceC2348Q zza(Task task) {
        final InterfaceC2412w m8190b = AbstractC2416y.m8190b(null, 1, null);
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC2412w interfaceC2412w = InterfaceC2412w.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC2412w.mo8186r(exception);
                } else if (task2.isCanceled()) {
                    InterfaceC2409u0.a.m8180b(interfaceC2412w, null, 1, null);
                } else {
                    interfaceC2412w.mo8187v(task2.getResult());
                }
            }
        });
        return new zzbw(m8190b);
    }
}
