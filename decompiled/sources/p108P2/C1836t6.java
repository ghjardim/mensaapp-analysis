package p108P2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzcy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.TikaCoreProperties;
import p024D2.C0185b;
import p368w2.AbstractC6874o;

/* renamed from: P2.t6 */
/* loaded from: classes.dex */
public final class C1836t6 extends AbstractC1724h2 {

    /* renamed from: c */
    public final ServiceConnectionC1827s6 f5522c;

    /* renamed from: d */
    public InterfaceC1832t2 f5523d;

    /* renamed from: e */
    public volatile Boolean f5524e;

    /* renamed from: f */
    public final AbstractC1438A f5525f;

    /* renamed from: g */
    public ScheduledExecutorService f5526g;

    /* renamed from: h */
    public final C1586Q6 f5527h;

    /* renamed from: i */
    public final List f5528i;

    /* renamed from: j */
    public final AbstractC1438A f5529j;

    public C1836t6(C1460C3 c1460c3) {
        super(c1460c3);
        this.f5528i = new ArrayList();
        this.f5527h = new C1586Q6(c1460c3.mo5626d());
        this.f5522c = new ServiceConnectionC1827s6(this);
        this.f5525f = new C1656Z5(this, c1460c3);
        this.f5529j = new C1692d6(this, c1460c3);
    }

    /* renamed from: V */
    private final boolean m6372V() {
        this.f5129a.mo5623a();
        return true;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m6376b0(C1836t6 c1836t6) {
        InterfaceC1832t2 interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to send storage consent settings to service");
            return;
        }
        try {
            C1482E7 m6403R = c1836t6.m6403R(false);
            AbstractC3802r.m15129k(m6403R);
            interfaceC1832t2.mo6029G(m6403R);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            c1836t6.f5129a.mo5624b().m5936r().m5903b("Failed to send storage consent settings to the service", e7);
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m6377c0(C1836t6 c1836t6, AtomicReference atomicReference, C1482E7 c1482e7, C1657Z6 c1657z6) {
        InterfaceC1832t2 interfaceC1832t2;
        synchronized (atomicReference) {
            try {
                interfaceC1832t2 = c1836t6.f5523d;
            } catch (RemoteException e7) {
                c1836t6.f5129a.mo5624b().m5936r().m5903b("[sgtm] Failed to get upload batches; remote exception", e7);
                atomicReference.notifyAll();
            }
            if (interfaceC1832t2 == null) {
                c1836t6.f5129a.mo5624b().m5936r().m5902a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            AbstractC3802r.m15129k(c1482e7);
            interfaceC1832t2.mo6044e(c1482e7, c1657z6, new BinderC1592R5(c1836t6, atomicReference));
            c1836t6.m6405T();
        }
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m6378d0(C1836t6 c1836t6, AtomicReference atomicReference, C1482E7 c1482e7, Bundle bundle) {
        InterfaceC1832t2 interfaceC1832t2;
        synchronized (atomicReference) {
            try {
                interfaceC1832t2 = c1836t6.f5523d;
            } catch (RemoteException e7) {
                c1836t6.f5129a.mo5624b().m5936r().m5903b("Failed to request trigger URIs; remote exception", e7);
                atomicReference.notifyAll();
            }
            if (interfaceC1832t2 == null) {
                c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to request trigger URIs; not connected to service");
                return;
            }
            AbstractC3802r.m15129k(c1482e7);
            interfaceC1832t2.mo6053q(c1482e7, bundle, new BinderC1585Q5(c1836t6, atomicReference));
            c1836t6.m6405T();
        }
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m6379e0(C1836t6 c1836t6, C1482E7 c1482e7, C1721h c1721h) {
        InterfaceC1832t2 interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC1832t2.mo6051l(c1482e7, c1721h);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            c1836t6.f5129a.mo5624b().m5936r().m5904c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c1721h.f5142a), e7);
        }
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m6380f0(C1836t6 c1836t6) {
        InterfaceC1832t2 interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            C1482E7 m6403R = c1836t6.m6403R(false);
            AbstractC3802r.m15129k(m6403R);
            interfaceC1832t2.mo6055t(m6403R);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            c1836t6.f5129a.mo5624b().m5936r().m5903b("Failed to send Dma consent settings to the service", e7);
        }
    }

    /* renamed from: j0 */
    public static /* bridge */ /* synthetic */ void m6384j0(C1836t6 c1836t6, ComponentName componentName) {
        c1836t6.mo5762h();
        if (c1836t6.f5523d != null) {
            c1836t6.f5523d = null;
            c1836t6.f5129a.mo5624b().m5940v().m5903b("Disconnected from device MeasurementService", componentName);
            c1836t6.mo5762h();
            c1836t6.m6411p();
        }
    }

    /* renamed from: A */
    public final void m6386A(zzcy zzcyVar, C1519J c1519j, String str) {
        mo5762h();
        m6082i();
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5619Q().m5739z0(AbstractC6874o.f24694a) == 0) {
            m6406U(new RunnableC1683c6(this, c1519j, str, zzcyVar));
        } else {
            c1460c3.mo5624b().m5941w().m5902a("Not bundling data. Service unavailable or out of date");
            c1460c3.m5619Q().m5695K(zzcyVar, new byte[0]);
        }
    }

    /* renamed from: B */
    public final void m6387B() {
        mo5762h();
        m6082i();
        C1482E7 m6403R = m6403R(false);
        m6372V();
        this.f5129a.m5608E().m5660q();
        m6406U(new RunnableC1608T5(this, m6403R));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01af  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6388C(p108P2.InterfaceC1832t2 r60, p382y2.AbstractC7065a r61, p108P2.C1482E7 r62) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1836t6.m6388C(P2.t2, y2.a, P2.E7):void");
    }

    /* renamed from: D */
    public final void m6389D(C1739j c1739j) {
        AbstractC3802r.m15129k(c1739j);
        mo5762h();
        m6082i();
        this.f5129a.mo5623a();
        m6406U(new RunnableC1728h6(this, true, m6403R(true), this.f5129a.m5608E().m5664u(c1739j), new C1739j(c1739j), c1739j));
    }

    /* renamed from: E */
    public final void m6390E(boolean z6) {
        mo5762h();
        m6082i();
        if (m6400O()) {
            m6406U(new RunnableC1710f6(this, m6403R(false)));
        }
    }

    /* renamed from: F */
    public final void m6391F(C1462C5 c1462c5) {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1665a6(this, c1462c5));
    }

