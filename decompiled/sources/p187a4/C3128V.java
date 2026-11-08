package p187a4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: a4.V */
/* loaded from: classes.dex */
public class C3128V {

    /* renamed from: e */
    public static C3128V f9641e;

    /* renamed from: a */
    public String f9642a = null;

    /* renamed from: b */
    public Boolean f9643b = null;

    /* renamed from: c */
    public Boolean f9644c = null;

    /* renamed from: d */
    public final Queue f9645d = new ArrayDeque();

    /* renamed from: b */
    public static synchronized C3128V m11406b() {
        C3128V c3128v;
        synchronized (C3128V.class) {
            try {
                if (f9641e == null) {
                    f9641e = new C3128V();
                }
                c3128v = f9641e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3128v;
    }

    /* renamed from: a */
    public final int m11407a(Context context, Intent intent) {
        ComponentName startService;
        String m11411f = m11411f(context, intent);
        if (m11411f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + m11411f);
            }
            intent.setClassName(context.getPackageName(), m11411f);
        }
        try {
            if (m11410e(context)) {
                startService = AbstractC3144f0.m11511h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e7) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
            return 402;
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e8);
            return 401;
        }
    }

    /* renamed from: c */
    public Intent m11408c() {
        return (Intent) this.f9645d.poll();
    }

    /* renamed from: d */
    public boolean m11409d(Context context) {
        if (this.f9644c == null) {
            this.f9644c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f9643b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9644c.booleanValue();
    }

    /* renamed from: e */
    public boolean m11410e(Context context) {
        if (this.f9643b == null) {
            this.f9643b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f9643b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9643b.booleanValue();
    }

    /* renamed from: f */
    public final synchronized String m11411f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f9642a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f9642a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f9642a = serviceInfo.name;
                    }
                    return this.f9642a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: g */
    public int m11412g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f9645d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m11407a(context, intent2);
    }
}
