package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p031E2.AbstractC0270f;
import p031E2.AbstractC0277m;
import p052H2.BinderC0553b;
import p059I2.AbstractC0629a;
import p059I2.AbstractC0630b;
import p059I2.AbstractC0632d;
import p059I2.AbstractC0636h;
import p059I2.C0633e;
import p059I2.C0634f;
import p059I2.C0635g;
import p059I2.C0637i;
import p059I2.C0638j;
import p368w2.C6870k;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h */
    public static Boolean f12590h = null;

    /* renamed from: i */
    public static String f12591i = null;

    /* renamed from: j */
    public static boolean f12592j = false;

    /* renamed from: k */
    public static int f12593k = -1;

    /* renamed from: l */
    public static Boolean f12594l;

    /* renamed from: q */
    public static C0637i f12599q;

    /* renamed from: r */
    public static C0638j f12600r;

    /* renamed from: a */
    public final Context f12601a;

    /* renamed from: m */
    public static final ThreadLocal f12595m = new ThreadLocal();

    /* renamed from: n */
    public static final ThreadLocal f12596n = new C0634f();

    /* renamed from: o */
    public static final InterfaceC3821b.a f12597o = new C3822a();

    /* renamed from: b */
    public static final InterfaceC3821b f12584b = new C3823b();

    /* renamed from: c */
    public static final InterfaceC3821b f12585c = new C3824c();

    /* renamed from: d */
    public static final InterfaceC3821b f12586d = new C3825d();

    /* renamed from: e */
    public static final InterfaceC3821b f12587e = new C3826e();

    /* renamed from: f */
    public static final InterfaceC3821b f12588f = new C3827f();

    /* renamed from: g */
    public static final InterfaceC3821b f12589g = new C3828g();

    /* renamed from: p */
    public static final InterfaceC3821b f12598p = new C3829h();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C3820a extends Exception {
        public /* synthetic */ C3820a(String str, AbstractC0636h abstractC0636h) {
            super(str);
        }

        public /* synthetic */ C3820a(String str, Throwable th, AbstractC0636h abstractC0636h) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface InterfaceC3821b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface a {
            /* renamed from: a */
            int mo15176a(Context context, String str, boolean z6);

            /* renamed from: b */
            int mo15177b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class b {

            /* renamed from: a */
            public int f12602a = 0;

            /* renamed from: b */
            public int f12603b = 0;

            /* renamed from: c */
            public int f12604c = 0;
        }

        /* renamed from: a */
        b mo15175a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        AbstractC3802r.m15129k(context);
        this.f12601a = context;
    }

    /* renamed from: a */
    public static int m15163a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC3798p.m15099b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m15164c(Context context, String str) {
        return m15166f(context, str, false);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0226: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:551), block:B:168:0x0226 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x027b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule m15165e(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.InterfaceC3821b r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15165e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01bf -> B:24:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c1 -> B:24:0x01c4). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public static int m15166f(Context context, String str, boolean z6) {
        Field declaredField;
        Throwable th;
        RemoteException e7;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f12590h;
                int i7 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e8.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                m15169i(classLoader);
                            } catch (C3820a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!m15171k(context)) {
                                return 0;
                            }
                            if (!f12592j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m15167g = m15167g(context, str, z6, true);
                                        String str2 = f12591i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m2535a = AbstractC0632d.m2535a();
                                            if (m2535a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC0630b.m2534a();
                                                    String str3 = f12591i;
                                                    AbstractC3802r.m15129k(str3);
                                                    m2535a = AbstractC0629a.m2533a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f12591i;
                                                    AbstractC3802r.m15129k(str4);
                                                    m2535a = new C0633e(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m15169i(m2535a);
                                            declaredField.set(null, m2535a);
                                            f12590h = bool2;
                                            return m15167g;
                                        }
                                        return m15167g;
                                    } catch (C3820a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f12590h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m15167g(context, str, z6, false);
                    } catch (C3820a e9) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e9.getMessage());
                        return 0;
                    }
                }
                C0637i m15172l = m15172l(context);
                try {
                    if (m15172l != null) {
                        try {
                            int zze = m15172l.zze();
                            if (zze >= 3) {
                                C0635g c0635g = (C0635g) f12595m.get();
                                if (c0635g == null || (cursor = c0635g.f2198a) == null) {
                                    Cursor cursor2 = (Cursor) BinderC0553b.m2137b(m15172l.m2539a0(BinderC0553b.m2138f(context), str, z6, ((Long) f12596n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i8 = cursor2.getInt(0);
                                                r2 = (i8 <= 0 || !m15170j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i7 = i8;
                                            }
                                        } catch (RemoteException e10) {
                                            e7 = e10;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e7.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i7 = cursor.getInt(0);
                                }
                            } else if (zze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i7 = m15172l.m2540b(BinderC0553b.m2138f(context), str, z6);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i7 = m15172l.m2538a(BinderC0553b.m2138f(context), str, z6);
                            }
                        } catch (RemoteException e11) {
                            e7 = e11;
                        }
                    }
                    return i7;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            AbstractC0270f.m1115a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    
        r4.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x013d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:318), block:B:110:0x013d */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m15167g(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15167g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    public static DynamiteModule m15168h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    /* renamed from: i */
    public static void m15169i(ClassLoader classLoader) {
        C0638j c0638j;
        AbstractC0636h abstractC0636h = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                c0638j = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c0638j = queryLocalInterface instanceof C0638j ? (C0638j) queryLocalInterface : new C0638j(iBinder);
            }
            f12600r = c0638j;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new C3820a("Failed to instantiate dynamite loader", e, abstractC0636h);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new C3820a("Failed to instantiate dynamite loader", e, abstractC0636h);
        } catch (InstantiationException e9) {
            e = e9;
            throw new C3820a("Failed to instantiate dynamite loader", e, abstractC0636h);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new C3820a("Failed to instantiate dynamite loader", e, abstractC0636h);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new C3820a("Failed to instantiate dynamite loader", e, abstractC0636h);
        }
    }

    /* renamed from: j */
    public static boolean m15170j(Cursor cursor) {
        C0635g c0635g = (C0635g) f12595m.get();
        if (c0635g == null || c0635g.f2198a != null) {
            return false;
        }
        c0635g.f2198a = cursor;
        return true;
    }

    /* renamed from: k */
    public static boolean m15171k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f12594l)) {
            return true;
        }
        boolean z6 = false;
        if (f12594l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != AbstractC0277m.m1136g() ? 0 : 268435456);
            if (C6870k.m28272f().mo28258h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z6 = true;
            }
            f12594l = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f12592j = true;
            }
        }
        if (!z6) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    /* renamed from: l */
    public static C0637i m15172l(Context context) {
        C0637i c0637i;
        synchronized (DynamiteModule.class) {
            C0637i c0637i2 = f12599q;
            if (c0637i2 != null) {
                return c0637i2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c0637i = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c0637i = queryLocalInterface instanceof C0637i ? (C0637i) queryLocalInterface : new C0637i(iBinder);
                }
                if (c0637i != null) {
                    f12599q = c0637i;
                    return c0637i;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    /* renamed from: b */
    public Context m15173b() {
        return this.f12601a;
    }

    /* renamed from: d */
    public IBinder m15174d(String str) {
        try {
            return (IBinder) this.f12601a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new C3820a("Failed to instantiate module class: ".concat(String.valueOf(str)), e7, null);
        }
    }
}
