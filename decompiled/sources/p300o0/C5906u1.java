package p300o0;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p022D0.C0116B;
import p022D0.C0179y;
import p022D0.InterfaceC0120F;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4296B;
import p232g0.AbstractC4303I;
import p232g0.AbstractC4317g;
import p232g0.C4295A;
import p232g0.C4297C;
import p232g0.C4306L;
import p232g0.C4310P;
import p232g0.C4312b;
import p232g0.C4322l;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.C4331u;
import p232g0.C4333w;
import p232g0.C4334x;
import p232g0.InterfaceC4298D;
import p248i0.C4504b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5351t;
import p276l0.C5502p;
import p276l0.C5504r;
import p276l0.C5505s;
import p276l0.C5506t;
import p276l0.C5512z;
import p292n0.C5747o;
import p292n0.C5749p;
import p292n0.C5759u;
import p300o0.InterfaceC5850c;
import p300o0.InterfaceC5909v1;
import p311p0.InterfaceC6097z;
import p335s0.C6339T;
import p335s0.C6348h;
import p335s0.InterfaceC6354n;
import p366w0.AbstractC6837w;
import p366w0.C6829o;

/* renamed from: o0.u1 */
/* loaded from: classes.dex */
public final class C5906u1 implements InterfaceC5850c, InterfaceC5909v1.a {

    /* renamed from: A */
    public boolean f21275A;

    /* renamed from: a */
    public final Context f21276a;

    /* renamed from: b */
    public final InterfaceC5909v1 f21277b;

    /* renamed from: c */
    public final PlaybackSession f21278c;

    /* renamed from: i */
    public String f21284i;

    /* renamed from: j */
    public PlaybackMetrics.Builder f21285j;

    /* renamed from: k */
    public int f21286k;

    /* renamed from: n */
    public AbstractC4296B f21289n;

    /* renamed from: o */
    public b f21290o;

    /* renamed from: p */
    public b f21291p;

    /* renamed from: q */
    public b f21292q;

    /* renamed from: r */
    public C4327q f21293r;

    /* renamed from: s */
    public C4327q f21294s;

    /* renamed from: t */
    public C4327q f21295t;

    /* renamed from: u */
    public boolean f21296u;

    /* renamed from: v */
    public int f21297v;

    /* renamed from: w */
    public boolean f21298w;

    /* renamed from: x */
    public int f21299x;

    /* renamed from: y */
    public int f21300y;

    /* renamed from: z */
    public int f21301z;

    /* renamed from: e */
    public final AbstractC4303I.c f21280e = new AbstractC4303I.c();

    /* renamed from: f */
    public final AbstractC4303I.b f21281f = new AbstractC4303I.b();

    /* renamed from: h */
    public final HashMap f21283h = new HashMap();

    /* renamed from: g */
    public final HashMap f21282g = new HashMap();

    /* renamed from: d */
    public final long f21279d = SystemClock.elapsedRealtime();

    /* renamed from: l */
    public int f21287l = 0;

    /* renamed from: m */
    public int f21288m = 0;

    /* renamed from: o0.u1$a */
    public static final class a {

        /* renamed from: a */
        public final int f21302a;

        /* renamed from: b */
        public final int f21303b;

        public a(int i7, int i8) {
            this.f21302a = i7;
            this.f21303b = i8;
        }
    }

    /* renamed from: o0.u1$b */
    public static final class b {

        /* renamed from: a */
        public final C4327q f21304a;

        /* renamed from: b */
        public final int f21305b;

        /* renamed from: c */
        public final String f21306c;

        public b(C4327q c4327q, int i7, String str) {
            this.f21304a = c4327q;
            this.f21305b = i7;
            this.f21306c = str;
        }
    }

    public C5906u1(Context context, PlaybackSession playbackSession) {
        this.f21276a = context.getApplicationContext();
        this.f21278c = playbackSession;
        C5899s0 c5899s0 = new C5899s0();
        this.f21277b = c5899s0;
        c5899s0.mo24818c(this);
    }

