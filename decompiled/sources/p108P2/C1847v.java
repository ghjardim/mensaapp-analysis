package p108P2;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* renamed from: P2.v */
/* loaded from: classes.dex */
public final class C1847v {

    /* renamed from: a */
    public final String f5567a;

    /* renamed from: b */
    public long f5568b;

    /* renamed from: c */
    public final /* synthetic */ C1865x f5569c;

    public C1847v(C1865x c1865x, String str) {
        this.f5569c = c1865x;
        AbstractC3802r.m15123e(str);
        this.f5567a = str;
        this.f5568b = -1L;
    }

    /* renamed from: a */
    public final List m6437a() {
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f5569c.m6546y0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f5567a, String.valueOf(this.f5568b)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j7 = cursor.getLong(0);
                        long j8 = cursor.getLong(3);
                        boolean z6 = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j7 > this.f5568b) {
                            this.f5568b = j7;
                        }
                        try {
                            zzhl zzhlVar = (zzhl) C1882y7.m6561M(zzhm.zze(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = StringUtils.EMPTY;
                            }
                            zzhlVar.zzi(string);
                            zzhlVar.zzm(cursor.getLong(2));
                            arrayList.add(new C1838u(j7, j8, z6, (zzhm) zzhlVar.zzba()));
                        } catch (IOException e7) {
                            this.f5569c.f5129a.mo5624b().m5936r().m5904c("Data loss. Failed to merge raw event. appId", C1558N2.m5932z(this.f5567a), e7);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.emptyList();
                }
            } catch (SQLiteException e8) {
                this.f5569c.f5129a.mo5624b().m5936r().m5904c("Data loss. Error querying raw events batch. appId", C1558N2.m5932z(this.f5567a), e8);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public C1847v(C1865x c1865x, String str, long j7) {
        long m6533r0;
        this.f5569c = c1865x;
        AbstractC3802r.m15123e(str);
        this.f5567a = str;
        m6533r0 = c1865x.m6533r0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j7)}, -1L);
        this.f5568b = m6533r0;
    }
}
