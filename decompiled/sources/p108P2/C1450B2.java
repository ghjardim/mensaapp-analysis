package p108P2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzca;

/* renamed from: P2.B2 */
/* loaded from: classes.dex */
public final class C1450B2 extends zzca {

    /* renamed from: a */
    public final /* synthetic */ C1468D2 f4516a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1450B2(C1468D2 c1468d2, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        this.f4516a = c1468d2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e7) {
            throw e7;
        } catch (SQLiteException unused) {
            C1460C3 c1460c3 = this.f4516a.f5129a;
            c1460c3.mo5624b().m5936r().m5902a("Opening the local database failed, dropping and recreating it");
            c1460c3.m5605B();
            if (!c1460c3.mo5625c().getDatabasePath("google_app_measurement_local.db").delete()) {
                c1460c3.mo5624b().m5936r().m5903b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e8) {
                this.f4516a.f5129a.mo5624b().m5936r().m5903b("Failed to open local database. Events will bypass local storage", e8);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC1874y.m6551b(this.f4516a.f5129a.mo5624b(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        C1558N2 mo5624b = this.f4516a.f5129a.mo5624b();
        strArr = C1468D2.f4578e;
        AbstractC1874y.m6550a(mo5624b, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", strArr);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
