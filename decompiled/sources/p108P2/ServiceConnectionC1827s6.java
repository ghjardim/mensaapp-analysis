package p108P2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3772c;
import com.google.android.gms.common.internal.AbstractC3802r;
import p024D2.C0185b;
import p368w2.C6861b;

/* renamed from: P2.s6 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1827s6 implements ServiceConnection, AbstractC3772c.a, AbstractC3772c.b {

    /* renamed from: a */
    public volatile boolean f5468a;

    /* renamed from: b */
    public volatile C1495G2 f5469b;

    /* renamed from: c */
    public final /* synthetic */ C1836t6 f5470c;

    public ServiceConnectionC1827s6(C1836t6 c1836t6) {
        this.f5470c = c1836t6;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c.b
    /* renamed from: a */
    public final void mo6274a(C6861b c6861b) {
        C1836t6 c1836t6 = this.f5470c;
        c1836t6.f5129a.mo5628f().m6454y();
        C1558N2 m5610G = c1836t6.f5129a.m5610G();
        if (m5610G != null) {
            m5610G.m5941w().m5903b("Service connection failed", c6861b);
        }
        synchronized (this) {
            this.f5468a = false;
            this.f5469b = null;
        }
        this.f5470c.f5129a.mo5628f().m6446A(new RunnableC1818r6(this, c6861b));
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c.a
    /* renamed from: b */
    public final void mo6275b(int i7) {
        C1460C3 c1460c3 = this.f5470c.f5129a;
        c1460c3.mo5628f().m6454y();
        c1460c3.mo5624b().m5935q().m5902a("Service connection suspended");
        c1460c3.mo5628f().m6446A(new RunnableC1791o6(this));
    }

    /* renamed from: d */
    public final void m6276d(Intent intent) {
        ServiceConnectionC1827s6 serviceConnectionC1827s6;
        C1836t6 c1836t6 = this.f5470c;
        c1836t6.mo5762h();
        Context mo5625c = c1836t6.f5129a.mo5625c();
        C0185b m743b = C0185b.m743b();
        synchronized (this) {
            try {
                if (this.f5468a) {
                    this.f5470c.f5129a.mo5624b().m5940v().m5902a("Connection attempt already in progress");
                    return;
                }
                C1836t6 c1836t62 = this.f5470c;
                c1836t62.f5129a.mo5624b().m5940v().m5902a("Using local app measurement service");
                this.f5468a = true;
                serviceConnectionC1827s6 = c1836t62.f5522c;
                m743b.m747a(mo5625c, intent, serviceConnectionC1827s6, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void m6277e() {
        C1836t6 c1836t6 = this.f5470c;
        c1836t6.mo5762h();
        Context mo5625c = c1836t6.f5129a.mo5625c();
        synchronized (this) {
            try {
                if (this.f5468a) {
                    this.f5470c.f5129a.mo5624b().m5940v().m5902a("Connection attempt already in progress");
                    return;
                }
                if (this.f5469b != null && (this.f5469b.isConnecting() || this.f5469b.isConnected())) {
                    this.f5470c.f5129a.mo5624b().m5940v().m5902a("Already awaiting connection attempt");
                    return;
                }
                this.f5469b = new C1495G2(mo5625c, Looper.getMainLooper(), this, this);
                this.f5470c.f5129a.mo5624b().m5940v().m5902a("Connecting to remote service");
                this.f5468a = true;
                AbstractC3802r.m15129k(this.f5469b);
                this.f5469b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c.a
    /* renamed from: f */
    public final void mo6278f(Bundle bundle) {
        this.f5470c.f5129a.mo5628f().m6454y();
        synchronized (this) {
            try {
                AbstractC3802r.m15129k(this.f5469b);
                this.f5470c.f5129a.mo5628f().m6446A(new RunnableC1782n6(this, (InterfaceC1832t2) this.f5469b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f5469b = null;
                this.f5468a = false;
            }
        }
    }

    /* renamed from: g */
    public final void m6279g() {
        if (this.f5469b != null && (this.f5469b.isConnected() || this.f5469b.isConnecting())) {
            this.f5469b.disconnect();
        }
        this.f5469b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC1827s6 serviceConnectionC1827s6;
        this.f5470c.f5129a.mo5628f().m6454y();
        synchronized (this) {
            if (iBinder == null) {
                this.f5468a = false;
                this.f5470c.f5129a.mo5624b().m5936r().m5902a("Service connected with null binder");
                return;
            }
            InterfaceC1832t2 interfaceC1832t2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC1832t2 = queryLocalInterface instanceof InterfaceC1832t2 ? (InterfaceC1832t2) queryLocalInterface : new C1814r2(iBinder);
                    this.f5470c.f5129a.mo5624b().m5940v().m5902a("Bound to IMeasurementService interface");
                } else {
                    this.f5470c.f5129a.mo5624b().m5936r().m5903b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f5470c.f5129a.mo5624b().m5936r().m5902a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC1832t2 == null) {
                this.f5468a = false;
                try {
                    C0185b m743b = C0185b.m743b();
                    C1836t6 c1836t6 = this.f5470c;
                    Context mo5625c = c1836t6.f5129a.mo5625c();
                    serviceConnectionC1827s6 = c1836t6.f5522c;
                    m743b.m748c(mo5625c, serviceConnectionC1827s6);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f5470c.f5129a.mo5628f().m6446A(new RunnableC1764l6(this, interfaceC1832t2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1460C3 c1460c3 = this.f5470c.f5129a;
        c1460c3.mo5628f().m6454y();
        c1460c3.mo5624b().m5935q().m5902a("Service disconnected");
        c1460c3.mo5628f().m6446A(new RunnableC1773m6(this, componentName));
    }
}
