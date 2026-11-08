package p359v0;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p232g0.C4327q;
import p259j0.AbstractC5323F;
import p259j0.AbstractC5332a;
import p284m0.C5561i;
import p292n0.AbstractC5705W0;
import p292n0.AbstractC5745n;
import p292n0.C5756s0;
import p359v0.InterfaceC6705c;

/* renamed from: v0.g */
/* loaded from: classes.dex */
public class C6709g extends AbstractC5745n {

    /* renamed from: A */
    public final ArrayDeque f24205A;

    /* renamed from: B */
    public boolean f24206B;

    /* renamed from: C */
    public boolean f24207C;

    /* renamed from: D */
    public a f24208D;

    /* renamed from: E */
    public long f24209E;

    /* renamed from: F */
    public long f24210F;

    /* renamed from: G */
    public int f24211G;

    /* renamed from: H */
    public int f24212H;

    /* renamed from: I */
    public C4327q f24213I;

    /* renamed from: J */
    public InterfaceC6705c f24214J;

    /* renamed from: K */
    public C5561i f24215K;

    /* renamed from: L */
    public InterfaceC6707e f24216L;

    /* renamed from: M */
    public Bitmap f24217M;

    /* renamed from: N */
    public boolean f24218N;

    /* renamed from: O */
    public b f24219O;

    /* renamed from: P */
    public b f24220P;

    /* renamed from: Q */
    public int f24221Q;

    /* renamed from: y */
    public final InterfaceC6705c.a f24222y;

    /* renamed from: z */
    public final C5561i f24223z;

    /* renamed from: v0.g$a */
    public static final class a {

        /* renamed from: c */
        public static final a f24224c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a */
        public final long f24225a;

        /* renamed from: b */
        public final long f24226b;

        public a(long j7, long j8) {
            this.f24225a = j7;
            this.f24226b = j8;
        }
    }

    /* renamed from: v0.g$b */
    public static class b {

        /* renamed from: a */
        public final int f24227a;

        /* renamed from: b */
        public final long f24228b;

        /* renamed from: c */
        public Bitmap f24229c;

        public b(int i7, long j7) {
            this.f24227a = i7;
            this.f24228b = j7;
        }

        /* renamed from: a */
        public long m27640a() {
            return this.f24228b;
        }

        /* renamed from: b */
        public Bitmap m27641b() {
            return this.f24229c;
        }

        /* renamed from: c */
        public int m27642c() {
            return this.f24227a;
        }

        /* renamed from: d */
        public boolean m27643d() {
            return this.f24229c != null;
        }

        /* renamed from: e */
        public void m27644e(Bitmap bitmap) {
            this.f24229c = bitmap;
        }
    }

    public C6709g(InterfaceC6705c.a aVar, InterfaceC6707e interfaceC6707e) {
        super(4);
        this.f24222y = aVar;
        this.f24216L = m27626k0(interfaceC6707e);
        this.f24223z = C5561i.m23288v();
        this.f24208D = a.f24224c;
        this.f24205A = new ArrayDeque();
        this.f24210F = -9223372036854775807L;
        this.f24209E = -9223372036854775807L;
        this.f24211G = 0;
        this.f24212H = 1;
    }

    /* renamed from: k0 */
    public static InterfaceC6707e m27626k0(InterfaceC6707e interfaceC6707e) {
        return interfaceC6707e == null ? InterfaceC6707e.f24203a : interfaceC6707e;
    }

    /* renamed from: p0 */
    private void m27627p0(long j7) {
        this.f24209E = j7;
        while (!this.f24205A.isEmpty() && j7 >= ((a) this.f24205A.peek()).f24225a) {
            this.f24208D = (a) this.f24205A.removeFirst();
        }
    }

