package p311p0;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.InterfaceC5334c;

/* renamed from: p0.B */
/* loaded from: classes.dex */
public final class C6042B {

    /* renamed from: A */
    public long f21499A;

    /* renamed from: B */
    public long f21500B;

    /* renamed from: C */
    public long f21501C;

    /* renamed from: D */
    public long f21502D;

    /* renamed from: E */
    public boolean f21503E;

    /* renamed from: F */
    public long f21504F;

    /* renamed from: G */
    public long f21505G;

    /* renamed from: H */
    public boolean f21506H;

    /* renamed from: I */
    public long f21507I;

    /* renamed from: J */
    public InterfaceC5334c f21508J;

    /* renamed from: a */
    public final a f21509a;

    /* renamed from: b */
    public final long[] f21510b;

    /* renamed from: c */
    public AudioTrack f21511c;

    /* renamed from: d */
    public int f21512d;

    /* renamed from: e */
    public int f21513e;

    /* renamed from: f */
    public C6041A f21514f;

    /* renamed from: g */
    public int f21515g;

    /* renamed from: h */
    public boolean f21516h;

    /* renamed from: i */
    public long f21517i;

    /* renamed from: j */
    public float f21518j;

    /* renamed from: k */
    public boolean f21519k;

    /* renamed from: l */
    public long f21520l;

    /* renamed from: m */
    public long f21521m;

    /* renamed from: n */
    public Method f21522n;

    /* renamed from: o */
    public long f21523o;

    /* renamed from: p */
    public boolean f21524p;

    /* renamed from: q */
    public boolean f21525q;

    /* renamed from: r */
    public long f21526r;

    /* renamed from: s */
    public long f21527s;

    /* renamed from: t */
    public long f21528t;

    /* renamed from: u */
    public long f21529u;

    /* renamed from: v */
    public long f21530v;

    /* renamed from: w */
    public int f21531w;

    /* renamed from: x */
    public int f21532x;

    /* renamed from: y */
    public long f21533y;

    /* renamed from: z */
    public long f21534z;

    /* renamed from: p0.B$a */
    public interface a {
        /* renamed from: a */
        void mo25141a(long j7);

        /* renamed from: b */
        void mo25142b(int i7, long j7);

        /* renamed from: c */
        void mo25143c(long j7);

        /* renamed from: d */
        void mo25144d(long j7, long j8, long j9, long j10);

        /* renamed from: e */
        void mo25145e(long j7, long j8, long j9, long j10);
    }

