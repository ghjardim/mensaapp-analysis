package p108P2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* renamed from: P2.e3 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1698e3 implements ServiceConnection {

    /* renamed from: a */
    public final String f5109a;

    /* renamed from: b */
    public final /* synthetic */ C1707f3 f5110b;

    public ServiceConnectionC1698e3(C1707f3 c1707f3, String str) {
        this.f5110b = c1707f3;
        this.f5109a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f5110b.f5128a.mo5624b().m5941w().m5902a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbr zzb = zzbq.zzb(iBinder);
            if (zzb == null) {
                this.f5110b.f5128a.mo5624b().m5941w().m5902a("Install Referrer Service implementation was not found");
                return;
            }
            C1460C3 c1460c3 = this.f5110b.f5128a;
            c1460c3.mo5624b().m5940v().m5902a("Install Referrer Service connected");
            c1460c3.mo5628f().m6446A(new RunnableC1689d3(this, zzb, this));
        } catch (RuntimeException e7) {
            this.f5110b.f5128a.mo5624b().m5941w().m5903b("Exception occurred while calling Install Referrer API", e7);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5110b.f5128a.mo5624b().m5940v().m5902a("Install Referrer Service disconnected");
    }
}
