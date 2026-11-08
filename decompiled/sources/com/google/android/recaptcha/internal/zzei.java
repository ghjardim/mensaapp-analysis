package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7023n;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzei extends SQLiteOpenHelper {
    public static final zzeg zza = new zzeg(null);
    private static final int zzb;
    private static final String zzc;
    private static zzei zzd;

    static {
        int zzc2;
        String zzd2;
        zzc2 = zzeg.zzc("18.6.1");
        zzb = zzc2;
        zzd2 = zzeg.zzd("18.6.1");
        zzc = zzd2;
    }

    public /* synthetic */ zzei(Context context, AbstractC5464g abstractC5464g) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(AbstractC7032w.m28878D(list, ", ", "(", ")", 0, null, zzeh.zza, 24, null))), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i7 = -1;
        try {
            if (rawQuery.moveToNext()) {
                i7 = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i7;
    }

    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i7 = query.getInt(query.getColumnIndexOrThrow("id"));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j7 = query.getLong(query.getColumnIndexOrThrow("ts"));
                    AbstractC5469l.m23025b(string);
                    arrayList.add(new zzej(string, j7, i7));
                } catch (Exception unused) {
                    arrayList = AbstractC7024o.m28861g();
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzej zzejVar) {
        return zza(AbstractC7023n.m28856b(zzejVar)) == 1;
    }
}