    public C6042B(a aVar) {
        this.f21509a = (a) AbstractC5332a.m21800e(aVar);
        try {
            this.f21522n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f21510b = new long[10];
        this.f21508J = InterfaceC5334c.f18817a;
    }

    /* renamed from: o */
    public static boolean m25118o(int i7) {
        return AbstractC5330M.f18800a < 23 && (i7 == 5 || i7 == 6);
    }

    /* renamed from: a */
    public void m25119a() {
        this.f21506H = true;
        C6041A c6041a = this.f21514f;
        if (c6041a != null) {
            c6041a.m25106b();
        }
    }

    /* renamed from: b */
    public final boolean m25120b() {
        return this.f21516h && ((AudioTrack) AbstractC5332a.m21800e(this.f21511c)).getPlayState() == 2 && m25123e() == 0;
    }

    /* renamed from: c */
    public int m25121c(long j7) {
        return this.f21513e - ((int) (j7 - (m25123e() * this.f21512d)));
    }

    /* renamed from: d */
    public long m25122d(boolean z6) {
        long m25124f;
        if (((AudioTrack) AbstractC5332a.m21800e(this.f21511c)).getPlayState() == 3) {
            m25131m();
        }
        long mo21614c = this.f21508J.mo21614c() / 1000;
        C6041A c6041a = (C6041A) AbstractC5332a.m21800e(this.f21514f);
        boolean m25109e = c6041a.m25109e();
        if (m25109e) {
            m25124f = AbstractC5330M.m21716W0(c6041a.m25107c(), this.f21515g) + AbstractC5330M.m21736e0(mo21614c - c6041a.m25108d(), this.f21518j);
        } else {
            m25124f = this.f21532x == 0 ? m25124f() : AbstractC5330M.m21736e0(this.f21520l + mo21614c, this.f21518j);
            if (!z6) {
                m25124f = Math.max(0L, m25124f - this.f21523o);
            }
        }
        if (this.f21503E != m25109e) {
            this.f21505G = this.f21502D;
            this.f21504F = this.f21501C;
        }
        long j7 = mo21614c - this.f21505G;
        if (j7 < 1000000) {
            long m21736e0 = this.f21504F + AbstractC5330M.m21736e0(j7, this.f21518j);
            long j8 = (j7 * 1000) / 1000000;
            m25124f = ((m25124f * j8) + ((1000 - j8) * m21736e0)) / 1000;
        }
        if (!this.f21519k) {
            long j9 = this.f21501C;
            if (m25124f > j9) {
                this.f21519k = true;
                this.f21509a.mo25141a(this.f21508J.mo21612a() - AbstractC5330M.m21758l1(AbstractC5330M.m21751j0(AbstractC5330M.m21758l1(m25124f - j9), this.f21518j)));
            }
        }
        this.f21502D = mo21614c;
        this.f21501C = m25124f;
        this.f21503E = m25109e;
        return m25124f;
    }

    /* renamed from: e */
    public final long m25123e() {
        long mo21613b = this.f21508J.mo21613b();
        if (this.f21533y != -9223372036854775807L) {
            if (((AudioTrack) AbstractC5332a.m21800e(this.f21511c)).getPlayState() == 2) {
                return this.f21499A;
            }
            return Math.min(this.f21500B, this.f21499A + AbstractC5330M.m21681F(AbstractC5330M.m21736e0(AbstractC5330M.m21692K0(mo21613b) - this.f21533y, this.f21518j), this.f21515g));
        }
        if (mo21613b - this.f21527s >= 5) {
            m25140w(mo21613b);
            this.f21527s = mo21613b;
        }
        return this.f21528t + this.f21507I + (this.f21529u << 32);
    }

    /* renamed from: f */
    public final long m25124f() {
        return AbstractC5330M.m21716W0(m25123e(), this.f21515g);
    }

    /* renamed from: g */
    public void m25125g(long j7) {
        this.f21499A = m25123e();
        this.f21533y = AbstractC5330M.m21692K0(this.f21508J.mo21613b());
        this.f21500B = j7;
    }

    /* renamed from: h */
    public boolean m25126h(long j7) {
        return j7 > AbstractC5330M.m21681F(m25122d(false), this.f21515g) || m25120b();
    }

    /* renamed from: i */
    public boolean m25127i() {
        return ((AudioTrack) AbstractC5332a.m21800e(this.f21511c)).getPlayState() == 3;
    }

    /* renamed from: j */
    public boolean m25128j(long j7) {
        return this.f21534z != -9223372036854775807L && j7 > 0 && this.f21508J.mo21613b() - this.f21534z >= 200;
    }

    /* renamed from: k */
    public boolean m25129k(long j7) {
        int playState = ((AudioTrack) AbstractC5332a.m21800e(this.f21511c)).getPlayState();
        if (this.f21516h) {
            if (playState == 2) {
                this.f21524p = false;
                return false;
            }
            if (playState == 1 && m25123e() == 0) {
                return false;
            }
        }
        boolean z6 = this.f21524p;
        boolean m25126h = m25126h(j7);
        this.f21524p = m25126h;
        if (z6 && !m25126h && playState != 1) {
            this.f21509a.mo25142b(this.f21513e, AbstractC5330M.m21758l1(this.f21517i));
        }
        return true;
    }

    /* renamed from: l */
    public final void m25130l(long j7) {
        C6041A c6041a = (C6041A) AbstractC5332a.m21800e(this.f21514f);
        if (c6041a.m25110f(j7)) {
            long m25108d = c6041a.m25108d();
            long m25107c = c6041a.m25107c();
            long m25124f = m25124f();
            if (Math.abs(m25108d - j7) > 5000000) {
                this.f21509a.mo25145e(m25107c, m25108d, j7, m25124f);
                c6041a.m25111g();
            } else if (Math.abs(AbstractC5330M.m21716W0(m25107c, this.f21515g) - m25124f) <= 5000000) {
                c6041a.m25105a();
            } else {
                this.f21509a.mo25144d(m25107c, m25108d, j7, m25124f);
                c6041a.m25111g();
            }
        }
    }

    /* renamed from: m */
    public final void m25131m() {
        long mo21614c = this.f21508J.mo21614c() / 1000;
        if (mo21614c - this.f21521m >= 30000) {
            long m25124f = m25124f();
            if (m25124f != 0) {
                this.f21510b[this.f21531w] = AbstractC5330M.m21751j0(m25124f, this.f21518j) - mo21614c;
                this.f21531w = (this.f21531w + 1) % 10;
                int i7 = this.f21532x;
                if (i7 < 10) {
                    this.f21532x = i7 + 1;
                }
                this.f21521m = mo21614c;
                this.f21520l = 0L;
                int i8 = 0;
                while (true) {
                    int i9 = this.f21532x;
                    if (i8 >= i9) {
                        break;
                    }
                    this.f21520l += this.f21510b[i8] / i9;
                    i8++;
                }
            } else {
                return;
            }
        }
        if (this.f21516h) {
            return;
        }
        m25130l(mo21614c);
        m25132n(mo21614c);
    }

    /* renamed from: n */
    public final void m25132n(long j7) {
        Method method;
        if (!this.f21525q || (method = this.f21522n) == null || j7 - this.f21526r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) AbstractC5330M.m21747i((Integer) method.invoke(AbstractC5332a.m21800e(this.f21511c), null))).intValue() * 1000) - this.f21517i;
            this.f21523o = intValue;
            long max = Math.max(intValue, 0L);
            this.f21523o = max;
            if (max > 5000000) {
                this.f21509a.mo25143c(max);
                this.f21523o = 0L;
            }
        } catch (Exception unused) {
            this.f21522n = null;
        }
        this.f21526r = j7;
    }

    /* renamed from: p */
    public boolean m25133p() {
        m25135r();
        if (this.f21533y == -9223372036854775807L) {
            ((C6041A) AbstractC5332a.m21800e(this.f21514f)).m25112h();
            return true;
        }
        this.f21499A = m25123e();
        return false;
    }

    /* renamed from: q */
    public void m25134q() {
        m25135r();
        this.f21511c = null;
        this.f21514f = null;
    }

    /* renamed from: r */
    public final void m25135r() {
        this.f21520l = 0L;
        this.f21532x = 0;
        this.f21531w = 0;
        this.f21521m = 0L;
        this.f21502D = 0L;
        this.f21505G = 0L;
        this.f21519k = false;
    }

    /* renamed from: s */
    public void m25136s(AudioTrack audioTrack, boolean z6, int i7, int i8, int i9) {
        this.f21511c = audioTrack;
        this.f21512d = i8;
        this.f21513e = i9;
        this.f21514f = new C6041A(audioTrack);
        this.f21515g = audioTrack.getSampleRate();
        this.f21516h = z6 && m25118o(i7);
        boolean m21674B0 = AbstractC5330M.m21674B0(i7);
        this.f21525q = m21674B0;
        this.f21517i = m21674B0 ? AbstractC5330M.m21716W0(i9 / i8, this.f21515g) : -9223372036854775807L;
        this.f21528t = 0L;
        this.f21529u = 0L;
        this.f21506H = false;
        this.f21507I = 0L;
        this.f21530v = 0L;
        this.f21524p = false;
        this.f21533y = -9223372036854775807L;
        this.f21534z = -9223372036854775807L;
        this.f21526r = 0L;
        this.f21523o = 0L;
        this.f21518j = 1.0f;
    }

    /* renamed from: t */
    public void m25137t(float f7) {
        this.f21518j = f7;
        C6041A c6041a = this.f21514f;
        if (c6041a != null) {
            c6041a.m25112h();
        }
        m25135r();
    }

    /* renamed from: u */
    public void m25138u(InterfaceC5334c interfaceC5334c) {
        this.f21508J = interfaceC5334c;
    }

    /* renamed from: v */
    public void m25139v() {
        if (this.f21533y != -9223372036854775807L) {
            this.f21533y = AbstractC5330M.m21692K0(this.f21508J.mo21613b());
        }
        ((C6041A) AbstractC5332a.m21800e(this.f21514f)).m25112h();
    }

    /* renamed from: w */
    public final void m25140w(long j7) {
        int playState = ((AudioTrack) AbstractC5332a.m21800e(this.f21511c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.f21516h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f21530v = this.f21528t;
            }
            playbackHeadPosition += this.f21530v;
        }
        if (AbstractC5330M.f18800a <= 29) {
            if (playbackHeadPosition == 0 && this.f21528t > 0 && playState == 3) {
                if (this.f21534z == -9223372036854775807L) {
                    this.f21534z = j7;
                    return;
                }
                return;
            }
            this.f21534z = -9223372036854775807L;
        }
        long j8 = this.f21528t;
        if (j8 > playbackHeadPosition) {
            if (this.f21506H) {
                this.f21507I += j8;
                this.f21506H = false;
            } else {
                this.f21529u++;
            }
        }
        this.f21528t = playbackHeadPosition;
    }
}
