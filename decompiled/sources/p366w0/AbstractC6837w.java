package p366w0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
import p078L0.AbstractC0853K;
import p232g0.AbstractC4317g;
import p232g0.C4327q;
import p256j$.util.Objects;
import p259j0.AbstractC5323F;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5321D;
import p268k0.AbstractC5400d;
import p284m0.C5561i;
import p284m0.InterfaceC5554b;
import p292n0.AbstractC5745n;
import p292n0.C5747o;
import p292n0.C5749p;
import p292n0.C5756s0;
import p292n0.C5759u;
import p292n0.InterfaceC5703V0;
import p300o0.C5912w1;
import p311p0.C6071c0;
import p335s0.AbstractC6353m;
import p335s0.C6327G;
import p335s0.InterfaceC6354n;
import p366w0.AbstractC6811I;
import p366w0.InterfaceC6827m;

/* renamed from: w0.w */
/* loaded from: classes.dex */
public abstract class AbstractC6837w extends AbstractC5745n {

    /* renamed from: N0 */
    public static final byte[] f24556N0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    public final boolean f24557A;

    /* renamed from: A0 */
    public boolean f24558A0;

    /* renamed from: B */
    public final float f24559B;

    /* renamed from: B0 */
    public boolean f24560B0;

    /* renamed from: C */
    public final C5561i f24561C;

    /* renamed from: C0 */
    public long f24562C0;

    /* renamed from: D */
    public final C5561i f24563D;

    /* renamed from: D0 */
    public long f24564D0;

    /* renamed from: E */
    public final C5561i f24565E;

    /* renamed from: E0 */
    public boolean f24566E0;

    /* renamed from: F */
    public final C6824j f24567F;

    /* renamed from: F0 */
    public boolean f24568F0;

    /* renamed from: G */
    public final MediaCodec.BufferInfo f24569G;

    /* renamed from: G0 */
    public boolean f24570G0;

    /* renamed from: H */
    public final ArrayDeque f24571H;

    /* renamed from: H0 */
    public boolean f24572H0;

    /* renamed from: I */
    public final C6071c0 f24573I;

    /* renamed from: I0 */
    public C5759u f24574I0;

    /* renamed from: J */
    public C4327q f24575J;

    /* renamed from: J0 */
    public C5747o f24576J0;

    /* renamed from: K */
    public C4327q f24577K;

    /* renamed from: K0 */
    public f f24578K0;

    /* renamed from: L */
    public InterfaceC6354n f24579L;

    /* renamed from: L0 */
    public long f24580L0;

    /* renamed from: M */
    public InterfaceC6354n f24581M;

    /* renamed from: M0 */
    public boolean f24582M0;

    /* renamed from: N */
    public InterfaceC5703V0.a f24583N;

    /* renamed from: O */
    public MediaCrypto f24584O;

    /* renamed from: P */
    public long f24585P;

    /* renamed from: Q */
    public float f24586Q;

    /* renamed from: R */
    public float f24587R;

    /* renamed from: S */
    public InterfaceC6827m f24588S;

    /* renamed from: T */
    public C4327q f24589T;

    /* renamed from: U */
    public MediaFormat f24590U;

    /* renamed from: V */
    public boolean f24591V;

    /* renamed from: W */
    public float f24592W;

    /* renamed from: X */
    public ArrayDeque f24593X;

    /* renamed from: Y */
    public d f24594Y;

    /* renamed from: Z */
    public C6830p f24595Z;

    /* renamed from: a0 */
    public int f24596a0;

    /* renamed from: b0 */
    public boolean f24597b0;

    /* renamed from: c0 */
    public boolean f24598c0;

    /* renamed from: d0 */
    public boolean f24599d0;

    /* renamed from: e0 */
    public boolean f24600e0;

    /* renamed from: f0 */
    public boolean f24601f0;

    /* renamed from: g0 */
    public boolean f24602g0;

    /* renamed from: h0 */
    public boolean f24603h0;

    /* renamed from: i0 */
    public boolean f24604i0;

    /* renamed from: j0 */
    public boolean f24605j0;

    /* renamed from: k0 */
    public boolean f24606k0;

    /* renamed from: l0 */
    public boolean f24607l0;

    /* renamed from: m0 */
    public long f24608m0;

    /* renamed from: n0 */
    public int f24609n0;

    /* renamed from: o0 */
    public int f24610o0;

    /* renamed from: p0 */
    public ByteBuffer f24611p0;

    /* renamed from: q0 */
    public boolean f24612q0;

    /* renamed from: r0 */
    public boolean f24613r0;

    /* renamed from: s0 */
    public boolean f24614s0;

    /* renamed from: t0 */
    public boolean f24615t0;

    /* renamed from: u0 */
    public boolean f24616u0;

    /* renamed from: v0 */
    public boolean f24617v0;

    /* renamed from: w0 */
    public int f24618w0;

    /* renamed from: x0 */
    public int f24619x0;

    /* renamed from: y */
    public final InterfaceC6827m.b f24620y;

    /* renamed from: y0 */
    public int f24621y0;

    /* renamed from: z */
    public final InterfaceC6840z f24622z;

    /* renamed from: z0 */
    public boolean f24623z0;

    /* renamed from: w0.w$b */
    public static final class b {
        /* renamed from: a */
        public static boolean m28202a(InterfaceC6827m interfaceC6827m, e eVar) {
            return interfaceC6827m.mo28026k(eVar);
        }
    }

    /* renamed from: w0.w$c */
    public static final class c {
        /* renamed from: a */
        public static void m28203a(InterfaceC6827m.a aVar, C5912w1 c5912w1) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId m24874a = c5912w1.m24874a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = m24874a.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f24536b;
            stringId = m24874a.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* renamed from: w0.w$e */
    public final class e implements InterfaceC6827m.c {
        public e() {
        }

        @Override // p366w0.InterfaceC6827m.c
        /* renamed from: a */
        public void mo28096a() {
            if (AbstractC6837w.this.f24583N != null) {
                AbstractC6837w.this.f24583N.mo23917b();
            }
        }

        @Override // p366w0.InterfaceC6827m.c
        /* renamed from: b */
        public void mo28097b() {
            if (AbstractC6837w.this.f24583N != null) {
                AbstractC6837w.this.f24583N.mo23917b();
            }
        }
    }

    /* renamed from: w0.w$f */
    public static final class f {

        /* renamed from: e */
        public static final f f24630e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a */
        public final long f24631a;

        /* renamed from: b */
        public final long f24632b;

        /* renamed from: c */
        public final long f24633c;

        /* renamed from: d */
        public final C5321D f24634d = new C5321D();

