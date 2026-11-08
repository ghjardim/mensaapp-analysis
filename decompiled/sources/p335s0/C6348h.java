package p335s0;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p050H0.C0542k;
import p050H0.InterfaceC0544m;
import p178Z2.AbstractC3006U;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3037z;
import p232g0.AbstractC4317g;
import p232g0.AbstractC4336z;
import p232g0.C4323m;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p300o0.C5912w1;
import p335s0.C6347g;
import p335s0.C6348h;
import p335s0.InterfaceC6326F;
import p335s0.InterfaceC6354n;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;

/* renamed from: s0.h */
/* loaded from: classes.dex */
public class C6348h implements InterfaceC6364x {

    /* renamed from: b */
    public final UUID f22946b;

    /* renamed from: c */
    public final InterfaceC6326F.c f22947c;

    /* renamed from: d */
    public final InterfaceC6337Q f22948d;

    /* renamed from: e */
    public final HashMap f22949e;

    /* renamed from: f */
    public final boolean f22950f;

    /* renamed from: g */
    public final int[] f22951g;

    /* renamed from: h */
    public final boolean f22952h;

    /* renamed from: i */
    public final g f22953i;

    /* renamed from: j */
    public final InterfaceC0544m f22954j;

    /* renamed from: k */
    public final h f22955k;

    /* renamed from: l */
    public final long f22956l;

    /* renamed from: m */
    public final List f22957m;

    /* renamed from: n */
    public final Set f22958n;

    /* renamed from: o */
    public final Set f22959o;

    /* renamed from: p */
    public int f22960p;

    /* renamed from: q */
    public InterfaceC6326F f22961q;

    /* renamed from: r */
    public C6347g f22962r;

    /* renamed from: s */
    public C6347g f22963s;

    /* renamed from: t */
    public Looper f22964t;

    /* renamed from: u */
    public Handler f22965u;

    /* renamed from: v */
    public int f22966v;

    /* renamed from: w */
    public byte[] f22967w;

    /* renamed from: x */
    public C5912w1 f22968x;

    /* renamed from: y */
    public volatile d f22969y;

    /* renamed from: s0.h$b */
    public static final class b {

        /* renamed from: d */
        public boolean f22973d;

        /* renamed from: a */
        public final HashMap f22970a = new HashMap();

        /* renamed from: b */
        public UUID f22971b = AbstractC4317g.f15030d;

        /* renamed from: c */
        public InterfaceC6326F.c f22972c = C6334N.f22898d;

        /* renamed from: e */
        public int[] f22974e = new int[0];

        /* renamed from: f */
        public boolean f22975f = true;

        /* renamed from: g */
        public InterfaceC0544m f22976g = new C0542k();

        /* renamed from: h */
        public long f22977h = 300000;

        /* renamed from: a */
        public C6348h m26615a(InterfaceC6337Q interfaceC6337Q) {
            return new C6348h(this.f22971b, this.f22972c, interfaceC6337Q, this.f22970a, this.f22973d, this.f22974e, this.f22975f, this.f22976g, this.f22977h);
        }

        /* renamed from: b */
        public b m26616b(InterfaceC0544m interfaceC0544m) {
            this.f22976g = (InterfaceC0544m) AbstractC5332a.m21800e(interfaceC0544m);
            return this;
        }

        /* renamed from: c */
        public b m26617c(boolean z6) {
            this.f22973d = z6;
            return this;
        }

        /* renamed from: d */
        public b m26618d(boolean z6) {
            this.f22975f = z6;
            return this;
        }

        /* renamed from: e */
        public b m26619e(int... iArr) {
            for (int i7 : iArr) {
                boolean z6 = true;
                if (i7 != 2 && i7 != 1) {
                    z6 = false;
                }
                AbstractC5332a.m21796a(z6);
            }
            this.f22974e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: f */
        public b m26620f(UUID uuid, InterfaceC6326F.c cVar) {
            this.f22971b = (UUID) AbstractC5332a.m21800e(uuid);
            this.f22972c = (InterfaceC6326F.c) AbstractC5332a.m21800e(cVar);
            return this;
        }
    }

    /* renamed from: s0.h$c */
    public class c implements InterfaceC6326F.b {
        public c() {
        }

