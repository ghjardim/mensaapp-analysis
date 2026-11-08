package p108P2;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzcc;
import java.io.File;

/* renamed from: P2.y */
/* loaded from: classes.dex */
public abstract class AbstractC1874y {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6550a(p108P2.C1558N2 r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.AbstractC1874y.m6550a(P2.N2, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: b */
    public static void m6551b(C1558N2 c1558n2, SQLiteDatabase sQLiteDatabase) {
        if (c1558n2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        zzbx.zza();
        String path = sQLiteDatabase.getPath();
        int i7 = zzcc.zzb;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            c1558n2.m5941w().m5902a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c1558n2.m5941w().m5902a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c1558n2.m5941w().m5902a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c1558n2.m5941w().m5902a("Failed to turn on database write permission for owner");
    }
}