    @Override // p292n0.AbstractC5745n, p292n0.C5697S0.b
    /* renamed from: A */
    public void mo2838A(int i7, Object obj) {
        if (i7 != 15) {
            super.mo2838A(i7, obj);
        } else {
            m27638s0(obj instanceof InterfaceC6707e ? (InterfaceC6707e) obj : null);
        }
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: S */
    public void mo1248S() {
        this.f24213I = null;
        this.f24208D = a.f24224c;
        this.f24205A.clear();
        m27637r0();
        this.f24216L.mo27624a();
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: T */
    public void mo2860T(boolean z6, boolean z7) {
        this.f24212H = z7 ? 1 : 0;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: V */
    public void mo1249V(long j7, boolean z6) {
        m27634n0(1);
        this.f24207C = false;
        this.f24206B = false;
        this.f24217M = null;
        this.f24219O = null;
        this.f24220P = null;
        this.f24218N = false;
        this.f24215K = null;
        InterfaceC6705c interfaceC6705c = this.f24214J;
        if (interfaceC6705c != null) {
            interfaceC6705c.flush();
        }
        this.f24205A.clear();
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: W */
    public void mo2863W() {
        m27637r0();
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: Y */
    public void mo2864Y() {
        m27637r0();
        m27634n0(1);
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: a */
    public int mo1250a(C4327q c4327q) {
        return this.f24222y.mo27620a(c4327q);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: b */
    public boolean mo1251b() {
        int i7 = this.f24212H;
        return i7 == 3 || (i7 == 0 && this.f24218N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // p292n0.AbstractC5745n
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1252b0(p232g0.C4327q[] r5, long r6, long r8, p022D0.InterfaceC0120F.b r10) {
        /*
            r4 = this;
            super.mo1252b0(r5, r6, r8, r10)
            v0.g$a r5 = r4.f24208D
            long r5 = r5.f24226b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque r5 = r4.f24205A
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.f24210F
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.f24209E
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque r5 = r4.f24205A
            v0.g$a r6 = new v0.g$a
            long r0 = r4.f24210F
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L3d
        L36:
            v0.g$a r5 = new v0.g$a
            r5.<init>(r0, r8)
            r4.f24208D = r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p359v0.C6709g.mo1252b0(g0.q[], long, long, D0.F$b):void");
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: c */
    public boolean mo1253c() {
        return this.f24207C;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: g */
    public void mo1254g(long j7, long j8) {
        if (this.f24207C) {
            return;
        }
        if (this.f24213I == null) {
            C5756s0 m24164M = m24164M();
            this.f24223z.mo19253j();
            int m24172d0 = m24172d0(m24164M, this.f24223z, 2);
            if (m24172d0 != -5) {
                if (m24172d0 == -4) {
                    AbstractC5332a.m21802g(this.f24223z.m23275m());
                    this.f24206B = true;
                    this.f24207C = true;
                    return;
                }
                return;
            }
            this.f24213I = (C4327q) AbstractC5332a.m21804i(m24164M.f20950b);
            m27632l0();
        }
        try {
            AbstractC5323F.m21659a("drainAndFeedDecoder");
            while (m27630i0(j7, j8)) {
            }
            while (m27631j0(j7)) {
            }
            AbstractC5323F.m21660b();
        } catch (C6706d e7) {
            throw m24160I(e7, null, 4003);
        }
    }

    /* renamed from: g0 */
    public final boolean m27628g0(C4327q c4327q) {
        int mo27620a = this.f24222y.mo27620a(c4327q);
        return mo27620a == AbstractC5705W0.m23918a(4) || mo27620a == AbstractC5705W0.m23918a(3);
    }

    @Override // p292n0.InterfaceC5703V0, p292n0.InterfaceC5707X0
    public String getName() {
        return "ImageRenderer";
    }

    /* renamed from: h0 */
    public final Bitmap m27629h0(int i7) {
        AbstractC5332a.m21804i(this.f24217M);
        int width = this.f24217M.getWidth() / ((C4327q) AbstractC5332a.m21804i(this.f24213I)).f15121I;
        int height = this.f24217M.getHeight() / ((C4327q) AbstractC5332a.m21804i(this.f24213I)).f15122J;
        int i8 = this.f24213I.f15121I;
        return Bitmap.createBitmap(this.f24217M, (i7 % i8) * width, (i7 / i8) * height, width, height);
    }

    /* renamed from: i0 */
    public final boolean m27630i0(long j7, long j8) {
        if (this.f24217M != null && this.f24219O == null) {
            return false;
        }
        if (this.f24212H == 0 && mo23905e() != 2) {
            return false;
        }
        if (this.f24217M == null) {
            AbstractC5332a.m21804i(this.f24214J);
            AbstractC6708f mo21993a = this.f24214J.mo21993a();
            if (mo21993a == null) {
                return false;
            }
            if (((AbstractC6708f) AbstractC5332a.m21804i(mo21993a)).m23275m()) {
                if (this.f24211G == 3) {
                    m27637r0();
                    AbstractC5332a.m21804i(this.f24213I);
                    m27632l0();
                } else {
                    ((AbstractC6708f) AbstractC5332a.m21804i(mo21993a)).mo19242r();
                    if (this.f24205A.isEmpty()) {
                        this.f24207C = true;
                    }
                }
                return false;
            }
            AbstractC5332a.m21805j(mo21993a.f24204e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f24217M = mo21993a.f24204e;
            ((AbstractC6708f) AbstractC5332a.m21804i(mo21993a)).mo19242r();
        }
        if (!this.f24218N || this.f24217M == null || this.f24219O == null) {
            return false;
        }
        AbstractC5332a.m21804i(this.f24213I);
        C4327q c4327q = this.f24213I;
        int i7 = c4327q.f15121I;
        boolean z6 = ((i7 == 1 && c4327q.f15122J == 1) || i7 == -1 || c4327q.f15122J == -1) ? false : true;
        if (!this.f24219O.m27643d()) {
            b bVar = this.f24219O;
            bVar.m27644e(z6 ? m27629h0(bVar.m27642c()) : (Bitmap) AbstractC5332a.m21804i(this.f24217M));
        }
        if (!m27636q0(j7, j8, (Bitmap) AbstractC5332a.m21804i(this.f24219O.m27641b()), this.f24219O.m27640a())) {
            return false;
        }
        m27627p0(((b) AbstractC5332a.m21804i(this.f24219O)).m27640a());
        this.f24212H = 3;
        if (!z6 || ((b) AbstractC5332a.m21804i(this.f24219O)).m27642c() == (((C4327q) AbstractC5332a.m21804i(this.f24213I)).f15122J * ((C4327q) AbstractC5332a.m21804i(this.f24213I)).f15121I) - 1) {
            this.f24217M = null;
        }
        this.f24219O = this.f24220P;
        this.f24220P = null;
        return true;
    }

    /* renamed from: j0 */
    public final boolean m27631j0(long j7) {
        if (this.f24218N && this.f24219O != null) {
            return false;
        }
        C5756s0 m24164M = m24164M();
        InterfaceC6705c interfaceC6705c = this.f24214J;
        if (interfaceC6705c == null || this.f24211G == 3 || this.f24206B) {
            return false;
        }
        if (this.f24215K == null) {
            C5561i c5561i = (C5561i) interfaceC6705c.mo22059e();
            this.f24215K = c5561i;
            if (c5561i == null) {
                return false;
            }
        }
        if (this.f24211G == 2) {
            AbstractC5332a.m21804i(this.f24215K);
            this.f24215K.m23279q(4);
            ((InterfaceC6705c) AbstractC5332a.m21804i(this.f24214J)).m27623d(this.f24215K);
            this.f24215K = null;
            this.f24211G = 3;
            return false;
        }
        int m24172d0 = m24172d0(m24164M, this.f24215K, 0);
        if (m24172d0 == -5) {
            this.f24213I = (C4327q) AbstractC5332a.m21804i(m24164M.f20950b);
            this.f24211G = 2;
            return true;
        }
        if (m24172d0 != -4) {
            if (m24172d0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f24215K.m23291t();
        boolean z6 = ((ByteBuffer) AbstractC5332a.m21804i(this.f24215K.f20077d)).remaining() > 0 || ((C5561i) AbstractC5332a.m21804i(this.f24215K)).m23275m();
        if (z6) {
            ((InterfaceC6705c) AbstractC5332a.m21804i(this.f24214J)).m27623d((C5561i) AbstractC5332a.m21804i(this.f24215K));
            this.f24221Q = 0;
        }
        m27635o0(j7, (C5561i) AbstractC5332a.m21804i(this.f24215K));
        if (((C5561i) AbstractC5332a.m21804i(this.f24215K)).m23275m()) {
            this.f24206B = true;
            this.f24215K = null;
            return false;
        }
        this.f24210F = Math.max(this.f24210F, ((C5561i) AbstractC5332a.m21804i(this.f24215K)).f20079f);
        if (z6) {
            this.f24215K = null;
        } else {
            ((C5561i) AbstractC5332a.m21804i(this.f24215K)).mo19253j();
        }
        return !this.f24218N;
    }

    /* renamed from: l0 */
    public final void m27632l0() {
        if (!m27628g0(this.f24213I)) {
            throw m24160I(new C6706d("Provided decoder factory can't create decoder for format."), this.f24213I, 4005);
        }
        InterfaceC6705c interfaceC6705c = this.f24214J;
        if (interfaceC6705c != null) {
            interfaceC6705c.release();
        }
        this.f24214J = this.f24222y.mo27621b();
    }

    /* renamed from: m0 */
    public final boolean m27633m0(b bVar) {
        return ((C4327q) AbstractC5332a.m21804i(this.f24213I)).f15121I == -1 || this.f24213I.f15122J == -1 || bVar.m27642c() == (((C4327q) AbstractC5332a.m21804i(this.f24213I)).f15122J * this.f24213I.f15121I) - 1;
    }

    /* renamed from: n0 */
    public final void m27634n0(int i7) {
        this.f24212H = Math.min(this.f24212H, i7);
    }

    /* renamed from: o0 */
    public final void m27635o0(long j7, C5561i c5561i) {
        boolean z6 = true;
        if (c5561i.m23275m()) {
            this.f24218N = true;
            return;
        }
        b bVar = new b(this.f24221Q, c5561i.f20079f);
        this.f24220P = bVar;
        this.f24221Q++;
        if (!this.f24218N) {
            long m27640a = bVar.m27640a();
            boolean z7 = m27640a - 30000 <= j7 && j7 <= 30000 + m27640a;
            b bVar2 = this.f24219O;
            boolean z8 = bVar2 != null && bVar2.m27640a() <= j7 && j7 < m27640a;
            boolean m27633m0 = m27633m0((b) AbstractC5332a.m21804i(this.f24220P));
            if (!z7 && !z8 && !m27633m0) {
                z6 = false;
            }
            this.f24218N = z6;
            if (z8 && !z7) {
                return;
            }
        }
        this.f24219O = this.f24220P;
        this.f24220P = null;
    }

    /* renamed from: q0 */
    public boolean m27636q0(long j7, long j8, Bitmap bitmap, long j9) {
        long j10 = j9 - j7;
        if (!m27639t0() && j10 >= 30000) {
            return false;
        }
        this.f24216L.mo27625b(j9 - this.f24208D.f24226b, bitmap);
        return true;
    }

    /* renamed from: r0 */
    public final void m27637r0() {
        this.f24215K = null;
        this.f24211G = 0;
        this.f24210F = -9223372036854775807L;
        InterfaceC6705c interfaceC6705c = this.f24214J;
        if (interfaceC6705c != null) {
            interfaceC6705c.release();
            this.f24214J = null;
        }
    }

    /* renamed from: s0 */
    public final void m27638s0(InterfaceC6707e interfaceC6707e) {
        this.f24216L = m27626k0(interfaceC6707e);
    }

    /* renamed from: t0 */
    public final boolean m27639t0() {
        boolean z6 = mo23905e() == 2;
        int i7 = this.f24212H;
        if (i7 == 0) {
            return z6;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }
}
