package p064J0;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.PipesConfigBase;
import p064J0.C0681d;
import p064J0.C0694q;
import p064J0.InterfaceC0675E;
import p064J0.InterfaceC0676F;
import p178Z2.AbstractC3033v;
import p211d3.AbstractC4116f;
import p232g0.AbstractC4336z;
import p232g0.C4310P;
import p232g0.C4327q;
import p259j0.AbstractC5323F;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.AbstractC5349r;
import p259j0.C5318A;
import p284m0.C5561i;
import p292n0.AbstractC5705W0;
import p292n0.C5747o;
import p292n0.C5749p;
import p292n0.C5756s0;
import p292n0.C5759u;
import p366w0.AbstractC6811I;
import p366w0.AbstractC6837w;
import p366w0.C6829o;
import p366w0.C6830p;
import p366w0.InterfaceC6827m;
import p366w0.InterfaceC6840z;

/* renamed from: J0.k */
/* loaded from: classes.dex */
public class C0688k extends AbstractC6837w implements C0694q.b {

    /* renamed from: v1 */
    public static final int[] f2353v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: w1 */
    public static boolean f2354w1;

    /* renamed from: x1 */
    public static boolean f2355x1;

    /* renamed from: O0 */
    public final Context f2356O0;

    /* renamed from: P0 */
    public final InterfaceC0677G f2357P0;

    /* renamed from: Q0 */
    public final boolean f2358Q0;

    /* renamed from: R0 */
    public final InterfaceC0675E.a f2359R0;

    /* renamed from: S0 */
    public final int f2360S0;

    /* renamed from: T0 */
    public final boolean f2361T0;

    /* renamed from: U0 */
    public final C0694q f2362U0;

    /* renamed from: V0 */
    public final C0694q.a f2363V0;

    /* renamed from: W0 */
    public c f2364W0;

    /* renamed from: X0 */
    public boolean f2365X0;

    /* renamed from: Y0 */
    public boolean f2366Y0;

    /* renamed from: Z0 */
    public InterfaceC0676F f2367Z0;

    /* renamed from: a1 */
    public boolean f2368a1;

    /* renamed from: b1 */
    public List f2369b1;

    /* renamed from: c1 */
    public Surface f2370c1;

    /* renamed from: d1 */
    public C0692o f2371d1;

    /* renamed from: e1 */
    public C5318A f2372e1;

    /* renamed from: f1 */
    public boolean f2373f1;

    /* renamed from: g1 */
    public int f2374g1;

    /* renamed from: h1 */
    public long f2375h1;

    /* renamed from: i1 */
    public int f2376i1;

    /* renamed from: j1 */
    public int f2377j1;

    /* renamed from: k1 */
    public int f2378k1;

    /* renamed from: l1 */
    public long f2379l1;

    /* renamed from: m1 */
    public int f2380m1;

    /* renamed from: n1 */
    public long f2381n1;

    /* renamed from: o1 */
    public C4310P f2382o1;

    /* renamed from: p1 */
    public C4310P f2383p1;

    /* renamed from: q1 */
    public int f2384q1;

    /* renamed from: r1 */
    public boolean f2385r1;

    /* renamed from: s1 */
    public int f2386s1;

    /* renamed from: t1 */
    public d f2387t1;

    /* renamed from: u1 */
    public InterfaceC0693p f2388u1;

    /* renamed from: J0.k$b */
    public static final class b {
        /* renamed from: a */
        public static boolean m2906a(Context context) {
            boolean isHdr;
            Display.HdrCapabilities hdrCapabilities;
            int[] supportedHdrTypes;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                return false;
            }
            isHdr = display.isHdr();
            if (!isHdr) {
                return false;
            }
            hdrCapabilities = display.getHdrCapabilities();
            supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
            for (int i7 : supportedHdrTypes) {
                if (i7 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: J0.k$c */
    public static final class c {

        /* renamed from: a */
        public final int f2390a;

        /* renamed from: b */
        public final int f2391b;

        /* renamed from: c */
        public final int f2392c;

        public c(int i7, int i8, int i9) {
            this.f2390a = i7;
            this.f2391b = i8;
            this.f2392c = i9;
        }
    }

    /* renamed from: J0.k$d */
    public final class d implements InterfaceC6827m.d, Handler.Callback {

        /* renamed from: a */
        public final Handler f2393a;

        public d(InterfaceC6827m interfaceC6827m) {
            Handler m21673B = AbstractC5330M.m21673B(this);
            this.f2393a = m21673B;
            interfaceC6827m.mo28021f(this, m21673B);
        }

        @Override // p366w0.InterfaceC6827m.d
        /* renamed from: a */
        public void mo2907a(InterfaceC6827m interfaceC6827m, long j7, long j8) {
            if (AbstractC5330M.f18800a >= 30) {
                m2908b(j7);
            } else {
                this.f2393a.sendMessageAtFrontOfQueue(Message.obtain(this.f2393a, 0, (int) (j7 >> 32), (int) j7));
            }
        }

        /* renamed from: b */
        public final void m2908b(long j7) {
            C0688k c0688k = C0688k.this;
            if (this != c0688k.f2387t1 || c0688k.m28160E0() == null) {
                return;
            }
            if (j7 == Long.MAX_VALUE) {
                C0688k.this.m2899v2();
                return;
            }
            try {
                C0688k.this.m2897u2(j7);
            } catch (C5759u e7) {
                C0688k.this.m28161E1(e7);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m2908b(AbstractC5330M.m21752j1(message.arg1, message.arg2));
            return true;
        }
    }

    public C0688k(Context context, InterfaceC6827m.b bVar, InterfaceC6840z interfaceC6840z, long j7, boolean z6, Handler handler, InterfaceC0675E interfaceC0675E, int i7) {
        this(context, bVar, interfaceC6840z, j7, z6, handler, interfaceC0675E, i7, 30.0f);
    }

    /* renamed from: B2 */
    public static void m2822B2(InterfaceC6827m interfaceC6827m, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC6827m.mo28016a(bundle);
    }

    /* renamed from: L2 */
    private void m2823L2() {
        InterfaceC6827m m28160E0 = m28160E0();
        if (m28160E0 != null && AbstractC5330M.f18800a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f2384q1));
            m28160E0.mo28016a(bundle);
        }
    }

    /* renamed from: U1 */
    public static boolean m2829U1() {
        return AbstractC5330M.f18800a >= 21;
    }

    /* renamed from: W1 */
    public static void m2830W1(MediaFormat mediaFormat, int i7) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i7);
    }

