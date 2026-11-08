package p289m5;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;
import p206c6.C3616d;

/* renamed from: m5.a */
/* loaded from: classes2.dex */
public final class C5597a {

    /* renamed from: e */
    public static final char[] f20239e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f20240a;

    /* renamed from: b */
    public final String f20241b;

    /* renamed from: c */
    public final int f20242c;

    /* renamed from: d */
    public final String f20243d;

    /* renamed from: m5.a$b */
    public static final class b {

        /* renamed from: a */
        public String f20244a;

        /* renamed from: b */
        public String f20245b;

        /* renamed from: c */
        public int f20246c = -1;

        /* renamed from: b */
        public static String m23445b(String str, int i7, int i8) {
            String m23441d = C5597a.m23441d(str, i7, i8, false);
            if (!m23441d.startsWith("[") || !m23441d.endsWith("]")) {
                return m23449f(m23441d);
            }
            InetAddress m23448e = m23448e(m23441d, 1, m23441d.length() - 1);
            if (m23448e == null) {
                return null;
            }
            byte[] address = m23448e.getAddress();
            if (address.length == 16) {
                return m23450i(address);
            }
            throw new AssertionError();
        }

        /* renamed from: c */
        public static boolean m23446c(String str) {
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public static boolean m23447d(String str, int i7, int i8, byte[] bArr, int i9) {
            int i10 = i9;
            while (i7 < i8) {
                if (i10 == bArr.length) {
                    return false;
                }
                if (i10 != i9) {
                    if (str.charAt(i7) != '.') {
                        return false;
                    }
                    i7++;
                }
                int i11 = i7;
                int i12 = 0;
                while (i11 < i8) {
                    char charAt = str.charAt(i11);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    if ((i12 == 0 && i7 != i11) || (i12 = ((i12 * 10) + charAt) - 48) > 255) {
                        return false;
                    }
                    i11++;
                }
                if (i11 - i7 == 0) {
                    return false;
                }
                bArr[i10] = (byte) i12;
                i10++;
                i7 = i11;
            }
            return i10 == i9 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.net.InetAddress m23448e(java.lang.String r12, int r13, int r14) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = -1
                r4 = r2
                r5 = r3
                r6 = r5
            L9:
                r7 = 0
                if (r13 >= r14) goto L79
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r13 + 2
                r9 = 2
                if (r8 > r14) goto L27
                java.lang.String r10 = "::"
                boolean r10 = r12.regionMatches(r13, r10, r2, r9)
                if (r10 == 0) goto L27
                if (r5 == r3) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r14) goto L25
                goto L79
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L34
                java.lang.String r8 = ":"
                r10 = 1
                boolean r8 = r12.regionMatches(r13, r8, r2, r10)
                if (r8 == 0) goto L36
                int r13 = r13 + 1
            L34:
                r6 = r13
                goto L4b
            L36:
                java.lang.String r8 = "."
                boolean r13 = r12.regionMatches(r13, r8, r2, r10)
                if (r13 == 0) goto L4a
                int r13 = r4 + (-2)
                boolean r12 = m23447d(r12, r6, r14, r1, r13)
                if (r12 != 0) goto L47
                return r7
            L47:
                int r4 = r4 + 2
                goto L79
            L4a:
                return r7
            L4b:
                r8 = r2
                r13 = r6
            L4d:
                if (r13 >= r14) goto L60
                char r10 = r12.charAt(r13)
                int r10 = p289m5.C5597a.m23439a(r10)
                if (r10 != r3) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r10
                int r13 = r13 + 1
                goto L4d
            L60:
                int r10 = r13 - r6
                if (r10 == 0) goto L78
                r11 = 4
                if (r10 <= r11) goto L68
                goto L78
            L68:
                int r7 = r4 + 1
                int r10 = r8 >>> 8
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r1[r4] = r10
                int r4 = r4 + r9
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L78:
                return r7
            L79:
                if (r4 == r0) goto L8a
                if (r5 != r3) goto L7e
                return r7
            L7e:
                int r12 = r4 - r5
                int r13 = 16 - r12
                java.lang.System.arraycopy(r1, r5, r1, r13, r12)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r2)
            L8a:
                java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
                return r12
            L8f:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p289m5.C5597a.b.m23448e(java.lang.String, int, int):java.net.InetAddress");
        }

