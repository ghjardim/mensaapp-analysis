package p273k5;

import javax.security.auth.x500.X500Principal;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.StringUtils;

/* renamed from: k5.d */
/* loaded from: classes2.dex */
public final class C5447d {

    /* renamed from: a */
    public final String f19636a;

    /* renamed from: b */
    public final int f19637b;

    /* renamed from: c */
    public int f19638c;

    /* renamed from: d */
    public int f19639d;

    /* renamed from: e */
    public int f19640e;

    /* renamed from: f */
    public int f19641f;

    /* renamed from: g */
    public char[] f19642g;

    public C5447d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f19636a = name;
        this.f19637b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f19641f - r2);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m22951a() {
        /*
            r8 = this;
            int r0 = r8.f19638c
            r8.f19639d = r0
            r8.f19640e = r0
        L6:
            int r0 = r8.f19638c
            int r1 = r8.f19637b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f19642g
            int r2 = r8.f19639d
            int r3 = r8.f19640e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f19642g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.f19640e
            int r4 = r3 + 1
            r8.f19640e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f19638c = r0
            goto L6
        L3e:
            int r0 = r8.f19640e
            int r2 = r0 + 1
            r8.f19640e = r2
            char r2 = r8.m22954d()
            r1[r0] = r2
            int r0 = r8.f19638c
            int r0 = r0 + 1
            r8.f19638c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f19639d
            int r3 = r8.f19640e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f19640e
            r8.f19641f = r2
            int r0 = r0 + 1
            r8.f19638c = r0
            int r0 = r2 + 1
            r8.f19640e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f19638c
            int r1 = r8.f19637b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f19642g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f19640e
            int r7 = r1 + 1
            r8.f19640e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f19638c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f19642g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f19642g
            int r2 = r8.f19639d
            int r3 = r8.f19641f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p273k5.C5447d.m22951a():java.lang.String");
    }

    /* renamed from: b */
    public String m22952b(String str) {
        this.f19638c = 0;
        this.f19639d = 0;
        this.f19640e = 0;
        this.f19641f = 0;
        this.f19642g = this.f19636a.toCharArray();
        String m22957g = m22957g();
        if (m22957g == null) {
            return null;
        }
        do {
            int i7 = this.f19638c;
            if (i7 == this.f19637b) {
                return null;
            }
            char c7 = this.f19642g[i7];
            String m22951a = c7 != '\"' ? c7 != '#' ? (c7 == '+' || c7 == ',' || c7 == ';') ? StringUtils.EMPTY : m22951a() : m22956f() : m22958h();
            if (str.equalsIgnoreCase(m22957g)) {
                return m22951a;
            }
            int i8 = this.f19638c;
            if (i8 >= this.f19637b) {
                return null;
            }
            char c8 = this.f19642g[i8];
            if (c8 != ',' && c8 != ';' && c8 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f19636a);
            }
            this.f19638c = i8 + 1;
            m22957g = m22957g();
        } while (m22957g != null);
        throw new IllegalStateException("Malformed DN: " + this.f19636a);
    }

    /* renamed from: c */
    public final int m22953c(int i7) {
        int i8;
        int i9;
        int i10 = i7 + 1;
        if (i10 >= this.f19637b) {
            throw new IllegalStateException("Malformed DN: " + this.f19636a);
        }
        char[] cArr = this.f19642g;
        char c7 = cArr[i7];
        if (c7 >= '0' && c7 <= '9') {
            i8 = c7 - '0';
        } else if (c7 >= 'a' && c7 <= 'f') {
            i8 = c7 - 'W';
        } else {
            if (c7 < 'A' || c7 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f19636a);
            }
            i8 = c7 - '7';
        }
        char c8 = cArr[i10];
        if (c8 >= '0' && c8 <= '9') {
            i9 = c8 - '0';
        } else if (c8 >= 'a' && c8 <= 'f') {
            i9 = c8 - 'W';
        } else {
            if (c8 < 'A' || c8 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f19636a);
            }
            i9 = c8 - '7';
        }
        return (i8 << 4) + i9;
    }

    /* renamed from: d */
    public final char m22954d() {
        int i7 = this.f19638c + 1;
        this.f19638c = i7;
        if (i7 == this.f19637b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19636a);
        }
        char c7 = this.f19642g[i7];
        if (c7 == ' ' || c7 == '%' || c7 == '\\' || c7 == '_' || c7 == '\"' || c7 == '#') {
            return c7;
        }
        switch (c7) {
            case '*':
            case '+':
            case ',':
                return c7;
            default:
                switch (c7) {
                    case ';':
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    case '=':
                    case '>':
                        return c7;
                    default:
                        return m22955e();
                }
        }
    }

    /* renamed from: e */
    public final char m22955e() {
        int i7;
        int i8;
        int m22953c = m22953c(this.f19638c);
        this.f19638c++;
        if (m22953c < 128) {
            return (char) m22953c;
        }
        if (m22953c < 192 || m22953c > 247) {
            return '?';
        }
        if (m22953c <= 223) {
            i7 = m22953c & 31;
            i8 = 1;
        } else if (m22953c <= 239) {
            i7 = m22953c & 15;
            i8 = 2;
        } else {
            i7 = m22953c & 7;
            i8 = 3;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f19638c;
            int i11 = i10 + 1;
            this.f19638c = i11;
            if (i11 == this.f19637b || this.f19642g[i11] != '\\') {
                return '?';
            }
            int i12 = i10 + 2;
            this.f19638c = i12;
            int m22953c2 = m22953c(i12);
            this.f19638c++;
            if ((m22953c2 & 192) != 128) {
                return '?';
            }
            i7 = (i7 << 6) + (m22953c2 & 63);
        }
        return (char) i7;
    }

    /* renamed from: f */
    public final String m22956f() {
        int i7;
        char[] cArr;
        char c7;
        int i8 = this.f19638c;
        if (i8 + 4 >= this.f19637b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19636a);
        }
        this.f19639d = i8;
        this.f19638c = i8 + 1;
        while (true) {
            i7 = this.f19638c;
            if (i7 == this.f19637b || (c7 = (cArr = this.f19642g)[i7]) == '+' || c7 == ',' || c7 == ';') {
                break;
            }
            if (c7 == ' ') {
                this.f19640e = i7;
                this.f19638c = i7 + 1;
                while (true) {
                    int i9 = this.f19638c;
                    if (i9 >= this.f19637b || this.f19642g[i9] != ' ') {
                        break;
                    }
                    this.f19638c = i9 + 1;
                }
            } else {
                if (c7 >= 'A' && c7 <= 'F') {
                    cArr[i7] = (char) (c7 + ' ');
                }
                this.f19638c = i7 + 1;
            }
        }
        this.f19640e = i7;
        int i10 = this.f19640e;
        int i11 = this.f19639d;
        int i12 = i10 - i11;
        if (i12 < 5 || (i12 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19636a);
        }
        int i13 = i12 / 2;
        byte[] bArr = new byte[i13];
        int i14 = i11 + 1;
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) m22953c(i14);
            i14 += 2;
        }
        return new String(this.f19642g, this.f19639d, i12);
    }

    /* renamed from: g */
    public final String m22957g() {
        int i7;
        int i8;
        int i9;
        int i10;
        char c7;
        int i11;
        int i12;
        char c8;
        char c9;
        while (true) {
            i7 = this.f19638c;
            i8 = this.f19637b;
            if (i7 >= i8 || this.f19642g[i7] != ' ') {
                break;
            }
            this.f19638c = i7 + 1;
        }
        if (i7 == i8) {
            return null;
        }
        this.f19639d = i7;
        this.f19638c = i7 + 1;
        while (true) {
            i9 = this.f19638c;
            i10 = this.f19637b;
            if (i9 >= i10 || (c9 = this.f19642g[i9]) == '=' || c9 == ' ') {
                break;
            }
            this.f19638c = i9 + 1;
        }
        if (i9 >= i10) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19636a);
        }
        this.f19640e = i9;
        if (this.f19642g[i9] == ' ') {
            while (true) {
                i11 = this.f19638c;
                i12 = this.f19637b;
                if (i11 >= i12 || (c8 = this.f19642g[i11]) == '=' || c8 != ' ') {
                    break;
                }
                this.f19638c = i11 + 1;
            }
            if (this.f19642g[i11] != '=' || i11 == i12) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f19636a);
            }
        }
        this.f19638c++;
        while (true) {
            int i13 = this.f19638c;
            if (i13 >= this.f19637b || this.f19642g[i13] != ' ') {
                break;
            }
            this.f19638c = i13 + 1;
        }
        int i14 = this.f19640e;
        int i15 = this.f19639d;
        if (i14 - i15 > 4) {
            char[] cArr = this.f19642g;
            if (cArr[i15 + 3] == '.' && (((c7 = cArr[i15]) == 'O' || c7 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                this.f19639d = i15 + 4;
            }
        }
        char[] cArr2 = this.f19642g;
        int i16 = this.f19639d;
        return new String(cArr2, i16, i14 - i16);
    }

    /* renamed from: h */
    public final String m22958h() {
        int i7 = this.f19638c + 1;
        this.f19638c = i7;
        this.f19639d = i7;
        this.f19640e = i7;
        while (true) {
            int i8 = this.f19638c;
            if (i8 == this.f19637b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f19636a);
            }
            char[] cArr = this.f19642g;
            char c7 = cArr[i8];
            if (c7 == '\"') {
                this.f19638c = i8 + 1;
                while (true) {
                    int i9 = this.f19638c;
                    if (i9 >= this.f19637b || this.f19642g[i9] != ' ') {
                        break;
                    }
                    this.f19638c = i9 + 1;
                }
                char[] cArr2 = this.f19642g;
                int i10 = this.f19639d;
                return new String(cArr2, i10, this.f19640e - i10);
            }
            if (c7 == '\\') {
                cArr[this.f19640e] = m22954d();
            } else {
                cArr[this.f19640e] = c7;
            }
            this.f19638c++;
            this.f19640e++;
        }
    }
}
