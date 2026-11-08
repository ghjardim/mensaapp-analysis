package p328r1;

import java.util.Collections;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4318h;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5335d;
import p259j0.C5357z;
import p268k0.AbstractC5400d;
import p328r1.InterfaceC6259K;

/* renamed from: r1.q */
/* loaded from: classes.dex */
public final class C6278q implements InterfaceC6274m {

    /* renamed from: a */
    public final C6254F f22665a;

    /* renamed from: b */
    public String f22666b;

    /* renamed from: c */
    public InterfaceC0861T f22667c;

    /* renamed from: d */
    public a f22668d;

    /* renamed from: e */
    public boolean f22669e;

    /* renamed from: l */
    public long f22676l;

    /* renamed from: f */
    public final boolean[] f22670f = new boolean[3];

    /* renamed from: g */
    public final C6284w f22671g = new C6284w(32, 128);

    /* renamed from: h */
    public final C6284w f22672h = new C6284w(33, 128);

    /* renamed from: i */
    public final C6284w f22673i = new C6284w(34, 128);

    /* renamed from: j */
    public final C6284w f22674j = new C6284w(39, 128);

    /* renamed from: k */
    public final C6284w f22675k = new C6284w(40, 128);

    /* renamed from: m */
    public long f22677m = -9223372036854775807L;

    /* renamed from: n */
    public final C5357z f22678n = new C5357z();

    /* renamed from: r1.q$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC0861T f22679a;

        /* renamed from: b */
        public long f22680b;

        /* renamed from: c */
        public boolean f22681c;

        /* renamed from: d */
        public int f22682d;

        /* renamed from: e */
        public long f22683e;

        /* renamed from: f */
        public boolean f22684f;

        /* renamed from: g */
        public boolean f22685g;

        /* renamed from: h */
        public boolean f22686h;

        /* renamed from: i */
        public boolean f22687i;

        /* renamed from: j */
        public boolean f22688j;

        /* renamed from: k */
        public long f22689k;

        /* renamed from: l */
        public long f22690l;

        /* renamed from: m */
        public boolean f22691m;

        public a(InterfaceC0861T interfaceC0861T) {
            this.f22679a = interfaceC0861T;
        }

        /* renamed from: c */
        public static boolean m26272c(int i7) {
            return (32 <= i7 && i7 <= 35) || i7 == 39;
        }

        /* renamed from: d */
        public static boolean m26273d(int i7) {
            return i7 < 32 || i7 == 40;
        }

        /* renamed from: a */
        public void m26274a(long j7) {
            this.f22691m = this.f22681c;
            m26276e((int) (j7 - this.f22680b));
            this.f22689k = this.f22680b;
            this.f22680b = j7;
            m26276e(0);
            this.f22687i = false;
        }

        /* renamed from: b */
        public void m26275b(long j7, int i7, boolean z6) {
            if (this.f22688j && this.f22685g) {
                this.f22691m = this.f22681c;
                this.f22688j = false;
            } else if (this.f22686h || this.f22685g) {
                if (z6 && this.f22687i) {
                    m26276e(i7 + ((int) (j7 - this.f22680b)));
                }
                this.f22689k = this.f22680b;
                this.f22690l = this.f22683e;
                this.f22691m = this.f22681c;
                this.f22687i = true;
            }
        }

        /* renamed from: e */
        public final void m26276e(int i7) {
            long j7 = this.f22690l;
            if (j7 == -9223372036854775807L) {
                return;
            }
            boolean z6 = this.f22691m;
            this.f22679a.mo562c(j7, z6 ? 1 : 0, (int) (this.f22680b - this.f22689k), i7, null);
        }

        /* renamed from: f */
        public void m26277f(byte[] bArr, int i7, int i8) {
            if (this.f22684f) {
                int i9 = this.f22682d;
                int i10 = (i7 + 2) - i9;
                if (i10 >= i8) {
                    this.f22682d = i9 + (i8 - i7);
                } else {
                    this.f22685g = (bArr[i10] & 128) != 0;
                    this.f22684f = false;
                }
            }
        }

        /* renamed from: g */
        public void m26278g() {
            this.f22684f = false;
            this.f22685g = false;
            this.f22686h = false;
            this.f22687i = false;
            this.f22688j = false;
        }