        @Override // p335s0.InterfaceC6326F.b
        /* renamed from: a */
        public void mo26506a(InterfaceC6326F interfaceC6326F, byte[] bArr, int i7, int i8, byte[] bArr2) {
            ((d) AbstractC5332a.m21800e(C6348h.this.f22969y)).obtainMessage(i7, bArr).sendToTarget();
        }
    }

    /* renamed from: s0.h$d */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C6347g c6347g : C6348h.this.f22957m) {
                if (c6347g.m26569u(bArr)) {
                    c6347g.m26557C(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: s0.h$e */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: s0.h$f */
    public class f implements InterfaceC6364x.b {

        /* renamed from: b */
        public final InterfaceC6362v.a f22980b;

        /* renamed from: c */
        public InterfaceC6354n f22981c;

        /* renamed from: d */
        public boolean f22982d;

        public f(InterfaceC6362v.a aVar) {
            this.f22980b = aVar;
        }

        /* renamed from: c */
        public void m26623c(final C4327q c4327q) {
            ((Handler) AbstractC5332a.m21800e(C6348h.this.f22965u)).post(new Runnable() { // from class: s0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C6348h.f.this.m26624d(c4327q);
                }
            });
        }

        /* renamed from: d */
        public final /* synthetic */ void m26624d(C4327q c4327q) {
            if (C6348h.this.f22960p == 0 || this.f22982d) {
                return;
            }
            C6348h c6348h = C6348h.this;
            this.f22981c = c6348h.m26610t((Looper) AbstractC5332a.m21800e(c6348h.f22964t), this.f22980b, c4327q, false);
            C6348h.this.f22958n.add(this);
        }

        /* renamed from: e */
        public final /* synthetic */ void m26625e() {
            if (this.f22982d) {
                return;
            }
            InterfaceC6354n interfaceC6354n = this.f22981c;
            if (interfaceC6354n != null) {
                interfaceC6354n.mo26500g(this.f22980b);
            }
            C6348h.this.f22958n.remove(this);
            this.f22982d = true;
        }

        @Override // p335s0.InterfaceC6364x.b
        public void release() {
            AbstractC5330M.m21710T0((Handler) AbstractC5332a.m21800e(C6348h.this.f22965u), new Runnable() { // from class: s0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C6348h.f.this.m26625e();
                }
            });
        }
    }

    /* renamed from: s0.h$g */
    public class g implements C6347g.a {

        /* renamed from: a */
        public final Set f22984a = new HashSet();

        /* renamed from: b */
        public C6347g f22985b;

        public g() {
        }

        @Override // p335s0.C6347g.a
        /* renamed from: a */
        public void mo26573a(Exception exc, boolean z6) {
            this.f22985b = null;
            AbstractC3033v m11048p = AbstractC3033v.m11048p(this.f22984a);
            this.f22984a.clear();
            AbstractC3010Y it = m11048p.iterator();
            while (it.hasNext()) {
                ((C6347g) it.next()).m26559E(exc, z6);
            }
        }

        @Override // p335s0.C6347g.a
        /* renamed from: b */
        public void mo26574b(C6347g c6347g) {
            this.f22984a.add(c6347g);
            if (this.f22985b != null) {
                return;
            }
            this.f22985b = c6347g;
            c6347g.m26563I();
        }

        @Override // p335s0.C6347g.a
        /* renamed from: c */
        public void mo26575c() {
            this.f22985b = null;
            AbstractC3033v m11048p = AbstractC3033v.m11048p(this.f22984a);
            this.f22984a.clear();
            AbstractC3010Y it = m11048p.iterator();
            while (it.hasNext()) {
                ((C6347g) it.next()).m26558D();
            }
        }

        /* renamed from: d */
        public void m26626d(C6347g c6347g) {
            this.f22984a.remove(c6347g);
            if (this.f22985b == c6347g) {
                this.f22985b = null;
                if (this.f22984a.isEmpty()) {
                    return;
                }
                C6347g c6347g2 = (C6347g) this.f22984a.iterator().next();
                this.f22985b = c6347g2;
                c6347g2.m26563I();
            }
        }
    }

    /* renamed from: s0.h$h */
    public class h implements C6347g.b {
        public h() {
        }

        @Override // p335s0.C6347g.b
        /* renamed from: a */
        public void mo26576a(final C6347g c6347g, int i7) {
            if (i7 == 1 && C6348h.this.f22960p > 0 && C6348h.this.f22956l != -9223372036854775807L) {
                C6348h.this.f22959o.add(c6347g);
                ((Handler) AbstractC5332a.m21800e(C6348h.this.f22965u)).postAtTime(new Runnable() { // from class: s0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6347g.this.mo26500g(null);
                    }
                }, c6347g, SystemClock.uptimeMillis() + C6348h.this.f22956l);
            } else if (i7 == 0) {
                C6348h.this.f22957m.remove(c6347g);
                if (C6348h.this.f22962r == c6347g) {
                    C6348h.this.f22962r = null;
                }
                if (C6348h.this.f22963s == c6347g) {
                    C6348h.this.f22963s = null;
                }
                C6348h.this.f22953i.m26626d(c6347g);
                if (C6348h.this.f22956l != -9223372036854775807L) {
                    ((Handler) AbstractC5332a.m21800e(C6348h.this.f22965u)).removeCallbacksAndMessages(c6347g);
                    C6348h.this.f22959o.remove(c6347g);
                }
            }
            C6348h.this.m26599C();
        }

        @Override // p335s0.C6347g.b
        /* renamed from: b */
        public void mo26577b(C6347g c6347g, int i7) {
            if (C6348h.this.f22956l != -9223372036854775807L) {
                C6348h.this.f22959o.remove(c6347g);
                ((Handler) AbstractC5332a.m21800e(C6348h.this.f22965u)).removeCallbacksAndMessages(c6347g);
            }
        }
    }

