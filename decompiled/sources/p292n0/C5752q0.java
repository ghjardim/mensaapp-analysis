package p292n0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.XMLReaderUtils;
import p022D0.C0142b;
import p022D0.C0165m0;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0145c0;
import p022D0.InterfaceC0149e0;
import p036F0.C0322i;
import p043G0.AbstractC0349D;
import p043G0.C0350E;
import p043G0.InterfaceC0375y;
import p050H0.InterfaceC0536e;
import p171Y2.InterfaceC2939v;
import p178Z2.AbstractC3006U;
import p178Z2.AbstractC3033v;
import p207d.AbstractC4094d;
import p232g0.AbstractC4303I;
import p232g0.C4295A;
import p232g0.C4297C;
import p232g0.C4327q;
import p232g0.C4331u;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.InterfaceC5334c;
import p259j0.InterfaceC5342k;
import p272k4.C5410A;
import p272k4.C5413D;
import p276l0.C5494h;
import p292n0.C5694Q0;
import p292n0.C5697S0;
import p292n0.C5755s;
import p292n0.C5768y0;
import p292n0.InterfaceC5703V0;
import p292n0.InterfaceC5707X0;
import p292n0.InterfaceC5760u0;
import p292n0.InterfaceC5763w;
import p300o0.C5912w1;
import p300o0.InterfaceC5844a;
import p335s0.InterfaceC6354n;
import p373x0.C6942c;

/* renamed from: n0.q0 */
/* loaded from: classes.dex */
public final class C5752q0 implements Handler.Callback, InterfaceC0117C.a, AbstractC0349D.a, C5694Q0.d, C5755s.a, C5697S0.a {

    /* renamed from: e0 */
    public static final long f20856e0 = AbstractC5330M.m21758l1(10000);

    /* renamed from: A */
    public final C5694Q0 f20857A;

    /* renamed from: B */
    public final InterfaceC5758t0 f20858B;

    /* renamed from: C */
    public final long f20859C;

    /* renamed from: D */
    public final C5912w1 f20860D;

    /* renamed from: E */
    public final boolean f20861E;

    /* renamed from: F */
    public C5714a1 f20862F;

    /* renamed from: G */
    public C5695R0 f20863G;

    /* renamed from: H */
    public e f20864H;

    /* renamed from: I */
    public boolean f20865I;

    /* renamed from: J */
    public boolean f20866J;

    /* renamed from: K */
    public boolean f20867K;

    /* renamed from: L */
    public boolean f20868L;

    /* renamed from: N */
    public boolean f20870N;

    /* renamed from: O */
    public int f20871O;

    /* renamed from: P */
    public boolean f20872P;

    /* renamed from: Q */
    public boolean f20873Q;

    /* renamed from: R */
    public boolean f20874R;

    /* renamed from: S */
    public boolean f20875S;

    /* renamed from: T */
    public int f20876T;

    /* renamed from: U */
    public h f20877U;

    /* renamed from: V */
    public long f20878V;

    /* renamed from: W */
    public long f20879W;

    /* renamed from: X */
    public int f20880X;

    /* renamed from: Y */
    public boolean f20881Y;

    /* renamed from: Z */
    public C5759u f20882Z;

    /* renamed from: a */
    public final InterfaceC5703V0[] f20883a;

    /* renamed from: a0 */
    public long f20884a0;

    /* renamed from: b */
    public final Set f20885b;

    /* renamed from: c */
    public final InterfaceC5707X0[] f20887c;

    /* renamed from: c0 */
    public InterfaceC5763w.c f20888c0;

    /* renamed from: d */
    public final AbstractC0349D f20889d;

    /* renamed from: e */
    public final C0350E f20891e;

    /* renamed from: f */
    public final InterfaceC5760u0 f20892f;

    /* renamed from: n */
    public final InterfaceC0536e f20893n;

    /* renamed from: o */
    public final InterfaceC5342k f20894o;

    /* renamed from: p */
    public final HandlerThread f20895p;

    /* renamed from: q */
    public final Looper f20896q;

    /* renamed from: r */
    public final AbstractC4303I.c f20897r;

    /* renamed from: s */
    public final AbstractC4303I.b f20898s;

    /* renamed from: t */
    public final long f20899t;

    /* renamed from: u */
    public final boolean f20900u;

    /* renamed from: v */
    public final C5755s f20901v;

    /* renamed from: w */
    public final ArrayList f20902w;

    /* renamed from: x */
    public final InterfaceC5334c f20903x;

    /* renamed from: y */
    public final f f20904y;

    /* renamed from: z */
    public final C5664B0 f20905z;

    /* renamed from: b0 */
    public long f20886b0 = -9223372036854775807L;

    /* renamed from: M */
    public long f20869M = -9223372036854775807L;

    /* renamed from: d0 */
    public AbstractC4303I f20890d0 = AbstractC4303I.f14800a;

    /* renamed from: n0.q0$a */
    public class a implements InterfaceC5703V0.a {
        public a() {
        }

        @Override // p292n0.InterfaceC5703V0.a
        /* renamed from: a */
        public void mo23916a() {
            C5752q0.this.f20874R = true;
        }

        @Override // p292n0.InterfaceC5703V0.a
        /* renamed from: b */
        public void mo23917b() {
            if (C5752q0.this.f20861E || C5752q0.this.f20875S) {
                C5752q0.this.f20894o.mo21626f(2);
            }
        }
    }

    /* renamed from: n0.q0$b */
    public static final class b {

        /* renamed from: a */
        public final List f20907a;

        /* renamed from: b */
        public final InterfaceC0149e0 f20908b;

        /* renamed from: c */
        public final int f20909c;

        /* renamed from: d */
        public final long f20910d;

        public /* synthetic */ b(List list, InterfaceC0149e0 interfaceC0149e0, int i7, long j7, a aVar) {
            this(list, interfaceC0149e0, i7, j7);
        }

        public b(List list, InterfaceC0149e0 interfaceC0149e0, int i7, long j7) {
            this.f20907a = list;
            this.f20908b = interfaceC0149e0;
            this.f20909c = i7;
            this.f20910d = j7;
        }
    }

    /* renamed from: n0.q0$c */
    public static class c {
    }

    /* renamed from: n0.q0$d */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final C5697S0 f20911a;

        /* renamed from: b */
        public int f20912b;

        /* renamed from: c */
        public long f20913c;

        /* renamed from: d */
        public Object f20914d;

