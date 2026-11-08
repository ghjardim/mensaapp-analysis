package p177Z1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Z1.k */
/* loaded from: classes.dex */
public class C2984k implements InterfaceC2978e {

    /* renamed from: a */
    public final a f9148a;

    /* renamed from: b */
    public final C2982i f9149b;

    /* renamed from: c */
    public final Map f9150c;

    /* renamed from: Z1.k$a */
    public static class a {

        /* renamed from: a */
        public final Context f9151a;

        /* renamed from: b */
        public Map f9152b = null;

        public a(Context context) {
            this.f9151a = context;
        }

        /* renamed from: d */
        public static Bundle m10741d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public final Map m10742a(Context context) {
            Bundle m10741d = m10741d(context);
            if (m10741d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m10741d.keySet()) {
                Object obj = m10741d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public InterfaceC2977d m10743b(String str) {
            String str2 = (String) m10744c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC2977d) Class.forName(str2).asSubclass(InterfaceC2977d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e7) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e7);
                return null;
            } catch (IllegalAccessException e8) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e8);
                return null;
            } catch (InstantiationException e9) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e9);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e11);
                return null;
            }
        }

        /* renamed from: c */
        public final Map m10744c() {
            if (this.f9152b == null) {
                this.f9152b = m10742a(this.f9151a);
            }
            return this.f9152b;
        }
    }

    public C2984k(Context context, C2982i c2982i) {
        this(new a(context), c2982i);
    }

    @Override // p177Z1.InterfaceC2978e
    /* renamed from: a */
    public synchronized InterfaceC2986m mo10730a(String str) {
        if (this.f9150c.containsKey(str)) {
            return (InterfaceC2986m) this.f9150c.get(str);
        }
        InterfaceC2977d m10743b = this.f9148a.m10743b(str);
        if (m10743b == null) {
            return null;
        }
        InterfaceC2986m create = m10743b.create(this.f9149b.m10737a(str));
        this.f9150c.put(str, create);
        return create;
    }

    public C2984k(a aVar, C2982i c2982i) {
        this.f9150c = new HashMap();
        this.f9148a = aVar;
        this.f9149b = c2982i;
    }
}