    /* renamed from: u */
    public static boolean m26595u(InterfaceC6354n interfaceC6354n) {
        if (interfaceC6354n.mo26498e() != 1) {
            return false;
        }
        Throwable cause = ((InterfaceC6354n.a) AbstractC5332a.m21800e(interfaceC6354n.mo26494a())).getCause();
        return (cause instanceof ResourceBusyException) || AbstractC6322B.m26477c(cause);
    }

    /* renamed from: y */
    public static List m26596y(C4323m c4323m, UUID uuid, boolean z6) {
        ArrayList arrayList = new ArrayList(c4323m.f15070d);
        for (int i7 = 0; i7 < c4323m.f15070d; i7++) {
            C4323m.b m18169e = c4323m.m18169e(i7);
            if ((m18169e.m18176d(uuid) || (AbstractC4317g.f15029c.equals(uuid) && m18169e.m18176d(AbstractC4317g.f15028b))) && (m18169e.f15075e != null || z6)) {
                arrayList.add(m18169e);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final InterfaceC6354n m26597A(int i7, boolean z6) {
        InterfaceC6326F interfaceC6326F = (InterfaceC6326F) AbstractC5332a.m21800e(this.f22961q);
        if ((interfaceC6326F.mo26493m() == 2 && C6327G.f22892d) || AbstractC5330M.m21688I0(this.f22951g, i7) == -1 || interfaceC6326F.mo26493m() == 1) {
            return null;
        }
        C6347g c6347g = this.f22962r;
        if (c6347g == null) {
            C6347g m26613x = m26613x(AbstractC3033v.m11050t(), true, null, z6);
            this.f22957m.add(m26613x);
            this.f22962r = m26613x;
        } else {
            c6347g.mo26499f(null);
        }
        return this.f22962r;
    }

    /* renamed from: B */
    public final void m26598B(Looper looper) {
        if (this.f22969y == null) {
            this.f22969y = new d(looper);
        }
    }

    /* renamed from: C */
    public final void m26599C() {
        if (this.f22961q != null && this.f22960p == 0 && this.f22957m.isEmpty() && this.f22958n.isEmpty()) {
            ((InterfaceC6326F) AbstractC5332a.m21800e(this.f22961q)).release();
            this.f22961q = null;
        }
    }

    /* renamed from: D */
    public final void m26600D() {
        AbstractC3010Y it = AbstractC3037z.m11106o(this.f22959o).iterator();
        while (it.hasNext()) {
            ((InterfaceC6354n) it.next()).mo26500g(null);
        }
    }

    /* renamed from: E */
    public final void m26601E() {
        AbstractC3010Y it = AbstractC3037z.m11106o(this.f22958n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    /* renamed from: F */
    public void m26602F(int i7, byte[] bArr) {
        AbstractC5332a.m21802g(this.f22957m.isEmpty());
        if (i7 == 1 || i7 == 3) {
            AbstractC5332a.m21800e(bArr);
        }
        this.f22966v = i7;
        this.f22967w = bArr;
    }

    /* renamed from: G */
    public final void m26603G(InterfaceC6354n interfaceC6354n, InterfaceC6362v.a aVar) {
        interfaceC6354n.mo26500g(aVar);
        if (this.f22956l != -9223372036854775807L) {
            interfaceC6354n.mo26500g(null);
        }
    }

    /* renamed from: H */
    public final void m26604H(boolean z6) {
        if (z6 && this.f22964t == null) {
            AbstractC5346o.m21868i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC5332a.m21800e(this.f22964t)).getThread()) {
            AbstractC5346o.m21868i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f22964t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p335s0.InterfaceC6364x
    /* renamed from: a */
    public InterfaceC6364x.b mo26605a(InterfaceC6362v.a aVar, C4327q c4327q) {
        AbstractC5332a.m21802g(this.f22960p > 0);
        AbstractC5332a.m21804i(this.f22964t);
        f fVar = new f(aVar);
        fVar.m26623c(c4327q);
        return fVar;
    }

    @Override // p335s0.InterfaceC6364x
    /* renamed from: b */
    public InterfaceC6354n mo26606b(InterfaceC6362v.a aVar, C4327q c4327q) {
        m26604H(false);
        AbstractC5332a.m21802g(this.f22960p > 0);
        AbstractC5332a.m21804i(this.f22964t);
        return m26610t(this.f22964t, aVar, c4327q, true);
    }

    @Override // p335s0.InterfaceC6364x
    /* renamed from: c */
    public void mo26607c(Looper looper, C5912w1 c5912w1) {
        m26614z(looper);
        this.f22968x = c5912w1;
    }

    @Override // p335s0.InterfaceC6364x
    /* renamed from: d */
    public int mo26608d(C4327q c4327q) {
        m26604H(false);
        int mo26493m = ((InterfaceC6326F) AbstractC5332a.m21800e(this.f22961q)).mo26493m();
        C4323m c4323m = c4327q.f15142r;
        if (c4323m != null) {
            if (m26611v(c4323m)) {
                return mo26493m;
            }
            return 1;
        }
        if (AbstractC5330M.m21688I0(this.f22951g, AbstractC4336z.m18418k(c4327q.f15138n)) != -1) {
            return mo26493m;
        }
        return 0;
    }

    @Override // p335s0.InterfaceC6364x
    /* renamed from: f */
    public final void mo26609f() {
        m26604H(true);
        int i7 = this.f22960p;
        this.f22960p = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.f22961q == null) {
            InterfaceC6326F mo26507a = this.f22947c.mo26507a(this.f22946b);
            this.f22961q = mo26507a;
            mo26507a.mo26490j(new c());
        } else if (this.f22956l != -9223372036854775807L) {
            for (int i8 = 0; i8 < this.f22957m.size(); i8++) {
                ((C6347g) this.f22957m.get(i8)).mo26499f(null);
            }
        }
    }

    @Override // p335s0.InterfaceC6364x
    public final void release() {
        m26604H(true);
        int i7 = this.f22960p - 1;
        this.f22960p = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f22956l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f22957m);
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C6347g) arrayList.get(i8)).mo26500g(null);
            }
        }
        m26601E();
        m26599C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final InterfaceC6354n m26610t(Looper looper, InterfaceC6362v.a aVar, C4327q c4327q, boolean z6) {
        List list;
        m26598B(looper);
        C4323m c4323m = c4327q.f15142r;
        if (c4323m == null) {
            return m26597A(AbstractC4336z.m18418k(c4327q.f15138n), z6);
        }
        C6347g c6347g = null;
        Object[] objArr = 0;
        if (this.f22967w == null) {
            list = m26596y((C4323m) AbstractC5332a.m21800e(c4323m), this.f22946b, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f22946b);
                AbstractC5346o.m21863d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.m26643l(eVar);
                }
                return new C6324D(new InterfaceC6354n.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f22950f) {
            Iterator it = this.f22957m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6347g c6347g2 = (C6347g) it.next();
                if (AbstractC5330M.m21729c(c6347g2.f22913a, list)) {
                    c6347g = c6347g2;
                    break;
                }
            }
        } else {
            c6347g = this.f22963s;
        }
        if (c6347g == null) {
            c6347g = m26613x(list, false, aVar, z6);
            if (!this.f22950f) {
                this.f22963s = c6347g;
            }
            this.f22957m.add(c6347g);
        } else {
            c6347g.mo26499f(aVar);
        }
        return c6347g;
    }

