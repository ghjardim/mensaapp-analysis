package p300o0;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p022D0.InterfaceC0120F;
import p171Y2.InterfaceC2939v;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p300o0.InterfaceC5850c;
import p300o0.InterfaceC5909v1;

/* renamed from: o0.s0 */
/* loaded from: classes.dex */
public final class C5899s0 implements InterfaceC5909v1 {

    /* renamed from: i */
    public static final InterfaceC2939v f21254i = new InterfaceC2939v() { // from class: o0.r0
        @Override // p171Y2.InterfaceC2939v
        public final Object get() {
            String m24815m;
            m24815m = C5899s0.m24815m();
            return m24815m;
        }
    };

    /* renamed from: j */
    public static final Random f21255j = new Random();

    /* renamed from: a */
    public final AbstractC4303I.c f21256a;

    /* renamed from: b */
    public final AbstractC4303I.b f21257b;

    /* renamed from: c */
    public final HashMap f21258c;

    /* renamed from: d */
    public final InterfaceC2939v f21259d;

    /* renamed from: e */
    public InterfaceC5909v1.a f21260e;

    /* renamed from: f */
    public AbstractC4303I f21261f;

    /* renamed from: g */
    public String f21262g;

    /* renamed from: h */
    public long f21263h;

    /* renamed from: o0.s0$a */
    public final class a {

        /* renamed from: a */
        public final String f21264a;

        /* renamed from: b */
        public int f21265b;

        /* renamed from: c */
        public long f21266c;

        /* renamed from: d */
        public InterfaceC0120F.b f21267d;

        /* renamed from: e */
        public boolean f21268e;

        /* renamed from: f */
        public boolean f21269f;

        public a(String str, int i7, InterfaceC0120F.b bVar) {
            this.f21264a = str;
            this.f21265b = i7;
            this.f21266c = bVar == null ? -1L : bVar.f370d;
            if (bVar == null || !bVar.m345b()) {
                return;
            }
            this.f21267d = bVar;
        }

        /* renamed from: i */
        public boolean m24835i(int i7, InterfaceC0120F.b bVar) {
            if (bVar == null) {
                return i7 == this.f21265b;
            }
            InterfaceC0120F.b bVar2 = this.f21267d;
            return bVar2 == null ? !bVar.m345b() && bVar.f370d == this.f21266c : bVar.f370d == bVar2.f370d && bVar.f368b == bVar2.f368b && bVar.f369c == bVar2.f369c;
        }

        /* renamed from: j */
        public boolean m24836j(InterfaceC5850c.a aVar) {
            InterfaceC0120F.b bVar = aVar.f21166d;
            if (bVar == null) {
                return this.f21265b != aVar.f21165c;
            }
            long j7 = this.f21266c;
            if (j7 == -1) {
                return false;
            }
            if (bVar.f370d > j7) {
                return true;
            }
            if (this.f21267d == null) {
                return false;
            }
            int mo302b = aVar.f21164b.mo302b(bVar.f367a);
            int mo302b2 = aVar.f21164b.mo302b(this.f21267d.f367a);
            InterfaceC0120F.b bVar2 = aVar.f21166d;
            if (bVar2.f370d < this.f21267d.f370d || mo302b < mo302b2) {
                return false;
            }
            if (mo302b > mo302b2) {
                return true;
            }
            if (!bVar2.m345b()) {
                int i7 = aVar.f21166d.f371e;
                return i7 == -1 || i7 > this.f21267d.f368b;
            }
            InterfaceC0120F.b bVar3 = aVar.f21166d;
            int i8 = bVar3.f368b;
            int i9 = bVar3.f369c;
            InterfaceC0120F.b bVar4 = this.f21267d;
            int i10 = bVar4.f368b;
            if (i8 <= i10) {
                return i8 == i10 && i9 > bVar4.f369c;
            }
            return true;
        }

        /* renamed from: k */
        public void m24837k(int i7, InterfaceC0120F.b bVar) {
            if (this.f21266c != -1 || i7 != this.f21265b || bVar == null || bVar.f370d < C5899s0.this.m24824n()) {
                return;
            }
            this.f21266c = bVar.f370d;
        }

        /* renamed from: l */
        public final int m24838l(AbstractC4303I abstractC4303I, AbstractC4303I abstractC4303I2, int i7) {
            if (i7 >= abstractC4303I.mo308p()) {
                if (i7 < abstractC4303I2.mo308p()) {
                    return i7;
                }
                return -1;
            }
            abstractC4303I.m18031n(i7, C5899s0.this.f21256a);
            for (int i8 = C5899s0.this.f21256a.f14845n; i8 <= C5899s0.this.f21256a.f14846o; i8++) {
                int mo302b = abstractC4303I2.mo302b(abstractC4303I.mo304m(i8));
                if (mo302b != -1) {
                    return abstractC4303I2.m18027f(mo302b, C5899s0.this.f21257b).f14811c;
                }
            }
            return -1;
        }

        /* renamed from: m */
        public boolean m24839m(AbstractC4303I abstractC4303I, AbstractC4303I abstractC4303I2) {
            int m24838l = m24838l(abstractC4303I, abstractC4303I2, this.f21265b);
            this.f21265b = m24838l;
            if (m24838l == -1) {
                return false;
            }
            InterfaceC0120F.b bVar = this.f21267d;
            return bVar == null || abstractC4303I2.mo302b(bVar.f367a) != -1;
        }
    }

    public C5899s0() {
        this(f21254i);
    }

