package p323q4;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
import p331r4.AbstractC6295a;

/* renamed from: q4.E */
/* loaded from: classes.dex */
public abstract class AbstractC6198E {
    /* renamed from: a */
    public static List m25901a(Cursor cursor, int i7) {
        String str;
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            Object m25902b = m25902b(cursor, i8);
            if (AbstractC6295a.f22810c) {
                if (m25902b == null) {
                    str = null;
                } else if (m25902b.getClass().isArray()) {
                    str = "array(" + m25902b.getClass().getComponentType().getName() + ")";
                } else {
                    str = m25902b.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i8);
                sb.append(StringUtils.SPACE);
                sb.append(cursor.getType(i8));
                sb.append(": ");
                sb.append(m25902b);
                sb.append(str == null ? StringUtils.EMPTY : " (" + str + ")");
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(m25902b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Object m25902b(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i7);
    }

    /* renamed from: c */
    public static Locale m25903c(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: d */
    public static Locale m25904d(String str) {
        return m25903c(str);
    }
}
