package p050H0;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import p050H0.InterfaceC0536e;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5351t;
import p259j0.InterfaceC5334c;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;

/* renamed from: H0.j */
/* loaded from: classes.dex */
public final class C0541j implements InterfaceC0536e, InterfaceC5511y {

    /* renamed from: p */
    public static final AbstractC3033v f1747p = AbstractC3033v.m11054y(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q */
    public static final AbstractC3033v f1748q = AbstractC3033v.m11054y(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r */
    public static final AbstractC3033v f1749r = AbstractC3033v.m11054y(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s */
    public static final AbstractC3033v f1750s = AbstractC3033v.m11054y(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t */
    public static final AbstractC3033v f1751t = AbstractC3033v.m11054y(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u */
    public static final AbstractC3033v f1752u = AbstractC3033v.m11054y(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: v */
    public static C0541j f1753v;

    /* renamed from: a */
    public final AbstractC3035x f1754a;

    /* renamed from: b */
    public final InterfaceC0536e.a.C7167a f1755b;

    /* renamed from: c */
    public final InterfaceC5334c f1756c;

    /* renamed from: d */
    public final boolean f1757d;

    /* renamed from: e */
    public final C0550s f1758e;

    /* renamed from: f */
    public int f1759f;

    /* renamed from: g */
    public long f1760g;

    /* renamed from: h */
    public long f1761h;

    /* renamed from: i */
    public long f1762i;

    /* renamed from: j */
    public long f1763j;

    /* renamed from: k */
    public long f1764k;

    /* renamed from: l */
    public long f1765l;

    /* renamed from: m */
    public int f1766m;

    /* renamed from: n */
    public boolean f1767n;

    /* renamed from: o */
    public int f1768o;

    /* renamed from: H0.j$b */
    public static final class b {

        /* renamed from: a */
        public final Context f1769a;

        /* renamed from: b */
        public Map f1770b;

        /* renamed from: c */
        public int f1771c;

        /* renamed from: d */
        public InterfaceC5334c f1772d;

        /* renamed from: e */
        public boolean f1773e;

        public b(Context context) {
            this.f1769a = context == null ? null : context.getApplicationContext();
            this.f1770b = m2083b(AbstractC5330M.m21709T(context));
            this.f1771c = 2000;
            this.f1772d = InterfaceC5334c.f18817a;
            this.f1773e = true;
        }

        /* renamed from: b */
        public static Map m2083b(String str) {
            int[] m2073l = C0541j.m2073l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            AbstractC3033v abstractC3033v = C0541j.f1747p;
            hashMap.put(2, (Long) abstractC3033v.get(m2073l[0]));
            hashMap.put(3, (Long) C0541j.f1748q.get(m2073l[1]));
            hashMap.put(4, (Long) C0541j.f1749r.get(m2073l[2]));
            hashMap.put(5, (Long) C0541j.f1750s.get(m2073l[3]));
            hashMap.put(10, (Long) C0541j.f1751t.get(m2073l[4]));
            hashMap.put(9, (Long) C0541j.f1752u.get(m2073l[5]));
            hashMap.put(7, (Long) abstractC3033v.get(m2073l[0]));
            return hashMap;
        }

        /* renamed from: a */
        public C0541j m2084a() {
            return new C0541j(this.f1769a, this.f1770b, this.f1771c, this.f1772d, this.f1773e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1041:0x0cd7, code lost:
    
        if (r8.equals("AI") == false) goto L4;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] m2073l(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p050H0.C0541j.m2073l(java.lang.String):int[]");
    }

    /* renamed from: n */
    public static synchronized C0541j m2074n(Context context) {
        C0541j c0541j;
        synchronized (C0541j.class) {
            try {
                if (f1753v == null) {
                    f1753v = new b(context).m2084a();
                }
                c0541j = f1753v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0541j;
    }

    /* renamed from: o */
    public static boolean m2075o(C5497k c5497k, boolean z6) {
        return z6 && !c5497k.m23083d(8);
    }

    @Override // p050H0.InterfaceC0536e
    /* renamed from: a */
    public /* synthetic */ long mo2045a() {
        return AbstractC0534c.m2044a(this);
    }

    @Override // p050H0.InterfaceC0536e
    /* renamed from: b */
    public void mo2046b(Handler handler, InterfaceC0536e.a aVar) {
        AbstractC5332a.m21800e(handler);
        AbstractC5332a.m21800e(aVar);
        this.f1755b.m2053b(handler, aVar);
    }

    @Override // p276l0.InterfaceC5511y
    /* renamed from: c */
    public synchronized void mo2076c(InterfaceC5493g interfaceC5493g, C5497k c5497k, boolean z6) {
        try {
            if (m2075o(c5497k, z6)) {
                if (this.f1759f == 0) {
                    this.f1760g = this.f1756c.mo21613b();
                }
                this.f1759f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p050H0.InterfaceC0536e
    /* renamed from: d */
    public void mo2047d(InterfaceC0536e.a aVar) {
        this.f1755b.m2055e(aVar);
    }

    @Override // p276l0.InterfaceC5511y
    /* renamed from: e */
    public synchronized void mo2077e(InterfaceC5493g interfaceC5493g, C5497k c5497k, boolean z6) {
        try {
            if (m2075o(c5497k, z6)) {
                AbstractC5332a.m21802g(this.f1759f > 0);
                long mo21613b = this.f1756c.mo21613b();
                int i7 = (int) (mo21613b - this.f1760g);
                this.f1762i += i7;
                long j7 = this.f1763j;
                long j8 = this.f1761h;
                this.f1763j = j7 + j8;
                if (i7 > 0) {
                    this.f1758e.m2123c((int) Math.sqrt(j8), (j8 * 8000.0f) / i7);
                    if (this.f1762i < 2000) {
                        if (this.f1763j >= 524288) {
                        }
                        m2081p(i7, this.f1761h, this.f1764k);
                        this.f1760g = mo21613b;
                        this.f1761h = 0L;
                    }
                    this.f1764k = (long) this.f1758e.m2126f(0.5f);
                    m2081p(i7, this.f1761h, this.f1764k);
                    this.f1760g = mo21613b;
                    this.f1761h = 0L;
                }
                this.f1759f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p276l0.InterfaceC5511y
    /* renamed from: g */
    public synchronized void mo2078g(InterfaceC5493g interfaceC5493g, C5497k c5497k, boolean z6, int i7) {
        if (m2075o(c5497k, z6)) {
            this.f1761h += i7;
        }
    }

    @Override // p050H0.InterfaceC0536e
    /* renamed from: h */
    public synchronized long mo2049h() {
        return this.f1764k;
    }

    /* renamed from: m */
    public final long m2080m(int i7) {
        Long l7 = (Long) this.f1754a.get(Integer.valueOf(i7));
        if (l7 == null) {
            l7 = (Long) this.f1754a.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    /* renamed from: p */
    public final void m2081p(int i7, long j7, long j8) {
        if (i7 == 0 && j7 == 0 && j8 == this.f1765l) {
            return;
        }
        this.f1765l = j8;
        this.f1755b.m2054c(i7, j7, j8);
    }

    /* renamed from: q */
    public final synchronized void m2082q(int i7) {
        int i8 = this.f1766m;
        if (i8 == 0 || this.f1757d) {
            if (this.f1767n) {
                i7 = this.f1768o;
            }
            if (i8 == i7) {
                return;
            }
            this.f1766m = i7;
            if (i7 != 1 && i7 != 0 && i7 != 8) {
                this.f1764k = m2080m(i7);
                long mo21613b = this.f1756c.mo21613b();
                m2081p(this.f1759f > 0 ? (int) (mo21613b - this.f1760g) : 0, this.f1761h, this.f1764k);
                this.f1760g = mo21613b;
                this.f1761h = 0L;
                this.f1763j = 0L;
                this.f1762i = 0L;
                this.f1758e.m2127i();
            }
        }
    }

    public C0541j(Context context, Map map, int i7, InterfaceC5334c interfaceC5334c, boolean z6) {
        this.f1754a = AbstractC3035x.m11071c(map);
        this.f1755b = new InterfaceC0536e.a.C7167a();
        this.f1758e = new C0550s(i7);
        this.f1756c = interfaceC5334c;
        this.f1757d = z6;
        if (context == null) {
            this.f1766m = 0;
            this.f1764k = m2080m(0);
            return;
        }
        C5351t m21888d = C5351t.m21888d(context);
        int m21891f = m21888d.m21891f();
        this.f1766m = m21891f;
        this.f1764k = m2080m(m21891f);
        m21888d.m21893i(new C5351t.c() { // from class: H0.i
            @Override // p259j0.C5351t.c
            /* renamed from: a */
            public final void mo2070a(int i8) {
                C0541j.this.m2082q(i8);
            }
        });
    }

    @Override // p050H0.InterfaceC0536e
    /* renamed from: f */
    public InterfaceC5511y mo2048f() {
        return this;
    }

    @Override // p276l0.InterfaceC5511y
    /* renamed from: i */
    public void mo2079i(InterfaceC5493g interfaceC5493g, C5497k c5497k, boolean z6) {
    }
}
