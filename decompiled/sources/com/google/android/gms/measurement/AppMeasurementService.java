package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import p108P2.C1463C6;
import p108P2.InterfaceC1454B6;
import p175Z.AbstractC2958a;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1454B6 {

    /* renamed from: a */
    public C1463C6 f12634a;

    /* renamed from: d */
    private final C1463C6 m15200d() {
        if (this.f12634a == null) {
            this.f12634a = new C1463C6(this);
        }
        return this.f12634a;
    }

    @Override // p108P2.InterfaceC1454B6
    /* renamed from: a */
    public final boolean mo5581a(int i7) {
        return stopSelfResult(i7);
    }

    @Override // p108P2.InterfaceC1454B6
    /* renamed from: b */
    public final void mo5582b(Intent intent) {
        AbstractC2958a.m10662b(intent);
    }

    @Override // p108P2.InterfaceC1454B6
    /* renamed from: c */
    public final void mo5583c(JobParameters jobParameters, boolean z6) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m15200d().m5648b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m15200d().m5649f();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m15200d().m5650g();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m15200d();
        C1463C6.m5645i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        m15200d().m5647a(intent, i7, i8);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m15200d();
        C1463C6.m5646j(intent);
        return true;
    }
}