        public f(long j7, long j8, long j9) {
            this.f24631a = j7;
            this.f24632b = j8;
            this.f24633c = j9;
        }
    }

    public AbstractC6837w(int i7, InterfaceC6827m.b bVar, InterfaceC6840z interfaceC6840z, boolean z6, float f7) {
        super(i7);
        this.f24620y = bVar;
        this.f24622z = (InterfaceC6840z) AbstractC5332a.m21800e(interfaceC6840z);
        this.f24557A = z6;
        this.f24559B = f7;
        this.f24561C = C5561i.m23288v();
        this.f24563D = new C5561i(0);
        this.f24565E = new C5561i(2);
        C6824j c6824j = new C6824j();
        this.f24567F = c6824j;
        this.f24569G = new MediaCodec.BufferInfo();
        this.f24586Q = 1.0f;
        this.f24587R = 1.0f;
        this.f24585P = -9223372036854775807L;
        this.f24571H = new ArrayDeque();
        this.f24578K0 = f.f24630e;
        c6824j.m23290s(0);
        c6824j.f20077d.order(ByteOrder.nativeOrder());
        this.f24573I = new C6071c0();
        this.f24592W = -1.0f;
        this.f24596a0 = 0;
        this.f24618w0 = 0;
        this.f24609n0 = -1;
        this.f24610o0 = -1;
        this.f24608m0 = -9223372036854775807L;
        this.f24562C0 = -9223372036854775807L;
        this.f24564D0 = -9223372036854775807L;
        this.f24580L0 = -9223372036854775807L;
        this.f24619x0 = 0;
        this.f24621y0 = 0;
        this.f24576J0 = new C5747o();
    }

    /* renamed from: L1 */
    public static boolean m28140L1(C4327q c4327q) {
        int i7 = c4327q.f15123K;
        return i7 == 0 || i7 == 2;
    }

