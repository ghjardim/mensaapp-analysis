package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3772c;
import com.google.android.gms.common.internal.C3776e;
import com.google.android.gms.common.internal.C3796o;
import com.google.android.gms.common.internal.C3804s;
import com.google.android.gms.common.internal.C3806t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p031E2.AbstractC0266b;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.api.internal.V */
/* loaded from: classes.dex */
public final class C3673V implements OnCompleteListener {

    /* renamed from: a */
    public final C3688f f12309a;

    /* renamed from: b */
    public final int f12310b;

    /* renamed from: c */
    public final C3680b f12311c;

    /* renamed from: d */
    public final long f12312d;

    /* renamed from: e */
    public final long f12313e;

    public C3673V(C3688f c3688f, int i7, C3680b c3680b, long j7, long j8, String str, String str2) {
        this.f12309a = c3688f;
        this.f12310b = i7;
        this.f12311c = c3680b;
        this.f12312d = j7;
        this.f12313e = j8;
    }

    /* renamed from: a */
    public static C3673V m14900a(C3688f c3688f, int i7, C3680b c3680b) {
        boolean z6;
        if (!c3688f.m14941e()) {
            return null;
        }
        C3806t m15136a = C3804s.m15135b().m15136a();
        if (m15136a == null) {
            z6 = true;
        } else {
            if (!m15136a.m15142z0()) {
                return null;
            }
            z6 = m15136a.m15138A0();
            C3663K m14948t = c3688f.m14948t(c3680b);
            if (m14948t != null) {
                if (!(m14948t.m14882v() instanceof AbstractC3772c)) {
                    return null;
                }
                AbstractC3772c abstractC3772c = (AbstractC3772c) m14948t.m14882v();
                if (abstractC3772c.hasConnectionInfo() && !abstractC3772c.isConnecting()) {
                    C3776e m14901b = m14901b(m14948t, abstractC3772c, i7);
                    if (m14901b == null) {
                        return null;
                    }
                    m14948t.m14856G();
                    z6 = m14901b.m15066B0();
                }
            }
        }
        return new C3673V(c3688f, i7, c3680b, z6 ? System.currentTimeMillis() : 0L, z6 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* renamed from: b */
    public static C3776e m14901b(C3663K c3663k, AbstractC3772c abstractC3772c, int i7) {
        int[] m15069y0;
        int[] m15070z0;
        C3776e telemetryConfiguration = abstractC3772c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m15065A0() || ((m15069y0 = telemetryConfiguration.m15069y0()) != null ? !AbstractC0266b.m1096a(m15069y0, i7) : !((m15070z0 = telemetryConfiguration.m15070z0()) == null || !AbstractC0266b.m1096a(m15070z0, i7))) || c3663k.m14881t() >= telemetryConfiguration.m15068x0()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C3663K m14948t;
        int i7;
        int i8;
        int i9;
        int m28242x0;
        long j7;
        long j8;
        int i10;
        if (this.f12309a.m14941e()) {
            C3806t m15136a = C3804s.m15135b().m15136a();
            if ((m15136a == null || m15136a.m15142z0()) && (m14948t = this.f12309a.m14948t(this.f12311c)) != null && (m14948t.m14882v() instanceof AbstractC3772c)) {
                AbstractC3772c abstractC3772c = (AbstractC3772c) m14948t.m14882v();
                int i11 = 0;
                boolean z6 = this.f12312d > 0;
                int gCoreServiceId = abstractC3772c.getGCoreServiceId();
                int i12 = 100;
                if (m15136a != null) {
                    z6 &= m15136a.m15138A0();
                    int m15140x0 = m15136a.m15140x0();
                    int m15141y0 = m15136a.m15141y0();
                    i7 = m15136a.m15139B0();
                    if (abstractC3772c.hasConnectionInfo() && !abstractC3772c.isConnecting()) {
                        C3776e m14901b = m14901b(m14948t, abstractC3772c, this.f12310b);
                        if (m14901b == null) {
                            return;
                        }
                        boolean z7 = m14901b.m15066B0() && this.f12312d > 0;
                        m15141y0 = m14901b.m15068x0();
                        z6 = z7;
                    }
                    i9 = m15140x0;
                    i8 = m15141y0;
                } else {
                    i7 = 0;
                    i8 = 100;
                    i9 = 5000;
                }
                C3688f c3688f = this.f12309a;
                if (task.isSuccessful()) {
                    m28242x0 = 0;
                } else {
                    if (!task.isCanceled()) {
                        Exception exception = task.getException();
                        if (exception instanceof C3644b) {
                            Status status = ((C3644b) exception).getStatus();
                            i12 = status.m14803z0();
                            C6861b m14801x0 = status.m14801x0();
                            if (m14801x0 != null) {
                                m28242x0 = m14801x0.m28242x0();
                                i11 = i12;
                            }
                        } else {
                            i11 = 101;
                            m28242x0 = -1;
                        }
                    }
                    i11 = i12;
                    m28242x0 = -1;
                }
                if (z6) {
                    long j9 = this.f12312d;
                    long j10 = this.f12313e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i10 = (int) (SystemClock.elapsedRealtime() - j10);
                    j8 = currentTimeMillis;
                    j7 = j9;
                } else {
                    j7 = 0;
                    j8 = 0;
                    i10 = -1;
                }
                c3688f.m14935E(new C3796o(this.f12310b, i11, m28242x0, j7, j8, null, null, gCoreServiceId, i10), i7, i9, i8);
            }
        }
    }
}
