package p323q4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p061I4.C0658j;
import p061I4.C0659k;
import p339s4.AbstractC6397h;
import p339s4.C6392c;
import p339s4.C6393d;
import p339s4.C6396g;
import p339s4.InterfaceC6394e;

/* renamed from: q4.i */
/* loaded from: classes.dex */
public class C6207i {

    /* renamed from: n */
    public static Boolean f22185n;

    /* renamed from: a */
    public final boolean f22186a;

    /* renamed from: b */
    public final String f22187b;

    /* renamed from: c */
    public final int f22188c;

    /* renamed from: d */
    public final int f22189d;

    /* renamed from: e */
    public final Context f22190e;

    /* renamed from: h */
    public InterfaceC6213o f22193h;

    /* renamed from: i */
    public SQLiteDatabase f22194i;

    /* renamed from: l */
    public Integer f22197l;

    /* renamed from: f */
    public final List f22191f = new ArrayList();

    /* renamed from: g */
    public final Map f22192g = new HashMap();

    /* renamed from: j */
    public int f22195j = 0;

    /* renamed from: k */
    public int f22196k = 0;

    /* renamed from: m */
    public int f22198m = 0;

    public C6207i(Context context, String str, int i7, boolean z6, int i8) {
        this.f22190e = context;
        this.f22187b = str;
        this.f22186a = z6;
        this.f22188c = i7;
        this.f22189d = i8;
    }

    /* renamed from: G */
    public static /* synthetic */ Cursor m25905G(C6197D c6197d, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c6197d.m25896a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: i */
    public static boolean m25913i(Context context, String str, boolean z6) {
        ApplicationInfo m25917y;
        PackageManager.ApplicationInfoFlags of;
        try {
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.ApplicationInfoFlags.of(128L);
                m25917y = packageManager.getApplicationInfo(packageName, of);
            } else {
                m25917y = m25917y(context, packageName, 128);
            }
            return m25917y.metaData.getBoolean(str, z6);
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m25914j(Context context) {
        return m25913i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    /* renamed from: o */
    public static void m25915o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    /* renamed from: x */
    public static boolean m25916x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: y */
    public static ApplicationInfo m25917y(Context context, String str, int i7) {
        return context.getPackageManager().getApplicationInfo(str, i7);
    }

    /* renamed from: A */
    public String m25918A() {
        return "[" + m25919B() + "] ";
    }

    /* renamed from: B */
    public String m25919B() {
        Thread currentThread = Thread.currentThread();
        return this.f22188c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    /* renamed from: C */
    public SQLiteDatabase m25920C() {
        return this.f22194i;
    }

    /* renamed from: D */
    public void m25921D(Exception exc, InterfaceC6394e interfaceC6394e) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            interfaceC6394e.mo26699b("sqlite_error", "open_failed " + this.f22187b, null);
            return;
        }
        if (exc instanceof SQLException) {
            interfaceC6394e.mo26699b("sqlite_error", exc.getMessage(), AbstractC6397h.m26719a(interfaceC6394e));
        } else {
            interfaceC6394e.mo26699b("sqlite_error", exc.getMessage(), AbstractC6397h.m26719a(interfaceC6394e));
        }
    }

    /* renamed from: E */
    public void m25922E(final InterfaceC6394e interfaceC6394e) {
        m25935S(interfaceC6394e, new Runnable() { // from class: q4.e
            @Override // java.lang.Runnable
            public final void run() {
                C6207i.this.m25925I(interfaceC6394e);
            }
        });
    }

    /* renamed from: F */
    public synchronized boolean m25923F() {
        return this.f22195j > 0;
    }

    /* renamed from: H */
    public final /* synthetic */ void m25924H(InterfaceC6394e interfaceC6394e) {
        Boolean mo26705j = interfaceC6394e.mo26705j();
        boolean z6 = Boolean.TRUE.equals(mo26705j) && interfaceC6394e.mo26704g();
        if (z6) {
            int i7 = this.f22196k + 1;
            this.f22196k = i7;
            this.f22197l = Integer.valueOf(i7);
        }
        if (!m25948w(interfaceC6394e)) {
            if (z6) {
                this.f22197l = null;
            }
        } else if (z6) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f22197l);
            interfaceC6394e.mo26698a(hashMap);
        } else {
            if (Boolean.FALSE.equals(mo26705j)) {
                this.f22197l = null;
            }
            interfaceC6394e.mo26698a(null);
        }
    }