    /* renamed from: G */
    public final void m6392G(Bundle bundle) {
        mo5762h();
        m6082i();
        C1501H c1501h = new C1501H(bundle);
        m6372V();
        m6406U(new RunnableC1674b6(this, true, m6403R(false), this.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5406m1) && this.f5129a.m5608E().m5665v(c1501h), c1501h, bundle));
    }

    /* renamed from: H */
    public final void m6393H() {
        mo5762h();
        m6082i();
        m6406U(new Runnable() { // from class: P2.L5
            @Override // java.lang.Runnable
            public final void run() {
                C1836t6.m6380f0(C1836t6.this);
            }
        });
    }

    /* renamed from: I */
    public final void m6394I() {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1701e6(this, m6403R(true)));
    }

    /* renamed from: J */
    public final void m6395J(InterfaceC1832t2 interfaceC1832t2) {
        mo5762h();
        AbstractC3802r.m15129k(interfaceC1832t2);
        this.f5523d = interfaceC1832t2;
        m6405T();
        m6404S();
    }

    /* renamed from: K */
    public final void m6396K(boolean z6) {
        mo5762h();
        m6082i();
        m6406U(new Runnable() { // from class: P2.K5
            @Override // java.lang.Runnable
            public final void run() {
                C1836t6.m6376b0(C1836t6.this);
            }
        });
    }

    /* renamed from: L */
    public final void m6397L(C1891z7 c1891z7) {
        mo5762h();
        m6082i();
        m6372V();
        m6406U(new RunnableC1600S5(this, m6403R(true), this.f5129a.m5608E().m5667x(c1891z7), c1891z7));
    }

    /* renamed from: M */
    public final void m6398M(final C1721h c1721h) {
        mo5762h();
        m6082i();
        final C1482E7 m6403R = m6403R(true);
        AbstractC3802r.m15129k(m6403R);
        m6406U(new Runnable() { // from class: P2.M5
            @Override // java.lang.Runnable
            public final void run() {
                C1836t6.m6379e0(C1836t6.this, m6403R, c1721h);
            }
        });
    }

    /* renamed from: N */
    public final boolean m6399N() {
        mo5762h();
        m6082i();
        return this.f5523d != null;
    }

    /* renamed from: O */
    public final boolean m6400O() {
        mo5762h();
        m6082i();
        return !m6402Q() || this.f5129a.m5619Q().m5737y0() >= ((Integer) AbstractC1805q2.f5335J0.m6159a(null)).intValue();
    }

    /* renamed from: P */
    public final boolean m6401P() {
        mo5762h();
        m6082i();
        return !m6402Q() || this.f5129a.m5619Q().m5737y0() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6402Q() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1836t6.m6402Q():boolean");
    }

    /* renamed from: R */
    public final C1482E7 m6403R(boolean z6) {
        Pair m5981a;
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.mo5623a();
        C1441A2 m5607D = this.f5129a.m5607D();
        String str = null;
        if (z6) {
            C1460C3 c1460c32 = c1460c3.mo5624b().f5129a;
            if (c1460c32.m5611H().f5065f != null && (m5981a = c1460c32.m5611H().f5065f.m5981a()) != null && m5981a != C1680c3.f5060B) {
                str = String.valueOf(m5981a.second) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + ((String) m5981a.first);
            }
        }
        return m5607D.m5567r(str);
    }

    /* renamed from: S */
    public final void m6404S() {
        mo5762h();
        C1540L2 m5940v = this.f5129a.mo5624b().m5940v();
        List list = this.f5528i;
        m5940v.m5903b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e7) {
                this.f5129a.mo5624b().m5936r().m5903b("Task exception while flushing queue", e7);
            }
        }
        this.f5528i.clear();
        this.f5529j.m5557b();
    }

    /* renamed from: T */
    public final void m6405T() {
        mo5762h();
        this.f5527h.m5958b();
        this.f5129a.m5605B();
        this.f5525f.m5559d(((Long) AbstractC1805q2.f5364Y.m6159a(null)).longValue());
    }

    /* renamed from: U */
    public final void m6406U(Runnable runnable) {
        mo5762h();
        if (m6399N()) {
            runnable.run();
            return;
        }
        List list = this.f5528i;
        long size = list.size();
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.m5605B();
        if (size >= 1000) {
            c1460c3.mo5624b().m5936r().m5902a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f5529j.m5559d(60000L);
        m6411p();
    }

    /* renamed from: W */
    public final C1802q m6407W() {
        mo5762h();
        m6082i();
        InterfaceC1832t2 interfaceC1832t2 = this.f5523d;
        if (interfaceC1832t2 == null) {
            m6411p();
            this.f5129a.mo5624b().m5935q().m5902a("Failed to get consents; not connected to service yet.");
            return null;
        }
        C1482E7 m6403R = m6403R(false);
        AbstractC3802r.m15129k(m6403R);
        try {
            C1802q mo6033Q = interfaceC1832t2.mo6033Q(m6403R);
            m6405T();
            return mo6033Q;
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5936r().m5903b("Failed to get consents; remote exception", e7);
            return null;
        }
    }

    /* renamed from: Z */
    public final Boolean m6408Z() {
        return this.f5524e;
    }

    /* renamed from: l0 */
    public final void m6409l0() {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1648Y5(this, m6403R(true)));
    }

    @Override // p108P2.AbstractC1724h2
    /* renamed from: n */
    public final boolean mo5563n() {
        return false;
    }

    /* renamed from: o */
    public final void m6410o() {
        mo5762h();
        m6082i();
        C1482E7 m6403R = m6403R(true);
        m6372V();
        this.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5406m1);
        this.f5129a.m5608E().m5661r();
        m6406U(new RunnableC1640X5(this, m6403R, true));
    }

    /* renamed from: p */
    public final void m6411p() {
        mo5762h();
        m6082i();
        if (m6399N()) {
            return;
        }
        if (m6402Q()) {
            this.f5522c.m6277e();
            return;
        }
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6143k()) {
            return;
        }
        c1460c3.mo5623a();
        List<ResolveInfo> queryIntentServices = c1460c3.mo5625c().getPackageManager().queryIntentServices(new Intent().setClassName(c1460c3.mo5625c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            c1460c3.mo5624b().m5936r().m5902a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context mo5625c = c1460c3.mo5625c();
        c1460c3.mo5623a();
        intent.setComponent(new ComponentName(mo5625c, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f5522c.m6276d(intent);
    }

    /* renamed from: q */
    public final void m6412q() {
        mo5762h();
        m6082i();
        ServiceConnectionC1827s6 serviceConnectionC1827s6 = this.f5522c;
        serviceConnectionC1827s6.m6279g();
        try {
            C0185b.m743b().m748c(this.f5129a.mo5625c(), serviceConnectionC1827s6);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f5523d = null;
    }

    /* renamed from: r */
    public final void m6413r(zzcy zzcyVar) {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1632W5(this, m6403R(false), zzcyVar));
    }

    /* renamed from: s */
    public final void m6414s(AtomicReference atomicReference) {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1624V5(this, atomicReference, m6403R(false)));
    }

    /* renamed from: t */
    public final void m6415t(zzcy zzcyVar, String str, String str2) {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1746j6(this, str, str2, m6403R(false), zzcyVar));
    }

    /* renamed from: u */
    public final void m6416u(AtomicReference atomicReference, String str, String str2, String str3) {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1737i6(this, atomicReference, null, str2, str3, m6403R(false)));
    }

    /* renamed from: v */
    public final void m6417v(final AtomicReference atomicReference, final Bundle bundle) {
        mo5762h();
        m6082i();
        final C1482E7 m6403R = m6403R(false);
        m6406U(new Runnable() { // from class: P2.N5
            @Override // java.lang.Runnable
            public final void run() {
                C1836t6.m6378d0(C1836t6.this, atomicReference, m6403R, bundle);
            }
        });
    }

    /* renamed from: w */
    public final void m6418w(final AtomicReference atomicReference, final C1657Z6 c1657z6) {
        mo5762h();
        m6082i();
        final C1482E7 m6403R = m6403R(false);
        m6406U(new Runnable() { // from class: P2.O5
            @Override // java.lang.Runnable
            public final void run() {
                C1836t6.m6377c0(C1836t6.this, atomicReference, m6403R, c1657z6);
            }
        });
    }

    /* renamed from: x */
    public final void m6419x(zzcy zzcyVar, String str, String str2, boolean z6) {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1577P5(this, str, str2, m6403R(false), z6, zzcyVar));
    }

    /* renamed from: y */
    public final void m6420y(AtomicReference atomicReference, String str, String str2, String str3, boolean z6) {
        mo5762h();
        m6082i();
        m6406U(new RunnableC1755k6(this, atomicReference, null, str2, str3, m6403R(false), z6));
    }

    /* renamed from: z */
    public final void m6421z(C1519J c1519j, String str) {
        AbstractC3802r.m15129k(c1519j);
        mo5762h();
        m6082i();
        m6372V();
        m6406U(new RunnableC1719g6(this, true, m6403R(true), this.f5129a.m5608E().m5666w(c1519j), c1519j, str));
    }
}
