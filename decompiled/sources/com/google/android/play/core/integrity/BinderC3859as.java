package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p157W2.AbstractBinderC2665E;
import p157W2.C2667G;
import p157W2.C2680f;

/* renamed from: com.google.android.play.core.integrity.as */
/* loaded from: classes.dex */
final class BinderC3859as extends AbstractBinderC2665E {

    /* renamed from: a */
    final TaskCompletionSource f12678a;

    /* renamed from: b */
    final C2680f f12679b;

    /* renamed from: c */
    private final C2667G f12680c = new C2667G("RequestDialogCallbackImpl");

    /* renamed from: d */
    private final String f12681d;

    /* renamed from: e */
    private final InterfaceC3898k f12682e;

    /* renamed from: f */
    private final Activity f12683f;

    public BinderC3859as(Context context, InterfaceC3898k interfaceC3898k, Activity activity, TaskCompletionSource taskCompletionSource, C2680f c2680f) {
        this.f12681d = context.getPackageName();
        this.f12682e = interfaceC3898k;
        this.f12678a = taskCompletionSource;
        this.f12683f = activity;
        this.f12679b = c2680f;
    }

    @Override // p157W2.InterfaceC2666F
    /* renamed from: b */
    public final void mo9139b(Bundle bundle) {
        this.f12679b.m9173v(this.f12678a);
        this.f12680c.m9144d("onRequestDialog(%s)", this.f12681d);
        C3644b mo15245a = this.f12682e.mo15245a(bundle);
        if (mo15245a != null) {
            this.f12678a.trySetException(mo15245a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f12680c.m9142b("onRequestDialog(%s): got null dialog intent", this.f12681d);
            this.f12678a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f12683f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ResultReceiverC3858ar(this, this.f12679b.m9169c()));
        this.f12680c.m9141a("Starting dialog intent...", new Object[0]);
        this.f12683f.startActivityForResult(intent, 0);
    }
}