        /* renamed from: h */
        public void m26279h(long j7, int i7, int i8, long j8, boolean z6) {
            this.f22685g = false;
            this.f22686h = false;
            this.f22683e = j8;
            this.f22682d = 0;
            this.f22680b = j7;
            if (!m26273d(i8)) {
                if (this.f22687i && !this.f22688j) {
                    if (z6) {
                        m26276e(i7);
                    }
                    this.f22687i = false;
                }
                if (m26272c(i8)) {
                    this.f22686h = !this.f22688j;
                    this.f22688j = true;
                }
            }
            boolean z7 = i8 >= 16 && i8 <= 21;
            this.f22681c = z7;
            this.f22684f = z7 || i8 <= 9;
        }
    }

    public C6278q(C6254F c6254f) {
        this.f22665a = c6254f;
    }

    /* renamed from: f */
    private void m26267f() {
        AbstractC5332a.m21804i(this.f22667c);
        AbstractC5330M.m21747i(this.f22668d);
    }

    /* renamed from: g */
    private void m26268g(long j7, int i7, int i8, long j8) {
        this.f22668d.m26275b(j7, i7, this.f22669e);
        if (!this.f22669e) {
            this.f22671g.m26315b(i8);
            this.f22672h.m26315b(i8);
            this.f22673i.m26315b(i8);
            if (this.f22671g.m26316c() && this.f22672h.m26316c() && this.f22673i.m26316c()) {
                this.f22667c.mo566e(m26270i(this.f22666b, this.f22671g, this.f22672h, this.f22673i));
                this.f22669e = true;
            }
        }
        if (this.f22674j.m26315b(i8)) {
            C6284w c6284w = this.f22674j;
            this.f22678n.m21937R(this.f22674j.f22764d, AbstractC5400d.m22333r(c6284w.f22764d, c6284w.f22765e));
            this.f22678n.m21940U(5);
            this.f22665a.m26136a(j8, this.f22678n);
        }
        if (this.f22675k.m26315b(i8)) {
            C6284w c6284w2 = this.f22675k;
            this.f22678n.m21937R(this.f22675k.f22764d, AbstractC5400d.m22333r(c6284w2.f22764d, c6284w2.f22765e));
            this.f22678n.m21940U(5);
            this.f22665a.m26136a(j8, this.f22678n);
        }
    }

    /* renamed from: h */
    private void m26269h(byte[] bArr, int i7, int i8) {
        this.f22668d.m26277f(bArr, i7, i8);
        if (!this.f22669e) {
            this.f22671g.m26314a(bArr, i7, i8);
            this.f22672h.m26314a(bArr, i7, i8);
            this.f22673i.m26314a(bArr, i7, i8);
        }
        this.f22674j.m26314a(bArr, i7, i8);
        this.f22675k.m26314a(bArr, i7, i8);
    }

    /* renamed from: i */
    public static C4327q m26270i(String str, C6284w c6284w, C6284w c6284w2, C6284w c6284w3) {
        int i7 = c6284w.f22765e;
        byte[] bArr = new byte[c6284w2.f22765e + i7 + c6284w3.f22765e];
        System.arraycopy(c6284w.f22764d, 0, bArr, 0, i7);
        System.arraycopy(c6284w2.f22764d, 0, bArr, c6284w.f22765e, c6284w2.f22765e);
        System.arraycopy(c6284w3.f22764d, 0, bArr, c6284w.f22765e + c6284w2.f22765e, c6284w3.f22765e);
        AbstractC5400d.a m22323h = AbstractC5400d.m22323h(c6284w2.f22764d, 3, c6284w2.f22765e);
        return new C4327q.b().m18250a0(str).m18264o0("video/hevc").m18238O(AbstractC5335d.m21810c(m22323h.f19250a, m22323h.f19251b, m22323h.f19252c, m22323h.f19253d, m22323h.f19257h, m22323h.f19258i)).m18271v0(m22323h.f19260k).m18248Y(m22323h.f19261l).m18239P(new C4318h.b().m18154d(m22323h.f19264o).m18153c(m22323h.f19265p).m18155e(m22323h.f19266q).m18157g(m22323h.f19255f + 8).m18152b(m22323h.f19256g + 8).m18151a()).m18260k0(m22323h.f19262m).m18256g0(m22323h.f19263n).m18251b0(Collections.singletonList(bArr)).m18234K();
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        m26267f();
        while (c5357z.m21942a() > 0) {
            int m21947f = c5357z.m21947f();
            int m21948g = c5357z.m21948g();
            byte[] m21946e = c5357z.m21946e();
            this.f22676l += c5357z.m21942a();
            this.f22667c.mo564d(c5357z, c5357z.m21942a());
            while (m21947f < m21948g) {
                int m22318c = AbstractC5400d.m22318c(m21946e, m21947f, m21948g, this.f22670f);
                if (m22318c == m21948g) {
                    m26269h(m21946e, m21947f, m21948g);
                    return;
                }
                int m22320e = AbstractC5400d.m22320e(m21946e, m22318c);
                int i7 = m22318c - m21947f;
                if (i7 > 0) {
                    m26269h(m21946e, m21947f, m22318c);
                }
                int i8 = m21948g - m22318c;
                long j7 = this.f22676l - i8;
                m26268g(j7, i8, i7 < 0 ? -i7 : 0, this.f22677m);
                m26271j(j7, i8, m22320e, this.f22677m);
                m21947f = m22318c + 3;
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22676l = 0L;
        this.f22677m = -9223372036854775807L;
        AbstractC5400d.m22316a(this.f22670f);
        this.f22671g.m26317d();
        this.f22672h.m26317d();
        this.f22673i.m26317d();
        this.f22674j.m26317d();
        this.f22675k.m26317d();
        a aVar = this.f22668d;
        if (aVar != null) {
            aVar.m26278g();
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22666b = dVar.m26175b();
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 2);
        this.f22667c = mo455b;
        this.f22668d = new a(mo455b);
        this.f22665a.m26137b(interfaceC0885t, dVar);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
        m26267f();
        if (z6) {
            this.f22668d.m26274a(this.f22676l);
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22677m = j7;
    }

    /* renamed from: j */
    public final void m26271j(long j7, int i7, int i8, long j8) {
        this.f22668d.m26279h(j7, i7, i8, j8, this.f22669e);
        if (!this.f22669e) {
            this.f22671g.m26318e(i8);
            this.f22672h.m26318e(i8);
            this.f22673i.m26318e(i8);
        }
        this.f22674j.m26318e(i8);
        this.f22675k.m26318e(i8);
    }
}
