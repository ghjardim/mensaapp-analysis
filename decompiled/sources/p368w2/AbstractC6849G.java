package p368w2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC3767Z;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.InterfaceC3769a0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p031E2.AbstractC0265a;
import p031E2.AbstractC0273i;
import p052H2.BinderC0553b;

/* renamed from: w2.G */
/* loaded from: classes.dex */
public abstract class AbstractC6849G {

    /* renamed from: e */
    public static volatile InterfaceC3769a0 f24649e;

    /* renamed from: g */
    public static Context f24651g;

    /* renamed from: a */
    public static final AbstractBinderC6847E f24645a = new BinderC6884y(AbstractBinderC6845C.m28216b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    public static final AbstractBinderC6847E f24646b = new BinderC6885z(AbstractBinderC6845C.m28216b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    public static final AbstractBinderC6847E f24647c = new BinderC6843A(AbstractBinderC6845C.m28216b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    public static final AbstractBinderC6847E f24648d = new BinderC6844B(AbstractBinderC6845C.m28216b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    public static final Object f24650f = new Object();

    /* renamed from: a */
    public static C6858P m28218a(String str, AbstractBinderC6845C abstractBinderC6845C, boolean z6, boolean z7) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m28223f(str, abstractBinderC6845C, z6, z7);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static C6858P m28219b(String str, boolean z6, boolean z7, boolean z8) {
        return m28224g(str, z6, false, false, true);
    }

    /* renamed from: c */
    public static /* synthetic */ String m28220c(boolean z6, String str, AbstractBinderC6845C abstractBinderC6845C) {
        String str2 = (z6 || !m28223f(str, abstractBinderC6845C, true, false).f24668a) ? "not allowed" : "debug cert rejected";
        MessageDigest m1095b = AbstractC0265a.m1095b("SHA-256");
        AbstractC3802r.m15129k(m1095b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, AbstractC0273i.m1124a(m1095b.digest(abstractBinderC6845C.mo28217f())), Boolean.valueOf(z6), "12451000.false");
    }

    /* renamed from: d */
    public static synchronized void m28221d(Context context) {
        synchronized (AbstractC6849G.class) {
            if (f24651g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f24651g = context.getApplicationContext();
            }
        }
    }

    /* renamed from: e */
    public static boolean m28222e() {
        boolean z6;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m28225h();
                z6 = f24649e.zzi();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.C3820a e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            z6 = false;
        }
        return z6;
    }

    /* renamed from: f */
    public static C6858P m28223f(final String str, final AbstractBinderC6845C abstractBinderC6845C, final boolean z6, boolean z7) {
        try {
            m28225h();
            AbstractC3802r.m15129k(f24651g);
            try {
                return f24649e.mo15040N(new C6854L(str, abstractBinderC6845C, z6, z7), BinderC0553b.m2138f(f24651g.getPackageManager())) ? C6858P.m28230b() : new C6856N(new Callable() { // from class: w2.x
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC6849G.m28220c(z6, str, abstractBinderC6845C);
                    }
                }, null);
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return C6858P.m28232d("module call", e7);
            }
        } catch (DynamiteModule.C3820a e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            return C6858P.m28232d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [H2.a, android.os.IBinder] */
    /* renamed from: g */
    public static C6858P m28224g(String str, boolean z6, boolean z7, boolean z8, boolean z9) {
        C6858P m28232d;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC3802r.m15129k(f24651g);
            try {
                m28225h();
                C6850H c6850h = new C6850H(str, z6, false, BinderC0553b.m2138f(f24651g), false, true);
                try {
                    C6852J mo15042W = z9 ? f24649e.mo15042W(c6850h) : f24649e.mo15041O(c6850h);
                    if (mo15042W.m28226x0()) {
                        m28232d = C6858P.m28233f(mo15042W.m28227y0());
                    } else {
                        String zza = mo15042W.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = mo15042W.m28228z0() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (zza == null) {
                            zza = "error checking package certificate";
                        }
                        m28232d = C6858P.m28234g(mo15042W.m28227y0(), mo15042W.m28228z0(), zza, nameNotFoundException);
                    }
                } catch (RemoteException e7) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                    m28232d = C6858P.m28232d("module call", e7);
                }
            } catch (DynamiteModule.C3820a e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                m28232d = C6858P.m28232d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return m28232d;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: h */
    public static void m28225h() {
        if (f24649e != null) {
            return;
        }
        AbstractC3802r.m15129k(f24651g);
        synchronized (f24650f) {
            try {
                if (f24649e == null) {
                    f24649e = AbstractBinderC3767Z.m15043a(DynamiteModule.m15165e(f24651g, DynamiteModule.f12588f, "com.google.android.gms.googlecertificates").m15174d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