    /* renamed from: m */
    public static String m24815m() {
        byte[] bArr = new byte[12];
        f21255j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // p300o0.InterfaceC5909v1
    /* renamed from: a */
    public synchronized String mo24816a() {
        return this.f21262g;
    }

    @Override // p300o0.InterfaceC5909v1
    /* renamed from: b */
    public synchronized void mo24817b(InterfaceC5850c.a aVar, int i7) {
        try {
            AbstractC5332a.m21800e(this.f21260e);
            boolean z6 = i7 == 0;
            Iterator it = this.f21258c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.m24836j(aVar)) {
                    it.remove();
                    if (aVar2.f21268e) {
                        boolean equals = aVar2.f21264a.equals(this.f21262g);
                        boolean z7 = z6 && equals && aVar2.f21269f;
                        if (equals) {
                            m24823l(aVar2);
                        }
                        this.f21260e.mo24869s(aVar, aVar2.f21264a, z7);
                    }
                }
            }
            m24826p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p300o0.InterfaceC5909v1
    /* renamed from: c */
    public void mo24818c(InterfaceC5909v1.a aVar) {
        this.f21260e = aVar;
    }

    @Override // p300o0.InterfaceC5909v1
    /* renamed from: d */
    public synchronized String mo24819d(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar) {
        return m24825o(abstractC4303I.mo18028h(bVar.f367a, this.f21257b).f14811c, bVar).f21264a;
    }

    @Override // p300o0.InterfaceC5909v1
    /* renamed from: e */
    public synchronized void mo24820e(InterfaceC5850c.a aVar) {
        InterfaceC5909v1.a aVar2;
        try {
            String str = this.f21262g;
            if (str != null) {
                m24823l((a) AbstractC5332a.m21800e((a) this.f21258c.get(str)));
            }
            Iterator it = this.f21258c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f21268e && (aVar2 = this.f21260e) != null) {
                    aVar2.mo24869s(aVar, aVar3.f21264a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x0018, B:16:0x0024, B:18:0x0030, B:20:0x003a, B:24:0x0047, B:26:0x0053, B:27:0x0059, B:29:0x005e, B:31:0x0064, B:33:0x007d, B:34:0x00d8, B:36:0x00de, B:37:0x00f4, B:39:0x0100, B:41:0x0106), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    @Override // p300o0.InterfaceC5909v1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void mo24821f(p300o0.InterfaceC5850c.a r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p300o0.C5899s0.mo24821f(o0.c$a):void");
    }

    @Override // p300o0.InterfaceC5909v1
    /* renamed from: g */
    public synchronized void mo24822g(InterfaceC5850c.a aVar) {
        try {
            AbstractC5332a.m21800e(this.f21260e);
            AbstractC4303I abstractC4303I = this.f21261f;
            this.f21261f = aVar.f21164b;
            Iterator it = this.f21258c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.m24839m(abstractC4303I, this.f21261f) && !aVar2.m24836j(aVar)) {
                }
                it.remove();
                if (aVar2.f21268e) {
                    if (aVar2.f21264a.equals(this.f21262g)) {
                        m24823l(aVar2);
                    }
                    this.f21260e.mo24869s(aVar, aVar2.f21264a, false);
                }
            }
            m24826p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: l */
    public final void m24823l(a aVar) {
        if (aVar.f21266c != -1) {
            this.f21263h = aVar.f21266c;
        }
        this.f21262g = null;
    }

    /* renamed from: n */
    public final long m24824n() {
        a aVar = (a) this.f21258c.get(this.f21262g);
        return (aVar == null || aVar.f21266c == -1) ? this.f21263h + 1 : aVar.f21266c;
    }

    /* renamed from: o */
    public final a m24825o(int i7, InterfaceC0120F.b bVar) {
        a aVar = null;
        long j7 = Long.MAX_VALUE;
        for (a aVar2 : this.f21258c.values()) {
            aVar2.m24837k(i7, bVar);
            if (aVar2.m24835i(i7, bVar)) {
                long j8 = aVar2.f21266c;
                if (j8 == -1 || j8 < j7) {
                    aVar = aVar2;
                    j7 = j8;
                } else if (j8 == j7 && ((a) AbstractC5330M.m21747i(aVar)).f21267d != null && aVar2.f21267d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f21259d.get();
        a aVar3 = new a(str, i7, bVar);
        this.f21258c.put(str, aVar3);
        return aVar3;
    }

    /* renamed from: p */
    public final void m24826p(InterfaceC5850c.a aVar) {
        if (aVar.f21164b.m18032q()) {
            String str = this.f21262g;
            if (str != null) {
                m24823l((a) AbstractC5332a.m21800e((a) this.f21258c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f21258c.get(this.f21262g);
        a m24825o = m24825o(aVar.f21165c, aVar.f21166d);
        this.f21262g = m24825o.f21264a;
        mo24821f(aVar);
        InterfaceC0120F.b bVar = aVar.f21166d;
        if (bVar == null || !bVar.m345b()) {
            return;
        }
        if (aVar2 != null && aVar2.f21266c == aVar.f21166d.f370d && aVar2.f21267d != null && aVar2.f21267d.f368b == aVar.f21166d.f368b && aVar2.f21267d.f369c == aVar.f21166d.f369c) {
            return;
        }
        InterfaceC0120F.b bVar2 = aVar.f21166d;
        this.f21260e.mo24866b0(aVar, m24825o(aVar.f21165c, new InterfaceC0120F.b(bVar2.f367a, bVar2.f370d)).f21264a, m24825o.f21264a);
    }

    public C5899s0(InterfaceC2939v interfaceC2939v) {
        this.f21259d = interfaceC2939v;
        this.f21256a = new AbstractC4303I.c();
        this.f21257b = new AbstractC4303I.b();
        this.f21258c = new HashMap();
        this.f21261f = AbstractC4303I.f14800a;
        this.f21263h = -1L;
    }
}
