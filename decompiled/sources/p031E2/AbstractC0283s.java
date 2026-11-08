package p031E2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import org.apache.tika.utils.StringUtils;
import p045G2.C0385f;
import p372x.AbstractC6935a;

/* renamed from: E2.s */
/* loaded from: classes.dex */
public abstract class AbstractC0283s {

    /* renamed from: a */
    public static final int f1104a = Process.myUid();

    /* renamed from: b */
    public static final Method f1105b;

    /* renamed from: c */
    public static final Method f1106c;

    /* renamed from: d */
    public static final Method f1107d;

    /* renamed from: e */
    public static final Method f1108e;

    /* renamed from: f */
    public static final Method f1109f;

    /* renamed from: g */
    public static final Method f1110g;

    /* renamed from: h */
    public static final Method f1111h;

    /* renamed from: i */
    public static final Method f1112i;

    /* renamed from: j */
    public static Boolean f1113j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "add"
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            int r6 = android.os.Process.myUid()
            p031E2.AbstractC0283s.f1104a = r6
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1b
            r7[r1] = r8     // Catch: java.lang.Exception -> L1b
            java.lang.reflect.Method r7 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L1b
            goto L1c
        L1b:
            r7 = r6
        L1c:
            p031E2.AbstractC0283s.f1105b = r7
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L2b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2b
            r7[r1] = r8     // Catch: java.lang.Exception -> L2b
            r7[r2] = r3     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r4 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L2b
            goto L2c
        L2b:
            r4 = r6
        L2c:
            p031E2.AbstractC0283s.f1106c = r4
            java.lang.String r4 = "size"
            java.lang.reflect.Method r4 = r5.getMethod(r4, r6)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r4 = r6
        L36:
            p031E2.AbstractC0283s.f1107d = r4
            java.lang.String r4 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L45
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L45
            r7[r1] = r8     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Method r4 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L45
            goto L46
        L45:
            r4 = r6
        L46:
            p031E2.AbstractC0283s.f1108e = r4
            java.lang.String r4 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L55
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L55
            r7[r1] = r8     // Catch: java.lang.Exception -> L55
            java.lang.reflect.Method r4 = r5.getMethod(r4, r7)     // Catch: java.lang.Exception -> L55
            goto L56
        L55:
            r4 = r6
        L56:
            p031E2.AbstractC0283s.f1109f = r4
            boolean r4 = p031E2.AbstractC0277m.m1135f()
            java.lang.String r7 = "WorkSourceUtil"
            if (r4 == 0) goto L6d
            java.lang.String r4 = "createWorkChain"
            java.lang.reflect.Method r4 = r5.getMethod(r4, r6)     // Catch: java.lang.Exception -> L67
            goto L6e
        L67:
            r4 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r7, r8, r4)
        L6d:
            r4 = r6
        L6e:
            p031E2.AbstractC0283s.f1110g = r4
            boolean r4 = p031E2.AbstractC0277m.m1135f()
            if (r4 == 0) goto L91
            java.lang.String r4 = "android.os.WorkSource$WorkChain"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L8b
            java.lang.String r8 = "addNode"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L8b
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L8b
            r0[r1] = r9     // Catch: java.lang.Exception -> L8b
            r0[r2] = r3     // Catch: java.lang.Exception -> L8b
            java.lang.reflect.Method r0 = r4.getMethod(r8, r0)     // Catch: java.lang.Exception -> L8b
            goto L92
        L8b:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r7, r1, r0)
        L91:
            r0 = r6
        L92:
            p031E2.AbstractC0283s.f1111h = r0
            boolean r0 = p031E2.AbstractC0277m.m1135f()
            if (r0 == 0) goto La4
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r5.getMethod(r0, r6)     // Catch: java.lang.Exception -> La4
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> La5
            goto La5
        La4:
            r0 = r6
        La5:
            p031E2.AbstractC0283s.f1112i = r0
            p031E2.AbstractC0283s.f1113j = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031E2.AbstractC0283s.<clinit>():void");
    }

    /* renamed from: a */
    public static void m1148a(WorkSource workSource, int i7, String str) {
        Method method = f1106c;
        if (method != null) {
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i7), str);
                return;
            } catch (Exception e7) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                return;
            }
        }
        Method method2 = f1105b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i7));
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m1149b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo m1573c = C0385f.m1578a(context).m1573c(str, 0);
                if (m1573c == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i7 = m1573c.uid;
                WorkSource workSource = new WorkSource();
                m1148a(workSource, i7, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    /* renamed from: c */
    public static synchronized boolean m1150c(Context context) {
        synchronized (AbstractC0283s.class) {
            Boolean bool = f1113j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z6 = AbstractC6935a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
            f1113j = Boolean.valueOf(z6);
            return z6;
        }
    }
}
