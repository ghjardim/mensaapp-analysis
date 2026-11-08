package p292n0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p022D0.C0115A;
import p022D0.C0165m0;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0149e0;
import p036F0.InterfaceC0321h;
import p043G0.AbstractC0349D;
import p043G0.C0350E;
import p043G0.InterfaceC0375y;
import p050H0.InterfaceC0536e;
import p064J0.InterfaceC0675E;
import p064J0.InterfaceC0693p;
import p071K0.InterfaceC0820a;
import p178Z2.AbstractC3033v;
import p207d.AbstractC4094d;
import p232g0.AbstractC4303I;
import p232g0.AbstractC4316f;
import p232g0.AbstractC4332v;
import p232g0.C4297C;
import p232g0.C4306L;
import p232g0.C4310P;
import p232g0.C4312b;
import p232g0.C4322l;
import p232g0.C4326p;
import p232g0.C4327q;
import p232g0.C4329s;
import p232g0.C4331u;
import p232g0.C4333w;
import p232g0.C4334x;
import p232g0.InterfaceC4298D;
import p248i0.C4504b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5318A;
import p259j0.C5337f;
import p259j0.C5345n;
import p259j0.InterfaceC5334c;
import p259j0.InterfaceC5342k;
import p292n0.C5694Q0;
import p292n0.C5697S0;
import p292n0.C5715b;
import p292n0.C5719c0;
import p292n0.C5723d1;
import p292n0.C5743m;
import p292n0.C5752q0;
import p292n0.InterfaceC5763w;
import p300o0.C5906u1;
import p300o0.C5912w1;
import p300o0.InterfaceC5844a;
import p300o0.InterfaceC5850c;
import p311p0.InterfaceC6095x;
import p311p0.InterfaceC6097z;
import p373x0.InterfaceC6941b;

/* renamed from: n0.c0 */
/* loaded from: classes.dex */
public final class C5719c0 extends AbstractC4316f implements InterfaceC5763w {

    /* renamed from: A */
    public final C5715b f20668A;

    /* renamed from: B */
    public final C5743m f20669B;

    /* renamed from: C */
    public final C5723d1 f20670C;

    /* renamed from: D */
    public final C5729f1 f20671D;

    /* renamed from: E */
    public final C5732g1 f20672E;

    /* renamed from: F */
    public final long f20673F;

    /* renamed from: G */
    public AudioManager f20674G;

    /* renamed from: H */
    public final boolean f20675H;

    /* renamed from: I */
    public int f20676I;

    /* renamed from: J */
    public boolean f20677J;

    /* renamed from: K */
    public int f20678K;

    /* renamed from: L */
    public int f20679L;

    /* renamed from: M */
    public boolean f20680M;

    /* renamed from: N */
    public C5714a1 f20681N;

    /* renamed from: O */
    public InterfaceC0149e0 f20682O;

    /* renamed from: P */
    public InterfaceC5763w.c f20683P;

    /* renamed from: Q */
    public boolean f20684Q;

    /* renamed from: R */
    public InterfaceC4298D.b f20685R;

    /* renamed from: S */
    public C4333w f20686S;

    /* renamed from: T */
    public C4333w f20687T;

    /* renamed from: U */
    public C4327q f20688U;

    /* renamed from: V */
    public C4327q f20689V;

    /* renamed from: W */
    public AudioTrack f20690W;

    /* renamed from: X */
    public Object f20691X;

    /* renamed from: Y */
    public Surface f20692Y;

    /* renamed from: Z */
    public SurfaceHolder f20693Z;

    /* renamed from: a0 */
    public boolean f20694a0;

    /* renamed from: b */
    public final C0350E f20695b;

    /* renamed from: b0 */
    public TextureView f20696b0;

    /* renamed from: c */
    public final InterfaceC4298D.b f20697c;

    /* renamed from: c0 */
    public int f20698c0;

    /* renamed from: d */
    public final C5337f f20699d;

    /* renamed from: d0 */
    public int f20700d0;

    /* renamed from: e */
    public final Context f20701e;

    /* renamed from: e0 */
    public C5318A f20702e0;

    /* renamed from: f */
    public final InterfaceC4298D f20703f;

    /* renamed from: f0 */
    public C5747o f20704f0;

    /* renamed from: g */
    public final InterfaceC5703V0[] f20705g;

    /* renamed from: g0 */
    public C5747o f20706g0;

    /* renamed from: h */
    public final AbstractC0349D f20707h;

    /* renamed from: h0 */
    public int f20708h0;

    /* renamed from: i */
    public final InterfaceC5342k f20709i;

    /* renamed from: i0 */
    public C4312b f20710i0;

    /* renamed from: j */
    public final C5752q0.f f20711j;

    /* renamed from: j0 */
    public float f20712j0;

    /* renamed from: k */
    public final C5752q0 f20713k;

    /* renamed from: k0 */
    public boolean f20714k0;

    /* renamed from: l */
    public final C5345n f20715l;

    /* renamed from: l0 */
    public C4504b f20716l0;

    /* renamed from: m */
    public final CopyOnWriteArraySet f20717m;

    /* renamed from: m0 */
    public boolean f20718m0;

    /* renamed from: n */
    public final AbstractC4303I.b f20719n;

    /* renamed from: n0 */
    public boolean f20720n0;

    /* renamed from: o */
    public final List f20721o;

    /* renamed from: o0 */
    public int f20722o0;

    /* renamed from: p */
    public final boolean f20723p;

    /* renamed from: p0 */
    public boolean f20724p0;

    /* renamed from: q */
    public final InterfaceC0120F.a f20725q;

    /* renamed from: q0 */
    public boolean f20726q0;

    /* renamed from: r */
    public final InterfaceC5844a f20727r;

    /* renamed from: r0 */
    public C4322l f20728r0;

    /* renamed from: s */
    public final Looper f20729s;

    /* renamed from: s0 */
    public C4310P f20730s0;

    /* renamed from: t */
    public final InterfaceC0536e f20731t;

    /* renamed from: t0 */
    public C4333w f20732t0;

    /* renamed from: u */
    public final long f20733u;

    /* renamed from: u0 */
    public C5695R0 f20734u0;

    /* renamed from: v */
    public final long f20735v;

    /* renamed from: v0 */
    public int f20736v0;

    /* renamed from: w */
    public final long f20737w;

    /* renamed from: w0 */
    public int f20738w0;

    /* renamed from: x */
    public final InterfaceC5334c f20739x;

    /* renamed from: x0 */
    public long f20740x0;

    /* renamed from: y */
    public final d f20741y;

    /* renamed from: z */
    public final e f20742z;

