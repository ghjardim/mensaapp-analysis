package p081L3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.C3952f;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p053H3.C0564j;
import p081L3.C1041Q;
import p081L3.C1077f1;
import p088M3.C1164f;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2152u;
import p116Q3.AbstractC2155x;
import p116Q3.InterfaceC2123A;
import p116Q3.InterfaceC2145n;
import p116Q3.InterfaceC2153v;

/* renamed from: L3.f1 */
/* loaded from: classes.dex */
public final class C1077f1 extends AbstractC1085i0 {

    /* renamed from: c */
    public final c f3530c;

    /* renamed from: d */
    public final C1105p f3531d;

    /* renamed from: e */
    public final C1029L1 f3532e;

    /* renamed from: f */
    public final C1115s0 f3533f;

    /* renamed from: g */
    public final C1095l1 f3534g;

    /* renamed from: h */
    public final C1034N0 f3535h;

    /* renamed from: i */
    public final SQLiteTransactionListener f3536i;

    /* renamed from: j */
    public SQLiteDatabase f3537j;

    /* renamed from: k */
    public boolean f3538k;

    /* renamed from: L3.f1$c */
    public static class c extends SQLiteOpenHelper {

        /* renamed from: a */
        public final C1105p f3546a;

        /* renamed from: b */
        public boolean f3547b;

        public /* synthetic */ c(Context context, C1105p c1105p, String str, a aVar) {
            this(context, c1105p, str);
        }

        /* renamed from: a */
        public final void m4294a(SQLiteDatabase sQLiteDatabase) {
            if (this.f3547b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f3547b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m4294a(sQLiteDatabase);
            new C1011F1(sQLiteDatabase, this.f3546a).m3918m0(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            m4294a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            m4294a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            m4294a(sQLiteDatabase);
            new C1011F1(sQLiteDatabase, this.f3546a).m3918m0(i7);
        }

        public c(Context context, C1105p c1105p, String str) {
            this(context, c1105p, str, 17);
        }

        public c(Context context, C1105p c1105p, String str, int i7) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
            this.f3546a = c1105p;
        }
    }

    /* renamed from: L3.f1$d */
    public static class d {

        /* renamed from: a */
        public final SQLiteDatabase f3548a;

        /* renamed from: b */
        public final String f3549b;

        /* renamed from: c */
        public SQLiteDatabase.CursorFactory f3550c;

        public d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f3548a = sQLiteDatabase;
            this.f3549b = str;
        }

