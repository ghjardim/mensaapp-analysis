package p022D0;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p022D0.C0143b0;
import p050H0.C0532a;
import p050H0.InterfaceC0533b;
import p078L0.InterfaceC0861T;
import p232g0.InterfaceC4319i;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p284m0.C5555c;
import p284m0.C5561i;

/* renamed from: D0.Z */
/* loaded from: classes.dex */
public class C0139Z {

    /* renamed from: a */
    public final InterfaceC0533b f516a;

    /* renamed from: b */
    public final int f517b;

    /* renamed from: c */
    public final C5357z f518c;

    /* renamed from: d */
    public a f519d;

    /* renamed from: e */
    public a f520e;

    /* renamed from: f */
    public a f521f;

    /* renamed from: g */
    public long f522g;

    /* renamed from: D0.Z$a */
    public static final class a implements InterfaceC0533b.a {

        /* renamed from: a */
        public long f523a;

        /* renamed from: b */
        public long f524b;

        /* renamed from: c */
        public C0532a f525c;

        /* renamed from: d */
        public a f526d;

        public a(long j7, int i7) {
            m518d(j7, i7);
        }

        @Override // p050H0.InterfaceC0533b.a
        /* renamed from: a */
        public C0532a mo515a() {
            return (C0532a) AbstractC5332a.m21800e(this.f525c);
        }

        /* renamed from: b */
        public a m516b() {
            this.f525c = null;
            a aVar = this.f526d;
            this.f526d = null;
            return aVar;
        }

        /* renamed from: c */
        public void m517c(C0532a c0532a, a aVar) {
            this.f525c = c0532a;
            this.f526d = aVar;
        }

        /* renamed from: d */
        public void m518d(long j7, int i7) {
            AbstractC5332a.m21802g(this.f525c == null);
            this.f523a = j7;
            this.f524b = j7 + i7;
        }

        /* renamed from: e */
        public int m519e(long j7) {
            return ((int) (j7 - this.f523a)) + this.f525c.f1729b;
        }

        @Override // p050H0.InterfaceC0533b.a
        public InterfaceC0533b.a next() {
            a aVar = this.f526d;
            if (aVar == null || aVar.f525c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C0139Z(InterfaceC0533b interfaceC0533b) {
        this.f516a = interfaceC0533b;
        int mo2043e = interfaceC0533b.mo2043e();
        this.f517b = mo2043e;
        this.f518c = new C5357z(32);
        a aVar = new a(0L, mo2043e);
        this.f519d = aVar;
        this.f520e = aVar;
        this.f521f = aVar;
    }

    /* renamed from: d */
    public static a m498d(a aVar, long j7) {
        while (j7 >= aVar.f524b) {
            aVar = aVar.f526d;
        }
        return aVar;
    }

    /* renamed from: i */
    public static a m499i(a aVar, long j7, ByteBuffer byteBuffer, int i7) {
        a m498d = m498d(aVar, j7);
        while (i7 > 0) {
            int min = Math.min(i7, (int) (m498d.f524b - j7));
            byteBuffer.put(m498d.f525c.f1728a, m498d.m519e(j7), min);
            i7 -= min;
            j7 += min;
            if (j7 == m498d.f524b) {
                m498d = m498d.f526d;
            }
        }
        return m498d;
    }

    /* renamed from: j */
    public static a m500j(a aVar, long j7, byte[] bArr, int i7) {
        a m498d = m498d(aVar, j7);
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (m498d.f524b - j7));
            System.arraycopy(m498d.f525c.f1728a, m498d.m519e(j7), bArr, i7 - i8, min);
            i8 -= min;
            j7 += min;
            if (j7 == m498d.f524b) {
                m498d = m498d.f526d;
            }
        }
        return m498d;
    }

