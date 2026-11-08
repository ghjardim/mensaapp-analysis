package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p108P2.C1725h3;
import p108P2.InterfaceC1716g3;
import p175Z.AbstractC2958a;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC2958a implements InterfaceC1716g3 {

    /* renamed from: c */
    public C1725h3 f12633c;

    @Override // p108P2.InterfaceC1716g3
    /* renamed from: a */
    public void mo6077a(Context context, Intent intent) {
        AbstractC2958a.m10663c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f12633c == null) {
            this.f12633c = new C1725h3(this);
        }
        this.f12633c.m6086a(context, intent);
    }
}
