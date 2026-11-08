package p206c6;

import com.google.android.gms.common.api.C3643a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p125R5.C2277c;
import p214d6.AbstractC4131a;
import p378x5.AbstractC7019j;

/* renamed from: c6.d */
/* loaded from: classes2.dex */
public final class C3616d implements InterfaceC3618f, InterfaceC3617e, Cloneable, ByteChannel {

    /* renamed from: a */
    public C3604P f12107a;

    /* renamed from: b */
    public long f12108b;

    /* renamed from: c6.d$a */
    public static final class a implements Closeable {

        /* renamed from: a */
        public C3616d f12109a;

        /* renamed from: b */
        public C3604P f12110b;

        /* renamed from: d */
        public byte[] f12112d;

        /* renamed from: c */
        public long f12111c = -1;

        /* renamed from: e */
        public int f12113e = -1;

        /* renamed from: f */
        public int f12114f = -1;

        /* renamed from: a */
        public final void m14636a(C3604P c3604p) {
            this.f12110b = c3604p;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12109a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f12109a = null;
            m14636a(null);
            this.f12111c = -1L;
            this.f12112d = null;
            this.f12113e = -1;
            this.f12114f = -1;
        }
    }

    /* renamed from: c6.d$c */
    public static final class c extends OutputStream {
        public c() {
        }

