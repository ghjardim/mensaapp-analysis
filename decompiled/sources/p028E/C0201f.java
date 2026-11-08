package p028E;

import android.util.Base64;
import java.util.List;
import p042G.AbstractC0343e;

/* renamed from: E.f */
/* loaded from: classes.dex */
public final class C0201f {

    /* renamed from: a */
    public final String f804a;

    /* renamed from: b */
    public final String f805b;

    /* renamed from: c */
    public final String f806c;

    /* renamed from: d */
    public final List f807d;

    /* renamed from: e */
    public final int f808e = 0;

    /* renamed from: f */
    public final String f809f;

    public C0201f(String str, String str2, String str3, List list) {
        this.f804a = (String) AbstractC0343e.m1353c(str);
        this.f805b = (String) AbstractC0343e.m1353c(str2);
        this.f806c = (String) AbstractC0343e.m1353c(str3);
        this.f807d = (List) AbstractC0343e.m1353c(list);
        this.f809f = m810a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m810a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List m811b() {
        return this.f807d;
    }

    /* renamed from: c */
    public int m812c() {
        return this.f808e;
    }

    /* renamed from: d */
    public String m813d() {
        return this.f809f;
    }

    /* renamed from: e */
    public String m814e() {
        return this.f804a;
    }

    /* renamed from: f */
    public String m815f() {
        return this.f805b;
    }

    /* renamed from: g */
    public String m816g() {
        return this.f806c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f804a + ", mProviderPackage: " + this.f805b + ", mQuery: " + this.f806c + ", mCertificates:");
        for (int i7 = 0; i7 < this.f807d.size(); i7++) {
            sb.append(" [");
            List list = (List) this.f807d.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f808e);
        return sb.toString();
    }
}
