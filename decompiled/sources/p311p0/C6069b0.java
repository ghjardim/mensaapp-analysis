package p311p0;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p078L0.AbstractC0864W;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4336z;
import p232g0.C4297C;
import p232g0.C4312b;
import p232g0.C4315e;
import p232g0.C4327q;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.AbstractC5349r;
import p284m0.C5561i;
import p292n0.AbstractC5705W0;
import p292n0.C5749p;
import p292n0.C5756s0;
import p292n0.InterfaceC5703V0;
import p292n0.InterfaceC5766x0;
import p311p0.InterfaceC6095x;
import p311p0.InterfaceC6097z;
import p366w0.AbstractC6811I;
import p366w0.AbstractC6837w;
import p366w0.C6830p;
import p366w0.InterfaceC6827m;
import p366w0.InterfaceC6840z;

/* renamed from: p0.b0 */
/* loaded from: classes.dex */
public class C6069b0 extends AbstractC6837w implements InterfaceC5766x0 {

    /* renamed from: O0 */
    public final Context f21673O0;

    /* renamed from: P0 */
    public final InterfaceC6095x.a f21674P0;

    /* renamed from: Q0 */
    public final InterfaceC6097z f21675Q0;

    /* renamed from: R0 */
    public int f21676R0;

    /* renamed from: S0 */
    public boolean f21677S0;

    /* renamed from: T0 */
    public boolean f21678T0;

    /* renamed from: U0 */
    public C4327q f21679U0;

    /* renamed from: V0 */
    public C4327q f21680V0;

    /* renamed from: W0 */
    public long f21681W0;

    /* renamed from: X0 */
    public boolean f21682X0;

    /* renamed from: Y0 */
    public boolean f21683Y0;

    /* renamed from: Z0 */
    public boolean f21684Z0;

    /* renamed from: a1 */
    public int f21685a1;

    /* renamed from: b1 */
    public boolean f21686b1;

    /* renamed from: c1 */
    public long f21687c1;

    /* renamed from: p0.b0$b */
    public static final class b {
        /* renamed from: a */
        public static void m25312a(InterfaceC6097z interfaceC6097z, Object obj) {
            interfaceC6097z.mo25191b((AudioDeviceInfo) obj);
        }
    }