    /* renamed from: n0.c0$b */
    public static final class b {
        /* renamed from: a */
        public static boolean m24075a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!AbstractC5330M.m21684G0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i7 = AbstractC5330M.f18800a;
                if (i7 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i7 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i7 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i7 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static void m24076b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* renamed from: n0.c0$c */
    public static final class c {
        /* renamed from: a */
        public static C5912w1 m24077a(Context context, C5719c0 c5719c0, boolean z6, String str) {
            LogSessionId logSessionId;
            C5906u1 m24849v0 = C5906u1.m24849v0(context);
            if (m24849v0 == null) {
                AbstractC5346o.m21867h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new C5912w1(logSessionId, str);
            }
            if (z6) {
                c5719c0.m24032Y0(m24849v0);
            }
            return new C5912w1(m24849v0.m24853C0(), str);
        }
    }

    /* renamed from: n0.c0$e */
    public static final class e implements InterfaceC0693p, InterfaceC0820a, C5697S0.b {

        /* renamed from: a */
        public InterfaceC0693p f20744a;

        /* renamed from: b */
        public InterfaceC0820a f20745b;

        /* renamed from: c */
        public InterfaceC0693p f20746c;

        /* renamed from: d */
        public InterfaceC0820a f20747d;

        public e() {
        }

        @Override // p292n0.C5697S0.b
        /* renamed from: A */
        public void mo2838A(int i7, Object obj) {
            if (i7 == 7) {
                this.f20744a = (InterfaceC0693p) obj;
                return;
            }
            if (i7 == 8) {
                this.f20745b = (InterfaceC0820a) obj;
            } else {
                if (i7 != 10000) {
                    return;
                }
                AbstractC4094d.m17162a(obj);
                this.f20746c = null;
                this.f20747d = null;
            }
        }

        @Override // p071K0.InterfaceC0820a
        /* renamed from: a */
        public void mo3436a(long j7, float[] fArr) {
            InterfaceC0820a interfaceC0820a = this.f20747d;
            if (interfaceC0820a != null) {
                interfaceC0820a.mo3436a(j7, fArr);
            }
            InterfaceC0820a interfaceC0820a2 = this.f20745b;
            if (interfaceC0820a2 != null) {
                interfaceC0820a2.mo3436a(j7, fArr);
            }
        }

        @Override // p071K0.InterfaceC0820a
        /* renamed from: d */
        public void mo3437d() {
            InterfaceC0820a interfaceC0820a = this.f20747d;
            if (interfaceC0820a != null) {
                interfaceC0820a.mo3437d();
            }
            InterfaceC0820a interfaceC0820a2 = this.f20745b;
            if (interfaceC0820a2 != null) {
                interfaceC0820a2.mo3437d();
            }
        }

        @Override // p064J0.InterfaceC0693p
        /* renamed from: i */
        public void mo2919i(long j7, long j8, C4327q c4327q, MediaFormat mediaFormat) {
            InterfaceC0693p interfaceC0693p = this.f20746c;
            if (interfaceC0693p != null) {
                interfaceC0693p.mo2919i(j7, j8, c4327q, mediaFormat);
            }
            InterfaceC0693p interfaceC0693p2 = this.f20744a;
            if (interfaceC0693p2 != null) {
                interfaceC0693p2.mo2919i(j7, j8, c4327q, mediaFormat);
            }
        }
    }

    /* renamed from: n0.c0$f */
    public static final class f implements InterfaceC5666C0 {

        /* renamed from: a */
        public final Object f20748a;

        /* renamed from: b */
        public final InterfaceC0120F f20749b;

        /* renamed from: c */
        public AbstractC4303I f20750c;

        public f(Object obj, C0115A c0115a) {
            this.f20748a = obj;
            this.f20749b = c0115a;
            this.f20750c = c0115a.m293Z();
        }

        @Override // p292n0.InterfaceC5666C0
        /* renamed from: a */
        public Object mo23794a() {
            return this.f20748a;
        }

        @Override // p292n0.InterfaceC5666C0
        /* renamed from: b */
        public AbstractC4303I mo23795b() {
            return this.f20750c;
        }

        /* renamed from: c */
        public void m24113c(AbstractC4303I abstractC4303I) {
            this.f20750c = abstractC4303I;
        }
    }

    /* renamed from: n0.c0$g */
    public final class g extends AudioDeviceCallback {
        public g() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (C5719c0.this.m24070u1() && C5719c0.this.f20734u0.f20600n == 3) {
                C5719c0 c5719c0 = C5719c0.this;
                c5719c0.m24061m2(c5719c0.f20734u0.f20598l, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (C5719c0.this.m24070u1()) {
                return;
            }
            C5719c0 c5719c0 = C5719c0.this;
            c5719c0.m24061m2(c5719c0.f20734u0.f20598l, 1, 3);
        }
    }

    static {
        AbstractC4332v.m18323a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5719c0(InterfaceC5763w.b bVar, InterfaceC4298D interfaceC4298D) {
        boolean z6;
        C5723d1 c5723d1;
        C5337f c5337f = new C5337f();
        this.f20699d = c5337f;
        try {
            AbstractC5346o.m21865f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + AbstractC5330M.f18804e + "]");
            Context applicationContext = bVar.f20995a.getApplicationContext();
            this.f20701e = applicationContext;
            InterfaceC5844a interfaceC5844a = (InterfaceC5844a) bVar.f21003i.apply(bVar.f20996b);
            this.f20727r = interfaceC5844a;
            this.f20722o0 = bVar.f21005k;
            this.f20710i0 = bVar.f21006l;
            this.f20698c0 = bVar.f21012r;
            this.f20700d0 = bVar.f21013s;
            this.f20714k0 = bVar.f21010p;
            this.f20673F = bVar.f20987A;
            d dVar = new d();
            this.f20741y = dVar;
            e eVar = new e();
            this.f20742z = eVar;
            Handler handler = new Handler(bVar.f21004j);
            InterfaceC5703V0[] mo23932a = ((InterfaceC5711Z0) bVar.f20998d.get()).mo23932a(handler, dVar, dVar, dVar, dVar);
            this.f20705g = mo23932a;
            AbstractC5332a.m21802g(mo23932a.length > 0);
            AbstractC0349D abstractC0349D = (AbstractC0349D) bVar.f21000f.get();
            this.f20707h = abstractC0349D;
            this.f20725q = (InterfaceC0120F.a) bVar.f20999e.get();
            InterfaceC0536e interfaceC0536e = (InterfaceC0536e) bVar.f21002h.get();
            this.f20731t = interfaceC0536e;
            this.f20723p = bVar.f21014t;
            this.f20681N = bVar.f21015u;
            this.f20733u = bVar.f21016v;
            this.f20735v = bVar.f21017w;
            this.f20737w = bVar.f21018x;
            this.f20684Q = bVar.f20988B;
            Looper looper = bVar.f21004j;
            this.f20729s = looper;
            InterfaceC5334c interfaceC5334c = bVar.f20996b;
            this.f20739x = interfaceC5334c;
            InterfaceC4298D interfaceC4298D2 = interfaceC4298D == null ? this : interfaceC4298D;
            this.f20703f = interfaceC4298D2;
            boolean z7 = bVar.f20992F;
            this.f20675H = z7;
            this.f20715l = new C5345n(looper, interfaceC5334c, new C5345n.b() { // from class: n0.N
                @Override // p259j0.C5345n.b
                /* renamed from: a */
                public final void mo21856a(Object obj, C4326p c4326p) {
                    C5719c0.this.m24073y1((InterfaceC4298D.d) obj, c4326p);
                }
            });
            this.f20717m = new CopyOnWriteArraySet();
            this.f20721o = new ArrayList();
            this.f20682O = new InterfaceC0149e0.a(0);
            this.f20683P = InterfaceC5763w.c.f21021b;
            C0350E c0350e = new C0350E(new C5709Y0[mo23932a.length], new InterfaceC0375y[mo23932a.length], C4306L.f14954b, null);
            this.f20695b = c0350e;
            this.f20719n = new AbstractC4303I.b();
            InterfaceC4298D.b m17994e = new InterfaceC4298D.b.a().m17992c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).m17993d(29, abstractC0349D.mo1379g()).m17993d(23, bVar.f21011q).m17993d(25, bVar.f21011q).m17993d(33, bVar.f21011q).m17993d(26, bVar.f21011q).m17993d(34, bVar.f21011q).m17994e();
            this.f20697c = m17994e;
            this.f20685R = new InterfaceC4298D.b.a().m17991b(m17994e).m17990a(4).m17990a(10).m17994e();
            this.f20709i = interfaceC5334c.mo21616e(looper, null);
            C5752q0.f fVar = new C5752q0.f() { // from class: n0.O
                @Override // p292n0.C5752q0.f
                /* renamed from: a */
                public final void mo23796a(C5752q0.e eVar2) {
                    C5719c0.this.m24026A1(eVar2);
                }
            };
            this.f20711j = fVar;
            this.f20734u0 = C5695R0.m23855k(c0350e);
            interfaceC5844a.mo24489Z(interfaceC4298D2, looper);
            int i7 = AbstractC5330M.f18800a;
            C5752q0 c5752q0 = new C5752q0(mo23932a, abstractC0349D, c0350e, (InterfaceC5760u0) bVar.f21001g.get(), interfaceC0536e, this.f20676I, this.f20677J, interfaceC5844a, this.f20681N, bVar.f21019y, bVar.f21020z, this.f20684Q, bVar.f20994H, looper, interfaceC5334c, fVar, i7 < 31 ? new C5912w1(bVar.f20993G) : c.m24077a(applicationContext, this, bVar.f20989C, bVar.f20993G), bVar.f20990D, this.f20683P);
            this.f20713k = c5752q0;
            this.f20712j0 = 1.0f;
            this.f20676I = 0;
            C4333w c4333w = C4333w.f15332H;
            this.f20686S = c4333w;
            this.f20687T = c4333w;
            this.f20732t0 = c4333w;
            this.f20736v0 = -1;
            if (i7 < 21) {
                z6 = false;
                this.f20708h0 = m24071v1(0);
            } else {
                z6 = false;
                this.f20708h0 = AbstractC5330M.m21691K(applicationContext);
            }
            this.f20716l0 = C4504b.f16125c;
            this.f20718m0 = true;
            mo17963N(interfaceC5844a);
            interfaceC0536e.mo2046b(new Handler(looper), interfaceC5844a);
            m24034Z0(dVar);
            long j7 = bVar.f20997c;
            if (j7 > 0) {
                c5752q0.m24208B(j7);
            }
            C5715b c5715b = new C5715b(bVar.f20995a, handler, dVar);
            this.f20668A = c5715b;
            c5715b.m23940b(bVar.f21009o);
            C5743m c5743m = new C5743m(bVar.f20995a, handler, dVar);
            this.f20669B = c5743m;
            c5743m.m24153m(bVar.f21007m ? this.f20710i0 : null);
            if (!z7 || i7 < 23) {
                c5723d1 = null;
            } else {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.f20674G = audioManager;
                c5723d1 = null;
                b.m24076b(audioManager, new g(), new Handler(looper));
            }
            if (bVar.f21011q) {
                C5723d1 c5723d12 = new C5723d1(bVar.f20995a, handler, dVar);
                this.f20670C = c5723d12;
                c5723d12.m24124h(AbstractC5330M.m21760m0(this.f20710i0.f15014c));
            } else {
                this.f20670C = c5723d1;
            }
            C5729f1 c5729f1 = new C5729f1(bVar.f20995a);
            this.f20671D = c5729f1;
            c5729f1.m24130a(bVar.f21008n != 0 ? true : z6);
            C5732g1 c5732g1 = new C5732g1(bVar.f20995a);
            this.f20672E = c5732g1;
            c5732g1.m24134a(bVar.f21008n == 2 ? true : z6);
            this.f20728r0 = m24001e1(this.f20670C);
            this.f20730s0 = C4310P.f14967e;
            this.f20702e0 = C5318A.f18783c;
            abstractC0349D.mo1381k(this.f20710i0);
            m24038a2(1, 10, Integer.valueOf(this.f20708h0));
            m24038a2(2, 10, Integer.valueOf(this.f20708h0));
            m24038a2(1, 3, this.f20710i0);
            m24038a2(2, 4, Integer.valueOf(this.f20698c0));
            m24038a2(2, 5, Integer.valueOf(this.f20700d0));
            m24038a2(1, 9, Boolean.valueOf(this.f20714k0));
            m24038a2(2, 7, eVar);
            m24038a2(6, 8, eVar);
            m24040b2(16, Integer.valueOf(this.f20722o0));
            c5337f.m21825e();
        } catch (Throwable th) {
            this.f20699d.m21825e();
            throw th;
        }
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m23952B1(InterfaceC4298D.d dVar) {
        dVar.mo14241M(C5759u.m24361d(new C5754r0(1), 1003));
    }

    /* renamed from: G1 */
    public static /* synthetic */ void m23961G1(C5695R0 c5695r0, int i7, InterfaceC4298D.d dVar) {
        dVar.mo14244R(c5695r0.f20587a, i7);
    }

    /* renamed from: H1 */
    public static /* synthetic */ void m23963H1(int i7, InterfaceC4298D.e eVar, InterfaceC4298D.e eVar2, InterfaceC4298D.d dVar) {
        dVar.mo14234C(i7);
        dVar.mo14259o0(eVar, eVar2, i7);
    }

    /* renamed from: J1 */
    public static /* synthetic */ void m23967J1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14242P(c5695r0.f20592f);
    }

    /* renamed from: K1 */
    public static /* synthetic */ void m23969K1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14241M(c5695r0.f20592f);
    }