    /* renamed from: X1 */
    public static boolean m2831X1() {
        return "NVIDIA".equals(AbstractC5330M.f18802c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x073c, code lost:
    
        if (r11.equals("A10-70L") == false) goto L89;
     */
    /* renamed from: Z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2832Z1() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p064J0.C0688k.m2832Z1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r8.equals("video/av01") == false) goto L18;
     */
    /* renamed from: b2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2833b2(p366w0.C6830p r10, p232g0.C4327q r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p064J0.C0688k.m2833b2(w0.p, g0.q):int");
    }

    /* renamed from: c2 */
    public static Point m2834c2(C6830p c6830p, C4327q c4327q) {
        int i7 = c4327q.f15145u;
        int i8 = c4327q.f15144t;
        boolean z6 = i7 > i8;
        int i9 = z6 ? i7 : i8;
        if (z6) {
            i7 = i8;
        }
        float f7 = i7 / i9;
        for (int i10 : f2353v1) {
            int i11 = (int) (i10 * f7);
            if (i10 <= i9 || i11 <= i7) {
                break;
            }
            if (AbstractC5330M.f18800a >= 21) {
                int i12 = z6 ? i11 : i10;
                if (!z6) {
                    i10 = i11;
                }
                Point m28115b = c6830p.m28115b(i12, i10);
                float f8 = c4327q.f15146v;
                if (m28115b != null && c6830p.m28126u(m28115b.x, m28115b.y, f8)) {
                    return m28115b;
                }
            } else {
                try {
                    int m21753k = AbstractC5330M.m21753k(i10, 16) * 16;
                    int m21753k2 = AbstractC5330M.m21753k(i11, 16) * 16;
                    if (m21753k * m21753k2 <= AbstractC6811I.m27977P()) {
                        int i13 = z6 ? m21753k2 : m21753k;
                        if (!z6) {
                            m21753k = m21753k2;
                        }
                        return new Point(i13, m21753k);
                    }
                } catch (AbstractC6811I.c unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: e2 */
    public static List m2835e2(Context context, InterfaceC6840z interfaceC6840z, C4327q c4327q, boolean z6, boolean z7) {
        String str = c4327q.f15138n;
        if (str == null) {
            return AbstractC3033v.m11050t();
        }
        if (AbstractC5330M.f18800a >= 26 && "video/dolby-vision".equals(str) && !b.m2906a(context)) {
            List m27995n = AbstractC6811I.m27995n(interfaceC6840z, c4327q, z6, z7);
            if (!m27995n.isEmpty()) {
                return m27995n;
            }
        }
        return AbstractC6811I.m28003v(interfaceC6840z, c4327q, z6, z7);
    }

    /* renamed from: f2 */
    public static int m2836f2(C6830p c6830p, C4327q c4327q) {
        if (c4327q.f15139o == -1) {
            return m2833b2(c6830p, c4327q);
        }
        int size = c4327q.f15141q.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((byte[]) c4327q.f15141q.get(i8)).length;
        }
        return c4327q.f15139o + i7;
    }

    /* renamed from: g2 */
    public static int m2837g2(int i7, int i8) {
        return (i7 * 3) / (i8 * 2);
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n, p292n0.C5697S0.b
    /* renamed from: A */
    public void mo2838A(int i7, Object obj) {
        if (i7 == 1) {
            m2840C2(obj);
            return;
        }
        if (i7 == 7) {
            InterfaceC0693p interfaceC0693p = (InterfaceC0693p) AbstractC5332a.m21800e(obj);
            this.f2388u1 = interfaceC0693p;
            InterfaceC0676F interfaceC0676F = this.f2367Z0;
            if (interfaceC0676F != null) {
                interfaceC0676F.mo2732m(interfaceC0693p);
                return;
            }
            return;
        }
        if (i7 == 10) {
            int intValue = ((Integer) AbstractC5332a.m21800e(obj)).intValue();
            if (this.f2386s1 != intValue) {
                this.f2386s1 = intValue;
                if (this.f2385r1) {
                    m28195v1();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 16) {
            this.f2384q1 = ((Integer) AbstractC5332a.m21800e(obj)).intValue();
            m2823L2();
            return;
        }
        if (i7 == 4) {
            this.f2374g1 = ((Integer) AbstractC5332a.m21800e(obj)).intValue();
            InterfaceC6827m m28160E0 = m28160E0();
            if (m28160E0 != null) {
                m28160E0.mo28027l(this.f2374g1);
                return;
            }
            return;
        }
        if (i7 == 5) {
            this.f2362U0.m2933n(((Integer) AbstractC5332a.m21800e(obj)).intValue());
            return;
        }
        if (i7 == 13) {
            m2843E2((List) AbstractC5332a.m21800e(obj));
            return;
        }
        if (i7 != 14) {
            super.mo2838A(i7, obj);
            return;
        }
        C5318A c5318a = (C5318A) AbstractC5332a.m21800e(obj);
        if (c5318a.m21611b() == 0 || c5318a.m21610a() == 0) {
            return;
        }
        this.f2372e1 = c5318a;
        InterfaceC0676F interfaceC0676F2 = this.f2367Z0;
        if (interfaceC0676F2 != null) {
            interfaceC0676F2.mo2740u((Surface) AbstractC5332a.m21804i(this.f2370c1), c5318a);
        }
    }

    /* renamed from: A2 */
    public void m2839A2(InterfaceC6827m interfaceC6827m, int i7, long j7, long j8) {
        AbstractC5323F.m21659a("releaseOutputBuffer");
        interfaceC6827m.mo28022g(i7, j8);
        AbstractC5323F.m21660b();
        this.f24576J0.f20814e++;
        this.f2377j1 = 0;
        if (this.f2367Z0 == null) {
            m2884m2(this.f2382o1);
            m2880k2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [J0.k, n0.n, w0.w] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.Surface] */
    /* renamed from: C2 */
    public final void m2840C2(Object obj) {
        C0692o c0692o = obj instanceof Surface ? (Surface) obj : null;
        if (c0692o == null) {
            C0692o c0692o2 = this.f2371d1;
            if (c0692o2 != null) {
                c0692o = c0692o2;
            } else {
                C6830p m28163G0 = m28163G0();
                if (m28163G0 != null && m2852J2(m28163G0)) {
                    c0692o = C0692o.m2914c(this.f2356O0, m28163G0.f24550g);
                    this.f2371d1 = c0692o;
                }
            }
        }
        if (this.f2370c1 == c0692o) {
            if (c0692o == null || c0692o == this.f2371d1) {
                return;
            }
            m2890p2();
            m2888o2();
            return;
        }
        this.f2370c1 = c0692o;
        if (this.f2367Z0 == null) {
            this.f2362U0.m2936q(c0692o);
        }
        this.f2373f1 = false;
        int mo23905e = mo23905e();
        InterfaceC6827m m28160E0 = m28160E0();
        if (m28160E0 != null && this.f2367Z0 == null) {
            if (AbstractC5330M.f18800a < 23 || c0692o == null || this.f2365X0) {
                m28195v1();
                m28183e1();
            } else {
                m2841D2(m28160E0, c0692o);
            }
        }
        if (c0692o == null || c0692o == this.f2371d1) {
            this.f2383p1 = null;
            InterfaceC0676F interfaceC0676F = this.f2367Z0;
            if (interfaceC0676F != null) {
                interfaceC0676F.mo2735p();
            }
        } else {
            m2890p2();
            if (mo23905e == 2) {
                this.f2362U0.m2924e(true);
            }
        }
        m2893r2();
    }

    /* renamed from: D2 */
    public void m2841D2(InterfaceC6827m interfaceC6827m, Surface surface) {
        interfaceC6827m.mo28029n(surface);
    }

    @Override // p064J0.C0694q.b
    /* renamed from: E */
    public boolean mo2842E(long j7, long j8) {
        return m2849H2(j7, j8);
    }

    /* renamed from: E2 */
    public void m2843E2(List list) {
        this.f2369b1 = list;
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2739t(list);
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: F0 */
    public int mo2844F0(C5561i c5561i) {
        return (AbstractC5330M.f18800a < 34 || !this.f2385r1 || c5561i.f20079f >= m24166O()) ? 0 : 32;
    }

    /* renamed from: F2 */
    public boolean m2845F2(long j7, long j8, boolean z6) {
        return j7 < -500000 && !z6;
    }

    /* renamed from: G2 */
    public boolean m2846G2(long j7, long j8, boolean z6) {
        return j7 < -30000 && !z6;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: H0 */
    public boolean mo2847H0() {
        return this.f2385r1 && AbstractC5330M.f18800a < 23;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: H1 */
    public boolean mo2848H1(C6830p c6830p) {
        return this.f2370c1 != null || m2852J2(c6830p);
    }

    /* renamed from: H2 */
    public boolean m2849H2(long j7, long j8) {
        return j7 < -30000 && j8 > PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: I0 */
    public float mo2850I0(float f7, C4327q c4327q, C4327q[] c4327qArr) {
        float f8 = -1.0f;
        for (C4327q c4327q2 : c4327qArr) {
            float f9 = c4327q2.f15146v;
            if (f9 != -1.0f) {
                f8 = Math.max(f8, f9);
            }
        }
        if (f8 == -1.0f) {
            return -1.0f;
        }
        return f8 * f7;
    }

    /* renamed from: I2 */
    public boolean m2851I2() {
        return true;
    }

    /* renamed from: J2 */
    public final boolean m2852J2(C6830p c6830p) {
        return AbstractC5330M.f18800a >= 23 && !this.f2385r1 && !m2862V1(c6830p.f24544a) && (!c6830p.f24550g || C0692o.m2913b(this.f2356O0));
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: K0 */
    public List mo2853K0(InterfaceC6840z interfaceC6840z, C4327q c4327q, boolean z6) {
        return AbstractC6811I.m28004w(m2835e2(this.f2356O0, interfaceC6840z, c4327q, z6, this.f2385r1), c4327q);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: K1 */
    public int mo2854K1(InterfaceC6840z interfaceC6840z, C4327q c4327q) {
        boolean z6;
        int i7 = 0;
        if (!AbstractC4336z.m18426s(c4327q.f15138n)) {
            return AbstractC5705W0.m23918a(0);
        }
        boolean z7 = c4327q.f15142r != null;
        List m2835e2 = m2835e2(this.f2356O0, interfaceC6840z, c4327q, z7, false);
        if (z7 && m2835e2.isEmpty()) {
            m2835e2 = m2835e2(this.f2356O0, interfaceC6840z, c4327q, false, false);
        }
        if (m2835e2.isEmpty()) {
            return AbstractC5705W0.m23918a(1);
        }
        if (!AbstractC6837w.m28140L1(c4327q)) {
            return AbstractC5705W0.m23918a(2);
        }
        C6830p c6830p = (C6830p) m2835e2.get(0);
        boolean m28122m = c6830p.m28122m(c4327q);
        if (!m28122m) {
            for (int i8 = 1; i8 < m2835e2.size(); i8++) {
                C6830p c6830p2 = (C6830p) m2835e2.get(i8);
                if (c6830p2.m28122m(c4327q)) {
                    z6 = false;
                    m28122m = true;
                    c6830p = c6830p2;
                    break;
                }
            }
        }
        z6 = true;
        int i9 = m28122m ? 4 : 3;
        int i10 = c6830p.m28125p(c4327q) ? 16 : 8;
        int i11 = c6830p.f24551h ? 64 : 0;
        int i12 = z6 ? 128 : 0;
        if (AbstractC5330M.f18800a >= 26 && "video/dolby-vision".equals(c4327q.f15138n) && !b.m2906a(this.f2356O0)) {
            i12 = 256;
        }
        if (m28122m) {
            List m2835e22 = m2835e2(this.f2356O0, interfaceC6840z, c4327q, z7, true);
            if (!m2835e22.isEmpty()) {
                C6830p c6830p3 = (C6830p) AbstractC6811I.m28004w(m2835e22, c4327q).get(0);
                if (c6830p3.m28122m(c4327q) && c6830p3.m28125p(c4327q)) {
                    i7 = 32;
                }
            }
        }
        return AbstractC5705W0.m23920c(i9, i10, i7, i11, i12);
    }

    /* renamed from: K2 */
    public void m2855K2(InterfaceC6827m interfaceC6827m, int i7, long j7) {
        AbstractC5323F.m21659a("skipVideoBuffer");
        interfaceC6827m.mo28025j(i7, false);
        AbstractC5323F.m21660b();
        this.f24576J0.f20815f++;
    }

    /* renamed from: M2 */
    public void m2856M2(int i7, int i8) {
        C5747o c5747o = this.f24576J0;
        c5747o.f20817h += i7;
        int i9 = i7 + i8;
        c5747o.f20816g += i9;
        this.f2376i1 += i9;
        int i10 = this.f2377j1 + i9;
        this.f2377j1 = i10;
        c5747o.f20818i = Math.max(i10, c5747o.f20818i);
        int i11 = this.f2360S0;
        if (i11 <= 0 || this.f2376i1 < i11) {
            return;
        }
        m2878j2();
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: N0 */
    public InterfaceC6827m.a mo2857N0(C6830p c6830p, C4327q c4327q, MediaCrypto mediaCrypto, float f7) {
        C0692o c0692o = this.f2371d1;
        if (c0692o != null && c0692o.f2397a != c6830p.f24550g) {
            m2903x2();
        }
        String str = c6830p.f24546c;
        c m2869d2 = m2869d2(c6830p, c4327q, m24168Q());
        this.f2364W0 = m2869d2;
        MediaFormat m2873h2 = m2873h2(c4327q, str, m2869d2, f7, this.f2361T0, this.f2385r1 ? this.f2386s1 : 0);
        if (this.f2370c1 == null) {
            if (!m2852J2(c6830p)) {
                throw new IllegalStateException();
            }
            if (this.f2371d1 == null) {
                this.f2371d1 = C0692o.m2914c(this.f2356O0, c6830p.f24550g);
            }
            this.f2370c1 = this.f2371d1;
        }
        m2891q2(m2873h2);
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        return InterfaceC6827m.a.m28095b(c6830p, m2873h2, c4327q, interfaceC0676F != null ? interfaceC0676F.mo2727h() : this.f2370c1, mediaCrypto);
    }

    /* renamed from: N2 */
    public void m2858N2(long j7) {
        this.f24576J0.m24175a(j7);
        this.f2379l1 += j7;
        this.f2380m1++;
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: S */
    public void mo1248S() {
        this.f2383p1 = null;
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2733n();
        } else {
            this.f2362U0.m2926g();
        }
        m2893r2();
        this.f2373f1 = false;
        this.f2387t1 = null;
        try {
            super.mo1248S();
        } finally {
            this.f2359R0.m2708m(this.f24576J0);
            this.f2359R0.m2705D(C4310P.f14967e);
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: S0 */
    public void mo2859S0(C5561i c5561i) {
        if (this.f2366Y0) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(c5561i.f20080n);
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        m2822B2((InterfaceC6827m) AbstractC5332a.m21800e(m28160E0()), bArr);
                    }
                }
            }
        }
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: T */
    public void mo2860T(boolean z6, boolean z7) {
        super.mo2860T(z6, z7);
        boolean z8 = m24163L().f20643b;
        AbstractC5332a.m21802g((z8 && this.f2386s1 == 0) ? false : true);
        if (this.f2385r1 != z8) {
            this.f2385r1 = z8;
            m28195v1();
        }
        this.f2359R0.m2710o(this.f24576J0);
        if (!this.f2368a1) {
            if ((this.f2369b1 != null || !this.f2358Q0) && this.f2367Z0 == null) {
                InterfaceC0677G interfaceC0677G = this.f2357P0;
                if (interfaceC0677G == null) {
                    interfaceC0677G = new C0681d.b(this.f2356O0, this.f2362U0).m2788f(m24162K()).m2787e();
                }
                this.f2367Z0 = interfaceC0677G.mo2748b();
            }
            this.f2368a1 = true;
        }
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F == null) {
            this.f2362U0.m2934o(m24162K());
            this.f2362U0.m2927h(z7);
            return;
        }
        interfaceC0676F.mo2730k(new a(), AbstractC4116f.m17293a());
        InterfaceC0693p interfaceC0693p = this.f2388u1;
        if (interfaceC0693p != null) {
            this.f2367Z0.mo2732m(interfaceC0693p);
        }
        if (this.f2370c1 != null && !this.f2372e1.equals(C5318A.f18783c)) {
            this.f2367Z0.mo2740u(this.f2370c1, this.f2372e1);
        }
        this.f2367Z0.mo2734o(m28173Q0());
        List list = this.f2369b1;
        if (list != null) {
            this.f2367Z0.mo2739t(list);
        }
        this.f2367Z0.mo2743y(z7);
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: U */
    public void mo2861U() {
        super.mo2861U();
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: V */
    public void mo1249V(long j7, boolean z6) {
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2737r(true);
            this.f2367Z0.mo2741v(m28170O0(), m2868a2());
        }
        super.mo1249V(j7, z6);
        if (this.f2367Z0 == null) {
            this.f2362U0.m2932m();
        }
        if (z6) {
            this.f2362U0.m2924e(false);
        }
        m2893r2();
        this.f2377j1 = 0;
    }

    /* renamed from: V1 */
    public boolean m2862V1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C0688k.class) {
            try {
                if (!f2354w1) {
                    f2355x1 = m2832Z1();
                    f2354w1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2355x1;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: W */
    public void mo2863W() {
        super.mo2863W();
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F == null || !this.f2358Q0) {
            return;
        }
        interfaceC0676F.release();
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: Y */
    public void mo2864Y() {
        try {
            super.mo2864Y();
        } finally {
            this.f2368a1 = false;
            if (this.f2371d1 != null) {
                m2903x2();
            }
        }
    }

    /* renamed from: Y1 */
    public void m2865Y1(InterfaceC6827m interfaceC6827m, int i7, long j7) {
        AbstractC5323F.m21659a("dropVideoBuffer");
        interfaceC6827m.mo28025j(i7, false);
        AbstractC5323F.m21660b();
        m2856M2(0, 1);
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: Z */
    public void mo2866Z() {
        super.mo2866Z();
        this.f2376i1 = 0;
        this.f2375h1 = m24162K().mo21613b();
        this.f2379l1 = 0L;
        this.f2380m1 = 0;
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2729j();
        } else {
            this.f2362U0.m2930k();
        }
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: a0 */
    public void mo2867a0() {
        m2878j2();
        m2881l2();
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2738s();
        } else {
            this.f2362U0.m2931l();
        }
        super.mo2867a0();
    }

    /* renamed from: a2 */
    public long m2868a2() {
        return 0L;
    }

    @Override // p366w0.AbstractC6837w, p292n0.InterfaceC5703V0
    /* renamed from: b */
    public boolean mo1251b() {
        C0692o c0692o;
        InterfaceC0676F interfaceC0676F;
        boolean z6 = super.mo1251b() && ((interfaceC0676F = this.f2367Z0) == null || interfaceC0676F.mo2722b());
        if (z6 && (((c0692o = this.f2371d1) != null && this.f2370c1 == c0692o) || m28160E0() == null || this.f2385r1)) {
            return true;
        }
        return this.f2362U0.m2923d(z6);
    }

    @Override // p366w0.AbstractC6837w, p292n0.InterfaceC5703V0
    /* renamed from: c */
    public boolean mo1253c() {
        InterfaceC0676F interfaceC0676F;
        return super.mo1253c() && ((interfaceC0676F = this.f2367Z0) == null || interfaceC0676F.mo2723c());
    }

    /* renamed from: d2 */
    public c m2869d2(C6830p c6830p, C4327q c4327q, C4327q[] c4327qArr) {
        int m2833b2;
        int i7 = c4327q.f15144t;
        int i8 = c4327q.f15145u;
        int m2836f2 = m2836f2(c6830p, c4327q);
        if (c4327qArr.length == 1) {
            if (m2836f2 != -1 && (m2833b2 = m2833b2(c6830p, c4327q)) != -1) {
                m2836f2 = Math.min((int) (m2836f2 * 1.5f), m2833b2);
            }
            return new c(i7, i8, m2836f2);
        }
        int length = c4327qArr.length;
        boolean z6 = false;
        for (int i9 = 0; i9 < length; i9++) {
            C4327q c4327q2 = c4327qArr[i9];
            if (c4327q.f15113A != null && c4327q2.f15113A == null) {
                c4327q2 = c4327q2.m18193a().m18239P(c4327q.f15113A).m18234K();
            }
            if (c6830p.m28116e(c4327q, c4327q2).f20827d != 0) {
                int i10 = c4327q2.f15144t;
                z6 |= i10 == -1 || c4327q2.f15145u == -1;
                i7 = Math.max(i7, i10);
                i8 = Math.max(i8, c4327q2.f15145u);
                m2836f2 = Math.max(m2836f2, m2836f2(c6830p, c4327q2));
            }
        }
        if (z6) {
            AbstractC5346o.m21867h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i7 + "x" + i8);
            Point m2834c2 = m2834c2(c6830p, c4327q);
            if (m2834c2 != null) {
                i7 = Math.max(i7, m2834c2.x);
                i8 = Math.max(i8, m2834c2.y);
                m2836f2 = Math.max(m2836f2, m2833b2(c6830p, c4327q.m18193a().m18271v0(i7).m18248Y(i8).m18234K()));
                AbstractC5346o.m21867h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i7 + "x" + i8);
            }
        }
        return new c(i7, i8, m2836f2);
    }

    @Override // p292n0.AbstractC5745n, p292n0.InterfaceC5703V0
    /* renamed from: f */
    public void mo2870f() {
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2725f();
        } else {
            this.f2362U0.m2920a();
        }
    }

    @Override // p366w0.AbstractC6837w, p292n0.InterfaceC5703V0
    /* renamed from: g */
    public void mo1254g(long j7, long j8) {
        super.mo1254g(j7, j8);
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            try {
                interfaceC0676F.mo2726g(j7, j8);
            } catch (InterfaceC0676F.b e7) {
                throw m24160I(e7, e7.f2286a, 7001);
            }
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: g1 */
    public void mo2871g1(Exception exc) {
        AbstractC5346o.m21863d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f2359R0.m2704C(exc);
    }

    @Override // p292n0.InterfaceC5703V0, p292n0.InterfaceC5707X0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: h1 */
    public void mo2872h1(String str, InterfaceC6827m.a aVar, long j7, long j8) {
        this.f2359R0.m2706k(str, j7, j8);
        this.f2365X0 = m2862V1(str);
        this.f2366Y0 = ((C6830p) AbstractC5332a.m21800e(m28163G0())).m28123n();
        m2893r2();
    }

    /* renamed from: h2 */
    public MediaFormat m2873h2(C4327q c4327q, String str, c cVar, float f7, boolean z6, int i7) {
        Pair m27999r;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c4327q.f15144t);
        mediaFormat.setInteger("height", c4327q.f15145u);
        AbstractC5349r.m21884e(mediaFormat, c4327q.f15141q);
        AbstractC5349r.m21882c(mediaFormat, "frame-rate", c4327q.f15146v);
        AbstractC5349r.m21883d(mediaFormat, "rotation-degrees", c4327q.f15147w);
        AbstractC5349r.m21881b(mediaFormat, c4327q.f15113A);
        if ("video/dolby-vision".equals(c4327q.f15138n) && (m27999r = AbstractC6811I.m27999r(c4327q)) != null) {
            AbstractC5349r.m21883d(mediaFormat, "profile", ((Integer) m27999r.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f2390a);
        mediaFormat.setInteger("max-height", cVar.f2391b);
        AbstractC5349r.m21883d(mediaFormat, "max-input-size", cVar.f2392c);
        int i8 = AbstractC5330M.f18800a;
        if (i8 >= 23) {
            mediaFormat.setInteger(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (z6) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i7 != 0) {
            m2830W1(mediaFormat, i7);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f2384q1));
        }
        return mediaFormat;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: i1 */
    public void mo2874i1(String str) {
        this.f2359R0.m2707l(str);
    }

    /* renamed from: i2 */
    public boolean m2875i2(long j7, boolean z6) {
        int m24174f0 = m24174f0(j7);
        if (m24174f0 == 0) {
            return false;
        }
        if (z6) {
            C5747o c5747o = this.f24576J0;
            c5747o.f20813d += m24174f0;
            c5747o.f20815f += this.f2378k1;
        } else {
            this.f24576J0.f20819j++;
            m2856M2(m24174f0, this.f2378k1);
        }
        m28154B0();
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2737r(false);
        }
        return true;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: j0 */
    public C5749p mo2876j0(C6830p c6830p, C4327q c4327q, C4327q c4327q2) {
        C5749p m28116e = c6830p.m28116e(c4327q, c4327q2);
        int i7 = m28116e.f20828e;
        c cVar = (c) AbstractC5332a.m21800e(this.f2364W0);
        if (c4327q2.f15144t > cVar.f2390a || c4327q2.f15145u > cVar.f2391b) {
            i7 |= 256;
        }
        if (m2836f2(c6830p, c4327q2) > cVar.f2392c) {
            i7 |= 64;
        }
        int i8 = i7;
        return new C5749p(c6830p.f24544a, c4327q, c4327q2, i8 != 0 ? 0 : m28116e.f20827d, i8);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: j1 */
    public C5749p mo2877j1(C5756s0 c5756s0) {
        C5749p mo2877j1 = super.mo2877j1(c5756s0);
        this.f2359R0.m2711p((C4327q) AbstractC5332a.m21800e(c5756s0.f20950b), mo2877j1);
        return mo2877j1;
    }

    /* renamed from: j2 */
    public final void m2878j2() {
        if (this.f2376i1 > 0) {
            long mo21613b = m24162K().mo21613b();
            this.f2359R0.m2709n(this.f2376i1, mo21613b - this.f2375h1);
            this.f2376i1 = 0;
            this.f2375h1 = mo21613b;
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: k1 */
    public void mo2879k1(C4327q c4327q, MediaFormat mediaFormat) {
        int integer;
        int i7;
        InterfaceC6827m m28160E0 = m28160E0();
        if (m28160E0 != null) {
            m28160E0.mo28027l(this.f2374g1);
        }
        int i8 = 0;
        if (this.f2385r1) {
            i7 = c4327q.f15144t;
            integer = c4327q.f15145u;
        } else {
            AbstractC5332a.m21800e(mediaFormat);
            boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i7 = integer2;
        }
        float f7 = c4327q.f15148x;
        if (m2829U1()) {
            int i9 = c4327q.f15147w;
            if (i9 == 90 || i9 == 270) {
                f7 = 1.0f / f7;
                int i10 = integer;
                integer = i7;
                i7 = i10;
            }
        } else if (this.f2367Z0 == null) {
            i8 = c4327q.f15147w;
        }
        this.f2382o1 = new C4310P(i7, integer, i8, f7);
        if (this.f2367Z0 == null) {
            this.f2362U0.m2935p(c4327q.f15146v);
        } else {
            m2901w2();
            this.f2367Z0.mo2728i(1, c4327q.m18193a().m18271v0(i7).m18248Y(integer).m18263n0(i8).m18260k0(f7).m18234K());
        }
    }

    /* renamed from: k2 */
    public final void m2880k2() {
        if (!this.f2362U0.m2928i() || this.f2370c1 == null) {
            return;
        }
        m2896t2();
    }

    /* renamed from: l2 */
    public final void m2881l2() {
        int i7 = this.f2380m1;
        if (i7 != 0) {
            this.f2359R0.m2703B(this.f2379l1, i7);
            this.f2379l1 = 0L;
            this.f2380m1 = 0;
        }
    }

    @Override // p064J0.C0694q.b
    /* renamed from: m */
    public boolean mo2882m(long j7, long j8, long j9, boolean z6, boolean z7) {
        return m2845F2(j7, j9, z6) && m2875i2(j8, z7);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: m1 */
    public void mo2883m1(long j7) {
        super.mo2883m1(j7);
        if (this.f2385r1) {
            return;
        }
        this.f2378k1--;
    }

    /* renamed from: m2 */
    public final void m2884m2(C4310P c4310p) {
        if (c4310p.equals(C4310P.f14967e) || c4310p.equals(this.f2383p1)) {
            return;
        }
        this.f2383p1 = c4310p;
        this.f2359R0.m2705D(c4310p);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: n1 */
    public void mo2885n1() {
        super.mo2885n1();
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2741v(m28170O0(), m2868a2());
        } else {
            this.f2362U0.m2929j();
        }
        m2893r2();
    }

    /* renamed from: n2 */
    public final boolean m2886n2(InterfaceC6827m interfaceC6827m, int i7, long j7, C4327q c4327q) {
        long m2945g = this.f2363V0.m2945g();
        long m2944f = this.f2363V0.m2944f();
        if (AbstractC5330M.f18800a >= 21) {
            if (m2851I2() && m2945g == this.f2381n1) {
                m2855K2(interfaceC6827m, i7, j7);
            } else {
                m2895s2(j7, m2945g, c4327q);
                m2839A2(interfaceC6827m, i7, j7, m2945g);
            }
            m2858N2(m2944f);
            this.f2381n1 = m2945g;
            return true;
        }
        if (m2944f >= 30000) {
            return false;
        }
        if (m2944f > 11000) {
            try {
                Thread.sleep((m2944f - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        m2895s2(j7, m2945g, c4327q);
        m2904y2(interfaceC6827m, i7, j7);
        m2858N2(m2944f);
        return true;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: o1 */
    public void mo2887o1(C5561i c5561i) {
        boolean z6 = this.f2385r1;
        if (!z6) {
            this.f2378k1++;
        }
        if (AbstractC5330M.f18800a >= 23 || !z6) {
            return;
        }
        m2897u2(c5561i.f20079f);
    }

    /* renamed from: o2 */
    public final void m2888o2() {
        Surface surface = this.f2370c1;
        if (surface == null || !this.f2373f1) {
            return;
        }
        this.f2359R0.m2702A(surface);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: p1 */
    public void mo2889p1(C4327q c4327q) {
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F == null || interfaceC0676F.mo2724d()) {
            return;
        }
        try {
            this.f2367Z0.mo2731l(c4327q);
        } catch (InterfaceC0676F.b e7) {
            throw m24160I(e7, c4327q, 7000);
        }
    }

    /* renamed from: p2 */
    public final void m2890p2() {
        C4310P c4310p = this.f2383p1;
        if (c4310p != null) {
            this.f2359R0.m2705D(c4310p);
        }
    }

    /* renamed from: q2 */
    public final void m2891q2(MediaFormat mediaFormat) {
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F == null || interfaceC0676F.mo2742w()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: r1 */
    public boolean mo2892r1(long j7, long j8, InterfaceC6827m interfaceC6827m, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, C4327q c4327q) {
        AbstractC5332a.m21800e(interfaceC6827m);
        long m28170O0 = j9 - m28170O0();
        int m2922c = this.f2362U0.m2922c(j9, j7, j8, m28172P0(), z7, this.f2363V0);
        if (m2922c == 4) {
            return false;
        }
        if (z6 && !z7) {
            m2855K2(interfaceC6827m, i7, m28170O0);
            return true;
        }
        if (this.f2370c1 == this.f2371d1 && this.f2367Z0 == null) {
            if (this.f2363V0.m2944f() >= 30000) {
                return false;
            }
            m2855K2(interfaceC6827m, i7, m28170O0);
            m2858N2(this.f2363V0.m2944f());
            return true;
        }
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            try {
                interfaceC0676F.mo2726g(j7, j8);
                long mo2736q = this.f2367Z0.mo2736q(j9 + m2868a2(), z7);
                if (mo2736q == -9223372036854775807L) {
                    return false;
                }
                m2905z2(interfaceC6827m, i7, m28170O0, mo2736q);
                return true;
            } catch (InterfaceC0676F.b e7) {
                throw m24160I(e7, e7.f2286a, 7001);
            }
        }
        if (m2922c == 0) {
            long mo21614c = m24162K().mo21614c();
            m2895s2(m28170O0, mo21614c, c4327q);
            m2905z2(interfaceC6827m, i7, m28170O0, mo21614c);
            m2858N2(this.f2363V0.m2944f());
            return true;
        }
        if (m2922c == 1) {
            return m2886n2((InterfaceC6827m) AbstractC5332a.m21804i(interfaceC6827m), i7, m28170O0, c4327q);
        }
        if (m2922c == 2) {
            m2865Y1(interfaceC6827m, i7, m28170O0);
            m2858N2(this.f2363V0.m2944f());
            return true;
        }
        if (m2922c != 3) {
            if (m2922c == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(m2922c));
        }
        m2855K2(interfaceC6827m, i7, m28170O0);
        m2858N2(this.f2363V0.m2944f());
        return true;
    }

    /* renamed from: r2 */
    public final void m2893r2() {
        int i7;
        InterfaceC6827m m28160E0;
        if (!this.f2385r1 || (i7 = AbstractC5330M.f18800a) < 23 || (m28160E0 = m28160E0()) == null) {
            return;
        }
        this.f2387t1 = new d(m28160E0);
        if (i7 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            m28160E0.mo28016a(bundle);
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: s0 */
    public C6829o mo2894s0(Throwable th, C6830p c6830p) {
        return new C0687j(th, c6830p, this.f2370c1);
    }

    /* renamed from: s2 */
    public final void m2895s2(long j7, long j8, C4327q c4327q) {
        InterfaceC0693p interfaceC0693p = this.f2388u1;
        if (interfaceC0693p != null) {
            interfaceC0693p.mo2919i(j7, j8, c4327q, m28166J0());
        }
    }

    /* renamed from: t2 */
    public final void m2896t2() {
        this.f2359R0.m2702A(this.f2370c1);
        this.f2373f1 = true;
    }

    /* renamed from: u2 */
    public void m2897u2(long j7) {
        m28171O1(j7);
        m2884m2(this.f2382o1);
        this.f24576J0.f20814e++;
        m2880k2();
        mo2883m1(j7);
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n, p292n0.InterfaceC5703V0
    /* renamed from: v */
    public void mo2898v(float f7, float f8) {
        super.mo2898v(f7, f8);
        InterfaceC0676F interfaceC0676F = this.f2367Z0;
        if (interfaceC0676F != null) {
            interfaceC0676F.mo2734o(f7);
        } else {
            this.f2362U0.m2937r(f7);
        }
    }

    /* renamed from: v2 */
    public final void m2899v2() {
        m28159D1();
    }

    @Override // p064J0.C0694q.b
    /* renamed from: w */
    public boolean mo2900w(long j7, long j8, boolean z6) {
        return m2846G2(j7, j8, z6);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: x1 */
    public void mo2902x1() {
        super.mo2902x1();
        this.f2378k1 = 0;
    }

    /* renamed from: x2 */
    public final void m2903x2() {
        Surface surface = this.f2370c1;
        C0692o c0692o = this.f2371d1;
        if (surface == c0692o) {
            this.f2370c1 = null;
        }
        if (c0692o != null) {
            c0692o.release();
            this.f2371d1 = null;
        }
    }

    /* renamed from: y2 */
    public void m2904y2(InterfaceC6827m interfaceC6827m, int i7, long j7) {
        AbstractC5323F.m21659a("releaseOutputBuffer");
        interfaceC6827m.mo28025j(i7, true);
        AbstractC5323F.m21660b();
        this.f24576J0.f20814e++;
        this.f2377j1 = 0;
        if (this.f2367Z0 == null) {
            m2884m2(this.f2382o1);
            m2880k2();
        }
    }

    /* renamed from: z2 */
    public final void m2905z2(InterfaceC6827m interfaceC6827m, int i7, long j7, long j8) {
        if (AbstractC5330M.f18800a >= 21) {
            m2839A2(interfaceC6827m, i7, j7, j8);
        } else {
            m2904y2(interfaceC6827m, i7, j7);
        }
    }

    public C0688k(Context context, InterfaceC6827m.b bVar, InterfaceC6840z interfaceC6840z, long j7, boolean z6, Handler handler, InterfaceC0675E interfaceC0675E, int i7, float f7) {
        this(context, bVar, interfaceC6840z, j7, z6, handler, interfaceC0675E, i7, f7, null);
    }

    public C0688k(Context context, InterfaceC6827m.b bVar, InterfaceC6840z interfaceC6840z, long j7, boolean z6, Handler handler, InterfaceC0675E interfaceC0675E, int i7, float f7, InterfaceC0677G interfaceC0677G) {
        super(2, bVar, interfaceC6840z, z6, f7);
        Context applicationContext = context.getApplicationContext();
        this.f2356O0 = applicationContext;
        this.f2360S0 = i7;
        this.f2357P0 = interfaceC0677G;
        this.f2359R0 = new InterfaceC0675E.a(handler, interfaceC0675E);
        this.f2358Q0 = interfaceC0677G == null;
        if (interfaceC0677G == null) {
            this.f2362U0 = new C0694q(applicationContext, this, j7);
        } else {
            this.f2362U0 = interfaceC0677G.mo2747a();
        }
        this.f2363V0 = new C0694q.a();
        this.f2361T0 = m2831X1();
        this.f2372e1 = C5318A.f18783c;
        this.f2374g1 = 1;
        this.f2382o1 = C4310P.f14967e;
        this.f2386s1 = 0;
        this.f2383p1 = null;
        this.f2384q1 = -1000;
    }

    /* renamed from: w2 */
    public void m2901w2() {
    }

    /* renamed from: J0.k$a */
    public class a implements InterfaceC0676F.a {
        public a() {
        }

        @Override // p064J0.InterfaceC0676F.a
        /* renamed from: b */
        public void mo2745b(InterfaceC0676F interfaceC0676F) {
            C0688k.this.m2856M2(0, 1);
        }

        @Override // p064J0.InterfaceC0676F.a
        /* renamed from: c */
        public void mo2746c(InterfaceC0676F interfaceC0676F) {
            AbstractC5332a.m21804i(C0688k.this.f2370c1);
            C0688k.this.m2896t2();
        }

        @Override // p064J0.InterfaceC0676F.a
        /* renamed from: a */
        public void mo2744a(InterfaceC0676F interfaceC0676F, C4310P c4310p) {
        }
    }
}
