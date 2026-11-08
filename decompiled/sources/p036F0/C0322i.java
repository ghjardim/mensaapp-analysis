package p036F0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import p022D0.InterfaceC0120F;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p248i0.C4504b;
import p249i1.AbstractC4526q;
import p249i1.C4511b;
import p249i1.C4514e;
import p249i1.C4522m;
import p249i1.C4525p;
import p249i1.InterfaceC4521l;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p284m0.C5561i;
import p292n0.AbstractC5705W0;
import p292n0.AbstractC5745n;
import p292n0.C5756s0;

/* renamed from: F0.i */
/* loaded from: classes.dex */
public final class C0322i extends AbstractC5745n implements Handler.Callback {

    /* renamed from: A */
    public InterfaceC0314a f1161A;

    /* renamed from: B */
    public final InterfaceC0320g f1162B;

    /* renamed from: C */
    public boolean f1163C;

    /* renamed from: D */
    public int f1164D;

    /* renamed from: E */
    public InterfaceC4521l f1165E;

    /* renamed from: F */
    public C4525p f1166F;

    /* renamed from: G */
    public AbstractC4526q f1167G;

    /* renamed from: H */
    public AbstractC4526q f1168H;

    /* renamed from: I */
    public int f1169I;

    /* renamed from: J */
    public final Handler f1170J;

    /* renamed from: K */
    public final InterfaceC0321h f1171K;

    /* renamed from: L */
    public final C5756s0 f1172L;

    /* renamed from: M */
    public boolean f1173M;

    /* renamed from: N */
    public boolean f1174N;

    /* renamed from: O */
    public C4327q f1175O;

    /* renamed from: P */
    public long f1176P;

    /* renamed from: Q */
    public long f1177Q;

    /* renamed from: R */
    public long f1178R;

    /* renamed from: S */
    public boolean f1179S;

    /* renamed from: y */
    public final C4511b f1180y;

    /* renamed from: z */
    public final C5561i f1181z;

    public C0322i(InterfaceC0321h interfaceC0321h, Looper looper) {
        this(interfaceC0321h, looper, InterfaceC0320g.f1159a);
    }

    /* renamed from: k0 */
    private long m1246k0(long j7) {
        AbstractC5332a.m21802g(j7 != -9223372036854775807L);
        AbstractC5332a.m21802g(this.f1176P != -9223372036854775807L);
        return j7 - this.f1176P;
    }