    /* renamed from: M */
    public void m25929M() {
        if (f22185n == null) {
            Boolean valueOf = Boolean.valueOf(m25914j(this.f22190e));
            f22185n = valueOf;
            if (valueOf.booleanValue() && AbstractC6216r.m25975c(this.f22189d)) {
                Log.d("Sqflite", m25918A() + "[sqflite] WAL enabled");
            }
        }
        this.f22194i = SQLiteDatabase.openDatabase(this.f22187b, null, f22185n.booleanValue() ? 805306368 : 268435456);
    }

    /* renamed from: N */
    public void m25930N() {
        this.f22194i = SQLiteDatabase.openDatabase(this.f22187b, null, 1, new a());
    }

    /* renamed from: O */
    public void m25931O(final InterfaceC6394e interfaceC6394e) {
        m25935S(interfaceC6394e, new Runnable() { // from class: q4.c
            @Override // java.lang.Runnable
            public final void run() {
                C6207i.this.m25926J(interfaceC6394e);
            }
        });
    }

    /* renamed from: P */
    public void m25932P(final InterfaceC6394e interfaceC6394e) {
        m25935S(interfaceC6394e, new Runnable() { // from class: q4.b
            @Override // java.lang.Runnable
            public final void run() {
                C6207i.this.m25927K(interfaceC6394e);
            }
        });
    }

    /* renamed from: Q */
    public final void m25933Q() {
        while (!this.f22191f.isEmpty() && this.f22197l == null) {
            ((C6396g) this.f22191f.get(0)).m26718a();
            this.f22191f.remove(0);
        }
    }

    /* renamed from: R */
    public void m25934R(final InterfaceC6394e interfaceC6394e) {
        m25935S(interfaceC6394e, new Runnable() { // from class: q4.d
            @Override // java.lang.Runnable
            public final void run() {
                C6207i.this.m25928L(interfaceC6394e);
            }
        });
    }

    /* renamed from: S */
    public final void m25935S(InterfaceC6394e interfaceC6394e, Runnable runnable) {
        Integer mo26703f = interfaceC6394e.mo26703f();
        Integer num = this.f22197l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (mo26703f == null || !(mo26703f.equals(num) || mo26703f.intValue() == -1)) {
            this.f22191f.add(new C6396g(interfaceC6394e, runnable));
            return;
        }
        runnable.run();
        if (this.f22197l != null || this.f22191f.isEmpty()) {
            return;
        }
        this.f22193h.mo25964a(this, new Runnable() { // from class: q4.h
            @Override // java.lang.Runnable
            public final void run() {
                C6207i.this.m25933Q();
            }
        });
    }

    /* renamed from: h */
    public void m25936h(C0658j c0658j, C0659k.d dVar) {
        C6392c c6392c;
        String mo26711h;
        C6393d c6393d = new C6393d(c0658j, dVar);
        boolean mo26702e = c6393d.mo26702e();
        boolean m26707l = c6393d.m26707l();
        List list = (List) c6393d.mo26710c("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c6392c = new C6392c((Map) it.next(), mo26702e);
            mo26711h = c6392c.mo26711h();
            mo26711h.hashCode();
            switch (mo26711h) {
                case "execute":
                    if (m25941p(c6392c)) {
                        c6392c.m26717t(arrayList);
                        break;
                    } else if (!m26707l) {
                        c6392c.m26715r(dVar);
                        return;
                    } else {
                        c6392c.m26716s(arrayList);
                        break;
                    }
                case "insert":
                    if (m25925I(c6392c)) {
                        c6392c.m26717t(arrayList);
                        break;
                    } else if (!m26707l) {
                        c6392c.m26715r(dVar);
                        return;
                    } else {
                        c6392c.m26716s(arrayList);
                        break;
                    }
                case "update":
                    if (m25928L(c6392c)) {
                        c6392c.m26717t(arrayList);
                        break;
                    } else if (!m26707l) {
                        c6392c.m26715r(dVar);
                        return;
                    } else {
                        c6392c.m26716s(arrayList);
                        break;
                    }
                case "query":
                    if (m25926J(c6392c)) {
                        c6392c.m26717t(arrayList);
                        break;
                    } else if (!m26707l) {
                        c6392c.m26715r(dVar);
                        return;
                    } else {
                        c6392c.m26716s(arrayList);
                        break;
                    }
                default:
                    dVar.mo2315b("bad_param", "Batch method '" + mo26711h + "' not supported", null);
                    return;
            }
        }
        if (mo26702e) {
            dVar.mo2314a(null);
        } else {
            dVar.mo2314a(arrayList);
        }
    }

