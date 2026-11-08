package p108P2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* renamed from: P2.D2 */
/* loaded from: classes.dex */
public final class C1468D2 extends AbstractC1724h2 {

    /* renamed from: e */
    public static final String[] f4578e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c */
    public final C1450B2 f4579c;

    /* renamed from: d */
    public boolean f4580d;

    public C1468D2(C1460C3 c1460c3) {
        super(c1460c3);
        Context mo5625c = this.f5129a.mo5625c();
        this.f5129a.m5605B();
        this.f4579c = new C1450B2(this, mo5625c, "google_app_measurement_local.db");
    }

    @Override // p108P2.AbstractC1724h2
    /* renamed from: n */
    public final boolean mo5563n() {
        return false;
    }

    /* renamed from: o */
    public final SQLiteDatabase m5658o() {
        if (this.f4580d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f4579c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f4580d = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034e  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m5659p(int r28) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1468D2.m5659p(int):java.util.List");
    }

    /* renamed from: q */
    public final void m5660q() {
        int delete;
        mo5762h();
        try {
            SQLiteDatabase m5658o = m5658o();
            if (m5658o == null || (delete = m5658o.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f5129a.mo5624b().m5940v().m5903b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5903b("Error resetting local analytics data. error", e7);
        }
    }

    /* renamed from: r */
    public final boolean m5661r() {
        return m5668z(3, new byte[0]);
    }

    /* renamed from: s */
    public final boolean m5662s() {
        C1460C3 c1460c3 = this.f5129a;
        Context mo5625c = c1460c3.mo5625c();
        c1460c3.m5605B();
        return mo5625c.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: t */
    public final boolean m5663t() {
        mo5762h();
        if (!this.f4580d && m5662s()) {
            int i7 = 5;
            int i8 = 0;
            while (true) {
                if (i8 >= 5) {
                    this.f5129a.mo5624b().m5941w().m5902a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase m5658o = m5658o();
                            if (m5658o != null) {
                                m5658o.beginTransaction();
                                m5658o.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                m5658o.setTransactionSuccessful();
                                m5658o.endTransaction();
                                m5658o.close();
                                return true;
                            }
                            this.f4580d = true;
                        } catch (SQLiteException e7) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.f5129a.mo5624b().m5936r().m5903b("Error deleting app launch break from local database", e7);
                            this.f4580d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i7);
                        i7 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e8) {
                    this.f5129a.mo5624b().m5936r().m5903b("Error deleting app launch break from local database", e8);
                    this.f4580d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i8++;
            }
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m5664u(C1739j c1739j) {
        C1460C3 c1460c3 = this.f5129a;
        byte[] m5724q0 = c1460c3.m5619Q().m5724q0(c1739j);
        if (m5724q0.length <= 131072) {
            return m5668z(2, m5724q0);
        }
        c1460c3.mo5624b().m5938t().m5902a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: v */
    public final boolean m5665v(C1501H c1501h) {
        C1460C3 c1460c3 = this.f5129a;
        byte[] m5724q0 = c1460c3.m5619Q().m5724q0(c1501h);
        if (m5724q0 == null) {
            c1460c3.mo5624b().m5938t().m5902a("Null default event parameters; not writing to database");
            return false;
        }
        if (m5724q0.length <= 131072) {
            return m5668z(4, m5724q0);
        }
        c1460c3.mo5624b().m5938t().m5902a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: w */
    public final boolean m5666w(C1519J c1519j) {
        Parcel obtain = Parcel.obtain();
        C1528K.m5891a(c1519j, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m5668z(0, marshall);
        }
        this.f5129a.mo5624b().m5938t().m5902a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: x */
    public final boolean m5667x(C1891z7 c1891z7) {
        Parcel obtain = Parcel.obtain();
        C1446A7.m5577a(c1891z7, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m5668z(1, marshall);
        }
        this.f5129a.mo5624b().m5938t().m5902a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5668z(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1468D2.m5668z(int, byte[]):boolean");
    }
}