        public String toString() {
            return C3616d.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            C3616d.this.mo14505A(i7);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i7, int i8) {
            AbstractC5469l.m23028e(data, "data");
            C3616d.this.m14632x0(data, i7, i8);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    /* renamed from: A0 */
    public C3616d m14599A0(long j7) {
        if (j7 == 0) {
            return mo14505A(48);
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i7 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        C3604P m14624k0 = m14624k0(i7);
        byte[] bArr = m14624k0.f12064a;
        int i8 = m14624k0.f12066c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = AbstractC4131a.m17323a()[(int) (15 & j7)];
            j7 >>>= 4;
        }
        m14624k0.f12066c += i7;
        m14615T(m14618c0() + i7);
        return this;
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C3616d mo14510t(int i7) {
        C3604P m14624k0 = m14624k0(4);
        byte[] bArr = m14624k0.f12064a;
        int i8 = m14624k0.f12066c;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        m14624k0.f12066c = i8 + 4;
        m14615T(m14618c0() + 4);
        return this;
    }

    /* renamed from: C */
    public boolean m14601C(long j7, C3619g bytes, int i7, int i8) {
        AbstractC5469l.m23028e(bytes, "bytes");
        if (j7 < 0 || i7 < 0 || i8 < 0 || m14618c0() - j7 < i8 || bytes.size() - i7 < i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (m14627o(i9 + j7) != bytes.m14647i(i7 + i9)) {
                return false;
            }
        }
        return true;
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C3616d mo14509q(int i7) {
        C3604P m14624k0 = m14624k0(2);
        byte[] bArr = m14624k0.f12064a;
        int i8 = m14624k0.f12066c;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        m14624k0.f12066c = i8 + 2;
        m14615T(m14618c0() + 2);
        return this;
    }

    /* renamed from: D */
    public byte[] m14603D() {
        return mo14514Z(m14618c0());
    }

    /* renamed from: D0 */
    public final C3616d m14604D0(OutputStream out, long j7) {
        AbstractC5469l.m23028e(out, "out");
        AbstractC3614b.m14567b(this.f12108b, 0L, j7);
        C3604P c3604p = this.f12107a;
        while (j7 > 0) {
            AbstractC5469l.m23025b(c3604p);
            int min = (int) Math.min(j7, c3604p.f12066c - c3604p.f12065b);
            out.write(c3604p.f12064a, c3604p.f12065b, min);
            int i7 = c3604p.f12065b + min;
            c3604p.f12065b = i7;
            long j8 = min;
            this.f12108b -= j8;
            j7 -= j8;
            if (i7 == c3604p.f12066c) {
                C3604P m14525b = c3604p.m14525b();
                this.f12107a = m14525b;
                C3605Q.m14530b(c3604p);
                c3604p = m14525b;
            }
        }
        return this;
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C3616d mo14506O(String string) {
        AbstractC5469l.m23028e(string, "string");
        return m14607F0(string, 0, string.length());
    }

    /* renamed from: F */
    public C3619g m14606F() {
        return mo14519p(m14618c0());
    }

    /* renamed from: F0 */
    public C3616d m14607F0(String string, int i7, int i8) {
        char charAt;
        AbstractC5469l.m23028e(string, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (i8 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + string.length()).toString());
        }
        while (i7 < i8) {
            char charAt2 = string.charAt(i7);
            if (charAt2 < 128) {
                C3604P m14624k0 = m14624k0(1);
                byte[] bArr = m14624k0.f12064a;
                int i9 = m14624k0.f12066c - i7;
                int min = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                bArr[i7 + i9] = (byte) charAt2;
                while (true) {
                    i7 = i10;
                    if (i7 >= min || (charAt = string.charAt(i7)) >= 128) {
                        break;
                    }
                    i10 = i7 + 1;
                    bArr[i7 + i9] = (byte) charAt;
                }
                int i11 = m14624k0.f12066c;
                int i12 = (i9 + i7) - i11;
                m14624k0.f12066c = i11 + i12;
                m14615T(m14618c0() + i12);
            } else {
                if (charAt2 < 2048) {
                    C3604P m14624k02 = m14624k0(2);
                    byte[] bArr2 = m14624k02.f12064a;
                    int i13 = m14624k02.f12066c;
                    bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                    m14624k02.f12066c = i13 + 2;
                    m14615T(m14618c0() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C3604P m14624k03 = m14624k0(3);
                    byte[] bArr3 = m14624k03.f12064a;
                    int i14 = m14624k03.f12066c;
                    bArr3[i14] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((charAt2 & '?') | 128);
                    m14624k03.f12066c = i14 + 3;
                    m14615T(m14618c0() + 3);
                } else {
                    int i15 = i7 + 1;
                    char charAt3 = i15 < i8 ? string.charAt(i15) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        mo14505A(63);
                        i7 = i15;
                    } else {
                        int i16 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C3604P m14624k04 = m14624k0(4);
                        byte[] bArr4 = m14624k04.f12064a;
                        int i17 = m14624k04.f12066c;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        m14624k04.f12066c = i17 + 4;
                        m14615T(m14618c0() + 4);
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
        return this;
    }

    /* renamed from: G */
    public void m14608G(byte[] sink) {
        AbstractC5469l.m23028e(sink, "sink");
        int i7 = 0;
        while (i7 < sink.length) {
            int read = read(sink, i7, sink.length - i7);
            if (read == -1) {
                throw new EOFException();
            }
            i7 += read;
        }
    }

    /* renamed from: G0 */
    public C3616d m14609G0(int i7) {
        if (i7 < 128) {
            mo14505A(i7);
        } else if (i7 < 2048) {
            C3604P m14624k0 = m14624k0(2);
            byte[] bArr = m14624k0.f12064a;
            int i8 = m14624k0.f12066c;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            m14624k0.f12066c = i8 + 2;
            m14615T(m14618c0() + 2);
        } else if (55296 <= i7 && i7 < 57344) {
            mo14505A(63);
        } else if (i7 < 65536) {
            C3604P m14624k02 = m14624k0(3);
            byte[] bArr2 = m14624k02.f12064a;
            int i9 = m14624k02.f12066c;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            m14624k02.f12066c = i9 + 3;
            m14615T(m14618c0() + 3);
        } else {
            if (i7 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC3614b.m14573h(i7));
            }
            C3604P m14624k03 = m14624k0(4);
            byte[] bArr3 = m14624k03.f12064a;
            int i10 = m14624k03.f12066c;
            bArr3[i10] = (byte) ((i7 >> 18) | 240);
            bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
            m14624k03.f12066c = i10 + 4;
            m14615T(m14618c0() + 4);
        }
        return this;
    }

    /* renamed from: K */
    public long m14610K() {
        if (m14618c0() < 8) {
            throw new EOFException();
        }
        C3604P c3604p = this.f12107a;
        AbstractC5469l.m23025b(c3604p);
        int i7 = c3604p.f12065b;
        int i8 = c3604p.f12066c;
        if (i8 - i7 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = c3604p.f12064a;
        int i9 = i7 + 7;
        long j7 = ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
        int i10 = i7 + 8;
        long j8 = j7 | (bArr[i9] & 255);
        m14615T(m14618c0() - 8);
        if (i10 == i8) {
            this.f12107a = c3604p.m14525b();
            C3605Q.m14530b(c3604p);
        } else {
            c3604p.f12065b = i10;
        }
        return j8;
    }

    /* renamed from: M */
    public String m14611M(long j7, Charset charset) {
        AbstractC5469l.m23028e(charset, "charset");
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (this.f12108b < j7) {
            throw new EOFException();
        }
        if (j7 == 0) {
            return StringUtils.EMPTY;
        }
        C3604P c3604p = this.f12107a;
        AbstractC5469l.m23025b(c3604p);
        int i7 = c3604p.f12065b;
        if (i7 + j7 > c3604p.f12066c) {
            return new String(mo14514Z(j7), charset);
        }
        int i8 = (int) j7;
        String str = new String(c3604p.f12064a, i7, i8, charset);
        int i9 = c3604p.f12065b + i8;
        c3604p.f12065b = i9;
        this.f12108b -= j7;
        if (i9 == c3604p.f12066c) {
            this.f12107a = c3604p.m14525b();
            C3605Q.m14530b(c3604p);
        }
        return str;
    }

    /* renamed from: N */
    public String m14612N() {
        return m14611M(this.f12108b, C2277c.f6921b);
    }

    @Override // p206c6.InterfaceC3609V
    /* renamed from: P */
    public long mo14512P(C3616d sink, long j7) {
        AbstractC5469l.m23028e(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (m14618c0() == 0) {
            return -1L;
        }
        if (j7 > m14618c0()) {
            j7 = m14618c0();
        }
        sink.mo14482s(this, j7);
        return j7;
    }

    /* renamed from: R */
    public String m14613R() {
        return m14614S(Long.MAX_VALUE);
    }

    /* renamed from: S */
    public String m14614S(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
        long m14629r = m14629r((byte) 10, 0L, j8);
        if (m14629r != -1) {
            return AbstractC4131a.m17324b(this, m14629r);
        }
        if (j8 < m14618c0() && m14627o(j8 - 1) == 13 && m14627o(j8) == 10) {
            return AbstractC4131a.m17324b(this, j8);
        }
        C3616d c3616d = new C3616d();
        m14626m(c3616d, 0L, Math.min(32, m14618c0()));
        throw new EOFException("\\n not found: limit=" + Math.min(m14618c0(), j7) + " content=" + c3616d.m14606F().mo14542n() + (char) 8230);
    }

    /* renamed from: T */
    public final void m14615T(long j7) {
        this.f12108b = j7;
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: Y */
    public int mo14513Y() {
        return AbstractC3614b.m14570e(readInt());
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: Z */
    public byte[] mo14514Z(long j7) {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (m14618c0() < j7) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j7];
        m14608G(bArr);
        return bArr;
    }

    /* renamed from: c */
    public final void m14617c() {
        skip(m14618c0());
    }

    /* renamed from: c0 */
    public final long m14618c0() {
        return this.f12108b;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C3616d clone() {
        return m14623j();
    }

    /* renamed from: d0 */
    public final C3619g m14620d0() {
        if (m14618c0() <= 2147483647L) {
            return m14621f0((int) m14618c0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + m14618c0()).toString());
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: e0 */
    public short mo14516e0() {
        return AbstractC3614b.m14572g(readShort());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3616d) {
            C3616d c3616d = (C3616d) obj;
            if (m14618c0() == c3616d.m14618c0()) {
                if (m14618c0() == 0) {
                    return true;
                }
                C3604P c3604p = this.f12107a;
                AbstractC5469l.m23025b(c3604p);
                C3604P c3604p2 = c3616d.f12107a;
                AbstractC5469l.m23025b(c3604p2);
                int i7 = c3604p.f12065b;
                int i8 = c3604p2.f12065b;
                long j7 = 0;
                while (j7 < m14618c0()) {
                    long min = Math.min(c3604p.f12066c - i7, c3604p2.f12066c - i8);
                    long j8 = 0;
                    while (j8 < min) {
                        int i9 = i7 + 1;
                        int i10 = i8 + 1;
                        if (c3604p.f12064a[i7] == c3604p2.f12064a[i8]) {
                            j8++;
                            i7 = i9;
                            i8 = i10;
                        }
                    }
                    if (i7 == c3604p.f12066c) {
                        c3604p = c3604p.f12069f;
                        AbstractC5469l.m23025b(c3604p);
                        i7 = c3604p.f12065b;
                    }
                    if (i8 == c3604p2.f12066c) {
                        c3604p2 = c3604p2.f12069f;
                        AbstractC5469l.m23025b(c3604p2);
                        i8 = c3604p2.f12065b;
                    }
                    j7 += min;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public final C3619g m14621f0(int i7) {
        if (i7 == 0) {
            return C3619g.f12118e;
        }
        AbstractC3614b.m14567b(m14618c0(), 0L, i7);
        C3604P c3604p = this.f12107a;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            AbstractC5469l.m23025b(c3604p);
            int i11 = c3604p.f12066c;
            int i12 = c3604p.f12065b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            c3604p = c3604p.f12069f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        C3604P c3604p2 = this.f12107a;
        int i13 = 0;
        while (i8 < i7) {
            AbstractC5469l.m23025b(c3604p2);
            bArr[i13] = c3604p2.f12064a;
            i8 += c3604p2.f12066c - c3604p2.f12065b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = c3604p2.f12065b;
            c3604p2.f12067d = true;
            i13++;
            c3604p2 = c3604p2.f12069f;
        }
        return new C3606S(bArr, iArr);
    }

    /* renamed from: g */
    public final long m14622g() {
        long m14618c0 = m14618c0();
        if (m14618c0 == 0) {
            return 0L;
        }
        C3604P c3604p = this.f12107a;
        AbstractC5469l.m23025b(c3604p);
        C3604P c3604p2 = c3604p.f12070g;
        AbstractC5469l.m23025b(c3604p2);
        if (c3604p2.f12066c < 8192 && c3604p2.f12068e) {
            m14618c0 -= r3 - c3604p2.f12065b;
        }
        return m14618c0;
    }

    public int hashCode() {
        C3604P c3604p = this.f12107a;
        if (c3604p == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = c3604p.f12066c;
            for (int i9 = c3604p.f12065b; i9 < i8; i9++) {
                i7 = (i7 * 31) + c3604p.f12064a[i9];
            }
            c3604p = c3604p.f12069f;
            AbstractC5469l.m23025b(c3604p);
        } while (c3604p != this.f12107a);
        return i7;
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: i0 */
    public long mo14517i0() {
        return AbstractC3614b.m14571f(m14610K());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final C3616d m14623j() {
        C3616d c3616d = new C3616d();
        if (m14618c0() != 0) {
            C3604P c3604p = this.f12107a;
            AbstractC5469l.m23025b(c3604p);
            C3604P m14527d = c3604p.m14527d();
            c3616d.f12107a = m14527d;
            m14527d.f12070g = m14527d;
            m14527d.f12069f = m14527d;
            for (C3604P c3604p2 = c3604p.f12069f; c3604p2 != c3604p; c3604p2 = c3604p2.f12069f) {
                C3604P c3604p3 = m14527d.f12070g;
                AbstractC5469l.m23025b(c3604p3);
                AbstractC5469l.m23025b(c3604p2);
                c3604p3.m14526c(c3604p2.m14527d());
            }
            c3616d.m14615T(m14618c0());
        }
        return c3616d;
    }

    /* renamed from: k0 */
    public final C3604P m14624k0(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C3604P c3604p = this.f12107a;
        if (c3604p != null) {
            AbstractC5469l.m23025b(c3604p);
            C3604P c3604p2 = c3604p.f12070g;
            AbstractC5469l.m23025b(c3604p2);
            return (c3604p2.f12066c + i7 > 8192 || !c3604p2.f12068e) ? c3604p2.m14526c(C3605Q.m14531c()) : c3604p2;
        }
        C3604P m14531c = C3605Q.m14531c();
        this.f12107a = m14531c;
        m14531c.f12070g = m14531c;
        m14531c.f12069f = m14531c;
        return m14531c;
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: l */
    public String mo14518l(long j7) {
        return m14611M(j7, C2277c.f6921b);
    }

    /* renamed from: l0 */
    public C3616d m14625l0(C3619g byteString) {
        AbstractC5469l.m23028e(byteString, "byteString");
        byteString.mo14536H(this, 0, byteString.size());
        return this;
    }

    /* renamed from: m */
    public final C3616d m14626m(C3616d out, long j7, long j8) {
        AbstractC5469l.m23028e(out, "out");
        AbstractC3614b.m14567b(m14618c0(), j7, j8);
        if (j8 != 0) {
            out.m14615T(out.m14618c0() + j8);
            C3604P c3604p = this.f12107a;
            while (true) {
                AbstractC5469l.m23025b(c3604p);
                int i7 = c3604p.f12066c;
                int i8 = c3604p.f12065b;
                if (j7 < i7 - i8) {
                    break;
                }
                j7 -= i7 - i8;
                c3604p = c3604p.f12069f;
            }
            while (j8 > 0) {
                AbstractC5469l.m23025b(c3604p);
                C3604P m14527d = c3604p.m14527d();
                int i9 = m14527d.f12065b + ((int) j7);
                m14527d.f12065b = i9;
                m14527d.f12066c = Math.min(i9 + ((int) j8), m14527d.f12066c);
                C3604P c3604p2 = out.f12107a;
                if (c3604p2 == null) {
                    m14527d.f12070g = m14527d;
                    m14527d.f12069f = m14527d;
                    out.f12107a = m14527d;
                } else {
                    AbstractC5469l.m23025b(c3604p2);
                    C3604P c3604p3 = c3604p2.f12070g;
                    AbstractC5469l.m23025b(c3604p3);
                    c3604p3.m14526c(m14527d);
                }
                j8 -= m14527d.f12066c - m14527d.f12065b;
                c3604p = c3604p.f12069f;
                j7 = 0;
            }
        }
        return this;
    }

    /* renamed from: o */
    public final byte m14627o(long j7) {
        AbstractC3614b.m14567b(m14618c0(), j7, 1L);
        C3604P c3604p = this.f12107a;
        if (c3604p == null) {
            AbstractC5469l.m23025b(null);
            throw null;
        }
        if (m14618c0() - j7 < j7) {
            long m14618c0 = m14618c0();
            while (m14618c0 > j7) {
                c3604p = c3604p.f12070g;
                AbstractC5469l.m23025b(c3604p);
                m14618c0 -= c3604p.f12066c - c3604p.f12065b;
            }
            AbstractC5469l.m23025b(c3604p);
            return c3604p.f12064a[(int) ((c3604p.f12065b + j7) - m14618c0)];
        }
        long j8 = 0;
        while (true) {
            long j9 = (c3604p.f12066c - c3604p.f12065b) + j8;
            if (j9 > j7) {
                AbstractC5469l.m23025b(c3604p);
                return c3604p.f12064a[(int) ((c3604p.f12065b + j7) - j8)];
            }
            c3604p = c3604p.f12069f;
            AbstractC5469l.m23025b(c3604p);
            j8 = j9;
        }
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: p */
    public C3619g mo14519p(long j7) {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (m14618c0() < j7) {
            throw new EOFException();
        }
        if (j7 < 4096) {
            return new C3619g(mo14514Z(j7));
        }
        C3619g m14621f0 = m14621f0((int) j7);
        skip(j7);
        return m14621f0;
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C3616d mo14508b0(byte[] source) {
        AbstractC5469l.m23028e(source, "source");
        return m14632x0(source, 0, source.length);
    }

    /* renamed from: r */
    public long m14629r(byte b7, long j7, long j8) {
        C3604P c3604p;
        int i7;
        long j9 = 0;
        if (0 > j7 || j7 > j8) {
            throw new IllegalArgumentException(("size=" + m14618c0() + " fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        if (j8 > m14618c0()) {
            j8 = m14618c0();
        }
        if (j7 == j8 || (c3604p = this.f12107a) == null) {
            return -1L;
        }
        if (m14618c0() - j7 < j7) {
            j9 = m14618c0();
            while (j9 > j7) {
                c3604p = c3604p.f12070g;
                AbstractC5469l.m23025b(c3604p);
                j9 -= c3604p.f12066c - c3604p.f12065b;
            }
            while (j9 < j8) {
                byte[] bArr = c3604p.f12064a;
                int min = (int) Math.min(c3604p.f12066c, (c3604p.f12065b + j8) - j9);
                i7 = (int) ((c3604p.f12065b + j7) - j9);
                while (i7 < min) {
                    if (bArr[i7] != b7) {
                        i7++;
                    }
                }
                j9 += c3604p.f12066c - c3604p.f12065b;
                c3604p = c3604p.f12069f;
                AbstractC5469l.m23025b(c3604p);
                j7 = j9;
            }
            return -1L;
        }
        while (true) {
            long j10 = (c3604p.f12066c - c3604p.f12065b) + j9;
            if (j10 > j7) {
                break;
            }
            c3604p = c3604p.f12069f;
            AbstractC5469l.m23025b(c3604p);
            j9 = j10;
        }
        while (j9 < j8) {
            byte[] bArr2 = c3604p.f12064a;
            int min2 = (int) Math.min(c3604p.f12066c, (c3604p.f12065b + j8) - j9);
            i7 = (int) ((c3604p.f12065b + j7) - j9);
            while (i7 < min2) {
                if (bArr2[i7] != b7) {
                    i7++;
                }
            }
            j9 += c3604p.f12066c - c3604p.f12065b;
            c3604p = c3604p.f12069f;
            AbstractC5469l.m23025b(c3604p);
            j7 = j9;
        }
        return -1L;
        return (i7 - c3604p.f12065b) + j9;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC5469l.m23028e(sink, "sink");
        C3604P c3604p = this.f12107a;
        if (c3604p == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c3604p.f12066c - c3604p.f12065b);
        sink.put(c3604p.f12064a, c3604p.f12065b, min);
        int i7 = c3604p.f12065b + min;
        c3604p.f12065b = i7;
        this.f12108b -= min;
        if (i7 == c3604p.f12066c) {
            this.f12107a = c3604p.m14525b();
            C3605Q.m14530b(c3604p);
        }
        return min;
    }

    @Override // p206c6.InterfaceC3618f
    public byte readByte() {
        if (m14618c0() == 0) {
            throw new EOFException();
        }
        C3604P c3604p = this.f12107a;
        AbstractC5469l.m23025b(c3604p);
        int i7 = c3604p.f12065b;
        int i8 = c3604p.f12066c;
        int i9 = i7 + 1;
        byte b7 = c3604p.f12064a[i7];
        m14615T(m14618c0() - 1);
        if (i9 == i8) {
            this.f12107a = c3604p.m14525b();
            C3605Q.m14530b(c3604p);
        } else {
            c3604p.f12065b = i9;
        }
        return b7;
    }

    @Override // p206c6.InterfaceC3618f
    public int readInt() {
        if (m14618c0() < 4) {
            throw new EOFException();
        }
        C3604P c3604p = this.f12107a;
        AbstractC5469l.m23025b(c3604p);
        int i7 = c3604p.f12065b;
        int i8 = c3604p.f12066c;
        if (i8 - i7 < 4) {
            return ((readByte() & ForkServer.ERROR) << 24) | ((readByte() & ForkServer.ERROR) << 16) | ((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR);
        }
        byte[] bArr = c3604p.f12064a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & ForkServer.ERROR) << 16) | ((bArr[i7] & ForkServer.ERROR) << 24) | ((bArr[i7 + 2] & ForkServer.ERROR) << 8);
        int i11 = i7 + 4;
        int i12 = (bArr[i9] & ForkServer.ERROR) | i10;
        m14615T(m14618c0() - 4);
        if (i11 == i8) {
            this.f12107a = c3604p.m14525b();
            C3605Q.m14530b(c3604p);
        } else {
            c3604p.f12065b = i11;
        }
        return i12;
    }

    @Override // p206c6.InterfaceC3618f
    public short readShort() {
        if (m14618c0() < 2) {
            throw new EOFException();
        }
        C3604P c3604p = this.f12107a;
        AbstractC5469l.m23025b(c3604p);
        int i7 = c3604p.f12065b;
        int i8 = c3604p.f12066c;
        if (i8 - i7 < 2) {
            return (short) (((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR));
        }
        byte[] bArr = c3604p.f12064a;
        int i9 = i7 + 1;
        int i10 = (bArr[i7] & ForkServer.ERROR) << 8;
        int i11 = i7 + 2;
        int i12 = (bArr[i9] & ForkServer.ERROR) | i10;
        m14615T(m14618c0() - 2);
        if (i11 == i8) {
            this.f12107a = c3604p.m14525b();
            C3605Q.m14530b(c3604p);
        } else {
            c3604p.f12065b = i11;
        }
        return (short) i12;
    }

    @Override // p206c6.InterfaceC3607T
    /* renamed from: s */
    public void mo14482s(C3616d source, long j7) {
        C3604P c3604p;
        AbstractC5469l.m23028e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC3614b.m14567b(source.m14618c0(), 0L, j7);
        while (j7 > 0) {
            C3604P c3604p2 = source.f12107a;
            AbstractC5469l.m23025b(c3604p2);
            int i7 = c3604p2.f12066c;
            AbstractC5469l.m23025b(source.f12107a);
            if (j7 < i7 - r1.f12065b) {
                C3604P c3604p3 = this.f12107a;
                if (c3604p3 != null) {
                    AbstractC5469l.m23025b(c3604p3);
                    c3604p = c3604p3.f12070g;
                } else {
                    c3604p = null;
                }
                if (c3604p != null && c3604p.f12068e) {
                    if ((c3604p.f12066c + j7) - (c3604p.f12067d ? 0 : c3604p.f12065b) <= 8192) {
                        C3604P c3604p4 = source.f12107a;
                        AbstractC5469l.m23025b(c3604p4);
                        c3604p4.m14529f(c3604p, (int) j7);
                        source.m14615T(source.m14618c0() - j7);
                        m14615T(m14618c0() + j7);
                        return;
                    }
                }
                C3604P c3604p5 = source.f12107a;
                AbstractC5469l.m23025b(c3604p5);
                source.f12107a = c3604p5.m14528e((int) j7);
            }
            C3604P c3604p6 = source.f12107a;
            AbstractC5469l.m23025b(c3604p6);
            long j8 = c3604p6.f12066c - c3604p6.f12065b;
            source.f12107a = c3604p6.m14525b();
            C3604P c3604p7 = this.f12107a;
            if (c3604p7 == null) {
                this.f12107a = c3604p6;
                c3604p6.f12070g = c3604p6;
                c3604p6.f12069f = c3604p6;
            } else {
                AbstractC5469l.m23025b(c3604p7);
                C3604P c3604p8 = c3604p7.f12070g;
                AbstractC5469l.m23025b(c3604p8);
                c3604p8.m14526c(c3604p6).m14524a();
            }
            source.m14615T(source.m14618c0() - j8);
            m14615T(m14618c0() + j8);
            j7 -= j8;
        }
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: s0 */
    public void mo14520s0(long j7) {
        if (this.f12108b < j7) {
            throw new EOFException();
        }
    }

    @Override // p206c6.InterfaceC3618f
    public void skip(long j7) {
        while (j7 > 0) {
            C3604P c3604p = this.f12107a;
            if (c3604p == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j7, c3604p.f12066c - c3604p.f12065b);
            long j8 = min;
            m14615T(m14618c0() - j8);
            j7 -= j8;
            int i7 = c3604p.f12065b + min;
            c3604p.f12065b = i7;
            if (i7 == c3604p.f12066c) {
                this.f12107a = c3604p.m14525b();
                C3605Q.m14530b(c3604p);
            }
        }
    }

    public String toString() {
        return m14620d0().toString();
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: u0 */
    public OutputStream mo14511u0() {
        return new c();
    }

    /* renamed from: v */
    public long m14630v(C3619g targetBytes) {
        AbstractC5469l.m23028e(targetBytes, "targetBytes");
        return m14631w(targetBytes, 0L);
    }

    /* renamed from: w */
    public long m14631w(C3619g targetBytes, long j7) {
        int i7;
        int i8;
        AbstractC5469l.m23028e(targetBytes, "targetBytes");
        long j8 = 0;
        if (j7 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j7).toString());
        }
        C3604P c3604p = this.f12107a;
        if (c3604p == null) {
            return -1L;
        }
        if (m14618c0() - j7 < j7) {
            j8 = m14618c0();
            while (j8 > j7) {
                c3604p = c3604p.f12070g;
                AbstractC5469l.m23025b(c3604p);
                j8 -= c3604p.f12066c - c3604p.f12065b;
            }
            if (targetBytes.size() == 2) {
                byte m14647i = targetBytes.m14647i(0);
                byte m14647i2 = targetBytes.m14647i(1);
                while (j8 < m14618c0()) {
                    byte[] bArr = c3604p.f12064a;
                    i7 = (int) ((c3604p.f12065b + j7) - j8);
                    int i9 = c3604p.f12066c;
                    while (i7 < i9) {
                        byte b7 = bArr[i7];
                        if (b7 != m14647i && b7 != m14647i2) {
                            i7++;
                        }
                        i8 = c3604p.f12065b;
                    }
                    j8 += c3604p.f12066c - c3604p.f12065b;
                    c3604p = c3604p.f12069f;
                    AbstractC5469l.m23025b(c3604p);
                    j7 = j8;
                }
                return -1L;
            }
            byte[] mo14544r = targetBytes.mo14544r();
            while (j8 < m14618c0()) {
                byte[] bArr2 = c3604p.f12064a;
                i7 = (int) ((c3604p.f12065b + j7) - j8);
                int i10 = c3604p.f12066c;
                while (i7 < i10) {
                    byte b8 = bArr2[i7];
                    for (byte b9 : mo14544r) {
                        if (b8 == b9) {
                            i8 = c3604p.f12065b;
                        }
                    }
                    i7++;
                }
                j8 += c3604p.f12066c - c3604p.f12065b;
                c3604p = c3604p.f12069f;
                AbstractC5469l.m23025b(c3604p);
                j7 = j8;
            }
            return -1L;
        }
        while (true) {
            long j9 = (c3604p.f12066c - c3604p.f12065b) + j8;
            if (j9 > j7) {
                break;
            }
            c3604p = c3604p.f12069f;
            AbstractC5469l.m23025b(c3604p);
            j8 = j9;
        }
        if (targetBytes.size() == 2) {
            byte m14647i3 = targetBytes.m14647i(0);
            byte m14647i4 = targetBytes.m14647i(1);
            while (j8 < m14618c0()) {
                byte[] bArr3 = c3604p.f12064a;
                i7 = (int) ((c3604p.f12065b + j7) - j8);
                int i11 = c3604p.f12066c;
                while (i7 < i11) {
                    byte b10 = bArr3[i7];
                    if (b10 != m14647i3 && b10 != m14647i4) {
                        i7++;
                    }
                    i8 = c3604p.f12065b;
                }
                j8 += c3604p.f12066c - c3604p.f12065b;
                c3604p = c3604p.f12069f;
                AbstractC5469l.m23025b(c3604p);
                j7 = j8;
            }
            return -1L;
        }
        byte[] mo14544r2 = targetBytes.mo14544r();
        while (j8 < m14618c0()) {
            byte[] bArr4 = c3604p.f12064a;
            i7 = (int) ((c3604p.f12065b + j7) - j8);
            int i12 = c3604p.f12066c;
            while (i7 < i12) {
                byte b11 = bArr4[i7];
                for (byte b12 : mo14544r2) {
                    if (b11 == b12) {
                        i8 = c3604p.f12065b;
                    }
                }
                i7++;
            }
            j8 += c3604p.f12066c - c3604p.f12065b;
            c3604p = c3604p.f12069f;
            AbstractC5469l.m23025b(c3604p);
            j7 = j8;
        }
        return -1L;
        return (i7 - i8) + j8;
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: w0 */
    public InputStream mo14521w0() {
        return new b();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC5469l.m23028e(source, "source");
        int remaining = source.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            C3604P m14624k0 = m14624k0(1);
            int min = Math.min(i7, 8192 - m14624k0.f12066c);
            source.get(m14624k0.f12064a, m14624k0.f12066c, min);
            i7 -= min;
            m14624k0.f12066c += min;
        }
        this.f12108b += remaining;
        return remaining;
    }

    /* renamed from: x0 */
    public C3616d m14632x0(byte[] source, int i7, int i8) {
        AbstractC5469l.m23028e(source, "source");
        long j7 = i8;
        AbstractC3614b.m14567b(source.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            C3604P m14624k0 = m14624k0(1);
            int min = Math.min(i9 - i7, 8192 - m14624k0.f12066c);
            int i10 = i7 + min;
            AbstractC7019j.m28794d(source, m14624k0.f12064a, m14624k0.f12066c, i7, i10);
            m14624k0.f12066c += min;
            i7 = i10;
        }
        m14615T(m14618c0() + j7);
        return this;
    }

    /* renamed from: y */
    public boolean m14633y(long j7, C3619g bytes) {
        AbstractC5469l.m23028e(bytes, "bytes");
        return m14601C(j7, bytes, 0, bytes.size());
    }

    /* renamed from: y0 */
    public long m14634y0(InterfaceC3609V source) {
        AbstractC5469l.m23028e(source, "source");
        long j7 = 0;
        while (true) {
            long mo14512P = source.mo14512P(this, 8192L);
            if (mo14512P == -1) {
                return j7;
            }
            j7 += mo14512P;
        }
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: z */
    public boolean mo14523z() {
        return this.f12108b == 0;
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C3616d mo14505A(int i7) {
        C3604P m14624k0 = m14624k0(1);
        byte[] bArr = m14624k0.f12064a;
        int i8 = m14624k0.f12066c;
        m14624k0.f12066c = i8 + 1;
        bArr[i8] = (byte) i7;
        m14615T(m14618c0() + 1);
        return this;
    }

    /* renamed from: c6.d$b */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C3616d.this.m14618c0(), C3643a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C3616d.this.m14618c0() > 0) {
                return C3616d.this.readByte() & ForkServer.ERROR;
            }
            return -1;
        }

        public String toString() {
            return C3616d.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i7, int i8) {
            AbstractC5469l.m23028e(sink, "sink");
            return C3616d.this.read(sink, i7, i8);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public int read(byte[] sink, int i7, int i8) {
        AbstractC5469l.m23028e(sink, "sink");
        AbstractC3614b.m14567b(sink.length, i7, i8);
        C3604P c3604p = this.f12107a;
        if (c3604p == null) {
            return -1;
        }
        int min = Math.min(i8, c3604p.f12066c - c3604p.f12065b);
        byte[] bArr = c3604p.f12064a;
        int i9 = c3604p.f12065b;
        AbstractC7019j.m28794d(bArr, sink, i7, i9, i9 + min);
        c3604p.f12065b += min;
        m14615T(m14618c0() - min);
        if (c3604p.f12065b == c3604p.f12066c) {
            this.f12107a = c3604p.m14525b();
            C3605Q.m14530b(c3604p);
        }
        return min;
    }

    /* renamed from: a */
    public C3616d m14616a() {
        return this;
    }

    @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // p206c6.InterfaceC3617e, p206c6.InterfaceC3607T, java.io.Flushable
    public void flush() {
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: x */
    public C3616d mo14522x() {
        return this;
    }
}
