package p292n0;

import java.util.HashMap;
import java.util.Iterator;
import p022D0.C0165m0;
import p022D0.InterfaceC0120F;
import p043G0.InterfaceC0375y;
import p050H0.C0539h;
import p050H0.InterfaceC0533b;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p292n0.InterfaceC5760u0;
import p300o0.C5912w1;

/* renamed from: n0.r */
/* loaded from: classes.dex */
public class C5753r implements InterfaceC5760u0 {

    /* renamed from: a */
    public final C0539h f20929a;

    /* renamed from: b */
    public final long f20930b;

    /* renamed from: c */
    public final long f20931c;

    /* renamed from: d */
    public final long f20932d;

    /* renamed from: e */
    public final long f20933e;

    /* renamed from: f */
    public final int f20934f;

    /* renamed from: g */
    public final boolean f20935g;

    /* renamed from: h */
    public final long f20936h;

    /* renamed from: i */
    public final boolean f20937i;

    /* renamed from: j */
    public final HashMap f20938j;

    /* renamed from: k */
    public long f20939k;

    /* renamed from: n0.r$b */
    public static class b {

        /* renamed from: a */
        public boolean f20940a;

        /* renamed from: b */
        public int f20941b;

        public b() {
        }
    }

    public C5753r() {
        this(new C0539h(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* renamed from: j */
    public static void m24324j(int i7, int i8, String str, String str2) {
        AbstractC5332a.m21797b(i7 >= i8, str + " cannot be less than " + str2);
    }

    /* renamed from: m */
    public static int m24325m(int i7) {
        switch (i7) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: a */
    public long mo24326a(C5912w1 c5912w1) {
        return this.f20936h;
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: b */
    public void mo24327b(C5912w1 c5912w1) {
        m24337n(c5912w1);
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: c */
    public boolean mo24328c(InterfaceC5760u0.a aVar) {
        long m21751j0 = AbstractC5330M.m21751j0(aVar.f20976e, aVar.f20977f);
        long j7 = aVar.f20979h ? this.f20933e : this.f20932d;
        long j8 = aVar.f20980i;
        if (j8 != -9223372036854775807L) {
            j7 = Math.min(j8 / 2, j7);
        }
        return j7 <= 0 || m21751j0 >= j7 || (!this.f20935g && this.f20929a.m2067f() >= m24336l());
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: d */
    public boolean mo24329d(C5912w1 c5912w1) {
        return this.f20937i;
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: e */
    public void mo24330e(C5912w1 c5912w1) {
        long id = Thread.currentThread().getId();
        long j7 = this.f20939k;
        AbstractC5332a.m21803h(j7 == -1 || j7 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f20939k = id;
        if (!this.f20938j.containsKey(c5912w1)) {
            this.f20938j.put(c5912w1, new b());
        }
        m24338o(c5912w1);
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: f */
    public void mo24331f(C5912w1 c5912w1) {
        m24337n(c5912w1);
        if (this.f20938j.isEmpty()) {
            this.f20939k = -1L;
        }
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: g */
    public void mo24332g(C5912w1 c5912w1, AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar, InterfaceC5703V0[] interfaceC5703V0Arr, C0165m0 c0165m0, InterfaceC0375y[] interfaceC0375yArr) {
        b bVar2 = (b) AbstractC5332a.m21800e((b) this.f20938j.get(c5912w1));
        int i7 = this.f20934f;
        if (i7 == -1) {
            i7 = m24335k(interfaceC5703V0Arr, interfaceC0375yArr);
        }
        bVar2.f20941b = i7;
        m24339p();
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: h */
    public boolean mo24333h(InterfaceC5760u0.a aVar) {
        b bVar = (b) AbstractC5332a.m21800e((b) this.f20938j.get(aVar.f20972a));
        boolean z6 = true;
        boolean z7 = this.f20929a.m2067f() >= m24336l();
        long j7 = this.f20930b;
        float f7 = aVar.f20977f;
        if (f7 > 1.0f) {
            j7 = Math.min(AbstractC5330M.m21736e0(j7, f7), this.f20931c);
        }
        long max = Math.max(j7, 500000L);
        long j8 = aVar.f20976e;
        if (j8 < max) {
            if (!this.f20935g && z7) {
                z6 = false;
            }
            bVar.f20940a = z6;
            if (!z6 && j8 < 500000) {
                AbstractC5346o.m21867h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= this.f20931c || z7) {
            bVar.f20940a = false;
        }
        return bVar.f20940a;
    }

    @Override // p292n0.InterfaceC5760u0
    /* renamed from: i */
    public InterfaceC0533b mo24334i() {
        return this.f20929a;
    }

    /* renamed from: k */
    public int m24335k(InterfaceC5703V0[] interfaceC5703V0Arr, InterfaceC0375y[] interfaceC0375yArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < interfaceC5703V0Arr.length; i8++) {
            if (interfaceC0375yArr[i8] != null) {
                i7 += m24325m(interfaceC5703V0Arr[i8].mo23907j());
            }
        }
        return Math.max(13107200, i7);
    }

    /* renamed from: l */
    public int m24336l() {
        Iterator it = this.f20938j.values().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((b) it.next()).f20941b;
        }
        return i7;
    }

    /* renamed from: n */
    public final void m24337n(C5912w1 c5912w1) {
        if (this.f20938j.remove(c5912w1) != null) {
            m24339p();
        }
    }

    /* renamed from: o */
    public final void m24338o(C5912w1 c5912w1) {
        b bVar = (b) AbstractC5332a.m21800e((b) this.f20938j.get(c5912w1));
        int i7 = this.f20934f;
        if (i7 == -1) {
            i7 = 13107200;
        }
        bVar.f20941b = i7;
        bVar.f20940a = false;
    }

    /* renamed from: p */
    public final void m24339p() {
        if (this.f20938j.isEmpty()) {
            this.f20929a.m2068g();
        } else {
            this.f20929a.m2069h(m24336l());
        }
    }

    public C5753r(C0539h c0539h, int i7, int i8, int i9, int i10, int i11, boolean z6, int i12, boolean z7) {
        m24324j(i9, 0, "bufferForPlaybackMs", "0");
        m24324j(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m24324j(i7, i9, "minBufferMs", "bufferForPlaybackMs");
        m24324j(i7, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m24324j(i8, i7, "maxBufferMs", "minBufferMs");
        m24324j(i12, 0, "backBufferDurationMs", "0");
        this.f20929a = c0539h;
        this.f20930b = AbstractC5330M.m21692K0(i7);
        this.f20931c = AbstractC5330M.m21692K0(i8);
        this.f20932d = AbstractC5330M.m21692K0(i9);
        this.f20933e = AbstractC5330M.m21692K0(i10);
        this.f20934f = i11;
        this.f20935g = z6;
        this.f20936h = AbstractC5330M.m21692K0(i12);
        this.f20937i = z7;
        this.f20938j = new HashMap();
        this.f20939k = -1L;
    }
}