        /* renamed from: f */
        public static String m23449f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (m23446c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: i */
        public static String m23450i(byte[] bArr) {
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i9 < bArr.length) {
                int i11 = i9;
                while (i11 < 16 && bArr[i11] == 0 && bArr[i11 + 1] == 0) {
                    i11 += 2;
                }
                int i12 = i11 - i9;
                if (i12 > i10) {
                    i7 = i9;
                    i10 = i12;
                }
                i9 = i11 + 2;
            }
            C3616d c3616d = new C3616d();
            while (i8 < bArr.length) {
                if (i8 == i7) {
                    c3616d.mo14505A(58);
                    i8 += i10;
                    if (i8 == 16) {
                        c3616d.mo14505A(58);
                    }
                } else {
                    if (i8 > 0) {
                        c3616d.mo14505A(58);
                    }
                    c3616d.m14599A0(((bArr[i8] & ForkServer.ERROR) << 8) | (bArr[i8 + 1] & ForkServer.ERROR));
                    i8 += 2;
                }
            }
            return c3616d.m14612N();
        }

        /* renamed from: a */
        public C5597a m23451a() {
            if (this.f20244a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f20245b != null) {
                return new C5597a(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* renamed from: g */
        public int m23452g() {
            int i7 = this.f20246c;
            return i7 != -1 ? i7 : C5597a.m23440b(this.f20244a);
        }

        /* renamed from: h */
        public b m23453h(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String m23445b = m23445b(str, 0, str.length());
            if (m23445b != null) {
                this.f20245b = m23445b;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: j */
        public b m23454j(int i7) {
            if (i7 > 0 && i7 <= 65535) {
                this.f20246c = i7;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i7);
        }

        /* renamed from: k */
        public b m23455k(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f20244a = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f20244a = "https";
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20244a);
            sb.append("://");
            if (this.f20245b.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f20245b);
                sb.append(']');
            } else {
                sb.append(this.f20245b);
            }
            int m23452g = m23452g();
            if (m23452g != C5597a.m23440b(this.f20244a)) {
                sb.append(':');
                sb.append(m23452g);
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m23439a(char c7) {
        if (c7 >= '0' && c7 <= '9') {
            return c7 - '0';
        }
        if (c7 >= 'a' && c7 <= 'f') {
            return c7 - 'W';
        }
        if (c7 < 'A' || c7 > 'F') {
            return -1;
        }
        return c7 - '7';
    }

    /* renamed from: b */
    public static int m23440b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: d */
    public static String m23441d(String str, int i7, int i8, boolean z6) {
        for (int i9 = i7; i9 < i8; i9++) {
            char charAt = str.charAt(i9);
            if (charAt == '%' || (charAt == '+' && z6)) {
                C3616d c3616d = new C3616d();
                c3616d.m14607F0(str, i7, i9);
                m23442e(c3616d, str, i9, i8, z6);
                return c3616d.m14612N();
            }
        }
        return str.substring(i7, i8);
    }

    /* renamed from: e */
    public static void m23442e(C3616d c3616d, String str, int i7, int i8, boolean z6) {
        int i9;
        while (i7 < i8) {
            int codePointAt = str.codePointAt(i7);
            if (codePointAt != 37 || (i9 = i7 + 2) >= i8) {
                if (codePointAt == 43 && z6) {
                    c3616d.mo14505A(32);
                }
                c3616d.m14609G0(codePointAt);
            } else {
                int m23439a = m23439a(str.charAt(i7 + 1));
                int m23439a2 = m23439a(str.charAt(i9));
                if (m23439a != -1 && m23439a2 != -1) {
                    c3616d.mo14505A((m23439a << 4) + m23439a2);
                    i7 = i9;
                }
                c3616d.m14609G0(codePointAt);
            }
            i7 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: c */
    public String m23443c() {
        return this.f20241b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5597a) && ((C5597a) obj).f20243d.equals(this.f20243d);
    }

    /* renamed from: f */
    public int m23444f() {
        return this.f20242c;
    }

    public int hashCode() {
        return this.f20243d.hashCode();
    }

    public String toString() {
        return this.f20243d;
    }

    public C5597a(b bVar) {
        this.f20240a = bVar.f20244a;
        this.f20241b = bVar.f20245b;
        this.f20242c = bVar.m23452g();
        this.f20243d = bVar.toString();
    }
}
