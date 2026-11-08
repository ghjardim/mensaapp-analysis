package p362v3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137T3.InterfaceC2447b;

/* renamed from: v3.g */
/* loaded from: classes.dex */
public final class C6759g {

    /* renamed from: a */
    public final Object f24332a;

    /* renamed from: b */
    public final c f24333b;

    /* renamed from: v3.g$b */
    public static class b implements c {

        /* renamed from: a */
        public final Class f24334a;

        /* renamed from: b */
        public final Bundle m27758b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f24334a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f24334a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p362v3.C6759g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo27757a(Context context) {
            Bundle m27758b = m27758b(context);
            if (m27758b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m27758b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m27758b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public b(Class cls) {
            this.f24334a = cls;
        }
    }

    /* renamed from: v3.g$c */
    public interface c {
        /* renamed from: a */
        List mo27757a(Object obj);
    }

    public C6759g(Object obj, c cVar) {
        this.f24332a = obj;
        this.f24333b = cVar;
    }

    /* renamed from: c */
    public static C6759g m27753c(Context context, Class cls) {
        return new C6759g(context, new b(cls));
    }

    /* renamed from: d */
    public static ComponentRegistrar m27754d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new C6775w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e7) {
            throw new C6775w(String.format("Could not instantiate %s.", str), e7);
        } catch (InstantiationException e8) {
            throw new C6775w(String.format("Could not instantiate %s.", str), e8);
        } catch (NoSuchMethodException e9) {
            throw new C6775w(String.format("Could not instantiate %s", str), e9);
        } catch (InvocationTargetException e10) {
            throw new C6775w(String.format("Could not instantiate %s", str), e10);
        }
    }

    /* renamed from: b */
    public List m27756b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f24333b.mo27757a(this.f24332a)) {
            arrayList.add(new InterfaceC2447b() { // from class: v3.f
                @Override // p137T3.InterfaceC2447b
                public final Object get() {
                    ComponentRegistrar m27754d;
                    m27754d = C6759g.m27754d(str);
                    return m27754d;
                }
            });
        }
        return arrayList;
    }
}
