package p327r0;

import android.net.Uri;
import org.apache.tika.utils.StringUtils;
import p259j0.AbstractC5324G;

/* renamed from: r0.i */
/* loaded from: classes.dex */
public final class C6242i {

    /* renamed from: a */
    public final long f22333a;

    /* renamed from: b */
    public final long f22334b;

    /* renamed from: c */
    public final String f22335c;

    /* renamed from: d */
    public int f22336d;

    public C6242i(String str, long j7, long j8) {
        this.f22335c = str == null ? StringUtils.EMPTY : str;
        this.f22333a = j7;
        this.f22334b = j8;
    }

    /* renamed from: a */
    public C6242i m26087a(C6242i c6242i, String str) {
        String m26089c = m26089c(str);
        if (c6242i != null && m26089c.equals(c6242i.m26089c(str))) {
            long j7 = this.f22334b;
            if (j7 != -1) {
                long j8 = this.f22333a;
                if (j8 + j7 == c6242i.f22333a) {
                    long j9 = c6242i.f22334b;
                    return new C6242i(m26089c, j8, j9 != -1 ? j7 + j9 : -1L);
                }
            }
            long j10 = c6242i.f22334b;
            if (j10 != -1) {
                long j11 = c6242i.f22333a;
                if (j11 + j10 == this.f22333a) {
                    return new C6242i(m26089c, j11, j7 != -1 ? j10 + j7 : -1L);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri m26088b(String str) {
        return AbstractC5324G.m21666f(str, this.f22335c);
    }

    /* renamed from: c */
    public String m26089c(String str) {
        return AbstractC5324G.m21665e(str, this.f22335c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6242i.class != obj.getClass()) {
            return false;
        }
        C6242i c6242i = (C6242i) obj;
        return this.f22333a == c6242i.f22333a && this.f22334b == c6242i.f22334b && this.f22335c.equals(c6242i.f22335c);
    }

    public int hashCode() {
        if (this.f22336d == 0) {
            this.f22336d = ((((527 + ((int) this.f22333a)) * 31) + ((int) this.f22334b)) * 31) + this.f22335c.hashCode();
        }
        return this.f22336d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f22335c + ", start=" + this.f22333a + ", length=" + this.f22334b + ")";
    }
}
