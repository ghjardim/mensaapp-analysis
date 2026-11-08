package p368w2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: w2.a */
/* loaded from: classes.dex */
public class ServiceConnectionC6860a implements ServiceConnection {

    /* renamed from: a */
    public boolean f24672a = false;

    /* renamed from: b */
    public final BlockingQueue f24673b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m28237a() {
        AbstractC3802r.m15128j("BlockingServiceConnection.getService() called on main thread");
        if (this.f24672a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f24672a = true;
        return (IBinder) this.f24673b.take();
    }

    /* renamed from: b */
    public IBinder m28238b(long j7, TimeUnit timeUnit) {
        AbstractC3802r.m15128j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f24672a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f24672a = true;
        IBinder iBinder = (IBinder) this.f24673b.poll(j7, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f24673b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
