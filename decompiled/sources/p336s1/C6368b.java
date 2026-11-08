package p336s1;

import android.net.Uri;
import android.util.Pair;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
import p078L0.AbstractC0865X;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p232g0.C4295A;
import p232g0.C4327q;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: s1.b */
/* loaded from: classes.dex */
public final class C6368b implements InterfaceC0883r {

    /* renamed from: h */
    public static final InterfaceC0889x f23020h = new InterfaceC0889x() { // from class: s1.a
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m26659f;
            m26659f = C6368b.m26659f();
            return m26659f;
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: c */
        public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
            return AbstractC0888w.m3695b(this, z6);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
            return AbstractC0888w.m3694a(this, uri, map);
        }
    };

    /* renamed from: a */
    public InterfaceC0885t f23021a;

    /* renamed from: b */
    public InterfaceC0861T f23022b;

    /* renamed from: e */
    public b f23025e;

    /* renamed from: c */
    public int f23023c = 0;

    /* renamed from: d */
    public long f23024d = -1;

    /* renamed from: f */
    public int f23026f = -1;

    /* renamed from: g */
    public long f23027g = -1;

    /* renamed from: s1.b$a */
    public static final class a implements b {

        /* renamed from: m */
        public static final int[] f23028m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f23029n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final InterfaceC0885t f23030a;

        /* renamed from: b */
        public final InterfaceC0861T f23031b;

        /* renamed from: c */
        public final C6369c f23032c;

        /* renamed from: d */
        public final int f23033d;

        /* renamed from: e */
        public final byte[] f23034e;

        /* renamed from: f */
        public final C5357z f23035f;

        /* renamed from: g */
        public final int f23036g;

        /* renamed from: h */
        public final C4327q f23037h;

        /* renamed from: i */
        public int f23038i;

        /* renamed from: j */
        public long f23039j;

        /* renamed from: k */
        public int f23040k;

        /* renamed from: l */
        public long f23041l;

        public a(InterfaceC0885t interfaceC0885t, InterfaceC0861T interfaceC0861T, C6369c c6369c) {
            this.f23030a = interfaceC0885t;
            this.f23031b = interfaceC0861T;
            this.f23032c = c6369c;
            int max = Math.max(1, c6369c.f23052c / 10);
            this.f23036g = max;
            C5357z c5357z = new C5357z(c6369c.f23056g);
            c5357z.m21966y();
            int m21966y = c5357z.m21966y();
            this.f23033d = m21966y;
            int i7 = c6369c.f23051b;
            int i8 = (((c6369c.f23054e - (i7 * 4)) * 8) / (c6369c.f23055f * i7)) + 1;
            if (m21966y == i8) {
                int m21753k = AbstractC5330M.m21753k(max, m21966y);
                this.f23034e = new byte[c6369c.f23054e * m21753k];
                this.f23035f = new C5357z(m21753k * m26665h(m21966y, i7));
                int i9 = ((c6369c.f23052c * c6369c.f23054e) * 8) / m21966y;
                this.f23037h = new C4327q.b().m18264o0("audio/raw").m18236M(i9).m18259j0(i9).m18255f0(m26665h(max, i7)).m18237N(c6369c.f23051b).m18265p0(c6369c.f23052c).m18258i0(2).m18234K();
                return;
            }
            throw C4295A.m17943a("Expected frames per block: " + i8 + "; got: " + m21966y, null);
        }

        /* renamed from: h */
        public static int m26665h(int i7, int i8) {
            return i7 * 2 * i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // p336s1.C6368b.b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo26666a(p078L0.InterfaceC0884s r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f23036g
                int r1 = r6.f23040k
                int r1 = r6.m26671f(r1)
                int r0 = r0 - r1
                int r1 = r6.f23033d
                int r0 = p259j0.AbstractC5330M.m21753k(r0, r1)
                s1.c r1 = r6.f23032c
                int r1 = r1.f23054e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f23038i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f23034e
                int r5 = r6.f23038i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f23038i
                int r4 = r4 + r3
                r6.f23038i = r4
                goto L1e
            L3e:
                int r7 = r6.f23038i
                s1.c r8 = r6.f23032c
                int r8 = r8.f23054e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f23034e
                j0.z r9 = r6.f23035f
                r6.m26669d(r8, r7, r9)
                int r8 = r6.f23038i
                s1.c r9 = r6.f23032c
                int r9 = r9.f23054e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f23038i = r8
                j0.z r7 = r6.f23035f
                int r7 = r7.m21948g()
                L0.T r8 = r6.f23031b
                j0.z r9 = r6.f23035f
                r8.mo564d(r9, r7)
                int r8 = r6.f23040k
                int r8 = r8 + r7
                r6.f23040k = r8
                int r7 = r6.m26671f(r8)
                int r8 = r6.f23036g
                if (r7 < r8) goto L75
                r6.m26673i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f23040k
                int r7 = r6.m26671f(r7)
                if (r7 <= 0) goto L82
                r6.m26673i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p336s1.C6368b.a.mo26666a(L0.s, long):boolean");
        }

        @Override // p336s1.C6368b.b
        /* renamed from: b */
        public void mo26667b(long j7) {
            this.f23038i = 0;
            this.f23039j = j7;
            this.f23040k = 0;
            this.f23041l = 0L;
        }

        @Override // p336s1.C6368b.b
        /* renamed from: c */
        public void mo26668c(int i7, long j7) {
            this.f23030a.mo466j(new C6371e(this.f23032c, this.f23033d, i7, j7));
            this.f23031b.mo566e(this.f23037h);
        }

        /* renamed from: d */
        public final void m26669d(byte[] bArr, int i7, C5357z c5357z) {
            for (int i8 = 0; i8 < i7; i8++) {
                for (int i9 = 0; i9 < this.f23032c.f23051b; i9++) {
                    m26670e(bArr, i8, i9, c5357z.m21946e());
                }
            }
            int m26672g = m26672g(this.f23033d * i7);
            c5357z.m21939T(0);
            c5357z.m21938S(m26672g);
        }

        /* renamed from: e */
        public final void m26670e(byte[] bArr, int i7, int i8, byte[] bArr2) {
            C6369c c6369c = this.f23032c;
            int i9 = c6369c.f23054e;
            int i10 = c6369c.f23051b;
            int i11 = (i7 * i9) + (i8 * 4);
            int i12 = (i10 * 4) + i11;
            int i13 = (i9 / i10) - 4;
            int i14 = (short) (((bArr[i11 + 1] & ForkServer.ERROR) << 8) | (bArr[i11] & ForkServer.ERROR));
            int min = Math.min(bArr[i11 + 2] & ForkServer.ERROR, 88);
            int i15 = f23029n[min];
            int i16 = ((i7 * this.f23033d * i10) + i8) * 2;
            bArr2[i16] = (byte) (i14 & 255);
            bArr2[i16 + 1] = (byte) (i14 >> 8);
            for (int i17 = 0; i17 < i13 * 2; i17++) {
                byte b7 = bArr[((i17 / 8) * i10 * 4) + i12 + ((i17 / 2) % 4)];
                int i18 = i17 % 2 == 0 ? b7 & 15 : (b7 & ForkServer.ERROR) >> 4;
                int i19 = ((((i18 & 7) * 2) + 1) * i15) >> 3;
                if ((i18 & 8) != 0) {
                    i19 = -i19;
                }
                i14 = AbstractC5330M.m21766p(i14 + i19, -32768, 32767);
                i16 += i10 * 2;
                bArr2[i16] = (byte) (i14 & 255);
                bArr2[i16 + 1] = (byte) (i14 >> 8);
                int i20 = min + f23028m[i18];
                int[] iArr = f23029n;
                min = AbstractC5330M.m21766p(i20, 0, iArr.length - 1);
                i15 = iArr[min];
            }
        }

        /* renamed from: f */
        public final int m26671f(int i7) {
            return i7 / (this.f23032c.f23051b * 2);
        }

        /* renamed from: g */
        public final int m26672g(int i7) {
            return m26665h(i7, this.f23032c.f23051b);
        }

        /* renamed from: i */
        public final void m26673i(int i7) {
            long m21718X0 = this.f23039j + AbstractC5330M.m21718X0(this.f23041l, 1000000L, this.f23032c.f23052c);
            int m26672g = m26672g(i7);
            this.f23031b.mo562c(m21718X0, 1, m26672g, this.f23040k - m26672g, null);
            this.f23041l += i7;
            this.f23040k -= m26672g;
        }
    }

    /* renamed from: s1.b$b */
    public interface b {
        /* renamed from: a */
        boolean mo26666a(InterfaceC0884s interfaceC0884s, long j7);

        /* renamed from: b */
        void mo26667b(long j7);

        /* renamed from: c */
        void mo26668c(int i7, long j7);
    }

    /* renamed from: s1.b$c */
    public static final class c implements b {

        /* renamed from: a */
        public final InterfaceC0885t f23042a;

        /* renamed from: b */
        public final InterfaceC0861T f23043b;

        /* renamed from: c */
        public final C6369c f23044c;

        /* renamed from: d */
        public final C4327q f23045d;

        /* renamed from: e */
        public final int f23046e;

        /* renamed from: f */
        public long f23047f;

        /* renamed from: g */
        public int f23048g;

        /* renamed from: h */
        public long f23049h;

        public c(InterfaceC0885t interfaceC0885t, InterfaceC0861T interfaceC0861T, C6369c c6369c, String str, int i7) {
            this.f23042a = interfaceC0885t;
            this.f23043b = interfaceC0861T;
            this.f23044c = c6369c;
            int i8 = (c6369c.f23051b * c6369c.f23055f) / 8;
            if (c6369c.f23054e == i8) {
                int i9 = c6369c.f23052c;
                int i10 = i9 * i8 * 8;
                int max = Math.max(i8, (i9 * i8) / 10);
                this.f23046e = max;
                this.f23045d = new C4327q.b().m18264o0(str).m18236M(i10).m18259j0(i10).m18255f0(max).m18237N(c6369c.f23051b).m18265p0(c6369c.f23052c).m18258i0(i7).m18234K();
                return;
            }
            throw C4295A.m17943a("Expected block size: " + i8 + "; got: " + c6369c.f23054e, null);
        }

        @Override // p336s1.C6368b.b
        /* renamed from: a */
        public boolean mo26666a(InterfaceC0884s interfaceC0884s, long j7) {
            int i7;
            int i8;
            long j8 = j7;
            while (j8 > 0 && (i7 = this.f23048g) < (i8 = this.f23046e)) {
                int mo558a = this.f23043b.mo558a(interfaceC0884s, (int) Math.min(i8 - i7, j8), true);
                if (mo558a == -1) {
                    j8 = 0;
                } else {
                    this.f23048g += mo558a;
                    j8 -= mo558a;
                }
            }
            int i9 = this.f23044c.f23054e;
            int i10 = this.f23048g / i9;
            if (i10 > 0) {
                long m21718X0 = this.f23047f + AbstractC5330M.m21718X0(this.f23049h, 1000000L, r1.f23052c);
                int i11 = i10 * i9;
                int i12 = this.f23048g - i11;
                this.f23043b.mo562c(m21718X0, 1, i11, i12, null);
                this.f23049h += i10;
                this.f23048g = i12;
            }
            return j8 <= 0;
        }

        @Override // p336s1.C6368b.b
        /* renamed from: b */
        public void mo26667b(long j7) {
            this.f23047f = j7;
            this.f23048g = 0;
            this.f23049h = 0L;
        }

        @Override // p336s1.C6368b.b
        /* renamed from: c */
        public void mo26668c(int i7, long j7) {
            this.f23042a.mo466j(new C6371e(this.f23044c, 1, i7, j7));
            this.f23043b.mo566e(this.f23045d);
        }
    }

    /* renamed from: e */
    private void m26658e() {
        AbstractC5332a.m21804i(this.f23022b);
        AbstractC5330M.m21747i(this.f23021a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC0883r[] m26659f() {
        return new InterfaceC0883r[]{new C6368b()};
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f23023c = j7 == 0 ? 0 : 4;
        b bVar = this.f23025e;
        if (bVar != null) {
            bVar.mo26667b(j8);
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f23021a = interfaceC0885t;
        this.f23022b = interfaceC0885t.mo455b(0, 1);
        interfaceC0885t.mo472q();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        m26658e();
        int i7 = this.f23023c;
        if (i7 == 0) {
            m26660j(interfaceC0884s);
            return 0;
        }
        if (i7 == 1) {
            m26662l(interfaceC0884s);
            return 0;
        }
        if (i7 == 2) {
            m26661k(interfaceC0884s);
            return 0;
        }
        if (i7 == 3) {
            m26664n(interfaceC0884s);
            return 0;
        }
        if (i7 == 4) {
            return m26663m(interfaceC0884s);
        }
        throw new IllegalStateException();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        return AbstractC6370d.m26674a(interfaceC0884s);
    }

    /* renamed from: j */
    public final void m26660j(InterfaceC0884s interfaceC0884s) {
        AbstractC5332a.m21802g(interfaceC0884s.mo3522u() == 0);
        int i7 = this.f23026f;
        if (i7 != -1) {
            interfaceC0884s.mo3519q(i7);
            this.f23023c = 4;
        } else {
            if (!AbstractC6370d.m26674a(interfaceC0884s)) {
                throw C4295A.m17943a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC0884s.mo3519q((int) (interfaceC0884s.mo3514i() - interfaceC0884s.mo3522u()));
            this.f23023c = 1;
        }
    }

    /* renamed from: k */
    public final void m26661k(InterfaceC0884s interfaceC0884s) {
        C6369c m26675b = AbstractC6370d.m26675b(interfaceC0884s);
        int i7 = m26675b.f23050a;
        if (i7 == 17) {
            this.f23025e = new a(this.f23021a, this.f23022b, m26675b);
        } else if (i7 == 6) {
            this.f23025e = new c(this.f23021a, this.f23022b, m26675b, "audio/g711-alaw", -1);
        } else if (i7 == 7) {
            this.f23025e = new c(this.f23021a, this.f23022b, m26675b, "audio/g711-mlaw", -1);
        } else {
            int m3581a = AbstractC0865X.m3581a(i7, m26675b.f23055f);
            if (m3581a == 0) {
                throw C4295A.m17947e("Unsupported WAV format type: " + m26675b.f23050a);
            }
            this.f23025e = new c(this.f23021a, this.f23022b, m26675b, "audio/raw", m3581a);
        }
        this.f23023c = 3;
    }

    /* renamed from: l */
    public final void m26662l(InterfaceC0884s interfaceC0884s) {
        this.f23024d = AbstractC6370d.m26676c(interfaceC0884s);
        this.f23023c = 2;
    }

    /* renamed from: m */
    public final int m26663m(InterfaceC0884s interfaceC0884s) {
        AbstractC5332a.m21802g(this.f23027g != -1);
        return ((b) AbstractC5332a.m21800e(this.f23025e)).mo26666a(interfaceC0884s, this.f23027g - interfaceC0884s.mo3522u()) ? -1 : 0;
    }

    /* renamed from: n */
    public final void m26664n(InterfaceC0884s interfaceC0884s) {
        Pair m26678e = AbstractC6370d.m26678e(interfaceC0884s);
        this.f23026f = ((Long) m26678e.first).intValue();
        long longValue = ((Long) m26678e.second).longValue();
        long j7 = this.f23024d;
        if (j7 != -1 && longValue == 4294967295L) {
            longValue = j7;
        }
        this.f23027g = this.f23026f + longValue;
        long mo3511a = interfaceC0884s.mo3511a();
        if (mo3511a != -1 && this.f23027g > mo3511a) {
            AbstractC5346o.m21867h("WavExtractor", "Data exceeds input length: " + this.f23027g + ", " + mo3511a);
            this.f23027g = mo3511a;
        }
        ((b) AbstractC5332a.m21800e(this.f23025e)).mo26668c(this.f23026f, this.f23027g);
        this.f23023c = 4;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