    /* renamed from: p0.b0$c */
    public final class c implements InterfaceC6097z.d {
        public c() {
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: a */
        public void mo25313a(long j7) {
            C6069b0.this.f21674P0.m25420H(j7);
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: b */
        public void mo25314b(InterfaceC6097z.a aVar) {
            C6069b0.this.f21674P0.m25425o(aVar);
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: c */
        public void mo25315c(boolean z6) {
            C6069b0.this.f21674P0.m25421I(z6);
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: d */
        public void mo25316d(Exception exc) {
            AbstractC5346o.m21863d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C6069b0.this.f21674P0.m25424n(exc);
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: e */
        public void mo25317e(InterfaceC6097z.a aVar) {
            C6069b0.this.f21674P0.m25426p(aVar);
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: f */
        public void mo25318f() {
            C6069b0.this.f21684Z0 = true;
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: g */
        public void mo25319g() {
            InterfaceC5703V0.a m28174R0 = C6069b0.this.m28174R0();
            if (m28174R0 != null) {
                m28174R0.mo23916a();
            }
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: h */
        public void mo25320h(int i7, long j7, long j8) {
            C6069b0.this.f21674P0.m25422J(i7, j7, j8);
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: i */
        public void mo25321i() {
            C6069b0.this.m24170X();
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: j */
        public void mo25322j() {
            C6069b0.this.m25307c2();
        }

        @Override // p311p0.InterfaceC6097z.d
        /* renamed from: k */
        public void mo25323k() {
            InterfaceC5703V0.a m28174R0 = C6069b0.this.m28174R0();
            if (m28174R0 != null) {
                m28174R0.mo23917b();
            }
        }
    }

    public C6069b0(Context context, InterfaceC6827m.b bVar, InterfaceC6840z interfaceC6840z, boolean z6, Handler handler, InterfaceC6095x interfaceC6095x, InterfaceC6097z interfaceC6097z) {
        super(1, bVar, interfaceC6840z, z6, 44100.0f);
        this.f21673O0 = context.getApplicationContext();
        this.f21675Q0 = interfaceC6097z;
        this.f21685a1 = -1000;
        this.f21674P0 = new InterfaceC6095x.a(handler, interfaceC6095x);
        this.f21687c1 = -9223372036854775807L;
        interfaceC6097z.mo25226v(new c());
    }

    /* renamed from: U1 */
    public static boolean m25297U1(String str) {
        if (AbstractC5330M.f18800a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC5330M.f18802c)) {
            String str2 = AbstractC5330M.f18801b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V1 */
    public static boolean m25298V1(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    /* renamed from: W1 */
    public static boolean m25299W1() {
        if (AbstractC5330M.f18800a == 23) {
            String str = AbstractC5330M.f18803d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y1 */
    private int m25300Y1(C6830p c6830p, C4327q c4327q) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(c6830p.f24544a) || (i7 = AbstractC5330M.f18800a) >= 24 || (i7 == 23 && AbstractC5330M.m21682F0(this.f21673O0))) {
            return c4327q.f15139o;
        }
        return -1;
    }

    /* renamed from: a2 */
    public static List m25301a2(InterfaceC6840z interfaceC6840z, C4327q c4327q, boolean z6, InterfaceC6097z interfaceC6097z) {
        C6830p m28005x;
        return c4327q.f15138n == null ? AbstractC3033v.m11050t() : (!interfaceC6097z.mo25190a(c4327q) || (m28005x = AbstractC6811I.m28005x()) == null) ? AbstractC6811I.m28003v(interfaceC6840z, c4327q, z6, false) : AbstractC3033v.m11051u(m28005x);
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n, p292n0.C5697S0.b
    /* renamed from: A */
    public void mo2838A(int i7, Object obj) {
        if (i7 == 2) {
            this.f21675Q0.mo25199g(((Float) AbstractC5332a.m21800e(obj)).floatValue());
            return;
        }
        if (i7 == 3) {
            this.f21675Q0.mo25217q((C4312b) AbstractC5332a.m21800e((C4312b) obj));
            return;
        }
        if (i7 == 6) {
            this.f21675Q0.mo25207k((C4315e) AbstractC5332a.m21800e((C4315e) obj));
            return;
        }
        if (i7 == 12) {
            if (AbstractC5330M.f18800a >= 23) {
                b.m25312a(this.f21675Q0, obj);
            }
        } else if (i7 == 16) {
            this.f21685a1 = ((Integer) AbstractC5332a.m21800e(obj)).intValue();
            m25308d2();
        } else if (i7 == 9) {
            this.f21675Q0.mo25177A(((Boolean) AbstractC5332a.m21800e(obj)).booleanValue());
        } else if (i7 != 10) {
            super.mo2838A(i7, obj);
        } else {
            this.f21675Q0.mo25208l(((Integer) AbstractC5332a.m21800e(obj)).intValue());
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: I0 */
    public float mo2850I0(float f7, C4327q c4327q, C4327q[] c4327qArr) {
        int i7 = -1;
        for (C4327q c4327q2 : c4327qArr) {
            int i8 = c4327q2.f15115C;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return f7 * i7;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: J1 */
    public boolean mo25302J1(C4327q c4327q) {
        if (m24163L().f20642a != 0) {
            int m25304X1 = m25304X1(c4327q);
            if ((m25304X1 & 512) != 0) {
                if (m24163L().f20642a == 2 || (m25304X1 & 1024) != 0) {
                    return true;
                }
                if (c4327q.f15117E == 0 && c4327q.f15118F == 0) {
                    return true;
                }
            }
        }
        return this.f21675Q0.mo25190a(c4327q);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: K0 */
    public List mo2853K0(InterfaceC6840z interfaceC6840z, C4327q c4327q, boolean z6) {
        return AbstractC6811I.m28004w(m25301a2(interfaceC6840z, c4327q, z6, this.f21675Q0), c4327q);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: K1 */
    public int mo2854K1(InterfaceC6840z interfaceC6840z, C4327q c4327q) {
        int i7;
        boolean z6;
        if (!AbstractC4336z.m18422o(c4327q.f15138n)) {
            return AbstractC5705W0.m23918a(0);
        }
        int i8 = AbstractC5330M.f18800a >= 21 ? 32 : 0;
        boolean z7 = true;
        boolean z8 = c4327q.f15123K != 0;
        boolean m28140L1 = AbstractC6837w.m28140L1(c4327q);
        if (!m28140L1 || (z8 && AbstractC6811I.m28005x() == null)) {
            i7 = 0;
        } else {
            int m25304X1 = m25304X1(c4327q);
            if (this.f21675Q0.mo25190a(c4327q)) {
                return AbstractC5705W0.m23919b(4, 8, i8, m25304X1);
            }
            i7 = m25304X1;
        }
        if ("audio/raw".equals(c4327q.f15138n) && !this.f21675Q0.mo25190a(c4327q)) {
            return AbstractC5705W0.m23918a(1);
        }
        if (!this.f21675Q0.mo25190a(AbstractC5330M.m21745h0(2, c4327q.f15114B, c4327q.f15115C))) {
            return AbstractC5705W0.m23918a(1);
        }
        List m25301a2 = m25301a2(interfaceC6840z, c4327q, false, this.f21675Q0);
        if (m25301a2.isEmpty()) {
            return AbstractC5705W0.m23918a(1);
        }
        if (!m28140L1) {
            return AbstractC5705W0.m23918a(2);
        }
        C6830p c6830p = (C6830p) m25301a2.get(0);
        boolean m28122m = c6830p.m28122m(c4327q);
        if (!m28122m) {
            for (int i9 = 1; i9 < m25301a2.size(); i9++) {
                C6830p c6830p2 = (C6830p) m25301a2.get(i9);
                if (c6830p2.m28122m(c4327q)) {
                    z6 = false;
                    c6830p = c6830p2;
                    break;
                }
            }
        }
        z6 = true;
        z7 = m28122m;
        return AbstractC5705W0.m23921d(z7 ? 4 : 3, (z7 && c6830p.m28125p(c4327q)) ? 16 : 8, i8, c6830p.f24551h ? 64 : 0, z6 ? 128 : 0, i7);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: L0 */
    public long mo25303L0(boolean z6, long j7, long j8) {
        if (this.f21687c1 == -9223372036854775807L) {
            return super.mo25303L0(z6, j7, j8);
        }
        long j9 = (long) (((r0 - j7) / (mo23946i() != null ? mo23946i().f14768a : 1.0f)) / 2.0f);
        if (this.f21686b1) {
            j9 -= AbstractC5330M.m21692K0(m24162K().mo21613b()) - j8;
        }
        return Math.max(10000L, j9);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: N0 */
    public InterfaceC6827m.a mo2857N0(C6830p c6830p, C4327q c4327q, MediaCrypto mediaCrypto, float f7) {
        this.f21676R0 = m25305Z1(c6830p, c4327q, m24168Q());
        this.f21677S0 = m25297U1(c6830p.f24544a);
        this.f21678T0 = m25298V1(c6830p.f24544a);
        MediaFormat m25306b2 = m25306b2(c4327q, c6830p.f24546c, this.f21676R0, f7);
        this.f21680V0 = (!"audio/raw".equals(c6830p.f24545b) || "audio/raw".equals(c4327q.f15138n)) ? null : c4327q;
        return InterfaceC6827m.a.m28094a(c6830p, m25306b2, c4327q, mediaCrypto);
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: S */
    public void mo1248S() {
        this.f21683Y0 = true;
        this.f21679U0 = null;
        try {
            this.f21675Q0.flush();
            try {
                super.mo1248S();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo1248S();
                throw th;
            } finally {
            }
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: S0 */
    public void mo2859S0(C5561i c5561i) {
        C4327q c4327q;
        if (AbstractC5330M.f18800a < 29 || (c4327q = c5561i.f20075b) == null || !Objects.equals(c4327q.f15138n, "audio/opus") || !m28180Y0()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(c5561i.f20080n);
        int i7 = ((C4327q) AbstractC5332a.m21800e(c5561i.f20075b)).f15117E;
        if (byteBuffer.remaining() == 8) {
            this.f21675Q0.mo25210m(i7, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: T */
    public void mo2860T(boolean z6, boolean z7) {
        super.mo2860T(z6, z7);
        this.f21674P0.m25430t(this.f24576J0);
        if (m24163L().f20643b) {
            this.f21675Q0.mo25228w();
        } else {
            this.f21675Q0.mo25216p();
        }
        this.f21675Q0.mo25224u(m24167P());
        this.f21675Q0.mo25218r(m24162K());
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: V */
    public void mo1249V(long j7, boolean z6) {
        super.mo1249V(j7, z6);
        this.f21675Q0.flush();
        this.f21681W0 = j7;
        this.f21684Z0 = false;
        this.f21682X0 = true;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: W */
    public void mo2863W() {
        this.f21675Q0.release();
    }

    /* renamed from: X1 */
    public final int m25304X1(C4327q c4327q) {
        C6082k mo25229x = this.f21675Q0.mo25229x(c4327q);
        if (!mo25229x.f21742a) {
            return 0;
        }
        int i7 = mo25229x.f21743b ? 1536 : 512;
        return mo25229x.f21744c ? i7 | 2048 : i7;
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: Y */
    public void mo2864Y() {
        this.f21684Z0 = false;
        try {
            super.mo2864Y();
        } finally {
            if (this.f21683Y0) {
                this.f21683Y0 = false;
                this.f21675Q0.reset();
            }
        }
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: Z */
    public void mo2866Z() {
        super.mo2866Z();
        this.f21675Q0.mo25201h();
        this.f21686b1 = true;
    }

    /* renamed from: Z1 */
    public int m25305Z1(C6830p c6830p, C4327q c4327q, C4327q[] c4327qArr) {
        int m25300Y1 = m25300Y1(c6830p, c4327q);
        if (c4327qArr.length == 1) {
            return m25300Y1;
        }
        for (C4327q c4327q2 : c4327qArr) {
            if (c6830p.m28116e(c4327q, c4327q2).f20827d != 0) {
                m25300Y1 = Math.max(m25300Y1, m25300Y1(c6830p, c4327q2));
            }
        }
        return m25300Y1;
    }

    @Override // p366w0.AbstractC6837w, p292n0.AbstractC5745n
    /* renamed from: a0 */
    public void mo2867a0() {
        m25309e2();
        this.f21686b1 = false;
        this.f21675Q0.mo25195e();
        super.mo2867a0();
    }

    @Override // p366w0.AbstractC6837w, p292n0.InterfaceC5703V0
    /* renamed from: b */
    public boolean mo1251b() {
        return this.f21675Q0.mo25205j() || super.mo1251b();
    }

    /* renamed from: b2 */
    public MediaFormat m25306b2(C4327q c4327q, String str, int i7, float f7) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c4327q.f15114B);
        mediaFormat.setInteger("sample-rate", c4327q.f15115C);
        AbstractC5349r.m21884e(mediaFormat, c4327q.f15141q);
        AbstractC5349r.m21883d(mediaFormat, "max-input-size", i7);
        int i8 = AbstractC5330M.f18800a;
        if (i8 >= 23) {
            mediaFormat.setInteger(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, 0);
            if (f7 != -1.0f && !m25299W1()) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (i8 <= 28 && "audio/ac4".equals(c4327q.f15138n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i8 >= 24 && this.f21675Q0.mo25232z(AbstractC5330M.m21745h0(4, c4327q.f15114B, c4327q.f15115C)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f21685a1));
        }
        return mediaFormat;
    }

    @Override // p366w0.AbstractC6837w, p292n0.InterfaceC5703V0
    /* renamed from: c */
    public boolean mo1253c() {
        return super.mo1253c() && this.f21675Q0.mo25192c();
    }

    /* renamed from: c2 */
    public void m25307c2() {
        this.f21682X0 = true;
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: d */
    public void mo23945d(C4297C c4297c) {
        this.f21675Q0.mo25193d(c4297c);
    }

    /* renamed from: d2 */
    public final void m25308d2() {
        InterfaceC6827m m28160E0 = m28160E0();
        if (m28160E0 != null && AbstractC5330M.f18800a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f21685a1));
            m28160E0.mo28016a(bundle);
        }
    }

    /* renamed from: e2 */
    public final void m25309e2() {
        long mo25214o = this.f21675Q0.mo25214o(mo1253c());
        if (mo25214o != Long.MIN_VALUE) {
            if (!this.f21682X0) {
                mo25214o = Math.max(this.f21681W0, mo25214o);
            }
            this.f21681W0 = mo25214o;
            this.f21682X0 = false;
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: g1 */
    public void mo2871g1(Exception exc) {
        AbstractC5346o.m21863d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f21674P0.m25423m(exc);
    }

    @Override // p292n0.InterfaceC5703V0, p292n0.InterfaceC5707X0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: h1 */
    public void mo2872h1(String str, InterfaceC6827m.a aVar, long j7, long j8) {
        this.f21674P0.m25427q(str, j7, j8);
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: i */
    public C4297C mo23946i() {
        return this.f21675Q0.mo25203i();
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: i1 */
    public void mo2874i1(String str) {
        this.f21674P0.m25428r(str);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: j0 */
    public C5749p mo2876j0(C6830p c6830p, C4327q c4327q, C4327q c4327q2) {
        C5749p m28116e = c6830p.m28116e(c4327q, c4327q2);
        int i7 = m28116e.f20828e;
        if (m28181Z0(c4327q2)) {
            i7 |= 32768;
        }
        if (m25300Y1(c6830p, c4327q2) > this.f21676R0) {
            i7 |= 64;
        }
        int i8 = i7;
        return new C5749p(c6830p.f24544a, c4327q, c4327q2, i8 != 0 ? 0 : m28116e.f20827d, i8);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: j1 */
    public C5749p mo2877j1(C5756s0 c5756s0) {
        C4327q c4327q = (C4327q) AbstractC5332a.m21800e(c5756s0.f20950b);
        this.f21679U0 = c4327q;
        C5749p mo2877j1 = super.mo2877j1(c5756s0);
        this.f21674P0.m25431u(c4327q, mo2877j1);
        return mo2877j1;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: k1 */
    public void mo2879k1(C4327q c4327q, MediaFormat mediaFormat) {
        int i7;
        C4327q c4327q2 = this.f21680V0;
        int[] iArr = null;
        if (c4327q2 != null) {
            c4327q = c4327q2;
        } else if (m28160E0() != null) {
            AbstractC5332a.m21800e(mediaFormat);
            C4327q m18234K = new C4327q.b().m18264o0("audio/raw").m18258i0("audio/raw".equals(c4327q.f15138n) ? c4327q.f15116D : (AbstractC5330M.f18800a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC5330M.m21742g0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).m18245V(c4327q.f15117E).m18246W(c4327q.f15118F).m18257h0(c4327q.f15135k).m18243T(c4327q.f15136l).m18250a0(c4327q.f15125a).m18252c0(c4327q.f15126b).m18253d0(c4327q.f15127c).m18254e0(c4327q.f15128d).m18266q0(c4327q.f15129e).m18262m0(c4327q.f15130f).m18237N(mediaFormat.getInteger("channel-count")).m18265p0(mediaFormat.getInteger("sample-rate")).m18234K();
            if (this.f21677S0 && m18234K.f15114B == 6 && (i7 = c4327q.f15114B) < 6) {
                iArr = new int[i7];
                for (int i8 = 0; i8 < c4327q.f15114B; i8++) {
                    iArr[i8] = i8;
                }
            } else if (this.f21678T0) {
                iArr = AbstractC0864W.m3566a(m18234K.f15114B);
            }
            c4327q = m18234K;
        }
        try {
            if (AbstractC5330M.f18800a >= 29) {
                if (!m28180Y0() || m24163L().f20642a == 0) {
                    this.f21675Q0.mo25212n(0);
                } else {
                    this.f21675Q0.mo25212n(m24163L().f20642a);
                }
            }
            this.f21675Q0.mo25178B(c4327q, 0, iArr);
        } catch (InterfaceC6097z.b e7) {
            throw m24160I(e7, e7.f21785a, 5001);
        }
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: l1 */
    public void mo25310l1(long j7) {
        this.f21675Q0.mo25220s(j7);
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: n1 */
    public void mo2885n1() {
        super.mo2885n1();
        this.f21675Q0.mo25222t();
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: r1 */
    public boolean mo2892r1(long j7, long j8, InterfaceC6827m interfaceC6827m, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, C4327q c4327q) {
        AbstractC5332a.m21800e(byteBuffer);
        this.f21687c1 = -9223372036854775807L;
        if (this.f21680V0 != null && (i8 & 2) != 0) {
            ((InterfaceC6827m) AbstractC5332a.m21800e(interfaceC6827m)).mo28025j(i7, false);
            return true;
        }
        if (z6) {
            if (interfaceC6827m != null) {
                interfaceC6827m.mo28025j(i7, false);
            }
            this.f24576J0.f20815f += i9;
            this.f21675Q0.mo25222t();
            return true;
        }
        try {
            if (!this.f21675Q0.mo25231y(byteBuffer, j9, i9)) {
                this.f21687c1 = j9;
                return false;
            }
            if (interfaceC6827m != null) {
                interfaceC6827m.mo28025j(i7, false);
            }
            this.f24576J0.f20814e += i9;
            return true;
        } catch (InterfaceC6097z.c e7) {
            throw m24161J(e7, this.f21679U0, e7.f21787b, (!m28180Y0() || m24163L().f20642a == 0) ? 5001 : 5004);
        } catch (InterfaceC6097z.f e8) {
            throw m24161J(e8, c4327q, e8.f21792b, (!m28180Y0() || m24163L().f20642a == 0) ? 5002 : 5003);
        }
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: u */
    public long mo23947u() {
        if (mo23905e() == 2) {
            m25309e2();
        }
        return this.f21681W0;
    }

    @Override // p366w0.AbstractC6837w
    /* renamed from: w1 */
    public void mo25311w1() {
        try {
            this.f21675Q0.mo25197f();
            if (m28167M0() != -9223372036854775807L) {
                this.f21687c1 = m28167M0();
            }
        } catch (InterfaceC6097z.f e7) {
            throw m24161J(e7, e7.f21793c, e7.f21792b, m28180Y0() ? 5003 : 5002);
        }
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: y */
    public boolean mo23948y() {
        boolean z6 = this.f21684Z0;
        this.f21684Z0 = false;
        return z6;
    }

    @Override // p292n0.AbstractC5745n, p292n0.InterfaceC5703V0
    /* renamed from: H */
    public InterfaceC5766x0 mo23904H() {
        return this;
    }
}
