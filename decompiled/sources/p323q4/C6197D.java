package p323q4;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* renamed from: q4.D */
/* loaded from: classes.dex */
public class C6197D {

    /* renamed from: a */
    public final String f22170a;

    /* renamed from: b */
    public final List f22171b;

    public C6197D(String str, List list) {
        this.f22170a = str;
        this.f22171b = list == null ? new ArrayList() : list;
    }

    /* renamed from: f */
    public static Object m25895f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            bArr[i7] = (byte) ((Integer) list.get(i7)).intValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public void m25896a(SQLiteProgram sQLiteProgram) {
        List list = this.f22171b;
        if (list != null) {
            int size = list.size();
            int i7 = 0;
            while (i7 < size) {
                Object m25895f = m25895f(this.f22171b.get(i7));
                int i8 = i7 + 1;
                if (m25895f == null) {
                    sQLiteProgram.bindNull(i8);
                } else if (m25895f instanceof byte[]) {
                    sQLiteProgram.bindBlob(i8, (byte[]) m25895f);
                } else if (m25895f instanceof Double) {
                    sQLiteProgram.bindDouble(i8, ((Double) m25895f).doubleValue());
                } else if (m25895f instanceof Integer) {
                    sQLiteProgram.bindLong(i8, ((Integer) m25895f).intValue());
                } else if (m25895f instanceof Long) {
                    sQLiteProgram.bindLong(i8, ((Long) m25895f).longValue());
                } else if (m25895f instanceof String) {
                    sQLiteProgram.bindString(i8, (String) m25895f);
                } else {
                    if (!(m25895f instanceof Boolean)) {
                        throw new IllegalArgumentException("Could not bind " + m25895f + " from index " + i7 + ": Supported types are null, byte[], double, long, boolean and String");
                    }
                    sQLiteProgram.bindLong(i8, ((Boolean) m25895f).booleanValue() ? 1L : 0L);
                }
                i7 = i8;
            }
        }
    }

    /* renamed from: b */
    public List m25897b() {
        return this.f22171b;
    }

    /* renamed from: c */
    public String m25898c() {
        return this.f22170a;
    }

    /* renamed from: d */
    public Object[] m25899d() {
        return m25900e(this.f22171b);
    }

    /* renamed from: e */
    public final Object[] m25900e(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m25895f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6197D)) {
            return false;
        }
        C6197D c6197d = (C6197D) obj;
        String str = this.f22170a;
        if (str != null) {
            if (!str.equals(c6197d.f22170a)) {
                return false;
            }
        } else if (c6197d.f22170a != null) {
            return false;
        }
        if (this.f22171b.size() != c6197d.f22171b.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f22171b.size(); i7++) {
            if ((this.f22171b.get(i7) instanceof byte[]) && (c6197d.f22171b.get(i7) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f22171b.get(i7), (byte[]) c6197d.f22171b.get(i7))) {
                    return false;
                }
            } else if (!this.f22171b.get(i7).equals(c6197d.f22171b.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f22170a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22170a);
        List list = this.f22171b;
        if (list == null || list.isEmpty()) {
            str = StringUtils.EMPTY;
        } else {
            str = StringUtils.SPACE + this.f22171b;
        }
        sb.append(str);
        return sb.toString();
    }
}
