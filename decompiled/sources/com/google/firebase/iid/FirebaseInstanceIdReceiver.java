package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.AbstractC3966b;
import java.util.concurrent.ExecutionException;
import p187a4.C3156m;
import p361v2.AbstractC6721b;
import p361v2.C6720a;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC6721b {
    /* renamed from: f */
    public static Intent m15682f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // p361v2.AbstractC6721b
    /* renamed from: b */
    public int mo15683b(Context context, C6720a c6720a) {
        try {
            return ((Integer) Tasks.await(new C3156m(context).m11549k(c6720a.m27663x0()))).intValue();
        } catch (InterruptedException | ExecutionException e7) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
            return 500;
        }
    }

    @Override // p361v2.AbstractC6721b
    /* renamed from: c */
    public void mo15684c(Context context, Bundle bundle) {
        Intent m15682f = m15682f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (AbstractC3966b.m15763E(m15682f)) {
            AbstractC3966b.m15786v(m15682f);
        }
    }
}
