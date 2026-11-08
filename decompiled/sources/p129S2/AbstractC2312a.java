package p129S2;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.lang.reflect.Method;
import p368w2.AbstractC6874o;
import p368w2.C6870k;
import p368w2.C6871l;

/* renamed from: S2.a */
/* loaded from: classes.dex */
public abstract class AbstractC2312a {

    /* renamed from: a */
    public static final C6870k f7008a = C6870k.m28272f();

    /* renamed from: b */
    public static final Object f7009b = new Object();

    /* renamed from: c */
    public static Method f7010c = null;

    /* renamed from: d */
    public static boolean f7011d = false;

    /* renamed from: a */
    public static void m7826a(Context context) {
        Context context2;
        AbstractC3802r.m15130l(context, "Context must not be null");
        f7008a.m28276k(context, 11925000);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (f7009b) {
            Context context3 = null;
            if (!f7011d) {
                try {
                    context2 = DynamiteModule.m15165e(context, DynamiteModule.f12588f, "com.google.android.gms.providerinstaller.dynamite").m15173b();
                } catch (DynamiteModule.C3820a e7) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e7.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    m7827b(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z6 = f7011d;
            Context m28282d = AbstractC6874o.m28282d(context);
            if (m28282d != null) {
                f7011d = true;
                if (!z6) {
                    try {
                        zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", m28282d.getClassLoader(), zzj.zzb(Context.class, context), zzi.zza(uptimeMillis), zzi.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e8) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e8.toString()));
                    }
                }
                context3 = m28282d;
            }
            if (context3 != null) {
                m7827b(context3, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C6871l(8);
            }
        }
    }

    /* renamed from: b */
    public static void m7827b(Context context, Context context2, String str) {
        try {
            if (f7010c == null) {
                f7010c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f7010c.invoke(null, context);
        } catch (Exception e7) {
            Throwable cause = e7.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e7.toString() : cause.toString())));
            }
            throw new C6871l(8);
        }
    }
}
