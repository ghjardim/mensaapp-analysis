package p016C1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p023D1.AbstractC0181a;

/* renamed from: C1.a */
/* loaded from: classes.dex */
public final class C0072a {

    /* renamed from: d */
    public static volatile C0072a f274d;

    /* renamed from: e */
    public static final Object f275e = new Object();

    /* renamed from: c */
    public final Context f278c;

    /* renamed from: b */
    public final Set f277b = new HashSet();

    /* renamed from: a */
    public final Map f276a = new HashMap();

    public C0072a(Context context) {
        this.f278c = context.getApplicationContext();
    }

    /* renamed from: d */
    public static C0072a m202d(Context context) {
        if (f274d == null) {
            synchronized (f275e) {
                try {
                    if (f274d == null) {
                        f274d = new C0072a(context);
                    }
                } finally {
                }
            }
        }
        return f274d;
    }

    /* renamed from: a */
    public void m203a() {
        try {
            try {
                AbstractC0181a.m729c("Startup");
                m204b(this.f278c.getPackageManager().getProviderInfo(new ComponentName(this.f278c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e7) {
                throw new C0075d(e7);
            }
        } finally {
            AbstractC0181a.m732f();
        }
    }

    /* renamed from: b */
    public void m204b(Bundle bundle) {
        String string = this.f278c.getString(AbstractC0074c.f279a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0073b.class.isAssignableFrom(cls)) {
                            this.f277b.add(cls);
                        }
                    }
                }
                Iterator it = this.f277b.iterator();
                while (it.hasNext()) {
                    m205c((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e7) {
                throw new C0075d(e7);
            }
        }
    }

    /* renamed from: c */
    public final Object m205c(Class cls, Set set) {
        Object obj;
        if (AbstractC0181a.m734h()) {
            try {
                AbstractC0181a.m729c(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC0181a.m732f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f276a.containsKey(cls)) {
            obj = this.f276a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC0073b interfaceC0073b = (InterfaceC0073b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> mo207a = interfaceC0073b.mo207a();
                if (!mo207a.isEmpty()) {
                    for (Class cls2 : mo207a) {
                        if (!this.f276a.containsKey(cls2)) {
                            m205c(cls2, set);
                        }
                    }
                }
                obj = interfaceC0073b.mo208b(this.f278c);
                set.remove(cls);
                this.f276a.put(cls, obj);
            } catch (Throwable th2) {
                throw new C0075d(th2);
            }
        }
        AbstractC0181a.m732f();
        return obj;
    }

    /* renamed from: e */
    public boolean m206e(Class cls) {
        return this.f277b.contains(cls);
    }
}