    /* renamed from: k */
    public static a m501k(a aVar, C5561i c5561i, C0143b0.b bVar, C5357z c5357z) {
        long j7 = bVar.f568b;
        int i7 = 1;
        c5357z.m21935P(1);
        a m500j = m500j(aVar, j7, c5357z.m21946e(), 1);
        long j8 = j7 + 1;
        byte b7 = c5357z.m21946e()[0];
        boolean z6 = (b7 & 128) != 0;
        int i8 = b7 & Byte.MAX_VALUE;
        C5555c c5555c = c5561i.f20076c;
        byte[] bArr = c5555c.f20063a;
        if (bArr == null) {
            c5555c.f20063a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a m500j2 = m500j(m500j, j8, c5555c.f20063a, i8);
        long j9 = j8 + i8;
        if (z6) {
            c5357z.m21935P(2);
            m500j2 = m500j(m500j2, j9, c5357z.m21946e(), 2);
            j9 += 2;
            i7 = c5357z.m21932M();
        }
        int i9 = i7;
        int[] iArr = c5555c.f20066d;
        if (iArr == null || iArr.length < i9) {
            iArr = new int[i9];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c5555c.f20067e;
        if (iArr3 == null || iArr3.length < i9) {
            iArr3 = new int[i9];
        }
        int[] iArr4 = iArr3;
        if (z6) {
            int i10 = i9 * 6;
            c5357z.m21935P(i10);
            m500j2 = m500j(m500j2, j9, c5357z.m21946e(), i10);
            j9 += i10;
            c5357z.m21939T(0);
            for (int i11 = 0; i11 < i9; i11++) {
                iArr2[i11] = c5357z.m21932M();
                iArr4[i11] = c5357z.m21930K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f567a - ((int) (j9 - bVar.f568b));
        }
        InterfaceC0861T.a aVar2 = (InterfaceC0861T.a) AbstractC5330M.m21747i(bVar.f569c);
        c5555c.m23282c(i9, iArr2, iArr4, aVar2.f2953b, c5555c.f20063a, aVar2.f2952a, aVar2.f2954c, aVar2.f2955d);
        long j10 = bVar.f568b;
        int i12 = (int) (j9 - j10);
        bVar.f568b = j10 + i12;
        bVar.f567a -= i12;
        return m500j2;
    }

    /* renamed from: l */
    public static a m502l(a aVar, C5561i c5561i, C0143b0.b bVar, C5357z c5357z) {
        if (c5561i.m23292u()) {
            aVar = m501k(aVar, c5561i, bVar, c5357z);
        }
        if (!c5561i.m23274l()) {
            c5561i.m23290s(bVar.f567a);
            return m499i(aVar, bVar.f568b, c5561i.f20077d, bVar.f567a);
        }
        c5357z.m21935P(4);
        a m500j = m500j(aVar, bVar.f568b, c5357z.m21946e(), 4);
        int m21930K = c5357z.m21930K();
        bVar.f568b += 4;
        bVar.f567a -= 4;
        c5561i.m23290s(m21930K);
        a m499i = m499i(m500j, bVar.f568b, c5561i.f20077d, m21930K);
        bVar.f568b += m21930K;
        int i7 = bVar.f567a - m21930K;
        bVar.f567a = i7;
        c5561i.m23293w(i7);
        return m499i(m499i, bVar.f568b, c5561i.f20080n, bVar.f567a);
    }

    /* renamed from: a */
    public final void m503a(a aVar) {
        if (aVar.f525c == null) {
            return;
        }
        this.f516a.mo2042d(aVar);
        aVar.m516b();
    }

    /* renamed from: b */
    public void m504b(long j7) {
        a aVar;
        if (j7 == -1) {
            return;
        }
        while (true) {
            aVar = this.f519d;
            if (j7 < aVar.f524b) {
                break;
            }
            this.f516a.mo2039a(aVar.f525c);
            this.f519d = this.f519d.m516b();
        }
        if (this.f520e.f523a < aVar.f523a) {
            this.f520e = aVar;
        }
    }

    /* renamed from: c */
    public void m505c(long j7) {
        AbstractC5332a.m21796a(j7 <= this.f522g);
        this.f522g = j7;
        if (j7 != 0) {
            a aVar = this.f519d;
            if (j7 != aVar.f523a) {
                while (this.f522g > aVar.f524b) {
                    aVar = aVar.f526d;
                }
                a aVar2 = (a) AbstractC5332a.m21800e(aVar.f526d);
                m503a(aVar2);
                a aVar3 = new a(aVar.f524b, this.f517b);
                aVar.f526d = aVar3;
                if (this.f522g == aVar.f524b) {
                    aVar = aVar3;
                }
                this.f521f = aVar;
                if (this.f520e == aVar2) {
                    this.f520e = aVar3;
                    return;
                }
                return;
            }
        }
        m503a(this.f519d);
        a aVar4 = new a(this.f522g, this.f517b);
        this.f519d = aVar4;
        this.f520e = aVar4;
        this.f521f = aVar4;
    }

    /* renamed from: e */
    public long m506e() {
        return this.f522g;
    }

    /* renamed from: f */
    public void m507f(C5561i c5561i, C0143b0.b bVar) {
        m502l(this.f520e, c5561i, bVar, this.f518c);
    }

    /* renamed from: g */
    public final void m508g(int i7) {
        long j7 = this.f522g + i7;
        this.f522g = j7;
        a aVar = this.f521f;
        if (j7 == aVar.f524b) {
            this.f521f = aVar.f526d;
        }
    }

    /* renamed from: h */
    public final int m509h(int i7) {
        a aVar = this.f521f;
        if (aVar.f525c == null) {
            aVar.m517c(this.f516a.mo2040b(), new a(this.f521f.f524b, this.f517b));
        }
        return Math.min(i7, (int) (this.f521f.f524b - this.f522g));
    }

    /* renamed from: m */
    public void m510m(C5561i c5561i, C0143b0.b bVar) {
        this.f520e = m502l(this.f520e, c5561i, bVar, this.f518c);
    }

    /* renamed from: n */
    public void m511n() {
        m503a(this.f519d);
        this.f519d.m518d(0L, this.f517b);
        a aVar = this.f519d;
        this.f520e = aVar;
        this.f521f = aVar;
        this.f522g = 0L;
        this.f516a.mo2041c();
    }

    /* renamed from: o */
    public void m512o() {
        this.f520e = this.f519d;
    }

    /* renamed from: p */
    public int m513p(InterfaceC4319i interfaceC4319i, int i7, boolean z6) {
        int m509h = m509h(i7);
        a aVar = this.f521f;
        int read = interfaceC4319i.read(aVar.f525c.f1728a, aVar.m519e(this.f522g), m509h);
        if (read != -1) {
            m508g(read);
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: q */
    public void m514q(C5357z c5357z, int i7) {
        while (i7 > 0) {
            int m509h = m509h(i7);
            a aVar = this.f521f;
            c5357z.m21953l(aVar.f525c.f1728a, aVar.m519e(this.f522g), m509h);
            i7 -= m509h;
            m508g(m509h);
        }
    }
}
