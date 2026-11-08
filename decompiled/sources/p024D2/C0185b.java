package p024D2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.InterfaceC3809u0;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p031E2.AbstractC0277m;
import p045G2.C0385f;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: D2.b */
/* loaded from: classes.dex */
public class C0185b {

    /* renamed from: b */
    public static final Object f758b = new Object();

    /* renamed from: c */
    public static volatile C0185b f759c;

    /* renamed from: a */
    public final ConcurrentHashMap f760a = new ConcurrentHashMap();

    /* renamed from: b */
    public static C0185b m743b() {
        if (f759c == null) {
            synchronized (f758b) {
                try {
                    if (f759c == null) {
                        f759c = new C0185b();
                    }
                } finally {
                }
            }
        }
        C0185b c0185b = f759c;
        AbstractC3802r.m15129k(c0185b);
        return c0185b;
    }

    /* renamed from: e */
    public static void m744e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: g */
    public static boolean m745g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC3809u0);
    }

    /* renamed from: h */
    public static final boolean m746h(Context context, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        boolean bindService;
        if (executor == null) {
            executor = null;
        }
        if (!AbstractC0277m.m1136g() || executor == null) {
            return context.bindService(intent, serviceConnection, i7);
        }
        bindService = context.bindService(intent, i7, executor, serviceConnection);
        return bindService;
    }

    /* renamed from: a */
    public boolean m747a(Context context, Intent intent, ServiceConnection serviceConnection, int i7) {
        return m750f(context, context.getClass().getName(), intent, serviceConnection, i7, true, null);
    }

    /* renamed from: c */
    public void m748c(Context context, ServiceConnection serviceConnection) {
        if (!m745g(serviceConnection) || !this.f760a.containsKey(serviceConnection)) {
            m744e(context, serviceConnection);
            return;
        }
        try {
            m744e(context, (ServiceConnection) this.f760a.get(serviceConnection));
        } finally {
            this.f760a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean m749d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        return m750f(context, str, intent, serviceConnection, 4225, true, executor);
    }

    /* renamed from: f */
    public final boolean m750f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, boolean z6, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C0385f.m1578a(context).m1573c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m745g(serviceConnection)) {
            return m746h(context, intent, serviceConnection, i7, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f760a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean m746h = m746h(context, intent, serviceConnection, i7, executor);
            if (m746h) {
                return m746h;
            }
            return false;
        } finally {
            this.f760a.remove(serviceConnection, serviceConnection);
        }
    }
}