    /* renamed from: A0 */
    public static a m24844A0(AbstractC4296B abstractC4296B, Context context, boolean z6) {
        int i7;
        boolean z7;
        if (abstractC4296B.f14762a == 1001) {
            return new a(20, 0);
        }
        if (abstractC4296B instanceof C5759u) {
            C5759u c5759u = (C5759u) abstractC4296B;
            z7 = c5759u.f20965q == 1;
            i7 = c5759u.f20969u;
        } else {
            i7 = 0;
            z7 = false;
        }
        Throwable th = (Throwable) AbstractC5332a.m21800e(abstractC4296B.getCause());
        if (!(th instanceof IOException)) {
            if (z7 && (i7 == 0 || i7 == 1)) {
                return new a(35, 0);
            }
            if (z7 && i7 == 3) {
                return new a(15, 0);
            }
            if (z7 && i7 == 2) {
                return new a(23, 0);
            }
            if (th instanceof AbstractC6837w.d) {
                return new a(13, AbstractC5330M.m21721Z(((AbstractC6837w.d) th).f24627d));
            }
            if (th instanceof C6829o) {
                return new a(14, ((C6829o) th).f24543c);
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof InterfaceC6097z.c) {
                return new a(17, ((InterfaceC6097z.c) th).f21786a);
            }
            if (th instanceof InterfaceC6097z.f) {
                return new a(18, ((InterfaceC6097z.f) th).f21791a);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(m24850x0(errorCode), errorCode);
        }
        if (th instanceof C5506t) {
            return new a(5, ((C5506t) th).f19849d);
        }
        if ((th instanceof C5505s) || (th instanceof C4295A)) {
            return new a(z6 ? 10 : 11, 0);
        }
        boolean z8 = th instanceof C5504r;
        if (z8 || (th instanceof C5512z.a)) {
            if (C5351t.m21888d(context).m21891f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z8 && ((C5504r) th).f19847c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (abstractC4296B.f14762a == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof InterfaceC6354n.a)) {
            if (!(th instanceof C5502p.b) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) AbstractC5332a.m21800e(th.getCause())).getCause();
            return (AbstractC5330M.f18800a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) AbstractC5332a.m21800e(th.getCause());
        int i8 = AbstractC5330M.f18800a;
        if (i8 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i8 < 23 || !(th2 instanceof MediaDrmResetException)) ? th2 instanceof NotProvisionedException ? new a(24, 0) : th2 instanceof DeniedByServerException ? new a(29, 0) : th2 instanceof C6339T ? new a(23, 0) : th2 instanceof C6348h.e ? new a(28, 0) : new a(30, 0) : new a(27, 0);
        }
        int m21721Z = AbstractC5330M.m21721Z(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new a(m24850x0(m21721Z), m21721Z);
    }

    /* renamed from: B0 */
    public static Pair m24845B0(String str) {
        String[] m21737e1 = AbstractC5330M.m21737e1(str, "-");
        return Pair.create(m21737e1[0], m21737e1.length >= 2 ? m21737e1[1] : null);
    }

    /* renamed from: D0 */
    public static int m24846D0(Context context) {
        switch (C5351t.m21888d(context).m21891f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    /* renamed from: E0 */
    public static int m24847E0(C4331u c4331u) {
        C4331u.h hVar = c4331u.f15212b;
        if (hVar == null) {
            return 0;
        }
        int m21779v0 = AbstractC5330M.m21779v0(hVar.f15304a, hVar.f15305b);
        if (m21779v0 == 0) {
            return 3;
        }
        if (m21779v0 != 1) {
            return m21779v0 != 2 ? 1 : 4;
        }
        return 5;
    }

    /* renamed from: F0 */
    public static int m24848F0(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: v0 */
    public static C5906u1 m24849v0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager m24656a = AbstractC5885n1.m24656a(context.getSystemService("media_metrics"));
        if (m24656a == null) {
            return null;
        }
        createPlaybackSession = m24656a.createPlaybackSession();
        return new C5906u1(context, createPlaybackSession);
    }

    /* renamed from: x0 */
    public static int m24850x0(int i7) {
        switch (AbstractC5330M.m21719Y(i7)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: y0 */
    public static C4323m m24851y0(AbstractC3033v abstractC3033v) {
        C4323m c4323m;
        AbstractC3010Y it = abstractC3033v.iterator();
        while (it.hasNext()) {
            C4306L.a aVar = (C4306L.a) it.next();
            for (int i7 = 0; i7 < aVar.f14961a; i7++) {
                if (aVar.m18106d(i7) && (c4323m = aVar.m18103a(i7).f15142r) != null) {
                    return c4323m;
                }
            }
        }
        return null;
    }

    /* renamed from: z0 */
    public static int m24852z0(C4323m c4323m) {
        for (int i7 = 0; i7 < c4323m.f15070d; i7++) {
            UUID uuid = c4323m.m18169e(i7).f15072b;
            if (uuid.equals(AbstractC4317g.f15030d)) {
                return 3;
            }
            if (uuid.equals(AbstractC4317g.f15031e)) {
                return 2;
            }
            if (uuid.equals(AbstractC4317g.f15029c)) {
                return 6;
            }
        }
        return 1;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: A */
    public /* synthetic */ void mo24573A(InterfaceC5850c.a aVar, boolean z6, int i7) {
        AbstractC5847b.m24527P(this, aVar, z6, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: B */
    public /* synthetic */ void mo24574B(InterfaceC5850c.a aVar, C5747o c5747o) {
        AbstractC5847b.m24550g(this, aVar, c5747o);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: C */
    public /* synthetic */ void mo24575C(InterfaceC5850c.a aVar, boolean z6) {
        AbstractC5847b.m24532U(this, aVar, z6);
    }

    /* renamed from: C0 */
    public LogSessionId m24853C0() {
        LogSessionId sessionId;
        sessionId = this.f21278c.getSessionId();
        return sessionId;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: D */
    public /* synthetic */ void mo24576D(InterfaceC5850c.a aVar) {
        AbstractC5847b.m24565t(this, aVar);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: E */
    public /* synthetic */ void mo24577E(InterfaceC5850c.a aVar, InterfaceC6097z.a aVar2) {
        AbstractC5847b.m24556k(this, aVar, aVar2);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: F */
    public /* synthetic */ void mo24578F(InterfaceC5850c.a aVar, C0116B c0116b) {
        AbstractC5847b.m24536Y(this, aVar, c0116b);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: G */
    public /* synthetic */ void mo24579G(InterfaceC5850c.a aVar, Exception exc) {
        AbstractC5847b.m24540b(this, aVar, exc);
    }

    /* renamed from: G0 */
    public final void m24854G0(InterfaceC5850c.b bVar) {
        for (int i7 = 0; i7 < bVar.m24644d(); i7++) {
            int m24642b = bVar.m24642b(i7);
            InterfaceC5850c.a m24643c = bVar.m24643c(m24642b);
            if (m24642b == 0) {
                this.f21277b.mo24822g(m24643c);
            } else if (m24642b == 11) {
                this.f21277b.mo24817b(m24643c, this.f21286k);
            } else {
                this.f21277b.mo24821f(m24643c);
            }
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: H */
    public /* synthetic */ void mo24580H(InterfaceC5850c.a aVar, int i7) {
        AbstractC5847b.m24523L(this, aVar, i7);
    }

    /* renamed from: H0 */
    public final void m24855H0(long j7) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        NetworkEvent build;
        int m24846D0 = m24846D0(this.f21276a);
        if (m24846D0 != this.f21288m) {
            this.f21288m = m24846D0;
            PlaybackSession playbackSession = this.f21278c;
            networkType = AbstractC5870i1.m24651a().setNetworkType(m24846D0);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j7 - this.f21279d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportNetworkEvent(build);
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: I */
    public /* synthetic */ void mo24581I(InterfaceC5850c.a aVar, Exception exc) {
        AbstractC5847b.m24537Z(this, aVar, exc);
    }

    /* renamed from: I0 */
    public final void m24856I0(long j7) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        AbstractC4296B abstractC4296B = this.f21289n;
        if (abstractC4296B == null) {
            return;
        }
        a m24844A0 = m24844A0(abstractC4296B, this.f21276a, this.f21297v == 4);
        PlaybackSession playbackSession = this.f21278c;
        timeSinceCreatedMillis = AbstractC5876k1.m24653a().setTimeSinceCreatedMillis(j7 - this.f21279d);
        errorCode = timeSinceCreatedMillis.setErrorCode(m24844A0.f21302a);
        subErrorCode = errorCode.setSubErrorCode(m24844A0.f21303b);
        exception = subErrorCode.setException(abstractC4296B);
        build = exception.build();
        playbackSession.reportPlaybackErrorEvent(build);
        this.f21275A = true;
        this.f21289n = null;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: J */
    public void mo24582J(InterfaceC5850c.a aVar, C0179y c0179y, C0116B c0116b, IOException iOException, boolean z6) {
        this.f21297v = c0116b.f360a;
    }

    /* renamed from: J0 */
    public final void m24857J0(InterfaceC4298D interfaceC4298D, InterfaceC5850c.b bVar, long j7) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        if (interfaceC4298D.mo17950A() != 2) {
            this.f21296u = false;
        }
        if (interfaceC4298D.mo17984v() == null) {
            this.f21298w = false;
        } else if (bVar.m24641a(10)) {
            this.f21298w = true;
        }
        int m24865R0 = m24865R0(interfaceC4298D);
        if (this.f21287l != m24865R0) {
            this.f21287l = m24865R0;
            this.f21275A = true;
            PlaybackSession playbackSession = this.f21278c;
            state = AbstractC5882m1.m24655a().setState(this.f21287l);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j7 - this.f21279d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportPlaybackStateEvent(build);
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: K */
    public /* synthetic */ void mo24583K(InterfaceC5850c.a aVar, C4327q c4327q, C5749p c5749p) {
        AbstractC5847b.m24549f0(this, aVar, c4327q, c5749p);
    }

    /* renamed from: K0 */
    public final void m24858K0(InterfaceC4298D interfaceC4298D, InterfaceC5850c.b bVar, long j7) {
        if (bVar.m24641a(2)) {
            C4306L mo17951B = interfaceC4298D.mo17951B();
            boolean m18102b = mo17951B.m18102b(2);
            boolean m18102b2 = mo17951B.m18102b(1);
            boolean m18102b3 = mo17951B.m18102b(3);
            if (m18102b || m18102b2 || m18102b3) {
                if (!m18102b) {
                    m24863P0(j7, null, 0);
                }
                if (!m18102b2) {
                    m24859L0(j7, null, 0);
                }
                if (!m18102b3) {
                    m24861N0(j7, null, 0);
                }
            }
        }
        if (m24870u0(this.f21290o)) {
            b bVar2 = this.f21290o;
            C4327q c4327q = bVar2.f21304a;
            if (c4327q.f15145u != -1) {
                m24863P0(j7, c4327q, bVar2.f21305b);
                this.f21290o = null;
            }
        }
        if (m24870u0(this.f21291p)) {
            b bVar3 = this.f21291p;
            m24859L0(j7, bVar3.f21304a, bVar3.f21305b);
            this.f21291p = null;
        }
        if (m24870u0(this.f21292q)) {
            b bVar4 = this.f21292q;
            m24861N0(j7, bVar4.f21304a, bVar4.f21305b);
            this.f21292q = null;
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: L */
    public /* synthetic */ void mo24584L(InterfaceC5850c.a aVar, C0179y c0179y, C0116B c0116b) {
        AbstractC5847b.m24515D(this, aVar, c0179y, c0116b);
    }

    /* renamed from: L0 */
    public final void m24859L0(long j7, C4327q c4327q, int i7) {
        if (AbstractC5330M.m21729c(this.f21294s, c4327q)) {
            return;
        }
        if (this.f21294s == null && i7 == 0) {
            i7 = 1;
        }
        this.f21294s = c4327q;
        m24864Q0(0, j7, c4327q, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: M */
    public /* synthetic */ void mo24585M(InterfaceC5850c.a aVar, C4306L c4306l) {
        AbstractC5847b.m24535X(this, aVar, c4306l);
    }

    /* renamed from: M0 */
    public final void m24860M0(InterfaceC4298D interfaceC4298D, InterfaceC5850c.b bVar) {
        C4323m m24851y0;
        if (bVar.m24641a(0)) {
            InterfaceC5850c.a m24643c = bVar.m24643c(0);
            if (this.f21285j != null) {
                m24862O0(m24643c.f21164b, m24643c.f21166d);
            }
        }
        if (bVar.m24641a(2) && this.f21285j != null && (m24851y0 = m24851y0(interfaceC4298D.mo17951B().m18101a())) != null) {
            AbstractC5804F0.m24466a(AbstractC5330M.m21747i(this.f21285j)).setDrmType(m24852z0(m24851y0));
        }
        if (bVar.m24641a(1011)) {
            this.f21301z++;
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: N */
    public /* synthetic */ void mo24586N(InterfaceC5850c.a aVar, String str, long j7) {
        AbstractC5847b.m24539a0(this, aVar, str, j7);
    }

    /* renamed from: N0 */
    public final void m24861N0(long j7, C4327q c4327q, int i7) {
        if (AbstractC5330M.m21729c(this.f21295t, c4327q)) {
            return;
        }
        if (this.f21295t == null && i7 == 0) {
            i7 = 1;
        }
        this.f21295t = c4327q;
        m24864Q0(2, j7, c4327q, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: O */
    public /* synthetic */ void mo24587O(InterfaceC5850c.a aVar, C4333w c4333w) {
        AbstractC5847b.m24519H(this, aVar, c4333w);
    }

    /* renamed from: O0 */
    public final void m24862O0(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar) {
        int mo302b;
        PlaybackMetrics.Builder builder = this.f21285j;
        if (bVar == null || (mo302b = abstractC4303I.mo302b(bVar.f367a)) == -1) {
            return;
        }
        abstractC4303I.m18027f(mo302b, this.f21281f);
        abstractC4303I.m18031n(this.f21281f.f14811c, this.f21280e);
        builder.setStreamType(m24847E0(this.f21280e.f14834c));
        AbstractC4303I.c cVar = this.f21280e;
        if (cVar.f14844m != -9223372036854775807L && !cVar.f14842k && !cVar.f14840i && !cVar.m18059f()) {
            builder.setMediaDurationMillis(this.f21280e.m18057d());
        }
        builder.setPlaybackType(this.f21280e.m18059f() ? 2 : 1);
        this.f21275A = true;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: P */
    public /* synthetic */ void mo24588P(InterfaceC5850c.a aVar, String str) {
        AbstractC5847b.m24546e(this, aVar, str);
    }

    /* renamed from: P0 */
    public final void m24863P0(long j7, C4327q c4327q, int i7) {
        if (AbstractC5330M.m21729c(this.f21293r, c4327q)) {
            return;
        }
        if (this.f21293r == null && i7 == 0) {
            i7 = 1;
        }
        this.f21293r = c4327q;
        m24864Q0(1, j7, c4327q, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: Q */
    public /* synthetic */ void mo24589Q(InterfaceC5850c.a aVar) {
        AbstractC5847b.m24564s(this, aVar);
    }

    /* renamed from: Q0 */
    public final void m24864Q0(int i7, long j7, C4327q c4327q, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = AbstractC5867h1.m24650a(i7).setTimeSinceCreatedMillis(j7 - this.f21279d);
        if (c4327q != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(m24848F0(i8));
            String str = c4327q.f15137m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c4327q.f15138n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c4327q.f15134j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = c4327q.f15133i;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = c4327q.f15144t;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = c4327q.f15145u;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = c4327q.f15114B;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = c4327q.f15115C;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = c4327q.f15128d;
            if (str4 != null) {
                Pair m24845B0 = m24845B0(str4);
                timeSinceCreatedMillis.setLanguage((String) m24845B0.first);
                Object obj = m24845B0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = c4327q.f15146v;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f21275A = true;
        PlaybackSession playbackSession = this.f21278c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: R */
    public /* synthetic */ void mo24590R(InterfaceC5850c.a aVar, C4322l c4322l) {
        AbstractC5847b.m24562q(this, aVar, c4322l);
    }

    /* renamed from: R0 */
    public final int m24865R0(InterfaceC4298D interfaceC4298D) {
        int mo17950A = interfaceC4298D.mo17950A();
        if (this.f21296u) {
            return 5;
        }
        if (this.f21298w) {
            return 13;
        }
        if (mo17950A == 4) {
            return 11;
        }
        if (mo17950A == 2) {
            int i7 = this.f21287l;
            if (i7 == 0 || i7 == 2 || i7 == 12) {
                return 2;
            }
            if (interfaceC4298D.mo17974l()) {
                return interfaceC4298D.mo17958I() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (mo17950A == 3) {
            if (interfaceC4298D.mo17974l()) {
                return interfaceC4298D.mo17958I() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (mo17950A != 1 || this.f21287l == 0) {
            return this.f21287l;
        }
        return 12;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: S */
    public /* synthetic */ void mo24591S(InterfaceC5850c.a aVar, boolean z6, int i7) {
        AbstractC5847b.m24521J(this, aVar, z6, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: T */
    public /* synthetic */ void mo24592T(InterfaceC5850c.a aVar, boolean z6) {
        AbstractC5847b.m24513B(this, aVar, z6);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: U */
    public /* synthetic */ void mo24593U(InterfaceC5850c.a aVar, int i7, long j7) {
        AbstractC5847b.m24571z(this, aVar, i7, j7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: V */
    public /* synthetic */ void mo24594V(InterfaceC5850c.a aVar) {
        AbstractC5847b.m24526O(this, aVar);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: W */
    public /* synthetic */ void mo24595W(InterfaceC5850c.a aVar, String str, long j7, long j8) {
        AbstractC5847b.m24541b0(this, aVar, str, j7, j8);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: X */
    public void mo24596X(InterfaceC4298D interfaceC4298D, InterfaceC5850c.b bVar) {
        if (bVar.m24644d() == 0) {
            return;
        }
        m24854G0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m24860M0(interfaceC4298D, bVar);
        m24856I0(elapsedRealtime);
        m24858K0(interfaceC4298D, bVar, elapsedRealtime);
        m24855H0(elapsedRealtime);
        m24857J0(interfaceC4298D, bVar, elapsedRealtime);
        if (bVar.m24641a(1028)) {
            this.f21277b.mo24820e(bVar.m24643c(1028));
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: Y */
    public /* synthetic */ void mo24597Y(InterfaceC5850c.a aVar) {
        AbstractC5847b.m24531T(this, aVar);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: Z */
    public /* synthetic */ void mo24598Z(InterfaceC5850c.a aVar, C4331u c4331u, int i7) {
        AbstractC5847b.m24518G(this, aVar, c4331u, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: a */
    public /* synthetic */ void mo24599a(InterfaceC5850c.a aVar, long j7, int i7) {
        AbstractC5847b.m24547e0(this, aVar, j7, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: a0 */
    public /* synthetic */ void mo24600a0(InterfaceC5850c.a aVar, int i7, int i8, int i9, float f7) {
        AbstractC5847b.m24551g0(this, aVar, i7, i8, i9, f7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: b */
    public /* synthetic */ void mo24601b(InterfaceC5850c.a aVar, Exception exc) {
        AbstractC5847b.m24569x(this, aVar, exc);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: c */
    public /* synthetic */ void mo24602c(InterfaceC5850c.a aVar, InterfaceC4298D.b bVar) {
        AbstractC5847b.m24559n(this, aVar, bVar);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: c0 */
    public /* synthetic */ void mo24603c0(InterfaceC5850c.a aVar, int i7) {
        AbstractC5847b.m24524M(this, aVar, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: d */
    public /* synthetic */ void mo24604d(InterfaceC5850c.a aVar, int i7) {
        AbstractC5847b.m24568w(this, aVar, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: d0 */
    public /* synthetic */ void mo24605d0(InterfaceC5850c.a aVar) {
        AbstractC5847b.m24570y(this, aVar);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: e */
    public void mo24606e(InterfaceC5850c.a aVar, AbstractC4296B abstractC4296B) {
        this.f21289n = abstractC4296B;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: e0 */
    public /* synthetic */ void mo24607e0(InterfaceC5850c.a aVar, Object obj, long j7) {
        AbstractC5847b.m24529R(this, aVar, obj, j7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: f */
    public /* synthetic */ void mo24608f(InterfaceC5850c.a aVar, C0179y c0179y, C0116B c0116b) {
        AbstractC5847b.m24516E(this, aVar, c0179y, c0116b);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: f0 */
    public void mo24609f0(InterfaceC5850c.a aVar, C5747o c5747o) {
        this.f21299x += c5747o.f20816g;
        this.f21300y += c5747o.f20814e;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: g */
    public void mo24610g(InterfaceC5850c.a aVar, InterfaceC4298D.e eVar, InterfaceC4298D.e eVar2, int i7) {
        if (i7 == 1) {
            this.f21296u = true;
        }
        this.f21286k = i7;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: h */
    public /* synthetic */ void mo24611h(InterfaceC5850c.a aVar, int i7, long j7, long j8) {
        AbstractC5847b.m24558m(this, aVar, i7, j7, j8);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: h0 */
    public /* synthetic */ void mo24612h0(InterfaceC5850c.a aVar, String str) {
        AbstractC5847b.m24543c0(this, aVar, str);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: i */
    public void mo24613i(InterfaceC5850c.a aVar, int i7, long j7, long j8) {
        InterfaceC0120F.b bVar = aVar.f21166d;
        if (bVar != null) {
            String mo24819d = this.f21277b.mo24819d(aVar.f21164b, (InterfaceC0120F.b) AbstractC5332a.m21800e(bVar));
            Long l7 = (Long) this.f21283h.get(mo24819d);
            Long l8 = (Long) this.f21282g.get(mo24819d);
            this.f21283h.put(mo24819d, Long.valueOf((l7 == null ? 0L : l7.longValue()) + j7));
            this.f21282g.put(mo24819d, Long.valueOf((l8 != null ? l8.longValue() : 0L) + i7));
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: i0 */
    public /* synthetic */ void mo24614i0(InterfaceC5850c.a aVar) {
        AbstractC5847b.m24566u(this, aVar);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: j */
    public /* synthetic */ void mo24615j(InterfaceC5850c.a aVar, AbstractC4296B abstractC4296B) {
        AbstractC5847b.m24525N(this, aVar, abstractC4296B);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: j0 */
    public /* synthetic */ void mo24616j0(InterfaceC5850c.a aVar, C4327q c4327q, C5749p c5749p) {
        AbstractC5847b.m24552h(this, aVar, c4327q, c5749p);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: k */
    public /* synthetic */ void mo24617k(InterfaceC5850c.a aVar, int i7, boolean z6) {
        AbstractC5847b.m24563r(this, aVar, i7, z6);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: k0 */
    public /* synthetic */ void mo24618k0(InterfaceC5850c.a aVar, int i7) {
        AbstractC5847b.m24530S(this, aVar, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: l */
    public /* synthetic */ void mo24619l(InterfaceC5850c.a aVar, C5747o c5747o) {
        AbstractC5847b.m24545d0(this, aVar, c5747o);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: l0 */
    public /* synthetic */ void mo24620l0(InterfaceC5850c.a aVar, C4312b c4312b) {
        AbstractC5847b.m24538a(this, aVar, c4312b);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: m */
    public /* synthetic */ void mo24621m(InterfaceC5850c.a aVar, C4334x c4334x) {
        AbstractC5847b.m24520I(this, aVar, c4334x);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: m0 */
    public /* synthetic */ void mo24622m0(InterfaceC5850c.a aVar, C5747o c5747o) {
        AbstractC5847b.m24548f(this, aVar, c5747o);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: n */
    public /* synthetic */ void mo24623n(InterfaceC5850c.a aVar, C4504b c4504b) {
        AbstractC5847b.m24560o(this, aVar, c4504b);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: n0 */
    public /* synthetic */ void mo24624n0(InterfaceC5850c.a aVar, Exception exc) {
        AbstractC5847b.m24555j(this, aVar, exc);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: o */
    public /* synthetic */ void mo24625o(InterfaceC5850c.a aVar, String str, long j7, long j8) {
        AbstractC5847b.m24544d(this, aVar, str, j7, j8);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: o0 */
    public /* synthetic */ void mo24626o0(InterfaceC5850c.a aVar, C0179y c0179y, C0116B c0116b) {
        AbstractC5847b.m24514C(this, aVar, c0179y, c0116b);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: p */
    public /* synthetic */ void mo24627p(InterfaceC5850c.a aVar, C4297C c4297c) {
        AbstractC5847b.m24522K(this, aVar, c4297c);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: p0 */
    public /* synthetic */ void mo24628p0(InterfaceC5850c.a aVar, long j7) {
        AbstractC5847b.m24554i(this, aVar, j7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: q */
    public /* synthetic */ void mo24629q(InterfaceC5850c.a aVar, boolean z6) {
        AbstractC5847b.m24517F(this, aVar, z6);
    }

    @Override // p300o0.InterfaceC5909v1.a
    /* renamed from: q0 */
    public void mo24868q0(InterfaceC5850c.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        InterfaceC0120F.b bVar = aVar.f21166d;
        if (bVar == null || !bVar.m345b()) {
            m24871w0();
            this.f21284i = str;
            playerName = AbstractC5873j1.m24652a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.4.1");
            this.f21285j = playerVersion;
            m24862O0(aVar.f21164b, aVar.f21166d);
        }
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: r */
    public /* synthetic */ void mo24630r(InterfaceC5850c.a aVar, int i7) {
        AbstractC5847b.m24534W(this, aVar, i7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: r0 */
    public /* synthetic */ void mo24631r0(InterfaceC5850c.a aVar, int i7, int i8) {
        AbstractC5847b.m24533V(this, aVar, i7, i8);
    }

    @Override // p300o0.InterfaceC5909v1.a
    /* renamed from: s */
    public void mo24869s(InterfaceC5850c.a aVar, String str, boolean z6) {
        InterfaceC0120F.b bVar = aVar.f21166d;
        if ((bVar == null || !bVar.m345b()) && str.equals(this.f21284i)) {
            m24871w0();
        }
        this.f21282g.remove(str);
        this.f21283h.remove(str);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: s0 */
    public void mo24632s0(InterfaceC5850c.a aVar, C0116B c0116b) {
        if (aVar.f21166d == null) {
            return;
        }
        b bVar = new b((C4327q) AbstractC5332a.m21800e(c0116b.f362c), c0116b.f363d, this.f21277b.mo24819d(aVar.f21164b, (InterfaceC0120F.b) AbstractC5332a.m21800e(aVar.f21166d)));
        int i7 = c0116b.f361b;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f21291p = bVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.f21292q = bVar;
                return;
            }
        }
        this.f21290o = bVar;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: t */
    public /* synthetic */ void mo24633t(InterfaceC5850c.a aVar, InterfaceC6097z.a aVar2) {
        AbstractC5847b.m24557l(this, aVar, aVar2);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: t0 */
    public /* synthetic */ void mo24634t0(InterfaceC5850c.a aVar, float f7) {
        AbstractC5847b.m24553h0(this, aVar, f7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: u */
    public /* synthetic */ void mo24635u(InterfaceC5850c.a aVar, int i7) {
        AbstractC5847b.m24528Q(this, aVar, i7);
    }

    /* renamed from: u0 */
    public final boolean m24870u0(b bVar) {
        return bVar != null && bVar.f21306c.equals(this.f21277b.mo24816a());
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: v */
    public /* synthetic */ void mo24636v(InterfaceC5850c.a aVar) {
        AbstractC5847b.m24567v(this, aVar);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: w */
    public void mo24637w(InterfaceC5850c.a aVar, C4310P c4310p) {
        b bVar = this.f21290o;
        if (bVar != null) {
            C4327q c4327q = bVar.f21304a;
            if (c4327q.f15145u == -1) {
                this.f21290o = new b(c4327q.m18193a().m18271v0(c4310p.f14972a).m18248Y(c4310p.f14973b).m18234K(), bVar.f21305b, bVar.f21306c);
            }
        }
    }

    /* renamed from: w0 */
    public final void m24871w0() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f21285j;
        if (builder != null && this.f21275A) {
            builder.setAudioUnderrunCount(this.f21301z);
            this.f21285j.setVideoFramesDropped(this.f21299x);
            this.f21285j.setVideoFramesPlayed(this.f21300y);
            Long l7 = (Long) this.f21282g.get(this.f21284i);
            this.f21285j.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = (Long) this.f21283h.get(this.f21284i);
            this.f21285j.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.f21285j.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f21278c;
            build = this.f21285j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f21285j = null;
        this.f21284i = null;
        this.f21301z = 0;
        this.f21299x = 0;
        this.f21300y = 0;
        this.f21293r = null;
        this.f21294s = null;
        this.f21295t = null;
        this.f21275A = false;
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: x */
    public /* synthetic */ void mo24638x(InterfaceC5850c.a aVar, String str, long j7) {
        AbstractC5847b.m24542c(this, aVar, str, j7);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: y */
    public /* synthetic */ void mo24639y(InterfaceC5850c.a aVar, List list) {
        AbstractC5847b.m24561p(this, aVar, list);
    }

    @Override // p300o0.InterfaceC5850c
    /* renamed from: z */
    public /* synthetic */ void mo24640z(InterfaceC5850c.a aVar, boolean z6) {
        AbstractC5847b.m24512A(this, aVar, z6);
    }

    @Override // p300o0.InterfaceC5909v1.a
    /* renamed from: g0 */
    public void mo24867g0(InterfaceC5850c.a aVar, String str) {
    }

    @Override // p300o0.InterfaceC5909v1.a
    /* renamed from: b0 */
    public void mo24866b0(InterfaceC5850c.a aVar, String str, String str2) {
    }
}
