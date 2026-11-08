package p288m4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p256j$.util.Objects;
import p272k4.C5410A;
import p280l4.AbstractC5538a;

/* renamed from: m4.a */
/* loaded from: classes.dex */
public class C5594a implements Closeable {

    /* renamed from: a */
    public final Reader f20213a;

    /* renamed from: p */
    public long f20221p;

    /* renamed from: q */
    public int f20222q;

    /* renamed from: r */
    public String f20223r;

    /* renamed from: s */
    public int[] f20224s;

    /* renamed from: u */
    public String[] f20226u;

    /* renamed from: v */
    public int[] f20227v;

    /* renamed from: b */
    public boolean f20214b = false;

    /* renamed from: c */
    public final char[] f20215c = new char[1024];

    /* renamed from: d */
    public int f20216d = 0;

    /* renamed from: e */
    public int f20217e = 0;

    /* renamed from: f */
    public int f20218f = 0;

    /* renamed from: n */
    public int f20219n = 0;

    /* renamed from: o */
    public int f20220o = 0;

    /* renamed from: t */
    public int f20225t = 1;

    /* renamed from: m4.a$a */
    public class a extends AbstractC5538a {
    }

    static {
        AbstractC5538a.f19946a = new a();
    }

    public C5594a(Reader reader) {
        int[] iArr = new int[32];
        this.f20224s = iArr;
        iArr[0] = 6;
        this.f20226u = new String[32];
        this.f20227v = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f20213a = reader;
    }

    /* renamed from: C */
    public String m23410C() {
        return " at line " + (this.f20218f + 1) + " column " + ((this.f20216d - this.f20219n) + 1) + " path " + m23434r();
    }

