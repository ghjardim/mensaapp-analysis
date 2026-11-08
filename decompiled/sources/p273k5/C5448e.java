package p273k5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: k5.e */
/* loaded from: classes2.dex */
public final class C5448e {

    /* renamed from: a */
    public final String[] f19643a;

    /* renamed from: k5.e$b */
    public static final class b {

        /* renamed from: a */
        public final List f19644a = new ArrayList(20);

        /* renamed from: b */
        public b m22963b(String str, String str2) {
            this.f19644a.add(str);
            this.f19644a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C5448e m22964c() {
            return new C5448e(this);
        }

        /* renamed from: d */
        public final void m22965d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i7), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i8 = 0; i8 < length2; i8++) {
                char charAt2 = str2.charAt(i8);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i8), str2));
                }
            }
        }

        /* renamed from: e */
        public b m22966e(String str) {
            int i7 = 0;
            while (i7 < this.f19644a.size()) {
                if (str.equalsIgnoreCase((String) this.f19644a.get(i7))) {
                    this.f19644a.remove(i7);
                    this.f19644a.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            }
            return this;
        }

        /* renamed from: f */
        public b m22967f(String str, String str2) {
            m22965d(str, str2);
            m22966e(str);
            m22963b(str, str2);
            return this;
        }
    }

    /* renamed from: a */
    public String m22959a(int i7) {
        int i8 = i7 * 2;
        if (i8 < 0) {
            return null;
        }
        String[] strArr = this.f19643a;
        if (i8 >= strArr.length) {
            return null;
        }
        return strArr[i8];
    }

    /* renamed from: b */
    public int m22960b() {
        return this.f19643a.length / 2;
    }

    /* renamed from: c */
    public String m22961c(int i7) {
        int i8 = (i7 * 2) + 1;
        if (i8 < 0) {
            return null;
        }
        String[] strArr = this.f19643a;
        if (i8 >= strArr.length) {
            return null;
        }
        return strArr[i8];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m22960b = m22960b();
        for (int i7 = 0; i7 < m22960b; i7++) {
            sb.append(m22959a(i7));
            sb.append(": ");
            sb.append(m22961c(i7));
            sb.append("\n");
        }
        return sb.toString();
    }

    public C5448e(b bVar) {
        this.f19643a = (String[]) bVar.f19644a.toArray(new String[bVar.f19644a.size()]);
    }
}