        /* renamed from: g */
        public static /* synthetic */ Cursor m4296g(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            C1077f1.m4277s(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        /* renamed from: b */
        public d m4297b(final Object... objArr) {
            this.f3550c = new SQLiteDatabase.CursorFactory() { // from class: L3.g1
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    Cursor m4296g;
                    m4296g = C1077f1.d.m4296g(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    return m4296g;
                }
            };
            return this;
        }

        /* renamed from: c */
        public int m4298c(InterfaceC2145n interfaceC2145n) {
            Cursor m4302h = m4302h();
            try {
                if (!m4302h.moveToFirst()) {
                    m4302h.close();
                    return 0;
                }
                interfaceC2145n.accept(m4302h);
                m4302h.close();
                return 1;
            } catch (Throwable th) {
                if (m4302h != null) {
                    try {
                        m4302h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* renamed from: d */
        public Object m4299d(InterfaceC2153v interfaceC2153v) {
            Cursor m4302h = m4302h();
            try {
                if (!m4302h.moveToFirst()) {
                    m4302h.close();
                    return null;
                }
                Object apply = interfaceC2153v.apply(m4302h);
                m4302h.close();
                return apply;
            } catch (Throwable th) {
                if (m4302h != null) {
                    try {
                        m4302h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* renamed from: e */
        public int m4300e(InterfaceC2145n interfaceC2145n) {
            Cursor m4302h = m4302h();
            int i7 = 0;
            while (m4302h.moveToNext()) {
                try {
                    i7++;
                    interfaceC2145n.accept(m4302h);
                } catch (Throwable th) {
                    if (m4302h != null) {
                        try {
                            m4302h.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            m4302h.close();
            return i7;
        }

        /* renamed from: f */
        public boolean m4301f() {
            Cursor m4302h = m4302h();
            try {
                boolean z6 = !m4302h.moveToFirst();
                m4302h.close();
                return z6;
            } catch (Throwable th) {
                if (m4302h != null) {
                    try {
                        m4302h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* renamed from: h */
        public final Cursor m4302h() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f3550c;
            return cursorFactory != null ? this.f3548a.rawQueryWithFactory(cursorFactory, this.f3549b, null, null) : this.f3548a.rawQuery(this.f3549b, null);
        }
    }

    public C1077f1(Context context, String str, C1164f c1164f, C1105p c1105p, C1041Q.b bVar) {
        this(c1105p, bVar, new c(context, c1105p, m4279u(str, c1164f), (a) null));
    }

    /* renamed from: C */
    public static /* synthetic */ Long m4271C(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: D */
    public static /* synthetic */ Long m4272D(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: s */
    public static void m4277s(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (obj == null) {
                sQLiteProgram.bindNull(i7 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i7 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i7 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i7 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i7 + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    throw AbstractC2133b.m7214a("Unknown argument %s of type %s", obj, obj.getClass());
                }
                sQLiteProgram.bindBlob(i7 + 1, (byte[]) obj);
            }
        }
    }

    /* renamed from: t */
    public static void m4278t(Context context, C1164f c1164f, String str) {
        String path = context.getDatabasePath(m4279u(str, c1164f)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            AbstractC2152u.m7306a(file);
            AbstractC2152u.m7306a(file2);
            AbstractC2152u.m7306a(file3);
        } catch (IOException e7) {
            throw new C3952f("Failed to clear persistence." + e7, C3952f.a.UNKNOWN);
        }
    }

    /* renamed from: u */
    public static String m4279u(String str, C1164f c1164f) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(c1164f.m4478i(), "utf-8") + "." + URLEncoder.encode(c1164f.m4477h(), "utf-8");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C1034N0 mo4219g() {
        return this.f3535h;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C1029L1 mo4221i() {
        return this.f3532e;
    }

    /* renamed from: E */
    public SQLiteStatement m4282E(String str) {
        return this.f3537j.compileStatement(str);
    }

    /* renamed from: F */
    public d m4283F(String str) {
        return new d(this.f3537j, str);
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: a */
    public InterfaceC1060a mo4213a() {
        return this.f3533f;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: b */
    public InterfaceC1063b mo4214b(C0564j c0564j) {
        return new C1136z0(this, this.f3531d, c0564j);
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: c */
    public InterfaceC1078g mo4215c() {
        return new C0995A0(this);
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: d */
    public InterfaceC1096m mo4216d(C0564j c0564j) {
        return new C1022J0(this, this.f3531d, c0564j);
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: e */
    public InterfaceC1076f0 mo4217e(C0564j c0564j, InterfaceC1096m interfaceC1096m) {
        return new C1057Y0(this, this.f3531d, c0564j, interfaceC1096m);
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: f */
    public InterfaceC1079g0 mo4218f() {
        return new C1068c1(this);
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: h */
    public InterfaceC1106p0 mo4220h() {
        return this.f3534g;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: j */
    public boolean mo4222j() {
        return this.f3538k;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: k */
    public Object mo4223k(String str, InterfaceC2123A interfaceC2123A) {
        AbstractC2155x.m7309a(AbstractC1085i0.f3559a, "Starting transaction: %s", str);
        this.f3537j.beginTransactionWithListener(this.f3536i);
        try {
            Object obj = interfaceC2123A.get();
            this.f3537j.setTransactionSuccessful();
            return obj;
        } finally {
            this.f3537j.endTransaction();
        }
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: l */
    public void mo4224l(String str, Runnable runnable) {
        AbstractC2155x.m7309a(AbstractC1085i0.f3559a, "Starting transaction: %s", str);
        this.f3537j.beginTransactionWithListener(this.f3536i);
        try {
            runnable.run();
            this.f3537j.setTransactionSuccessful();
        } finally {
            this.f3537j.endTransaction();
        }
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: m */
    public void mo4225m() {
        AbstractC2133b.m7217d(this.f3538k, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f3538k = false;
        this.f3537j.close();
        this.f3537j = null;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: n */
    public void mo4226n() {
        AbstractC2133b.m7217d(!this.f3538k, "SQLitePersistence double-started!", new Object[0]);
        this.f3538k = true;
        try {
            this.f3537j = this.f3530c.getWritableDatabase();
            this.f3532e.m4062B();
            this.f3535h.m4111z(this.f3532e.m4077r());
        } catch (SQLiteDatabaseLockedException e7) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e7);
        }
    }

    /* renamed from: v */
    public int m4284v(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        m4277s(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* renamed from: w */
    public void m4285w(String str, Object... objArr) {
        this.f3537j.execSQL(str, objArr);
    }

    /* renamed from: x */
    public long m4286x() {
        return m4287y() * m4288z();
    }

    /* renamed from: y */
    public final long m4287y() {
        return ((Long) m4283F("PRAGMA page_count").m4299d(new InterfaceC2153v() { // from class: L3.d1
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Long m4271C;
                m4271C = C1077f1.m4271C((Cursor) obj);
                return m4271C;
            }
        })).longValue();
    }

    /* renamed from: z */
    public final long m4288z() {
        return ((Long) m4283F("PRAGMA page_size").m4299d(new InterfaceC2153v() { // from class: L3.e1
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Long m4272D;
                m4272D = C1077f1.m4272D((Cursor) obj);
                return m4272D;
            }
        })).longValue();
    }

    public C1077f1(C1105p c1105p, C1041Q.b bVar, c cVar) {
        this.f3536i = new a();
        this.f3530c = cVar;
        this.f3531d = c1105p;
        this.f3532e = new C1029L1(this, c1105p);
        this.f3533f = new C1115s0(this, c1105p);
        this.f3534g = new C1095l1(this, c1105p);
        this.f3535h = new C1034N0(this, bVar);
    }

    /* renamed from: L3.f1$b */
    public static class b {

        /* renamed from: a */
        public final C1077f1 f3540a;

        /* renamed from: b */
        public final String f3541b;

        /* renamed from: c */
        public final String f3542c;

        /* renamed from: d */
        public final List f3543d;

        /* renamed from: e */
        public int f3544e;

        /* renamed from: f */
        public final Iterator f3545f;

        public b(C1077f1 c1077f1, String str, List list, String str2) {
            this.f3544e = 0;
            this.f3540a = c1077f1;
            this.f3541b = str;
            this.f3543d = Collections.emptyList();
            this.f3542c = str2;
            this.f3545f = list.iterator();
        }

        /* renamed from: a */
        public void m4289a() {
            this.f3544e++;
            Object[] m4290b = m4290b();
            this.f3540a.m4285w(this.f3541b + ((Object) AbstractC2131I.m7182B("?", m4290b.length, ", ")) + this.f3542c, m4290b);
        }

        /* renamed from: b */
        public final Object[] m4290b() {
            ArrayList arrayList = new ArrayList(this.f3543d);
            for (int i7 = 0; this.f3545f.hasNext() && i7 < 900 - this.f3543d.size(); i7++) {
                arrayList.add(this.f3545f.next());
            }
            return arrayList.toArray();
        }

        /* renamed from: c */
        public int m4291c() {
            return this.f3544e;
        }

        /* renamed from: d */
        public boolean m4292d() {
            return this.f3545f.hasNext();
        }

        /* renamed from: e */
        public d m4293e() {
            this.f3544e++;
            Object[] m4290b = m4290b();
            return this.f3540a.m4283F(this.f3541b + ((Object) AbstractC2131I.m7182B("?", m4290b.length, ", ")) + this.f3542c).m4297b(m4290b);
        }

        public b(C1077f1 c1077f1, String str, List list, List list2, String str2) {
            this.f3544e = 0;
            this.f3540a = c1077f1;
            this.f3541b = str;
            this.f3543d = list;
            this.f3542c = str2;
            this.f3545f = list2.iterator();
        }
    }

    /* renamed from: L3.f1$a */
    public class a implements SQLiteTransactionListener {
        public a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            C1077f1.this.f3535h.mo4100d();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            C1077f1.this.f3535h.mo4099b();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }
}