    /* renamed from: v */
    public final boolean m26611v(C4323m c4323m) {
        if (this.f22967w != null) {
            return true;
        }
        if (m26596y(c4323m, this.f22946b, true).isEmpty()) {
            if (c4323m.f15070d != 1 || !c4323m.m18169e(0).m18176d(AbstractC4317g.f15028b)) {
                return false;
            }
            AbstractC5346o.m21867h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f22946b);
        }
        String str = c4323m.f15069c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? AbstractC5330M.f18800a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    /* renamed from: w */
    public final C6347g m26612w(List list, boolean z6, InterfaceC6362v.a aVar) {
        AbstractC5332a.m21800e(this.f22961q);
        C6347g c6347g = new C6347g(this.f22946b, this.f22961q, this.f22953i, this.f22955k, list, this.f22966v, this.f22952h | z6, z6, this.f22967w, this.f22949e, this.f22948d, (Looper) AbstractC5332a.m21800e(this.f22964t), this.f22954j, (C5912w1) AbstractC5332a.m21800e(this.f22968x));
        c6347g.mo26499f(aVar);
        if (this.f22956l != -9223372036854775807L) {
            c6347g.mo26499f(null);
        }
        return c6347g;
    }

    /* renamed from: x */
    public final C6347g m26613x(List list, boolean z6, InterfaceC6362v.a aVar, boolean z7) {
        C6347g m26612w = m26612w(list, z6, aVar);
        if (m26595u(m26612w) && !this.f22959o.isEmpty()) {
            m26600D();
            m26603G(m26612w, aVar);
            m26612w = m26612w(list, z6, aVar);
        }
        if (!m26595u(m26612w) || !z7 || this.f22958n.isEmpty()) {
            return m26612w;
        }
        m26601E();
        if (!this.f22959o.isEmpty()) {
            m26600D();
        }
        m26603G(m26612w, aVar);
        return m26612w(list, z6, aVar);
    }