    /* renamed from: L1 */
    public static /* synthetic */ void m23971L1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14253c0(c5695r0.f20595i.f1304d);
    }

    /* renamed from: N1 */
    public static /* synthetic */ void m23975N1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14233B(c5695r0.f20593g);
        dVar.mo14238G(c5695r0.f20593g);
    }

    /* renamed from: O1 */
    public static /* synthetic */ void m23977O1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14246V(c5695r0.f20598l, c5695r0.f20591e);
    }

    /* renamed from: P1 */
    public static /* synthetic */ void m23979P1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14240J(c5695r0.f20591e);
    }

    /* renamed from: Q1 */
    public static /* synthetic */ void m23981Q1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14251b0(c5695r0.f20598l, c5695r0.f20599m);
    }

    /* renamed from: R1 */
    public static /* synthetic */ void m23983R1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14232A(c5695r0.f20600n);
    }

    /* renamed from: S1 */
    public static /* synthetic */ void m23985S1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14261p0(c5695r0.m23868n());
    }

    /* renamed from: T1 */
    public static /* synthetic */ void m23987T1(C5695R0 c5695r0, InterfaceC4298D.d dVar) {
        dVar.mo14260p(c5695r0.f20601o);
    }

    /* renamed from: e1 */
    public static C4322l m24001e1(C5723d1 c5723d1) {
        return new C4322l.b(0).m18164g(c5723d1 != null ? c5723d1.m24122d() : 0).m18163f(c5723d1 != null ? c5723d1.m24121c() : 0).m18162e();
    }

    /* renamed from: o1 */
    public static int m24012o1(int i7) {
        return i7 == -1 ? 2 : 1;
    }

    /* renamed from: s1 */
    public static long m24017s1(C5695R0 c5695r0) {
        AbstractC4303I.c cVar = new AbstractC4303I.c();
        AbstractC4303I.b bVar = new AbstractC4303I.b();
        c5695r0.f20587a.mo18028h(c5695r0.f20588b.f367a, bVar);
        return c5695r0.f20589c == -9223372036854775807L ? c5695r0.f20587a.m18031n(bVar.f14811c, cVar).m18056c() : bVar.m18047n() + c5695r0.f20589c;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: A */
    public int mo17950A() {
        m24066p2();
        return this.f20734u0.f20591e;
    }

    /* renamed from: A1 */
    public final /* synthetic */ void m24026A1(final C5752q0.e eVar) {
        this.f20709i.mo21622b(new Runnable() { // from class: n0.S
            @Override // java.lang.Runnable
            public final void run() {
                C5719c0.this.m24074z1(eVar);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: B */
    public C4306L mo17951B() {
        m24066p2();
        return this.f20734u0.f20595i.f1304d;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: E */
    public int mo17954E() {
        m24066p2();
        if (mo17972j()) {
            return this.f20734u0.f20588b.f368b;
        }
        return -1;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: F */
    public int mo17955F() {
        m24066p2();
        int m24062n1 = m24062n1(this.f20734u0);
        if (m24062n1 == -1) {
            return 0;
        }
        return m24062n1;
    }

    /* renamed from: F1 */
    public final /* synthetic */ void m24027F1(InterfaceC4298D.d dVar) {
        dVar.mo14255f0(this.f20685R);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: G */
    public void mo17956G(final int i7) {
        m24066p2();
        if (this.f20676I != i7) {
            this.f20676I = i7;
            this.f20713k.m24262f1(i7);
            this.f20715l.m21852i(8, new C5345n.a() { // from class: n0.M
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14248X(i7);
                }
            });
            m24055j2();
            this.f20715l.m21850f();
        }
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: I */
    public int mo17958I() {
        m24066p2();
        return this.f20734u0.f20600n;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: J */
    public int mo17959J() {
        m24066p2();
        return this.f20676I;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: K */
    public long mo17960K() {
        m24066p2();
        if (!mo17972j()) {
            return m18136b();
        }
        C5695R0 c5695r0 = this.f20734u0;
        InterfaceC0120F.b bVar = c5695r0.f20588b;
        c5695r0.f20587a.mo18028h(bVar.f367a, this.f20719n);
        return AbstractC5330M.m21758l1(this.f20719n.m18035b(bVar.f368b, bVar.f369c));
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: L */
    public AbstractC4303I mo17961L() {
        m24066p2();
        return this.f20734u0.f20587a;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: M */
    public boolean mo17962M() {
        m24066p2();
        return this.f20677J;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: N */
    public void mo17963N(InterfaceC4298D.d dVar) {
        this.f20715l.m21847c((InterfaceC4298D.d) AbstractC5332a.m21800e(dVar));
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: O */
    public long mo17964O() {
        m24066p2();
        return AbstractC5330M.m21758l1(m24060m1(this.f20734u0));
    }

    @Override // p232g0.AbstractC4316f
    /* renamed from: S */
    public void mo18132S(int i7, long j7, int i8, boolean z6) {
        m24066p2();
        if (i7 == -1) {
            return;
        }
        AbstractC5332a.m21796a(i7 >= 0);
        AbstractC4303I abstractC4303I = this.f20734u0.f20587a;
        if (abstractC4303I.m18032q() || i7 < abstractC4303I.mo308p()) {
            this.f20727r.mo24487N();
            this.f20678K++;
            if (mo17972j()) {
                AbstractC5346o.m21867h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C5752q0.e eVar = new C5752q0.e(this.f20734u0);
                eVar.m24321b(1);
                this.f20711j.mo23796a(eVar);
                return;
            }
            C5695R0 c5695r0 = this.f20734u0;
            int i9 = c5695r0.f20591e;
            if (i9 == 3 || (i9 == 4 && !abstractC4303I.m18032q())) {
                c5695r0 = this.f20734u0.m23864h(2);
            }
            int mo17955F = mo17955F();
            C5695R0 m24028U1 = m24028U1(c5695r0, abstractC4303I, m24029V1(abstractC4303I, i7, j7));
            this.f20713k.m24223K0(abstractC4303I, i7, AbstractC5330M.m21692K0(j7));
            m24059l2(m24028U1, 0, true, 1, m24060m1(m24028U1), mo17955F, z6);
        }
    }

    /* renamed from: U1 */
    public final C5695R0 m24028U1(C5695R0 c5695r0, AbstractC4303I abstractC4303I, Pair pair) {
        AbstractC5332a.m21796a(abstractC4303I.m18032q() || pair != null);
        AbstractC4303I abstractC4303I2 = c5695r0.f20587a;
        long m24058l1 = m24058l1(c5695r0);
        C5695R0 m23866j = c5695r0.m23866j(abstractC4303I);
        if (abstractC4303I.m18032q()) {
            InterfaceC0120F.b m23856l = C5695R0.m23856l();
            long m21692K0 = AbstractC5330M.m21692K0(this.f20740x0);
            C5695R0 m23859c = m23866j.m23860d(m23856l, m21692K0, m21692K0, m21692K0, 0L, C0165m0.f683d, this.f20695b, AbstractC3033v.m11050t()).m23859c(m23856l);
            m23859c.f20603q = m23859c.f20605s;
            return m23859c;
        }
        Object obj = m23866j.f20588b.f367a;
        boolean equals = obj.equals(((Pair) AbstractC5330M.m21747i(pair)).first);
        InterfaceC0120F.b bVar = !equals ? new InterfaceC0120F.b(pair.first) : m23866j.f20588b;
        long longValue = ((Long) pair.second).longValue();
        long m21692K02 = AbstractC5330M.m21692K0(m24058l1);
        if (!abstractC4303I2.m18032q()) {
            m21692K02 -= abstractC4303I2.mo18028h(obj, this.f20719n).m18047n();
        }
        if (!equals || longValue < m21692K02) {
            AbstractC5332a.m21802g(!bVar.m345b());
            C5695R0 m23859c2 = m23866j.m23860d(bVar, longValue, longValue, longValue, 0L, !equals ? C0165m0.f683d : m23866j.f20594h, !equals ? this.f20695b : m23866j.f20595i, !equals ? AbstractC3033v.m11050t() : m23866j.f20596j).m23859c(bVar);
            m23859c2.f20603q = longValue;
            return m23859c2;
        }
        if (longValue == m21692K02) {
            int mo302b = abstractC4303I.mo302b(m23866j.f20597k.f367a);
            if (mo302b == -1 || abstractC4303I.m18027f(mo302b, this.f20719n).f14811c != abstractC4303I.mo18028h(bVar.f367a, this.f20719n).f14811c) {
                abstractC4303I.mo18028h(bVar.f367a, this.f20719n);
                long m18035b = bVar.m345b() ? this.f20719n.m18035b(bVar.f368b, bVar.f369c) : this.f20719n.f14812d;
                m23866j = m23866j.m23860d(bVar, m23866j.f20605s, m23866j.f20605s, m23866j.f20590d, m18035b - m23866j.f20605s, m23866j.f20594h, m23866j.f20595i, m23866j.f20596j).m23859c(bVar);
                m23866j.f20603q = m18035b;
            }
        } else {
            AbstractC5332a.m21802g(!bVar.m345b());
            long max = Math.max(0L, m23866j.f20604r - (longValue - m21692K02));
            long j7 = m23866j.f20603q;
            if (m23866j.f20597k.equals(m23866j.f20588b)) {
                j7 = longValue + max;
            }
            m23866j = m23866j.m23860d(bVar, longValue, longValue, longValue, max, m23866j.f20594h, m23866j.f20595i, m23866j.f20596j);
            m23866j.f20603q = j7;
        }
        return m23866j;
    }

    /* renamed from: V1 */
    public final Pair m24029V1(AbstractC4303I abstractC4303I, int i7, long j7) {
        if (abstractC4303I.m18032q()) {
            this.f20736v0 = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.f20740x0 = j7;
            this.f20738w0 = 0;
            return null;
        }
        if (i7 == -1 || i7 >= abstractC4303I.mo308p()) {
            i7 = abstractC4303I.mo707a(this.f20677J);
            j7 = abstractC4303I.m18031n(i7, this.f15026a).m18055b();
        }
        return abstractC4303I.m18029j(this.f15026a, this.f20719n, i7, AbstractC5330M.m21692K0(j7));
    }

    /* renamed from: W1 */
    public final void m24030W1(final int i7, final int i8) {
        if (i7 == this.f20702e0.m21611b() && i8 == this.f20702e0.m21610a()) {
            return;
        }
        this.f20702e0 = new C5318A(i7, i8);
        this.f20715l.m21854k(24, new C5345n.a() { // from class: n0.K
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC4298D.d) obj).mo14257k0(i7, i8);
            }
        });
        m24038a2(2, 14, new C5318A(i7, i8));
    }

    /* renamed from: X1 */
    public final long m24031X1(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar, long j7) {
        abstractC4303I.mo18028h(bVar.f367a, this.f20719n);
        return j7 + this.f20719n.m18047n();
    }

    /* renamed from: Y0 */
    public void m24032Y0(InterfaceC5850c interfaceC5850c) {
        this.f20727r.mo24488U((InterfaceC5850c) AbstractC5332a.m21800e(interfaceC5850c));
    }

    /* renamed from: Y1 */
    public final void m24033Y1(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            this.f20721o.remove(i9);
        }
        this.f20682O = this.f20682O.mo599b(i7, i8);
    }

    /* renamed from: Z0 */
    public void m24034Z0(InterfaceC5763w.a aVar) {
        this.f20717m.add(aVar);
    }

    /* renamed from: Z1 */
    public final void m24035Z1() {
        TextureView textureView = this.f20696b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f20741y) {
                AbstractC5346o.m21867h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f20696b0.setSurfaceTextureListener(null);
            }
            this.f20696b0 = null;
        }
        SurfaceHolder surfaceHolder = this.f20693Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f20741y);
            this.f20693Z = null;
        }
    }

    @Override // p292n0.InterfaceC5763w
    /* renamed from: a */
    public C4327q mo24036a() {
        m24066p2();
        return this.f20688U;
    }

    /* renamed from: a1 */
    public final List m24037a1(int i7, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            C5694Q0.c cVar = new C5694Q0.c((InterfaceC0120F) list.get(i8), this.f20723p);
            arrayList.add(cVar);
            this.f20721o.add(i8 + i7, new f(cVar.f20582b, cVar.f20581a));
        }
        this.f20682O = this.f20682O.mo603f(i7, arrayList.size());
        return arrayList;
    }

    /* renamed from: a2 */
    public final void m24038a2(int i7, int i8, Object obj) {
        for (InterfaceC5703V0 interfaceC5703V0 : this.f20705g) {
            if (i7 == -1 || interfaceC5703V0.mo23907j() == i7) {
                m24050h1(interfaceC5703V0).m23883n(i8).m23882m(obj).m23881l();
            }
        }
    }

    /* renamed from: b1 */
    public final C4333w m24039b1() {
        AbstractC4303I mo17961L = mo17961L();
        if (mo17961L.m18032q()) {
            return this.f20732t0;
        }
        return this.f20732t0.m18327a().m18364K(mo17961L.m18031n(mo17955F(), this.f15026a).f14834c.f15215e).m18362I();
    }

    /* renamed from: b2 */
    public final void m24040b2(int i7, Object obj) {
        m24038a2(-1, i7, obj);
    }

    /* renamed from: c1 */
    public void m24041c1() {
        m24066p2();
        m24035Z1();
        m24049g2(null);
        m24030W1(0, 0);
    }

    /* renamed from: c2 */
    public final void m24042c2() {
        m24038a2(1, 2, Float.valueOf(this.f20712j0 * this.f20669B.m24147g()));
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: d */
    public void mo17966d(C4297C c4297c) {
        m24066p2();
        if (c4297c == null) {
            c4297c = C4297C.f14765d;
        }
        if (this.f20734u0.f20601o.equals(c4297c)) {
            return;
        }
        C5695R0 m23863g = this.f20734u0.m23863g(c4297c);
        this.f20678K++;
        this.f20713k.m24256c1(c4297c);
        m24059l2(m23863g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: d1 */
    public final int m24043d1(boolean z6, int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (!this.f20675H) {
            return 0;
        }
        if (!z6 || m24070u1()) {
            return (z6 || this.f20734u0.f20600n != 3) ? 0 : 3;
        }
        return 3;
    }

    /* renamed from: d2 */
    public void m24044d2(List list, boolean z6) {
        m24066p2();
        m24045e2(list, -1, -9223372036854775807L, z6);
    }

    /* renamed from: e2 */
    public final void m24045e2(List list, int i7, long j7, boolean z6) {
        int i8;
        long j8;
        int m24062n1 = m24062n1(this.f20734u0);
        long mo17964O = mo17964O();
        this.f20678K++;
        if (!this.f20721o.isEmpty()) {
            m24033Y1(0, this.f20721o.size());
        }
        List m24037a1 = m24037a1(0, list);
        AbstractC4303I m24046f1 = m24046f1();
        if (!m24046f1.m18032q() && i7 >= m24046f1.mo308p()) {
            throw new C4329s(m24046f1, i7, j7);
        }
        if (z6) {
            j8 = -9223372036854775807L;
            i8 = m24046f1.mo707a(this.f20677J);
        } else if (i7 == -1) {
            i8 = m24062n1;
            j8 = mo17964O;
        } else {
            i8 = i7;
            j8 = j7;
        }
        C5695R0 m24028U1 = m24028U1(this.f20734u0, m24046f1, m24029V1(m24046f1, i8, j8));
        int i9 = m24028U1.f20591e;
        if (i8 != -1 && i9 != 1) {
            i9 = (m24046f1.m18032q() || i8 >= m24046f1.mo308p()) ? 4 : 2;
        }
        C5695R0 m23864h = m24028U1.m23864h(i9);
        this.f20713k.m24247X0(m24037a1, i8, AbstractC5330M.m21692K0(j8), this.f20682O);
        m24059l2(m23864h, 0, (this.f20734u0.f20588b.f367a.equals(m23864h.f20588b.f367a) || this.f20734u0.f20587a.m18032q()) ? false : true, 4, m24060m1(m23864h), -1, false);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: f */
    public void mo17968f() {
        m24066p2();
        boolean mo17974l = mo17974l();
        int m24156p = this.f20669B.m24156p(mo17974l, 2);
        m24057k2(mo17974l, m24156p, m24012o1(m24156p));
        C5695R0 c5695r0 = this.f20734u0;
        if (c5695r0.f20591e != 1) {
            return;
        }
        C5695R0 m23862f = c5695r0.m23862f(null);
        C5695R0 m23864h = m23862f.m23864h(m23862f.f20587a.m18032q() ? 4 : 2);
        this.f20678K++;
        this.f20713k.m24288r0();
        m24059l2(m23864h, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: f1 */
    public final AbstractC4303I m24046f1() {
        return new C5699T0(this.f20721o, this.f20682O);
    }

    /* renamed from: f2 */
    public final void m24047f2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m24049g2(surface);
        this.f20692Y = surface;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: g */
    public void mo17969g(float f7) {
        m24066p2();
        final float m21764o = AbstractC5330M.m21764o(f7, 0.0f, 1.0f);
        if (this.f20712j0 == m21764o) {
            return;
        }
        this.f20712j0 = m21764o;
        m24042c2();
        this.f20715l.m21854k(22, new C5345n.a() { // from class: n0.J
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC4298D.d) obj).mo14239H(m21764o);
            }
        });
    }

    /* renamed from: g1 */
    public final List m24048g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.f20725q.mo343e((C4331u) list.get(i7)));
        }
        return arrayList;
    }

    /* renamed from: g2 */
    public final void m24049g2(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (InterfaceC5703V0 interfaceC5703V0 : this.f20705g) {
            if (interfaceC5703V0.mo23907j() == 2) {
                arrayList.add(m24050h1(interfaceC5703V0).m23883n(1).m23882m(obj).m23881l());
            }
        }
        Object obj2 = this.f20691X;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5697S0) it.next()).m23870a(this.f20673F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z6 = true;
            }
            Object obj3 = this.f20691X;
            Surface surface = this.f20692Y;
            if (obj3 == surface) {
                surface.release();
                this.f20692Y = null;
            }
        }
        this.f20691X = obj;
        if (z6) {
            m24053i2(C5759u.m24361d(new C5754r0(3), 1003));
        }
    }

    /* renamed from: h1 */
    public final C5697S0 m24050h1(C5697S0.b bVar) {
        int m24062n1 = m24062n1(this.f20734u0);
        C5752q0 c5752q0 = this.f20713k;
        AbstractC4303I abstractC4303I = this.f20734u0.f20587a;
        if (m24062n1 == -1) {
            m24062n1 = 0;
        }
        return new C5697S0(c5752q0, bVar, abstractC4303I, m24062n1, this.f20739x, c5752q0.m24219I());
    }

    /* renamed from: h2 */
    public void m24051h2(SurfaceHolder surfaceHolder) {
        m24066p2();
        if (surfaceHolder == null) {
            m24041c1();
            return;
        }
        m24035Z1();
        this.f20694a0 = true;
        this.f20693Z = surfaceHolder;
        surfaceHolder.addCallback(this.f20741y);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m24049g2(null);
            m24030W1(0, 0);
        } else {
            m24049g2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m24030W1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: i */
    public void mo17971i(Surface surface) {
        m24066p2();
        m24035Z1();
        m24049g2(surface);
        int i7 = surface == null ? 0 : -1;
        m24030W1(i7, i7);
    }

    /* renamed from: i1 */
    public final Pair m24052i1(C5695R0 c5695r0, C5695R0 c5695r02, boolean z6, int i7, boolean z7, boolean z8) {
        AbstractC4303I abstractC4303I = c5695r02.f20587a;
        AbstractC4303I abstractC4303I2 = c5695r0.f20587a;
        if (abstractC4303I2.m18032q() && abstractC4303I.m18032q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i8 = 3;
        if (abstractC4303I2.m18032q() != abstractC4303I.m18032q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (abstractC4303I.m18031n(abstractC4303I.mo18028h(c5695r02.f20588b.f367a, this.f20719n).f14811c, this.f15026a).f14832a.equals(abstractC4303I2.m18031n(abstractC4303I2.mo18028h(c5695r0.f20588b.f367a, this.f20719n).f14811c, this.f15026a).f14832a)) {
            return (z6 && i7 == 0 && c5695r02.f20588b.f370d < c5695r0.f20588b.f370d) ? new Pair(Boolean.TRUE, 0) : (z6 && i7 == 1 && z8) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z6 && i7 == 0) {
            i8 = 1;
        } else if (z6 && i7 == 1) {
            i8 = 2;
        } else if (!z7) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i8));
    }

    /* renamed from: i2 */
    public final void m24053i2(C5759u c5759u) {
        C5695R0 c5695r0 = this.f20734u0;
        C5695R0 m23859c = c5695r0.m23859c(c5695r0.f20588b);
        m23859c.f20603q = m23859c.f20605s;
        m23859c.f20604r = 0L;
        C5695R0 m23864h = m23859c.m23864h(1);
        if (c5759u != null) {
            m23864h = m23864h.m23862f(c5759u);
        }
        this.f20678K++;
        this.f20713k.m24289r1();
        m24059l2(m23864h, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: j */
    public boolean mo17972j() {
        m24066p2();
        return this.f20734u0.f20588b.m345b();
    }

    /* renamed from: j1 */
    public Looper m24054j1() {
        return this.f20729s;
    }

    /* renamed from: j2 */
    public final void m24055j2() {
        InterfaceC4298D.b bVar = this.f20685R;
        InterfaceC4298D.b m21699O = AbstractC5330M.m21699O(this.f20703f, this.f20697c);
        this.f20685R = m21699O;
        if (m21699O.equals(bVar)) {
            return;
        }
        this.f20715l.m21852i(13, new C5345n.a() { // from class: n0.T
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                C5719c0.this.m24027F1((InterfaceC4298D.d) obj);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: k */
    public long mo17973k() {
        m24066p2();
        return AbstractC5330M.m21758l1(this.f20734u0.f20604r);
    }

    /* renamed from: k1 */
    public long m24056k1() {
        m24066p2();
        if (this.f20734u0.f20587a.m18032q()) {
            return this.f20740x0;
        }
        C5695R0 c5695r0 = this.f20734u0;
        if (c5695r0.f20597k.f370d != c5695r0.f20588b.f370d) {
            return c5695r0.f20587a.m18031n(mo17955F(), this.f15026a).m18057d();
        }
        long j7 = c5695r0.f20603q;
        if (this.f20734u0.f20597k.m345b()) {
            C5695R0 c5695r02 = this.f20734u0;
            AbstractC4303I.b mo18028h = c5695r02.f20587a.mo18028h(c5695r02.f20597k.f367a, this.f20719n);
            long m18039f = mo18028h.m18039f(this.f20734u0.f20597k.f368b);
            j7 = m18039f == Long.MIN_VALUE ? mo18028h.f14812d : m18039f;
        }
        C5695R0 c5695r03 = this.f20734u0;
        return AbstractC5330M.m21758l1(m24031X1(c5695r03.f20587a, c5695r03.f20597k, j7));
    }

    /* renamed from: k2 */
    public final void m24057k2(boolean z6, int i7, int i8) {
        boolean z7 = z6 && i7 != -1;
        int m24043d1 = m24043d1(z7, i7);
        C5695R0 c5695r0 = this.f20734u0;
        if (c5695r0.f20598l == z7 && c5695r0.f20600n == m24043d1 && c5695r0.f20599m == i8) {
            return;
        }
        m24061m2(z7, i8, m24043d1);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: l */
    public boolean mo17974l() {
        m24066p2();
        return this.f20734u0.f20598l;
    }

    /* renamed from: l1 */
    public final long m24058l1(C5695R0 c5695r0) {
        if (!c5695r0.f20588b.m345b()) {
            return AbstractC5330M.m21758l1(m24060m1(c5695r0));
        }
        c5695r0.f20587a.mo18028h(c5695r0.f20588b.f367a, this.f20719n);
        return c5695r0.f20589c == -9223372036854775807L ? c5695r0.f20587a.m18031n(m24062n1(c5695r0), this.f15026a).m18055b() : this.f20719n.m18046m() + AbstractC5330M.m21758l1(c5695r0.f20589c);
    }

    /* renamed from: l2 */
    public final void m24059l2(final C5695R0 c5695r0, final int i7, boolean z6, final int i8, long j7, int i9, boolean z7) {
        C5695R0 c5695r02 = this.f20734u0;
        this.f20734u0 = c5695r0;
        boolean equals = c5695r02.f20587a.equals(c5695r0.f20587a);
        Pair m24052i1 = m24052i1(c5695r0, c5695r02, z6, i8, !equals, z7);
        boolean booleanValue = ((Boolean) m24052i1.first).booleanValue();
        final int intValue = ((Integer) m24052i1.second).intValue();
        if (booleanValue) {
            r2 = c5695r0.f20587a.m18032q() ? null : c5695r0.f20587a.m18031n(c5695r0.f20587a.mo18028h(c5695r0.f20588b.f367a, this.f20719n).f14811c, this.f15026a).f14834c;
            this.f20732t0 = C4333w.f15332H;
        }
        if (booleanValue || !c5695r02.f20596j.equals(c5695r0.f20596j)) {
            this.f20732t0 = this.f20732t0.m18327a().m18366M(c5695r0.f20596j).m18362I();
        }
        C4333w m24039b1 = m24039b1();
        boolean equals2 = m24039b1.equals(this.f20686S);
        this.f20686S = m24039b1;
        boolean z8 = c5695r02.f20598l != c5695r0.f20598l;
        boolean z9 = c5695r02.f20591e != c5695r0.f20591e;
        if (z9 || z8) {
            m24064o2();
        }
        boolean z10 = c5695r02.f20593g;
        boolean z11 = c5695r0.f20593g;
        boolean z12 = z10 != z11;
        if (z12) {
            m24063n2(z11);
        }
        if (!equals) {
            this.f20715l.m21852i(0, new C5345n.a() { // from class: n0.E
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23961G1(C5695R0.this, i7, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (z6) {
            final InterfaceC4298D.e m24068r1 = m24068r1(i8, c5695r02, i9);
            final InterfaceC4298D.e m24067q1 = m24067q1(j7);
            this.f20715l.m21852i(11, new C5345n.a() { // from class: n0.X
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23963H1(i8, m24068r1, m24067q1, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f20715l.m21852i(1, new C5345n.a() { // from class: n0.Y
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14247W(C4331u.this, intValue);
                }
            });
        }
        if (c5695r02.f20592f != c5695r0.f20592f) {
            this.f20715l.m21852i(10, new C5345n.a() { // from class: n0.Z
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23967J1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
            if (c5695r0.f20592f != null) {
                this.f20715l.m21852i(10, new C5345n.a() { // from class: n0.a0
                    @Override // p259j0.C5345n.a
                    public final void invoke(Object obj) {
                        C5719c0.m23969K1(C5695R0.this, (InterfaceC4298D.d) obj);
                    }
                });
            }
        }
        C0350E c0350e = c5695r02.f20595i;
        C0350E c0350e2 = c5695r0.f20595i;
        if (c0350e != c0350e2) {
            this.f20707h.mo1360h(c0350e2.f1305e);
            this.f20715l.m21852i(2, new C5345n.a() { // from class: n0.b0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23971L1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (!equals2) {
            final C4333w c4333w = this.f20686S;
            this.f20715l.m21852i(14, new C5345n.a() { // from class: n0.F
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14254e0(C4333w.this);
                }
            });
        }
        if (z12) {
            this.f20715l.m21852i(3, new C5345n.a() { // from class: n0.G
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23975N1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (z9 || z8) {
            this.f20715l.m21852i(-1, new C5345n.a() { // from class: n0.H
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23977O1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (z9) {
            this.f20715l.m21852i(4, new C5345n.a() { // from class: n0.I
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23979P1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (z8 || c5695r02.f20599m != c5695r0.f20599m) {
            this.f20715l.m21852i(5, new C5345n.a() { // from class: n0.P
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23981Q1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (c5695r02.f20600n != c5695r0.f20600n) {
            this.f20715l.m21852i(6, new C5345n.a() { // from class: n0.U
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23983R1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (c5695r02.m23868n() != c5695r0.m23868n()) {
            this.f20715l.m21852i(7, new C5345n.a() { // from class: n0.V
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23985S1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        if (!c5695r02.f20601o.equals(c5695r0.f20601o)) {
            this.f20715l.m21852i(12, new C5345n.a() { // from class: n0.W
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23987T1(C5695R0.this, (InterfaceC4298D.d) obj);
                }
            });
        }
        m24055j2();
        this.f20715l.m21850f();
        if (c5695r02.f20602p != c5695r0.f20602p) {
            Iterator it = this.f20717m.iterator();
            while (it.hasNext()) {
                ((InterfaceC5763w.a) it.next()).mo24097F(c5695r0.f20602p);
            }
        }
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: m */
    public int mo17975m() {
        m24066p2();
        if (this.f20734u0.f20587a.m18032q()) {
            return this.f20738w0;
        }
        C5695R0 c5695r0 = this.f20734u0;
        return c5695r0.f20587a.mo302b(c5695r0.f20588b.f367a);
    }

    /* renamed from: m1 */
    public final long m24060m1(C5695R0 c5695r0) {
        if (c5695r0.f20587a.m18032q()) {
            return AbstractC5330M.m21692K0(this.f20740x0);
        }
        long m23867m = c5695r0.f20602p ? c5695r0.m23867m() : c5695r0.f20605s;
        return c5695r0.f20588b.m345b() ? m23867m : m24031X1(c5695r0.f20587a, c5695r0.f20588b, m23867m);
    }

    /* renamed from: m2 */
    public final void m24061m2(boolean z6, int i7, int i8) {
        this.f20678K++;
        C5695R0 c5695r0 = this.f20734u0;
        if (c5695r0.f20602p) {
            c5695r0 = c5695r0.m23857a();
        }
        C5695R0 m23861e = c5695r0.m23861e(z6, i7, i8);
        this.f20713k.m24252a1(z6, i7, i8);
        m24059l2(m23861e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: n */
    public C4310P mo17976n() {
        m24066p2();
        return this.f20730s0;
    }

    /* renamed from: n1 */
    public final int m24062n1(C5695R0 c5695r0) {
        return c5695r0.f20587a.m18032q() ? this.f20736v0 : c5695r0.f20587a.mo18028h(c5695r0.f20588b.f367a, this.f20719n).f14811c;
    }

    /* renamed from: o2 */
    public final void m24064o2() {
        int mo17950A = mo17950A();
        if (mo17950A != 1) {
            if (mo17950A == 2 || mo17950A == 3) {
                this.f20671D.m24131b(mo17974l() && !m24072w1());
                this.f20672E.m24135b(mo17974l());
                return;
            } else if (mo17950A != 4) {
                throw new IllegalStateException();
            }
        }
        this.f20671D.m24131b(false);
        this.f20672E.m24135b(false);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: p */
    public void mo17978p(List list, boolean z6) {
        m24066p2();
        m24044d2(m24048g1(list), z6);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C5759u mo17984v() {
        m24066p2();
        return this.f20734u0.f20592f;
    }

    /* renamed from: p2 */
    public final void m24066p2() {
        this.f20699d.m21822b();
        if (Thread.currentThread() != m24054j1().getThread()) {
            String m21685H = AbstractC5330M.m21685H("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), m24054j1().getThread().getName());
            if (this.f20718m0) {
                throw new IllegalStateException(m21685H);
            }
            AbstractC5346o.m21868i("ExoPlayerImpl", m21685H, this.f20720n0 ? null : new IllegalStateException());
            this.f20720n0 = true;
        }
    }

    /* renamed from: q1 */
    public final InterfaceC4298D.e m24067q1(long j7) {
        C4331u c4331u;
        Object obj;
        int i7;
        Object obj2;
        int mo17955F = mo17955F();
        if (this.f20734u0.f20587a.m18032q()) {
            c4331u = null;
            obj = null;
            i7 = -1;
            obj2 = null;
        } else {
            C5695R0 c5695r0 = this.f20734u0;
            Object obj3 = c5695r0.f20588b.f367a;
            c5695r0.f20587a.mo18028h(obj3, this.f20719n);
            i7 = this.f20734u0.f20587a.mo302b(obj3);
            obj = obj3;
            obj2 = this.f20734u0.f20587a.m18031n(mo17955F, this.f15026a).f14832a;
            c4331u = this.f15026a.f14834c;
        }
        long m21758l1 = AbstractC5330M.m21758l1(j7);
        long m21758l12 = this.f20734u0.f20588b.m345b() ? AbstractC5330M.m21758l1(m24017s1(this.f20734u0)) : m21758l1;
        InterfaceC0120F.b bVar = this.f20734u0.f20588b;
        return new InterfaceC4298D.e(obj2, mo17955F, c4331u, obj, i7, m21758l1, m21758l12, bVar.f368b, bVar.f369c);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: r */
    public int mo17980r() {
        m24066p2();
        if (mo17972j()) {
            return this.f20734u0.f20588b.f369c;
        }
        return -1;
    }

    /* renamed from: r1 */
    public final InterfaceC4298D.e m24068r1(int i7, C5695R0 c5695r0, int i8) {
        int i9;
        Object obj;
        C4331u c4331u;
        Object obj2;
        int i10;
        long j7;
        long m24017s1;
        AbstractC4303I.b bVar = new AbstractC4303I.b();
        if (c5695r0.f20587a.m18032q()) {
            i9 = i8;
            obj = null;
            c4331u = null;
            obj2 = null;
            i10 = -1;
        } else {
            Object obj3 = c5695r0.f20588b.f367a;
            c5695r0.f20587a.mo18028h(obj3, bVar);
            int i11 = bVar.f14811c;
            int mo302b = c5695r0.f20587a.mo302b(obj3);
            Object obj4 = c5695r0.f20587a.m18031n(i11, this.f15026a).f14832a;
            c4331u = this.f15026a.f14834c;
            obj2 = obj3;
            i10 = mo302b;
            obj = obj4;
            i9 = i11;
        }
        if (i7 == 0) {
            if (c5695r0.f20588b.m345b()) {
                InterfaceC0120F.b bVar2 = c5695r0.f20588b;
                j7 = bVar.m18035b(bVar2.f368b, bVar2.f369c);
                m24017s1 = m24017s1(c5695r0);
            } else {
                j7 = c5695r0.f20588b.f371e != -1 ? m24017s1(this.f20734u0) : bVar.f14813e + bVar.f14812d;
                m24017s1 = j7;
            }
        } else if (c5695r0.f20588b.m345b()) {
            j7 = c5695r0.f20605s;
            m24017s1 = m24017s1(c5695r0);
        } else {
            j7 = bVar.f14813e + c5695r0.f20605s;
            m24017s1 = j7;
        }
        long m21758l1 = AbstractC5330M.m21758l1(j7);
        long m21758l12 = AbstractC5330M.m21758l1(m24017s1);
        InterfaceC0120F.b bVar3 = c5695r0.f20588b;
        return new InterfaceC4298D.e(obj, i9, c4331u, obj2, i10, m21758l1, m21758l12, bVar3.f368b, bVar3.f369c);
    }

    @Override // p292n0.InterfaceC5763w
    public void release() {
        AudioTrack audioTrack;
        AbstractC5346o.m21865f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + AbstractC5330M.f18804e + "] [" + AbstractC4332v.m18324b() + "]");
        m24066p2();
        if (AbstractC5330M.f18800a < 21 && (audioTrack = this.f20690W) != null) {
            audioTrack.release();
            this.f20690W = null;
        }
        this.f20668A.m23940b(false);
        C5723d1 c5723d1 = this.f20670C;
        if (c5723d1 != null) {
            c5723d1.m24123g();
        }
        this.f20671D.m24131b(false);
        this.f20672E.m24135b(false);
        this.f20669B.m24149i();
        if (!this.f20713k.m24294t0()) {
            this.f20715l.m21854k(10, new C5345n.a() { // from class: n0.L
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    C5719c0.m23952B1((InterfaceC4298D.d) obj);
                }
            });
        }
        this.f20715l.m21853j();
        this.f20709i.mo21630j(null);
        this.f20731t.mo2047d(this.f20727r);
        C5695R0 c5695r0 = this.f20734u0;
        if (c5695r0.f20602p) {
            this.f20734u0 = c5695r0.m23857a();
        }
        C5695R0 m23864h = this.f20734u0.m23864h(1);
        this.f20734u0 = m23864h;
        C5695R0 m23859c = m23864h.m23859c(m23864h.f20588b);
        this.f20734u0 = m23859c;
        m23859c.f20603q = m23859c.f20605s;
        this.f20734u0.f20604r = 0L;
        this.f20727r.release();
        this.f20707h.mo1380i();
        m24035Z1();
        Surface surface = this.f20692Y;
        if (surface != null) {
            surface.release();
            this.f20692Y = null;
        }
        if (this.f20724p0) {
            AbstractC4094d.m17162a(AbstractC5332a.m21800e(null));
            throw null;
        }
        this.f20716l0 = C4504b.f16125c;
        this.f20726q0 = true;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: s */
    public void mo17981s(SurfaceView surfaceView) {
        m24066p2();
        m24051h2(surfaceView == null ? null : surfaceView.getHolder());
    }

    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public final void m24074z1(C5752q0.e eVar) {
        long j7;
        int i7 = this.f20678K - eVar.f20917c;
        this.f20678K = i7;
        boolean z6 = true;
        if (eVar.f20918d) {
            this.f20679L = eVar.f20919e;
            this.f20680M = true;
        }
        if (i7 == 0) {
            AbstractC4303I abstractC4303I = eVar.f20916b.f20587a;
            if (!this.f20734u0.f20587a.m18032q() && abstractC4303I.m18032q()) {
                this.f20736v0 = -1;
                this.f20740x0 = 0L;
                this.f20738w0 = 0;
            }
            if (!abstractC4303I.m18032q()) {
                List m23890F = ((C5699T0) abstractC4303I).m23890F();
                AbstractC5332a.m21802g(m23890F.size() == this.f20721o.size());
                for (int i8 = 0; i8 < m23890F.size(); i8++) {
                    ((f) this.f20721o.get(i8)).m24113c((AbstractC4303I) m23890F.get(i8));
                }
            }
            long j8 = -9223372036854775807L;
            if (this.f20680M) {
                if (eVar.f20916b.f20588b.equals(this.f20734u0.f20588b) && eVar.f20916b.f20590d == this.f20734u0.f20605s) {
                    z6 = false;
                }
                if (z6) {
                    if (abstractC4303I.m18032q() || eVar.f20916b.f20588b.m345b()) {
                        j7 = eVar.f20916b.f20590d;
                    } else {
                        C5695R0 c5695r0 = eVar.f20916b;
                        j7 = m24031X1(abstractC4303I, c5695r0.f20588b, c5695r0.f20590d);
                    }
                    j8 = j7;
                }
            } else {
                z6 = false;
            }
            this.f20680M = false;
            m24059l2(eVar.f20916b, 1, z6, this.f20679L, j8, -1, false);
        }
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: u */
    public void mo17983u(final C4312b c4312b, boolean z6) {
        m24066p2();
        if (this.f20726q0) {
            return;
        }
        if (!AbstractC5330M.m21729c(this.f20710i0, c4312b)) {
            this.f20710i0 = c4312b;
            m24038a2(1, 3, c4312b);
            C5723d1 c5723d1 = this.f20670C;
            if (c5723d1 != null) {
                c5723d1.m24124h(AbstractC5330M.m21760m0(c4312b.f15014c));
            }
            this.f20715l.m21852i(20, new C5345n.a() { // from class: n0.Q
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14237F(C4312b.this);
                }
            });
        }
        this.f20669B.m24153m(z6 ? c4312b : null);
        this.f20707h.mo1381k(c4312b);
        boolean mo17974l = mo17974l();
        int m24156p = this.f20669B.m24156p(mo17974l, mo17950A());
        m24057k2(mo17974l, m24156p, m24012o1(m24156p));
        this.f20715l.m21850f();
    }

    /* renamed from: u1 */
    public final boolean m24070u1() {
        AudioManager audioManager = this.f20674G;
        if (audioManager == null || AbstractC5330M.f18800a < 23) {
            return true;
        }
        return b.m24075a(this.f20701e, audioManager.getDevices(2));
    }

    /* renamed from: v1 */
    public final int m24071v1(int i7) {
        AudioTrack audioTrack = this.f20690W;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i7) {
            this.f20690W.release();
            this.f20690W = null;
        }
        if (this.f20690W == null) {
            this.f20690W = new AudioTrack(3, 4000, 4, 2, 2, 0, i7);
        }
        return this.f20690W.getAudioSessionId();
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: w */
    public void mo17985w(boolean z6) {
        m24066p2();
        int m24156p = this.f20669B.m24156p(z6, mo17950A());
        m24057k2(z6, m24156p, m24012o1(m24156p));
    }

    /* renamed from: w1 */
    public boolean m24072w1() {
        m24066p2();
        return this.f20734u0.f20602p;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: x */
    public long mo17986x() {
        m24066p2();
        return m24058l1(this.f20734u0);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: y */
    public long mo17987y() {
        m24066p2();
        if (!mo17972j()) {
            return m24056k1();
        }
        C5695R0 c5695r0 = this.f20734u0;
        return c5695r0.f20597k.equals(c5695r0.f20588b) ? AbstractC5330M.m21758l1(this.f20734u0.f20603q) : mo17960K();
    }

    /* renamed from: y1 */
    public final /* synthetic */ void m24073y1(InterfaceC4298D.d dVar, C4326p c4326p) {
        dVar.mo14243Q(this.f20703f, new InterfaceC4298D.c(c4326p));
    }

    /* renamed from: n0.c0$d */
    public final class d implements InterfaceC0675E, InterfaceC6095x, InterfaceC0321h, InterfaceC6941b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C5743m.b, C5715b.b, C5723d1.b, InterfaceC5763w.a {
        public d() {
        }

        @Override // p292n0.C5715b.b
        /* renamed from: A */
        public void mo23941A() {
            C5719c0.this.m24057k2(false, -1, 3);
        }

        @Override // p292n0.C5743m.b
        /* renamed from: B */
        public void mo24093B(float f7) {
            C5719c0.this.m24042c2();
        }

        @Override // p292n0.C5743m.b
        /* renamed from: C */
        public void mo24094C(int i7) {
            C5719c0.this.m24057k2(C5719c0.this.mo17974l(), i7, C5719c0.m24012o1(i7));
        }

        @Override // p292n0.InterfaceC5763w.a
        /* renamed from: D */
        public /* synthetic */ void mo24095D(boolean z6) {
            AbstractC5761v.m24364a(this, z6);
        }

        @Override // p292n0.C5723d1.b
        /* renamed from: E */
        public void mo24096E(final int i7, final boolean z6) {
            C5719c0.this.f20715l.m21854k(30, new C5345n.a() { // from class: n0.k0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14245T(i7, z6);
                }
            });
        }

        @Override // p292n0.InterfaceC5763w.a
        /* renamed from: F */
        public void mo24097F(boolean z6) {
            C5719c0.this.m24064o2();
        }

        /* renamed from: Q */
        public final /* synthetic */ void m24098Q(InterfaceC4298D.d dVar) {
            dVar.mo14254e0(C5719c0.this.f20686S);
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: a */
        public void mo2682a(final C4310P c4310p) {
            C5719c0.this.f20730s0 = c4310p;
            C5719c0.this.f20715l.m21854k(25, new C5345n.a() { // from class: n0.l0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14250a(C4310P.this);
                }
            });
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: b */
        public void mo24099b(InterfaceC6097z.a aVar) {
            C5719c0.this.f20727r.mo24490b(aVar);
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: c */
        public void mo24100c(final boolean z6) {
            if (C5719c0.this.f20714k0 == z6) {
                return;
            }
            C5719c0.this.f20714k0 = z6;
            C5719c0.this.f20715l.m21854k(23, new C5345n.a() { // from class: n0.e0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14252c(z6);
                }
            });
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: d */
        public void mo24101d(Exception exc) {
            C5719c0.this.f20727r.mo24491d(exc);
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: e */
        public void mo24102e(InterfaceC6097z.a aVar) {
            C5719c0.this.f20727r.mo24492e(aVar);
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: f */
        public void mo2683f(String str) {
            C5719c0.this.f20727r.mo24493f(str);
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: g */
        public void mo2684g(C5747o c5747o) {
            C5719c0.this.f20727r.mo24494g(c5747o);
            C5719c0.this.f20688U = null;
            C5719c0.this.f20704f0 = null;
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: h */
        public void mo2685h(String str, long j7, long j8) {
            C5719c0.this.f20727r.mo24495h(str, j7, j8);
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: i */
        public void mo24103i(C5747o c5747o) {
            C5719c0.this.f20727r.mo24496i(c5747o);
            C5719c0.this.f20689V = null;
            C5719c0.this.f20706g0 = null;
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: j */
        public void mo24104j(C5747o c5747o) {
            C5719c0.this.f20706g0 = c5747o;
            C5719c0.this.f20727r.mo24498j(c5747o);
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: k */
        public void mo24105k(String str) {
            C5719c0.this.f20727r.mo24499k(str);
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: l */
        public void mo24106l(String str, long j7, long j8) {
            C5719c0.this.f20727r.mo24500l(str, j7, j8);
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: m */
        public void mo2686m(int i7, long j7) {
            C5719c0.this.f20727r.mo24501m(i7, j7);
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: n */
        public void mo2687n(C5747o c5747o) {
            C5719c0.this.f20704f0 = c5747o;
            C5719c0.this.f20727r.mo24502n(c5747o);
        }

        @Override // p373x0.InterfaceC6941b
        /* renamed from: o */
        public void mo24107o(final C4334x c4334x) {
            C5719c0 c5719c0 = C5719c0.this;
            c5719c0.f20732t0 = c5719c0.f20732t0.m18327a().m18365L(c4334x).m18362I();
            C4333w m24039b1 = C5719c0.this.m24039b1();
            if (!m24039b1.equals(C5719c0.this.f20686S)) {
                C5719c0.this.f20686S = m24039b1;
                C5719c0.this.f20715l.m21852i(14, new C5345n.a() { // from class: n0.g0
                    @Override // p259j0.C5345n.a
                    public final void invoke(Object obj) {
                        C5719c0.d.this.m24098Q((InterfaceC4298D.d) obj);
                    }
                });
            }
            C5719c0.this.f20715l.m21852i(28, new C5345n.a() { // from class: n0.h0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14258o(C4334x.this);
                }
            });
            C5719c0.this.f20715l.m21850f();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            C5719c0.this.m24047f2(surfaceTexture);
            C5719c0.this.m24030W1(i7, i8);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C5719c0.this.m24049g2(null);
            C5719c0.this.m24030W1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            C5719c0.this.m24030W1(i7, i8);
        }

        @Override // p292n0.C5723d1.b
        /* renamed from: p */
        public void mo24108p(int i7) {
            final C4322l m24001e1 = C5719c0.m24001e1(C5719c0.this.f20670C);
            if (m24001e1.equals(C5719c0.this.f20728r0)) {
                return;
            }
            C5719c0.this.f20728r0 = m24001e1;
            C5719c0.this.f20715l.m21854k(29, new C5345n.a() { // from class: n0.j0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14256j0(C4322l.this);
                }
            });
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: q */
        public void mo24109q(C4327q c4327q, C5749p c5749p) {
            C5719c0.this.f20689V = c4327q;
            C5719c0.this.f20727r.mo24503q(c4327q, c5749p);
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: r */
        public void mo2688r(Object obj, long j7) {
            C5719c0.this.f20727r.mo24504r(obj, j7);
            if (C5719c0.this.f20691X == obj) {
                C5719c0.this.f20715l.m21854k(26, new C5345n.a() { // from class: n0.m0
                    @Override // p259j0.C5345n.a
                    public final void invoke(Object obj2) {
                        ((InterfaceC4298D.d) obj2).mo14249Y();
                    }
                });
            }
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: s */
        public void mo2689s(C4327q c4327q, C5749p c5749p) {
            C5719c0.this.f20688U = c4327q;
            C5719c0.this.f20727r.mo24505s(c4327q, c5749p);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            C5719c0.this.m24030W1(i8, i9);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C5719c0.this.f20694a0) {
                C5719c0.this.m24049g2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C5719c0.this.f20694a0) {
                C5719c0.this.m24049g2(null);
            }
            C5719c0.this.m24030W1(0, 0);
        }

        @Override // p036F0.InterfaceC0321h
        /* renamed from: t */
        public void mo1244t(final List list) {
            C5719c0.this.f20715l.m21854k(27, new C5345n.a() { // from class: n0.i0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14262t(list);
                }
            });
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: u */
        public void mo24110u(long j7) {
            C5719c0.this.f20727r.mo24506u(j7);
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: v */
        public void mo24111v(Exception exc) {
            C5719c0.this.f20727r.mo24507v(exc);
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: w */
        public void mo2690w(Exception exc) {
            C5719c0.this.f20727r.mo24508w(exc);
        }

        @Override // p311p0.InterfaceC6095x
        /* renamed from: x */
        public void mo24112x(int i7, long j7, long j8) {
            C5719c0.this.f20727r.mo24509x(i7, j7, j8);
        }

        @Override // p036F0.InterfaceC0321h
        /* renamed from: y */
        public void mo1245y(final C4504b c4504b) {
            C5719c0.this.f20716l0 = c4504b;
            C5719c0.this.f20715l.m21854k(27, new C5345n.a() { // from class: n0.f0
                @Override // p259j0.C5345n.a
                public final void invoke(Object obj) {
                    ((InterfaceC4298D.d) obj).mo14263y(C4504b.this);
                }
            });
        }

        @Override // p064J0.InterfaceC0675E
        /* renamed from: z */
        public void mo2691z(long j7, int i7) {
            C5719c0.this.f20727r.mo24510z(j7, i7);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: n2 */
    public final void m24063n2(boolean z6) {
    }
}
