package p361v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p024D2.C0185b;

/* renamed from: v2.x */
/* loaded from: classes.dex */
public final class ServiceConnectionC6743x implements ServiceConnection {

    /* renamed from: c */
    public C6744y f24292c;

    /* renamed from: f */
    public final /* synthetic */ C6715D f24295f;

    /* renamed from: a */
    public int f24290a = 0;

    /* renamed from: b */
    public final Messenger f24291b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: v2.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i7 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i7);
            }
            ServiceConnectionC6743x serviceConnectionC6743x = ServiceConnectionC6743x.this;
            synchronized (serviceConnectionC6743x) {
                try {
                    AbstractC6712A abstractC6712A = (AbstractC6712A) serviceConnectionC6743x.f24294e.get(i7);
                    if (abstractC6712A == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i7);
                        return true;
                    }
                    serviceConnectionC6743x.f24294e.remove(i7);
                    serviceConnectionC6743x.m27689f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC6712A.m27652c(new C6713B(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC6712A.mo27650a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d */
    public final Queue f24293d = new ArrayDeque();

    /* renamed from: e */
    public final SparseArray f24294e = new SparseArray();

    public /* synthetic */ ServiceConnectionC6743x(C6715D c6715d, AbstractC6742w abstractC6742w) {
        this.f24295f = c6715d;
    }

    /* renamed from: a */
    public final synchronized void m27684a(int i7, String str) {
        m27685b(i7, str, null);
    }

    /* renamed from: b */
    public final synchronized void m27685b(int i7, String str, Throwable th) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i8 = this.f24290a;
            if (i8 == 0) {
                throw new IllegalStateException();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                this.f24290a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f24290a = 4;
            C6715D c6715d = this.f24295f;
            C0185b m743b = C0185b.m743b();
            context = c6715d.f24239a;
            m743b.m748c(context, this);
            C6713B c6713b = new C6713B(i7, str, th);
            Iterator it = this.f24293d.iterator();
            while (it.hasNext()) {
                ((AbstractC6712A) it.next()).m27652c(c6713b);
            }
            this.f24293d.clear();
            for (int i9 = 0; i9 < this.f24294e.size(); i9++) {
                ((AbstractC6712A) this.f24294e.valueAt(i9)).m27652c(c6713b);
            }
            this.f24294e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final void m27686c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f24295f.f24240b;
        scheduledExecutorService.execute(new Runnable() { // from class: v2.r
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC6712A abstractC6712A;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final ServiceConnectionC6743x serviceConnectionC6743x = ServiceConnectionC6743x.this;
                    synchronized (serviceConnectionC6743x) {
                        try {
                            if (serviceConnectionC6743x.f24290a != 2) {
                                return;
                            }
                            if (serviceConnectionC6743x.f24293d.isEmpty()) {
                                serviceConnectionC6743x.m27689f();
                                return;
                            }
                            abstractC6712A = (AbstractC6712A) serviceConnectionC6743x.f24293d.poll();
                            serviceConnectionC6743x.f24294e.put(abstractC6712A.f24234a, abstractC6712A);
                            scheduledExecutorService2 = serviceConnectionC6743x.f24295f.f24240b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: v2.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ServiceConnectionC6743x.this.m27688e(abstractC6712A.f24234a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(abstractC6712A)));
                    }
                    C6715D c6715d = serviceConnectionC6743x.f24295f;
                    Messenger messenger = serviceConnectionC6743x.f24291b;
                    int i7 = abstractC6712A.f24236c;
                    context = c6715d.f24239a;
                    Message obtain = Message.obtain();
                    obtain.what = i7;
                    obtain.arg1 = abstractC6712A.f24234a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC6712A.mo27651b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC6712A.f24237d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC6743x.f24292c.m27691a(obtain);
                    } catch (RemoteException e7) {
                        serviceConnectionC6743x.m27684a(2, e7.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public final synchronized void m27687d() {
        if (this.f24290a == 1) {
            m27684a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void m27688e(int i7) {
        AbstractC6712A abstractC6712A = (AbstractC6712A) this.f24294e.get(i7);
        if (abstractC6712A != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i7);
            this.f24294e.remove(i7);
            abstractC6712A.m27652c(new C6713B(3, "Timed out waiting for response", null));
            m27689f();
        }
    }

    /* renamed from: f */
    public final synchronized void m27689f() {
        Context context;
        try {
            if (this.f24290a == 2 && this.f24293d.isEmpty() && this.f24294e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f24290a = 3;
                C6715D c6715d = this.f24295f;
                C0185b m743b = C0185b.m743b();
                context = c6715d.f24239a;
                m743b.m748c(context, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: g */
    public final synchronized boolean m27690g(AbstractC6712A abstractC6712A) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i7 = this.f24290a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f24293d.add(abstractC6712A);
                return true;
            }
            if (i7 != 2) {
                return false;
            }
            this.f24293d.add(abstractC6712A);
            m27686c();
            return true;
        }
        this.f24293d.add(abstractC6712A);
        AbstractC3802r.m15132n(this.f24290a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f24290a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            C0185b m743b = C0185b.m743b();
            context = this.f24295f.f24239a;
            if (m743b.m747a(context, intent, this, 1)) {
                scheduledExecutorService = this.f24295f.f24240b;
                scheduledExecutorService.schedule(new Runnable() { // from class: v2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC6743x.this.m27687d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m27684a(0, "Unable to bind to service");
            }
        } catch (SecurityException e7) {
            m27685b(0, "Unable to bind to service", e7);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f24295f.f24240b;
        scheduledExecutorService.execute(new Runnable() { // from class: v2.q
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC6743x serviceConnectionC6743x = ServiceConnectionC6743x.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC6743x) {
                    if (iBinder2 == null) {
                        serviceConnectionC6743x.m27684a(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC6743x.f24292c = new C6744y(iBinder2);
                        serviceConnectionC6743x.f24290a = 2;
                        serviceConnectionC6743x.m27686c();
                    } catch (RemoteException e7) {
                        serviceConnectionC6743x.m27684a(0, e7.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f24295f.f24240b;
        scheduledExecutorService.execute(new Runnable() { // from class: v2.t
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC6743x.this.m27684a(2, "Service disconnected");
            }
        });
    }
}
