package p311p0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import p078L0.AbstractC0851I;
import p078L0.AbstractC0853K;
import p078L0.AbstractC0867b;
import p078L0.AbstractC0868c;
import p078L0.AbstractC0881p;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4336z;
import p232g0.C4297C;
import p232g0.C4312b;
import p232g0.C4315e;
import p232g0.C4327q;
import p240h0.C4475a;
import p240h0.C4480f;
import p240h0.C4481g;
import p240h0.InterfaceC4476b;
import p240h0.InterfaceC4477c;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5337f;
import p259j0.InterfaceC5334c;
import p272k4.C5410A;
import p272k4.C5413D;
import p292n0.InterfaceC5763w;
import p300o0.C5912w1;
import p311p0.C6042B;
import p311p0.C6054N;
import p311p0.C6067a0;
import p311p0.C6080i;
import p311p0.InterfaceC6097z;

/* renamed from: p0.N */
/* loaded from: classes.dex */
public final class C6054N implements InterfaceC6097z {

    /* renamed from: n0 */
    public static boolean f21548n0 = false;

    /* renamed from: o0 */
    public static final Object f21549o0 = new Object();

    /* renamed from: p0 */
    public static ExecutorService f21550p0;

    /* renamed from: q0 */
    public static int f21551q0;

    /* renamed from: A */
    public k f21552A;

    /* renamed from: B */
    public C4312b f21553B;

    /* renamed from: C */
    public j f21554C;

    /* renamed from: D */
    public j f21555D;

    /* renamed from: E */
    public C4297C f21556E;

    /* renamed from: F */
    public boolean f21557F;

    /* renamed from: G */
    public ByteBuffer f21558G;

    /* renamed from: H */
    public int f21559H;

    /* renamed from: I */
    public long f21560I;

    /* renamed from: J */
    public long f21561J;

    /* renamed from: K */
    public long f21562K;

    /* renamed from: L */
    public long f21563L;

    /* renamed from: M */
    public int f21564M;

    /* renamed from: N */
    public boolean f21565N;

    /* renamed from: O */
    public boolean f21566O;

    /* renamed from: P */
    public long f21567P;

    /* renamed from: Q */
    public float f21568Q;

    /* renamed from: R */
    public ByteBuffer f21569R;

    /* renamed from: S */
    public int f21570S;

    /* renamed from: T */
    public ByteBuffer f21571T;

    /* renamed from: U */
    public byte[] f21572U;

    /* renamed from: V */
    public int f21573V;

    /* renamed from: W */
    public boolean f21574W;

    /* renamed from: X */
    public boolean f21575X;

    /* renamed from: Y */
    public boolean f21576Y;

    /* renamed from: Z */
    public boolean f21577Z;

    /* renamed from: a */
    public final Context f21578a;

    /* renamed from: a0 */
    public boolean f21579a0;

    /* renamed from: b */
    public final InterfaceC4477c f21580b;

    /* renamed from: b0 */
    public int f21581b0;

    /* renamed from: c */
    public final boolean f21582c;

    /* renamed from: c0 */
    public C4315e f21583c0;

    /* renamed from: d */
    public final C6043C f21584d;

    /* renamed from: d0 */
    public C6081j f21585d0;

    /* renamed from: e */
    public final C6077f0 f21586e;

    /* renamed from: e0 */
    public boolean f21587e0;

    /* renamed from: f */
    public final AbstractC3033v f21588f;

    /* renamed from: f0 */
    public long f21589f0;

    /* renamed from: g */
    public final AbstractC3033v f21590g;

    /* renamed from: g0 */
    public long f21591g0;

    /* renamed from: h */
    public final C5337f f21592h;

    /* renamed from: h0 */
    public boolean f21593h0;

    /* renamed from: i */
    public final C6042B f21594i;

    /* renamed from: i0 */
    public boolean f21595i0;

    /* renamed from: j */
    public final ArrayDeque f21596j;

    /* renamed from: j0 */
    public Looper f21597j0;

    /* renamed from: k */
    public final boolean f21598k;

    /* renamed from: k0 */
    public long f21599k0;

    /* renamed from: l */
    public int f21600l;

    /* renamed from: l0 */
    public long f21601l0;

    /* renamed from: m */
    public n f21602m;

    /* renamed from: m0 */
    public Handler f21603m0;

    /* renamed from: n */
    public final l f21604n;

    /* renamed from: o */
    public final l f21605o;

    /* renamed from: p */
    public final e f21606p;

    /* renamed from: q */
    public final d f21607q;

    /* renamed from: r */
    public final InterfaceC5763w.a f21608r;

    /* renamed from: s */
    public C5912w1 f21609s;

    /* renamed from: t */
    public InterfaceC6097z.d f21610t;

    /* renamed from: u */
    public g f21611u;

    /* renamed from: v */
    public g f21612v;

    /* renamed from: w */
    public C4475a f21613w;

    /* renamed from: x */
    public AudioTrack f21614x;

    /* renamed from: y */
    public C6074e f21615y;

    /* renamed from: z */
    public C6080i f21616z;

    /* renamed from: p0.N$b */
    public static final class b {
        /* renamed from: a */
        public static void m25233a(AudioTrack audioTrack, C6081j c6081j) {
            audioTrack.setPreferredDevice(c6081j == null ? null : c6081j.f21740a);
        }
    }

