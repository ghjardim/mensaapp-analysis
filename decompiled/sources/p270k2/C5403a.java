package p270k2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;
import p024D2.C0185b;
import p368w2.AbstractC6874o;
import p368w2.C6870k;
import p368w2.C6871l;
import p368w2.ServiceConnectionC6860a;

/* renamed from: k2.a */
/* loaded from: classes.dex */
public class C5403a {

    /* renamed from: a */
    public ServiceConnectionC6860a f19350a;

    /* renamed from: b */
    public zzf f19351b;

    /* renamed from: c */
    public boolean f19352c;

    /* renamed from: d */
    public final Object f19353d = new Object();

    /* renamed from: e */
    public C5405c f19354e;

    /* renamed from: f */
    public final Context f19355f;

    /* renamed from: g */
    public final long f19356g;

    /* renamed from: k2.a$a */
    public static final class a {

        /* renamed from: a */
        public final String f19357a;

        /* renamed from: b */
        public final boolean f19358b;

        public a(String str, boolean z6) {
            this.f19357a = str;
            this.f19358b = z6;
        }

        /* renamed from: a */
        public String m22372a() {
            return this.f19357a;
        }

        /* renamed from: b */
        public boolean m22373b() {
            return this.f19358b;
        }

        public String toString() {
            String str = this.f19357a;
            boolean z6 = this.f19358b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z6);
            return sb.toString();
        }
    }

    public C5403a(Context context, long j7, boolean z6, boolean z7) {
        Context applicationContext;
        AbstractC3802r.m15129k(context);
        if (z6 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f19355f = context;
        this.f19352c = false;
        this.f19356g = j7;
    }

    /* renamed from: a */
    public static a m22365a(Context context) {
        C5403a c5403a = new C5403a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c5403a.m22368d(false);
            a m22370f = c5403a.m22370f(-1);
            c5403a.m22369e(m22370f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, StringUtils.EMPTY, null);
            return m22370f;
        } finally {
        }
    }

    /* renamed from: c */
    public final void m22367c() {
        AbstractC3802r.m15128j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19355f == null || this.f19350a == null) {
                    return;
                }
                try {
                    if (this.f19352c) {
                        C0185b.m743b().m748c(this.f19355f, this.f19350a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f19352c = false;
                this.f19351b = null;
                this.f19350a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m22368d(boolean z6) {
        AbstractC3802r.m15128j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19352c) {
                    m22367c();
                }
                Context context = this.f19355f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int mo28258h = C6870k.m28272f().mo28258h(context, AbstractC6874o.f24694a);
                    if (mo28258h != 0 && mo28258h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC6860a serviceConnectionC6860a = new ServiceConnectionC6860a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C0185b.m743b().m747a(context, intent, serviceConnectionC6860a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f19350a = serviceConnectionC6860a;
                        try {
                            this.f19351b = zze.zza(serviceConnectionC6860a.m28238b(10000L, TimeUnit.MILLISECONDS));
                            this.f19352c = true;
                            if (z6) {
                                m22371g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C6871l(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final boolean m22369e(a aVar, boolean z6, float f7, long j7, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", true != aVar.m22373b() ? "0" : "1");
            String m22372a = aVar.m22372a();
            if (m22372a != null) {
                hashMap.put("ad_id_size", Integer.toString(m22372a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j7));
        new C5404b(this, hashMap).start();
        return true;
    }

    /* renamed from: f */
    public final a m22370f(int i7) {
        a aVar;
        AbstractC3802r.m15128j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f19352c) {
                    synchronized (this.f19353d) {
                        C5405c c5405c = this.f19354e;
                        if (c5405c == null || !c5405c.f19363d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m22368d(false);
                        if (!this.f19352c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e7) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                    }
                }
                AbstractC3802r.m15129k(this.f19350a);
                AbstractC3802r.m15129k(this.f19351b);
                try {
                    aVar = new a(this.f19351b.zzc(), this.f19351b.zze(true));
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m22371g();
        return aVar;
    }

    public final void finalize() {
        m22367c();
        super.finalize();
    }

    /* renamed from: g */
    public final void m22371g() {
        synchronized (this.f19353d) {
            C5405c c5405c = this.f19354e;
            if (c5405c != null) {
                c5405c.f19362c.countDown();
                try {
                    this.f19354e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j7 = this.f19356g;
            if (j7 > 0) {
                this.f19354e = new C5405c(this, j7);
            }
        }
    }

    /* renamed from: b */
    public static void m22366b(boolean z6) {
    }
}