    /* renamed from: k */
    public void m25937k() {
        if (!this.f22192g.isEmpty() && AbstractC6216r.m25974b(this.f22189d)) {
            Log.d("Sqflite", m25918A() + this.f22192g.size() + " cursor(s) are left opened");
        }
        this.f22194i.close();
    }

    /* renamed from: l */
    public final void m25938l(int i7) {
        C6218t c6218t = (C6218t) this.f22192g.get(Integer.valueOf(i7));
        if (c6218t != null) {
            m25939m(c6218t);
        }
    }

    /* renamed from: m */
    public final void m25939m(C6218t c6218t) {
        try {
            int i7 = c6218t.f22225a;
            if (AbstractC6216r.m25975c(this.f22189d)) {
                Log.d("Sqflite", m25918A() + "closing cursor " + i7);
            }
            this.f22192g.remove(Integer.valueOf(i7));
            c6218t.f22227c.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public final Map m25940n(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        int i7 = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i7 = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                arrayList = arrayList2;
                hashMap = hashMap2;
            }
            arrayList.add(AbstractC6198E.m25901a(cursor, i7));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    /* renamed from: p */
    public final boolean m25941p(InterfaceC6394e interfaceC6394e) {
        if (!m25948w(interfaceC6394e)) {
            return false;
        }
        interfaceC6394e.mo26698a(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m25925I(p339s4.InterfaceC6394e r10) {
        /*
            r9 = this;
            boolean r0 = r9.m25948w(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r10.mo26702e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r10.mo26698a(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.m25920C()     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9f
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 <= 0) goto L9f
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 == 0) goto L9f
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 != 0) goto L6d
            int r5 = r9.f22189d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r5 = p323q4.AbstractC6216r.m25974b(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 == 0) goto L66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = r9.m25918A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            goto L66
        L61:
            r10 = move-exception
            r2 = r0
            goto Lcf
        L64:
            r2 = move-exception
            goto Lc6
        L66:
            r10.mo26698a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.close()
            return r3
        L6d:
            long r5 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            int r2 = r9.f22189d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r2 = p323q4.AbstractC6216r.m25974b(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r2 == 0) goto L94
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r7 = r9.m25918A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.append(r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.append(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
        L94:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r10.mo26698a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.close()
            return r3
        L9f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = r9.m25918A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r10.mo26698a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r0 == 0) goto Lbf
            r0.close()
        Lbf:
            return r3
        Lc0:
            r10 = move-exception
            goto Lcf
        Lc2:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        Lc6:
            r9.m25921D(r2, r10)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto Lce
            r0.close()
        Lce:
            return r1
        Lcf:
            if (r2 == 0) goto Ld4
            r2.close()
        Ld4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p323q4.C6207i.m25925I(s4.e):boolean");
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean m25926J(InterfaceC6394e interfaceC6394e) {
        Cursor cursor;
        Integer num = (Integer) interfaceC6394e.mo26710c("cursorPageSize");
        final C6197D mo26701d = interfaceC6394e.mo26701d();
        if (AbstractC6216r.m25974b(this.f22189d)) {
            Log.d("Sqflite", m25918A() + mo26701d);
        }
        C6218t c6218t = null;
        try {
            cursor = m25949z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: q4.g
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    Cursor m25905G;
                    m25905G = C6207i.m25905G(C6197D.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    return m25905G;
                }
            }, mo26701d.m25898c(), AbstractC6199a.f22172a, null);
            try {
                try {
                    Map m25940n = m25940n(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i7 = this.f22198m + 1;
                        this.f22198m = i7;
                        m25940n.put("cursorId", Integer.valueOf(i7));
                        C6218t c6218t2 = new C6218t(i7, num.intValue(), cursor);
                        try {
                            this.f22192g.put(Integer.valueOf(i7), c6218t2);
                            c6218t = c6218t2;
                        } catch (Exception e7) {
                            e = e7;
                            c6218t = c6218t2;
                            m25921D(e, interfaceC6394e);
                            if (c6218t != null) {
                                m25939m(c6218t);
                            }
                            if (c6218t != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            c6218t = c6218t2;
                            if (c6218t == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    interfaceC6394e.mo26698a(m25940n);
                    if (c6218t == null && cursor != null) {
                        cursor.close();
                    }
                    return true;
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean m25927K(InterfaceC6394e interfaceC6394e) {
        boolean z6;
        Integer num = (Integer) interfaceC6394e.mo26710c("cursorId");
        int intValue = num.intValue();
        boolean equals = Boolean.TRUE.equals(interfaceC6394e.mo26710c("cancel"));
        if (AbstractC6216r.m25975c(this.f22189d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(m25918A());
            sb.append("cursor ");
            sb.append(intValue);
            sb.append(equals ? " cancel" : " next");
            Log.d("Sqflite", sb.toString());
        }
        C6218t c6218t = null;
        if (equals) {
            m25938l(intValue);
            interfaceC6394e.mo26698a(null);
            return true;
        }
        C6218t c6218t2 = (C6218t) this.f22192g.get(num);
        int i7 = 0;
        try {
            try {
                if (c6218t2 == null) {
                    throw new IllegalStateException("Cursor " + intValue + " not found");
                }
                Cursor cursor = c6218t2.f22227c;
                Map m25940n = m25940n(cursor, Integer.valueOf(c6218t2.f22226b));
                z6 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
                if (z6) {
                    try {
                        m25940n.put("cursorId", num);
                    } catch (Exception e7) {
                        e = e7;
                        m25921D(e, interfaceC6394e);
                        if (c6218t2 != null) {
                            m25939m(c6218t2);
                        } else {
                            c6218t = c6218t2;
                        }
                        if (!z6 && c6218t != null) {
                            m25939m(c6218t);
                        }
                        return false;
                    }
                }
                interfaceC6394e.mo26698a(m25940n);
                if (!z6) {
                    m25939m(c6218t2);
                }
                return true;
            } catch (Throwable th) {
                th = th;
                i7 = intValue;
                if (i7 == 0 && c6218t2 != null) {
                    m25939m(c6218t2);
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            z6 = false;
        } catch (Throwable th2) {
            th = th2;
            if (i7 == 0) {
                m25939m(c6218t2);
            }
            throw th;
        }
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean m25928L(InterfaceC6394e interfaceC6394e) {
        if (!m25948w(interfaceC6394e)) {
            return false;
        }
        Cursor cursor = null;
        if (interfaceC6394e.mo26702e()) {
            interfaceC6394e.mo26698a(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = m25920C().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i7 = rawQuery.getInt(0);
                            if (AbstractC6216r.m25974b(this.f22189d)) {
                                Log.d("Sqflite", m25918A() + "changed " + i7);
                            }
                            interfaceC6394e.mo26698a(Integer.valueOf(i7));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cursor = rawQuery;
                        m25921D(e, interfaceC6394e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", m25918A() + "fail to read changes for Update/Delete");
                interfaceC6394e.mo26698a(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: u */
    public synchronized void m25946u(Boolean bool) {
        try {
            if (Boolean.TRUE.equals(bool)) {
                this.f22195j++;
            } else if (Boolean.FALSE.equals(bool)) {
                this.f22195j--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: v */
    public void m25947v(final InterfaceC6394e interfaceC6394e) {
        m25935S(interfaceC6394e, new Runnable() { // from class: q4.f
            @Override // java.lang.Runnable
            public final void run() {
                C6207i.this.m25924H(interfaceC6394e);
            }
        });
    }

    /* renamed from: w */
    public final boolean m25948w(InterfaceC6394e interfaceC6394e) {
        C6197D mo26701d = interfaceC6394e.mo26701d();
        if (AbstractC6216r.m25974b(this.f22189d)) {
            Log.d("Sqflite", m25918A() + mo26701d);
        }
        Boolean mo26705j = interfaceC6394e.mo26705j();
        try {
            m25920C().execSQL(mo26701d.m25898c(), mo26701d.m25899d());
            m25946u(mo26705j);
            return true;
        } catch (Exception e7) {
            m25921D(e7, interfaceC6394e);
            return false;
        }
    }

    /* renamed from: z */
    public SQLiteDatabase m25949z() {
        return this.f22194i;
    }

    /* renamed from: q4.i$a */
    public class a implements DatabaseErrorHandler {
        public a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }
}