        public d(C5697S0 c5697s0) {
            this.f20911a = c5697s0;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f20914d;
            if ((obj == null) != (dVar.f20914d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i7 = this.f20912b - dVar.f20912b;
            return i7 != 0 ? i7 : AbstractC5330M.m21762n(this.f20913c, dVar.f20913c);
        }

        /* renamed from: f */
        public void m24319f(int i7, long j7, Object obj) {
            this.f20912b = i7;
            this.f20913c = j7;
            this.f20914d = obj;
        }
    }

    /* renamed from: n0.q0$e */
    public static final class e {

        /* renamed from: a */
        public boolean f20915a;

        /* renamed from: b */
        public C5695R0 f20916b;

        /* renamed from: c */
        public int f20917c;

        /* renamed from: d */
        public boolean f20918d;

        /* renamed from: e */
        public int f20919e;

        public e(C5695R0 c5695r0) {
            this.f20916b = c5695r0;
        }

        /* renamed from: b */
        public void m24321b(int i7) {
            this.f20915a |= i7 > 0;
            this.f20917c += i7;
        }

        /* renamed from: c */
        public void m24322c(C5695R0 c5695r0) {
            this.f20915a |= this.f20916b != c5695r0;
            this.f20916b = c5695r0;
        }

        /* renamed from: d */
        public void m24323d(int i7) {
            if (this.f20918d && this.f20919e != 5) {
                AbstractC5332a.m21796a(i7 == 5);
                return;
            }
            this.f20915a = true;
            this.f20918d = true;
            this.f20919e = i7;
        }
    }

    /* renamed from: n0.q0$f */
    public interface f {
        /* renamed from: a */
        void mo23796a(e eVar);
    }

    /* renamed from: n0.q0$g */
    public static final class g {

        /* renamed from: a */
        public final InterfaceC0120F.b f20920a;

        /* renamed from: b */
        public final long f20921b;

        /* renamed from: c */
        public final long f20922c;

        /* renamed from: d */
        public final boolean f20923d;

        /* renamed from: e */
        public final boolean f20924e;

        /* renamed from: f */
        public final boolean f20925f;

        public g(InterfaceC0120F.b bVar, long j7, long j8, boolean z6, boolean z7, boolean z8) {
            this.f20920a = bVar;
            this.f20921b = j7;
            this.f20922c = j8;
            this.f20923d = z6;
            this.f20924e = z7;
            this.f20925f = z8;
        }
    }

    /* renamed from: n0.q0$h */
    public static final class h {

        /* renamed from: a */
        public final AbstractC4303I f20926a;

        /* renamed from: b */
        public final int f20927b;

        /* renamed from: c */
        public final long f20928c;

        public h(AbstractC4303I abstractC4303I, int i7, long j7) {
            this.f20926a = abstractC4303I;
            this.f20927b = i7;
            this.f20928c = j7;
        }
    }

    public C5752q0(InterfaceC5703V0[] interfaceC5703V0Arr, AbstractC0349D abstractC0349D, C0350E c0350e, InterfaceC5760u0 interfaceC5760u0, InterfaceC0536e interfaceC0536e, int i7, boolean z6, InterfaceC5844a interfaceC5844a, C5714a1 c5714a1, InterfaceC5758t0 interfaceC5758t0, long j7, boolean z7, boolean z8, Looper looper, InterfaceC5334c interfaceC5334c, f fVar, C5912w1 c5912w1, Looper looper2, InterfaceC5763w.c cVar) {
        this.f20904y = fVar;
        this.f20883a = interfaceC5703V0Arr;
        this.f20889d = abstractC0349D;
        this.f20891e = c0350e;
        this.f20892f = interfaceC5760u0;
        this.f20893n = interfaceC0536e;
        this.f20871O = i7;
        this.f20872P = z6;
        this.f20862F = c5714a1;
        this.f20858B = interfaceC5758t0;
        this.f20859C = j7;
        this.f20884a0 = j7;
        this.f20866J = z7;
        this.f20861E = z8;
        this.f20903x = interfaceC5334c;
        this.f20860D = c5912w1;
        this.f20888c0 = cVar;
        this.f20899t = interfaceC5760u0.mo24326a(c5912w1);
        this.f20900u = interfaceC5760u0.mo24329d(c5912w1);
        C5695R0 m23855k = C5695R0.m23855k(c0350e);
        this.f20863G = m23855k;
        this.f20864H = new e(m23855k);
        this.f20887c = new InterfaceC5707X0[interfaceC5703V0Arr.length];
        InterfaceC5707X0.a mo1375c = abstractC0349D.mo1375c();
        for (int i8 = 0; i8 < interfaceC5703V0Arr.length; i8++) {
            interfaceC5703V0Arr[i8].mo23911q(i8, c5912w1, interfaceC5334c);
            this.f20887c[i8] = interfaceC5703V0Arr[i8].mo23914t();
            if (mo1375c != null) {
                this.f20887c[i8].mo23929k(mo1375c);
            }
        }
        this.f20901v = new C5755s(this, interfaceC5334c);
        this.f20902w = new ArrayList();
        this.f20885b = AbstractC3006U.m10881h();
        this.f20897r = new AbstractC4303I.c();
        this.f20898s = new AbstractC4303I.b();
        abstractC0349D.m1376d(this, interfaceC0536e);
        this.f20881Y = true;
        InterfaceC5342k mo21616e = interfaceC5334c.mo21616e(looper, null);
        this.f20905z = new C5664B0(interfaceC5844a, mo21616e, new C5768y0.a() { // from class: n0.p0
            @Override // p292n0.C5768y0.a
            /* renamed from: a */
            public final C5768y0 mo24178a(C5770z0 c5770z0, long j8) {
                C5768y0 m24293t;
                m24293t = C5752q0.this.m24293t(c5770z0, j8);
                return m24293t;
            }
        }, cVar);
        this.f20857A = new C5694Q0(this, interfaceC5844a, mo21616e, c5912w1);
        if (looper2 != null) {
            this.f20895p = null;
            this.f20896q = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f20895p = handlerThread;
            handlerThread.start();
            this.f20896q = handlerThread.getLooper();
        }
        this.f20894o = interfaceC5334c.mo21616e(this.f20896q, this);
    }

    /* renamed from: D0 */
    public static void m24189D0(AbstractC4303I abstractC4303I, d dVar, AbstractC4303I.c cVar, AbstractC4303I.b bVar) {
        int i7 = abstractC4303I.m18031n(abstractC4303I.mo18028h(dVar.f20914d, bVar).f14811c, cVar).f14846o;
        Object obj = abstractC4303I.mo303g(i7, bVar, true).f14810b;
        long j7 = bVar.f14812d;
        dVar.m24319f(i7, j7 != -9223372036854775807L ? j7 - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: E */
    public static C4327q[] m24190E(InterfaceC0375y interfaceC0375y) {
        int length = interfaceC0375y != null ? interfaceC0375y.length() : 0;
        C4327q[] c4327qArr = new C4327q[length];
        for (int i7 = 0; i7 < length; i7++) {
            c4327qArr[i7] = interfaceC0375y.mo390b(i7);
        }
        return c4327qArr;
    }

    /* renamed from: E0 */
    public static boolean m24191E0(d dVar, AbstractC4303I abstractC4303I, AbstractC4303I abstractC4303I2, int i7, boolean z6, AbstractC4303I.c cVar, AbstractC4303I.b bVar) {
        Object obj = dVar.f20914d;
        if (obj == null) {
            Pair m24193H0 = m24193H0(abstractC4303I, new h(dVar.f20911a.m23877h(), dVar.f20911a.m23873d(), dVar.f20911a.m23875f() == Long.MIN_VALUE ? -9223372036854775807L : AbstractC5330M.m21692K0(dVar.f20911a.m23875f())), false, i7, z6, cVar, bVar);
            if (m24193H0 == null) {
                return false;
            }
            dVar.m24319f(abstractC4303I.mo302b(m24193H0.first), ((Long) m24193H0.second).longValue(), m24193H0.first);
            if (dVar.f20911a.m23875f() == Long.MIN_VALUE) {
                m24189D0(abstractC4303I, dVar, cVar, bVar);
            }
            return true;
        }
        int mo302b = abstractC4303I.mo302b(obj);
        if (mo302b == -1) {
            return false;
        }
        if (dVar.f20911a.m23875f() == Long.MIN_VALUE) {
            m24189D0(abstractC4303I, dVar, cVar, bVar);
            return true;
        }
        dVar.f20912b = mo302b;
        abstractC4303I2.mo18028h(dVar.f20914d, bVar);
        if (bVar.f14814f && abstractC4303I2.m18031n(bVar.f14811c, cVar).f14845n == abstractC4303I2.mo302b(dVar.f20914d)) {
            Pair m18029j = abstractC4303I.m18029j(cVar, bVar, abstractC4303I.mo18028h(dVar.f20914d, bVar).f14811c, dVar.f20913c + bVar.m18047n());
            dVar.m24319f(abstractC4303I.mo302b(m18029j.first), ((Long) m18029j.second).longValue(), m18029j.first);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p292n0.C5752q0.g m24192G0(p232g0.AbstractC4303I r30, p292n0.C5695R0 r31, p292n0.C5752q0.h r32, p292n0.C5664B0 r33, int r34, boolean r35, p232g0.AbstractC4303I.c r36, p232g0.AbstractC4303I.b r37) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5752q0.m24192G0(g0.I, n0.R0, n0.q0$h, n0.B0, int, boolean, g0.I$c, g0.I$b):n0.q0$g");
    }

    /* renamed from: H0 */
    public static Pair m24193H0(AbstractC4303I abstractC4303I, h hVar, boolean z6, int i7, boolean z7, AbstractC4303I.c cVar, AbstractC4303I.b bVar) {
        Pair m18029j;
        int m24194I0;
        AbstractC4303I abstractC4303I2 = hVar.f20926a;
        if (abstractC4303I.m18032q()) {
            return null;
        }
        AbstractC4303I abstractC4303I3 = abstractC4303I2.m18032q() ? abstractC4303I : abstractC4303I2;
        try {
            m18029j = abstractC4303I3.m18029j(cVar, bVar, hVar.f20927b, hVar.f20928c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC4303I.equals(abstractC4303I3)) {
            return m18029j;
        }
        if (abstractC4303I.mo302b(m18029j.first) != -1) {
            return (abstractC4303I3.mo18028h(m18029j.first, bVar).f14814f && abstractC4303I3.m18031n(bVar.f14811c, cVar).f14845n == abstractC4303I3.mo302b(m18029j.first)) ? abstractC4303I.m18029j(cVar, bVar, abstractC4303I.mo18028h(m18029j.first, bVar).f14811c, hVar.f20928c) : m18029j;
        }
        if (z6 && (m24194I0 = m24194I0(cVar, bVar, i7, z7, m18029j.first, abstractC4303I3, abstractC4303I)) != -1) {
            return abstractC4303I.m18029j(cVar, bVar, m24194I0, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: I0 */
    public static int m24194I0(AbstractC4303I.c cVar, AbstractC4303I.b bVar, int i7, boolean z6, Object obj, AbstractC4303I abstractC4303I, AbstractC4303I abstractC4303I2) {
        Object obj2 = abstractC4303I.m18031n(abstractC4303I.mo18028h(obj, bVar).f14811c, cVar).f14832a;
        for (int i8 = 0; i8 < abstractC4303I2.mo308p(); i8++) {
            if (abstractC4303I2.m18031n(i8, cVar).f14832a.equals(obj2)) {
                return i8;
            }
        }
        int mo302b = abstractC4303I.mo302b(obj);
        int mo307i = abstractC4303I.mo307i();
        int i9 = mo302b;
        int i10 = -1;
        for (int i11 = 0; i11 < mo307i && i10 == -1; i11++) {
            i9 = abstractC4303I.m18026d(i9, bVar, cVar, i7, z6);
            if (i9 == -1) {
                break;
            }
            i10 = abstractC4303I2.mo302b(abstractC4303I.mo304m(i9));
        }
        if (i10 == -1) {
            return -1;
        }
        return abstractC4303I2.m18027f(i10, bVar).f14811c;
    }

    /* renamed from: V */
    public static boolean m24195V(boolean z6, InterfaceC0120F.b bVar, long j7, InterfaceC0120F.b bVar2, AbstractC4303I.b bVar3, long j8) {
        if (!z6 && j7 == j8 && bVar.f367a.equals(bVar2.f367a)) {
            return (bVar.m345b() && bVar3.m18051r(bVar.f368b)) ? (bVar3.m18041h(bVar.f368b, bVar.f369c) == 4 || bVar3.m18041h(bVar.f368b, bVar.f369c) == 2) ? false : true : bVar2.m345b() && bVar3.m18051r(bVar2.f368b);
        }
        return false;
    }

    /* renamed from: X */
    public static boolean m24196X(InterfaceC5703V0 interfaceC5703V0) {
        return interfaceC5703V0.mo23905e() != 0;
    }

    /* renamed from: Z */
    public static boolean m24197Z(C5695R0 c5695r0, AbstractC4303I.b bVar) {
        InterfaceC0120F.b bVar2 = c5695r0.f20588b;
        AbstractC4303I abstractC4303I = c5695r0.f20587a;
        return abstractC4303I.m18032q() || abstractC4303I.mo18028h(bVar2.f367a, bVar).f14814f;
    }

    /* renamed from: A */
    public final void m24205A(InterfaceC5703V0 interfaceC5703V0) {
        if (interfaceC5703V0.mo23905e() == 2) {
            interfaceC5703V0.stop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r5.equals(r33.f20863G.f20588b) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24206A0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5752q0.m24206A0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: A1 */
    public final void m24207A1(boolean z6, boolean z7) {
        this.f20868L = z6;
        this.f20869M = (!z6 || z7) ? -9223372036854775807L : this.f20903x.mo21613b();
    }

    /* renamed from: B */
    public void m24208B(long j7) {
        this.f20884a0 = j7;
    }

    /* renamed from: B0 */
    public final void m24209B0() {
        C5768y0 m23787t = this.f20905z.m23787t();
        this.f20867K = m23787t != null && m23787t.f21030f.f21048h && this.f20866J;
    }

    /* renamed from: B1 */
    public final void m24210B1(float f7) {
        for (C5768y0 m23787t = this.f20905z.m23787t(); m23787t != null; m23787t = m23787t.m24400k()) {
            for (InterfaceC0375y interfaceC0375y : m23787t.m24405p().f1303c) {
                if (interfaceC0375y != null) {
                    interfaceC0375y.mo406t(f7);
                }
            }
        }
    }

    /* renamed from: C */
    public final AbstractC3033v m24211C(InterfaceC0375y[] interfaceC0375yArr) {
        AbstractC3033v.a aVar = new AbstractC3033v.a();
        boolean z6 = false;
        for (InterfaceC0375y interfaceC0375y : interfaceC0375yArr) {
            if (interfaceC0375y != null) {
                C4334x c4334x = interfaceC0375y.mo390b(0).f15135k;
                if (c4334x == null) {
                    aVar.mo11040a(new C4334x(new C4334x.b[0]));
                } else {
                    aVar.mo11040a(c4334x);
                    z6 = true;
                }
            }
        }
        return z6 ? aVar.m11063k() : AbstractC3033v.m11050t();
    }

    /* renamed from: C0 */
    public final void m24212C0(long j7) {
        C5768y0 m23787t = this.f20905z.m23787t();
        long m24389B = m23787t == null ? j7 + 1000000000000L : m23787t.m24389B(j7);
        this.f20878V = m24389B;
        this.f20901v.m24343c(m24389B);
        for (InterfaceC5703V0 interfaceC5703V0 : this.f20883a) {
            if (m24196X(interfaceC5703V0)) {
                interfaceC5703V0.mo23902F(this.f20878V);
            }
        }
        m24277n0();
    }

    /* renamed from: C1 */
    public final synchronized void m24213C1(InterfaceC2939v interfaceC2939v, long j7) {
        long mo21613b = this.f20903x.mo21613b() + j7;
        boolean z6 = false;
        while (!((Boolean) interfaceC2939v.get()).booleanValue() && j7 > 0) {
            try {
                this.f20903x.mo21617f();
                wait(j7);
            } catch (InterruptedException unused) {
                z6 = true;
            }
            j7 = mo21613b - this.f20903x.mo21613b();
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: D */
    public final long m24214D() {
        C5695R0 c5695r0 = this.f20863G;
        return m24215F(c5695r0.f20587a, c5695r0.f20588b.f367a, c5695r0.f20605s);
    }

    /* renamed from: F */
    public final long m24215F(AbstractC4303I abstractC4303I, Object obj, long j7) {
        abstractC4303I.m18031n(abstractC4303I.mo18028h(obj, this.f20898s).f14811c, this.f20897r);
        AbstractC4303I.c cVar = this.f20897r;
        if (cVar.f14837f != -9223372036854775807L && cVar.m18059f()) {
            AbstractC4303I.c cVar2 = this.f20897r;
            if (cVar2.f14840i) {
                return AbstractC5330M.m21692K0(cVar2.m18054a() - this.f20897r.f14837f) - (j7 + this.f20898s.m18047n());
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: F0 */
    public final void m24216F0(AbstractC4303I abstractC4303I, AbstractC4303I abstractC4303I2) {
        if (abstractC4303I.m18032q() && abstractC4303I2.m18032q()) {
            return;
        }
        for (int size = this.f20902w.size() - 1; size >= 0; size--) {
            if (!m24191E0((d) this.f20902w.get(size), abstractC4303I, abstractC4303I2, this.f20871O, this.f20872P, this.f20897r, this.f20898s)) {
                ((d) this.f20902w.get(size)).f20911a.m23880k(false);
                this.f20902w.remove(size);
            }
        }
        Collections.sort(this.f20902w);
    }

    /* renamed from: G */
    public final long m24217G() {
        C5768y0 m23788u = this.f20905z.m23788u();
        if (m23788u == null) {
            return 0L;
        }
        long m24402m = m23788u.m24402m();
        if (!m23788u.f21028d) {
            return m24402m;
        }
        int i7 = 0;
        while (true) {
            InterfaceC5703V0[] interfaceC5703V0Arr = this.f20883a;
            if (i7 >= interfaceC5703V0Arr.length) {
                return m24402m;
            }
            if (m24196X(interfaceC5703V0Arr[i7]) && this.f20883a[i7].mo23899B() == m23788u.f21027c[i7]) {
                long mo23901D = this.f20883a[i7].mo23901D();
                if (mo23901D == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m24402m = Math.max(mo23901D, m24402m);
            }
            i7++;
        }
    }

    /* renamed from: H */
    public final Pair m24218H(AbstractC4303I abstractC4303I) {
        if (abstractC4303I.m18032q()) {
            return Pair.create(C5695R0.m23856l(), 0L);
        }
        Pair m18029j = abstractC4303I.m18029j(this.f20897r, this.f20898s, abstractC4303I.mo707a(this.f20872P), -9223372036854775807L);
        InterfaceC0120F.b m23761L = this.f20905z.m23761L(abstractC4303I, m18029j.first, 0L);
        long longValue = ((Long) m18029j.second).longValue();
        if (m23761L.m345b()) {
            abstractC4303I.mo18028h(m23761L.f367a, this.f20898s);
            longValue = m23761L.f369c == this.f20898s.m18044k(m23761L.f368b) ? this.f20898s.m18040g() : 0L;
        }
        return Pair.create(m23761L, Long.valueOf(longValue));
    }

    /* renamed from: I */
    public Looper m24219I() {
        return this.f20896q;
    }

    /* renamed from: J */
    public final long m24220J() {
        return m24222K(this.f20863G.f20603q);
    }

    /* renamed from: J0 */
    public final void m24221J0(long j7) {
        long j8 = (this.f20863G.f20591e != 3 || (!this.f20861E && m24278n1())) ? f20856e0 : 1000L;
        if (this.f20861E && m24278n1()) {
            for (InterfaceC5703V0 interfaceC5703V0 : this.f20883a) {
                if (m24196X(interfaceC5703V0)) {
                    j8 = Math.min(j8, AbstractC5330M.m21758l1(interfaceC5703V0.mo23910p(this.f20878V, this.f20879W)));
                }
            }
        }
        this.f20894o.mo21627g(2, j7 + j8);
    }

    /* renamed from: K */
    public final long m24222K(long j7) {
        C5768y0 m23780m = this.f20905z.m23780m();
        if (m23780m == null) {
            return 0L;
        }
        return Math.max(0L, j7 - m23780m.m24388A(this.f20878V));
    }

    /* renamed from: K0 */
    public void m24223K0(AbstractC4303I abstractC4303I, int i7, long j7) {
        this.f20894o.mo21629i(3, new h(abstractC4303I, i7, j7)).mo21632a();
    }

    /* renamed from: L */
    public final void m24224L(InterfaceC0117C interfaceC0117C) {
        if (this.f20905z.m23753B(interfaceC0117C)) {
            this.f20905z.m23756F(this.f20878V);
            m24255c0();
        }
    }

    /* renamed from: L0 */
    public final void m24225L0(boolean z6) {
        InterfaceC0120F.b bVar = this.f20905z.m23787t().f21030f.f21041a;
        long m24231O0 = m24231O0(bVar, this.f20863G.f20605s, true, false);
        if (m24231O0 != this.f20863G.f20605s) {
            C5695R0 c5695r0 = this.f20863G;
            this.f20863G = m24238S(bVar, m24231O0, c5695r0.f20589c, c5695r0.f20590d, z6, 5);
        }
    }

    /* renamed from: M */
    public final void m24226M(IOException iOException, int i7) {
        C5759u m24360c = C5759u.m24360c(iOException, i7);
        C5768y0 m23787t = this.f20905z.m23787t();
        if (m23787t != null) {
            m24360c = m24360c.m24363a(m23787t.f21030f.f21041a);
        }
        AbstractC5346o.m21863d("ExoPlayerImplInternal", "Playback error", m24360c);
        m24292s1(false, false);
        this.f20863G = this.f20863G.m23862f(m24360c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b6, B:17:0x00bc, B:18:0x00bf, B:19:0x00c5, B:21:0x00cf, B:23:0x00d7, B:27:0x00df, B:28:0x00e9, B:30:0x00f9, B:34:0x0103, B:37:0x0115, B:40:0x011e), top: B:5:0x00a2 }] */
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24227M0(p292n0.C5752q0.h r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5752q0.m24227M0(n0.q0$h):void");
    }

    /* renamed from: N */
    public final void m24228N(boolean z6) {
        C5768y0 m23780m = this.f20905z.m23780m();
        InterfaceC0120F.b bVar = m23780m == null ? this.f20863G.f20588b : m23780m.f21030f.f21041a;
        boolean equals = this.f20863G.f20597k.equals(bVar);
        if (!equals) {
            this.f20863G = this.f20863G.m23859c(bVar);
        }
        C5695R0 c5695r0 = this.f20863G;
        c5695r0.f20603q = m23780m == null ? c5695r0.f20605s : m23780m.m24399j();
        this.f20863G.f20604r = m24220J();
        if ((!equals || z6) && m23780m != null && m23780m.f21028d) {
            m24301v1(m23780m.f21030f.f21041a, m23780m.m24404o(), m23780m.m24405p());
        }
    }

    /* renamed from: N0 */
    public final long m24229N0(InterfaceC0120F.b bVar, long j7, boolean z6) {
        return m24231O0(bVar, j7, this.f20905z.m23787t() != this.f20905z.m23788u(), z6);
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0093: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]) (LINE:148), block:B:113:0x0092 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24230O(p232g0.AbstractC4303I r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5752q0.m24230O(g0.I, boolean):void");
    }

    /* renamed from: O0 */
    public final long m24231O0(InterfaceC0120F.b bVar, long j7, boolean z6, boolean z7) {
        m24295t1();
        m24207A1(false, true);
        if (z7 || this.f20863G.f20591e == 3) {
            m24272k1(2);
        }
        C5768y0 m23787t = this.f20905z.m23787t();
        C5768y0 c5768y0 = m23787t;
        while (c5768y0 != null && !bVar.equals(c5768y0.f21030f.f21041a)) {
            c5768y0 = c5768y0.m24400k();
        }
        if (z6 || m23787t != c5768y0 || (c5768y0 != null && c5768y0.m24389B(j7) < 0)) {
            for (InterfaceC5703V0 interfaceC5703V0 : this.f20883a) {
                m24299v(interfaceC5703V0);
            }
            if (c5768y0 != null) {
                while (this.f20905z.m23787t() != c5768y0) {
                    this.f20905z.m23770b();
                }
                this.f20905z.m23759I(c5768y0);
                c5768y0.m24414z(1000000000000L);
                m24308y();
            }
        }
        if (c5768y0 != null) {
            this.f20905z.m23759I(c5768y0);
            if (!c5768y0.f21028d) {
                c5768y0.f21030f = c5768y0.f21030f.m24416b(j7);
            } else if (c5768y0.f21029e) {
                j7 = c5768y0.f21025a.mo317o(j7);
                c5768y0.f21025a.mo321u(j7 - this.f20899t, this.f20900u);
            }
            m24212C0(j7);
            m24255c0();
        } else {
            this.f20905z.m23773f();
            m24212C0(j7);
        }
        m24228N(false);
        this.f20894o.mo21626f(2);
        return j7;
    }

    /* renamed from: P */
    public final void m24232P(InterfaceC0117C interfaceC0117C) {
        if (this.f20905z.m23753B(interfaceC0117C)) {
            C5768y0 m23780m = this.f20905z.m23780m();
            m23780m.m24406q(this.f20901v.mo23946i().f14768a, this.f20863G.f20587a);
            m24301v1(m23780m.f21030f.f21041a, m23780m.m24404o(), m23780m.m24405p());
            if (m23780m == this.f20905z.m23787t()) {
                m24212C0(m23780m.f21030f.f21042b);
                m24308y();
                C5695R0 c5695r0 = this.f20863G;
                InterfaceC0120F.b bVar = c5695r0.f20588b;
                long j7 = m23780m.f21030f.f21042b;
                this.f20863G = m24238S(bVar, j7, c5695r0.f20589c, j7, false, 5);
            }
            m24255c0();
        }
    }

    /* renamed from: P0 */
    public final void m24233P0(C5697S0 c5697s0) {
        if (c5697s0.m23875f() == -9223372036854775807L) {
            m24235Q0(c5697s0);
            return;
        }
        if (this.f20863G.f20587a.m18032q()) {
            this.f20902w.add(new d(c5697s0));
            return;
        }
        d dVar = new d(c5697s0);
        AbstractC4303I abstractC4303I = this.f20863G.f20587a;
        if (!m24191E0(dVar, abstractC4303I, abstractC4303I, this.f20871O, this.f20872P, this.f20897r, this.f20898s)) {
            c5697s0.m23880k(false);
        } else {
            this.f20902w.add(dVar);
            Collections.sort(this.f20902w);
        }
    }

    /* renamed from: Q */
    public final void m24234Q(C4297C c4297c, float f7, boolean z6, boolean z7) {
        if (z6) {
            if (z7) {
                this.f20864H.m24321b(1);
            }
            this.f20863G = this.f20863G.m23863g(c4297c);
        }
        m24210B1(c4297c.f14768a);
        for (InterfaceC5703V0 interfaceC5703V0 : this.f20883a) {
            if (interfaceC5703V0 != null) {
                interfaceC5703V0.mo2898v(f7, c4297c.f14768a);
            }
        }
    }

    /* renamed from: Q0 */
    public final void m24235Q0(C5697S0 c5697s0) {
        if (c5697s0.m23872c() != this.f20896q) {
            this.f20894o.mo21629i(15, c5697s0).mo21632a();
            return;
        }
        m24296u(c5697s0);
        int i7 = this.f20863G.f20591e;
        if (i7 == 3 || i7 == 2) {
            this.f20894o.mo21626f(2);
        }
    }

    /* renamed from: R */
    public final void m24236R(C4297C c4297c, boolean z6) {
        m24234Q(c4297c, c4297c.f14768a, true, z6);
    }

    /* renamed from: R0 */
    public final void m24237R0(final C5697S0 c5697s0) {
        Looper m23872c = c5697s0.m23872c();
        if (m23872c.getThread().isAlive()) {
            this.f20903x.mo21616e(m23872c, null).mo21622b(new Runnable() { // from class: n0.o0
                @Override // java.lang.Runnable
                public final void run() {
                    C5752q0.this.m24253b0(c5697s0);
                }
            });
        } else {
            AbstractC5346o.m21867h("TAG", "Trying to send message on a dead thread.");
            c5697s0.m23880k(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* renamed from: S */
    public final C5695R0 m24238S(InterfaceC0120F.b bVar, long j7, long j8, long j9, boolean z6, int i7) {
        AbstractC3033v abstractC3033v;
        C0165m0 c0165m0;
        C0350E c0350e;
        this.f20881Y = (!this.f20881Y && j7 == this.f20863G.f20605s && bVar.equals(this.f20863G.f20588b)) ? false : true;
        m24209B0();
        C5695R0 c5695r0 = this.f20863G;
        C0165m0 c0165m02 = c5695r0.f20594h;
        C0350E c0350e2 = c5695r0.f20595i;
        ?? r12 = c5695r0.f20596j;
        if (this.f20857A.m23821t()) {
            C5768y0 m23787t = this.f20905z.m23787t();
            C0165m0 m24404o = m23787t == null ? C0165m0.f683d : m23787t.m24404o();
            C0350E m24405p = m23787t == null ? this.f20891e : m23787t.m24405p();
            AbstractC3033v m24211C = m24211C(m24405p.f1303c);
            if (m23787t != null) {
                C5770z0 c5770z0 = m23787t.f21030f;
                if (c5770z0.f21043c != j8) {
                    m23787t.f21030f = c5770z0.m24415a(j8);
                }
            }
            m24263g0();
            c0165m0 = m24404o;
            c0350e = m24405p;
            abstractC3033v = m24211C;
        } else if (bVar.equals(this.f20863G.f20588b)) {
            abstractC3033v = r12;
            c0165m0 = c0165m02;
            c0350e = c0350e2;
        } else {
            c0165m0 = C0165m0.f683d;
            c0350e = this.f20891e;
            abstractC3033v = AbstractC3033v.m11050t();
        }
        if (z6) {
            this.f20864H.m24323d(i7);
        }
        return this.f20863G.m23860d(bVar, j7, j8, j9, m24220J(), c0165m0, c0350e, abstractC3033v);
    }

    /* renamed from: S0 */
    public final void m24239S0(long j7) {
        for (InterfaceC5703V0 interfaceC5703V0 : this.f20883a) {
            if (interfaceC5703V0.mo23899B() != null) {
                m24241T0(interfaceC5703V0, j7);
            }
        }
    }

    /* renamed from: T */
    public final boolean m24240T(InterfaceC5703V0 interfaceC5703V0, C5768y0 c5768y0) {
        C5768y0 m24400k = c5768y0.m24400k();
        return c5768y0.f21030f.f21046f && m24400k.f21028d && ((interfaceC5703V0 instanceof C0322i) || (interfaceC5703V0 instanceof C6942c) || interfaceC5703V0.mo23901D() >= m24400k.m24403n());
    }

    /* renamed from: T0 */
    public final void m24241T0(InterfaceC5703V0 interfaceC5703V0, long j7) {
        interfaceC5703V0.mo23912r();
        if (interfaceC5703V0 instanceof C0322i) {
            ((C0322i) interfaceC5703V0).m1268v0(j7);
        }
    }

    /* renamed from: U */
    public final boolean m24242U() {
        C5768y0 m23788u = this.f20905z.m23788u();
        if (!m23788u.f21028d) {
            return false;
        }
        int i7 = 0;
        while (true) {
            InterfaceC5703V0[] interfaceC5703V0Arr = this.f20883a;
            if (i7 >= interfaceC5703V0Arr.length) {
                return true;
            }
            InterfaceC5703V0 interfaceC5703V0 = interfaceC5703V0Arr[i7];
            InterfaceC0145c0 interfaceC0145c0 = m23788u.f21027c[i7];
            if (interfaceC5703V0.mo23899B() != interfaceC0145c0 || (interfaceC0145c0 != null && !interfaceC5703V0.mo23909o() && !m24240T(interfaceC5703V0, m23788u))) {
                break;
            }
            i7++;
        }
        return false;
    }

    /* renamed from: U0 */
    public final void m24243U0(boolean z6, AtomicBoolean atomicBoolean) {
        if (this.f20873Q != z6) {
            this.f20873Q = z6;
            if (!z6) {
                for (InterfaceC5703V0 interfaceC5703V0 : this.f20883a) {
                    if (!m24196X(interfaceC5703V0) && this.f20885b.remove(interfaceC5703V0)) {
                        interfaceC5703V0.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: V0 */
    public final void m24244V0(C4297C c4297c) {
        this.f20894o.mo21628h(16);
        this.f20901v.mo23945d(c4297c);
    }

    /* renamed from: W */
    public final boolean m24245W() {
        C5768y0 m23780m = this.f20905z.m23780m();
        return (m23780m == null || m23780m.m24407r() || m23780m.m24401l() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: W0 */
    public final void m24246W0(b bVar) {
        this.f20864H.m24321b(1);
        if (bVar.f20909c != -1) {
            this.f20877U = new h(new C5699T0(bVar.f20907a, bVar.f20908b), bVar.f20909c, bVar.f20910d);
        }
        m24230O(this.f20857A.m23809C(bVar.f20907a, bVar.f20908b), false);
    }

    /* renamed from: X0 */
    public void m24247X0(List list, int i7, long j7, InterfaceC0149e0 interfaceC0149e0) {
        this.f20894o.mo21629i(17, new b(list, interfaceC0149e0, i7, j7, null)).mo21632a();
    }

    /* renamed from: Y */
    public final boolean m24248Y() {
        C5768y0 m23787t = this.f20905z.m23787t();
        long j7 = m23787t.f21030f.f21045e;
        return m23787t.f21028d && (j7 == -9223372036854775807L || this.f20863G.f20605s < j7 || !m24278n1());
    }

    /* renamed from: Y0 */
    public final void m24249Y0(boolean z6) {
        if (z6 == this.f20875S) {
            return;
        }
        this.f20875S = z6;
        if (z6 || !this.f20863G.f20602p) {
            return;
        }
        this.f20894o.mo21626f(2);
    }

    /* renamed from: Z0 */
    public final void m24250Z0(boolean z6) {
        this.f20866J = z6;
        m24209B0();
        if (!this.f20867K || this.f20905z.m23788u() == this.f20905z.m23787t()) {
            return;
        }
        m24225L0(true);
        m24228N(false);
    }

    @Override // p043G0.AbstractC0349D.a
    /* renamed from: a */
    public void mo1382a(InterfaceC5703V0 interfaceC5703V0) {
        this.f20894o.mo21626f(26);
    }

    /* renamed from: a0 */
    public final /* synthetic */ Boolean m24251a0() {
        return Boolean.valueOf(this.f20865I);
    }

    /* renamed from: a1 */
    public void m24252a1(boolean z6, int i7, int i8) {
        this.f20894o.mo21621a(1, z6 ? 1 : 0, i7 | (i8 << 4)).mo21632a();
    }

    /* renamed from: b0 */
    public final /* synthetic */ void m24253b0(C5697S0 c5697s0) {
        try {
            m24296u(c5697s0);
        } catch (C5759u e7) {
            AbstractC5346o.m21863d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: b1 */
    public final void m24254b1(boolean z6, int i7, boolean z7, int i8) {
        this.f20864H.m24321b(z7 ? 1 : 0);
        this.f20863G = this.f20863G.m23861e(z6, i8, i7);
        m24207A1(false, false);
        m24279o0(z6);
        if (!m24278n1()) {
            m24295t1();
            m24310y1();
            return;
        }
        int i9 = this.f20863G.f20591e;
        if (i9 == 3) {
            this.f20901v.m24345f();
            m24286q1();
            this.f20894o.mo21626f(2);
        } else if (i9 == 2) {
            this.f20894o.mo21626f(2);
        }
    }

    @Override // p022D0.InterfaceC0117C.a
    /* renamed from: c */
    public void mo322c(InterfaceC0117C interfaceC0117C) {
        this.f20894o.mo21629i(8, interfaceC0117C).mo21632a();
    }

    /* renamed from: c0 */
    public final void m24255c0() {
        boolean m24276m1 = m24276m1();
        this.f20870N = m24276m1;
        if (m24276m1) {
            this.f20905z.m23780m().m24395e(this.f20878V, this.f20901v.mo23946i().f14768a, this.f20869M);
        }
        m24298u1();
    }

    /* renamed from: c1 */
    public void m24256c1(C4297C c4297c) {
        this.f20894o.mo21629i(4, c4297c).mo21632a();
    }

    @Override // p043G0.AbstractC0349D.a
    /* renamed from: d */
    public void mo1383d() {
        this.f20894o.mo21626f(10);
    }

    /* renamed from: d0 */
    public final void m24257d0() {
        this.f20864H.m24322c(this.f20863G);
        if (this.f20864H.f20915a) {
            this.f20904y.mo23796a(this.f20864H);
            this.f20864H = new e(this.f20863G);
        }
    }

    /* renamed from: d1 */
    public final void m24258d1(C4297C c4297c) {
        m24244V0(c4297c);
        m24236R(this.f20901v.mo23946i(), true);
    }

    @Override // p292n0.C5694Q0.d
    /* renamed from: e */
    public void mo23854e() {
        this.f20894o.mo21628h(2);
        this.f20894o.mo21626f(22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24259e0(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5752q0.m24259e0(long, long):void");
    }

    /* renamed from: e1 */
    public final void m24260e1(InterfaceC5763w.c cVar) {
        this.f20888c0 = cVar;
        this.f20905z.m23766Q(this.f20863G.f20587a, cVar);
    }

    @Override // p292n0.C5697S0.a
    /* renamed from: f */
    public synchronized void mo23884f(C5697S0 c5697s0) {
        if (!this.f20865I && this.f20896q.getThread().isAlive()) {
            this.f20894o.mo21629i(14, c5697s0).mo21632a();
            return;
        }
        AbstractC5346o.m21867h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c5697s0.m23880k(false);
    }

    /* renamed from: f0 */
    public final boolean m24261f0() {
        C5770z0 m23786s;
        this.f20905z.m23756F(this.f20878V);
        boolean z6 = false;
        if (this.f20905z.m23764O() && (m23786s = this.f20905z.m23786s(this.f20878V, this.f20863G)) != null) {
            C5768y0 m23774g = this.f20905z.m23774g(m23786s);
            m23774g.f21025a.mo318p(this, m23786s.f21042b);
            if (this.f20905z.m23787t() == m23774g) {
                m24212C0(m23786s.f21042b);
            }
            m24228N(false);
            z6 = true;
        }
        if (this.f20870N) {
            this.f20870N = m24245W();
            m24298u1();
        } else {
            m24255c0();
        }
        return z6;
    }

    /* renamed from: f1 */
    public void m24262f1(int i7) {
        this.f20894o.mo21621a(11, i7, 0).mo21632a();
    }

    /* renamed from: g0 */
    public final void m24263g0() {
        boolean z6;
        C5768y0 m23787t = this.f20905z.m23787t();
        if (m23787t != null) {
            C0350E m24405p = m23787t.m24405p();
            boolean z7 = false;
            int i7 = 0;
            boolean z8 = false;
            while (true) {
                if (i7 >= this.f20883a.length) {
                    z6 = true;
                    break;
                }
                if (m24405p.m1386c(i7)) {
                    if (this.f20883a[i7].mo23907j() != 1) {
                        z6 = false;
                        break;
                    } else if (m24405p.f1302b[i7].f20642a != 0) {
                        z8 = true;
                    }
                }
                i7++;
            }
            if (z8 && z6) {
                z7 = true;
            }
            m24249Y0(z7);
        }
    }

    /* renamed from: g1 */
    public final void m24264g1(int i7) {
        this.f20871O = i7;
        if (!this.f20905z.m23768S(this.f20863G.f20587a, i7)) {
            m24225L0(true);
        }
        m24228N(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC] */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24265h0() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r14.m24274l1()
            if (r2 == 0) goto L6e
            if (r1 == 0) goto Ld
            r14.m24257d0()
        Ld:
            n0.B0 r1 = r14.f20905z
            n0.y0 r1 = r1.m23770b()
            java.lang.Object r1 = p259j0.AbstractC5332a.m21800e(r1)
            n0.y0 r1 = (p292n0.C5768y0) r1
            n0.R0 r2 = r14.f20863G
            D0.F$b r2 = r2.f20588b
            java.lang.Object r2 = r2.f367a
            n0.z0 r3 = r1.f21030f
            D0.F$b r3 = r3.f21041a
            java.lang.Object r3 = r3.f367a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            n0.R0 r2 = r14.f20863G
            D0.F$b r2 = r2.f20588b
            int r4 = r2.f368b
            r5 = -1
            if (r4 != r5) goto L45
            n0.z0 r4 = r1.f21030f
            D0.F$b r4 = r4.f21041a
            int r6 = r4.f368b
            if (r6 != r5) goto L45
            int r2 = r2.f371e
            int r4 = r4.f371e
            if (r2 == r4) goto L45
            r2 = r3
            goto L46
        L45:
            r2 = r0
        L46:
            n0.z0 r1 = r1.f21030f
            D0.F$b r5 = r1.f21041a
            long r10 = r1.f21042b
            long r8 = r1.f21043c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            n0.R0 r1 = r4.m24238S(r5, r6, r8, r10, r12, r13)
            r14.f20863G = r1
            r14.m24209B0()
            r14.m24310y1()
            n0.R0 r1 = r14.f20863G
            int r1 = r1.f20591e
            r2 = 3
            if (r1 != r2) goto L69
            r14.m24286q1()
        L69:
            r14.m24287r()
            r1 = r3
            goto L2
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5752q0.m24265h0():void");
    }

    /* renamed from: h1 */
    public final void m24266h1(C5714a1 c5714a1) {
        this.f20862F = c5714a1;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i7;
        C5768y0 m23788u;
        int i8;
        int i9 = PipesIterator.DEFAULT_QUEUE_SIZE;
        try {
            switch (message.what) {
                case 1:
                    boolean z6 = message.arg1 != 0;
                    int i10 = message.arg2;
                    m24254b1(z6, i10 >> 4, true, i10 & 15);
                    break;
                case 2:
                    m24302w();
                    break;
                case 3:
                    m24227M0((h) message.obj);
                    break;
                case 4:
                    m24258d1((C4297C) message.obj);
                    break;
                case 5:
                    m24266h1((C5714a1) message.obj);
                    break;
                case 6:
                    m24292s1(false, true);
                    break;
                case 7:
                    m24297u0();
                    return true;
                case 8:
                    m24232P((InterfaceC0117C) message.obj);
                    break;
                case 9:
                    m24224L((InterfaceC0117C) message.obj);
                    break;
                case 10:
                    m24309y0();
                    break;
                case 11:
                    m24264g1(message.arg1);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    m24268i1(message.arg1 != 0);
                    break;
                case 13:
                    m24243U0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m24233P0((C5697S0) message.obj);
                    break;
                case 15:
                    m24237R0((C5697S0) message.obj);
                    break;
                case 16:
                    m24236R((C4297C) message.obj, false);
                    break;
                case 17:
                    m24246W0((b) message.obj);
                    break;
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    m24284q((b) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC4094d.m17162a(message.obj);
                    m24275m0(null);
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    m24303w0(message.arg1, message.arg2, (InterfaceC0149e0) message.obj);
                    break;
                case 21:
                    m24270j1((InterfaceC0149e0) message.obj);
                    break;
                case 22:
                    m24273l0();
                    break;
                case 23:
                    m24250Z0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m24290s();
                    break;
                case 26:
                    m24312z0();
                    break;
                case 27:
                    m24304w1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m24260e1((InterfaceC5763w.c) message.obj);
                    break;
                case 29:
                    m24291s0();
                    break;
            }
        } catch (C0142b e7) {
            m24226M(e7, 1002);
        } catch (C4295A e8) {
            int i11 = e8.f14755b;
            if (i11 == 1) {
                i8 = e8.f14754a ? 3001 : 3003;
            } else {
                if (i11 == 4) {
                    i8 = e8.f14754a ? 3002 : 3004;
                }
                m24226M(e8, i9);
            }
            i9 = i8;
            m24226M(e8, i9);
        } catch (C5759u e9) {
            C5759u c5759u = e9;
            if (c5759u.f20965q == 1 && (m23788u = this.f20905z.m23788u()) != null) {
                c5759u = c5759u.m24363a(m23788u.f21030f.f21041a);
            }
            if (c5759u.f20971w && (this.f20882Z == null || (i7 = c5759u.f14762a) == 5004 || i7 == 5003)) {
                AbstractC5346o.m21868i("ExoPlayerImplInternal", "Recoverable renderer error", c5759u);
                C5759u c5759u2 = this.f20882Z;
                if (c5759u2 != null) {
                    c5759u2.addSuppressed(c5759u);
                    c5759u = this.f20882Z;
                } else {
                    this.f20882Z = c5759u;
                }
                InterfaceC5342k interfaceC5342k = this.f20894o;
                interfaceC5342k.mo21624d(interfaceC5342k.mo21629i(25, c5759u));
            } else {
                C5759u c5759u3 = this.f20882Z;
                if (c5759u3 != null) {
                    c5759u3.addSuppressed(c5759u);
                    c5759u = this.f20882Z;
                }
                C5759u c5759u4 = c5759u;
                AbstractC5346o.m21863d("ExoPlayerImplInternal", "Playback error", c5759u4);
                if (c5759u4.f20965q == 1 && this.f20905z.m23787t() != this.f20905z.m23788u()) {
                    while (this.f20905z.m23787t() != this.f20905z.m23788u()) {
                        this.f20905z.m23770b();
                    }
                    C5768y0 c5768y0 = (C5768y0) AbstractC5332a.m21800e(this.f20905z.m23787t());
                    m24257d0();
                    C5770z0 c5770z0 = c5768y0.f21030f;
                    InterfaceC0120F.b bVar = c5770z0.f21041a;
                    long j7 = c5770z0.f21042b;
                    this.f20863G = m24238S(bVar, j7, c5770z0.f21043c, j7, true, 0);
                }
                m24292s1(true, false);
                this.f20863G = this.f20863G.m23862f(c5759u4);
            }
        } catch (InterfaceC6354n.a e10) {
            m24226M(e10, e10.f22998a);
        } catch (IOException e11) {
            m24226M(e11, 2000);
        } catch (RuntimeException e12) {
            if ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) {
                i9 = 1004;
            }
            C5759u m24361d = C5759u.m24361d(e12, i9);
            AbstractC5346o.m21863d("ExoPlayerImplInternal", "Playback error", m24361d);
            m24292s1(true, false);
            this.f20863G = this.f20863G.m23862f(m24361d);
        } catch (C5494h e13) {
            m24226M(e13, e13.f19774a);
        }
        m24257d0();
        return true;
    }

    /* renamed from: i0 */
    public final void m24267i0(boolean z6) {
        if (this.f20888c0.f21022a != -9223372036854775807L) {
            if (z6 || !this.f20863G.f20587a.equals(this.f20890d0)) {
                AbstractC4303I abstractC4303I = this.f20863G.f20587a;
                this.f20890d0 = abstractC4303I;
                this.f20905z.m23791x(abstractC4303I);
            }
        }
    }

    /* renamed from: i1 */
    public final void m24268i1(boolean z6) {
        this.f20872P = z6;
        if (!this.f20905z.m23769T(this.f20863G.f20587a, z6)) {
            m24225L0(true);
        }
        m24228N(false);
    }

    /* renamed from: j0 */
    public final void m24269j0() {
        C5768y0 m23788u = this.f20905z.m23788u();
        if (m23788u == null) {
            return;
        }
        int i7 = 0;
        if (m23788u.m24400k() != null && !this.f20867K) {
            if (m24242U()) {
                if (m23788u.m24400k().f21028d || this.f20878V >= m23788u.m24400k().m24403n()) {
                    C0350E m24405p = m23788u.m24405p();
                    C5768y0 m23771c = this.f20905z.m23771c();
                    C0350E m24405p2 = m23771c.m24405p();
                    AbstractC4303I abstractC4303I = this.f20863G.f20587a;
                    m24313z1(abstractC4303I, m23771c.f21030f.f21041a, abstractC4303I, m23788u.f21030f.f21041a, -9223372036854775807L, false);
                    if (m23771c.f21028d && m23771c.f21025a.mo319s() != -9223372036854775807L) {
                        m24239S0(m23771c.m24403n());
                        if (m23771c.m24408s()) {
                            return;
                        }
                        this.f20905z.m23759I(m23771c);
                        m24228N(false);
                        m24255c0();
                        return;
                    }
                    for (int i8 = 0; i8 < this.f20883a.length; i8++) {
                        boolean m1386c = m24405p.m1386c(i8);
                        boolean m1386c2 = m24405p2.m1386c(i8);
                        if (m1386c && !this.f20883a[i8].mo23903G()) {
                            boolean z6 = this.f20887c[i8].mo23907j() == -2;
                            C5709Y0 c5709y0 = m24405p.f1302b[i8];
                            C5709Y0 c5709y02 = m24405p2.f1302b[i8];
                            if (!m1386c2 || !c5709y02.equals(c5709y0) || z6) {
                                m24241T0(this.f20883a[i8], m23771c.m24403n());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!m23788u.f21030f.f21049i && !this.f20867K) {
            return;
        }
        while (true) {
            InterfaceC5703V0[] interfaceC5703V0Arr = this.f20883a;
            if (i7 >= interfaceC5703V0Arr.length) {
                return;
            }
            InterfaceC5703V0 interfaceC5703V0 = interfaceC5703V0Arr[i7];
            InterfaceC0145c0 interfaceC0145c0 = m23788u.f21027c[i7];
            if (interfaceC0145c0 != null && interfaceC5703V0.mo23899B() == interfaceC0145c0 && interfaceC5703V0.mo23909o()) {
                long j7 = m23788u.f21030f.f21045e;
                m24241T0(interfaceC5703V0, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : m23788u.m24402m() + m23788u.f21030f.f21045e);
            }
            i7++;
        }
    }

    /* renamed from: j1 */
    public final void m24270j1(InterfaceC0149e0 interfaceC0149e0) {
        this.f20864H.m24321b(1);
        m24230O(this.f20857A.m23810D(interfaceC0149e0), false);
    }

    /* renamed from: k0 */
    public final void m24271k0() {
        C5768y0 m23788u = this.f20905z.m23788u();
        if (m23788u == null || this.f20905z.m23787t() == m23788u || m23788u.f21031g || !m24306x0()) {
            return;
        }
        m24308y();
    }

    /* renamed from: k1 */
    public final void m24272k1(int i7) {
        C5695R0 c5695r0 = this.f20863G;
        if (c5695r0.f20591e != i7) {
            if (i7 != 2) {
                this.f20886b0 = -9223372036854775807L;
            }
            this.f20863G = c5695r0.m23864h(i7);
        }
    }

    /* renamed from: l0 */
    public final void m24273l0() {
        m24230O(this.f20857A.m23815i(), true);
    }

    /* renamed from: l1 */
    public final boolean m24274l1() {
        C5768y0 m23787t;
        C5768y0 m24400k;
        return m24278n1() && !this.f20867K && (m23787t = this.f20905z.m23787t()) != null && (m24400k = m23787t.m24400k()) != null && this.f20878V >= m24400k.m24403n() && m24400k.f21031g;
    }

    /* renamed from: m0 */
    public final void m24275m0(c cVar) {
        this.f20864H.m24321b(1);
        throw null;
    }

    /* renamed from: m1 */
    public final boolean m24276m1() {
        if (!m24245W()) {
            return false;
        }
        C5768y0 m23780m = this.f20905z.m23780m();
        long m24222K = m24222K(m23780m.m24401l());
        InterfaceC5760u0.a aVar = new InterfaceC5760u0.a(this.f20860D, this.f20863G.f20587a, m23780m.f21030f.f21041a, m23780m == this.f20905z.m23787t() ? m23780m.m24388A(this.f20878V) : m23780m.m24388A(this.f20878V) - m23780m.f21030f.f21042b, m24222K, this.f20901v.mo23946i().f14768a, this.f20863G.f20598l, this.f20868L, m24283p1(this.f20863G.f20587a, m23780m.f21030f.f21041a) ? this.f20858B.mo24181b() : -9223372036854775807L);
        boolean mo24333h = this.f20892f.mo24333h(aVar);
        C5768y0 m23787t = this.f20905z.m23787t();
        if (mo24333h || !m23787t.f21028d || m24222K >= 500000) {
            return mo24333h;
        }
        if (this.f20899t <= 0 && !this.f20900u) {
            return mo24333h;
        }
        m23787t.f21025a.mo321u(this.f20863G.f20605s, false);
        return this.f20892f.mo24333h(aVar);
    }

    /* renamed from: n0 */
    public final void m24277n0() {
        for (C5768y0 m23787t = this.f20905z.m23787t(); m23787t != null; m23787t = m23787t.m24400k()) {
            for (InterfaceC0375y interfaceC0375y : m23787t.m24405p().f1303c) {
                if (interfaceC0375y != null) {
                    interfaceC0375y.mo408v();
                }
            }
        }
    }

    /* renamed from: n1 */
    public final boolean m24278n1() {
        C5695R0 c5695r0 = this.f20863G;
        return c5695r0.f20598l && c5695r0.f20600n == 0;
    }

    /* renamed from: o0 */
    public final void m24279o0(boolean z6) {
        for (C5768y0 m23787t = this.f20905z.m23787t(); m23787t != null; m23787t = m23787t.m24400k()) {
            for (InterfaceC0375y interfaceC0375y : m23787t.m24405p().f1303c) {
                if (interfaceC0375y != null) {
                    interfaceC0375y.mo398l(z6);
                }
            }
        }
    }

    /* renamed from: o1 */
    public final boolean m24280o1(boolean z6) {
        if (this.f20876T == 0) {
            return m24248Y();
        }
        if (!z6) {
            return false;
        }
        if (!this.f20863G.f20593g) {
            return true;
        }
        C5768y0 m23787t = this.f20905z.m23787t();
        long mo24181b = m24283p1(this.f20863G.f20587a, m23787t.f21030f.f21041a) ? this.f20858B.mo24181b() : -9223372036854775807L;
        C5768y0 m23780m = this.f20905z.m23780m();
        return (m23780m.m24408s() && m23780m.f21030f.f21049i) || (m23780m.f21030f.f21041a.m345b() && !m23780m.f21028d) || this.f20892f.mo24328c(new InterfaceC5760u0.a(this.f20860D, this.f20863G.f20587a, m23787t.f21030f.f21041a, m23787t.m24388A(this.f20878V), m24220J(), this.f20901v.mo23946i().f14768a, this.f20863G.f20598l, this.f20868L, mo24181b));
    }

    @Override // p292n0.C5755s.a
    /* renamed from: p */
    public void mo24281p(C4297C c4297c) {
        this.f20894o.mo21629i(16, c4297c).mo21632a();
    }

    /* renamed from: p0 */
    public final void m24282p0() {
        for (C5768y0 m23787t = this.f20905z.m23787t(); m23787t != null; m23787t = m23787t.m24400k()) {
            for (InterfaceC0375y interfaceC0375y : m23787t.m24405p().f1303c) {
                if (interfaceC0375y != null) {
                    interfaceC0375y.mo409w();
                }
            }
        }
    }

    /* renamed from: p1 */
    public final boolean m24283p1(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar) {
        if (bVar.m345b() || abstractC4303I.m18032q()) {
            return false;
        }
        abstractC4303I.m18031n(abstractC4303I.mo18028h(bVar.f367a, this.f20898s).f14811c, this.f20897r);
        if (!this.f20897r.m18059f()) {
            return false;
        }
        AbstractC4303I.c cVar = this.f20897r;
        return cVar.f14840i && cVar.f14837f != -9223372036854775807L;
    }

    /* renamed from: q */
    public final void m24284q(b bVar, int i7) {
        this.f20864H.m24321b(1);
        C5694Q0 c5694q0 = this.f20857A;
        if (i7 == -1) {
            i7 = c5694q0.m23820r();
        }
        m24230O(c5694q0.m23812f(i7, bVar.f20907a, bVar.f20908b), false);
    }

    @Override // p022D0.InterfaceC0147d0.a
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo386b(InterfaceC0117C interfaceC0117C) {
        this.f20894o.mo21629i(9, interfaceC0117C).mo21632a();
    }

    /* renamed from: q1 */
    public final void m24286q1() {
        C5768y0 m23787t = this.f20905z.m23787t();
        if (m23787t == null) {
            return;
        }
        C0350E m24405p = m23787t.m24405p();
        for (int i7 = 0; i7 < this.f20883a.length; i7++) {
            if (m24405p.m1386c(i7) && this.f20883a[i7].mo23905e() == 1) {
                this.f20883a[i7].start();
            }
        }
    }

    /* renamed from: r */
    public final void m24287r() {
        C0350E m24405p = this.f20905z.m23787t().m24405p();
        for (int i7 = 0; i7 < this.f20883a.length; i7++) {
            if (m24405p.m1386c(i7)) {
                this.f20883a[i7].mo2870f();
            }
        }
    }

    /* renamed from: r0 */
    public void m24288r0() {
        this.f20894o.mo21623c(29).mo21632a();
    }

    /* renamed from: r1 */
    public void m24289r1() {
        this.f20894o.mo21623c(6).mo21632a();
    }

    /* renamed from: s */
    public final void m24290s() {
        m24312z0();
    }

    /* renamed from: s0 */
    public final void m24291s0() {
        this.f20864H.m24321b(1);
        m24206A0(false, false, false, true);
        this.f20892f.mo24330e(this.f20860D);
        m24272k1(this.f20863G.f20587a.m18032q() ? 4 : 2);
        this.f20857A.m23824w(this.f20893n.mo2048f());
        this.f20894o.mo21626f(2);
    }

    /* renamed from: s1 */
    public final void m24292s1(boolean z6, boolean z7) {
        m24206A0(z6 || !this.f20873Q, false, true, false);
        this.f20864H.m24321b(z7 ? 1 : 0);
        this.f20892f.mo24327b(this.f20860D);
        m24272k1(1);
    }

    /* renamed from: t */
    public final C5768y0 m24293t(C5770z0 c5770z0, long j7) {
        return new C5768y0(this.f20887c, j7, this.f20889d, this.f20892f.mo24334i(), this.f20857A, c5770z0, this.f20891e);
    }

    /* renamed from: t0 */
    public synchronized boolean m24294t0() {
        if (!this.f20865I && this.f20896q.getThread().isAlive()) {
            this.f20894o.mo21626f(7);
            m24213C1(new InterfaceC2939v() { // from class: n0.n0
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    Boolean m24251a0;
                    m24251a0 = C5752q0.this.m24251a0();
                    return m24251a0;
                }
            }, this.f20859C);
            return this.f20865I;
        }
        return true;
    }

    /* renamed from: t1 */
    public final void m24295t1() {
        this.f20901v.m24346g();
        for (InterfaceC5703V0 interfaceC5703V0 : this.f20883a) {
            if (m24196X(interfaceC5703V0)) {
                m24205A(interfaceC5703V0);
            }
        }
    }

    /* renamed from: u */
    public final void m24296u(C5697S0 c5697s0) {
        if (c5697s0.m23879j()) {
            return;
        }
        try {
            c5697s0.m23876g().mo2838A(c5697s0.m23878i(), c5697s0.m23874e());
        } finally {
            c5697s0.m23880k(true);
        }
    }

    /* renamed from: u0 */
    public final void m24297u0() {
        try {
            m24206A0(true, false, true, false);
            m24300v0();
            this.f20892f.mo24331f(this.f20860D);
            m24272k1(1);
            HandlerThread handlerThread = this.f20895p;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f20865I = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f20895p;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f20865I = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: u1 */
    public final void m24298u1() {
        C5768y0 m23780m = this.f20905z.m23780m();
        boolean z6 = this.f20870N || (m23780m != null && m23780m.f21025a.mo310d());
        C5695R0 c5695r0 = this.f20863G;
        if (z6 != c5695r0.f20593g) {
            this.f20863G = c5695r0.m23858b(z6);
        }
    }

    /* renamed from: v */
    public final void m24299v(InterfaceC5703V0 interfaceC5703V0) {
        if (m24196X(interfaceC5703V0)) {
            this.f20901v.m24341a(interfaceC5703V0);
            m24205A(interfaceC5703V0);
            interfaceC5703V0.mo23906h();
            this.f20876T--;
        }
    }

    /* renamed from: v0 */
    public final void m24300v0() {
        for (int i7 = 0; i7 < this.f20883a.length; i7++) {
            this.f20887c[i7].mo23930n();
            this.f20883a[i7].release();
        }
    }

    /* renamed from: v1 */
    public final void m24301v1(InterfaceC0120F.b bVar, C0165m0 c0165m0, C0350E c0350e) {
        this.f20892f.mo24332g(this.f20860D, this.f20863G.f20587a, bVar, this.f20883a, c0165m0, c0350e.f1303c);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d8  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24302w() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5752q0.m24302w():void");
    }

    /* renamed from: w0 */
    public final void m24303w0(int i7, int i8, InterfaceC0149e0 interfaceC0149e0) {
        this.f20864H.m24321b(1);
        m24230O(this.f20857A.m23807A(i7, i8, interfaceC0149e0), false);
    }

    /* renamed from: w1 */
    public final void m24304w1(int i7, int i8, List list) {
        this.f20864H.m24321b(1);
        m24230O(this.f20857A.m23811E(i7, i8, list), false);
    }

    /* renamed from: x */
    public final void m24305x(int i7, boolean z6, long j7) {
        InterfaceC5703V0 interfaceC5703V0 = this.f20883a[i7];
        if (m24196X(interfaceC5703V0)) {
            return;
        }
        C5768y0 m23788u = this.f20905z.m23788u();
        boolean z7 = m23788u == this.f20905z.m23787t();
        C0350E m24405p = m23788u.m24405p();
        C5709Y0 c5709y0 = m24405p.f1302b[i7];
        C4327q[] m24190E = m24190E(m24405p.f1303c[i7]);
        boolean z8 = m24278n1() && this.f20863G.f20591e == 3;
        boolean z9 = !z6 && z8;
        this.f20876T++;
        this.f20885b.add(interfaceC5703V0);
        interfaceC5703V0.mo23915x(c5709y0, m24190E, m23788u.f21027c[i7], this.f20878V, z9, z7, j7, m23788u.m24402m(), m23788u.f21030f.f21041a);
        interfaceC5703V0.mo2838A(11, new a());
        this.f20901v.m24342b(interfaceC5703V0);
        if (z8 && z7) {
            interfaceC5703V0.start();
        }
    }

    /* renamed from: x0 */
    public final boolean m24306x0() {
        C5768y0 m23788u = this.f20905z.m23788u();
        C0350E m24405p = m23788u.m24405p();
        int i7 = 0;
        boolean z6 = false;
        while (true) {
            InterfaceC5703V0[] interfaceC5703V0Arr = this.f20883a;
            if (i7 >= interfaceC5703V0Arr.length) {
                return !z6;
            }
            InterfaceC5703V0 interfaceC5703V0 = interfaceC5703V0Arr[i7];
            if (m24196X(interfaceC5703V0)) {
                boolean z7 = interfaceC5703V0.mo23899B() != m23788u.f21027c[i7];
                if (!m24405p.m1386c(i7) || z7) {
                    if (!interfaceC5703V0.mo23903G()) {
                        interfaceC5703V0.mo23908l(m24190E(m24405p.f1303c[i7]), m23788u.f21027c[i7], m23788u.m24403n(), m23788u.m24402m(), m23788u.f21030f.f21041a);
                        if (this.f20875S) {
                            m24249Y0(false);
                        }
                    } else if (interfaceC5703V0.mo1253c()) {
                        m24299v(interfaceC5703V0);
                    } else {
                        z6 = true;
                    }
                }
            }
            i7++;
        }
    }

    /* renamed from: x1 */
    public final void m24307x1() {
        if (this.f20863G.f20587a.m18032q() || !this.f20857A.m23821t()) {
            return;
        }
        boolean m24261f0 = m24261f0();
        m24269j0();
        m24271k0();
        m24265h0();
        m24267i0(m24261f0);
    }

    /* renamed from: y */
    public final void m24308y() {
        m24311z(new boolean[this.f20883a.length], this.f20905z.m23788u().m24403n());
    }

    /* renamed from: y0 */
    public final void m24309y0() {
        float f7 = this.f20901v.mo23946i().f14768a;
        C5768y0 m23788u = this.f20905z.m23788u();
        C0350E c0350e = null;
        boolean z6 = true;
        for (C5768y0 m23787t = this.f20905z.m23787t(); m23787t != null && m23787t.f21028d; m23787t = m23787t.m24400k()) {
            C0350E m24412x = m23787t.m24412x(f7, this.f20863G.f20587a);
            if (m23787t == this.f20905z.m23787t()) {
                c0350e = m24412x;
            }
            if (!m24412x.m1384a(m23787t.m24405p())) {
                if (z6) {
                    C5768y0 m23787t2 = this.f20905z.m23787t();
                    boolean m23759I = this.f20905z.m23759I(m23787t2);
                    boolean[] zArr = new boolean[this.f20883a.length];
                    long m24392b = m23787t2.m24392b((C0350E) AbstractC5332a.m21800e(c0350e), this.f20863G.f20605s, m23759I, zArr);
                    C5695R0 c5695r0 = this.f20863G;
                    boolean z7 = (c5695r0.f20591e == 4 || m24392b == c5695r0.f20605s) ? false : true;
                    C5695R0 c5695r02 = this.f20863G;
                    this.f20863G = m24238S(c5695r02.f20588b, m24392b, c5695r02.f20589c, c5695r02.f20590d, z7, 5);
                    if (z7) {
                        m24212C0(m24392b);
                    }
                    boolean[] zArr2 = new boolean[this.f20883a.length];
                    int i7 = 0;
                    while (true) {
                        InterfaceC5703V0[] interfaceC5703V0Arr = this.f20883a;
                        if (i7 >= interfaceC5703V0Arr.length) {
                            break;
                        }
                        InterfaceC5703V0 interfaceC5703V0 = interfaceC5703V0Arr[i7];
                        boolean m24196X = m24196X(interfaceC5703V0);
                        zArr2[i7] = m24196X;
                        InterfaceC0145c0 interfaceC0145c0 = m23787t2.f21027c[i7];
                        if (m24196X) {
                            if (interfaceC0145c0 != interfaceC5703V0.mo23899B()) {
                                m24299v(interfaceC5703V0);
                            } else if (zArr[i7]) {
                                interfaceC5703V0.mo23902F(this.f20878V);
                            }
                        }
                        i7++;
                    }
                    m24311z(zArr2, this.f20878V);
                } else {
                    this.f20905z.m23759I(m23787t);
                    if (m23787t.f21028d) {
                        m23787t.m24391a(m24412x, Math.max(m23787t.f21030f.f21042b, m23787t.m24388A(this.f20878V)), false);
                    }
                }
                m24228N(true);
                if (this.f20863G.f20591e != 4) {
                    m24255c0();
                    m24310y1();
                    this.f20894o.mo21626f(2);
                    return;
                }
                return;
            }
            if (m23787t == m23788u) {
                z6 = false;
            }
        }
    }

    /* renamed from: y1 */
    public final void m24310y1() {
        C5768y0 m23787t = this.f20905z.m23787t();
        if (m23787t == null) {
            return;
        }
        long mo319s = m23787t.f21028d ? m23787t.f21025a.mo319s() : -9223372036854775807L;
        if (mo319s != -9223372036854775807L) {
            if (!m23787t.m24408s()) {
                this.f20905z.m23759I(m23787t);
                m24228N(false);
                m24255c0();
            }
            m24212C0(mo319s);
            if (mo319s != this.f20863G.f20605s) {
                C5695R0 c5695r0 = this.f20863G;
                this.f20863G = m24238S(c5695r0.f20588b, mo319s, c5695r0.f20589c, mo319s, true, 5);
            }
        } else {
            long m24347h = this.f20901v.m24347h(m23787t != this.f20905z.m23788u());
            this.f20878V = m24347h;
            long m24388A = m23787t.m24388A(m24347h);
            m24259e0(this.f20863G.f20605s, m24388A);
            if (this.f20901v.mo23948y()) {
                boolean z6 = !this.f20864H.f20918d;
                C5695R0 c5695r02 = this.f20863G;
                this.f20863G = m24238S(c5695r02.f20588b, m24388A, c5695r02.f20589c, m24388A, z6, 6);
            } else {
                this.f20863G.m23869o(m24388A);
            }
        }
        this.f20863G.f20603q = this.f20905z.m23780m().m24399j();
        this.f20863G.f20604r = m24220J();
        C5695R0 c5695r03 = this.f20863G;
        if (c5695r03.f20598l && c5695r03.f20591e == 3 && m24283p1(c5695r03.f20587a, c5695r03.f20588b) && this.f20863G.f20601o.f14768a == 1.0f) {
            float mo24180a = this.f20858B.mo24180a(m24214D(), m24220J());
            if (this.f20901v.mo23946i().f14768a != mo24180a) {
                m24244V0(this.f20863G.f20601o.m17949b(mo24180a));
                m24234Q(this.f20863G.f20601o, this.f20901v.mo23946i().f14768a, false, false);
            }
        }
    }

    /* renamed from: z */
    public final void m24311z(boolean[] zArr, long j7) {
        C5768y0 m23788u = this.f20905z.m23788u();
        C0350E m24405p = m23788u.m24405p();
        for (int i7 = 0; i7 < this.f20883a.length; i7++) {
            if (!m24405p.m1386c(i7) && this.f20885b.remove(this.f20883a[i7])) {
                this.f20883a[i7].reset();
            }
        }
        for (int i8 = 0; i8 < this.f20883a.length; i8++) {
            if (m24405p.m1386c(i8)) {
                m24305x(i8, zArr[i8], j7);
            }
        }
        m23788u.f21031g = true;
    }

    /* renamed from: z0 */
    public final void m24312z0() {
        m24309y0();
        m24225L0(true);
    }

    /* renamed from: z1 */
    public final void m24313z1(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I2, InterfaceC0120F.b bVar2, long j7, boolean z6) {
        if (!m24283p1(abstractC4303I, bVar)) {
            C4297C c4297c = bVar.m345b() ? C4297C.f14765d : this.f20863G.f20601o;
            if (this.f20901v.mo23946i().equals(c4297c)) {
                return;
            }
            m24244V0(c4297c);
            m24234Q(this.f20863G.f20601o, c4297c.f14768a, false, false);
            return;
        }
        abstractC4303I.m18031n(abstractC4303I.mo18028h(bVar.f367a, this.f20898s).f14811c, this.f20897r);
        this.f20858B.mo24183d((C4331u.g) AbstractC5330M.m21747i(this.f20897r.f14841j));
        if (j7 != -9223372036854775807L) {
            this.f20858B.mo24184e(m24215F(abstractC4303I, bVar.f367a, j7));
            return;
        }
        if (!AbstractC5330M.m21729c(!abstractC4303I2.m18032q() ? abstractC4303I2.m18031n(abstractC4303I2.mo18028h(bVar2.f367a, this.f20898s).f14811c, this.f20897r).f14832a : null, this.f20897r.f14832a) || z6) {
            this.f20858B.mo24184e(-9223372036854775807L);
        }
    }
}
