package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public abstract class zzca extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i7) {
        super(context, true == str.equals(StringUtils.EMPTY) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i8 = zzcc.zzb;
        zzbx.zza();
    }
}