    /* renamed from: b1 */
    public static boolean m28141b1(IllegalStateException illegalStateException) {
        if (AbstractC5330M.f18800a >= 21 && m28142c1(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    /* renamed from: c1 */
    public static boolean m28142c1(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: d1 */
    public static boolean m28143d1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* renamed from: l0 */
    public static boolean m28145l0(String str, C4327q c4327q) {
        return AbstractC5330M.f18800a < 21 && c4327q.f15141q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: m0 */
    public static boolean m28146m0(String str) {
        if (AbstractC5330M.f18800a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(AbstractC5330M.f18802c)) {
            String str2 = AbstractC5330M.f18801b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n0 */
    public static boolean m28147n0(String str) {
        int i7 = AbstractC5330M.f18800a;
        if (i7 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i7 == 19) {
                String str2 = AbstractC5330M.f18801b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: o0 */
    public static boolean m28148o0(String str) {
        return AbstractC5330M.f18800a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: p0 */
    public static boolean m28149p0(C6830p c6830p) {
        String str = c6830p.f24544a;
        int i7 = AbstractC5330M.f18800a;
        return (i7 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i7 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(AbstractC5330M.f18802c) && "AFTS".equals(AbstractC5330M.f18803d) && c6830p.f24550g);
    }

    /* renamed from: q0 */
    public static boolean m28150q0(String str) {
        return AbstractC5330M.f18800a == 19 && AbstractC5330M.f18803d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
    }

    /* renamed from: r0 */
    public static boolean m28151r0(String str) {
        return AbstractC5330M.f18800a == 29 && "c2.android.aac.decoder".equals(str);
    }

    @Override // p292n0.AbstractC5745n, p292n0.C5697S0.b
    /* renamed from: A */
    public void mo2838A(int i7, Object obj) {
        if (i7 == 11) {
            this.f24583N = (InterfaceC5703V0.a) obj;
        } else {
            super.mo2838A(i7, obj);
        }
    }

    /* renamed from: A0 */
    public final void m28152A0() {
        try {
            ((InterfaceC6827m) AbstractC5332a.m21804i(this.f24588S)).flush();
        } finally {
            mo2902x1();
        }
    }

    /* renamed from: A1 */
    public final void m28153A1() {
        this.f24610o0 = -1;
        this.f24611p0 = null;
    }

    /* renamed from: B0 */
    public final boolean m28154B0() {
        boolean m28156C0 = m28156C0();
        if (m28156C0) {
            m28183e1();
        }
        return m28156C0;
    }

    /* renamed from: B1 */
    public final void m28155B1(InterfaceC6354n interfaceC6354n) {
        AbstractC6353m.m26630a(this.f24579L, interfaceC6354n);
        this.f24579L = interfaceC6354n;
    }

    /* renamed from: C0 */
    public boolean m28156C0() {
        if (this.f24588S == null) {
            return false;
        }
        int i7 = this.f24621y0;
        if (i7 == 3 || this.f24598c0 || ((this.f24599d0 && !this.f24560B0) || (this.f24600e0 && this.f24558A0))) {
            m28195v1();
            return true;
        }
        if (i7 == 2) {
            int i8 = AbstractC5330M.f18800a;
            AbstractC5332a.m21802g(i8 >= 23);
            if (i8 >= 23) {
                try {
                    m28169N1();
                } catch (C5759u e7) {
                    AbstractC5346o.m21868i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    m28195v1();
                    return true;
                }
            }
        }
        m28152A0();
        return false;
    }

    /* renamed from: C1 */
    public final void m28157C1(f fVar) {
        this.f24578K0 = fVar;
        long j7 = fVar.f24633c;
        if (j7 != -9223372036854775807L) {
            this.f24582M0 = true;
            mo25310l1(j7);
        }
    }

    /* renamed from: D0 */
    public final List m28158D0(boolean z6) {
        C4327q c4327q = (C4327q) AbstractC5332a.m21800e(this.f24575J);
        List mo2853K0 = mo2853K0(this.f24622z, c4327q, z6);
        if (mo2853K0.isEmpty() && z6) {
            mo2853K0 = mo2853K0(this.f24622z, c4327q, false);
            if (!mo2853K0.isEmpty()) {
                AbstractC5346o.m21867h("MediaCodecRenderer", "Drm session requires secure decoder for " + c4327q.f15138n + ", but no secure decoder available. Trying to proceed with " + mo2853K0 + ".");
            }
        }
        return mo2853K0;
    }

    /* renamed from: D1 */
    public final void m28159D1() {
        this.f24572H0 = true;
    }

    /* renamed from: E0 */
    public final InterfaceC6827m m28160E0() {
        return this.f24588S;
    }

    /* renamed from: E1 */
    public final void m28161E1(C5759u c5759u) {
        this.f24574I0 = c5759u;
    }

    /* renamed from: F0 */
    public int mo2844F0(C5561i c5561i) {
        return 0;
    }

    /* renamed from: F1 */
    public final void m28162F1(InterfaceC6354n interfaceC6354n) {
        AbstractC6353m.m26630a(this.f24581M, interfaceC6354n);
        this.f24581M = interfaceC6354n;
    }

    /* renamed from: G0 */
    public final C6830p m28163G0() {
        return this.f24595Z;
    }

    /* renamed from: G1 */
    public final boolean m28164G1(long j7) {
        return this.f24585P == -9223372036854775807L || m24162K().mo21613b() - j7 < this.f24585P;
    }

    /* renamed from: H0 */
    public boolean mo2847H0() {
        return false;
    }

    /* renamed from: H1 */
    public boolean mo2848H1(C6830p c6830p) {
        return true;
    }

    /* renamed from: I0 */
    public abstract float mo2850I0(float f7, C4327q c4327q, C4327q[] c4327qArr);

    /* renamed from: I1 */
    public boolean m28165I1() {
        return false;
    }

    /* renamed from: J0 */
    public final MediaFormat m28166J0() {
        return this.f24590U;
    }

    /* renamed from: J1 */
    public boolean mo25302J1(C4327q c4327q) {
        return false;
    }

    /* renamed from: K0 */
    public abstract List mo2853K0(InterfaceC6840z interfaceC6840z, C4327q c4327q, boolean z6);

    /* renamed from: K1 */
    public abstract int mo2854K1(InterfaceC6840z interfaceC6840z, C4327q c4327q);

    /* renamed from: L0 */
    public long mo25303L0(boolean z6, long j7, long j8) {
        return super.mo23910p(j7, j8);
    }

    /* renamed from: M0 */
    public long m28167M0() {
        return this.f24564D0;
    }

    /* renamed from: M1 */
    public final boolean m28168M1(C4327q c4327q) {
        if (AbstractC5330M.f18800a >= 23 && this.f24588S != null && this.f24621y0 != 3 && mo23905e() != 0) {
            float mo2850I0 = mo2850I0(this.f24587R, (C4327q) AbstractC5332a.m21800e(c4327q), m24168Q());
            float f7 = this.f24592W;
            if (f7 == mo2850I0) {
                return true;
            }
            if (mo2850I0 == -1.0f) {
                m28194v0();
                return false;
            }
            if (f7 == -1.0f && mo2850I0 <= this.f24559B) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", mo2850I0);
            ((InterfaceC6827m) AbstractC5332a.m21800e(this.f24588S)).mo28016a(bundle);
            this.f24592W = mo2850I0;
        }
        return true;
    }

    /* renamed from: N0 */
    public abstract InterfaceC6827m.a mo2857N0(C6830p c6830p, C4327q c4327q, MediaCrypto mediaCrypto, float f7);

    /* renamed from: N1 */
    public final void m28169N1() {
        InterfaceC5554b mo26502i = ((InterfaceC6354n) AbstractC5332a.m21800e(this.f24581M)).mo26502i();
        if (mo26502i instanceof C6327G) {
            try {
                ((MediaCrypto) AbstractC5332a.m21800e(this.f24584O)).setMediaDrmSession(((C6327G) mo26502i).f22894b);
            } catch (MediaCryptoException e7) {
                throw m24160I(e7, this.f24575J, 6006);
            }
        }
        m28155B1(this.f24581M);
        this.f24619x0 = 0;
        this.f24621y0 = 0;
    }

    /* renamed from: O0 */
    public final long m28170O0() {
        return this.f24578K0.f24633c;
    }

    /* renamed from: O1 */
    public final void m28171O1(long j7) {
        C4327q c4327q = (C4327q) this.f24578K0.f24634d.m21644i(j7);
        if (c4327q == null && this.f24582M0 && this.f24590U != null) {
            c4327q = (C4327q) this.f24578K0.f24634d.m21643h();
        }
        if (c4327q != null) {
            this.f24577K = c4327q;
        } else if (!this.f24591V || this.f24577K == null) {
            return;
        }
        mo2879k1((C4327q) AbstractC5332a.m21800e(this.f24577K), this.f24590U);
        this.f24591V = false;
        this.f24582M0 = false;
    }

    /* renamed from: P0 */
    public final long m28172P0() {
        return this.f24578K0.f24632b;
    }

    /* renamed from: Q0 */
    public float m28173Q0() {
        return this.f24586Q;
    }

    /* renamed from: R0 */
    public final InterfaceC5703V0.a m28174R0() {
        return this.f24583N;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: S */
    public void mo1248S() {
        this.f24575J = null;
        m28157C1(f.f24630e);
        this.f24571H.clear();
        m28156C0();
    }

    /* renamed from: S0 */
    public abstract void mo2859S0(C5561i c5561i);

    @Override // p292n0.AbstractC5745n
    /* renamed from: T */
    public void mo2860T(boolean z6, boolean z7) {
        this.f24576J0 = new C5747o();
    }

    /* renamed from: T0 */
    public final boolean m28175T0() {
        return this.f24610o0 >= 0;
    }

    /* renamed from: U0 */
    public final boolean m28176U0() {
        if (!this.f24567F.m28087C()) {
            return true;
        }
        long m24166O = m24166O();
        return m28182a1(m24166O, this.f24567F.m28085A()) == m28182a1(m24166O, this.f24565E.f20079f);
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: V */
    public void mo1249V(long j7, boolean z6) {
        this.f24566E0 = false;
        this.f24568F0 = false;
        this.f24572H0 = false;
        if (this.f24614s0) {
            this.f24567F.mo19253j();
            this.f24565E.mo19253j();
            this.f24615t0 = false;
            this.f24573I.m25328d();
        } else {
            m28154B0();
        }
        if (this.f24578K0.f24634d.m21646k() > 0) {
            this.f24570G0 = true;
        }
        this.f24578K0.f24634d.m21639c();
        this.f24571H.clear();
    }

    /* renamed from: V0 */
    public final void m28177V0(C4327q c4327q) {
        m28190t0();
        String str = c4327q.f15138n;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f24567F.m28088D(32);
        } else {
            this.f24567F.m28088D(1);
        }
        this.f24614s0 = true;
    }

    /* renamed from: W0 */
    public final void m28178W0(C6830p c6830p, MediaCrypto mediaCrypto) {
        C4327q c4327q = (C4327q) AbstractC5332a.m21800e(this.f24575J);
        String str = c6830p.f24544a;
        int i7 = AbstractC5330M.f18800a;
        float mo2850I0 = i7 < 23 ? -1.0f : mo2850I0(this.f24587R, c4327q, m24168Q());
        float f7 = mo2850I0 > this.f24559B ? mo2850I0 : -1.0f;
        mo2889p1(c4327q);
        long mo21613b = m24162K().mo21613b();
        InterfaceC6827m.a mo2857N0 = mo2857N0(c6830p, c4327q, mediaCrypto, f7);
        if (i7 >= 31) {
            c.m28203a(mo2857N0, m24167P());
        }
        try {
            AbstractC5323F.m21659a("createCodec:" + str);
            InterfaceC6827m mo28031a = this.f24620y.mo28031a(mo2857N0);
            this.f24588S = mo28031a;
            this.f24607l0 = i7 >= 21 && b.m28202a(mo28031a, new e());
            AbstractC5323F.m21660b();
            long mo21613b2 = m24162K().mo21613b();
            if (!c6830p.m28122m(c4327q)) {
                AbstractC5346o.m21867h("MediaCodecRenderer", AbstractC5330M.m21685H("Format exceeds selected codec's capabilities [%s, %s]", C4327q.m18192g(c4327q), str));
            }
            this.f24595Z = c6830p;
            this.f24592W = f7;
            this.f24589T = c4327q;
            this.f24596a0 = m28187k0(str);
            this.f24597b0 = m28145l0(str, (C4327q) AbstractC5332a.m21800e(this.f24589T));
            this.f24598c0 = m28150q0(str);
            this.f24599d0 = m28151r0(str);
            this.f24600e0 = m28147n0(str);
            this.f24601f0 = m28148o0(str);
            this.f24602g0 = m28146m0(str);
            this.f24603h0 = false;
            this.f24606k0 = m28149p0(c6830p) || mo2847H0();
            if (((InterfaceC6827m) AbstractC5332a.m21800e(this.f24588S)).mo28019d()) {
                this.f24617v0 = true;
                this.f24618w0 = 1;
                this.f24604i0 = this.f24596a0 != 0;
            }
            if (mo23905e() == 2) {
                this.f24608m0 = m24162K().mo21613b() + 1000;
            }
            this.f24576J0.f20810a++;
            mo2872h1(str, mo2857N0, mo21613b2, mo21613b2 - mo21613b);
        } catch (Throwable th) {
            AbstractC5323F.m21660b();
            throw th;
        }
    }

    /* renamed from: X0 */
    public final boolean m28179X0() {
        AbstractC5332a.m21802g(this.f24584O == null);
        InterfaceC6354n interfaceC6354n = this.f24579L;
        InterfaceC5554b mo26502i = interfaceC6354n.mo26502i();
        if (C6327G.f22892d && (mo26502i instanceof C6327G)) {
            int mo26498e = interfaceC6354n.mo26498e();
            if (mo26498e == 1) {
                InterfaceC6354n.a aVar = (InterfaceC6354n.a) AbstractC5332a.m21800e(interfaceC6354n.mo26494a());
                throw m24160I(aVar, this.f24575J, aVar.f22998a);
            }
            if (mo26498e != 4) {
                return false;
            }
        }
        if (mo26502i == null) {
            return interfaceC6354n.mo26494a() != null;
        }
        if (mo26502i instanceof C6327G) {
            C6327G c6327g = (C6327G) mo26502i;
            try {
                this.f24584O = new MediaCrypto(c6327g.f22893a, c6327g.f22894b);
            } catch (MediaCryptoException e7) {
                throw m24160I(e7, this.f24575J, 6006);
            }
        }
        return true;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: Y */
    public void mo2864Y() {
        try {
            m28190t0();
            m28195v1();
        } finally {
            m28162F1(null);
        }
    }

    /* renamed from: Y0 */
    public final boolean m28180Y0() {
        return this.f24614s0;
    }

    /* renamed from: Z0 */
    public final boolean m28181Z0(C4327q c4327q) {
        return this.f24581M == null && mo25302J1(c4327q);
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: a */
    public final int mo1250a(C4327q c4327q) {
        try {
            return mo2854K1(this.f24622z, c4327q);
        } catch (AbstractC6811I.c e7) {
            throw m24160I(e7, c4327q, 4002);
        }
    }

    /* renamed from: a1 */
    public final boolean m28182a1(long j7, long j8) {
        C4327q c4327q;
        return j8 < j7 && !((c4327q = this.f24577K) != null && Objects.equals(c4327q.f15138n, "audio/opus") && AbstractC0853K.m3548g(j7, j8));
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: b */
    public boolean mo1251b() {
        return this.f24575J != null && (m24169R() || m28175T0() || (this.f24608m0 != -9223372036854775807L && m24162K().mo21613b() < this.f24608m0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // p292n0.AbstractC5745n
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1252b0(p232g0.C4327q[] r13, long r14, long r16, p022D0.InterfaceC0120F.b r18) {
        /*
            r12 = this;
            r0 = r12
            w0.w$f r1 = r0.f24578K0
            long r1 = r1.f24633c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            w0.w$f r1 = new w0.w$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m28157C1(r1)
            goto L65
        L20:
            java.util.ArrayDeque r1 = r0.f24571H
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.f24562C0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.f24580L0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            w0.w$f r1 = new w0.w$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m28157C1(r1)
            w0.w$f r1 = r0.f24578K0
            long r1 = r1.f24633c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.mo2885n1()
            goto L65
        L55:
            java.util.ArrayDeque r1 = r0.f24571H
            w0.w$f r9 = new w0.w$f
            long r3 = r0.f24562C0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p366w0.AbstractC6837w.mo1252b0(g0.q[], long, long, D0.F$b):void");
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: c */
    public boolean mo1253c() {
        return this.f24568F0;
    }

    /* renamed from: e1 */
    public final void m28183e1() {
        C4327q c4327q;
        if (this.f24588S != null || this.f24614s0 || (c4327q = this.f24575J) == null) {
            return;
        }
        if (m28181Z0(c4327q)) {
            m28177V0(c4327q);
            return;
        }
        m28155B1(this.f24581M);
        if (this.f24579L == null || m28179X0()) {
            try {
                InterfaceC6354n interfaceC6354n = this.f24579L;
                m28184f1(this.f24584O, interfaceC6354n != null && interfaceC6354n.mo26501h((String) AbstractC5332a.m21804i(c4327q.f15138n)));
            } catch (d e7) {
                throw m24160I(e7, c4327q, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.f24584O;
        if (mediaCrypto == null || this.f24588S != null) {
            return;
        }
        mediaCrypto.release();
        this.f24584O = null;
    }

    /* renamed from: f1 */
    public final void m28184f1(MediaCrypto mediaCrypto, boolean z6) {
        C4327q c4327q = (C4327q) AbstractC5332a.m21800e(this.f24575J);
        if (this.f24593X == null) {
            try {
                List m28158D0 = m28158D0(z6);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f24593X = arrayDeque;
                if (this.f24557A) {
                    arrayDeque.addAll(m28158D0);
                } else if (!m28158D0.isEmpty()) {
                    this.f24593X.add((C6830p) m28158D0.get(0));
                }
                this.f24594Y = null;
            } catch (AbstractC6811I.c e7) {
                throw new d(c4327q, e7, z6, -49998);
            }
        }
        if (this.f24593X.isEmpty()) {
            throw new d(c4327q, (Throwable) null, z6, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) AbstractC5332a.m21800e(this.f24593X);
        while (this.f24588S == null) {
            C6830p c6830p = (C6830p) AbstractC5332a.m21800e((C6830p) arrayDeque2.peekFirst());
            if (!mo2848H1(c6830p)) {
                return;
            }
            try {
                m28178W0(c6830p, mediaCrypto);
            } catch (Exception e8) {
                AbstractC5346o.m21868i("MediaCodecRenderer", "Failed to initialize decoder: " + c6830p, e8);
                arrayDeque2.removeFirst();
                d dVar = new d(c4327q, e8, z6, c6830p);
                mo2871g1(dVar);
                if (this.f24594Y == null) {
                    this.f24594Y = dVar;
                } else {
                    this.f24594Y = this.f24594Y.m28207c(dVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f24594Y;
                }
            }
        }
        this.f24593X = null;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: g */
    public void mo1254g(long j7, long j8) {
        boolean z6 = false;
        if (this.f24572H0) {
            this.f24572H0 = false;
            m28188q1();
        }
        C5759u c5759u = this.f24574I0;
        if (c5759u != null) {
            this.f24574I0 = null;
            throw c5759u;
        }
        try {
            if (this.f24568F0) {
                mo25311w1();
                return;
            }
            if (this.f24575J != null || m28191t1(2)) {
                m28183e1();
                if (this.f24614s0) {
                    AbstractC5323F.m21659a("bypassRender");
                    while (m28186i0(j7, j8)) {
                    }
                    AbstractC5323F.m21660b();
                } else if (this.f24588S != null) {
                    long mo21613b = m24162K().mo21613b();
                    AbstractC5323F.m21659a("drainAndFeed");
                    while (m28197x0(j7, j8) && m28164G1(mo21613b)) {
                    }
                    while (m28200z0() && m28164G1(mo21613b)) {
                    }
                    AbstractC5323F.m21660b();
                } else {
                    this.f24576J0.f20813d += m24174f0(j7);
                    m28191t1(1);
                }
                this.f24576J0.m24177c();
            }
        } catch (IllegalStateException e7) {
            if (!m28141b1(e7)) {
                throw e7;
            }
            mo2871g1(e7);
            if (AbstractC5330M.f18800a >= 21 && m28143d1(e7)) {
                z6 = true;
            }
            if (z6) {
                m28195v1();
            }
            C6829o mo2894s0 = mo2894s0(e7, m28163G0());
            throw m24161J(mo2894s0, this.f24575J, z6, mo2894s0.f24543c == 1101 ? 4006 : 4003);
        }
    }

    /* renamed from: g1 */
    public abstract void mo2871g1(Exception exc);

    /* renamed from: h0 */
    public final void m28185h0() {
        AbstractC5332a.m21802g(!this.f24566E0);
        C5756s0 m24164M = m24164M();
        this.f24565E.mo19253j();
        do {
            this.f24565E.mo19253j();
            int m24172d0 = m24172d0(m24164M, this.f24565E, 0);
            if (m24172d0 == -5) {
                mo2877j1(m24164M);
                return;
            }
            if (m24172d0 == -4) {
                if (!this.f24565E.m23275m()) {
                    this.f24562C0 = Math.max(this.f24562C0, this.f24565E.f20079f);
                    if (mo23909o() || this.f24563D.m23278p()) {
                        this.f24564D0 = this.f24562C0;
                    }
                    if (this.f24570G0) {
                        C4327q c4327q = (C4327q) AbstractC5332a.m21800e(this.f24575J);
                        this.f24577K = c4327q;
                        if (Objects.equals(c4327q.f15138n, "audio/opus") && !this.f24577K.f15141q.isEmpty()) {
                            this.f24577K = ((C4327q) AbstractC5332a.m21800e(this.f24577K)).m18193a().m18245V(AbstractC0853K.m3547f((byte[]) this.f24577K.f15141q.get(0))).m18234K();
                        }
                        mo2879k1(this.f24577K, null);
                        this.f24570G0 = false;
                    }
                    this.f24565E.m23291t();
                    C4327q c4327q2 = this.f24577K;
                    if (c4327q2 != null && Objects.equals(c4327q2.f15138n, "audio/opus")) {
                        if (this.f24565E.m23274l()) {
                            C5561i c5561i = this.f24565E;
                            c5561i.f20075b = this.f24577K;
                            mo2859S0(c5561i);
                        }
                        if (AbstractC0853K.m3548g(m24166O(), this.f24565E.f20079f)) {
                            this.f24573I.m25325a(this.f24565E, ((C4327q) AbstractC5332a.m21800e(this.f24577K)).f15141q);
                        }
                    }
                    if (!m28176U0()) {
                        break;
                    }
                } else {
                    this.f24566E0 = true;
                    this.f24564D0 = this.f24562C0;
                    return;
                }
            } else {
                if (m24172d0 != -3) {
                    throw new IllegalStateException();
                }
                if (mo23909o()) {
                    this.f24564D0 = this.f24562C0;
                    return;
                }
                return;
            }
        } while (this.f24567F.m28089x(this.f24565E));
        this.f24615t0 = true;
    }

    /* renamed from: h1 */
    public abstract void mo2872h1(String str, InterfaceC6827m.a aVar, long j7, long j8);

    /* renamed from: i0 */
    public final boolean m28186i0(long j7, long j8) {
        boolean z6;
        AbstractC5332a.m21802g(!this.f24568F0);
        if (this.f24567F.m28087C()) {
            C6824j c6824j = this.f24567F;
            if (!mo2892r1(j7, j8, null, c6824j.f20077d, this.f24610o0, 0, c6824j.m28086B(), this.f24567F.m28091z(), m28182a1(m24166O(), this.f24567F.m28085A()), this.f24567F.m23275m(), (C4327q) AbstractC5332a.m21800e(this.f24577K))) {
                return false;
            }
            mo2883m1(this.f24567F.m28085A());
            this.f24567F.mo19253j();
            z6 = false;
        } else {
            z6 = false;
        }
        if (this.f24566E0) {
            this.f24568F0 = true;
            return z6;
        }
        if (this.f24615t0) {
            AbstractC5332a.m21802g(this.f24567F.m28089x(this.f24565E));
            this.f24615t0 = z6;
        }
        if (this.f24616u0) {
            if (this.f24567F.m28087C()) {
                return true;
            }
            m28190t0();
            this.f24616u0 = z6;
            m28183e1();
            if (!this.f24614s0) {
                return z6;
            }
        }
        m28185h0();
        if (this.f24567F.m28087C()) {
            this.f24567F.m23291t();
        }
        if (this.f24567F.m28087C() || this.f24566E0 || this.f24616u0) {
            return true;
        }
        return z6;
    }

    /* renamed from: i1 */
    public abstract void mo2874i1(String str);

    /* renamed from: j0 */
    public abstract C5749p mo2876j0(C6830p c6830p, C4327q c4327q, C4327q c4327q2);

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (m28196w0() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
    
        if (m28196w0() == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* renamed from: j1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p292n0.C5749p mo2877j1(p292n0.C5756s0 r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p366w0.AbstractC6837w.mo2877j1(n0.s0):n0.p");
    }

    /* renamed from: k0 */
    public final int m28187k0(String str) {
        int i7 = AbstractC5330M.f18800a;
        if (i7 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = AbstractC5330M.f18803d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i7 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = AbstractC5330M.f18801b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* renamed from: k1 */
    public abstract void mo2879k1(C4327q c4327q, MediaFormat mediaFormat);

    /* renamed from: m1 */
    public void mo2883m1(long j7) {
        this.f24580L0 = j7;
        while (!this.f24571H.isEmpty() && j7 >= ((f) this.f24571H.peek()).f24631a) {
            m28157C1((f) AbstractC5332a.m21800e((f) this.f24571H.poll()));
            mo2885n1();
        }
    }

    @Override // p292n0.AbstractC5745n, p292n0.InterfaceC5703V0
    /* renamed from: p */
    public final long mo23910p(long j7, long j8) {
        return mo25303L0(this.f24607l0, j7, j8);
    }

    /* renamed from: q1 */
    public final void m28188q1() {
        int i7 = this.f24621y0;
        if (i7 == 1) {
            m28152A0();
            return;
        }
        if (i7 == 2) {
            m28152A0();
            m28169N1();
        } else if (i7 == 3) {
            m28193u1();
        } else {
            this.f24568F0 = true;
            mo25311w1();
        }
    }

    /* renamed from: r1 */
    public abstract boolean mo2892r1(long j7, long j8, InterfaceC6827m interfaceC6827m, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, C4327q c4327q);

    /* renamed from: s0 */
    public C6829o mo2894s0(Throwable th, C6830p c6830p) {
        return new C6829o(th, c6830p);
    }

    /* renamed from: s1 */
    public final void m28189s1() {
        this.f24560B0 = true;
        MediaFormat mo28020e = ((InterfaceC6827m) AbstractC5332a.m21800e(this.f24588S)).mo28020e();
        if (this.f24596a0 != 0 && mo28020e.getInteger("width") == 32 && mo28020e.getInteger("height") == 32) {
            this.f24605j0 = true;
            return;
        }
        if (this.f24603h0) {
            mo28020e.setInteger("channel-count", 1);
        }
        this.f24590U = mo28020e;
        this.f24591V = true;
    }

    /* renamed from: t0 */
    public final void m28190t0() {
        this.f24616u0 = false;
        this.f24567F.mo19253j();
        this.f24565E.mo19253j();
        this.f24615t0 = false;
        this.f24614s0 = false;
        this.f24573I.m25328d();
    }

    /* renamed from: t1 */
    public final boolean m28191t1(int i7) {
        C5756s0 m24164M = m24164M();
        this.f24561C.mo19253j();
        int m24172d0 = m24172d0(m24164M, this.f24561C, i7 | 4);
        if (m24172d0 == -5) {
            mo2877j1(m24164M);
            return true;
        }
        if (m24172d0 != -4 || !this.f24561C.m23275m()) {
            return false;
        }
        this.f24566E0 = true;
        m28188q1();
        return false;
    }

    /* renamed from: u0 */
    public final boolean m28192u0() {
        if (this.f24623z0) {
            this.f24619x0 = 1;
            if (this.f24598c0 || this.f24600e0) {
                this.f24621y0 = 3;
                return false;
            }
            this.f24621y0 = 1;
        }
        return true;
    }

    /* renamed from: u1 */
    public final void m28193u1() {
        m28195v1();
        m28183e1();
    }

    @Override // p292n0.AbstractC5745n, p292n0.InterfaceC5703V0
    /* renamed from: v */
    public void mo2898v(float f7, float f8) {
        this.f24586Q = f7;
        this.f24587R = f8;
        m28168M1(this.f24589T);
    }

    /* renamed from: v0 */
    public final void m28194v0() {
        if (!this.f24623z0) {
            m28193u1();
        } else {
            this.f24619x0 = 1;
            this.f24621y0 = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v1 */
    public void m28195v1() {
        try {
            InterfaceC6827m interfaceC6827m = this.f24588S;
            if (interfaceC6827m != null) {
                interfaceC6827m.release();
                this.f24576J0.f20811b++;
                mo2874i1(((C6830p) AbstractC5332a.m21800e(this.f24595Z)).f24544a);
            }
            this.f24588S = null;
            try {
                MediaCrypto mediaCrypto = this.f24584O;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f24588S = null;
            try {
                MediaCrypto mediaCrypto2 = this.f24584O;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: w0 */
    public final boolean m28196w0() {
        if (this.f24623z0) {
            this.f24619x0 = 1;
            if (this.f24598c0 || this.f24600e0) {
                this.f24621y0 = 3;
                return false;
            }
            this.f24621y0 = 2;
        } else {
            m28169N1();
        }
        return true;
    }

    /* renamed from: x0 */
    public final boolean m28197x0(long j7, long j8) {
        boolean z6;
        boolean mo2892r1;
        ByteBuffer byteBuffer;
        int i7;
        MediaCodec.BufferInfo bufferInfo;
        int mo28024i;
        InterfaceC6827m interfaceC6827m = (InterfaceC6827m) AbstractC5332a.m21800e(this.f24588S);
        if (!m28175T0()) {
            if (this.f24601f0 && this.f24558A0) {
                try {
                    mo28024i = interfaceC6827m.mo28024i(this.f24569G);
                } catch (IllegalStateException unused) {
                    m28188q1();
                    if (this.f24568F0) {
                        m28195v1();
                    }
                    return false;
                }
            } else {
                mo28024i = interfaceC6827m.mo28024i(this.f24569G);
            }
            if (mo28024i < 0) {
                if (mo28024i == -2) {
                    m28189s1();
                    return true;
                }
                if (this.f24606k0 && (this.f24566E0 || this.f24619x0 == 2)) {
                    m28188q1();
                }
                return false;
            }
            if (this.f24605j0) {
                this.f24605j0 = false;
                interfaceC6827m.mo28025j(mo28024i, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f24569G;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m28188q1();
                return false;
            }
            this.f24610o0 = mo28024i;
            ByteBuffer mo28030o = interfaceC6827m.mo28030o(mo28024i);
            this.f24611p0 = mo28030o;
            if (mo28030o != null) {
                mo28030o.position(this.f24569G.offset);
                ByteBuffer byteBuffer2 = this.f24611p0;
                MediaCodec.BufferInfo bufferInfo3 = this.f24569G;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.f24602g0) {
                MediaCodec.BufferInfo bufferInfo4 = this.f24569G;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0 && this.f24562C0 != -9223372036854775807L) {
                    bufferInfo4.presentationTimeUs = this.f24564D0;
                }
            }
            this.f24612q0 = this.f24569G.presentationTimeUs < m24166O();
            long j9 = this.f24564D0;
            this.f24613r0 = j9 != -9223372036854775807L && j9 <= this.f24569G.presentationTimeUs;
            m28171O1(this.f24569G.presentationTimeUs);
        }
        if (this.f24601f0 && this.f24558A0) {
            try {
                byteBuffer = this.f24611p0;
                i7 = this.f24610o0;
                bufferInfo = this.f24569G;
                z6 = false;
            } catch (IllegalStateException unused2) {
                z6 = false;
            }
            try {
                mo2892r1 = mo2892r1(j7, j8, interfaceC6827m, byteBuffer, i7, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f24612q0, this.f24613r0, (C4327q) AbstractC5332a.m21800e(this.f24577K));
            } catch (IllegalStateException unused3) {
                m28188q1();
                if (this.f24568F0) {
                    m28195v1();
                }
                return z6;
            }
        } else {
            z6 = false;
            ByteBuffer byteBuffer3 = this.f24611p0;
            int i8 = this.f24610o0;
            MediaCodec.BufferInfo bufferInfo5 = this.f24569G;
            mo2892r1 = mo2892r1(j7, j8, interfaceC6827m, byteBuffer3, i8, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f24612q0, this.f24613r0, (C4327q) AbstractC5332a.m21800e(this.f24577K));
        }
        if (mo2892r1) {
            mo2883m1(this.f24569G.presentationTimeUs);
            boolean z7 = (this.f24569G.flags & 4) != 0 ? true : z6;
            m28153A1();
            if (!z7) {
                return true;
            }
            m28188q1();
        }
        return z6;
    }

    /* renamed from: x1 */
    public void mo2902x1() {
        m28201z1();
        m28153A1();
        this.f24608m0 = -9223372036854775807L;
        this.f24558A0 = false;
        this.f24623z0 = false;
        this.f24604i0 = false;
        this.f24605j0 = false;
        this.f24612q0 = false;
        this.f24613r0 = false;
        this.f24562C0 = -9223372036854775807L;
        this.f24564D0 = -9223372036854775807L;
        this.f24580L0 = -9223372036854775807L;
        this.f24619x0 = 0;
        this.f24621y0 = 0;
        this.f24618w0 = this.f24617v0 ? 1 : 0;
    }

    /* renamed from: y0 */
    public final boolean m28198y0(C6830p c6830p, C4327q c4327q, InterfaceC6354n interfaceC6354n, InterfaceC6354n interfaceC6354n2) {
        InterfaceC5554b mo26502i;
        InterfaceC5554b mo26502i2;
        if (interfaceC6354n == interfaceC6354n2) {
            return false;
        }
        if (interfaceC6354n2 != null && interfaceC6354n != null && (mo26502i = interfaceC6354n2.mo26502i()) != null && (mo26502i2 = interfaceC6354n.mo26502i()) != null && mo26502i.getClass().equals(mo26502i2.getClass())) {
            if (!(mo26502i instanceof C6327G)) {
                return false;
            }
            if (!interfaceC6354n2.mo26495b().equals(interfaceC6354n.mo26495b()) || AbstractC5330M.f18800a < 23) {
                return true;
            }
            UUID uuid = AbstractC4317g.f15031e;
            if (!uuid.equals(interfaceC6354n.mo26495b()) && !uuid.equals(interfaceC6354n2.mo26495b())) {
                return !c6830p.f24550g && interfaceC6354n2.mo26501h((String) AbstractC5332a.m21800e(c4327q.f15138n));
            }
        }
        return true;
    }

    /* renamed from: y1 */
    public void m28199y1() {
        mo2902x1();
        this.f24574I0 = null;
        this.f24593X = null;
        this.f24595Z = null;
        this.f24589T = null;
        this.f24590U = null;
        this.f24591V = false;
        this.f24560B0 = false;
        this.f24592W = -1.0f;
        this.f24596a0 = 0;
        this.f24597b0 = false;
        this.f24598c0 = false;
        this.f24599d0 = false;
        this.f24600e0 = false;
        this.f24601f0 = false;
        this.f24602g0 = false;
        this.f24603h0 = false;
        this.f24606k0 = false;
        this.f24607l0 = false;
        this.f24617v0 = false;
        this.f24618w0 = 0;
    }

    @Override // p292n0.AbstractC5745n, p292n0.InterfaceC5707X0
    /* renamed from: z */
    public final int mo23931z() {
        return 8;
    }

    /* renamed from: z0 */
    public final boolean m28200z0() {
        int i7;
        if (this.f24588S == null || (i7 = this.f24619x0) == 2 || this.f24566E0) {
            return false;
        }
        if (i7 == 0 && m28165I1()) {
            m28194v0();
        }
        InterfaceC6827m interfaceC6827m = (InterfaceC6827m) AbstractC5332a.m21800e(this.f24588S);
        if (this.f24609n0 < 0) {
            int mo28023h = interfaceC6827m.mo28023h();
            this.f24609n0 = mo28023h;
            if (mo28023h < 0) {
                return false;
            }
            this.f24563D.f20077d = interfaceC6827m.mo28028m(mo28023h);
            this.f24563D.mo19253j();
        }
        if (this.f24619x0 == 1) {
            if (!this.f24606k0) {
                this.f24558A0 = true;
                interfaceC6827m.mo28018c(this.f24609n0, 0, 0, 0L, 4);
                m28201z1();
            }
            this.f24619x0 = 2;
            return false;
        }
        if (this.f24604i0) {
            this.f24604i0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(this.f24563D.f20077d);
            byte[] bArr = f24556N0;
            byteBuffer.put(bArr);
            interfaceC6827m.mo28018c(this.f24609n0, 0, bArr.length, 0L, 0);
            m28201z1();
            this.f24623z0 = true;
            return true;
        }
        if (this.f24618w0 == 1) {
            for (int i8 = 0; i8 < ((C4327q) AbstractC5332a.m21800e(this.f24589T)).f15141q.size(); i8++) {
                ((ByteBuffer) AbstractC5332a.m21800e(this.f24563D.f20077d)).put((byte[]) this.f24589T.f15141q.get(i8));
            }
            this.f24618w0 = 2;
        }
        int position = ((ByteBuffer) AbstractC5332a.m21800e(this.f24563D.f20077d)).position();
        C5756s0 m24164M = m24164M();
        try {
            int m24172d0 = m24172d0(m24164M, this.f24563D, 0);
            if (m24172d0 == -3) {
                if (mo23909o()) {
                    this.f24564D0 = this.f24562C0;
                }
                return false;
            }
            if (m24172d0 == -5) {
                if (this.f24618w0 == 2) {
                    this.f24563D.mo19253j();
                    this.f24618w0 = 1;
                }
                mo2877j1(m24164M);
                return true;
            }
            if (this.f24563D.m23275m()) {
                this.f24564D0 = this.f24562C0;
                if (this.f24618w0 == 2) {
                    this.f24563D.mo19253j();
                    this.f24618w0 = 1;
                }
                this.f24566E0 = true;
                if (!this.f24623z0) {
                    m28188q1();
                    return false;
                }
                try {
                    if (!this.f24606k0) {
                        this.f24558A0 = true;
                        interfaceC6827m.mo28018c(this.f24609n0, 0, 0, 0L, 4);
                        m28201z1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e7) {
                    throw m24160I(e7, this.f24575J, AbstractC5330M.m21719Y(e7.getErrorCode()));
                }
            }
            if (!this.f24623z0 && !this.f24563D.m23277o()) {
                this.f24563D.mo19253j();
                if (this.f24618w0 == 2) {
                    this.f24618w0 = 1;
                }
                return true;
            }
            boolean m23292u = this.f24563D.m23292u();
            if (m23292u) {
                this.f24563D.f20076c.m23281b(position);
            }
            if (this.f24597b0 && !m23292u) {
                AbstractC5400d.m22317b((ByteBuffer) AbstractC5332a.m21800e(this.f24563D.f20077d));
                if (((ByteBuffer) AbstractC5332a.m21800e(this.f24563D.f20077d)).position() == 0) {
                    return true;
                }
                this.f24597b0 = false;
            }
            long j7 = this.f24563D.f20079f;
            if (this.f24570G0) {
                if (this.f24571H.isEmpty()) {
                    this.f24578K0.f24634d.m21637a(j7, (C4327q) AbstractC5332a.m21800e(this.f24575J));
                } else {
                    ((f) this.f24571H.peekLast()).f24634d.m21637a(j7, (C4327q) AbstractC5332a.m21800e(this.f24575J));
                }
                this.f24570G0 = false;
            }
            this.f24562C0 = Math.max(this.f24562C0, j7);
            if (mo23909o() || this.f24563D.m23278p()) {
                this.f24564D0 = this.f24562C0;
            }
            this.f24563D.m23291t();
            if (this.f24563D.m23274l()) {
                mo2859S0(this.f24563D);
            }
            mo2887o1(this.f24563D);
            int mo2844F0 = mo2844F0(this.f24563D);
            try {
                if (m23292u) {
                    ((InterfaceC6827m) AbstractC5332a.m21800e(interfaceC6827m)).mo28017b(this.f24609n0, 0, this.f24563D.f20076c, j7, mo2844F0);
                } else {
                    ((InterfaceC6827m) AbstractC5332a.m21800e(interfaceC6827m)).mo28018c(this.f24609n0, 0, ((ByteBuffer) AbstractC5332a.m21800e(this.f24563D.f20077d)).limit(), j7, mo2844F0);
                }
                m28201z1();
                this.f24623z0 = true;
                this.f24618w0 = 0;
                this.f24576J0.f20812c++;
                return true;
            } catch (MediaCodec.CryptoException e8) {
                throw m24160I(e8, this.f24575J, AbstractC5330M.m21719Y(e8.getErrorCode()));
            }
        } catch (C5561i.a e9) {
            mo2871g1(e9);
            m28191t1(0);
            m28152A0();
            return true;
        }
    }

    /* renamed from: z1 */
    public final void m28201z1() {
        this.f24609n0 = -1;
        this.f24563D.f20077d = null;
    }

    /* renamed from: w0.w$d */
    public static class d extends Exception {

        /* renamed from: a */
        public final String f24624a;

        /* renamed from: b */
        public final boolean f24625b;

        /* renamed from: c */
        public final C6830p f24626c;

        /* renamed from: d */
        public final String f24627d;

        /* renamed from: e */
        public final d f24628e;

        public d(C4327q c4327q, Throwable th, boolean z6, int i7) {
            this("Decoder init failed: [" + i7 + "], " + c4327q, th, c4327q.f15138n, z6, null, m28205b(i7), null);
        }

        /* renamed from: b */
        public static String m28205b(int i7) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : StringUtils.EMPTY) + Math.abs(i7);
        }

        /* renamed from: d */
        public static String m28206d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: c */
        public final d m28207c(d dVar) {
            return new d(getMessage(), getCause(), this.f24624a, this.f24625b, this.f24626c, this.f24627d, dVar);
        }

        public d(C4327q c4327q, Throwable th, boolean z6, C6830p c6830p) {
            this("Decoder init failed: " + c6830p.f24544a + ", " + c4327q, th, c4327q.f15138n, z6, c6830p, AbstractC5330M.f18800a >= 21 ? m28206d(th) : null, null);
        }

        public d(String str, Throwable th, String str2, boolean z6, C6830p c6830p, String str3, d dVar) {
            super(str, th);
            this.f24624a = str2;
            this.f24625b = z6;
            this.f24626c = c6830p;
            this.f24627d = str3;
            this.f24628e = dVar;
        }
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: Z */
    public void mo2866Z() {
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: a0 */
    public void mo2867a0() {
    }

    /* renamed from: n1 */
    public void mo2885n1() {
    }

    /* renamed from: w1 */
    public void mo25311w1() {
    }

    /* renamed from: l1 */
    public void mo25310l1(long j7) {
    }

    /* renamed from: o1 */
    public void mo2887o1(C5561i c5561i) {
    }

    /* renamed from: p1 */
    public void mo2889p1(C4327q c4327q) {
    }
}