    /* renamed from: z */
    public final synchronized void m26614z(Looper looper) {
        try {
            Looper looper2 = this.f22964t;
            if (looper2 == null) {
                this.f22964t = looper;
                this.f22965u = new Handler(looper);
            } else {
                AbstractC5332a.m21802g(looper2 == looper);
                AbstractC5332a.m21800e(this.f22965u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C6348h(UUID uuid, InterfaceC6326F.c cVar, InterfaceC6337Q interfaceC6337Q, HashMap hashMap, boolean z6, int[] iArr, boolean z7, InterfaceC0544m interfaceC0544m, long j7) {
        AbstractC5332a.m21800e(uuid);
        AbstractC5332a.m21797b(!AbstractC4317g.f15028b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f22946b = uuid;
        this.f22947c = cVar;
        this.f22948d = interfaceC6337Q;
        this.f22949e = hashMap;
        this.f22950f = z6;
        this.f22951g = iArr;
        this.f22952h = z7;
        this.f22954j = interfaceC0544m;
        this.f22953i = new g();
        this.f22955k = new h();
        this.f22966v = 0;
        this.f22957m = new ArrayList();
        this.f22958n = AbstractC3006U.m10881h();
        this.f22959o = AbstractC3006U.m10881h();
        this.f22956l = j7;
    }
}