    /* renamed from: D */
    public boolean m23411D() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 == 5) {
            this.f20220o = 0;
            int[] iArr = this.f20227v;
            int i8 = this.f20225t - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (i7 == 6) {
            this.f20220o = 0;
            int[] iArr2 = this.f20227v;
            int i9 = this.f20225t - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + m23419T() + m23410C());
    }

    /* renamed from: F */
    public double m23412F() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 == 15) {
            this.f20220o = 0;
            int[] iArr = this.f20227v;
            int i8 = this.f20225t - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f20221p;
        }
        if (i7 == 16) {
            this.f20223r = new String(this.f20215c, this.f20216d, this.f20222q);
            this.f20216d += this.f20222q;
        } else if (i7 == 8 || i7 == 9) {
            this.f20223r = m23416N(i7 == 8 ? '\'' : '\"');
        } else if (i7 == 10) {
            this.f20223r = m23418S();
        } else if (i7 != 11) {
            throw new IllegalStateException("Expected a double but was " + m23419T() + m23410C());
        }
        this.f20220o = 11;
        double parseDouble = Double.parseDouble(this.f20223r);
        if (!this.f20214b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C5596c("JSON forbids NaN and infinities: " + parseDouble + m23410C());
        }
        this.f20223r = null;
        this.f20220o = 0;
        int[] iArr2 = this.f20227v;
        int i9 = this.f20225t - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return parseDouble;
    }

    /* renamed from: G */
    public String m23413G() {
        String m23416N;
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 == 14) {
            m23416N = m23418S();
        } else if (i7 == 12) {
            m23416N = m23416N('\'');
        } else {
            if (i7 != 13) {
                throw new IllegalStateException("Expected a name but was " + m23419T() + m23410C());
            }
            m23416N = m23416N('\"');
        }
        this.f20220o = 0;
        this.f20226u[this.f20225t - 1] = m23416N;
        return m23416N;
    }

    /* renamed from: K */
    public final int m23414K(boolean z6) {
        char[] cArr = this.f20215c;
        int i7 = this.f20216d;
        int i8 = this.f20217e;
        while (true) {
            if (i7 == i8) {
                this.f20216d = i7;
                if (!m23432o(1)) {
                    if (!z6) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m23410C());
                }
                i7 = this.f20216d;
                i8 = this.f20217e;
            }
            int i9 = i7 + 1;
            char c7 = cArr[i7];
            if (c7 == '\n') {
                this.f20218f++;
                this.f20219n = i9;
            } else if (c7 != ' ' && c7 != '\r' && c7 != '\t') {
                if (c7 == '/') {
                    this.f20216d = i9;
                    if (i9 == i8) {
                        this.f20216d = i7;
                        boolean m23432o = m23432o(2);
                        this.f20216d++;
                        if (!m23432o) {
                            return c7;
                        }
                    }
                    m23423d();
                    int i10 = this.f20216d;
                    char c8 = cArr[i10];
                    if (c8 == '*') {
                        this.f20216d = i10 + 1;
                        if (!m23430l0("*/")) {
                            throw m23437x0("Unterminated comment");
                        }
                        i7 = this.f20216d + 2;
                        i8 = this.f20217e;
                    } else {
                        if (c8 != '/') {
                            return c7;
                        }
                        this.f20216d = i10 + 1;
                        m23433q0();
                        i7 = this.f20216d;
                        i8 = this.f20217e;
                    }
                } else {
                    if (c7 != '#') {
                        this.f20216d = i9;
                        return c7;
                    }
                    this.f20216d = i9;
                    m23423d();
                    m23433q0();
                    i7 = this.f20216d;
                    i8 = this.f20217e;
                }
            }
            i7 = i9;
        }
    }

    /* renamed from: M */
    public void m23415M() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 == 7) {
            this.f20220o = 0;
            int[] iArr = this.f20227v;
            int i8 = this.f20225t - 1;
            iArr[i8] = iArr[i8] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + m23419T() + m23410C());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f20216d = r2;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m23416N(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f20215c
            r1 = 0
        L3:
            int r2 = r9.f20216d
            int r3 = r9.f20217e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f20216d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.f20216d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.m23429k0()
            r1.append(r2)
            int r2 = r9.f20216d
            int r3 = r9.f20217e
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f20218f
            int r2 = r2 + r6
            r9.f20218f = r2
            r9.f20219n = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f20216d = r2
            boolean r2 = r9.m23432o(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m23437x0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p288m4.C5594a.m23416N(char):java.lang.String");
    }

    /* renamed from: R */
    public String m23417R() {
        String str;
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 == 10) {
            str = m23418S();
        } else if (i7 == 8) {
            str = m23416N('\'');
        } else if (i7 == 9) {
            str = m23416N('\"');
        } else if (i7 == 11) {
            str = this.f20223r;
            this.f20223r = null;
        } else if (i7 == 15) {
            str = Long.toString(this.f20221p);
        } else {
            if (i7 != 16) {
                throw new IllegalStateException("Expected a string but was " + m23419T() + m23410C());
            }
            str = new String(this.f20215c, this.f20216d, this.f20222q);
            this.f20216d += this.f20222q;
        }
        this.f20220o = 0;
        int[] iArr = this.f20227v;
        int i8 = this.f20225t - 1;
        iArr[i8] = iArr[i8] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m23423d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m23418S() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f20216d
            int r4 = r3 + r2
            int r5 = r6.f20217e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f20215c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m23423d()
            goto L5c
        L4e:
            char[] r3 = r6.f20215c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m23432o(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f20215c
            int r4 = r6.f20216d
            r0.append(r3, r4, r2)
            int r3 = r6.f20216d
            int r3 = r3 + r2
            r6.f20216d = r3
            r2 = 1
            boolean r2 = r6.m23432o(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f20215c
            int r3 = r6.f20216d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f20215c
            int r3 = r6.f20216d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f20216d
            int r2 = r2 + r1
            r6.f20216d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p288m4.C5594a.m23418S():java.lang.String");
    }

    /* renamed from: T */
    public EnumC5595b m23419T() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        switch (i7) {
            case 1:
                return EnumC5595b.BEGIN_OBJECT;
            case 2:
                return EnumC5595b.END_OBJECT;
            case 3:
                return EnumC5595b.BEGIN_ARRAY;
            case 4:
                return EnumC5595b.END_ARRAY;
            case 5:
            case 6:
                return EnumC5595b.BOOLEAN;
            case 7:
                return EnumC5595b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC5595b.STRING;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                return EnumC5595b.NAME;
            case 15:
            case 16:
                return EnumC5595b.NUMBER;
            case 17:
                return EnumC5595b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void m23420a() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 == 3) {
            m23425f0(1);
            this.f20227v[this.f20225t - 1] = 0;
            this.f20220o = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m23419T() + m23410C());
        }
    }

    /* renamed from: c */
    public void m23421c() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 == 1) {
            m23425f0(3);
            this.f20220o = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m23419T() + m23410C());
        }
    }

    /* renamed from: c0 */
    public final int m23422c0() {
        String str;
        String str2;
        int i7;
        char c7 = this.f20215c[this.f20216d];
        if (c7 == 't' || c7 == 'T') {
            str = "true";
            str2 = "TRUE";
            i7 = 5;
        } else if (c7 == 'f' || c7 == 'F') {
            str = "false";
            str2 = "FALSE";
            i7 = 6;
        } else {
            if (c7 != 'n' && c7 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i7 = 7;
        }
        int length = str.length();
        for (int i8 = 1; i8 < length; i8++) {
            if (this.f20216d + i8 >= this.f20217e && !m23432o(i8 + 1)) {
                return 0;
            }
            char c8 = this.f20215c[this.f20216d + i8];
            if (c8 != str.charAt(i8) && c8 != str2.charAt(i8)) {
                return 0;
            }
        }
        if ((this.f20216d + length < this.f20217e || m23432o(length + 1)) && m23438y(this.f20215c[this.f20216d + length])) {
            return 0;
        }
        this.f20216d += length;
        this.f20220o = i7;
        return i7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20220o = 0;
        this.f20224s[0] = 8;
        this.f20225t = 1;
        this.f20213a.close();
    }

    /* renamed from: d */
    public final void m23423d() {
        if (!this.f20214b) {
            throw m23437x0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0093, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r18.f20221p = r11;
        r18.f20216d += r8;
        r18.f20220o = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        r18.f20222q = r8;
        r18.f20220o = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0091, code lost:
    
        if (m23438y(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c9, code lost:
    
        return 0;
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m23424d0() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p288m4.C5594a.m23424d0():int");
    }

    /* renamed from: f0 */
    public final void m23425f0(int i7) {
        int i8 = this.f20225t;
        int[] iArr = this.f20224s;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.f20224s = Arrays.copyOf(iArr, i9);
            this.f20227v = Arrays.copyOf(this.f20227v, i9);
            this.f20226u = (String[]) Arrays.copyOf(this.f20226u, i9);
        }
        int[] iArr2 = this.f20224s;
        int i10 = this.f20225t;
        this.f20225t = i10 + 1;
        iArr2[i10] = i7;
    }

    /* renamed from: g */
    public final void m23426g() {
        m23414K(true);
        int i7 = this.f20216d;
        this.f20216d = i7 - 1;
        if (i7 + 4 <= this.f20217e || m23432o(5)) {
            int i8 = this.f20216d;
            char[] cArr = this.f20215c;
            if (cArr[i8] == ')' && cArr[i8 + 1] == ']' && cArr[i8 + 2] == '}' && cArr[i8 + 3] == '\'' && cArr[i8 + 4] == '\n') {
                this.f20216d = i8 + 5;
            }
        }
    }

    /* renamed from: h */
    public int m23427h() {
        int m23414K;
        int[] iArr = this.f20224s;
        int i7 = this.f20225t;
        int i8 = iArr[i7 - 1];
        if (i8 == 1) {
            iArr[i7 - 1] = 2;
        } else if (i8 == 2) {
            int m23414K2 = m23414K(true);
            if (m23414K2 != 44) {
                if (m23414K2 != 59) {
                    if (m23414K2 != 93) {
                        throw m23437x0("Unterminated array");
                    }
                    this.f20220o = 4;
                    return 4;
                }
                m23423d();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7 - 1] = 4;
                if (i8 == 5 && (m23414K = m23414K(true)) != 44) {
                    if (m23414K != 59) {
                        if (m23414K != 125) {
                            throw m23437x0("Unterminated object");
                        }
                        this.f20220o = 2;
                        return 2;
                    }
                    m23423d();
                }
                int m23414K3 = m23414K(true);
                if (m23414K3 == 34) {
                    this.f20220o = 13;
                    return 13;
                }
                if (m23414K3 == 39) {
                    m23423d();
                    this.f20220o = 12;
                    return 12;
                }
                if (m23414K3 == 125) {
                    if (i8 == 5) {
                        throw m23437x0("Expected name");
                    }
                    this.f20220o = 2;
                    return 2;
                }
                m23423d();
                this.f20216d--;
                if (!m23438y((char) m23414K3)) {
                    throw m23437x0("Expected name");
                }
                this.f20220o = 14;
                return 14;
            }
            if (i8 == 4) {
                iArr[i7 - 1] = 5;
                int m23414K4 = m23414K(true);
                if (m23414K4 != 58) {
                    if (m23414K4 != 61) {
                        throw m23437x0("Expected ':'");
                    }
                    m23423d();
                    if (this.f20216d < this.f20217e || m23432o(1)) {
                        char[] cArr = this.f20215c;
                        int i9 = this.f20216d;
                        if (cArr[i9] == '>') {
                            this.f20216d = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.f20214b) {
                    m23426g();
                }
                this.f20224s[this.f20225t - 1] = 7;
            } else if (i8 == 7) {
                if (m23414K(false) == -1) {
                    this.f20220o = 17;
                    return 17;
                }
                m23423d();
                this.f20216d--;
            } else if (i8 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int m23414K5 = m23414K(true);
        if (m23414K5 == 34) {
            this.f20220o = 9;
            return 9;
        }
        if (m23414K5 == 39) {
            m23423d();
            this.f20220o = 8;
            return 8;
        }
        if (m23414K5 != 44 && m23414K5 != 59) {
            if (m23414K5 == 91) {
                this.f20220o = 3;
                return 3;
            }
            if (m23414K5 != 93) {
                if (m23414K5 == 123) {
                    this.f20220o = 1;
                    return 1;
                }
                this.f20216d--;
                int m23422c0 = m23422c0();
                if (m23422c0 != 0) {
                    return m23422c0;
                }
                int m23424d0 = m23424d0();
                if (m23424d0 != 0) {
                    return m23424d0;
                }
                if (!m23438y(this.f20215c[this.f20216d])) {
                    throw m23437x0("Expected value");
                }
                m23423d();
                this.f20220o = 10;
                return 10;
            }
            if (i8 == 1) {
                this.f20220o = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            throw m23437x0("Unexpected value");
        }
        m23423d();
        this.f20216d--;
        this.f20220o = 7;
        return 7;
    }

    /* renamed from: j */
    public void m23428j() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + m23419T() + m23410C());
        }
        int i8 = this.f20225t;
        this.f20225t = i8 - 1;
        int[] iArr = this.f20227v;
        int i9 = i8 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f20220o = 0;
    }

    /* renamed from: k0 */
    public final char m23429k0() {
        int i7;
        if (this.f20216d == this.f20217e && !m23432o(1)) {
            throw m23437x0("Unterminated escape sequence");
        }
        char[] cArr = this.f20215c;
        int i8 = this.f20216d;
        int i9 = i8 + 1;
        this.f20216d = i9;
        char c7 = cArr[i8];
        if (c7 == '\n') {
            this.f20218f++;
            this.f20219n = i9;
        } else if (c7 != '\"' && c7 != '\'' && c7 != '/' && c7 != '\\') {
            if (c7 == 'b') {
                return '\b';
            }
            if (c7 == 'f') {
                return '\f';
            }
            if (c7 == 'n') {
                return '\n';
            }
            if (c7 == 'r') {
                return '\r';
            }
            if (c7 == 't') {
                return '\t';
            }
            if (c7 != 'u') {
                throw m23437x0("Invalid escape sequence");
            }
            if (i8 + 5 > this.f20217e && !m23432o(4)) {
                throw m23437x0("Unterminated escape sequence");
            }
            int i10 = this.f20216d;
            int i11 = i10 + 4;
            char c8 = 0;
            while (i10 < i11) {
                char c9 = this.f20215c[i10];
                char c10 = (char) (c8 << 4);
                if (c9 >= '0' && c9 <= '9') {
                    i7 = c9 - '0';
                } else if (c9 >= 'a' && c9 <= 'f') {
                    i7 = c9 - 'W';
                } else {
                    if (c9 < 'A' || c9 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f20215c, this.f20216d, 4));
                    }
                    i7 = c9 - '7';
                }
                c8 = (char) (c10 + i7);
                i10++;
            }
            this.f20216d += 4;
            return c8;
        }
        return c7;
    }

    /* renamed from: l0 */
    public final boolean m23430l0(String str) {
        int length = str.length();
        while (true) {
            if (this.f20216d + length > this.f20217e && !m23432o(length)) {
                return false;
            }
            char[] cArr = this.f20215c;
            int i7 = this.f20216d;
            if (cArr[i7] != '\n') {
                for (int i8 = 0; i8 < length; i8++) {
                    if (this.f20215c[this.f20216d + i8] != str.charAt(i8)) {
                        break;
                    }
                }
                return true;
            }
            this.f20218f++;
            this.f20219n = i7 + 1;
            this.f20216d++;
        }
    }

    /* renamed from: m */
    public void m23431m() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        if (i7 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + m23419T() + m23410C());
        }
        int i8 = this.f20225t;
        int i9 = i8 - 1;
        this.f20225t = i9;
        this.f20226u[i9] = null;
        int[] iArr = this.f20227v;
        int i10 = i8 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f20220o = 0;
    }

    /* renamed from: o */
    public final boolean m23432o(int i7) {
        int i8;
        int i9;
        char[] cArr = this.f20215c;
        int i10 = this.f20219n;
        int i11 = this.f20216d;
        this.f20219n = i10 - i11;
        int i12 = this.f20217e;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f20217e = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f20217e = 0;
        }
        this.f20216d = 0;
        do {
            Reader reader = this.f20213a;
            int i14 = this.f20217e;
            int read = reader.read(cArr, i14, cArr.length - i14);
            if (read == -1) {
                return false;
            }
            i8 = this.f20217e + read;
            this.f20217e = i8;
            if (this.f20218f == 0 && (i9 = this.f20219n) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f20216d++;
                this.f20219n = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    /* renamed from: q0 */
    public final void m23433q0() {
        char c7;
        do {
            if (this.f20216d >= this.f20217e && !m23432o(1)) {
                return;
            }
            char[] cArr = this.f20215c;
            int i7 = this.f20216d;
            int i8 = i7 + 1;
            this.f20216d = i8;
            c7 = cArr[i7];
            if (c7 == '\n') {
                this.f20218f++;
                this.f20219n = i8;
                return;
            }
        } while (c7 != '\r');
    }

    /* renamed from: r */
    public String m23434r() {
        return m23435v(false);
    }

    public String toString() {
        return getClass().getSimpleName() + m23410C();
    }

    /* renamed from: v */
    public final String m23435v(boolean z6) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i7 = 0;
        while (true) {
            int i8 = this.f20225t;
            if (i7 >= i8) {
                return sb.toString();
            }
            int i9 = this.f20224s[i7];
            if (i9 == 1 || i9 == 2) {
                int i10 = this.f20227v[i7];
                if (z6 && i10 > 0 && i7 == i8 - 1) {
                    i10--;
                }
                sb.append('[');
                sb.append(i10);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = this.f20226u[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
            i7++;
        }
    }

    /* renamed from: w */
    public boolean m23436w() {
        int i7 = this.f20220o;
        if (i7 == 0) {
            i7 = m23427h();
        }
        return (i7 == 2 || i7 == 4 || i7 == 17) ? false : true;
    }

    /* renamed from: x0 */
    public final IOException m23437x0(String str) {
        throw new C5596c(str + m23410C());
    }

    /* renamed from: y */
    public final boolean m23438y(char c7) {
        if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
            return false;
        }
        if (c7 != '#') {
            if (c7 == ',') {
                return false;
            }
            if (c7 != '/' && c7 != '=') {
                if (c7 == '{' || c7 == '}' || c7 == ':') {
                    return false;
                }
                if (c7 != ';') {
                    switch (c7) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m23423d();
        return false;
    }
}
