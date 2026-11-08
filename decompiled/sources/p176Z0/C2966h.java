package p176Z0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p141U0.AbstractC2501c;
import p141U0.C2500b;
import p171Y2.AbstractC2920c;
import p171Y2.AbstractC2922e;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4336z;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p259j0.C5356y;
import p259j0.C5357z;

/* renamed from: Z0.h */
/* loaded from: classes.dex */
public final class C2966h extends AbstractC2501c {

    /* renamed from: b */
    public static final a f9105b = new a() { // from class: Z0.g
        @Override // p176Z0.C2966h.a
        /* renamed from: a */
        public final boolean mo10676a(int i7, int i8, int i9, int i10, int i11) {
            boolean m10677A;
            m10677A = C2966h.m10677A(i7, i8, i9, i10, i11);
            return m10677A;
        }
    };

    /* renamed from: a */
    public final a f9106a;

    /* renamed from: Z0.h$a */
    public interface a {
        /* renamed from: a */
        boolean mo10676a(int i7, int i8, int i9, int i10, int i11);
    }

    /* renamed from: Z0.h$b */
    public static final class b {

        /* renamed from: a */
        public final int f9107a;

        /* renamed from: b */
        public final boolean f9108b;

        /* renamed from: c */
        public final int f9109c;

        public b(int i7, boolean z6, int i8) {
            this.f9107a = i7;
            this.f9108b = z6;
            this.f9109c = i8;
        }
    }