    /* renamed from: p0.N$c */
    public static final class c {
        /* renamed from: a */
        public static void m25234a(AudioTrack audioTrack, C5912w1 c5912w1) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId m24874a = c5912w1.m24874a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = m24874a.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(m24874a);
        }
    }

    /* renamed from: p0.N$d */
    public interface d {
        /* renamed from: a */
        C6082k mo25148a(C4327q c4327q, C4312b c4312b);
    }

    /* renamed from: p0.N$e */
    public interface e {

        /* renamed from: a */
        public static final e f21617a = new C6067a0.a().m25290h();

        /* renamed from: a */
        int mo25235a(int i7, int i8, int i9, int i10, int i11, int i12, double d7);
    }

    /* renamed from: p0.N$f */
    public static final class f {

        /* renamed from: a */
        public final Context f21618a;

        /* renamed from: c */
        public InterfaceC4477c f21620c;

        /* renamed from: d */
        public boolean f21621d;

        /* renamed from: e */
        public boolean f21622e;

        /* renamed from: f */
        public boolean f21623f;

        /* renamed from: h */
        public d f21625h;

        /* renamed from: i */
        public InterfaceC5763w.a f21626i;

        /* renamed from: b */
        public C6074e f21619b = C6074e.f21708c;

        /* renamed from: g */
        public e f21624g = e.f21617a;

        public f(Context context) {
            this.f21618a = context;
        }

        /* renamed from: i */
        public C6054N m25244i() {
            AbstractC5332a.m21802g(!this.f21623f);
            this.f21623f = true;
            if (this.f21620c == null) {
                this.f21620c = new h(new InterfaceC4476b[0]);
            }
            if (this.f21625h == null) {
                this.f21625h = new C6045E(this.f21618a);
            }
            return new C6054N(this);
        }

        /* renamed from: j */
        public f m25245j(boolean z6) {
            this.f21622e = z6;
            return this;
        }

        /* renamed from: k */
        public f m25246k(boolean z6) {
            this.f21621d = z6;
            return this;
        }
    }

    /* renamed from: p0.N$g */
    public static final class g {

        /* renamed from: a */
        public final C4327q f21627a;

        /* renamed from: b */
        public final int f21628b;

        /* renamed from: c */
        public final int f21629c;

        /* renamed from: d */
        public final int f21630d;

        /* renamed from: e */
        public final int f21631e;

        /* renamed from: f */
        public final int f21632f;

        /* renamed from: g */
        public final int f21633g;

        /* renamed from: h */
        public final int f21634h;

        /* renamed from: i */
        public final C4475a f21635i;

        /* renamed from: j */
        public final boolean f21636j;

        /* renamed from: k */
        public final boolean f21637k;

        /* renamed from: l */
        public final boolean f21638l;

        public g(C4327q c4327q, int i7, int i8, int i9, int i10, int i11, int i12, int i13, C4475a c4475a, boolean z6, boolean z7, boolean z8) {
            this.f21627a = c4327q;
            this.f21628b = i7;
            this.f21629c = i8;
            this.f21630d = i9;
            this.f21631e = i10;
            this.f21632f = i11;
            this.f21633g = i12;
            this.f21634h = i13;
            this.f21635i = c4475a;
            this.f21636j = z6;
            this.f21637k = z7;
            this.f21638l = z8;
        }

        /* renamed from: j */
        public static AudioAttributes m25247j(C4312b c4312b, boolean z6) {
            return z6 ? m25248k() : c4312b.m18123a().f15018a;
        }

        /* renamed from: k */
        public static AudioAttributes m25248k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: a */
        public AudioTrack m25249a(C4312b c4312b, int i7) {
            try {
                AudioTrack m25253e = m25253e(c4312b, i7);
                int state = m25253e.getState();
                if (state == 1) {
                    return m25253e;
                }
                try {
                    m25253e.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC6097z.c(state, this.f21631e, this.f21632f, this.f21634h, this.f21627a, m25259m(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e7) {
                throw new InterfaceC6097z.c(0, this.f21631e, this.f21632f, this.f21634h, this.f21627a, m25259m(), e7);
            }
        }

        /* renamed from: b */
        public InterfaceC6097z.a m25250b() {
            return new InterfaceC6097z.a(this.f21633g, this.f21631e, this.f21632f, this.f21638l, this.f21629c == 1, this.f21634h);
        }

        /* renamed from: c */
        public boolean m25251c(g gVar) {
            return gVar.f21629c == this.f21629c && gVar.f21633g == this.f21633g && gVar.f21631e == this.f21631e && gVar.f21632f == this.f21632f && gVar.f21630d == this.f21630d && gVar.f21636j == this.f21636j && gVar.f21637k == this.f21637k;
        }

        /* renamed from: d */
        public g m25252d(int i7) {
            return new g(this.f21627a, this.f21628b, this.f21629c, this.f21630d, this.f21631e, this.f21632f, this.f21633g, i7, this.f21635i, this.f21636j, this.f21637k, this.f21638l);
        }

        /* renamed from: e */
        public final AudioTrack m25253e(C4312b c4312b, int i7) {
            int i8 = AbstractC5330M.f18800a;
            return i8 >= 29 ? m25255g(c4312b, i7) : i8 >= 21 ? m25254f(c4312b, i7) : m25256h(c4312b, i7);
        }

        /* renamed from: f */
        public final AudioTrack m25254f(C4312b c4312b, int i7) {
            return new AudioTrack(m25247j(c4312b, this.f21638l), AbstractC5330M.m21695M(this.f21631e, this.f21632f, this.f21633g), this.f21634h, 1, i7);
        }

        /* renamed from: g */
        public final AudioTrack m25255g(C4312b c4312b, int i7) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(m25247j(c4312b, this.f21638l)).setAudioFormat(AbstractC5330M.m21695M(this.f21631e, this.f21632f, this.f21633g)).setTransferMode(1).setBufferSizeInBytes(this.f21634h).setSessionId(i7).setOffloadedPlayback(this.f21629c == 1);
            return offloadedPlayback.build();
        }

        /* renamed from: h */
        public final AudioTrack m25256h(C4312b c4312b, int i7) {
            int m21760m0 = AbstractC5330M.m21760m0(c4312b.f15014c);
            return i7 == 0 ? new AudioTrack(m21760m0, this.f21631e, this.f21632f, this.f21633g, this.f21634h, 1) : new AudioTrack(m21760m0, this.f21631e, this.f21632f, this.f21633g, this.f21634h, 1, i7);
        }

        /* renamed from: i */
        public long m25257i(long j7) {
            return AbstractC5330M.m21716W0(j7, this.f21631e);
        }

        /* renamed from: l */
        public long m25258l(long j7) {
            return AbstractC5330M.m21716W0(j7, this.f21627a.f15115C);
        }

        /* renamed from: m */
        public boolean m25259m() {
            return this.f21629c == 1;
        }
    }

    /* renamed from: p0.N$h */
    public static class h implements InterfaceC4477c {

        /* renamed from: a */
        public final InterfaceC4476b[] f21639a;

        /* renamed from: b */
        public final C6073d0 f21640b;

        /* renamed from: c */
        public final C4480f f21641c;

        public h(InterfaceC4476b... interfaceC4476bArr) {
            this(interfaceC4476bArr, new C6073d0(), new C4480f());
        }

        @Override // p240h0.InterfaceC4477c
        /* renamed from: a */
        public C4297C mo19060a(C4297C c4297c) {
            this.f21641c.m19096h(c4297c.f14768a);
            this.f21641c.m19095g(c4297c.f14769b);
            return c4297c;
        }

        @Override // p240h0.InterfaceC4477c
        /* renamed from: b */
        public long mo19061b(long j7) {
            return this.f21641c.isActive() ? this.f21641c.m19094f(j7) : j7;
        }

        @Override // p240h0.InterfaceC4477c
        /* renamed from: c */
        public long mo19062c() {
            return this.f21640b.m25345t();
        }

        @Override // p240h0.InterfaceC4477c
        /* renamed from: d */
        public boolean mo19063d(boolean z6) {
            this.f21640b.m25335C(z6);
            return z6;
        }

        @Override // p240h0.InterfaceC4477c
        /* renamed from: e */
        public InterfaceC4476b[] mo19064e() {
            return this.f21639a;
        }

        public h(InterfaceC4476b[] interfaceC4476bArr, C6073d0 c6073d0, C4480f c4480f) {
            InterfaceC4476b[] interfaceC4476bArr2 = new InterfaceC4476b[interfaceC4476bArr.length + 2];
            this.f21639a = interfaceC4476bArr2;
            System.arraycopy(interfaceC4476bArr, 0, interfaceC4476bArr2, 0, interfaceC4476bArr.length);
            this.f21640b = c6073d0;
            this.f21641c = c4480f;
            interfaceC4476bArr2[interfaceC4476bArr.length] = c6073d0;
            interfaceC4476bArr2[interfaceC4476bArr.length + 1] = c4480f;
        }
    }

    /* renamed from: p0.N$i */
    public static final class i extends RuntimeException {
        public i(String str) {
            super(str);
        }
    }

    /* renamed from: p0.N$j */
    public static final class j {

        /* renamed from: a */
        public final C4297C f21642a;

        /* renamed from: b */
        public final long f21643b;

        /* renamed from: c */
        public final long f21644c;

        public j(C4297C c4297c, long j7, long j8) {
            this.f21642a = c4297c;
            this.f21643b = j7;
            this.f21644c = j8;
        }
    }

    /* renamed from: p0.N$k */
    public static final class k {

        /* renamed from: a */
        public final AudioTrack f21645a;

        /* renamed from: b */
        public final C6080i f21646b;

        /* renamed from: c */
        public AudioRouting.OnRoutingChangedListener f21647c = new AudioRouting.OnRoutingChangedListener() { // from class: p0.W
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C6054N.k.this.m25261b(audioRouting);
            }
        };

        public k(AudioTrack audioTrack, C6080i c6080i) {
            this.f21645a = audioTrack;
            this.f21646b = c6080i;
            audioTrack.addOnRoutingChangedListener(this.f21647c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m25261b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            AudioDeviceInfo routedDevice2;
            if (this.f21647c == null) {
                return;
            }
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                C6080i c6080i = this.f21646b;
                routedDevice2 = audioRouting.getRoutedDevice();
                c6080i.m25388i(routedDevice2);
            }
        }

        /* renamed from: c */
        public void m25262c() {
            this.f21645a.removeOnRoutingChangedListener(AbstractC6059T.m25271a(AbstractC5332a.m21800e(this.f21647c)));
            this.f21647c = null;
        }
    }

    /* renamed from: p0.N$l */
    public static final class l {

        /* renamed from: a */
        public final long f21648a;

        /* renamed from: b */
        public Exception f21649b;

        /* renamed from: c */
        public long f21650c;

        public l(long j7) {
            this.f21648a = j7;
        }

        /* renamed from: a */
        public void m25263a() {
            this.f21649b = null;
        }

        /* renamed from: b */
        public void m25264b(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f21649b == null) {
                this.f21649b = exc;
                this.f21650c = this.f21648a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f21650c) {
                Exception exc2 = this.f21649b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f21649b;
                m25263a();
                throw exc3;
            }
        }
    }

    /* renamed from: p0.N$m */
    public final class m implements C6042B.a {
        public m() {
        }

        @Override // p311p0.C6042B.a
        /* renamed from: a */
        public void mo25141a(long j7) {
            if (C6054N.this.f21610t != null) {
                C6054N.this.f21610t.mo25313a(j7);
            }
        }

        @Override // p311p0.C6042B.a
        /* renamed from: b */
        public void mo25142b(int i7, long j7) {
            if (C6054N.this.f21610t != null) {
                C6054N.this.f21610t.mo25320h(i7, j7, SystemClock.elapsedRealtime() - C6054N.this.f21591g0);
            }
        }

        @Override // p311p0.C6042B.a
        /* renamed from: c */
        public void mo25143c(long j7) {
            AbstractC5346o.m21867h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j7);
        }

        @Override // p311p0.C6042B.a
        /* renamed from: d */
        public void mo25144d(long j7, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j7 + ", " + j8 + ", " + j9 + ", " + j10 + ", " + C6054N.this.m25185U() + ", " + C6054N.this.m25186V();
            if (C6054N.f21548n0) {
                throw new i(str);
            }
            AbstractC5346o.m21867h("DefaultAudioSink", str);
        }

        @Override // p311p0.C6042B.a
        /* renamed from: e */
        public void mo25145e(long j7, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j7 + ", " + j8 + ", " + j9 + ", " + j10 + ", " + C6054N.this.m25185U() + ", " + C6054N.this.m25186V();
            if (C6054N.f21548n0) {
                throw new i(str);
            }
            AbstractC5346o.m21867h("DefaultAudioSink", str);
        }
    }

    /* renamed from: p0.N$n */
    public final class n {

        /* renamed from: a */
        public final Handler f21652a = new Handler(Looper.myLooper());

        /* renamed from: b */
        public final AudioTrack$StreamEventCallback f21653b;

        /* renamed from: p0.N$n$a */
        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a */
            public final /* synthetic */ C6054N f21655a;

            public a(C6054N c6054n) {
                this.f21655a = c6054n;
            }

            public void onDataRequest(AudioTrack audioTrack, int i7) {
                if (audioTrack.equals(C6054N.this.f21614x) && C6054N.this.f21610t != null && C6054N.this.f21577Z) {
                    C6054N.this.f21610t.mo25323k();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(C6054N.this.f21614x)) {
                    C6054N.this.f21576Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(C6054N.this.f21614x) && C6054N.this.f21610t != null && C6054N.this.f21577Z) {
                    C6054N.this.f21610t.mo25323k();
                }
            }
        }

        public n() {
            this.f21653b = new a(C6054N.this);
        }

        /* renamed from: a */
        public void m25265a(AudioTrack audioTrack) {
            Handler handler = this.f21652a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC6065Z(handler), this.f21653b);
        }

        /* renamed from: b */
        public void m25266b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f21653b);
            this.f21652a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: S */
    public static int m25167S(int i7, int i8, int i9) {
        int minBufferSize = AudioTrack.getMinBufferSize(i7, i8, i9);
        AbstractC5332a.m21802g(minBufferSize != -2);
        return minBufferSize;
    }

    /* renamed from: T */
    public static int m25168T(int i7, ByteBuffer byteBuffer) {
        if (i7 == 20) {
            return AbstractC0853K.m3549h(byteBuffer);
        }
        if (i7 != 30) {
            switch (i7) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int m3540m = AbstractC0851I.m3540m(AbstractC5330M.m21701P(byteBuffer, byteBuffer.position()));
                    if (m3540m != -1) {
                        return m3540m;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    return 2048;
                default:
                    switch (i7) {
                        case 14:
                            int m3590b = AbstractC0867b.m3590b(byteBuffer);
                            if (m3590b == -1) {
                                return 0;
                            }
                            return AbstractC0867b.m3597i(byteBuffer, m3590b) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return AbstractC0868c.m3601c(byteBuffer);
                        case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i7);
                    }
            }
            return AbstractC0867b.m3593e(byteBuffer);
        }
        return AbstractC0881p.m3679f(byteBuffer);
    }

    /* renamed from: Y */
    public static boolean m25169Y(int i7) {
        return (AbstractC5330M.f18800a >= 24 && i7 == -6) || i7 == -32;
    }

    /* renamed from: a0 */
    public static boolean m25170a0(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (AbstractC5330M.f18800a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m25172c0(AudioTrack audioTrack, final InterfaceC6097z.d dVar, Handler handler, final InterfaceC6097z.a aVar, C5337f c5337f) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: p0.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6097z.d.this.mo25317e(aVar);
                    }
                });
            }
            c5337f.m21825e();
            synchronized (f21549o0) {
                try {
                    int i7 = f21551q0 - 1;
                    f21551q0 = i7;
                    if (i7 == 0) {
                        f21550p0.shutdown();
                        f21550p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: p0.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6097z.d.this.mo25317e(aVar);
                    }
                });
            }
            c5337f.m21825e();
            synchronized (f21549o0) {
                try {
                    int i8 = f21551q0 - 1;
                    f21551q0 = i8;
                    if (i8 == 0) {
                        f21550p0.shutdown();
                        f21550p0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: k0 */
    public static void m25173k0(final AudioTrack audioTrack, final C5337f c5337f, final InterfaceC6097z.d dVar, final InterfaceC6097z.a aVar) {
        c5337f.m21823c();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f21549o0) {
            try {
                if (f21550p0 == null) {
                    f21550p0 = AbstractC5330M.m21694L0("ExoPlayer:AudioTrackReleaseThread");
                }
                f21551q0++;
                f21550p0.execute(new Runnable() { // from class: p0.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6054N.m25172c0(audioTrack, dVar, handler, aVar, c5337f);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p0 */
    public static void m25174p0(AudioTrack audioTrack, float f7) {
        audioTrack.setVolume(f7);
    }

    /* renamed from: q0 */
    public static void m25175q0(AudioTrack audioTrack, float f7) {
        audioTrack.setStereoVolume(f7, f7);
    }

    /* renamed from: w0 */
    public static int m25176w0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i7) {
        return audioTrack.write(byteBuffer, i7, 1);
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: A */
    public void mo25177A(boolean z6) {
        this.f21557F = z6;
        m25211m0(m25225u0() ? C4297C.f14765d : this.f21556E);
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: B */
    public void mo25178B(C4327q c4327q, int i7, int[] iArr) {
        C4475a c4475a;
        int i8;
        int i9;
        boolean z6;
        int i10;
        int intValue;
        int i11;
        boolean z7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int mo25235a;
        int[] iArr2;
        m25198f0();
        if ("audio/raw".equals(c4327q.f15138n)) {
            AbstractC5332a.m21796a(AbstractC5330M.m21674B0(c4327q.f15116D));
            i8 = AbstractC5330M.m21748i0(c4327q.f15116D, c4327q.f15114B);
            AbstractC3033v.a aVar = new AbstractC3033v.a();
            if (m25223t0(c4327q.f15116D)) {
                aVar.m11062j(this.f21590g);
            } else {
                aVar.m11062j(this.f21588f);
                aVar.m11061i(this.f21580b.mo19064e());
            }
            C4475a c4475a2 = new C4475a(aVar.m11063k());
            if (c4475a2.equals(this.f21613w)) {
                c4475a2 = this.f21613w;
            }
            this.f21586e.m25377n(c4327q.f15117E, c4327q.f15118F);
            if (AbstractC5330M.f18800a < 21 && c4327q.f15114B == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f21584d.m25146l(iArr2);
            try {
                InterfaceC4476b.a m19045a = c4475a2.m19045a(new InterfaceC4476b.a(c4327q));
                int i18 = m19045a.f15930c;
                int i19 = m19045a.f15928a;
                int m21697N = AbstractC5330M.m21697N(m19045a.f15929b);
                i12 = 0;
                z6 = false;
                i9 = AbstractC5330M.m21748i0(i18, m19045a.f15929b);
                c4475a = c4475a2;
                i10 = i19;
                intValue = m21697N;
                z7 = this.f21598k;
                i11 = i18;
            } catch (InterfaceC4476b.b e7) {
                throw new InterfaceC6097z.b(e7, c4327q);
            }
        } else {
            C4475a c4475a3 = new C4475a(AbstractC3033v.m11050t());
            int i20 = c4327q.f15115C;
            C6082k mo25229x = this.f21600l != 0 ? mo25229x(c4327q) : C6082k.f21741d;
            if (this.f21600l == 0 || !mo25229x.f21742a) {
                Pair m25361i = this.f21615y.m25361i(c4327q, this.f21553B);
                if (m25361i == null) {
                    throw new InterfaceC6097z.b("Unable to configure passthrough for: " + c4327q, c4327q);
                }
                int intValue2 = ((Integer) m25361i.first).intValue();
                c4475a = c4475a3;
                i8 = -1;
                i9 = -1;
                z6 = false;
                i10 = i20;
                intValue = ((Integer) m25361i.second).intValue();
                i11 = intValue2;
                z7 = this.f21598k;
                i12 = 2;
            } else {
                int m18413f = AbstractC4336z.m18413f((String) AbstractC5332a.m21800e(c4327q.f15138n), c4327q.f15134j);
                int m21697N2 = AbstractC5330M.m21697N(c4327q.f15114B);
                c4475a = c4475a3;
                i8 = -1;
                i9 = -1;
                i12 = 1;
                z7 = true;
                i10 = i20;
                z6 = mo25229x.f21743b;
                i11 = m18413f;
                intValue = m21697N2;
            }
        }
        if (i11 == 0) {
            throw new InterfaceC6097z.b("Invalid output encoding (mode=" + i12 + ") for: " + c4327q, c4327q);
        }
        if (intValue == 0) {
            throw new InterfaceC6097z.b("Invalid output channel config (mode=" + i12 + ") for: " + c4327q, c4327q);
        }
        int i21 = c4327q.f15133i;
        if ("audio/vnd.dts.hd;profile=lbr".equals(c4327q.f15138n) && i21 == -1) {
            i21 = 768000;
        }
        int i22 = i21;
        if (i7 != 0) {
            mo25235a = i7;
            i13 = i11;
            i14 = intValue;
            i15 = i9;
            i16 = i10;
        } else {
            i13 = i11;
            i14 = intValue;
            i15 = i9;
            i16 = i10;
            mo25235a = this.f21606p.mo25235a(m25167S(i10, intValue, i11), i11, i12, i9 != -1 ? i9 : 1, i10, i22, z7 ? 8.0d : 1.0d);
        }
        this.f21593h0 = false;
        g gVar = new g(c4327q, i8, i12, i15, i16, i14, i13, mo25235a, c4475a, z7, z6, this.f21587e0);
        if (m25189Z()) {
            this.f21611u = gVar;
        } else {
            this.f21612v = gVar;
        }
    }

    /* renamed from: M */
    public final void m25179M(long j7) {
        C4297C c4297c;
        if (m25225u0()) {
            c4297c = C4297C.f14765d;
        } else {
            c4297c = m25221s0() ? this.f21580b.mo19060a(this.f21556E) : C4297C.f14765d;
            this.f21556E = c4297c;
        }
        C4297C c4297c2 = c4297c;
        this.f21557F = m25221s0() ? this.f21580b.mo19063d(this.f21557F) : false;
        this.f21596j.add(new j(c4297c2, Math.max(0L, j7), this.f21612v.m25257i(m25186V())));
        m25219r0();
        InterfaceC6097z.d dVar = this.f21610t;
        if (dVar != null) {
            dVar.mo25315c(this.f21557F);
        }
    }

    /* renamed from: N */
    public final long m25180N(long j7) {
        while (!this.f21596j.isEmpty() && j7 >= ((j) this.f21596j.getFirst()).f21644c) {
            this.f21555D = (j) this.f21596j.remove();
        }
        long j8 = j7 - this.f21555D.f21644c;
        if (this.f21596j.isEmpty()) {
            return this.f21555D.f21643b + this.f21580b.mo19061b(j8);
        }
        j jVar = (j) this.f21596j.getFirst();
        return jVar.f21643b - AbstractC5330M.m21736e0(jVar.f21644c - j7, this.f21555D.f21642a.f14768a);
    }

    /* renamed from: O */
    public final long m25181O(long j7) {
        long mo19062c = this.f21580b.mo19062c();
        long m25257i = j7 + this.f21612v.m25257i(mo19062c);
        long j8 = this.f21599k0;
        if (mo19062c > j8) {
            long m25257i2 = this.f21612v.m25257i(mo19062c - j8);
            this.f21599k0 = mo19062c;
            m25187W(m25257i2);
        }
        return m25257i;
    }

    /* renamed from: P */
    public final AudioTrack m25182P(g gVar) {
        try {
            AudioTrack m25249a = gVar.m25249a(this.f21553B, this.f21581b0);
            InterfaceC5763w.a aVar = this.f21608r;
            if (aVar != null) {
                aVar.mo24095D(m25170a0(m25249a));
            }
            return m25249a;
        } catch (InterfaceC6097z.c e7) {
            InterfaceC6097z.d dVar = this.f21610t;
            if (dVar != null) {
                dVar.mo25316d(e7);
            }
            throw e7;
        }
    }

    /* renamed from: Q */
    public final AudioTrack m25183Q() {
        try {
            return m25182P((g) AbstractC5332a.m21800e(this.f21612v));
        } catch (InterfaceC6097z.c e7) {
            g gVar = this.f21612v;
            if (gVar.f21634h > 1000000) {
                g m25252d = gVar.m25252d(1000000);
                try {
                    AudioTrack m25182P = m25182P(m25252d);
                    this.f21612v = m25252d;
                    return m25182P;
                } catch (InterfaceC6097z.c e8) {
                    e7.addSuppressed(e8);
                    m25194d0();
                    throw e7;
                }
            }
            m25194d0();
            throw e7;
        }
    }

    /* renamed from: R */
    public final boolean m25184R() {
        if (!this.f21613w.m19050f()) {
            ByteBuffer byteBuffer = this.f21571T;
            if (byteBuffer == null) {
                return true;
            }
            m25227v0(byteBuffer, Long.MIN_VALUE);
            return this.f21571T == null;
        }
        this.f21613w.m19052h();
        m25204i0(Long.MIN_VALUE);
        if (!this.f21613w.m19049e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f21571T;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* renamed from: U */
    public final long m25185U() {
        return this.f21612v.f21629c == 0 ? this.f21560I / r0.f21628b : this.f21561J;
    }

    /* renamed from: V */
    public final long m25186V() {
        return this.f21612v.f21629c == 0 ? AbstractC5330M.m21756l(this.f21562K, r0.f21630d) : this.f21563L;
    }

    /* renamed from: W */
    public final void m25187W(long j7) {
        this.f21601l0 += j7;
        if (this.f21603m0 == null) {
            this.f21603m0 = new Handler(Looper.myLooper());
        }
        this.f21603m0.removeCallbacksAndMessages(null);
        this.f21603m0.postDelayed(new Runnable() { // from class: p0.K
            @Override // java.lang.Runnable
            public final void run() {
                C6054N.this.m25196e0();
            }
        }, 100L);
    }

    /* renamed from: X */
    public final boolean m25188X() {
        C6080i c6080i;
        C5912w1 c5912w1;
        if (!this.f21592h.m21824d()) {
            return false;
        }
        AudioTrack m25183Q = m25183Q();
        this.f21614x = m25183Q;
        if (m25170a0(m25183Q)) {
            m25206j0(this.f21614x);
            g gVar = this.f21612v;
            if (gVar.f21637k) {
                AudioTrack audioTrack = this.f21614x;
                C4327q c4327q = gVar.f21627a;
                audioTrack.setOffloadDelayPadding(c4327q.f15117E, c4327q.f15118F);
            }
        }
        int i7 = AbstractC5330M.f18800a;
        if (i7 >= 31 && (c5912w1 = this.f21609s) != null) {
            c.m25234a(this.f21614x, c5912w1);
        }
        this.f21581b0 = this.f21614x.getAudioSessionId();
        C6042B c6042b = this.f21594i;
        AudioTrack audioTrack2 = this.f21614x;
        g gVar2 = this.f21612v;
        c6042b.m25136s(audioTrack2, gVar2.f21629c == 2, gVar2.f21633g, gVar2.f21630d, gVar2.f21634h);
        m25215o0();
        int i8 = this.f21583c0.f15024a;
        if (i8 != 0) {
            this.f21614x.attachAuxEffect(i8);
            this.f21614x.setAuxEffectSendLevel(this.f21583c0.f15025b);
        }
        C6081j c6081j = this.f21585d0;
        if (c6081j != null && i7 >= 23) {
            b.m25233a(this.f21614x, c6081j);
            C6080i c6080i2 = this.f21616z;
            if (c6080i2 != null) {
                c6080i2.m25388i(this.f21585d0.f21740a);
            }
        }
        if (i7 >= 24 && (c6080i = this.f21616z) != null) {
            this.f21552A = new k(this.f21614x, c6080i);
        }
        this.f21566O = true;
        InterfaceC6097z.d dVar = this.f21610t;
        if (dVar != null) {
            dVar.mo25314b(this.f21612v.m25250b());
        }
        return true;
    }

    /* renamed from: Z */
    public final boolean m25189Z() {
        return this.f21614x != null;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: a */
    public boolean mo25190a(C4327q c4327q) {
        return mo25232z(c4327q) != 0;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: b */
    public void mo25191b(AudioDeviceInfo audioDeviceInfo) {
        this.f21585d0 = audioDeviceInfo == null ? null : new C6081j(audioDeviceInfo);
        C6080i c6080i = this.f21616z;
        if (c6080i != null) {
            c6080i.m25388i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f21614x;
        if (audioTrack != null) {
            b.m25233a(audioTrack, this.f21585d0);
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: c */
    public boolean mo25192c() {
        return !m25189Z() || (this.f21574W && !mo25205j());
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: d */
    public void mo25193d(C4297C c4297c) {
        this.f21556E = new C4297C(AbstractC5330M.m21764o(c4297c.f14768a, 0.1f, 8.0f), AbstractC5330M.m21764o(c4297c.f14769b, 0.1f, 8.0f));
        if (m25225u0()) {
            m25213n0();
        } else {
            m25211m0(c4297c);
        }
    }

    /* renamed from: d0 */
    public final void m25194d0() {
        if (this.f21612v.m25259m()) {
            this.f21593h0 = true;
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: e */
    public void mo25195e() {
        this.f21577Z = false;
        if (m25189Z()) {
            if (this.f21594i.m25133p() || m25170a0(this.f21614x)) {
                this.f21614x.pause();
            }
        }
    }

    /* renamed from: e0 */
    public final void m25196e0() {
        if (this.f21601l0 >= 300000) {
            this.f21610t.mo25318f();
            this.f21601l0 = 0L;
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: f */
    public void mo25197f() {
        if (!this.f21574W && m25189Z() && m25184R()) {
            m25202h0();
            this.f21574W = true;
        }
    }

    /* renamed from: f0 */
    public final void m25198f0() {
        if (this.f21616z != null || this.f21578a == null) {
            return;
        }
        this.f21597j0 = Looper.myLooper();
        C6080i c6080i = new C6080i(this.f21578a, new C6080i.f() { // from class: p0.L
            @Override // p311p0.C6080i.f
            /* renamed from: a */
            public final void mo25156a(C6074e c6074e) {
                C6054N.this.m25200g0(c6074e);
            }
        }, this.f21553B, this.f21585d0);
        this.f21616z = c6080i;
        this.f21615y = c6080i.m25386g();
    }

    @Override // p311p0.InterfaceC6097z
    public void flush() {
        k kVar;
        if (m25189Z()) {
            m25209l0();
            if (this.f21594i.m25127i()) {
                this.f21614x.pause();
            }
            if (m25170a0(this.f21614x)) {
                ((n) AbstractC5332a.m21800e(this.f21602m)).m25266b(this.f21614x);
            }
            int i7 = AbstractC5330M.f18800a;
            if (i7 < 21 && !this.f21579a0) {
                this.f21581b0 = 0;
            }
            InterfaceC6097z.a m25250b = this.f21612v.m25250b();
            g gVar = this.f21611u;
            if (gVar != null) {
                this.f21612v = gVar;
                this.f21611u = null;
            }
            this.f21594i.m25134q();
            if (i7 >= 24 && (kVar = this.f21552A) != null) {
                kVar.m25262c();
                this.f21552A = null;
            }
            m25173k0(this.f21614x, this.f21592h, this.f21610t, m25250b);
            this.f21614x = null;
        }
        this.f21605o.m25263a();
        this.f21604n.m25263a();
        this.f21599k0 = 0L;
        this.f21601l0 = 0L;
        Handler handler = this.f21603m0;
        if (handler != null) {
            ((Handler) AbstractC5332a.m21800e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: g */
    public void mo25199g(float f7) {
        if (this.f21568Q != f7) {
            this.f21568Q = f7;
            m25215o0();
        }
    }

    /* renamed from: g0 */
    public void m25200g0(C6074e c6074e) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21597j0;
        if (looper == myLooper) {
            if (c6074e.equals(this.f21615y)) {
                return;
            }
            this.f21615y = c6074e;
            InterfaceC6097z.d dVar = this.f21610t;
            if (dVar != null) {
                dVar.mo25321i();
                return;
            }
            return;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        throw new IllegalStateException("Current looper (" + (myLooper != null ? myLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: h */
    public void mo25201h() {
        this.f21577Z = true;
        if (m25189Z()) {
            this.f21594i.m25139v();
            this.f21614x.play();
        }
    }

    /* renamed from: h0 */
    public final void m25202h0() {
        if (this.f21575X) {
            return;
        }
        this.f21575X = true;
        this.f21594i.m25125g(m25186V());
        if (m25170a0(this.f21614x)) {
            this.f21576Y = false;
        }
        this.f21614x.stop();
        this.f21559H = 0;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: i */
    public C4297C mo25203i() {
        return this.f21556E;
    }

    /* renamed from: i0 */
    public final void m25204i0(long j7) {
        ByteBuffer m19048d;
        if (!this.f21613w.m19050f()) {
            ByteBuffer byteBuffer = this.f21569R;
            if (byteBuffer == null) {
                byteBuffer = InterfaceC4476b.f15926a;
            }
            m25227v0(byteBuffer, j7);
            return;
        }
        while (!this.f21613w.m19049e()) {
            do {
                m19048d = this.f21613w.m19048d();
                if (m19048d.hasRemaining()) {
                    m25227v0(m19048d, j7);
                } else {
                    ByteBuffer byteBuffer2 = this.f21569R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f21613w.m19053i(this.f21569R);
                    }
                }
            } while (!m19048d.hasRemaining());
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3.f21576Y != false) goto L13;
     */
    @Override // p311p0.InterfaceC6097z
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo25205j() {
        /*
            r3 = this;
            boolean r0 = r3.m25189Z()
            if (r0 == 0) goto L26
            int r0 = p259j0.AbstractC5330M.f18800a
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.f21614x
            boolean r0 = p311p0.AbstractC6049I.m25155a(r0)
            if (r0 == 0) goto L18
            boolean r0 = r3.f21576Y
            if (r0 != 0) goto L26
        L18:
            p0.B r0 = r3.f21594i
            long r1 = r3.m25186V()
            boolean r0 = r0.m25126h(r1)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p311p0.C6054N.mo25205j():boolean");
    }

    /* renamed from: j0 */
    public final void m25206j0(AudioTrack audioTrack) {
        if (this.f21602m == null) {
            this.f21602m = new n();
        }
        this.f21602m.m25265a(audioTrack);
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: k */
    public void mo25207k(C4315e c4315e) {
        if (this.f21583c0.equals(c4315e)) {
            return;
        }
        int i7 = c4315e.f15024a;
        float f7 = c4315e.f15025b;
        AudioTrack audioTrack = this.f21614x;
        if (audioTrack != null) {
            if (this.f21583c0.f15024a != i7) {
                audioTrack.attachAuxEffect(i7);
            }
            if (i7 != 0) {
                this.f21614x.setAuxEffectSendLevel(f7);
            }
        }
        this.f21583c0 = c4315e;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: l */
    public void mo25208l(int i7) {
        if (this.f21581b0 != i7) {
            this.f21581b0 = i7;
            this.f21579a0 = i7 != 0;
            flush();
        }
    }

    /* renamed from: l0 */
    public final void m25209l0() {
        this.f21560I = 0L;
        this.f21561J = 0L;
        this.f21562K = 0L;
        this.f21563L = 0L;
        this.f21595i0 = false;
        this.f21564M = 0;
        this.f21555D = new j(this.f21556E, 0L, 0L);
        this.f21567P = 0L;
        this.f21554C = null;
        this.f21596j.clear();
        this.f21569R = null;
        this.f21570S = 0;
        this.f21571T = null;
        this.f21575X = false;
        this.f21574W = false;
        this.f21576Y = false;
        this.f21558G = null;
        this.f21559H = 0;
        this.f21586e.m25376m();
        m25219r0();
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: m */
    public void mo25210m(int i7, int i8) {
        g gVar;
        AudioTrack audioTrack = this.f21614x;
        if (audioTrack == null || !m25170a0(audioTrack) || (gVar = this.f21612v) == null || !gVar.f21637k) {
            return;
        }
        this.f21614x.setOffloadDelayPadding(i7, i8);
    }

    /* renamed from: m0 */
    public final void m25211m0(C4297C c4297c) {
        j jVar = new j(c4297c, -9223372036854775807L, -9223372036854775807L);
        if (m25189Z()) {
            this.f21554C = jVar;
        } else {
            this.f21555D = jVar;
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: n */
    public void mo25212n(int i7) {
        AbstractC5332a.m21802g(AbstractC5330M.f18800a >= 29);
        this.f21600l = i7;
    }

    /* renamed from: n0 */
    public final void m25213n0() {
        if (m25189Z()) {
            try {
                this.f21614x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f21556E.f14768a).setPitch(this.f21556E.f14769b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                AbstractC5346o.m21868i("DefaultAudioSink", "Failed to set playback params", e7);
            }
            C4297C c4297c = new C4297C(this.f21614x.getPlaybackParams().getSpeed(), this.f21614x.getPlaybackParams().getPitch());
            this.f21556E = c4297c;
            this.f21594i.m25137t(c4297c.f14768a);
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: o */
    public long mo25214o(boolean z6) {
        if (!m25189Z() || this.f21566O) {
            return Long.MIN_VALUE;
        }
        return m25181O(m25180N(Math.min(this.f21594i.m25122d(z6), this.f21612v.m25257i(m25186V()))));
    }

    /* renamed from: o0 */
    public final void m25215o0() {
        if (m25189Z()) {
            if (AbstractC5330M.f18800a >= 21) {
                m25174p0(this.f21614x, this.f21568Q);
            } else {
                m25175q0(this.f21614x, this.f21568Q);
            }
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: p */
    public void mo25216p() {
        if (this.f21587e0) {
            this.f21587e0 = false;
            flush();
        }
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: q */
    public void mo25217q(C4312b c4312b) {
        if (this.f21553B.equals(c4312b)) {
            return;
        }
        this.f21553B = c4312b;
        if (this.f21587e0) {
            return;
        }
        C6080i c6080i = this.f21616z;
        if (c6080i != null) {
            c6080i.m25387h(c4312b);
        }
        flush();
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: r */
    public void mo25218r(InterfaceC5334c interfaceC5334c) {
        this.f21594i.m25138u(interfaceC5334c);
    }

    /* renamed from: r0 */
    public final void m25219r0() {
        C4475a c4475a = this.f21612v.f21635i;
        this.f21613w = c4475a;
        c4475a.m19046b();
    }

    @Override // p311p0.InterfaceC6097z
    public void release() {
        C6080i c6080i = this.f21616z;
        if (c6080i != null) {
            c6080i.m25389j();
        }
    }

    @Override // p311p0.InterfaceC6097z
    public void reset() {
        flush();
        AbstractC3010Y it = this.f21588f.iterator();
        while (it.hasNext()) {
            ((InterfaceC4476b) it.next()).reset();
        }
        AbstractC3010Y it2 = this.f21590g.iterator();
        while (it2.hasNext()) {
            ((InterfaceC4476b) it2.next()).reset();
        }
        C4475a c4475a = this.f21613w;
        if (c4475a != null) {
            c4475a.m19054j();
        }
        this.f21577Z = false;
        this.f21593h0 = false;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: s */
    public /* synthetic */ void mo25220s(long j7) {
        AbstractC6096y.m25437a(this, j7);
    }

    /* renamed from: s0 */
    public final boolean m25221s0() {
        if (!this.f21587e0) {
            g gVar = this.f21612v;
            if (gVar.f21629c == 0 && !m25223t0(gVar.f21627a.f15116D)) {
                return true;
            }
        }
        return false;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: t */
    public void mo25222t() {
        this.f21565N = true;
    }

    /* renamed from: t0 */
    public final boolean m25223t0(int i7) {
        return this.f21582c && AbstractC5330M.m21672A0(i7);
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: u */
    public void mo25224u(C5912w1 c5912w1) {
        this.f21609s = c5912w1;
    }

    /* renamed from: u0 */
    public final boolean m25225u0() {
        g gVar = this.f21612v;
        return gVar != null && gVar.f21636j && AbstractC5330M.f18800a >= 23;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: v */
    public void mo25226v(InterfaceC6097z.d dVar) {
        this.f21610t = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25227v0(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p311p0.C6054N.m25227v0(java.nio.ByteBuffer, long):void");
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: w */
    public void mo25228w() {
        AbstractC5332a.m21802g(AbstractC5330M.f18800a >= 21);
        AbstractC5332a.m21802g(this.f21579a0);
        if (this.f21587e0) {
            return;
        }
        this.f21587e0 = true;
        flush();
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: x */
    public C6082k mo25229x(C4327q c4327q) {
        return this.f21593h0 ? C6082k.f21741d : this.f21607q.mo25148a(c4327q, this.f21553B);
    }

    /* renamed from: x0 */
    public final int m25230x0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i7, long j7) {
        if (AbstractC5330M.f18800a >= 26) {
            return audioTrack.write(byteBuffer, i7, 1, j7 * 1000);
        }
        if (this.f21558G == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f21558G = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f21558G.putInt(1431633921);
        }
        if (this.f21559H == 0) {
            this.f21558G.putInt(4, i7);
            this.f21558G.putLong(8, j7 * 1000);
            this.f21558G.position(0);
            this.f21559H = i7;
        }
        int remaining = this.f21558G.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f21558G, remaining, 1);
            if (write < 0) {
                this.f21559H = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int m25176w0 = m25176w0(audioTrack, byteBuffer, i7);
        if (m25176w0 < 0) {
            this.f21559H = 0;
            return m25176w0;
        }
        this.f21559H -= m25176w0;
        return m25176w0;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: y */
    public boolean mo25231y(ByteBuffer byteBuffer, long j7, int i7) {
        ByteBuffer byteBuffer2 = this.f21569R;
        AbstractC5332a.m21796a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f21611u != null) {
            if (!m25184R()) {
                return false;
            }
            if (this.f21611u.m25251c(this.f21612v)) {
                this.f21612v = this.f21611u;
                this.f21611u = null;
                AudioTrack audioTrack = this.f21614x;
                if (audioTrack != null && m25170a0(audioTrack) && this.f21612v.f21637k) {
                    if (this.f21614x.getPlayState() == 3) {
                        this.f21614x.setOffloadEndOfStream();
                        this.f21594i.m25119a();
                    }
                    AudioTrack audioTrack2 = this.f21614x;
                    C4327q c4327q = this.f21612v.f21627a;
                    audioTrack2.setOffloadDelayPadding(c4327q.f15117E, c4327q.f15118F);
                    this.f21595i0 = true;
                }
            } else {
                m25202h0();
                if (mo25205j()) {
                    return false;
                }
                flush();
            }
            m25179M(j7);
        }
        if (!m25189Z()) {
            try {
                if (!m25188X()) {
                    return false;
                }
            } catch (InterfaceC6097z.c e7) {
                if (e7.f21787b) {
                    throw e7;
                }
                this.f21604n.m25264b(e7);
                return false;
            }
        }
        this.f21604n.m25263a();
        if (this.f21566O) {
            this.f21567P = Math.max(0L, j7);
            this.f21565N = false;
            this.f21566O = false;
            if (m25225u0()) {
                m25213n0();
            }
            m25179M(j7);
            if (this.f21577Z) {
                mo25201h();
            }
        }
        if (!this.f21594i.m25129k(m25186V())) {
            return false;
        }
        if (this.f21569R == null) {
            AbstractC5332a.m21796a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f21612v;
            if (gVar.f21629c != 0 && this.f21564M == 0) {
                int m25168T = m25168T(gVar.f21633g, byteBuffer);
                this.f21564M = m25168T;
                if (m25168T == 0) {
                    return true;
                }
            }
            if (this.f21554C != null) {
                if (!m25184R()) {
                    return false;
                }
                m25179M(j7);
                this.f21554C = null;
            }
            long m25258l = this.f21567P + this.f21612v.m25258l(m25185U() - this.f21586e.m25375l());
            if (!this.f21565N && Math.abs(m25258l - j7) > 200000) {
                InterfaceC6097z.d dVar = this.f21610t;
                if (dVar != null) {
                    dVar.mo25316d(new InterfaceC6097z.e(j7, m25258l));
                }
                this.f21565N = true;
            }
            if (this.f21565N) {
                if (!m25184R()) {
                    return false;
                }
                long j8 = j7 - m25258l;
                this.f21567P += j8;
                this.f21565N = false;
                m25179M(j7);
                InterfaceC6097z.d dVar2 = this.f21610t;
                if (dVar2 != null && j8 != 0) {
                    dVar2.mo25322j();
                }
            }
            if (this.f21612v.f21629c == 0) {
                this.f21560I += byteBuffer.remaining();
            } else {
                this.f21561J += this.f21564M * i7;
            }
            this.f21569R = byteBuffer;
            this.f21570S = i7;
        }
        m25204i0(j7);
        if (!this.f21569R.hasRemaining()) {
            this.f21569R = null;
            this.f21570S = 0;
            return true;
        }
        if (!this.f21594i.m25128j(m25186V())) {
            return false;
        }
        AbstractC5346o.m21867h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // p311p0.InterfaceC6097z
    /* renamed from: z */
    public int mo25232z(C4327q c4327q) {
        m25198f0();
        if (!"audio/raw".equals(c4327q.f15138n)) {
            return this.f21615y.m25362k(c4327q, this.f21553B) ? 2 : 0;
        }
        if (AbstractC5330M.m21674B0(c4327q.f15116D)) {
            int i7 = c4327q.f15116D;
            return (i7 == 2 || (this.f21582c && i7 == 4)) ? 2 : 1;
        }
        AbstractC5346o.m21867h("DefaultAudioSink", "Invalid PCM encoding: " + c4327q.f15116D);
        return 0;
    }

    public C6054N(f fVar) {
        Context context = fVar.f21618a;
        this.f21578a = context;
        C4312b c4312b = C4312b.f15006g;
        this.f21553B = c4312b;
        this.f21615y = context != null ? C6074e.m25356e(context, c4312b, null) : fVar.f21619b;
        this.f21580b = fVar.f21620c;
        int i7 = AbstractC5330M.f18800a;
        this.f21582c = i7 >= 21 && fVar.f21621d;
        this.f21598k = i7 >= 23 && fVar.f21622e;
        this.f21600l = 0;
        this.f21606p = fVar.f21624g;
        this.f21607q = (d) AbstractC5332a.m21800e(fVar.f21625h);
        C5337f c5337f = new C5337f(InterfaceC5334c.f18817a);
        this.f21592h = c5337f;
        c5337f.m21825e();
        this.f21594i = new C6042B(new m());
        C6043C c6043c = new C6043C();
        this.f21584d = c6043c;
        C6077f0 c6077f0 = new C6077f0();
        this.f21586e = c6077f0;
        this.f21588f = AbstractC3033v.m11053x(new C4481g(), c6043c, c6077f0);
        this.f21590g = AbstractC3033v.m11051u(new C6075e0());
        this.f21568Q = 1.0f;
        this.f21581b0 = 0;
        this.f21583c0 = new C4315e(0, 0.0f);
        C4297C c4297c = C4297C.f14765d;
        this.f21555D = new j(c4297c, 0L, 0L);
        this.f21556E = c4297c;
        this.f21557F = false;
        this.f21596j = new ArrayDeque();
        this.f21604n = new l(100L);
        this.f21605o = new l(100L);
        this.f21608r = fVar.f21626i;
    }
}
