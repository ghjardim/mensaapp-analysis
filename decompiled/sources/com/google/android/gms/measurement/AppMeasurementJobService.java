package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import p108P2.C1463C6;
import p108P2.InterfaceC1454B6;

/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC1454B6 {

    /* renamed from: a */
    public C1463C6 f12632a;

    @Override // p108P2.InterfaceC1454B6
    /* renamed from: a */
    public final boolean mo5581a(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // p108P2.InterfaceC1454B6
    /* renamed from: b */
    public final void mo5582b(Intent intent) {
    }

    @Override // p108P2.InterfaceC1454B6
    /* renamed from: c */
    public final void mo5583c(JobParameters jobParameters, boolean z6) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: d */
    public final C1463C6 m15199d() {
        if (this.f12632a == null) {
            this.f12632a = new C1463C6(this);
        }
        return this.f12632a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m15199d().m5649f();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m15199d().m5650g();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m15199d();
        C1463C6.m5645i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m15199d().m5651h(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m15199d();
        C1463C6.m5646j(intent);
        return true;
    }
}
