package p324q5;

/* renamed from: q5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6227c {

    /* renamed from: a */
    public static final C6225a f22254a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    static {
        /*
            r0 = 2
            r1 = 3
            r2 = 0
            r3 = 1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            java.lang.String r6 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> Lf
            r7 = r5
            goto L12
        Lf:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L12:
            if (r6 == 0) goto L33
            java.lang.Class<q5.a> r8 = p324q5.C6225a.class
            java.lang.Class r6 = r6.asSubclass(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L31
            java.lang.Class<q5.d> r9 = p324q5.C6228d.class
            r8[r2] = r9     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Constructor r6 = r6.getConstructor(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L31
            q5.d r9 = p324q5.C6225a.f22251a     // Catch: java.lang.Throwable -> L31
            r8[r2] = r9     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.newInstance(r8)     // Catch: java.lang.Throwable -> L31
            q5.a r6 = (p324q5.C6225a) r6     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r6 = move-exception
            r7 = r6
        L33:
            r6 = r5
        L34:
            if (r6 == 0) goto L39
            p324q5.AbstractC6227c.f22254a = r6
            goto L42
        L39:
            q5.a r6 = new q5.a
            q5.d r8 = p324q5.C6225a.f22251a
            r6.<init>(r8)
            p324q5.AbstractC6227c.f22254a = r6
        L42:
            if (r7 == 0) goto L97
            java.lang.String r6 = "io.perfmark.PerfMark.debug"
            boolean r6 = java.lang.Boolean.getBoolean(r6)     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L97
            java.lang.String r6 = "java.util.logging.Logger"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "getLogger"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L97
            r9[r2] = r4     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Method r8 = r6.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L97
            java.lang.Class<q5.c> r9 = p324q5.AbstractC6227c.class
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L97
            r10[r2] = r9     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r8.invoke(r5, r10)     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = "java.util.logging.Level"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L97
            java.lang.String r10 = "FINE"
            java.lang.reflect.Field r10 = r9.getField(r10)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r5 = r10.get(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r10 = "log"
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L97
            r11[r2] = r9     // Catch: java.lang.Throwable -> L97
            r11[r3] = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r11[r0] = r4     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Method r4 = r6.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L97
            r1[r2] = r5     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "Error during PerfMark.<clinit>"
            r1[r3] = r2     // Catch: java.lang.Throwable -> L97
            r1[r0] = r7     // Catch: java.lang.Throwable -> L97
            r4.invoke(r8, r1)     // Catch: java.lang.Throwable -> L97
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p324q5.AbstractC6227c.<clinit>():void");
    }

    /* renamed from: a */
    public static void m25983a(C6228d c6228d) {
        f22254a.m25976a(c6228d);
    }

    /* renamed from: b */
    public static C6228d m25984b(String str) {
        return f22254a.m25977b(str, Long.MIN_VALUE);
    }

    /* renamed from: c */
    public static C6228d m25985c(String str, long j7) {
        return f22254a.m25977b(str, j7);
    }

    /* renamed from: d */
    public static void m25986d(String str, C6228d c6228d) {
        f22254a.m25978c(str, c6228d);
    }

    /* renamed from: e */
    public static void m25987e(C6226b c6226b) {
        f22254a.m25979d(c6226b);
    }

    /* renamed from: f */
    public static C6226b m25988f() {
        return f22254a.m25980e();
    }

    /* renamed from: g */
    public static void m25989g() {
        f22254a.m25982g();
    }

    /* renamed from: h */
    public static C6229e m25990h(String str) {
        f22254a.m25981f(str);
        return C6229e.f22257a;
    }
}
