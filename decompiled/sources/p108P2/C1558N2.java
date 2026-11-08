package p108P2;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.apache.tika.utils.StringUtils;

/* renamed from: P2.N2 */
/* loaded from: classes.dex */
public final class C1558N2 extends AbstractC1717g4 {

    /* renamed from: c */
    public char f4834c;

    /* renamed from: d */
    public long f4835d;

    /* renamed from: e */
    public String f4836e;

    /* renamed from: f */
    public final C1540L2 f4837f;

    /* renamed from: g */
    public final C1540L2 f4838g;

    /* renamed from: h */
    public final C1540L2 f4839h;

    /* renamed from: i */
    public final C1540L2 f4840i;

    /* renamed from: j */
    public final C1540L2 f4841j;

    /* renamed from: k */
    public final C1540L2 f4842k;

    /* renamed from: l */
    public final C1540L2 f4843l;

    /* renamed from: m */
    public final C1540L2 f4844m;

    /* renamed from: n */
    public final C1540L2 f4845n;

    public C1558N2(C1460C3 c1460c3) {
        super(c1460c3);
        this.f4834c = (char) 0;
        this.f4835d = -1L;
        this.f4837f = new C1540L2(this, 6, false, false);
        this.f4838g = new C1540L2(this, 6, true, false);
        this.f4839h = new C1540L2(this, 6, false, true);
        this.f4840i = new C1540L2(this, 5, false, false);
        this.f4841j = new C1540L2(this, 5, true, false);
        this.f4842k = new C1540L2(this, 5, false, true);
        this.f4843l = new C1540L2(this, 4, false, false);
        this.f4844m = new C1540L2(this, 3, false, false);
        this.f4845n = new C1540L2(this, 2, false, false);
    }

    /* renamed from: A */
    public static String m5925A(boolean z6, String str, Object obj, Object obj2, Object obj3) {
        String m5926B = m5926B(z6, obj);
        String m5926B2 = m5926B(z6, obj2);
        String m5926B3 = m5926B(z6, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = StringUtils.EMPTY;
        if (str == null) {
            str = StringUtils.EMPTY;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m5926B)) {
            sb.append(str2);
            sb.append(m5926B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m5926B2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(m5926B2);
        }
        if (!TextUtils.isEmpty(m5926B3)) {
            sb.append(str3);
            sb.append(m5926B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    public static String m5926B(boolean z6, Object obj) {
        String str;
        String className;
        String str2 = StringUtils.EMPTY;
        if (obj == null) {
            return StringUtils.EMPTY;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i7 = 0;
        if (obj instanceof Long) {
            if (!z6) {
                return obj.toString();
            }
            Long l7 = (Long) obj;
            if (Math.abs(l7.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l7.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof C1549M2)) {
                return z6 ? "-" : obj.toString();
            }
            str = ((C1549M2) obj).f4818a;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z6 ? th.getClass().getName() : th.toString());
        String m5927C = m5927C(C1460C3.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m5927C(className).equals(m5927C)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i7++;
        }
        return sb2.toString();
    }

    /* renamed from: C */
    public static String m5927C(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? StringUtils.EMPTY : str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    public static Object m5932z(String str) {
        if (str == null) {
            return null;
        }
        return new C1549M2(str);
    }

    /* renamed from: D */
    public final String m5933D() {
        String str;
        synchronized (this) {
            try {
                if (this.f4836e == null) {
                    C1460C3 c1460c3 = this.f5129a;
                    if (c1460c3.m5622T() != null) {
                        this.f4836e = c1460c3.m5622T();
                    } else {
                        this.f4836e = this.f5129a.m5605B().m6131I();
                    }
                }
                AbstractC3802r.m15129k(this.f4836e);
                str = this.f4836e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: G */
    public final void m5934G(int i7, boolean z6, boolean z7, String str, Object obj, Object obj2, Object obj3) {
        if (!z6 && Log.isLoggable(m5933D(), i7)) {
            Log.println(i7, m5933D(), m5925A(false, str, obj, obj2, obj3));
        }
        if (z7 || i7 < 5) {
            return;
        }
        AbstractC3802r.m15129k(str);
        C1851v3 m5612I = this.f5129a.m5612I();
        if (m5612I == null) {
            Log.println(6, m5933D(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!m5612I.m6081n()) {
                Log.println(6, m5933D(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i7 >= 9) {
                i7 = 8;
            }
            m5612I.m6446A(new RunnableC1531K2(this, i7, str, obj, obj2, obj3));
        }
    }

    @Override // p108P2.AbstractC1717g4
    /* renamed from: j */
    public final boolean mo5654j() {
        return false;
    }

    /* renamed from: q */
    public final C1540L2 m5935q() {
        return this.f4844m;
    }

    /* renamed from: r */
    public final C1540L2 m5936r() {
        return this.f4837f;
    }

    /* renamed from: s */
    public final C1540L2 m5937s() {
        return this.f4839h;
    }

    /* renamed from: t */
    public final C1540L2 m5938t() {
        return this.f4838g;
    }

    /* renamed from: u */
    public final C1540L2 m5939u() {
        return this.f4843l;
    }

    /* renamed from: v */
    public final C1540L2 m5940v() {
        return this.f4845n;
    }

    /* renamed from: w */
    public final C1540L2 m5941w() {
        return this.f4840i;
    }

    /* renamed from: x */
    public final C1540L2 m5942x() {
        return this.f4842k;
    }

    /* renamed from: y */
    public final C1540L2 m5943y() {
        return this.f4841j;
    }
}