    public C2966h() {
        this(null);
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m10677A(int i7, int i8, int i9, int i10, int i11) {
        return false;
    }

    /* renamed from: B */
    public static int m10678B(C5357z c5357z, int i7) {
        byte[] m21946e = c5357z.m21946e();
        int m21947f = c5357z.m21947f();
        int i8 = m21947f;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= m21947f + i7) {
                return i7;
            }
            if ((m21946e[i8] & ForkServer.ERROR) == 255 && m21946e[i9] == 0) {
                System.arraycopy(m21946e, i8 + 2, m21946e, i9, (i7 - (i8 - m21947f)) - 2);
                i7--;
            }
            i8 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m10679C(p259j0.C5357z r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m21947f()
        L8:
            int r3 = r18.m21942a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.m21957p()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.m21928I()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.m21932M()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.m21929J()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.m21929J()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.m21939T(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.m21939T(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.m21939T(r2)
            return r6
        L9b:
            int r3 = r18.m21942a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.m21939T(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.m21940U(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.m21939T(r2)
            return r4
        Lb2:
            r1.m21939T(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p176Z0.C2966h.m10679C(j0.z, int, int, boolean):boolean");
    }

    /* renamed from: d */
    public static byte[] m10681d(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? AbstractC5330M.f18805f : Arrays.copyOfRange(bArr, i7, i8);
    }

    /* renamed from: f */
    public static C2959a m10682f(C5357z c5357z, int i7, int i8) {
        int m10702z;
        String str;
        int m21926G = c5357z.m21926G();
        Charset m10699w = m10699w(m21926G);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        c5357z.m21953l(bArr, 0, i9);
        if (i8 == 2) {
            str = "image/" + AbstractC2920c.m10515e(new String(bArr, 0, 3, AbstractC2922e.f9009b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m10702z = 2;
        } else {
            m10702z = m10702z(bArr, 0);
            String m10515e = AbstractC2920c.m10515e(new String(bArr, 0, m10702z, AbstractC2922e.f9009b));
            if (m10515e.indexOf(47) == -1) {
                str = "image/" + m10515e;
            } else {
                str = m10515e;
            }
        }
        int i10 = bArr[m10702z + 1] & ForkServer.ERROR;
        int i11 = m10702z + 2;
        int m10701y = m10701y(bArr, i11, m21926G);
        return new C2959a(str, new String(bArr, i11, m10701y - i11, m10699w), i10, m10681d(bArr, m10701y + m10698v(m21926G), i9));
    }

    /* renamed from: g */
    public static C2960b m10683g(C5357z c5357z, int i7, String str) {
        byte[] bArr = new byte[i7];
        c5357z.m21953l(bArr, 0, i7);
        return new C2960b(str, bArr);
    }

    /* renamed from: h */
    public static C2961c m10684h(C5357z c5357z, int i7, int i8, boolean z6, int i9, a aVar) {
        int m21947f = c5357z.m21947f();
        int m10702z = m10702z(c5357z.m21946e(), m21947f);
        String str = new String(c5357z.m21946e(), m21947f, m10702z - m21947f, AbstractC2922e.f9009b);
        c5357z.m21939T(m10702z + 1);
        int m21957p = c5357z.m21957p();
        int m21957p2 = c5357z.m21957p();
        long m21928I = c5357z.m21928I();
        long j7 = m21928I == 4294967295L ? -1L : m21928I;
        long m21928I2 = c5357z.m21928I();
        long j8 = m21928I2 == 4294967295L ? -1L : m21928I2;
        ArrayList arrayList = new ArrayList();
        int i10 = m21947f + i7;
        while (c5357z.m21947f() < i10) {
            AbstractC2967i m10687k = m10687k(i8, c5357z, z6, i9, aVar);
            if (m10687k != null) {
                arrayList.add(m10687k);
            }
        }
        return new C2961c(str, m21957p, m21957p2, j7, j8, (AbstractC2967i[]) arrayList.toArray(new AbstractC2967i[0]));
    }

    /* renamed from: i */
    public static C2962d m10685i(C5357z c5357z, int i7, int i8, boolean z6, int i9, a aVar) {
        int m21947f = c5357z.m21947f();
        int m10702z = m10702z(c5357z.m21946e(), m21947f);
        String str = new String(c5357z.m21946e(), m21947f, m10702z - m21947f, AbstractC2922e.f9009b);
        c5357z.m21939T(m10702z + 1);
        int m21926G = c5357z.m21926G();
        boolean z7 = (m21926G & 2) != 0;
        boolean z8 = (m21926G & 1) != 0;
        int m21926G2 = c5357z.m21926G();
        String[] strArr = new String[m21926G2];
        for (int i10 = 0; i10 < m21926G2; i10++) {
            int m21947f2 = c5357z.m21947f();
            int m10702z2 = m10702z(c5357z.m21946e(), m21947f2);
            strArr[i10] = new String(c5357z.m21946e(), m21947f2, m10702z2 - m21947f2, AbstractC2922e.f9009b);
            c5357z.m21939T(m10702z2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = m21947f + i7;
        while (c5357z.m21947f() < i11) {
            AbstractC2967i m10687k = m10687k(i8, c5357z, z6, i9, aVar);
            if (m10687k != null) {
                arrayList.add(m10687k);
            }
        }
        return new C2962d(str, z7, z8, strArr, (AbstractC2967i[]) arrayList.toArray(new AbstractC2967i[0]));
    }

    /* renamed from: j */
    public static C2963e m10686j(C5357z c5357z, int i7) {
        if (i7 < 4) {
            return null;
        }
        int m21926G = c5357z.m21926G();
        Charset m10699w = m10699w(m21926G);
        byte[] bArr = new byte[3];
        c5357z.m21953l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        c5357z.m21953l(bArr2, 0, i8);
        int m10701y = m10701y(bArr2, 0, m21926G);
        String str2 = new String(bArr2, 0, m10701y, m10699w);
        int m10698v = m10701y + m10698v(m21926G);
        return new C2963e(str, str2, m10692p(bArr2, m10698v, m10701y(bArr2, m10698v, m21926G), m10699w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0193, code lost:
    
        if (r13 == 67) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p176Z0.AbstractC2967i m10687k(int r20, p259j0.C5357z r21, boolean r22, int r23, p176Z0.C2966h.a r24) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p176Z0.C2966h.m10687k(int, j0.z, boolean, int, Z0.h$a):Z0.i");
    }

    /* renamed from: l */
    public static C2964f m10688l(C5357z c5357z, int i7) {
        int m21926G = c5357z.m21926G();
        Charset m10699w = m10699w(m21926G);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c5357z.m21953l(bArr, 0, i8);
        int m10702z = m10702z(bArr, 0);
        String m18427t = AbstractC4336z.m18427t(new String(bArr, 0, m10702z, AbstractC2922e.f9009b));
        int i9 = m10702z + 1;
        int m10701y = m10701y(bArr, i9, m21926G);
        String m10692p = m10692p(bArr, i9, m10701y, m10699w);
        int m10698v = m10701y + m10698v(m21926G);
        int m10701y2 = m10701y(bArr, m10698v, m21926G);
        return new C2964f(m18427t, m10692p, m10692p(bArr, m10698v, m10701y2, m10699w), m10681d(bArr, m10701y2 + m10698v(m21926G), i8));
    }

    /* renamed from: m */
    public static b m10689m(C5357z c5357z) {
        boolean z6 = false;
        if (c5357z.m21942a() < 10) {
            AbstractC5346o.m21867h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int m21929J = c5357z.m21929J();
        if (m21929J != 4801587) {
            AbstractC5346o.m21867h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(m21929J)));
            return null;
        }
        int m21926G = c5357z.m21926G();
        c5357z.m21940U(1);
        int m21926G2 = c5357z.m21926G();
        int m21925F = c5357z.m21925F();
        if (m21926G == 2) {
            if ((m21926G2 & 64) != 0) {
                AbstractC5346o.m21867h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (m21926G == 3) {
            if ((m21926G2 & 64) != 0) {
                int m21957p = c5357z.m21957p();
                c5357z.m21940U(m21957p);
                m21925F -= m21957p + 4;
            }
        } else {
            if (m21926G != 4) {
                AbstractC5346o.m21867h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + m21926G);
                return null;
            }
            if ((m21926G2 & 64) != 0) {
                int m21925F2 = c5357z.m21925F();
                c5357z.m21940U(m21925F2 - 4);
                m21925F -= m21925F2;
            }
            if ((m21926G2 & 16) != 0) {
                m21925F -= 10;
            }
        }
        if (m21926G < 4 && (m21926G2 & 128) != 0) {
            z6 = true;
        }
        return new b(m21926G, z6, m21925F);
    }

    /* renamed from: n */
    public static C2970l m10690n(C5357z c5357z, int i7) {
        int m21932M = c5357z.m21932M();
        int m21929J = c5357z.m21929J();
        int m21929J2 = c5357z.m21929J();
        int m21926G = c5357z.m21926G();
        int m21926G2 = c5357z.m21926G();
        C5356y c5356y = new C5356y();
        c5356y.m21913m(c5357z);
        int i8 = ((i7 - 10) * 8) / (m21926G + m21926G2);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int m21908h = c5356y.m21908h(m21926G);
            int m21908h2 = c5356y.m21908h(m21926G2);
            iArr[i9] = m21908h;
            iArr2[i9] = m21908h2;
        }
        return new C2970l(m21932M, m21929J, m21929J2, iArr, iArr2);
    }

    /* renamed from: o */
    public static C2971m m10691o(C5357z c5357z, int i7) {
        byte[] bArr = new byte[i7];
        c5357z.m21953l(bArr, 0, i7);
        int m10702z = m10702z(bArr, 0);
        return new C2971m(new String(bArr, 0, m10702z, AbstractC2922e.f9009b), m10681d(bArr, m10702z + 1, i7));
    }

    /* renamed from: p */
    public static String m10692p(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? StringUtils.EMPTY : new String(bArr, i7, i8 - i7, charset);
    }

    /* renamed from: q */
    public static C2972n m10693q(C5357z c5357z, int i7, String str) {
        if (i7 < 1) {
            return null;
        }
        int m21926G = c5357z.m21926G();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c5357z.m21953l(bArr, 0, i8);
        return new C2972n(str, null, m10694r(bArr, m21926G, 0));
    }

    /* renamed from: r */
    public static AbstractC3033v m10694r(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return AbstractC3033v.m11051u(StringUtils.EMPTY);
        }
        AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        int m10701y = m10701y(bArr, i8, i7);
        while (i8 < m10701y) {
            m11045m.mo11040a(new String(bArr, i8, m10701y - i8, m10699w(i7)));
            i8 = m10698v(i7) + m10701y;
            m10701y = m10701y(bArr, i8, i7);
        }
        AbstractC3033v m11063k = m11045m.m11063k();
        return m11063k.isEmpty() ? AbstractC3033v.m11051u(StringUtils.EMPTY) : m11063k;
    }

    /* renamed from: s */
    public static C2972n m10695s(C5357z c5357z, int i7) {
        if (i7 < 1) {
            return null;
        }
        int m21926G = c5357z.m21926G();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c5357z.m21953l(bArr, 0, i8);
        int m10701y = m10701y(bArr, 0, m21926G);
        return new C2972n("TXXX", new String(bArr, 0, m10701y, m10699w(m21926G)), m10694r(bArr, m21926G, m10701y + m10698v(m21926G)));
    }

    /* renamed from: t */
    public static C2973o m10696t(C5357z c5357z, int i7, String str) {
        byte[] bArr = new byte[i7];
        c5357z.m21953l(bArr, 0, i7);
        return new C2973o(str, null, new String(bArr, 0, m10702z(bArr, 0), AbstractC2922e.f9009b));
    }

    /* renamed from: u */
    public static C2973o m10697u(C5357z c5357z, int i7) {
        if (i7 < 1) {
            return null;
        }
        int m21926G = c5357z.m21926G();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c5357z.m21953l(bArr, 0, i8);
        int m10701y = m10701y(bArr, 0, m21926G);
        String str = new String(bArr, 0, m10701y, m10699w(m21926G));
        int m10698v = m10701y + m10698v(m21926G);
        return new C2973o("WXXX", str, m10692p(bArr, m10698v, m10702z(bArr, m10698v), AbstractC2922e.f9009b));
    }

    /* renamed from: v */
    public static int m10698v(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    /* renamed from: w */
    public static Charset m10699w(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? AbstractC2922e.f9009b : AbstractC2922e.f9010c : AbstractC2922e.f9011d : AbstractC2922e.f9013f;
    }

    /* renamed from: x */
    public static String m10700x(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    /* renamed from: y */
    public static int m10701y(byte[] bArr, int i7, int i8) {
        int m10702z = m10702z(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return m10702z;
        }
        while (m10702z < bArr.length - 1) {
            if ((m10702z - i7) % 2 == 0 && bArr[m10702z + 1] == 0) {
                return m10702z;
            }
            m10702z = m10702z(bArr, m10702z + 1);
        }
        return bArr.length;
    }

    /* renamed from: z */
    public static int m10702z(byte[] bArr, int i7) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    @Override // p141U0.AbstractC2501c
    /* renamed from: b */
    public C4334x mo8457b(C2500b c2500b, ByteBuffer byteBuffer) {
        return m10703e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public C4334x m10703e(byte[] bArr, int i7) {
        ArrayList arrayList = new ArrayList();
        C5357z c5357z = new C5357z(bArr, i7);
        b m10689m = m10689m(c5357z);
        if (m10689m == null) {
            return null;
        }
        int m21947f = c5357z.m21947f();
        int i8 = m10689m.f9107a == 2 ? 6 : 10;
        int i9 = m10689m.f9109c;
        if (m10689m.f9108b) {
            i9 = m10678B(c5357z, m10689m.f9109c);
        }
        c5357z.m21938S(m21947f + i9);
        boolean z6 = false;
        if (!m10679C(c5357z, m10689m.f9107a, i8, false)) {
            if (m10689m.f9107a != 4 || !m10679C(c5357z, 4, i8, true)) {
                AbstractC5346o.m21867h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10689m.f9107a);
                return null;
            }
            z6 = true;
        }
        while (c5357z.m21942a() >= i8) {
            AbstractC2967i m10687k = m10687k(m10689m.f9107a, c5357z, z6, i8, this.f9106a);
            if (m10687k != null) {
                arrayList.add(m10687k);
            }
        }
        return new C4334x(arrayList);
    }

    public C2966h(a aVar) {
        this.f9106a = aVar;
    }
}