    /* renamed from: o0 */
    public static boolean m1247o0(C4327q c4327q) {
        return Objects.equals(c4327q.f15138n, "application/x-media3-cues");
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: S */
    public void mo1248S() {
        this.f1175O = null;
        this.f1178R = -9223372036854775807L;
        m1256h0();
        this.f1176P = -9223372036854775807L;
        this.f1177Q = -9223372036854775807L;
        if (this.f1165E != null) {
            m1264r0();
        }
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: V */
    public void mo1249V(long j7, boolean z6) {
        this.f1177Q = j7;
        InterfaceC0314a interfaceC0314a = this.f1161A;
        if (interfaceC0314a != null) {
            interfaceC0314a.clear();
        }
        m1256h0();
        this.f1173M = false;
        this.f1174N = false;
        this.f1178R = -9223372036854775807L;
        C4327q c4327q = this.f1175O;
        if (c4327q == null || m1247o0(c4327q)) {
            return;
        }
        if (this.f1164D != 0) {
            m1267u0();
            return;
        }
        m1263q0();
        InterfaceC4521l interfaceC4521l = (InterfaceC4521l) AbstractC5332a.m21800e(this.f1165E);
        interfaceC4521l.flush();
        interfaceC4521l.mo22058b(m24166O());
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: a */
    public int mo1250a(C4327q c4327q) {
        if (m1247o0(c4327q) || this.f1162B.mo1242a(c4327q)) {
            return AbstractC5705W0.m23918a(c4327q.f15123K == 0 ? 4 : 2);
        }
        return AbstractC4336z.m18425r(c4327q.f15138n) ? AbstractC5705W0.m23918a(1) : AbstractC5705W0.m23918a(0);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: b */
    public boolean mo1251b() {
        return true;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: b0 */
    public void mo1252b0(C4327q[] c4327qArr, long j7, long j8, InterfaceC0120F.b bVar) {
        this.f1176P = j8;
        C4327q c4327q = c4327qArr[0];
        this.f1175O = c4327q;
        if (m1247o0(c4327q)) {
            this.f1161A = this.f1175O.f15120H == 1 ? new C0318e() : new C0319f();
            return;
        }
        m1255g0();
        if (this.f1165E != null) {
            this.f1164D = 1;
        } else {
            m1260m0();
        }
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: c */
    public boolean mo1253c() {
        return this.f1174N;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: g */
    public void mo1254g(long j7, long j8) {
        if (mo23903G()) {
            long j9 = this.f1178R;
            if (j9 != -9223372036854775807L && j7 >= j9) {
                m1263q0();
                this.f1174N = true;
            }
        }
        if (this.f1174N) {
            return;
        }
        if (m1247o0((C4327q) AbstractC5332a.m21800e(this.f1175O))) {
            AbstractC5332a.m21800e(this.f1161A);
            m1265s0(j7);
        } else {
            m1255g0();
            m1266t0(j7);
        }
    }

    /* renamed from: g0 */
    public final void m1255g0() {
        AbstractC5332a.m21803h(this.f1179S || Objects.equals(this.f1175O.f15138n, "application/cea-608") || Objects.equals(this.f1175O.f15138n, "application/x-mp4-cea-608") || Objects.equals(this.f1175O.f15138n, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f1175O.f15138n + " samples (expected application/x-media3-cues).");
    }

    @Override // p292n0.InterfaceC5703V0, p292n0.InterfaceC5707X0
    public String getName() {
        return "TextRenderer";
    }

    /* renamed from: h0 */
    public final void m1256h0() {
        m1269w0(new C4504b(AbstractC3033v.m11050t(), m1246k0(this.f1177Q)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m1261n0((C4504b) message.obj);
        return true;
    }

    /* renamed from: i0 */
    public final long m1257i0(long j7) {
        int mo19221b = this.f1167G.mo19221b(j7);
        if (mo19221b == 0 || this.f1167G.mo19225h() == 0) {
            return this.f1167G.f20085b;
        }
        if (mo19221b != -1) {
            return this.f1167G.mo19223f(mo19221b - 1);
        }
        return this.f1167G.mo19223f(r2.mo19225h() - 1);
    }

    /* renamed from: j0 */
    public final long m1258j0() {
        if (this.f1169I == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC5332a.m21800e(this.f1167G);
        if (this.f1169I >= this.f1167G.mo19225h()) {
            return Long.MAX_VALUE;
        }
        return this.f1167G.mo19223f(this.f1169I);
    }

    /* renamed from: l0 */
    public final void m1259l0(C4522m c4522m) {
        AbstractC5346o.m21863d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f1175O, c4522m);
        m1256h0();
        m1267u0();
    }

    /* renamed from: m0 */
    public final void m1260m0() {
        this.f1163C = true;
        InterfaceC4521l mo1243b = this.f1162B.mo1243b((C4327q) AbstractC5332a.m21800e(this.f1175O));
        this.f1165E = mo1243b;
        mo1243b.mo22058b(m24166O());
    }

    /* renamed from: n0 */
    public final void m1261n0(C4504b c4504b) {
        this.f1171K.mo1244t(c4504b.f16128a);
        this.f1171K.mo1245y(c4504b);
    }

    /* renamed from: p0 */
    public final boolean m1262p0(long j7) {
        if (this.f1173M || m24172d0(this.f1172L, this.f1181z, 0) != -4) {
            return false;
        }
        if (this.f1181z.m23275m()) {
            this.f1173M = true;
            return false;
        }
        this.f1181z.m23291t();
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(this.f1181z.f20077d);
        C4514e m19216a = this.f1180y.m19216a(this.f1181z.f20079f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f1181z.mo19253j();
        return this.f1161A.mo1233c(m19216a, j7);
    }

    /* renamed from: q0 */
    public final void m1263q0() {
        this.f1166F = null;
        this.f1169I = -1;
        AbstractC4526q abstractC4526q = this.f1167G;
        if (abstractC4526q != null) {
            abstractC4526q.mo19242r();
            this.f1167G = null;
        }
        AbstractC4526q abstractC4526q2 = this.f1168H;
        if (abstractC4526q2 != null) {
            abstractC4526q2.mo19242r();
            this.f1168H = null;
        }
    }

    /* renamed from: r0 */
    public final void m1264r0() {
        m1263q0();
        ((InterfaceC4521l) AbstractC5332a.m21800e(this.f1165E)).release();
        this.f1165E = null;
        this.f1164D = 0;
    }

    /* renamed from: s0 */
    public final void m1265s0(long j7) {
        boolean m1262p0 = m1262p0(j7);
        long mo1231a = this.f1161A.mo1231a(this.f1177Q);
        if (mo1231a == Long.MIN_VALUE && this.f1173M && !m1262p0) {
            this.f1174N = true;
        }
        if (mo1231a != Long.MIN_VALUE && mo1231a <= j7) {
            m1262p0 = true;
        }
        if (m1262p0) {
            AbstractC3033v mo1232b = this.f1161A.mo1232b(j7);
            long mo1234d = this.f1161A.mo1234d(j7);
            m1269w0(new C4504b(mo1232b, m1246k0(mo1234d)));
            this.f1161A.mo1235e(mo1234d);
        }
        this.f1177Q = j7;
    }

    /* renamed from: t0 */
    public final void m1266t0(long j7) {
        boolean z6;
        this.f1177Q = j7;
        if (this.f1168H == null) {
            ((InterfaceC4521l) AbstractC5332a.m21800e(this.f1165E)).mo19235c(j7);
            try {
                this.f1168H = (AbstractC4526q) ((InterfaceC4521l) AbstractC5332a.m21800e(this.f1165E)).mo21993a();
            } catch (C4522m e7) {
                m1259l0(e7);
                return;
            }
        }
        if (mo23905e() != 2) {
            return;
        }
        if (this.f1167G != null) {
            long m1258j0 = m1258j0();
            z6 = false;
            while (m1258j0 <= j7) {
                this.f1169I++;
                m1258j0 = m1258j0();
                z6 = true;
            }
        } else {
            z6 = false;
        }
        AbstractC4526q abstractC4526q = this.f1168H;
        if (abstractC4526q != null) {
            if (abstractC4526q.m23275m()) {
                if (!z6 && m1258j0() == Long.MAX_VALUE) {
                    if (this.f1164D == 2) {
                        m1267u0();
                    } else {
                        m1263q0();
                        this.f1174N = true;
                    }
                }
            } else if (abstractC4526q.f20085b <= j7) {
                AbstractC4526q abstractC4526q2 = this.f1167G;
                if (abstractC4526q2 != null) {
                    abstractC4526q2.mo19242r();
                }
                this.f1169I = abstractC4526q.mo19221b(j7);
                this.f1167G = abstractC4526q;
                this.f1168H = null;
                z6 = true;
            }
        }
        if (z6) {
            AbstractC5332a.m21800e(this.f1167G);
            m1269w0(new C4504b(this.f1167G.mo19224g(j7), m1246k0(m1257i0(j7))));
        }
        if (this.f1164D == 2) {
            return;
        }
        while (!this.f1173M) {
            try {
                C4525p c4525p = this.f1166F;
                if (c4525p == null) {
                    c4525p = (C4525p) ((InterfaceC4521l) AbstractC5332a.m21800e(this.f1165E)).mo22059e();
                    if (c4525p == null) {
                        return;
                    } else {
                        this.f1166F = c4525p;
                    }
                }
                if (this.f1164D == 1) {
                    c4525p.m23279q(4);
                    ((InterfaceC4521l) AbstractC5332a.m21800e(this.f1165E)).mo22060f(c4525p);
                    this.f1166F = null;
                    this.f1164D = 2;
                    return;
                }
                int m24172d0 = m24172d0(this.f1172L, c4525p, 0);
                if (m24172d0 == -4) {
                    if (c4525p.m23275m()) {
                        this.f1173M = true;
                        this.f1163C = false;
                    } else {
                        C4327q c4327q = this.f1172L.f20950b;
                        if (c4327q == null) {
                            return;
                        }
                        c4525p.f16168q = c4327q.f15143s;
                        c4525p.m23291t();
                        this.f1163C &= !c4525p.m23277o();
                    }
                    if (!this.f1163C) {
                        ((InterfaceC4521l) AbstractC5332a.m21800e(this.f1165E)).mo22060f(c4525p);
                        this.f1166F = null;
                    }
                } else if (m24172d0 == -3) {
                    return;
                }
            } catch (C4522m e8) {
                m1259l0(e8);
                return;
            }
        }
    }

    /* renamed from: u0 */
    public final void m1267u0() {
        m1264r0();
        m1260m0();
    }

    /* renamed from: v0 */
    public void m1268v0(long j7) {
        AbstractC5332a.m21802g(mo23903G());
        this.f1178R = j7;
    }

    /* renamed from: w0 */
    public final void m1269w0(C4504b c4504b) {
        Handler handler = this.f1170J;
        if (handler != null) {
            handler.obtainMessage(1, c4504b).sendToTarget();
        } else {
            m1261n0(c4504b);
        }
    }

    public C0322i(InterfaceC0321h interfaceC0321h, Looper looper, InterfaceC0320g interfaceC0320g) {
        super(3);
        this.f1171K = (InterfaceC0321h) AbstractC5332a.m21800e(interfaceC0321h);
        this.f1170J = looper == null ? null : AbstractC5330M.m21786z(looper, this);
        this.f1162B = interfaceC0320g;
        this.f1180y = new C4511b();
        this.f1181z = new C5561i(1);
        this.f1172L = new C5756s0();
        this.f1178R = -9223372036854775807L;
        this.f1176P = -9223372036854775807L;
        this.f1177Q = -9223372036854775807L;
        this.f1179S = false;
    }
}
